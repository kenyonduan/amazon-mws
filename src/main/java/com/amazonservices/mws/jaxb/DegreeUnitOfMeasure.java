
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DegreeUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DegreeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="degrees"/>
 *     &lt;enumeration value="microradian"/>
 *     &lt;enumeration value="arc_minute"/>
 *     &lt;enumeration value="arc_sec"/>
 *     &lt;enumeration value="milliradian"/>
 *     &lt;enumeration value="radians"/>
 *     &lt;enumeration value="turns"/>
 *     &lt;enumeration value="revolutions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DegreeUnitOfMeasure")
@XmlEnum
public enum DegreeUnitOfMeasure {

    @XmlEnumValue("degrees")
    DEGREES("degrees"),
    @XmlEnumValue("microradian")
    MICRORADIAN("microradian"),
    @XmlEnumValue("arc_minute")
    ARC_MINUTE("arc_minute"),
    @XmlEnumValue("arc_sec")
    ARC_SEC("arc_sec"),
    @XmlEnumValue("milliradian")
    MILLIRADIAN("milliradian"),
    @XmlEnumValue("radians")
    RADIANS("radians"),
    @XmlEnumValue("turns")
    TURNS("turns"),
    @XmlEnumValue("revolutions")
    REVOLUTIONS("revolutions");
    private final String value;

    DegreeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DegreeUnitOfMeasure fromValue(String v) {
        for (DegreeUnitOfMeasure c: DegreeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
