
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PowerUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PowerUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="watts"/>
 *     &lt;enumeration value="kilowatts"/>
 *     &lt;enumeration value="horsepower"/>
 *     &lt;enumeration value="watts-per-sec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PowerUnitOfMeasure")
@XmlEnum
public enum PowerUnitOfMeasure {

    @XmlEnumValue("watts")
    WATTS("watts"),
    @XmlEnumValue("kilowatts")
    KILOWATTS("kilowatts"),
    @XmlEnumValue("horsepower")
    HORSEPOWER("horsepower"),
    @XmlEnumValue("watts-per-sec")
    WATTS_PER_SEC("watts-per-sec");
    private final String value;

    PowerUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerUnitOfMeasure fromValue(String v) {
        for (PowerUnitOfMeasure c: PowerUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
