
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TemperatureRangeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TemperatureRangeUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemperatureRangeUnitOfMeasure")
@XmlEnum
public enum TemperatureRangeUnitOfMeasure {

    F,
    C;

    public String value() {
        return name();
    }

    public static TemperatureRangeUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
