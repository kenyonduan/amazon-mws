
package com.elcuk.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>OptionalLuminiousIntensityDimension complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OptionalLuminiousIntensityDimension">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>Dimension">
 *       &lt;attribute name="unitOfMeasure" type="{}OptionalLuminiousIntensityUnitOfMeasure" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalLuminiousIntensityDimension", propOrder = {
    "value"
})
public class OptionalLuminiousIntensityDimension {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unitOfMeasure")
    protected OptionalLuminiousIntensityUnitOfMeasure unitOfMeasure;

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
     *     {@link OptionalLuminiousIntensityUnitOfMeasure }
     *     
     */
    public OptionalLuminiousIntensityUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalLuminiousIntensityUnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(OptionalLuminiousIntensityUnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

}
