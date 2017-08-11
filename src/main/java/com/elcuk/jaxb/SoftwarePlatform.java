
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HardwarePlatform" type="{}HardwarePlatformType"/>
 *         &lt;element name="SystemRequirements" type="{}LongStringNotNull" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hardwarePlatform",
    "systemRequirements"
})
@XmlRootElement(name = "SoftwarePlatform")
public class SoftwarePlatform {

    @XmlElement(name = "HardwarePlatform", required = true)
    @XmlSchemaType(name = "string")
    protected HardwarePlatformType hardwarePlatform;
    @XmlElement(name = "SystemRequirements", defaultValue = "N/A")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String systemRequirements;

    /**
     * 获取hardwarePlatform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HardwarePlatformType }
     *     
     */
    public HardwarePlatformType getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * 设置hardwarePlatform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HardwarePlatformType }
     *     
     */
    public void setHardwarePlatform(HardwarePlatformType value) {
        this.hardwarePlatform = value;
    }

    /**
     * 获取systemRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemRequirements() {
        return systemRequirements;
    }

    /**
     * 设置systemRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemRequirements(String value) {
        this.systemRequirements = value;
    }

}
