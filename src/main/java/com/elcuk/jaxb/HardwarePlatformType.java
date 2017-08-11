
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HardwarePlatformType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HardwarePlatformType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="linux"/>
 *     &lt;enumeration value="mac"/>
 *     &lt;enumeration value="windows"/>
 *     &lt;enumeration value="unix"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HardwarePlatformType")
@XmlEnum
public enum HardwarePlatformType {

    @XmlEnumValue("linux")
    LINUX("linux"),
    @XmlEnumValue("mac")
    MAC("mac"),
    @XmlEnumValue("windows")
    WINDOWS("windows"),
    @XmlEnumValue("unix")
    UNIX("unix");
    private final String value;

    HardwarePlatformType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HardwarePlatformType fromValue(String v) {
        for (HardwarePlatformType c: HardwarePlatformType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
