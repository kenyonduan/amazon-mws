
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WirelessCarrierTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WirelessCarrierTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="att "/>
 *     &lt;enumeration value="sprintpcs"/>
 *     &lt;enumeration value="t_mobile"/>
 *     &lt;enumeration value="verizon"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WirelessCarrierTypeValues")
@XmlEnum
public enum WirelessCarrierTypeValues {

    @XmlEnumValue("att ")
    ATT("att "),
    @XmlEnumValue("sprintpcs")
    SPRINTPCS("sprintpcs"),
    @XmlEnumValue("t_mobile")
    T_MOBILE("t_mobile"),
    @XmlEnumValue("verizon")
    VERIZON("verizon");
    private final String value;

    WirelessCarrierTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WirelessCarrierTypeValues fromValue(String v) {
        for (WirelessCarrierTypeValues c: WirelessCarrierTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
