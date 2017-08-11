/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigDecimal;
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"variationData", "hasGreyScale", "lightSourceType", "scannerResolution", "aspectRatio", "audibleNoise", "builtinSpeaker", "contrastRatio", "displayResolutionMaximum", "displayTechnology", "imageDiagonalSize", "inputVideoCompatability", "inputVideoConnectors", "keystoneCorrection", "lampLife", "lampWattage", "lens", "maximumHorizontalRefreshRate", "maximumImageSize", "maximumThrowDistance", "maximumThrowRatio", "maximumVerticalRefreshRate", "mediaInput", "minimumHorizontalRefreshRate", "minimumImageSize", "minimumThrowDistance", "minimumThrowRatio", "minimumVerticalRefreshRate", "modelNumber", "projectorBrightness", "remote", "screenResolution", "screenTrigger", "threeDReady", "wirelessStandard", "zoom", "zoomRatio", "numberOfDVIPorts", "efficiency"})
/*      */ @XmlRootElement(name="VideoProjector")
/*      */ public class VideoProjector
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="HasGreyScale")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String hasGreyScale;
/*      */ 
/*      */   @XmlElement(name="LightSourceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lightSourceType;
/*      */ 
/*      */   @XmlElement(name="ScannerResolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String scannerResolution;
/*      */ 
/*      */   @XmlElement(name="AspectRatio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String aspectRatio;
/*      */ 
/*      */   @XmlElement(name="AudibleNoise")
/*      */   protected BigDecimal audibleNoise;
/*      */ 
/*      */   @XmlElement(name="BuiltinSpeaker")
/*      */   protected BigInteger builtinSpeaker;
/*      */ 
/*      */   @XmlElement(name="ContrastRatio")
/*      */   protected String contrastRatio;
/*      */ 
/*      */   @XmlElement(name="DisplayResolutionMaximum")
/*      */   protected String displayResolutionMaximum;
/*      */ 
/*      */   @XmlElement(name="DisplayTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String displayTechnology;
/*      */ 
/*      */   @XmlElement(name="ImageDiagonalSize")
/*      */   protected LengthSevenDigitDimension imageDiagonalSize;
/*      */ 
/*      */   @XmlElement(name="InputVideoCompatability")
/*      */   protected List<String> inputVideoCompatability;
/*      */ 
/*      */   @XmlElement(name="InputVideoConnectors")
/*      */   protected InputVideoConnectorsTypeValues inputVideoConnectors;
/*      */ 
/*      */   @XmlElement(name="KeystoneCorrection")
/*      */   protected LengthSevenDigitDimension keystoneCorrection;
/*      */ 
/*      */   @XmlElement(name="LampLife")
/*      */   protected BurnTimeSixDigitDimension lampLife;
/*      */ 
/*      */   @XmlElement(name="LampWattage")
/*      */   protected BigInteger lampWattage;
/*      */ 
/*      */   @XmlElement(name="Lens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lens;
/*      */ 
/*      */   @XmlElement(name="MaximumHorizontalRefreshRate")
/*      */   protected FrequencyFiveDigitIntegerDimension maximumHorizontalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MaximumImageSize")
/*      */   protected LengthSevenDigitDimension maximumImageSize;
/*      */ 
/*      */   @XmlElement(name="MaximumThrowDistance")
/*      */   protected BigDecimal maximumThrowDistance;
/*      */ 
/*      */   @XmlElement(name="MaximumThrowRatio")
/*      */   protected String maximumThrowRatio;
/*      */ 
/*      */   @XmlElement(name="MaximumVerticalRefreshRate")
/*      */   protected FrequencyFiveDigitIntegerDimension maximumVerticalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MediaInput")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mediaInput;
/*      */ 
/*      */   @XmlElement(name="MinimumHorizontalRefreshRate")
/*      */   protected FrequencyFiveDigitIntegerDimension minimumHorizontalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MinimumImageSize")
/*      */   protected LengthSevenDigitDimension minimumImageSize;
/*      */ 
/*      */   @XmlElement(name="MinimumThrowDistance")
/*      */   protected BigDecimal minimumThrowDistance;
/*      */ 
/*      */   @XmlElement(name="MinimumThrowRatio")
/*      */   protected String minimumThrowRatio;
/*      */ 
/*      */   @XmlElement(name="MinimumVerticalRefreshRate")
/*      */   protected FrequencyFiveDigitIntegerDimension minimumVerticalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="ModelNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String modelNumber;
/*      */ 
/*      */   @XmlElement(name="ProjectorBrightness")
/*      */   protected LuminanceFiveDigitDimension projectorBrightness;
/*      */ 
/*      */   @XmlElement(name="Remote")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String remote;
/*      */ 
/*      */   @XmlElement(name="ScreenResolution")
/*      */   protected String screenResolution;
/*      */ 
/*      */   @XmlElement(name="ScreenTrigger")
/*      */   protected VoltageFiveDigitIntegerDimension screenTrigger;
/*      */ 
/*      */   @XmlElement(name="ThreeDReady")
/*      */   protected String threeDReady;
/*      */ 
/*      */   @XmlElement(name="WirelessStandard")
/*      */   protected String wirelessStandard;
/*      */ 
/*      */   @XmlElement(name="Zoom")
/*      */   protected String zoom;
/*      */ 
/*      */   @XmlElement(name="ZoomRatio")
/*      */   protected String zoomRatio;
/*      */ 
/*      */   @XmlElement(name="NumberOfDVIPorts")
/*      */   protected BigInteger numberOfDVIPorts;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  217 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  229 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getHasGreyScale()
/*      */   {
/*  241 */     return this.hasGreyScale;
/*      */   }
/*      */ 
/*      */   public void setHasGreyScale(String value)
/*      */   {
/*  253 */     this.hasGreyScale = value;
/*      */   }
/*      */ 
/*      */   public String getLightSourceType()
/*      */   {
/*  265 */     return this.lightSourceType;
/*      */   }
/*      */ 
/*      */   public void setLightSourceType(String value)
/*      */   {
/*  277 */     this.lightSourceType = value;
/*      */   }
/*      */ 
/*      */   public String getScannerResolution()
/*      */   {
/*  289 */     return this.scannerResolution;
/*      */   }
/*      */ 
/*      */   public void setScannerResolution(String value)
/*      */   {
/*  301 */     this.scannerResolution = value;
/*      */   }
/*      */ 
/*      */   public String getAspectRatio()
/*      */   {
/*  313 */     return this.aspectRatio;
/*      */   }
/*      */ 
/*      */   public void setAspectRatio(String value)
/*      */   {
/*  325 */     this.aspectRatio = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getAudibleNoise()
/*      */   {
/*  337 */     return this.audibleNoise;
/*      */   }
/*      */ 
/*      */   public void setAudibleNoise(BigDecimal value)
/*      */   {
/*  349 */     this.audibleNoise = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBuiltinSpeaker()
/*      */   {
/*  361 */     return this.builtinSpeaker;
/*      */   }
/*      */ 
/*      */   public void setBuiltinSpeaker(BigInteger value)
/*      */   {
/*  373 */     this.builtinSpeaker = value;
/*      */   }
/*      */ 
/*      */   public String getContrastRatio()
/*      */   {
/*  385 */     return this.contrastRatio;
/*      */   }
/*      */ 
/*      */   public void setContrastRatio(String value)
/*      */   {
/*  397 */     this.contrastRatio = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayResolutionMaximum()
/*      */   {
/*  409 */     return this.displayResolutionMaximum;
/*      */   }
/*      */ 
/*      */   public void setDisplayResolutionMaximum(String value)
/*      */   {
/*  421 */     this.displayResolutionMaximum = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayTechnology()
/*      */   {
/*  433 */     return this.displayTechnology;
/*      */   }
/*      */ 
/*      */   public void setDisplayTechnology(String value)
/*      */   {
/*  445 */     this.displayTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthSevenDigitDimension getImageDiagonalSize()
/*      */   {
/*  457 */     return this.imageDiagonalSize;
/*      */   }
/*      */ 
/*      */   public void setImageDiagonalSize(LengthSevenDigitDimension value)
/*      */   {
/*  469 */     this.imageDiagonalSize = value;
/*      */   }
/*      */ 
/*      */   public List<String> getInputVideoCompatability()
/*      */   {
/*  495 */     if (this.inputVideoCompatability == null) {
/*  496 */       this.inputVideoCompatability = new ArrayList();
/*      */     }
/*  498 */     return this.inputVideoCompatability;
/*      */   }
/*      */ 
/*      */   public InputVideoConnectorsTypeValues getInputVideoConnectors()
/*      */   {
/*  510 */     return this.inputVideoConnectors;
/*      */   }
/*      */ 
/*      */   public void setInputVideoConnectors(InputVideoConnectorsTypeValues value)
/*      */   {
/*  522 */     this.inputVideoConnectors = value;
/*      */   }
/*      */ 
/*      */   public LengthSevenDigitDimension getKeystoneCorrection()
/*      */   {
/*  534 */     return this.keystoneCorrection;
/*      */   }
/*      */ 
/*      */   public void setKeystoneCorrection(LengthSevenDigitDimension value)
/*      */   {
/*  546 */     this.keystoneCorrection = value;
/*      */   }
/*      */ 
/*      */   public BurnTimeSixDigitDimension getLampLife()
/*      */   {
/*  558 */     return this.lampLife;
/*      */   }
/*      */ 
/*      */   public void setLampLife(BurnTimeSixDigitDimension value)
/*      */   {
/*  570 */     this.lampLife = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLampWattage()
/*      */   {
/*  582 */     return this.lampWattage;
/*      */   }
/*      */ 
/*      */   public void setLampWattage(BigInteger value)
/*      */   {
/*  594 */     this.lampWattage = value;
/*      */   }
/*      */ 
/*      */   public String getLens()
/*      */   {
/*  606 */     return this.lens;
/*      */   }
/*      */ 
/*      */   public void setLens(String value)
/*      */   {
/*  618 */     this.lens = value;
/*      */   }
/*      */ 
/*      */   public FrequencyFiveDigitIntegerDimension getMaximumHorizontalRefreshRate()
/*      */   {
/*  630 */     return this.maximumHorizontalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMaximumHorizontalRefreshRate(FrequencyFiveDigitIntegerDimension value)
/*      */   {
/*  642 */     this.maximumHorizontalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public LengthSevenDigitDimension getMaximumImageSize()
/*      */   {
/*  654 */     return this.maximumImageSize;
/*      */   }
/*      */ 
/*      */   public void setMaximumImageSize(LengthSevenDigitDimension value)
/*      */   {
/*  666 */     this.maximumImageSize = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getMaximumThrowDistance()
/*      */   {
/*  678 */     return this.maximumThrowDistance;
/*      */   }
/*      */ 
/*      */   public void setMaximumThrowDistance(BigDecimal value)
/*      */   {
/*  690 */     this.maximumThrowDistance = value;
/*      */   }
/*      */ 
/*      */   public String getMaximumThrowRatio()
/*      */   {
/*  702 */     return this.maximumThrowRatio;
/*      */   }
/*      */ 
/*      */   public void setMaximumThrowRatio(String value)
/*      */   {
/*  714 */     this.maximumThrowRatio = value;
/*      */   }
/*      */ 
/*      */   public FrequencyFiveDigitIntegerDimension getMaximumVerticalRefreshRate()
/*      */   {
/*  726 */     return this.maximumVerticalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMaximumVerticalRefreshRate(FrequencyFiveDigitIntegerDimension value)
/*      */   {
/*  738 */     this.maximumVerticalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public String getMediaInput()
/*      */   {
/*  750 */     return this.mediaInput;
/*      */   }
/*      */ 
/*      */   public void setMediaInput(String value)
/*      */   {
/*  762 */     this.mediaInput = value;
/*      */   }
/*      */ 
/*      */   public FrequencyFiveDigitIntegerDimension getMinimumHorizontalRefreshRate()
/*      */   {
/*  774 */     return this.minimumHorizontalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMinimumHorizontalRefreshRate(FrequencyFiveDigitIntegerDimension value)
/*      */   {
/*  786 */     this.minimumHorizontalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public LengthSevenDigitDimension getMinimumImageSize()
/*      */   {
/*  798 */     return this.minimumImageSize;
/*      */   }
/*      */ 
/*      */   public void setMinimumImageSize(LengthSevenDigitDimension value)
/*      */   {
/*  810 */     this.minimumImageSize = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getMinimumThrowDistance()
/*      */   {
/*  822 */     return this.minimumThrowDistance;
/*      */   }
/*      */ 
/*      */   public void setMinimumThrowDistance(BigDecimal value)
/*      */   {
/*  834 */     this.minimumThrowDistance = value;
/*      */   }
/*      */ 
/*      */   public String getMinimumThrowRatio()
/*      */   {
/*  846 */     return this.minimumThrowRatio;
/*      */   }
/*      */ 
/*      */   public void setMinimumThrowRatio(String value)
/*      */   {
/*  858 */     this.minimumThrowRatio = value;
/*      */   }
/*      */ 
/*      */   public FrequencyFiveDigitIntegerDimension getMinimumVerticalRefreshRate()
/*      */   {
/*  870 */     return this.minimumVerticalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMinimumVerticalRefreshRate(FrequencyFiveDigitIntegerDimension value)
/*      */   {
/*  882 */     this.minimumVerticalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public String getModelNumber()
/*      */   {
/*  894 */     return this.modelNumber;
/*      */   }
/*      */ 
/*      */   public void setModelNumber(String value)
/*      */   {
/*  906 */     this.modelNumber = value;
/*      */   }
/*      */ 
/*      */   public LuminanceFiveDigitDimension getProjectorBrightness()
/*      */   {
/*  918 */     return this.projectorBrightness;
/*      */   }
/*      */ 
/*      */   public void setProjectorBrightness(LuminanceFiveDigitDimension value)
/*      */   {
/*  930 */     this.projectorBrightness = value;
/*      */   }
/*      */ 
/*      */   public String getRemote()
/*      */   {
/*  942 */     return this.remote;
/*      */   }
/*      */ 
/*      */   public void setRemote(String value)
/*      */   {
/*  954 */     this.remote = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/*  966 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/*  978 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public VoltageFiveDigitIntegerDimension getScreenTrigger()
/*      */   {
/*  990 */     return this.screenTrigger;
/*      */   }
/*      */ 
/*      */   public void setScreenTrigger(VoltageFiveDigitIntegerDimension value)
/*      */   {
/* 1002 */     this.screenTrigger = value;
/*      */   }
/*      */ 
/*      */   public String getThreeDReady()
/*      */   {
/* 1014 */     return this.threeDReady;
/*      */   }
/*      */ 
/*      */   public void setThreeDReady(String value)
/*      */   {
/* 1026 */     this.threeDReady = value;
/*      */   }
/*      */ 
/*      */   public String getWirelessStandard()
/*      */   {
/* 1038 */     return this.wirelessStandard;
/*      */   }
/*      */ 
/*      */   public void setWirelessStandard(String value)
/*      */   {
/* 1050 */     this.wirelessStandard = value;
/*      */   }
/*      */ 
/*      */   public String getZoom()
/*      */   {
/* 1062 */     return this.zoom;
/*      */   }
/*      */ 
/*      */   public void setZoom(String value)
/*      */   {
/* 1074 */     this.zoom = value;
/*      */   }
/*      */ 
/*      */   public String getZoomRatio()
/*      */   {
/* 1086 */     return this.zoomRatio;
/*      */   }
/*      */ 
/*      */   public void setZoomRatio(String value)
/*      */   {
/* 1098 */     this.zoomRatio = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfDVIPorts()
/*      */   {
/* 1110 */     return this.numberOfDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfDVIPorts(BigInteger value)
/*      */   {
/* 1122 */     this.numberOfDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1134 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1146 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.VideoProjector
 * JD-Core Version:    0.6.2
 */