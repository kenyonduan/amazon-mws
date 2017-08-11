
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProcessorSeriesTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessorSeriesTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="athlon_64"/>
 *     &lt;enumeration value="athlon_64_x2"/>
 *     &lt;enumeration value="intel_atom_230"/>
 *     &lt;enumeration value="intel_atom_330"/>
 *     &lt;enumeration value="intel_atom_n450"/>
 *     &lt;enumeration value="intel_atom_n455"/>
 *     &lt;enumeration value="intel_atom_z520"/>
 *     &lt;enumeration value="intel_atom_z530"/>
 *     &lt;enumeration value="intel_xeon"/>
 *     &lt;enumeration value="pentium_4"/>
 *     &lt;enumeration value="sempron"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessorSeriesTypeValues")
@XmlEnum
public enum ProcessorSeriesTypeValues {

    @XmlEnumValue("athlon_64")
    ATHLON_64("athlon_64"),
    @XmlEnumValue("athlon_64_x2")
    ATHLON_64_X_2("athlon_64_x2"),
    @XmlEnumValue("intel_atom_230")
    INTEL_ATOM_230("intel_atom_230"),
    @XmlEnumValue("intel_atom_330")
    INTEL_ATOM_330("intel_atom_330"),
    @XmlEnumValue("intel_atom_n450")
    INTEL_ATOM_N_450("intel_atom_n450"),
    @XmlEnumValue("intel_atom_n455")
    INTEL_ATOM_N_455("intel_atom_n455"),
    @XmlEnumValue("intel_atom_z520")
    INTEL_ATOM_Z_520("intel_atom_z520"),
    @XmlEnumValue("intel_atom_z530")
    INTEL_ATOM_Z_530("intel_atom_z530"),
    @XmlEnumValue("intel_xeon")
    INTEL_XEON("intel_xeon"),
    @XmlEnumValue("pentium_4")
    PENTIUM_4("pentium_4"),
    @XmlEnumValue("sempron")
    SEMPRON("sempron");
    private final String value;

    ProcessorSeriesTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessorSeriesTypeValues fromValue(String v) {
        for (ProcessorSeriesTypeValues c: ProcessorSeriesTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
