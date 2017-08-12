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
/*      */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "bluRayRegion", "boxContents", "cableLength", "cameraLens", "dvdRegion", "effectiveStillResolution", "enclosureFinish", "finishType", "grilleRemoveability", "internetApplications", "memorySlotsAvailable", "numberOfSpeakers", "operatingSystem", "parentalControlTechnology", "photoSensorSize", "photoSensorTechnology", "powerConsumption", "powerPlugType", "powerSource", "remoteControlDescription", "removableMemory", "screenFinish", "screenSize", "shape", "softwareIncluded", "speakerGrilleMaterial", "speakerMaximumInputPower", "subwooferSpeakerDiameter", "threeDTechnology", "totalCoaxialInputs", "totalComponentInPorts", "totalDVIPorts", "totalEthernetPorts", "totalFirewirePorts", "totalHdmiPorts", "totalMicrophonePorts", "totalPreampOutputs", "totalSubwooferOutputs", "totalSVideoInPorts", "totalSVideoOutPorts", "totalUSBPorts", "totalVgaInPorts", "totalVideoOutPorts", "videoEncoding", "videoResolution", "wattage", "efficiency"})
/*      */ @XmlRootElement(name="PortableAvDevice")
/*      */ public class PortableAvDevice
/*      */ {
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
/*      */   @XmlElement(name="CameraLens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cameraLens;
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
/*      */   @XmlElement(name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finishType;
/*      */ 
/*      */   @XmlElement(name="GrilleRemoveability")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String grilleRemoveability;
/*      */ 
/*      */   @XmlElement(name="InternetApplications")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> internetApplications;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="NumberOfSpeakers")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfSpeakers;
/*      */ 
/*      */   @XmlElement(name="OperatingSystem")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> operatingSystem;
/*      */ 
/*      */   @XmlElement(name="ParentalControlTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String parentalControlTechnology;
/*      */ 
/*      */   @XmlElement(name="PhotoSensorSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoSensorSize;
/*      */ 
/*      */   @XmlElement(name="PhotoSensorTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoSensorTechnology;
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
/*      */   @XmlElement(name="RemoteControlDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String remoteControlDescription;
/*      */ 
/*      */   @XmlElement(name="RemovableMemory")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String removableMemory;
/*      */ 
/*      */   @XmlElement(name="ScreenFinish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenFinish;
/*      */ 
/*      */   @XmlElement(name="ScreenSize")
/*      */   protected LengthDimension screenSize;
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
/*      */   @XmlElement(name="SubwooferSpeakerDiameter")
/*      */   protected LengthDimension subwooferSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="ThreeDTechnology")
/*      */   protected ThreeDTechnologyValues threeDTechnology;
/*      */ 
/*      */   @XmlElement(name="TotalCoaxialInputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalCoaxialInputs;
/*      */ 
/*      */   @XmlElement(name="TotalComponentInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalComponentInPorts;
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
/*      */   @XmlElement(name="VideoEncoding")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String videoEncoding;
/*      */ 
/*      */   @XmlElement(name="VideoResolution")
/*      */   protected PixelDimension videoResolution;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected WattageIntegerDimension wattage;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  288 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  300 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  312 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  324 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  336 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  348 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public BluRayRegionType getBluRayRegion()
/*      */   {
/*  360 */     return this.bluRayRegion;
/*      */   }
/*      */ 
/*      */   public void setBluRayRegion(BluRayRegionType value)
/*      */   {
/*  372 */     this.bluRayRegion = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  384 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  396 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/*  408 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/*  420 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public String getCameraLens()
/*      */   {
/*  432 */     return this.cameraLens;
/*      */   }
/*      */ 
/*      */   public void setCameraLens(String value)
/*      */   {
/*  444 */     this.cameraLens = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getDVDRegion()
/*      */   {
/*  456 */     return this.dvdRegion;
/*      */   }
/*      */ 
/*      */   public void setDVDRegion(BigInteger value)
/*      */   {
/*  468 */     this.dvdRegion = value;
/*      */   }
/*      */ 
/*      */   public ResolutionDimension getEffectiveStillResolution()
/*      */   {
/*  480 */     return this.effectiveStillResolution;
/*      */   }
/*      */ 
/*      */   public void setEffectiveStillResolution(ResolutionDimension value)
/*      */   {
/*  492 */     this.effectiveStillResolution = value;
/*      */   }
/*      */ 
/*      */   public String getEnclosureFinish()
/*      */   {
/*  504 */     return this.enclosureFinish;
/*      */   }
/*      */ 
/*      */   public void setEnclosureFinish(String value)
/*      */   {
/*  516 */     this.enclosureFinish = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/*  528 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/*  540 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public String getGrilleRemoveability()
/*      */   {
/*  552 */     return this.grilleRemoveability;
/*      */   }
/*      */ 
/*      */   public void setGrilleRemoveability(String value)
/*      */   {
/*  564 */     this.grilleRemoveability = value;
/*      */   }
/*      */ 
/*      */   public List<String> getInternetApplications()
/*      */   {
/*  590 */     if (this.internetApplications == null) {
/*  591 */       this.internetApplications = new ArrayList();
/*      */     }
/*  593 */     return this.internetApplications;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  605 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  617 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSpeakers()
/*      */   {
/*  629 */     return this.numberOfSpeakers;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSpeakers(BigInteger value)
/*      */   {
/*  641 */     this.numberOfSpeakers = value;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/*  667 */     if (this.operatingSystem == null) {
/*  668 */       this.operatingSystem = new ArrayList();
/*      */     }
/*  670 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public String getParentalControlTechnology()
/*      */   {
/*  682 */     return this.parentalControlTechnology;
/*      */   }
/*      */ 
/*      */   public void setParentalControlTechnology(String value)
/*      */   {
/*  694 */     this.parentalControlTechnology = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoSensorSize()
/*      */   {
/*  706 */     return this.photoSensorSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoSensorSize(String value)
/*      */   {
/*  718 */     this.photoSensorSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoSensorTechnology()
/*      */   {
/*  730 */     return this.photoSensorTechnology;
/*      */   }
/*      */ 
/*      */   public void setPhotoSensorTechnology(String value)
/*      */   {
/*  742 */     this.photoSensorTechnology = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getPowerConsumption()
/*      */   {
/*  754 */     return this.powerConsumption;
/*      */   }
/*      */ 
/*      */   public void setPowerConsumption(PowerDimension value)
/*      */   {
/*  766 */     this.powerConsumption = value;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/*  778 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/*  790 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  802 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  814 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/*  826 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/*  838 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/*  850 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/*  862 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public String getScreenFinish()
/*      */   {
/*  874 */     return this.screenFinish;
/*      */   }
/*      */ 
/*      */   public void setScreenFinish(String value)
/*      */   {
/*  886 */     this.screenFinish = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/*  898 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/*  910 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/*  922 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/*  934 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/*  946 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/*  958 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeakerGrilleMaterial()
/*      */   {
/*  970 */     return this.speakerGrilleMaterial;
/*      */   }
/*      */ 
/*      */   public void setSpeakerGrilleMaterial(String value)
/*      */   {
/*  982 */     this.speakerGrilleMaterial = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getSpeakerMaximumInputPower()
/*      */   {
/*  994 */     return this.speakerMaximumInputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakerMaximumInputPower(PowerDimension value)
/*      */   {
/* 1006 */     this.speakerMaximumInputPower = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSubwooferSpeakerDiameter()
/*      */   {
/* 1018 */     return this.subwooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1030 */     this.subwooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/* 1042 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/* 1054 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCoaxialInputs()
/*      */   {
/* 1066 */     return this.totalCoaxialInputs;
/*      */   }
/*      */ 
/*      */   public void setTotalCoaxialInputs(BigInteger value)
/*      */   {
/* 1078 */     this.totalCoaxialInputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalComponentInPorts()
/*      */   {
/* 1090 */     return this.totalComponentInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalComponentInPorts(BigInteger value)
/*      */   {
/* 1102 */     this.totalComponentInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/* 1114 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/* 1126 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalEthernetPorts()
/*      */   {
/* 1138 */     return this.totalEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalEthernetPorts(BigInteger value)
/*      */   {
/* 1150 */     this.totalEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewirePorts()
/*      */   {
/* 1162 */     return this.totalFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewirePorts(BigInteger value)
/*      */   {
/* 1174 */     this.totalFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/* 1186 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/* 1198 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalMicrophonePorts()
/*      */   {
/* 1210 */     return this.totalMicrophonePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalMicrophonePorts(BigInteger value)
/*      */   {
/* 1222 */     this.totalMicrophonePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalPreampOutputs()
/*      */   {
/* 1234 */     return this.totalPreampOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalPreampOutputs(BigInteger value)
/*      */   {
/* 1246 */     this.totalPreampOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSubwooferOutputs()
/*      */   {
/* 1258 */     return this.totalSubwooferOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalSubwooferOutputs(BigInteger value)
/*      */   {
/* 1270 */     this.totalSubwooferOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoInPorts()
/*      */   {
/* 1282 */     return this.totalSVideoInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoInPorts(BigInteger value)
/*      */   {
/* 1294 */     this.totalSVideoInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoOutPorts()
/*      */   {
/* 1306 */     return this.totalSVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 1318 */     this.totalSVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSBPorts()
/*      */   {
/* 1330 */     return this.totalUSBPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalUSBPorts(BigInteger value)
/*      */   {
/* 1342 */     this.totalUSBPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVgaInPorts()
/*      */   {
/* 1354 */     return this.totalVgaInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVgaInPorts(BigInteger value)
/*      */   {
/* 1366 */     this.totalVgaInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVideoOutPorts()
/*      */   {
/* 1378 */     return this.totalVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVideoOutPorts(BigInteger value)
/*      */   {
/* 1390 */     this.totalVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public String getVideoEncoding()
/*      */   {
/* 1402 */     return this.videoEncoding;
/*      */   }
/*      */ 
/*      */   public void setVideoEncoding(String value)
/*      */   {
/* 1414 */     this.videoEncoding = value;
/*      */   }
/*      */ 
/*      */   public PixelDimension getVideoResolution()
/*      */   {
/* 1426 */     return this.videoResolution;
/*      */   }
/*      */ 
/*      */   public void setVideoResolution(PixelDimension value)
/*      */   {
/* 1438 */     this.videoResolution = value;
/*      */   }
/*      */ 
/*      */   public WattageIntegerDimension getWattage()
/*      */   {
/* 1450 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageIntegerDimension value)
/*      */   {
/* 1462 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1474 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1486 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PortableAvDevice
 * JD-Core Version:    0.6.2
 */