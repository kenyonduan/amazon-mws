
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SpeedClassRatingTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedClassRatingTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="class_10"/>
 *     &lt;enumeration value="class_2"/>
 *     &lt;enumeration value="class_4"/>
 *     &lt;enumeration value="class_6"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpeedClassRatingTypeValues")
@XmlEnum
public enum SpeedClassRatingTypeValues {

    @XmlEnumValue("class_10")
    CLASS_10("class_10"),
    @XmlEnumValue("class_2")
    CLASS_2("class_2"),
    @XmlEnumValue("class_4")
    CLASS_4("class_4"),
    @XmlEnumValue("class_6")
    CLASS_6("class_6");
    private final String value;

    SpeedClassRatingTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedClassRatingTypeValues fromValue(String v) {
        for (SpeedClassRatingTypeValues c: SpeedClassRatingTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
