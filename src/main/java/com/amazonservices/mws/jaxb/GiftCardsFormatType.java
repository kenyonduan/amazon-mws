
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GiftCardsFormatType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GiftCardsFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="email_gift_cards"/>
 *     &lt;enumeration value="plastic_gift_cards"/>
 *     &lt;enumeration value="print_at_home"/>
 *     &lt;enumeration value="multi_pack"/>
 *     &lt;enumeration value="facebook"/>
 *     &lt;enumeration value="gift_box"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GiftCardsFormatType")
@XmlEnum
public enum GiftCardsFormatType {

    @XmlEnumValue("email_gift_cards")
    EMAIL_GIFT_CARDS("email_gift_cards"),
    @XmlEnumValue("plastic_gift_cards")
    PLASTIC_GIFT_CARDS("plastic_gift_cards"),
    @XmlEnumValue("print_at_home")
    PRINT_AT_HOME("print_at_home"),
    @XmlEnumValue("multi_pack")
    MULTI_PACK("multi_pack"),
    @XmlEnumValue("facebook")
    FACEBOOK("facebook"),
    @XmlEnumValue("gift_box")
    GIFT_BOX("gift_box");
    private final String value;

    GiftCardsFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GiftCardsFormatType fromValue(String v) {
        for (GiftCardsFormatType c: GiftCardsFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
