
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MemoryInterfaceUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MemoryInterfaceUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bits"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemoryInterfaceUnitOfMeasure")
@XmlEnum
public enum MemoryInterfaceUnitOfMeasure {

    @XmlEnumValue("bits")
    BITS("bits");
    private final String value;

    MemoryInterfaceUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MemoryInterfaceUnitOfMeasure fromValue(String v) {
        for (MemoryInterfaceUnitOfMeasure c: MemoryInterfaceUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
