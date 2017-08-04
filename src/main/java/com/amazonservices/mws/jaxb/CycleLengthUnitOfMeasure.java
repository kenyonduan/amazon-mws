
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CycleLengthUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CycleLengthUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="IN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CycleLengthUnitOfMeasure")
@XmlEnum
public enum CycleLengthUnitOfMeasure {

    CM,
    IN;

    public String value() {
        return name();
    }

    public static CycleLengthUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
