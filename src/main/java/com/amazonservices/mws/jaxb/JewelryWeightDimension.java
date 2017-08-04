
package com.amazonservices.mws.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>JewelryWeightDimension complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="JewelryWeightDimension">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>FourDecimal">
 *       &lt;attribute name="unitOfMeasure" use="required" type="{}JewelryWeightUnitOfMeasure" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JewelryWeightDimension", propOrder = {
    "value"
})
public class JewelryWeightDimension {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unitOfMeasure", required = true)
    protected JewelryWeightUnitOfMeasure unitOfMeasure;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JewelryWeightUnitOfMeasure }
     *     
     */
    public JewelryWeightUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JewelryWeightUnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(JewelryWeightUnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

}
