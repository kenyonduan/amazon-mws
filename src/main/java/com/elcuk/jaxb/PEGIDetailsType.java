
package com.elcuk.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PEGIDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PEGIDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BadLanguage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Fear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Violence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Discrimination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Drugs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SexualContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PEGIDetailsType", propOrder = {
    "badLanguage",
    "fear",
    "violence",
    "discrimination",
    "drugs",
    "sexualContent"
})
public class PEGIDetailsType {

    @XmlElement(name = "BadLanguage")
    protected Boolean badLanguage;
    @XmlElement(name = "Fear")
    protected Boolean fear;
    @XmlElement(name = "Violence")
    protected Boolean violence;
    @XmlElement(name = "Discrimination")
    protected Boolean discrimination;
    @XmlElement(name = "Drugs")
    protected Boolean drugs;
    @XmlElement(name = "SexualContent")
    protected Boolean sexualContent;

    /**
     * 获取badLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBadLanguage() {
        return badLanguage;
    }

    /**
     * 设置badLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBadLanguage(Boolean value) {
        this.badLanguage = value;
    }

    /**
     * 获取fear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFear() {
        return fear;
    }

    /**
     * 设置fear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFear(Boolean value) {
        this.fear = value;
    }

    /**
     * 获取violence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViolence() {
        return violence;
    }

    /**
     * 设置violence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViolence(Boolean value) {
        this.violence = value;
    }

    /**
     * 获取discrimination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscrimination() {
        return discrimination;
    }

    /**
     * 设置discrimination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscrimination(Boolean value) {
        this.discrimination = value;
    }

    /**
     * 获取drugs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrugs() {
        return drugs;
    }

    /**
     * 设置drugs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrugs(Boolean value) {
        this.drugs = value;
    }

    /**
     * 获取sexualContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSexualContent() {
        return sexualContent;
    }

    /**
     * 设置sexualContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSexualContent(Boolean value) {
        this.sexualContent = value;
    }

}
