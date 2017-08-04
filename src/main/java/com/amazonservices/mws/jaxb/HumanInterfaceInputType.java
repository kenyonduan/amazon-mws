
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HumanInterfaceInputType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="HumanInterfaceInputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="buttons"/>
 *     &lt;enumeration value="dial"/>
 *     &lt;enumeration value="handwriting_recognition"/>
 *     &lt;enumeration value="keyboard"/>
 *     &lt;enumeration value="keypad"/>
 *     &lt;enumeration value="keypad_stroke"/>
 *     &lt;enumeration value="keypad_stroke"/>
 *     &lt;enumeration value="microphone"/>
 *     &lt;enumeration value="touch_screen"/>
 *     &lt;enumeration value="touch_screen_stylus_pen"/>
 *     &lt;enumeration value="trackpoint_pointing_device"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HumanInterfaceInputType")
@XmlEnum
public enum HumanInterfaceInputType {

    @XmlEnumValue("buttons")
    BUTTONS("buttons"),
    @XmlEnumValue("dial")
    DIAL("dial"),
    @XmlEnumValue("handwriting_recognition")
    HANDWRITING_RECOGNITION("handwriting_recognition"),
    @XmlEnumValue("keyboard")
    KEYBOARD("keyboard"),
    @XmlEnumValue("keypad")
    KEYPAD("keypad"),
    @XmlEnumValue("keypad_stroke")
    KEYPAD_STROKE("keypad_stroke"),
    @XmlEnumValue("microphone")
    MICROPHONE("microphone"),
    @XmlEnumValue("touch_screen")
    TOUCH_SCREEN("touch_screen"),
    @XmlEnumValue("touch_screen_stylus_pen")
    TOUCH_SCREEN_STYLUS_PEN("touch_screen_stylus_pen"),
    @XmlEnumValue("trackpoint_pointing_device")
    TRACKPOINT_POINTING_DEVICE("trackpoint_pointing_device");
    private final String value;

    HumanInterfaceInputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HumanInterfaceInputType fromValue(String v) {
        for (HumanInterfaceInputType c: HumanInterfaceInputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
