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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "bundledSoftware", "channels", "lineIn", "modelNumber", "opticalIn", "opticalOut", "sampleRate", "soundCardInterface", "soundCardMinSystemRequirements", "speakerOut", "voltage", "wattage"})
/*     */ @XmlRootElement(name="SoundCard")
/*     */ public class SoundCard
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="BundledSoftware")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String bundledSoftware;
/*     */ 
/*     */   @XmlElement(name="Channels")
/*     */   protected BigDecimal channels;
/*     */ 
/*     */   @XmlElement(name="LineIn")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String lineIn;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="OpticalIn")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String opticalIn;
/*     */ 
/*     */   @XmlElement(name="OpticalOut")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String opticalOut;
/*     */ 
/*     */   @XmlElement(name="SampleRate")
/*     */   protected FrequencyThreeDigitIntegerDimension sampleRate;
/*     */ 
/*     */   @XmlElement(name="SoundCardInterface")
/*     */   protected SoundCardInterfaceTypeValues soundCardInterface;
/*     */ 
/*     */   @XmlElement(name="SoundCardMinSystemRequirements")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String soundCardMinSystemRequirements;
/*     */ 
/*     */   @XmlElement(name="SpeakerOut")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String speakerOut;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 113 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 125 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 137 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 149 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getBundledSoftware()
/*     */   {
/* 161 */     return this.bundledSoftware;
/*     */   }
/*     */ 
/*     */   public void setBundledSoftware(String value)
/*     */   {
/* 173 */     this.bundledSoftware = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getChannels()
/*     */   {
/* 185 */     return this.channels;
/*     */   }
/*     */ 
/*     */   public void setChannels(BigDecimal value)
/*     */   {
/* 197 */     this.channels = value;
/*     */   }
/*     */ 
/*     */   public String getLineIn()
/*     */   {
/* 209 */     return this.lineIn;
/*     */   }
/*     */ 
/*     */   public void setLineIn(String value)
/*     */   {
/* 221 */     this.lineIn = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 233 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 245 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getOpticalIn()
/*     */   {
/* 257 */     return this.opticalIn;
/*     */   }
/*     */ 
/*     */   public void setOpticalIn(String value)
/*     */   {
/* 269 */     this.opticalIn = value;
/*     */   }
/*     */ 
/*     */   public String getOpticalOut()
/*     */   {
/* 281 */     return this.opticalOut;
/*     */   }
/*     */ 
/*     */   public void setOpticalOut(String value)
/*     */   {
/* 293 */     this.opticalOut = value;
/*     */   }
/*     */ 
/*     */   public FrequencyThreeDigitIntegerDimension getSampleRate()
/*     */   {
/* 305 */     return this.sampleRate;
/*     */   }
/*     */ 
/*     */   public void setSampleRate(FrequencyThreeDigitIntegerDimension value)
/*     */   {
/* 317 */     this.sampleRate = value;
/*     */   }
/*     */ 
/*     */   public SoundCardInterfaceTypeValues getSoundCardInterface()
/*     */   {
/* 329 */     return this.soundCardInterface;
/*     */   }
/*     */ 
/*     */   public void setSoundCardInterface(SoundCardInterfaceTypeValues value)
/*     */   {
/* 341 */     this.soundCardInterface = value;
/*     */   }
/*     */ 
/*     */   public String getSoundCardMinSystemRequirements()
/*     */   {
/* 353 */     return this.soundCardMinSystemRequirements;
/*     */   }
/*     */ 
/*     */   public void setSoundCardMinSystemRequirements(String value)
/*     */   {
/* 365 */     this.soundCardMinSystemRequirements = value;
/*     */   }
/*     */ 
/*     */   public String getSpeakerOut()
/*     */   {
/* 377 */     return this.speakerOut;
/*     */   }
/*     */ 
/*     */   public void setSpeakerOut(String value)
/*     */   {
/* 389 */     this.speakerOut = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 401 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 413 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 425 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 437 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SoundCard
 * JD-Core Version:    0.6.2
 */