package de.fhdo.ddmm.typechecking;

import de.fhdo.ddmm.data.ComplexType;
import de.fhdo.ddmm.data.PrimitiveType;
import de.fhdo.ddmm.data.Type;
import de.fhdo.ddmm.technology.Technology;
import de.fhdo.ddmm.typechecking.TypeCheckerI;
import de.fhdo.ddmm.typechecking.TypecheckingUtils;
import de.fhdo.ddmm.typechecking.TypesNotCompatibleException;
import de.fhdo.ddmm.typechecking.complex_types.ComplexTypeChecker;
import de.fhdo.ddmm.typechecking.primitive_types.PrimitiveTypeChecker;
import de.fhdo.ddmm.typechecking.technology_specific.MatrixBasedTypeChecker;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generic type checker that uses the corresponding TypeCheckers for the given Type instances to
 * check.
 */
@SuppressWarnings("all")
public class TypeChecker {
  public Boolean checkTypeCompatibility(final Type basicType, final Type typeToCheck) throws TypesNotCompatibleException {
    if (((basicType == null) || (typeToCheck == null))) {
      throw new IllegalArgumentException("None of the arguments must be null");
    }
    boolean _isTechnologySpecific = TypecheckingUtils.isTechnologySpecific(typeToCheck);
    if (_isTechnologySpecific) {
      Type technologySpecificBasicType = basicType;
      if (((!TypecheckingUtils.isTechnologySpecific(technologySpecificBasicType)) && 
        (technologySpecificBasicType instanceof PrimitiveType))) {
        final Technology technology = TypecheckingUtils.getTechnology(typeToCheck);
        technologySpecificBasicType = TypecheckingUtils.findDefaultTechnologySpecificPrimitiveType(technology, 
          ((PrimitiveType) technologySpecificBasicType));
      }
      boolean _isTechnologySpecific_1 = TypecheckingUtils.isTechnologySpecific(technologySpecificBasicType);
      if (_isTechnologySpecific_1) {
        final MatrixBasedTypeChecker matrixBasedChecker = new MatrixBasedTypeChecker();
        boolean _compatible = matrixBasedChecker.compatible(typeToCheck, technologySpecificBasicType);
        if (_compatible) {
          return Boolean.valueOf(true);
        }
      }
    }
    TypeCheckerI typeChecker = null;
    if (((basicType instanceof PrimitiveType) && (typeToCheck instanceof PrimitiveType))) {
      PrimitiveTypeChecker _primitiveTypeChecker = new PrimitiveTypeChecker();
      typeChecker = _primitiveTypeChecker;
    } else {
      if (((basicType instanceof ComplexType) && (typeToCheck instanceof ComplexType))) {
        ComplexTypeChecker _complexTypeChecker = new ComplexTypeChecker();
        typeChecker = _complexTypeChecker;
      } else {
        String _name = basicType.getClass().getName();
        String _name_1 = typeToCheck.getClass().getName();
        throw new TypesNotCompatibleException(_name, _name_1);
      }
    }
    this.performTypeCheck(typeChecker, basicType, typeToCheck);
    return null;
  }
  
  /**
   * Perform the actual type checking with the given type checker
   */
  private void performTypeCheck(final TypeCheckerI typeChecker, final Type basicType, final Type typeToCheck) throws TypesNotCompatibleException {
    Boolean typesCompatible = null;
    try {
      typesCompatible = Boolean.valueOf(typeChecker.compatible(basicType, typeToCheck));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception ex = (Exception)_t;
        ex.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    if (((typesCompatible != null) && (!(typesCompatible).booleanValue()))) {
      String _typeName = typeChecker.typeName(basicType);
      String _typeName_1 = typeChecker.typeName(typeToCheck);
      throw new TypesNotCompatibleException(_typeName, _typeName_1);
    }
  }
}
