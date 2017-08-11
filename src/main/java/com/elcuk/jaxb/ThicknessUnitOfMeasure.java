
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ThicknessUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ThicknessUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="gauge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThicknessUnitOfMeasure")
@XmlEnum
public enum ThicknessUnitOfMeasure {

    IN("IN"),
    CM("CM"),
    MM("MM"),
    @XmlEnumValue("gauge")
    GAUGE("gauge");
    private final String value;

    ThicknessUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThicknessUnitOfMeasure fromValue(String v) {
        for (ThicknessUnitOfMeasure c: ThicknessUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
