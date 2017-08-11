
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MotorSizeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MotorSizeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="horsepower"/>
 *     &lt;enumeration value="kilowatts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MotorSizeUnitOfMeasure")
@XmlEnum
public enum MotorSizeUnitOfMeasure {

    @XmlEnumValue("horsepower")
    HORSEPOWER("horsepower"),
    @XmlEnumValue("kilowatts")
    KILOWATTS("kilowatts");
    private final String value;

    MotorSizeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MotorSizeUnitOfMeasure fromValue(String v) {
        for (MotorSizeUnitOfMeasure c: MotorSizeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
