
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CapacityUnitMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CapacityUnitMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cubic_centimeters"/>
 *     &lt;enumeration value="cubic_feet"/>
 *     &lt;enumeration value="cubic_inches"/>
 *     &lt;enumeration value="cubic_meters"/>
 *     &lt;enumeration value="cubic_yards"/>
 *     &lt;enumeration value="cups"/>
 *     &lt;enumeration value="fluid_ounces"/>
 *     &lt;enumeration value="gallons"/>
 *     &lt;enumeration value="imperial_gallons"/>
 *     &lt;enumeration value="liters"/>
 *     &lt;enumeration value="milliliters"/>
 *     &lt;enumeration value="ounces"/>
 *     &lt;enumeration value="pints"/>
 *     &lt;enumeration value="quarts"/>
 *     &lt;enumeration value="deciliters"/>
 *     &lt;enumeration value="centiliters"/>
 *     &lt;enumeration value="microliters"/>
 *     &lt;enumeration value="nanoliters"/>
 *     &lt;enumeration value="picoliters"/>
 *     &lt;enumeration value="grams"/>
 *     &lt;enumeration value="kilograms"/>
 *     &lt;enumeration value="ounces"/>
 *     &lt;enumeration value="pounds"/>
 *     &lt;enumeration value="milligrams"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CapacityUnitMeasure")
@XmlEnum
public enum CapacityUnitMeasure {

    @XmlEnumValue("cubic_centimeters")
    CUBIC_CENTIMETERS("cubic_centimeters"),
    @XmlEnumValue("cubic_feet")
    CUBIC_FEET("cubic_feet"),
    @XmlEnumValue("cubic_inches")
    CUBIC_INCHES("cubic_inches"),
    @XmlEnumValue("cubic_meters")
    CUBIC_METERS("cubic_meters"),
    @XmlEnumValue("cubic_yards")
    CUBIC_YARDS("cubic_yards"),
    @XmlEnumValue("cups")
    CUPS("cups"),
    @XmlEnumValue("fluid_ounces")
    FLUID_OUNCES("fluid_ounces"),
    @XmlEnumValue("gallons")
    GALLONS("gallons"),
    @XmlEnumValue("imperial_gallons")
    IMPERIAL_GALLONS("imperial_gallons"),
    @XmlEnumValue("liters")
    LITERS("liters"),
    @XmlEnumValue("milliliters")
    MILLILITERS("milliliters"),
    @XmlEnumValue("ounces")
    OUNCES("ounces"),
    @XmlEnumValue("pints")
    PINTS("pints"),
    @XmlEnumValue("quarts")
    QUARTS("quarts"),
    @XmlEnumValue("deciliters")
    DECILITERS("deciliters"),
    @XmlEnumValue("centiliters")
    CENTILITERS("centiliters"),
    @XmlEnumValue("microliters")
    MICROLITERS("microliters"),
    @XmlEnumValue("nanoliters")
    NANOLITERS("nanoliters"),
    @XmlEnumValue("picoliters")
    PICOLITERS("picoliters"),
    @XmlEnumValue("grams")
    GRAMS("grams"),
    @XmlEnumValue("kilograms")
    KILOGRAMS("kilograms"),
    @XmlEnumValue("pounds")
    POUNDS("pounds"),
    @XmlEnumValue("milligrams")
    MILLIGRAMS("milligrams");
    private final String value;

    CapacityUnitMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapacityUnitMeasure fromValue(String v) {
        for (CapacityUnitMeasure c: CapacityUnitMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
