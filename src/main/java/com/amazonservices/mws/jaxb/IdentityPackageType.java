
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IdentityPackageType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="IdentityPackageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bulk"/>
 *     &lt;enumeration value="frustration_free"/>
 *     &lt;enumeration value="traditional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdentityPackageType")
@XmlEnum
public enum IdentityPackageType {

    @XmlEnumValue("bulk")
    BULK("bulk"),
    @XmlEnumValue("frustration_free")
    FRUSTRATION_FREE("frustration_free"),
    @XmlEnumValue("traditional")
    TRADITIONAL("traditional");
    private final String value;

    IdentityPackageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentityPackageType fromValue(String v) {
        for (IdentityPackageType c: IdentityPackageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
