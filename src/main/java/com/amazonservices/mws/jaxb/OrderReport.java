
package com.amazonservices.mws.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}AmazonOrderID"/>
 *         &lt;element name="AmazonSessionID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{3}-\d{7}-\d{7}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderPostedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CustomerOrderInfo" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{}StringNotNull"/>
 *                   &lt;element name="Value" type="{}StringNotNull"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BillingData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BuyerEmailAddress">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *                         &lt;pattern value="[^@]+@[^@\.]+(\.[^@\.]+)+"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BuyerName" type="{}String"/>
 *                   &lt;element name="BuyerPhoneNumber" type="{}String"/>
 *                   &lt;element name="CreditCard" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Issuer">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Visa"/>
 *                                   &lt;enumeration value="MasterCard"/>
 *                                   &lt;enumeration value="AmericanExpress"/>
 *                                   &lt;enumeration value="Discover"/>
 *                                   &lt;enumeration value="DinersClub"/>
 *                                   &lt;enumeration value="JCB"/>
 *                                   &lt;enumeration value="PrivateLabel"/>
 *                                   &lt;enumeration value="BankDebit"/>
 *                                   &lt;enumeration value="CarteBlanche"/>
 *                                   &lt;enumeration value="CarteBancaire"/>
 *                                   &lt;enumeration value="PaymentByInvoice"/>
 *                                   &lt;enumeration value="Laser"/>
 *                                   &lt;enumeration value="Switch"/>
 *                                   &lt;enumeration value="SVS"/>
 *                                   &lt;enumeration value="BordersECG"/>
 *                                   &lt;enumeration value="Other"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Tail">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{4}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{}Address" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FulfillmentData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}FulfillmentMethod"/>
 *                   &lt;element ref="{}FulfillmentServiceLevel" minOccurs="0"/>
 *                   &lt;element ref="{}FulfillmentCenterID" minOccurs="0"/>
 *                   &lt;element ref="{}Address" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Item" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}AmazonOrderItemCode"/>
 *                   &lt;element ref="{}SKU"/>
 *                   &lt;element name="Title" type="{}LongString"/>
 *                   &lt;element name="CustomizationInfo" type="{}CustomizationInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element ref="{}ProductTaxCode"/>
 *                   &lt;element name="DeliveryStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="DeliveryEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="DeliveryTimeZone" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="DeliveryInstructions" type="{}LongStringNotNull" minOccurs="0"/>
 *                   &lt;element name="ItemPrice" type="{}BuyerPrice"/>
 *                   &lt;element name="ItemFees" type="{}AmazonFees"/>
 *                   &lt;element name="ItemTaxData" type="{}TaxData" minOccurs="0"/>
 *                   &lt;element name="ShippingTaxData" type="{}TaxData" minOccurs="0"/>
 *                   &lt;element name="GiftWrapTaxData" type="{}TaxData" minOccurs="0"/>
 *                   &lt;element name="Promotion" type="{}PromotionDataType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GiftWrapLevel" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="GiftMessageText" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "amazonOrderID",
    "amazonSessionID",
    "orderDate",
    "orderPostedDate",
    "customerOrderInfo",
    "billingData",
    "fulfillmentData",
    "item"
})
@XmlRootElement(name = "OrderReport")
public class OrderReport {

