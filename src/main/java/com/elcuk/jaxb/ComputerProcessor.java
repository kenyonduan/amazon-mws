/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "cacheMemory", "modelNumber", "processorBrand", "processorCoolingDevice", "processorCount", "processorSeries", "processorSocket", "processorSpeed"})
/*     */ @XmlRootElement(name="ComputerProcessor")
/*     */ public class ComputerProcessor
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="CacheMemory")
/*     */   protected MemorySizeIntegerDimension cacheMemory;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="ProcessorBrand")
/*     */   protected String processorBrand;
/*     */ 
/*     */   @XmlElement(name="ProcessorCoolingDevice")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String processorCoolingDevice;
/*     */ 
/*     */   @XmlElement(name="ProcessorCount")
/*     */   protected BigInteger processorCount;
/*     */ 
/*     */   @XmlElement(name="ProcessorSeries")
/*     */   protected ProcessorSeriesTypeValues processorSeries;
/*     */ 
/*     */   @XmlElement(name="ProcessorSocket")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String processorSocket;
/*     */ 
/*     */   @XmlElement(name="ProcessorSpeed")
/*     */   protected FrequencyDimension processorSpeed;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/*  92 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 104 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 116 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 128 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeIntegerDimension getCacheMemory()
/*     */   {
/* 140 */     return this.cacheMemory;
/*     */   }
/*     */ 
/*     */   public void setCacheMemory(MemorySizeIntegerDimension value)
/*     */   {
/* 152 */     this.cacheMemory = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 164 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 176 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorBrand()
/*     */   {
/* 188 */     return this.processorBrand;
/*     */   }
/*     */ 
/*     */   public void setProcessorBrand(String value)
/*     */   {
/* 200 */     this.processorBrand = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorCoolingDevice()
/*     */   {
/* 212 */     return this.processorCoolingDevice;
/*     */   }
/*     */ 
/*     */   public void setProcessorCoolingDevice(String value)
/*     */   {
/* 224 */     this.processorCoolingDevice = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getProcessorCount()
/*     */   {
/* 236 */     return this.processorCount;
/*     */   }
/*     */ 
/*     */   public void setProcessorCount(BigInteger value)
/*     */   {
/* 248 */     this.processorCount = value;
/*     */   }
/*     */ 
/*     */   public ProcessorSeriesTypeValues getProcessorSeries()
/*     */   {
/* 260 */     return this.processorSeries;
/*     */   }
/*     */ 
/*     */   public void setProcessorSeries(ProcessorSeriesTypeValues value)
/*     */   {
/* 272 */     this.processorSeries = value;
/*     */   }
/*     */ 
/*     */   public String getProcessorSocket()
/*     */   {
/* 284 */     return this.processorSocket;
/*     */   }
/*     */ 
/*     */   public void setProcessorSocket(String value)
/*     */   {
/* 296 */     this.processorSocket = value;
/*     */   }
/*     */ 
/*     */   public FrequencyDimension getProcessorSpeed()
/*     */   {
/* 308 */     return this.processorSpeed;
/*     */   }
/*     */ 
/*     */   public void setProcessorSpeed(FrequencyDimension value)
/*     */   {
/* 320 */     this.processorSpeed = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerProcessor
 * JD-Core Version:    0.6.2
 */