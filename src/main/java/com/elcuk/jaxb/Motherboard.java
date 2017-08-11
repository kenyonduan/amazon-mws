
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
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}CPUSocketType" minOccurs="0"/>
 *         &lt;element ref="{}FrontSideBusSpeed" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsCardInterface" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{}HDMIPorts" minOccurs="0"/>
 *         &lt;element ref="{}IntegratedAudioChannels" minOccurs="0"/>
 *         &lt;element ref="{}MaxEthernetSpeed" minOccurs="0"/>
 *         &lt;element ref="{}MaxMemorySupported" minOccurs="0"/>
 *         &lt;element ref="{}MemoryStandard" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}MotherboardFormFactor" minOccurs="0"/>
 *         &lt;element ref="{}MultiGPUTechnology" minOccurs="0"/>
 *         &lt;element ref="{}Northbridge" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfeSATAPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfEthernetPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfFireWire400Ports" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfFireWire800Ports" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfIDEPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfMemorySlots" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfPCIExpressSlots" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSATAPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfUSBPorts" minOccurs="0"/>
 *         &lt;element ref="{}OnboardVideo" minOccurs="0"/>
 *         &lt;element ref="{}SATARAID" minOccurs="0"/>
 *         &lt;element ref="{}SATAStandardsSupported" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}Southbridge" minOccurs="0"/>
 *         &lt;element ref="{}SPDIFOutput" minOccurs="0"/>
 *         &lt;element ref="{}TypeOfMemorySlot" minOccurs="0"/>
 *         &lt;element ref="{}USBPortType" minOccurs="0"/>
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
    "cpuSocketType",
    "frontSideBusSpeed",
    "graphicsCardInterface",
    "hdmiPorts",
    "integratedAudioChannels",
    "maxEthernetSpeed",
    "maxMemorySupported",
    "memoryStandard",
    "modelNumber",
    "motherboardFormFactor",
    "multiGPUTechnology",
    "northbridge",
    "numberOfeSATAPorts",
    "numberOfEthernetPorts",
    "numberOfFireWire400Ports",
    "numberOfFireWire800Ports",
    "numberOfIDEPorts",
    "numberOfMemorySlots",
    "numberOfPCIExpressSlots",
    "numberOfSATAPorts",
    "numberOfUSBPorts",
    "onboardVideo",
    "sataraid",
    "sataStandardsSupported",
    "southbridge",
    "spdifOutput",
    "typeOfMemorySlot",
    "usbPortType",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "Motherboard")
