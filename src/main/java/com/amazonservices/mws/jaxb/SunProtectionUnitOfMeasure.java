
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SunProtectionUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SunProtectionUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sun_protection_factor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SunProtectionUnitOfMeasure")
@XmlEnum
public enum SunProtectionUnitOfMeasure {

    @XmlEnumValue("sun_protection_factor")
    SUN_PROTECTION_FACTOR("sun_protection_factor");
    private final String value;

    SunProtectionUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SunProtectionUnitOfMeasure fromValue(String v) {
        for (SunProtectionUnitOfMeasure c: SunProtectionUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
