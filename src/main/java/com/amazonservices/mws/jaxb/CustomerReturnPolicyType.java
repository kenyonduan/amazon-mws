
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerReturnPolicyType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerReturnPolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="collectible"/>
 *     &lt;enumeration value="restocking_fee"/>
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="non_returnable"/>
 *     &lt;enumeration value="seasonal"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerReturnPolicyType")
@XmlEnum
public enum CustomerReturnPolicyType {

    @XmlEnumValue("collectible")
    COLLECTIBLE("collectible"),
    @XmlEnumValue("restocking_fee")
    RESTOCKING_FEE("restocking_fee"),
    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("non_returnable")
    NON_RETURNABLE("non_returnable"),
    @XmlEnumValue("seasonal")
    SEASONAL("seasonal"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    CustomerReturnPolicyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerReturnPolicyType fromValue(String v) {
        for (CustomerReturnPolicyType c: CustomerReturnPolicyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
