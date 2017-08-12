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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "coatingDescription", "digitalZoom", "effectiveStillResolution", "finishType", "focusType", "imageStabilization", "lens", "memorySlotsAvailable", "maxFocalLength", "powerSource", "removableMemory", "softwareIncluded", "viewFinderType", "efficiency"})
/*     */ @XmlRootElement(name="CEBinocular")
/*     */ public class CEBinocular
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
/*     */   @XmlElement(name="CoatingDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String coatingDescription;
/*     */ 
/*     */   @XmlElement(name="DigitalZoom")
/*     */   protected ZoomDimension digitalZoom;
/*     */ 
/*     */   @XmlElement(name="EffectiveStillResolution")
/*     */   protected ResolutionDimension effectiveStillResolution;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="FocusType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String focusType;
/*     */ 
/*     */   @XmlElement(name="ImageStabilization")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String imageStabilization;
/*     */ 
/*     */   @XmlElement(name="Lens")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String lens;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="MaxFocalLength")
/*     */   protected LengthDimension maxFocalLength;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="RemovableMemory")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String removableMemory;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="ViewFinderType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String viewFinderType;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 134 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 146 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 158 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 170 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 182 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 194 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 206 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 218 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public String getCoatingDescription()
/*     */   {
/* 230 */     return this.coatingDescription;
/*     */   }
/*     */ 
/*     */   public void setCoatingDescription(String value)
/*     */   {
/* 242 */     this.coatingDescription = value;
/*     */   }
/*     */ 
/*     */   public ZoomDimension getDigitalZoom()
/*     */   {
/* 254 */     return this.digitalZoom;
/*     */   }
/*     */ 
/*     */   public void setDigitalZoom(ZoomDimension value)
/*     */   {
/* 266 */     this.digitalZoom = value;
/*     */   }
/*     */ 
/*     */   public ResolutionDimension getEffectiveStillResolution()
/*     */   {
/* 278 */     return this.effectiveStillResolution;
/*     */   }
/*     */ 
/*     */   public void setEffectiveStillResolution(ResolutionDimension value)
/*     */   {
/* 290 */     this.effectiveStillResolution = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 302 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 314 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public String getFocusType()
/*     */   {
/* 326 */     return this.focusType;
/*     */   }
/*     */ 
/*     */   public void setFocusType(String value)
/*     */   {
/* 338 */     this.focusType = value;
/*     */   }
/*     */ 
/*     */   public String getImageStabilization()
/*     */   {
/* 350 */     return this.imageStabilization;
/*     */   }
/*     */ 
/*     */   public void setImageStabilization(String value)
/*     */   {
/* 362 */     this.imageStabilization = value;
/*     */   }
/*     */ 
/*     */   public String getLens()
/*     */   {
/* 374 */     return this.lens;
/*     */   }
/*     */ 
/*     */   public void setLens(String value)
/*     */   {
/* 386 */     this.lens = value;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 398 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 410 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMaxFocalLength()
/*     */   {
/* 422 */     return this.maxFocalLength;
/*     */   }
/*     */ 
/*     */   public void setMaxFocalLength(LengthDimension value)
/*     */   {
/* 434 */     this.maxFocalLength = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 446 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 458 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getRemovableMemory()
/*     */   {
/* 470 */     return this.removableMemory;
/*     */   }
/*     */ 
/*     */   public void setRemovableMemory(String value)
/*     */   {
/* 482 */     this.removableMemory = value;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 494 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 506 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public String getViewFinderType()
/*     */   {
/* 518 */     return this.viewFinderType;
/*     */   }
/*     */ 
/*     */   public void setViewFinderType(String value)
/*     */   {
/* 530 */     this.viewFinderType = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 542 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 554 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CEBinocular
 * JD-Core Version:    0.6.2
 */