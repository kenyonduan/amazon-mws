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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "coolingType", "cpuSocketCompatability", "fanIncluded", "fanLED", "fanMaximumAirflow", "fanMaximumNoiseLevel", "fanMaximumSpeed", "fanPowerConnector", "heatsinkMaterial", "largestFanSize", "modelNumber"})
/*     */ @XmlRootElement(name="ComputerCoolingDevice")
/*     */ public class ComputerCoolingDevice
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="CoolingType")
/*     */   protected String coolingType;
/*     */ 
/*     */   @XmlElement(name="CPUSocketCompatability")
/*     */   protected List<String> cpuSocketCompatability;
/*     */ 
/*     */   @XmlElement(name="FanIncluded")
/*     */   protected BigInteger fanIncluded;
/*     */ 
/*     */   @XmlElement(name="FanLED")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String fanLED;
/*     */ 
/*     */   @XmlElement(name="FanMaximumAirflow")
/*     */   protected AirflowDimension fanMaximumAirflow;
/*     */ 
/*     */   @XmlElement(name="FanMaximumNoiseLevel")
/*     */   protected NoiseLevelSixDigitDimension fanMaximumNoiseLevel;
/*     */ 
/*     */   @XmlElement(name="FanMaximumSpeed")
/*     */   protected SpeedSixDigitDimension fanMaximumSpeed;
/*     */ 
/*     */   @XmlElement(name="FanPowerConnector")
/*     */   protected String fanPowerConnector;
/*     */ 
/*     */   @XmlElement(name="HeatsinkMaterial")
/*     */   protected String heatsinkMaterial;
/*     */ 
/*     */   @XmlElement(name="LargestFanSize")
/*     */   protected LengthFiveDigitDimension largestFanSize;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 105 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 117 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 129 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 141 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getCoolingType()
/*     */   {
/* 153 */     return this.coolingType;
/*     */   }
/*     */ 
/*     */   public void setCoolingType(String value)
/*     */   {
/* 165 */     this.coolingType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getCPUSocketCompatability()
/*     */   {
/* 191 */     if (this.cpuSocketCompatability == null) {
/* 192 */       this.cpuSocketCompatability = new ArrayList();
/*     */     }
/* 194 */     return this.cpuSocketCompatability;
/*     */   }
/*     */ 
/*     */   public BigInteger getFanIncluded()
/*     */   {
/* 206 */     return this.fanIncluded;
/*     */   }
/*     */ 
/*     */   public void setFanIncluded(BigInteger value)
/*     */   {
/* 218 */     this.fanIncluded = value;
/*     */   }
/*     */ 
/*     */   public String getFanLED()
/*     */   {
/* 230 */     return this.fanLED;
/*     */   }
/*     */ 
/*     */   public void setFanLED(String value)
/*     */   {
/* 242 */     this.fanLED = value;
/*     */   }
/*     */ 
/*     */   public AirflowDimension getFanMaximumAirflow()
/*     */   {
/* 254 */     return this.fanMaximumAirflow;
/*     */   }
/*     */ 
/*     */   public void setFanMaximumAirflow(AirflowDimension value)
/*     */   {
/* 266 */     this.fanMaximumAirflow = value;
/*     */   }
/*     */ 
/*     */   public NoiseLevelSixDigitDimension getFanMaximumNoiseLevel()
/*     */   {
/* 278 */     return this.fanMaximumNoiseLevel;
/*     */   }
/*     */ 
/*     */   public void setFanMaximumNoiseLevel(NoiseLevelSixDigitDimension value)
/*     */   {
/* 290 */     this.fanMaximumNoiseLevel = value;
/*     */   }
/*     */ 
/*     */   public SpeedSixDigitDimension getFanMaximumSpeed()
/*     */   {
/* 302 */     return this.fanMaximumSpeed;
/*     */   }
/*     */ 
/*     */   public void setFanMaximumSpeed(SpeedSixDigitDimension value)
/*     */   {
/* 314 */     this.fanMaximumSpeed = value;
/*     */   }
/*     */ 
/*     */   public String getFanPowerConnector()
/*     */   {
/* 326 */     return this.fanPowerConnector;
/*     */   }
/*     */ 
/*     */   public void setFanPowerConnector(String value)
/*     */   {
/* 338 */     this.fanPowerConnector = value;
/*     */   }
/*     */ 
/*     */   public String getHeatsinkMaterial()
/*     */   {
/* 350 */     return this.heatsinkMaterial;
/*     */   }
/*     */ 
/*     */   public void setHeatsinkMaterial(String value)
/*     */   {
/* 362 */     this.heatsinkMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthFiveDigitDimension getLargestFanSize()
/*     */   {
/* 374 */     return this.largestFanSize;
/*     */   }
/*     */ 
/*     */   public void setLargestFanSize(LengthFiveDigitDimension value)
/*     */   {
/* 386 */     this.largestFanSize = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 398 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 410 */     this.modelNumber = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerCoolingDevice
 * JD-Core Version:    0.6.2
 */