
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnergyUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BTU"/>
 *     &lt;enumeration value="watts"/>
 *     &lt;enumeration value="joules"/>
 *     &lt;enumeration value="kilojoules"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyUnitOfMeasure")
@XmlEnum
public enum EnergyUnitOfMeasure {

    BTU("BTU"),
    @XmlEnumValue("watts")
    WATTS("watts"),
    @XmlEnumValue("joules")
    JOULES("joules"),
    @XmlEnumValue("kilojoules")
    KILOJOULES("kilojoules");
    private final String value;

    EnergyUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyUnitOfMeasure fromValue(String v) {
        for (EnergyUnitOfMeasure c: EnergyUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
