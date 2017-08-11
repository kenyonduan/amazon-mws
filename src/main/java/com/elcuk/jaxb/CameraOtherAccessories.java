
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
 *         &lt;element ref="{}AnalogRGBInput" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}BatteryCellType" minOccurs="0"/>
 *         &lt;element name="BatteryChargeCycles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}BatteryPower" minOccurs="0"/>
 *         &lt;element ref="{}BoxContents" minOccurs="0"/>
 *         &lt;element name="CableLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}CameraFilmSpeed" minOccurs="0"/>
 *         &lt;element ref="{}CameraFlash" minOccurs="0"/>
 *         &lt;element ref="{}CoatingDescription" minOccurs="0"/>
 *         &lt;element ref="{}CompatibleMountings" minOccurs="0"/>
 *         &lt;element name="Conductor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ConnectorGender" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}DigitalZoom" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}FixedFocalLength" minOccurs="0"/>
 *         &lt;element ref="{}FlashDedication" minOccurs="0"/>
 *         &lt;element ref="{}GuideNumber" minOccurs="0"/>
 *         &lt;element ref="{}ImageStabilization" minOccurs="0"/>
 *         &lt;element name="Lens" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LoadCapacity" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element ref="{}MaxWeightCapacity" minOccurs="0"/>
 *         &lt;element name="MemorySlotsAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}MountingType" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterBayonetSize" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterDropInSize" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterEffectSize" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterLensSize" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterMountType" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterThreadSize" minOccurs="0"/>
 *         &lt;element ref="{}PowerPlugType" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="RemoteControlDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemovableMemory" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SoftwareIncluded" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}SurgeProtectionRating" minOccurs="0"/>
 *         &lt;element ref="{}ThreeDTechnology" minOccurs="0"/>
 *         &lt;element name="TotalDVIPorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalPowerOutlets" minOccurs="0"/>
 *         &lt;element ref="{}ViewFinderType" minOccurs="0"/>
 *         &lt;element ref="{}WaterResistantLevel" minOccurs="0"/>
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
    "analogRGBInput",
    "batteryCellType",
    "batteryChargeCycles",
    "batteryPower",
    "boxContents",
    "cableLength",
    "cameraFilmSpeed",
    "cameraFlash",
    "coatingDescription",
    "compatibleMountings",
    "conductor",
    "connectorGender",
    "digitalZoom",
    "finishType",
    "fixedFocalLength",
    "flashDedication",
    "guideNumber",
    "imageStabilization",
    "lens",
    "loadCapacity",
    "maxWeightCapacity",
    "memorySlotsAvailable",
    "mountingType",
    "photoFilterBayonetSize",
    "photoFilterDropInSize",
    "photoFilterEffectSize",
    "photoFilterLensSize",
    "photoFilterMountType",
    "photoFilterThreadSize",
    "powerPlugType",
    "powerSource",
    "remoteControlDescription",
    "removableMemory",
    "screenSize",
    "softwareIncluded",
    "surgeProtectionRating",
    "threeDTechnology",
    "totalDVIPorts",
    "totalPowerOutlets",
    "viewFinderType",
    "waterResistantLevel",
    "efficiency"
})
@XmlRootElement(name = "CameraOtherAccessories")
public class CameraOtherAccessories {

