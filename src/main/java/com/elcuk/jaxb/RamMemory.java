
package com.elcuk.jaxb;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}CasLatency" minOccurs="0"/>
 *         &lt;element ref="{}ComputerMemoryFormFactor" minOccurs="0"/>
 *         &lt;element ref="{}ComputerMemoryTechnology" minOccurs="0"/>
 *         &lt;element ref="{}MaxMemorySpeed" minOccurs="0"/>
 *         &lt;element ref="{}MemoryCapacityPerSTICK" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}MultiChannelKit" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfMemorySticks" minOccurs="0"/>
 *         &lt;element ref="{}RAMClockSpeed" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}VoltageRating" minOccurs="0"/>
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
    "casLatency",
    "computerMemoryFormFactor",
    "computerMemoryTechnology",
    "maxMemorySpeed",
    "memoryCapacityPerSTICK",
    "modelNumber",
    "multiChannelKit",
    "numberOfMemorySticks",
    "ramClockSpeed",
    "voltage",
    "voltageRating",
    "wattage"
})
@XmlRootElement(name = "RamMemory")
public class RamMemory {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "CasLatency")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger casLatency;
    @XmlElement(name = "ComputerMemoryFormFactor")
    protected String computerMemoryFormFactor;
    @XmlElement(name = "ComputerMemoryTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String computerMemoryTechnology;
    @XmlElement(name = "MaxMemorySpeed")
    protected BigDecimal maxMemorySpeed;
    @XmlElement(name = "MemoryCapacityPerSTICK")
    protected MemorySizeFiveDigitIntegerDimension memoryCapacityPerSTICK;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "MultiChannelKit")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger multiChannelKit;
    @XmlElement(name = "NumberOfMemorySticks")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfMemorySticks;
    @XmlElement(name = "RAMClockSpeed")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ramClockSpeed;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "VoltageRating")
    protected VoltageSevenDigitDecimalDimension voltageRating;
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
     * 获取casLatency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCasLatency() {
        return casLatency;
    }

    /**
     * 设置casLatency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCasLatency(BigInteger value) {
        this.casLatency = value;
    }

    /**
     * 获取computerMemoryFormFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerMemoryFormFactor() {
        return computerMemoryFormFactor;
    }

    /**
     * 设置computerMemoryFormFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerMemoryFormFactor(String value) {
        this.computerMemoryFormFactor = value;
    }

    /**
     * 获取computerMemoryTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerMemoryTechnology() {
        return computerMemoryTechnology;
    }

    /**
     * 设置computerMemoryTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerMemoryTechnology(String value) {
        this.computerMemoryTechnology = value;
    }

    /**
     * 获取maxMemorySpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxMemorySpeed() {
        return maxMemorySpeed;
    }

    /**
     * 设置maxMemorySpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxMemorySpeed(BigDecimal value) {
        this.maxMemorySpeed = value;
    }

    /**
     * 获取memoryCapacityPerSTICK属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeFiveDigitIntegerDimension }
     *     
     */
    public MemorySizeFiveDigitIntegerDimension getMemoryCapacityPerSTICK() {
        return memoryCapacityPerSTICK;
    }

    /**
     * 设置memoryCapacityPerSTICK属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeFiveDigitIntegerDimension }
     *     
     */
    public void setMemoryCapacityPerSTICK(MemorySizeFiveDigitIntegerDimension value) {
        this.memoryCapacityPerSTICK = value;
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
     * 获取multiChannelKit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultiChannelKit() {
        return multiChannelKit;
    }

    /**
     * 设置multiChannelKit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultiChannelKit(BigInteger value) {
        this.multiChannelKit = value;
    }

    /**
     * 获取numberOfMemorySticks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMemorySticks() {
        return numberOfMemorySticks;
    }

    /**
     * 设置numberOfMemorySticks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMemorySticks(BigInteger value) {
        this.numberOfMemorySticks = value;
    }

    /**
     * 获取ramClockSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRAMClockSpeed() {
        return ramClockSpeed;
    }

    /**
     * 设置ramClockSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRAMClockSpeed(BigInteger value) {
        this.ramClockSpeed = value;
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
     * 获取voltageRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VoltageSevenDigitDecimalDimension }
     *     
     */
    public VoltageSevenDigitDecimalDimension getVoltageRating() {
        return voltageRating;
    }

    /**
     * 设置voltageRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageSevenDigitDecimalDimension }
     *     
     */
    public void setVoltageRating(VoltageSevenDigitDecimalDimension value) {
        this.voltageRating = value;
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
