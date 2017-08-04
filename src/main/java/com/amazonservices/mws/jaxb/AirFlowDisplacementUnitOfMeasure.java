
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirFlowDisplacementUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AirFlowDisplacementUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cubic_feet_per_minute"/>
 *     &lt;enumeration value="cubic_feet_per_hour"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirFlowDisplacementUnitOfMeasure")
@XmlEnum
public enum AirFlowDisplacementUnitOfMeasure {

    @XmlEnumValue("cubic_feet_per_minute")
    CUBIC_FEET_PER_MINUTE("cubic_feet_per_minute"),
    @XmlEnumValue("cubic_feet_per_hour")
    CUBIC_FEET_PER_HOUR("cubic_feet_per_hour");
    private final String value;

    AirFlowDisplacementUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirFlowDisplacementUnitOfMeasure fromValue(String v) {
        for (AirFlowDisplacementUnitOfMeasure c: AirFlowDisplacementUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
