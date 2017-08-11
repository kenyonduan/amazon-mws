
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SoundLevelUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SoundLevelUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="Sone"/>
 *     &lt;enumeration value="Sones"/>
 *     &lt;enumeration value="decibel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SoundLevelUnitOfMeasure")
@XmlEnum
public enum SoundLevelUnitOfMeasure {

    @XmlEnumValue("Sone")
    SONE("Sone"),
    @XmlEnumValue("Sones")
    SONES("Sones"),
    @XmlEnumValue("decibel")
    DECIBEL("decibel");
    private final String value;

    SoundLevelUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoundLevelUnitOfMeasure fromValue(String v) {
        for (SoundLevelUnitOfMeasure c: SoundLevelUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
