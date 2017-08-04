
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>JewelryLengthUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="JewelryLengthUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="IN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JewelryLengthUnitOfMeasure")
@XmlEnum
public enum JewelryLengthUnitOfMeasure {

    MM,
    CM,
    IN;

    public String value() {
        return name();
    }

    public static JewelryLengthUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
