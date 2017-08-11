/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlSchemaType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"analogRGBInput", "batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cableLength", "cameraFilmSpeed", "cameraFlash", "coatingDescription", "compatibleMountings", "conductor", "connectorGender", "digitalZoom", "finishType", "fixedFocalLength", "flashDedication", "guideNumber", "imageStabilization", "lens", "loadCapacity", "maxWeightCapacity", "memorySlotsAvailable", "mountingType", "photoFilterBayonetSize", "photoFilterDropInSize", "photoFilterEffectSize", "photoFilterLensSize", "photoFilterMountType", "photoFilterThreadSize", "powerPlugType", "powerSource", "remoteControlDescription", "removableMemory", "screenSize", "softwareIncluded", "surgeProtectionRating", "threeDTechnology", "totalDVIPorts", "totalPowerOutlets", "viewFinderType", "waterResistantLevel", "efficiency"})
/*      */ @XmlRootElement(name="CameraOtherAccessories")
/*      */ public class CameraOtherAccessories
/*      */ {
/*      */ 
/*      */   @XmlElement(name="AnalogRGBInput")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> analogRGBInput;
/*      */ 
/*      */   @XmlElement(name="BatteryCellType")
/*      */   protected BatteryCellTypeValues batteryCellType;
/*      */ 
/*      */   @XmlElement(name="BatteryChargeCycles")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryChargeCycles;
/*      */ 
/*      */   @XmlElement(name="BatteryPower")
/*      */   protected BatteryPowerIntegerDimension batteryPower;
/*      */ 
/*      */   @XmlElement(name="BoxContents")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String boxContents;
/*      */ 
/*      */   @XmlElement(name="CableLength")
/*      */   protected LengthDimension cableLength;
/*      */ 
/*      */   @XmlElement(name="CameraFilmSpeed")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger cameraFilmSpeed;
/*      */ 
/*      */   @XmlElement(name="CameraFlash")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cameraFlash;
/*      */ 
/*      */   @XmlElement(name="CoatingDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String coatingDescription;
/*      */ 
/*      */   @XmlElement(name="CompatibleMountings")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String compatibleMountings;
/*      */ 
/*      */   @XmlElement(name="Conductor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String conductor;
/*      */ 
/*      */   @XmlElement(name="ConnectorGender")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> connectorGender;
/*      */ 
/*      */   @XmlElement(name="DigitalZoom")
/*      */   protected ZoomDimension digitalZoom;
/*      */ 
/*      */   @XmlElement(name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finishType;
/*      */ 
/*      */   @XmlElement(name="FixedFocalLength")
/*      */   protected LengthDimension fixedFocalLength;
/*      */ 
/*      */   @XmlElement(name="FlashDedication")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String flashDedication;
/*      */ 
/*      */   @XmlElement(name="GuideNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String guideNumber;
/*      */ 
/*      */   @XmlElement(name="ImageStabilization")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String imageStabilization;
/*      */ 
/*      */   @XmlElement(name="Lens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lens;
/*      */ 
/*      */   @XmlElement(name="LoadCapacity")
/*      */   protected WeightDimension loadCapacity;
/*      */ 
/*      */   @XmlElement(name="MaxWeightCapacity")
/*      */   protected WeightDimension maxWeightCapacity;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="MountingType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountingType;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterBayonetSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoFilterBayonetSize;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterDropInSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoFilterDropInSize;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterEffectSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoFilterEffectSize;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterLensSize")
/*      */   protected LengthDimension photoFilterLensSize;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterMountType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoFilterMountType;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterThreadSize")
/*      */   protected LengthDimension photoFilterThreadSize;
/*      */ 
/*      */   @XmlElement(name="PowerPlugType")
/*      */   protected PowerPlugType powerPlugType;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="RemoteControlDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String remoteControlDescription;
/*      */ 
/*      */   @XmlElement(name="RemovableMemory")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String removableMemory;
/*      */ 
/*      */   @XmlElement(name="ScreenSize")
/*      */   protected LengthDimension screenSize;
/*      */ 
/*      */   @XmlElement(name="SoftwareIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String softwareIncluded;
/*      */ 
/*      */   @XmlElement(name="SurgeProtectionRating")
/*      */   protected EnergyRatingType surgeProtectionRating;
/*      */ 
/*      */   @XmlElement(name="ThreeDTechnology")
/*      */   protected ThreeDTechnologyValues threeDTechnology;
/*      */ 
/*      */   @XmlElement(name="TotalDVIPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalDVIPorts;
/*      */ 
/*      */   @XmlElement(name="TotalPowerOutlets")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalPowerOutlets;
/*      */ 
/*      */   @XmlElement(name="ViewFinderType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String viewFinderType;
/*      */ 
/*      */   @XmlElement(name="WaterResistantLevel")
/*      */   protected WaterResistantType waterResistantLevel;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public List<String> getAnalogRGBInput()
/*      */   {
/*  261 */     if (this.analogRGBInput == null) {
/*  262 */       this.analogRGBInput = new ArrayList();
/*      */     }
/*  264 */     return this.analogRGBInput;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  276 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  288 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  300 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  312 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  324 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  336 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  348 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  360 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/*  372 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/*  384 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getCameraFilmSpeed()
/*      */   {
/*  396 */     return this.cameraFilmSpeed;
/*      */   }
/*      */ 
/*      */   public void setCameraFilmSpeed(BigInteger value)
/*      */   {
/*  408 */     this.cameraFilmSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getCameraFlash()
/*      */   {
/*  420 */     return this.cameraFlash;
/*      */   }
/*      */ 
/*      */   public void setCameraFlash(String value)
/*      */   {
/*  432 */     this.cameraFlash = value;
/*      */   }
/*      */ 
/*      */   public String getCoatingDescription()
/*      */   {
/*  444 */     return this.coatingDescription;
/*      */   }
/*      */ 
/*      */   public void setCoatingDescription(String value)
/*      */   {
/*  456 */     this.coatingDescription = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleMountings()
/*      */   {
/*  468 */     return this.compatibleMountings;
/*      */   }
/*      */ 
/*      */   public void setCompatibleMountings(String value)
/*      */   {
/*  480 */     this.compatibleMountings = value;
/*      */   }
/*      */ 
/*      */   public String getConductor()
/*      */   {
/*  492 */     return this.conductor;
/*      */   }
/*      */ 
/*      */   public void setConductor(String value)
/*      */   {
/*  504 */     this.conductor = value;
/*      */   }
/*      */ 
/*      */   public List<String> getConnectorGender()
/*      */   {
/*  530 */     if (this.connectorGender == null) {
/*  531 */       this.connectorGender = new ArrayList();
/*      */     }
/*  533 */     return this.connectorGender;
/*      */   }
/*      */ 
/*      */   public ZoomDimension getDigitalZoom()
/*      */   {
/*  545 */     return this.digitalZoom;
/*      */   }
/*      */ 
/*      */   public void setDigitalZoom(ZoomDimension value)
/*      */   {
/*  557 */     this.digitalZoom = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/*  569 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/*  581 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getFixedFocalLength()
/*      */   {
/*  593 */     return this.fixedFocalLength;
/*      */   }
/*      */ 
/*      */   public void setFixedFocalLength(LengthDimension value)
/*      */   {
/*  605 */     this.fixedFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getFlashDedication()
/*      */   {
/*  617 */     return this.flashDedication;
/*      */   }
/*      */ 
/*      */   public void setFlashDedication(String value)
/*      */   {
/*  629 */     this.flashDedication = value;
/*      */   }
/*      */ 
/*      */   public String getGuideNumber()
/*      */   {
/*  641 */     return this.guideNumber;
/*      */   }
/*      */ 
/*      */   public void setGuideNumber(String value)
/*      */   {
/*  653 */     this.guideNumber = value;
/*      */   }
/*      */ 
/*      */   public String getImageStabilization()
/*      */   {
/*  665 */     return this.imageStabilization;
/*      */   }
/*      */ 
/*      */   public void setImageStabilization(String value)
/*      */   {
/*  677 */     this.imageStabilization = value;
/*      */   }
/*      */ 
/*      */   public String getLens()
/*      */   {
/*  689 */     return this.lens;
/*      */   }
/*      */ 
/*      */   public void setLens(String value)
/*      */   {
/*  701 */     this.lens = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getLoadCapacity()
/*      */   {
/*  713 */     return this.loadCapacity;
/*      */   }
/*      */ 
/*      */   public void setLoadCapacity(WeightDimension value)
/*      */   {
/*  725 */     this.loadCapacity = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMaxWeightCapacity()
/*      */   {
/*  737 */     return this.maxWeightCapacity;
/*      */   }
/*      */ 
/*      */   public void setMaxWeightCapacity(WeightDimension value)
/*      */   {
/*  749 */     this.maxWeightCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  761 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  773 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public String getMountingType()
/*      */   {
/*  785 */     return this.mountingType;
/*      */   }
/*      */ 
/*      */   public void setMountingType(String value)
/*      */   {
/*  797 */     this.mountingType = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoFilterBayonetSize()
/*      */   {
/*  809 */     return this.photoFilterBayonetSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterBayonetSize(String value)
/*      */   {
/*  821 */     this.photoFilterBayonetSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoFilterDropInSize()
/*      */   {
/*  833 */     return this.photoFilterDropInSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterDropInSize(String value)
/*      */   {
/*  845 */     this.photoFilterDropInSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoFilterEffectSize()
/*      */   {
/*  857 */     return this.photoFilterEffectSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterEffectSize(String value)
/*      */   {
/*  869 */     this.photoFilterEffectSize = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getPhotoFilterLensSize()
/*      */   {
/*  881 */     return this.photoFilterLensSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterLensSize(LengthDimension value)
/*      */   {
/*  893 */     this.photoFilterLensSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoFilterMountType()
/*      */   {
/*  905 */     return this.photoFilterMountType;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterMountType(String value)
/*      */   {
/*  917 */     this.photoFilterMountType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getPhotoFilterThreadSize()
/*      */   {
/*  929 */     return this.photoFilterThreadSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterThreadSize(LengthDimension value)
/*      */   {
/*  941 */     this.photoFilterThreadSize = value;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/*  953 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/*  965 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  977 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  989 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/* 1001 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/* 1013 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/* 1025 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/* 1037 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/* 1049 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/* 1061 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/* 1073 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/* 1085 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public EnergyRatingType getSurgeProtectionRating()
/*      */   {
/* 1097 */     return this.surgeProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setSurgeProtectionRating(EnergyRatingType value)
/*      */   {
/* 1109 */     this.surgeProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/* 1121 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/* 1133 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/* 1145 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/* 1157 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalPowerOutlets()
/*      */   {
/* 1169 */     return this.totalPowerOutlets;
/*      */   }
/*      */ 
/*      */   public void setTotalPowerOutlets(BigInteger value)
/*      */   {
/* 1181 */     this.totalPowerOutlets = value;
/*      */   }
/*      */ 
/*      */   public String getViewFinderType()
/*      */   {
/* 1193 */     return this.viewFinderType;
/*      */   }
/*      */ 
/*      */   public void setViewFinderType(String value)
/*      */   {
/* 1205 */     this.viewFinderType = value;
/*      */   }
/*      */ 
/*      */   public WaterResistantType getWaterResistantLevel()
/*      */   {
/* 1217 */     return this.waterResistantLevel;
/*      */   }
/*      */ 
/*      */   public void setWaterResistantLevel(WaterResistantType value)
/*      */   {
/* 1229 */     this.waterResistantLevel = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1241 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1253 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CameraOtherAccessories
 * JD-Core Version:    0.6.2
 */