
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WirelessInputDeviceTechnologyTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WirelessInputDeviceTechnologyTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bluetooth"/>
 *     &lt;enumeration value="infrared"/>
 *     &lt;enumeration value="ps/2"/>
 *     &lt;enumeration value="radio_frequency"/>
 *     &lt;enumeration value="usb"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WirelessInputDeviceTechnologyTypeValues")
@XmlEnum
public enum WirelessInputDeviceTechnologyTypeValues {

    @XmlEnumValue("bluetooth")
    BLUETOOTH("bluetooth"),
    @XmlEnumValue("infrared")
    INFRARED("infrared"),
    @XmlEnumValue("ps/2")
    PS_2("ps/2"),
    @XmlEnumValue("radio_frequency")
    RADIO_FREQUENCY("radio_frequency"),
    @XmlEnumValue("usb")
    USB("usb");
    private final String value;

    WirelessInputDeviceTechnologyTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WirelessInputDeviceTechnologyTypeValues fromValue(String v) {
        for (WirelessInputDeviceTechnologyTypeValues c: WirelessInputDeviceTechnologyTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
