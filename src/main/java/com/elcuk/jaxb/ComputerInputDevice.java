
package com.elcuk.jaxb;

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
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}BuiltInMicrophone" minOccurs="0"/>
 *         &lt;element ref="{}DeviceHardwareCompatability" minOccurs="0"/>
 *         &lt;element ref="{}DeviceSoftwareCompatability" minOccurs="0"/>
 *         &lt;element ref="{}HeadphoneStyle" minOccurs="0"/>
 *         &lt;element ref="{}InputDeviceDesignStyle" minOccurs="0"/>
 *         &lt;element ref="{}InputDeviceInterfaceTechnology" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}NoiseCanceling" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfButtons" minOccurs="0"/>
 *         &lt;element ref="{}PresentationRemoteLaserColor" minOccurs="0"/>
 *         &lt;element ref="{}PresentationRemoteMemory" minOccurs="0"/>
 *         &lt;element ref="{}PresentationRemoteOperatingDistance" minOccurs="0"/>
 *         &lt;element ref="{}PrimaryHeadphoneUse" minOccurs="0"/>
 *         &lt;element ref="{}TrackingMethod" minOccurs="0"/>
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
    "additionalFeatures",
    "builtInMicrophone",
    "deviceHardwareCompatability",
    "deviceSoftwareCompatability",
    "headphoneStyle",
    "inputDeviceDesignStyle",
    "inputDeviceInterfaceTechnology",
    "modelNumber",
    "noiseCanceling",
    "numberOfButtons",
    "presentationRemoteLaserColor",
    "presentationRemoteMemory",
    "presentationRemoteOperatingDistance",
    "primaryHeadphoneUse",
    "trackingMethod"
})
@XmlRootElement(name = "ComputerInputDevice")
public class ComputerInputDevice {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "BuiltInMicrophone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String builtInMicrophone;
    @XmlElement(name = "DeviceHardwareCompatability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String deviceHardwareCompatability;
    @XmlElement(name = "DeviceSoftwareCompatability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String deviceSoftwareCompatability;
    @XmlElement(name = "HeadphoneStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String headphoneStyle;
    @XmlElement(name = "InputDeviceDesignStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String inputDeviceDesignStyle;
    @XmlElement(name = "InputDeviceInterfaceTechnology")
    protected String inputDeviceInterfaceTechnology;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "NoiseCanceling")
    protected String noiseCanceling;
    @XmlElement(name = "NumberOfButtons")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfButtons;
    @XmlElement(name = "PresentationRemoteLaserColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String presentationRemoteLaserColor;
    @XmlElement(name = "PresentationRemoteMemory")
    protected MemorySizeFiveDigitDimension presentationRemoteMemory;
    @XmlElement(name = "PresentationRemoteOperatingDistance")
    protected LengthFiveDigitDimension presentationRemoteOperatingDistance;
    @XmlElement(name = "PrimaryHeadphoneUse")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String primaryHeadphoneUse;
    @XmlElement(name = "TrackingMethod")
    protected String trackingMethod;

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
     * 获取deviceHardwareCompatability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceHardwareCompatability() {
        return deviceHardwareCompatability;
    }

    /**
     * 设置deviceHardwareCompatability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceHardwareCompatability(String value) {
        this.deviceHardwareCompatability = value;
    }

    /**
     * 获取deviceSoftwareCompatability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSoftwareCompatability() {
        return deviceSoftwareCompatability;
    }

    /**
     * 设置deviceSoftwareCompatability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSoftwareCompatability(String value) {
        this.deviceSoftwareCompatability = value;
    }

    /**
     * 获取headphoneStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadphoneStyle() {
        return headphoneStyle;
    }

    /**
     * 设置headphoneStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadphoneStyle(String value) {
        this.headphoneStyle = value;
    }

    /**
     * 获取inputDeviceDesignStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDeviceDesignStyle() {
        return inputDeviceDesignStyle;
    }

    /**
     * 设置inputDeviceDesignStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDeviceDesignStyle(String value) {
        this.inputDeviceDesignStyle = value;
    }

    /**
     * 获取inputDeviceInterfaceTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDeviceInterfaceTechnology() {
        return inputDeviceInterfaceTechnology;
    }

    /**
     * 设置inputDeviceInterfaceTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDeviceInterfaceTechnology(String value) {
        this.inputDeviceInterfaceTechnology = value;
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
     * 获取noiseCanceling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoiseCanceling() {
        return noiseCanceling;
    }

    /**
     * 设置noiseCanceling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoiseCanceling(String value) {
        this.noiseCanceling = value;
    }

    /**
     * 获取numberOfButtons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfButtons() {
        return numberOfButtons;
    }

    /**
     * 设置numberOfButtons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfButtons(BigInteger value) {
        this.numberOfButtons = value;
    }

    /**
     * 获取presentationRemoteLaserColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationRemoteLaserColor() {
        return presentationRemoteLaserColor;
    }

    /**
     * 设置presentationRemoteLaserColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationRemoteLaserColor(String value) {
        this.presentationRemoteLaserColor = value;
    }

    /**
     * 获取presentationRemoteMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeFiveDigitDimension }
     *     
     */
    public MemorySizeFiveDigitDimension getPresentationRemoteMemory() {
        return presentationRemoteMemory;
    }

    /**
     * 设置presentationRemoteMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeFiveDigitDimension }
     *     
     */
    public void setPresentationRemoteMemory(MemorySizeFiveDigitDimension value) {
        this.presentationRemoteMemory = value;
    }

    /**
     * 获取presentationRemoteOperatingDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthFiveDigitDimension }
     *     
     */
    public LengthFiveDigitDimension getPresentationRemoteOperatingDistance() {
        return presentationRemoteOperatingDistance;
    }

    /**
     * 设置presentationRemoteOperatingDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthFiveDigitDimension }
     *     
     */
    public void setPresentationRemoteOperatingDistance(LengthFiveDigitDimension value) {
        this.presentationRemoteOperatingDistance = value;
    }

    /**
     * 获取primaryHeadphoneUse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryHeadphoneUse() {
        return primaryHeadphoneUse;
    }

    /**
     * 设置primaryHeadphoneUse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryHeadphoneUse(String value) {
        this.primaryHeadphoneUse = value;
    }

    /**
     * 获取trackingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingMethod() {
        return trackingMethod;
    }

    /**
     * 设置trackingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingMethod(String value) {
        this.trackingMethod = value;
    }

}
