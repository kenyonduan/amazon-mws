
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WeightRecommendationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WeightRecommendationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumWeightRecommendation" type="{}PositiveWeightDimension" minOccurs="0"/>
 *         &lt;element name="MinimumWeightRecommendation" type="{}PositiveWeightDimension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightRecommendationType", propOrder = {
    "maximumWeightRecommendation",
    "minimumWeightRecommendation"
})
public class WeightRecommendationType {

    @XmlElement(name = "MaximumWeightRecommendation")
    protected PositiveWeightDimension maximumWeightRecommendation;
    @XmlElement(name = "MinimumWeightRecommendation")
    protected PositiveWeightDimension minimumWeightRecommendation;

    /**
     * 获取maximumWeightRecommendation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PositiveWeightDimension }
     *     
     */
    public PositiveWeightDimension getMaximumWeightRecommendation() {
        return maximumWeightRecommendation;
    }

    /**
     * 设置maximumWeightRecommendation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveWeightDimension }
     *     
     */
    public void setMaximumWeightRecommendation(PositiveWeightDimension value) {
        this.maximumWeightRecommendation = value;
    }

    /**
     * 获取minimumWeightRecommendation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PositiveWeightDimension }
     *     
     */
    public PositiveWeightDimension getMinimumWeightRecommendation() {
        return minimumWeightRecommendation;
    }

    /**
     * 设置minimumWeightRecommendation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveWeightDimension }
     *     
     */
    public void setMinimumWeightRecommendation(PositiveWeightDimension value) {
        this.minimumWeightRecommendation = value;
    }

}
