
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
 *         &lt;element ref="{}BatteryCellType" minOccurs="0"/>
 *         &lt;element name="BatteryChargeCycles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}BatteryPower" minOccurs="0"/>
 *         &lt;element ref="{}BluRayRegion" minOccurs="0"/>
 *         &lt;element ref="{}BoxContents" minOccurs="0"/>
 *         &lt;element name="CableLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CameraLens" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}DVDRegion" minOccurs="0"/>
 *         &lt;element ref="{}EffectiveStillResolution" minOccurs="0"/>
 *         &lt;element ref="{}EnclosureFinish" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}GrilleRemoveability" minOccurs="0"/>
 *         &lt;element ref="{}InternetApplications" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MemorySlotsAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSpeakers" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}ParentalControlTechnology" minOccurs="0"/>
 *         &lt;element name="PhotoSensorSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PhotoSensorTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}PowerConsumption" minOccurs="0"/>
 *         &lt;element ref="{}PowerPlugType" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="RemoteControlDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemovableMemory" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ScreenFinish" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}Shape" minOccurs="0"/>
 *         &lt;element name="SoftwareIncluded" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerGrilleMaterial" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerMaximumInputPower" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}ThreeDTechnology" minOccurs="0"/>
 *         &lt;element ref="{}TotalCoaxialInputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalComponentInPorts" minOccurs="0"/>
 *         &lt;element name="TotalDVIPorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalEthernetPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalFirewirePorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalHdmiPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalMicrophonePorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalPreampOutputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalSubwooferOutputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalSVideoInPorts" minOccurs="0"/>
 *         &lt;element name="TotalSVideoOutPorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalUSBPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalVgaInPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalVideoOutPorts" minOccurs="0"/>
 *         &lt;element ref="{}VideoEncoding" minOccurs="0"/>
 *         &lt;element name="VideoResolution" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}WattageIntegerDimension" minOccurs="0"/>
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
    "batteryCellType",
    "batteryChargeCycles",
    "batteryPower",
    "bluRayRegion",
    "boxContents",
    "cableLength",
    "cameraLens",
    "dvdRegion",
    "effectiveStillResolution",
    "enclosureFinish",
    "finishType",
    "grilleRemoveability",
    "internetApplications",
    "memorySlotsAvailable",
    "numberOfSpeakers",
    "operatingSystem",
    "parentalControlTechnology",
    "photoSensorSize",
    "photoSensorTechnology",
    "powerConsumption",
    "powerPlugType",
    "powerSource",
    "remoteControlDescription",
    "removableMemory",
    "screenFinish",
    "screenSize",
    "shape",
    "softwareIncluded",
    "speakerGrilleMaterial",
    "speakerMaximumInputPower",
    "subwooferSpeakerDiameter",
    "threeDTechnology",
    "totalCoaxialInputs",
    "totalComponentInPorts",
    "totalDVIPorts",
    "totalEthernetPorts",
    "totalFirewirePorts",
    "totalHdmiPorts",
    "totalMicrophonePorts",
    "totalPreampOutputs",
    "totalSubwooferOutputs",
    "totalSVideoInPorts",
    "totalSVideoOutPorts",
    "totalUSBPorts",
    "totalVgaInPorts",
    "totalVideoOutPorts",
    "videoEncoding",
    "videoResolution",
    "wattage",
    "efficiency"
})
@XmlRootElement(name = "PortableAvDevice")
public class PortableAvDevice {

