/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigDecimal;
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"variationData", "additionalDrives", "audio", "batteryChargeCycles", "cardReader", "computerMemoryType", "connectivityType", "displayResolutionMaximum", "frontWebcamResolution", "graphicsCard", "graphicsChipsetBrand", "graphicsCoProcessor", "graphicsRAMType", "hardDiskRotationalSpeed", "hardDiskTechnology", "hardDriveInterface", "hardDriveSize", "hardwarePlatform", "hasColorScreen", "maxExpandedMemorySupported", "modelNumber", "notebookDisplayTechnology", "numberOfAudioOutPorts", "numberOfDMIPorts", "numberOfEthernetPorts", "numberOfFirewirePorts", "numberOfGamingPorts", "numberOfHDMIPorts", "numberOfLPT1PrinterPorts", "numberOfMicrophonePorts", "numberOfPS2Ports", "numberOfSerialPorts", "numberOfUSB20Ports", "numberOfUSB30Ports", "numberOfVGAPorts", "operatingSystem", "opticalDriveIntegrated", "opticalStorageDeviceType", "processorBrand", "processorCount", "processorSocket", "processorSpeed", "processorType", "ramClockSpeed", "ramFormFactor", "ramSize", "ramTechnology", "rearWebcamResolution", "responseTime", "screenResolution", "screenSize", "series", "softwareIncluded", "speaker", "tabletInputMethod", "tunerTechnology", "viewingAngle", "voltage", "wattage", "wirelessCarrier", "wirelessType"})
/*      */ @XmlRootElement(name="TabletComputer")
/*      */ public class TabletComputer
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="AdditionalDrives")
/*      */   protected List<AdditionalDrivesTypeValues> additionalDrives;
/*      */ 
/*      */   @XmlElement(name="Audio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String audio;
/*      */ 
/*      */   @XmlElement(name="BatteryChargeCycles")
/*      */   protected BigInteger batteryChargeCycles;
/*      */ 
/*      */   @XmlElement(name="CardReader")
/*      */   protected CardReaderTypeValues cardReader;
/*      */ 
/*      */   @XmlElement(name="ComputerMemoryType")
/*      */   protected List<String> computerMemoryType;
/*      */ 
/*      */   @XmlElement(name="ConnectivityType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String connectivityType;
/*      */ 
/*      */   @XmlElement(name="DisplayResolutionMaximum")
/*      */   protected String displayResolutionMaximum;
/*      */ 
/*      */   @XmlElement(name="FrontWebcamResolution")
/*      */   protected ResolutionFiveDigitDimension frontWebcamResolution;
/*      */ 
/*      */   @XmlElement(name="GraphicsCard")
/*      */   protected List<GraphicsCard> graphicsCard;
/*      */ 
/*      */   @XmlElement(name="GraphicsChipsetBrand")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String graphicsChipsetBrand;
/*      */ 
/*      */   @XmlElement(name="GraphicsCoProcessor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String graphicsCoProcessor;
/*      */ 
/*      */   @XmlElement(name="GraphicsRAMType")
/*      */   protected String graphicsRAMType;
/*      */ 
/*      */   @XmlElement(name="HardDiskRotationalSpeed")
/*      */   protected BigDecimal hardDiskRotationalSpeed;
/*      */ 
/*      */   @XmlElement(name="HardDiskTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String hardDiskTechnology;
/*      */ 
/*      */   @XmlElement(name="HardDriveInterface")
/*      */   protected List<HardDriveInterfaceTypeValues> hardDriveInterface;
/*      */ 
/*      */   @XmlElement(name="HardDriveSize")
/*      */   protected List<MemorySizeDimension> hardDriveSize;
/*      */ 
/*      */   @XmlElement(name="HardwarePlatform")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String hardwarePlatform;
/*      */ 
/*      */   @XmlElement(name="HasColorScreen")
/*      */   protected Boolean hasColorScreen;
/*      */ 
/*      */   @XmlElement(name="MaxExpandedMemorySupported")
/*      */   protected MemorySizeDimension maxExpandedMemorySupported;
/*      */ 
/*      */   @XmlElement(name="ModelNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String modelNumber;
/*      */ 
/*      */   @XmlElement(name="NotebookDisplayTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String notebookDisplayTechnology;
/*      */ 
/*      */   @XmlElement(name="NumberOfAudioOutPorts")
/*      */   protected BigInteger numberOfAudioOutPorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfDMIPorts")
/*      */   protected BigInteger numberOfDMIPorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfEthernetPorts")
/*      */   protected BigInteger numberOfEthernetPorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfFirewirePorts")
/*      */   protected BigInteger numberOfFirewirePorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfGamingPorts")
/*      */   protected BigInteger numberOfGamingPorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfHDMIPorts")
/*      */   protected BigInteger numberOfHDMIPorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfLPT1PrinterPorts")
/*      */   protected BigInteger numberOfLPT1PrinterPorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfMicrophonePorts")
/*      */   protected BigInteger numberOfMicrophonePorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfPS2Ports")
/*      */   protected BigInteger numberOfPS2Ports;
/*      */ 
/*      */   @XmlElement(name="NumberOfSerialPorts")
/*      */   protected BigInteger numberOfSerialPorts;
/*      */ 
/*      */   @XmlElement(name="NumberOfUSB2.0Ports")
/*      */   protected BigInteger numberOfUSB20Ports;
/*      */ 
/*      */   @XmlElement(name="NumberOfUSB3.0Ports")
/*      */   protected BigInteger numberOfUSB30Ports;
/*      */ 
/*      */   @XmlElement(name="NumberOfVGAPorts")
/*      */   protected BigInteger numberOfVGAPorts;
/*      */ 
/*      */   @XmlElement(name="OperatingSystem", required=true)
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> operatingSystem;
/*      */ 
/*      */   @XmlElement(name="OpticalDriveIntegrated")
/*      */   protected BigInteger opticalDriveIntegrated;
/*      */ 
/*      */   @XmlElement(name="OpticalStorageDeviceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String opticalStorageDeviceType;
/*      */ 
/*      */   @XmlElement(name="ProcessorBrand")
/*      */   protected String processorBrand;
/*      */ 
/*      */   @XmlElement(name="ProcessorCount")
/*      */   protected BigInteger processorCount;
/*      */ 
/*      */   @XmlElement(name="ProcessorSocket")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String processorSocket;
/*      */ 
/*      */   @XmlElement(name="ProcessorSpeed")
/*      */   protected FrequencyDimension processorSpeed;
/*      */ 
/*      */   @XmlElement(name="ProcessorType")
/*      */   protected String processorType;
/*      */ 
/*      */   @XmlElement(name="RAMClockSpeed")
/*      */   protected BigInteger ramClockSpeed;
/*      */ 
/*      */   @XmlElement(name="RAMFormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String ramFormFactor;
/*      */ 
/*      */   @XmlElement(name="RAMSize")
/*      */   protected MemorySizeDimension ramSize;
/*      */ 
/*      */   @XmlElement(name="RAMTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String ramTechnology;
/*      */ 
/*      */   @XmlElement(name="RearWebcamResolution")
/*      */   protected ResolutionFiveDigitDimension rearWebcamResolution;
/*      */ 
/*      */   @XmlElement(name="ResponseTime")
/*      */   protected BigInteger responseTime;
/*      */ 
/*      */   @XmlElement(name="ScreenResolution")
/*      */   protected String screenResolution;
/*      */ 
/*      */   @XmlElement(name="ScreenSize")
/*      */   protected LengthDimension screenSize;
/*      */ 
/*      */   @XmlElement(name="Series")
/*      */   protected String series;
/*      */ 
/*      */   @XmlElement(name="SoftwareIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String softwareIncluded;
/*      */ 
/*      */   @XmlElement(name="Speaker")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String speaker;
/*      */ 
/*      */   @XmlElement(name="TabletInputMethod")
/*      */   protected List<TabletInputMethodTypeValues> tabletInputMethod;
/*      */ 
/*      */   @XmlElement(name="TunerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String tunerTechnology;
/*      */ 
/*      */   @XmlElement(name="ViewingAngle")
/*      */   protected BigInteger viewingAngle;
/*      */ 
/*      */   @XmlElement(name="Voltage")
/*      */   protected BigDecimal voltage;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected BigInteger wattage;
/*      */ 
/*      */   @XmlElement(name="WirelessCarrier")
/*      */   protected List<WirelessCarrierTypeValues> wirelessCarrier;
/*      */ 
/*      */   @XmlElement(name="WirelessType")
/*      */   protected List<String> wirelessType;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  323 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  335 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public List<AdditionalDrivesTypeValues> getAdditionalDrives()
/*      */   {
/*  361 */     if (this.additionalDrives == null) {
/*  362 */       this.additionalDrives = new ArrayList();
/*      */     }
/*  364 */     return this.additionalDrives;
/*      */   }
/*      */ 
/*      */   public String getAudio()
/*      */   {
/*  376 */     return this.audio;
/*      */   }
/*      */ 
/*      */   public void setAudio(String value)
/*      */   {
/*  388 */     this.audio = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  400 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  412 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public CardReaderTypeValues getCardReader()
/*      */   {
/*  424 */     return this.cardReader;
/*      */   }
/*      */ 
/*      */   public void setCardReader(CardReaderTypeValues value)
/*      */   {
/*  436 */     this.cardReader = value;
/*      */   }
/*      */ 
/*      */   public List<String> getComputerMemoryType()
/*      */   {
/*  462 */     if (this.computerMemoryType == null) {
/*  463 */       this.computerMemoryType = new ArrayList();
/*      */     }
/*  465 */     return this.computerMemoryType;
/*      */   }
/*      */ 
/*      */   public String getConnectivityType()
/*      */   {
/*  477 */     return this.connectivityType;
/*      */   }
/*      */ 
/*      */   public void setConnectivityType(String value)
/*      */   {
/*  489 */     this.connectivityType = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayResolutionMaximum()
/*      */   {
/*  501 */     return this.displayResolutionMaximum;
/*      */   }
/*      */ 
/*      */   public void setDisplayResolutionMaximum(String value)
/*      */   {
/*  513 */     this.displayResolutionMaximum = value;
/*      */   }
/*      */ 
/*      */   public ResolutionFiveDigitDimension getFrontWebcamResolution()
/*      */   {
/*  525 */     return this.frontWebcamResolution;
/*      */   }
/*      */ 
/*      */   public void setFrontWebcamResolution(ResolutionFiveDigitDimension value)
/*      */   {
/*  537 */     this.frontWebcamResolution = value;
/*      */   }
/*      */ 
/*      */   public List<GraphicsCard> getGraphicsCard()
/*      */   {
/*  563 */     if (this.graphicsCard == null) {
/*  564 */       this.graphicsCard = new ArrayList();
/*      */     }
/*  566 */     return this.graphicsCard;
/*      */   }
/*      */ 
/*      */   public String getGraphicsChipsetBrand()
/*      */   {
/*  578 */     return this.graphicsChipsetBrand;
/*      */   }
/*      */ 
/*      */   public void setGraphicsChipsetBrand(String value)
/*      */   {
/*  590 */     this.graphicsChipsetBrand = value;
/*      */   }
/*      */ 
/*      */   public String getGraphicsCoProcessor()
/*      */   {
/*  602 */     return this.graphicsCoProcessor;
/*      */   }
/*      */ 
/*      */   public void setGraphicsCoProcessor(String value)
/*      */   {
/*  614 */     this.graphicsCoProcessor = value;
/*      */   }
/*      */ 
/*      */   public String getGraphicsRAMType()
/*      */   {
/*  626 */     return this.graphicsRAMType;
/*      */   }
/*      */ 
/*      */   public void setGraphicsRAMType(String value)
/*      */   {
/*  638 */     this.graphicsRAMType = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getHardDiskRotationalSpeed()
/*      */   {
/*  650 */     return this.hardDiskRotationalSpeed;
/*      */   }
/*      */ 
/*      */   public void setHardDiskRotationalSpeed(BigDecimal value)
/*      */   {
/*  662 */     this.hardDiskRotationalSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getHardDiskTechnology()
/*      */   {
/*  674 */     return this.hardDiskTechnology;
/*      */   }
/*      */ 
/*      */   public void setHardDiskTechnology(String value)
/*      */   {
/*  686 */     this.hardDiskTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<HardDriveInterfaceTypeValues> getHardDriveInterface()
/*      */   {
/*  712 */     if (this.hardDriveInterface == null) {
/*  713 */       this.hardDriveInterface = new ArrayList();
/*      */     }
/*  715 */     return this.hardDriveInterface;
/*      */   }
/*      */ 
/*      */   public List<MemorySizeDimension> getHardDriveSize()
/*      */   {
/*  741 */     if (this.hardDriveSize == null) {
/*  742 */       this.hardDriveSize = new ArrayList();
/*      */     }
/*  744 */     return this.hardDriveSize;
/*      */   }
/*      */ 
/*      */   public String getHardwarePlatform()
/*      */   {
/*  756 */     return this.hardwarePlatform;
/*      */   }
/*      */ 
/*      */   public void setHardwarePlatform(String value)
/*      */   {
/*  768 */     this.hardwarePlatform = value;
/*      */   }
/*      */ 
/*      */   public Boolean isHasColorScreen()
/*      */   {
/*  780 */     return this.hasColorScreen;
/*      */   }
/*      */ 
/*      */   public void setHasColorScreen(Boolean value)
/*      */   {
/*  792 */     this.hasColorScreen = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getMaxExpandedMemorySupported()
/*      */   {
/*  804 */     return this.maxExpandedMemorySupported;
/*      */   }
/*      */ 
/*      */   public void setMaxExpandedMemorySupported(MemorySizeDimension value)
/*      */   {
/*  816 */     this.maxExpandedMemorySupported = value;
/*      */   }
/*      */ 
/*      */   public String getModelNumber()
/*      */   {
/*  828 */     return this.modelNumber;
/*      */   }
/*      */ 
/*      */   public void setModelNumber(String value)
/*      */   {
/*  840 */     this.modelNumber = value;
/*      */   }
/*      */ 
/*      */   public String getNotebookDisplayTechnology()
/*      */   {
/*  852 */     return this.notebookDisplayTechnology;
/*      */   }
/*      */ 
/*      */   public void setNotebookDisplayTechnology(String value)
/*      */   {
/*  864 */     this.notebookDisplayTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfAudioOutPorts()
/*      */   {
/*  876 */     return this.numberOfAudioOutPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfAudioOutPorts(BigInteger value)
/*      */   {
/*  888 */     this.numberOfAudioOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfDMIPorts()
/*      */   {
/*  900 */     return this.numberOfDMIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfDMIPorts(BigInteger value)
/*      */   {
/*  912 */     this.numberOfDMIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfEthernetPorts()
/*      */   {
/*  924 */     return this.numberOfEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfEthernetPorts(BigInteger value)
/*      */   {
/*  936 */     this.numberOfEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfFirewirePorts()
/*      */   {
/*  948 */     return this.numberOfFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfFirewirePorts(BigInteger value)
/*      */   {
/*  960 */     this.numberOfFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfGamingPorts()
/*      */   {
/*  972 */     return this.numberOfGamingPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfGamingPorts(BigInteger value)
/*      */   {
/*  984 */     this.numberOfGamingPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHDMIPorts()
/*      */   {
/*  996 */     return this.numberOfHDMIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHDMIPorts(BigInteger value)
/*      */   {
/* 1008 */     this.numberOfHDMIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLPT1PrinterPorts()
/*      */   {
/* 1020 */     return this.numberOfLPT1PrinterPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLPT1PrinterPorts(BigInteger value)
/*      */   {
/* 1032 */     this.numberOfLPT1PrinterPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfMicrophonePorts()
/*      */   {
/* 1044 */     return this.numberOfMicrophonePorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfMicrophonePorts(BigInteger value)
/*      */   {
/* 1056 */     this.numberOfMicrophonePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfPS2Ports()
/*      */   {
/* 1068 */     return this.numberOfPS2Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfPS2Ports(BigInteger value)
/*      */   {
/* 1080 */     this.numberOfPS2Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSerialPorts()
/*      */   {
/* 1092 */     return this.numberOfSerialPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSerialPorts(BigInteger value)
/*      */   {
/* 1104 */     this.numberOfSerialPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfUSB20Ports()
/*      */   {
/* 1116 */     return this.numberOfUSB20Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfUSB20Ports(BigInteger value)
/*      */   {
/* 1128 */     this.numberOfUSB20Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfUSB30Ports()
/*      */   {
/* 1140 */     return this.numberOfUSB30Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfUSB30Ports(BigInteger value)
/*      */   {
/* 1152 */     this.numberOfUSB30Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfVGAPorts()
/*      */   {
/* 1164 */     return this.numberOfVGAPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfVGAPorts(BigInteger value)
/*      */   {
/* 1176 */     this.numberOfVGAPorts = value;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/* 1202 */     if (this.operatingSystem == null) {
/* 1203 */       this.operatingSystem = new ArrayList();
/*      */     }
/* 1205 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public BigInteger getOpticalDriveIntegrated()
/*      */   {
/* 1217 */     return this.opticalDriveIntegrated;
/*      */   }
/*      */ 
/*      */   public void setOpticalDriveIntegrated(BigInteger value)
/*      */   {
/* 1229 */     this.opticalDriveIntegrated = value;
/*      */   }
/*      */ 
/*      */   public String getOpticalStorageDeviceType()
/*      */   {
/* 1241 */     return this.opticalStorageDeviceType;
/*      */   }
/*      */ 
/*      */   public void setOpticalStorageDeviceType(String value)
/*      */   {
/* 1253 */     this.opticalStorageDeviceType = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorBrand()
/*      */   {
/* 1265 */     return this.processorBrand;
/*      */   }
/*      */ 
/*      */   public void setProcessorBrand(String value)
/*      */   {
/* 1277 */     this.processorBrand = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getProcessorCount()
/*      */   {
/* 1289 */     return this.processorCount;
/*      */   }
/*      */ 
/*      */   public void setProcessorCount(BigInteger value)
/*      */   {
/* 1301 */     this.processorCount = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorSocket()
/*      */   {
/* 1313 */     return this.processorSocket;
/*      */   }
/*      */ 
/*      */   public void setProcessorSocket(String value)
/*      */   {
/* 1325 */     this.processorSocket = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getProcessorSpeed()
/*      */   {
/* 1337 */     return this.processorSpeed;
/*      */   }
/*      */ 
/*      */   public void setProcessorSpeed(FrequencyDimension value)
/*      */   {
/* 1349 */     this.processorSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorType()
/*      */   {
/* 1361 */     return this.processorType;
/*      */   }
/*      */ 
/*      */   public void setProcessorType(String value)
/*      */   {
/* 1373 */     this.processorType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getRAMClockSpeed()
/*      */   {
/* 1385 */     return this.ramClockSpeed;
/*      */   }
/*      */ 
/*      */   public void setRAMClockSpeed(BigInteger value)
/*      */   {
/* 1397 */     this.ramClockSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getRAMFormFactor()
/*      */   {
/* 1409 */     return this.ramFormFactor;
/*      */   }
/*      */ 
/*      */   public void setRAMFormFactor(String value)
/*      */   {
/* 1421 */     this.ramFormFactor = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getRAMSize()
/*      */   {
/* 1433 */     return this.ramSize;
/*      */   }
/*      */ 
/*      */   public void setRAMSize(MemorySizeDimension value)
/*      */   {
/* 1445 */     this.ramSize = value;
/*      */   }
/*      */ 
/*      */   public String getRAMTechnology()
/*      */   {
/* 1457 */     return this.ramTechnology;
/*      */   }
/*      */ 
/*      */   public void setRAMTechnology(String value)
/*      */   {
/* 1469 */     this.ramTechnology = value;
/*      */   }
/*      */ 
/*      */   public ResolutionFiveDigitDimension getRearWebcamResolution()
/*      */   {
/* 1481 */     return this.rearWebcamResolution;
/*      */   }
/*      */ 
/*      */   public void setRearWebcamResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 1493 */     this.rearWebcamResolution = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getResponseTime()
/*      */   {
/* 1505 */     return this.responseTime;
/*      */   }
/*      */ 
/*      */   public void setResponseTime(BigInteger value)
/*      */   {
/* 1517 */     this.responseTime = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/* 1529 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/* 1541 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/* 1553 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/* 1565 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public String getSeries()
/*      */   {
/* 1577 */     return this.series;
/*      */   }
/*      */ 
/*      */   public void setSeries(String value)
/*      */   {
/* 1589 */     this.series = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/* 1601 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/* 1613 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeaker()
/*      */   {
/* 1625 */     return this.speaker;
/*      */   }
/*      */ 
/*      */   public void setSpeaker(String value)
/*      */   {
/* 1637 */     this.speaker = value;
/*      */   }
/*      */ 
/*      */   public List<TabletInputMethodTypeValues> getTabletInputMethod()
/*      */   {
/* 1663 */     if (this.tabletInputMethod == null) {
/* 1664 */       this.tabletInputMethod = new ArrayList();
/*      */     }
/* 1666 */     return this.tabletInputMethod;
/*      */   }
/*      */ 
/*      */   public String getTunerTechnology()
/*      */   {
/* 1678 */     return this.tunerTechnology;
/*      */   }
/*      */ 
/*      */   public void setTunerTechnology(String value)
/*      */   {
/* 1690 */     this.tunerTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getViewingAngle()
/*      */   {
/* 1702 */     return this.viewingAngle;
/*      */   }
/*      */ 
/*      */   public void setViewingAngle(BigInteger value)
/*      */   {
/* 1714 */     this.viewingAngle = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getVoltage()
/*      */   {
/* 1726 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigDecimal value)
/*      */   {
/* 1738 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getWattage()
/*      */   {
/* 1750 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(BigInteger value)
/*      */   {
/* 1762 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public List<WirelessCarrierTypeValues> getWirelessCarrier()
/*      */   {
/* 1788 */     if (this.wirelessCarrier == null) {
/* 1789 */       this.wirelessCarrier = new ArrayList();
/*      */     }
/* 1791 */     return this.wirelessCarrier;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessType()
/*      */   {
/* 1817 */     if (this.wirelessType == null) {
/* 1818 */       this.wirelessType = new ArrayList();
/*      */     }
/* 1820 */     return this.wirelessType;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"graphicsDescription", "graphicsRAMSize", "graphicsCardInterface"})
/*      */   public static class GraphicsCard
/*      */   {
/*      */ 
/*      */     @XmlElement(name="GraphicsDescription", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String graphicsDescription;
/*      */ 
/*      */     @XmlElement(name="GraphicsRAMSize", required=true)
/*      */     protected MemorySizeDimension graphicsRAMSize;
/*      */ 
/*      */     @XmlElement(name="GraphicsCardInterface", required=true)
/*      */     protected GraphicsCardInterfaceTypeValues graphicsCardInterface;
/*      */ 
/*      */     public String getGraphicsDescription()
/*      */     {
/* 1870 */       return this.graphicsDescription;
/*      */     }
/*      */ 
/*      */     public void setGraphicsDescription(String value)
/*      */     {
/* 1882 */       this.graphicsDescription = value;
/*      */     }
/*      */ 
/*      */     public MemorySizeDimension getGraphicsRAMSize()
/*      */     {
/* 1894 */       return this.graphicsRAMSize;
/*      */     }
/*      */ 
/*      */     public void setGraphicsRAMSize(MemorySizeDimension value)
/*      */     {
/* 1906 */       this.graphicsRAMSize = value;
/*      */     }
/*      */ 
/*      */     public GraphicsCardInterfaceTypeValues getGraphicsCardInterface()
/*      */     {
/* 1918 */       return this.graphicsCardInterface;
/*      */     }
/*      */ 
/*      */     public void setGraphicsCardInterface(GraphicsCardInterfaceTypeValues value)
/*      */     {
/* 1930 */       this.graphicsCardInterface = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TabletComputer
 * JD-Core Version:    0.6.2
 */