/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cableLength", "colorScreen", "durationOfMapService", "operatingSystem", "videoProcessor", "efficiency", "finishType", "internetApplications", "memorySlotsAvailable", "powerPlugType", "powerSource", "processorBrand", "screenSize", "remoteControlDescription", "removableMemory", "screenResolution", "subscriptionTermName", "trafficFeatures", "softwareIncluded", "totalEthernetPorts", "totalFirewirePorts", "totalHdmiPorts", "totalSVideoOutPorts", "totalUSBPorts", "waypointsType", "wirelessTechnology"})
/*     */ @XmlRootElement(name="GPSOrNavigationSystem")
/*     */ public class GPSOrNavigationSystem
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
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="ColorScreen")
/*     */   protected Boolean colorScreen;
/*     */ 
/*     */   @XmlElement(name="DurationOfMapService")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String durationOfMapService;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="VideoProcessor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String videoProcessor;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="InternetApplications")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> internetApplications;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="ProcessorBrand")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String processorBrand;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="RemoteControlDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String remoteControlDescription;
/*     */ 
/*     */   @XmlElement(name="RemovableMemory")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String removableMemory;
/*     */ 
/*     */   @XmlElement(name="ScreenResolution")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String screenResolution;
/*     */ 
/*     */   @XmlElement(name="SubscriptionTermName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String subscriptionTermName;
/*     */ 
/*     */   @XmlElement(name="TrafficFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> trafficFeatures;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="TotalFirewirePorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalFirewirePorts;
/*     */ 
/*     */   @XmlElement(name="TotalHdmiPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalHdmiPorts;
/*     */ 
/*     */   @XmlElement(name="TotalSVideoOutPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalSVideoOutPorts;
/*     */ 
/*     */   @XmlElement(name="TotalUSBPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalUSBPorts;
/*     */ 
/*     */   @XmlElement(name="WaypointsType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String waypointsType;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 195 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 207 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 219 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 231 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 243 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 255 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 267 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 279 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/* 291 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/* 303 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public Boolean isColorScreen()
/*     */   {
/* 315 */     return this.colorScreen;
/*     */   }
/*     */ 
/*     */   public void setColorScreen(Boolean value)
/*     */   {
/* 327 */     this.colorScreen = value;
/*     */   }
/*     */ 
/*     */   public String getDurationOfMapService()
/*     */   {
/* 339 */     return this.durationOfMapService;
/*     */   }
/*     */ 
/*     */   public void setDurationOfMapService(String value)
/*     */   {
/* 351 */     this.durationOfMapService = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 377 */     if (this.operatingSystem == null) {
/* 378 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 380 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getVideoProcessor()
/*     */   {
/* 392 */     return this.videoProcessor;
/*     */   }
/*     */ 
/*     */   public void setVideoProcessor(String value)
/*     */   {
/* 404 */     this.videoProcessor = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 416 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 428 */     this.efficiency = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 440 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 452 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getInternetApplications()
/*     */   {
/* 478 */     if (this.internetApplications == null) {
/* 479 */       this.internetApplications = new ArrayList();
/*     */     }
/* 481 */     return this.internetApplications;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 493 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 505 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 517 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 529 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 541 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 553 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorBrand()
/*     */   {
/* 565 */     return this.processorBrand;
/*     */   }
/*     */ 
/*     */   public void setProcessorBrand(String value)
/*     */   {
/* 577 */     this.processorBrand = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 589 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 601 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public String getRemoteControlDescription()
/*     */   {
/* 613 */     return this.remoteControlDescription;
/*     */   }
/*     */ 
/*     */   public void setRemoteControlDescription(String value)
/*     */   {
/* 625 */     this.remoteControlDescription = value;
/*     */   }
/*     */ 
/*     */   public String getRemovableMemory()
/*     */   {
/* 637 */     return this.removableMemory;
/*     */   }
/*     */ 
/*     */   public void setRemovableMemory(String value)
/*     */   {
/* 649 */     this.removableMemory = value;
/*     */   }
/*     */ 
/*     */   public String getScreenResolution()
/*     */   {
/* 661 */     return this.screenResolution;
/*     */   }
/*     */ 
/*     */   public void setScreenResolution(String value)
/*     */   {
/* 673 */     this.screenResolution = value;
/*     */   }
/*     */ 
/*     */   public String getSubscriptionTermName()
/*     */   {
/* 685 */     return this.subscriptionTermName;
/*     */   }
/*     */ 
/*     */   public void setSubscriptionTermName(String value)
/*     */   {
/* 697 */     this.subscriptionTermName = value;
/*     */   }
/*     */ 
/*     */   public List<String> getTrafficFeatures()
/*     */   {
/* 723 */     if (this.trafficFeatures == null) {
/* 724 */       this.trafficFeatures = new ArrayList();
/*     */     }
/* 726 */     return this.trafficFeatures;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 738 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 750 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 762 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 774 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFirewirePorts()
/*     */   {
/* 786 */     return this.totalFirewirePorts;
/*     */   }
/*     */ 
/*     */   public void setTotalFirewirePorts(BigInteger value)
/*     */   {
/* 798 */     this.totalFirewirePorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalHdmiPorts()
/*     */   {
/* 810 */     return this.totalHdmiPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalHdmiPorts(BigInteger value)
/*     */   {
/* 822 */     this.totalHdmiPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalSVideoOutPorts()
/*     */   {
/* 834 */     return this.totalSVideoOutPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalSVideoOutPorts(BigInteger value)
/*     */   {
/* 846 */     this.totalSVideoOutPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalUSBPorts()
/*     */   {
/* 858 */     return this.totalUSBPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalUSBPorts(BigInteger value)
/*     */   {
/* 870 */     this.totalUSBPorts = value;
/*     */   }
/*     */ 
/*     */   public String getWaypointsType()
/*     */   {
/* 882 */     return this.waypointsType;
/*     */   }
/*     */ 
/*     */   public void setWaypointsType(String value)
/*     */   {
/* 894 */     this.waypointsType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 920 */     if (this.wirelessTechnology == null) {
/* 921 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 923 */     return this.wirelessTechnology;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.GPSOrNavigationSystem
 * JD-Core Version:    0.6.2
 */