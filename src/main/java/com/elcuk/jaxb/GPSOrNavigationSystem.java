
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
 *         &lt;element ref="{}BatteryCellType" minOccurs="0"/>
 *         &lt;element name="BatteryChargeCycles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}BatteryPower" minOccurs="0"/>
 *         &lt;element ref="{}BoxContents" minOccurs="0"/>
 *         &lt;element name="CableLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ColorScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}DurationOfMapService" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideoProcessor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}Efficiency" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}InternetApplications" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MemorySlotsAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}PowerPlugType" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorBrand" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="RemoteControlDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemovableMemory" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScreenResolution" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}SubscriptionTermName" minOccurs="0"/>
 *         &lt;element ref="{}TrafficFeatures" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SoftwareIncluded" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}TotalEthernetPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalFirewirePorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalHdmiPorts" minOccurs="0"/>
 *         &lt;element name="TotalSVideoOutPorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalUSBPorts" minOccurs="0"/>
 *         &lt;element ref="{}WaypointsType" minOccurs="0"/>
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
    "batteryCellType",
    "batteryChargeCycles",
    "batteryPower",
    "boxContents",
    "cableLength",
    "colorScreen",
    "durationOfMapService",
    "operatingSystem",
    "videoProcessor",
    "efficiency",
    "finishType",
    "internetApplications",
    "memorySlotsAvailable",
    "powerPlugType",
    "powerSource",
    "processorBrand",
    "screenSize",
    "remoteControlDescription",
    "removableMemory",
    "screenResolution",
    "subscriptionTermName",
    "trafficFeatures",
    "softwareIncluded",
    "totalEthernetPorts",
    "totalFirewirePorts",
    "totalHdmiPorts",
    "totalSVideoOutPorts",
    "totalUSBPorts",
    "waypointsType",
    "wirelessTechnology"
})
@XmlRootElement(name = "GPSOrNavigationSystem")
public class GPSOrNavigationSystem {

