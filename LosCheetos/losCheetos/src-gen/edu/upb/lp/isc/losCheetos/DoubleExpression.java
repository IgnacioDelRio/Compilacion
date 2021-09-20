/**
 * generated by Xtext 2.11.0
 */
package edu.upb.lp.isc.losCheetos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.losCheetos.DoubleExpression#getInt <em>Int</em>}</li>
 *   <li>{@link edu.upb.lp.isc.losCheetos.DoubleExpression#getDec <em>Dec</em>}</li>
 * </ul>
 *
 * @see edu.upb.lp.isc.losCheetos.LosCheetosPackage#getDoubleExpression()
 * @model
 * @generated
 */
public interface DoubleExpression extends NumberExpression
{
  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(int)
   * @see edu.upb.lp.isc.losCheetos.LosCheetosPackage#getDoubleExpression_Int()
   * @model
   * @generated
   */
  int getInt();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losCheetos.DoubleExpression#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(int value);

  /**
   * Returns the value of the '<em><b>Dec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec</em>' attribute.
   * @see #setDec(int)
   * @see edu.upb.lp.isc.losCheetos.LosCheetosPackage#getDoubleExpression_Dec()
   * @model
   * @generated
   */
  int getDec();

  /**
   * Sets the value of the '{@link edu.upb.lp.isc.losCheetos.DoubleExpression#getDec <em>Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' attribute.
   * @see #getDec()
   * @generated
   */
  void setDec(int value);

} // DoubleExpression
