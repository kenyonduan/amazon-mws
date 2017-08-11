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
/*     */ @XmlType(name="", propOrder={"biAmpable", "calibrationTechnology", "coolingType", "numberOfFans", "finishType", "frontPanelInputs", "numberOfDrivers", "processorBrand", "signalPassthroughTechnology", "videoShielded", "videoUpconversionTechnologies", "totalCoaxialInputs", "totalEthernetPorts", "totalPreampOutputs", "totalSubwooferOutputs", "wirelessTechnology", "wirelessType"})
/*     */ @XmlRootElement(name="ReceiverOrAmplifier")
/*     */ public class ReceiverOrAmplifier
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BiAmpable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String biAmpable;
/*     */ 
/*     */   @XmlElement(name="CalibrationTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String calibrationTechnology;
/*     */ 
/*     */   @XmlElement(name="CoolingType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String coolingType;
/*     */ 
/*     */   @XmlElement(name="NumberOfFans")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfFans;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="FrontPanelInputs")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> frontPanelInputs;
/*     */ 
/*     */   @XmlElement(name="NumberOfDrivers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfDrivers;
/*     */ 
/*     */   @XmlElement(name="ProcessorBrand")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String processorBrand;
/*     */ 
/*     */   @XmlElement(name="SignalPassthroughTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String signalPassthroughTechnology;
/*     */ 
/*     */   @XmlElement(name="VideoShielded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String videoShielded;
/*     */ 
/*     */   @XmlElement(name="VideoUpconversionTechnologies")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String videoUpconversionTechnologies;
/*     */ 
/*     */   @XmlElement(name="TotalCoaxialInputs")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalCoaxialInputs;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="TotalPreampOutputs")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalPreampOutputs;
/*     */ 
/*     */   @XmlElement(name="TotalSubwooferOutputs")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalSubwooferOutputs;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="WirelessType")
/*     */   protected String wirelessType;
/*     */ 
/*     */   public String getBiAmpable()
/*     */   {
/* 135 */     return this.biAmpable;
/*     */   }
/*     */ 
/*     */   public void setBiAmpable(String value)
/*     */   {
/* 147 */     this.biAmpable = value;
/*     */   }
/*     */ 
/*     */   public String getCalibrationTechnology()
/*     */   {
/* 159 */     return this.calibrationTechnology;
/*     */   }
/*     */ 
/*     */   public void setCalibrationTechnology(String value)
/*     */   {
/* 171 */     this.calibrationTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getCoolingType()
/*     */   {
/* 183 */     return this.coolingType;
/*     */   }
/*     */ 
/*     */   public void setCoolingType(String value)
/*     */   {
/* 195 */     this.coolingType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfFans()
/*     */   {
/* 207 */     return this.numberOfFans;
/*     */   }
/*     */ 
/*     */   public void setNumberOfFans(BigInteger value)
/*     */   {
/* 219 */     this.numberOfFans = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 231 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 243 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getFrontPanelInputs()
/*     */   {
/* 269 */     if (this.frontPanelInputs == null) {
/* 270 */       this.frontPanelInputs = new ArrayList();
/*     */     }
/* 272 */     return this.frontPanelInputs;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfDrivers()
/*     */   {
/* 284 */     return this.numberOfDrivers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfDrivers(BigInteger value)
/*     */   {
/* 296 */     this.numberOfDrivers = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorBrand()
/*     */   {
/* 308 */     return this.processorBrand;
/*     */   }
/*     */ 
/*     */   public void setProcessorBrand(String value)
/*     */   {
/* 320 */     this.processorBrand = value;
/*     */   }
/*     */ 
/*     */   public String getSignalPassthroughTechnology()
/*     */   {
/* 332 */     return this.signalPassthroughTechnology;
/*     */   }
/*     */ 
/*     */   public void setSignalPassthroughTechnology(String value)
/*     */   {
/* 344 */     this.signalPassthroughTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getVideoShielded()
/*     */   {
/* 356 */     return this.videoShielded;
/*     */   }
/*     */ 
/*     */   public void setVideoShielded(String value)
/*     */   {
/* 368 */     this.videoShielded = value;
/*     */   }
/*     */ 
/*     */   public String getVideoUpconversionTechnologies()
/*     */   {
/* 380 */     return this.videoUpconversionTechnologies;
/*     */   }
/*     */ 
/*     */   public void setVideoUpconversionTechnologies(String value)
/*     */   {
/* 392 */     this.videoUpconversionTechnologies = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCoaxialInputs()
/*     */   {
/* 404 */     return this.totalCoaxialInputs;
/*     */   }
/*     */ 
/*     */   public void setTotalCoaxialInputs(BigInteger value)
/*     */   {
/* 416 */     this.totalCoaxialInputs = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 428 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 440 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalPreampOutputs()
/*     */   {
/* 452 */     return this.totalPreampOutputs;
/*     */   }
/*     */ 
/*     */   public void setTotalPreampOutputs(BigInteger value)
/*     */   {
/* 464 */     this.totalPreampOutputs = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalSubwooferOutputs()
/*     */   {
/* 476 */     return this.totalSubwooferOutputs;
/*     */   }
/*     */ 
/*     */   public void setTotalSubwooferOutputs(BigInteger value)
/*     */   {
/* 488 */     this.totalSubwooferOutputs = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 514 */     if (this.wirelessTechnology == null) {
/* 515 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 517 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public String getWirelessType()
/*     */   {
/* 529 */     return this.wirelessType;
/*     */   }
/*     */ 
/*     */   public void setWirelessType(String value)
/*     */   {
/* 541 */     this.wirelessType = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ReceiverOrAmplifier
 * JD-Core Version:    0.6.2
 */