
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
 *         &lt;element ref="{}NumberOfSpeakers" minOccurs="0"/>
 *         &lt;element ref="{}MaximumWattage" minOccurs="0"/>
 *         &lt;element name="WirelessTechnology" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
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
    "numberOfSpeakers",
    "maximumWattage",
    "wirelessTechnology"
})
@XmlRootElement(name = "StereoShelfSystem")
public class StereoShelfSystem {

    @XmlElement(name = "NumberOfSpeakers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSpeakers;
    @XmlElement(name = "MaximumWattage")
    protected WattageDimension maximumWattage;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;

    /**
     * 获取numberOfSpeakers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * 设置numberOfSpeakers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpeakers(BigInteger value) {
        this.numberOfSpeakers = value;
    }

    /**
     * 获取maximumWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getMaximumWattage() {
        return maximumWattage;
    }

    /**
     * 设置maximumWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setMaximumWattage(WattageDimension value) {
        this.maximumWattage = value;
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

}
