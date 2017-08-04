
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
 *         &lt;element name="MinimumManufacturerAgeRecommended" type="{}MinimumAgeRecommendedDimension" minOccurs="0"/>
 *         &lt;element name="MaximumManufacturerAgeRecommended" type="{}AgeRecommendedDimension" minOccurs="0"/>
 *         &lt;element name="MinimumMerchantAgeRecommended" type="{}MinimumAgeRecommendedDimension" minOccurs="0"/>
 *         &lt;element name="MaximumMerchantAgeRecommended" type="{}AgeRecommendedDimension" minOccurs="0"/>
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
    "minimumManufacturerAgeRecommended",
    "maximumManufacturerAgeRecommended",
    "minimumMerchantAgeRecommended",
    "maximumMerchantAgeRecommended"
})
@XmlRootElement(name = "AgeRecommendation")
public class AgeRecommendation {

    @XmlElement(name = "MinimumManufacturerAgeRecommended")
    protected MinimumAgeRecommendedDimension minimumManufacturerAgeRecommended;
    @XmlElement(name = "MaximumManufacturerAgeRecommended")
    protected AgeRecommendedDimension maximumManufacturerAgeRecommended;
    @XmlElement(name = "MinimumMerchantAgeRecommended")
    protected MinimumAgeRecommendedDimension minimumMerchantAgeRecommended;
    @XmlElement(name = "MaximumMerchantAgeRecommended")
    protected AgeRecommendedDimension maximumMerchantAgeRecommended;

    /**
     * 获取minimumManufacturerAgeRecommended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MinimumAgeRecommendedDimension }
     *     
     */
    public MinimumAgeRecommendedDimension getMinimumManufacturerAgeRecommended() {
        return minimumManufacturerAgeRecommended;
    }

    /**
     * 设置minimumManufacturerAgeRecommended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAgeRecommendedDimension }
     *     
     */
    public void setMinimumManufacturerAgeRecommended(MinimumAgeRecommendedDimension value) {
        this.minimumManufacturerAgeRecommended = value;
    }

    /**
     * 获取maximumManufacturerAgeRecommended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgeRecommendedDimension }
     *     
     */
    public AgeRecommendedDimension getMaximumManufacturerAgeRecommended() {
        return maximumManufacturerAgeRecommended;
    }

    /**
     * 设置maximumManufacturerAgeRecommended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRecommendedDimension }
     *     
     */
    public void setMaximumManufacturerAgeRecommended(AgeRecommendedDimension value) {
        this.maximumManufacturerAgeRecommended = value;
    }

    /**
     * 获取minimumMerchantAgeRecommended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MinimumAgeRecommendedDimension }
     *     
     */
    public MinimumAgeRecommendedDimension getMinimumMerchantAgeRecommended() {
        return minimumMerchantAgeRecommended;
    }

    /**
     * 设置minimumMerchantAgeRecommended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAgeRecommendedDimension }
     *     
     */
    public void setMinimumMerchantAgeRecommended(MinimumAgeRecommendedDimension value) {
        this.minimumMerchantAgeRecommended = value;
    }

    /**
     * 获取maximumMerchantAgeRecommended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgeRecommendedDimension }
     *     
     */
    public AgeRecommendedDimension getMaximumMerchantAgeRecommended() {
        return maximumMerchantAgeRecommended;
    }

    /**
     * 设置maximumMerchantAgeRecommended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRecommendedDimension }
     *     
     */
    public void setMaximumMerchantAgeRecommended(AgeRecommendedDimension value) {
        this.maximumMerchantAgeRecommended = value;
    }

}
