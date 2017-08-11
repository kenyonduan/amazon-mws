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
/*     */ @XmlType(name="", propOrder={"builtInMedia", "hardDriveSize", "powerSource", "processorBrand", "ramSize", "numberOfSpeakers", "internetApplications", "totalCoaxialInputs", "totalHdmiPorts", "wirelessTechnology"})
/*     */ @XmlRootElement(name="DigitalVideoRecorder")
/*     */ public class DigitalVideoRecorder
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BuiltInMedia")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> builtInMedia;
/*     */ 
/*     */   @XmlElement(name="HardDriveSize")
/*     */   protected MemorySizeDimension hardDriveSize;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="ProcessorBrand")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String processorBrand;
/*     */ 
/*     */   @XmlElement(name="RAMSize")
/*     */   protected MemorySizeDimension ramSize;
/*     */ 
/*     */   @XmlElement(name="NumberOfSpeakers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfSpeakers;
/*     */ 
/*     */   @XmlElement(name="InternetApplications")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> internetApplications;
/*     */ 
/*     */   @XmlElement(name="TotalCoaxialInputs")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalCoaxialInputs;
/*     */ 
/*     */   @XmlElement(name="TotalHdmiPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalHdmiPorts;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   public List<String> getBuiltInMedia()
/*     */   {
/* 113 */     if (this.builtInMedia == null) {
/* 114 */       this.builtInMedia = new ArrayList();
/*     */     }
/* 116 */     return this.builtInMedia;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getHardDriveSize()
/*     */   {
/* 128 */     return this.hardDriveSize;
/*     */   }
/*     */ 
/*     */   public void setHardDriveSize(MemorySizeDimension value)
/*     */   {
/* 140 */     this.hardDriveSize = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 152 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 164 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorBrand()
/*     */   {
/* 176 */     return this.processorBrand;
/*     */   }
/*     */ 
/*     */   public void setProcessorBrand(String value)
/*     */   {
/* 188 */     this.processorBrand = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getRAMSize()
/*     */   {
/* 200 */     return this.ramSize;
/*     */   }
/*     */ 
/*     */   public void setRAMSize(MemorySizeDimension value)
/*     */   {
/* 212 */     this.ramSize = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfSpeakers()
/*     */   {
/* 224 */     return this.numberOfSpeakers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSpeakers(BigInteger value)
/*     */   {
/* 236 */     this.numberOfSpeakers = value;
/*     */   }
/*     */ 
/*     */   public List<String> getInternetApplications()
/*     */   {
/* 262 */     if (this.internetApplications == null) {
/* 263 */       this.internetApplications = new ArrayList();
/*     */     }
/* 265 */     return this.internetApplications;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCoaxialInputs()
/*     */   {
/* 277 */     return this.totalCoaxialInputs;
/*     */   }
/*     */ 
/*     */   public void setTotalCoaxialInputs(BigInteger value)
/*     */   {
/* 289 */     this.totalCoaxialInputs = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalHdmiPorts()
/*     */   {
/* 301 */     return this.totalHdmiPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalHdmiPorts(BigInteger value)
/*     */   {
/* 313 */     this.totalHdmiPorts = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 339 */     if (this.wirelessTechnology == null) {
/* 340 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 342 */     return this.wirelessTechnology;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DigitalVideoRecorder
 * JD-Core Version:    0.6.2
 */