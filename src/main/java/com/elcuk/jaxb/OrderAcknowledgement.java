/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"amazonOrderID", "merchantOrderID", "statusCode", "item"})
/*     */ @XmlRootElement(name="OrderAcknowledgement")
/*     */ public class OrderAcknowledgement
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AmazonOrderID", required=true)
/*     */   protected String amazonOrderID;
/*     */ 
/*     */   @XmlElement(name="MerchantOrderID")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String merchantOrderID;
/*     */ 
/*     */   @XmlElement(name="StatusCode", required=true)
/*     */   protected String statusCode;
/*     */ 
/*     */   @XmlElement(name="Item")
/*     */   protected List<Item> item;
/*     */ 
/*     */   public String getAmazonOrderID()
/*     */   {
/* 100 */     return this.amazonOrderID;
/*     */   }
/*     */ 
/*     */   public void setAmazonOrderID(String value)
/*     */   {
/* 112 */     this.amazonOrderID = value;
/*     */   }
/*     */ 
/*     */   public String getMerchantOrderID()
/*     */   {
/* 124 */     return this.merchantOrderID;
/*     */   }
/*     */ 
/*     */   public void setMerchantOrderID(String value)
/*     */   {
/* 136 */     this.merchantOrderID = value;
/*     */   }
/*     */ 
/*     */   public String getStatusCode()
/*     */   {
/* 148 */     return this.statusCode;
/*     */   }
/*     */ 
/*     */   public void setStatusCode(String value)
/*     */   {
/* 160 */     this.statusCode = value;
/*     */   }
/*     */ 
/*     */   public List<Item> getItem()
/*     */   {
/* 186 */     if (this.item == null) {
/* 187 */       this.item = new ArrayList();
/*     */     }
/* 189 */     return this.item;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"amazonOrderItemCode", "merchantOrderItemID", "cancelReason"})
/*     */   public static class Item
/*     */   {
/*     */ 
/*     */     @XmlElement(name="AmazonOrderItemCode", required=true)
/*     */     protected String amazonOrderItemCode;
/*     */ 
/*     */     @XmlElement(name="MerchantOrderItemID")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String merchantOrderItemID;
/*     */ 
/*     */     @XmlElement(name="CancelReason")
/*     */     protected String cancelReason;
/*     */ 
/*     */     public String getAmazonOrderItemCode()
/*     */     {
/* 254 */       return this.amazonOrderItemCode;
/*     */     }
/*     */ 
/*     */     public void setAmazonOrderItemCode(String value)
/*     */     {
/* 266 */       this.amazonOrderItemCode = value;
/*     */     }
/*     */ 
/*     */     public String getMerchantOrderItemID()
/*     */     {
/* 278 */       return this.merchantOrderItemID;
/*     */     }
/*     */ 
/*     */     public void setMerchantOrderItemID(String value)
/*     */     {
/* 290 */       this.merchantOrderItemID = value;
/*     */     }
/*     */ 
/*     */     public String getCancelReason()
/*     */     {
/* 302 */       return this.cancelReason;
/*     */     }
/*     */ 
/*     */     public void setCancelReason(String value)
/*     */     {
/* 314 */       this.cancelReason = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OrderAcknowledgement
 * JD-Core Version:    0.6.2
 */