
package com.elcuk.jaxb;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}VariationData" minOccurs="0"/>
 *         &lt;element name="HasGreyScale" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LightSourceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScannerResolution" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}AspectRatio" minOccurs="0"/>
 *         &lt;element ref="{}AudibleNoise" minOccurs="0"/>
 *         &lt;element ref="{}BuiltinSpeaker" minOccurs="0"/>
 *         &lt;element ref="{}ContrastRatio" minOccurs="0"/>
 *         &lt;element ref="{}DisplayResolutionMaximum" minOccurs="0"/>
 *         &lt;element ref="{}DisplayTechnology" minOccurs="0"/>
 *         &lt;element ref="{}ImageDiagonalSize" minOccurs="0"/>
 *         &lt;element ref="{}InputVideoCompatability" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}InputVideoConnectors" minOccurs="0"/>
 *         &lt;element ref="{}KeystoneCorrection" minOccurs="0"/>
 *         &lt;element ref="{}LampLife" minOccurs="0"/>
 *         &lt;element ref="{}LampWattage" minOccurs="0"/>
 *         &lt;element name="Lens" type="{}String" minOccurs="0"/>
 *         &lt;element ref="{}MaximumHorizontalRefreshRate" minOccurs="0"/>
 *         &lt;element ref="{}MaximumImageSize" minOccurs="0"/>
 *         &lt;element ref="{}MaximumThrowDistance" minOccurs="0"/>
 *         &lt;element ref="{}MaximumThrowRatio" minOccurs="0"/>
 *         &lt;element ref="{}MaximumVerticalRefreshRate" minOccurs="0"/>
 *         &lt;element ref="{}MediaInput" minOccurs="0"/>
 *         &lt;element ref="{}MinimumHorizontalRefreshRate" minOccurs="0"/>
 *         &lt;element ref="{}MinimumImageSize" minOccurs="0"/>
 *         &lt;element ref="{}MinimumThrowDistance" minOccurs="0"/>
 *         &lt;element ref="{}MinimumThrowRatio" minOccurs="0"/>
 *         &lt;element ref="{}MinimumVerticalRefreshRate" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}ProjectorBrightness" minOccurs="0"/>
 *         &lt;element ref="{}Remote" minOccurs="0"/>
 *         &lt;element ref="{}ScreenResolution" minOccurs="0"/>
 *         &lt;element ref="{}ScreenTrigger" minOccurs="0"/>
 *         &lt;element ref="{}ThreeDReady" minOccurs="0"/>
 *         &lt;element ref="{}WirelessStandard" minOccurs="0"/>
 *         &lt;element ref="{}Zoom" minOccurs="0"/>
 *         &lt;element ref="{}ZoomRatio" minOccurs="0"/>
 *         &lt;element name="NumberOfDVIPorts" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="Efficiency" type="{}StringNotNull" minOccurs="0"/>
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
    "hasGreyScale",
    "lightSourceType",
    "scannerResolution",
    "aspectRatio",
    "audibleNoise",
    "builtinSpeaker",
    "contrastRatio",
    "displayResolutionMaximum",
    "displayTechnology",
    "imageDiagonalSize",
    "inputVideoCompatability",
    "inputVideoConnectors",
    "keystoneCorrection",
    "lampLife",
    "lampWattage",
    "lens",
    "maximumHorizontalRefreshRate",
    "maximumImageSize",
    "maximumThrowDistance",
    "maximumThrowRatio",
    "maximumVerticalRefreshRate",
    "mediaInput",
    "minimumHorizontalRefreshRate",
    "minimumImageSize",
    "minimumThrowDistance",
    "minimumThrowRatio",
    "minimumVerticalRefreshRate",
    "modelNumber",
    "projectorBrightness",
    "remote",
    "screenResolution",
    "screenTrigger",
    "threeDReady",
    "wirelessStandard",
    "zoom",
    "zoomRatio",
    "numberOfDVIPorts",
    "efficiency"
})
@XmlRootElement(name = "VideoProjector")
public class VideoProjector {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "HasGreyScale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hasGreyScale;
    @XmlElement(name = "LightSourceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lightSourceType;
    @XmlElement(name = "ScannerResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scannerResolution;
    @XmlElement(name = "AspectRatio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String aspectRatio;
    @XmlElement(name = "AudibleNoise")
    protected BigDecimal audibleNoise;
    @XmlElement(name = "BuiltinSpeaker")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger builtinSpeaker;
    @XmlElement(name = "ContrastRatio")
    protected String contrastRatio;
    @XmlElement(name = "DisplayResolutionMaximum")
    protected String displayResolutionMaximum;
    @XmlElement(name = "DisplayTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayTechnology;
    @XmlElement(name = "ImageDiagonalSize")
    protected LengthSevenDigitDimension imageDiagonalSize;
    @XmlElement(name = "InputVideoCompatability")
    protected List<String> inputVideoCompatability;
    @XmlElement(name = "InputVideoConnectors")
    @XmlSchemaType(name = "string")
    protected InputVideoConnectorsTypeValues inputVideoConnectors;
    @XmlElement(name = "KeystoneCorrection")
    protected LengthSevenDigitDimension keystoneCorrection;
    @XmlElement(name = "LampLife")
    protected BurnTimeSixDigitDimension lampLife;
    @XmlElement(name = "LampWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lampWattage;
    @XmlElement(name = "Lens")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lens;
    @XmlElement(name = "MaximumHorizontalRefreshRate")
    protected FrequencyFiveDigitIntegerDimension maximumHorizontalRefreshRate;
    @XmlElement(name = "MaximumImageSize")
    protected LengthSevenDigitDimension maximumImageSize;
    @XmlElement(name = "MaximumThrowDistance")
    protected BigDecimal maximumThrowDistance;
    @XmlElement(name = "MaximumThrowRatio")
    protected String maximumThrowRatio;
    @XmlElement(name = "MaximumVerticalRefreshRate")
    protected FrequencyFiveDigitIntegerDimension maximumVerticalRefreshRate;
    @XmlElement(name = "MediaInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mediaInput;
    @XmlElement(name = "MinimumHorizontalRefreshRate")
    protected FrequencyFiveDigitIntegerDimension minimumHorizontalRefreshRate;
    @XmlElement(name = "MinimumImageSize")
    protected LengthSevenDigitDimension minimumImageSize;
    @XmlElement(name = "MinimumThrowDistance")
    protected BigDecimal minimumThrowDistance;
    @XmlElement(name = "MinimumThrowRatio")
    protected String minimumThrowRatio;
    @XmlElement(name = "MinimumVerticalRefreshRate")
    protected FrequencyFiveDigitIntegerDimension minimumVerticalRefreshRate;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "ProjectorBrightness")
    protected LuminanceFiveDigitDimension projectorBrightness;
    @XmlElement(name = "Remote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remote;
    @XmlElement(name = "ScreenResolution")
    protected String screenResolution;
    @XmlElement(name = "ScreenTrigger")
    protected VoltageFiveDigitIntegerDimension screenTrigger;
    @XmlElement(name = "ThreeDReady")
    protected String threeDReady;
    @XmlElement(name = "WirelessStandard")
    protected String wirelessStandard;
    @XmlElement(name = "Zoom")
    protected String zoom;
    @XmlElement(name = "ZoomRatio")
    protected String zoomRatio;
    @XmlElement(name = "NumberOfDVIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDVIPorts;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariationData }
     *     
     */
    public VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariationData }
     *     
     */
    public void setVariationData(VariationData value) {
        this.variationData = value;
    }

    /**
     * 获取hasGreyScale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasGreyScale() {
        return hasGreyScale;
    }

    /**
     * 设置hasGreyScale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasGreyScale(String value) {
        this.hasGreyScale = value;
    }

    /**
     * 获取lightSourceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightSourceType() {
        return lightSourceType;
    }

    /**
     * 设置lightSourceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightSourceType(String value) {
        this.lightSourceType = value;
    }

    /**
     * 获取scannerResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerResolution() {
        return scannerResolution;
    }

    /**
     * 设置scannerResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerResolution(String value) {
        this.scannerResolution = value;
    }

    /**
     * 获取aspectRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectRatio() {
        return aspectRatio;
    }

    /**
     * 设置aspectRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectRatio(String value) {
        this.aspectRatio = value;
    }

    /**
     * 获取audibleNoise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAudibleNoise() {
        return audibleNoise;
    }

    /**
     * 设置audibleNoise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAudibleNoise(BigDecimal value) {
        this.audibleNoise = value;
    }

    /**
     * 获取builtinSpeaker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuiltinSpeaker() {
        return builtinSpeaker;
    }

    /**
     * 设置builtinSpeaker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuiltinSpeaker(BigInteger value) {
        this.builtinSpeaker = value;
    }

    /**
     * 获取contrastRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrastRatio() {
        return contrastRatio;
    }

    /**
     * 设置contrastRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrastRatio(String value) {
        this.contrastRatio = value;
    }

    /**
     * 获取displayResolutionMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayResolutionMaximum() {
        return displayResolutionMaximum;
    }

    /**
     * 设置displayResolutionMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayResolutionMaximum(String value) {
        this.displayResolutionMaximum = value;
    }

    /**
     * 获取displayTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTechnology() {
        return displayTechnology;
    }

    /**
     * 设置displayTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTechnology(String value) {
        this.displayTechnology = value;
    }

    /**
     * 获取imageDiagonalSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public LengthSevenDigitDimension getImageDiagonalSize() {
        return imageDiagonalSize;
    }

    /**
     * 设置imageDiagonalSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public void setImageDiagonalSize(LengthSevenDigitDimension value) {
        this.imageDiagonalSize = value;
    }

    /**
     * Gets the value of the inputVideoCompatability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputVideoCompatability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputVideoCompatability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputVideoCompatability() {
        if (inputVideoCompatability == null) {
            inputVideoCompatability = new ArrayList<String>();
        }
        return this.inputVideoCompatability;
    }

    /**
     * 获取inputVideoConnectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InputVideoConnectorsTypeValues }
     *     
     */
    public InputVideoConnectorsTypeValues getInputVideoConnectors() {
        return inputVideoConnectors;
    }

    /**
     * 设置inputVideoConnectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InputVideoConnectorsTypeValues }
     *     
     */
    public void setInputVideoConnectors(InputVideoConnectorsTypeValues value) {
        this.inputVideoConnectors = value;
    }

    /**
     * 获取keystoneCorrection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public LengthSevenDigitDimension getKeystoneCorrection() {
        return keystoneCorrection;
    }

    /**
     * 设置keystoneCorrection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public void setKeystoneCorrection(LengthSevenDigitDimension value) {
        this.keystoneCorrection = value;
    }

    /**
     * 获取lampLife属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BurnTimeSixDigitDimension }
     *     
     */
    public BurnTimeSixDigitDimension getLampLife() {
        return lampLife;
    }

    /**
     * 设置lampLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BurnTimeSixDigitDimension }
     *     
     */
    public void setLampLife(BurnTimeSixDigitDimension value) {
        this.lampLife = value;
    }

    /**
     * 获取lampWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLampWattage() {
        return lampWattage;
    }

    /**
     * 设置lampWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLampWattage(BigInteger value) {
        this.lampWattage = value;
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
     * 获取maximumHorizontalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyFiveDigitIntegerDimension }
     *     
     */
    public FrequencyFiveDigitIntegerDimension getMaximumHorizontalRefreshRate() {
        return maximumHorizontalRefreshRate;
    }

    /**
     * 设置maximumHorizontalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyFiveDigitIntegerDimension }
     *     
     */
    public void setMaximumHorizontalRefreshRate(FrequencyFiveDigitIntegerDimension value) {
        this.maximumHorizontalRefreshRate = value;
    }

    /**
     * 获取maximumImageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public LengthSevenDigitDimension getMaximumImageSize() {
        return maximumImageSize;
    }

    /**
     * 设置maximumImageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public void setMaximumImageSize(LengthSevenDigitDimension value) {
        this.maximumImageSize = value;
    }

    /**
     * 获取maximumThrowDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumThrowDistance() {
        return maximumThrowDistance;
    }

    /**
     * 设置maximumThrowDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumThrowDistance(BigDecimal value) {
        this.maximumThrowDistance = value;
    }

    /**
     * 获取maximumThrowRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumThrowRatio() {
        return maximumThrowRatio;
    }

    /**
     * 设置maximumThrowRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumThrowRatio(String value) {
        this.maximumThrowRatio = value;
    }

    /**
     * 获取maximumVerticalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyFiveDigitIntegerDimension }
     *     
     */
    public FrequencyFiveDigitIntegerDimension getMaximumVerticalRefreshRate() {
        return maximumVerticalRefreshRate;
    }

    /**
     * 设置maximumVerticalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyFiveDigitIntegerDimension }
     *     
     */
    public void setMaximumVerticalRefreshRate(FrequencyFiveDigitIntegerDimension value) {
        this.maximumVerticalRefreshRate = value;
    }

    /**
     * 获取mediaInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaInput() {
        return mediaInput;
    }

    /**
     * 设置mediaInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaInput(String value) {
        this.mediaInput = value;
    }

    /**
     * 获取minimumHorizontalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyFiveDigitIntegerDimension }
     *     
     */
    public FrequencyFiveDigitIntegerDimension getMinimumHorizontalRefreshRate() {
        return minimumHorizontalRefreshRate;
    }

    /**
     * 设置minimumHorizontalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyFiveDigitIntegerDimension }
     *     
     */
    public void setMinimumHorizontalRefreshRate(FrequencyFiveDigitIntegerDimension value) {
        this.minimumHorizontalRefreshRate = value;
    }

    /**
     * 获取minimumImageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public LengthSevenDigitDimension getMinimumImageSize() {
        return minimumImageSize;
    }

    /**
     * 设置minimumImageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public void setMinimumImageSize(LengthSevenDigitDimension value) {
        this.minimumImageSize = value;
    }

    /**
     * 获取minimumThrowDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumThrowDistance() {
        return minimumThrowDistance;
    }

    /**
     * 设置minimumThrowDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumThrowDistance(BigDecimal value) {
        this.minimumThrowDistance = value;
    }

    /**
     * 获取minimumThrowRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumThrowRatio() {
        return minimumThrowRatio;
    }

    /**
     * 设置minimumThrowRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumThrowRatio(String value) {
        this.minimumThrowRatio = value;
    }

    /**
     * 获取minimumVerticalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyFiveDigitIntegerDimension }
     *     
     */
    public FrequencyFiveDigitIntegerDimension getMinimumVerticalRefreshRate() {
        return minimumVerticalRefreshRate;
    }

    /**
     * 设置minimumVerticalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyFiveDigitIntegerDimension }
     *     
     */
    public void setMinimumVerticalRefreshRate(FrequencyFiveDigitIntegerDimension value) {
        this.minimumVerticalRefreshRate = value;
    }

    /**
     * 获取modelNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * 设置modelNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * 获取projectorBrightness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LuminanceFiveDigitDimension }
     *     
     */
    public LuminanceFiveDigitDimension getProjectorBrightness() {
        return projectorBrightness;
    }

    /**
     * 设置projectorBrightness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LuminanceFiveDigitDimension }
     *     
     */
    public void setProjectorBrightness(LuminanceFiveDigitDimension value) {
        this.projectorBrightness = value;
    }

    /**
     * 获取remote属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemote() {
        return remote;
    }

    /**
     * 设置remote属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemote(String value) {
        this.remote = value;
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
     * 获取screenTrigger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VoltageFiveDigitIntegerDimension }
     *     
     */
    public VoltageFiveDigitIntegerDimension getScreenTrigger() {
        return screenTrigger;
    }

    /**
     * 设置screenTrigger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageFiveDigitIntegerDimension }
     *     
     */
    public void setScreenTrigger(VoltageFiveDigitIntegerDimension value) {
        this.screenTrigger = value;
    }

    /**
     * 获取threeDReady属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreeDReady() {
        return threeDReady;
    }

    /**
     * 设置threeDReady属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreeDReady(String value) {
        this.threeDReady = value;
    }

    /**
     * 获取wirelessStandard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessStandard() {
        return wirelessStandard;
    }

    /**
     * 设置wirelessStandard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessStandard(String value) {
        this.wirelessStandard = value;
    }

    /**
     * 获取zoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoom() {
        return zoom;
    }

    /**
     * 设置zoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoom(String value) {
        this.zoom = value;
    }

    /**
     * 获取zoomRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoomRatio() {
        return zoomRatio;
    }

    /**
     * 设置zoomRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoomRatio(String value) {
        this.zoomRatio = value;
    }

    /**
     * 获取numberOfDVIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDVIPorts() {
        return numberOfDVIPorts;
    }

    /**
     * 设置numberOfDVIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDVIPorts(BigInteger value) {
        this.numberOfDVIPorts = value;
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
