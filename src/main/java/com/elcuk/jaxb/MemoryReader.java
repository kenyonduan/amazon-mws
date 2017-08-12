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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "audioOutputMode", "cardReaderInterface", "communicationInterface", "compatibleMemoryCard", "digitalAudioCapacity", "modelNumber", "movementDetectionTechnology", "readSpeed", "recordingCapacity", "speedClassRating", "voltage", "wattage", "wirelessStandard", "writeSpeed"})
/*     */ @XmlRootElement(name="MemoryReader")
/*     */ public class MemoryReader
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
/*     */   @XmlElement(name="CardReaderInterface")
/*     */   protected CardReaderInterfaceTypeValues cardReaderInterface;
/*     */ 
/*     */   @XmlElement(name="CommunicationInterface")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String communicationInterface;
/*     */ 
/*     */   @XmlElement(name="CompatibleMemoryCard")
/*     */   protected List<CompatibleMemoryCardTypeValues> compatibleMemoryCard;
/*     */ 
/*     */   @XmlElement(name="DigitalAudioCapacity")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String digitalAudioCapacity;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="MovementDetectionTechnology")
/*     */   protected Boolean movementDetectionTechnology;
/*     */ 
/*     */   @XmlElement(name="ReadSpeed")
/*     */   protected DataTransferSpeedIntegerDimension readSpeed;
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
/*     */   @XmlElement(name="WriteSpeed")
/*     */   protected DataTransferSpeedTenIntegerDimension writeSpeed;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 120 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 132 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 144 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 156 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getAudioOutputMode()
/*     */   {
/* 168 */     return this.audioOutputMode;
/*     */   }
/*     */ 
/*     */   public void setAudioOutputMode(String value)
/*     */   {
/* 180 */     this.audioOutputMode = value;
/*     */   }
/*     */ 
/*     */   public CardReaderInterfaceTypeValues getCardReaderInterface()
/*     */   {
/* 192 */     return this.cardReaderInterface;
/*     */   }
/*     */ 
/*     */   public void setCardReaderInterface(CardReaderInterfaceTypeValues value)
/*     */   {
/* 204 */     this.cardReaderInterface = value;
/*     */   }
/*     */ 
/*     */   public String getCommunicationInterface()
/*     */   {
/* 216 */     return this.communicationInterface;
/*     */   }
/*     */ 
/*     */   public void setCommunicationInterface(String value)
/*     */   {
/* 228 */     this.communicationInterface = value;
/*     */   }
/*     */ 
/*     */   public List<CompatibleMemoryCardTypeValues> getCompatibleMemoryCard()
/*     */   {
/* 254 */     if (this.compatibleMemoryCard == null) {
/* 255 */       this.compatibleMemoryCard = new ArrayList();
/*     */     }
/* 257 */     return this.compatibleMemoryCard;
/*     */   }
/*     */ 
/*     */   public String getDigitalAudioCapacity()
/*     */   {
/* 269 */     return this.digitalAudioCapacity;
/*     */   }
/*     */ 
/*     */   public void setDigitalAudioCapacity(String value)
/*     */   {
/* 281 */     this.digitalAudioCapacity = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 293 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 305 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public Boolean isMovementDetectionTechnology()
/*     */   {
/* 317 */     return this.movementDetectionTechnology;
/*     */   }
/*     */ 
/*     */   public void setMovementDetectionTechnology(Boolean value)
/*     */   {
/* 329 */     this.movementDetectionTechnology = value;
/*     */   }
/*     */ 
/*     */   public DataTransferSpeedIntegerDimension getReadSpeed()
/*     */   {
/* 341 */     return this.readSpeed;
/*     */   }
/*     */ 
/*     */   public void setReadSpeed(DataTransferSpeedIntegerDimension value)
/*     */   {
/* 353 */     this.readSpeed = value;
/*     */   }
/*     */ 
/*     */   public TimeIntegerDimension getRecordingCapacity()
/*     */   {
/* 365 */     return this.recordingCapacity;
/*     */   }
/*     */ 
/*     */   public void setRecordingCapacity(TimeIntegerDimension value)
/*     */   {
/* 377 */     this.recordingCapacity = value;
/*     */   }
/*     */ 
/*     */   public SpeedClassRatingTypeValues getSpeedClassRating()
/*     */   {
/* 389 */     return this.speedClassRating;
/*     */   }
/*     */ 
/*     */   public void setSpeedClassRating(SpeedClassRatingTypeValues value)
/*     */   {
/* 401 */     this.speedClassRating = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 413 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 425 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 437 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 449 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public String getWirelessStandard()
/*     */   {
/* 461 */     return this.wirelessStandard;
/*     */   }
/*     */ 
/*     */   public void setWirelessStandard(String value)
/*     */   {
/* 473 */     this.wirelessStandard = value;
/*     */   }
/*     */ 
/*     */   public DataTransferSpeedTenIntegerDimension getWriteSpeed()
/*     */   {
/* 485 */     return this.writeSpeed;
/*     */   }
/*     */ 
/*     */   public void setWriteSpeed(DataTransferSpeedTenIntegerDimension value)
/*     */   {
/* 497 */     this.writeSpeed = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MemoryReader
 * JD-Core Version:    0.6.2
 */