
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MaxEthernetSpeedTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MaxEthernetSpeedTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ethernet_10base_t"/>
 *     &lt;enumeration value="ethernet_100base_t"/>
 *     &lt;enumeration value="ethernet_100base_tx"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaxEthernetSpeedTypeValues")
@XmlEnum
public enum MaxEthernetSpeedTypeValues {

    @XmlEnumValue("ethernet_10base_t")
    ETHERNET_10_BASE_T("ethernet_10base_t"),
    @XmlEnumValue("ethernet_100base_t")
    ETHERNET_100_BASE_T("ethernet_100base_t"),
    @XmlEnumValue("ethernet_100base_tx")
    ETHERNET_100_BASE_TX("ethernet_100base_tx");
    private final String value;

    MaxEthernetSpeedTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaxEthernetSpeedTypeValues fromValue(String v) {
        for (MaxEthernetSpeedTypeValues c: MaxEthernetSpeedTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
