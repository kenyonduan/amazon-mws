
package com.amazonservices.mws.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>CurrencyAmount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CurrencyAmount">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>BaseCurrencyAmount">
 *       &lt;attribute name="currency" use="required" type="{}BaseCurrencyCode" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyAmount", propOrder = {
    "value"
})
public class CurrencyAmount {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "currency", required = true)
    protected BaseCurrencyCode currency;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseCurrencyCode }
     *     
     */
    public BaseCurrencyCode getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCurrencyCode }
     *     
     */
    public void setCurrency(BaseCurrencyCode value) {
        this.currency = value;
    }

}
