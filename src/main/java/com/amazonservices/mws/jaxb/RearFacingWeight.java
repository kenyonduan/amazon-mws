
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
 *         &lt;element name="RearFacingMaximumWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="RearFacingMinimumWeight" type="{}WeightDimension" minOccurs="0"/>
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
    "rearFacingMaximumWeight",
    "rearFacingMinimumWeight"
})
@XmlRootElement(name = "RearFacingWeight")
public class RearFacingWeight {

    @XmlElement(name = "RearFacingMaximumWeight")
    protected WeightDimension rearFacingMaximumWeight;
    @XmlElement(name = "RearFacingMinimumWeight")
    protected WeightDimension rearFacingMinimumWeight;

    /**
     * 获取rearFacingMaximumWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getRearFacingMaximumWeight() {
        return rearFacingMaximumWeight;
    }

    /**
     * 设置rearFacingMaximumWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setRearFacingMaximumWeight(WeightDimension value) {
        this.rearFacingMaximumWeight = value;
    }

    /**
     * 获取rearFacingMinimumWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getRearFacingMinimumWeight() {
        return rearFacingMinimumWeight;
    }

    /**
     * 设置rearFacingMinimumWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setRearFacingMinimumWeight(WeightDimension value) {
        this.rearFacingMinimumWeight = value;
    }

}
