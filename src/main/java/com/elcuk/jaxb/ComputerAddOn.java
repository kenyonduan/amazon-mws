
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
 *         &lt;element ref="{}ACAdapterCurrent" minOccurs="0"/>
 *         &lt;element ref="{}CableLength" minOccurs="0"/>
 *         &lt;element ref="{}CableSpeed" minOccurs="0"/>
 *         &lt;element ref="{}CableType" minOccurs="0"/>
 *         &lt;element ref="{}CompatibleDevices" minOccurs="0"/>
 *         &lt;element ref="{}CompatibleDeviceSize" minOccurs="0"/>
 *         &lt;element ref="{}Conductor" minOccurs="0"/>
 *         &lt;element ref="{}ConnectionType" minOccurs="0"/>
 *         &lt;element ref="{}ConnectorNumber" minOccurs="0"/>
 *         &lt;element ref="{}MaximumHorizontalVideoResolution" minOccurs="0"/>
 *         &lt;element ref="{}MaximumVerticalVideoResolution" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfFans" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfMonitorConnections" minOccurs="0"/>
 *         &lt;element ref="{}PrivacyScreenMaterialType" minOccurs="0"/>
 *         &lt;element ref="{}PrivacyScreenSize" minOccurs="0"/>
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
    "acAdapterCurrent",
    "cableLength",
    "cableSpeed",
    "cableType",
    "compatibleDevices",
    "compatibleDeviceSize",
    "conductor",
    "connectionType",
    "connectorNumber",
    "maximumHorizontalVideoResolution",
    "maximumVerticalVideoResolution",
    "modelNumber",
    "numberOfFans",
    "numberOfMonitorConnections",
    "privacyScreenMaterialType",
    "privacyScreenSize",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "ComputerAddOn")
public class ComputerAddOn {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "ACAdapterCurrent")
    protected CurrentFiveDigitDimension acAdapterCurrent;
    @XmlElement(name = "CableLength")
    protected LengthSevenDigitDimension cableLength;
    @XmlElement(name = "CableSpeed")
    protected DataTransferSpeedDimension cableSpeed;
    @XmlElement(name = "CableType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cableType;
    @XmlElement(name = "CompatibleDevices")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String compatibleDevices;
    @XmlElement(name = "CompatibleDeviceSize")
    protected BigDecimal compatibleDeviceSize;
    @XmlElement(name = "Conductor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String conductor;
    @XmlElement(name = "ConnectionType")
    @XmlSchemaType(name = "string")
    protected ConnectionTypeValues connectionType;
    @XmlElement(name = "ConnectorNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger connectorNumber;
    @XmlElement(name = "MaximumHorizontalVideoResolution")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumHorizontalVideoResolution;
    @XmlElement(name = "MaximumVerticalVideoResolution")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumVerticalVideoResolution;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "NumberOfFans")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfFans;
    @XmlElement(name = "NumberOfMonitorConnections")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfMonitorConnections;
    @XmlElement(name = "PrivacyScreenMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String privacyScreenMaterialType;
    @XmlElement(name = "PrivacyScreenSize")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger privacyScreenSize;
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
     * 获取acAdapterCurrent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrentFiveDigitDimension }
     *     
     */
    public CurrentFiveDigitDimension getACAdapterCurrent() {
        return acAdapterCurrent;
    }

    /**
     * 设置acAdapterCurrent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentFiveDigitDimension }
     *     
     */
    public void setACAdapterCurrent(CurrentFiveDigitDimension value) {
        this.acAdapterCurrent = value;
    }

    /**
     * 获取cableLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public LengthSevenDigitDimension getCableLength() {
        return cableLength;
    }

    /**
     * 设置cableLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthSevenDigitDimension }
     *     
     */
    public void setCableLength(LengthSevenDigitDimension value) {
        this.cableLength = value;
    }

    /**
     * 获取cableSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DataTransferSpeedDimension }
     *     
     */
    public DataTransferSpeedDimension getCableSpeed() {
        return cableSpeed;
    }

    /**
     * 设置cableSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DataTransferSpeedDimension }
     *     
     */
    public void setCableSpeed(DataTransferSpeedDimension value) {
        this.cableSpeed = value;
    }

    /**
     * 获取cableType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableType() {
        return cableType;
    }

    /**
     * 设置cableType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableType(String value) {
        this.cableType = value;
    }

    /**
     * 获取compatibleDevices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleDevices() {
        return compatibleDevices;
    }

    /**
     * 设置compatibleDevices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleDevices(String value) {
        this.compatibleDevices = value;
    }

    /**
     * 获取compatibleDeviceSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompatibleDeviceSize() {
        return compatibleDeviceSize;
    }

    /**
     * 设置compatibleDeviceSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompatibleDeviceSize(BigDecimal value) {
        this.compatibleDeviceSize = value;
    }

    /**
     * 获取conductor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * 设置conductor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConductor(String value) {
        this.conductor = value;
    }

    /**
     * 获取connectionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTypeValues }
     *     
     */
    public ConnectionTypeValues getConnectionType() {
        return connectionType;
    }

    /**
     * 设置connectionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTypeValues }
     *     
     */
    public void setConnectionType(ConnectionTypeValues value) {
        this.connectionType = value;
    }

    /**
     * 获取connectorNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnectorNumber() {
        return connectorNumber;
    }

    /**
     * 设置connectorNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnectorNumber(BigInteger value) {
        this.connectorNumber = value;
    }

    /**
     * 获取maximumHorizontalVideoResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumHorizontalVideoResolution() {
        return maximumHorizontalVideoResolution;
    }

    /**
     * 设置maximumHorizontalVideoResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumHorizontalVideoResolution(BigInteger value) {
        this.maximumHorizontalVideoResolution = value;
    }

    /**
     * 获取maximumVerticalVideoResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumVerticalVideoResolution() {
        return maximumVerticalVideoResolution;
    }

    /**
     * 设置maximumVerticalVideoResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumVerticalVideoResolution(BigInteger value) {
        this.maximumVerticalVideoResolution = value;
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
     * 获取numberOfMonitorConnections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMonitorConnections() {
        return numberOfMonitorConnections;
    }

    /**
     * 设置numberOfMonitorConnections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMonitorConnections(BigInteger value) {
        this.numberOfMonitorConnections = value;
    }

    /**
     * 获取privacyScreenMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyScreenMaterialType() {
        return privacyScreenMaterialType;
    }

    /**
     * 设置privacyScreenMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyScreenMaterialType(String value) {
        this.privacyScreenMaterialType = value;
    }

    /**
     * 获取privacyScreenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrivacyScreenSize() {
        return privacyScreenSize;
    }

    /**
     * 设置privacyScreenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrivacyScreenSize(BigInteger value) {
        this.privacyScreenSize = value;
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
