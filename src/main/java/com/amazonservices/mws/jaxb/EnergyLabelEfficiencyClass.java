
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EnergyLabelEfficiencyClass的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EnergyLabelEfficiencyClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="b"/>
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="e"/>
 *     &lt;enumeration value="f"/>
 *     &lt;enumeration value="g"/>
 *     &lt;enumeration value="a_plus"/>
 *     &lt;enumeration value="a_plus_plus"/>
 *     &lt;enumeration value="a_plus_plus_plus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnergyLabelEfficiencyClass")
@XmlEnum
public enum EnergyLabelEfficiencyClass {

    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("b")
    B("b"),
    @XmlEnumValue("c")
    C("c"),
    @XmlEnumValue("d")
    D("d"),
    @XmlEnumValue("e")
    E("e"),
    @XmlEnumValue("f")
    F("f"),
    @XmlEnumValue("g")
    G("g"),
    @XmlEnumValue("a_plus")
    A_PLUS("a_plus"),
    @XmlEnumValue("a_plus_plus")
    A_PLUS_PLUS("a_plus_plus"),
    @XmlEnumValue("a_plus_plus_plus")
    A_PLUS_PLUS_PLUS("a_plus_plus_plus");
    private final String value;

    EnergyLabelEfficiencyClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnergyLabelEfficiencyClass fromValue(String v) {
        for (EnergyLabelEfficiencyClass c: EnergyLabelEfficiencyClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
