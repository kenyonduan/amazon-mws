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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cameraFlash", "finishType", "flashDedication", "flashModesDescription", "guideNumber", "powerSource", "efficiency"})
/*     */ @XmlRootElement(name="CECameraFlash")
/*     */ public class CECameraFlash
/*     */ {
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
/*     */   @XmlElement(name="CameraFlash")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String cameraFlash;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="FlashDedication")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String flashDedication;
/*     */ 
/*     */   @XmlElement(name="FlashModesDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String flashModesDescription;
/*     */ 
/*     */   @XmlElement(name="GuideNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String guideNumber;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 102 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 114 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 126 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 138 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 150 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 162 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 174 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 186 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public String getCameraFlash()
/*     */   {
/* 198 */     return this.cameraFlash;
/*     */   }
/*     */ 
/*     */   public void setCameraFlash(String value)
/*     */   {
/* 210 */     this.cameraFlash = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 222 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 234 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public String getFlashDedication()
/*     */   {
/* 246 */     return this.flashDedication;
/*     */   }
/*     */ 
/*     */   public void setFlashDedication(String value)
/*     */   {
/* 258 */     this.flashDedication = value;
/*     */   }
/*     */ 
/*     */   public String getFlashModesDescription()
/*     */   {
/* 270 */     return this.flashModesDescription;
/*     */   }
/*     */ 
/*     */   public void setFlashModesDescription(String value)
/*     */   {
/* 282 */     this.flashModesDescription = value;
/*     */   }
/*     */ 
/*     */   public String getGuideNumber()
/*     */   {
/* 294 */     return this.guideNumber;
/*     */   }
/*     */ 
/*     */   public void setGuideNumber(String value)
/*     */   {
/* 306 */     this.guideNumber = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 318 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 330 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 342 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 354 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CECameraFlash
 * JD-Core Version:    0.6.2
 */