
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LuminousIntensityUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LuminousIntensityUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="candela"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuminousIntensityUnitOfMeasure")
@XmlEnum
public enum LuminousIntensityUnitOfMeasure {

    @XmlEnumValue("candela")
    CANDELA("candela");
    private final String value;

    LuminousIntensityUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuminousIntensityUnitOfMeasure fromValue(String v) {
        for (LuminousIntensityUnitOfMeasure c: LuminousIntensityUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
