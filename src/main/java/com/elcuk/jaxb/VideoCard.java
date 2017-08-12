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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "coreClock", "effectiveMemoryClock", "graphicsCardCooler", "graphicsCardInterface", "graphicsCardMaxResolution", "graphicsCardMemoryInterface", "graphicsCardMemoryType", "graphicsChipsetBrand", "graphicsCoProcessor", "graphicsRAMSize", "graphicsRAMType", "modelNumber", "multiGPUTechnology", "shaderClock", "threeDAPI", "totalCompositePorts", "totalDVIPorts", "totalHDMIPorts", "totalMiniHDMIPorts", "totalSVideoOutPorts", "totalVGAOutPorts", "voltage", "wattage"})
/*     */ @XmlRootElement(name="VideoCard")
/*     */ public class VideoCard
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="CoreClock")
/*     */   protected FrequencyIntegerDimension coreClock;
/*     */ 
/*     */   @XmlElement(name="EffectiveMemoryClock")
/*     */   protected FrequencyIntegerDimension effectiveMemoryClock;
/*     */ 
/*     */   @XmlElement(name="GraphicsCardCooler")
/*     */   protected String graphicsCardCooler;
/*     */ 
/*     */   @XmlElement(name="GraphicsCardInterface")
/*     */   protected List<GraphicsCardInterfaceTypeValues> graphicsCardInterface;
/*     */ 
/*     */   @XmlElement(name="GraphicsCardMaxResolution")
/*     */   protected String graphicsCardMaxResolution;
/*     */ 
/*     */   @XmlElement(name="GraphicsCardMemoryInterface")
/*     */   protected MemoryInterfaceDimension graphicsCardMemoryInterface;
/*     */ 
/*     */   @XmlElement(name="GraphicsCardMemoryType")
/*     */   protected String graphicsCardMemoryType;
/*     */ 
/*     */   @XmlElement(name="GraphicsChipsetBrand")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String graphicsChipsetBrand;
/*     */ 
/*     */   @XmlElement(name="GraphicsCoProcessor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String graphicsCoProcessor;
/*     */ 
/*     */   @XmlElement(name="GraphicsRAMSize")
/*     */   protected List<MemorySizeDimension> graphicsRAMSize;
/*     */ 
/*     */   @XmlElement(name="GraphicsRAMType")
/*     */   protected String graphicsRAMType;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="MultiGPUTechnology")
/*     */   protected String multiGPUTechnology;
/*     */ 
/*     */   @XmlElement(name="ShaderClock")
/*     */   protected FrequencyIntegerDimension shaderClock;
/*     */ 
/*     */   @XmlElement(name="ThreeDAPI")
/*     */   protected List<String> threeDAPI;
/*     */ 
/*     */   @XmlElement(name="TotalCompositePorts")
/*     */   protected BigInteger totalCompositePorts;
/*     */ 
/*     */   @XmlElement(name="TotalDVIPorts")
/*     */   protected BigInteger totalDVIPorts;
/*     */ 
/*     */   @XmlElement(name="TotalHDMIPorts")
/*     */   protected BigInteger totalHDMIPorts;
/*     */ 
/*     */   @XmlElement(name="TotalMiniHDMIPorts")
/*     */   protected BigInteger totalMiniHDMIPorts;
/*     */ 
/*     */   @XmlElement(name="TotalSVideoOutPorts")
/*     */   protected BigInteger totalSVideoOutPorts;
/*     */ 
/*     */   @XmlElement(name="TotalVGAOutPorts")
/*     */   protected BigInteger totalVGAOutPorts;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 155 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 167 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 179 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 191 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public FrequencyIntegerDimension getCoreClock()
/*     */   {
/* 203 */     return this.coreClock;
/*     */   }
/*     */ 
/*     */   public void setCoreClock(FrequencyIntegerDimension value)
/*     */   {
/* 215 */     this.coreClock = value;
/*     */   }
/*     */ 
/*     */   public FrequencyIntegerDimension getEffectiveMemoryClock()
/*     */   {
/* 227 */     return this.effectiveMemoryClock;
/*     */   }
/*     */ 
/*     */   public void setEffectiveMemoryClock(FrequencyIntegerDimension value)
/*     */   {
/* 239 */     this.effectiveMemoryClock = value;
/*     */   }
/*     */ 
/*     */   public String getGraphicsCardCooler()
/*     */   {
/* 251 */     return this.graphicsCardCooler;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCardCooler(String value)
/*     */   {
/* 263 */     this.graphicsCardCooler = value;
/*     */   }
/*     */ 
/*     */   public List<GraphicsCardInterfaceTypeValues> getGraphicsCardInterface()
/*     */   {
/* 289 */     if (this.graphicsCardInterface == null) {
/* 290 */       this.graphicsCardInterface = new ArrayList();
/*     */     }
/* 292 */     return this.graphicsCardInterface;
/*     */   }
/*     */ 
/*     */   public String getGraphicsCardMaxResolution()
/*     */   {
/* 304 */     return this.graphicsCardMaxResolution;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCardMaxResolution(String value)
/*     */   {
/* 316 */     this.graphicsCardMaxResolution = value;
/*     */   }
/*     */ 
/*     */   public MemoryInterfaceDimension getGraphicsCardMemoryInterface()
/*     */   {
/* 328 */     return this.graphicsCardMemoryInterface;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCardMemoryInterface(MemoryInterfaceDimension value)
/*     */   {
/* 340 */     this.graphicsCardMemoryInterface = value;
/*     */   }
/*     */ 
/*     */   public String getGraphicsCardMemoryType()
/*     */   {
/* 352 */     return this.graphicsCardMemoryType;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCardMemoryType(String value)
/*     */   {
/* 364 */     this.graphicsCardMemoryType = value;
/*     */   }
/*     */ 
/*     */   public String getGraphicsChipsetBrand()
/*     */   {
/* 376 */     return this.graphicsChipsetBrand;
/*     */   }
/*     */ 
/*     */   public void setGraphicsChipsetBrand(String value)
/*     */   {
/* 388 */     this.graphicsChipsetBrand = value;
/*     */   }
/*     */ 
/*     */   public String getGraphicsCoProcessor()
/*     */   {
/* 400 */     return this.graphicsCoProcessor;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCoProcessor(String value)
/*     */   {
/* 412 */     this.graphicsCoProcessor = value;
/*     */   }
/*     */ 
/*     */   public List<MemorySizeDimension> getGraphicsRAMSize()
/*     */   {
/* 438 */     if (this.graphicsRAMSize == null) {
/* 439 */       this.graphicsRAMSize = new ArrayList();
/*     */     }
/* 441 */     return this.graphicsRAMSize;
/*     */   }
/*     */ 
/*     */   public String getGraphicsRAMType()
/*     */   {
/* 453 */     return this.graphicsRAMType;
/*     */   }
/*     */ 
/*     */   public void setGraphicsRAMType(String value)
/*     */   {
/* 465 */     this.graphicsRAMType = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 477 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 489 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getMultiGPUTechnology()
/*     */   {
/* 501 */     return this.multiGPUTechnology;
/*     */   }
/*     */ 
/*     */   public void setMultiGPUTechnology(String value)
/*     */   {
/* 513 */     this.multiGPUTechnology = value;
/*     */   }
/*     */ 
/*     */   public FrequencyIntegerDimension getShaderClock()
/*     */   {
/* 525 */     return this.shaderClock;
/*     */   }
/*     */ 
/*     */   public void setShaderClock(FrequencyIntegerDimension value)
/*     */   {
/* 537 */     this.shaderClock = value;
/*     */   }
/*     */ 
/*     */   public List<String> getThreeDAPI()
/*     */   {
/* 563 */     if (this.threeDAPI == null) {
/* 564 */       this.threeDAPI = new ArrayList();
/*     */     }
/* 566 */     return this.threeDAPI;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCompositePorts()
/*     */   {
/* 578 */     return this.totalCompositePorts;
/*     */   }
/*     */ 
/*     */   public void setTotalCompositePorts(BigInteger value)
/*     */   {
/* 590 */     this.totalCompositePorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalDVIPorts()
/*     */   {
/* 602 */     return this.totalDVIPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalDVIPorts(BigInteger value)
/*     */   {
/* 614 */     this.totalDVIPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalHDMIPorts()
/*     */   {
/* 626 */     return this.totalHDMIPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalHDMIPorts(BigInteger value)
/*     */   {
/* 638 */     this.totalHDMIPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalMiniHDMIPorts()
/*     */   {
/* 650 */     return this.totalMiniHDMIPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalMiniHDMIPorts(BigInteger value)
/*     */   {
/* 662 */     this.totalMiniHDMIPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalSVideoOutPorts()
/*     */   {
/* 674 */     return this.totalSVideoOutPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalSVideoOutPorts(BigInteger value)
/*     */   {
/* 686 */     this.totalSVideoOutPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalVGAOutPorts()
/*     */   {
/* 698 */     return this.totalVGAOutPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalVGAOutPorts(BigInteger value)
/*     */   {
/* 710 */     this.totalVGAOutPorts = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 722 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 734 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 746 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 758 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.VideoCard
 * JD-Core Version:    0.6.2
 */