
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
 *         &lt;element ref="{}BuiltinSpeaker" minOccurs="0"/>
 *         &lt;element ref="{}ContrastRatio" minOccurs="0"/>
 *         &lt;element ref="{}DisplayResolutionMaximum" minOccurs="0"/>
 *         &lt;element name="DisplayTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}HasColorScreen" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element name="MonitorTunerTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}MonitorBrightness" minOccurs="0"/>
 *         &lt;element ref="{}MonitorConnectors" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}ResponseTime" minOccurs="0"/>
 *         &lt;element ref="{}ScreenResolution" minOccurs="0"/>
 *         &lt;element ref="{}ScreenSize" minOccurs="0"/>
 *         &lt;element ref="{}TunerTechnology" minOccurs="0"/>
 *         &lt;element ref="{}ViewingAngle" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
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
    "builtinSpeaker",
    "contrastRatio",
    "displayResolutionMaximum",
    "displayTechnology",
    "hasColorScreen",
    "modelNumber",
    "monitorTunerTechnology",
    "monitorBrightness",
    "monitorConnectors",
    "responseTime",
    "screenResolution",
    "screenSize",
    "tunerTechnology",
    "viewingAngle",
    "voltage",
    "wattage",
    "efficiency"
})
@XmlRootElement(name = "Monitor")
public class Monitor {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "BuiltinSpeaker")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger builtinSpeaker;
    @XmlElement(name = "ContrastRatio")
    protected String contrastRatio;
    @XmlElement(name = "DisplayResolutionMaximum")
    protected String displayResolutionMaximum;
    @XmlElement(name = "DisplayTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayTechnology;
    @XmlElement(name = "HasColorScreen")
    protected Boolean hasColorScreen;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "MonitorTunerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String monitorTunerTechnology;
    @XmlElement(name = "MonitorBrightness")
    protected LuminanceFiveDigitDimension monitorBrightness;
    @XmlElement(name = "MonitorConnectors")
    @XmlSchemaType(name = "string")
    protected List<MonitorConnectorsTypeValues> monitorConnectors;
    @XmlElement(name = "ResponseTime")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger responseTime;
    @XmlElement(name = "ScreenResolution")
    protected String screenResolution;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "TunerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tunerTechnology;
    @XmlElement(name = "ViewingAngle")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger viewingAngle;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
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
     * 获取builtinSpeaker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuiltinSpeaker() {
        return builtinSpeaker;
    }

    /**
     * 设置builtinSpeaker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuiltinSpeaker(BigInteger value) {
        this.builtinSpeaker = value;
    }

    /**
     * 获取contrastRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrastRatio() {
        return contrastRatio;
    }

    /**
     * 设置contrastRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrastRatio(String value) {
        this.contrastRatio = value;
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
     * 获取monitorBrightness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LuminanceFiveDigitDimension }
     *     
     */
    public LuminanceFiveDigitDimension getMonitorBrightness() {
        return monitorBrightness;
    }

    /**
     * 设置monitorBrightness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LuminanceFiveDigitDimension }
     *     
     */
    public void setMonitorBrightness(LuminanceFiveDigitDimension value) {
        this.monitorBrightness = value;
    }

    /**
     * Gets the value of the monitorConnectors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitorConnectors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitorConnectors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitorConnectorsTypeValues }
     * 
     * 
     */
    public List<MonitorConnectorsTypeValues> getMonitorConnectors() {
        if (monitorConnectors == null) {
            monitorConnectors = new ArrayList<MonitorConnectorsTypeValues>();
        }
        return this.monitorConnectors;
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
