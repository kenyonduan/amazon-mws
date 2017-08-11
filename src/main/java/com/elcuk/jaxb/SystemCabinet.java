
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
 *         &lt;element ref="{}AirDuctLocation" minOccurs="0"/>
 *         &lt;element ref="{}ExpansionSlots" minOccurs="0"/>
 *         &lt;element ref="{}ExternalBayType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}HotswapBayType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}InternalBayType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}MaterialType" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}MotherboardCompatibility" minOccurs="0"/>
 *         &lt;element ref="{}PanelWindowLocation" minOccurs="0"/>
 *         &lt;element ref="{}PowerSupplyMaxOutput" minOccurs="0"/>
 *         &lt;element ref="{}PowerSupplyMounting" minOccurs="0"/>
 *         &lt;element ref="{}SystemCabinetFormFactor" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPanelAudioInPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPanelAudioOutPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPaneleSataPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPanelFirewire400Ports" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPanelFirewire800Ports" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPanelUSB1.0Ports" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPanelUSB1.1Ports" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPanelUSB2.0Ports" minOccurs="0"/>
 *         &lt;element ref="{}TotalFrontPanelUSB3.0Ports" minOccurs="0"/>
 *         &lt;element ref="{}TotalNumberOfExternalBays" minOccurs="0"/>
 *         &lt;element ref="{}TotalNumberOfHotswapBays" minOccurs="0"/>
 *         &lt;element ref="{}TotalNumberOfInternalBays" minOccurs="0"/>
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
    "airDuctLocation",
    "expansionSlots",
    "externalBayType",
    "hotswapBayType",
    "internalBayType",
    "materialType",
    "modelNumber",
    "motherboardCompatibility",
    "panelWindowLocation",
    "powerSupplyMaxOutput",
    "powerSupplyMounting",
    "systemCabinetFormFactor",
    "totalFrontPanelAudioInPorts",
    "totalFrontPanelAudioOutPorts",
    "totalFrontPaneleSataPorts",
    "totalFrontPanelFirewire400Ports",
    "totalFrontPanelFirewire800Ports",
    "totalFrontPanelUSB10Ports",
    "totalFrontPanelUSB11Ports",
    "totalFrontPanelUSB20Ports",
    "totalFrontPanelUSB30Ports",
    "totalNumberOfExternalBays",
    "totalNumberOfHotswapBays",
    "totalNumberOfInternalBays",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "SystemCabinet")
