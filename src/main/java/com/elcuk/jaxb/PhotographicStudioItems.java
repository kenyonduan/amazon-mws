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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cameraFilmSpeed", "cameraFlash", "compatibleMountings", "digitalZoom", "finishType", "flashDedication", "guideNumber", "lens", "loadCapacity", "memorySlotsAvailable", "photoFilterBayonetSize", "photoFilterDropInSize", "photoFilterEffectSize", "photoFilterLensSize", "photoFilterMountType", "photoFilterThreadSize", "powerPlugType", "powerSource", "remoteControlDescription", "softwareIncluded", "videoResolution", "efficiency"})
/*     */ @XmlRootElement(name="PhotographicStudioItems")
/*     */ public class PhotographicStudioItems
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
/*     */   @XmlElement(name="CameraFilmSpeed")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger cameraFilmSpeed;
/*     */ 
/*     */   @XmlElement(name="CameraFlash")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String cameraFlash;
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
/*     */   @XmlElement(name="FlashDedication")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String flashDedication;
/*     */ 
/*     */   @XmlElement(name="GuideNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String guideNumber;
/*     */ 
/*     */   @XmlElement(name="Lens")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String lens;
/*     */ 
/*     */   @XmlElement(name="LoadCapacity")
/*     */   protected WeightDimension loadCapacity;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterBayonetSize")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String photoFilterBayonetSize;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterDropInSize")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String photoFilterDropInSize;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterEffectSize")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String photoFilterEffectSize;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterLensSize")
/*     */   protected LengthDimension photoFilterLensSize;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterMountType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String photoFilterMountType;
/*     */ 
/*     */   @XmlElement(name="PhotoFilterThreadSize")
/*     */   protected LengthDimension photoFilterThreadSize;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="RemoteControlDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String remoteControlDescription;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="VideoResolution")
/*     */   protected PixelDimension videoResolution;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 171 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 183 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 195 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 207 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 219 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 231 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 243 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 255 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getCameraFilmSpeed()
/*     */   {
/* 267 */     return this.cameraFilmSpeed;
/*     */   }
/*     */ 
/*     */   public void setCameraFilmSpeed(BigInteger value)
/*     */   {
/* 279 */     this.cameraFilmSpeed = value;
/*     */   }
/*     */ 
/*     */   public String getCameraFlash()
/*     */   {
/* 291 */     return this.cameraFlash;
/*     */   }
/*     */ 
/*     */   public void setCameraFlash(String value)
/*     */   {
/* 303 */     this.cameraFlash = value;
/*     */   }
/*     */ 
/*     */   public String getCompatibleMountings()
/*     */   {
/* 315 */     return this.compatibleMountings;
/*     */   }
/*     */ 
/*     */   public void setCompatibleMountings(String value)
/*     */   {
/* 327 */     this.compatibleMountings = value;
/*     */   }
/*     */ 
/*     */   public ZoomDimension getDigitalZoom()
/*     */   {
/* 339 */     return this.digitalZoom;
/*     */   }
/*     */ 
/*     */   public void setDigitalZoom(ZoomDimension value)
/*     */   {
/* 351 */     this.digitalZoom = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 363 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 375 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public String getFlashDedication()
/*     */   {
/* 387 */     return this.flashDedication;
/*     */   }
/*     */ 
/*     */   public void setFlashDedication(String value)
/*     */   {
/* 399 */     this.flashDedication = value;
/*     */   }
/*     */ 
/*     */   public String getGuideNumber()
/*     */   {
/* 411 */     return this.guideNumber;
/*     */   }
/*     */ 
/*     */   public void setGuideNumber(String value)
/*     */   {
/* 423 */     this.guideNumber = value;
/*     */   }
/*     */ 
/*     */   public String getLens()
/*     */   {
/* 435 */     return this.lens;
/*     */   }
/*     */ 
/*     */   public void setLens(String value)
/*     */   {
/* 447 */     this.lens = value;
/*     */   }
/*     */ 
/*     */   public WeightDimension getLoadCapacity()
/*     */   {
/* 459 */     return this.loadCapacity;
/*     */   }
/*     */ 
/*     */   public void setLoadCapacity(WeightDimension value)
/*     */   {
/* 471 */     this.loadCapacity = value;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 483 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 495 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public String getPhotoFilterBayonetSize()
/*     */   {
/* 507 */     return this.photoFilterBayonetSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterBayonetSize(String value)
/*     */   {
/* 519 */     this.photoFilterBayonetSize = value;
/*     */   }
/*     */ 
/*     */   public String getPhotoFilterDropInSize()
/*     */   {
/* 531 */     return this.photoFilterDropInSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterDropInSize(String value)
/*     */   {
/* 543 */     this.photoFilterDropInSize = value;
/*     */   }
/*     */ 
/*     */   public String getPhotoFilterEffectSize()
/*     */   {
/* 555 */     return this.photoFilterEffectSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterEffectSize(String value)
/*     */   {
/* 567 */     this.photoFilterEffectSize = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getPhotoFilterLensSize()
/*     */   {
/* 579 */     return this.photoFilterLensSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterLensSize(LengthDimension value)
/*     */   {
/* 591 */     this.photoFilterLensSize = value;
/*     */   }
/*     */ 
/*     */   public String getPhotoFilterMountType()
/*     */   {
/* 603 */     return this.photoFilterMountType;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterMountType(String value)
/*     */   {
/* 615 */     this.photoFilterMountType = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getPhotoFilterThreadSize()
/*     */   {
/* 627 */     return this.photoFilterThreadSize;
/*     */   }
/*     */ 
/*     */   public void setPhotoFilterThreadSize(LengthDimension value)
/*     */   {
/* 639 */     this.photoFilterThreadSize = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 651 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 663 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 675 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 687 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getRemoteControlDescription()
/*     */   {
/* 699 */     return this.remoteControlDescription;
/*     */   }
/*     */ 
/*     */   public void setRemoteControlDescription(String value)
/*     */   {
/* 711 */     this.remoteControlDescription = value;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 723 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 735 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public PixelDimension getVideoResolution()
/*     */   {
/* 747 */     return this.videoResolution;
/*     */   }
/*     */ 
/*     */   public void setVideoResolution(PixelDimension value)
/*     */   {
/* 759 */     this.videoResolution = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 771 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 783 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PhotographicStudioItems
 * JD-Core Version:    0.6.2
 */