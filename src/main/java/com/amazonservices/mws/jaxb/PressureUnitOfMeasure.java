
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PressureUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PressureUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bars"/>
 *     &lt;enumeration value="psi"/>
 *     &lt;enumeration value="pascal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressureUnitOfMeasure")
@XmlEnum
public enum PressureUnitOfMeasure {

    @XmlEnumValue("bars")
    BARS("bars"),
    @XmlEnumValue("psi")
    PSI("psi"),
    @XmlEnumValue("pascal")
    PASCAL("pascal");
    private final String value;

    PressureUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PressureUnitOfMeasure fromValue(String v) {
        for (PressureUnitOfMeasure c: PressureUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
