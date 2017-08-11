
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HeadsetStyleValue的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HeadsetStyleValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="over-the-ear"/>
 *     &lt;enumeration value="behind-the-ear"/>
 *     &lt;enumeration value="in-the-ear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeadsetStyleValue")
@XmlEnum
public enum HeadsetStyleValue {

    @XmlEnumValue("over-the-ear")
    OVER_THE_EAR("over-the-ear"),
    @XmlEnumValue("behind-the-ear")
    BEHIND_THE_EAR("behind-the-ear"),
    @XmlEnumValue("in-the-ear")
    IN_THE_EAR("in-the-ear");
    private final String value;

    HeadsetStyleValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeadsetStyleValue fromValue(String v) {
        for (HeadsetStyleValue c: HeadsetStyleValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
