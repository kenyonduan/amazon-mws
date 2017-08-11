/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"rebate", "productType", "batteryTypeLithiumIon", "batteryTypeLithiumMetal", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "numberOfLithiumIonCells", "numberOfLithiumMetalCells"})
/*     */ @XmlRootElement(name="Wireless")
/*     */ public class Wireless
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Rebate")
/*     */   protected List<RebateType> rebate;
/*     */ 
/*     */   @XmlElement(name="ProductType", required=true)
/*     */   protected ProductType productType;
/*     */ 
/*     */   @XmlElement(name="BatteryTypeLithiumIon")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryTypeLithiumIon;
/*     */ 
/*     */   @XmlElement(name="BatteryTypeLithiumMetal")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryTypeLithiumMetal;
/*     */ 
/*     */   @XmlElement(name="LithiumBatteryEnergyContent")
/*     */   protected BigDecimal lithiumBatteryEnergyContent;
/*     */ 
/*     */   @XmlElement(name="LithiumBatteryPackaging")
/*     */   protected String lithiumBatteryPackaging;
/*     */ 
/*     */   @XmlElement(name="LithiumBatteryVoltage")
/*     */   protected BigDecimal lithiumBatteryVoltage;
/*     */ 
/*     */   @XmlElement(name="LithiumBatteryWeight")
/*     */   protected BigDecimal lithiumBatteryWeight;
/*     */ 
/*     */   @XmlElement(name="NumberOfLithiumIonCells")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLithiumIonCells;
/*     */ 
/*     */   @XmlElement(name="NumberOfLithiumMetalCells")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLithiumMetalCells;
/*     */ 
/*     */   public List<RebateType> getRebate()
/*     */   {
/* 127 */     if (this.rebate == null) {
/* 128 */       this.rebate = new ArrayList();
/*     */     }
/* 130 */     return this.rebate;
/*     */   }
/*     */ 
/*     */   public ProductType getProductType()
/*     */   {
/* 142 */     return this.productType;
/*     */   }
/*     */ 
/*     */   public void setProductType(ProductType value)
/*     */   {
/* 154 */     this.productType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryTypeLithiumIon()
/*     */   {
/* 166 */     return this.batteryTypeLithiumIon;
/*     */   }
/*     */ 
/*     */   public void setBatteryTypeLithiumIon(BigInteger value)
/*     */   {
/* 178 */     this.batteryTypeLithiumIon = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryTypeLithiumMetal()
/*     */   {
/* 190 */     return this.batteryTypeLithiumMetal;
/*     */   }
/*     */ 
/*     */   public void setBatteryTypeLithiumMetal(BigInteger value)
/*     */   {
/* 202 */     this.batteryTypeLithiumMetal = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryEnergyContent()
/*     */   {
/* 214 */     return this.lithiumBatteryEnergyContent;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*     */   {
/* 226 */     this.lithiumBatteryEnergyContent = value;
/*     */   }
/*     */ 
/*     */   public String getLithiumBatteryPackaging()
/*     */   {
/* 238 */     return this.lithiumBatteryPackaging;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryPackaging(String value)
/*     */   {
/* 250 */     this.lithiumBatteryPackaging = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryVoltage()
/*     */   {
/* 262 */     return this.lithiumBatteryVoltage;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryVoltage(BigDecimal value)
/*     */   {
/* 274 */     this.lithiumBatteryVoltage = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryWeight()
/*     */   {
/* 286 */     return this.lithiumBatteryWeight;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryWeight(BigDecimal value)
/*     */   {
/* 298 */     this.lithiumBatteryWeight = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLithiumIonCells()
/*     */   {
/* 310 */     return this.numberOfLithiumIonCells;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLithiumIonCells(BigInteger value)
/*     */   {
/* 322 */     this.numberOfLithiumIonCells = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLithiumMetalCells()
/*     */   {
/* 334 */     return this.numberOfLithiumMetalCells;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*     */   {
/* 346 */     this.numberOfLithiumMetalCells = value;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"wirelessAccessories", "wirelessDownloads"})
/*     */   public static class ProductType
/*     */   {
/*     */ 
/*     */     @XmlElement(name="WirelessAccessories")
/*     */     protected WirelessAccessories wirelessAccessories;
/*     */ 
/*     */     @XmlElement(name="WirelessDownloads")
/*     */     protected WirelessDownloads wirelessDownloads;
/*     */ 
/*     */     public WirelessAccessories getWirelessAccessories()
/*     */     {
/* 391 */       return this.wirelessAccessories;
/*     */     }
/*     */ 
/*     */     public void setWirelessAccessories(WirelessAccessories value)
/*     */     {
/* 403 */       this.wirelessAccessories = value;
/*     */     }
/*     */ 
/*     */     public WirelessDownloads getWirelessDownloads()
/*     */     {
/* 415 */       return this.wirelessDownloads;
/*     */     }
/*     */ 
/*     */     public void setWirelessDownloads(WirelessDownloads value)
/*     */     {
/* 427 */       this.wirelessDownloads = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Wireless
 * JD-Core Version:    0.6.2
 */