    @XmlElement(name = "AmazonOrderID", required = true)
    protected String amazonOrderID;
    @XmlElement(name = "AmazonSessionID", required = true)
    protected String amazonSessionID;
    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(name = "OrderPostedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderPostedDate;
    @XmlElement(name = "CustomerOrderInfo")
    protected List<CustomerOrderInfo> customerOrderInfo;
    @XmlElement(name = "BillingData", required = true)
    protected BillingData billingData;
    @XmlElement(name = "FulfillmentData", required = true)
    protected FulfillmentData fulfillmentData;
    @XmlElement(name = "Item", required = true)
    protected List<Item> item;

    /**
     * 获取amazonOrderID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazonOrderID() {
        return amazonOrderID;
    }

    /**
     * 设置amazonOrderID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazonOrderID(String value) {
        this.amazonOrderID = value;
    }

    /**
     * 获取amazonSessionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazonSessionID() {
        return amazonSessionID;
    }

    /**
     * 设置amazonSessionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazonSessionID(String value) {
        this.amazonSessionID = value;
    }

    /**
     * 获取orderDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * 设置orderDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * 获取orderPostedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderPostedDate() {
        return orderPostedDate;
    }

    /**
     * 设置orderPostedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderPostedDate(XMLGregorianCalendar value) {
        this.orderPostedDate = value;
    }

    /**
     * Gets the value of the customerOrderInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOrderInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOrderInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrderInfo }
     * 
     * 
     */
    public List<CustomerOrderInfo> getCustomerOrderInfo() {
        if (customerOrderInfo == null) {
            customerOrderInfo = new ArrayList<CustomerOrderInfo>();
        }
        return this.customerOrderInfo;
    }

    /**
     * 获取billingData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BillingData }
     *     
     */
    public BillingData getBillingData() {
        return billingData;
    }

    /**
     * 设置billingData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BillingData }
     *     
     */
    public void setBillingData(BillingData value) {
        this.billingData = value;
    }

    /**
     * 获取fulfillmentData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentData }
     *     
     */
    public FulfillmentData getFulfillmentData() {
        return fulfillmentData;
    }

    /**
     * 设置fulfillmentData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentData }
     *     
     */
    public void setFulfillmentData(FulfillmentData value) {
        this.fulfillmentData = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
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
     *         &lt;element name="BuyerEmailAddress">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
     *               &lt;pattern value="[^@]+@[^@\.]+(\.[^@\.]+)+"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BuyerName" type="{}String"/>
     *         &lt;element name="BuyerPhoneNumber" type="{}String"/>
     *         &lt;element name="CreditCard" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Issuer">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Visa"/>
     *                         &lt;enumeration value="MasterCard"/>
     *                         &lt;enumeration value="AmericanExpress"/>
     *                         &lt;enumeration value="Discover"/>
     *                         &lt;enumeration value="DinersClub"/>
     *                         &lt;enumeration value="JCB"/>
     *                         &lt;enumeration value="PrivateLabel"/>
     *                         &lt;enumeration value="BankDebit"/>
     *                         &lt;enumeration value="CarteBlanche"/>
     *                         &lt;enumeration value="CarteBancaire"/>
     *                         &lt;enumeration value="PaymentByInvoice"/>
     *                         &lt;enumeration value="Laser"/>
     *                         &lt;enumeration value="Switch"/>
     *                         &lt;enumeration value="SVS"/>
     *                         &lt;enumeration value="BordersECG"/>
     *                         &lt;enumeration value="Other"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Tail">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{4}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{}Address" minOccurs="0"/>
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
        "buyerEmailAddress",
        "buyerName",
        "buyerPhoneNumber",
        "creditCard",
        "address"
    })
    public static class BillingData {

