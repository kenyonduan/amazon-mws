/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
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
/*     */ @XmlType(name="", propOrder={"tier", "purchasingCategory", "purchasingSubCategory", "packagingType", "underlyingAvailability", "replenishmentCategory", "dropShipStatus", "outOfStockWebsiteMessage"})
/*     */ @XmlRootElement(name="Amazon-Only")
/*     */ public class AmazonOnly
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Tier", required=true)
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger tier;
/*     */ 
/*     */   @XmlElement(name="PurchasingCategory", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String purchasingCategory;
/*     */ 
/*     */   @XmlElement(name="PurchasingSubCategory", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String purchasingSubCategory;
/*     */ 
/*     */   @XmlElement(name="PackagingType", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String packagingType;
/*     */ 
/*     */   @XmlElement(name="UnderlyingAvailability", required=true)
/*     */   protected String underlyingAvailability;
/*     */ 
/*     */   @XmlElement(name="ReplenishmentCategory", required=true)
/*     */   protected String replenishmentCategory;
/*     */ 
/*     */   @XmlElement(name="DropShipStatus", required=true)
/*     */   protected String dropShipStatus;
/*     */ 
/*     */   @XmlElement(name="OutOfStockWebsiteMessage", required=true)
/*     */   protected String outOfStockWebsiteMessage;
/*     */ 
/*     */   public BigInteger getTier()
/*     */   {
/* 128 */     return this.tier;
/*     */   }
/*     */ 
/*     */   public void setTier(BigInteger value)
/*     */   {
/* 140 */     this.tier = value;
/*     */   }
/*     */ 
/*     */   public String getPurchasingCategory()
/*     */   {
/* 152 */     return this.purchasingCategory;
/*     */   }
/*     */ 
/*     */   public void setPurchasingCategory(String value)
/*     */   {
/* 164 */     this.purchasingCategory = value;
/*     */   }
/*     */ 
/*     */   public String getPurchasingSubCategory()
/*     */   {
/* 176 */     return this.purchasingSubCategory;
/*     */   }
/*     */ 
/*     */   public void setPurchasingSubCategory(String value)
/*     */   {
/* 188 */     this.purchasingSubCategory = value;
/*     */   }
/*     */ 
/*     */   public String getPackagingType()
/*     */   {
/* 200 */     return this.packagingType;
/*     */   }
/*     */ 
/*     */   public void setPackagingType(String value)
/*     */   {
/* 212 */     this.packagingType = value;
/*     */   }
/*     */ 
/*     */   public String getUnderlyingAvailability()
/*     */   {
/* 224 */     return this.underlyingAvailability;
/*     */   }
/*     */ 
/*     */   public void setUnderlyingAvailability(String value)
/*     */   {
/* 236 */     this.underlyingAvailability = value;
/*     */   }
/*     */ 
/*     */   public String getReplenishmentCategory()
/*     */   {
/* 248 */     return this.replenishmentCategory;
/*     */   }
/*     */ 
/*     */   public void setReplenishmentCategory(String value)
/*     */   {
/* 260 */     this.replenishmentCategory = value;
/*     */   }
/*     */ 
/*     */   public String getDropShipStatus()
/*     */   {
/* 272 */     return this.dropShipStatus;
/*     */   }
/*     */ 
/*     */   public void setDropShipStatus(String value)
/*     */   {
/* 284 */     this.dropShipStatus = value;
/*     */   }
/*     */ 
/*     */   public String getOutOfStockWebsiteMessage()
/*     */   {
/* 296 */     return this.outOfStockWebsiteMessage;
/*     */   }
/*     */ 
/*     */   public void setOutOfStockWebsiteMessage(String value)
/*     */   {
/* 308 */     this.outOfStockWebsiteMessage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AmazonOnly
 * JD-Core Version:    0.6.2
 */