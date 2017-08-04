
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BootSizeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BootSizeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adult_us"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BootSizeUnitOfMeasure")
@XmlEnum
public enum BootSizeUnitOfMeasure {

    @XmlEnumValue("adult_us")
    ADULT_US("adult_us");
    private final String value;

    BootSizeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BootSizeUnitOfMeasure fromValue(String v) {
        for (BootSizeUnitOfMeasure c: BootSizeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
