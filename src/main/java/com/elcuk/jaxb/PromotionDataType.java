/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="PromotionDataType", propOrder={"promotionClaimCode", "merchantPromotionID", "component"})
/*     */ public class PromotionDataType
/*     */ {
/*     */ 
/*     */   @XmlElement(name="PromotionClaimCode", required=true)
/*     */   protected String promotionClaimCode;
/*     */ 
/*     */   @XmlElement(name="MerchantPromotionID", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String merchantPromotionID;
/*     */ 
/*     */   @XmlElement(name="Component", required=true)
/*     */   protected List<Component> component;
/*     */ 
/*     */   public String getPromotionClaimCode()
/*     */   {
/*  71 */     return this.promotionClaimCode;
/*     */   }
/*     */ 
/*     */   public void setPromotionClaimCode(String value)
/*     */   {
/*  83 */     this.promotionClaimCode = value;
/*     */   }
/*     */ 
/*     */   public String getMerchantPromotionID()
/*     */   {
/*  95 */     return this.merchantPromotionID;
/*     */   }
/*     */ 
/*     */   public void setMerchantPromotionID(String value)
/*     */   {
/* 107 */     this.merchantPromotionID = value;
/*     */   }
/*     */ 
/*     */   public List<Component> getComponent()
/*     */   {
/* 133 */     if (this.component == null) {
/* 134 */       this.component = new ArrayList();
/*     */     }
/* 136 */     return this.component;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"type", "amount"})
/*     */   public static class Component
/*     */   {
/*     */ 
/*     */     @XmlElement(name="Type", required=true)
/*     */     protected PromotionApplicationType type;
/*     */ 
/*     */     @XmlElement(name="Amount", required=true)
/*     */     protected CurrencyAmount amount;
/*     */ 
/*     */     public PromotionApplicationType getType()
/*     */     {
/* 181 */       return this.type;
/*     */     }
/*     */ 
/*     */     public void setType(PromotionApplicationType value)
/*     */     {
/* 193 */       this.type = value;
/*     */     }
/*     */ 
/*     */     public CurrencyAmount getAmount()
/*     */     {
/* 205 */       return this.amount;
/*     */     }
/*     */ 
/*     */     public void setAmount(CurrencyAmount value)
/*     */     {
/* 217 */       this.amount = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PromotionDataType
 * JD-Core Version:    0.6.2
 */