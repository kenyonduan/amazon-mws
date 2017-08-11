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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "audioOutputMode", "communicationInterface", "digitalAudioCapacity", "memoryCardType", "modelNumber", "movementDetectionTechnology", "recordingCapacity", "speedClassRating", "voltage", "wattage", "wirelessStandard"})
/*     */ @XmlRootElement(name="FlashMemory")
/*     */ public class FlashMemory
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="AudioOutputMode")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String audioOutputMode;
/*     */ 
/*     */   @XmlElement(name="CommunicationInterface")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String communicationInterface;
/*     */ 
/*     */   @XmlElement(name="DigitalAudioCapacity")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String digitalAudioCapacity;
/*     */ 
/*     */   @XmlElement(name="MemoryCardType")
/*     */   protected MemoryCardTypeValues memoryCardType;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="MovementDetectionTechnology")
/*     */   protected Boolean movementDetectionTechnology;
/*     */ 
/*     */   @XmlElement(name="RecordingCapacity")
/*     */   protected TimeIntegerDimension recordingCapacity;
/*     */ 
/*     */   @XmlElement(name="SpeedClassRating")
/*     */   protected SpeedClassRatingTypeValues speedClassRating;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   @XmlElement(name="WirelessStandard")
/*     */   protected String wirelessStandard;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 106 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 118 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 130 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 142 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getAudioOutputMode()
/*     */   {
/* 154 */     return this.audioOutputMode;
/*     */   }
/*     */ 
/*     */   public void setAudioOutputMode(String value)
/*     */   {
/* 166 */     this.audioOutputMode = value;
/*     */   }
/*     */ 
/*     */   public String getCommunicationInterface()
/*     */   {
/* 178 */     return this.communicationInterface;
/*     */   }
/*     */ 
/*     */   public void setCommunicationInterface(String value)
/*     */   {
/* 190 */     this.communicationInterface = value;
/*     */   }
/*     */ 
/*     */   public String getDigitalAudioCapacity()
/*     */   {
/* 202 */     return this.digitalAudioCapacity;
/*     */   }
/*     */ 
/*     */   public void setDigitalAudioCapacity(String value)
/*     */   {
/* 214 */     this.digitalAudioCapacity = value;
/*     */   }
/*     */ 
/*     */   public MemoryCardTypeValues getMemoryCardType()
/*     */   {
/* 226 */     return this.memoryCardType;
/*     */   }
/*     */ 
/*     */   public void setMemoryCardType(MemoryCardTypeValues value)
/*     */   {
/* 238 */     this.memoryCardType = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 250 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 262 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public Boolean isMovementDetectionTechnology()
/*     */   {
/* 274 */     return this.movementDetectionTechnology;
/*     */   }
/*     */ 
/*     */   public void setMovementDetectionTechnology(Boolean value)
/*     */   {
/* 286 */     this.movementDetectionTechnology = value;
/*     */   }
/*     */ 
/*     */   public TimeIntegerDimension getRecordingCapacity()
/*     */   {
/* 298 */     return this.recordingCapacity;
/*     */   }
/*     */ 
/*     */   public void setRecordingCapacity(TimeIntegerDimension value)
/*     */   {
/* 310 */     this.recordingCapacity = value;
/*     */   }
/*     */ 
/*     */   public SpeedClassRatingTypeValues getSpeedClassRating()
/*     */   {
/* 322 */     return this.speedClassRating;
/*     */   }
/*     */ 
/*     */   public void setSpeedClassRating(SpeedClassRatingTypeValues value)
/*     */   {
/* 334 */     this.speedClassRating = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 346 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 358 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 370 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 382 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public String getWirelessStandard()
/*     */   {
/* 394 */     return this.wirelessStandard;
/*     */   }
/*     */ 
/*     */   public void setWirelessStandard(String value)
/*     */   {
/* 406 */     this.wirelessStandard = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.FlashMemory
 * JD-Core Version:    0.6.2
 */