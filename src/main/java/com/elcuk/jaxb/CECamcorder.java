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
/*      */ @XmlType(name="", propOrder={"analogRGBInput", "batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cableLength", "compatibleMountings", "digitalZoom", "effectiveStillResolution", "finishType", "fixedFocalLength", "focusType", "guideNumber", "imageStabilization", "lens", "isHotShoeIncluded", "memorySlotsAvailable", "maxAperture", "maxFocalLength", "maxWeightCapacity", "minAperture", "minFocalLength", "mountingType", "opticalZoom", "powerPlugType", "powerSource", "remoteControlDescription", "removableMemory", "screenSize", "softwareIncluded", "threeDTechnology", "totalDVIPorts", "totalFirewirePorts", "totalHdmiPorts", "totalSVideoOutPorts", "totalUSBPorts", "totalVideoOutPorts", "videoEncoding", "viewFinderType", "waterResistantLevel", "efficiency"})
/*      */ @XmlRootElement(name="CECamcorder")
/*      */ public class CECamcorder
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
/*      */   @XmlElement(name="CompatibleMountings")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String compatibleMountings;
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
/*      */   @XmlElement(name="Lens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lens;
/*      */ 
/*      */   @XmlElement(name="IsHotShoeIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String isHotShoeIncluded;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="MaxAperture")
/*      */   protected ApertureDimension maxAperture;
/*      */ 
/*      */   @XmlElement(name="MaxFocalLength")
/*      */   protected LengthDimension maxFocalLength;
/*      */ 
/*      */   @XmlElement(name="MaxWeightCapacity")
/*      */   protected WeightDimension maxWeightCapacity;
/*      */ 
/*      */   @XmlElement(name="MinAperture")
/*      */   protected ApertureDimension minAperture;
/*      */ 
/*      */   @XmlElement(name="MinFocalLength")
/*      */   protected LengthDimension minFocalLength;
/*      */ 
/*      */   @XmlElement(name="MountingType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountingType;
/*      */ 
/*      */   @XmlElement(name="OpticalZoom")
/*      */   protected ZoomDimension opticalZoom;
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
/*      */   @XmlElement(name="ThreeDTechnology")
/*      */   protected ThreeDTechnologyValues threeDTechnology;
/*      */ 
/*      */   @XmlElement(name="TotalDVIPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalDVIPorts;
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
/*      */   @XmlElement(name="TotalVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="VideoEncoding")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String videoEncoding;
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
/*  254 */     if (this.analogRGBInput == null) {
/*  255 */       this.analogRGBInput = new ArrayList();
/*      */     }
/*  257 */     return this.analogRGBInput;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  269 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  281 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  293 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  305 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  317 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  329 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  341 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  353 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/*  365 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/*  377 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleMountings()
/*      */   {
/*  389 */     return this.compatibleMountings;
/*      */   }
/*      */ 
/*      */   public void setCompatibleMountings(String value)
/*      */   {
/*  401 */     this.compatibleMountings = value;
/*      */   }
/*      */ 
/*      */   public ZoomDimension getDigitalZoom()
/*      */   {
/*  413 */     return this.digitalZoom;
/*      */   }
/*      */ 
/*      */   public void setDigitalZoom(ZoomDimension value)
/*      */   {
/*  425 */     this.digitalZoom = value;
/*      */   }
/*      */ 
/*      */   public ResolutionDimension getEffectiveStillResolution()
/*      */   {
/*  437 */     return this.effectiveStillResolution;
/*      */   }
/*      */ 
/*      */   public void setEffectiveStillResolution(ResolutionDimension value)
/*      */   {
/*  449 */     this.effectiveStillResolution = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/*  461 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/*  473 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getFixedFocalLength()
/*      */   {
/*  485 */     return this.fixedFocalLength;
/*      */   }
/*      */ 
/*      */   public void setFixedFocalLength(LengthDimension value)
/*      */   {
/*  497 */     this.fixedFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getFocusType()
/*      */   {
/*  509 */     return this.focusType;
/*      */   }
/*      */ 
/*      */   public void setFocusType(String value)
/*      */   {
/*  521 */     this.focusType = value;
/*      */   }
/*      */ 
/*      */   public String getGuideNumber()
/*      */   {
/*  533 */     return this.guideNumber;
/*      */   }
/*      */ 
/*      */   public void setGuideNumber(String value)
/*      */   {
/*  545 */     this.guideNumber = value;
/*      */   }
/*      */ 
/*      */   public String getImageStabilization()
/*      */   {
/*  557 */     return this.imageStabilization;
/*      */   }
/*      */ 
/*      */   public void setImageStabilization(String value)
/*      */   {
/*  569 */     this.imageStabilization = value;
/*      */   }
/*      */ 
/*      */   public String getLens()
/*      */   {
/*  581 */     return this.lens;
/*      */   }
/*      */ 
/*      */   public void setLens(String value)
/*      */   {
/*  593 */     this.lens = value;
/*      */   }
/*      */ 
/*      */   public String getIsHotShoeIncluded()
/*      */   {
/*  605 */     return this.isHotShoeIncluded;
/*      */   }
/*      */ 
/*      */   public void setIsHotShoeIncluded(String value)
/*      */   {
/*  617 */     this.isHotShoeIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  629 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  641 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public ApertureDimension getMaxAperture()
/*      */   {
/*  653 */     return this.maxAperture;
/*      */   }
/*      */ 
/*      */   public void setMaxAperture(ApertureDimension value)
/*      */   {
/*  665 */     this.maxAperture = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMaxFocalLength()
/*      */   {
/*  677 */     return this.maxFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMaxFocalLength(LengthDimension value)
/*      */   {
/*  689 */     this.maxFocalLength = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMaxWeightCapacity()
/*      */   {
/*  701 */     return this.maxWeightCapacity;
/*      */   }
/*      */ 
/*      */   public void setMaxWeightCapacity(WeightDimension value)
/*      */   {
/*  713 */     this.maxWeightCapacity = value;
/*      */   }
/*      */ 
/*      */   public ApertureDimension getMinAperture()
/*      */   {
/*  725 */     return this.minAperture;
/*      */   }
/*      */ 
/*      */   public void setMinAperture(ApertureDimension value)
/*      */   {
/*  737 */     this.minAperture = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMinFocalLength()
/*      */   {
/*  749 */     return this.minFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMinFocalLength(LengthDimension value)
/*      */   {
/*  761 */     this.minFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getMountingType()
/*      */   {
/*  773 */     return this.mountingType;
/*      */   }
/*      */ 
/*      */   public void setMountingType(String value)
/*      */   {
/*  785 */     this.mountingType = value;
/*      */   }
/*      */ 
/*      */   public ZoomDimension getOpticalZoom()
/*      */   {
/*  797 */     return this.opticalZoom;
/*      */   }
/*      */ 
/*      */   public void setOpticalZoom(ZoomDimension value)
/*      */   {
/*  809 */     this.opticalZoom = value;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/*  821 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/*  833 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  845 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  857 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/*  869 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/*  881 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/*  893 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/*  905 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/*  917 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/*  929 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/*  941 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/*  953 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/*  965 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/*  977 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/*  989 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/* 1001 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewirePorts()
/*      */   {
/* 1013 */     return this.totalFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewirePorts(BigInteger value)
/*      */   {
/* 1025 */     this.totalFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/* 1037 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/* 1049 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoOutPorts()
/*      */   {
/* 1061 */     return this.totalSVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 1073 */     this.totalSVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSBPorts()
/*      */   {
/* 1085 */     return this.totalUSBPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalUSBPorts(BigInteger value)
/*      */   {
/* 1097 */     this.totalUSBPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVideoOutPorts()
/*      */   {
/* 1109 */     return this.totalVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVideoOutPorts(BigInteger value)
/*      */   {
/* 1121 */     this.totalVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public String getVideoEncoding()
/*      */   {
/* 1133 */     return this.videoEncoding;
/*      */   }
/*      */ 
/*      */   public void setVideoEncoding(String value)
/*      */   {
/* 1145 */     this.videoEncoding = value;
/*      */   }
/*      */ 
/*      */   public String getViewFinderType()
/*      */   {
/* 1157 */     return this.viewFinderType;
/*      */   }
/*      */ 
/*      */   public void setViewFinderType(String value)
/*      */   {
/* 1169 */     this.viewFinderType = value;
/*      */   }
/*      */ 
/*      */   public WaterResistantType getWaterResistantLevel()
/*      */   {
/* 1181 */     return this.waterResistantLevel;
/*      */   }
/*      */ 
/*      */   public void setWaterResistantLevel(WaterResistantType value)
/*      */   {
/* 1193 */     this.waterResistantLevel = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1205 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1217 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CECamcorder
 * JD-Core Version:    0.6.2
 */