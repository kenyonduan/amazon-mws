
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WaterResistantType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WaterResistantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="not_water_resistant"/>
 *     &lt;enumeration value="water_resistant"/>
 *     &lt;enumeration value="waterproof"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WaterResistantType")
@XmlEnum
public enum WaterResistantType {

    @XmlEnumValue("not_water_resistant")
    NOT_WATER_RESISTANT("not_water_resistant"),
    @XmlEnumValue("water_resistant")
    WATER_RESISTANT("water_resistant"),
    @XmlEnumValue("waterproof")
    WATERPROOF("waterproof");
    private final String value;

    WaterResistantType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WaterResistantType fromValue(String v) {
        for (WaterResistantType c: WaterResistantType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
