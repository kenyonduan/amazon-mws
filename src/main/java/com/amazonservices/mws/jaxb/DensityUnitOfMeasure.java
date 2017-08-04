
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DensityUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DensityUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="grams_per_square_meter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DensityUnitOfMeasure")
@XmlEnum
public enum DensityUnitOfMeasure {

    @XmlEnumValue("grams_per_square_meter")
    GRAMS_PER_SQUARE_METER("grams_per_square_meter");
    private final String value;

    DensityUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DensityUnitOfMeasure fromValue(String v) {
        for (DensityUnitOfMeasure c: DensityUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
