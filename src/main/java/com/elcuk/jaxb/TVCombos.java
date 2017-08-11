
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
 *         &lt;element name="AudibleNoise" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}ThreeDTechnology" minOccurs="0"/>
 *         &lt;element ref="{}BaseLength" minOccurs="0"/>
 *         &lt;element ref="{}BaseWidth" minOccurs="0"/>
 *         &lt;element ref="{}AnalogRGBInput" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}ScreenDimensions" minOccurs="0"/>
 *         &lt;element name="ScreenResolution" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}BuiltInMedia" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="MaximumHorizontalRefreshRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="MaximumVerticalRefreshRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="MinimumHorizontalRefreshRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="MinimumVerticalRefreshRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element ref="{}MountingPattern" minOccurs="0"/>
 *         &lt;element ref="{}ParentalControlTechnology" minOccurs="0"/>
 *         &lt;element ref="{}Resolution" minOccurs="0"/>
 *         &lt;element ref="{}SVideoInputType" minOccurs="0"/>
 *         &lt;element ref="{}ScreenFinish" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSpeakers" minOccurs="0"/>
 *         &lt;element ref="{}InternetApplications" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}TotalCoaxialInputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalComponentInPorts" minOccurs="0"/>
 *         &lt;element name="TotalCompositePorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalEthernetPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalHdmiPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalSVideoInPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalVgaInPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalVideoOutPorts" minOccurs="0"/>
 *         &lt;element ref="{}UniversalRemoteCode" minOccurs="0"/>
 *         &lt;element name="WirelessTechnology" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="WirelessType" type="{}WirelessTypeValues" minOccurs="0"/>
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
    "audibleNoise",
    "threeDTechnology",
    "baseLength",
    "baseWidth",
    "analogRGBInput",
    "screenDimensions",
    "screenResolution",
    "builtInMedia",
    "maximumHorizontalRefreshRate",
    "maximumVerticalRefreshRate",
    "minimumHorizontalRefreshRate",
    "minimumVerticalRefreshRate",
    "mountingPattern",
    "parentalControlTechnology",
    "resolution",
    "sVideoInputType",
    "screenFinish",
    "screenSize",
    "numberOfSpeakers",
    "internetApplications",
    "totalCoaxialInputs",
    "totalComponentInPorts",
    "totalCompositePorts",
    "totalEthernetPorts",
    "totalHdmiPorts",
    "totalSVideoInPorts",
    "totalVgaInPorts",
    "totalVideoOutPorts",
    "universalRemoteCode",
    "wirelessTechnology",
    "wirelessType"
})
@XmlRootElement(name = "TVCombos")
public class TVCombos {

