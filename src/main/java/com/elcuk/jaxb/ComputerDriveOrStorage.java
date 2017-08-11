
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
 *         &lt;element ref="{}ACAdapterIncluded" minOccurs="0"/>
 *         &lt;element ref="{}AutomaticBackupSoftwareIncluded" minOccurs="0"/>
 *         &lt;element ref="{}Averagelatency" minOccurs="0"/>
 *         &lt;element ref="{}Averageseektime" minOccurs="0"/>
 *         &lt;element ref="{}Averagewritetime" minOccurs="0"/>
 *         &lt;element ref="{}BufferSize" minOccurs="0"/>
 *         &lt;element ref="{}CableInterface" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{}CacheSize" minOccurs="0"/>
 *         &lt;element name="DataTransferRate" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}DockingStationExternalInterface" minOccurs="0"/>
 *         &lt;element name="DriveMemoryStorageCapacity" type="{}MemorySizeIntegerDimension" minOccurs="0"/>
 *         &lt;element ref="{}DriveRPM" minOccurs="0"/>
 *         &lt;element ref="{}HardDriveSize" maxOccurs="8" minOccurs="0"/>
 *         &lt;element ref="{}IncludedHarddrivedescription" minOccurs="0"/>
 *         &lt;element ref="{}InterfaceType" minOccurs="0"/>
 *         &lt;element ref="{}InternalConnector" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}MemoryStorageCapacity" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}NASNetworkInterface" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfexternalBays" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfHardDrives" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfInternalBays" minOccurs="0"/>
 *         &lt;element ref="{}OpticalDriveType" minOccurs="0"/>
 *         &lt;element ref="{}PhysicalHardDriveFormFactor" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}PlatformCompatability" minOccurs="0"/>
 *         &lt;element ref="{}RAID" minOccurs="0"/>
 *         &lt;element ref="{}SSDConnectorPins" minOccurs="0"/>
 *         &lt;element ref="{}SSDDriveArchitechture" minOccurs="0"/>
 *         &lt;element ref="{}StorageMaterialType" minOccurs="0"/>
 *         &lt;element ref="{}StorageReadSpeed" minOccurs="0"/>
 *         &lt;element ref="{}StorageWriteSpeed" minOccurs="0"/>
 *         &lt;element ref="{}TotalFirewire1600Connectors" minOccurs="0"/>
 *         &lt;element ref="{}TotalFirewire3200Connectors" minOccurs="0"/>
 *         &lt;element ref="{}TotalFirewire400Connectors" minOccurs="0"/>
 *         &lt;element ref="{}TotalFirewire800Connectors" minOccurs="0"/>
 *         &lt;element ref="{}TotalSataConnectors" minOccurs="0"/>
 *         &lt;element ref="{}TotalUSB1.0Connectors" minOccurs="0"/>
 *         &lt;element ref="{}TotalUSB1.1Connectors" minOccurs="0"/>
 *         &lt;element ref="{}TotalUSB2.0Connectors" minOccurs="0"/>
 *         &lt;element ref="{}TotalUSB3.0Connectors" minOccurs="0"/>
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
    "acAdapterIncluded",
    "automaticBackupSoftwareIncluded",
    "averagelatency",
    "averageseektime",
    "averagewritetime",
    "bufferSize",
    "cableInterface",
    "cacheSize",
    "dataTransferRate",
    "dockingStationExternalInterface",
    "driveMemoryStorageCapacity",
    "driveRPM",
    "hardDriveSize",
    "includedHarddrivedescription",
    "interfaceType",
    "internalConnector",
    "memoryStorageCapacity",
    "modelNumber",
    "nasNetworkInterface",
    "numberOfexternalBays",
    "numberOfHardDrives",
    "numberOfInternalBays",
    "opticalDriveType",
    "physicalHardDriveFormFactor",
    "platformCompatability",
    "raid",
    "ssdConnectorPins",
    "ssdDriveArchitechture",
    "storageMaterialType",
    "storageReadSpeed",
    "storageWriteSpeed",
    "totalFirewire1600Connectors",
    "totalFirewire3200Connectors",
    "totalFirewire400Connectors",
    "totalFirewire800Connectors",
    "totalSataConnectors",
    "totalUSB10Connectors",
    "totalUSB11Connectors",
    "totalUSB20Connectors",
    "totalUSB30Connectors",
    "efficiency"
})
@XmlRootElement(name = "ComputerDriveOrStorage")
public class ComputerDriveOrStorage {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "ACAdapterIncluded")
    protected Boolean acAdapterIncluded;
    @XmlElement(name = "AutomaticBackupSoftwareIncluded")
    protected Boolean automaticBackupSoftwareIncluded;
    @XmlElement(name = "Averagelatency")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger averagelatency;
    @XmlElement(name = "Averageseektime")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger averageseektime;
    @XmlElement(name = "Averagewritetime")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger averagewritetime;
    @XmlElement(name = "BufferSize")
    protected MemorySizeIntegerDimension bufferSize;
    @XmlElement(name = "CableInterface")
    protected List<String> cableInterface;
    @XmlElement(name = "CacheSize")
    protected MemorySizeIntegerDimension cacheSize;
    @XmlElement(name = "DataTransferRate")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dataTransferRate;
    @XmlElement(name = "DockingStationExternalInterface")
    @XmlSchemaType(name = "string")
    protected DockingStationExternalInterfaceTypeValues dockingStationExternalInterface;
    @XmlElement(name = "DriveMemoryStorageCapacity")
    protected MemorySizeIntegerDimension driveMemoryStorageCapacity;
    @XmlElement(name = "DriveRPM")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger driveRPM;
    @XmlElement(name = "HardDriveSize")
    protected List<MemorySizeDimension> hardDriveSize;
    @XmlElement(name = "IncludedHarddrivedescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String includedHarddrivedescription;
    @XmlElement(name = "InterfaceType")
    @XmlSchemaType(name = "string")
    protected InterfaceTypeValues interfaceType;
    @XmlElement(name = "InternalConnector")
    @XmlSchemaType(name = "string")
    protected List<InternalConnectorTypeValues> internalConnector;
    @XmlElement(name = "MemoryStorageCapacity")
    protected MemorySizeIntegerDimension memoryStorageCapacity;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "NASNetworkInterface")
    protected List<DataTransferSpeedIntegerDimension> nasNetworkInterface;
    @XmlElement(name = "NumberOfexternalBays")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfexternalBays;
    @XmlElement(name = "NumberOfHardDrives")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHardDrives;
    @XmlElement(name = "NumberOfInternalBays")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfInternalBays;
    @XmlElement(name = "OpticalDriveType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalDriveType;
    @XmlElement(name = "PhysicalHardDriveFormFactor")
    protected List<BigDecimal> physicalHardDriveFormFactor;
    @XmlElement(name = "PlatformCompatability")
    protected String platformCompatability;
    @XmlElement(name = "RAID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String raid;
    @XmlElement(name = "SSDConnectorPins")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ssdConnectorPins;
    @XmlElement(name = "SSDDriveArchitechture")
    protected String ssdDriveArchitechture;
    @XmlElement(name = "StorageMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String storageMaterialType;
    @XmlElement(name = "StorageReadSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String storageReadSpeed;
    @XmlElement(name = "StorageWriteSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String storageWriteSpeed;
    @XmlElement(name = "TotalFirewire1600Connectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFirewire1600Connectors;
    @XmlElement(name = "TotalFirewire3200Connectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFirewire3200Connectors;
    @XmlElement(name = "TotalFirewire400Connectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFirewire400Connectors;
    @XmlElement(name = "TotalFirewire800Connectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFirewire800Connectors;
    @XmlElement(name = "TotalSataConnectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSataConnectors;
    @XmlElement(name = "TotalUSB1.0Connectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUSB10Connectors;
    @XmlElement(name = "TotalUSB1.1Connectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUSB11Connectors;
    @XmlElement(name = "TotalUSB2.0Connectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUSB20Connectors;
    @XmlElement(name = "TotalUSB3.0Connectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUSB30Connectors;
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
     * 获取acAdapterIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACAdapterIncluded() {
        return acAdapterIncluded;
    }

    /**
     * 设置acAdapterIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACAdapterIncluded(Boolean value) {
        this.acAdapterIncluded = value;
    }

    /**
     * 获取automaticBackupSoftwareIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticBackupSoftwareIncluded() {
        return automaticBackupSoftwareIncluded;
    }

    /**
     * 设置automaticBackupSoftwareIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticBackupSoftwareIncluded(Boolean value) {
        this.automaticBackupSoftwareIncluded = value;
    }

    /**
     * 获取averagelatency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAveragelatency() {
        return averagelatency;
    }

    /**
     * 设置averagelatency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAveragelatency(BigInteger value) {
        this.averagelatency = value;
    }

    /**
     * 获取averageseektime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageseektime() {
        return averageseektime;
    }

    /**
     * 设置averageseektime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageseektime(BigInteger value) {
        this.averageseektime = value;
    }

    /**
     * 获取averagewritetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAveragewritetime() {
        return averagewritetime;
    }

    /**
     * 设置averagewritetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAveragewritetime(BigInteger value) {
        this.averagewritetime = value;
    }

    /**
     * 获取bufferSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public MemorySizeIntegerDimension getBufferSize() {
        return bufferSize;
    }

    /**
     * 设置bufferSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public void setBufferSize(MemorySizeIntegerDimension value) {
        this.bufferSize = value;
    }

    /**
     * Gets the value of the cableInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cableInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCableInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCableInterface() {
        if (cableInterface == null) {
            cableInterface = new ArrayList<String>();
        }
        return this.cableInterface;
    }

    /**
     * 获取cacheSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public MemorySizeIntegerDimension getCacheSize() {
        return cacheSize;
    }

    /**
     * 设置cacheSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public void setCacheSize(MemorySizeIntegerDimension value) {
        this.cacheSize = value;
    }

    /**
     * 获取dataTransferRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataTransferRate() {
        return dataTransferRate;
    }

    /**
     * 设置dataTransferRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataTransferRate(BigInteger value) {
        this.dataTransferRate = value;
    }

    /**
     * 获取dockingStationExternalInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DockingStationExternalInterfaceTypeValues }
     *     
     */
    public DockingStationExternalInterfaceTypeValues getDockingStationExternalInterface() {
        return dockingStationExternalInterface;
    }

    /**
     * 设置dockingStationExternalInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DockingStationExternalInterfaceTypeValues }
     *     
     */
    public void setDockingStationExternalInterface(DockingStationExternalInterfaceTypeValues value) {
        this.dockingStationExternalInterface = value;
    }

    /**
     * 获取driveMemoryStorageCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public MemorySizeIntegerDimension getDriveMemoryStorageCapacity() {
        return driveMemoryStorageCapacity;
    }

    /**
     * 设置driveMemoryStorageCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public void setDriveMemoryStorageCapacity(MemorySizeIntegerDimension value) {
        this.driveMemoryStorageCapacity = value;
    }

    /**
     * 获取driveRPM属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDriveRPM() {
        return driveRPM;
    }

    /**
     * 设置driveRPM属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDriveRPM(BigInteger value) {
        this.driveRPM = value;
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
     * 获取includedHarddrivedescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedHarddrivedescription() {
        return includedHarddrivedescription;
    }

    /**
     * 设置includedHarddrivedescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedHarddrivedescription(String value) {
        this.includedHarddrivedescription = value;
    }

    /**
     * 获取interfaceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InterfaceTypeValues }
     *     
     */
    public InterfaceTypeValues getInterfaceType() {
        return interfaceType;
    }

    /**
     * 设置interfaceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceTypeValues }
     *     
     */
    public void setInterfaceType(InterfaceTypeValues value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the internalConnector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalConnector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalConnector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalConnectorTypeValues }
     * 
     * 
     */
    public List<InternalConnectorTypeValues> getInternalConnector() {
        if (internalConnector == null) {
            internalConnector = new ArrayList<InternalConnectorTypeValues>();
        }
        return this.internalConnector;
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
     * Gets the value of the nasNetworkInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nasNetworkInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNASNetworkInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTransferSpeedIntegerDimension }
     * 
     * 
     */
    public List<DataTransferSpeedIntegerDimension> getNASNetworkInterface() {
        if (nasNetworkInterface == null) {
            nasNetworkInterface = new ArrayList<DataTransferSpeedIntegerDimension>();
        }
        return this.nasNetworkInterface;
    }

    /**
     * 获取numberOfexternalBays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfexternalBays() {
        return numberOfexternalBays;
    }

    /**
     * 设置numberOfexternalBays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfexternalBays(BigInteger value) {
        this.numberOfexternalBays = value;
    }

    /**
     * 获取numberOfHardDrives属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHardDrives() {
        return numberOfHardDrives;
    }

    /**
     * 设置numberOfHardDrives属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHardDrives(BigInteger value) {
        this.numberOfHardDrives = value;
    }

    /**
     * 获取numberOfInternalBays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInternalBays() {
        return numberOfInternalBays;
    }

    /**
     * 设置numberOfInternalBays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInternalBays(BigInteger value) {
        this.numberOfInternalBays = value;
    }

    /**
     * 获取opticalDriveType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalDriveType() {
        return opticalDriveType;
    }

    /**
     * 设置opticalDriveType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalDriveType(String value) {
        this.opticalDriveType = value;
    }

    /**
     * Gets the value of the physicalHardDriveFormFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalHardDriveFormFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalHardDriveFormFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getPhysicalHardDriveFormFactor() {
        if (physicalHardDriveFormFactor == null) {
            physicalHardDriveFormFactor = new ArrayList<BigDecimal>();
        }
        return this.physicalHardDriveFormFactor;
    }

    /**
     * 获取platformCompatability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformCompatability() {
        return platformCompatability;
    }

    /**
     * 设置platformCompatability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformCompatability(String value) {
        this.platformCompatability = value;
    }

    /**
     * 获取raid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAID() {
        return raid;
    }

    /**
     * 设置raid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAID(String value) {
        this.raid = value;
    }

    /**
     * 获取ssdConnectorPins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSSDConnectorPins() {
        return ssdConnectorPins;
    }

    /**
     * 设置ssdConnectorPins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSSDConnectorPins(BigInteger value) {
        this.ssdConnectorPins = value;
    }

    /**
     * 获取ssdDriveArchitechture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSDDriveArchitechture() {
        return ssdDriveArchitechture;
    }

    /**
     * 设置ssdDriveArchitechture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSDDriveArchitechture(String value) {
        this.ssdDriveArchitechture = value;
    }

    /**
     * 获取storageMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageMaterialType() {
        return storageMaterialType;
    }

    /**
     * 设置storageMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageMaterialType(String value) {
        this.storageMaterialType = value;
    }

    /**
     * 获取storageReadSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageReadSpeed() {
        return storageReadSpeed;
    }

    /**
     * 设置storageReadSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageReadSpeed(String value) {
        this.storageReadSpeed = value;
    }

    /**
     * 获取storageWriteSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageWriteSpeed() {
        return storageWriteSpeed;
    }

    /**
     * 设置storageWriteSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageWriteSpeed(String value) {
        this.storageWriteSpeed = value;
    }

    /**
     * 获取totalFirewire1600Connectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFirewire1600Connectors() {
        return totalFirewire1600Connectors;
    }

    /**
     * 设置totalFirewire1600Connectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFirewire1600Connectors(BigInteger value) {
        this.totalFirewire1600Connectors = value;
    }

    /**
     * 获取totalFirewire3200Connectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFirewire3200Connectors() {
        return totalFirewire3200Connectors;
    }

    /**
     * 设置totalFirewire3200Connectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFirewire3200Connectors(BigInteger value) {
        this.totalFirewire3200Connectors = value;
    }

    /**
     * 获取totalFirewire400Connectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFirewire400Connectors() {
        return totalFirewire400Connectors;
    }

    /**
     * 设置totalFirewire400Connectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFirewire400Connectors(BigInteger value) {
        this.totalFirewire400Connectors = value;
    }

    /**
     * 获取totalFirewire800Connectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFirewire800Connectors() {
        return totalFirewire800Connectors;
    }

    /**
     * 设置totalFirewire800Connectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFirewire800Connectors(BigInteger value) {
        this.totalFirewire800Connectors = value;
    }

    /**
     * 获取totalSataConnectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSataConnectors() {
        return totalSataConnectors;
    }

    /**
     * 设置totalSataConnectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSataConnectors(BigInteger value) {
        this.totalSataConnectors = value;
    }

    /**
     * 获取totalUSB10Connectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUSB10Connectors() {
        return totalUSB10Connectors;
    }

    /**
     * 设置totalUSB10Connectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUSB10Connectors(BigInteger value) {
        this.totalUSB10Connectors = value;
    }

    /**
     * 获取totalUSB11Connectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUSB11Connectors() {
        return totalUSB11Connectors;
    }

    /**
     * 设置totalUSB11Connectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUSB11Connectors(BigInteger value) {
        this.totalUSB11Connectors = value;
    }

    /**
     * 获取totalUSB20Connectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUSB20Connectors() {
        return totalUSB20Connectors;
    }

    /**
     * 设置totalUSB20Connectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUSB20Connectors(BigInteger value) {
        this.totalUSB20Connectors = value;
    }

    /**
     * 获取totalUSB30Connectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUSB30Connectors() {
        return totalUSB30Connectors;
    }

    /**
     * 设置totalUSB30Connectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUSB30Connectors(BigInteger value) {
        this.totalUSB30Connectors = value;
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
