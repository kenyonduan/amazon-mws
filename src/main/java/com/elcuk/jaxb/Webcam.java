
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
 *         &lt;element ref="{}VariationData" minOccurs="0"/>
 *         &lt;element ref="{}BuiltInMicrophone" minOccurs="0"/>
 *         &lt;element ref="{}CameraType" minOccurs="0"/>
 *         &lt;element ref="{}DigitalStillResolution" minOccurs="0"/>
 *         &lt;element ref="{}ImageSensor" minOccurs="0"/>
 *         &lt;element ref="{}InputType" minOccurs="0"/>
 *         &lt;element ref="{}MaxWebcamImageResolution" minOccurs="0"/>
 *         &lt;element ref="{}MinimumSystemRequirements" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}NetworkingProtocol" minOccurs="0"/>
 *         &lt;element ref="{}VideoCallingResolution" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
 *         &lt;element ref="{}WebcamVideoCaptureResolution" minOccurs="0"/>
 *         &lt;element ref="{}WirelessStandard" minOccurs="0"/>
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
    "builtInMicrophone",
    "cameraType",
    "digitalStillResolution",
    "imageSensor",
    "inputType",
    "maxWebcamImageResolution",
    "minimumSystemRequirements",
    "modelNumber",
    "networkingProtocol",
    "videoCallingResolution",
    "voltage",
    "wattage",
    "webcamVideoCaptureResolution",
    "wirelessStandard"
})
@XmlRootElement(name = "Webcam")
public class Webcam {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "BuiltInMicrophone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String builtInMicrophone;
    @XmlElement(name = "CameraType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cameraType;
    @XmlElement(name = "DigitalStillResolution")
    protected ResolutionFiveDigitDimension digitalStillResolution;
    @XmlElement(name = "ImageSensor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String imageSensor;
    @XmlElement(name = "InputType")
    @XmlSchemaType(name = "string")
    protected InputTypeValues inputType;
    @XmlElement(name = "MaxWebcamImageResolution")
    protected ResolutionFiveDigitDimension maxWebcamImageResolution;
    @XmlElement(name = "MinimumSystemRequirements")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String minimumSystemRequirements;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "NetworkingProtocol")
    protected String networkingProtocol;
    @XmlElement(name = "VideoCallingResolution")
    protected ResolutionFiveDigitDimension videoCallingResolution;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
    @XmlElement(name = "WebcamVideoCaptureResolution")
    protected ResolutionFiveDigitDimension webcamVideoCaptureResolution;
    @XmlElement(name = "WirelessStandard")
    protected String wirelessStandard;

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
     * 获取builtInMicrophone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuiltInMicrophone() {
        return builtInMicrophone;
    }

    /**
     * 设置builtInMicrophone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuiltInMicrophone(String value) {
        this.builtInMicrophone = value;
    }

    /**
     * 获取cameraType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraType() {
        return cameraType;
    }

    /**
     * 设置cameraType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraType(String value) {
        this.cameraType = value;
    }

    /**
     * 获取digitalStillResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public ResolutionFiveDigitDimension getDigitalStillResolution() {
        return digitalStillResolution;
    }

    /**
     * 设置digitalStillResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public void setDigitalStillResolution(ResolutionFiveDigitDimension value) {
        this.digitalStillResolution = value;
    }

    /**
     * 获取imageSensor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageSensor() {
        return imageSensor;
    }

    /**
     * 设置imageSensor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageSensor(String value) {
        this.imageSensor = value;
    }

    /**
     * 获取inputType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InputTypeValues }
     *     
     */
    public InputTypeValues getInputType() {
        return inputType;
    }

    /**
     * 设置inputType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InputTypeValues }
     *     
     */
    public void setInputType(InputTypeValues value) {
        this.inputType = value;
    }

    /**
     * 获取maxWebcamImageResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public ResolutionFiveDigitDimension getMaxWebcamImageResolution() {
        return maxWebcamImageResolution;
    }

    /**
     * 设置maxWebcamImageResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public void setMaxWebcamImageResolution(ResolutionFiveDigitDimension value) {
        this.maxWebcamImageResolution = value;
    }

    /**
     * 获取minimumSystemRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumSystemRequirements() {
        return minimumSystemRequirements;
    }

    /**
     * 设置minimumSystemRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumSystemRequirements(String value) {
        this.minimumSystemRequirements = value;
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
     * 获取networkingProtocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkingProtocol() {
        return networkingProtocol;
    }

    /**
     * 设置networkingProtocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkingProtocol(String value) {
        this.networkingProtocol = value;
    }

    /**
     * 获取videoCallingResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public ResolutionFiveDigitDimension getVideoCallingResolution() {
        return videoCallingResolution;
    }

    /**
     * 设置videoCallingResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public void setVideoCallingResolution(ResolutionFiveDigitDimension value) {
        this.videoCallingResolution = value;
    }

    /**
     * 获取voltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltage() {
        return voltage;
    }

    /**
     * 设置voltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltage(BigDecimal value) {
        this.voltage = value;
    }

    /**
     * 获取wattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWattage() {
        return wattage;
    }

    /**
     * 设置wattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWattage(BigInteger value) {
        this.wattage = value;
    }

    /**
     * 获取webcamVideoCaptureResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public ResolutionFiveDigitDimension getWebcamVideoCaptureResolution() {
        return webcamVideoCaptureResolution;
    }

    /**
     * 设置webcamVideoCaptureResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public void setWebcamVideoCaptureResolution(ResolutionFiveDigitDimension value) {
        this.webcamVideoCaptureResolution = value;
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

}
