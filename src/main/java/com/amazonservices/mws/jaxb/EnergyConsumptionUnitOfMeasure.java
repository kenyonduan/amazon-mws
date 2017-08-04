
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnergyConsumptionUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyConsumptionUnitOfMeasure">
 *   &lt;restriction base="{}String">
 *     &lt;enumeration value="kilowatt_hours"/>
 *     &lt;enumeration value="btu"/>
 *     &lt;enumeration value="kilowatts"/>
 *     &lt;enumeration value="watt_hours"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyConsumptionUnitOfMeasure")
@XmlEnum
public enum EnergyConsumptionUnitOfMeasure {

    @XmlEnumValue("kilowatt_hours")
    KILOWATT_HOURS("kilowatt_hours"),
    @XmlEnumValue("btu")
    BTU("btu"),
    @XmlEnumValue("kilowatts")
    KILOWATTS("kilowatts"),
    @XmlEnumValue("watt_hours")
    WATT_HOURS("watt_hours");
    private final String value;

    EnergyConsumptionUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyConsumptionUnitOfMeasure fromValue(String v) {
        for (EnergyConsumptionUnitOfMeasure c: EnergyConsumptionUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
