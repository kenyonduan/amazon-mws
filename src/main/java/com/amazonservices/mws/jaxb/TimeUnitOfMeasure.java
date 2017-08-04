
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TimeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sec"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="days"/>
 *     &lt;enumeration value="hours"/>
 *     &lt;enumeration value="minutes"/>
 *     &lt;enumeration value="seconds"/>
 *     &lt;enumeration value="milliseconds"/>
 *     &lt;enumeration value="microseconds"/>
 *     &lt;enumeration value="nanoseconds"/>
 *     &lt;enumeration value="picoseconds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeUnitOfMeasure")
@XmlEnum
public enum TimeUnitOfMeasure {

    @XmlEnumValue("sec")
    SEC("sec"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("days")
    DAYS("days"),
    @XmlEnumValue("hours")
    HOURS("hours"),
    @XmlEnumValue("minutes")
    MINUTES("minutes"),
    @XmlEnumValue("seconds")
    SECONDS("seconds"),
    @XmlEnumValue("milliseconds")
    MILLISECONDS("milliseconds"),
    @XmlEnumValue("microseconds")
    MICROSECONDS("microseconds"),
    @XmlEnumValue("nanoseconds")
    NANOSECONDS("nanoseconds"),
    @XmlEnumValue("picoseconds")
    PICOSECONDS("picoseconds");
    private final String value;

    TimeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeUnitOfMeasure fromValue(String v) {
        for (TimeUnitOfMeasure c: TimeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
