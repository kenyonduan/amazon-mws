
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LuminanceUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LuminanceUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lumens"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LuminanceUnitOfMeasure")
@XmlEnum
public enum LuminanceUnitOfMeasure {

    @XmlEnumValue("lumens")
    LUMENS("lumens");
    private final String value;

    LuminanceUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LuminanceUnitOfMeasure fromValue(String v) {
        for (LuminanceUnitOfMeasure c: LuminanceUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
