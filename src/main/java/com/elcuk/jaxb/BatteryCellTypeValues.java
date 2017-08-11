
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatteryCellTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="BatteryCellTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NiCAD"/>
 *     &lt;enumeration value="NiMh"/>
 *     &lt;enumeration value="alkaline"/>
 *     &lt;enumeration value="aluminum_oxygen"/>
 *     &lt;enumeration value="lead_acid"/>
 *     &lt;enumeration value="lead_calcium"/>
 *     &lt;enumeration value="lithium"/>
 *     &lt;enumeration value="lithium_ion"/>
 *     &lt;enumeration value="lithium_manganese_dioxide"/>
 *     &lt;enumeration value="lithium_metal"/>
 *     &lt;enumeration value="lithium_polymer"/>
 *     &lt;enumeration value="manganese"/>
 *     &lt;enumeration value="polymer"/>
 *     &lt;enumeration value="silver_oxide"/>
 *     &lt;enumeration value="zinc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatteryCellTypeValues")
@XmlEnum
public enum BatteryCellTypeValues {

    @XmlEnumValue("NiCAD")
    NI_CAD("NiCAD"),
    @XmlEnumValue("NiMh")
    NI_MH("NiMh"),
    @XmlEnumValue("alkaline")
    ALKALINE("alkaline"),
    @XmlEnumValue("aluminum_oxygen")
    ALUMINUM_OXYGEN("aluminum_oxygen"),
    @XmlEnumValue("lead_acid")
    LEAD_ACID("lead_acid"),
    @XmlEnumValue("lead_calcium")
    LEAD_CALCIUM("lead_calcium"),
    @XmlEnumValue("lithium")
    LITHIUM("lithium"),
    @XmlEnumValue("lithium_ion")
    LITHIUM_ION("lithium_ion"),
    @XmlEnumValue("lithium_manganese_dioxide")
    LITHIUM_MANGANESE_DIOXIDE("lithium_manganese_dioxide"),
    @XmlEnumValue("lithium_metal")
    LITHIUM_METAL("lithium_metal"),
    @XmlEnumValue("lithium_polymer")
    LITHIUM_POLYMER("lithium_polymer"),
    @XmlEnumValue("manganese")
    MANGANESE("manganese"),
    @XmlEnumValue("polymer")
    POLYMER("polymer"),
    @XmlEnumValue("silver_oxide")
    SILVER_OXIDE("silver_oxide"),
    @XmlEnumValue("zinc")
    ZINC("zinc");
    private final String value;

    BatteryCellTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatteryCellTypeValues fromValue(String v) {
        for (BatteryCellTypeValues c: BatteryCellTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
