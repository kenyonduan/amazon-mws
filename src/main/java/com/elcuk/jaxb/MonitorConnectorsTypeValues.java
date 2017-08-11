
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MonitorConnectorsTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MonitorConnectorsTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="audio_video_port"/>
 *     &lt;enumeration value="dmi"/>
 *     &lt;enumeration value="ethernet"/>
 *     &lt;enumeration value="gameport"/>
 *     &lt;enumeration value="hdmi"/>
 *     &lt;enumeration value="ieee_1394"/>
 *     &lt;enumeration value="ps/2"/>
 *     &lt;enumeration value="serial_interface"/>
 *     &lt;enumeration value="usb2.0"/>
 *     &lt;enumeration value="usb3.0"/>
 *     &lt;enumeration value="vga"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonitorConnectorsTypeValues")
@XmlEnum
public enum MonitorConnectorsTypeValues {

    @XmlEnumValue("audio_video_port")
    AUDIO_VIDEO_PORT("audio_video_port"),
    @XmlEnumValue("dmi")
    DMI("dmi"),
    @XmlEnumValue("ethernet")
    ETHERNET("ethernet"),
    @XmlEnumValue("gameport")
    GAMEPORT("gameport"),
    @XmlEnumValue("hdmi")
    HDMI("hdmi"),
    @XmlEnumValue("ieee_1394")
    IEEE_1394("ieee_1394"),
    @XmlEnumValue("ps/2")
    PS_2("ps/2"),
    @XmlEnumValue("serial_interface")
    SERIAL_INTERFACE("serial_interface"),
    @XmlEnumValue("usb2.0")
    USB_2_0("usb2.0"),
    @XmlEnumValue("usb3.0")
    USB_3_0("usb3.0"),
    @XmlEnumValue("vga")
    VGA("vga");
    private final String value;

    MonitorConnectorsTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonitorConnectorsTypeValues fromValue(String v) {
        for (MonitorConnectorsTypeValues c: MonitorConnectorsTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
