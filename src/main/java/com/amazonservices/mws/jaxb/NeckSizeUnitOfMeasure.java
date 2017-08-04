
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NeckSizeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NeckSizeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="FT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NeckSizeUnitOfMeasure")
@XmlEnum
public enum NeckSizeUnitOfMeasure {

    CM,
    IN,
    MM,
    M,
    FT;

    public String value() {
        return name();
    }

    public static NeckSizeUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
