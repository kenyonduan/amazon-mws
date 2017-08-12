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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "effectiveStillResolution", "finishType", "internetApplications", "memorySlotsAvailable", "numberOfHandsets", "operatingSystem", "parentalControlTechnology", "powerConsumption", "powerPlugType", "powerSource", "processorBrand", "processorSpeed", "ramSize", "removableMemory", "screenSize", "softwareIncluded", "telephoneType", "threeDTechnology", "totalEthernetPorts", "totalMicrophonePorts", "videoEncoding", "efficiency"})
/*     */ @XmlRootElement(name="Phone")
/*     */ public class Phone
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
/*     */   @XmlElement(name="EffectiveStillResolution")
/*     */   protected ResolutionDimension effectiveStillResolution;
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
/*     */   @XmlElement(name="NumberOfHandsets")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfHandsets;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="ParentalControlTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String parentalControlTechnology;
/*     */ 
/*     */   @XmlElement(name="PowerConsumption")
/*     */   protected PowerDimension powerConsumption;
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
/*     */   @XmlElement(name="ProcessorSpeed")
/*     */   protected FrequencyDimension processorSpeed;
/*     */ 
/*     */   @XmlElement(name="RAMSize")
/*     */   protected MemorySizeDimension ramSize;
/*     */ 
/*     */   @XmlElement(name="RemovableMemory")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String removableMemory;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="TelephoneType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String telephoneType;
/*     */ 
/*     */   @XmlElement(name="ThreeDTechnology")
/*     */   protected ThreeDTechnologyValues threeDTechnology;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="TotalMicrophonePorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalMicrophonePorts;
/*     */ 
/*     */   @XmlElement(name="VideoEncoding")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String videoEncoding;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 172 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 184 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 196 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 208 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 220 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 232 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 244 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 256 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public ResolutionDimension getEffectiveStillResolution()
/*     */   {
/* 268 */     return this.effectiveStillResolution;
/*     */   }
/*     */ 
/*     */   public void setEffectiveStillResolution(ResolutionDimension value)
/*     */   {
/* 280 */     this.effectiveStillResolution = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 292 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 304 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getInternetApplications()
/*     */   {
/* 330 */     if (this.internetApplications == null) {
/* 331 */       this.internetApplications = new ArrayList();
/*     */     }
/* 333 */     return this.internetApplications;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 345 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 357 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfHandsets()
/*     */   {
/* 369 */     return this.numberOfHandsets;
/*     */   }
/*     */ 
/*     */   public void setNumberOfHandsets(BigInteger value)
/*     */   {
/* 381 */     this.numberOfHandsets = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 407 */     if (this.operatingSystem == null) {
/* 408 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 410 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getParentalControlTechnology()
/*     */   {
/* 422 */     return this.parentalControlTechnology;
/*     */   }
/*     */ 
/*     */   public void setParentalControlTechnology(String value)
/*     */   {
/* 434 */     this.parentalControlTechnology = value;
/*     */   }
/*     */ 
/*     */   public PowerDimension getPowerConsumption()
/*     */   {
/* 446 */     return this.powerConsumption;
/*     */   }
/*     */ 
/*     */   public void setPowerConsumption(PowerDimension value)
/*     */   {
/* 458 */     this.powerConsumption = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 470 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 482 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 494 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 506 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorBrand()
/*     */   {
/* 518 */     return this.processorBrand;
/*     */   }
/*     */ 
/*     */   public void setProcessorBrand(String value)
/*     */   {
/* 530 */     this.processorBrand = value;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getProcessorSpeed()
/*     */   {
/* 542 */     return this.processorSpeed;
/*     */   }
/*     */ 
/*     */   public void setProcessorSpeed(FrequencyDimension value)
/*     */   {
/* 554 */     this.processorSpeed = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getRAMSize()
/*     */   {
/* 566 */     return this.ramSize;
/*     */   }
/*     */ 
/*     */   public void setRAMSize(MemorySizeDimension value)
/*     */   {
/* 578 */     this.ramSize = value;
/*     */   }
/*     */ 
/*     */   public String getRemovableMemory()
/*     */   {
/* 590 */     return this.removableMemory;
/*     */   }
/*     */ 
/*     */   public void setRemovableMemory(String value)
/*     */   {
/* 602 */     this.removableMemory = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 614 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 626 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 638 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 650 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public String getTelephoneType()
/*     */   {
/* 662 */     return this.telephoneType;
/*     */   }
/*     */ 
/*     */   public void setTelephoneType(String value)
/*     */   {
/* 674 */     this.telephoneType = value;
/*     */   }
/*     */ 
/*     */   public ThreeDTechnologyValues getThreeDTechnology()
/*     */   {
/* 686 */     return this.threeDTechnology;
/*     */   }
/*     */ 
/*     */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*     */   {
/* 698 */     this.threeDTechnology = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 710 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 722 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalMicrophonePorts()
/*     */   {
/* 734 */     return this.totalMicrophonePorts;
/*     */   }
/*     */ 
/*     */   public void setTotalMicrophonePorts(BigInteger value)
/*     */   {
/* 746 */     this.totalMicrophonePorts = value;
/*     */   }
/*     */ 
/*     */   public String getVideoEncoding()
/*     */   {
/* 758 */     return this.videoEncoding;
/*     */   }
/*     */ 
/*     */   public void setVideoEncoding(String value)
/*     */   {
/* 770 */     this.videoEncoding = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 782 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 794 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Phone
 * JD-Core Version:    0.6.2
 */