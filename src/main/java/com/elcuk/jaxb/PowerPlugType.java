
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PowerPlugType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PowerPlugType">
 *   &lt;restriction base="{}MediumStringNotNull">
 *     &lt;enumeration value="type_a_2pin_jp"/>
 *     &lt;enumeration value="type_e_2pin_fr"/>
 *     &lt;enumeration value="type_j_3pin_ch"/>
 *     &lt;enumeration value="type_a_2pin_na"/>
 *     &lt;enumeration value="type_ef_2pin_eu"/>
 *     &lt;enumeration value="type_k_3pin_dk"/>
 *     &lt;enumeration value="type_b_3pin_jp"/>
 *     &lt;enumeration value="type_f_2pin_de"/>
 *     &lt;enumeration value="type_l_3pin_it"/>
 *     &lt;enumeration value="type_b_3pin_na"/>
 *     &lt;enumeration value="type_g_3pin_uk"/>
 *     &lt;enumeration value="type_m_3pin_za"/>
 *     &lt;enumeration value="type_c_2pin_eu"/>
 *     &lt;enumeration value="type_h_3pin_il"/>
 *     &lt;enumeration value="type_n_3pin_br"/>
 *     &lt;enumeration value="type_d_3pin_in"/>
 *     &lt;enumeration value="type_i_3pin_au"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PowerPlugType")
@XmlEnum
public enum PowerPlugType {

    @XmlEnumValue("type_a_2pin_jp")
    TYPE_A_2_PIN_JP("type_a_2pin_jp"),
    @XmlEnumValue("type_e_2pin_fr")
    TYPE_E_2_PIN_FR("type_e_2pin_fr"),
    @XmlEnumValue("type_j_3pin_ch")
    TYPE_J_3_PIN_CH("type_j_3pin_ch"),
    @XmlEnumValue("type_a_2pin_na")
    TYPE_A_2_PIN_NA("type_a_2pin_na"),
    @XmlEnumValue("type_ef_2pin_eu")
    TYPE_EF_2_PIN_EU("type_ef_2pin_eu"),
    @XmlEnumValue("type_k_3pin_dk")
    TYPE_K_3_PIN_DK("type_k_3pin_dk"),
    @XmlEnumValue("type_b_3pin_jp")
    TYPE_B_3_PIN_JP("type_b_3pin_jp"),
    @XmlEnumValue("type_f_2pin_de")
    TYPE_F_2_PIN_DE("type_f_2pin_de"),
    @XmlEnumValue("type_l_3pin_it")
    TYPE_L_3_PIN_IT("type_l_3pin_it"),
    @XmlEnumValue("type_b_3pin_na")
    TYPE_B_3_PIN_NA("type_b_3pin_na"),
    @XmlEnumValue("type_g_3pin_uk")
    TYPE_G_3_PIN_UK("type_g_3pin_uk"),
    @XmlEnumValue("type_m_3pin_za")
    TYPE_M_3_PIN_ZA("type_m_3pin_za"),
    @XmlEnumValue("type_c_2pin_eu")
    TYPE_C_2_PIN_EU("type_c_2pin_eu"),
    @XmlEnumValue("type_h_3pin_il")
    TYPE_H_3_PIN_IL("type_h_3pin_il"),
    @XmlEnumValue("type_n_3pin_br")
    TYPE_N_3_PIN_BR("type_n_3pin_br"),
    @XmlEnumValue("type_d_3pin_in")
    TYPE_D_3_PIN_IN("type_d_3pin_in"),
    @XmlEnumValue("type_i_3pin_au")
    TYPE_I_3_PIN_AU("type_i_3pin_au");
    private final String value;

    PowerPlugType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PowerPlugType fromValue(String v) {
        for (PowerPlugType c: PowerPlugType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
