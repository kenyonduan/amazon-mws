
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DistributionDesignationValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionDesignationValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jp_parallel_import"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DistributionDesignationValues")
@XmlEnum
public enum DistributionDesignationValues {

    @XmlEnumValue("jp_parallel_import")
    JP_PARALLEL_IMPORT("jp_parallel_import");
    private final String value;

    DistributionDesignationValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistributionDesignationValues fromValue(String v) {
        for (DistributionDesignationValues c: DistributionDesignationValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