    @XmlElement(name = "AnalogRGBInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> analogRGBInput;
    @XmlElement(name = "BatteryCellType")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellType;
    @XmlElement(name = "BatteryChargeCycles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryChargeCycles;
    @XmlElement(name = "BatteryPower")
    protected BatteryPowerIntegerDimension batteryPower;
    @XmlElement(name = "BoxContents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String boxContents;
    @XmlElement(name = "CableLength")
    protected LengthDimension cableLength;
    @XmlElement(name = "CameraFilmSpeed")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cameraFilmSpeed;
    @XmlElement(name = "CameraFlash")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cameraFlash;
    @XmlElement(name = "CoatingDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coatingDescription;
    @XmlElement(name = "CompatibleMountings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String compatibleMountings;
    @XmlElement(name = "Conductor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String conductor;
    @XmlElement(name = "ConnectorGender")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> connectorGender;
    @XmlElement(name = "DigitalZoom")
    protected ZoomDimension digitalZoom;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "FixedFocalLength")
    protected LengthDimension fixedFocalLength;
    @XmlElement(name = "FlashDedication")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String flashDedication;
    @XmlElement(name = "GuideNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String guideNumber;
    @XmlElement(name = "ImageStabilization")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String imageStabilization;
    @XmlElement(name = "Lens")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lens;
    @XmlElement(name = "LoadCapacity")
    protected WeightDimension loadCapacity;
    @XmlElement(name = "MaxWeightCapacity")
    protected WeightDimension maxWeightCapacity;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "MountingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountingType;
    @XmlElement(name = "PhotoFilterBayonetSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoFilterBayonetSize;
    @XmlElement(name = "PhotoFilterDropInSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoFilterDropInSize;
    @XmlElement(name = "PhotoFilterEffectSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoFilterEffectSize;
    @XmlElement(name = "PhotoFilterLensSize")
    protected LengthDimension photoFilterLensSize;
    @XmlElement(name = "PhotoFilterMountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoFilterMountType;
    @XmlElement(name = "PhotoFilterThreadSize")
    protected LengthDimension photoFilterThreadSize;
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
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "SurgeProtectionRating")
    protected EnergyRatingType surgeProtectionRating;
    @XmlElement(name = "ThreeDTechnology")
    @XmlSchemaType(name = "string")
    protected ThreeDTechnologyValues threeDTechnology;
    @XmlElement(name = "TotalDVIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalDVIPorts;
    @XmlElement(name = "TotalPowerOutlets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalPowerOutlets;
    @XmlElement(name = "ViewFinderType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String viewFinderType;
    @XmlElement(name = "WaterResistantLevel")
    @XmlSchemaType(name = "string")
    protected WaterResistantType waterResistantLevel;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * Gets the value of the analogRGBInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analogRGBInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalogRGBInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnalogRGBInput() {
        if (analogRGBInput == null) {
            analogRGBInput = new ArrayList<String>();
        }
        return this.analogRGBInput;
    }

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
     * 获取cameraFilmSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCameraFilmSpeed() {
        return cameraFilmSpeed;
    }

    /**
     * 设置cameraFilmSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCameraFilmSpeed(BigInteger value) {
        this.cameraFilmSpeed = value;
    }

    /**
     * 获取cameraFlash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraFlash() {
        return cameraFlash;
    }

    /**
     * 设置cameraFlash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraFlash(String value) {
        this.cameraFlash = value;
    }

    /**
     * 获取coatingDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoatingDescription() {
        return coatingDescription;
    }

    /**
     * 设置coatingDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoatingDescription(String value) {
        this.coatingDescription = value;
    }

    /**
     * 获取compatibleMountings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleMountings() {
        return compatibleMountings;
    }

    /**
     * 设置compatibleMountings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleMountings(String value) {
        this.compatibleMountings = value;
    }

    /**
     * 获取conductor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * 设置conductor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConductor(String value) {
        this.conductor = value;
    }

    /**
     * Gets the value of the connectorGender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectorGender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectorGender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConnectorGender() {
        if (connectorGender == null) {
            connectorGender = new ArrayList<String>();
        }
        return this.connectorGender;
    }

    /**
     * 获取digitalZoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ZoomDimension }
     *     
     */
    public ZoomDimension getDigitalZoom() {
        return digitalZoom;
    }

    /**
     * 设置digitalZoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ZoomDimension }
     *     
     */
    public void setDigitalZoom(ZoomDimension value) {
        this.digitalZoom = value;
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
     * 获取fixedFocalLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getFixedFocalLength() {
        return fixedFocalLength;
    }

    /**
     * 设置fixedFocalLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setFixedFocalLength(LengthDimension value) {
        this.fixedFocalLength = value;
    }

    /**
     * 获取flashDedication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashDedication() {
        return flashDedication;
    }

    /**
     * 设置flashDedication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashDedication(String value) {
        this.flashDedication = value;
    }

    /**
     * 获取guideNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuideNumber() {
        return guideNumber;
    }

    /**
     * 设置guideNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuideNumber(String value) {
        this.guideNumber = value;
    }

    /**
     * 获取imageStabilization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageStabilization() {
        return imageStabilization;
    }

    /**
     * 设置imageStabilization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageStabilization(String value) {
        this.imageStabilization = value;
    }

    /**
     * 获取lens属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLens() {
        return lens;
    }

    /**
     * 设置lens属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLens(String value) {
        this.lens = value;
    }

    /**
     * 获取loadCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * 设置loadCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setLoadCapacity(WeightDimension value) {
        this.loadCapacity = value;
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
     * 获取photoFilterBayonetSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoFilterBayonetSize() {
        return photoFilterBayonetSize;
    }

    /**
     * 设置photoFilterBayonetSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoFilterBayonetSize(String value) {
        this.photoFilterBayonetSize = value;
    }

    /**
     * 获取photoFilterDropInSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoFilterDropInSize() {
        return photoFilterDropInSize;
    }

    /**
     * 设置photoFilterDropInSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoFilterDropInSize(String value) {
        this.photoFilterDropInSize = value;
    }

    /**
     * 获取photoFilterEffectSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoFilterEffectSize() {
        return photoFilterEffectSize;
    }

    /**
     * 设置photoFilterEffectSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoFilterEffectSize(String value) {
        this.photoFilterEffectSize = value;
    }

    /**
     * 获取photoFilterLensSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getPhotoFilterLensSize() {
        return photoFilterLensSize;
    }

    /**
     * 设置photoFilterLensSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setPhotoFilterLensSize(LengthDimension value) {
        this.photoFilterLensSize = value;
    }

    /**
     * 获取photoFilterMountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoFilterMountType() {
        return photoFilterMountType;
    }

    /**
     * 设置photoFilterMountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoFilterMountType(String value) {
        this.photoFilterMountType = value;
    }

    /**
     * 获取photoFilterThreadSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getPhotoFilterThreadSize() {
        return photoFilterThreadSize;
    }

    /**
     * 设置photoFilterThreadSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setPhotoFilterThreadSize(LengthDimension value) {
        this.photoFilterThreadSize = value;
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
     * 获取surgeProtectionRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingType }
     *     
     */
    public EnergyRatingType getSurgeProtectionRating() {
        return surgeProtectionRating;
    }

    /**
     * 设置surgeProtectionRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingType }
     *     
     */
    public void setSurgeProtectionRating(EnergyRatingType value) {
        this.surgeProtectionRating = value;
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
     * 获取totalPowerOutlets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPowerOutlets() {
        return totalPowerOutlets;
    }

    /**
     * 设置totalPowerOutlets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPowerOutlets(BigInteger value) {
        this.totalPowerOutlets = value;
    }

    /**
     * 获取viewFinderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewFinderType() {
        return viewFinderType;
    }

    /**
     * 设置viewFinderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewFinderType(String value) {
        this.viewFinderType = value;
    }

    /**
     * 获取waterResistantLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WaterResistantType }
     *     
     */
    public WaterResistantType getWaterResistantLevel() {
        return waterResistantLevel;
    }

    /**
     * 设置waterResistantLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WaterResistantType }
     *     
     */
    public void setWaterResistantLevel(WaterResistantType value) {
        this.waterResistantLevel = value;
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
