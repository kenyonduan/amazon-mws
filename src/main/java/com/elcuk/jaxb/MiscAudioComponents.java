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
/*      */ @XmlType(name="", propOrder={"threeDTechnology", "baseLength", "baseWidth", "analogRGBInput", "screenDimensions", "resolution", "sVideoInputType", "screenSize", "numberOfSpeakers", "internetApplications", "totalCoaxialInputs", "totalComponentInPorts", "totalCompositePorts", "totalEthernetPorts", "totalHdmiPorts", "totalSVideoInPorts", "totalVgaInPorts", "totalVideoOutPorts", "wirelessTechnology", "wirelessType", "amplifierType", "batteryCellType", "batteryChargeCycles", "batteryPower", "bluRayRegion", "boxContents", "cableLength", "dvdRegion", "effectiveStillResolution", "enclosureFinish", "euEnergyLabelEfficiencyClass", "finishType", "grilleRemoveability", "memorySlotsAvailable", "midRangeSpeakerDiameter", "midRangeSpeakerMaterial", "numberOfRadioBandsSupported", "numberOfRecordingLoops", "operatingSystem", "parentalControlTechnology", "powerConsumption", "powerPlugType", "powerSource", "refreshRate", "remoteControlDescription", "removableMemory", "shape", "softwareIncluded", "speakerGrilleMaterial", "speakerMaximumInputPower", "subwooferPowerTechnology", "subwooferSpeakerDiameter", "subwooferSpeakerMaterial", "subwooferWattage", "totalDVIPorts", "totalFirewirePorts", "totalMicrophonePorts", "totalPreampOutputs", "totalSubwooferOutputs", "totalSVideoOutPorts", "totalUSBPorts", "tweeterConeMaterialType", "tweeterDriverDiameter", "wattage", "wooferSpeakerDiameter", "wooferSpeakerMaterial", "efficiency"})
/*      */ @XmlRootElement(name="MiscAudioComponents")
/*      */ public class MiscAudioComponents
/*      */ {
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
/*      */   @XmlElement(name="Resolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String resolution;
/*      */ 
/*      */   @XmlElement(name="SVideoInputType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sVideoInputType;
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
/*      */   @XmlElement(name="TotalEthernetPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalEthernetPorts;
/*      */ 
/*      */   @XmlElement(name="TotalHdmiPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalHdmiPorts;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalVgaInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVgaInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="WirelessTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> wirelessTechnology;
/*      */ 
/*      */   @XmlElement(name="WirelessType")
/*      */   protected String wirelessType;
/*      */ 
/*      */   @XmlElement(name="AmplifierType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String amplifierType;
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
/*      */   @XmlElement(name="CableLength")
/*      */   protected LengthDimension cableLength;
/*      */ 
/*      */   @XmlElement(name="DVDRegion")
/*      */   @XmlSchemaType(name="nonNegativeInteger")
/*      */   protected BigInteger dvdRegion;
/*      */ 
/*      */   @XmlElement(name="EffectiveStillResolution")
/*      */   protected ResolutionDimension effectiveStillResolution;
/*      */ 
/*      */   @XmlElement(name="EnclosureFinish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String enclosureFinish;
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
/*      */   @XmlElement(name="NumberOfRadioBandsSupported")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfRadioBandsSupported;
/*      */ 
/*      */   @XmlElement(name="NumberOfRecordingLoops")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfRecordingLoops;
/*      */ 
/*      */   @XmlElement(name="OperatingSystem")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> operatingSystem;
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
/*      */   @XmlElement(name="TotalDVIPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalDVIPorts;
/*      */ 
/*      */   @XmlElement(name="TotalFirewirePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalFirewirePorts;
/*      */ 
/*      */   @XmlElement(name="TotalMicrophonePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalMicrophonePorts;
/*      */ 
/*      */   @XmlElement(name="TotalPreampOutputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalPreampOutputs;
/*      */ 
/*      */   @XmlElement(name="TotalSubwooferOutputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSubwooferOutputs;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="TotalUSBPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalUSBPorts;
/*      */ 
/*      */   @XmlElement(name="TweeterConeMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String tweeterConeMaterialType;
/*      */ 
/*      */   @XmlElement(name="TweeterDriverDiameter")
/*      */   protected LengthDimension tweeterDriverDiameter;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected WattageIntegerDimension wattage;
/*      */ 
/*      */   @XmlElement(name="WooferSpeakerDiameter")
/*      */   protected LengthDimension wooferSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="WooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String wooferSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/*  365 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/*  377 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseLength()
/*      */   {
/*  389 */     return this.baseLength;
/*      */   }
/*      */ 
/*      */   public void setBaseLength(LengthDimension value)
/*      */   {
/*  401 */     this.baseLength = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseWidth()
/*      */   {
/*  413 */     return this.baseWidth;
/*      */   }
/*      */ 
/*      */   public void setBaseWidth(LengthDimension value)
/*      */   {
/*  425 */     this.baseWidth = value;
/*      */   }
/*      */ 
/*      */   public List<String> getAnalogRGBInput()
/*      */   {
/*  451 */     if (this.analogRGBInput == null) {
/*  452 */       this.analogRGBInput = new ArrayList();
/*      */     }
/*  454 */     return this.analogRGBInput;
/*      */   }
/*      */ 
/*      */   public String getScreenDimensions()
/*      */   {
/*  466 */     return this.screenDimensions;
/*      */   }
/*      */ 
/*      */   public void setScreenDimensions(String value)
/*      */   {
/*  478 */     this.screenDimensions = value;
/*      */   }
/*      */ 
/*      */   public String getResolution()
/*      */   {
/*  490 */     return this.resolution;
/*      */   }
/*      */ 
/*      */   public void setResolution(String value)
/*      */   {
/*  502 */     this.resolution = value;
/*      */   }
/*      */ 
/*      */   public String getSVideoInputType()
/*      */   {
/*  514 */     return this.sVideoInputType;
/*      */   }
/*      */ 
/*      */   public void setSVideoInputType(String value)
/*      */   {
/*  526 */     this.sVideoInputType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/*  538 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/*  550 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSpeakers()
/*      */   {
/*  562 */     return this.numberOfSpeakers;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSpeakers(BigInteger value)
/*      */   {
/*  574 */     this.numberOfSpeakers = value;
/*      */   }
/*      */ 
/*      */   public List<String> getInternetApplications()
/*      */   {
/*  600 */     if (this.internetApplications == null) {
/*  601 */       this.internetApplications = new ArrayList();
/*      */     }
/*  603 */     return this.internetApplications;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCoaxialInputs()
/*      */   {
/*  615 */     return this.totalCoaxialInputs;
/*      */   }
/*      */ 
/*      */   public void setTotalCoaxialInputs(BigInteger value)
/*      */   {
/*  627 */     this.totalCoaxialInputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalComponentInPorts()
/*      */   {
/*  639 */     return this.totalComponentInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalComponentInPorts(BigInteger value)
/*      */   {
/*  651 */     this.totalComponentInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCompositePorts()
/*      */   {
/*  663 */     return this.totalCompositePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalCompositePorts(BigInteger value)
/*      */   {
/*  675 */     this.totalCompositePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalEthernetPorts()
/*      */   {
/*  687 */     return this.totalEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalEthernetPorts(BigInteger value)
/*      */   {
/*  699 */     this.totalEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/*  711 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/*  723 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoInPorts()
/*      */   {
/*  735 */     return this.totalSVideoInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoInPorts(BigInteger value)
/*      */   {
/*  747 */     this.totalSVideoInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVgaInPorts()
/*      */   {
/*  759 */     return this.totalVgaInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVgaInPorts(BigInteger value)
/*      */   {
/*  771 */     this.totalVgaInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVideoOutPorts()
/*      */   {
/*  783 */     return this.totalVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVideoOutPorts(BigInteger value)
/*      */   {
/*  795 */     this.totalVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessTechnology()
/*      */   {
/*  821 */     if (this.wirelessTechnology == null) {
/*  822 */       this.wirelessTechnology = new ArrayList();
/*      */     }
/*  824 */     return this.wirelessTechnology;
/*      */   }
/*      */ 
/*      */   public String getWirelessType()
/*      */   {
/*  836 */     return this.wirelessType;
/*      */   }
/*      */ 
/*      */   public void setWirelessType(String value)
/*      */   {
/*  848 */     this.wirelessType = value;
/*      */   }
/*      */ 
/*      */   public String getAmplifierType()
/*      */   {
/*  860 */     return this.amplifierType;
/*      */   }
/*      */ 
/*      */   public void setAmplifierType(String value)
/*      */   {
/*  872 */     this.amplifierType = value;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  884 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  896 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  908 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  920 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  932 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  944 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public BluRayRegionType getBluRayRegion()
/*      */   {
/*  956 */     return this.bluRayRegion;
/*      */   }
/*      */ 
/*      */   public void setBluRayRegion(BluRayRegionType value)
/*      */   {
/*  968 */     this.bluRayRegion = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  980 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  992 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/* 1004 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/* 1016 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getDVDRegion()
/*      */   {
/* 1028 */     return this.dvdRegion;
/*      */   }
/*      */ 
/*      */   public void setDVDRegion(BigInteger value)
/*      */   {
/* 1040 */     this.dvdRegion = value;
/*      */   }
/*      */ 
/*      */   public ResolutionDimension getEffectiveStillResolution()
/*      */   {
/* 1052 */     return this.effectiveStillResolution;
/*      */   }
/*      */ 
/*      */   public void setEffectiveStillResolution(ResolutionDimension value)
/*      */   {
/* 1064 */     this.effectiveStillResolution = value;
/*      */   }
/*      */ 
/*      */   public String getEnclosureFinish()
/*      */   {
/* 1076 */     return this.enclosureFinish;
/*      */   }
/*      */ 
/*      */   public void setEnclosureFinish(String value)
/*      */   {
/* 1088 */     this.enclosureFinish = value;
/*      */   }
/*      */ 
/*      */   public String getEuEnergyLabelEfficiencyClass()
/*      */   {
/* 1100 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(String value)
/*      */   {
/* 1112 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/* 1124 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/* 1136 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public String getGrilleRemoveability()
/*      */   {
/* 1148 */     return this.grilleRemoveability;
/*      */   }
/*      */ 
/*      */   public void setGrilleRemoveability(String value)
/*      */   {
/* 1160 */     this.grilleRemoveability = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/* 1172 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/* 1184 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMidRangeSpeakerDiameter()
/*      */   {
/* 1196 */     return this.midRangeSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setMidRangeSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1208 */     this.midRangeSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getMidRangeSpeakerMaterial()
/*      */   {
/* 1220 */     return this.midRangeSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setMidRangeSpeakerMaterial(String value)
/*      */   {
/* 1232 */     this.midRangeSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfRadioBandsSupported()
/*      */   {
/* 1244 */     return this.numberOfRadioBandsSupported;
/*      */   }
/*      */ 
/*      */   public void setNumberOfRadioBandsSupported(BigInteger value)
/*      */   {
/* 1256 */     this.numberOfRadioBandsSupported = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfRecordingLoops()
/*      */   {
/* 1268 */     return this.numberOfRecordingLoops;
/*      */   }
/*      */ 
/*      */   public void setNumberOfRecordingLoops(BigInteger value)
/*      */   {
/* 1280 */     this.numberOfRecordingLoops = value;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/* 1306 */     if (this.operatingSystem == null) {
/* 1307 */       this.operatingSystem = new ArrayList();
/*      */     }
/* 1309 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public String getParentalControlTechnology()
/*      */   {
/* 1321 */     return this.parentalControlTechnology;
/*      */   }
/*      */ 
/*      */   public void setParentalControlTechnology(String value)
/*      */   {
/* 1333 */     this.parentalControlTechnology = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getPowerConsumption()
/*      */   {
/* 1345 */     return this.powerConsumption;
/*      */   }
/*      */ 
/*      */   public void setPowerConsumption(PowerDimension value)
/*      */   {
/* 1357 */     this.powerConsumption = value;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/* 1369 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/* 1381 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1393 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1405 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getRefreshRate()
/*      */   {
/* 1417 */     return this.refreshRate;
/*      */   }
/*      */ 
/*      */   public void setRefreshRate(FrequencyDimension value)
/*      */   {
/* 1429 */     this.refreshRate = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/* 1441 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/* 1453 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/* 1465 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/* 1477 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/* 1489 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/* 1501 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/* 1513 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/* 1525 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeakerGrilleMaterial()
/*      */   {
/* 1537 */     return this.speakerGrilleMaterial;
/*      */   }
/*      */ 
/*      */   public void setSpeakerGrilleMaterial(String value)
/*      */   {
/* 1549 */     this.speakerGrilleMaterial = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getSpeakerMaximumInputPower()
/*      */   {
/* 1561 */     return this.speakerMaximumInputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakerMaximumInputPower(PowerDimension value)
/*      */   {
/* 1573 */     this.speakerMaximumInputPower = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferPowerTechnology()
/*      */   {
/* 1585 */     return this.subwooferPowerTechnology;
/*      */   }
/*      */ 
/*      */   public void setSubwooferPowerTechnology(String value)
/*      */   {
/* 1597 */     this.subwooferPowerTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSubwooferSpeakerDiameter()
/*      */   {
/* 1609 */     return this.subwooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1621 */     this.subwooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferSpeakerMaterial()
/*      */   {
/* 1633 */     return this.subwooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerMaterial(String value)
/*      */   {
/* 1645 */     this.subwooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getSubwooferWattage()
/*      */   {
/* 1657 */     return this.subwooferWattage;
/*      */   }
/*      */ 
/*      */   public void setSubwooferWattage(WattageDimension value)
/*      */   {
/* 1669 */     this.subwooferWattage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/* 1681 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/* 1693 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewirePorts()
/*      */   {
/* 1705 */     return this.totalFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewirePorts(BigInteger value)
/*      */   {
/* 1717 */     this.totalFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalMicrophonePorts()
/*      */   {
/* 1729 */     return this.totalMicrophonePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalMicrophonePorts(BigInteger value)
/*      */   {
/* 1741 */     this.totalMicrophonePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalPreampOutputs()
/*      */   {
/* 1753 */     return this.totalPreampOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalPreampOutputs(BigInteger value)
/*      */   {
/* 1765 */     this.totalPreampOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSubwooferOutputs()
/*      */   {
/* 1777 */     return this.totalSubwooferOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalSubwooferOutputs(BigInteger value)
/*      */   {
/* 1789 */     this.totalSubwooferOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoOutPorts()
/*      */   {
/* 1801 */     return this.totalSVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 1813 */     this.totalSVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSBPorts()
/*      */   {
/* 1825 */     return this.totalUSBPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalUSBPorts(BigInteger value)
/*      */   {
/* 1837 */     this.totalUSBPorts = value;
/*      */   }
/*      */ 
/*      */   public String getTweeterConeMaterialType()
/*      */   {
/* 1849 */     return this.tweeterConeMaterialType;
/*      */   }
/*      */ 
/*      */   public void setTweeterConeMaterialType(String value)
/*      */   {
/* 1861 */     this.tweeterConeMaterialType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getTweeterDriverDiameter()
/*      */   {
/* 1873 */     return this.tweeterDriverDiameter;
/*      */   }
/*      */ 
/*      */   public void setTweeterDriverDiameter(LengthDimension value)
/*      */   {
/* 1885 */     this.tweeterDriverDiameter = value;
/*      */   }
/*      */ 
/*      */   public WattageIntegerDimension getWattage()
/*      */   {
/* 1897 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageIntegerDimension value)
/*      */   {
/* 1909 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getWooferSpeakerDiameter()
/*      */   {
/* 1921 */     return this.wooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1933 */     this.wooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getWooferSpeakerMaterial()
/*      */   {
/* 1945 */     return this.wooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerMaterial(String value)
/*      */   {
/* 1957 */     this.wooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1969 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1981 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MiscAudioComponents
 * JD-Core Version:    0.6.2
 */