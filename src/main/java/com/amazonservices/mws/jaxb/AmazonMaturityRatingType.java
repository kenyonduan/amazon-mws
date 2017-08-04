
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AmazonMaturityRatingType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AmazonMaturityRatingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adult_content"/>
 *     &lt;enumeration value="ages_13_and_older"/>
 *     &lt;enumeration value="ages_17_and_older"/>
 *     &lt;enumeration value="ages_9_and_older"/>
 *     &lt;enumeration value="all_ages"/>
 *     &lt;enumeration value="children"/>
 *     &lt;enumeration value="rating_pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmazonMaturityRatingType")
@XmlEnum
public enum AmazonMaturityRatingType {

    @XmlEnumValue("adult_content")
    ADULT_CONTENT("adult_content"),
    @XmlEnumValue("ages_13_and_older")
    AGES_13_AND_OLDER("ages_13_and_older"),
    @XmlEnumValue("ages_17_and_older")
    AGES_17_AND_OLDER("ages_17_and_older"),
    @XmlEnumValue("ages_9_and_older")
    AGES_9_AND_OLDER("ages_9_and_older"),
    @XmlEnumValue("all_ages")
    ALL_AGES("all_ages"),
    @XmlEnumValue("children")
    CHILDREN("children"),
    @XmlEnumValue("rating_pending")
    RATING_PENDING("rating_pending");
    private final String value;

    AmazonMaturityRatingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmazonMaturityRatingType fromValue(String v) {
        for (AmazonMaturityRatingType c: AmazonMaturityRatingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
