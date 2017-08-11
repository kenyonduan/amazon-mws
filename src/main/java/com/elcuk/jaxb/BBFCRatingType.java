
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BBFCRatingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BBFCRatingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ages_12_and_over"/>
 *     &lt;enumeration value="ages_15_and_over"/>
 *     &lt;enumeration value="ages_18_and_over"/>
 *     &lt;enumeration value="exempt"/>
 *     &lt;enumeration value="parental_guidance"/>
 *     &lt;enumeration value="to_be_announced"/>
 *     &lt;enumeration value="universal_childrens"/>
 *     &lt;enumeration value="universal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BBFCRatingType")
@XmlEnum
public enum BBFCRatingType {

    @XmlEnumValue("ages_12_and_over")
    AGES_12_AND_OVER("ages_12_and_over"),
    @XmlEnumValue("ages_15_and_over")
    AGES_15_AND_OVER("ages_15_and_over"),
    @XmlEnumValue("ages_18_and_over")
    AGES_18_AND_OVER("ages_18_and_over"),
    @XmlEnumValue("exempt")
    EXEMPT("exempt"),
    @XmlEnumValue("parental_guidance")
    PARENTAL_GUIDANCE("parental_guidance"),
    @XmlEnumValue("to_be_announced")
    TO_BE_ANNOUNCED("to_be_announced"),
    @XmlEnumValue("universal_childrens")
    UNIVERSAL_CHILDRENS("universal_childrens"),
    @XmlEnumValue("universal")
    UNIVERSAL("universal");
    private final String value;

    BBFCRatingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BBFCRatingType fromValue(String v) {
        for (BBFCRatingType c: BBFCRatingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
