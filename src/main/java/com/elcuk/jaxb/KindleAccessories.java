
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
 *                         &lt;enumeration value="Size"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="Scent"/>
 *                         &lt;enumeration value="Size-Scent"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{}VoltageDecimalDimension" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}WattageIntegerDimension" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="AdditionalFeatures" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="VehicleSpeakerSize" type="{}TwentyStringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeakerDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="TelephoneType" type="{}FortyStringNotNull" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PDABaseModel" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DigitalMediaFormat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="diskette35"/>
 *               &lt;enumeration value="3480_tape_cartridge"/>
 *               &lt;enumeration value="4_mm_tape"/>
 *               &lt;enumeration value="diskette525"/>
 *               &lt;enumeration value="6250_magstar_tape"/>
 *               &lt;enumeration value="cd"/>
 *               &lt;enumeration value="compact_flash"/>
 *               &lt;enumeration value="dat_tape"/>
 *               &lt;enumeration value="digital_8"/>
 *               &lt;enumeration value="dlt"/>
 *               &lt;enumeration value="dvd_ram"/>
 *               &lt;enumeration value="dvd_rom"/>
 *               &lt;enumeration value="dvd_video"/>
 *               &lt;enumeration value="electronic_software_download"/>
 *               &lt;enumeration value="hi_8"/>
 *               &lt;enumeration value="memory_stick"/>
 *               &lt;enumeration value="minidisc"/>
 *               &lt;enumeration value="minidv"/>
 *               &lt;enumeration value="smart_media"/>
 *               &lt;enumeration value="vhs"/>
 *               &lt;enumeration value="xd_card"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HomeAutomationCommunicationDevice" type="{}ThirtyStringNotNull" minOccurs="0"/>
 *         &lt;element name="DigitalAudioCapacity" type="{}TwentyStringNotNull" minOccurs="0"/>
 *         &lt;element name="HolderCapacity" type="{}TwentyStringNotNull" minOccurs="0"/>
 *         &lt;element name="MemorySlotsAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorBrand" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ProcessorType" type="{}ProcessorTypeValues" minOccurs="0"/>
 *         &lt;element name="ProcessorSpeed" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="RAMSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="ScreenResolution" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="SoftwareIncluded" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="WirelessType" type="{}WirelessTypeValues" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="HardDriveSize" type="{}MemorySizeDimension" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="HardDriveInterface" type="{}HardDriveInterfaceTypeValues" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="HardwarePlatform" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="ComputerMemoryType" type="{}GraphicsRAMTypeValues" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PurchasingFeeRefSKU" type="{}SKUType" minOccurs="0"/>
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
    "voltage",
    "wattage",
    "powerSource",
    "additionalFeatures",
    "vehicleSpeakerSize",
    "speakerDiameter",
    "telephoneType",
    "pdaBaseModel",
    "digitalMediaFormat",
    "homeAutomationCommunicationDevice",
    "digitalAudioCapacity",
    "holderCapacity",
    "memorySlotsAvailable",
    "processorBrand",
    "processorCount",
    "processorType",
    "processorSpeed",
    "ramSize",
    "screenResolution",
    "softwareIncluded",
    "colorScreen",
    "screenSize",
    "wirelessType",
    "hardDriveSize",
    "hardDriveInterface",
    "operatingSystem",
    "hardwarePlatform",
    "computerMemoryType",
    "itemPackageQuantity",
    "purchasingFeeRefSKU"
})
@XmlRootElement(name = "KindleAccessories")
public class KindleAccessories {

