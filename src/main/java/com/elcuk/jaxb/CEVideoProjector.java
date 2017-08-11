/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlSchemaType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"audibleNoise", "threeDTechnology", "analogRGBInput", "screenDimensions", "horizontalKeystoneCorrection", "builtInMedia", "lens", "lampWattage", "throwRatio", "maximumHorizontalRefreshRate", "maximumThrowDistance", "maximumVerticalRefreshRate", "minFocalLength", "minimumHorizontalRefreshRate", "minimumThrowDistance", "minimumVerticalRefreshRate", "lampLife", "imageDiagonalSize", "parentalControlTechnology", "projectionMethod", "resolution", "sVideoInputType", "numberOfSpeakers", "internetApplications", "totalCoaxialInputs", "totalComponentInPorts", "totalCompositePorts", "totalEthernetPorts", "totalHdmiPorts", "totalSVideoInPorts", "totalVgaInPorts", "totalVideoOutPorts", "screenResolution", "screenTrigger", "verticalKeystoneCorrection", "wirelessTechnology", "zoomRatio", "zoomType", "efficiency"})
/*      */ @XmlRootElement(name="CEVideoProjector")
/*      */ public class CEVideoProjector
/*      */ {
/*      */ 
/*      */   @XmlElement(name="AudibleNoise")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger audibleNoise;
/*      */ 
/*      */   @XmlElement(name="ThreeDTechnology")
/*      */   protected ThreeDTechnologyValues threeDTechnology;
/*      */ 
/*      */   @XmlElement(name="AnalogRGBInput")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> analogRGBInput;
/*      */ 
/*      */   @XmlElement(name="ScreenDimensions")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenDimensions;
/*      */ 
/*      */   @XmlElement(name="HorizontalKeystoneCorrection")
/*      */   protected LengthDimension horizontalKeystoneCorrection;
/*      */ 
/*      */   @XmlElement(name="BuiltInMedia")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> builtInMedia;
/*      */ 
/*      */   @XmlElement(name="Lens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lens;
/*      */ 
/*      */   @XmlElement(name="LampWattage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger lampWattage;
/*      */ 
/*      */   @XmlElement(name="ThrowRatio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String throwRatio;
/*      */ 
/*      */   @XmlElement(name="MaximumHorizontalRefreshRate")
/*      */   protected FrequencyDimension maximumHorizontalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MaximumThrowDistance")
/*      */   protected LengthDimension maximumThrowDistance;
/*      */ 
/*      */   @XmlElement(name="MaximumVerticalRefreshRate")
/*      */   protected FrequencyDimension maximumVerticalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MinFocalLength")
/*      */   protected LengthDimension minFocalLength;
/*      */ 
/*      */   @XmlElement(name="MinimumHorizontalRefreshRate")
/*      */   protected FrequencyDimension minimumHorizontalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MinimumThrowDistance")
/*      */   protected LengthDimension minimumThrowDistance;
/*      */ 
/*      */   @XmlElement(name="MinimumVerticalRefreshRate")
/*      */   protected FrequencyDimension minimumVerticalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="LampLife")
/*      */   protected TimeIntegerDimension lampLife;
/*      */ 
/*      */   @XmlElement(name="ImageDiagonalSize")
/*      */   protected LengthDimension imageDiagonalSize;
/*      */ 
/*      */   @XmlElement(name="ParentalControlTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String parentalControlTechnology;
/*      */ 
/*      */   @XmlElement(name="ProjectionMethod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String projectionMethod;
/*      */ 
/*      */   @XmlElement(name="Resolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String resolution;
/*      */ 
/*      */   @XmlElement(name="SVideoInputType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sVideoInputType;
/*      */ 
/*      */   @XmlElement(name="NumberOfSpeakers")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfSpeakers;
/*      */ 
/*      */   @XmlElement(name="InternetApplications")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> internetApplications;
/*      */ 
/*      */   @XmlElement(name="TotalCoaxialInputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalCoaxialInputs;
/*      */ 
/*      */   @XmlElement(name="TotalComponentInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalComponentInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalCompositePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalCompositePorts;
/*      */ 
/*      */   @XmlElement(name="TotalEthernetPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalEthernetPorts;
/*      */ 
/*      */   @XmlElement(name="TotalHdmiPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalHdmiPorts;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalVgaInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVgaInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="ScreenResolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenResolution;
/*      */ 
/*      */   @XmlElement(name="ScreenTrigger")
/*      */   protected VoltageDecimalDimension screenTrigger;
/*      */ 
/*      */   @XmlElement(name="VerticalKeystoneCorrection")
/*      */   protected LengthDimension verticalKeystoneCorrection;
/*      */ 
/*      */   @XmlElement(name="WirelessTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> wirelessTechnology;
/*      */ 
/*      */   @XmlElement(name="ZoomRatio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String zoomRatio;
/*      */ 
/*      */   @XmlElement(name="ZoomType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String zoomType;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public BigInteger getAudibleNoise()
/*      */   {
/*  233 */     return this.audibleNoise;
/*      */   }
/*      */ 
/*      */   public void setAudibleNoise(BigInteger value)
/*      */   {
/*  245 */     this.audibleNoise = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/*  257 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/*  269 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<String> getAnalogRGBInput()
/*      */   {
/*  295 */     if (this.analogRGBInput == null) {
/*  296 */       this.analogRGBInput = new ArrayList();
/*      */     }
/*  298 */     return this.analogRGBInput;
/*      */   }
/*      */ 
/*      */   public String getScreenDimensions()
/*      */   {
/*  310 */     return this.screenDimensions;
/*      */   }
/*      */ 
/*      */   public void setScreenDimensions(String value)
/*      */   {
/*  322 */     this.screenDimensions = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getHorizontalKeystoneCorrection()
/*      */   {
/*  334 */     return this.horizontalKeystoneCorrection;
/*      */   }
/*      */ 
/*      */   public void setHorizontalKeystoneCorrection(LengthDimension value)
/*      */   {
/*  346 */     this.horizontalKeystoneCorrection = value;
/*      */   }
/*      */ 
/*      */   public List<String> getBuiltInMedia()
/*      */   {
/*  372 */     if (this.builtInMedia == null) {
/*  373 */       this.builtInMedia = new ArrayList();
/*      */     }
/*  375 */     return this.builtInMedia;
/*      */   }
/*      */ 
/*      */   public String getLens()
/*      */   {
/*  387 */     return this.lens;
/*      */   }
/*      */ 
/*      */   public void setLens(String value)
/*      */   {
/*  399 */     this.lens = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLampWattage()
/*      */   {
/*  411 */     return this.lampWattage;
/*      */   }
/*      */ 
/*      */   public void setLampWattage(BigInteger value)
/*      */   {
/*  423 */     this.lampWattage = value;
/*      */   }
/*      */ 
/*      */   public String getThrowRatio()
/*      */   {
/*  435 */     return this.throwRatio;
/*      */   }
/*      */ 
/*      */   public void setThrowRatio(String value)
/*      */   {
/*  447 */     this.throwRatio = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMaximumHorizontalRefreshRate()
/*      */   {
/*  459 */     return this.maximumHorizontalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMaximumHorizontalRefreshRate(FrequencyDimension value)
/*      */   {
/*  471 */     this.maximumHorizontalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMaximumThrowDistance()
/*      */   {
/*  483 */     return this.maximumThrowDistance;
/*      */   }
/*      */ 
/*      */   public void setMaximumThrowDistance(LengthDimension value)
/*      */   {
/*  495 */     this.maximumThrowDistance = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMaximumVerticalRefreshRate()
/*      */   {
/*  507 */     return this.maximumVerticalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMaximumVerticalRefreshRate(FrequencyDimension value)
/*      */   {
/*  519 */     this.maximumVerticalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMinFocalLength()
/*      */   {
/*  531 */     return this.minFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMinFocalLength(LengthDimension value)
/*      */   {
/*  543 */     this.minFocalLength = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMinimumHorizontalRefreshRate()
/*      */   {
/*  555 */     return this.minimumHorizontalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMinimumHorizontalRefreshRate(FrequencyDimension value)
/*      */   {
/*  567 */     this.minimumHorizontalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMinimumThrowDistance()
/*      */   {
/*  579 */     return this.minimumThrowDistance;
/*      */   }
/*      */ 
/*      */   public void setMinimumThrowDistance(LengthDimension value)
/*      */   {
/*  591 */     this.minimumThrowDistance = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMinimumVerticalRefreshRate()
/*      */   {
/*  603 */     return this.minimumVerticalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMinimumVerticalRefreshRate(FrequencyDimension value)
/*      */   {
/*  615 */     this.minimumVerticalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public TimeIntegerDimension getLampLife()
/*      */   {
/*  627 */     return this.lampLife;
/*      */   }
/*      */ 
/*      */   public void setLampLife(TimeIntegerDimension value)
/*      */   {
/*  639 */     this.lampLife = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getImageDiagonalSize()
/*      */   {
/*  651 */     return this.imageDiagonalSize;
/*      */   }
/*      */ 
/*      */   public void setImageDiagonalSize(LengthDimension value)
/*      */   {
/*  663 */     this.imageDiagonalSize = value;
/*      */   }
/*      */ 
/*      */   public String getParentalControlTechnology()
/*      */   {
/*  675 */     return this.parentalControlTechnology;
/*      */   }
/*      */ 
/*      */   public void setParentalControlTechnology(String value)
/*      */   {
/*  687 */     this.parentalControlTechnology = value;
/*      */   }
/*      */ 
/*      */   public String getProjectionMethod()
/*      */   {
/*  699 */     return this.projectionMethod;
/*      */   }
/*      */ 
/*      */   public void setProjectionMethod(String value)
/*      */   {
/*  711 */     this.projectionMethod = value;
/*      */   }
/*      */ 
/*      */   public String getResolution()
/*      */   {
/*  723 */     return this.resolution;
/*      */   }
/*      */ 
/*      */   public void setResolution(String value)
/*      */   {
/*  735 */     this.resolution = value;
/*      */   }
/*      */ 
/*      */   public String getSVideoInputType()
/*      */   {
/*  747 */     return this.sVideoInputType;
/*      */   }
/*      */ 
/*      */   public void setSVideoInputType(String value)
/*      */   {
/*  759 */     this.sVideoInputType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSpeakers()
/*      */   {
/*  771 */     return this.numberOfSpeakers;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSpeakers(BigInteger value)
/*      */   {
/*  783 */     this.numberOfSpeakers = value;
/*      */   }
/*      */ 
/*      */   public List<String> getInternetApplications()
/*      */   {
/*  809 */     if (this.internetApplications == null) {
/*  810 */       this.internetApplications = new ArrayList();
/*      */     }
/*  812 */     return this.internetApplications;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCoaxialInputs()
/*      */   {
/*  824 */     return this.totalCoaxialInputs;
/*      */   }
/*      */ 
/*      */   public void setTotalCoaxialInputs(BigInteger value)
/*      */   {
/*  836 */     this.totalCoaxialInputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalComponentInPorts()
/*      */   {
/*  848 */     return this.totalComponentInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalComponentInPorts(BigInteger value)
/*      */   {
/*  860 */     this.totalComponentInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCompositePorts()
/*      */   {
/*  872 */     return this.totalCompositePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalCompositePorts(BigInteger value)
/*      */   {
/*  884 */     this.totalCompositePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalEthernetPorts()
/*      */   {
/*  896 */     return this.totalEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalEthernetPorts(BigInteger value)
/*      */   {
/*  908 */     this.totalEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/*  920 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/*  932 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoInPorts()
/*      */   {
/*  944 */     return this.totalSVideoInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoInPorts(BigInteger value)
/*      */   {
/*  956 */     this.totalSVideoInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVgaInPorts()
/*      */   {
/*  968 */     return this.totalVgaInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVgaInPorts(BigInteger value)
/*      */   {
/*  980 */     this.totalVgaInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVideoOutPorts()
/*      */   {
/*  992 */     return this.totalVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVideoOutPorts(BigInteger value)
/*      */   {
/* 1004 */     this.totalVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/* 1016 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/* 1028 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public VoltageDecimalDimension getScreenTrigger()
/*      */   {
/* 1040 */     return this.screenTrigger;
/*      */   }
/*      */ 
/*      */   public void setScreenTrigger(VoltageDecimalDimension value)
/*      */   {
/* 1052 */     this.screenTrigger = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getVerticalKeystoneCorrection()
/*      */   {
/* 1064 */     return this.verticalKeystoneCorrection;
/*      */   }
/*      */ 
/*      */   public void setVerticalKeystoneCorrection(LengthDimension value)
/*      */   {
/* 1076 */     this.verticalKeystoneCorrection = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessTechnology()
/*      */   {
/* 1102 */     if (this.wirelessTechnology == null) {
/* 1103 */       this.wirelessTechnology = new ArrayList();
/*      */     }
/* 1105 */     return this.wirelessTechnology;
/*      */   }
/*      */ 
/*      */   public String getZoomRatio()
/*      */   {
/* 1117 */     return this.zoomRatio;
/*      */   }
/*      */ 
/*      */   public void setZoomRatio(String value)
/*      */   {
/* 1129 */     this.zoomRatio = value;
/*      */   }
/*      */ 
/*      */   public String getZoomType()
/*      */   {
/* 1141 */     return this.zoomType;
/*      */   }
/*      */ 
/*      */   public void setZoomType(String value)
/*      */   {
/* 1153 */     this.zoomType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1165 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1177 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CEVideoProjector
 * JD-Core Version:    0.6.2
 */