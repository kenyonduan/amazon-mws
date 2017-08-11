
package com.elcuk.jaxb;

import java.math.BigInteger;
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
 *         &lt;element name="VariationData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parentage">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="parent"/>
 *                         &lt;enumeration value="child"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VariationTheme" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Color"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ColorMap" minOccurs="0"/>
 *         &lt;element name="AdditionalFeatures" type="{}LongStringNotNull" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="TalkTime" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="StandbyTime" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="ChargingTime" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="BatteryPower" type="{}BatteryPowerIntegerDimension" minOccurs="0"/>
 *         &lt;element name="Solar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Refillable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Slim" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Auxiliary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BatteryType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="AntennaType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CompatiblePhoneModels" type="{}StringNotNull" maxOccurs="18" minOccurs="0"/>
 *         &lt;element name="ManufacturerName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="HeadsetType" type="{}HeadsetTypeValue" minOccurs="0"/>
 *         &lt;element name="HeadsetStyle" type="{}HeadsetStyleValue" minOccurs="0"/>
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
    "variationData",
    "color",
    "colorMap",
    "additionalFeatures",
    "talkTime",
    "standbyTime",
    "chargingTime",
    "batteryPower",
    "solar",
    "refillable",
    "extended",
    "slim",
    "auxiliary",
    "batteryType",
    "antennaType",
    "compatiblePhoneModels",
    "manufacturerName",
    "keywords",
    "itemPackageQuantity",
    "headsetType",
    "headsetStyle"
})
@XmlRootElement(name = "WirelessAccessories")
public class WirelessAccessories {

