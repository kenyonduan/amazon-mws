
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaxDataSubtype complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxDataSubtype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="District" type="{}CurrencyAmount"/>
 *         &lt;element name="City" type="{}CurrencyAmount"/>
 *         &lt;element name="County" type="{}CurrencyAmount"/>
 *         &lt;element name="State" type="{}CurrencyAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDataSubtype", propOrder = {
    "district",
    "city",
    "county",
    "state"
})
public class TaxDataSubtype {

    @XmlElement(name = "District", required = true)
    protected CurrencyAmount district;
    @XmlElement(name = "City", required = true)
    protected CurrencyAmount city;
    @XmlElement(name = "County", required = true)
    protected CurrencyAmount county;
    @XmlElement(name = "State", required = true)
    protected CurrencyAmount state;

    /**
     * 获取district属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getDistrict() {
        return district;
    }

    /**
     * 设置district属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setDistrict(CurrencyAmount value) {
        this.district = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setCity(CurrencyAmount value) {
        this.city = value;
    }

    /**
     * 获取county属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getCounty() {
        return county;
    }

    /**
     * 设置county属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setCounty(CurrencyAmount value) {
        this.county = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setState(CurrencyAmount value) {
        this.state = value;
    }

}
