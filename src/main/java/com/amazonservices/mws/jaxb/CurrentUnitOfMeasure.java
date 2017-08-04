
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CurrentUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CurrentUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mA"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrentUnitOfMeasure")
@XmlEnum
public enum CurrentUnitOfMeasure {

    @XmlEnumValue("mA")
    M_A("mA"),
    A("A");
    private final String value;

    CurrentUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrentUnitOfMeasure fromValue(String v) {
        for (CurrentUnitOfMeasure c: CurrentUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
