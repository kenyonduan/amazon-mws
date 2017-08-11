
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PEGIRatingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PEGIRatingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ages_3_and_over"/>
 *     &lt;enumeration value="ages_7_and_over"/>
 *     &lt;enumeration value="ages_12_and_over"/>
 *     &lt;enumeration value="ages_16_and_over"/>
 *     &lt;enumeration value="ages_18_and_over"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PEGIRatingType")
@XmlEnum
public enum PEGIRatingType {

    @XmlEnumValue("ages_3_and_over")
    AGES_3_AND_OVER("ages_3_and_over"),
    @XmlEnumValue("ages_7_and_over")
    AGES_7_AND_OVER("ages_7_and_over"),
    @XmlEnumValue("ages_12_and_over")
    AGES_12_AND_OVER("ages_12_and_over"),
    @XmlEnumValue("ages_16_and_over")
    AGES_16_AND_OVER("ages_16_and_over"),
    @XmlEnumValue("ages_18_and_over")
    AGES_18_AND_OVER("ages_18_and_over"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    PEGIRatingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PEGIRatingType fromValue(String v) {
        for (PEGIRatingType c: PEGIRatingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
