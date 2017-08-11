
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HeadsetTypeValue的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HeadsetTypeValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="one-ear"/>
 *     &lt;enumeration value="two-ear"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HeadsetTypeValue")
@XmlEnum
public enum HeadsetTypeValue {

    @XmlEnumValue("one-ear")
    ONE_EAR("one-ear"),
    @XmlEnumValue("two-ear")
    TWO_EAR("two-ear");
    private final String value;

    HeadsetTypeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HeadsetTypeValue fromValue(String v) {
        for (HeadsetTypeValue c: HeadsetTypeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
