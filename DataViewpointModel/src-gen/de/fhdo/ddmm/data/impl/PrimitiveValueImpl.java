/**
 */
package de.fhdo.ddmm.data.impl;

import de.fhdo.ddmm.data.DataPackage;
import de.fhdo.ddmm.data.PrimitiveBoolean;
import de.fhdo.ddmm.data.PrimitiveByte;
import de.fhdo.ddmm.data.PrimitiveCharacter;
import de.fhdo.ddmm.data.PrimitiveDate;
import de.fhdo.ddmm.data.PrimitiveDouble;
import de.fhdo.ddmm.data.PrimitiveFloat;
import de.fhdo.ddmm.data.PrimitiveInteger;
import de.fhdo.ddmm.data.PrimitiveLong;
import de.fhdo.ddmm.data.PrimitiveShort;
import de.fhdo.ddmm.data.PrimitiveString;
import de.fhdo.ddmm.data.PrimitiveType;
import de.fhdo.ddmm.data.PrimitiveValue;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;

import java.text.DateFormat;
import java.text.ParseException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.data.impl.PrimitiveValueImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.impl.PrimitiveValueImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.impl.PrimitiveValueImpl#getNumericValue <em>Numeric Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveValueImpl extends MinimalEObjectImpl.Container implements PrimitiveValue {
	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOLEAN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumericValue() <em>Numeric Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NUMERIC_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumericValue() <em>Numeric Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal numericValue = NUMERIC_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.PRIMITIVE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PRIMITIVE_VALUE__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(Boolean newBooleanValue) {
		Boolean oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PRIMITIVE_VALUE__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getNumericValue() {
		return numericValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericValue(BigDecimal newNumericValue) {
		BigDecimal oldNumericValue = numericValue;
		numericValue = newNumericValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PRIMITIVE_VALUE__NUMERIC_VALUE, oldNumericValue, numericValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInClosedSet(final BigDecimal lowerBound, final BigDecimal upperBound) {
		BigDecimal _numericValue = this.getNumericValue();
		boolean _tripleEquals = (_numericValue == null);
		if (_tripleEquals) {
			return false;
		}
		int _compareTo = this.getNumericValue().compareTo(lowerBound);
		final boolean outOfBoundLower = (_compareTo < 0);
		int _compareTo_1 = this.getNumericValue().compareTo(upperBound);
		final boolean outOfBoundUpper = (_compareTo_1 > 0);
		return ((!outOfBoundLower) && (!outOfBoundUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasDecimals() {
		BigDecimal _numericValue = this.getNumericValue();
		boolean _tripleEquals = (_numericValue == null);
		if (_tripleEquals) {
			return false;
		}
		BigDecimal _numericValue_1 = this.getNumericValue();
		BigDecimal _bigDecimal = new BigDecimal("1");
		final BigDecimal moduloOne = _numericValue_1.remainder(_bigDecimal);
		int _compareTo = moduloOne.compareTo(BigDecimal.ZERO);
		return (_compareTo != 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOfType(final PrimitiveType primitiveType) {
		Object _asValueOfType = this.asValueOfType(primitiveType);
		return (_asValueOfType != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasNoValue() {
		return (((this.getStringValue() == null) && (this.getNumericValue() == null)) && (this.getBooleanValue() == null));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object asValueOfType(final PrimitiveType primitiveType) {
		if (((primitiveType == null) || this.hasNoValue())) {
			return null;
		}
		Object _switchResult = null;
		boolean _matched = false;
		if (primitiveType instanceof PrimitiveBoolean) {
			_matched=true;
			_switchResult = this.asBoolean();
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveByte) {
				_matched=true;
				_switchResult = this.asByte();
			}
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveCharacter) {
				_matched=true;
				_switchResult = this.asCharacter();
			}
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveDate) {
				_matched=true;
				_switchResult = this.asDate();
			}
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveDouble) {
				_matched=true;
				_switchResult = this.asDouble();
			}
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveFloat) {
				_matched=true;
				_switchResult = this.asFloat();
			}
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveInteger) {
				_matched=true;
				_switchResult = this.asInteger();
			}
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveLong) {
				_matched=true;
				_switchResult = this.asLong();
			}
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveShort) {
				_matched=true;
				_switchResult = this.asShort();
			}
		}
		if (!_matched) {
			if (primitiveType instanceof PrimitiveString) {
				_matched=true;
				_switchResult = this.asString();
			}
		}
		return _switchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean asBoolean() {
		return this.getBooleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte asByte() {
		BigDecimal _numericValue = this.getNumericValue();
		boolean _tripleEquals = (_numericValue == null);
		if (_tripleEquals) {
			return null;
		}
		boolean _hasDecimals = this.hasDecimals();
		if (_hasDecimals) {
			return null;
		}
		BigDecimal _bigDecimal = new BigDecimal(Byte.MIN_VALUE);
		BigDecimal _bigDecimal_1 = new BigDecimal(Byte.MAX_VALUE);
		boolean _isInClosedSet = this.isInClosedSet(_bigDecimal, _bigDecimal_1);
		boolean _not = (!_isInClosedSet);
		if (_not) {
			return null;
		}
		return Byte.valueOf(this.getNumericValue().byteValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character asCharacter() {
		String _stringValue = this.getStringValue();
		boolean _tripleEquals = (_stringValue == null);
		if (_tripleEquals) {
			return null;
		}
		boolean _isEmpty = this.getStringValue().isEmpty();
		if (_isEmpty) {
			return Character.valueOf(Character.MIN_VALUE);
		}
		else {
			int _length = this.getStringValue().length();
			boolean _tripleEquals_1 = (_length == 1);
			if (_tripleEquals_1) {
				return Character.valueOf(this.getStringValue().charAt(0));
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date asDate() {
		String _stringValue = this.getStringValue();
		boolean _tripleEquals = (_stringValue == null);
		if (_tripleEquals) {
			return null;
		}
		try {
			final DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
			return dateFormatter.parse(this.getStringValue());
		}
		catch (final Throwable _t) {
			if (_t instanceof ParseException) {
				final ParseException ex = (ParseException)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double asDouble() {
		BigDecimal _numericValue = this.getNumericValue();
		boolean _tripleEquals = (_numericValue == null);
		if (_tripleEquals) {
			return null;
		}
		BigDecimal _bigDecimal = new BigDecimal(Double.MIN_VALUE);
		BigDecimal _bigDecimal_1 = new BigDecimal(Double.MAX_VALUE);
		boolean _isInClosedSet = this.isInClosedSet(_bigDecimal, _bigDecimal_1);
		boolean _not = (!_isInClosedSet);
		if (_not) {
			return null;
		}
		final double doubleValue = this.getNumericValue().doubleValue();
		if (((!Double.isNaN(doubleValue)) && (!Double.isInfinite(doubleValue)))) {
			return Double.valueOf(doubleValue);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float asFloat() {
		BigDecimal _numericValue = this.getNumericValue();
		boolean _tripleEquals = (_numericValue == null);
		if (_tripleEquals) {
			return null;
		}
		BigDecimal _bigDecimal = new BigDecimal(Float.MIN_VALUE);
		BigDecimal _bigDecimal_1 = new BigDecimal(Float.MAX_VALUE);
		boolean _isInClosedSet = this.isInClosedSet(_bigDecimal, _bigDecimal_1);
		boolean _not = (!_isInClosedSet);
		if (_not) {
			return null;
		}
		final float floatValue = this.getNumericValue().floatValue();
		if (((!Float.isNaN(floatValue)) && (!Float.isInfinite(floatValue)))) {
			return Float.valueOf(floatValue);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer asInteger() {
		BigDecimal _numericValue = this.getNumericValue();
		boolean _tripleEquals = (_numericValue == null);
		if (_tripleEquals) {
			return null;
		}
		boolean _hasDecimals = this.hasDecimals();
		if (_hasDecimals) {
			return null;
		}
		BigDecimal _bigDecimal = new BigDecimal(Integer.MIN_VALUE);
		BigDecimal _bigDecimal_1 = new BigDecimal(Integer.MAX_VALUE);
		boolean _isInClosedSet = this.isInClosedSet(_bigDecimal, _bigDecimal_1);
		boolean _not = (!_isInClosedSet);
		if (_not) {
			return null;
		}
		try {
			return Integer.valueOf(this.getNumericValue().intValueExact());
		}
		catch (final Throwable _t) {
			if (_t instanceof ArithmeticException) {
				final ArithmeticException ex = (ArithmeticException)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long asLong() {
		BigDecimal _numericValue = this.getNumericValue();
		boolean _tripleEquals = (_numericValue == null);
		if (_tripleEquals) {
			return null;
		}
		boolean _hasDecimals = this.hasDecimals();
		if (_hasDecimals) {
			return null;
		}
		BigDecimal _bigDecimal = new BigDecimal(Long.MIN_VALUE);
		BigDecimal _bigDecimal_1 = new BigDecimal(Long.MAX_VALUE);
		boolean _isInClosedSet = this.isInClosedSet(_bigDecimal, _bigDecimal_1);
		boolean _not = (!_isInClosedSet);
		if (_not) {
			return null;
		}
		try {
			return Long.valueOf(this.getNumericValue().longValueExact());
		}
		catch (final Throwable _t) {
			if (_t instanceof ArithmeticException) {
				final ArithmeticException ex = (ArithmeticException)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short asShort() {
		BigDecimal _numericValue = this.getNumericValue();
		boolean _tripleEquals = (_numericValue == null);
		if (_tripleEquals) {
			return null;
		}
		boolean _hasDecimals = this.hasDecimals();
		if (_hasDecimals) {
			return null;
		}
		BigDecimal _bigDecimal = new BigDecimal(Short.MIN_VALUE);
		BigDecimal _bigDecimal_1 = new BigDecimal(Short.MAX_VALUE);
		boolean _isInClosedSet = this.isInClosedSet(_bigDecimal, _bigDecimal_1);
		boolean _not = (!_isInClosedSet);
		if (_not) {
			return null;
		}
		try {
			return Short.valueOf(this.getNumericValue().shortValueExact());
		}
		catch (final Throwable _t) {
			if (_t instanceof ArithmeticException) {
				final ArithmeticException ex = (ArithmeticException)_t;
				return null;
			}
			else {
				throw Exceptions.sneakyThrow(_t);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String asString() {
		return this.getStringValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.PRIMITIVE_VALUE__STRING_VALUE:
				return getStringValue();
			case DataPackage.PRIMITIVE_VALUE__BOOLEAN_VALUE:
				return getBooleanValue();
			case DataPackage.PRIMITIVE_VALUE__NUMERIC_VALUE:
				return getNumericValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.PRIMITIVE_VALUE__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case DataPackage.PRIMITIVE_VALUE__BOOLEAN_VALUE:
				setBooleanValue((Boolean)newValue);
				return;
			case DataPackage.PRIMITIVE_VALUE__NUMERIC_VALUE:
				setNumericValue((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.PRIMITIVE_VALUE__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case DataPackage.PRIMITIVE_VALUE__BOOLEAN_VALUE:
				setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
				return;
			case DataPackage.PRIMITIVE_VALUE__NUMERIC_VALUE:
				setNumericValue(NUMERIC_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.PRIMITIVE_VALUE__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case DataPackage.PRIMITIVE_VALUE__BOOLEAN_VALUE:
				return BOOLEAN_VALUE_EDEFAULT == null ? booleanValue != null : !BOOLEAN_VALUE_EDEFAULT.equals(booleanValue);
			case DataPackage.PRIMITIVE_VALUE__NUMERIC_VALUE:
				return NUMERIC_VALUE_EDEFAULT == null ? numericValue != null : !NUMERIC_VALUE_EDEFAULT.equals(numericValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataPackage.PRIMITIVE_VALUE___IS_IN_CLOSED_SET__BIGDECIMAL_BIGDECIMAL:
				return isInClosedSet((BigDecimal)arguments.get(0), (BigDecimal)arguments.get(1));
			case DataPackage.PRIMITIVE_VALUE___HAS_DECIMALS:
				return hasDecimals();
			case DataPackage.PRIMITIVE_VALUE___IS_OF_TYPE__PRIMITIVETYPE:
				return isOfType((PrimitiveType)arguments.get(0));
			case DataPackage.PRIMITIVE_VALUE___HAS_NO_VALUE:
				return hasNoValue();
			case DataPackage.PRIMITIVE_VALUE___AS_VALUE_OF_TYPE__PRIMITIVETYPE:
				return asValueOfType((PrimitiveType)arguments.get(0));
			case DataPackage.PRIMITIVE_VALUE___AS_BOOLEAN:
				return asBoolean();
			case DataPackage.PRIMITIVE_VALUE___AS_BYTE:
				return asByte();
			case DataPackage.PRIMITIVE_VALUE___AS_CHARACTER:
				return asCharacter();
			case DataPackage.PRIMITIVE_VALUE___AS_DATE:
				return asDate();
			case DataPackage.PRIMITIVE_VALUE___AS_DOUBLE:
				return asDouble();
			case DataPackage.PRIMITIVE_VALUE___AS_FLOAT:
				return asFloat();
			case DataPackage.PRIMITIVE_VALUE___AS_INTEGER:
				return asInteger();
			case DataPackage.PRIMITIVE_VALUE___AS_LONG:
				return asLong();
			case DataPackage.PRIMITIVE_VALUE___AS_SHORT:
				return asShort();
			case DataPackage.PRIMITIVE_VALUE___AS_STRING:
				return asString();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stringValue: ");
		result.append(stringValue);
		result.append(", booleanValue: ");
		result.append(booleanValue);
		result.append(", numericValue: ");
		result.append(numericValue);
		result.append(')');
		return result.toString();
	}

} //PrimitiveValueImpl
