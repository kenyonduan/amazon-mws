/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"colorScreen", "hardDriveSize", "memorySlotsAvailable", "operatingSystem", "powerSource", "processorType", "processorSpeed", "ramSize", "screenSize", "screenResolution", "softwareIncluded", "wirelessTechnology"})
/*     */ @XmlRootElement(name="HandheldOrPDA")
/*     */ public class HandheldOrPDA
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ColorScreen")
/*     */   protected Boolean colorScreen;
/*     */ 
/*     */   @XmlElement(name="HardDriveSize")
/*     */   protected MemorySizeDimension hardDriveSize;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="ProcessorType")
/*     */   protected String processorType;
/*     */ 
/*     */   @XmlElement(name="ProcessorSpeed")
/*     */   protected FrequencyDimension processorSpeed;
/*     */ 
/*     */   @XmlElement(name="RAMSize")
/*     */   protected MemorySizeDimension ramSize;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="ScreenResolution")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String screenResolution;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   public Boolean isColorScreen()
/*     */   {
/* 103 */     return this.colorScreen;
/*     */   }
/*     */ 
/*     */   public void setColorScreen(Boolean value)
/*     */   {
/* 115 */     this.colorScreen = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getHardDriveSize()
/*     */   {
/* 127 */     return this.hardDriveSize;
/*     */   }
/*     */ 
/*     */   public void setHardDriveSize(MemorySizeDimension value)
/*     */   {
/* 139 */     this.hardDriveSize = value;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 151 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 163 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 189 */     if (this.operatingSystem == null) {
/* 190 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 192 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 204 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 216 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorType()
/*     */   {
/* 228 */     return this.processorType;
/*     */   }
/*     */ 
/*     */   public void setProcessorType(String value)
/*     */   {
/* 240 */     this.processorType = value;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getProcessorSpeed()
/*     */   {
/* 252 */     return this.processorSpeed;
/*     */   }
/*     */ 
/*     */   public void setProcessorSpeed(FrequencyDimension value)
/*     */   {
/* 264 */     this.processorSpeed = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getRAMSize()
/*     */   {
/* 276 */     return this.ramSize;
/*     */   }
/*     */ 
/*     */   public void setRAMSize(MemorySizeDimension value)
/*     */   {
/* 288 */     this.ramSize = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 300 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 312 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public String getScreenResolution()
/*     */   {
/* 324 */     return this.screenResolution;
/*     */   }
/*     */ 
/*     */   public void setScreenResolution(String value)
/*     */   {
/* 336 */     this.screenResolution = value;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 348 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 360 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 386 */     if (this.wirelessTechnology == null) {
/* 387 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 389 */     return this.wirelessTechnology;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HandheldOrPDA
 * JD-Core Version:    0.6.2
 */