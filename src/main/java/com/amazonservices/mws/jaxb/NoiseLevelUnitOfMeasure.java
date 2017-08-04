
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NoiseLevelUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NoiseLevelUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dBA"/>
 *     &lt;enumeration value="decibels"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoiseLevelUnitOfMeasure")
@XmlEnum
public enum NoiseLevelUnitOfMeasure {

    @XmlEnumValue("dBA")
    D_BA("dBA"),
    @XmlEnumValue("decibels")
    DECIBELS("decibels");
    private final String value;

    NoiseLevelUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoiseLevelUnitOfMeasure fromValue(String v) {
        for (NoiseLevelUnitOfMeasure c: NoiseLevelUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
