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
/*     */ @XmlType(name="", propOrder={"hardDriveSize", "hardDriveInterface", "computerMemoryType", "ramSize", "powerSource", "processorBrand", "processorSpeed", "processorType", "processorCount", "operatingSystem", "hardwarePlatform", "wirelessType", "additionalDrives", "softwareIncluded", "memorySlotsAvailable", "screenResolution", "screenSize", "uRackSize", "graphicsCard", "additionalFeatures"})
/*     */ @XmlRootElement(name="PC")
/*     */ public class PC
/*     */ {
/*     */ 
/*     */   @XmlElement(name="HardDriveSize", required=true)
/*     */   protected List<MemorySizeDimension> hardDriveSize;
/*     */ 
/*     */   @XmlElement(name="HardDriveInterface", required=true)
/*     */   protected List<HardDriveInterfaceTypeValues> hardDriveInterface;
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
/*     */   @XmlElement(name="ProcessorBrand", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String processorBrand;
/*     */ 
/*     */   @XmlElement(name="ProcessorSpeed", required=true)
/*     */   protected FrequencyDimension processorSpeed;
/*     */ 
/*     */   @XmlElement(name="ProcessorType", required=true)
/*     */   protected String processorType;
/*     */ 
/*     */   @XmlElement(name="ProcessorCount", required=true)
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger processorCount;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="HardwarePlatform", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String hardwarePlatform;
/*     */ 
/*     */   @XmlElement(name="WirelessType")
/*     */   protected List<String> wirelessType;
/*     */ 
/*     */   @XmlElement(name="AdditionalDrives")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> additionalDrives;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="ScreenResolution")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String screenResolution;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="U-RackSize")
/*     */   protected Integer uRackSize;
/*     */ 
/*     */   @XmlElement(name="GraphicsCard")
/*     */   protected List<GraphicsCard> graphicsCard;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   public List<MemorySizeDimension> getHardDriveSize()
/*     */   {
/* 162 */     if (this.hardDriveSize == null) {
/* 163 */       this.hardDriveSize = new ArrayList();
/*     */     }
/* 165 */     return this.hardDriveSize;
/*     */   }
/*     */ 
/*     */   public List<HardDriveInterfaceTypeValues> getHardDriveInterface()
/*     */   {
/* 191 */     if (this.hardDriveInterface == null) {
/* 192 */       this.hardDriveInterface = new ArrayList();
/*     */     }
/* 194 */     return this.hardDriveInterface;
/*     */   }
/*     */ 
/*     */   public List<String> getComputerMemoryType()
/*     */   {
/* 220 */     if (this.computerMemoryType == null) {
/* 221 */       this.computerMemoryType = new ArrayList();
/*     */     }
/* 223 */     return this.computerMemoryType;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getRAMSize()
/*     */   {
/* 235 */     return this.ramSize;
/*     */   }
/*     */ 
/*     */   public void setRAMSize(MemorySizeDimension value)
/*     */   {
/* 247 */     this.ramSize = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 259 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 271 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorBrand()
/*     */   {
/* 283 */     return this.processorBrand;
/*     */   }
/*     */ 
/*     */   public void setProcessorBrand(String value)
/*     */   {
/* 295 */     this.processorBrand = value;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getProcessorSpeed()
/*     */   {
/* 307 */     return this.processorSpeed;
/*     */   }
/*     */ 
/*     */   public void setProcessorSpeed(FrequencyDimension value)
/*     */   {
/* 319 */     this.processorSpeed = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorType()
/*     */   {
/* 331 */     return this.processorType;
/*     */   }
/*     */ 
/*     */   public void setProcessorType(String value)
/*     */   {
/* 343 */     this.processorType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getProcessorCount()
/*     */   {
/* 355 */     return this.processorCount;
/*     */   }
/*     */ 
/*     */   public void setProcessorCount(BigInteger value)
/*     */   {
/* 367 */     this.processorCount = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 393 */     if (this.operatingSystem == null) {
/* 394 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 396 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getHardwarePlatform()
/*     */   {
/* 408 */     return this.hardwarePlatform;
/*     */   }
/*     */ 
/*     */   public void setHardwarePlatform(String value)
/*     */   {
/* 420 */     this.hardwarePlatform = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessType()
/*     */   {
/* 446 */     if (this.wirelessType == null) {
/* 447 */       this.wirelessType = new ArrayList();
/*     */     }
/* 449 */     return this.wirelessType;
/*     */   }
/*     */ 
/*     */   public List<String> getAdditionalDrives()
/*     */   {
/* 475 */     if (this.additionalDrives == null) {
/* 476 */       this.additionalDrives = new ArrayList();
/*     */     }
/* 478 */     return this.additionalDrives;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 490 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 502 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 514 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 526 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public String getScreenResolution()
/*     */   {
/* 538 */     return this.screenResolution;
/*     */   }
/*     */ 
/*     */   public void setScreenResolution(String value)
/*     */   {
/* 550 */     this.screenResolution = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 562 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 574 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public Integer getURackSize()
/*     */   {
/* 586 */     return this.uRackSize;
/*     */   }
/*     */ 
/*     */   public void setURackSize(Integer value)
/*     */   {
/* 598 */     this.uRackSize = value;
/*     */   }
/*     */ 
/*     */   public List<GraphicsCard> getGraphicsCard()
/*     */   {
/* 624 */     if (this.graphicsCard == null) {
/* 625 */       this.graphicsCard = new ArrayList();
/*     */     }
/* 627 */     return this.graphicsCard;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 639 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 651 */     this.additionalFeatures = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PC
 * JD-Core Version:    0.6.2
 */