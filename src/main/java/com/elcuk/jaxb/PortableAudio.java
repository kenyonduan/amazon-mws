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
/*     */ @XmlType(name="", propOrder={"audioEncoding", "language", "cameraDescription", "analogRGBInput", "efficiency", "operatingSystem", "powerSource", "sVideoInputType", "screenSize", "maximumWattage", "totalCoaxialInputs", "totalEthernetPorts", "totalSVideoInPorts", "videoEncoding", "waterResistantDepth", "waterResistantLevel", "wirelessTechnology", "wirelessType"})
/*     */ @XmlRootElement(name="PortableAudio")
/*     */ public class PortableAudio
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AudioEncoding")
/*     */   protected List<String> audioEncoding;
/*     */ 
/*     */   @XmlElement(name="Language")
/*     */   protected List<LanguageStringType> language;
/*     */ 
/*     */   @XmlElement(name="CameraDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> cameraDescription;
/*     */ 
/*     */   @XmlElement(name="AnalogRGBInput")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> analogRGBInput;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="SVideoInputType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sVideoInputType;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="MaximumWattage")
/*     */   protected WattageDimension maximumWattage;
/*     */ 
/*     */   @XmlElement(name="TotalCoaxialInputs")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalCoaxialInputs;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="TotalSVideoInPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalSVideoInPorts;
/*     */ 
/*     */   @XmlElement(name="VideoEncoding")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String videoEncoding;
/*     */ 
/*     */   @XmlElement(name="WaterResistantDepth")
/*     */   protected LengthDimension waterResistantDepth;
/*     */ 
/*     */   @XmlElement(name="WaterResistantLevel")
/*     */   protected WaterResistantType waterResistantLevel;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="WirelessType")
/*     */   protected String wirelessType;
/*     */ 
/*     */   public List<String> getAudioEncoding()
/*     */   {
/* 148 */     if (this.audioEncoding == null) {
/* 149 */       this.audioEncoding = new ArrayList();
/*     */     }
/* 151 */     return this.audioEncoding;
/*     */   }
/*     */ 
/*     */   public List<LanguageStringType> getLanguage()
/*     */   {
/* 177 */     if (this.language == null) {
/* 178 */       this.language = new ArrayList();
/*     */     }
/* 180 */     return this.language;
/*     */   }
/*     */ 
/*     */   public List<String> getCameraDescription()
/*     */   {
/* 206 */     if (this.cameraDescription == null) {
/* 207 */       this.cameraDescription = new ArrayList();
/*     */     }
/* 209 */     return this.cameraDescription;
/*     */   }
/*     */ 
/*     */   public List<String> getAnalogRGBInput()
/*     */   {
/* 235 */     if (this.analogRGBInput == null) {
/* 236 */       this.analogRGBInput = new ArrayList();
/*     */     }
/* 238 */     return this.analogRGBInput;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 250 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 262 */     this.efficiency = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 288 */     if (this.operatingSystem == null) {
/* 289 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 291 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 303 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 315 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getSVideoInputType()
/*     */   {
/* 327 */     return this.sVideoInputType;
/*     */   }
/*     */ 
/*     */   public void setSVideoInputType(String value)
/*     */   {
/* 339 */     this.sVideoInputType = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 351 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 363 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getMaximumWattage()
/*     */   {
/* 375 */     return this.maximumWattage;
/*     */   }
/*     */ 
/*     */   public void setMaximumWattage(WattageDimension value)
/*     */   {
/* 387 */     this.maximumWattage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCoaxialInputs()
/*     */   {
/* 399 */     return this.totalCoaxialInputs;
/*     */   }
/*     */ 
/*     */   public void setTotalCoaxialInputs(BigInteger value)
/*     */   {
/* 411 */     this.totalCoaxialInputs = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 423 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 435 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalSVideoInPorts()
/*     */   {
/* 447 */     return this.totalSVideoInPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalSVideoInPorts(BigInteger value)
/*     */   {
/* 459 */     this.totalSVideoInPorts = value;
/*     */   }
/*     */ 
/*     */   public String getVideoEncoding()
/*     */   {
/* 471 */     return this.videoEncoding;
/*     */   }
/*     */ 
/*     */   public void setVideoEncoding(String value)
/*     */   {
/* 483 */     this.videoEncoding = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getWaterResistantDepth()
/*     */   {
/* 495 */     return this.waterResistantDepth;
/*     */   }
/*     */ 
/*     */   public void setWaterResistantDepth(LengthDimension value)
/*     */   {
/* 507 */     this.waterResistantDepth = value;
/*     */   }
/*     */ 
/*     */   public WaterResistantType getWaterResistantLevel()
/*     */   {
/* 519 */     return this.waterResistantLevel;
/*     */   }
/*     */ 
/*     */   public void setWaterResistantLevel(WaterResistantType value)
/*     */   {
/* 531 */     this.waterResistantLevel = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 557 */     if (this.wirelessTechnology == null) {
/* 558 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 560 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public String getWirelessType()
/*     */   {
/* 572 */     return this.wirelessType;
/*     */   }
/*     */ 
/*     */   public void setWirelessType(String value)
/*     */   {
/* 584 */     this.wirelessType = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PortableAudio
 * JD-Core Version:    0.6.2
 */