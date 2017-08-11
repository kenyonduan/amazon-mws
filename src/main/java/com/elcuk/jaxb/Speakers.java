
package com.elcuk.jaxb;

import java.math.BigInteger;
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
 *         &lt;element ref="{}BiAmpable" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfDrivers" minOccurs="0"/>
 *         &lt;element ref="{}EnclosureFinish" minOccurs="0"/>
 *         &lt;element ref="{}IncludedFeatures" minOccurs="0"/>
 *         &lt;element ref="{}Shape" minOccurs="0"/>
 *         &lt;element ref="{}MidRangeSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}MidRangeSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSpeakers" minOccurs="0"/>
 *         &lt;element ref="{}GrilleRemoveability" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerGrilleMaterial" minOccurs="0"/>
 *         &lt;element ref="{}MaximumWattage" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferWattage" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferPowerTechnology" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerTechnology" minOccurs="0"/>
 *         &lt;element ref="{}WooferSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}WooferSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}Efficiency" minOccurs="0"/>
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
    "biAmpable",
    "numberOfDrivers",
    "enclosureFinish",
    "includedFeatures",
    "shape",
    "midRangeSpeakerMaterial",
    "midRangeSpeakerDiameter",
    "numberOfSpeakers",
    "grilleRemoveability",
    "speakerGrilleMaterial",
    "maximumWattage",
    "subwooferWattage",
    "subwooferSpeakerMaterial",
    "subwooferSpeakerDiameter",
    "subwooferPowerTechnology",
    "tweeterSpeakerMaterial",
    "tweeterSpeakerDiameter",
    "tweeterSpeakerTechnology",
    "wooferSpeakerMaterial",
    "wooferSpeakerDiameter",
    "efficiency"
})
@XmlRootElement(name = "Speakers")
public class Speakers {

    @XmlElement(name = "ConnectorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String connectorType;
    @XmlElement(name = "BiAmpable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String biAmpable;
    @XmlElement(name = "NumberOfDrivers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDrivers;
    @XmlElement(name = "EnclosureFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String enclosureFinish;
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
    @XmlElement(name = "WooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wooferSpeakerMaterial;
    @XmlElement(name = "WooferSpeakerDiameter")
    protected LengthDimension wooferSpeakerDiameter;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

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
