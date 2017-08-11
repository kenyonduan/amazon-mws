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
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"amplifierType", "batteryCellType", "batteryChargeCycles", "batteryPower", "cableLength", "controlType", "fitType", "headphoneEarcupMotion", "noiseReductionLevel", "powerPlugType", "powerSource", "shape", "totalComponentInPorts", "wirelessTechnology", "efficiency"})
/*     */ @XmlRootElement(name="Headphones")
/*     */ public class Headphones
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AmplifierType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String amplifierType;
/*     */ 
/*     */   @XmlElement(name="BatteryCellType")
/*     */   protected BatteryCellTypeValues batteryCellType;
/*     */ 
/*     */   @XmlElement(name="BatteryChargeCycles")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryChargeCycles;
/*     */ 
/*     */   @XmlElement(name="BatteryPower")
/*     */   protected BatteryPowerIntegerDimension batteryPower;
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="ControlType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String controlType;
/*     */ 
/*     */   @XmlElement(name="FitType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String fitType;
/*     */ 
/*     */   @XmlElement(name="HeadphoneEarcupMotion")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String headphoneEarcupMotion;
/*     */ 
/*     */   @XmlElement(name="NoiseReductionLevel")
/*     */   protected BigDecimal noiseReductionLevel;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="Shape")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String shape;
/*     */ 
/*     */   @XmlElement(name="TotalComponentInPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalComponentInPorts;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public String getAmplifierType()
/*     */   {
/* 122 */     return this.amplifierType;
/*     */   }
/*     */ 
/*     */   public void setAmplifierType(String value)
/*     */   {
/* 134 */     this.amplifierType = value;
/*     */   }
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 146 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 158 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 170 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 182 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 194 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 206 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/* 218 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/* 230 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public String getControlType()
/*     */   {
/* 242 */     return this.controlType;
/*     */   }
/*     */ 
/*     */   public void setControlType(String value)
/*     */   {
/* 254 */     this.controlType = value;
/*     */   }
/*     */ 
/*     */   public String getFitType()
/*     */   {
/* 266 */     return this.fitType;
/*     */   }
/*     */ 
/*     */   public void setFitType(String value)
/*     */   {
/* 278 */     this.fitType = value;
/*     */   }
/*     */ 
/*     */   public String getHeadphoneEarcupMotion()
/*     */   {
/* 290 */     return this.headphoneEarcupMotion;
/*     */   }
/*     */ 
/*     */   public void setHeadphoneEarcupMotion(String value)
/*     */   {
/* 302 */     this.headphoneEarcupMotion = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getNoiseReductionLevel()
/*     */   {
/* 314 */     return this.noiseReductionLevel;
/*     */   }
/*     */ 
/*     */   public void setNoiseReductionLevel(BigDecimal value)
/*     */   {
/* 326 */     this.noiseReductionLevel = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 338 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 350 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 362 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 374 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getShape()
/*     */   {
/* 386 */     return this.shape;
/*     */   }
/*     */ 
/*     */   public void setShape(String value)
/*     */   {
/* 398 */     this.shape = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalComponentInPorts()
/*     */   {
/* 410 */     return this.totalComponentInPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalComponentInPorts(BigInteger value)
/*     */   {
/* 422 */     this.totalComponentInPorts = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 448 */     if (this.wirelessTechnology == null) {
/* 449 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 451 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 463 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 475 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Headphones
 * JD-Core Version:    0.6.2
 */