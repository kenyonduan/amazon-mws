
package com.amazonservices.mws.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>TaxData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxJurisdictions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TaxLocationCode" type="{}String"/>
 *                   &lt;element name="City" type="{}String"/>
 *                   &lt;element name="County" type="{}String"/>
 *                   &lt;element name="State" type="{}String"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxableAmounts" type="{}TaxDataSubtype"/>
 *         &lt;element name="NonTaxableAmounts" type="{}TaxDataSubtype"/>
 *         &lt;element name="ZeroRatedAmounts" type="{}TaxDataSubtype"/>
 *         &lt;element name="TaxCollectedAmounts" type="{}TaxDataSubtype"/>
 *         &lt;element name="TaxRates">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="District" type="{}TaxRate"/>
 *                   &lt;element name="City" type="{}TaxRate"/>
 *                   &lt;element name="County" type="{}TaxRate"/>
 *                   &lt;element name="State" type="{}TaxRate"/>
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
@XmlType(name = "TaxData", propOrder = {
    "taxJurisdictions",
    "taxableAmounts",
    "nonTaxableAmounts",
    "zeroRatedAmounts",
    "taxCollectedAmounts",
    "taxRates"
})
public class TaxData {

    @XmlElement(name = "TaxJurisdictions", required = true)
    protected TaxJurisdictions taxJurisdictions;
    @XmlElement(name = "TaxableAmounts", required = true)
    protected TaxDataSubtype taxableAmounts;
    @XmlElement(name = "NonTaxableAmounts", required = true)
    protected TaxDataSubtype nonTaxableAmounts;
    @XmlElement(name = "ZeroRatedAmounts", required = true)
    protected TaxDataSubtype zeroRatedAmounts;
    @XmlElement(name = "TaxCollectedAmounts", required = true)
    protected TaxDataSubtype taxCollectedAmounts;
    @XmlElement(name = "TaxRates", required = true)
    protected TaxRates taxRates;

    /**
     * 获取taxJurisdictions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictions }
     *     
     */
    public TaxJurisdictions getTaxJurisdictions() {
        return taxJurisdictions;
    }

    /**
     * 设置taxJurisdictions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictions }
     *     
     */
    public void setTaxJurisdictions(TaxJurisdictions value) {
        this.taxJurisdictions = value;
    }

    /**
     * 获取taxableAmounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxDataSubtype }
     *     
     */
    public TaxDataSubtype getTaxableAmounts() {
        return taxableAmounts;
    }

    /**
     * 设置taxableAmounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataSubtype }
     *     
     */
    public void setTaxableAmounts(TaxDataSubtype value) {
        this.taxableAmounts = value;
    }

    /**
     * 获取nonTaxableAmounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxDataSubtype }
     *     
     */
    public TaxDataSubtype getNonTaxableAmounts() {
        return nonTaxableAmounts;
    }

    /**
     * 设置nonTaxableAmounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataSubtype }
     *     
     */
    public void setNonTaxableAmounts(TaxDataSubtype value) {
        this.nonTaxableAmounts = value;
    }

    /**
     * 获取zeroRatedAmounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxDataSubtype }
     *     
     */
    public TaxDataSubtype getZeroRatedAmounts() {
        return zeroRatedAmounts;
    }

    /**
     * 设置zeroRatedAmounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataSubtype }
     *     
     */
    public void setZeroRatedAmounts(TaxDataSubtype value) {
        this.zeroRatedAmounts = value;
    }

    /**
     * 获取taxCollectedAmounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxDataSubtype }
     *     
     */
    public TaxDataSubtype getTaxCollectedAmounts() {
        return taxCollectedAmounts;
    }

    /**
     * 设置taxCollectedAmounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDataSubtype }
     *     
     */
    public void setTaxCollectedAmounts(TaxDataSubtype value) {
        this.taxCollectedAmounts = value;
    }

    /**
     * 获取taxRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxRates }
     *     
     */
    public TaxRates getTaxRates() {
        return taxRates;
    }

    /**
     * 设置taxRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRates }
     *     
     */
    public void setTaxRates(TaxRates value) {
        this.taxRates = value;
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
     *         &lt;element name="TaxLocationCode" type="{}String"/>
     *         &lt;element name="City" type="{}String"/>
     *         &lt;element name="County" type="{}String"/>
     *         &lt;element name="State" type="{}String"/>
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
        "taxLocationCode",
        "city",
        "county",
        "state"
    })
    public static class TaxJurisdictions {

        @XmlElement(name = "TaxLocationCode", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String taxLocationCode;
        @XmlElement(name = "City", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String city;
        @XmlElement(name = "County", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String county;
        @XmlElement(name = "State", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String state;

        /**
         * 获取taxLocationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxLocationCode() {
            return taxLocationCode;
        }

        /**
         * 设置taxLocationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxLocationCode(String value) {
            this.taxLocationCode = value;
        }

        /**
         * 获取city属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * 设置city属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * 获取county属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCounty() {
            return county;
        }

        /**
         * 设置county属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCounty(String value) {
            this.county = value;
        }

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

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
     *         &lt;element name="District" type="{}TaxRate"/>
     *         &lt;element name="City" type="{}TaxRate"/>
     *         &lt;element name="County" type="{}TaxRate"/>
     *         &lt;element name="State" type="{}TaxRate"/>
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
        "district",
        "city",
        "county",
        "state"
    })
    public static class TaxRates {

        @XmlElement(name = "District", required = true)
        protected BigDecimal district;
        @XmlElement(name = "City", required = true)
        protected BigDecimal city;
        @XmlElement(name = "County", required = true)
        protected BigDecimal county;
        @XmlElement(name = "State", required = true)
        protected BigDecimal state;

        /**
         * 获取district属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDistrict() {
            return district;
        }

        /**
         * 设置district属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDistrict(BigDecimal value) {
            this.district = value;
        }

        /**
         * 获取city属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCity() {
            return city;
        }

        /**
         * 设置city属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCity(BigDecimal value) {
            this.city = value;
        }

        /**
         * 获取county属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCounty() {
            return county;
        }

        /**
         * 设置county属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCounty(BigDecimal value) {
            this.county = value;
        }

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setState(BigDecimal value) {
            this.state = value;
        }

    }

}
