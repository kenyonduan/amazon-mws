
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FlowRateUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FlowRateUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="GallonsPerMinute"/>
 *     &lt;enumeration value="GallonsPerHour"/>
 *     &lt;enumeration value="CyclesPerGallon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlowRateUnitOfMeasure")
@XmlEnum
public enum FlowRateUnitOfMeasure {

    @XmlEnumValue("GallonsPerMinute")
    GALLONS_PER_MINUTE("GallonsPerMinute"),
    @XmlEnumValue("GallonsPerHour")
    GALLONS_PER_HOUR("GallonsPerHour"),
    @XmlEnumValue("CyclesPerGallon")
    CYCLES_PER_GALLON("CyclesPerGallon");
    private final String value;

    FlowRateUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowRateUnitOfMeasure fromValue(String v) {
        for (FlowRateUnitOfMeasure c: FlowRateUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
