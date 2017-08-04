
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LengthUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LengthUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="FT"/>
 *     &lt;enumeration value="inches"/>
 *     &lt;enumeration value="feet"/>
 *     &lt;enumeration value="meters"/>
 *     &lt;enumeration value="decimeters"/>
 *     &lt;enumeration value="centimeters"/>
 *     &lt;enumeration value="millimeters"/>
 *     &lt;enumeration value="micrometers"/>
 *     &lt;enumeration value="nanometers"/>
 *     &lt;enumeration value="picometers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthUnitOfMeasure")
@XmlEnum
public enum LengthUnitOfMeasure {

    MM("MM"),
    CM("CM"),
    M("M"),
    IN("IN"),
    FT("FT"),
    @XmlEnumValue("inches")
    INCHES("inches"),
    @XmlEnumValue("feet")
    FEET("feet"),
    @XmlEnumValue("meters")
    METERS("meters"),
    @XmlEnumValue("decimeters")
    DECIMETERS("decimeters"),
    @XmlEnumValue("centimeters")
    CENTIMETERS("centimeters"),
    @XmlEnumValue("millimeters")
    MILLIMETERS("millimeters"),
    @XmlEnumValue("micrometers")
    MICROMETERS("micrometers"),
    @XmlEnumValue("nanometers")
    NANOMETERS("nanometers"),
    @XmlEnumValue("picometers")
    PICOMETERS("picometers");
    private final String value;

    LengthUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthUnitOfMeasure fromValue(String v) {
        for (LengthUnitOfMeasure c: LengthUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
