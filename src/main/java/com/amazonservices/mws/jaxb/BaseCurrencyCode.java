
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BaseCurrencyCode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BaseCurrencyCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="MXN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaseCurrencyCode")
@XmlEnum
public enum BaseCurrencyCode {

    USD,
    GBP,
    EUR,
    JPY,
    CAD,
    CNY,
    INR,
    MXN;

    public String value() {
        return name();
    }

    public static BaseCurrencyCode fromValue(String v) {
        return valueOf(v);
    }

}
