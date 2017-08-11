
package com.elcuk.jaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{}CameraFlash" minOccurs="0"/>
 *         &lt;element ref="{}ContinuousShootingSpeed" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}FixedFocalLength" minOccurs="0"/>
 *         &lt;element ref="{}FocusType" minOccurs="0"/>
 *         &lt;element ref="{}GuideNumber" minOccurs="0"/>
 *         &lt;element ref="{}ImageStabilization" minOccurs="0"/>
 *         &lt;element ref="{}IsHotShoeIncluded" minOccurs="0"/>
 *         &lt;element name="Lens" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}MaxAperture" minOccurs="0"/>
 *         &lt;element ref="{}MaxFocalLength" minOccurs="0"/>
 *         &lt;element ref="{}MaxShutterSpeed" minOccurs="0"/>
 *         &lt;element ref="{}MinAperture" minOccurs="0"/>
 *         &lt;element ref="{}MinFocalLength" minOccurs="0"/>
 *         &lt;element ref="{}MinShutterSpeed" minOccurs="0"/>
 *         &lt;element ref="{}OpticalZoom" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterLensSize" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
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
    "batteryCellType",
    "batteryChargeCycles",
    "batteryPower",
    "cameraFlash",
    "continuousShootingSpeed",
    "finishType",
    "fixedFocalLength",
    "focusType",
    "guideNumber",
    "imageStabilization",
    "isHotShoeIncluded",
    "lens",
    "maxAperture",
    "maxFocalLength",
    "maxShutterSpeed",
    "minAperture",
    "minFocalLength",
    "minShutterSpeed",
    "opticalZoom",
    "photoFilterLensSize",
    "powerSource",
    "viewFinderType",
    "waterResistantLevel",
    "efficiency"
})
@XmlRootElement(name = "CEFilmCamera")
public class CEFilmCamera {

    @XmlElement(name = "BatteryCellType")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellType;
    @XmlElement(name = "BatteryChargeCycles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryChargeCycles;
    @XmlElement(name = "BatteryPower")
    protected BatteryPowerIntegerDimension batteryPower;
    @XmlElement(name = "CameraFlash")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cameraFlash;
    @XmlElement(name = "ContinuousShootingSpeed")
    protected ContinuousShootingDimension continuousShootingSpeed;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "FixedFocalLength")
    protected LengthDimension fixedFocalLength;
    @XmlElement(name = "FocusType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String focusType;
    @XmlElement(name = "GuideNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String guideNumber;
    @XmlElement(name = "ImageStabilization")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String imageStabilization;
    @XmlElement(name = "IsHotShoeIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String isHotShoeIncluded;
    @XmlElement(name = "Lens")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lens;
    @XmlElement(name = "MaxAperture")
    protected ApertureDimension maxAperture;
    @XmlElement(name = "MaxFocalLength")
    protected LengthDimension maxFocalLength;
    @XmlElement(name = "MaxShutterSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxShutterSpeed;
    @XmlElement(name = "MinAperture")
    protected ApertureDimension minAperture;
    @XmlElement(name = "MinFocalLength")
    protected LengthDimension minFocalLength;
    @XmlElement(name = "MinShutterSpeed")
    protected BigDecimal minShutterSpeed;
    @XmlElement(name = "OpticalZoom")
    protected ZoomDimension opticalZoom;
    @XmlElement(name = "PhotoFilterLensSize")
    protected LengthDimension photoFilterLensSize;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
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
     * 获取continuousShootingSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContinuousShootingDimension }
     *     
     */
    public ContinuousShootingDimension getContinuousShootingSpeed() {
        return continuousShootingSpeed;
    }

    /**
     * 设置continuousShootingSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousShootingDimension }
     *     
     */
    public void setContinuousShootingSpeed(ContinuousShootingDimension value) {
        this.continuousShootingSpeed = value;
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
     * 获取focusType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocusType() {
        return focusType;
    }

    /**
     * 设置focusType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocusType(String value) {
        this.focusType = value;
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
     * 获取isHotShoeIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHotShoeIncluded() {
        return isHotShoeIncluded;
    }

    /**
     * 设置isHotShoeIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHotShoeIncluded(String value) {
        this.isHotShoeIncluded = value;
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
     * 获取maxAperture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApertureDimension }
     *     
     */
    public ApertureDimension getMaxAperture() {
        return maxAperture;
    }

    /**
     * 设置maxAperture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApertureDimension }
     *     
     */
    public void setMaxAperture(ApertureDimension value) {
        this.maxAperture = value;
    }

    /**
     * 获取maxFocalLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaxFocalLength() {
        return maxFocalLength;
    }

    /**
     * 设置maxFocalLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaxFocalLength(LengthDimension value) {
        this.maxFocalLength = value;
    }

    /**
     * 获取maxShutterSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxShutterSpeed() {
        return maxShutterSpeed;
    }

    /**
     * 设置maxShutterSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxShutterSpeed(String value) {
        this.maxShutterSpeed = value;
    }

    /**
     * 获取minAperture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApertureDimension }
     *     
     */
    public ApertureDimension getMinAperture() {
        return minAperture;
    }

    /**
     * 设置minAperture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApertureDimension }
     *     
     */
    public void setMinAperture(ApertureDimension value) {
        this.minAperture = value;
    }

    /**
     * 获取minFocalLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinFocalLength() {
        return minFocalLength;
    }

    /**
     * 设置minFocalLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinFocalLength(LengthDimension value) {
        this.minFocalLength = value;
    }

    /**
     * 获取minShutterSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinShutterSpeed() {
        return minShutterSpeed;
    }

    /**
     * 设置minShutterSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinShutterSpeed(BigDecimal value) {
        this.minShutterSpeed = value;
    }

    /**
     * 获取opticalZoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ZoomDimension }
     *     
     */
    public ZoomDimension getOpticalZoom() {
        return opticalZoom;
    }

    /**
     * 设置opticalZoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ZoomDimension }
     *     
     */
    public void setOpticalZoom(ZoomDimension value) {
        this.opticalZoom = value;
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
