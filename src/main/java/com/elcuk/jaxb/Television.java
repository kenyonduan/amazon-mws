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
/*      */ @XmlType(name="", propOrder={"amplifierType", "audibleNoise", "threeDTechnology", "baseLength", "baseWidth", "analogRGBInput", "screenDimensions", "batteryCellType", "batteryChargeCycles", "batteryPower", "bluRayRegion", "boxContents", "builtInMedia", "cableLength", "dvdRegion", "efficiency", "euEnergyLabelEfficiencyClass", "finishType", "grilleRemoveability", "maximumHorizontalRefreshRate", "maximumVerticalRefreshRate", "memorySlotsAvailable", "midRangeSpeakerDiameter", "midRangeSpeakerMaterial", "minimumHorizontalRefreshRate", "minimumVerticalRefreshRate", "mountingPattern", "numberOfRadioBandsSupported", "parentalControlTechnology", "powerConsumption", "powerPlugType", "powerSource", "refreshRate", "remoteControlDescription", "removableMemory", "resolution", "sVideoInputType", "screenFinish", "screenResolution", "screenSize", "numberOfSpeakers", "internetApplications", "shape", "softwareIncluded", "speakerGrilleMaterial", "speakerMaximumInputPower", "subwooferPowerTechnology", "subwooferSpeakerDiameter", "subwooferSpeakerMaterial", "subwooferWattage", "totalCoaxialInputs", "totalComponentInPorts", "totalCompositePorts", "totalDVIPorts", "totalEthernetPorts", "totalFirewirePorts", "totalHdmiPorts", "totalSubwooferOutputs", "totalSVideoInPorts", "totalSVideoOutPorts", "totalUSBPorts", "totalVgaInPorts", "totalVideoOutPorts", "universalRemoteCode", "wirelessTechnology", "wirelessType", "wooferSpeakerDiameter", "wooferSpeakerMaterial"})
/*      */ @XmlRootElement(name="Television")
/*      */ public class Television
/*      */ {
/*      */ 
/*      */   @XmlElement(name="AmplifierType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String amplifierType;
/*      */ 
/*      */   @XmlElement(name="AudibleNoise")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger audibleNoise;
/*      */ 
/*      */   @XmlElement(name="ThreeDTechnology")
/*      */   protected ThreeDTechnologyValues threeDTechnology;
/*      */ 
/*      */   @XmlElement(name="BaseLength")
/*      */   protected LengthDimension baseLength;
/*      */ 
/*      */   @XmlElement(name="BaseWidth")
/*      */   protected LengthDimension baseWidth;
/*      */ 
/*      */   @XmlElement(name="AnalogRGBInput")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> analogRGBInput;
/*      */ 
/*      */   @XmlElement(name="ScreenDimensions")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenDimensions;
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
/*      */   @XmlElement(name="BluRayRegion")
/*      */   protected BluRayRegionType bluRayRegion;
/*      */ 
/*      */   @XmlElement(name="BoxContents")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String boxContents;
/*      */ 
/*      */   @XmlElement(name="BuiltInMedia")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> builtInMedia;
/*      */ 
/*      */   @XmlElement(name="CableLength")
/*      */   protected LengthDimension cableLength;
/*      */ 
/*      */   @XmlElement(name="DVDRegion")
/*      */   @XmlSchemaType(name="nonNegativeInteger")
/*      */   protected BigInteger dvdRegion;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   @XmlElement(name="EuEnergyLabelEfficiencyClass")
/*      */   protected String euEnergyLabelEfficiencyClass;
/*      */ 
/*      */   @XmlElement(name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finishType;
/*      */ 
/*      */   @XmlElement(name="GrilleRemoveability")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String grilleRemoveability;
/*      */ 
/*      */   @XmlElement(name="MaximumHorizontalRefreshRate")
/*      */   protected FrequencyDimension maximumHorizontalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MaximumVerticalRefreshRate")
/*      */   protected FrequencyDimension maximumVerticalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="MidRangeSpeakerDiameter")
/*      */   protected LengthDimension midRangeSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="MidRangeSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String midRangeSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="MinimumHorizontalRefreshRate")
/*      */   protected FrequencyDimension minimumHorizontalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MinimumVerticalRefreshRate")
/*      */   protected FrequencyDimension minimumVerticalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MountingPattern")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountingPattern;
/*      */ 
/*      */   @XmlElement(name="NumberOfRadioBandsSupported")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfRadioBandsSupported;
/*      */ 
/*      */   @XmlElement(name="ParentalControlTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String parentalControlTechnology;
/*      */ 
/*      */   @XmlElement(name="PowerConsumption")
/*      */   protected PowerDimension powerConsumption;
/*      */ 
/*      */   @XmlElement(name="PowerPlugType")
/*      */   protected PowerPlugType powerPlugType;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="RefreshRate")
/*      */   protected FrequencyDimension refreshRate;
/*      */ 
/*      */   @XmlElement(name="RemoteControlDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String remoteControlDescription;
/*      */ 
/*      */   @XmlElement(name="RemovableMemory")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String removableMemory;
/*      */ 
/*      */   @XmlElement(name="Resolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String resolution;
/*      */ 
/*      */   @XmlElement(name="SVideoInputType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sVideoInputType;
/*      */ 
/*      */   @XmlElement(name="ScreenFinish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenFinish;
/*      */ 
/*      */   @XmlElement(name="ScreenResolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenResolution;
/*      */ 
/*      */   @XmlElement(name="ScreenSize")
/*      */   protected LengthDimension screenSize;
/*      */ 
/*      */   @XmlElement(name="NumberOfSpeakers")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfSpeakers;
/*      */ 
/*      */   @XmlElement(name="InternetApplications")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> internetApplications;
/*      */ 
/*      */   @XmlElement(name="Shape")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shape;
/*      */ 
/*      */   @XmlElement(name="SoftwareIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String softwareIncluded;
/*      */ 
/*      */   @XmlElement(name="SpeakerGrilleMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String speakerGrilleMaterial;
/*      */ 
/*      */   @XmlElement(name="SpeakerMaximumInputPower")
/*      */   protected PowerDimension speakerMaximumInputPower;
/*      */ 
/*      */   @XmlElement(name="SubwooferPowerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String subwooferPowerTechnology;
/*      */ 
/*      */   @XmlElement(name="SubwooferSpeakerDiameter")
/*      */   protected LengthDimension subwooferSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="SubwooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String subwooferSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="SubwooferWattage")
/*      */   protected WattageDimension subwooferWattage;
/*      */ 
/*      */   @XmlElement(name="TotalCoaxialInputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalCoaxialInputs;
/*      */ 
/*      */   @XmlElement(name="TotalComponentInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalComponentInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalCompositePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalCompositePorts;
/*      */ 
/*      */   @XmlElement(name="TotalDVIPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalDVIPorts;
/*      */ 
/*      */   @XmlElement(name="TotalEthernetPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalEthernetPorts;
/*      */ 
/*      */   @XmlElement(name="TotalFirewirePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalFirewirePorts;
/*      */ 
/*      */   @XmlElement(name="TotalHdmiPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalHdmiPorts;
/*      */ 
/*      */   @XmlElement(name="TotalSubwooferOutputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSubwooferOutputs;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="TotalUSBPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalUSBPorts;
/*      */ 
/*      */   @XmlElement(name="TotalVgaInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVgaInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="UniversalRemoteCode")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger universalRemoteCode;
/*      */ 
/*      */   @XmlElement(name="WirelessTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> wirelessTechnology;
/*      */ 
/*      */   @XmlElement(name="WirelessType")
/*      */   protected String wirelessType;
/*      */ 
/*      */   @XmlElement(name="WooferSpeakerDiameter")
/*      */   protected LengthDimension wooferSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="WooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String wooferSpeakerMaterial;
/*      */ 
/*      */   public String getAmplifierType()
/*      */   {
/*  369 */     return this.amplifierType;
/*      */   }
/*      */ 
/*      */   public void setAmplifierType(String value)
/*      */   {
/*  381 */     this.amplifierType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getAudibleNoise()
/*      */   {
/*  393 */     return this.audibleNoise;
/*      */   }
/*      */ 
/*      */   public void setAudibleNoise(BigInteger value)
/*      */   {
/*  405 */     this.audibleNoise = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/*  417 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/*  429 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseLength()
/*      */   {
/*  441 */     return this.baseLength;
/*      */   }
/*      */ 
/*      */   public void setBaseLength(LengthDimension value)
/*      */   {
/*  453 */     this.baseLength = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseWidth()
/*      */   {
/*  465 */     return this.baseWidth;
/*      */   }
/*      */ 
/*      */   public void setBaseWidth(LengthDimension value)
/*      */   {
/*  477 */     this.baseWidth = value;
/*      */   }
/*      */ 
/*      */   public List<String> getAnalogRGBInput()
/*      */   {
/*  503 */     if (this.analogRGBInput == null) {
/*  504 */       this.analogRGBInput = new ArrayList();
/*      */     }
/*  506 */     return this.analogRGBInput;
/*      */   }
/*      */ 
/*      */   public String getScreenDimensions()
/*      */   {
/*  518 */     return this.screenDimensions;
/*      */   }
/*      */ 
/*      */   public void setScreenDimensions(String value)
/*      */   {
/*  530 */     this.screenDimensions = value;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  542 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  554 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  566 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  578 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  590 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  602 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public BluRayRegionType getBluRayRegion()
/*      */   {
/*  614 */     return this.bluRayRegion;
/*      */   }
/*      */ 
/*      */   public void setBluRayRegion(BluRayRegionType value)
/*      */   {
/*  626 */     this.bluRayRegion = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  638 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  650 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public List<String> getBuiltInMedia()
/*      */   {
/*  676 */     if (this.builtInMedia == null) {
/*  677 */       this.builtInMedia = new ArrayList();
/*      */     }
/*  679 */     return this.builtInMedia;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/*  691 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/*  703 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getDVDRegion()
/*      */   {
/*  715 */     return this.dvdRegion;
/*      */   }
/*      */ 
/*      */   public void setDVDRegion(BigInteger value)
/*      */   {
/*  727 */     this.dvdRegion = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/*  739 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/*  751 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   public String getEuEnergyLabelEfficiencyClass()
/*      */   {
/*  763 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(String value)
/*      */   {
/*  775 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/*  787 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/*  799 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public String getGrilleRemoveability()
/*      */   {
/*  811 */     return this.grilleRemoveability;
/*      */   }
/*      */ 
/*      */   public void setGrilleRemoveability(String value)
/*      */   {
/*  823 */     this.grilleRemoveability = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMaximumHorizontalRefreshRate()
/*      */   {
/*  835 */     return this.maximumHorizontalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMaximumHorizontalRefreshRate(FrequencyDimension value)
/*      */   {
/*  847 */     this.maximumHorizontalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMaximumVerticalRefreshRate()
/*      */   {
/*  859 */     return this.maximumVerticalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMaximumVerticalRefreshRate(FrequencyDimension value)
/*      */   {
/*  871 */     this.maximumVerticalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  883 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  895 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMidRangeSpeakerDiameter()
/*      */   {
/*  907 */     return this.midRangeSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setMidRangeSpeakerDiameter(LengthDimension value)
/*      */   {
/*  919 */     this.midRangeSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getMidRangeSpeakerMaterial()
/*      */   {
/*  931 */     return this.midRangeSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setMidRangeSpeakerMaterial(String value)
/*      */   {
/*  943 */     this.midRangeSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMinimumHorizontalRefreshRate()
/*      */   {
/*  955 */     return this.minimumHorizontalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMinimumHorizontalRefreshRate(FrequencyDimension value)
/*      */   {
/*  967 */     this.minimumHorizontalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMinimumVerticalRefreshRate()
/*      */   {
/*  979 */     return this.minimumVerticalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMinimumVerticalRefreshRate(FrequencyDimension value)
/*      */   {
/*  991 */     this.minimumVerticalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public String getMountingPattern()
/*      */   {
/* 1003 */     return this.mountingPattern;
/*      */   }
/*      */ 
/*      */   public void setMountingPattern(String value)
/*      */   {
/* 1015 */     this.mountingPattern = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfRadioBandsSupported()
/*      */   {
/* 1027 */     return this.numberOfRadioBandsSupported;
/*      */   }
/*      */ 
/*      */   public void setNumberOfRadioBandsSupported(BigInteger value)
/*      */   {
/* 1039 */     this.numberOfRadioBandsSupported = value;
/*      */   }
/*      */ 
/*      */   public String getParentalControlTechnology()
/*      */   {
/* 1051 */     return this.parentalControlTechnology;
/*      */   }
/*      */ 
/*      */   public void setParentalControlTechnology(String value)
/*      */   {
/* 1063 */     this.parentalControlTechnology = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getPowerConsumption()
/*      */   {
/* 1075 */     return this.powerConsumption;
/*      */   }
/*      */ 
/*      */   public void setPowerConsumption(PowerDimension value)
/*      */   {
/* 1087 */     this.powerConsumption = value;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/* 1099 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/* 1111 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1123 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1135 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getRefreshRate()
/*      */   {
/* 1147 */     return this.refreshRate;
/*      */   }
/*      */ 
/*      */   public void setRefreshRate(FrequencyDimension value)
/*      */   {
/* 1159 */     this.refreshRate = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/* 1171 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/* 1183 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/* 1195 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/* 1207 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public String getResolution()
/*      */   {
/* 1219 */     return this.resolution;
/*      */   }
/*      */ 
/*      */   public void setResolution(String value)
/*      */   {
/* 1231 */     this.resolution = value;
/*      */   }
/*      */ 
/*      */   public String getSVideoInputType()
/*      */   {
/* 1243 */     return this.sVideoInputType;
/*      */   }
/*      */ 
/*      */   public void setSVideoInputType(String value)
/*      */   {
/* 1255 */     this.sVideoInputType = value;
/*      */   }
/*      */ 
/*      */   public String getScreenFinish()
/*      */   {
/* 1267 */     return this.screenFinish;
/*      */   }
/*      */ 
/*      */   public void setScreenFinish(String value)
/*      */   {
/* 1279 */     this.screenFinish = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/* 1291 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/* 1303 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/* 1315 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/* 1327 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSpeakers()
/*      */   {
/* 1339 */     return this.numberOfSpeakers;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSpeakers(BigInteger value)
/*      */   {
/* 1351 */     this.numberOfSpeakers = value;
/*      */   }
/*      */ 
/*      */   public List<String> getInternetApplications()
/*      */   {
/* 1377 */     if (this.internetApplications == null) {
/* 1378 */       this.internetApplications = new ArrayList();
/*      */     }
/* 1380 */     return this.internetApplications;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/* 1392 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/* 1404 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/* 1416 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/* 1428 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeakerGrilleMaterial()
/*      */   {
/* 1440 */     return this.speakerGrilleMaterial;
/*      */   }
/*      */ 
/*      */   public void setSpeakerGrilleMaterial(String value)
/*      */   {
/* 1452 */     this.speakerGrilleMaterial = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getSpeakerMaximumInputPower()
/*      */   {
/* 1464 */     return this.speakerMaximumInputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakerMaximumInputPower(PowerDimension value)
/*      */   {
/* 1476 */     this.speakerMaximumInputPower = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferPowerTechnology()
/*      */   {
/* 1488 */     return this.subwooferPowerTechnology;
/*      */   }
/*      */ 
/*      */   public void setSubwooferPowerTechnology(String value)
/*      */   {
/* 1500 */     this.subwooferPowerTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSubwooferSpeakerDiameter()
/*      */   {
/* 1512 */     return this.subwooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1524 */     this.subwooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferSpeakerMaterial()
/*      */   {
/* 1536 */     return this.subwooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerMaterial(String value)
/*      */   {
/* 1548 */     this.subwooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getSubwooferWattage()
/*      */   {
/* 1560 */     return this.subwooferWattage;
/*      */   }
/*      */ 
/*      */   public void setSubwooferWattage(WattageDimension value)
/*      */   {
/* 1572 */     this.subwooferWattage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCoaxialInputs()
/*      */   {
/* 1584 */     return this.totalCoaxialInputs;
/*      */   }
/*      */ 
/*      */   public void setTotalCoaxialInputs(BigInteger value)
/*      */   {
/* 1596 */     this.totalCoaxialInputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalComponentInPorts()
/*      */   {
/* 1608 */     return this.totalComponentInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalComponentInPorts(BigInteger value)
/*      */   {
/* 1620 */     this.totalComponentInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCompositePorts()
/*      */   {
/* 1632 */     return this.totalCompositePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalCompositePorts(BigInteger value)
/*      */   {
/* 1644 */     this.totalCompositePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/* 1656 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/* 1668 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalEthernetPorts()
/*      */   {
/* 1680 */     return this.totalEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalEthernetPorts(BigInteger value)
/*      */   {
/* 1692 */     this.totalEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewirePorts()
/*      */   {
/* 1704 */     return this.totalFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewirePorts(BigInteger value)
/*      */   {
/* 1716 */     this.totalFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/* 1728 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/* 1740 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSubwooferOutputs()
/*      */   {
/* 1752 */     return this.totalSubwooferOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalSubwooferOutputs(BigInteger value)
/*      */   {
/* 1764 */     this.totalSubwooferOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoInPorts()
/*      */   {
/* 1776 */     return this.totalSVideoInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoInPorts(BigInteger value)
/*      */   {
/* 1788 */     this.totalSVideoInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoOutPorts()
/*      */   {
/* 1800 */     return this.totalSVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 1812 */     this.totalSVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSBPorts()
/*      */   {
/* 1824 */     return this.totalUSBPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalUSBPorts(BigInteger value)
/*      */   {
/* 1836 */     this.totalUSBPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVgaInPorts()
/*      */   {
/* 1848 */     return this.totalVgaInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVgaInPorts(BigInteger value)
/*      */   {
/* 1860 */     this.totalVgaInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVideoOutPorts()
/*      */   {
/* 1872 */     return this.totalVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVideoOutPorts(BigInteger value)
/*      */   {
/* 1884 */     this.totalVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getUniversalRemoteCode()
/*      */   {
/* 1896 */     return this.universalRemoteCode;
/*      */   }
/*      */ 
/*      */   public void setUniversalRemoteCode(BigInteger value)
/*      */   {
/* 1908 */     this.universalRemoteCode = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessTechnology()
/*      */   {
/* 1934 */     if (this.wirelessTechnology == null) {
/* 1935 */       this.wirelessTechnology = new ArrayList();
/*      */     }
/* 1937 */     return this.wirelessTechnology;
/*      */   }
/*      */ 
/*      */   public String getWirelessType()
/*      */   {
/* 1949 */     return this.wirelessType;
/*      */   }
/*      */ 
/*      */   public void setWirelessType(String value)
/*      */   {
/* 1961 */     this.wirelessType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getWooferSpeakerDiameter()
/*      */   {
/* 1973 */     return this.wooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1985 */     this.wooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getWooferSpeakerMaterial()
/*      */   {
/* 1997 */     return this.wooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerMaterial(String value)
/*      */   {
/* 2009 */     this.wooferSpeakerMaterial = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Television
 * JD-Core Version:    0.6.2
 */