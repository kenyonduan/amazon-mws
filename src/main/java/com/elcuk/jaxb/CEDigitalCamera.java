/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigDecimal;
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
/*      */ @XmlType(name="", propOrder={"analogRGBInput", "batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cableLength", "cameraFlash", "cameraLens", "compatibleMountings", "continuousShootingSpeed", "digitalZoom", "effectiveStillResolution", "finishType", "fixedFocalLength", "flashModesDescription", "focusType", "guideNumber", "imageStabilization", "isHotShoeIncluded", "lens", "maxAperture", "maxFocalLength", "maxShutterSpeed", "memorySlotsAvailable", "minAperture", "minFocalLength", "minShutterSpeed", "opticalZoom", "photoFilterLensSize", "photoSensorSize", "photoSensorTechnology", "powerSource", "remoteControlDescription", "removableMemory", "screenSize", "softwareIncluded", "threeDTechnology", "totalFirewirePorts", "totalHdmiPorts", "totalSVideoOutPorts", "totalUSBPorts", "videoEncoding", "videoResolution", "viewFinderType", "waterResistantLevel", "wirelessTechnology", "powerPlugType", "efficiency"})
/*      */ @XmlRootElement(name="CEDigitalCamera")
/*      */ public class CEDigitalCamera
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
/*      */   @XmlElement(name="CameraFlash")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cameraFlash;
/*      */ 
/*      */   @XmlElement(name="CameraLens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cameraLens;
/*      */ 
/*      */   @XmlElement(name="CompatibleMountings")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String compatibleMountings;
/*      */ 
/*      */   @XmlElement(name="ContinuousShootingSpeed")
/*      */   protected ContinuousShootingDimension continuousShootingSpeed;
/*      */ 
/*      */   @XmlElement(name="DigitalZoom")
/*      */   protected ZoomDimension digitalZoom;
/*      */ 
/*      */   @XmlElement(name="EffectiveStillResolution")
/*      */   protected ResolutionDimension effectiveStillResolution;
/*      */ 
/*      */   @XmlElement(name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finishType;
/*      */ 
/*      */   @XmlElement(name="FixedFocalLength")
/*      */   protected LengthDimension fixedFocalLength;
/*      */ 
/*      */   @XmlElement(name="FlashModesDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String flashModesDescription;
/*      */ 
/*      */   @XmlElement(name="FocusType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String focusType;
/*      */ 
/*      */   @XmlElement(name="GuideNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String guideNumber;
/*      */ 
/*      */   @XmlElement(name="ImageStabilization")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String imageStabilization;
/*      */ 
/*      */   @XmlElement(name="IsHotShoeIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String isHotShoeIncluded;
/*      */ 
/*      */   @XmlElement(name="Lens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lens;
/*      */ 
/*      */   @XmlElement(name="MaxAperture")
/*      */   protected ApertureDimension maxAperture;
/*      */ 
/*      */   @XmlElement(name="MaxFocalLength")
/*      */   protected LengthDimension maxFocalLength;
/*      */ 
/*      */   @XmlElement(name="MaxShutterSpeed")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String maxShutterSpeed;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="MinAperture")
/*      */   protected ApertureDimension minAperture;
/*      */ 
/*      */   @XmlElement(name="MinFocalLength")
/*      */   protected LengthDimension minFocalLength;
/*      */ 
/*      */   @XmlElement(name="MinShutterSpeed")
/*      */   protected BigDecimal minShutterSpeed;
/*      */ 
/*      */   @XmlElement(name="OpticalZoom")
/*      */   protected ZoomDimension opticalZoom;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterLensSize")
/*      */   protected LengthDimension photoFilterLensSize;
/*      */ 
/*      */   @XmlElement(name="PhotoSensorSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoSensorSize;
/*      */ 
/*      */   @XmlElement(name="PhotoSensorTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoSensorTechnology;
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
/*      */   @XmlElement(name="ThreeDTechnology")
/*      */   protected ThreeDTechnologyValues threeDTechnology;
/*      */ 
/*      */   @XmlElement(name="TotalFirewirePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalFirewirePorts;
/*      */ 
/*      */   @XmlElement(name="TotalHdmiPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalHdmiPorts;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="TotalUSBPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalUSBPorts;
/*      */ 
/*      */   @XmlElement(name="VideoEncoding")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String videoEncoding;
/*      */ 
/*      */   @XmlElement(name="VideoResolution")
/*      */   protected PixelDimension videoResolution;
/*      */ 
/*      */   @XmlElement(name="ViewFinderType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String viewFinderType;
/*      */ 
/*      */   @XmlElement(name="WaterResistantLevel")
/*      */   protected WaterResistantType waterResistantLevel;
/*      */ 
/*      */   @XmlElement(name="WirelessTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> wirelessTechnology;
/*      */ 
/*      */   @XmlElement(name="PowerPlugType")
/*      */   protected PowerPlugType powerPlugType;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public List<String> getAnalogRGBInput()
/*      */   {
/*  287 */     if (this.analogRGBInput == null) {
/*  288 */       this.analogRGBInput = new ArrayList();
/*      */     }
/*  290 */     return this.analogRGBInput;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  302 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  314 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  326 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  338 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  350 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  362 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  374 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  386 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/*  398 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/*  410 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public String getCameraFlash()
/*      */   {
/*  422 */     return this.cameraFlash;
/*      */   }
/*      */ 
/*      */   public void setCameraFlash(String value)
/*      */   {
/*  434 */     this.cameraFlash = value;
/*      */   }
/*      */ 
/*      */   public String getCameraLens()
/*      */   {
/*  446 */     return this.cameraLens;
/*      */   }
/*      */ 
/*      */   public void setCameraLens(String value)
/*      */   {
/*  458 */     this.cameraLens = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleMountings()
/*      */   {
/*  470 */     return this.compatibleMountings;
/*      */   }
/*      */ 
/*      */   public void setCompatibleMountings(String value)
/*      */   {
/*  482 */     this.compatibleMountings = value;
/*      */   }
/*      */ 
/*      */   public ContinuousShootingDimension getContinuousShootingSpeed()
/*      */   {
/*  494 */     return this.continuousShootingSpeed;
/*      */   }
/*      */ 
/*      */   public void setContinuousShootingSpeed(ContinuousShootingDimension value)
/*      */   {
/*  506 */     this.continuousShootingSpeed = value;
/*      */   }
/*      */ 
/*      */   public ZoomDimension getDigitalZoom()
/*      */   {
/*  518 */     return this.digitalZoom;
/*      */   }
/*      */ 
/*      */   public void setDigitalZoom(ZoomDimension value)
/*      */   {
/*  530 */     this.digitalZoom = value;
/*      */   }
/*      */ 
/*      */   public ResolutionDimension getEffectiveStillResolution()
/*      */   {
/*  542 */     return this.effectiveStillResolution;
/*      */   }
/*      */ 
/*      */   public void setEffectiveStillResolution(ResolutionDimension value)
/*      */   {
/*  554 */     this.effectiveStillResolution = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/*  566 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/*  578 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getFixedFocalLength()
/*      */   {
/*  590 */     return this.fixedFocalLength;
/*      */   }
/*      */ 
/*      */   public void setFixedFocalLength(LengthDimension value)
/*      */   {
/*  602 */     this.fixedFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getFlashModesDescription()
/*      */   {
/*  614 */     return this.flashModesDescription;
/*      */   }
/*      */ 
/*      */   public void setFlashModesDescription(String value)
/*      */   {
/*  626 */     this.flashModesDescription = value;
/*      */   }
/*      */ 
/*      */   public String getFocusType()
/*      */   {
/*  638 */     return this.focusType;
/*      */   }
/*      */ 
/*      */   public void setFocusType(String value)
/*      */   {
/*  650 */     this.focusType = value;
/*      */   }
/*      */ 
/*      */   public String getGuideNumber()
/*      */   {
/*  662 */     return this.guideNumber;
/*      */   }
/*      */ 
/*      */   public void setGuideNumber(String value)
/*      */   {
/*  674 */     this.guideNumber = value;
/*      */   }
/*      */ 
/*      */   public String getImageStabilization()
/*      */   {
/*  686 */     return this.imageStabilization;
/*      */   }
/*      */ 
/*      */   public void setImageStabilization(String value)
/*      */   {
/*  698 */     this.imageStabilization = value;
/*      */   }
/*      */ 
/*      */   public String getIsHotShoeIncluded()
/*      */   {
/*  710 */     return this.isHotShoeIncluded;
/*      */   }
/*      */ 
/*      */   public void setIsHotShoeIncluded(String value)
/*      */   {
/*  722 */     this.isHotShoeIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getLens()
/*      */   {
/*  734 */     return this.lens;
/*      */   }
/*      */ 
/*      */   public void setLens(String value)
/*      */   {
/*  746 */     this.lens = value;
/*      */   }
/*      */ 
/*      */   public ApertureDimension getMaxAperture()
/*      */   {
/*  758 */     return this.maxAperture;
/*      */   }
/*      */ 
/*      */   public void setMaxAperture(ApertureDimension value)
/*      */   {
/*  770 */     this.maxAperture = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMaxFocalLength()
/*      */   {
/*  782 */     return this.maxFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMaxFocalLength(LengthDimension value)
/*      */   {
/*  794 */     this.maxFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getMaxShutterSpeed()
/*      */   {
/*  806 */     return this.maxShutterSpeed;
/*      */   }
/*      */ 
/*      */   public void setMaxShutterSpeed(String value)
/*      */   {
/*  818 */     this.maxShutterSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  830 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  842 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public ApertureDimension getMinAperture()
/*      */   {
/*  854 */     return this.minAperture;
/*      */   }
/*      */ 
/*      */   public void setMinAperture(ApertureDimension value)
/*      */   {
/*  866 */     this.minAperture = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMinFocalLength()
/*      */   {
/*  878 */     return this.minFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMinFocalLength(LengthDimension value)
/*      */   {
/*  890 */     this.minFocalLength = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getMinShutterSpeed()
/*      */   {
/*  902 */     return this.minShutterSpeed;
/*      */   }
/*      */ 
/*      */   public void setMinShutterSpeed(BigDecimal value)
/*      */   {
/*  914 */     this.minShutterSpeed = value;
/*      */   }
/*      */ 
/*      */   public ZoomDimension getOpticalZoom()
/*      */   {
/*  926 */     return this.opticalZoom;
/*      */   }
/*      */ 
/*      */   public void setOpticalZoom(ZoomDimension value)
/*      */   {
/*  938 */     this.opticalZoom = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getPhotoFilterLensSize()
/*      */   {
/*  950 */     return this.photoFilterLensSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterLensSize(LengthDimension value)
/*      */   {
/*  962 */     this.photoFilterLensSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoSensorSize()
/*      */   {
/*  974 */     return this.photoSensorSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoSensorSize(String value)
/*      */   {
/*  986 */     this.photoSensorSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoSensorTechnology()
/*      */   {
/*  998 */     return this.photoSensorTechnology;
/*      */   }
/*      */ 
/*      */   public void setPhotoSensorTechnology(String value)
/*      */   {
/* 1010 */     this.photoSensorTechnology = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1022 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1034 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/* 1046 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/* 1058 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/* 1070 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/* 1082 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/* 1094 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/* 1106 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/* 1118 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/* 1130 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/* 1142 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/* 1154 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewirePorts()
/*      */   {
/* 1166 */     return this.totalFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewirePorts(BigInteger value)
/*      */   {
/* 1178 */     this.totalFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/* 1190 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/* 1202 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoOutPorts()
/*      */   {
/* 1214 */     return this.totalSVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 1226 */     this.totalSVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSBPorts()
/*      */   {
/* 1238 */     return this.totalUSBPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalUSBPorts(BigInteger value)
/*      */   {
/* 1250 */     this.totalUSBPorts = value;
/*      */   }
/*      */ 
/*      */   public String getVideoEncoding()
/*      */   {
/* 1262 */     return this.videoEncoding;
/*      */   }
/*      */ 
/*      */   public void setVideoEncoding(String value)
/*      */   {
/* 1274 */     this.videoEncoding = value;
/*      */   }
/*      */ 
/*      */   public PixelDimension getVideoResolution()
/*      */   {
/* 1286 */     return this.videoResolution;
/*      */   }
/*      */ 
/*      */   public void setVideoResolution(PixelDimension value)
/*      */   {
/* 1298 */     this.videoResolution = value;
/*      */   }
/*      */ 
/*      */   public String getViewFinderType()
/*      */   {
/* 1310 */     return this.viewFinderType;
/*      */   }
/*      */ 
/*      */   public void setViewFinderType(String value)
/*      */   {
/* 1322 */     this.viewFinderType = value;
/*      */   }
/*      */ 
/*      */   public WaterResistantType getWaterResistantLevel()
/*      */   {
/* 1334 */     return this.waterResistantLevel;
/*      */   }
/*      */ 
/*      */   public void setWaterResistantLevel(WaterResistantType value)
/*      */   {
/* 1346 */     this.waterResistantLevel = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessTechnology()
/*      */   {
/* 1372 */     if (this.wirelessTechnology == null) {
/* 1373 */       this.wirelessTechnology = new ArrayList();
/*      */     }
/* 1375 */     return this.wirelessTechnology;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/* 1387 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/* 1399 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1411 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1423 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CEDigitalCamera
 * JD-Core Version:    0.6.2
 */