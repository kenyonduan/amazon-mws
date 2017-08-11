
package com.elcuk.jaxb;

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
 *         &lt;element ref="{}BatteryCellType" minOccurs="0"/>
 *         &lt;element name="BatteryChargeCycles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}BatteryPower" minOccurs="0"/>
 *         &lt;element name="CableLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}PowerPlugType" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="RemoteControlDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="WirelessTechnology" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
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
    "batteryCellType",
    "batteryChargeCycles",
    "batteryPower",
    "cableLength",
    "finishType",
    "powerPlugType",
    "powerSource",
    "remoteControlDescription",
    "screenSize",
    "wirelessTechnology",
    "efficiency"
})
@XmlRootElement(name = "RemoteControl")
public class RemoteControl {

    @XmlElement(name = "BatteryCellType")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellType;
    @XmlElement(name = "BatteryChargeCycles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryChargeCycles;
    @XmlElement(name = "BatteryPower")
    protected BatteryPowerIntegerDimension batteryPower;
    @XmlElement(name = "CableLength")
    protected LengthDimension cableLength;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "PowerPlugType")
    @XmlSchemaType(name = "normalizedString")
    protected PowerPlugType powerPlugType;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "RemoteControlDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteControlDescription;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * 获取batteryCellType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public BatteryCellTypeValues getBatteryCellType() {
        return batteryCellType;
    }

    /**
     * 设置batteryCellType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public void setBatteryCellType(BatteryCellTypeValues value) {
        this.batteryCellType = value;
    }

    /**
     * 获取batteryChargeCycles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryChargeCycles() {
        return batteryChargeCycles;
    }

    /**
     * 设置batteryChargeCycles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryChargeCycles(BigInteger value) {
        this.batteryChargeCycles = value;
    }

    /**
     * 获取batteryPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public BatteryPowerIntegerDimension getBatteryPower() {
        return batteryPower;
    }

    /**
     * 设置batteryPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public void setBatteryPower(BatteryPowerIntegerDimension value) {
        this.batteryPower = value;
    }

    /**
     * 获取cableLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCableLength() {
        return cableLength;
    }

    /**
     * 设置cableLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCableLength(LengthDimension value) {
        this.cableLength = value;
    }

    /**
     * 获取finishType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishType() {
        return finishType;
    }

    /**
     * 设置finishType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishType(String value) {
        this.finishType = value;
    }

    /**
     * 获取powerPlugType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerPlugType }
     *     
     */
    public PowerPlugType getPowerPlugType() {
        return powerPlugType;
    }

    /**
     * 设置powerPlugType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerPlugType }
     *     
     */
    public void setPowerPlugType(PowerPlugType value) {
        this.powerPlugType = value;
    }

    /**
     * 获取powerSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * 设置powerSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSource(String value) {
        this.powerSource = value;
    }

    /**
     * 获取remoteControlDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteControlDescription() {
        return remoteControlDescription;
    }

    /**
     * 设置remoteControlDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteControlDescription(String value) {
        this.remoteControlDescription = value;
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
     * Gets the value of the wirelessTechnology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessTechnology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessTechnology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWirelessTechnology() {
        if (wirelessTechnology == null) {
            wirelessTechnology = new ArrayList<String>();
        }
        return this.wirelessTechnology;
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