public class SystemCabinet {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "AirDuctLocation")
    protected String airDuctLocation;
    @XmlElement(name = "ExpansionSlots")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expansionSlots;
    @XmlElement(name = "ExternalBayType")
    protected List<LengthFourDigitDimension> externalBayType;
    @XmlElement(name = "HotswapBayType")
    protected List<LengthFourDigitDimension> hotswapBayType;
    @XmlElement(name = "InternalBayType")
    protected List<LengthFourDigitDimension> internalBayType;
    @XmlElement(name = "MaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String materialType;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "MotherboardCompatibility")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String motherboardCompatibility;
    @XmlElement(name = "PanelWindowLocation")
    protected String panelWindowLocation;
    @XmlElement(name = "PowerSupplyMaxOutput")
    protected PowerSixDigitDimension powerSupplyMaxOutput;
    @XmlElement(name = "PowerSupplyMounting")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSupplyMounting;
    @XmlElement(name = "SystemCabinetFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String systemCabinetFormFactor;
    @XmlElement(name = "TotalFrontPanelAudioInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPanelAudioInPorts;
    @XmlElement(name = "TotalFrontPanelAudioOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPanelAudioOutPorts;
    @XmlElement(name = "TotalFrontPaneleSataPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPaneleSataPorts;
    @XmlElement(name = "TotalFrontPanelFirewire400Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPanelFirewire400Ports;
    @XmlElement(name = "TotalFrontPanelFirewire800Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPanelFirewire800Ports;
    @XmlElement(name = "TotalFrontPanelUSB1.0Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPanelUSB10Ports;
    @XmlElement(name = "TotalFrontPanelUSB1.1Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPanelUSB11Ports;
    @XmlElement(name = "TotalFrontPanelUSB2.0Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPanelUSB20Ports;
    @XmlElement(name = "TotalFrontPanelUSB3.0Ports")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFrontPanelUSB30Ports;
    @XmlElement(name = "TotalNumberOfExternalBays")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalNumberOfExternalBays;
    @XmlElement(name = "TotalNumberOfHotswapBays")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalNumberOfHotswapBays;
    @XmlElement(name = "TotalNumberOfInternalBays")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalNumberOfInternalBays;
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
     * 获取airDuctLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirDuctLocation() {
        return airDuctLocation;
    }

    /**
     * 设置airDuctLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirDuctLocation(String value) {
        this.airDuctLocation = value;
    }

    /**
     * 获取expansionSlots属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpansionSlots() {
        return expansionSlots;
    }

    /**
     * 设置expansionSlots属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpansionSlots(BigInteger value) {
        this.expansionSlots = value;
    }

    /**
     * Gets the value of the externalBayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalBayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalBayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthFourDigitDimension }
     * 
     * 
     */
    public List<LengthFourDigitDimension> getExternalBayType() {
        if (externalBayType == null) {
            externalBayType = new ArrayList<LengthFourDigitDimension>();
        }
        return this.externalBayType;
    }

    /**
     * Gets the value of the hotswapBayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotswapBayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotswapBayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthFourDigitDimension }
     * 
     * 
     */
    public List<LengthFourDigitDimension> getHotswapBayType() {
        if (hotswapBayType == null) {
            hotswapBayType = new ArrayList<LengthFourDigitDimension>();
        }
        return this.hotswapBayType;
    }

    /**
     * Gets the value of the internalBayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalBayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalBayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthFourDigitDimension }
     * 
     * 
     */
    public List<LengthFourDigitDimension> getInternalBayType() {
        if (internalBayType == null) {
            internalBayType = new ArrayList<LengthFourDigitDimension>();
        }
        return this.internalBayType;
    }

    /**
     * 获取materialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * 设置materialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
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
     * 获取motherboardCompatibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherboardCompatibility() {
        return motherboardCompatibility;
    }

    /**
     * 设置motherboardCompatibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherboardCompatibility(String value) {
        this.motherboardCompatibility = value;
    }

    /**
     * 获取panelWindowLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanelWindowLocation() {
        return panelWindowLocation;
    }

    /**
     * 设置panelWindowLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanelWindowLocation(String value) {
        this.panelWindowLocation = value;
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
     * 获取powerSupplyMounting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSupplyMounting() {
        return powerSupplyMounting;
    }

    /**
     * 设置powerSupplyMounting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSupplyMounting(String value) {
        this.powerSupplyMounting = value;
    }

    /**
     * 获取systemCabinetFormFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCabinetFormFactor() {
        return systemCabinetFormFactor;
    }

    /**
     * 设置systemCabinetFormFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCabinetFormFactor(String value) {
        this.systemCabinetFormFactor = value;
    }

    /**
     * 获取totalFrontPanelAudioInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPanelAudioInPorts() {
        return totalFrontPanelAudioInPorts;
    }

    /**
     * 设置totalFrontPanelAudioInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPanelAudioInPorts(BigInteger value) {
        this.totalFrontPanelAudioInPorts = value;
    }

    /**
     * 获取totalFrontPanelAudioOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPanelAudioOutPorts() {
        return totalFrontPanelAudioOutPorts;
    }

    /**
     * 设置totalFrontPanelAudioOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPanelAudioOutPorts(BigInteger value) {
        this.totalFrontPanelAudioOutPorts = value;
    }

    /**
     * 获取totalFrontPaneleSataPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPaneleSataPorts() {
        return totalFrontPaneleSataPorts;
    }

    /**
     * 设置totalFrontPaneleSataPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPaneleSataPorts(BigInteger value) {
        this.totalFrontPaneleSataPorts = value;
    }

    /**
     * 获取totalFrontPanelFirewire400Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPanelFirewire400Ports() {
        return totalFrontPanelFirewire400Ports;
    }

    /**
     * 设置totalFrontPanelFirewire400Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPanelFirewire400Ports(BigInteger value) {
        this.totalFrontPanelFirewire400Ports = value;
    }

    /**
     * 获取totalFrontPanelFirewire800Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPanelFirewire800Ports() {
        return totalFrontPanelFirewire800Ports;
    }

    /**
     * 设置totalFrontPanelFirewire800Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPanelFirewire800Ports(BigInteger value) {
        this.totalFrontPanelFirewire800Ports = value;
    }

    /**
     * 获取totalFrontPanelUSB10Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPanelUSB10Ports() {
        return totalFrontPanelUSB10Ports;
    }

    /**
     * 设置totalFrontPanelUSB10Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPanelUSB10Ports(BigInteger value) {
        this.totalFrontPanelUSB10Ports = value;
    }

    /**
     * 获取totalFrontPanelUSB11Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPanelUSB11Ports() {
        return totalFrontPanelUSB11Ports;
    }

    /**
     * 设置totalFrontPanelUSB11Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPanelUSB11Ports(BigInteger value) {
        this.totalFrontPanelUSB11Ports = value;
    }

    /**
     * 获取totalFrontPanelUSB20Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPanelUSB20Ports() {
        return totalFrontPanelUSB20Ports;
    }

    /**
     * 设置totalFrontPanelUSB20Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPanelUSB20Ports(BigInteger value) {
        this.totalFrontPanelUSB20Ports = value;
    }

    /**
     * 获取totalFrontPanelUSB30Ports属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFrontPanelUSB30Ports() {
        return totalFrontPanelUSB30Ports;
    }

    /**
     * 设置totalFrontPanelUSB30Ports属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFrontPanelUSB30Ports(BigInteger value) {
        this.totalFrontPanelUSB30Ports = value;
    }

    /**
     * 获取totalNumberOfExternalBays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfExternalBays() {
        return totalNumberOfExternalBays;
    }

    /**
     * 设置totalNumberOfExternalBays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfExternalBays(BigInteger value) {
        this.totalNumberOfExternalBays = value;
    }

    /**
     * 获取totalNumberOfHotswapBays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfHotswapBays() {
        return totalNumberOfHotswapBays;
    }

    /**
     * 设置totalNumberOfHotswapBays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfHotswapBays(BigInteger value) {
        this.totalNumberOfHotswapBays = value;
    }

    /**
     * 获取totalNumberOfInternalBays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfInternalBays() {
        return totalNumberOfInternalBays;
    }

    /**
     * 设置totalNumberOfInternalBays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfInternalBays(BigInteger value) {
        this.totalNumberOfInternalBays = value;
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
