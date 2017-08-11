
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LumensUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LumensUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="Lumens"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LumensUnitOfMeasure")
@XmlEnum
public enum LumensUnitOfMeasure {

    @XmlEnumValue("Lumens")
    LUMENS("Lumens");
    private final String value;

    LumensUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LumensUnitOfMeasure fromValue(String v) {
        for (LumensUnitOfMeasure c: LumensUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
