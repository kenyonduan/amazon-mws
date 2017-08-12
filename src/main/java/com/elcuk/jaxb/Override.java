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
/*     */ @XmlType(name="", propOrder={"sku", "shippingOverride"})
/*     */ @XmlRootElement(name="Override")
/*     */ public class Override
/*     */ {
/*     */ 
/*     */   @XmlElement(name="SKU", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sku;
/*     */ 
/*     */   @XmlElement(name="ShippingOverride")
/*     */   protected List<ShippingOverride> shippingOverride;
/*     */ 
/*     */   public String getSKU()
/*     */   {
/*  82 */     return this.sku;
/*     */   }
/*     */ 
/*     */   public void setSKU(String value)
/*     */   {
/*  94 */     this.sku = value;
/*     */   }
/*     */ 
/*     */   public List<ShippingOverride> getShippingOverride()
/*     */   {
/* 120 */     if (this.shippingOverride == null) {
/* 121 */       this.shippingOverride = new ArrayList();
/*     */     }
/* 123 */     return this.shippingOverride;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"shipOption", "isShippingRestricted", "type", "shipAmount"})
/*     */   public static class ShippingOverride
/*     */   {
/*     */ 
/*     */     @XmlElement(name="ShipOption", required=true)
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String shipOption;
/*     */ 
/*     */     @XmlElement(name="IsShippingRestricted")
/*     */     protected Boolean isShippingRestricted;
/*     */ 
/*     */     @XmlElement(name="Type")
/*     */     protected String type;
/*     */ 
/*     */     @XmlElement(name="ShipAmount")
/*     */     protected CurrencyAmount shipAmount;
/*     */ 
/*     */     public String getShipOption()
/*     */     {
/* 188 */       return this.shipOption;
/*     */     }
/*     */ 
/*     */     public void setShipOption(String value)
/*     */     {
/* 200 */       this.shipOption = value;
/*     */     }
/*     */ 
/*     */     public Boolean isIsShippingRestricted()
/*     */     {
/* 212 */       return this.isShippingRestricted;
/*     */     }
/*     */ 
/*     */     public void setIsShippingRestricted(Boolean value)
/*     */     {
/* 224 */       this.isShippingRestricted = value;
/*     */     }
/*     */ 
/*     */     public String getType()
/*     */     {
/* 236 */       return this.type;
/*     */     }
/*     */ 
/*     */     public void setType(String value)
/*     */     {
/* 248 */       this.type = value;
/*     */     }
/*     */ 
/*     */     public CurrencyAmount getShipAmount()
/*     */     {
/* 260 */       return this.shipAmount;
/*     */     }
/*     */ 
/*     */     public void setShipAmount(CurrencyAmount value)
/*     */     {
/* 272 */       this.shipAmount = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Override
 * JD-Core Version:    0.6.2
 */