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
/*     */ @XmlType(name="", propOrder={"computerMemoryType", "ramSize", "powerSource", "screenResolution", "colorScreen", "operatingSystem", "wirelessType", "hardDriveSize", "softwareIncluded", "memorySlotsAvailable", "processorBrand", "processorSpeed", "processorType", "processorCount", "romSize", "screenSize", "additionalFeatures", "pdaBaseModel"})
/*     */ @XmlRootElement(name="PDA")
/*     */ public class PDA
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ComputerMemoryType", required=true)
/*     */   protected List<String> computerMemoryType;
/*     */ 
/*     */   @XmlElement(name="RAMSize", required=true)
/*     */   protected MemorySizeDimension ramSize;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="ScreenResolution", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String screenResolution;
/*     */ 
/*     */   @XmlElement(name="ColorScreen")
/*     */   protected boolean colorScreen;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="WirelessType")
/*     */   protected List<String> wirelessType;
/*     */ 
/*     */   @XmlElement(name="HardDriveSize")
/*     */   protected MemorySizeDimension hardDriveSize;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="ProcessorBrand")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String processorBrand;
/*     */ 
/*     */   @XmlElement(name="ProcessorSpeed")
/*     */   protected FrequencyDimension processorSpeed;
/*     */ 
/*     */   @XmlElement(name="ProcessorType")
/*     */   protected String processorType;
/*     */ 
/*     */   @XmlElement(name="ProcessorCount")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger processorCount;
/*     */ 
/*     */   @XmlElement(name="ROMSize")
/*     */   protected MemorySizeDimension romSize;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="PDABaseModel")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> pdaBaseModel;
/*     */ 
/*     */   public List<String> getComputerMemoryType()
/*     */   {
/* 146 */     if (this.computerMemoryType == null) {
/* 147 */       this.computerMemoryType = new ArrayList();
/*     */     }
/* 149 */     return this.computerMemoryType;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getRAMSize()
/*     */   {
/* 161 */     return this.ramSize;
/*     */   }
/*     */ 
/*     */   public void setRAMSize(MemorySizeDimension value)
/*     */   {
/* 173 */     this.ramSize = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 185 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 197 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getScreenResolution()
/*     */   {
/* 209 */     return this.screenResolution;
/*     */   }
/*     */ 
/*     */   public void setScreenResolution(String value)
/*     */   {
/* 221 */     this.screenResolution = value;
/*     */   }
/*     */ 
/*     */   public boolean isColorScreen()
/*     */   {
/* 229 */     return this.colorScreen;
/*     */   }
/*     */ 
/*     */   public void setColorScreen(boolean value)
/*     */   {
/* 237 */     this.colorScreen = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 263 */     if (this.operatingSystem == null) {
/* 264 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 266 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessType()
/*     */   {
/* 292 */     if (this.wirelessType == null) {
/* 293 */       this.wirelessType = new ArrayList();
/*     */     }
/* 295 */     return this.wirelessType;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getHardDriveSize()
/*     */   {
/* 307 */     return this.hardDriveSize;
/*     */   }
/*     */ 
/*     */   public void setHardDriveSize(MemorySizeDimension value)
/*     */   {
/* 319 */     this.hardDriveSize = value;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 331 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 343 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 355 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 367 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorBrand()
/*     */   {
/* 379 */     return this.processorBrand;
/*     */   }
/*     */ 
/*     */   public void setProcessorBrand(String value)
/*     */   {
/* 391 */     this.processorBrand = value;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getProcessorSpeed()
/*     */   {
/* 403 */     return this.processorSpeed;
/*     */   }
/*     */ 
/*     */   public void setProcessorSpeed(FrequencyDimension value)
/*     */   {
/* 415 */     this.processorSpeed = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorType()
/*     */   {
/* 427 */     return this.processorType;
/*     */   }
/*     */ 
/*     */   public void setProcessorType(String value)
/*     */   {
/* 439 */     this.processorType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getProcessorCount()
/*     */   {
/* 451 */     return this.processorCount;
/*     */   }
/*     */ 
/*     */   public void setProcessorCount(BigInteger value)
/*     */   {
/* 463 */     this.processorCount = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getROMSize()
/*     */   {
/* 475 */     return this.romSize;
/*     */   }
/*     */ 
/*     */   public void setROMSize(MemorySizeDimension value)
/*     */   {
/* 487 */     this.romSize = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 499 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 511 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 523 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 535 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public List<String> getPDABaseModel()
/*     */   {
/* 561 */     if (this.pdaBaseModel == null) {
/* 562 */       this.pdaBaseModel = new ArrayList();
/*     */     }
/* 564 */     return this.pdaBaseModel;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PDA
 * JD-Core Version:    0.6.2
 */