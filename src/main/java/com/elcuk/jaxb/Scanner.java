/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
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
/*     */ @XmlType(name="", propOrder={"variationData", "hasGreyScale", "lightSourceType", "maxInputSheetCapacity", "maxPrintResolutionBlackWhite", "maxPrintResolutionColor", "maxPrintSpeedBlackWhite", "maxPrintSpeedColor", "maxScanningSize", "minScanningSize", "printerMediaSizeMaximum", "printerOutputType", "printerWirelessType", "printingMediaType", "printingTechnology", "scanRate", "scannerResolution", "efficiency"})
/*     */ @XmlRootElement(name="Scanner")
/*     */ public class Scanner
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="HasGreyScale")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String hasGreyScale;
/*     */ 
/*     */   @XmlElement(name="LightSourceType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String lightSourceType;
/*     */ 
/*     */   @XmlElement(name="MaxInputSheetCapacity")
/*     */   protected BigInteger maxInputSheetCapacity;
/*     */ 
/*     */   @XmlElement(name="MaxPrintResolutionBlackWhite")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String maxPrintResolutionBlackWhite;
/*     */ 
/*     */   @XmlElement(name="MaxPrintResolutionColor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String maxPrintResolutionColor;
/*     */ 
/*     */   @XmlElement(name="MaxPrintSpeedBlackWhite")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String maxPrintSpeedBlackWhite;
/*     */ 
/*     */   @XmlElement(name="MaxPrintSpeedColor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String maxPrintSpeedColor;
/*     */ 
/*     */   @XmlElement(name="MaxScanningSize")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String maxScanningSize;
/*     */ 
/*     */   @XmlElement(name="MinScanningSize")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String minScanningSize;
/*     */ 
/*     */   @XmlElement(name="PrinterMediaSizeMaximum")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String printerMediaSizeMaximum;
/*     */ 
/*     */   @XmlElement(name="PrinterOutputType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String printerOutputType;
/*     */ 
/*     */   @XmlElement(name="PrinterWirelessType")
/*     */   protected List<String> printerWirelessType;
/*     */ 
/*     */   @XmlElement(name="PrintingMediaType")
/*     */   protected PrintingMediaTypeValues printingMediaType;
/*     */ 
/*     */   @XmlElement(name="PrintingTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String printingTechnology;
/*     */ 
/*     */   @XmlElement(name="ScanRate")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String scanRate;
/*     */ 
/*     */   @XmlElement(name="ScannerResolution")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String scannerResolution;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 136 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 148 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getHasGreyScale()
/*     */   {
/* 160 */     return this.hasGreyScale;
/*     */   }
/*     */ 
/*     */   public void setHasGreyScale(String value)
/*     */   {
/* 172 */     this.hasGreyScale = value;
/*     */   }
/*     */ 
/*     */   public String getLightSourceType()
/*     */   {
/* 184 */     return this.lightSourceType;
/*     */   }
/*     */ 
/*     */   public void setLightSourceType(String value)
/*     */   {
/* 196 */     this.lightSourceType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxInputSheetCapacity()
/*     */   {
/* 208 */     return this.maxInputSheetCapacity;
/*     */   }
/*     */ 
/*     */   public void setMaxInputSheetCapacity(BigInteger value)
/*     */   {
/* 220 */     this.maxInputSheetCapacity = value;
/*     */   }
/*     */ 
/*     */   public String getMaxPrintResolutionBlackWhite()
/*     */   {
/* 232 */     return this.maxPrintResolutionBlackWhite;
/*     */   }
/*     */ 
/*     */   public void setMaxPrintResolutionBlackWhite(String value)
/*     */   {
/* 244 */     this.maxPrintResolutionBlackWhite = value;
/*     */   }
/*     */ 
/*     */   public String getMaxPrintResolutionColor()
/*     */   {
/* 256 */     return this.maxPrintResolutionColor;
/*     */   }
/*     */ 
/*     */   public void setMaxPrintResolutionColor(String value)
/*     */   {
/* 268 */     this.maxPrintResolutionColor = value;
/*     */   }
/*     */ 
/*     */   public String getMaxPrintSpeedBlackWhite()
/*     */   {
/* 280 */     return this.maxPrintSpeedBlackWhite;
/*     */   }
/*     */ 
/*     */   public void setMaxPrintSpeedBlackWhite(String value)
/*     */   {
/* 292 */     this.maxPrintSpeedBlackWhite = value;
/*     */   }
/*     */ 
/*     */   public String getMaxPrintSpeedColor()
/*     */   {
/* 304 */     return this.maxPrintSpeedColor;
/*     */   }
/*     */ 
/*     */   public void setMaxPrintSpeedColor(String value)
/*     */   {
/* 316 */     this.maxPrintSpeedColor = value;
/*     */   }
/*     */ 
/*     */   public String getMaxScanningSize()
/*     */   {
/* 328 */     return this.maxScanningSize;
/*     */   }
/*     */ 
/*     */   public void setMaxScanningSize(String value)
/*     */   {
/* 340 */     this.maxScanningSize = value;
/*     */   }
/*     */ 
/*     */   public String getMinScanningSize()
/*     */   {
/* 352 */     return this.minScanningSize;
/*     */   }
/*     */ 
/*     */   public void setMinScanningSize(String value)
/*     */   {
/* 364 */     this.minScanningSize = value;
/*     */   }
/*     */ 
/*     */   public String getPrinterMediaSizeMaximum()
/*     */   {
/* 376 */     return this.printerMediaSizeMaximum;
/*     */   }
/*     */ 
/*     */   public void setPrinterMediaSizeMaximum(String value)
/*     */   {
/* 388 */     this.printerMediaSizeMaximum = value;
/*     */   }
/*     */ 
/*     */   public String getPrinterOutputType()
/*     */   {
/* 400 */     return this.printerOutputType;
/*     */   }
/*     */ 
/*     */   public void setPrinterOutputType(String value)
/*     */   {
/* 412 */     this.printerOutputType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getPrinterWirelessType()
/*     */   {
/* 438 */     if (this.printerWirelessType == null) {
/* 439 */       this.printerWirelessType = new ArrayList();
/*     */     }
/* 441 */     return this.printerWirelessType;
/*     */   }
/*     */ 
/*     */   public PrintingMediaTypeValues getPrintingMediaType()
/*     */   {
/* 453 */     return this.printingMediaType;
/*     */   }
/*     */ 
/*     */   public void setPrintingMediaType(PrintingMediaTypeValues value)
/*     */   {
/* 465 */     this.printingMediaType = value;
/*     */   }
/*     */ 
/*     */   public String getPrintingTechnology()
/*     */   {
/* 477 */     return this.printingTechnology;
/*     */   }
/*     */ 
/*     */   public void setPrintingTechnology(String value)
/*     */   {
/* 489 */     this.printingTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getScanRate()
/*     */   {
/* 501 */     return this.scanRate;
/*     */   }
/*     */ 
/*     */   public void setScanRate(String value)
/*     */   {
/* 513 */     this.scanRate = value;
/*     */   }
/*     */ 
/*     */   public String getScannerResolution()
/*     */   {
/* 525 */     return this.scannerResolution;
/*     */   }
/*     */ 
/*     */   public void setScannerResolution(String value)
/*     */   {
/* 537 */     this.scannerResolution = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 549 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 561 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Scanner
 * JD-Core Version:    0.6.2
 */