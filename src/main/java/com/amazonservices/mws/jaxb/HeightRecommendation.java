
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
 *         &lt;element name="MinimumHeightRecommended" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumHeightRecommended" type="{}LengthDimension" minOccurs="0"/>
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
    "minimumHeightRecommended",
    "maximumHeightRecommended"
})
@XmlRootElement(name = "HeightRecommendation")
public class HeightRecommendation {

    @XmlElement(name = "MinimumHeightRecommended")
    protected LengthDimension minimumHeightRecommended;
    @XmlElement(name = "MaximumHeightRecommended")
    protected LengthDimension maximumHeightRecommended;

    /**
     * 获取minimumHeightRecommended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumHeightRecommended() {
        return minimumHeightRecommended;
    }

    /**
     * 设置minimumHeightRecommended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumHeightRecommended(LengthDimension value) {
        this.minimumHeightRecommended = value;
    }

    /**
     * 获取maximumHeightRecommended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumHeightRecommended() {
        return maximumHeightRecommended;
    }

    /**
     * 设置maximumHeightRecommended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumHeightRecommended(LengthDimension value) {
        this.maximumHeightRecommended = value;
    }

}
