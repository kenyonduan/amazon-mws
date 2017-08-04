
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MillimeterUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MillimeterUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="millimeters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MillimeterUnitOfMeasure")
@XmlEnum
public enum MillimeterUnitOfMeasure {

    @XmlEnumValue("millimeters")
    MILLIMETERS("millimeters");
    private final String value;

    MillimeterUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MillimeterUnitOfMeasure fromValue(String v) {
        for (MillimeterUnitOfMeasure c: MillimeterUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
