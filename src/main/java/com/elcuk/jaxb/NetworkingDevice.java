
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
 *         &lt;element ref="{}AdditionalFunctionality" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{}IPProtocolStandards" minOccurs="0"/>
 *         &lt;element ref="{}LANPortBandwidth" minOccurs="0"/>
 *         &lt;element ref="{}LANPortNumber" minOccurs="0"/>
 *         &lt;element ref="{}MaxDownstreamTransmissionRate" minOccurs="0"/>
 *         &lt;element ref="{}MaxUpstreamTransmissionRate" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}ModemType" minOccurs="0"/>
 *         &lt;element ref="{}NetworkAdapterType" minOccurs="0"/>
 *         &lt;element ref="{}OperatingSystemCompatability" minOccurs="0"/>
 *         &lt;element ref="{}SecurityProtocol" minOccurs="0"/>
 *         &lt;element ref="{}SimultaneousSessions" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
 *         &lt;element ref="{}WirelessDataTransferRate" minOccurs="0"/>
 *         &lt;element ref="{}WirelessRouterTransmissionBand" minOccurs="0"/>
 *         &lt;element ref="{}WirelessTechnology" minOccurs="0"/>
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
    "additionalFunctionality",
    "ipProtocolStandards",
    "lanPortBandwidth",
    "lanPortNumber",
    "maxDownstreamTransmissionRate",
    "maxUpstreamTransmissionRate",
    "modelNumber",
    "modemType",
    "networkAdapterType",
    "operatingSystemCompatability",
    "securityProtocol",
    "simultaneousSessions",
    "voltage",
    "wattage",
    "wirelessDataTransferRate",
    "wirelessRouterTransmissionBand",
    "wirelessTechnology"
})
@XmlRootElement(name = "NetworkingDevice")
public class NetworkingDevice {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "AdditionalFunctionality")
    protected List<String> additionalFunctionality;
    @XmlElement(name = "IPProtocolStandards")
    protected String ipProtocolStandards;
    @XmlElement(name = "LANPortBandwidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lanPortBandwidth;
    @XmlElement(name = "LANPortNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lanPortNumber;
    @XmlElement(name = "MaxDownstreamTransmissionRate")
    protected DataTransferSpeedFiveDigitIntegerDimension maxDownstreamTransmissionRate;
    @XmlElement(name = "MaxUpstreamTransmissionRate")
    protected DataTransferSpeedFiveDigitIntegerDimension maxUpstreamTransmissionRate;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "ModemType")
    @XmlSchemaType(name = "string")
    protected ModemTypeValues modemType;
    @XmlElement(name = "NetworkAdapterType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String networkAdapterType;
    @XmlElement(name = "OperatingSystemCompatability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String operatingSystemCompatability;
    @XmlElement(name = "SecurityProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String securityProtocol;
    @XmlElement(name = "SimultaneousSessions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger simultaneousSessions;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
    @XmlElement(name = "WirelessDataTransferRate")
    protected DataTransferSpeedFiveDigitIntegerDimension wirelessDataTransferRate;
    @XmlElement(name = "WirelessRouterTransmissionBand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wirelessRouterTransmissionBand;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wirelessTechnology;

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
     * Gets the value of the additionalFunctionality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFunctionality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFunctionality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalFunctionality() {
        if (additionalFunctionality == null) {
            additionalFunctionality = new ArrayList<String>();
        }
        return this.additionalFunctionality;
    }

    /**
     * 获取ipProtocolStandards属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPProtocolStandards() {
        return ipProtocolStandards;
    }

    /**
     * 设置ipProtocolStandards属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPProtocolStandards(String value) {
        this.ipProtocolStandards = value;
    }

    /**
     * 获取lanPortBandwidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLANPortBandwidth() {
        return lanPortBandwidth;
    }

    /**
     * 设置lanPortBandwidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLANPortBandwidth(String value) {
        this.lanPortBandwidth = value;
    }

    /**
     * 获取lanPortNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLANPortNumber() {
        return lanPortNumber;
    }

    /**
     * 设置lanPortNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLANPortNumber(BigInteger value) {
        this.lanPortNumber = value;
    }

    /**
     * 获取maxDownstreamTransmissionRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataTransferSpeedFiveDigitIntegerDimension }
     *     
     */
    public DataTransferSpeedFiveDigitIntegerDimension getMaxDownstreamTransmissionRate() {
        return maxDownstreamTransmissionRate;
    }

    /**
     * 设置maxDownstreamTransmissionRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataTransferSpeedFiveDigitIntegerDimension }
     *     
     */
    public void setMaxDownstreamTransmissionRate(DataTransferSpeedFiveDigitIntegerDimension value) {
        this.maxDownstreamTransmissionRate = value;
    }

    /**
     * 获取maxUpstreamTransmissionRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataTransferSpeedFiveDigitIntegerDimension }
     *     
     */
    public DataTransferSpeedFiveDigitIntegerDimension getMaxUpstreamTransmissionRate() {
        return maxUpstreamTransmissionRate;
    }

    /**
     * 设置maxUpstreamTransmissionRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataTransferSpeedFiveDigitIntegerDimension }
     *     
     */
    public void setMaxUpstreamTransmissionRate(DataTransferSpeedFiveDigitIntegerDimension value) {
        this.maxUpstreamTransmissionRate = value;
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
     * 获取modemType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModemTypeValues }
     *     
     */
    public ModemTypeValues getModemType() {
        return modemType;
    }

    /**
     * 设置modemType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModemTypeValues }
     *     
     */
    public void setModemType(ModemTypeValues value) {
        this.modemType = value;
    }

    /**
     * 获取networkAdapterType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkAdapterType() {
        return networkAdapterType;
    }

    /**
     * 设置networkAdapterType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAdapterType(String value) {
        this.networkAdapterType = value;
    }

    /**
     * 获取operatingSystemCompatability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystemCompatability() {
        return operatingSystemCompatability;
    }

    /**
     * 设置operatingSystemCompatability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystemCompatability(String value) {
        this.operatingSystemCompatability = value;
    }

    /**
     * 获取securityProtocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * 设置securityProtocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityProtocol(String value) {
        this.securityProtocol = value;
    }

    /**
     * 获取simultaneousSessions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSimultaneousSessions() {
        return simultaneousSessions;
    }

    /**
     * 设置simultaneousSessions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSimultaneousSessions(BigInteger value) {
        this.simultaneousSessions = value;
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
     * 获取wirelessDataTransferRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataTransferSpeedFiveDigitIntegerDimension }
     *     
     */
    public DataTransferSpeedFiveDigitIntegerDimension getWirelessDataTransferRate() {
        return wirelessDataTransferRate;
    }

    /**
     * 设置wirelessDataTransferRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataTransferSpeedFiveDigitIntegerDimension }
     *     
     */
    public void setWirelessDataTransferRate(DataTransferSpeedFiveDigitIntegerDimension value) {
        this.wirelessDataTransferRate = value;
    }

    /**
     * 获取wirelessRouterTransmissionBand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessRouterTransmissionBand() {
        return wirelessRouterTransmissionBand;
    }

    /**
     * 设置wirelessRouterTransmissionBand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessRouterTransmissionBand(String value) {
        this.wirelessRouterTransmissionBand = value;
    }

    /**
     * 获取wirelessTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessTechnology() {
        return wirelessTechnology;
    }

    /**
     * 设置wirelessTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessTechnology(String value) {
        this.wirelessTechnology = value;
    }

}
