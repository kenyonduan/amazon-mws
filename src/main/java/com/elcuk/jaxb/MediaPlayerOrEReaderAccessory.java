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
/*      */ @XmlType(name="", propOrder={"analogRGBInput", "batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cameraLens", "coatingDescription", "compatibleMountings", "conductor", "enclosureFinish", "finishType", "grilleRemoveability", "loadCapacity", "maxWeightCapacity", "memorySlotsAvailable", "mountingType", "numberOfRecordingLoops", "operatingSystem", "photoSensorSize", "photoSensorTechnology", "powerConsumption", "powerPlugType", "remoteControlDescription", "removableMemory", "screenSize", "shape", "softwareIncluded", "speakerGrilleMaterial", "speakerMaximumInputPower", "subwooferPowerTechnology", "subwooferSpeakerDiameter", "subwooferSpeakerMaterial", "subwooferWattage", "surgeProtectionRating", "threeDTechnology", "totalCoaxialInputs", "totalComponentInPorts", "totalCompositePorts", "totalDVIPorts", "totalFirewirePorts", "totalMicrophonePorts", "totalPowerOutlets", "totalSubwooferOutputs", "totalSVideoInPorts", "totalSVideoOutPorts", "totalUSBPorts", "totalVgaInPorts", "totalVideoOutPorts", "trafficFeatures", "wattage", "wooferSpeakerDiameter", "wooferSpeakerMaterial", "cableLength", "connectorGender", "connectorTypeUsedOnCable", "mountMotion", "powerSource", "videoResolution", "wirelessTechnology", "efficiency"})
/*      */ @XmlRootElement(name="MediaPlayerOrEReaderAccessory")
/*      */ public class MediaPlayerOrEReaderAccessory
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
/*      */   @XmlElement(name="CameraLens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cameraLens;
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
/*      */   @XmlElement(name="NumberOfRecordingLoops")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfRecordingLoops;
/*      */ 
/*      */   @XmlElement(name="OperatingSystem")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> operatingSystem;
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
/*      */   @XmlElement(name="SurgeProtectionRating")
/*      */   protected EnergyRatingType surgeProtectionRating;
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
/*      */   @XmlElement(name="TotalCompositePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalCompositePorts;
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
/*      */   @XmlElement(name="TotalPowerOutlets")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalPowerOutlets;
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
/*      */   @XmlElement(name="TrafficFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> trafficFeatures;
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
/*      */   @XmlElement(name="CableLength")
/*      */   protected LengthDimension cableLength;
/*      */ 
/*      */   @XmlElement(name="ConnectorGender")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> connectorGender;
/*      */ 
/*      */   @XmlElement(name="ConnectorTypeUsedOnCable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String connectorTypeUsedOnCable;
/*      */ 
/*      */   @XmlElement(name="MountMotion")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountMotion;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="VideoResolution")
/*      */   protected PixelDimension videoResolution;
/*      */ 
/*      */   @XmlElement(name="WirelessTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> wirelessTechnology;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public List<String> getAnalogRGBInput()
/*      */   {
/*  349 */     if (this.analogRGBInput == null) {
/*  350 */       this.analogRGBInput = new ArrayList();
/*      */     }
/*  352 */     return this.analogRGBInput;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  364 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  376 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  388 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  400 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  412 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  424 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  436 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  448 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public String getCameraLens()
/*      */   {
/*  460 */     return this.cameraLens;
/*      */   }
/*      */ 
/*      */   public void setCameraLens(String value)
/*      */   {
/*  472 */     this.cameraLens = value;
/*      */   }
/*      */ 
/*      */   public String getCoatingDescription()
/*      */   {
/*  484 */     return this.coatingDescription;
/*      */   }
/*      */ 
/*      */   public void setCoatingDescription(String value)
/*      */   {
/*  496 */     this.coatingDescription = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleMountings()
/*      */   {
/*  508 */     return this.compatibleMountings;
/*      */   }
/*      */ 
/*      */   public void setCompatibleMountings(String value)
/*      */   {
/*  520 */     this.compatibleMountings = value;
/*      */   }
/*      */ 
/*      */   public String getConductor()
/*      */   {
/*  532 */     return this.conductor;
/*      */   }
/*      */ 
/*      */   public void setConductor(String value)
/*      */   {
/*  544 */     this.conductor = value;
/*      */   }
/*      */ 
/*      */   public String getEnclosureFinish()
/*      */   {
/*  556 */     return this.enclosureFinish;
/*      */   }
/*      */ 
/*      */   public void setEnclosureFinish(String value)
/*      */   {
/*  568 */     this.enclosureFinish = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/*  580 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/*  592 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public String getGrilleRemoveability()
/*      */   {
/*  604 */     return this.grilleRemoveability;
/*      */   }
/*      */ 
/*      */   public void setGrilleRemoveability(String value)
/*      */   {
/*  616 */     this.grilleRemoveability = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getLoadCapacity()
/*      */   {
/*  628 */     return this.loadCapacity;
/*      */   }
/*      */ 
/*      */   public void setLoadCapacity(WeightDimension value)
/*      */   {
/*  640 */     this.loadCapacity = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMaxWeightCapacity()
/*      */   {
/*  652 */     return this.maxWeightCapacity;
/*      */   }
/*      */ 
/*      */   public void setMaxWeightCapacity(WeightDimension value)
/*      */   {
/*  664 */     this.maxWeightCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  676 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  688 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public String getMountingType()
/*      */   {
/*  700 */     return this.mountingType;
/*      */   }
/*      */ 
/*      */   public void setMountingType(String value)
/*      */   {
/*  712 */     this.mountingType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfRecordingLoops()
/*      */   {
/*  724 */     return this.numberOfRecordingLoops;
/*      */   }
/*      */ 
/*      */   public void setNumberOfRecordingLoops(BigInteger value)
/*      */   {
/*  736 */     this.numberOfRecordingLoops = value;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/*  762 */     if (this.operatingSystem == null) {
/*  763 */       this.operatingSystem = new ArrayList();
/*      */     }
/*  765 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public String getPhotoSensorSize()
/*      */   {
/*  777 */     return this.photoSensorSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoSensorSize(String value)
/*      */   {
/*  789 */     this.photoSensorSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoSensorTechnology()
/*      */   {
/*  801 */     return this.photoSensorTechnology;
/*      */   }
/*      */ 
/*      */   public void setPhotoSensorTechnology(String value)
/*      */   {
/*  813 */     this.photoSensorTechnology = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getPowerConsumption()
/*      */   {
/*  825 */     return this.powerConsumption;
/*      */   }
/*      */ 
/*      */   public void setPowerConsumption(PowerDimension value)
/*      */   {
/*  837 */     this.powerConsumption = value;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/*  849 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/*  861 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/*  873 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/*  885 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/*  897 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/*  909 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/*  921 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/*  933 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/*  945 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/*  957 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/*  969 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/*  981 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeakerGrilleMaterial()
/*      */   {
/*  993 */     return this.speakerGrilleMaterial;
/*      */   }
/*      */ 
/*      */   public void setSpeakerGrilleMaterial(String value)
/*      */   {
/* 1005 */     this.speakerGrilleMaterial = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getSpeakerMaximumInputPower()
/*      */   {
/* 1017 */     return this.speakerMaximumInputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakerMaximumInputPower(PowerDimension value)
/*      */   {
/* 1029 */     this.speakerMaximumInputPower = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferPowerTechnology()
/*      */   {
/* 1041 */     return this.subwooferPowerTechnology;
/*      */   }
/*      */ 
/*      */   public void setSubwooferPowerTechnology(String value)
/*      */   {
/* 1053 */     this.subwooferPowerTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSubwooferSpeakerDiameter()
/*      */   {
/* 1065 */     return this.subwooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1077 */     this.subwooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferSpeakerMaterial()
/*      */   {
/* 1089 */     return this.subwooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerMaterial(String value)
/*      */   {
/* 1101 */     this.subwooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getSubwooferWattage()
/*      */   {
/* 1113 */     return this.subwooferWattage;
/*      */   }
/*      */ 
/*      */   public void setSubwooferWattage(WattageDimension value)
/*      */   {
/* 1125 */     this.subwooferWattage = value;
/*      */   }
/*      */ 
/*      */   public EnergyRatingType getSurgeProtectionRating()
/*      */   {
/* 1137 */     return this.surgeProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setSurgeProtectionRating(EnergyRatingType value)
/*      */   {
/* 1149 */     this.surgeProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/* 1161 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/* 1173 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCoaxialInputs()
/*      */   {
/* 1185 */     return this.totalCoaxialInputs;
/*      */   }
/*      */ 
/*      */   public void setTotalCoaxialInputs(BigInteger value)
/*      */   {
/* 1197 */     this.totalCoaxialInputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalComponentInPorts()
/*      */   {
/* 1209 */     return this.totalComponentInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalComponentInPorts(BigInteger value)
/*      */   {
/* 1221 */     this.totalComponentInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCompositePorts()
/*      */   {
/* 1233 */     return this.totalCompositePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalCompositePorts(BigInteger value)
/*      */   {
/* 1245 */     this.totalCompositePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/* 1257 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/* 1269 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewirePorts()
/*      */   {
/* 1281 */     return this.totalFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewirePorts(BigInteger value)
/*      */   {
/* 1293 */     this.totalFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalMicrophonePorts()
/*      */   {
/* 1305 */     return this.totalMicrophonePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalMicrophonePorts(BigInteger value)
/*      */   {
/* 1317 */     this.totalMicrophonePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalPowerOutlets()
/*      */   {
/* 1329 */     return this.totalPowerOutlets;
/*      */   }
/*      */ 
/*      */   public void setTotalPowerOutlets(BigInteger value)
/*      */   {
/* 1341 */     this.totalPowerOutlets = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSubwooferOutputs()
/*      */   {
/* 1353 */     return this.totalSubwooferOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalSubwooferOutputs(BigInteger value)
/*      */   {
/* 1365 */     this.totalSubwooferOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoInPorts()
/*      */   {
/* 1377 */     return this.totalSVideoInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoInPorts(BigInteger value)
/*      */   {
/* 1389 */     this.totalSVideoInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoOutPorts()
/*      */   {
/* 1401 */     return this.totalSVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 1413 */     this.totalSVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSBPorts()
/*      */   {
/* 1425 */     return this.totalUSBPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalUSBPorts(BigInteger value)
/*      */   {
/* 1437 */     this.totalUSBPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVgaInPorts()
/*      */   {
/* 1449 */     return this.totalVgaInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVgaInPorts(BigInteger value)
/*      */   {
/* 1461 */     this.totalVgaInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVideoOutPorts()
/*      */   {
/* 1473 */     return this.totalVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVideoOutPorts(BigInteger value)
/*      */   {
/* 1485 */     this.totalVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public List<String> getTrafficFeatures()
/*      */   {
/* 1511 */     if (this.trafficFeatures == null) {
/* 1512 */       this.trafficFeatures = new ArrayList();
/*      */     }
/* 1514 */     return this.trafficFeatures;
/*      */   }
/*      */ 
/*      */   public WattageIntegerDimension getWattage()
/*      */   {
/* 1526 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageIntegerDimension value)
/*      */   {
/* 1538 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getWooferSpeakerDiameter()
/*      */   {
/* 1550 */     return this.wooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1562 */     this.wooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getWooferSpeakerMaterial()
/*      */   {
/* 1574 */     return this.wooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerMaterial(String value)
/*      */   {
/* 1586 */     this.wooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/* 1598 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/* 1610 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public List<String> getConnectorGender()
/*      */   {
/* 1636 */     if (this.connectorGender == null) {
/* 1637 */       this.connectorGender = new ArrayList();
/*      */     }
/* 1639 */     return this.connectorGender;
/*      */   }
/*      */ 
/*      */   public String getConnectorTypeUsedOnCable()
/*      */   {
/* 1651 */     return this.connectorTypeUsedOnCable;
/*      */   }
/*      */ 
/*      */   public void setConnectorTypeUsedOnCable(String value)
/*      */   {
/* 1663 */     this.connectorTypeUsedOnCable = value;
/*      */   }
/*      */ 
/*      */   public String getMountMotion()
/*      */   {
/* 1675 */     return this.mountMotion;
/*      */   }
/*      */ 
/*      */   public void setMountMotion(String value)
/*      */   {
/* 1687 */     this.mountMotion = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1699 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1711 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public PixelDimension getVideoResolution()
/*      */   {
/* 1723 */     return this.videoResolution;
/*      */   }
/*      */ 
/*      */   public void setVideoResolution(PixelDimension value)
/*      */   {
/* 1735 */     this.videoResolution = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessTechnology()
/*      */   {
/* 1761 */     if (this.wirelessTechnology == null) {
/* 1762 */       this.wirelessTechnology = new ArrayList();
/*      */     }
/* 1764 */     return this.wirelessTechnology;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1776 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1788 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MediaPlayerOrEReaderAccessory
 * JD-Core Version:    0.6.2
 */