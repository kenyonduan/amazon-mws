
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ForceUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ForceUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="newtons"/>
 *     &lt;enumeration value="Newton"/>
 *     &lt;enumeration value="pounds"/>
 *     &lt;enumeration value="kilograms"/>
 *     &lt;enumeration value="PSI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForceUnitOfMeasure")
@XmlEnum
public enum ForceUnitOfMeasure {

    @XmlEnumValue("newtons")
    NEWTONS("newtons"),
    @XmlEnumValue("Newton")
    NEWTON("Newton"),
    @XmlEnumValue("pounds")
    POUNDS("pounds"),
    @XmlEnumValue("kilograms")
    KILOGRAMS("kilograms"),
    PSI("PSI");
    private final String value;

    ForceUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForceUnitOfMeasure fromValue(String v) {
        for (ForceUnitOfMeasure c: ForceUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
