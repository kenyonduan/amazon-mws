/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"amazonOrderID", "merchantOrderID", "merchantFulfillmentID", "fulfillmentDate", "fulfillmentData", "item"})
/*     */ @XmlRootElement(name="OrderFulfillment")
/*     */ public class OrderFulfillment
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AmazonOrderID")
/*     */   protected String amazonOrderID;
/*     */ 
/*     */   @XmlElement(name="MerchantOrderID")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String merchantOrderID;
/*     */ 
/*     */   @XmlElement(name="MerchantFulfillmentID")
/*     */   protected BigInteger merchantFulfillmentID;
/*     */ 
/*     */   @XmlElement(name="FulfillmentDate", required=true)
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar fulfillmentDate;
/*     */ 
/*     */   @XmlElement(name="FulfillmentData")
/*     */   protected FulfillmentData fulfillmentData;
/*     */ 
/*     */   @XmlElement(name="Item")
/*     */   protected List<Item> item;
/*     */ 
/*     */   public String getAmazonOrderID()
/*     */   {
/* 110 */     return this.amazonOrderID;
/*     */   }
/*     */ 
/*     */   public void setAmazonOrderID(String value)
/*     */   {
/* 122 */     this.amazonOrderID = value;
/*     */   }
/*     */ 
/*     */   public String getMerchantOrderID()
/*     */   {
/* 134 */     return this.merchantOrderID;
/*     */   }
/*     */ 
/*     */   public void setMerchantOrderID(String value)
/*     */   {
/* 146 */     this.merchantOrderID = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMerchantFulfillmentID()
/*     */   {
/* 158 */     return this.merchantFulfillmentID;
/*     */   }
/*     */ 
/*     */   public void setMerchantFulfillmentID(BigInteger value)
/*     */   {
/* 170 */     this.merchantFulfillmentID = value;
/*     */   }
/*     */ 
/*     */   public XMLGregorianCalendar getFulfillmentDate()
/*     */   {
/* 182 */     return this.fulfillmentDate;
/*     */   }
/*     */ 
/*     */   public void setFulfillmentDate(XMLGregorianCalendar value)
/*     */   {
/* 194 */     this.fulfillmentDate = value;
/*     */   }
/*     */ 
/*     */   public FulfillmentData getFulfillmentData()
/*     */   {
/* 206 */     return this.fulfillmentData;
/*     */   }
/*     */ 
/*     */   public void setFulfillmentData(FulfillmentData value)
/*     */   {
/* 218 */     this.fulfillmentData = value;
/*     */   }
/*     */ 
/*     */   public List<Item> getItem()
/*     */   {
/* 244 */     if (this.item == null) {
/* 245 */       this.item = new ArrayList();
/*     */     }
/* 247 */     return this.item;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"amazonOrderItemCode", "merchantOrderItemID", "merchantFulfillmentItemID", "quantity"})
/*     */   public static class Item
/*     */   {
/*     */ 
/*     */     @XmlElement(name="AmazonOrderItemCode")
/*     */     protected String amazonOrderItemCode;
/*     */ 
/*     */     @XmlElement(name="MerchantOrderItemID")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String merchantOrderItemID;
/*     */ 
/*     */     @XmlElement(name="MerchantFulfillmentItemID")
/*     */     protected BigInteger merchantFulfillmentItemID;
/*     */ 
/*     */     @XmlElement(name="Quantity")
/*     */     @XmlSchemaType(name="positiveInteger")
/*     */     protected BigInteger quantity;
/*     */ 
/*     */     public String getAmazonOrderItemCode()
/*     */     {
/* 448 */       return this.amazonOrderItemCode;
/*     */     }
/*     */ 
/*     */     public void setAmazonOrderItemCode(String value)
/*     */     {
/* 460 */       this.amazonOrderItemCode = value;
/*     */     }
/*     */ 
/*     */     public String getMerchantOrderItemID()
/*     */     {
/* 472 */       return this.merchantOrderItemID;
/*     */     }
/*     */ 
/*     */     public void setMerchantOrderItemID(String value)
/*     */     {
/* 484 */       this.merchantOrderItemID = value;
/*     */     }
/*     */ 
/*     */     public BigInteger getMerchantFulfillmentItemID()
/*     */     {
/* 496 */       return this.merchantFulfillmentItemID;
/*     */     }
/*     */ 
/*     */     public void setMerchantFulfillmentItemID(BigInteger value)
/*     */     {
/* 508 */       this.merchantFulfillmentItemID = value;
/*     */     }
/*     */ 
/*     */     public BigInteger getQuantity()
/*     */     {
/* 520 */       return this.quantity;
/*     */     }
/*     */ 
/*     */     public void setQuantity(BigInteger value)
/*     */     {
/* 532 */       this.quantity = value;
/*     */     }
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"carrierCode", "carrierName", "shippingMethod", "shipperTrackingNumber"})
/*     */   public static class FulfillmentData
/*     */   {
/*     */ 
/*     */     @XmlElement(name="CarrierCode")
/*     */     protected String carrierCode;
/*     */ 
/*     */     @XmlElement(name="CarrierName")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String carrierName;
/*     */ 
/*     */     @XmlElement(name="ShippingMethod")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String shippingMethod;
/*     */ 
/*     */     @XmlElement(name="ShipperTrackingNumber")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String shipperTrackingNumber;
/*     */ 
/*     */     public String getCarrierCode()
/*     */     {
/* 305 */       return this.carrierCode;
/*     */     }
/*     */ 
/*     */     public void setCarrierCode(String value)
/*     */     {
/* 317 */       this.carrierCode = value;
/*     */     }
/*     */ 
/*     */     public String getCarrierName()
/*     */     {
/* 329 */       return this.carrierName;
/*     */     }
/*     */ 
/*     */     public void setCarrierName(String value)
/*     */     {
/* 341 */       this.carrierName = value;
/*     */     }
/*     */ 
/*     */     public String getShippingMethod()
/*     */     {
/* 353 */       return this.shippingMethod;
/*     */     }
/*     */ 
/*     */     public void setShippingMethod(String value)
/*     */     {
/* 365 */       this.shippingMethod = value;
/*     */     }
/*     */ 
/*     */     public String getShipperTrackingNumber()
/*     */     {
/* 377 */       return this.shipperTrackingNumber;
/*     */     }
/*     */ 
/*     */     public void setShipperTrackingNumber(String value)
/*     */     {
/* 389 */       this.shipperTrackingNumber = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OrderFulfillment
 * JD-Core Version:    0.6.2
 */