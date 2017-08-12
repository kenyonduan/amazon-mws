/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlAttribute;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.XmlValue;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "audioOutputMode", "chipsetType", "componentMemoryStorageCapacity", "compatibleProcessorTypes", "componentWirelessType", "communicationInterface", "componentWriteSpeed", "connectorType", "digitalAudioCapacity", "digitalMediaFormat", "effectiveInputArea", "formFactor", "handOrientation", "hasAutoFocus", "hasProgrammableButtons", "holderCapacity", "inputType", "isAmplifierIntegrated", "keyboardDescription", "materialType", "maxOperatingDistance", "maximumOperatingDistance", "memorySlotsAvailable", "memoryStorageCapacity", "modelNumber", "movementDetectionTechnology", "numberOfPorts", "outputWattage", "recordingCapacity", "scannerResolution", "speakerDiameter", "speakersMaxOutputPower", "speakersNominalOutputPower", "speakerOutputChannelQuantity", "speakerSurroundSoundChannelConfiguration", "speedRating", "voltage", "wattage", "writeSpeed", "efficiency"})
/*      */ @XmlRootElement(name="ComputerComponent")
/*      */ public class ComputerComponent
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="AdditionalFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String additionalFeatures;
/*      */ 
/*      */   @XmlElement(name="AudioOutputMode")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String audioOutputMode;
/*      */ 
/*      */   @XmlElement(name="ChipsetType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String chipsetType;
/*      */ 
/*      */   @XmlElement(name="ComponentMemoryStorageCapacity")
/*      */   protected ComponentMemoryStorageCapacity componentMemoryStorageCapacity;
/*      */ 
/*      */   @XmlElement(name="CompatibleProcessorTypes")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> compatibleProcessorTypes;
/*      */ 
/*      */   @XmlElement(name="ComponentWirelessType")
/*      */   protected List<String> componentWirelessType;
/*      */ 
/*      */   @XmlElement(name="CommunicationInterface")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String communicationInterface;
/*      */ 
/*      */   @XmlElement(name="ComponentWriteSpeed")
/*      */   protected BigInteger componentWriteSpeed;
/*      */ 
/*      */   @XmlElement(name="ConnectorType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String connectorType;
/*      */ 
/*      */   @XmlElement(name="DigitalAudioCapacity")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String digitalAudioCapacity;
/*      */ 
/*      */   @XmlElement(name="DigitalMediaFormat")
/*      */   protected String digitalMediaFormat;
/*      */ 
/*      */   @XmlElement(name="EffectiveInputArea")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String effectiveInputArea;
/*      */ 
/*      */   @XmlElement(name="FormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String formFactor;
/*      */ 
/*      */   @XmlElement(name="HandOrientation")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String handOrientation;
/*      */ 
/*      */   @XmlElement(name="HasAutoFocus")
/*      */   protected Boolean hasAutoFocus;
/*      */ 
/*      */   @XmlElement(name="HasProgrammableButtons")
/*      */   protected Boolean hasProgrammableButtons;
/*      */ 
/*      */   @XmlElement(name="HolderCapacity")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String holderCapacity;
/*      */ 
/*      */   @XmlElement(name="InputType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String inputType;
/*      */ 
/*      */   @XmlElement(name="IsAmplifierIntegrated")
/*      */   protected Boolean isAmplifierIntegrated;
/*      */ 
/*      */   @XmlElement(name="KeyboardDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String keyboardDescription;
/*      */ 
/*      */   @XmlElement(name="MaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String materialType;
/*      */ 
/*      */   @XmlElement(name="MaxOperatingDistance")
/*      */   protected LengthIntegerDimension maxOperatingDistance;
/*      */ 
/*      */   @XmlElement(name="MaximumOperatingDistance")
/*      */   protected LengthIntegerDimension maximumOperatingDistance;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="MemoryStorageCapacity")
/*      */   protected MemorySizeIntegerDimension memoryStorageCapacity;
/*      */ 
/*      */   @XmlElement(name="ModelNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String modelNumber;
/*      */ 
/*      */   @XmlElement(name="MovementDetectionTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String movementDetectionTechnology;
/*      */ 
/*      */   @XmlElement(name="NumberOfPorts")
/*      */   protected BigInteger numberOfPorts;
/*      */ 
/*      */   @XmlElement(name="OutputWattage")
/*      */   protected BigInteger outputWattage;
/*      */ 
/*      */   @XmlElement(name="RecordingCapacity")
/*      */   protected TimeIntegerDimension recordingCapacity;
/*      */ 
/*      */   @XmlElement(name="ScannerResolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String scannerResolution;
/*      */ 
/*      */   @XmlElement(name="SpeakerDiameter")
/*      */   protected LengthDimension speakerDiameter;
/*      */ 
/*      */   @XmlElement(name="SpeakersMaxOutputPower")
/*      */   protected BigInteger speakersMaxOutputPower;
/*      */ 
/*      */   @XmlElement(name="SpeakersNominalOutputPower")
/*      */   protected BigInteger speakersNominalOutputPower;
/*      */ 
/*      */   @XmlElement(name="SpeakerOutputChannelQuantity")
/*      */   protected BigInteger speakerOutputChannelQuantity;
/*      */ 
/*      */   @XmlElement(name="SpeakerSurroundSoundChannelConfiguration")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String speakerSurroundSoundChannelConfiguration;
/*      */ 
/*      */   @XmlElement(name="SpeedRating")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String speedRating;
/*      */ 
/*      */   @XmlElement(name="Voltage")
/*      */   protected BigInteger voltage;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected BigInteger wattage;
/*      */ 
/*      */   @XmlElement(name="WriteSpeed")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String writeSpeed;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  250 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  262 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getAdditionalFeatures()
/*      */   {
/*  274 */     return this.additionalFeatures;
/*      */   }
/*      */ 
/*      */   public void setAdditionalFeatures(String value)
/*      */   {
/*  286 */     this.additionalFeatures = value;
/*      */   }
/*      */ 
/*      */   public String getAudioOutputMode()
/*      */   {
/*  298 */     return this.audioOutputMode;
/*      */   }
/*      */ 
/*      */   public void setAudioOutputMode(String value)
/*      */   {
/*  310 */     this.audioOutputMode = value;
/*      */   }
/*      */ 
/*      */   public String getChipsetType()
/*      */   {
/*  322 */     return this.chipsetType;
/*      */   }
/*      */ 
/*      */   public void setChipsetType(String value)
/*      */   {
/*  334 */     this.chipsetType = value;
/*      */   }
/*      */ 
/*      */   public ComponentMemoryStorageCapacity getComponentMemoryStorageCapacity()
/*      */   {
/*  346 */     return this.componentMemoryStorageCapacity;
/*      */   }
/*      */ 
/*      */   public void setComponentMemoryStorageCapacity(ComponentMemoryStorageCapacity value)
/*      */   {
/*  358 */     this.componentMemoryStorageCapacity = value;
/*      */   }
/*      */ 
/*      */   public List<String> getCompatibleProcessorTypes()
/*      */   {
/*  384 */     if (this.compatibleProcessorTypes == null) {
/*  385 */       this.compatibleProcessorTypes = new ArrayList();
/*      */     }
/*  387 */     return this.compatibleProcessorTypes;
/*      */   }
/*      */ 
/*      */   public List<String> getComponentWirelessType()
/*      */   {
/*  413 */     if (this.componentWirelessType == null) {
/*  414 */       this.componentWirelessType = new ArrayList();
/*      */     }
/*  416 */     return this.componentWirelessType;
/*      */   }
/*      */ 
/*      */   public String getCommunicationInterface()
/*      */   {
/*  428 */     return this.communicationInterface;
/*      */   }
/*      */ 
/*      */   public void setCommunicationInterface(String value)
/*      */   {
/*  440 */     this.communicationInterface = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getComponentWriteSpeed()
/*      */   {
/*  452 */     return this.componentWriteSpeed;
/*      */   }
/*      */ 
/*      */   public void setComponentWriteSpeed(BigInteger value)
/*      */   {
/*  464 */     this.componentWriteSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getConnectorType()
/*      */   {
/*  476 */     return this.connectorType;
/*      */   }
/*      */ 
/*      */   public void setConnectorType(String value)
/*      */   {
/*  488 */     this.connectorType = value;
/*      */   }
/*      */ 
/*      */   public String getDigitalAudioCapacity()
/*      */   {
/*  500 */     return this.digitalAudioCapacity;
/*      */   }
/*      */ 
/*      */   public void setDigitalAudioCapacity(String value)
/*      */   {
/*  512 */     this.digitalAudioCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getDigitalMediaFormat()
/*      */   {
/*  524 */     return this.digitalMediaFormat;
/*      */   }
/*      */ 
/*      */   public void setDigitalMediaFormat(String value)
/*      */   {
/*  536 */     this.digitalMediaFormat = value;
/*      */   }
/*      */ 
/*      */   public String getEffectiveInputArea()
/*      */   {
/*  548 */     return this.effectiveInputArea;
/*      */   }
/*      */ 
/*      */   public void setEffectiveInputArea(String value)
/*      */   {
/*  560 */     this.effectiveInputArea = value;
/*      */   }
/*      */ 
/*      */   public String getFormFactor()
/*      */   {
/*  572 */     return this.formFactor;
/*      */   }
/*      */ 
/*      */   public void setFormFactor(String value)
/*      */   {
/*  584 */     this.formFactor = value;
/*      */   }
/*      */ 
/*      */   public String getHandOrientation()
/*      */   {
/*  596 */     return this.handOrientation;
/*      */   }
/*      */ 
/*      */   public void setHandOrientation(String value)
/*      */   {
/*  608 */     this.handOrientation = value;
/*      */   }
/*      */ 
/*      */   public Boolean isHasAutoFocus()
/*      */   {
/*  620 */     return this.hasAutoFocus;
/*      */   }
/*      */ 
/*      */   public void setHasAutoFocus(Boolean value)
/*      */   {
/*  632 */     this.hasAutoFocus = value;
/*      */   }
/*      */ 
/*      */   public Boolean isHasProgrammableButtons()
/*      */   {
/*  644 */     return this.hasProgrammableButtons;
/*      */   }
/*      */ 
/*      */   public void setHasProgrammableButtons(Boolean value)
/*      */   {
/*  656 */     this.hasProgrammableButtons = value;
/*      */   }
/*      */ 
/*      */   public String getHolderCapacity()
/*      */   {
/*  668 */     return this.holderCapacity;
/*      */   }
/*      */ 
/*      */   public void setHolderCapacity(String value)
/*      */   {
/*  680 */     this.holderCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getInputType()
/*      */   {
/*  692 */     return this.inputType;
/*      */   }
/*      */ 
/*      */   public void setInputType(String value)
/*      */   {
/*  704 */     this.inputType = value;
/*      */   }
/*      */ 
/*      */   public Boolean isIsAmplifierIntegrated()
/*      */   {
/*  716 */     return this.isAmplifierIntegrated;
/*      */   }
/*      */ 
/*      */   public void setIsAmplifierIntegrated(Boolean value)
/*      */   {
/*  728 */     this.isAmplifierIntegrated = value;
/*      */   }
/*      */ 
/*      */   public String getKeyboardDescription()
/*      */   {
/*  740 */     return this.keyboardDescription;
/*      */   }
/*      */ 
/*      */   public void setKeyboardDescription(String value)
/*      */   {
/*  752 */     this.keyboardDescription = value;
/*      */   }
/*      */ 
/*      */   public String getMaterialType()
/*      */   {
/*  764 */     return this.materialType;
/*      */   }
/*      */ 
/*      */   public void setMaterialType(String value)
/*      */   {
/*  776 */     this.materialType = value;
/*      */   }
/*      */ 
/*      */   public LengthIntegerDimension getMaxOperatingDistance()
/*      */   {
/*  788 */     return this.maxOperatingDistance;
/*      */   }
/*      */ 
/*      */   public void setMaxOperatingDistance(LengthIntegerDimension value)
/*      */   {
/*  800 */     this.maxOperatingDistance = value;
/*      */   }
/*      */ 
/*      */   public LengthIntegerDimension getMaximumOperatingDistance()
/*      */   {
/*  812 */     return this.maximumOperatingDistance;
/*      */   }
/*      */ 
/*      */   public void setMaximumOperatingDistance(LengthIntegerDimension value)
/*      */   {
/*  824 */     this.maximumOperatingDistance = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  836 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  848 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeIntegerDimension getMemoryStorageCapacity()
/*      */   {
/*  860 */     return this.memoryStorageCapacity;
/*      */   }
/*      */ 
/*      */   public void setMemoryStorageCapacity(MemorySizeIntegerDimension value)
/*      */   {
/*  872 */     this.memoryStorageCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getModelNumber()
/*      */   {
/*  884 */     return this.modelNumber;
/*      */   }
/*      */ 
/*      */   public void setModelNumber(String value)
/*      */   {
/*  896 */     this.modelNumber = value;
/*      */   }
/*      */ 
/*      */   public String getMovementDetectionTechnology()
/*      */   {
/*  908 */     return this.movementDetectionTechnology;
/*      */   }
/*      */ 
/*      */   public void setMovementDetectionTechnology(String value)
/*      */   {
/*  920 */     this.movementDetectionTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfPorts()
/*      */   {
/*  932 */     return this.numberOfPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfPorts(BigInteger value)
/*      */   {
/*  944 */     this.numberOfPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getOutputWattage()
/*      */   {
/*  956 */     return this.outputWattage;
/*      */   }
/*      */ 
/*      */   public void setOutputWattage(BigInteger value)
/*      */   {
/*  968 */     this.outputWattage = value;
/*      */   }
/*      */ 
/*      */   public TimeIntegerDimension getRecordingCapacity()
/*      */   {
/*  980 */     return this.recordingCapacity;
/*      */   }
/*      */ 
/*      */   public void setRecordingCapacity(TimeIntegerDimension value)
/*      */   {
/*  992 */     this.recordingCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getScannerResolution()
/*      */   {
/* 1004 */     return this.scannerResolution;
/*      */   }
/*      */ 
/*      */   public void setScannerResolution(String value)
/*      */   {
/* 1016 */     this.scannerResolution = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpeakerDiameter()
/*      */   {
/* 1028 */     return this.speakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1040 */     this.speakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getSpeakersMaxOutputPower()
/*      */   {
/* 1052 */     return this.speakersMaxOutputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakersMaxOutputPower(BigInteger value)
/*      */   {
/* 1064 */     this.speakersMaxOutputPower = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getSpeakersNominalOutputPower()
/*      */   {
/* 1076 */     return this.speakersNominalOutputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakersNominalOutputPower(BigInteger value)
/*      */   {
/* 1088 */     this.speakersNominalOutputPower = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getSpeakerOutputChannelQuantity()
/*      */   {
/* 1100 */     return this.speakerOutputChannelQuantity;
/*      */   }
/*      */ 
/*      */   public void setSpeakerOutputChannelQuantity(BigInteger value)
/*      */   {
/* 1112 */     this.speakerOutputChannelQuantity = value;
/*      */   }
/*      */ 
/*      */   public String getSpeakerSurroundSoundChannelConfiguration()
/*      */   {
/* 1124 */     return this.speakerSurroundSoundChannelConfiguration;
/*      */   }
/*      */ 
/*      */   public void setSpeakerSurroundSoundChannelConfiguration(String value)
/*      */   {
/* 1136 */     this.speakerSurroundSoundChannelConfiguration = value;
/*      */   }
/*      */ 
/*      */   public String getSpeedRating()
/*      */   {
/* 1148 */     return this.speedRating;
/*      */   }
/*      */ 
/*      */   public void setSpeedRating(String value)
/*      */   {
/* 1160 */     this.speedRating = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getVoltage()
/*      */   {
/* 1172 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigInteger value)
/*      */   {
/* 1184 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getWattage()
/*      */   {
/* 1196 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(BigInteger value)
/*      */   {
/* 1208 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getWriteSpeed()
/*      */   {
/* 1220 */     return this.writeSpeed;
/*      */   }
/*      */ 
/*      */   public void setWriteSpeed(String value)
/*      */   {
/* 1232 */     this.writeSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1244 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1256 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"value"})
/*      */   public static class ComponentMemoryStorageCapacity
/*      */   {
/*      */ 
/*      */     @XmlValue
/*      */     protected BigInteger value;
/*      */ 
/*      */     @XmlAttribute(name="unitOfMeasure", required=true)
/*      */     protected MemorySizeUnitOfMeasure unitOfMeasure;
/*      */ 
/*      */     public BigInteger getValue()
/*      */     {
/* 1297 */       return this.value;
/*      */     }
/*      */ 
/*      */     public void setValue(BigInteger value)
/*      */     {
/* 1309 */       this.value = value;
/*      */     }
/*      */ 
/*      */     public MemorySizeUnitOfMeasure getUnitOfMeasure()
/*      */     {
/* 1321 */       return this.unitOfMeasure;
/*      */     }
/*      */ 
/*      */     public void setUnitOfMeasure(MemorySizeUnitOfMeasure value)
/*      */     {
/* 1333 */       this.unitOfMeasure = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerComponent
 * JD-Core Version:    0.6.2
 */