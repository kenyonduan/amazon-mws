
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HumanInterfaceOutputType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HumanInterfaceOutputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="screen"/>
 *     &lt;enumeration value="speaker"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HumanInterfaceOutputType")
@XmlEnum
public enum HumanInterfaceOutputType {

    @XmlEnumValue("screen")
    SCREEN("screen"),
    @XmlEnumValue("speaker")
    SPEAKER("speaker");
    private final String value;

    HumanInterfaceOutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HumanInterfaceOutputType fromValue(String v) {
        for (HumanInterfaceOutputType c: HumanInterfaceOutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