    @XmlElement(name = "AudibleNoise")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger audibleNoise;
    @XmlElement(name = "ThreeDTechnology")
    @XmlSchemaType(name = "string")
    protected ThreeDTechnologyValues threeDTechnology;
    @XmlElement(name = "BaseLength")
    protected LengthDimension baseLength;
    @XmlElement(name = "BaseWidth")
    protected LengthDimension baseWidth;
    @XmlElement(name = "AnalogRGBInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> analogRGBInput;
    @XmlElement(name = "ScreenDimensions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenDimensions;
    @XmlElement(name = "ScreenResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenResolution;
    @XmlElement(name = "BuiltInMedia")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> builtInMedia;
    @XmlElement(name = "MaximumHorizontalRefreshRate")
    protected FrequencyDimension maximumHorizontalRefreshRate;
    @XmlElement(name = "MaximumVerticalRefreshRate")
    protected FrequencyDimension maximumVerticalRefreshRate;
    @XmlElement(name = "MinimumHorizontalRefreshRate")
    protected FrequencyDimension minimumHorizontalRefreshRate;
    @XmlElement(name = "MinimumVerticalRefreshRate")
    protected FrequencyDimension minimumVerticalRefreshRate;
    @XmlElement(name = "MountingPattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountingPattern;
    @XmlElement(name = "ParentalControlTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String parentalControlTechnology;
    @XmlElement(name = "Resolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String resolution;
    @XmlElement(name = "SVideoInputType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sVideoInputType;
    @XmlElement(name = "ScreenFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenFinish;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "NumberOfSpeakers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSpeakers;
    @XmlElement(name = "InternetApplications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> internetApplications;
    @XmlElement(name = "TotalCoaxialInputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCoaxialInputs;
    @XmlElement(name = "TotalComponentInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalComponentInPorts;
    @XmlElement(name = "TotalCompositePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCompositePorts;
    @XmlElement(name = "TotalEthernetPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalEthernetPorts;
    @XmlElement(name = "TotalHdmiPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalHdmiPorts;
    @XmlElement(name = "TotalSVideoInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoInPorts;
    @XmlElement(name = "TotalVgaInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVgaInPorts;
    @XmlElement(name = "TotalVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVideoOutPorts;
    @XmlElement(name = "UniversalRemoteCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger universalRemoteCode;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;
    @XmlElement(name = "WirelessType")
    protected String wirelessType;

    /**
     * 获取audibleNoise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAudibleNoise() {
        return audibleNoise;
    }

    /**
     * 设置audibleNoise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAudibleNoise(BigInteger value) {
        this.audibleNoise = value;
    }

    /**
     * 获取threeDTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ThreeDTechnologyValues }
     *     
     */
    public ThreeDTechnologyValues getThreeDTechnology() {
        return threeDTechnology;
    }

    /**
     * 设置threeDTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDTechnologyValues }
     *     
     */
    public void setThreeDTechnology(ThreeDTechnologyValues value) {
        this.threeDTechnology = value;
    }

    /**
     * 获取baseLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBaseLength() {
        return baseLength;
    }

    /**
     * 设置baseLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBaseLength(LengthDimension value) {
        this.baseLength = value;
    }

    /**
     * 获取baseWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBaseWidth() {
        return baseWidth;
    }

    /**
     * 设置baseWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBaseWidth(LengthDimension value) {
        this.baseWidth = value;
    }

    /**
     * Gets the value of the analogRGBInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analogRGBInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalogRGBInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnalogRGBInput() {
        if (analogRGBInput == null) {
            analogRGBInput = new ArrayList<String>();
        }
        return this.analogRGBInput;
    }

    /**
     * 获取screenDimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenDimensions() {
        return screenDimensions;
    }

    /**
     * 设置screenDimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenDimensions(String value) {
        this.screenDimensions = value;
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
     * Gets the value of the builtInMedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the builtInMedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuiltInMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBuiltInMedia() {
        if (builtInMedia == null) {
            builtInMedia = new ArrayList<String>();
        }
        return this.builtInMedia;
    }

    /**
     * 获取maximumHorizontalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMaximumHorizontalRefreshRate() {
        return maximumHorizontalRefreshRate;
    }

    /**
     * 设置maximumHorizontalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMaximumHorizontalRefreshRate(FrequencyDimension value) {
        this.maximumHorizontalRefreshRate = value;
    }

    /**
     * 获取maximumVerticalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMaximumVerticalRefreshRate() {
        return maximumVerticalRefreshRate;
    }

    /**
     * 设置maximumVerticalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMaximumVerticalRefreshRate(FrequencyDimension value) {
        this.maximumVerticalRefreshRate = value;
    }

    /**
     * 获取minimumHorizontalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMinimumHorizontalRefreshRate() {
        return minimumHorizontalRefreshRate;
    }

    /**
     * 设置minimumHorizontalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMinimumHorizontalRefreshRate(FrequencyDimension value) {
        this.minimumHorizontalRefreshRate = value;
    }

    /**
     * 获取minimumVerticalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMinimumVerticalRefreshRate() {
        return minimumVerticalRefreshRate;
    }

    /**
     * 设置minimumVerticalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMinimumVerticalRefreshRate(FrequencyDimension value) {
        this.minimumVerticalRefreshRate = value;
    }

    /**
     * 获取mountingPattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountingPattern() {
        return mountingPattern;
    }

    /**
     * 设置mountingPattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountingPattern(String value) {
        this.mountingPattern = value;
    }

    /**
     * 获取parentalControlTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentalControlTechnology() {
        return parentalControlTechnology;
    }

    /**
     * 设置parentalControlTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentalControlTechnology(String value) {
        this.parentalControlTechnology = value;
    }

    /**
     * 获取resolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * 设置resolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * 获取sVideoInputType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVideoInputType() {
        return sVideoInputType;
    }

    /**
     * 设置sVideoInputType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVideoInputType(String value) {
        this.sVideoInputType = value;
    }

    /**
     * 获取screenFinish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenFinish() {
        return screenFinish;
    }

    /**
     * 设置screenFinish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenFinish(String value) {
        this.screenFinish = value;
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
     * 获取numberOfSpeakers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * 设置numberOfSpeakers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpeakers(BigInteger value) {
        this.numberOfSpeakers = value;
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
     * 获取totalCoaxialInputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCoaxialInputs() {
        return totalCoaxialInputs;
    }

    /**
     * 设置totalCoaxialInputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCoaxialInputs(BigInteger value) {
        this.totalCoaxialInputs = value;
    }

    /**
     * 获取totalComponentInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalComponentInPorts() {
        return totalComponentInPorts;
    }

    /**
     * 设置totalComponentInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalComponentInPorts(BigInteger value) {
        this.totalComponentInPorts = value;
    }

    /**
     * 获取totalCompositePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCompositePorts() {
        return totalCompositePorts;
    }

    /**
     * 设置totalCompositePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCompositePorts(BigInteger value) {
        this.totalCompositePorts = value;
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
     * 获取totalSVideoInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSVideoInPorts() {
        return totalSVideoInPorts;
    }

    /**
     * 设置totalSVideoInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSVideoInPorts(BigInteger value) {
        this.totalSVideoInPorts = value;
    }

    /**
     * 获取totalVgaInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVgaInPorts() {
        return totalVgaInPorts;
    }

    /**
     * 设置totalVgaInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVgaInPorts(BigInteger value) {
        this.totalVgaInPorts = value;
    }

    /**
     * 获取totalVideoOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVideoOutPorts() {
        return totalVideoOutPorts;
    }

    /**
     * 设置totalVideoOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVideoOutPorts(BigInteger value) {
        this.totalVideoOutPorts = value;
    }

    /**
     * 获取universalRemoteCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUniversalRemoteCode() {
        return universalRemoteCode;
    }

    /**
     * 设置universalRemoteCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUniversalRemoteCode(BigInteger value) {
        this.universalRemoteCode = value;
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

    /**
     * 获取wirelessType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessType() {
        return wirelessType;
    }

    /**
     * 设置wirelessType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessType(String value) {
        this.wirelessType = value;
    }

}