    @XmlElement(name = "VariationData")
    protected WirelessAccessories.VariationData variationData;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String color;
    @XmlElement(name = "ColorMap")
    protected String colorMap;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> additionalFeatures;
    @XmlElement(name = "TalkTime")
    protected TimeDimension talkTime;
    @XmlElement(name = "StandbyTime")
    protected TimeDimension standbyTime;
    @XmlElement(name = "ChargingTime")
    protected TimeDimension chargingTime;
    @XmlElement(name = "BatteryPower")
    protected BatteryPowerIntegerDimension batteryPower;
    @XmlElement(name = "Solar")
    protected Boolean solar;
    @XmlElement(name = "Refillable")
    protected Boolean refillable;
    @XmlElement(name = "Extended")
    protected Boolean extended;
    @XmlElement(name = "Slim")
    protected Boolean slim;
    @XmlElement(name = "Auxiliary")
    protected Boolean auxiliary;
    @XmlElement(name = "BatteryType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String batteryType;
    @XmlElement(name = "AntennaType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String antennaType;
    @XmlElement(name = "CompatiblePhoneModels")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> compatiblePhoneModels;
    @XmlElement(name = "ManufacturerName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String manufacturerName;
    @XmlElement(name = "Keywords")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> keywords;
    @XmlElement(name = "ItemPackageQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;
    @XmlElement(name = "HeadsetType")
    @XmlSchemaType(name = "string")
    protected HeadsetTypeValue headsetType;
    @XmlElement(name = "HeadsetStyle")
    @XmlSchemaType(name = "string")
    protected HeadsetStyleValue headsetStyle;

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WirelessAccessories.VariationData }
     *     
     */
    public WirelessAccessories.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessAccessories.VariationData }
     *     
     */
    public void setVariationData(WirelessAccessories.VariationData value) {
        this.variationData = value;
    }

    /**
     * 获取color属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * 获取colorMap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorMap() {
        return colorMap;
    }

    /**
     * 设置colorMap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorMap(String value) {
        this.colorMap = value;
    }

    /**
     * Gets the value of the additionalFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalFeatures() {
        if (additionalFeatures == null) {
            additionalFeatures = new ArrayList<String>();
        }
        return this.additionalFeatures;
    }

    /**
     * 获取talkTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getTalkTime() {
        return talkTime;
    }

    /**
     * 设置talkTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setTalkTime(TimeDimension value) {
        this.talkTime = value;
    }

    /**
     * 获取standbyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getStandbyTime() {
        return standbyTime;
    }

    /**
     * 设置standbyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setStandbyTime(TimeDimension value) {
        this.standbyTime = value;
    }

    /**
     * 获取chargingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getChargingTime() {
        return chargingTime;
    }

    /**
     * 设置chargingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setChargingTime(TimeDimension value) {
        this.chargingTime = value;
    }

    /**
     * 获取batteryPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public BatteryPowerIntegerDimension getBatteryPower() {
        return batteryPower;
    }

    /**
     * 设置batteryPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public void setBatteryPower(BatteryPowerIntegerDimension value) {
        this.batteryPower = value;
    }

    /**
     * 获取solar属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolar() {
        return solar;
    }

    /**
     * 设置solar属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolar(Boolean value) {
        this.solar = value;
    }

    /**
     * 获取refillable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefillable() {
        return refillable;
    }

    /**
     * 设置refillable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefillable(Boolean value) {
        this.refillable = value;
    }

    /**
     * 获取extended属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtended() {
        return extended;
    }

    /**
     * 设置extended属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtended(Boolean value) {
        this.extended = value;
    }

    /**
     * 获取slim属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlim() {
        return slim;
    }

    /**
     * 设置slim属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlim(Boolean value) {
        this.slim = value;
    }

    /**
     * 获取auxiliary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuxiliary() {
        return auxiliary;
    }

    /**
     * 设置auxiliary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuxiliary(Boolean value) {
        this.auxiliary = value;
    }

    /**
     * 获取batteryType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryType() {
        return batteryType;
    }

    /**
     * 设置batteryType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryType(String value) {
        this.batteryType = value;
    }

    /**
     * 获取antennaType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaType() {
        return antennaType;
    }

    /**
     * 设置antennaType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaType(String value) {
        this.antennaType = value;
    }

    /**
     * Gets the value of the compatiblePhoneModels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatiblePhoneModels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatiblePhoneModels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompatiblePhoneModels() {
        if (compatiblePhoneModels == null) {
            compatiblePhoneModels = new ArrayList<String>();
        }
        return this.compatiblePhoneModels;
    }

    /**
     * 获取manufacturerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * 设置manufacturerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
    }

    /**
     * 获取itemPackageQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemPackageQuantity() {
        return itemPackageQuantity;
    }

    /**
     * 设置itemPackageQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemPackageQuantity(BigInteger value) {
        this.itemPackageQuantity = value;
    }

    /**
     * 获取headsetType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HeadsetTypeValue }
     *     
     */
    public HeadsetTypeValue getHeadsetType() {
        return headsetType;
    }

    /**
     * 设置headsetType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HeadsetTypeValue }
     *     
     */
    public void setHeadsetType(HeadsetTypeValue value) {
        this.headsetType = value;
    }

    /**
     * 获取headsetStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HeadsetStyleValue }
     *     
     */
    public HeadsetStyleValue getHeadsetStyle() {
        return headsetStyle;
    }

    /**
     * 设置headsetStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HeadsetStyleValue }
     *     
     */
    public void setHeadsetStyle(HeadsetStyleValue value) {
        this.headsetStyle = value;
    }


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
     *         &lt;element name="Parentage">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="parent"/>
     *               &lt;enumeration value="child"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VariationTheme" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Color"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "parentage",
        "variationTheme"
    })
    public static class VariationData {

        @XmlElement(name = "Parentage", required = true)
        protected String parentage;
        @XmlElement(name = "VariationTheme")
        protected String variationTheme;

        /**
         * 获取parentage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentage() {
            return parentage;
        }

        /**
         * 设置parentage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentage(String value) {
            this.parentage = value;
        }

        /**
         * 获取variationTheme属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVariationTheme() {
            return variationTheme;
        }

        /**
         * 设置variationTheme属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVariationTheme(String value) {
            this.variationTheme = value;
        }

    }

}
