
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="IsRecalled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RecallDescription">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="1500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "isRecalled",
    "recallDescription"
})
@XmlRootElement(name = "Recall")
public class Recall {

    @XmlElement(name = "IsRecalled")
    protected boolean isRecalled;
    @XmlElement(name = "RecallDescription", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String recallDescription;

    /**
     * 获取isRecalled属性的值。
     * 
     */
    public boolean isIsRecalled() {
        return isRecalled;
    }

    /**
     * 设置isRecalled属性的值。
     * 
     */
    public void setIsRecalled(boolean value) {
        this.isRecalled = value;
    }

    /**
     * 获取recallDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecallDescription() {
        return recallDescription;
    }

    /**
     * 设置recallDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecallDescription(String value) {
        this.recallDescription = value;
    }

}
