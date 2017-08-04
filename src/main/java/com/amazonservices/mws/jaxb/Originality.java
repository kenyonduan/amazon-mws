
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Originality的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Originality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="Original Limited Edition"/>
 *     &lt;enumeration value="Reproduced"/>
 *     &lt;enumeration value="Reproduced Limited Edition"/>
 *     &lt;enumeration value="Replica"/>
 *     &lt;enumeration value="Replica Limited Edition"/>
 *     &lt;enumeration value="Limited Edition"/>
 *     &lt;enumeration value="Manufactured"/>
 *     &lt;enumeration value="Licensed"/>
 *     &lt;enumeration value="Vintage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Originality")
@XmlEnum
public enum Originality {

    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("Original Limited Edition")
    ORIGINAL_LIMITED_EDITION("Original Limited Edition"),
    @XmlEnumValue("Reproduced")
    REPRODUCED("Reproduced"),
    @XmlEnumValue("Reproduced Limited Edition")
    REPRODUCED_LIMITED_EDITION("Reproduced Limited Edition"),
    @XmlEnumValue("Replica")
    REPLICA("Replica"),
    @XmlEnumValue("Replica Limited Edition")
    REPLICA_LIMITED_EDITION("Replica Limited Edition"),
    @XmlEnumValue("Limited Edition")
    LIMITED_EDITION("Limited Edition"),
    @XmlEnumValue("Manufactured")
    MANUFACTURED("Manufactured"),
    @XmlEnumValue("Licensed")
    LICENSED("Licensed"),
    @XmlEnumValue("Vintage")
    VINTAGE("Vintage");
    private final String value;

    Originality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Originality fromValue(String v) {
        for (Originality c: Originality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
