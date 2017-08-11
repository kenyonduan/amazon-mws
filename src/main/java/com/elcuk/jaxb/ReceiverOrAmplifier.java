
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
 *         &lt;element ref="{}BiAmpable" minOccurs="0"/>
 *         &lt;element ref="{}CalibrationTechnology" minOccurs="0"/>
 *         &lt;element name="CoolingType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfFans" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}FrontPanelInputs" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfDrivers" minOccurs="0"/>
 *         &lt;element name="ProcessorBrand" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}SignalPassthroughTechnology" minOccurs="0"/>
 *         &lt;element ref="{}VideoShielded" minOccurs="0"/>
 *         &lt;element ref="{}VideoUpconversionTechnologies" minOccurs="0"/>
 *         &lt;element ref="{}TotalCoaxialInputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalEthernetPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalPreampOutputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalSubwooferOutputs" minOccurs="0"/>
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
    "biAmpable",
    "calibrationTechnology",
    "coolingType",
    "numberOfFans",
    "finishType",
    "frontPanelInputs",
    "numberOfDrivers",
    "processorBrand",
    "signalPassthroughTechnology",
    "videoShielded",
    "videoUpconversionTechnologies",
    "totalCoaxialInputs",
    "totalEthernetPorts",
    "totalPreampOutputs",
    "totalSubwooferOutputs",
    "wirelessTechnology",
    "wirelessType"
})
@XmlRootElement(name = "ReceiverOrAmplifier")
public class ReceiverOrAmplifier {

    @XmlElement(name = "BiAmpable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String biAmpable;
    @XmlElement(name = "CalibrationTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String calibrationTechnology;
    @XmlElement(name = "CoolingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coolingType;
    @XmlElement(name = "NumberOfFans")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfFans;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "FrontPanelInputs")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> frontPanelInputs;
    @XmlElement(name = "NumberOfDrivers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDrivers;
    @XmlElement(name = "ProcessorBrand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorBrand;
    @XmlElement(name = "SignalPassthroughTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String signalPassthroughTechnology;
    @XmlElement(name = "VideoShielded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoShielded;
    @XmlElement(name = "VideoUpconversionTechnologies")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoUpconversionTechnologies;
    @XmlElement(name = "TotalCoaxialInputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCoaxialInputs;
    @XmlElement(name = "TotalEthernetPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalEthernetPorts;
    @XmlElement(name = "TotalPreampOutputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalPreampOutputs;
    @XmlElement(name = "TotalSubwooferOutputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSubwooferOutputs;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;
    @XmlElement(name = "WirelessType")
    protected String wirelessType;

    /**
     * 获取biAmpable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiAmpable() {
        return biAmpable;
    }

    /**
     * 设置biAmpable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiAmpable(String value) {
        this.biAmpable = value;
    }

    /**
     * 获取calibrationTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibrationTechnology() {
        return calibrationTechnology;
    }

    /**
     * 设置calibrationTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibrationTechnology(String value) {
        this.calibrationTechnology = value;
    }

    /**
     * 获取coolingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoolingType() {
        return coolingType;
    }

    /**
     * 设置coolingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoolingType(String value) {
        this.coolingType = value;
    }

    /**
     * 获取numberOfFans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFans() {
        return numberOfFans;
    }

    /**
     * 设置numberOfFans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFans(BigInteger value) {
        this.numberOfFans = value;
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
     * Gets the value of the frontPanelInputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frontPanelInputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrontPanelInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFrontPanelInputs() {
        if (frontPanelInputs == null) {
            frontPanelInputs = new ArrayList<String>();
        }
        return this.frontPanelInputs;
    }

    /**
     * 获取numberOfDrivers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDrivers() {
        return numberOfDrivers;
    }

    /**
     * 设置numberOfDrivers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDrivers(BigInteger value) {
        this.numberOfDrivers = value;
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
     * 获取signalPassthroughTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalPassthroughTechnology() {
        return signalPassthroughTechnology;
    }

    /**
     * 设置signalPassthroughTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalPassthroughTechnology(String value) {
        this.signalPassthroughTechnology = value;
    }

    /**
     * 获取videoShielded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoShielded() {
        return videoShielded;
    }

    /**
     * 设置videoShielded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoShielded(String value) {
        this.videoShielded = value;
    }

    /**
     * 获取videoUpconversionTechnologies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoUpconversionTechnologies() {
        return videoUpconversionTechnologies;
    }

    /**
     * 设置videoUpconversionTechnologies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoUpconversionTechnologies(String value) {
        this.videoUpconversionTechnologies = value;
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
     * 获取totalPreampOutputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPreampOutputs() {
        return totalPreampOutputs;
    }

    /**
     * 设置totalPreampOutputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPreampOutputs(BigInteger value) {
        this.totalPreampOutputs = value;
    }

    /**
     * 获取totalSubwooferOutputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSubwooferOutputs() {
        return totalSubwooferOutputs;
    }

    /**
     * 设置totalSubwooferOutputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSubwooferOutputs(BigInteger value) {
        this.totalSubwooferOutputs = value;
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
