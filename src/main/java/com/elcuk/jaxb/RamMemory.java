/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "casLatency", "computerMemoryFormFactor", "computerMemoryTechnology", "maxMemorySpeed", "memoryCapacityPerSTICK", "modelNumber", "multiChannelKit", "numberOfMemorySticks", "ramClockSpeed", "voltage", "voltageRating", "wattage"})
/*     */ @XmlRootElement(name="RamMemory")
/*     */ public class RamMemory
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="CasLatency")
/*     */   protected BigInteger casLatency;
/*     */ 
/*     */   @XmlElement(name="ComputerMemoryFormFactor")
/*     */   protected String computerMemoryFormFactor;
/*     */ 
/*     */   @XmlElement(name="ComputerMemoryTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String computerMemoryTechnology;
/*     */ 
/*     */   @XmlElement(name="MaxMemorySpeed")
/*     */   protected BigDecimal maxMemorySpeed;
/*     */ 
/*     */   @XmlElement(name="MemoryCapacityPerSTICK")
/*     */   protected MemorySizeFiveDigitIntegerDimension memoryCapacityPerSTICK;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="MultiChannelKit")
/*     */   protected BigInteger multiChannelKit;
/*     */ 
/*     */   @XmlElement(name="NumberOfMemorySticks")
/*     */   protected BigInteger numberOfMemorySticks;
/*     */ 
/*     */   @XmlElement(name="RAMClockSpeed")
/*     */   protected BigInteger ramClockSpeed;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="VoltageRating")
/*     */   protected VoltageSevenDigitDecimalDimension voltageRating;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 108 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 120 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 132 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 144 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getCasLatency()
/*     */   {
/* 156 */     return this.casLatency;
/*     */   }
/*     */ 
/*     */   public void setCasLatency(BigInteger value)
/*     */   {
/* 168 */     this.casLatency = value;
/*     */   }
/*     */ 
/*     */   public String getComputerMemoryFormFactor()
/*     */   {
/* 180 */     return this.computerMemoryFormFactor;
/*     */   }
/*     */ 
/*     */   public void setComputerMemoryFormFactor(String value)
/*     */   {
/* 192 */     this.computerMemoryFormFactor = value;
/*     */   }
/*     */ 
/*     */   public String getComputerMemoryTechnology()
/*     */   {
/* 204 */     return this.computerMemoryTechnology;
/*     */   }
/*     */ 
/*     */   public void setComputerMemoryTechnology(String value)
/*     */   {
/* 216 */     this.computerMemoryTechnology = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getMaxMemorySpeed()
/*     */   {
/* 228 */     return this.maxMemorySpeed;
/*     */   }
/*     */ 
/*     */   public void setMaxMemorySpeed(BigDecimal value)
/*     */   {
/* 240 */     this.maxMemorySpeed = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeFiveDigitIntegerDimension getMemoryCapacityPerSTICK()
/*     */   {
/* 252 */     return this.memoryCapacityPerSTICK;
/*     */   }
/*     */ 
/*     */   public void setMemoryCapacityPerSTICK(MemorySizeFiveDigitIntegerDimension value)
/*     */   {
/* 264 */     this.memoryCapacityPerSTICK = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 276 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 288 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMultiChannelKit()
/*     */   {
/* 300 */     return this.multiChannelKit;
/*     */   }
/*     */ 
/*     */   public void setMultiChannelKit(BigInteger value)
/*     */   {
/* 312 */     this.multiChannelKit = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfMemorySticks()
/*     */   {
/* 324 */     return this.numberOfMemorySticks;
/*     */   }
/*     */ 
/*     */   public void setNumberOfMemorySticks(BigInteger value)
/*     */   {
/* 336 */     this.numberOfMemorySticks = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getRAMClockSpeed()
/*     */   {
/* 348 */     return this.ramClockSpeed;
/*     */   }
/*     */ 
/*     */   public void setRAMClockSpeed(BigInteger value)
/*     */   {
/* 360 */     this.ramClockSpeed = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 372 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 384 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public VoltageSevenDigitDecimalDimension getVoltageRating()
/*     */   {
/* 396 */     return this.voltageRating;
/*     */   }
/*     */ 
/*     */   public void setVoltageRating(VoltageSevenDigitDecimalDimension value)
/*     */   {
/* 408 */     this.voltageRating = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 420 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 432 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.RamMemory
 * JD-Core Version:    0.6.2
 */