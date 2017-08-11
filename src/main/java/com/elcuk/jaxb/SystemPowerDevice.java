
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
 *         &lt;element ref="{}EnergyEfficiencyRating" minOccurs="0"/>
 *         &lt;element ref="{}MainPowerConnector" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}Modular" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSATAPowerConnectors" minOccurs="0"/>
 *         &lt;element ref="{}PCIExpressConnectorConfiguration" minOccurs="0"/>
 *         &lt;element ref="{}PowerFactorCorrection" minOccurs="0"/>
 *         &lt;element ref="{}PowerSupplyFormFactor" minOccurs="0"/>
 *         &lt;element ref="{}PowerSupplyMaxOutput" minOccurs="0"/>
 *         &lt;element ref="{}SLICertification" minOccurs="0"/>
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
    "energyEfficiencyRating",
    "mainPowerConnector",
    "modelNumber",
    "modular",
    "numberOfSATAPowerConnectors",
    "pciExpressConnectorConfiguration",
    "powerFactorCorrection",
    "powerSupplyFormFactor",
    "powerSupplyMaxOutput",
    "sliCertification",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "SystemPowerDevice")
public class SystemPowerDevice {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "EnergyEfficiencyRating")
    protected String energyEfficiencyRating;
    @XmlElement(name = "MainPowerConnector")
    protected String mainPowerConnector;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "Modular")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modular;
    @XmlElement(name = "NumberOfSATAPowerConnectors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSATAPowerConnectors;
    @XmlElement(name = "PCIExpressConnectorConfiguration")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pciExpressConnectorConfiguration;
    @XmlElement(name = "PowerFactorCorrection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerFactorCorrection;
    @XmlElement(name = "PowerSupplyFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSupplyFormFactor;
    @XmlElement(name = "PowerSupplyMaxOutput")
    protected PowerSixDigitDimension powerSupplyMaxOutput;
    @XmlElement(name = "SLICertification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sliCertification;
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
     * 获取energyEfficiencyRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyEfficiencyRating() {
        return energyEfficiencyRating;
    }

    /**
     * 设置energyEfficiencyRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyEfficiencyRating(String value) {
        this.energyEfficiencyRating = value;
    }

    /**
     * 获取mainPowerConnector属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPowerConnector() {
        return mainPowerConnector;
    }

    /**
     * 设置mainPowerConnector属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPowerConnector(String value) {
        this.mainPowerConnector = value;
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
     * 获取modular属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModular() {
        return modular;
    }

    /**
     * 设置modular属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModular(String value) {
        this.modular = value;
    }

    /**
     * 获取numberOfSATAPowerConnectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSATAPowerConnectors() {
        return numberOfSATAPowerConnectors;
    }

    /**
     * 设置numberOfSATAPowerConnectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSATAPowerConnectors(BigInteger value) {
        this.numberOfSATAPowerConnectors = value;
    }

    /**
     * 获取pciExpressConnectorConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCIExpressConnectorConfiguration() {
        return pciExpressConnectorConfiguration;
    }

    /**
     * 设置pciExpressConnectorConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCIExpressConnectorConfiguration(String value) {
        this.pciExpressConnectorConfiguration = value;
    }

    /**
     * 获取powerFactorCorrection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerFactorCorrection() {
        return powerFactorCorrection;
    }

    /**
     * 设置powerFactorCorrection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerFactorCorrection(String value) {
        this.powerFactorCorrection = value;
    }

    /**
     * 获取powerSupplyFormFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSupplyFormFactor() {
        return powerSupplyFormFactor;
    }

    /**
     * 设置powerSupplyFormFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSupplyFormFactor(String value) {
        this.powerSupplyFormFactor = value;
    }

    /**
     * 获取powerSupplyMaxOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerSixDigitDimension }
     *     
     */
    public PowerSixDigitDimension getPowerSupplyMaxOutput() {
        return powerSupplyMaxOutput;
    }

    /**
     * 设置powerSupplyMaxOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerSixDigitDimension }
     *     
     */
    public void setPowerSupplyMaxOutput(PowerSixDigitDimension value) {
        this.powerSupplyMaxOutput = value;
    }

    /**
     * 获取sliCertification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLICertification() {
        return sliCertification;
    }

    /**
     * 设置sliCertification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLICertification(String value) {
        this.sliCertification = value;
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
