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
/*     */ @XmlType(name="", propOrder={"analogRGBInput", "batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cableLength", "finishType", "powerPlugType", "powerSource", "efficiency"})
/*     */ @XmlRootElement(name="CameraPowerSupply")
/*     */ public class CameraPowerSupply
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AnalogRGBInput")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> analogRGBInput;
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
/*     */   @XmlElement(name="BoxContents")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String boxContents;
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public List<String> getAnalogRGBInput()
/*     */   {
/* 111 */     if (this.analogRGBInput == null) {
/* 112 */       this.analogRGBInput = new ArrayList();
/*     */     }
/* 114 */     return this.analogRGBInput;
/*     */   }
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 126 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 138 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 150 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 162 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 174 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 186 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 198 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 210 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/* 222 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/* 234 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 246 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 258 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 270 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 282 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 294 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 306 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 318 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 330 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CameraPowerSupply
 * JD-Core Version:    0.6.2
 */