    @XmlElement(name = "BatteryCellType")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellType;
    @XmlElement(name = "BatteryChargeCycles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryChargeCycles;
    @XmlElement(name = "BatteryPower")
    protected BatteryPowerIntegerDimension batteryPower;
    @XmlElement(name = "BluRayRegion")
    @XmlSchemaType(name = "string")
    protected BluRayRegionType bluRayRegion;
    @XmlElement(name = "BoxContents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String boxContents;
    @XmlElement(name = "CableLength")
    protected LengthDimension cableLength;
    @XmlElement(name = "CameraLens")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cameraLens;
    @XmlElement(name = "DVDRegion")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dvdRegion;
    @XmlElement(name = "EffectiveStillResolution")
    protected ResolutionDimension effectiveStillResolution;
    @XmlElement(name = "EnclosureFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String enclosureFinish;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "GrilleRemoveability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String grilleRemoveability;
    @XmlElement(name = "InternetApplications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> internetApplications;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "NumberOfSpeakers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSpeakers;
    @XmlElement(name = "OperatingSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "ParentalControlTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String parentalControlTechnology;
    @XmlElement(name = "PhotoSensorSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoSensorSize;
    @XmlElement(name = "PhotoSensorTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoSensorTechnology;
    @XmlElement(name = "PowerConsumption")
    protected PowerDimension powerConsumption;
    @XmlElement(name = "PowerPlugType")
    @XmlSchemaType(name = "normalizedString")
    protected PowerPlugType powerPlugType;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "RemoteControlDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteControlDescription;
    @XmlElement(name = "RemovableMemory")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String removableMemory;
    @XmlElement(name = "ScreenFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenFinish;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "Shape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shape;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "SpeakerGrilleMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerGrilleMaterial;
    @XmlElement(name = "SpeakerMaximumInputPower")
    protected PowerDimension speakerMaximumInputPower;
    @XmlElement(name = "SubwooferSpeakerDiameter")
    protected LengthDimension subwooferSpeakerDiameter;
    @XmlElement(name = "ThreeDTechnology")
    @XmlSchemaType(name = "string")
    protected ThreeDTechnologyValues threeDTechnology;
    @XmlElement(name = "TotalCoaxialInputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCoaxialInputs;
    @XmlElement(name = "TotalComponentInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalComponentInPorts;
    @XmlElement(name = "TotalDVIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalDVIPorts;
    @XmlElement(name = "TotalEthernetPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalEthernetPorts;
    @XmlElement(name = "TotalFirewirePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFirewirePorts;
    @XmlElement(name = "TotalHdmiPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalHdmiPorts;
    @XmlElement(name = "TotalMicrophonePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalMicrophonePorts;
    @XmlElement(name = "TotalPreampOutputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalPreampOutputs;
    @XmlElement(name = "TotalSubwooferOutputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSubwooferOutputs;
    @XmlElement(name = "TotalSVideoInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoInPorts;
    @XmlElement(name = "TotalSVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoOutPorts;
    @XmlElement(name = "TotalUSBPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUSBPorts;
    @XmlElement(name = "TotalVgaInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVgaInPorts;
    @XmlElement(name = "TotalVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVideoOutPorts;
    @XmlElement(name = "VideoEncoding")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoEncoding;
    @XmlElement(name = "VideoResolution")
    protected PixelDimension videoResolution;
    @XmlElement(name = "Wattage")
    protected WattageIntegerDimension wattage;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * 获取batteryCellType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public BatteryCellTypeValues getBatteryCellType() {
        return batteryCellType;
    }

    /**
     * 设置batteryCellType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public void setBatteryCellType(BatteryCellTypeValues value) {
        this.batteryCellType = value;
    }

    /**
     * 获取batteryChargeCycles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryChargeCycles() {
        return batteryChargeCycles;
    }

    /**
     * 设置batteryChargeCycles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryChargeCycles(BigInteger value) {
        this.batteryChargeCycles = value;
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
     * 获取bluRayRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BluRayRegionType }
     *     
     */
    public BluRayRegionType getBluRayRegion() {
        return bluRayRegion;
    }

    /**
     * 设置bluRayRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BluRayRegionType }
     *     
     */
    public void setBluRayRegion(BluRayRegionType value) {
        this.bluRayRegion = value;
    }

    /**
     * 获取boxContents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxContents() {
        return boxContents;
    }

    /**
     * 设置boxContents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxContents(String value) {
        this.boxContents = value;
    }

    /**
     * 获取cableLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCableLength() {
        return cableLength;
    }

    /**
     * 设置cableLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCableLength(LengthDimension value) {
        this.cableLength = value;
    }

    /**
     * 获取cameraLens属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraLens() {
        return cameraLens;
    }

    /**
     * 设置cameraLens属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraLens(String value) {
        this.cameraLens = value;
    }

    /**
     * 获取dvdRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDVDRegion() {
        return dvdRegion;
    }

    /**
     * 设置dvdRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDVDRegion(BigInteger value) {
        this.dvdRegion = value;
    }

    /**
     * 获取effectiveStillResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionDimension }
     *     
     */
    public ResolutionDimension getEffectiveStillResolution() {
        return effectiveStillResolution;
    }

    /**
     * 设置effectiveStillResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionDimension }
     *     
     */
    public void setEffectiveStillResolution(ResolutionDimension value) {
        this.effectiveStillResolution = value;
    }

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
     * 获取grilleRemoveability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrilleRemoveability() {
        return grilleRemoveability;
    }

    /**
     * 设置grilleRemoveability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrilleRemoveability(String value) {
        this.grilleRemoveability = value;
    }

    /**
     * Gets the value of the internetApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternetApplications() {
        if (internetApplications == null) {
            internetApplications = new ArrayList<String>();
        }
        return this.internetApplications;
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
     * 获取numberOfSpeakers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * 设置numberOfSpeakers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpeakers(BigInteger value) {
        this.numberOfSpeakers = value;
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
     * 获取parentalControlTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentalControlTechnology() {
        return parentalControlTechnology;
    }

    /**
     * 设置parentalControlTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentalControlTechnology(String value) {
        this.parentalControlTechnology = value;
    }

    /**
     * 获取photoSensorSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoSensorSize() {
        return photoSensorSize;
    }

    /**
     * 设置photoSensorSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoSensorSize(String value) {
        this.photoSensorSize = value;
    }

    /**
     * 获取photoSensorTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoSensorTechnology() {
        return photoSensorTechnology;
    }

    /**
     * 设置photoSensorTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoSensorTechnology(String value) {
        this.photoSensorTechnology = value;
    }

    /**
     * 获取powerConsumption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerDimension }
     *     
     */
    public PowerDimension getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * 设置powerConsumption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerDimension }
     *     
     */
    public void setPowerConsumption(PowerDimension value) {
        this.powerConsumption = value;
    }

    /**
     * 获取powerPlugType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerPlugType }
     *     
     */
    public PowerPlugType getPowerPlugType() {
        return powerPlugType;
    }

    /**
     * 设置powerPlugType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerPlugType }
     *     
     */
    public void setPowerPlugType(PowerPlugType value) {
        this.powerPlugType = value;
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
     * 获取remoteControlDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteControlDescription() {
        return remoteControlDescription;
    }

    /**
     * 设置remoteControlDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteControlDescription(String value) {
        this.remoteControlDescription = value;
    }

    /**
     * 获取removableMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovableMemory() {
        return removableMemory;
    }

    /**
     * 设置removableMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovableMemory(String value) {
        this.removableMemory = value;
    }

    /**
     * 获取screenFinish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenFinish() {
        return screenFinish;
    }

    /**
     * 设置screenFinish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenFinish(String value) {
        this.screenFinish = value;
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
     * 获取shape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * 设置shape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
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
     * 获取speakerGrilleMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerGrilleMaterial() {
        return speakerGrilleMaterial;
    }

    /**
     * 设置speakerGrilleMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerGrilleMaterial(String value) {
        this.speakerGrilleMaterial = value;
    }

    /**
     * 获取speakerMaximumInputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerDimension }
     *     
     */
    public PowerDimension getSpeakerMaximumInputPower() {
        return speakerMaximumInputPower;
    }

    /**
     * 设置speakerMaximumInputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerDimension }
     *     
     */
    public void setSpeakerMaximumInputPower(PowerDimension value) {
        this.speakerMaximumInputPower = value;
    }

    /**
     * 获取subwooferSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSubwooferSpeakerDiameter() {
        return subwooferSpeakerDiameter;
    }

    /**
     * 设置subwooferSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSubwooferSpeakerDiameter(LengthDimension value) {
        this.subwooferSpeakerDiameter = value;
    }

    /**
     * 获取threeDTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ThreeDTechnologyValues }
     *     
     */
    public ThreeDTechnologyValues getThreeDTechnology() {
        return threeDTechnology;
    }

    /**
     * 设置threeDTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDTechnologyValues }
     *     
     */
    public void setThreeDTechnology(ThreeDTechnologyValues value) {
        this.threeDTechnology = value;
    }

    /**
     * 获取totalCoaxialInputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCoaxialInputs() {
        return totalCoaxialInputs;
    }

    /**
     * 设置totalCoaxialInputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCoaxialInputs(BigInteger value) {
        this.totalCoaxialInputs = value;
    }

    /**
     * 获取totalComponentInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalComponentInPorts() {
        return totalComponentInPorts;
    }

    /**
     * 设置totalComponentInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalComponentInPorts(BigInteger value) {
        this.totalComponentInPorts = value;
    }

    /**
     * 获取totalDVIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDVIPorts() {
        return totalDVIPorts;
    }

    /**
     * 设置totalDVIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDVIPorts(BigInteger value) {
        this.totalDVIPorts = value;
    }

    /**
     * 获取totalEthernetPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEthernetPorts() {
        return totalEthernetPorts;
    }

    /**
     * 设置totalEthernetPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEthernetPorts(BigInteger value) {
        this.totalEthernetPorts = value;
    }

    /**
     * 获取totalFirewirePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFirewirePorts() {
        return totalFirewirePorts;
    }

    /**
     * 设置totalFirewirePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFirewirePorts(BigInteger value) {
        this.totalFirewirePorts = value;
    }

    /**
     * 获取totalHdmiPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalHdmiPorts() {
        return totalHdmiPorts;
    }

    /**
     * 设置totalHdmiPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalHdmiPorts(BigInteger value) {
        this.totalHdmiPorts = value;
    }

    /**
     * 获取totalMicrophonePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMicrophonePorts() {
        return totalMicrophonePorts;
    }

    /**
     * 设置totalMicrophonePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMicrophonePorts(BigInteger value) {
        this.totalMicrophonePorts = value;
    }

    /**
     * 获取totalPreampOutputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPreampOutputs() {
        return totalPreampOutputs;
    }

    /**
     * 设置totalPreampOutputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPreampOutputs(BigInteger value) {
        this.totalPreampOutputs = value;
    }

    /**
     * 获取totalSubwooferOutputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSubwooferOutputs() {
        return totalSubwooferOutputs;
    }

    /**
     * 设置totalSubwooferOutputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSubwooferOutputs(BigInteger value) {
        this.totalSubwooferOutputs = value;
    }

    /**
     * 获取totalSVideoInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSVideoInPorts() {
        return totalSVideoInPorts;
    }

    /**
     * 设置totalSVideoInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSVideoInPorts(BigInteger value) {
        this.totalSVideoInPorts = value;
    }

    /**
     * 获取totalSVideoOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSVideoOutPorts() {
        return totalSVideoOutPorts;
    }

    /**
     * 设置totalSVideoOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSVideoOutPorts(BigInteger value) {
        this.totalSVideoOutPorts = value;
    }

    /**
     * 获取totalUSBPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUSBPorts() {
        return totalUSBPorts;
    }

    /**
     * 设置totalUSBPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUSBPorts(BigInteger value) {
        this.totalUSBPorts = value;
    }

    /**
     * 获取totalVgaInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVgaInPorts() {
        return totalVgaInPorts;
    }

    /**
     * 设置totalVgaInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVgaInPorts(BigInteger value) {
        this.totalVgaInPorts = value;
    }

    /**
     * 获取totalVideoOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVideoOutPorts() {
        return totalVideoOutPorts;
    }

    /**
     * 设置totalVideoOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVideoOutPorts(BigInteger value) {
        this.totalVideoOutPorts = value;
    }

    /**
     * 获取videoEncoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoEncoding() {
        return videoEncoding;
    }

    /**
     * 设置videoEncoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoEncoding(String value) {
        this.videoEncoding = value;
    }

    /**
     * 获取videoResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getVideoResolution() {
        return videoResolution;
    }

    /**
     * 设置videoResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setVideoResolution(PixelDimension value) {
        this.videoResolution = value;
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
