
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatteryLifeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BatteryLifeUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="minutes"/>
 *     &lt;enumeration value="hours"/>
 *     &lt;enumeration value="days"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatteryLifeUnitOfMeasure")
@XmlEnum
public enum BatteryLifeUnitOfMeasure {

    @XmlEnumValue("minutes")
    MINUTES("minutes"),
    @XmlEnumValue("hours")
    HOURS("hours"),
    @XmlEnumValue("days")
    DAYS("days");
    private final String value;

    BatteryLifeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatteryLifeUnitOfMeasure fromValue(String v) {
        for (BatteryLifeUnitOfMeasure c: BatteryLifeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
