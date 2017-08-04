
package com.amazonservices.mws.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RebateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RebateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RebateStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RebateEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RebateMessage" type="{}TwoFiftyStringNotNull"/>
 *         &lt;element name="RebateName" type="{}FortyStringNotNull"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebateType", propOrder = {
    "rebateStartDate",
    "rebateEndDate",
    "rebateMessage",
    "rebateName"
})
public class RebateType {

    @XmlElement(name = "RebateStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rebateStartDate;
    @XmlElement(name = "RebateEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rebateEndDate;
    @XmlElement(name = "RebateMessage", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rebateMessage;
    @XmlElement(name = "RebateName", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rebateName;

    /**
     * 获取rebateStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRebateStartDate() {
        return rebateStartDate;
    }

    /**
     * 设置rebateStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRebateStartDate(XMLGregorianCalendar value) {
        this.rebateStartDate = value;
    }

    /**
     * 获取rebateEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRebateEndDate() {
        return rebateEndDate;
    }

    /**
     * 设置rebateEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRebateEndDate(XMLGregorianCalendar value) {
        this.rebateEndDate = value;
    }

    /**
     * 获取rebateMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebateMessage() {
        return rebateMessage;
    }

    /**
     * 设置rebateMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebateMessage(String value) {
        this.rebateMessage = value;
    }

    /**
     * 获取rebateName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebateName() {
        return rebateName;
    }

    /**
     * 设置rebateName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebateName(String value) {
        this.rebateName = value;
    }

}
