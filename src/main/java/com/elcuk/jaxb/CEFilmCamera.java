/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "cameraFlash", "continuousShootingSpeed", "finishType", "fixedFocalLength", "focusType", "guideNumber", "imageStabilization", "isHotShoeIncluded", "lens", "maxAperture", "maxFocalLength", "maxShutterSpeed", "minAperture", "minFocalLength", "minShutterSpeed", "opticalZoom", "photoFilterLensSize", "powerSource", "viewFinderType", "waterResistantLevel", "efficiency"})
/*     */ @XmlRootElement(name="CEFilmCamera")
/*     */ public class CEFilmCamera
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
/*     */   @XmlElement(name="CameraFlash")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String cameraFlash;
/*     */ 
/*     */   @XmlElement(name="ContinuousShootingSpeed")
/*     */   protected ContinuousShootingDimension continuousShootingSpeed;
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
/*     */   @XmlElement(name="GuideNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String guideNumber;
/*     */ 
/*     */   @XmlElement(name="ImageStabilization")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String imageStabilization;
/*     */ 
/*     */   @XmlElement(name="IsHotShoeIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String isHotShoeIncluded;
/*     */ 
/*     */   @XmlElement(name="Lens")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String lens;
/*     */ 
/*     */   @XmlElement(name="MaxAperture")
/*     */   protected ApertureDimension maxAperture;
/*     */ 
/*     */   @XmlElement(name="MaxFocalLength")
/*     */   protected LengthDimension maxFocalLength;
/*     */ 
/*     */   @XmlElement(name="MaxShutterSpeed")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String maxShutterSpeed;
/*     */ 
/*     */   @XmlElement(name="MinAperture")
/*     */   protected ApertureDimension minAperture;
/*     */ 
/*     */   @XmlElement(name="MinFocalLength")
/*     */   protected LengthDimension minFocalLength;
/*     */ 
/*     */   @XmlElement(name="MinShutterSpeed")
/*     */   protected BigDecimal minShutterSpeed;
/*     */ 
/*     */   @XmlElement(name="OpticalZoom")
/*     */   protected ZoomDimension opticalZoom;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterLensSize")
/*     */   protected LengthDimension photoFilterLensSize;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="ViewFinderType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String viewFinderType;
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
/* 158 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 170 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 182 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 194 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 206 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 218 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getCameraFlash()
/*     */   {
/* 230 */     return this.cameraFlash;
/*     */   }
/*     */ 
/*     */   public void setCameraFlash(String value)
/*     */   {
/* 242 */     this.cameraFlash = value;
/*     */   }
/*     */ 
/*     */   public ContinuousShootingDimension getContinuousShootingSpeed()
/*     */   {
/* 254 */     return this.continuousShootingSpeed;
/*     */   }
/*     */ 
/*     */   public void setContinuousShootingSpeed(ContinuousShootingDimension value)
/*     */   {
/* 266 */     this.continuousShootingSpeed = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 278 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 290 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getFixedFocalLength()
/*     */   {
/* 302 */     return this.fixedFocalLength;
/*     */   }
/*     */ 
/*     */   public void setFixedFocalLength(LengthDimension value)
/*     */   {
/* 314 */     this.fixedFocalLength = value;
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
/*     */   public String getGuideNumber()
/*     */   {
/* 350 */     return this.guideNumber;
/*     */   }
/*     */ 
/*     */   public void setGuideNumber(String value)
/*     */   {
/* 362 */     this.guideNumber = value;
/*     */   }
/*     */ 
/*     */   public String getImageStabilization()
/*     */   {
/* 374 */     return this.imageStabilization;
/*     */   }
/*     */ 
/*     */   public void setImageStabilization(String value)
/*     */   {
/* 386 */     this.imageStabilization = value;
/*     */   }
/*     */ 
/*     */   public String getIsHotShoeIncluded()
/*     */   {
/* 398 */     return this.isHotShoeIncluded;
/*     */   }
/*     */ 
/*     */   public void setIsHotShoeIncluded(String value)
/*     */   {
/* 410 */     this.isHotShoeIncluded = value;
/*     */   }
/*     */ 
/*     */   public String getLens()
/*     */   {
/* 422 */     return this.lens;
/*     */   }
/*     */ 
/*     */   public void setLens(String value)
/*     */   {
/* 434 */     this.lens = value;
/*     */   }
/*     */ 
/*     */   public ApertureDimension getMaxAperture()
/*     */   {
/* 446 */     return this.maxAperture;
/*     */   }
/*     */ 
/*     */   public void setMaxAperture(ApertureDimension value)
/*     */   {
/* 458 */     this.maxAperture = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMaxFocalLength()
/*     */   {
/* 470 */     return this.maxFocalLength;
/*     */   }
/*     */ 
/*     */   public void setMaxFocalLength(LengthDimension value)
/*     */   {
/* 482 */     this.maxFocalLength = value;
/*     */   }
/*     */ 
/*     */   public String getMaxShutterSpeed()
/*     */   {
/* 494 */     return this.maxShutterSpeed;
/*     */   }
/*     */ 
/*     */   public void setMaxShutterSpeed(String value)
/*     */   {
/* 506 */     this.maxShutterSpeed = value;
/*     */   }
/*     */ 
/*     */   public ApertureDimension getMinAperture()
/*     */   {
/* 518 */     return this.minAperture;
/*     */   }
/*     */ 
/*     */   public void setMinAperture(ApertureDimension value)
/*     */   {
/* 530 */     this.minAperture = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMinFocalLength()
/*     */   {
/* 542 */     return this.minFocalLength;
/*     */   }
/*     */ 
/*     */   public void setMinFocalLength(LengthDimension value)
/*     */   {
/* 554 */     this.minFocalLength = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getMinShutterSpeed()
/*     */   {
/* 566 */     return this.minShutterSpeed;
/*     */   }
/*     */ 
/*     */   public void setMinShutterSpeed(BigDecimal value)
/*     */   {
/* 578 */     this.minShutterSpeed = value;
/*     */   }
/*     */ 
/*     */   public ZoomDimension getOpticalZoom()
/*     */   {
/* 590 */     return this.opticalZoom;
/*     */   }
/*     */ 
/*     */   public void setOpticalZoom(ZoomDimension value)
/*     */   {
/* 602 */     this.opticalZoom = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getPhotoFilterLensSize()
/*     */   {
/* 614 */     return this.photoFilterLensSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterLensSize(LengthDimension value)
/*     */   {
/* 626 */     this.photoFilterLensSize = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 638 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 650 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getViewFinderType()
/*     */   {
/* 662 */     return this.viewFinderType;
/*     */   }
/*     */ 
/*     */   public void setViewFinderType(String value)
/*     */   {
/* 674 */     this.viewFinderType = value;
/*     */   }
/*     */ 
/*     */   public WaterResistantType getWaterResistantLevel()
/*     */   {
/* 686 */     return this.waterResistantLevel;
/*     */   }
/*     */ 
/*     */   public void setWaterResistantLevel(WaterResistantType value)
/*     */   {
/* 698 */     this.waterResistantLevel = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 710 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 722 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CEFilmCamera
 * JD-Core Version:    0.6.2
 */