
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TabletResolutionUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TabletResolutionUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="lpi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TabletResolutionUnitOfMeasure")
@XmlEnum
public enum TabletResolutionUnitOfMeasure {

    @XmlEnumValue("lpi")
    LPI("lpi");
    private final String value;

    TabletResolutionUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TabletResolutionUnitOfMeasure fromValue(String v) {
        for (TabletResolutionUnitOfMeasure c: TabletResolutionUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
