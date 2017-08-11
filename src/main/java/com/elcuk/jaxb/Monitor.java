/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
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
/*     */ @XmlType(name="", propOrder={"variationData", "builtinSpeaker", "contrastRatio", "displayResolutionMaximum", "displayTechnology", "hasColorScreen", "modelNumber", "monitorTunerTechnology", "monitorBrightness", "monitorConnectors", "responseTime", "screenResolution", "screenSize", "tunerTechnology", "viewingAngle", "voltage", "wattage", "efficiency"})
/*     */ @XmlRootElement(name="Monitor")
/*     */ public class Monitor
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="BuiltinSpeaker")
/*     */   protected BigInteger builtinSpeaker;
/*     */ 
/*     */   @XmlElement(name="ContrastRatio")
/*     */   protected String contrastRatio;
/*     */ 
/*     */   @XmlElement(name="DisplayResolutionMaximum")
/*     */   protected String displayResolutionMaximum;
/*     */ 
/*     */   @XmlElement(name="DisplayTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String displayTechnology;
/*     */ 
/*     */   @XmlElement(name="HasColorScreen")
/*     */   protected Boolean hasColorScreen;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="MonitorTunerTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String monitorTunerTechnology;
/*     */ 
/*     */   @XmlElement(name="MonitorBrightness")
/*     */   protected LuminanceFiveDigitDimension monitorBrightness;
/*     */ 
/*     */   @XmlElement(name="MonitorConnectors")
/*     */   protected List<MonitorConnectorsTypeValues> monitorConnectors;
/*     */ 
/*     */   @XmlElement(name="ResponseTime")
/*     */   protected BigInteger responseTime;
/*     */ 
/*     */   @XmlElement(name="ScreenResolution")
/*     */   protected String screenResolution;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="TunerTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String tunerTechnology;
/*     */ 
/*     */   @XmlElement(name="ViewingAngle")
/*     */   protected BigInteger viewingAngle;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 128 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 140 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBuiltinSpeaker()
/*     */   {
/* 152 */     return this.builtinSpeaker;
/*     */   }
/*     */ 
/*     */   public void setBuiltinSpeaker(BigInteger value)
/*     */   {
/* 164 */     this.builtinSpeaker = value;
/*     */   }
/*     */ 
/*     */   public String getContrastRatio()
/*     */   {
/* 176 */     return this.contrastRatio;
/*     */   }
/*     */ 
/*     */   public void setContrastRatio(String value)
/*     */   {
/* 188 */     this.contrastRatio = value;
/*     */   }
/*     */ 
/*     */   public String getDisplayResolutionMaximum()
/*     */   {
/* 200 */     return this.displayResolutionMaximum;
/*     */   }
/*     */ 
/*     */   public void setDisplayResolutionMaximum(String value)
/*     */   {
/* 212 */     this.displayResolutionMaximum = value;
/*     */   }
/*     */ 
/*     */   public String getDisplayTechnology()
/*     */   {
/* 224 */     return this.displayTechnology;
/*     */   }
/*     */ 
/*     */   public void setDisplayTechnology(String value)
/*     */   {
/* 236 */     this.displayTechnology = value;
/*     */   }
/*     */ 
/*     */   public Boolean isHasColorScreen()
/*     */   {
/* 248 */     return this.hasColorScreen;
/*     */   }
/*     */ 
/*     */   public void setHasColorScreen(Boolean value)
/*     */   {
/* 260 */     this.hasColorScreen = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 272 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 284 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getMonitorTunerTechnology()
/*     */   {
/* 296 */     return this.monitorTunerTechnology;
/*     */   }
/*     */ 
/*     */   public void setMonitorTunerTechnology(String value)
/*     */   {
/* 308 */     this.monitorTunerTechnology = value;
/*     */   }
/*     */ 
/*     */   public LuminanceFiveDigitDimension getMonitorBrightness()
/*     */   {
/* 320 */     return this.monitorBrightness;
/*     */   }
/*     */ 
/*     */   public void setMonitorBrightness(LuminanceFiveDigitDimension value)
/*     */   {
/* 332 */     this.monitorBrightness = value;
/*     */   }
/*     */ 
/*     */   public List<MonitorConnectorsTypeValues> getMonitorConnectors()
/*     */   {
/* 358 */     if (this.monitorConnectors == null) {
/* 359 */       this.monitorConnectors = new ArrayList();
/*     */     }
/* 361 */     return this.monitorConnectors;
/*     */   }
/*     */ 
/*     */   public BigInteger getResponseTime()
/*     */   {
/* 373 */     return this.responseTime;
/*     */   }
/*     */ 
/*     */   public void setResponseTime(BigInteger value)
/*     */   {
/* 385 */     this.responseTime = value;
/*     */   }
/*     */ 
/*     */   public String getScreenResolution()
/*     */   {
/* 397 */     return this.screenResolution;
/*     */   }
/*     */ 
/*     */   public void setScreenResolution(String value)
/*     */   {
/* 409 */     this.screenResolution = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 421 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 433 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public String getTunerTechnology()
/*     */   {
/* 445 */     return this.tunerTechnology;
/*     */   }
/*     */ 
/*     */   public void setTunerTechnology(String value)
/*     */   {
/* 457 */     this.tunerTechnology = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getViewingAngle()
/*     */   {
/* 469 */     return this.viewingAngle;
/*     */   }
/*     */ 
/*     */   public void setViewingAngle(BigInteger value)
/*     */   {
/* 481 */     this.viewingAngle = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 493 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 505 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 517 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 529 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 541 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 553 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Monitor
 * JD-Core Version:    0.6.2
 */