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
/*     */ @XmlRootElement(name="Printer")
/*     */ public class Printer
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
/*     */   protected BigInteger maxPrintSpeedBlackWhite;
/*     */ 
/*     */   @XmlElement(name="MaxPrintSpeedColor")
/*     */   protected BigInteger maxPrintSpeedColor;
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
/* 134 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 146 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getHasGreyScale()
/*     */   {
/* 158 */     return this.hasGreyScale;
/*     */   }
/*     */ 
/*     */   public void setHasGreyScale(String value)
/*     */   {
/* 170 */     this.hasGreyScale = value;
/*     */   }
/*     */ 
/*     */   public String getLightSourceType()
/*     */   {
/* 182 */     return this.lightSourceType;
/*     */   }
/*     */ 
/*     */   public void setLightSourceType(String value)
/*     */   {
/* 194 */     this.lightSourceType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxInputSheetCapacity()
/*     */   {
/* 206 */     return this.maxInputSheetCapacity;
/*     */   }
/*     */ 
/*     */   public void setMaxInputSheetCapacity(BigInteger value)
/*     */   {
/* 218 */     this.maxInputSheetCapacity = value;
/*     */   }
/*     */ 
/*     */   public String getMaxPrintResolutionBlackWhite()
/*     */   {
/* 230 */     return this.maxPrintResolutionBlackWhite;
/*     */   }
/*     */ 
/*     */   public void setMaxPrintResolutionBlackWhite(String value)
/*     */   {
/* 242 */     this.maxPrintResolutionBlackWhite = value;
/*     */   }
/*     */ 
/*     */   public String getMaxPrintResolutionColor()
/*     */   {
/* 254 */     return this.maxPrintResolutionColor;
/*     */   }
/*     */ 
/*     */   public void setMaxPrintResolutionColor(String value)
/*     */   {
/* 266 */     this.maxPrintResolutionColor = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxPrintSpeedBlackWhite()
/*     */   {
/* 278 */     return this.maxPrintSpeedBlackWhite;
/*     */   }
/*     */ 
/*     */   public void setMaxPrintSpeedBlackWhite(BigInteger value)
/*     */   {
/* 290 */     this.maxPrintSpeedBlackWhite = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxPrintSpeedColor()
/*     */   {
/* 302 */     return this.maxPrintSpeedColor;
/*     */   }
/*     */ 
/*     */   public void setMaxPrintSpeedColor(BigInteger value)
/*     */   {
/* 314 */     this.maxPrintSpeedColor = value;
/*     */   }
/*     */ 
/*     */   public String getMaxScanningSize()
/*     */   {
/* 326 */     return this.maxScanningSize;
/*     */   }
/*     */ 
/*     */   public void setMaxScanningSize(String value)
/*     */   {
/* 338 */     this.maxScanningSize = value;
/*     */   }
/*     */ 
/*     */   public String getMinScanningSize()
/*     */   {
/* 350 */     return this.minScanningSize;
/*     */   }
/*     */ 
/*     */   public void setMinScanningSize(String value)
/*     */   {
/* 362 */     this.minScanningSize = value;
/*     */   }
/*     */ 
/*     */   public String getPrinterMediaSizeMaximum()
/*     */   {
/* 374 */     return this.printerMediaSizeMaximum;
/*     */   }
/*     */ 
/*     */   public void setPrinterMediaSizeMaximum(String value)
/*     */   {
/* 386 */     this.printerMediaSizeMaximum = value;
/*     */   }
/*     */ 
/*     */   public String getPrinterOutputType()
/*     */   {
/* 398 */     return this.printerOutputType;
/*     */   }
/*     */ 
/*     */   public void setPrinterOutputType(String value)
/*     */   {
/* 410 */     this.printerOutputType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getPrinterWirelessType()
/*     */   {
/* 436 */     if (this.printerWirelessType == null) {
/* 437 */       this.printerWirelessType = new ArrayList();
/*     */     }
/* 439 */     return this.printerWirelessType;
/*     */   }
/*     */ 
/*     */   public PrintingMediaTypeValues getPrintingMediaType()
/*     */   {
/* 451 */     return this.printingMediaType;
/*     */   }
/*     */ 
/*     */   public void setPrintingMediaType(PrintingMediaTypeValues value)
/*     */   {
/* 463 */     this.printingMediaType = value;
/*     */   }
/*     */ 
/*     */   public String getPrintingTechnology()
/*     */   {
/* 475 */     return this.printingTechnology;
/*     */   }
/*     */ 
/*     */   public void setPrintingTechnology(String value)
/*     */   {
/* 487 */     this.printingTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getScanRate()
/*     */   {
/* 499 */     return this.scanRate;
/*     */   }
/*     */ 
/*     */   public void setScanRate(String value)
/*     */   {
/* 511 */     this.scanRate = value;
/*     */   }
/*     */ 
/*     */   public String getScannerResolution()
/*     */   {
/* 523 */     return this.scannerResolution;
/*     */   }
/*     */ 
/*     */   public void setScannerResolution(String value)
/*     */   {
/* 535 */     this.scannerResolution = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 547 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 559 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Printer
 * JD-Core Version:    0.6.2
 */