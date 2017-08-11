
package com.elcuk.jaxb;

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
 *         &lt;element name="HardDriveSize" type="{}MemorySizeDimension" maxOccurs="8"/>
 *         &lt;element name="HardDriveInterface" type="{}HardDriveInterfaceTypeValues" maxOccurs="4"/>
 *         &lt;element name="ComputerMemoryType" type="{}GraphicsRAMTypeValues" maxOccurs="10"/>
 *         &lt;element name="RAMSize" type="{}MemorySizeDimension"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorBrand" type="{}FortyStringNotNull"/>
 *         &lt;element name="ProcessorSpeed" type="{}FrequencyDimension"/>
 *         &lt;element name="ProcessorType" type="{}ProcessorTypeValues"/>
 *         &lt;element name="ProcessorCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="OperatingSystem" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="HardwarePlatform" type="{}MediumStringNotNull"/>
 *         &lt;element name="WirelessType" type="{}WirelessTypeValues" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="AdditionalDrives" type="{}FortyStringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SoftwareIncluded" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MemorySlotsAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScreenResolution" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="U-RackSize" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}GraphicsCard" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="AdditionalFeatures" type="{}LongStringNotNull" minOccurs="0"/>
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
    "hardDriveSize",
    "hardDriveInterface",
    "computerMemoryType",
    "ramSize",
    "powerSource",
    "processorBrand",
    "processorSpeed",
    "processorType",
    "processorCount",
    "operatingSystem",
    "hardwarePlatform",
    "wirelessType",
    "additionalDrives",
    "softwareIncluded",
    "memorySlotsAvailable",
    "screenResolution",
    "screenSize",
    "uRackSize",
    "graphicsCard",
    "additionalFeatures"
})
@XmlRootElement(name = "PC")
public class PC {

    @XmlElement(name = "HardDriveSize", required = true)
    protected List<MemorySizeDimension> hardDriveSize;
    @XmlElement(name = "HardDriveInterface", required = true)
    @XmlSchemaType(name = "string")
    protected List<HardDriveInterfaceTypeValues> hardDriveInterface;
    @XmlElement(name = "ComputerMemoryType", required = true)
    protected List<String> computerMemoryType;
    @XmlElement(name = "RAMSize", required = true)
    protected MemorySizeDimension ramSize;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "ProcessorBrand", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorBrand;
    @XmlElement(name = "ProcessorSpeed", required = true)
    protected FrequencyDimension processorSpeed;
    @XmlElement(name = "ProcessorType", required = true)
    protected String processorType;
    @XmlElement(name = "ProcessorCount", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger processorCount;
    @XmlElement(name = "OperatingSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "HardwarePlatform", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hardwarePlatform;
    @XmlElement(name = "WirelessType")
    protected List<String> wirelessType;
    @XmlElement(name = "AdditionalDrives")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> additionalDrives;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "ScreenResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenResolution;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "U-RackSize")
    protected Integer uRackSize;
    @XmlElement(name = "GraphicsCard")
    protected List<GraphicsCard> graphicsCard;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;

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
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalDrives() {
        if (additionalDrives == null) {
            additionalDrives = new ArrayList<String>();
        }
        return this.additionalDrives;
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
     * 获取uRackSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getURackSize() {
        return uRackSize;
    }

    /**
     * 设置uRackSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setURackSize(Integer value) {
        this.uRackSize = value;
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
     * {@link GraphicsCard }
     * 
     * 
     */
    public List<GraphicsCard> getGraphicsCard() {
        if (graphicsCard == null) {
            graphicsCard = new ArrayList<GraphicsCard>();
        }
        return this.graphicsCard;
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

}
