/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"productType", "batteryCellComposition", "manufacturerWarrantyDescription", "manufacturerSafetyWarning", "sellerWarrantyDescription", "warrantyType", "weeeTaxValue"})
/*     */ @XmlRootElement(name="Lighting")
/*     */ public class Lighting
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ProductType", required=true)
/*     */   protected ProductType productType;
/*     */ 
/*     */   @XmlElement(name="BatteryCellComposition")
/*     */   protected BatteryCellTypeValues batteryCellComposition;
/*     */ 
/*     */   @XmlElement(name="ManufacturerWarrantyDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String manufacturerWarrantyDescription;
/*     */ 
/*     */   @XmlElement(name="ManufacturerSafetyWarning")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String manufacturerSafetyWarning;
/*     */ 
/*     */   @XmlElement(name="SellerWarrantyDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sellerWarrantyDescription;
/*     */ 
/*     */   @XmlElement(name="WarrantyType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String warrantyType;
/*     */ 
/*     */   @XmlElement(name="WeeeTaxValue")
/*     */   protected CurencyDimension weeeTaxValue;
/*     */ 
/*     */   public ProductType getProductType()
/*     */   {
/*  97 */     return this.productType;
/*     */   }
/*     */ 
/*     */   public void setProductType(ProductType value)
/*     */   {
/* 109 */     this.productType = value;
/*     */   }
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellComposition()
/*     */   {
/* 121 */     return this.batteryCellComposition;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellComposition(BatteryCellTypeValues value)
/*     */   {
/* 133 */     this.batteryCellComposition = value;
/*     */   }
/*     */ 
/*     */   public String getManufacturerWarrantyDescription()
/*     */   {
/* 145 */     return this.manufacturerWarrantyDescription;
/*     */   }
/*     */ 
/*     */   public void setManufacturerWarrantyDescription(String value)
/*     */   {
/* 157 */     this.manufacturerWarrantyDescription = value;
/*     */   }
/*     */ 
/*     */   public String getManufacturerSafetyWarning()
/*     */   {
/* 169 */     return this.manufacturerSafetyWarning;
/*     */   }
/*     */ 
/*     */   public void setManufacturerSafetyWarning(String value)
/*     */   {
/* 181 */     this.manufacturerSafetyWarning = value;
/*     */   }
/*     */ 
/*     */   public String getSellerWarrantyDescription()
/*     */   {
/* 193 */     return this.sellerWarrantyDescription;
/*     */   }
/*     */ 
/*     */   public void setSellerWarrantyDescription(String value)
/*     */   {
/* 205 */     this.sellerWarrantyDescription = value;
/*     */   }
/*     */ 
/*     */   public String getWarrantyType()
/*     */   {
/* 217 */     return this.warrantyType;
/*     */   }
/*     */ 
/*     */   public void setWarrantyType(String value)
/*     */   {
/* 229 */     this.warrantyType = value;
/*     */   }
/*     */ 
/*     */   public CurencyDimension getWeeeTaxValue()
/*     */   {
/* 241 */     return this.weeeTaxValue;
/*     */   }
/*     */ 
/*     */   public void setWeeeTaxValue(CurencyDimension value)
/*     */   {
/* 253 */     this.weeeTaxValue = value;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"lightsAndFixtures", "lightingAccessories", "lightBulbs"})
/*     */   public static class ProductType
/*     */   {
/*     */ 
/*     */     @XmlElement(name="LightsAndFixtures")
/*     */     protected LightsAndFixtures lightsAndFixtures;
/*     */ 
/*     */     @XmlElement(name="LightingAccessories")
/*     */     protected LightingAccessories lightingAccessories;
/*     */ 
/*     */     @XmlElement(name="LightBulbs")
/*     */     protected LightBulbs lightBulbs;
/*     */ 
/*     */     public LightsAndFixtures getLightsAndFixtures()
/*     */     {
/* 302 */       return this.lightsAndFixtures;
/*     */     }
/*     */ 
/*     */     public void setLightsAndFixtures(LightsAndFixtures value)
/*     */     {
/* 314 */       this.lightsAndFixtures = value;
/*     */     }
/*     */ 
/*     */     public LightingAccessories getLightingAccessories()
/*     */     {
/* 326 */       return this.lightingAccessories;
/*     */     }
/*     */ 
/*     */     public void setLightingAccessories(LightingAccessories value)
/*     */     {
/* 338 */       this.lightingAccessories = value;
/*     */     }
/*     */ 
/*     */     public LightBulbs getLightBulbs()
/*     */     {
/* 350 */       return this.lightBulbs;
/*     */     }
/*     */ 
/*     */     public void setLightBulbs(LightBulbs value)
/*     */     {
/* 362 */       this.lightBulbs = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Lighting
 * JD-Core Version:    0.6.2
 */