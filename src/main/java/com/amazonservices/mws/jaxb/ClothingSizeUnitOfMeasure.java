
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ClothingSizeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ClothingSizeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="CM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClothingSizeUnitOfMeasure")
@XmlEnum
public enum ClothingSizeUnitOfMeasure {

    IN,
    CM;

    public String value() {
        return name();
    }

    public static ClothingSizeUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
