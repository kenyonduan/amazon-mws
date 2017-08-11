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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "audioOutputMode", "communicationInterface", "digitalAudioCapacity", "frequencyRange", "inputType", "maximumOperatingDistance", "memorySlotsAvailable", "modelNumber", "movementDetectionTechnology", "numberOfSatelliteSpeakers", "outputWattage", "recordingCapacity", "remoteIncluded", "speakerDiameter", "speakerOutputChannelQuantity", "speakersMaximumOutputPower", "speakersNominalOutputPower", "speakerSurroundSoundChannelConfiguration", "voltage", "wattage"})
/*     */ @XmlRootElement(name="ComputerSpeaker")
/*     */ public class ComputerSpeaker
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
/*     */   @XmlElement(name="FrequencyRange")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String frequencyRange;
/*     */ 
/*     */   @XmlElement(name="InputType")
/*     */   protected InputTypeValues inputType;
/*     */ 
/*     */   @XmlElement(name="MaximumOperatingDistance")
/*     */   protected LengthIntegerDimension maximumOperatingDistance;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="MovementDetectionTechnology")
/*     */   protected Boolean movementDetectionTechnology;
/*     */ 
/*     */   @XmlElement(name="NumberOfSatelliteSpeakers")
/*     */   protected BigDecimal numberOfSatelliteSpeakers;
/*     */ 
/*     */   @XmlElement(name="OutputWattage")
/*     */   protected BigInteger outputWattage;
/*     */ 
/*     */   @XmlElement(name="RecordingCapacity")
/*     */   protected TimeIntegerDimension recordingCapacity;
/*     */ 
/*     */   @XmlElement(name="RemoteIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String remoteIncluded;
/*     */ 
/*     */   @XmlElement(name="SpeakerDiameter")
/*     */   protected LengthDimension speakerDiameter;
/*     */ 
/*     */   @XmlElement(name="SpeakerOutputChannelQuantity")
/*     */   protected BigInteger speakerOutputChannelQuantity;
/*     */ 
/*     */   @XmlElement(name="SpeakersMaximumOutputPower")
/*     */   protected WattageDimension speakersMaximumOutputPower;
/*     */ 
/*     */   @XmlElement(name="SpeakersNominalOutputPower")
/*     */   protected WattageDimension speakersNominalOutputPower;
/*     */ 
/*     */   @XmlElement(name="SpeakerSurroundSoundChannelConfiguration")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String speakerSurroundSoundChannelConfiguration;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 146 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 158 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 170 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 182 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getAudioOutputMode()
/*     */   {
/* 194 */     return this.audioOutputMode;
/*     */   }
/*     */ 
/*     */   public void setAudioOutputMode(String value)
/*     */   {
/* 206 */     this.audioOutputMode = value;
/*     */   }
/*     */ 
/*     */   public String getCommunicationInterface()
/*     */   {
/* 218 */     return this.communicationInterface;
/*     */   }
/*     */ 
/*     */   public void setCommunicationInterface(String value)
/*     */   {
/* 230 */     this.communicationInterface = value;
/*     */   }
/*     */ 
/*     */   public String getDigitalAudioCapacity()
/*     */   {
/* 242 */     return this.digitalAudioCapacity;
/*     */   }
/*     */ 
/*     */   public void setDigitalAudioCapacity(String value)
/*     */   {
/* 254 */     this.digitalAudioCapacity = value;
/*     */   }
/*     */ 
/*     */   public String getFrequencyRange()
/*     */   {
/* 266 */     return this.frequencyRange;
/*     */   }
/*     */ 
/*     */   public void setFrequencyRange(String value)
/*     */   {
/* 278 */     this.frequencyRange = value;
/*     */   }
/*     */ 
/*     */   public InputTypeValues getInputType()
/*     */   {
/* 290 */     return this.inputType;
/*     */   }
/*     */ 
/*     */   public void setInputType(InputTypeValues value)
/*     */   {
/* 302 */     this.inputType = value;
/*     */   }
/*     */ 
/*     */   public LengthIntegerDimension getMaximumOperatingDistance()
/*     */   {
/* 314 */     return this.maximumOperatingDistance;
/*     */   }
/*     */ 
/*     */   public void setMaximumOperatingDistance(LengthIntegerDimension value)
/*     */   {
/* 326 */     this.maximumOperatingDistance = value;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 338 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 350 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 362 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 374 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public Boolean isMovementDetectionTechnology()
/*     */   {
/* 386 */     return this.movementDetectionTechnology;
/*     */   }
/*     */ 
/*     */   public void setMovementDetectionTechnology(Boolean value)
/*     */   {
/* 398 */     this.movementDetectionTechnology = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getNumberOfSatelliteSpeakers()
/*     */   {
/* 410 */     return this.numberOfSatelliteSpeakers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSatelliteSpeakers(BigDecimal value)
/*     */   {
/* 422 */     this.numberOfSatelliteSpeakers = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getOutputWattage()
/*     */   {
/* 434 */     return this.outputWattage;
/*     */   }
/*     */ 
/*     */   public void setOutputWattage(BigInteger value)
/*     */   {
/* 446 */     this.outputWattage = value;
/*     */   }
/*     */ 
/*     */   public TimeIntegerDimension getRecordingCapacity()
/*     */   {
/* 458 */     return this.recordingCapacity;
/*     */   }
/*     */ 
/*     */   public void setRecordingCapacity(TimeIntegerDimension value)
/*     */   {
/* 470 */     this.recordingCapacity = value;
/*     */   }
/*     */ 
/*     */   public String getRemoteIncluded()
/*     */   {
/* 482 */     return this.remoteIncluded;
/*     */   }
/*     */ 
/*     */   public void setRemoteIncluded(String value)
/*     */   {
/* 494 */     this.remoteIncluded = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getSpeakerDiameter()
/*     */   {
/* 506 */     return this.speakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setSpeakerDiameter(LengthDimension value)
/*     */   {
/* 518 */     this.speakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getSpeakerOutputChannelQuantity()
/*     */   {
/* 530 */     return this.speakerOutputChannelQuantity;
/*     */   }
/*     */ 
/*     */   public void setSpeakerOutputChannelQuantity(BigInteger value)
/*     */   {
/* 542 */     this.speakerOutputChannelQuantity = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getSpeakersMaximumOutputPower()
/*     */   {
/* 554 */     return this.speakersMaximumOutputPower;
/*     */   }
/*     */ 
/*     */   public void setSpeakersMaximumOutputPower(WattageDimension value)
/*     */   {
/* 566 */     this.speakersMaximumOutputPower = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getSpeakersNominalOutputPower()
/*     */   {
/* 578 */     return this.speakersNominalOutputPower;
/*     */   }
/*     */ 
/*     */   public void setSpeakersNominalOutputPower(WattageDimension value)
/*     */   {
/* 590 */     this.speakersNominalOutputPower = value;
/*     */   }
/*     */ 
/*     */   public String getSpeakerSurroundSoundChannelConfiguration()
/*     */   {
/* 602 */     return this.speakerSurroundSoundChannelConfiguration;
/*     */   }
/*     */ 
/*     */   public void setSpeakerSurroundSoundChannelConfiguration(String value)
/*     */   {
/* 614 */     this.speakerSurroundSoundChannelConfiguration = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 626 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 638 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 650 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 662 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerSpeaker
 * JD-Core Version:    0.6.2
 */