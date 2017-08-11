
package com.elcuk.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}EnclosureFinish" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}MaximumSupportedScreenSize" minOccurs="0"/>
 *         &lt;element ref="{}MaxWeightCapacity" minOccurs="0"/>
 *         &lt;element ref="{}MaxWeightRecommendation" minOccurs="0"/>
 *         &lt;element ref="{}MinimumSupportedScreenSize" minOccurs="0"/>
 *         &lt;element ref="{}MountingPattern" minOccurs="0"/>
 *         &lt;element ref="{}MountingType" minOccurs="0"/>
 *         &lt;element ref="{}MountMotion" minOccurs="0"/>
 *         &lt;element ref="{}MountBoltPattern" minOccurs="0"/>
 *         &lt;element name="WirelessTechnology" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}Efficiency" minOccurs="0"/>
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
    "enclosureFinish",
    "finishType",
    "maximumSupportedScreenSize",
    "maxWeightCapacity",
    "maxWeightRecommendation",
    "minimumSupportedScreenSize",
    "mountingPattern",
    "mountingType",
    "mountMotion",
    "mountBoltPattern",
    "wirelessTechnology",
    "efficiency"
})
@XmlRootElement(name = "AVFurniture")
public class AVFurniture {

    @XmlElement(name = "EnclosureFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String enclosureFinish;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "MaximumSupportedScreenSize")
    protected LengthDimension maximumSupportedScreenSize;
    @XmlElement(name = "MaxWeightCapacity")
    protected WeightDimension maxWeightCapacity;
    @XmlElement(name = "MaxWeightRecommendation")
    protected WeightDimension maxWeightRecommendation;
    @XmlElement(name = "MinimumSupportedScreenSize")
    protected LengthDimension minimumSupportedScreenSize;
    @XmlElement(name = "MountingPattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountingPattern;
    @XmlElement(name = "MountingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountingType;
    @XmlElement(name = "MountMotion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountMotion;
    @XmlElement(name = "MountBoltPattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountBoltPattern;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * 获取enclosureFinish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosureFinish() {
        return enclosureFinish;
    }

    /**
     * 设置enclosureFinish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosureFinish(String value) {
        this.enclosureFinish = value;
    }

    /**
     * 获取finishType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishType() {
        return finishType;
    }

    /**
     * 设置finishType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishType(String value) {
        this.finishType = value;
    }

    /**
     * 获取maximumSupportedScreenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumSupportedScreenSize() {
        return maximumSupportedScreenSize;
    }

    /**
     * 设置maximumSupportedScreenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumSupportedScreenSize(LengthDimension value) {
        this.maximumSupportedScreenSize = value;
    }

    /**
     * 获取maxWeightCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    /**
     * 设置maxWeightCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaxWeightCapacity(WeightDimension value) {
        this.maxWeightCapacity = value;
    }

    /**
     * 获取maxWeightRecommendation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaxWeightRecommendation() {
        return maxWeightRecommendation;
    }

    /**
     * 设置maxWeightRecommendation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaxWeightRecommendation(WeightDimension value) {
        this.maxWeightRecommendation = value;
    }

    /**
     * 获取minimumSupportedScreenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumSupportedScreenSize() {
        return minimumSupportedScreenSize;
    }

    /**
     * 设置minimumSupportedScreenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumSupportedScreenSize(LengthDimension value) {
        this.minimumSupportedScreenSize = value;
    }

    /**
     * 获取mountingPattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountingPattern() {
        return mountingPattern;
    }

    /**
     * 设置mountingPattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountingPattern(String value) {
        this.mountingPattern = value;
    }

    /**
     * 获取mountingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountingType() {
        return mountingType;
    }

    /**
     * 设置mountingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountingType(String value) {
        this.mountingType = value;
    }

    /**
     * 获取mountMotion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountMotion() {
        return mountMotion;
    }

    /**
     * 设置mountMotion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountMotion(String value) {
        this.mountMotion = value;
    }

    /**
     * 获取mountBoltPattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountBoltPattern() {
        return mountBoltPattern;
    }

    /**
     * 设置mountBoltPattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountBoltPattern(String value) {
        this.mountBoltPattern = value;
    }

    /**
     * Gets the value of the wirelessTechnology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessTechnology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessTechnology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWirelessTechnology() {
        if (wirelessTechnology == null) {
            wirelessTechnology = new ArrayList<String>();
        }
        return this.wirelessTechnology;
    }

    /**
     * 获取efficiency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfficiency() {
        return efficiency;
    }

    /**
     * 设置efficiency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfficiency(String value) {
        this.efficiency = value;
    }

}
