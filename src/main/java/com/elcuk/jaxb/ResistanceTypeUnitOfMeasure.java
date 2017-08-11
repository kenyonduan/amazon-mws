
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResistanceTypeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ResistanceTypeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pounds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResistanceTypeUnitOfMeasure")
@XmlEnum
public enum ResistanceTypeUnitOfMeasure {

    @XmlEnumValue("pounds")
    POUNDS("pounds");
    private final String value;

    ResistanceTypeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResistanceTypeUnitOfMeasure fromValue(String v) {
        for (ResistanceTypeUnitOfMeasure c: ResistanceTypeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
