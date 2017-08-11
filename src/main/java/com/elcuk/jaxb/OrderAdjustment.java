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
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"amazonOrderID", "merchantOrderID", "adjustedItem"})
/*     */ @XmlRootElement(name="OrderAdjustment")
/*     */ public class OrderAdjustment
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AmazonOrderID")
/*     */   protected String amazonOrderID;
/*     */ 
/*     */   @XmlElement(name="MerchantOrderID")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String merchantOrderID;
/*     */ 
/*     */   @XmlElement(name="AdjustedItem", required=true)
/*     */   protected List<AdjustedItem> adjustedItem;
/*     */ 
/*     */   public String getAmazonOrderID()
/*     */   {
/* 129 */     return this.amazonOrderID;
/*     */   }
/*     */ 
/*     */   public void setAmazonOrderID(String value)
/*     */   {
/* 141 */     this.amazonOrderID = value;
/*     */   }
/*     */ 
/*     */   public String getMerchantOrderID()
/*     */   {
/* 153 */     return this.merchantOrderID;
/*     */   }
/*     */ 
/*     */   public void setMerchantOrderID(String value)
/*     */   {
/* 165 */     this.merchantOrderID = value;
/*     */   }
/*     */ 
/*     */   public List<AdjustedItem> getAdjustedItem()
/*     */   {
/* 191 */     if (this.adjustedItem == null) {
/* 192 */       this.adjustedItem = new ArrayList();
/*     */     }
/* 194 */     return this.adjustedItem;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"amazonOrderItemCode", "merchantOrderItemID", "merchantAdjustmentItemID", "adjustmentReason", "itemPriceAdjustments", "promotionAdjustments", "directPaymentAdjustments", "quantityCancelled"})
/*     */   public static class AdjustedItem
/*     */   {
/*     */ 
/*     */     @XmlElement(name="AmazonOrderItemCode")
/*     */     protected String amazonOrderItemCode;
/*     */ 
/*     */     @XmlElement(name="MerchantOrderItemID")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String merchantOrderItemID;
/*     */ 
/*     */     @XmlElement(name="MerchantAdjustmentItemID")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String merchantAdjustmentItemID;
/*     */ 
/*     */     @XmlElement(name="AdjustmentReason", required=true)
/*     */     protected String adjustmentReason;
/*     */ 
/*     */     @XmlElement(name="ItemPriceAdjustments", required=true)
/*     */     protected BuyerPrice itemPriceAdjustments;
/*     */ 
/*     */     @XmlElement(name="PromotionAdjustments")
/*     */     protected List<PromotionAdjustments> promotionAdjustments;
/*     */ 
/*     */     @XmlElement(name="DirectPaymentAdjustments")
/*     */     protected DirectPaymentType directPaymentAdjustments;
/*     */ 
/*     */     @XmlElement(name="QuantityCancelled")
/*     */     @XmlSchemaType(name="positiveInteger")
/*     */     protected BigInteger quantityCancelled;
/*     */ 
/*     */     public String getAmazonOrderItemCode()
/*     */     {
/* 312 */       return this.amazonOrderItemCode;
/*     */     }
/*     */ 
/*     */     public void setAmazonOrderItemCode(String value)
/*     */     {
/* 324 */       this.amazonOrderItemCode = value;
/*     */     }
/*     */ 
/*     */     public String getMerchantOrderItemID()
/*     */     {
/* 336 */       return this.merchantOrderItemID;
/*     */     }
/*     */ 
/*     */     public void setMerchantOrderItemID(String value)
/*     */     {
/* 348 */       this.merchantOrderItemID = value;
/*     */     }
/*     */ 
/*     */     public String getMerchantAdjustmentItemID()
/*     */     {
/* 360 */       return this.merchantAdjustmentItemID;
/*     */     }
/*     */ 
/*     */     public void setMerchantAdjustmentItemID(String value)
/*     */     {
/* 372 */       this.merchantAdjustmentItemID = value;
/*     */     }
/*     */ 
/*     */     public String getAdjustmentReason()
/*     */     {
/* 384 */       return this.adjustmentReason;
/*     */     }
/*     */ 
/*     */     public void setAdjustmentReason(String value)
/*     */     {
/* 396 */       this.adjustmentReason = value;
/*     */     }
/*     */ 
/*     */     public BuyerPrice getItemPriceAdjustments()
/*     */     {
/* 408 */       return this.itemPriceAdjustments;
/*     */     }
/*     */ 
/*     */     public void setItemPriceAdjustments(BuyerPrice value)
/*     */     {
/* 420 */       this.itemPriceAdjustments = value;
/*     */     }
/*     */ 
/*     */     public List<PromotionAdjustments> getPromotionAdjustments()
/*     */     {
/* 446 */       if (this.promotionAdjustments == null) {
/* 447 */         this.promotionAdjustments = new ArrayList();
/*     */       }
/* 449 */       return this.promotionAdjustments;
/*     */     }
/*     */ 
/*     */     public DirectPaymentType getDirectPaymentAdjustments()
/*     */     {
/* 461 */       return this.directPaymentAdjustments;
/*     */     }
/*     */ 
/*     */     public void setDirectPaymentAdjustments(DirectPaymentType value)
/*     */     {
/* 473 */       this.directPaymentAdjustments = value;
/*     */     }
/*     */ 
/*     */     public BigInteger getQuantityCancelled()
/*     */     {
/* 485 */       return this.quantityCancelled;
/*     */     }
/*     */ 
/*     */     public void setQuantityCancelled(BigInteger value)
/*     */     {
/* 497 */       this.quantityCancelled = value;
/*     */     }
/*     */ 
/*     */     @XmlAccessorType(XmlAccessType.FIELD)
/*     */     @XmlType(name="", propOrder={"promotionClaimCode", "merchantPromotionID", "component"})
/*     */     public static class PromotionAdjustments
/*     */     {
/*     */ 
/*     */       @XmlElement(name="PromotionClaimCode")
/*     */       protected String promotionClaimCode;
/*     */ 
/*     */       @XmlElement(name="MerchantPromotionID")
/*     */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */       protected String merchantPromotionID;
/*     */ 
/*     */       @XmlElement(name="Component", required=true)
/*     */       protected List<Component> component;
/*     */ 
/*     */       public String getPromotionClaimCode()
/*     */       {
/* 558 */         return this.promotionClaimCode;
/*     */       }
/*     */ 
/*     */       public void setPromotionClaimCode(String value)
/*     */       {
/* 570 */         this.promotionClaimCode = value;
/*     */       }
/*     */ 
/*     */       public String getMerchantPromotionID()
/*     */       {
/* 582 */         return this.merchantPromotionID;
/*     */       }
/*     */ 
/*     */       public void setMerchantPromotionID(String value)
/*     */       {
/* 594 */         this.merchantPromotionID = value;
/*     */       }
/*     */ 
/*     */       public List<Component> getComponent()
/*     */       {
/* 620 */         if (this.component == null) {
/* 621 */           this.component = new ArrayList();
/*     */         }
/* 623 */         return this.component;
/*     */       }
/*     */ 
/*     */       @XmlAccessorType(XmlAccessType.FIELD)
/*     */       @XmlType(name="", propOrder={"type", "amount"})
/*     */       public static class Component
/*     */       {
/*     */ 
/*     */         @XmlElement(name="Type", required=true)
/*     */         protected PromotionApplicationType type;
/*     */ 
/*     */         @XmlElement(name="Amount", required=true)
/*     */         protected CurrencyAmount amount;
/*     */ 
/*     */         public PromotionApplicationType getType()
/*     */         {
/* 668 */           return this.type;
/*     */         }
/*     */ 
/*     */         public void setType(PromotionApplicationType value)
/*     */         {
/* 680 */           this.type = value;
/*     */         }
/*     */ 
/*     */         public CurrencyAmount getAmount()
/*     */         {
/* 692 */           return this.amount;
/*     */         }
/*     */ 
/*     */         public void setAmount(CurrencyAmount value)
/*     */         {
/* 704 */           this.amount = value;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OrderAdjustment
 * JD-Core Version:    0.6.2
 */