
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OutputPowerUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OutputPowerUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="watts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputPowerUnitOfMeasure")
@XmlEnum
public enum OutputPowerUnitOfMeasure {

    @XmlEnumValue("watts")
    WATTS("watts");
    private final String value;

    OutputPowerUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputPowerUnitOfMeasure fromValue(String v) {
        for (OutputPowerUnitOfMeasure c: OutputPowerUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
