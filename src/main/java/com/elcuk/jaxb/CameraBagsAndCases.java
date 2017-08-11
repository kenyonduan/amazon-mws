
package com.elcuk.jaxb;

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
 *         &lt;element ref="{}BoxContents" minOccurs="0"/>
 *         &lt;element ref="{}MaxWeightCapacity" minOccurs="0"/>
 *         &lt;element ref="{}PowerPlugType" minOccurs="0"/>
 *         &lt;element ref="{}WaterResistantLevel" minOccurs="0"/>
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
    "boxContents",
    "maxWeightCapacity",
    "powerPlugType",
    "waterResistantLevel",
    "wirelessTechnology",
    "efficiency"
})
@XmlRootElement(name = "CameraBagsAndCases")
public class CameraBagsAndCases {

    @XmlElement(name = "BoxContents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String boxContents;
    @XmlElement(name = "MaxWeightCapacity")
    protected WeightDimension maxWeightCapacity;
    @XmlElement(name = "PowerPlugType")
    @XmlSchemaType(name = "normalizedString")
    protected PowerPlugType powerPlugType;
    @XmlElement(name = "WaterResistantLevel")
    @XmlSchemaType(name = "string")
    protected WaterResistantType waterResistantLevel;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * 获取boxContents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxContents() {
        return boxContents;
    }

    /**
     * 设置boxContents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxContents(String value) {
        this.boxContents = value;
    }

    /**
     * 获取maxWeightCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    /**
     * 设置maxWeightCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaxWeightCapacity(WeightDimension value) {
        this.maxWeightCapacity = value;
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
     * 获取waterResistantLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WaterResistantType }
     *     
     */
    public WaterResistantType getWaterResistantLevel() {
        return waterResistantLevel;
    }

    /**
     * 设置waterResistantLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WaterResistantType }
     *     
     */
    public void setWaterResistantLevel(WaterResistantType value) {
        this.waterResistantLevel = value;
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
