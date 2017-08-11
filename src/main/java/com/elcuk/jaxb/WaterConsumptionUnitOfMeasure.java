
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WaterConsumptionUnitOfMeasure的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WaterConsumptionUnitOfMeasure">
 *   &lt;restriction base="{}StringNotNull">
 *     &lt;enumeration value="GallonsPerMinute"/>
 *     &lt;enumeration value="GallonsPerHour"/>
 *     &lt;enumeration value="GallonsPerFlush"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WaterConsumptionUnitOfMeasure")
@XmlEnum
public enum WaterConsumptionUnitOfMeasure {

    @XmlEnumValue("GallonsPerMinute")
    GALLONS_PER_MINUTE("GallonsPerMinute"),
    @XmlEnumValue("GallonsPerHour")
    GALLONS_PER_HOUR("GallonsPerHour"),
    @XmlEnumValue("GallonsPerFlush")
    GALLONS_PER_FLUSH("GallonsPerFlush");
    private final String value;

    WaterConsumptionUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WaterConsumptionUnitOfMeasure fromValue(String v) {
        for (WaterConsumptionUnitOfMeasure c: WaterConsumptionUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
