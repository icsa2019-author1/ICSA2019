/*
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ServiceDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/fhdo/ddmm/parser/antlr/internal/InternalServiceDsl.tokens");
	}
}
