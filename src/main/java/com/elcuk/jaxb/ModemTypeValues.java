
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ModemTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ModemTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="analog_modem"/>
 *     &lt;enumeration value="data_fax_voice"/>
 *     &lt;enumeration value="isdn_modem"/>
 *     &lt;enumeration value="cable"/>
 *     &lt;enumeration value="data_modem"/>
 *     &lt;enumeration value="network_modem"/>
 *     &lt;enumeration value="cellular"/>
 *     &lt;enumeration value="digital"/>
 *     &lt;enumeration value="unknown_modem_type"/>
 *     &lt;enumeration value="csu"/>
 *     &lt;enumeration value="dsl"/>
 *     &lt;enumeration value="voice"/>
 *     &lt;enumeration value="data_fax"/>
 *     &lt;enumeration value="dsu"/>
 *     &lt;enumeration value="winmodem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModemTypeValues")
@XmlEnum
public enum ModemTypeValues {

    @XmlEnumValue("analog_modem")
    ANALOG_MODEM("analog_modem"),
    @XmlEnumValue("data_fax_voice")
    DATA_FAX_VOICE("data_fax_voice"),
    @XmlEnumValue("isdn_modem")
    ISDN_MODEM("isdn_modem"),
    @XmlEnumValue("cable")
    CABLE("cable"),
    @XmlEnumValue("data_modem")
    DATA_MODEM("data_modem"),
    @XmlEnumValue("network_modem")
    NETWORK_MODEM("network_modem"),
    @XmlEnumValue("cellular")
    CELLULAR("cellular"),
    @XmlEnumValue("digital")
    DIGITAL("digital"),
    @XmlEnumValue("unknown_modem_type")
    UNKNOWN_MODEM_TYPE("unknown_modem_type"),
    @XmlEnumValue("csu")
    CSU("csu"),
    @XmlEnumValue("dsl")
    DSL("dsl"),
    @XmlEnumValue("voice")
    VOICE("voice"),
    @XmlEnumValue("data_fax")
    DATA_FAX("data_fax"),
    @XmlEnumValue("dsu")
    DSU("dsu"),
    @XmlEnumValue("winmodem")
    WINMODEM("winmodem");
    private final String value;

    ModemTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModemTypeValues fromValue(String v) {
        for (ModemTypeValues c: ModemTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}