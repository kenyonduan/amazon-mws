
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FrequencyUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FrequencyUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hz"/>
 *     &lt;enumeration value="KHz"/>
 *     &lt;enumeration value="MHz"/>
 *     &lt;enumeration value="GHz"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FrequencyUnitOfMeasure")
@XmlEnum
public enum FrequencyUnitOfMeasure {

    @XmlEnumValue("Hz")
    HZ("Hz"),
    @XmlEnumValue("KHz")
    K_HZ("KHz"),
    @XmlEnumValue("MHz")
    M_HZ("MHz"),
    @XmlEnumValue("GHz")
    G_HZ("GHz");
    private final String value;

    FrequencyUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FrequencyUnitOfMeasure fromValue(String v) {
        for (FrequencyUnitOfMeasure c: FrequencyUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