public class Motherboard {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "CPUSocketType")
    protected String cpuSocketType;
    @XmlElement(name = "FrontSideBusSpeed")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger frontSideBusSpeed;
    @XmlElement(name = "GraphicsCardInterface")
    @XmlSchemaType(name = "string")
    protected List<GraphicsCardInterfaceTypeValues> graphicsCardInterface;
    @XmlElement(name = "HDMIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger hdmiPorts;
    @XmlElement(name = "IntegratedAudioChannels")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger integratedAudioChannels;
    @XmlElement(name = "MaxEthernetSpeed")
    @XmlSchemaType(name = "string")
    protected MaxEthernetSpeedTypeValues maxEthernetSpeed;
    @XmlElement(name = "MaxMemorySupported")
    protected MemorySizeIntegerDimension maxMemorySupported;
    @XmlElement(name = "MemoryStandard")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memoryStandard;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "MotherboardFormFactor")
    protected String motherboardFormFactor;
    @XmlElement(name = "MultiGPUTechnology")
    protected String multiGPUTechnology;
    @XmlElement(name = "Northbridge")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String northbridge;
    @XmlElement(name = "NumberOfeSATAPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfeSATAPorts;
    @XmlElement(name = "NumberOfEthernetPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfEthernetPorts;
    @XmlElement(name = "NumberOfFireWire400Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfFireWire400Ports;
    @XmlElement(name = "NumberOfFireWire800Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfFireWire800Ports;
    @XmlElement(name = "NumberOfIDEPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfIDEPorts;
    @XmlElement(name = "NumberOfMemorySlots")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfMemorySlots;
    @XmlElement(name = "NumberOfPCIExpressSlots")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPCIExpressSlots;
    @XmlElement(name = "NumberOfSATAPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSATAPorts;
    @XmlElement(name = "NumberOfUSBPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfUSBPorts;
    @XmlElement(name = "OnboardVideo")
    protected String onboardVideo;
    @XmlElement(name = "SATARAID")
    protected String sataraid;
    @XmlElement(name = "SATAStandardsSupported")
    protected List<String> sataStandardsSupported;
    @XmlElement(name = "Southbridge")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String southbridge;
    @XmlElement(name = "SPDIFOutput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String spdifOutput;
    @XmlElement(name = "TypeOfMemorySlot")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger typeOfMemorySlot;
    @XmlElement(name = "USBPortType")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger usbPortType;
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
     * 获取cpuSocketType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPUSocketType() {
        return cpuSocketType;
    }

    /**
     * 设置cpuSocketType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPUSocketType(String value) {
        this.cpuSocketType = value;
    }

    /**
     * 获取frontSideBusSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrontSideBusSpeed() {
        return frontSideBusSpeed;
    }

    /**
     * 设置frontSideBusSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrontSideBusSpeed(BigInteger value) {
        this.frontSideBusSpeed = value;
    }

    /**
     * Gets the value of the graphicsCardInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsCardInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicsCardInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphicsCardInterfaceTypeValues }
     * 
     * 
     */
    public List<GraphicsCardInterfaceTypeValues> getGraphicsCardInterface() {
        if (graphicsCardInterface == null) {
            graphicsCardInterface = new ArrayList<GraphicsCardInterfaceTypeValues>();
        }
        return this.graphicsCardInterface;
    }

    /**
     * 获取hdmiPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHDMIPorts() {
        return hdmiPorts;
    }

    /**
     * 设置hdmiPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHDMIPorts(BigInteger value) {
        this.hdmiPorts = value;
    }

    /**
     * 获取integratedAudioChannels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegratedAudioChannels() {
        return integratedAudioChannels;
    }

    /**
     * 设置integratedAudioChannels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegratedAudioChannels(BigInteger value) {
        this.integratedAudioChannels = value;
    }

    /**
     * 获取maxEthernetSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MaxEthernetSpeedTypeValues }
     *     
     */
    public MaxEthernetSpeedTypeValues getMaxEthernetSpeed() {
        return maxEthernetSpeed;
    }

    /**
     * 设置maxEthernetSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MaxEthernetSpeedTypeValues }
     *     
     */
    public void setMaxEthernetSpeed(MaxEthernetSpeedTypeValues value) {
        this.maxEthernetSpeed = value;
    }

    /**
     * 获取maxMemorySupported属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public MemorySizeIntegerDimension getMaxMemorySupported() {
        return maxMemorySupported;
    }

    /**
     * 设置maxMemorySupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public void setMaxMemorySupported(MemorySizeIntegerDimension value) {
        this.maxMemorySupported = value;
    }

    /**
     * 获取memoryStandard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryStandard() {
        return memoryStandard;
    }

    /**
     * 设置memoryStandard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryStandard(String value) {
        this.memoryStandard = value;
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
     * 获取motherboardFormFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherboardFormFactor() {
        return motherboardFormFactor;
    }

    /**
     * 设置motherboardFormFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherboardFormFactor(String value) {
        this.motherboardFormFactor = value;
    }

    /**
     * 获取multiGPUTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiGPUTechnology() {
        return multiGPUTechnology;
    }

    /**
     * 设置multiGPUTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiGPUTechnology(String value) {
        this.multiGPUTechnology = value;
    }

    /**
     * 获取northbridge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNorthbridge() {
        return northbridge;
    }

    /**
     * 设置northbridge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNorthbridge(String value) {
        this.northbridge = value;
    }

    /**
     * 获取numberOfeSATAPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfeSATAPorts() {
        return numberOfeSATAPorts;
    }

    /**
     * 设置numberOfeSATAPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfeSATAPorts(BigInteger value) {
        this.numberOfeSATAPorts = value;
    }

    /**
     * 获取numberOfEthernetPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfEthernetPorts() {
        return numberOfEthernetPorts;
    }

    /**
     * 设置numberOfEthernetPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfEthernetPorts(BigInteger value) {
        this.numberOfEthernetPorts = value;
    }

    /**
     * 获取numberOfFireWire400Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFireWire400Ports() {
        return numberOfFireWire400Ports;
    }

    /**
     * 设置numberOfFireWire400Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFireWire400Ports(BigInteger value) {
        this.numberOfFireWire400Ports = value;
    }

    /**
     * 获取numberOfFireWire800Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFireWire800Ports() {
        return numberOfFireWire800Ports;
    }

    /**
     * 设置numberOfFireWire800Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFireWire800Ports(BigInteger value) {
        this.numberOfFireWire800Ports = value;
    }

    /**
     * 获取numberOfIDEPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIDEPorts() {
        return numberOfIDEPorts;
    }

    /**
     * 设置numberOfIDEPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIDEPorts(BigInteger value) {
        this.numberOfIDEPorts = value;
    }

    /**
     * 获取numberOfMemorySlots属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMemorySlots() {
        return numberOfMemorySlots;
    }

    /**
     * 设置numberOfMemorySlots属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMemorySlots(BigInteger value) {
        this.numberOfMemorySlots = value;
    }

    /**
     * 获取numberOfPCIExpressSlots属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPCIExpressSlots() {
        return numberOfPCIExpressSlots;
    }

    /**
     * 设置numberOfPCIExpressSlots属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPCIExpressSlots(BigInteger value) {
        this.numberOfPCIExpressSlots = value;
    }

    /**
     * 获取numberOfSATAPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSATAPorts() {
        return numberOfSATAPorts;
    }

    /**
     * 设置numberOfSATAPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSATAPorts(BigInteger value) {
        this.numberOfSATAPorts = value;
    }

    /**
     * 获取numberOfUSBPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUSBPorts() {
        return numberOfUSBPorts;
    }

    /**
     * 设置numberOfUSBPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUSBPorts(BigInteger value) {
        this.numberOfUSBPorts = value;
    }

    /**
     * 获取onboardVideo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnboardVideo() {
        return onboardVideo;
    }

    /**
     * 设置onboardVideo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnboardVideo(String value) {
        this.onboardVideo = value;
    }

    /**
     * 获取sataraid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATARAID() {
        return sataraid;
    }

    /**
     * 设置sataraid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATARAID(String value) {
        this.sataraid = value;
    }

    /**
     * Gets the value of the sataStandardsSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sataStandardsSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSATAStandardsSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSATAStandardsSupported() {
        if (sataStandardsSupported == null) {
            sataStandardsSupported = new ArrayList<String>();
        }
        return this.sataStandardsSupported;
    }

    /**
     * 获取southbridge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSouthbridge() {
        return southbridge;
    }

    /**
     * 设置southbridge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSouthbridge(String value) {
        this.southbridge = value;
    }

    /**
     * 获取spdifOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPDIFOutput() {
        return spdifOutput;
    }

    /**
     * 设置spdifOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPDIFOutput(String value) {
        this.spdifOutput = value;
    }

    /**
     * 获取typeOfMemorySlot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeOfMemorySlot() {
        return typeOfMemorySlot;
    }

    /**
     * 设置typeOfMemorySlot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeOfMemorySlot(BigInteger value) {
        this.typeOfMemorySlot = value;
    }

    /**
     * 获取usbPortType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUSBPortType() {
        return usbPortType;
    }

    /**
     * 设置usbPortType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUSBPortType(BigInteger value) {
        this.usbPortType = value;
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
