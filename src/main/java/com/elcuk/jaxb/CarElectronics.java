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
/*      */ @XmlType(name="", propOrder={"amplifierType", "batteryCellType", "batteryChargeCycles", "batteryPower", "bluRayRegion", "boxContents", "cableLength", "dvdRegion", "finishType", "grilleRemoveability", "internetApplications", "memorySlotsAvailable", "midRangeSpeakerDiameter", "midRangeSpeakerMaterial", "mountingType", "numberOfSpeakers", "operatingSystem", "powerPlugType", "powerSource", "remoteControlDescription", "removableMemory", "screenFinish", "screenSize", "shape", "softwareIncluded", "speakerGrilleMaterial", "speakerMaximumInputPower", "subwooferPowerTechnology", "subwooferSpeakerDiameter", "subwooferSpeakerMaterial", "subwooferWattage", "totalCoaxialInputs", "totalComponentInPorts", "totalDVIPorts", "totalEthernetPorts", "totalFirewirePorts", "totalHdmiPorts", "totalSubwooferOutputs", "totalSVideoInPorts", "totalSVideoOutPorts", "totalUSBPorts", "totalVgaInPorts", "totalVideoOutPorts", "tweeterConeMaterialType", "tweeterDriverDiameter", "wattage", "wooferSpeakerDiameter", "wooferSpeakerMaterial", "efficiency"})
/*      */ @XmlRootElement(name="CarElectronics")
/*      */ public class CarElectronics
/*      */ {
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
/*      */   @XmlElement(name="MidRangeSpeakerDiameter")
/*      */   protected LengthDimension midRangeSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="MidRangeSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String midRangeSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="MountingType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountingType;
/*      */ 
/*      */   @XmlElement(name="NumberOfSpeakers")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfSpeakers;
/*      */ 
/*      */   @XmlElement(name="OperatingSystem")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> operatingSystem;
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
/*      */   public String getAmplifierType()
/*      */   {
/*  283 */     return this.amplifierType;
/*      */   }
/*      */ 
/*      */   public void setAmplifierType(String value)
/*      */   {
/*  295 */     this.amplifierType = value;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  307 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  319 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  331 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  343 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  355 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  367 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public BluRayRegionType getBluRayRegion()
/*      */   {
/*  379 */     return this.bluRayRegion;
/*      */   }
/*      */ 
/*      */   public void setBluRayRegion(BluRayRegionType value)
/*      */   {
/*  391 */     this.bluRayRegion = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  403 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  415 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/*  427 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/*  439 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getDVDRegion()
/*      */   {
/*  451 */     return this.dvdRegion;
/*      */   }
/*      */ 
/*      */   public void setDVDRegion(BigInteger value)
/*      */   {
/*  463 */     this.dvdRegion = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/*  475 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/*  487 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public String getGrilleRemoveability()
/*      */   {
/*  499 */     return this.grilleRemoveability;
/*      */   }
/*      */ 
/*      */   public void setGrilleRemoveability(String value)
/*      */   {
/*  511 */     this.grilleRemoveability = value;
/*      */   }
/*      */ 
/*      */   public List<String> getInternetApplications()
/*      */   {
/*  537 */     if (this.internetApplications == null) {
/*  538 */       this.internetApplications = new ArrayList();
/*      */     }
/*  540 */     return this.internetApplications;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  552 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  564 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMidRangeSpeakerDiameter()
/*      */   {
/*  576 */     return this.midRangeSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setMidRangeSpeakerDiameter(LengthDimension value)
/*      */   {
/*  588 */     this.midRangeSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getMidRangeSpeakerMaterial()
/*      */   {
/*  600 */     return this.midRangeSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setMidRangeSpeakerMaterial(String value)
/*      */   {
/*  612 */     this.midRangeSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public String getMountingType()
/*      */   {
/*  624 */     return this.mountingType;
/*      */   }
/*      */ 
/*      */   public void setMountingType(String value)
/*      */   {
/*  636 */     this.mountingType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSpeakers()
/*      */   {
/*  648 */     return this.numberOfSpeakers;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSpeakers(BigInteger value)
/*      */   {
/*  660 */     this.numberOfSpeakers = value;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/*  686 */     if (this.operatingSystem == null) {
/*  687 */       this.operatingSystem = new ArrayList();
/*      */     }
/*  689 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/*  701 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/*  713 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  725 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  737 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/*  749 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/*  761 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/*  773 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/*  785 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public String getScreenFinish()
/*      */   {
/*  797 */     return this.screenFinish;
/*      */   }
/*      */ 
/*      */   public void setScreenFinish(String value)
/*      */   {
/*  809 */     this.screenFinish = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/*  821 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/*  833 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/*  845 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/*  857 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/*  869 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/*  881 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeakerGrilleMaterial()
/*      */   {
/*  893 */     return this.speakerGrilleMaterial;
/*      */   }
/*      */ 
/*      */   public void setSpeakerGrilleMaterial(String value)
/*      */   {
/*  905 */     this.speakerGrilleMaterial = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getSpeakerMaximumInputPower()
/*      */   {
/*  917 */     return this.speakerMaximumInputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakerMaximumInputPower(PowerDimension value)
/*      */   {
/*  929 */     this.speakerMaximumInputPower = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferPowerTechnology()
/*      */   {
/*  941 */     return this.subwooferPowerTechnology;
/*      */   }
/*      */ 
/*      */   public void setSubwooferPowerTechnology(String value)
/*      */   {
/*  953 */     this.subwooferPowerTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSubwooferSpeakerDiameter()
/*      */   {
/*  965 */     return this.subwooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*      */   {
/*  977 */     this.subwooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferSpeakerMaterial()
/*      */   {
/*  989 */     return this.subwooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerMaterial(String value)
/*      */   {
/* 1001 */     this.subwooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getSubwooferWattage()
/*      */   {
/* 1013 */     return this.subwooferWattage;
/*      */   }
/*      */ 
/*      */   public void setSubwooferWattage(WattageDimension value)
/*      */   {
/* 1025 */     this.subwooferWattage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCoaxialInputs()
/*      */   {
/* 1037 */     return this.totalCoaxialInputs;
/*      */   }
/*      */ 
/*      */   public void setTotalCoaxialInputs(BigInteger value)
/*      */   {
/* 1049 */     this.totalCoaxialInputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalComponentInPorts()
/*      */   {
/* 1061 */     return this.totalComponentInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalComponentInPorts(BigInteger value)
/*      */   {
/* 1073 */     this.totalComponentInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/* 1085 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/* 1097 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalEthernetPorts()
/*      */   {
/* 1109 */     return this.totalEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalEthernetPorts(BigInteger value)
/*      */   {
/* 1121 */     this.totalEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewirePorts()
/*      */   {
/* 1133 */     return this.totalFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewirePorts(BigInteger value)
/*      */   {
/* 1145 */     this.totalFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/* 1157 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/* 1169 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSubwooferOutputs()
/*      */   {
/* 1181 */     return this.totalSubwooferOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalSubwooferOutputs(BigInteger value)
/*      */   {
/* 1193 */     this.totalSubwooferOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoInPorts()
/*      */   {
/* 1205 */     return this.totalSVideoInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoInPorts(BigInteger value)
/*      */   {
/* 1217 */     this.totalSVideoInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoOutPorts()
/*      */   {
/* 1229 */     return this.totalSVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 1241 */     this.totalSVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSBPorts()
/*      */   {
/* 1253 */     return this.totalUSBPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalUSBPorts(BigInteger value)
/*      */   {
/* 1265 */     this.totalUSBPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVgaInPorts()
/*      */   {
/* 1277 */     return this.totalVgaInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVgaInPorts(BigInteger value)
/*      */   {
/* 1289 */     this.totalVgaInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVideoOutPorts()
/*      */   {
/* 1301 */     return this.totalVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVideoOutPorts(BigInteger value)
/*      */   {
/* 1313 */     this.totalVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public String getTweeterConeMaterialType()
/*      */   {
/* 1325 */     return this.tweeterConeMaterialType;
/*      */   }
/*      */ 
/*      */   public void setTweeterConeMaterialType(String value)
/*      */   {
/* 1337 */     this.tweeterConeMaterialType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getTweeterDriverDiameter()
/*      */   {
/* 1349 */     return this.tweeterDriverDiameter;
/*      */   }
/*      */ 
/*      */   public void setTweeterDriverDiameter(LengthDimension value)
/*      */   {
/* 1361 */     this.tweeterDriverDiameter = value;
/*      */   }
/*      */ 
/*      */   public WattageIntegerDimension getWattage()
/*      */   {
/* 1373 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageIntegerDimension value)
/*      */   {
/* 1385 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getWooferSpeakerDiameter()
/*      */   {
/* 1397 */     return this.wooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1409 */     this.wooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getWooferSpeakerMaterial()
/*      */   {
/* 1421 */     return this.wooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerMaterial(String value)
/*      */   {
/* 1433 */     this.wooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1445 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1457 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CarElectronics
 * JD-Core Version:    0.6.2
 */