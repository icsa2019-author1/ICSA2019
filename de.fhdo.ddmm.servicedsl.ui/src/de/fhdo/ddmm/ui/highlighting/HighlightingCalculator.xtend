package de.fhdo.ddmm.ui.highlighting

import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator
import de.fhdo.ddmm.service.Microservice
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import de.fhdo.ddmm.service.ServicePackage
import de.fhdo.ddmm.service.ProtocolSpecification
import de.fhdo.ddmm.service.ImportedServiceAspect
import de.fhdo.ddmm.service.Interface
import de.fhdo.ddmm.service.ReferredOperation
import de.fhdo.ddmm.service.Operation

/**
 * Provide custom syntax highlighting for certain elements.
 *
 * 
 */
class HighlightingCalculator implements ISemanticHighlightingCalculator {
    /**
     * Provide highlighting
     */
    override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
        CancelIndicator cancelIndicator) {
        resource.provideHighlightingForAnnotations(acceptor)
    }

    /**
     * Provide highlighting for annotations
     */
    private def provideHighlightingForAnnotations(XtextResource resource,
        IHighlightedPositionAcceptor acceptor) {
        /*
         * The following map contains the annotatable concepts and their features being part of
         * annotations. That is, a list of feature description pairs is assigned to each concept.
         * An assigned pair's key represents the feature that may be part of an annotation. The
         * pair's value is a boolean flag. It specifies if the highlighting should start
         * immediately, i.e., if the feature itself should be highlighted, or not. This mechanism is
         * necessary for features that represent annotations themselves. This is, for instance, the
         * case for imported aspects, e.g. java::aspects.HttpStatus. By contrast, e.g., for
         * technologies only the surrounding annotation nodes should get highlighted. For example,
         * the "@technology" part of the technology annotation "@technology(java)". Setting the flag
         * to false hence prevents that the respective feature's value is highlighted.
         *
         * Map structure summary:
         *  CONCEPT1 -> [
         *      CONCEPT1_FEATURE1: HIGHLIGHT_IMMEDIATELY,
         *      CONCEPT1_FEATURE2: HIGHLIGHT_IMMEDIATELY
         *  ],
         *  CONCEPT2 -> [
         *      CONCEPT2_FEATURE1: HIGHLIGHT_IMMEDIATELY
         *  ],
         *  ...
         */
        val annotatableConcepts = #{
            Microservice -> #[
                ServicePackage.Literals::MICROSERVICE__TECHNOLOGIES -> false,
                ServicePackage.Literals::MICROSERVICE__ENDPOINTS -> false
            ],
            Interface -> #[
                ServicePackage.Literals::INTERFACE__ENDPOINTS -> false
            ],
            Operation -> #[
                ServicePackage.Literals::OPERATION__ENDPOINTS -> false
            ],
            ReferredOperation -> #[
                ServicePackage.Literals::REFERRED_OPERATION__ENDPOINTS -> false
            ],
            ProtocolSpecification -> #[
                ServicePackage.Literals::PROTOCOL_SPECIFICATION__PROTOCOL -> false
            ],
            ImportedServiceAspect -> #[
                ServicePackage.Literals::IMPORTED_SERVICE_ASPECT__IMPORTED_ASPECT -> true
            ]
        }

        /*
         * Perform the actual highlighting by iterating through the map and filtering the resource
         * to get highlighted for all relevant concepts
         */
        annotatableConcepts.forEach[concept, featureDescriptions |
            resource.allContents.filter[concept.isInstance(it)]
                .forEach[featureDescriptions.forEach[featureDescription |
                    val feature = featureDescription.key
                    val highlightImmediately = featureDescription.value

                    /* Iterate over the current feature's nodes to highlight them */
                    NodeModelUtils.findNodesForFeature(it, feature).forEach[
                        // Determine node to start highlighting. In case highlighting shall not
                        // start on the feature node itself, i.e., immediately, find the opening
                        // bracket of the aspect string (currently there are not built-in aspects
                        // without parameters, i.e., opening brackets).
                        var nodeToHighlight = it
                        if (!highlightImmediately) {
                            while (nodeToHighlight !== null &&
                                nodeToHighlight.nextSibling !== null &&
                                nodeToHighlight.nextSibling.text != "(")
                                nodeToHighlight = nodeToHighlight.previousSibling
                        }

                        // Highlight nodes including the "@" sign, which marks the beginning of an
                        // aspect's annotation string
                        if (nodeToHighlight !== null) {
                            do {
                                acceptor.addPosition(nodeToHighlight.offset, nodeToHighlight.length,
                                    HighlightingConfiguration.ANNOTATION_ID)
                                nodeToHighlight = nodeToHighlight.previousSibling
                            } while (nodeToHighlight !== null &&
                                nodeToHighlight.nextSibling !== null &&
                                nodeToHighlight.nextSibling.text != "@"
                            )
                        }
                    ]
                ]]
        ]
    }
}