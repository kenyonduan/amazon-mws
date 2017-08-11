
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HazmatItemType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HazmatItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="butane"/>
 *     &lt;enumeration value="fuel_cell"/>
 *     &lt;enumeration value="gasoline"/>
 *     &lt;enumeration value="orm_d_class_1"/>
 *     &lt;enumeration value="orm_d_class_2"/>
 *     &lt;enumeration value="orm_d_class_3"/>
 *     &lt;enumeration value="orm_d_class_4"/>
 *     &lt;enumeration value="orm_d_class_5"/>
 *     &lt;enumeration value="orm_d_class_6"/>
 *     &lt;enumeration value="orm_d_class_7"/>
 *     &lt;enumeration value="orm_d_class_8"/>
 *     &lt;enumeration value="orm_d_class_9"/>
 *     &lt;enumeration value="sealed_lead_acid_battery"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HazmatItemType")
@XmlEnum
public enum HazmatItemType {

    @XmlEnumValue("butane")
    BUTANE("butane"),
    @XmlEnumValue("fuel_cell")
    FUEL_CELL("fuel_cell"),
    @XmlEnumValue("gasoline")
    GASOLINE("gasoline"),
    @XmlEnumValue("orm_d_class_1")
    ORM_D_CLASS_1("orm_d_class_1"),
    @XmlEnumValue("orm_d_class_2")
    ORM_D_CLASS_2("orm_d_class_2"),
    @XmlEnumValue("orm_d_class_3")
    ORM_D_CLASS_3("orm_d_class_3"),
    @XmlEnumValue("orm_d_class_4")
    ORM_D_CLASS_4("orm_d_class_4"),
    @XmlEnumValue("orm_d_class_5")
    ORM_D_CLASS_5("orm_d_class_5"),
    @XmlEnumValue("orm_d_class_6")
    ORM_D_CLASS_6("orm_d_class_6"),
    @XmlEnumValue("orm_d_class_7")
    ORM_D_CLASS_7("orm_d_class_7"),
    @XmlEnumValue("orm_d_class_8")
    ORM_D_CLASS_8("orm_d_class_8"),
    @XmlEnumValue("orm_d_class_9")
    ORM_D_CLASS_9("orm_d_class_9"),
    @XmlEnumValue("sealed_lead_acid_battery")
    SEALED_LEAD_ACID_BATTERY("sealed_lead_acid_battery"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    HazmatItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HazmatItemType fromValue(String v) {
        for (HazmatItemType c: HazmatItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
