
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
 *         &lt;element name="ConnectorType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ControllerType" minOccurs="0"/>
 *         &lt;element ref="{}EnclosureFinish" minOccurs="0"/>
 *         &lt;element ref="{}FrontPanelInputs" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}BuiltInMedia" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}IncludedFeatures" minOccurs="0"/>
 *         &lt;element ref="{}Shape" minOccurs="0"/>
 *         &lt;element ref="{}MidRangeSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}MidRangeSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}VideoUpconversionTechnologies" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfDrivers" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSpeakers" minOccurs="0"/>
 *         &lt;element ref="{}GrilleRemoveability" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerGrilleMaterial" minOccurs="0"/>
 *         &lt;element ref="{}MaximumWattage" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferWattage" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferPowerTechnology" minOccurs="0"/>
 *         &lt;element ref="{}InternetApplications" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerTechnology" minOccurs="0"/>
 *         &lt;element name="WirelessType" type="{}WirelessTypeValues" minOccurs="0"/>
 *         &lt;element ref="{}WooferSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}WooferSpeakerDiameter" minOccurs="0"/>
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
    "connectorType",
    "controllerType",
    "enclosureFinish",
    "frontPanelInputs",
    "builtInMedia",
    "includedFeatures",
    "shape",
    "midRangeSpeakerMaterial",
    "midRangeSpeakerDiameter",
    "videoUpconversionTechnologies",
    "numberOfDrivers",
    "numberOfSpeakers",
    "grilleRemoveability",
    "speakerGrilleMaterial",
    "maximumWattage",
    "subwooferWattage",
    "subwooferSpeakerMaterial",
    "subwooferSpeakerDiameter",
    "subwooferPowerTechnology",
    "internetApplications",
    "tweeterSpeakerMaterial",
    "tweeterSpeakerDiameter",
    "tweeterSpeakerTechnology",
    "wirelessType",
    "wooferSpeakerMaterial",
    "wooferSpeakerDiameter"
})
@XmlRootElement(name = "HomeTheaterSystemOrHTIB")
public class HomeTheaterSystemOrHTIB {