    @XmlElement(name = "BatteryCellType")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellType;
    @XmlElement(name = "BatteryChargeCycles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryChargeCycles;
    @XmlElement(name = "BatteryPower")
    protected BatteryPowerIntegerDimension batteryPower;
    @XmlElement(name = "BoxContents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String boxContents;
    @XmlElement(name = "CableLength")
    protected LengthDimension cableLength;
    @XmlElement(name = "ColorScreen")
    protected Boolean colorScreen;
    @XmlElement(name = "DurationOfMapService")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String durationOfMapService;
    @XmlElement(name = "OperatingSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "VideoProcessor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoProcessor;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "InternetApplications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> internetApplications;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "PowerPlugType")
    @XmlSchemaType(name = "normalizedString")
    protected PowerPlugType powerPlugType;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "ProcessorBrand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorBrand;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "RemoteControlDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteControlDescription;
    @XmlElement(name = "RemovableMemory")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String removableMemory;
    @XmlElement(name = "ScreenResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenResolution;
    @XmlElement(name = "SubscriptionTermName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subscriptionTermName;
    @XmlElement(name = "TrafficFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> trafficFeatures;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "TotalEthernetPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalEthernetPorts;
    @XmlElement(name = "TotalFirewirePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFirewirePorts;
    @XmlElement(name = "TotalHdmiPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalHdmiPorts;
    @XmlElement(name = "TotalSVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoOutPorts;
    @XmlElement(name = "TotalUSBPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUSBPorts;
    @XmlElement(name = "WaypointsType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String waypointsType;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;

    /**
     * 获取batteryCellType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public BatteryCellTypeValues getBatteryCellType() {
        return batteryCellType;
    }

    /**
     * 设置batteryCellType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public void setBatteryCellType(BatteryCellTypeValues value) {
        this.batteryCellType = value;
    }

    /**
     * 获取batteryChargeCycles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryChargeCycles() {
        return batteryChargeCycles;
    }

    /**
     * 设置batteryChargeCycles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryChargeCycles(BigInteger value) {
        this.batteryChargeCycles = value;
    }

    /**
     * 获取batteryPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public BatteryPowerIntegerDimension getBatteryPower() {
        return batteryPower;
    }

    /**
     * 设置batteryPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public void setBatteryPower(BatteryPowerIntegerDimension value) {
        this.batteryPower = value;
    }

    /**
     * 获取boxContents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxContents() {
        return boxContents;
    }

    /**
     * 设置boxContents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxContents(String value) {
        this.boxContents = value;
    }

    /**
     * 获取cableLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCableLength() {
        return cableLength;
    }

    /**
     * 设置cableLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCableLength(LengthDimension value) {
        this.cableLength = value;
    }

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
     * 获取durationOfMapService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationOfMapService() {
        return durationOfMapService;
    }

    /**
     * 设置durationOfMapService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationOfMapService(String value) {
        this.durationOfMapService = value;
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
     * 获取videoProcessor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoProcessor() {
        return videoProcessor;
    }

    /**
     * 设置videoProcessor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoProcessor(String value) {
        this.videoProcessor = value;
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
     * 获取finishType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishType() {
        return finishType;
    }

    /**
     * 设置finishType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishType(String value) {
        this.finishType = value;
    }

    /**
     * Gets the value of the internetApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternetApplications() {
        if (internetApplications == null) {
            internetApplications = new ArrayList<String>();
        }
        return this.internetApplications;
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
     * 获取powerPlugType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerPlugType }
     *     
     */
    public PowerPlugType getPowerPlugType() {
        return powerPlugType;
    }

    /**
     * 设置powerPlugType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerPlugType }
     *     
     */
    public void setPowerPlugType(PowerPlugType value) {
        this.powerPlugType = value;
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
     * 获取remoteControlDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteControlDescription() {
        return remoteControlDescription;
    }

    /**
     * 设置remoteControlDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteControlDescription(String value) {
        this.remoteControlDescription = value;
    }

    /**
     * 获取removableMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovableMemory() {
        return removableMemory;
    }

    /**
     * 设置removableMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovableMemory(String value) {
        this.removableMemory = value;
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
     * 获取subscriptionTermName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionTermName() {
        return subscriptionTermName;
    }

    /**
     * 设置subscriptionTermName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionTermName(String value) {
        this.subscriptionTermName = value;
    }

    /**
     * Gets the value of the trafficFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrafficFeatures() {
        if (trafficFeatures == null) {
            trafficFeatures = new ArrayList<String>();
        }
        return this.trafficFeatures;
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
     * 获取totalEthernetPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEthernetPorts() {
        return totalEthernetPorts;
    }

    /**
     * 设置totalEthernetPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEthernetPorts(BigInteger value) {
        this.totalEthernetPorts = value;
    }

    /**
     * 获取totalFirewirePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFirewirePorts() {
        return totalFirewirePorts;
    }

    /**
     * 设置totalFirewirePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFirewirePorts(BigInteger value) {
        this.totalFirewirePorts = value;
    }

    /**
     * 获取totalHdmiPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalHdmiPorts() {
        return totalHdmiPorts;
    }

    /**
     * 设置totalHdmiPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalHdmiPorts(BigInteger value) {
        this.totalHdmiPorts = value;
    }

    /**
     * 获取totalSVideoOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSVideoOutPorts() {
        return totalSVideoOutPorts;
    }

    /**
     * 设置totalSVideoOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSVideoOutPorts(BigInteger value) {
        this.totalSVideoOutPorts = value;
    }

    /**
     * 获取totalUSBPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUSBPorts() {
        return totalUSBPorts;
    }

    /**
     * 设置totalUSBPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUSBPorts(BigInteger value) {
        this.totalUSBPorts = value;
    }

    /**
     * 获取waypointsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaypointsType() {
        return waypointsType;
    }

    /**
     * 设置waypointsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaypointsType(String value) {
        this.waypointsType = value;
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
