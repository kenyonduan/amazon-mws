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
/*     */ @XmlType(name="", propOrder={"audioEncoding", "language", "cameraDescription", "digitalAudioCapacity", "operatingSystem", "powerSource", "screenSize", "totalEthernetPorts", "videoEncoding", "wirelessTechnology", "wirelessType"})
/*     */ @XmlRootElement(name="MediaPlayer")
/*     */ public class MediaPlayer
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
/*     */   @XmlElement(name="DigitalAudioCapacity")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String digitalAudioCapacity;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="VideoEncoding")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String videoEncoding;
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
/* 116 */     if (this.audioEncoding == null) {
/* 117 */       this.audioEncoding = new ArrayList();
/*     */     }
/* 119 */     return this.audioEncoding;
/*     */   }
/*     */ 
/*     */   public List<LanguageStringType> getLanguage()
/*     */   {
/* 145 */     if (this.language == null) {
/* 146 */       this.language = new ArrayList();
/*     */     }
/* 148 */     return this.language;
/*     */   }
/*     */ 
/*     */   public List<String> getCameraDescription()
/*     */   {
/* 174 */     if (this.cameraDescription == null) {
/* 175 */       this.cameraDescription = new ArrayList();
/*     */     }
/* 177 */     return this.cameraDescription;
/*     */   }
/*     */ 
/*     */   public String getDigitalAudioCapacity()
/*     */   {
/* 189 */     return this.digitalAudioCapacity;
/*     */   }
/*     */ 
/*     */   public void setDigitalAudioCapacity(String value)
/*     */   {
/* 201 */     this.digitalAudioCapacity = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 227 */     if (this.operatingSystem == null) {
/* 228 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 230 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 242 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 254 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 266 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 278 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 290 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 302 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public String getVideoEncoding()
/*     */   {
/* 314 */     return this.videoEncoding;
/*     */   }
/*     */ 
/*     */   public void setVideoEncoding(String value)
/*     */   {
/* 326 */     this.videoEncoding = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 352 */     if (this.wirelessTechnology == null) {
/* 353 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 355 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public String getWirelessType()
/*     */   {
/* 367 */     return this.wirelessType;
/*     */   }
/*     */ 
/*     */   public void setWirelessType(String value)
/*     */   {
/* 379 */     this.wirelessType = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MediaPlayer
 * JD-Core Version:    0.6.2
 */