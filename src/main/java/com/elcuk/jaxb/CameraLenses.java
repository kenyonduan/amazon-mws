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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "coatingDescription", "compatibleMountings", "digitalZoom", "finishType", "fixedFocalLength", "focusType", "imageStabilization", "lens", "maxFocalLength", "minFocalLength", "photoFilterBayonetSize", "photoFilterLensSize", "photoFilterThreadSize", "waterResistantLevel", "efficiency"})
/*     */ @XmlRootElement(name="CameraLenses")
/*     */ public class CameraLenses
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
/*     */   @XmlElement(name="CompatibleMountings")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String compatibleMountings;
/*     */ 
/*     */   @XmlElement(name="DigitalZoom")
/*     */   protected ZoomDimension digitalZoom;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="FixedFocalLength")
/*     */   protected LengthDimension fixedFocalLength;
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
/*     */   @XmlElement(name="MaxFocalLength")
/*     */   protected LengthDimension maxFocalLength;
/*     */ 
/*     */   @XmlElement(name="MinFocalLength")
/*     */   protected LengthDimension minFocalLength;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterBayonetSize")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String photoFilterBayonetSize;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterLensSize")
/*     */   protected LengthDimension photoFilterLensSize;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterThreadSize")
/*     */   protected LengthDimension photoFilterThreadSize;
/*     */ 
/*     */   @XmlElement(name="WaterResistantLevel")
/*     */   protected WaterResistantType waterResistantLevel;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 135 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 147 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 159 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 171 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 183 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 195 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 207 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 219 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public String getCoatingDescription()
/*     */   {
/* 231 */     return this.coatingDescription;
/*     */   }
/*     */ 
/*     */   public void setCoatingDescription(String value)
/*     */   {
/* 243 */     this.coatingDescription = value;
/*     */   }
/*     */ 
/*     */   public String getCompatibleMountings()
/*     */   {
/* 255 */     return this.compatibleMountings;
/*     */   }
/*     */ 
/*     */   public void setCompatibleMountings(String value)
/*     */   {
/* 267 */     this.compatibleMountings = value;
/*     */   }
/*     */ 
/*     */   public ZoomDimension getDigitalZoom()
/*     */   {
/* 279 */     return this.digitalZoom;
/*     */   }
/*     */ 
/*     */   public void setDigitalZoom(ZoomDimension value)
/*     */   {
/* 291 */     this.digitalZoom = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 303 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 315 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getFixedFocalLength()
/*     */   {
/* 327 */     return this.fixedFocalLength;
/*     */   }
/*     */ 
/*     */   public void setFixedFocalLength(LengthDimension value)
/*     */   {
/* 339 */     this.fixedFocalLength = value;
/*     */   }
/*     */ 
/*     */   public String getFocusType()
/*     */   {
/* 351 */     return this.focusType;
/*     */   }
/*     */ 
/*     */   public void setFocusType(String value)
/*     */   {
/* 363 */     this.focusType = value;
/*     */   }
/*     */ 
/*     */   public String getImageStabilization()
/*     */   {
/* 375 */     return this.imageStabilization;
/*     */   }
/*     */ 
/*     */   public void setImageStabilization(String value)
/*     */   {
/* 387 */     this.imageStabilization = value;
/*     */   }
/*     */ 
/*     */   public String getLens()
/*     */   {
/* 399 */     return this.lens;
/*     */   }
/*     */ 
/*     */   public void setLens(String value)
/*     */   {
/* 411 */     this.lens = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMaxFocalLength()
/*     */   {
/* 423 */     return this.maxFocalLength;
/*     */   }
/*     */ 
/*     */   public void setMaxFocalLength(LengthDimension value)
/*     */   {
/* 435 */     this.maxFocalLength = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMinFocalLength()
/*     */   {
/* 447 */     return this.minFocalLength;
/*     */   }
/*     */ 
/*     */   public void setMinFocalLength(LengthDimension value)
/*     */   {
/* 459 */     this.minFocalLength = value;
/*     */   }
/*     */ 
/*     */   public String getPhotoFilterBayonetSize()
/*     */   {
/* 471 */     return this.photoFilterBayonetSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterBayonetSize(String value)
/*     */   {
/* 483 */     this.photoFilterBayonetSize = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getPhotoFilterLensSize()
/*     */   {
/* 495 */     return this.photoFilterLensSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterLensSize(LengthDimension value)
/*     */   {
/* 507 */     this.photoFilterLensSize = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getPhotoFilterThreadSize()
/*     */   {
/* 519 */     return this.photoFilterThreadSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterThreadSize(LengthDimension value)
/*     */   {
/* 531 */     this.photoFilterThreadSize = value;
/*     */   }
/*     */ 
/*     */   public WaterResistantType getWaterResistantLevel()
/*     */   {
/* 543 */     return this.waterResistantLevel;
/*     */   }
/*     */ 
/*     */   public void setWaterResistantLevel(WaterResistantType value)
/*     */   {
/* 555 */     this.waterResistantLevel = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 567 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 579 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CameraLenses
 * JD-Core Version:    0.6.2
 */