
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PixelUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PixelUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pixels"/>
 *     &lt;enumeration value="MP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PixelUnitOfMeasure")
@XmlEnum
public enum PixelUnitOfMeasure {

    @XmlEnumValue("pixels")
    PIXELS("pixels"),
    MP("MP");
    private final String value;

    PixelUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PixelUnitOfMeasure fromValue(String v) {
        for (PixelUnitOfMeasure c: PixelUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
