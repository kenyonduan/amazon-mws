
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SweetnessAtHarvestUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SweetnessAtHarvestUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="brix"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SweetnessAtHarvestUnitOfMeasure")
@XmlEnum
public enum SweetnessAtHarvestUnitOfMeasure {

    @XmlEnumValue("brix")
    BRIX("brix");
    private final String value;

    SweetnessAtHarvestUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SweetnessAtHarvestUnitOfMeasure fromValue(String v) {
        for (SweetnessAtHarvestUnitOfMeasure c: SweetnessAtHarvestUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
