
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TargetGenderType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TargetGenderType">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="male"/>
 *     &lt;enumeration value="female"/>
 *     &lt;enumeration value="unisex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetGenderType")
@XmlEnum
public enum TargetGenderType {

    @XmlEnumValue("male")
    MALE("male"),
    @XmlEnumValue("female")
    FEMALE("female"),
    @XmlEnumValue("unisex")
    UNISEX("unisex");
    private final String value;

    TargetGenderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TargetGenderType fromValue(String v) {
        for (TargetGenderType c: TargetGenderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
