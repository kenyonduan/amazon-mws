
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
 *         &lt;element ref="{}FrequencyRange" minOccurs="0"/>
 *         &lt;element ref="{}InputType" minOccurs="0"/>
 *         &lt;element ref="{}MaximumOperatingDistance" minOccurs="0"/>
 *         &lt;element ref="{}MemorySlotsAvailable" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}MovementDetectionTechnology" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSatelliteSpeakers" minOccurs="0"/>
 *         &lt;element ref="{}OutputWattage" minOccurs="0"/>
 *         &lt;element ref="{}RecordingCapacity" minOccurs="0"/>
 *         &lt;element ref="{}RemoteIncluded" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerOutputChannelQuantity" minOccurs="0"/>
 *         &lt;element ref="{}SpeakersMaximumOutputPower" minOccurs="0"/>
 *         &lt;element ref="{}SpeakersNominalOutputPower" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerSurroundSoundChannelConfiguration" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
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
    "frequencyRange",
    "inputType",
    "maximumOperatingDistance",
    "memorySlotsAvailable",
    "modelNumber",
    "movementDetectionTechnology",
    "numberOfSatelliteSpeakers",
    "outputWattage",
    "recordingCapacity",
    "remoteIncluded",
    "speakerDiameter",
    "speakerOutputChannelQuantity",
    "speakersMaximumOutputPower",
    "speakersNominalOutputPower",
    "speakerSurroundSoundChannelConfiguration",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "ComputerSpeaker")
public class ComputerSpeaker {

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
    @XmlElement(name = "FrequencyRange")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String frequencyRange;
    @XmlElement(name = "InputType")
    @XmlSchemaType(name = "string")
    protected InputTypeValues inputType;
    @XmlElement(name = "MaximumOperatingDistance")
    protected LengthIntegerDimension maximumOperatingDistance;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "MovementDetectionTechnology")
    protected Boolean movementDetectionTechnology;
    @XmlElement(name = "NumberOfSatelliteSpeakers")
    protected BigDecimal numberOfSatelliteSpeakers;
    @XmlElement(name = "OutputWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger outputWattage;
    @XmlElement(name = "RecordingCapacity")
    protected TimeIntegerDimension recordingCapacity;
    @XmlElement(name = "RemoteIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteIncluded;
    @XmlElement(name = "SpeakerDiameter")
    protected LengthDimension speakerDiameter;
    @XmlElement(name = "SpeakerOutputChannelQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger speakerOutputChannelQuantity;
    @XmlElement(name = "SpeakersMaximumOutputPower")
    protected WattageDimension speakersMaximumOutputPower;
    @XmlElement(name = "SpeakersNominalOutputPower")
    protected WattageDimension speakersNominalOutputPower;
    @XmlElement(name = "SpeakerSurroundSoundChannelConfiguration")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerSurroundSoundChannelConfiguration;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;

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
     * 获取frequencyRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyRange() {
        return frequencyRange;
    }

    /**
     * 设置frequencyRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyRange(String value) {
        this.frequencyRange = value;
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
     * 获取maximumOperatingDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthIntegerDimension }
     *     
     */
    public LengthIntegerDimension getMaximumOperatingDistance() {
        return maximumOperatingDistance;
    }

    /**
     * 设置maximumOperatingDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthIntegerDimension }
     *     
     */
    public void setMaximumOperatingDistance(LengthIntegerDimension value) {
        this.maximumOperatingDistance = value;
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
     * 获取numberOfSatelliteSpeakers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfSatelliteSpeakers() {
        return numberOfSatelliteSpeakers;
    }

    /**
     * 设置numberOfSatelliteSpeakers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfSatelliteSpeakers(BigDecimal value) {
        this.numberOfSatelliteSpeakers = value;
    }

    /**
     * 获取outputWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutputWattage() {
        return outputWattage;
    }

    /**
     * 设置outputWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutputWattage(BigInteger value) {
        this.outputWattage = value;
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
     * 获取remoteIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIncluded() {
        return remoteIncluded;
    }

    /**
     * 设置remoteIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIncluded(String value) {
        this.remoteIncluded = value;
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
     * 获取speakerOutputChannelQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpeakerOutputChannelQuantity() {
        return speakerOutputChannelQuantity;
    }

    /**
     * 设置speakerOutputChannelQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpeakerOutputChannelQuantity(BigInteger value) {
        this.speakerOutputChannelQuantity = value;
    }

    /**
     * 获取speakersMaximumOutputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getSpeakersMaximumOutputPower() {
        return speakersMaximumOutputPower;
    }

    /**
     * 设置speakersMaximumOutputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setSpeakersMaximumOutputPower(WattageDimension value) {
        this.speakersMaximumOutputPower = value;
    }

    /**
     * 获取speakersNominalOutputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getSpeakersNominalOutputPower() {
        return speakersNominalOutputPower;
    }

    /**
     * 设置speakersNominalOutputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setSpeakersNominalOutputPower(WattageDimension value) {
        this.speakersNominalOutputPower = value;
    }

    /**
     * 获取speakerSurroundSoundChannelConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerSurroundSoundChannelConfiguration() {
        return speakerSurroundSoundChannelConfiguration;
    }

    /**
     * 设置speakerSurroundSoundChannelConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerSurroundSoundChannelConfiguration(String value) {
        this.speakerSurroundSoundChannelConfiguration = value;
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

}