        @XmlElement(name = "BuyerEmailAddress", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String buyerEmailAddress;
        @XmlElement(name = "BuyerName", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String buyerName;
        @XmlElement(name = "BuyerPhoneNumber", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String buyerPhoneNumber;
        @XmlElement(name = "CreditCard")
        protected CreditCard creditCard;
        @XmlElement(name = "Address")
        protected AddressType address;

        /**
         * 获取buyerEmailAddress属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuyerEmailAddress() {
            return buyerEmailAddress;
        }

        /**
         * 设置buyerEmailAddress属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuyerEmailAddress(String value) {
            this.buyerEmailAddress = value;
        }

        /**
         * 获取buyerName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuyerName() {
            return buyerName;
        }

        /**
         * 设置buyerName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuyerName(String value) {
            this.buyerName = value;
        }

        /**
         * 获取buyerPhoneNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuyerPhoneNumber() {
            return buyerPhoneNumber;
        }

        /**
         * 设置buyerPhoneNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuyerPhoneNumber(String value) {
            this.buyerPhoneNumber = value;
        }

        /**
         * 获取creditCard属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CreditCard }
         *     
         */
        public CreditCard getCreditCard() {
            return creditCard;
        }

        /**
         * 设置creditCard属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CreditCard }
         *     
         */
        public void setCreditCard(CreditCard value) {
            this.creditCard = value;
        }

        /**
         * 获取address属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getAddress() {
            return address;
        }

        /**
         * 设置address属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         */
        public void setAddress(AddressType value) {
            this.address = value;
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
         *         &lt;element name="Issuer">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Visa"/>
         *               &lt;enumeration value="MasterCard"/>
         *               &lt;enumeration value="AmericanExpress"/>
         *               &lt;enumeration value="Discover"/>
         *               &lt;enumeration value="DinersClub"/>
         *               &lt;enumeration value="JCB"/>
         *               &lt;enumeration value="PrivateLabel"/>
         *               &lt;enumeration value="BankDebit"/>
         *               &lt;enumeration value="CarteBlanche"/>
         *               &lt;enumeration value="CarteBancaire"/>
         *               &lt;enumeration value="PaymentByInvoice"/>
         *               &lt;enumeration value="Laser"/>
         *               &lt;enumeration value="Switch"/>
         *               &lt;enumeration value="SVS"/>
         *               &lt;enumeration value="BordersECG"/>
         *               &lt;enumeration value="Other"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Tail">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{4}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
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
            "issuer",
            "tail",
            "expirationDate"
        })
        public static class CreditCard {

            @XmlElement(name = "Issuer", required = true)
            protected String issuer;
            @XmlElement(name = "Tail", required = true)
            protected String tail;
            @XmlElement(name = "ExpirationDate", required = true)
            @XmlSchemaType(name = "gYearMonth")
            protected XMLGregorianCalendar expirationDate;

            /**
             * 获取issuer属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssuer() {
                return issuer;
            }

            /**
             * 设置issuer属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIssuer(String value) {
                this.issuer = value;
            }

            /**
             * 获取tail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTail() {
                return tail;
            }

            /**
             * 设置tail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTail(String value) {
                this.tail = value;
            }

            /**
             * 获取expirationDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpirationDate() {
                return expirationDate;
            }

            /**
             * 设置expirationDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExpirationDate(XMLGregorianCalendar value) {
                this.expirationDate = value;
            }

        }

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
     *         &lt;element name="Type" type="{}StringNotNull"/>
     *         &lt;element name="Value" type="{}StringNotNull"/>
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
        "value"
    })
    public static class CustomerOrderInfo {

        @XmlElement(name = "Type", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String type;
        @XmlElement(name = "Value", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String value;

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

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
     *         &lt;element ref="{}FulfillmentMethod"/>
     *         &lt;element ref="{}FulfillmentServiceLevel" minOccurs="0"/>
     *         &lt;element ref="{}FulfillmentCenterID" minOccurs="0"/>
     *         &lt;element ref="{}Address" minOccurs="0"/>
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
        "fulfillmentMethod",
        "fulfillmentServiceLevel",
        "fulfillmentCenterID",
        "address"
    })
    public static class FulfillmentData {

        @XmlElement(name = "FulfillmentMethod", required = true)
        protected String fulfillmentMethod;
        @XmlElement(name = "FulfillmentServiceLevel")
        protected String fulfillmentServiceLevel;
        @XmlElement(name = "FulfillmentCenterID")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String fulfillmentCenterID;
        @XmlElement(name = "Address")
        protected AddressType address;

        /**
         * 获取fulfillmentMethod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFulfillmentMethod() {
            return fulfillmentMethod;
        }

        /**
         * 设置fulfillmentMethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFulfillmentMethod(String value) {
            this.fulfillmentMethod = value;
        }

        /**
         * 获取fulfillmentServiceLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFulfillmentServiceLevel() {
            return fulfillmentServiceLevel;
        }

        /**
         * 设置fulfillmentServiceLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFulfillmentServiceLevel(String value) {
            this.fulfillmentServiceLevel = value;
        }

        /**
         * 获取fulfillmentCenterID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFulfillmentCenterID() {
            return fulfillmentCenterID;
        }

        /**
         * 设置fulfillmentCenterID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFulfillmentCenterID(String value) {
            this.fulfillmentCenterID = value;
        }

        /**
         * 获取address属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getAddress() {
            return address;
        }

        /**
         * 设置address属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         */
        public void setAddress(AddressType value) {
            this.address = value;
        }

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
     *         &lt;element ref="{}AmazonOrderItemCode"/>
     *         &lt;element ref="{}SKU"/>
     *         &lt;element name="Title" type="{}LongString"/>
     *         &lt;element name="CustomizationInfo" type="{}CustomizationInfoType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element ref="{}ProductTaxCode"/>
     *         &lt;element name="DeliveryStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="DeliveryEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="DeliveryTimeZone" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="DeliveryInstructions" type="{}LongStringNotNull" minOccurs="0"/>
     *         &lt;element name="ItemPrice" type="{}BuyerPrice"/>
     *         &lt;element name="ItemFees" type="{}AmazonFees"/>
     *         &lt;element name="ItemTaxData" type="{}TaxData" minOccurs="0"/>
     *         &lt;element name="ShippingTaxData" type="{}TaxData" minOccurs="0"/>
     *         &lt;element name="GiftWrapTaxData" type="{}TaxData" minOccurs="0"/>
     *         &lt;element name="Promotion" type="{}PromotionDataType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GiftWrapLevel" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="GiftMessageText" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
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
        "amazonOrderItemCode",
        "sku",
        "title",
        "customizationInfo",
        "quantity",
        "productTaxCode",
        "deliveryStartDate",
        "deliveryEndDate",
        "deliveryTimeZone",
        "deliveryInstructions",
        "itemPrice",
        "itemFees",
        "itemTaxData",
        "shippingTaxData",
        "giftWrapTaxData",
        "promotion",
        "giftWrapLevel",
        "giftMessageText"
    })
    public static class Item {

        @XmlElement(name = "AmazonOrderItemCode", required = true)
        protected String amazonOrderItemCode;
        @XmlElement(name = "SKU", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String sku;
        @XmlElement(name = "Title", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String title;
        @XmlElement(name = "CustomizationInfo")
        protected List<CustomizationInfoType> customizationInfo;
        @XmlElement(name = "Quantity", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;
        @XmlElement(name = "ProductTaxCode", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String productTaxCode;
        @XmlElement(name = "DeliveryStartDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar deliveryStartDate;
        @XmlElement(name = "DeliveryEndDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar deliveryEndDate;
        @XmlElement(name = "DeliveryTimeZone")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String deliveryTimeZone;
        @XmlElement(name = "DeliveryInstructions")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String deliveryInstructions;
        @XmlElement(name = "ItemPrice", required = true)
        protected BuyerPrice itemPrice;
        @XmlElement(name = "ItemFees", required = true)
        protected AmazonFees itemFees;
        @XmlElement(name = "ItemTaxData")
        protected TaxData itemTaxData;
        @XmlElement(name = "ShippingTaxData")
        protected TaxData shippingTaxData;
        @XmlElement(name = "GiftWrapTaxData")
        protected TaxData giftWrapTaxData;
        @XmlElement(name = "Promotion")
        protected List<PromotionDataType> promotion;
        @XmlElement(name = "GiftWrapLevel")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String giftWrapLevel;
        @XmlElement(name = "GiftMessageText")
        protected String giftMessageText;

        /**
         * 获取amazonOrderItemCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmazonOrderItemCode() {
            return amazonOrderItemCode;
        }

        /**
         * 设置amazonOrderItemCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmazonOrderItemCode(String value) {
            this.amazonOrderItemCode = value;
        }

        /**
         * 获取sku属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSKU() {
            return sku;
        }

        /**
         * 设置sku属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSKU(String value) {
            this.sku = value;
        }

        /**
         * 获取title属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * 设置title属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the customizationInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customizationInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomizationInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomizationInfoType }
         * 
         * 
         */
        public List<CustomizationInfoType> getCustomizationInfo() {
            if (customizationInfo == null) {
                customizationInfo = new ArrayList<CustomizationInfoType>();
            }
            return this.customizationInfo;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * 获取productTaxCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductTaxCode() {
            return productTaxCode;
        }

        /**
         * 设置productTaxCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductTaxCode(String value) {
            this.productTaxCode = value;
        }

        /**
         * 获取deliveryStartDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDeliveryStartDate() {
            return deliveryStartDate;
        }

        /**
         * 设置deliveryStartDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDeliveryStartDate(XMLGregorianCalendar value) {
            this.deliveryStartDate = value;
        }

        /**
         * 获取deliveryEndDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDeliveryEndDate() {
            return deliveryEndDate;
        }

        /**
         * 设置deliveryEndDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDeliveryEndDate(XMLGregorianCalendar value) {
            this.deliveryEndDate = value;
        }

        /**
         * 获取deliveryTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliveryTimeZone() {
            return deliveryTimeZone;
        }

        /**
         * 设置deliveryTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliveryTimeZone(String value) {
            this.deliveryTimeZone = value;
        }

        /**
         * 获取deliveryInstructions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliveryInstructions() {
            return deliveryInstructions;
        }

        /**
         * 设置deliveryInstructions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliveryInstructions(String value) {
            this.deliveryInstructions = value;
        }

        /**
         * 获取itemPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BuyerPrice }
         *     
         */
        public BuyerPrice getItemPrice() {
            return itemPrice;
        }

        /**
         * 设置itemPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BuyerPrice }
         *     
         */
        public void setItemPrice(BuyerPrice value) {
            this.itemPrice = value;
        }

        /**
         * 获取itemFees属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AmazonFees }
         *     
         */
        public AmazonFees getItemFees() {
            return itemFees;
        }

        /**
         * 设置itemFees属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AmazonFees }
         *     
         */
        public void setItemFees(AmazonFees value) {
            this.itemFees = value;
        }

        /**
         * 获取itemTaxData属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TaxData }
         *     
         */
        public TaxData getItemTaxData() {
            return itemTaxData;
        }

        /**
         * 设置itemTaxData属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TaxData }
         *     
         */
        public void setItemTaxData(TaxData value) {
            this.itemTaxData = value;
        }

        /**
         * 获取shippingTaxData属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TaxData }
         *     
         */
        public TaxData getShippingTaxData() {
            return shippingTaxData;
        }

        /**
         * 设置shippingTaxData属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TaxData }
         *     
         */
        public void setShippingTaxData(TaxData value) {
            this.shippingTaxData = value;
        }

        /**
         * 获取giftWrapTaxData属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TaxData }
         *     
         */
        public TaxData getGiftWrapTaxData() {
            return giftWrapTaxData;
        }

        /**
         * 设置giftWrapTaxData属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TaxData }
         *     
         */
        public void setGiftWrapTaxData(TaxData value) {
            this.giftWrapTaxData = value;
        }

        /**
         * Gets the value of the promotion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PromotionDataType }
         * 
         * 
         */
        public List<PromotionDataType> getPromotion() {
            if (promotion == null) {
                promotion = new ArrayList<PromotionDataType>();
            }
            return this.promotion;
        }

        /**
         * 获取giftWrapLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGiftWrapLevel() {
            return giftWrapLevel;
        }

        /**
         * 设置giftWrapLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGiftWrapLevel(String value) {
            this.giftWrapLevel = value;
        }

        /**
         * 获取giftMessageText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGiftMessageText() {
            return giftMessageText;
        }

        /**
         * 设置giftMessageText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGiftMessageText(String value) {
            this.giftMessageText = value;
        }

    }

}
