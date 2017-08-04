
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FulfillReadiness的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FulfillReadiness">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="drop_ship_ready"/>
 *     &lt;enumeration value="not_ready"/>
 *     &lt;enumeration value="receive_ready"/>
 *     &lt;enumeration value="exception_receive_ready"/>
 *     &lt;enumeration value="po_ready"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FulfillReadiness")
@XmlEnum
public enum FulfillReadiness {

    @XmlEnumValue("drop_ship_ready")
    DROP_SHIP_READY("drop_ship_ready"),
    @XmlEnumValue("not_ready")
    NOT_READY("not_ready"),
    @XmlEnumValue("receive_ready")
    RECEIVE_READY("receive_ready"),
    @XmlEnumValue("exception_receive_ready")
    EXCEPTION_RECEIVE_READY("exception_receive_ready"),
    @XmlEnumValue("po_ready")
    PO_READY("po_ready"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    FulfillReadiness(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FulfillReadiness fromValue(String v) {
        for (FulfillReadiness c: FulfillReadiness.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
