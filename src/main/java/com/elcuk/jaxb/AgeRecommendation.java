/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"minimumManufacturerAgeRecommended", "maximumManufacturerAgeRecommended", "minimumMerchantAgeRecommended", "maximumMerchantAgeRecommended"})
/*     */ @XmlRootElement(name="AgeRecommendation")
/*     */ public class AgeRecommendation
/*     */ {
/*     */ 
/*     */   @XmlElement(name="MinimumManufacturerAgeRecommended")
/*     */   protected MinimumAgeRecommendedDimension minimumManufacturerAgeRecommended;
/*     */ 
/*     */   @XmlElement(name="MaximumManufacturerAgeRecommended")
/*     */   protected AgeRecommendedDimension maximumManufacturerAgeRecommended;
/*     */ 
/*     */   @XmlElement(name="MinimumMerchantAgeRecommended")
/*     */   protected MinimumAgeRecommendedDimension minimumMerchantAgeRecommended;
/*     */ 
/*     */   @XmlElement(name="MaximumMerchantAgeRecommended")
/*     */   protected AgeRecommendedDimension maximumMerchantAgeRecommended;
/*     */ 
/*     */   public MinimumAgeRecommendedDimension getMinimumManufacturerAgeRecommended()
/*     */   {
/*  61 */     return this.minimumManufacturerAgeRecommended;
/*     */   }
/*     */ 
/*     */   public void setMinimumManufacturerAgeRecommended(MinimumAgeRecommendedDimension value)
/*     */   {
/*  73 */     this.minimumManufacturerAgeRecommended = value;
/*     */   }
/*     */ 
/*     */   public AgeRecommendedDimension getMaximumManufacturerAgeRecommended()
/*     */   {
/*  85 */     return this.maximumManufacturerAgeRecommended;
/*     */   }
/*     */ 
/*     */   public void setMaximumManufacturerAgeRecommended(AgeRecommendedDimension value)
/*     */   {
/*  97 */     this.maximumManufacturerAgeRecommended = value;
/*     */   }
/*     */ 
/*     */   public MinimumAgeRecommendedDimension getMinimumMerchantAgeRecommended()
/*     */   {
/* 109 */     return this.minimumMerchantAgeRecommended;
/*     */   }
/*     */ 
/*     */   public void setMinimumMerchantAgeRecommended(MinimumAgeRecommendedDimension value)
/*     */   {
/* 121 */     this.minimumMerchantAgeRecommended = value;
/*     */   }
/*     */ 
/*     */   public AgeRecommendedDimension getMaximumMerchantAgeRecommended()
/*     */   {
/* 133 */     return this.maximumMerchantAgeRecommended;
/*     */   }
/*     */ 
/*     */   public void setMaximumMerchantAgeRecommended(AgeRecommendedDimension value)
/*     */   {
/* 145 */     this.maximumMerchantAgeRecommended = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AgeRecommendation
 * JD-Core Version:    0.6.2
 */