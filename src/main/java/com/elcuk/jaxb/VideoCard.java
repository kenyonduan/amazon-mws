
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
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}CoreClock" minOccurs="0"/>
 *         &lt;element ref="{}EffectiveMemoryClock" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsCardCooler" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsCardInterface" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsCardMaxResolution" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsCardMemoryInterface" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsCardMemoryType" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsChipsetBrand" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsCoProcessor" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsRAMSize" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{}GraphicsRAMType" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}MultiGPUTechnology" minOccurs="0"/>
 *         &lt;element ref="{}ShaderClock" minOccurs="0"/>
 *         &lt;element ref="{}ThreeDAPI" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}TotalCompositePorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalDVIPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalHDMIPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalMiniHDMIPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalSVideoOutPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalVGAOutPorts" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
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
    "additionalFeatures",
    "coreClock",
    "effectiveMemoryClock",
    "graphicsCardCooler",
    "graphicsCardInterface",
    "graphicsCardMaxResolution",
    "graphicsCardMemoryInterface",
    "graphicsCardMemoryType",
    "graphicsChipsetBrand",
    "graphicsCoProcessor",
    "graphicsRAMSize",
    "graphicsRAMType",
    "modelNumber",
    "multiGPUTechnology",
    "shaderClock",
    "threeDAPI",
    "totalCompositePorts",
    "totalDVIPorts",
    "totalHDMIPorts",
    "totalMiniHDMIPorts",
    "totalSVideoOutPorts",
    "totalVGAOutPorts",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "VideoCard")
