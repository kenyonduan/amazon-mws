
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VineyardYieldUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="VineyardYieldUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tons"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VineyardYieldUnitOfMeasure")
@XmlEnum
public enum VineyardYieldUnitOfMeasure {

    @XmlEnumValue("tons")
    TONS("tons");
    private final String value;

    VineyardYieldUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VineyardYieldUnitOfMeasure fromValue(String v) {
        for (VineyardYieldUnitOfMeasure c: VineyardYieldUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
