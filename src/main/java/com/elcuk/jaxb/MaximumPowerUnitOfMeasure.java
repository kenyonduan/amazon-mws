
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MaximumPowerUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MaximumPowerUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="KW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaximumPowerUnitOfMeasure")
@XmlEnum
public enum MaximumPowerUnitOfMeasure {

    W,
    KW;

    public String value() {
        return name();
    }

    public static MaximumPowerUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
