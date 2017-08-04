
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LithiumBatteryPackagingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="LithiumBatteryPackagingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="batteries_contained_in_equipment"/>
 *     &lt;enumeration value="batteries_only"/>
 *     &lt;enumeration value="batteries_packed_with_equipment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LithiumBatteryPackagingType")
@XmlEnum
public enum LithiumBatteryPackagingType {

    @XmlEnumValue("batteries_contained_in_equipment")
    BATTERIES_CONTAINED_IN_EQUIPMENT("batteries_contained_in_equipment"),
    @XmlEnumValue("batteries_only")
    BATTERIES_ONLY("batteries_only"),
    @XmlEnumValue("batteries_packed_with_equipment")
    BATTERIES_PACKED_WITH_EQUIPMENT("batteries_packed_with_equipment");
    private final String value;

    LithiumBatteryPackagingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LithiumBatteryPackagingType fromValue(String v) {
        for (LithiumBatteryPackagingType c: LithiumBatteryPackagingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
