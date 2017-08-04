
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VoltageUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VoltageUnitOfMeasure">
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
@XmlType(name = "VoltageUnitOfMeasure")
@XmlEnum
public enum VoltageUnitOfMeasure {

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

    VoltageUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoltageUnitOfMeasure fromValue(String v) {
        for (VoltageUnitOfMeasure c: VoltageUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
