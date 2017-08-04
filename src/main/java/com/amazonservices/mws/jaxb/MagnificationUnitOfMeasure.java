
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MagnificationUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MagnificationUnitOfMeasure">
 *   &lt;restriction base="{}String">
 *     &lt;enumeration value="multiplier_x"/>
 *     &lt;enumeration value="diopters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MagnificationUnitOfMeasure")
@XmlEnum
public enum MagnificationUnitOfMeasure {

    @XmlEnumValue("multiplier_x")
    MULTIPLIER_X("multiplier_x"),
    @XmlEnumValue("diopters")
    DIOPTERS("diopters");
    private final String value;

    MagnificationUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MagnificationUnitOfMeasure fromValue(String v) {
        for (MagnificationUnitOfMeasure c: MagnificationUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
