
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
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}AudioOutputMode" minOccurs="0"/>
 *         &lt;element ref="{}CommunicationInterface" minOccurs="0"/>
 *         &lt;element ref="{}DigitalAudioCapacity" minOccurs="0"/>
 *         &lt;element ref="{}MemoryCardType" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}MovementDetectionTechnology" minOccurs="0"/>
 *         &lt;element ref="{}RecordingCapacity" minOccurs="0"/>
 *         &lt;element ref="{}SpeedClassRating" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
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
    "additionalFeatures",
    "audioOutputMode",
    "communicationInterface",
    "digitalAudioCapacity",
    "memoryCardType",
    "modelNumber",
    "movementDetectionTechnology",
    "recordingCapacity",
    "speedClassRating",
    "voltage",
    "wattage",
    "wirelessStandard"
})
@XmlRootElement(name = "FlashMemory")
public class FlashMemory {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "AudioOutputMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String audioOutputMode;
    @XmlElement(name = "CommunicationInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String communicationInterface;
    @XmlElement(name = "DigitalAudioCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String digitalAudioCapacity;
    @XmlElement(name = "MemoryCardType")
    @XmlSchemaType(name = "string")
    protected MemoryCardTypeValues memoryCardType;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "MovementDetectionTechnology")
    protected Boolean movementDetectionTechnology;
    @XmlElement(name = "RecordingCapacity")
    protected TimeIntegerDimension recordingCapacity;
    @XmlElement(name = "SpeedClassRating")
    @XmlSchemaType(name = "string")
    protected SpeedClassRatingTypeValues speedClassRating;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
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
     * 获取audioOutputMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioOutputMode() {
        return audioOutputMode;
    }

    /**
     * 设置audioOutputMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioOutputMode(String value) {
        this.audioOutputMode = value;
    }

    /**
     * 获取communicationInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationInterface() {
        return communicationInterface;
    }

    /**
     * 设置communicationInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationInterface(String value) {
        this.communicationInterface = value;
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
     * 获取memoryCardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemoryCardTypeValues }
     *     
     */
    public MemoryCardTypeValues getMemoryCardType() {
        return memoryCardType;
    }

    /**
     * 设置memoryCardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryCardTypeValues }
     *     
     */
    public void setMemoryCardType(MemoryCardTypeValues value) {
        this.memoryCardType = value;
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
     * 获取movementDetectionTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMovementDetectionTechnology() {
        return movementDetectionTechnology;
    }

    /**
     * 设置movementDetectionTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMovementDetectionTechnology(Boolean value) {
        this.movementDetectionTechnology = value;
    }

    /**
     * 获取recordingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeIntegerDimension }
     *     
     */
    public TimeIntegerDimension getRecordingCapacity() {
        return recordingCapacity;
    }

    /**
     * 设置recordingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntegerDimension }
     *     
     */
    public void setRecordingCapacity(TimeIntegerDimension value) {
        this.recordingCapacity = value;
    }

    /**
     * 获取speedClassRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpeedClassRatingTypeValues }
     *     
     */
    public SpeedClassRatingTypeValues getSpeedClassRating() {
        return speedClassRating;
    }

    /**
     * 设置speedClassRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedClassRatingTypeValues }
     *     
     */
    public void setSpeedClassRating(SpeedClassRatingTypeValues value) {
        this.speedClassRating = value;
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