public class VideoCard {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "CoreClock")
    protected FrequencyIntegerDimension coreClock;
    @XmlElement(name = "EffectiveMemoryClock")
    protected FrequencyIntegerDimension effectiveMemoryClock;
    @XmlElement(name = "GraphicsCardCooler")
    protected String graphicsCardCooler;
    @XmlElement(name = "GraphicsCardInterface")
    @XmlSchemaType(name = "string")
    protected List<GraphicsCardInterfaceTypeValues> graphicsCardInterface;
    @XmlElement(name = "GraphicsCardMaxResolution")
    protected String graphicsCardMaxResolution;
    @XmlElement(name = "GraphicsCardMemoryInterface")
    protected MemoryInterfaceDimension graphicsCardMemoryInterface;
    @XmlElement(name = "GraphicsCardMemoryType")
    protected String graphicsCardMemoryType;
    @XmlElement(name = "GraphicsChipsetBrand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsChipsetBrand;
    @XmlElement(name = "GraphicsCoProcessor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsCoProcessor;
    @XmlElement(name = "GraphicsRAMSize")
    protected List<MemorySizeDimension> graphicsRAMSize;
    @XmlElement(name = "GraphicsRAMType")
    protected String graphicsRAMType;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "MultiGPUTechnology")
    protected String multiGPUTechnology;
    @XmlElement(name = "ShaderClock")
    protected FrequencyIntegerDimension shaderClock;
    @XmlElement(name = "ThreeDAPI")
    protected List<String> threeDAPI;
    @XmlElement(name = "TotalCompositePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCompositePorts;
    @XmlElement(name = "TotalDVIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalDVIPorts;
    @XmlElement(name = "TotalHDMIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalHDMIPorts;
    @XmlElement(name = "TotalMiniHDMIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalMiniHDMIPorts;
    @XmlElement(name = "TotalSVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoOutPorts;
    @XmlElement(name = "TotalVGAOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVGAOutPorts;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;

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
     * 获取coreClock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyIntegerDimension }
     *     
     */
    public FrequencyIntegerDimension getCoreClock() {
        return coreClock;
    }

    /**
     * 设置coreClock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyIntegerDimension }
     *     
     */
    public void setCoreClock(FrequencyIntegerDimension value) {
        this.coreClock = value;
    }

    /**
     * 获取effectiveMemoryClock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyIntegerDimension }
     *     
     */
    public FrequencyIntegerDimension getEffectiveMemoryClock() {
        return effectiveMemoryClock;
    }

    /**
     * 设置effectiveMemoryClock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyIntegerDimension }
     *     
     */
    public void setEffectiveMemoryClock(FrequencyIntegerDimension value) {
        this.effectiveMemoryClock = value;
    }

    /**
     * 获取graphicsCardCooler属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCardCooler() {
        return graphicsCardCooler;
    }

    /**
     * 设置graphicsCardCooler属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCardCooler(String value) {
        this.graphicsCardCooler = value;
    }

    /**
     * Gets the value of the graphicsCardInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsCardInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicsCardInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GraphicsCardInterfaceTypeValues }
     * 
     * 
     */
    public List<GraphicsCardInterfaceTypeValues> getGraphicsCardInterface() {
        if (graphicsCardInterface == null) {
            graphicsCardInterface = new ArrayList<GraphicsCardInterfaceTypeValues>();
        }
        return this.graphicsCardInterface;
    }

    /**
     * 获取graphicsCardMaxResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCardMaxResolution() {
        return graphicsCardMaxResolution;
    }

    /**
     * 设置graphicsCardMaxResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCardMaxResolution(String value) {
        this.graphicsCardMaxResolution = value;
    }

    /**
     * 获取graphicsCardMemoryInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemoryInterfaceDimension }
     *     
     */
    public MemoryInterfaceDimension getGraphicsCardMemoryInterface() {
        return graphicsCardMemoryInterface;
    }

    /**
     * 设置graphicsCardMemoryInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryInterfaceDimension }
     *     
     */
    public void setGraphicsCardMemoryInterface(MemoryInterfaceDimension value) {
        this.graphicsCardMemoryInterface = value;
    }

    /**
     * 获取graphicsCardMemoryType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCardMemoryType() {
        return graphicsCardMemoryType;
    }

    /**
     * 设置graphicsCardMemoryType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCardMemoryType(String value) {
        this.graphicsCardMemoryType = value;
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
     * Gets the value of the graphicsRAMSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsRAMSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicsRAMSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemorySizeDimension }
     * 
     * 
     */
    public List<MemorySizeDimension> getGraphicsRAMSize() {
        if (graphicsRAMSize == null) {
            graphicsRAMSize = new ArrayList<MemorySizeDimension>();
        }
        return this.graphicsRAMSize;
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
     * 获取multiGPUTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiGPUTechnology() {
        return multiGPUTechnology;
    }

    /**
     * 设置multiGPUTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiGPUTechnology(String value) {
        this.multiGPUTechnology = value;
    }

    /**
     * 获取shaderClock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyIntegerDimension }
     *     
     */
    public FrequencyIntegerDimension getShaderClock() {
        return shaderClock;
    }

    /**
     * 设置shaderClock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyIntegerDimension }
     *     
     */
    public void setShaderClock(FrequencyIntegerDimension value) {
        this.shaderClock = value;
    }

    /**
     * Gets the value of the threeDAPI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threeDAPI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreeDAPI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getThreeDAPI() {
        if (threeDAPI == null) {
            threeDAPI = new ArrayList<String>();
        }
        return this.threeDAPI;
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
     * 获取totalDVIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDVIPorts() {
        return totalDVIPorts;
    }

    /**
     * 设置totalDVIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDVIPorts(BigInteger value) {
        this.totalDVIPorts = value;
    }

    /**
     * 获取totalHDMIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalHDMIPorts() {
        return totalHDMIPorts;
    }

    /**
     * 设置totalHDMIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalHDMIPorts(BigInteger value) {
        this.totalHDMIPorts = value;
    }

    /**
     * 获取totalMiniHDMIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMiniHDMIPorts() {
        return totalMiniHDMIPorts;
    }

    /**
     * 设置totalMiniHDMIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMiniHDMIPorts(BigInteger value) {
        this.totalMiniHDMIPorts = value;
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
     * 获取totalVGAOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVGAOutPorts() {
        return totalVGAOutPorts;
    }

    /**
     * 设置totalVGAOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVGAOutPorts(BigInteger value) {
        this.totalVGAOutPorts = value;
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

}
