
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServingUnit的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ServingUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="percent-fda"/>
 *     &lt;enumeration value="mg"/>
 *     &lt;enumeration value="gr"/>
 *     &lt;enumeration value="ml"/>
 *     &lt;enumeration value="grams"/>
 *     &lt;enumeration value="milligrams"/>
 *     &lt;enumeration value="milliliters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServingUnit")
@XmlEnum
public enum ServingUnit {

    @XmlEnumValue("percent-fda")
    PERCENT_FDA("percent-fda"),
    @XmlEnumValue("mg")
    MG("mg"),
    @XmlEnumValue("gr")
    GR("gr"),
    @XmlEnumValue("ml")
    ML("ml"),
    @XmlEnumValue("grams")
    GRAMS("grams"),
    @XmlEnumValue("milligrams")
    MILLIGRAMS("milligrams"),
    @XmlEnumValue("milliliters")
    MILLILITERS("milliliters");
    private final String value;

    ServingUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServingUnit fromValue(String v) {
        for (ServingUnit c: ServingUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
