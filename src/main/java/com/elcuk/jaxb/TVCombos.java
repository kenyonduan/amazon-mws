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
/*     */ @XmlType(name="", propOrder={"audibleNoise", "threeDTechnology", "baseLength", "baseWidth", "analogRGBInput", "screenDimensions", "screenResolution", "builtInMedia", "maximumHorizontalRefreshRate", "maximumVerticalRefreshRate", "minimumHorizontalRefreshRate", "minimumVerticalRefreshRate", "mountingPattern", "parentalControlTechnology", "resolution", "sVideoInputType", "screenFinish", "screenSize", "numberOfSpeakers", "internetApplications", "totalCoaxialInputs", "totalComponentInPorts", "totalCompositePorts", "totalEthernetPorts", "totalHdmiPorts", "totalSVideoInPorts", "totalVgaInPorts", "totalVideoOutPorts", "universalRemoteCode", "wirelessTechnology", "wirelessType"})
/*     */ @XmlRootElement(name="TVCombos")
/*     */ public class TVCombos
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AudibleNoise")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger audibleNoise;
/*     */ 
/*     */   @XmlElement(name="ThreeDTechnology")
/*     */   protected ThreeDTechnologyValues threeDTechnology;
/*     */ 
/*     */   @XmlElement(name="BaseLength")
/*     */   protected LengthDimension baseLength;
/*     */ 
/*     */   @XmlElement(name="BaseWidth")
/*     */   protected LengthDimension baseWidth;
/*     */ 
/*     */   @XmlElement(name="AnalogRGBInput")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> analogRGBInput;
/*     */ 
/*     */   @XmlElement(name="ScreenDimensions")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String screenDimensions;
/*     */ 
/*     */   @XmlElement(name="ScreenResolution")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String screenResolution;
/*     */ 
/*     */   @XmlElement(name="BuiltInMedia")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> builtInMedia;
/*     */ 
/*     */   @XmlElement(name="MaximumHorizontalRefreshRate")
/*     */   protected FrequencyDimension maximumHorizontalRefreshRate;
/*     */ 
/*     */   @XmlElement(name="MaximumVerticalRefreshRate")
/*     */   protected FrequencyDimension maximumVerticalRefreshRate;
/*     */ 
/*     */   @XmlElement(name="MinimumHorizontalRefreshRate")
/*     */   protected FrequencyDimension minimumHorizontalRefreshRate;
/*     */ 
/*     */   @XmlElement(name="MinimumVerticalRefreshRate")
/*     */   protected FrequencyDimension minimumVerticalRefreshRate;
/*     */ 
/*     */   @XmlElement(name="MountingPattern")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountingPattern;
/*     */ 
/*     */   @XmlElement(name="ParentalControlTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String parentalControlTechnology;
/*     */ 
/*     */   @XmlElement(name="Resolution")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String resolution;
/*     */ 
/*     */   @XmlElement(name="SVideoInputType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sVideoInputType;
/*     */ 
/*     */   @XmlElement(name="ScreenFinish")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String screenFinish;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
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
/*     */   @XmlElement(name="TotalComponentInPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalComponentInPorts;
/*     */ 
/*     */   @XmlElement(name="TotalCompositePorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalCompositePorts;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="TotalHdmiPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalHdmiPorts;
/*     */ 
/*     */   @XmlElement(name="TotalSVideoInPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalSVideoInPorts;
/*     */ 
/*     */   @XmlElement(name="TotalVgaInPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalVgaInPorts;
/*     */ 
/*     */   @XmlElement(name="TotalVideoOutPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalVideoOutPorts;
/*     */ 
/*     */   @XmlElement(name="UniversalRemoteCode")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger universalRemoteCode;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="WirelessType")
/*     */   protected String wirelessType;
/*     */ 
/*     */   public BigInteger getAudibleNoise()
/*     */   {
/* 197 */     return this.audibleNoise;
/*     */   }
/*     */ 
/*     */   public void setAudibleNoise(BigInteger value)
/*     */   {
/* 209 */     this.audibleNoise = value;
/*     */   }
/*     */ 
/*     */   public ThreeDTechnologyValues getThreeDTechnology()
/*     */   {
/* 221 */     return this.threeDTechnology;
/*     */   }
/*     */ 
/*     */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*     */   {
/* 233 */     this.threeDTechnology = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getBaseLength()
/*     */   {
/* 245 */     return this.baseLength;
/*     */   }
/*     */ 
/*     */   public void setBaseLength(LengthDimension value)
/*     */   {
/* 257 */     this.baseLength = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getBaseWidth()
/*     */   {
/* 269 */     return this.baseWidth;
/*     */   }
/*     */ 
/*     */   public void setBaseWidth(LengthDimension value)
/*     */   {
/* 281 */     this.baseWidth = value;
/*     */   }
/*     */ 
/*     */   public List<String> getAnalogRGBInput()
/*     */   {
/* 307 */     if (this.analogRGBInput == null) {
/* 308 */       this.analogRGBInput = new ArrayList();
/*     */     }
/* 310 */     return this.analogRGBInput;
/*     */   }
/*     */ 
/*     */   public String getScreenDimensions()
/*     */   {
/* 322 */     return this.screenDimensions;
/*     */   }
/*     */ 
/*     */   public void setScreenDimensions(String value)
/*     */   {
/* 334 */     this.screenDimensions = value;
/*     */   }
/*     */ 
/*     */   public String getScreenResolution()
/*     */   {
/* 346 */     return this.screenResolution;
/*     */   }
/*     */ 
/*     */   public void setScreenResolution(String value)
/*     */   {
/* 358 */     this.screenResolution = value;
/*     */   }
/*     */ 
/*     */   public List<String> getBuiltInMedia()
/*     */   {
/* 384 */     if (this.builtInMedia == null) {
/* 385 */       this.builtInMedia = new ArrayList();
/*     */     }
/* 387 */     return this.builtInMedia;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getMaximumHorizontalRefreshRate()
/*     */   {
/* 399 */     return this.maximumHorizontalRefreshRate;
/*     */   }
/*     */ 
/*     */   public void setMaximumHorizontalRefreshRate(FrequencyDimension value)
/*     */   {
/* 411 */     this.maximumHorizontalRefreshRate = value;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getMaximumVerticalRefreshRate()
/*     */   {
/* 423 */     return this.maximumVerticalRefreshRate;
/*     */   }
/*     */ 
/*     */   public void setMaximumVerticalRefreshRate(FrequencyDimension value)
/*     */   {
/* 435 */     this.maximumVerticalRefreshRate = value;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getMinimumHorizontalRefreshRate()
/*     */   {
/* 447 */     return this.minimumHorizontalRefreshRate;
/*     */   }
/*     */ 
/*     */   public void setMinimumHorizontalRefreshRate(FrequencyDimension value)
/*     */   {
/* 459 */     this.minimumHorizontalRefreshRate = value;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getMinimumVerticalRefreshRate()
/*     */   {
/* 471 */     return this.minimumVerticalRefreshRate;
/*     */   }
/*     */ 
/*     */   public void setMinimumVerticalRefreshRate(FrequencyDimension value)
/*     */   {
/* 483 */     this.minimumVerticalRefreshRate = value;
/*     */   }
/*     */ 
/*     */   public String getMountingPattern()
/*     */   {
/* 495 */     return this.mountingPattern;
/*     */   }
/*     */ 
/*     */   public void setMountingPattern(String value)
/*     */   {
/* 507 */     this.mountingPattern = value;
/*     */   }
/*     */ 
/*     */   public String getParentalControlTechnology()
/*     */   {
/* 519 */     return this.parentalControlTechnology;
/*     */   }
/*     */ 
/*     */   public void setParentalControlTechnology(String value)
/*     */   {
/* 531 */     this.parentalControlTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getResolution()
/*     */   {
/* 543 */     return this.resolution;
/*     */   }
/*     */ 
/*     */   public void setResolution(String value)
/*     */   {
/* 555 */     this.resolution = value;
/*     */   }
/*     */ 
/*     */   public String getSVideoInputType()
/*     */   {
/* 567 */     return this.sVideoInputType;
/*     */   }
/*     */ 
/*     */   public void setSVideoInputType(String value)
/*     */   {
/* 579 */     this.sVideoInputType = value;
/*     */   }
/*     */ 
/*     */   public String getScreenFinish()
/*     */   {
/* 591 */     return this.screenFinish;
/*     */   }
/*     */ 
/*     */   public void setScreenFinish(String value)
/*     */   {
/* 603 */     this.screenFinish = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 615 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 627 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfSpeakers()
/*     */   {
/* 639 */     return this.numberOfSpeakers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSpeakers(BigInteger value)
/*     */   {
/* 651 */     this.numberOfSpeakers = value;
/*     */   }
/*     */ 
/*     */   public List<String> getInternetApplications()
/*     */   {
/* 677 */     if (this.internetApplications == null) {
/* 678 */       this.internetApplications = new ArrayList();
/*     */     }
/* 680 */     return this.internetApplications;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCoaxialInputs()
/*     */   {
/* 692 */     return this.totalCoaxialInputs;
/*     */   }
/*     */ 
/*     */   public void setTotalCoaxialInputs(BigInteger value)
/*     */   {
/* 704 */     this.totalCoaxialInputs = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalComponentInPorts()
/*     */   {
/* 716 */     return this.totalComponentInPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalComponentInPorts(BigInteger value)
/*     */   {
/* 728 */     this.totalComponentInPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCompositePorts()
/*     */   {
/* 740 */     return this.totalCompositePorts;
/*     */   }
/*     */ 
/*     */   public void setTotalCompositePorts(BigInteger value)
/*     */   {
/* 752 */     this.totalCompositePorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 764 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 776 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalHdmiPorts()
/*     */   {
/* 788 */     return this.totalHdmiPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalHdmiPorts(BigInteger value)
/*     */   {
/* 800 */     this.totalHdmiPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalSVideoInPorts()
/*     */   {
/* 812 */     return this.totalSVideoInPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalSVideoInPorts(BigInteger value)
/*     */   {
/* 824 */     this.totalSVideoInPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalVgaInPorts()
/*     */   {
/* 836 */     return this.totalVgaInPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalVgaInPorts(BigInteger value)
/*     */   {
/* 848 */     this.totalVgaInPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalVideoOutPorts()
/*     */   {
/* 860 */     return this.totalVideoOutPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalVideoOutPorts(BigInteger value)
/*     */   {
/* 872 */     this.totalVideoOutPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getUniversalRemoteCode()
/*     */   {
/* 884 */     return this.universalRemoteCode;
/*     */   }
/*     */ 
/*     */   public void setUniversalRemoteCode(BigInteger value)
/*     */   {
/* 896 */     this.universalRemoteCode = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 922 */     if (this.wirelessTechnology == null) {
/* 923 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 925 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public String getWirelessType()
/*     */   {
/* 937 */     return this.wirelessType;
/*     */   }
/*     */ 
/*     */   public void setWirelessType(String value)
/*     */   {
/* 949 */     this.wirelessType = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TVCombos
 * JD-Core Version:    0.6.2
 */