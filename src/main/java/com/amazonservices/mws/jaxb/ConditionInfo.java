
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>ConditionInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConditionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ConditionType"/>
 *         &lt;element name="ConditionNote" type="{}TwoThousandString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionInfo", propOrder = {
    "conditionType",
    "conditionNote"
})
public class ConditionInfo {

    @XmlElement(name = "ConditionType", required = true)
    protected String conditionType;
    @XmlElement(name = "ConditionNote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String conditionNote;

    /**
     * 获取conditionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * 设置conditionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionType(String value) {
        this.conditionType = value;
    }

    /**
     * 获取conditionNote属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionNote() {
        return conditionNote;
    }

    /**
     * 设置conditionNote属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionNote(String value) {
        this.conditionNote = value;
    }

}
