
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AreaUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AreaUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="square-in"/>
 *     &lt;enumeration value="square-ft"/>
 *     &lt;enumeration value="square-cm"/>
 *     &lt;enumeration value="square-m"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaUnitOfMeasure")
@XmlEnum
public enum AreaUnitOfMeasure {

    @XmlEnumValue("square-in")
    SQUARE_IN("square-in"),
    @XmlEnumValue("square-ft")
    SQUARE_FT("square-ft"),
    @XmlEnumValue("square-cm")
    SQUARE_CM("square-cm"),
    @XmlEnumValue("square-m")
    SQUARE_M("square-m");
    private final String value;

    AreaUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaUnitOfMeasure fromValue(String v) {
        for (AreaUnitOfMeasure c: AreaUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
