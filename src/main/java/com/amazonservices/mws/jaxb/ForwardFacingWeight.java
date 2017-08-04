
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
 *         &lt;element name="ForwardFacingMaximumWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="ForwardFacingMinimumWeight" type="{}WeightDimension" minOccurs="0"/>
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
    "forwardFacingMaximumWeight",
    "forwardFacingMinimumWeight"
})
@XmlRootElement(name = "ForwardFacingWeight")
public class ForwardFacingWeight {

    @XmlElement(name = "ForwardFacingMaximumWeight")
    protected WeightDimension forwardFacingMaximumWeight;
    @XmlElement(name = "ForwardFacingMinimumWeight")
    protected WeightDimension forwardFacingMinimumWeight;

    /**
     * 获取forwardFacingMaximumWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getForwardFacingMaximumWeight() {
        return forwardFacingMaximumWeight;
    }

    /**
     * 设置forwardFacingMaximumWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setForwardFacingMaximumWeight(WeightDimension value) {
        this.forwardFacingMaximumWeight = value;
    }

    /**
     * 获取forwardFacingMinimumWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getForwardFacingMinimumWeight() {
        return forwardFacingMinimumWeight;
    }

    /**
     * 设置forwardFacingMinimumWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setForwardFacingMinimumWeight(WeightDimension value) {
        this.forwardFacingMinimumWeight = value;
    }

}
