
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GraphicsCardInterfaceTypeValues的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GraphicsCardInterfaceTypeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="agp"/>
 *     &lt;enumeration value="integrated"/>
 *     &lt;enumeration value="pci"/>
 *     &lt;enumeration value="pci_e"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GraphicsCardInterfaceTypeValues")
@XmlEnum
public enum GraphicsCardInterfaceTypeValues {

    @XmlEnumValue("agp")
    AGP("agp"),
    @XmlEnumValue("integrated")
    INTEGRATED("integrated"),
    @XmlEnumValue("pci")
    PCI("pci"),
    @XmlEnumValue("pci_e")
    PCI_E("pci_e"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    GraphicsCardInterfaceTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GraphicsCardInterfaceTypeValues fromValue(String v) {
        for (GraphicsCardInterfaceTypeValues c: GraphicsCardInterfaceTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
