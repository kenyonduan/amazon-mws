
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatteryPowerUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BatteryPowerUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="milliamp_hours"/>
 *     &lt;enumeration value="amp_hours"/>
 *     &lt;enumeration value="volt_amperes"/>
 *     &lt;enumeration value="watt_hours"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatteryPowerUnitOfMeasure")
@XmlEnum
public enum BatteryPowerUnitOfMeasure {

    @XmlEnumValue("milliamp_hours")
    MILLIAMP_HOURS("milliamp_hours"),
    @XmlEnumValue("amp_hours")
    AMP_HOURS("amp_hours"),
    @XmlEnumValue("volt_amperes")
    VOLT_AMPERES("volt_amperes"),
    @XmlEnumValue("watt_hours")
    WATT_HOURS("watt_hours");
    private final String value;

    BatteryPowerUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatteryPowerUnitOfMeasure fromValue(String v) {
        for (BatteryPowerUnitOfMeasure c: BatteryPowerUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