    @XmlElement(name = "ConnectorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String connectorType;
    @XmlElement(name = "ControllerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String controllerType;
    @XmlElement(name = "EnclosureFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String enclosureFinish;
    @XmlElement(name = "FrontPanelInputs")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> frontPanelInputs;
    @XmlElement(name = "BuiltInMedia")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> builtInMedia;
    @XmlElement(name = "IncludedFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String includedFeatures;
    @XmlElement(name = "Shape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shape;
    @XmlElement(name = "MidRangeSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String midRangeSpeakerMaterial;
    @XmlElement(name = "MidRangeSpeakerDiameter")
    protected LengthDimension midRangeSpeakerDiameter;
    @XmlElement(name = "VideoUpconversionTechnologies")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoUpconversionTechnologies;
    @XmlElement(name = "NumberOfDrivers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDrivers;
    @XmlElement(name = "NumberOfSpeakers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSpeakers;
    @XmlElement(name = "GrilleRemoveability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String grilleRemoveability;
    @XmlElement(name = "SpeakerGrilleMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerGrilleMaterial;
    @XmlElement(name = "MaximumWattage")
    protected WattageDimension maximumWattage;
    @XmlElement(name = "SubwooferWattage")
    protected WattageDimension subwooferWattage;
    @XmlElement(name = "SubwooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subwooferSpeakerMaterial;
    @XmlElement(name = "SubwooferSpeakerDiameter")
    protected LengthDimension subwooferSpeakerDiameter;
    @XmlElement(name = "SubwooferPowerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subwooferPowerTechnology;
    @XmlElement(name = "InternetApplications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> internetApplications;
    @XmlElement(name = "TweeterSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tweeterSpeakerMaterial;
    @XmlElement(name = "TweeterSpeakerDiameter")
    protected LengthDimension tweeterSpeakerDiameter;
    @XmlElement(name = "TweeterSpeakerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tweeterSpeakerTechnology;
    @XmlElement(name = "WirelessType")
    protected String wirelessType;
    @XmlElement(name = "WooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wooferSpeakerMaterial;
    @XmlElement(name = "WooferSpeakerDiameter")
    protected LengthDimension wooferSpeakerDiameter;

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
     * 获取controllerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerType() {
        return controllerType;
    }

    /**
     * 设置controllerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerType(String value) {
        this.controllerType = value;
    }

    /**
     * 获取enclosureFinish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosureFinish() {
        return enclosureFinish;
    }

    /**
     * 设置enclosureFinish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosureFinish(String value) {
        this.enclosureFinish = value;
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
     * 获取includedFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedFeatures() {
        return includedFeatures;
    }

    /**
     * 设置includedFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedFeatures(String value) {
        this.includedFeatures = value;
    }

    /**
     * 获取shape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * 设置shape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * 获取midRangeSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidRangeSpeakerMaterial() {
        return midRangeSpeakerMaterial;
    }

    /**
     * 设置midRangeSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidRangeSpeakerMaterial(String value) {
        this.midRangeSpeakerMaterial = value;
    }

    /**
     * 获取midRangeSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMidRangeSpeakerDiameter() {
        return midRangeSpeakerDiameter;
    }

    /**
     * 设置midRangeSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMidRangeSpeakerDiameter(LengthDimension value) {
        this.midRangeSpeakerDiameter = value;
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
     * 获取grilleRemoveability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrilleRemoveability() {
        return grilleRemoveability;
    }

    /**
     * 设置grilleRemoveability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrilleRemoveability(String value) {
        this.grilleRemoveability = value;
    }

    /**
     * 获取speakerGrilleMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerGrilleMaterial() {
        return speakerGrilleMaterial;
    }

    /**
     * 设置speakerGrilleMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerGrilleMaterial(String value) {
        this.speakerGrilleMaterial = value;
    }

    /**
     * 获取maximumWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getMaximumWattage() {
        return maximumWattage;
    }

    /**
     * 设置maximumWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setMaximumWattage(WattageDimension value) {
        this.maximumWattage = value;
    }

    /**
     * 获取subwooferWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getSubwooferWattage() {
        return subwooferWattage;
    }

    /**
     * 设置subwooferWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setSubwooferWattage(WattageDimension value) {
        this.subwooferWattage = value;
    }

    /**
     * 获取subwooferSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubwooferSpeakerMaterial() {
        return subwooferSpeakerMaterial;
    }

    /**
     * 设置subwooferSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubwooferSpeakerMaterial(String value) {
        this.subwooferSpeakerMaterial = value;
    }

    /**
     * 获取subwooferSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSubwooferSpeakerDiameter() {
        return subwooferSpeakerDiameter;
    }

    /**
     * 设置subwooferSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSubwooferSpeakerDiameter(LengthDimension value) {
        this.subwooferSpeakerDiameter = value;
    }

    /**
     * 获取subwooferPowerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubwooferPowerTechnology() {
        return subwooferPowerTechnology;
    }

    /**
     * 设置subwooferPowerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubwooferPowerTechnology(String value) {
        this.subwooferPowerTechnology = value;
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
     * 获取tweeterSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTweeterSpeakerMaterial() {
        return tweeterSpeakerMaterial;
    }

    /**
     * 设置tweeterSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTweeterSpeakerMaterial(String value) {
        this.tweeterSpeakerMaterial = value;
    }

    /**
     * 获取tweeterSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTweeterSpeakerDiameter() {
        return tweeterSpeakerDiameter;
    }

    /**
     * 设置tweeterSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTweeterSpeakerDiameter(LengthDimension value) {
        this.tweeterSpeakerDiameter = value;
    }

    /**
     * 获取tweeterSpeakerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTweeterSpeakerTechnology() {
        return tweeterSpeakerTechnology;
    }

    /**
     * 设置tweeterSpeakerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTweeterSpeakerTechnology(String value) {
        this.tweeterSpeakerTechnology = value;
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

    /**
     * 获取wooferSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWooferSpeakerMaterial() {
        return wooferSpeakerMaterial;
    }

    /**
     * 设置wooferSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWooferSpeakerMaterial(String value) {
        this.wooferSpeakerMaterial = value;
    }

    /**
     * 获取wooferSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWooferSpeakerDiameter() {
        return wooferSpeakerDiameter;
    }

    /**
     * 设置wooferSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWooferSpeakerDiameter(LengthDimension value) {
        this.wooferSpeakerDiameter = value;
    }

}
