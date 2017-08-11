
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OptionalVoltageUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OptionalVoltageUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="volts"/>
 *     &lt;enumeration value="millivolts"/>
 *     &lt;enumeration value="microvolts"/>
 *     &lt;enumeration value="nanovolts"/>
 *     &lt;enumeration value="kilovolts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionalVoltageUnitOfMeasure")
@XmlEnum
public enum OptionalVoltageUnitOfMeasure {

    @XmlEnumValue("volts")
    VOLTS("volts"),
    @XmlEnumValue("millivolts")
    MILLIVOLTS("millivolts"),
    @XmlEnumValue("microvolts")
    MICROVOLTS("microvolts"),
    @XmlEnumValue("nanovolts")
    NANOVOLTS("nanovolts"),
    @XmlEnumValue("kilovolts")
    KILOVOLTS("kilovolts");
    private final String value;

    OptionalVoltageUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OptionalVoltageUnitOfMeasure fromValue(String v) {
        for (OptionalVoltageUnitOfMeasure c: OptionalVoltageUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
