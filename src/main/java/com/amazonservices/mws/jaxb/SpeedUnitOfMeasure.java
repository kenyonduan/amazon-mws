
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SpeedUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedUnitOfMeasure">
 *   &lt;restriction base="{}String">
 *     &lt;enumeration value="feet_per_minute"/>
 *     &lt;enumeration value="miles_per_hour"/>
 *     &lt;enumeration value="kilometers_per_hour"/>
 *     &lt;enumeration value="RPM"/>
 *     &lt;enumeration value="RPS"/>
 *     &lt;enumeration value="meters per second"/>
 *     &lt;enumeration value="centimeters per second"/>
 *     &lt;enumeration value="millimeters per second"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpeedUnitOfMeasure")
@XmlEnum
public enum SpeedUnitOfMeasure {

    @XmlEnumValue("feet_per_minute")
    FEET_PER_MINUTE("feet_per_minute"),
    @XmlEnumValue("miles_per_hour")
    MILES_PER_HOUR("miles_per_hour"),
    @XmlEnumValue("kilometers_per_hour")
    KILOMETERS_PER_HOUR("kilometers_per_hour"),
    RPM("RPM"),
    RPS("RPS"),
    @XmlEnumValue("meters per second")
    METERS_PER_SECOND("meters per second"),
    @XmlEnumValue("centimeters per second")
    CENTIMETERS_PER_SECOND("centimeters per second"),
    @XmlEnumValue("millimeters per second")
    MILLIMETERS_PER_SECOND("millimeters per second");
    private final String value;

    SpeedUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedUnitOfMeasure fromValue(String v) {
        for (SpeedUnitOfMeasure c: SpeedUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
