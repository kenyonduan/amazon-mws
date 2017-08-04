
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResolutionUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ResolutionUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="megapixels"/>
 *     &lt;enumeration value="pixels"/>
 *     &lt;enumeration value="lines_per_inch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResolutionUnitOfMeasure")
@XmlEnum
public enum ResolutionUnitOfMeasure {

    @XmlEnumValue("megapixels")
    MEGAPIXELS("megapixels"),
    @XmlEnumValue("pixels")
    PIXELS("pixels"),
    @XmlEnumValue("lines_per_inch")
    LINES_PER_INCH("lines_per_inch");
    private final String value;

    ResolutionUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResolutionUnitOfMeasure fromValue(String v) {
        for (ResolutionUnitOfMeasure c: ResolutionUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
