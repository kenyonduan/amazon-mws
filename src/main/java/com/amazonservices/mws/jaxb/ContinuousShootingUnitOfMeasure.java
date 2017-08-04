
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContinuousShootingUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ContinuousShootingUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="frames"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContinuousShootingUnitOfMeasure")
@XmlEnum
public enum ContinuousShootingUnitOfMeasure {

    @XmlEnumValue("frames")
    FRAMES("frames");
    private final String value;

    ContinuousShootingUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContinuousShootingUnitOfMeasure fromValue(String v) {
        for (ContinuousShootingUnitOfMeasure c: ContinuousShootingUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
