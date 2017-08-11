
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AntennaTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AntennaTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="internal"/>
 *     &lt;enumeration value="retractable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AntennaTypeValues")
@XmlEnum
public enum AntennaTypeValues {

    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("internal")
    INTERNAL("internal"),
    @XmlEnumValue("retractable")
    RETRACTABLE("retractable");
    private final String value;

    AntennaTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AntennaTypeValues fromValue(String v) {
        for (AntennaTypeValues c: AntennaTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
