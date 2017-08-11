
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
 *         &lt;element ref="{}CableLength" minOccurs="0"/>
 *         &lt;element ref="{}ConnectionInterface" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}ConnectorNumber" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfUSBHubConnectorPorts" minOccurs="0"/>
 *         &lt;element ref="{}PressureLevels" minOccurs="0"/>
 *         &lt;element ref="{}TabletMaximumDataRate" minOccurs="0"/>
 *         &lt;element ref="{}TabletMinimumSystemRequirements" minOccurs="0"/>
 *         &lt;element ref="{}TabletResolution" minOccurs="0"/>
 *         &lt;element ref="{}TabletSurfaceActiveArea" minOccurs="0"/>
 *         &lt;element ref="{}TVTunerMemory" minOccurs="0"/>
 *         &lt;element ref="{}TVTunerVideoOutputInterface" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}TVTunerVideoStandard" minOccurs="0"/>
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
    "cableLength",
    "connectionInterface",
    "connectorNumber",
    "modelNumber",
    "numberOfUSBHubConnectorPorts",
    "pressureLevels",
    "tabletMaximumDataRate",
    "tabletMinimumSystemRequirements",
    "tabletResolution",
    "tabletSurfaceActiveArea",
    "tvTunerMemory",
    "tvTunerVideoOutputInterface",
    "tvTunerVideoStandard",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "Computer")
public class Computer {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "CableLength")
    protected LengthSevenDigitDimension cableLength;
    @XmlElement(name = "ConnectionInterface")
    @XmlSchemaType(name = "string")
    protected List<ConnectionTypeValues> connectionInterface;
    @XmlElement(name = "ConnectorNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger connectorNumber;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "NumberOfUSBHubConnectorPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfUSBHubConnectorPorts;
    @XmlElement(name = "PressureLevels")
    protected PressureLevelSixDigitIntegerDimension pressureLevels;
    @XmlElement(name = "TabletMaximumDataRate")
    protected TabletDataRateDimension tabletMaximumDataRate;
    @XmlElement(name = "TabletMinimumSystemRequirements")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tabletMinimumSystemRequirements;
    @XmlElement(name = "TabletResolution")
    protected TabletResolutionDimension tabletResolution;
    @XmlElement(name = "TabletSurfaceActiveArea")
    protected TabletActiveSurfaceAreaDimension tabletSurfaceActiveArea;
    @XmlElement(name = "TVTunerMemory")
    protected MemorySizeTenDigitIntegerDimension tvTunerMemory;
    @XmlElement(name = "TVTunerVideoOutputInterface")
    protected List<String> tvTunerVideoOutputInterface;
    @XmlElement(name = "TVTunerVideoStandard")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tvTunerVideoStandard;
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
     * Gets the value of the connectionInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTypeValues }
     * 
     * 
     */
    public List<ConnectionTypeValues> getConnectionInterface() {
        if (connectionInterface == null) {
            connectionInterface = new ArrayList<ConnectionTypeValues>();
        }
        return this.connectionInterface;
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
     * 获取numberOfUSBHubConnectorPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUSBHubConnectorPorts() {
        return numberOfUSBHubConnectorPorts;
    }

    /**
     * 设置numberOfUSBHubConnectorPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUSBHubConnectorPorts(BigInteger value) {
        this.numberOfUSBHubConnectorPorts = value;
    }

    /**
     * 获取pressureLevels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PressureLevelSixDigitIntegerDimension }
     *     
     */
    public PressureLevelSixDigitIntegerDimension getPressureLevels() {
        return pressureLevels;
    }

    /**
     * 设置pressureLevels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PressureLevelSixDigitIntegerDimension }
     *     
     */
    public void setPressureLevels(PressureLevelSixDigitIntegerDimension value) {
        this.pressureLevels = value;
    }

    /**
     * 获取tabletMaximumDataRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TabletDataRateDimension }
     *     
     */
    public TabletDataRateDimension getTabletMaximumDataRate() {
        return tabletMaximumDataRate;
    }

    /**
     * 设置tabletMaximumDataRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TabletDataRateDimension }
     *     
     */
    public void setTabletMaximumDataRate(TabletDataRateDimension value) {
        this.tabletMaximumDataRate = value;
    }

    /**
     * 获取tabletMinimumSystemRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabletMinimumSystemRequirements() {
        return tabletMinimumSystemRequirements;
    }

    /**
     * 设置tabletMinimumSystemRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabletMinimumSystemRequirements(String value) {
        this.tabletMinimumSystemRequirements = value;
    }

    /**
     * 获取tabletResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TabletResolutionDimension }
     *     
     */
    public TabletResolutionDimension getTabletResolution() {
        return tabletResolution;
    }

    /**
     * 设置tabletResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TabletResolutionDimension }
     *     
     */
    public void setTabletResolution(TabletResolutionDimension value) {
        this.tabletResolution = value;
    }

    /**
     * 获取tabletSurfaceActiveArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TabletActiveSurfaceAreaDimension }
     *     
     */
    public TabletActiveSurfaceAreaDimension getTabletSurfaceActiveArea() {
        return tabletSurfaceActiveArea;
    }

    /**
     * 设置tabletSurfaceActiveArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TabletActiveSurfaceAreaDimension }
     *     
     */
    public void setTabletSurfaceActiveArea(TabletActiveSurfaceAreaDimension value) {
        this.tabletSurfaceActiveArea = value;
    }

    /**
     * 获取tvTunerMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeTenDigitIntegerDimension }
     *     
     */
    public MemorySizeTenDigitIntegerDimension getTVTunerMemory() {
        return tvTunerMemory;
    }

    /**
     * 设置tvTunerMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeTenDigitIntegerDimension }
     *     
     */
    public void setTVTunerMemory(MemorySizeTenDigitIntegerDimension value) {
        this.tvTunerMemory = value;
    }

    /**
     * Gets the value of the tvTunerVideoOutputInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tvTunerVideoOutputInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTVTunerVideoOutputInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTVTunerVideoOutputInterface() {
        if (tvTunerVideoOutputInterface == null) {
            tvTunerVideoOutputInterface = new ArrayList<String>();
        }
        return this.tvTunerVideoOutputInterface;
    }

    /**
     * 获取tvTunerVideoStandard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTVTunerVideoStandard() {
        return tvTunerVideoStandard;
    }

    /**
     * 设置tvTunerVideoStandard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTVTunerVideoStandard(String value) {
        this.tvTunerVideoStandard = value;
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
