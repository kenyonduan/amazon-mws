
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CarSeatWeightGroupEUType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CarSeatWeightGroupEUType">
 *   &lt;restriction base="{}MediumStringNotNull">
 *     &lt;enumeration value="group_zero"/>
 *     &lt;enumeration value="group_zero_plus"/>
 *     &lt;enumeration value="group_one"/>
 *     &lt;enumeration value="group_two"/>
 *     &lt;enumeration value="group_three"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarSeatWeightGroupEUType")
@XmlEnum
public enum CarSeatWeightGroupEUType {

    @XmlEnumValue("group_zero")
    GROUP_ZERO("group_zero"),
    @XmlEnumValue("group_zero_plus")
    GROUP_ZERO_PLUS("group_zero_plus"),
    @XmlEnumValue("group_one")
    GROUP_ONE("group_one"),
    @XmlEnumValue("group_two")
    GROUP_TWO("group_two"),
    @XmlEnumValue("group_three")
    GROUP_THREE("group_three");
    private final String value;

    CarSeatWeightGroupEUType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarSeatWeightGroupEUType fromValue(String v) {
        for (CarSeatWeightGroupEUType c: CarSeatWeightGroupEUType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
