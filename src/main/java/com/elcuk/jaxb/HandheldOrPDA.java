
package com.elcuk.jaxb;

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
 *         &lt;element name="ColorScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HardDriveSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="MemorySlotsAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorType" type="{}ProcessorTypeValues" minOccurs="0"/>
 *         &lt;element name="ProcessorSpeed" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="RAMSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ScreenResolution" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="SoftwareIncluded" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="WirelessTechnology" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
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
    "colorScreen",
    "hardDriveSize",
    "memorySlotsAvailable",
    "operatingSystem",
    "powerSource",
    "processorType",
    "processorSpeed",
    "ramSize",
    "screenSize",
    "screenResolution",
    "softwareIncluded",
    "wirelessTechnology"
})
@XmlRootElement(name = "HandheldOrPDA")
public class HandheldOrPDA {

    @XmlElement(name = "ColorScreen")
    protected Boolean colorScreen;
    @XmlElement(name = "HardDriveSize")
    protected MemorySizeDimension hardDriveSize;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "OperatingSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "ProcessorType")
    protected String processorType;
    @XmlElement(name = "ProcessorSpeed")
    protected FrequencyDimension processorSpeed;
    @XmlElement(name = "RAMSize")
    protected MemorySizeDimension ramSize;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "ScreenResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenResolution;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;

    /**
     * 获取colorScreen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColorScreen() {
        return colorScreen;
    }

    /**
     * 设置colorScreen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColorScreen(Boolean value) {
        this.colorScreen = value;
    }

    /**
     * 获取hardDriveSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getHardDriveSize() {
        return hardDriveSize;
    }

    /**
     * 设置hardDriveSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setHardDriveSize(MemorySizeDimension value) {
        this.hardDriveSize = value;
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
     * Gets the value of the wirelessTechnology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessTechnology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessTechnology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWirelessTechnology() {
        if (wirelessTechnology == null) {
            wirelessTechnology = new ArrayList<String>();
        }
        return this.wirelessTechnology;
    }

}
