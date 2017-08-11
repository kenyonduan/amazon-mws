
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
 *         &lt;element ref="{}AdditionalDrives" maxOccurs="10" minOccurs="0"/>
 *         &lt;element ref="{}Audio" minOccurs="0"/>
 *         &lt;element ref="{}CardReader" minOccurs="0"/>
 *         &lt;element ref="{}ComputerMemoryType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="ComputerTunerTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ComputerWirelessType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}ConnectivityType" minOccurs="0"/>
 *         &lt;element ref="{}DisplayResolutionMaximum" minOccurs="0"/>
 *         &lt;element name="GraphicsCard" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GraphicsCardDescription" type="{}MediumStringNotNull"/>
 *                   &lt;element name="GraphicsCardRamSize" type="{}MemorySizeDimension"/>
 *                   &lt;element ref="{}GraphicsCardInterface"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}GraphicsChipsetBrand" minOccurs="0"/>
 *         &lt;element name="GraphicsCoProcessor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GraphicsRAMType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}HardDiskRotationalSpeed" minOccurs="0"/>
 *         &lt;element name="HardDiskTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}HardDriveInterface" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{}HardDriveSize" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="HardwarePlatform" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}MaxExpandedMemorySupported" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfAudioOutPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfDMIPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfEthernetPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfFirewirePorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfGamingPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfHDMIPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfLPT1PrinterPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfMicrophonePorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfPS2Ports" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSerialPorts" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfUSB2.0Ports" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfUSB3.0Ports" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfVGAPorts" minOccurs="0"/>
 *         &lt;element ref="{}OperatingSystem" maxOccurs="2"/>
 *         &lt;element name="OpticalDeviceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}OpticalStorageDeviceType" minOccurs="0"/>
 *         &lt;element ref="{}OpticalDriveIntegrated" minOccurs="0"/>
 *         &lt;element name="ProcessorBrand" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ProcessorCount" minOccurs="0"/>
 *         &lt;element name="ProcessorSocket" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorSpeed" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element ref="{}ProcessorType" minOccurs="0"/>
 *         &lt;element ref="{}RAMClockSpeed" minOccurs="0"/>
 *         &lt;element ref="{}RAMFormFactor" minOccurs="0"/>
 *         &lt;element name="RAMSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element ref="{}RAMTechnology" minOccurs="0"/>
 *         &lt;element ref="{}RearWebcamResolution" minOccurs="0"/>
 *         &lt;element ref="{}ResponseTime" minOccurs="0"/>
 *         &lt;element ref="{}ScreenResolution" minOccurs="0"/>
 *         &lt;element ref="{}Series" minOccurs="0"/>
 *         &lt;element ref="{}SoftwareIncluded" minOccurs="0"/>
 *         &lt;element ref="{}Speaker" minOccurs="0"/>
 *         &lt;element ref="{}TabletInputMethod" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}TunerTechnology" minOccurs="0"/>
 *         &lt;element name="U-RackSize" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}ViewingAngle" minOccurs="0"/>
 *         &lt;element name="NotebookDisplayTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ScreenSize" minOccurs="0"/>
 *         &lt;element ref="{}HasColorScreen" minOccurs="0"/>
 *         &lt;element name="DisplayTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MonitorTunerTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
 *         &lt;element ref="{}WirelessCarrier" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}WirelessType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="AdditionalFeatures" type="{}String" minOccurs="0"/>
 *         &lt;element name="SpecificUsesForProduct" type="{}String" minOccurs="0"/>
 *         &lt;element name="SupportedSoftware" type="{}String" minOccurs="0"/>
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
    "additionalDrives",
    "audio",
    "cardReader",
    "computerMemoryType",
    "computerTunerTechnology",
    "computerWirelessType",
    "connectivityType",
    "displayResolutionMaximum",
    "graphicsCard",
    "graphicsChipsetBrand",
    "graphicsCoProcessor",
    "graphicsRAMType",
    "hardDiskRotationalSpeed",
    "hardDiskTechnology",
    "hardDriveInterface",
    "hardDriveSize",
    "hardwarePlatform",
    "maxExpandedMemorySupported",
    "modelNumber",
    "numberOfAudioOutPorts",
    "numberOfDMIPorts",
    "numberOfEthernetPorts",
    "numberOfFirewirePorts",
    "numberOfGamingPorts",
    "numberOfHDMIPorts",
    "numberOfLPT1PrinterPorts",
    "numberOfMicrophonePorts",
    "numberOfPS2Ports",
    "numberOfSerialPorts",
    "numberOfUSB20Ports",
    "numberOfUSB30Ports",
    "numberOfVGAPorts",
    "operatingSystem",
    "opticalDeviceType",
    "opticalStorageDeviceType",
    "opticalDriveIntegrated",
    "processorBrand",
    "processorCount",
    "processorSocket",
    "processorSpeed",
    "processorType",
    "ramClockSpeed",
    "ramFormFactor",
    "ramSize",
    "ramTechnology",
    "rearWebcamResolution",
    "responseTime",
    "screenResolution",
    "series",
    "softwareIncluded",
    "speaker",
    "tabletInputMethod",
    "tunerTechnology",
    "uRackSize",
    "viewingAngle",
    "notebookDisplayTechnology",
    "screenSize",
    "hasColorScreen",
    "displayTechnology",
    "monitorTunerTechnology",
    "voltage",
    "wattage",
    "wirelessCarrier",
    "wirelessType",
    "additionalFeatures",
    "specificUsesForProduct",
    "supportedSoftware",
    "numberOfDVIPorts",
    "efficiency"
})
@XmlRootElement(name = "PersonalComputer")
public class PersonalComputer {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalDrives")
    @XmlSchemaType(name = "string")
    protected List<AdditionalDrivesTypeValues> additionalDrives;
    @XmlElement(name = "Audio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String audio;
    @XmlElement(name = "CardReader")
    @XmlSchemaType(name = "string")
    protected CardReaderTypeValues cardReader;
    @XmlElement(name = "ComputerMemoryType")
    protected List<String> computerMemoryType;
    @XmlElement(name = "ComputerTunerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String computerTunerTechnology;
    @XmlElement(name = "ComputerWirelessType")
    protected List<String> computerWirelessType;
    @XmlElement(name = "ConnectivityType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String connectivityType;
    @XmlElement(name = "DisplayResolutionMaximum")
    protected String displayResolutionMaximum;
    @XmlElement(name = "GraphicsCard")
    protected List<PersonalComputer.GraphicsCard> graphicsCard;
    @XmlElement(name = "GraphicsChipsetBrand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsChipsetBrand;
    @XmlElement(name = "GraphicsCoProcessor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsCoProcessor;
    @XmlElement(name = "GraphicsRAMType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsRAMType;
    @XmlElement(name = "HardDiskRotationalSpeed")
    protected BigDecimal hardDiskRotationalSpeed;
    @XmlElement(name = "HardDiskTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hardDiskTechnology;
    @XmlElement(name = "HardDriveInterface")
    @XmlSchemaType(name = "string")
    protected List<HardDriveInterfaceTypeValues> hardDriveInterface;
    @XmlElement(name = "HardDriveSize")
    protected List<MemorySizeDimension> hardDriveSize;
    @XmlElement(name = "HardwarePlatform")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hardwarePlatform;
    @XmlElement(name = "MaxExpandedMemorySupported")
    protected MemorySizeDimension maxExpandedMemorySupported;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "NumberOfAudioOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfAudioOutPorts;
    @XmlElement(name = "NumberOfDMIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDMIPorts;
    @XmlElement(name = "NumberOfEthernetPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfEthernetPorts;
    @XmlElement(name = "NumberOfFirewirePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfFirewirePorts;
    @XmlElement(name = "NumberOfGamingPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfGamingPorts;
    @XmlElement(name = "NumberOfHDMIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHDMIPorts;
    @XmlElement(name = "NumberOfLPT1PrinterPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLPT1PrinterPorts;
    @XmlElement(name = "NumberOfMicrophonePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfMicrophonePorts;
    @XmlElement(name = "NumberOfPS2Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPS2Ports;
    @XmlElement(name = "NumberOfSerialPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSerialPorts;
    @XmlElement(name = "NumberOfUSB2.0Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfUSB20Ports;
    @XmlElement(name = "NumberOfUSB3.0Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfUSB30Ports;
    @XmlElement(name = "NumberOfVGAPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfVGAPorts;
    @XmlElement(name = "OperatingSystem", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "OpticalDeviceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalDeviceType;
    @XmlElement(name = "OpticalStorageDeviceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalStorageDeviceType;
    @XmlElement(name = "OpticalDriveIntegrated")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger opticalDriveIntegrated;
    @XmlElement(name = "ProcessorBrand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorBrand;
    @XmlElement(name = "ProcessorCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger processorCount;
    @XmlElement(name = "ProcessorSocket")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorSocket;
    @XmlElement(name = "ProcessorSpeed")
    protected FrequencyDimension processorSpeed;
    @XmlElement(name = "ProcessorType")
    protected String processorType;
    @XmlElement(name = "RAMClockSpeed")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ramClockSpeed;
    @XmlElement(name = "RAMFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ramFormFactor;
    @XmlElement(name = "RAMSize")
    protected MemorySizeDimension ramSize;
    @XmlElement(name = "RAMTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ramTechnology;
    @XmlElement(name = "RearWebcamResolution")
    protected ResolutionFiveDigitDimension rearWebcamResolution;
    @XmlElement(name = "ResponseTime")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger responseTime;
    @XmlElement(name = "ScreenResolution")
    protected String screenResolution;
    @XmlElement(name = "Series")
    protected String series;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "Speaker")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speaker;
    @XmlElement(name = "TabletInputMethod")
    @XmlSchemaType(name = "string")
    protected List<TabletInputMethodTypeValues> tabletInputMethod;
    @XmlElement(name = "TunerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tunerTechnology;
    @XmlElement(name = "U-RackSize")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger uRackSize;
    @XmlElement(name = "ViewingAngle")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger viewingAngle;
    @XmlElement(name = "NotebookDisplayTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String notebookDisplayTechnology;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "HasColorScreen")
    protected Boolean hasColorScreen;
    @XmlElement(name = "DisplayTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayTechnology;
    @XmlElement(name = "MonitorTunerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String monitorTunerTechnology;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
    @XmlElement(name = "WirelessCarrier")
    @XmlSchemaType(name = "string")
    protected List<WirelessCarrierTypeValues> wirelessCarrier;
    @XmlElement(name = "WirelessType")
    protected List<String> wirelessType;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "SpecificUsesForProduct")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String specificUsesForProduct;
    @XmlElement(name = "SupportedSoftware")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String supportedSoftware;
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
     * Gets the value of the additionalDrives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDrives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDrives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalDrivesTypeValues }
     * 
     * 
     */
    public List<AdditionalDrivesTypeValues> getAdditionalDrives() {
        if (additionalDrives == null) {
            additionalDrives = new ArrayList<AdditionalDrivesTypeValues>();
        }
        return this.additionalDrives;
    }

    /**
     * 获取audio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudio() {
        return audio;
    }

    /**
     * 设置audio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudio(String value) {
        this.audio = value;
    }

    /**
     * 获取cardReader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CardReaderTypeValues }
     *     
     */
    public CardReaderTypeValues getCardReader() {
        return cardReader;
    }

    /**
     * 设置cardReader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CardReaderTypeValues }
     *     
     */
    public void setCardReader(CardReaderTypeValues value) {
        this.cardReader = value;
    }

    /**
     * Gets the value of the computerMemoryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerMemoryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerMemoryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComputerMemoryType() {
        if (computerMemoryType == null) {
            computerMemoryType = new ArrayList<String>();
        }
        return this.computerMemoryType;
    }

    /**
     * 获取computerTunerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerTunerTechnology() {
        return computerTunerTechnology;
    }

    /**
     * 设置computerTunerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerTunerTechnology(String value) {
        this.computerTunerTechnology = value;
    }

    /**
     * Gets the value of the computerWirelessType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerWirelessType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerWirelessType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComputerWirelessType() {
        if (computerWirelessType == null) {
            computerWirelessType = new ArrayList<String>();
        }
        return this.computerWirelessType;
    }

    /**
     * 获取connectivityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectivityType() {
        return connectivityType;
    }

    /**
     * 设置connectivityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectivityType(String value) {
        this.connectivityType = value;
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
     * Gets the value of the graphicsCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicsCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalComputer.GraphicsCard }
     * 
     * 
     */
    public List<PersonalComputer.GraphicsCard> getGraphicsCard() {
        if (graphicsCard == null) {
            graphicsCard = new ArrayList<PersonalComputer.GraphicsCard>();
        }
        return this.graphicsCard;
    }

    /**
     * 获取graphicsChipsetBrand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsChipsetBrand() {
        return graphicsChipsetBrand;
    }

    /**
     * 设置graphicsChipsetBrand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsChipsetBrand(String value) {
        this.graphicsChipsetBrand = value;
    }

    /**
     * 获取graphicsCoProcessor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCoProcessor() {
        return graphicsCoProcessor;
    }

    /**
     * 设置graphicsCoProcessor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCoProcessor(String value) {
        this.graphicsCoProcessor = value;
    }

    /**
     * 获取graphicsRAMType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsRAMType() {
        return graphicsRAMType;
    }

    /**
     * 设置graphicsRAMType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsRAMType(String value) {
        this.graphicsRAMType = value;
    }

    /**
     * 获取hardDiskRotationalSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHardDiskRotationalSpeed() {
        return hardDiskRotationalSpeed;
    }

    /**
     * 设置hardDiskRotationalSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHardDiskRotationalSpeed(BigDecimal value) {
        this.hardDiskRotationalSpeed = value;
    }

    /**
     * 获取hardDiskTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardDiskTechnology() {
        return hardDiskTechnology;
    }

    /**
     * 设置hardDiskTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardDiskTechnology(String value) {
        this.hardDiskTechnology = value;
    }

    /**
     * Gets the value of the hardDriveInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardDriveInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardDriveInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardDriveInterfaceTypeValues }
     * 
     * 
     */
    public List<HardDriveInterfaceTypeValues> getHardDriveInterface() {
        if (hardDriveInterface == null) {
            hardDriveInterface = new ArrayList<HardDriveInterfaceTypeValues>();
        }
        return this.hardDriveInterface;
    }

    /**
     * Gets the value of the hardDriveSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardDriveSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardDriveSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemorySizeDimension }
     * 
     * 
     */
    public List<MemorySizeDimension> getHardDriveSize() {
        if (hardDriveSize == null) {
            hardDriveSize = new ArrayList<MemorySizeDimension>();
        }
        return this.hardDriveSize;
    }

    /**
     * 获取hardwarePlatform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * 设置hardwarePlatform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwarePlatform(String value) {
        this.hardwarePlatform = value;
    }

    /**
     * 获取maxExpandedMemorySupported属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getMaxExpandedMemorySupported() {
        return maxExpandedMemorySupported;
    }

    /**
     * 设置maxExpandedMemorySupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setMaxExpandedMemorySupported(MemorySizeDimension value) {
        this.maxExpandedMemorySupported = value;
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
     * 获取numberOfAudioOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfAudioOutPorts() {
        return numberOfAudioOutPorts;
    }

    /**
     * 设置numberOfAudioOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfAudioOutPorts(BigInteger value) {
        this.numberOfAudioOutPorts = value;
    }

    /**
     * 获取numberOfDMIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDMIPorts() {
        return numberOfDMIPorts;
    }

    /**
     * 设置numberOfDMIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDMIPorts(BigInteger value) {
        this.numberOfDMIPorts = value;
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
     * 获取numberOfFirewirePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFirewirePorts() {
        return numberOfFirewirePorts;
    }

    /**
     * 设置numberOfFirewirePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFirewirePorts(BigInteger value) {
        this.numberOfFirewirePorts = value;
    }

    /**
     * 获取numberOfGamingPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfGamingPorts() {
        return numberOfGamingPorts;
    }

    /**
     * 设置numberOfGamingPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfGamingPorts(BigInteger value) {
        this.numberOfGamingPorts = value;
    }

    /**
     * 获取numberOfHDMIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHDMIPorts() {
        return numberOfHDMIPorts;
    }

    /**
     * 设置numberOfHDMIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHDMIPorts(BigInteger value) {
        this.numberOfHDMIPorts = value;
    }

    /**
     * 获取numberOfLPT1PrinterPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLPT1PrinterPorts() {
        return numberOfLPT1PrinterPorts;
    }

    /**
     * 设置numberOfLPT1PrinterPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLPT1PrinterPorts(BigInteger value) {
        this.numberOfLPT1PrinterPorts = value;
    }

    /**
     * 获取numberOfMicrophonePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMicrophonePorts() {
        return numberOfMicrophonePorts;
    }

    /**
     * 设置numberOfMicrophonePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMicrophonePorts(BigInteger value) {
        this.numberOfMicrophonePorts = value;
    }

    /**
     * 获取numberOfPS2Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPS2Ports() {
        return numberOfPS2Ports;
    }

    /**
     * 设置numberOfPS2Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPS2Ports(BigInteger value) {
        this.numberOfPS2Ports = value;
    }

    /**
     * 获取numberOfSerialPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSerialPorts() {
        return numberOfSerialPorts;
    }

    /**
     * 设置numberOfSerialPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSerialPorts(BigInteger value) {
        this.numberOfSerialPorts = value;
    }

    /**
     * 获取numberOfUSB20Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUSB20Ports() {
        return numberOfUSB20Ports;
    }

    /**
     * 设置numberOfUSB20Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUSB20Ports(BigInteger value) {
        this.numberOfUSB20Ports = value;
    }

    /**
     * 获取numberOfUSB30Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUSB30Ports() {
        return numberOfUSB30Ports;
    }

    /**
     * 设置numberOfUSB30Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUSB30Ports(BigInteger value) {
        this.numberOfUSB30Ports = value;
    }

    /**
     * 获取numberOfVGAPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVGAPorts() {
        return numberOfVGAPorts;
    }

    /**
     * 设置numberOfVGAPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVGAPorts(BigInteger value) {
        this.numberOfVGAPorts = value;
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
     * 获取opticalDeviceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalDeviceType() {
        return opticalDeviceType;
    }

    /**
     * 设置opticalDeviceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalDeviceType(String value) {
        this.opticalDeviceType = value;
    }

    /**
     * 获取opticalStorageDeviceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalStorageDeviceType() {
        return opticalStorageDeviceType;
    }

    /**
     * 设置opticalStorageDeviceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalStorageDeviceType(String value) {
        this.opticalStorageDeviceType = value;
    }

    /**
     * 获取opticalDriveIntegrated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpticalDriveIntegrated() {
        return opticalDriveIntegrated;
    }

    /**
     * 设置opticalDriveIntegrated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpticalDriveIntegrated(BigInteger value) {
        this.opticalDriveIntegrated = value;
    }

    /**
     * 获取processorBrand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorBrand() {
        return processorBrand;
    }

    /**
     * 设置processorBrand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorBrand(String value) {
        this.processorBrand = value;
    }

    /**
     * 获取processorCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProcessorCount() {
        return processorCount;
    }

    /**
     * 设置processorCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProcessorCount(BigInteger value) {
        this.processorCount = value;
    }

    /**
     * 获取processorSocket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorSocket() {
        return processorSocket;
    }

    /**
     * 设置processorSocket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorSocket(String value) {
        this.processorSocket = value;
    }

    /**
     * 获取processorSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getProcessorSpeed() {
        return processorSpeed;
    }

    /**
     * 设置processorSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setProcessorSpeed(FrequencyDimension value) {
        this.processorSpeed = value;
    }

    /**
     * 获取processorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorType() {
        return processorType;
    }

    /**
     * 设置processorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorType(String value) {
        this.processorType = value;
    }

    /**
     * 获取ramClockSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRAMClockSpeed() {
        return ramClockSpeed;
    }

    /**
     * 设置ramClockSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRAMClockSpeed(BigInteger value) {
        this.ramClockSpeed = value;
    }

    /**
     * 获取ramFormFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMFormFactor() {
        return ramFormFactor;
    }

    /**
     * 设置ramFormFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMFormFactor(String value) {
        this.ramFormFactor = value;
    }

    /**
     * 获取ramSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getRAMSize() {
        return ramSize;
    }

    /**
     * 设置ramSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setRAMSize(MemorySizeDimension value) {
        this.ramSize = value;
    }

    /**
     * 获取ramTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMTechnology() {
        return ramTechnology;
    }

    /**
     * 设置ramTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMTechnology(String value) {
        this.ramTechnology = value;
    }

    /**
     * 获取rearWebcamResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public ResolutionFiveDigitDimension getRearWebcamResolution() {
        return rearWebcamResolution;
    }

    /**
     * 设置rearWebcamResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionFiveDigitDimension }
     *     
     */
    public void setRearWebcamResolution(ResolutionFiveDigitDimension value) {
        this.rearWebcamResolution = value;
    }

    /**
     * 获取responseTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResponseTime() {
        return responseTime;
    }

    /**
     * 设置responseTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResponseTime(BigInteger value) {
        this.responseTime = value;
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
     * 获取series属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeries() {
        return series;
    }

    /**
     * 设置series属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeries(String value) {
        this.series = value;
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
     * 获取speaker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeaker() {
        return speaker;
    }

    /**
     * 设置speaker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeaker(String value) {
        this.speaker = value;
    }

    /**
     * Gets the value of the tabletInputMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tabletInputMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTabletInputMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TabletInputMethodTypeValues }
     * 
     * 
     */
    public List<TabletInputMethodTypeValues> getTabletInputMethod() {
        if (tabletInputMethod == null) {
            tabletInputMethod = new ArrayList<TabletInputMethodTypeValues>();
        }
        return this.tabletInputMethod;
    }

    /**
     * 获取tunerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTunerTechnology() {
        return tunerTechnology;
    }

    /**
     * 设置tunerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTunerTechnology(String value) {
        this.tunerTechnology = value;
    }

    /**
     * 获取uRackSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getURackSize() {
        return uRackSize;
    }

    /**
     * 设置uRackSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setURackSize(BigInteger value) {
        this.uRackSize = value;
    }

    /**
     * 获取viewingAngle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViewingAngle() {
        return viewingAngle;
    }

    /**
     * 设置viewingAngle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViewingAngle(BigInteger value) {
        this.viewingAngle = value;
    }

    /**
     * 获取notebookDisplayTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotebookDisplayTechnology() {
        return notebookDisplayTechnology;
    }

    /**
     * 设置notebookDisplayTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotebookDisplayTechnology(String value) {
        this.notebookDisplayTechnology = value;
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
     * 获取hasColorScreen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasColorScreen() {
        return hasColorScreen;
    }

    /**
     * 设置hasColorScreen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasColorScreen(Boolean value) {
        this.hasColorScreen = value;
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
     * 获取monitorTunerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorTunerTechnology() {
        return monitorTunerTechnology;
    }

    /**
     * 设置monitorTunerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorTunerTechnology(String value) {
        this.monitorTunerTechnology = value;
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
     * Gets the value of the wirelessCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WirelessCarrierTypeValues }
     * 
     * 
     */
    public List<WirelessCarrierTypeValues> getWirelessCarrier() {
        if (wirelessCarrier == null) {
            wirelessCarrier = new ArrayList<WirelessCarrierTypeValues>();
        }
        return this.wirelessCarrier;
    }

    /**
     * Gets the value of the wirelessType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWirelessType() {
        if (wirelessType == null) {
            wirelessType = new ArrayList<String>();
        }
        return this.wirelessType;
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
     * 获取specificUsesForProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUsesForProduct() {
        return specificUsesForProduct;
    }

    /**
     * 设置specificUsesForProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUsesForProduct(String value) {
        this.specificUsesForProduct = value;
    }

    /**
     * 获取supportedSoftware属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedSoftware() {
        return supportedSoftware;
    }

    /**
     * 设置supportedSoftware属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedSoftware(String value) {
        this.supportedSoftware = value;
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
     *         &lt;element name="GraphicsCardDescription" type="{}MediumStringNotNull"/>
     *         &lt;element name="GraphicsCardRamSize" type="{}MemorySizeDimension"/>
     *         &lt;element ref="{}GraphicsCardInterface"/>
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
        "graphicsCardDescription",
        "graphicsCardRamSize",
        "graphicsCardInterface"
    })
    public static class GraphicsCard {

        @XmlElement(name = "GraphicsCardDescription", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String graphicsCardDescription;
        @XmlElement(name = "GraphicsCardRamSize", required = true)
        protected MemorySizeDimension graphicsCardRamSize;
        @XmlElement(name = "GraphicsCardInterface", required = true)
        @XmlSchemaType(name = "string")
        protected GraphicsCardInterfaceTypeValues graphicsCardInterface;

        /**
         * 获取graphicsCardDescription属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGraphicsCardDescription() {
            return graphicsCardDescription;
        }

        /**
         * 设置graphicsCardDescription属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGraphicsCardDescription(String value) {
            this.graphicsCardDescription = value;
        }

        /**
         * 获取graphicsCardRamSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MemorySizeDimension }
         *     
         */
        public MemorySizeDimension getGraphicsCardRamSize() {
            return graphicsCardRamSize;
        }

        /**
         * 设置graphicsCardRamSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MemorySizeDimension }
         *     
         */
        public void setGraphicsCardRamSize(MemorySizeDimension value) {
            this.graphicsCardRamSize = value;
        }

        /**
         * 获取graphicsCardInterface属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GraphicsCardInterfaceTypeValues }
         *     
         */
        public GraphicsCardInterfaceTypeValues getGraphicsCardInterface() {
            return graphicsCardInterface;
        }

        /**
         * 设置graphicsCardInterface属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GraphicsCardInterfaceTypeValues }
         *     
         */
        public void setGraphicsCardInterface(GraphicsCardInterfaceTypeValues value) {
            this.graphicsCardInterface = value;
        }

    }

}
