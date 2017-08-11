
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>TabletActiveSurfaceAreaDimension complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TabletActiveSurfaceAreaDimension">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>TenString">
 *       &lt;attribute name="unitOfMeasure" use="required" type="{}LengthUnitOfMeasure" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabletActiveSurfaceAreaDimension", propOrder = {
    "value"
})
public class TabletActiveSurfaceAreaDimension {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "unitOfMeasure", required = true)
    protected LengthUnitOfMeasure unitOfMeasure;

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
     *     {@link LengthUnitOfMeasure }
     *     
     */
    public LengthUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(LengthUnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

}
