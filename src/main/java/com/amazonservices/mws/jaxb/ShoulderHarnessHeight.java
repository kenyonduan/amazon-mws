
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShoulderHarnessMaximumHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ShoulderHarnessMinimumHeight" type="{}LengthDimension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shoulderHarnessMaximumHeight",
    "shoulderHarnessMinimumHeight"
})
@XmlRootElement(name = "ShoulderHarnessHeight")
public class ShoulderHarnessHeight {

    @XmlElement(name = "ShoulderHarnessMaximumHeight")
    protected LengthDimension shoulderHarnessMaximumHeight;
    @XmlElement(name = "ShoulderHarnessMinimumHeight")
    protected LengthDimension shoulderHarnessMinimumHeight;

    /**
     * 获取shoulderHarnessMaximumHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getShoulderHarnessMaximumHeight() {
        return shoulderHarnessMaximumHeight;
    }

    /**
     * 设置shoulderHarnessMaximumHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setShoulderHarnessMaximumHeight(LengthDimension value) {
        this.shoulderHarnessMaximumHeight = value;
    }

    /**
     * 获取shoulderHarnessMinimumHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getShoulderHarnessMinimumHeight() {
        return shoulderHarnessMinimumHeight;
    }

    /**
     * 设置shoulderHarnessMinimumHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setShoulderHarnessMinimumHeight(LengthDimension value) {
        this.shoulderHarnessMinimumHeight = value;
    }

}
