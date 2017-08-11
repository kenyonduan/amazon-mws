
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
 *         &lt;element ref="{}VariationData" minOccurs="0"/>
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}CacheMemory" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}ProcessorBrand" minOccurs="0"/>
 *         &lt;element ref="{}ProcessorCoolingDevice" minOccurs="0"/>
 *         &lt;element ref="{}ProcessorCount" minOccurs="0"/>
 *         &lt;element ref="{}ProcessorSeries" minOccurs="0"/>
 *         &lt;element ref="{}ProcessorSocket" minOccurs="0"/>
 *         &lt;element ref="{}ProcessorSpeed" minOccurs="0"/>
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
    "cacheMemory",
    "modelNumber",
    "processorBrand",
    "processorCoolingDevice",
    "processorCount",
    "processorSeries",
    "processorSocket",
    "processorSpeed"
})
@XmlRootElement(name = "ComputerProcessor")
public class ComputerProcessor {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "CacheMemory")
    protected MemorySizeIntegerDimension cacheMemory;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "ProcessorBrand")
    protected String processorBrand;
    @XmlElement(name = "ProcessorCoolingDevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorCoolingDevice;
    @XmlElement(name = "ProcessorCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger processorCount;
    @XmlElement(name = "ProcessorSeries")
    @XmlSchemaType(name = "string")
    protected ProcessorSeriesTypeValues processorSeries;
    @XmlElement(name = "ProcessorSocket")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorSocket;
    @XmlElement(name = "ProcessorSpeed")
    protected FrequencyDimension processorSpeed;

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
     * 获取cacheMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public MemorySizeIntegerDimension getCacheMemory() {
        return cacheMemory;
    }

    /**
     * 设置cacheMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeIntegerDimension }
     *     
     */
    public void setCacheMemory(MemorySizeIntegerDimension value) {
        this.cacheMemory = value;
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
     * 获取processorCoolingDevice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorCoolingDevice() {
        return processorCoolingDevice;
    }

    /**
     * 设置processorCoolingDevice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorCoolingDevice(String value) {
        this.processorCoolingDevice = value;
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
     * 获取processorSeries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessorSeriesTypeValues }
     *     
     */
    public ProcessorSeriesTypeValues getProcessorSeries() {
        return processorSeries;
    }

    /**
     * 设置processorSeries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessorSeriesTypeValues }
     *     
     */
    public void setProcessorSeries(ProcessorSeriesTypeValues value) {
        this.processorSeries = value;
    }

    /**
     * 获取processorSocket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorSocket() {
        return processorSocket;
    }

    /**
     * 设置processorSocket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorSocket(String value) {
        this.processorSocket = value;
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

}
