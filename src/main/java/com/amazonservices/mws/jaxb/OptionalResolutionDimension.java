
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>OptionalResolutionDimension complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OptionalResolutionDimension">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>StringNotNull">
 *       &lt;attribute name="unitOfMeasure" type="{}ResolutionUnitOfMeasure" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalResolutionDimension", propOrder = {
    "value"
})
public class OptionalResolutionDimension {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "unitOfMeasure")
    protected ResolutionUnitOfMeasure unitOfMeasure;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionUnitOfMeasure }
     *     
     */
    public ResolutionUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionUnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(ResolutionUnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

}
