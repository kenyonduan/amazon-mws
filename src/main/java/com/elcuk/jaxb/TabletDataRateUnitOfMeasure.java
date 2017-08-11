
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TabletDataRateUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TabletDataRateUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TabletDataRateUnitOfMeasure")
@XmlEnum
public enum TabletDataRateUnitOfMeasure {

    PPS;

    public String value() {
        return name();
    }

    public static TabletDataRateUnitOfMeasure fromValue(String v) {
        return valueOf(v);
    }

}