    @XmlElement(name = "VariationData")
    protected KindleAccessories.VariationData variationData;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String color;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "Voltage")
    protected VoltageDecimalDimension voltage;
    @XmlElement(name = "Wattage")
    protected WattageIntegerDimension wattage;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "VehicleSpeakerSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vehicleSpeakerSize;
    @XmlElement(name = "SpeakerDiameter")
    protected LengthDimension speakerDiameter;
    @XmlElement(name = "TelephoneType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> telephoneType;
    @XmlElement(name = "PDABaseModel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> pdaBaseModel;
    @XmlElement(name = "DigitalMediaFormat")
    protected String digitalMediaFormat;
    @XmlElement(name = "HomeAutomationCommunicationDevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String homeAutomationCommunicationDevice;
    @XmlElement(name = "DigitalAudioCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String digitalAudioCapacity;
    @XmlElement(name = "HolderCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String holderCapacity;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "ProcessorBrand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorBrand;
    @XmlElement(name = "ProcessorCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger processorCount;
    @XmlElement(name = "ProcessorType")
    protected String processorType;
    @XmlElement(name = "ProcessorSpeed")
    protected FrequencyDimension processorSpeed;
    @XmlElement(name = "RAMSize")
    protected MemorySizeDimension ramSize;
    @XmlElement(name = "ScreenResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenResolution;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "ColorScreen")
    protected Boolean colorScreen;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "WirelessType")
    protected List<String> wirelessType;
    @XmlElement(name = "HardDriveSize")
    protected List<MemorySizeDimension> hardDriveSize;
    @XmlElement(name = "HardDriveInterface")
    @XmlSchemaType(name = "string")
    protected List<HardDriveInterfaceTypeValues> hardDriveInterface;
    @XmlElement(name = "OperatingSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "HardwarePlatform")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hardwarePlatform;
    @XmlElement(name = "ComputerMemoryType")
    protected List<String> computerMemoryType;
    @XmlElement(name = "ItemPackageQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;
    @XmlElement(name = "PurchasingFeeRefSKU")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String purchasingFeeRefSKU;

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link KindleAccessories.VariationData }
     *     
     */
    public KindleAccessories.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link KindleAccessories.VariationData }
     *     
     */
    public void setVariationData(KindleAccessories.VariationData value) {
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
     * 获取voltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VoltageDecimalDimension }
     *     
     */
    public VoltageDecimalDimension getVoltage() {
        return voltage;
    }

    /**
     * 设置voltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageDecimalDimension }
     *     
     */
    public void setVoltage(VoltageDecimalDimension value) {
        this.voltage = value;
    }

    /**
     * 获取wattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageIntegerDimension }
     *     
     */
    public WattageIntegerDimension getWattage() {
        return wattage;
    }

    /**
     * 设置wattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageIntegerDimension }
     *     
     */
    public void setWattage(WattageIntegerDimension value) {
        this.wattage = value;
    }

    /**
     * 获取powerSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * 设置powerSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSource(String value) {
        this.powerSource = value;
    }

    /**
     * 获取additionalFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalFeatures() {
        return additionalFeatures;
    }

    /**
     * 设置additionalFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalFeatures(String value) {
        this.additionalFeatures = value;
    }

    /**
     * 获取vehicleSpeakerSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleSpeakerSize() {
        return vehicleSpeakerSize;
    }

    /**
     * 设置vehicleSpeakerSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleSpeakerSize(String value) {
        this.vehicleSpeakerSize = value;
    }

    /**
     * 获取speakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSpeakerDiameter() {
        return speakerDiameter;
    }

    /**
     * 设置speakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSpeakerDiameter(LengthDimension value) {
        this.speakerDiameter = value;
    }

    /**
     * Gets the value of the telephoneType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelephoneType() {
        if (telephoneType == null) {
            telephoneType = new ArrayList<String>();
        }
        return this.telephoneType;
    }

    /**
     * Gets the value of the pdaBaseModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdaBaseModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDABaseModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPDABaseModel() {
        if (pdaBaseModel == null) {
            pdaBaseModel = new ArrayList<String>();
        }
        return this.pdaBaseModel;
    }

    /**
     * 获取digitalMediaFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalMediaFormat() {
        return digitalMediaFormat;
    }

    /**
     * 设置digitalMediaFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalMediaFormat(String value) {
        this.digitalMediaFormat = value;
    }

    /**
     * 获取homeAutomationCommunicationDevice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAutomationCommunicationDevice() {
        return homeAutomationCommunicationDevice;
    }

    /**
     * 设置homeAutomationCommunicationDevice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAutomationCommunicationDevice(String value) {
        this.homeAutomationCommunicationDevice = value;
    }

    /**
     * 获取digitalAudioCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalAudioCapacity() {
        return digitalAudioCapacity;
    }

    /**
     * 设置digitalAudioCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalAudioCapacity(String value) {
        this.digitalAudioCapacity = value;
    }

    /**
     * 获取holderCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderCapacity() {
        return holderCapacity;
    }

    /**
     * 设置holderCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderCapacity(String value) {
        this.holderCapacity = value;
    }

    /**
     * 获取memorySlotsAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemorySlotsAvailable() {
        return memorySlotsAvailable;
    }

    /**
     * 设置memorySlotsAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemorySlotsAvailable(String value) {
        this.memorySlotsAvailable = value;
    }

    /**
     * 获取processorBrand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorBrand() {
        return processorBrand;
    }

    /**
     * 设置processorBrand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorBrand(String value) {
        this.processorBrand = value;
    }

    /**
     * 获取processorCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProcessorCount() {
        return processorCount;
    }

    /**
     * 设置processorCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProcessorCount(BigInteger value) {
        this.processorCount = value;
    }

    /**
     * 获取processorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorType() {
        return processorType;
    }

    /**
     * 设置processorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorType(String value) {
        this.processorType = value;
    }

    /**
     * 获取processorSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getProcessorSpeed() {
        return processorSpeed;
    }

    /**
     * 设置processorSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setProcessorSpeed(FrequencyDimension value) {
        this.processorSpeed = value;
    }

    /**
     * 获取ramSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getRAMSize() {
        return ramSize;
    }

    /**
     * 设置ramSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setRAMSize(MemorySizeDimension value) {
        this.ramSize = value;
    }

    /**
     * 获取screenResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenResolution() {
        return screenResolution;
    }

    /**
     * 设置screenResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenResolution(String value) {
        this.screenResolution = value;
    }

    /**
     * 获取softwareIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareIncluded() {
        return softwareIncluded;
    }

    /**
     * 设置softwareIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareIncluded(String value) {
        this.softwareIncluded = value;
    }

    /**
     * 获取colorScreen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColorScreen() {
        return colorScreen;
    }

    /**
     * 设置colorScreen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColorScreen(Boolean value) {
        this.colorScreen = value;
    }

    /**
     * 获取screenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getScreenSize() {
        return screenSize;
    }

    /**
     * 设置screenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setScreenSize(LengthDimension value) {
        this.screenSize = value;
    }

    /**
     * Gets the value of the wirelessType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWirelessType() {
        if (wirelessType == null) {
            wirelessType = new ArrayList<String>();
        }
        return this.wirelessType;
    }

    /**
     * Gets the value of the hardDriveSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardDriveSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardDriveSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemorySizeDimension }
     * 
     * 
     */
    public List<MemorySizeDimension> getHardDriveSize() {
        if (hardDriveSize == null) {
            hardDriveSize = new ArrayList<MemorySizeDimension>();
        }
        return this.hardDriveSize;
    }

    /**
     * Gets the value of the hardDriveInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardDriveInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardDriveInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardDriveInterfaceTypeValues }
     * 
     * 
     */
    public List<HardDriveInterfaceTypeValues> getHardDriveInterface() {
        if (hardDriveInterface == null) {
            hardDriveInterface = new ArrayList<HardDriveInterfaceTypeValues>();
        }
        return this.hardDriveInterface;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperatingSystem() {
        if (operatingSystem == null) {
            operatingSystem = new ArrayList<String>();
        }
        return this.operatingSystem;
    }

    /**
     * 获取hardwarePlatform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * 设置hardwarePlatform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwarePlatform(String value) {
        this.hardwarePlatform = value;
    }

    /**
     * Gets the value of the computerMemoryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerMemoryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerMemoryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComputerMemoryType() {
        if (computerMemoryType == null) {
            computerMemoryType = new ArrayList<String>();
        }
        return this.computerMemoryType;
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
     * 获取purchasingFeeRefSKU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingFeeRefSKU() {
        return purchasingFeeRefSKU;
    }

    /**
     * 设置purchasingFeeRefSKU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingFeeRefSKU(String value) {
        this.purchasingFeeRefSKU = value;
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
     *               &lt;enumeration value="Size"/>
     *               &lt;enumeration value="Size-Color"/>
     *               &lt;enumeration value="Scent"/>
     *               &lt;enumeration value="Size-Scent"/>
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
