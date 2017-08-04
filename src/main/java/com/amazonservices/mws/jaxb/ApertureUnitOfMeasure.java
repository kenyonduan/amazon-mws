
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ApertureUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ApertureUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="f"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApertureUnitOfMeasure")
@XmlEnum
public enum ApertureUnitOfMeasure {

    @XmlEnumValue("f")
    F("f");
    private final String value;

    ApertureUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApertureUnitOfMeasure fromValue(String v) {
        for (ApertureUnitOfMeasure c: ApertureUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
