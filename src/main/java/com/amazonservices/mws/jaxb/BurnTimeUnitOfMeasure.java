
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BurnTimeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BurnTimeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="minutes"/>
 *     &lt;enumeration value="hours"/>
 *     &lt;enumeration value="cycles"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BurnTimeUnitOfMeasure")
@XmlEnum
public enum BurnTimeUnitOfMeasure {

    @XmlEnumValue("minutes")
    MINUTES("minutes"),
    @XmlEnumValue("hours")
    HOURS("hours"),
    @XmlEnumValue("cycles")
    CYCLES("cycles");
    private final String value;

    BurnTimeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BurnTimeUnitOfMeasure fromValue(String v) {
        for (BurnTimeUnitOfMeasure c: BurnTimeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
