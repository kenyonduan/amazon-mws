
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ComputerPlatformValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ComputerPlatformValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="game_boy_advance"/>
 *     &lt;enumeration value="gameboy"/>
 *     &lt;enumeration value="gameboy_color"/>
 *     &lt;enumeration value="gamecube"/>
 *     &lt;enumeration value="gizmondo"/>
 *     &lt;enumeration value="linux"/>
 *     &lt;enumeration value="macintosh"/>
 *     &lt;enumeration value="n_gage"/>
 *     &lt;enumeration value="nintendo_ds"/>
 *     &lt;enumeration value="nintendo_NES"/>
 *     &lt;enumeration value="nintendo_super_NES"/>
 *     &lt;enumeration value="nintendo_wii"/>
 *     &lt;enumeration value="nintendo64"/>
 *     &lt;enumeration value="palm"/>
 *     &lt;enumeration value="playstation"/>
 *     &lt;enumeration value="playstation_2"/>
 *     &lt;enumeration value="playstation_vita"/>
 *     &lt;enumeration value="pocket_pc"/>
 *     &lt;enumeration value="powermac"/>
 *     &lt;enumeration value="sega_saturn"/>
 *     &lt;enumeration value="sony_psp"/>
 *     &lt;enumeration value="super_nintendo"/>
 *     &lt;enumeration value="unix"/>
 *     &lt;enumeration value="windows"/>
 *     &lt;enumeration value="xbox"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComputerPlatformValues")
@XmlEnum
public enum ComputerPlatformValues {

    @XmlEnumValue("game_boy_advance")
    GAME_BOY_ADVANCE("game_boy_advance"),
    @XmlEnumValue("gameboy")
    GAMEBOY("gameboy"),
    @XmlEnumValue("gameboy_color")
    GAMEBOY_COLOR("gameboy_color"),
    @XmlEnumValue("gamecube")
    GAMECUBE("gamecube"),
    @XmlEnumValue("gizmondo")
    GIZMONDO("gizmondo"),
    @XmlEnumValue("linux")
    LINUX("linux"),
    @XmlEnumValue("macintosh")
    MACINTOSH("macintosh"),
    @XmlEnumValue("n_gage")
    N_GAGE("n_gage"),
    @XmlEnumValue("nintendo_ds")
    NINTENDO_DS("nintendo_ds"),
    @XmlEnumValue("nintendo_NES")
    NINTENDO_NES("nintendo_NES"),
    @XmlEnumValue("nintendo_super_NES")
    NINTENDO_SUPER_NES("nintendo_super_NES"),
    @XmlEnumValue("nintendo_wii")
    NINTENDO_WII("nintendo_wii"),
    @XmlEnumValue("nintendo64")
    NINTENDO_64("nintendo64"),
    @XmlEnumValue("palm")
    PALM("palm"),
    @XmlEnumValue("playstation")
    PLAYSTATION("playstation"),
    @XmlEnumValue("playstation_2")
    PLAYSTATION_2("playstation_2"),
    @XmlEnumValue("playstation_vita")
    PLAYSTATION_VITA("playstation_vita"),
    @XmlEnumValue("pocket_pc")
    POCKET_PC("pocket_pc"),
    @XmlEnumValue("powermac")
    POWERMAC("powermac"),
    @XmlEnumValue("sega_saturn")
    SEGA_SATURN("sega_saturn"),
    @XmlEnumValue("sony_psp")
    SONY_PSP("sony_psp"),
    @XmlEnumValue("super_nintendo")
    SUPER_NINTENDO("super_nintendo"),
    @XmlEnumValue("unix")
    UNIX("unix"),
    @XmlEnumValue("windows")
    WINDOWS("windows"),
    @XmlEnumValue("xbox")
    XBOX("xbox");
    private final String value;

    ComputerPlatformValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComputerPlatformValues fromValue(String v) {
        for (ComputerPlatformValues c: ComputerPlatformValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
