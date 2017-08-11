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
/*     */ @XmlType(name="", propOrder={"batteryChargeCycles", "cableLength", "powerSource", "wirelessTechnology", "batteryCellType", "batteryPower", "efficiency", "finishType", "powerPlugType", "surgeProtectionRating", "totalPowerOutlets"})
/*     */ @XmlRootElement(name="PowerSuppliesOrProtection")
/*     */ public class PowerSuppliesOrProtection
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BatteryChargeCycles")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryChargeCycles;
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="BatteryCellType")
/*     */   protected BatteryCellTypeValues batteryCellType;
/*     */ 
/*     */   @XmlElement(name="BatteryPower")
/*     */   protected BatteryPowerIntegerDimension batteryPower;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="SurgeProtectionRating")
/*     */   protected EnergyRatingType surgeProtectionRating;
/*     */ 
/*     */   @XmlElement(name="TotalPowerOutlets")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalPowerOutlets;
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 101 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 113 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/* 125 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/* 137 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 149 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 161 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 187 */     if (this.wirelessTechnology == null) {
/* 188 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 190 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 202 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 214 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 226 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 238 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 250 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 262 */     this.efficiency = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 274 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 286 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 298 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 310 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public EnergyRatingType getSurgeProtectionRating()
/*     */   {
/* 322 */     return this.surgeProtectionRating;
/*     */   }
/*     */ 
/*     */   public void setSurgeProtectionRating(EnergyRatingType value)
/*     */   {
/* 334 */     this.surgeProtectionRating = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalPowerOutlets()
/*     */   {
/* 346 */     return this.totalPowerOutlets;
/*     */   }
/*     */ 
/*     */   public void setTotalPowerOutlets(BigInteger value)
/*     */   {
/* 358 */     this.totalPowerOutlets = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PowerSuppliesOrProtection
 * JD-Core Version:    0.6.2
 */