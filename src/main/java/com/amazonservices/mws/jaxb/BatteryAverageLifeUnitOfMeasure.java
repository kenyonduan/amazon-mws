
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatteryAverageLifeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BatteryAverageLifeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="minutes"/>
 *     &lt;enumeration value="hours"/>
 *     &lt;enumeration value="days"/>
 *     &lt;enumeration value="weeks"/>
 *     &lt;enumeration value="months"/>
 *     &lt;enumeration value="years"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatteryAverageLifeUnitOfMeasure")
@XmlEnum
public enum BatteryAverageLifeUnitOfMeasure {

    @XmlEnumValue("minutes")
    MINUTES("minutes"),
    @XmlEnumValue("hours")
    HOURS("hours"),
    @XmlEnumValue("days")
    DAYS("days"),
    @XmlEnumValue("weeks")
    WEEKS("weeks"),
    @XmlEnumValue("months")
    MONTHS("months"),
    @XmlEnumValue("years")
    YEARS("years");
    private final String value;

    BatteryAverageLifeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatteryAverageLifeUnitOfMeasure fromValue(String v) {
        for (BatteryAverageLifeUnitOfMeasure c: BatteryAverageLifeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
