
package com.amazonservices.mws.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>PromotionDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PromotionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}PromotionClaimCode"/>
 *         &lt;element ref="{}MerchantPromotionID"/>
 *         &lt;element name="Component" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{}PromotionApplicationType"/>
 *                   &lt;element name="Amount" type="{}CurrencyAmount"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "PromotionDataType", propOrder = {
    "promotionClaimCode",
    "merchantPromotionID",
    "component"
})
public class PromotionDataType {

    @XmlElement(name = "PromotionClaimCode", required = true)
    protected String promotionClaimCode;
    @XmlElement(name = "MerchantPromotionID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String merchantPromotionID;
    @XmlElement(name = "Component", required = true)
    protected List<Component> component;

    /**
     * 获取promotionClaimCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionClaimCode() {
        return promotionClaimCode;
    }

    /**
     * 设置promotionClaimCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionClaimCode(String value) {
        this.promotionClaimCode = value;
    }

    /**
     * 获取merchantPromotionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPromotionID() {
        return merchantPromotionID;
    }

    /**
     * 设置merchantPromotionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPromotionID(String value) {
        this.merchantPromotionID = value;
    }

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Component }
     * 
     * 
     */
    public List<Component> getComponent() {
        if (component == null) {
            component = new ArrayList<Component>();
        }
        return this.component;
    }


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
     *         &lt;element name="Type" type="{}PromotionApplicationType"/>
     *         &lt;element name="Amount" type="{}CurrencyAmount"/>
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
        "type",
        "amount"
    })
    public static class Component {

        @XmlElement(name = "Type", required = true)
        @XmlSchemaType(name = "string")
        protected PromotionApplicationType type;
        @XmlElement(name = "Amount", required = true)
        protected CurrencyAmount amount;

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PromotionApplicationType }
         *     
         */
        public PromotionApplicationType getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PromotionApplicationType }
         *     
         */
        public void setType(PromotionApplicationType value) {
            this.type = value;
        }

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmount }
         *     
         */
        public CurrencyAmount getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmount }
         *     
         */
        public void setAmount(CurrencyAmount value) {
            this.amount = value;
        }

    }

}
