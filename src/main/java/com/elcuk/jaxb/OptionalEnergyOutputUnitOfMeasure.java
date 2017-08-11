
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OptionalEnergyOutputUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OptionalEnergyOutputUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="btu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionalEnergyOutputUnitOfMeasure")
@XmlEnum
public enum OptionalEnergyOutputUnitOfMeasure {

    @XmlEnumValue("btu")
    BTU("btu");
    private final String value;

    OptionalEnergyOutputUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptionalEnergyOutputUnitOfMeasure fromValue(String v) {
        for (OptionalEnergyOutputUnitOfMeasure c: OptionalEnergyOutputUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}