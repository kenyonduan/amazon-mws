
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InputVideoConnectorsTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="InputVideoConnectorsTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="component_video"/>
 *     &lt;enumeration value="composite_video"/>
 *     &lt;enumeration value="dvi_x_1"/>
 *     &lt;enumeration value="dvi_x_2"/>
 *     &lt;enumeration value="dvi_x_4"/>
 *     &lt;enumeration value="d_sub"/>
 *     &lt;enumeration value="hdmi"/>
 *     &lt;enumeration value="mini_hdmi"/>
 *     &lt;enumeration value="s_video"/>
 *     &lt;enumeration value="vga"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InputVideoConnectorsTypeValues")
@XmlEnum
public enum InputVideoConnectorsTypeValues {

    @XmlEnumValue("component_video")
    COMPONENT_VIDEO("component_video"),
    @XmlEnumValue("composite_video")
    COMPOSITE_VIDEO("composite_video"),
    @XmlEnumValue("dvi_x_1")
    DVI_X_1("dvi_x_1"),
    @XmlEnumValue("dvi_x_2")
    DVI_X_2("dvi_x_2"),
    @XmlEnumValue("dvi_x_4")
    DVI_X_4("dvi_x_4"),
    @XmlEnumValue("d_sub")
    D_SUB("d_sub"),
    @XmlEnumValue("hdmi")
    HDMI("hdmi"),
    @XmlEnumValue("mini_hdmi")
    MINI_HDMI("mini_hdmi"),
    @XmlEnumValue("s_video")
    S_VIDEO("s_video"),
    @XmlEnumValue("vga")
    VGA("vga");
    private final String value;

    InputVideoConnectorsTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputVideoConnectorsTypeValues fromValue(String v) {
        for (InputVideoConnectorsTypeValues c: InputVideoConnectorsTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
