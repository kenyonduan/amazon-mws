
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>USKRatingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="USKRatingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ages_6_and_over"/>
 *     &lt;enumeration value="ages_12_and_over"/>
 *     &lt;enumeration value="ages_16_and_over"/>
 *     &lt;enumeration value="ages_18_and_over"/>
 *     &lt;enumeration value="cannot_publicize"/>
 *     &lt;enumeration value="checked_by_legal_department"/>
 *     &lt;enumeration value="not_checked"/>
 *     &lt;enumeration value="without_age_limitation"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "USKRatingType")
@XmlEnum
public enum USKRatingType {

    @XmlEnumValue("ages_6_and_over")
    AGES_6_AND_OVER("ages_6_and_over"),
    @XmlEnumValue("ages_12_and_over")
    AGES_12_AND_OVER("ages_12_and_over"),
    @XmlEnumValue("ages_16_and_over")
    AGES_16_AND_OVER("ages_16_and_over"),
    @XmlEnumValue("ages_18_and_over")
    AGES_18_AND_OVER("ages_18_and_over"),
    @XmlEnumValue("cannot_publicize")
    CANNOT_PUBLICIZE("cannot_publicize"),
    @XmlEnumValue("checked_by_legal_department")
    CHECKED_BY_LEGAL_DEPARTMENT("checked_by_legal_department"),
    @XmlEnumValue("not_checked")
    NOT_CHECKED("not_checked"),
    @XmlEnumValue("without_age_limitation")
    WITHOUT_AGE_LIMITATION("without_age_limitation"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    USKRatingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static USKRatingType fromValue(String v) {
        for (USKRatingType c: USKRatingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
