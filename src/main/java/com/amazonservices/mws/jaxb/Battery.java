
package com.amazonservices.mws.jaxb;

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
 *         &lt;element name="AreBatteriesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AreBatteriesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BatterySubgroup" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BatteryType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{}StringNotNull">
 *                         &lt;enumeration value="battery_type_2/3A"/>
 *                         &lt;enumeration value="battery_type_4/3A"/>
 *                         &lt;enumeration value="battery_type_4/5A"/>
 *                         &lt;enumeration value="battery_type_9v"/>
 *                         &lt;enumeration value="battery_type_12v"/>
 *                         &lt;enumeration value="battery_type_a"/>
 *                         &lt;enumeration value="battery_type_a76"/>
 *                         &lt;enumeration value="battery_type_aa"/>
 *                         &lt;enumeration value="battery_type_aaa"/>
 *                         &lt;enumeration value="battery_type_aaaa"/>
 *                         &lt;enumeration value="battery_type_c"/>
 *                         &lt;enumeration value="battery_type_cr123a"/>
 *                         &lt;enumeration value="battery_type_cr2"/>
 *                         &lt;enumeration value="battery_type_cr5"/>
 *                         &lt;enumeration value="battery_type_d"/>
 *                         &lt;enumeration value="battery_type_lithium_ion"/>
 *                         &lt;enumeration value="battery_type_lithium_metal"/>
 *                         &lt;enumeration value="battery_type_L-SC"/>
 *                         &lt;enumeration value="battery_type_p76"/>
 *                         &lt;enumeration value="battery_type_product_specific"/>
 *                         &lt;enumeration value="battery_type_SC"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NumberOfBatteries" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "areBatteriesIncluded",
    "areBatteriesRequired",
    "batterySubgroup"
})
@XmlRootElement(name = "Battery")
public class Battery {

    @XmlElement(name = "AreBatteriesIncluded")
    protected Boolean areBatteriesIncluded;
    @XmlElement(name = "AreBatteriesRequired")
    protected Boolean areBatteriesRequired;
    @XmlElement(name = "BatterySubgroup")
    protected List<BatterySubgroup> batterySubgroup;

    /**
     * 获取areBatteriesIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreBatteriesIncluded() {
        return areBatteriesIncluded;
    }

    /**
     * 设置areBatteriesIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreBatteriesIncluded(Boolean value) {
        this.areBatteriesIncluded = value;
    }

    /**
     * 获取areBatteriesRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreBatteriesRequired() {
        return areBatteriesRequired;
    }

    /**
     * 设置areBatteriesRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreBatteriesRequired(Boolean value) {
        this.areBatteriesRequired = value;
    }

    /**
     * Gets the value of the batterySubgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batterySubgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatterySubgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatterySubgroup }
     * 
     * 
     */
    public List<BatterySubgroup> getBatterySubgroup() {
        if (batterySubgroup == null) {
            batterySubgroup = new ArrayList<BatterySubgroup>();
        }
        return this.batterySubgroup;
    }


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
     *         &lt;element name="BatteryType">
     *           &lt;simpleType>
     *             &lt;restriction base="{}StringNotNull">
     *               &lt;enumeration value="battery_type_2/3A"/>
     *               &lt;enumeration value="battery_type_4/3A"/>
     *               &lt;enumeration value="battery_type_4/5A"/>
     *               &lt;enumeration value="battery_type_9v"/>
     *               &lt;enumeration value="battery_type_12v"/>
     *               &lt;enumeration value="battery_type_a"/>
     *               &lt;enumeration value="battery_type_a76"/>
     *               &lt;enumeration value="battery_type_aa"/>
     *               &lt;enumeration value="battery_type_aaa"/>
     *               &lt;enumeration value="battery_type_aaaa"/>
     *               &lt;enumeration value="battery_type_c"/>
     *               &lt;enumeration value="battery_type_cr123a"/>
     *               &lt;enumeration value="battery_type_cr2"/>
     *               &lt;enumeration value="battery_type_cr5"/>
     *               &lt;enumeration value="battery_type_d"/>
     *               &lt;enumeration value="battery_type_lithium_ion"/>
     *               &lt;enumeration value="battery_type_lithium_metal"/>
     *               &lt;enumeration value="battery_type_L-SC"/>
     *               &lt;enumeration value="battery_type_p76"/>
     *               &lt;enumeration value="battery_type_product_specific"/>
     *               &lt;enumeration value="battery_type_SC"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NumberOfBatteries" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
        "batteryType",
        "numberOfBatteries"
    })
    public static class BatterySubgroup {

        @XmlElement(name = "BatteryType", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String batteryType;
        @XmlElement(name = "NumberOfBatteries", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numberOfBatteries;

        /**
         * 获取batteryType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBatteryType() {
            return batteryType;
        }

        /**
         * 设置batteryType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBatteryType(String value) {
            this.batteryType = value;
        }

        /**
         * 获取numberOfBatteries属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumberOfBatteries() {
            return numberOfBatteries;
        }

        /**
         * 设置numberOfBatteries属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumberOfBatteries(BigInteger value) {
            this.numberOfBatteries = value;
        }

    }

}
