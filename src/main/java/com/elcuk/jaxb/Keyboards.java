
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
 *         &lt;element ref="{}HandOrientation" minOccurs="0"/>
 *         &lt;element ref="{}InputDeviceDesignStyle" minOccurs="0"/>
 *         &lt;element ref="{}KeyboardDescription" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
 *         &lt;element ref="{}WirelessInputDeviceProtocol" minOccurs="0"/>
 *         &lt;element ref="{}WirelessInputDeviceTechnology" minOccurs="0"/>
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
    "handOrientation",
    "inputDeviceDesignStyle",
    "keyboardDescription",
    "modelNumber",
    "voltage",
    "wattage",
    "wirelessInputDeviceProtocol",
    "wirelessInputDeviceTechnology"
})
@XmlRootElement(name = "Keyboards")
public class Keyboards {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "HandOrientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String handOrientation;
    @XmlElement(name = "InputDeviceDesignStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String inputDeviceDesignStyle;
    @XmlElement(name = "KeyboardDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String keyboardDescription;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
    @XmlElement(name = "WirelessInputDeviceProtocol")
    protected String wirelessInputDeviceProtocol;
    @XmlElement(name = "WirelessInputDeviceTechnology")
    @XmlSchemaType(name = "string")
    protected WirelessInputDeviceTechnologyTypeValues wirelessInputDeviceTechnology;

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
     * 获取handOrientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandOrientation() {
        return handOrientation;
    }

    /**
     * 设置handOrientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandOrientation(String value) {
        this.handOrientation = value;
    }

    /**
     * 获取inputDeviceDesignStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputDeviceDesignStyle() {
        return inputDeviceDesignStyle;
    }

    /**
     * 设置inputDeviceDesignStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputDeviceDesignStyle(String value) {
        this.inputDeviceDesignStyle = value;
    }

    /**
     * 获取keyboardDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyboardDescription() {
        return keyboardDescription;
    }

    /**
     * 设置keyboardDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyboardDescription(String value) {
        this.keyboardDescription = value;
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
     * 获取wirelessInputDeviceProtocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessInputDeviceProtocol() {
        return wirelessInputDeviceProtocol;
    }

    /**
     * 设置wirelessInputDeviceProtocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessInputDeviceProtocol(String value) {
        this.wirelessInputDeviceProtocol = value;
    }

    /**
     * 获取wirelessInputDeviceTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WirelessInputDeviceTechnologyTypeValues }
     *     
     */
    public WirelessInputDeviceTechnologyTypeValues getWirelessInputDeviceTechnology() {
        return wirelessInputDeviceTechnology;
    }

    /**
     * 设置wirelessInputDeviceTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessInputDeviceTechnologyTypeValues }
     *     
     */
    public void setWirelessInputDeviceTechnology(WirelessInputDeviceTechnologyTypeValues value) {
        this.wirelessInputDeviceTechnology = value;
    }

}
