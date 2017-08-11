
package com.elcuk.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element ref="{}ChipsetType" minOccurs="0"/>
 *         &lt;element name="ComponentMemoryStorageCapacity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>PositiveInteger">
 *                 &lt;attribute name="unitOfMeasure" use="required" type="{}MemorySizeUnitOfMeasure" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompatibleProcessorTypes" type="{}StringNotNull" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="ComponentWirelessType" type="{}ComponentWirelessTypeValues" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="CommunicationInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ComponentWriteSpeed" minOccurs="0"/>
 *         &lt;element name="ConnectorType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DigitalAudioCapacity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}DigitalMediaFormat" minOccurs="0"/>
 *         &lt;element ref="{}EffectiveInputArea" minOccurs="0"/>
 *         &lt;element name="FormFactor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HandOrientation" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}HasAutoFocus" minOccurs="0"/>
 *         &lt;element ref="{}HasProgrammableButtons" minOccurs="0"/>
 *         &lt;element ref="{}HolderCapacity" minOccurs="0"/>
 *         &lt;element name="InputType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IsAmplifierIntegrated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KeyboardDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxOperatingDistance" type="{}LengthIntegerDimension" minOccurs="0"/>
 *         &lt;element ref="{}MaximumOperatingDistance" minOccurs="0"/>
 *         &lt;element ref="{}MemorySlotsAvailable" minOccurs="0"/>
 *         &lt;element ref="{}MemoryStorageCapacity" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element name="MovementDetectionTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfPorts" minOccurs="0"/>
 *         &lt;element ref="{}OutputWattage" minOccurs="0"/>
 *         &lt;element ref="{}RecordingCapacity" minOccurs="0"/>
 *         &lt;element name="ScannerResolution" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerDiameter" minOccurs="0"/>
 *         &lt;element name="SpeakersMaxOutputPower" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="SpeakersNominalOutputPower" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="SpeakerOutputChannelQuantity" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="SpeakerSurroundSoundChannelConfiguration" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeedRating" type="{}TenStringNotNull" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="WriteSpeed" type="{}FiveStringNotNull" minOccurs="0"/>
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
    "additionalFeatures",
    "audioOutputMode",
    "chipsetType",
    "componentMemoryStorageCapacity",
    "compatibleProcessorTypes",
    "componentWirelessType",
    "communicationInterface",
    "componentWriteSpeed",
    "connectorType",
    "digitalAudioCapacity",
    "digitalMediaFormat",
    "effectiveInputArea",
    "formFactor",
    "handOrientation",
    "hasAutoFocus",
    "hasProgrammableButtons",
    "holderCapacity",
    "inputType",
    "isAmplifierIntegrated",
    "keyboardDescription",
    "materialType",
    "maxOperatingDistance",
    "maximumOperatingDistance",
    "memorySlotsAvailable",
    "memoryStorageCapacity",
    "modelNumber",
    "movementDetectionTechnology",
    "numberOfPorts",
    "outputWattage",
    "recordingCapacity",
    "scannerResolution",
    "speakerDiameter",
    "speakersMaxOutputPower",
    "speakersNominalOutputPower",
    "speakerOutputChannelQuantity",
    "speakerSurroundSoundChannelConfiguration",
    "speedRating",
    "voltage",
    "wattage",
    "writeSpeed",
    "efficiency"
})
@XmlRootElement(name = "ComputerComponent")
public class ComputerComponent {

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
    @XmlElement(name = "ChipsetType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String chipsetType;
    @XmlElement(name = "ComponentMemoryStorageCapacity")
    protected ComputerComponent.ComponentMemoryStorageCapacity componentMemoryStorageCapacity;
    @XmlElement(name = "CompatibleProcessorTypes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> compatibleProcessorTypes;
    @XmlElement(name = "ComponentWirelessType")
    protected List<String> componentWirelessType;
    @XmlElement(name = "CommunicationInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String communicationInterface;
    @XmlElement(name = "ComponentWriteSpeed")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger componentWriteSpeed;
    @XmlElement(name = "ConnectorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String connectorType;
    @XmlElement(name = "DigitalAudioCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String digitalAudioCapacity;
    @XmlElement(name = "DigitalMediaFormat")
    protected String digitalMediaFormat;
    @XmlElement(name = "EffectiveInputArea")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String effectiveInputArea;
    @XmlElement(name = "FormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String formFactor;
    @XmlElement(name = "HandOrientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String handOrientation;
    @XmlElement(name = "HasAutoFocus")
    protected Boolean hasAutoFocus;
    @XmlElement(name = "HasProgrammableButtons")
    protected Boolean hasProgrammableButtons;
    @XmlElement(name = "HolderCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String holderCapacity;
    @XmlElement(name = "InputType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String inputType;
    @XmlElement(name = "IsAmplifierIntegrated")
    protected Boolean isAmplifierIntegrated;
    @XmlElement(name = "KeyboardDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String keyboardDescription;
    @XmlElement(name = "MaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String materialType;
    @XmlElement(name = "MaxOperatingDistance")
    protected LengthIntegerDimension maxOperatingDistance;
    @XmlElement(name = "MaximumOperatingDistance")
    protected LengthIntegerDimension maximumOperatingDistance;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "MemoryStorageCapacity")
    protected MemorySizeIntegerDimension memoryStorageCapacity;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "MovementDetectionTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String movementDetectionTechnology;
    @XmlElement(name = "NumberOfPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPorts;
    @XmlElement(name = "OutputWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger outputWattage;
    @XmlElement(name = "RecordingCapacity")
    protected TimeIntegerDimension recordingCapacity;
    @XmlElement(name = "ScannerResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scannerResolution;
    @XmlElement(name = "SpeakerDiameter")
    protected LengthDimension speakerDiameter;
    @XmlElement(name = "SpeakersMaxOutputPower")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger speakersMaxOutputPower;
    @XmlElement(name = "SpeakersNominalOutputPower")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger speakersNominalOutputPower;
    @XmlElement(name = "SpeakerOutputChannelQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger speakerOutputChannelQuantity;
    @XmlElement(name = "SpeakerSurroundSoundChannelConfiguration")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerSurroundSoundChannelConfiguration;
    @XmlElement(name = "SpeedRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speedRating;
    @XmlElement(name = "Voltage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
    @XmlElement(name = "WriteSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String writeSpeed;
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
     * 获取chipsetType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipsetType() {
        return chipsetType;
    }

    /**
     * 设置chipsetType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipsetType(String value) {
        this.chipsetType = value;
    }

    /**
     * 获取componentMemoryStorageCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ComputerComponent.ComponentMemoryStorageCapacity }
     *     
     */
    public ComputerComponent.ComponentMemoryStorageCapacity getComponentMemoryStorageCapacity() {
        return componentMemoryStorageCapacity;
    }

    /**
     * 设置componentMemoryStorageCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ComputerComponent.ComponentMemoryStorageCapacity }
     *     
     */
    public void setComponentMemoryStorageCapacity(ComputerComponent.ComponentMemoryStorageCapacity value) {
        this.componentMemoryStorageCapacity = value;
    }

    /**
     * Gets the value of the compatibleProcessorTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleProcessorTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibleProcessorTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompatibleProcessorTypes() {
        if (compatibleProcessorTypes == null) {
            compatibleProcessorTypes = new ArrayList<String>();
        }
        return this.compatibleProcessorTypes;
    }

    /**
     * Gets the value of the componentWirelessType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentWirelessType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentWirelessType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComponentWirelessType() {
        if (componentWirelessType == null) {
            componentWirelessType = new ArrayList<String>();
        }
        return this.componentWirelessType;
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
     * 获取componentWriteSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentWriteSpeed() {
        return componentWriteSpeed;
    }

    /**
     * 设置componentWriteSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentWriteSpeed(BigInteger value) {
        this.componentWriteSpeed = value;
    }

    /**
     * 获取connectorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorType() {
        return connectorType;
    }

    /**
     * 设置connectorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorType(String value) {
        this.connectorType = value;
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
     * 获取effectiveInputArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveInputArea() {
        return effectiveInputArea;
    }

    /**
     * 设置effectiveInputArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveInputArea(String value) {
        this.effectiveInputArea = value;
    }

    /**
     * 获取formFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormFactor() {
        return formFactor;
    }

    /**
     * 设置formFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormFactor(String value) {
        this.formFactor = value;
    }

    /**
     * 获取handOrientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandOrientation() {
        return handOrientation;
    }

    /**
     * 设置handOrientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandOrientation(String value) {
        this.handOrientation = value;
    }

    /**
     * 获取hasAutoFocus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAutoFocus() {
        return hasAutoFocus;
    }

    /**
     * 设置hasAutoFocus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAutoFocus(Boolean value) {
        this.hasAutoFocus = value;
    }

    /**
     * 获取hasProgrammableButtons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasProgrammableButtons() {
        return hasProgrammableButtons;
    }

    /**
     * 设置hasProgrammableButtons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasProgrammableButtons(Boolean value) {
        this.hasProgrammableButtons = value;
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
     * 获取inputType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * 设置inputType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputType(String value) {
        this.inputType = value;
    }

    /**
     * 获取isAmplifierIntegrated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAmplifierIntegrated() {
        return isAmplifierIntegrated;
    }

    /**
     * 设置isAmplifierIntegrated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAmplifierIntegrated(Boolean value) {
        this.isAmplifierIntegrated = value;
    }

    /**
     * 获取keyboardDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyboardDescription() {
        return keyboardDescription;
    }

    /**
     * 设置keyboardDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyboardDescription(String value) {
        this.keyboardDescription = value;
    }

    /**
     * 获取materialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * 设置materialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
    }

    /**
     * 获取maxOperatingDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthIntegerDimension }
     *     
     */
    public LengthIntegerDimension getMaxOperatingDistance() {
        return maxOperatingDistance;
    }

    /**
     * 设置maxOperatingDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthIntegerDimension }
     *     
     */
    public void setMaxOperatingDistance(LengthIntegerDimension value) {
        this.maxOperatingDistance = value;
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
     * 获取memoryStorageCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public MemorySizeIntegerDimension getMemoryStorageCapacity() {
        return memoryStorageCapacity;
    }

    /**
     * 设置memoryStorageCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public void setMemoryStorageCapacity(MemorySizeIntegerDimension value) {
        this.memoryStorageCapacity = value;
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
     *     {@link String }
     *     
     */
    public String getMovementDetectionTechnology() {
        return movementDetectionTechnology;
    }

    /**
     * 设置movementDetectionTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementDetectionTechnology(String value) {
        this.movementDetectionTechnology = value;
    }

    /**
     * 获取numberOfPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPorts() {
        return numberOfPorts;
    }

    /**
     * 设置numberOfPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPorts(BigInteger value) {
        this.numberOfPorts = value;
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
     * 获取speakersMaxOutputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpeakersMaxOutputPower() {
        return speakersMaxOutputPower;
    }

    /**
     * 设置speakersMaxOutputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpeakersMaxOutputPower(BigInteger value) {
        this.speakersMaxOutputPower = value;
    }

    /**
     * 获取speakersNominalOutputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpeakersNominalOutputPower() {
        return speakersNominalOutputPower;
    }

    /**
     * 设置speakersNominalOutputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpeakersNominalOutputPower(BigInteger value) {
        this.speakersNominalOutputPower = value;
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
     * 获取speedRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedRating() {
        return speedRating;
    }

    /**
     * 设置speedRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedRating(String value) {
        this.speedRating = value;
    }

    /**
     * 获取voltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVoltage() {
        return voltage;
    }

    /**
     * 设置voltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVoltage(BigInteger value) {
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
     * 获取writeSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteSpeed() {
        return writeSpeed;
    }

    /**
     * 设置writeSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteSpeed(String value) {
        this.writeSpeed = value;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>PositiveInteger">
     *       &lt;attribute name="unitOfMeasure" use="required" type="{}MemorySizeUnitOfMeasure" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ComponentMemoryStorageCapacity {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "unitOfMeasure", required = true)
        protected MemorySizeUnitOfMeasure unitOfMeasure;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MemorySizeUnitOfMeasure }
         *     
         */
        public MemorySizeUnitOfMeasure getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MemorySizeUnitOfMeasure }
         *     
         */
        public void setUnitOfMeasure(MemorySizeUnitOfMeasure value) {
            this.unitOfMeasure = value;
        }

    }

}
