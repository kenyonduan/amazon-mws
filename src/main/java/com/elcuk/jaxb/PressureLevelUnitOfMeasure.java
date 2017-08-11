
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PressureLevelUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PressureLevelUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="levels"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressureLevelUnitOfMeasure")
@XmlEnum
public enum PressureLevelUnitOfMeasure {

    @XmlEnumValue("levels")
    LEVELS("levels");
    private final String value;

    PressureLevelUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressureLevelUnitOfMeasure fromValue(String v) {
        for (PressureLevelUnitOfMeasure c: PressureLevelUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
