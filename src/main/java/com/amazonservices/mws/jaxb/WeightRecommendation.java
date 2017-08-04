
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
 *         &lt;element name="MinimumManufacturerWeightRecommended" type="{}WeightIntegerDimension" minOccurs="0"/>
 *         &lt;element name="MaximumManufacturerWeightRecommended" type="{}WeightIntegerDimension" minOccurs="0"/>
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
    "minimumManufacturerWeightRecommended",
    "maximumManufacturerWeightRecommended"
})
@XmlRootElement(name = "WeightRecommendation")
public class WeightRecommendation {

    @XmlElement(name = "MinimumManufacturerWeightRecommended")
    protected WeightIntegerDimension minimumManufacturerWeightRecommended;
    @XmlElement(name = "MaximumManufacturerWeightRecommended")
    protected WeightIntegerDimension maximumManufacturerWeightRecommended;

    /**
     * 获取minimumManufacturerWeightRecommended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightIntegerDimension }
     *     
     */
    public WeightIntegerDimension getMinimumManufacturerWeightRecommended() {
        return minimumManufacturerWeightRecommended;
    }

    /**
     * 设置minimumManufacturerWeightRecommended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightIntegerDimension }
     *     
     */
    public void setMinimumManufacturerWeightRecommended(WeightIntegerDimension value) {
        this.minimumManufacturerWeightRecommended = value;
    }

    /**
     * 获取maximumManufacturerWeightRecommended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightIntegerDimension }
     *     
     */
    public WeightIntegerDimension getMaximumManufacturerWeightRecommended() {
        return maximumManufacturerWeightRecommended;
    }

    /**
     * 设置maximumManufacturerWeightRecommended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightIntegerDimension }
     *     
     */
    public void setMaximumManufacturerWeightRecommended(WeightIntegerDimension value) {
        this.maximumManufacturerWeightRecommended = value;
    }

}
