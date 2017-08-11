
package com.elcuk.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>MemoryInterfaceDimension complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MemoryInterfaceDimension">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>FiveDigitInteger">
 *       &lt;attribute name="unitOfMeasure" use="required" type="{}MemoryInterfaceUnitOfMeasure" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemoryInterfaceDimension", propOrder = {
    "value"
})
public class MemoryInterfaceDimension {

    @XmlValue
    protected BigInteger value;
    @XmlAttribute(name = "unitOfMeasure", required = true)
    protected MemoryInterfaceUnitOfMeasure unitOfMeasure;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * 获取unitOfMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemoryInterfaceUnitOfMeasure }
     *     
     */
    public MemoryInterfaceUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * 设置unitOfMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryInterfaceUnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(MemoryInterfaceUnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

}
