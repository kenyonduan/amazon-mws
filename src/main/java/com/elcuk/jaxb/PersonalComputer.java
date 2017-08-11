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
/*      */ @XmlType(name="", propOrder={"variationData", "additionalDrives", "audio", "cardReader", "computerMemoryType", "computerTunerTechnology", "computerWirelessType", "connectivityType", "displayResolutionMaximum", "graphicsCard", "graphicsChipsetBrand", "graphicsCoProcessor", "graphicsRAMType", "hardDiskRotationalSpeed", "hardDiskTechnology", "hardDriveInterface", "hardDriveSize", "hardwarePlatform", "maxExpandedMemorySupported", "modelNumber", "numberOfAudioOutPorts", "numberOfDMIPorts", "numberOfEthernetPorts", "numberOfFirewirePorts", "numberOfGamingPorts", "numberOfHDMIPorts", "numberOfLPT1PrinterPorts", "numberOfMicrophonePorts", "numberOfPS2Ports", "numberOfSerialPorts", "numberOfUSB20Ports", "numberOfUSB30Ports", "numberOfVGAPorts", "operatingSystem", "opticalDeviceType", "opticalStorageDeviceType", "opticalDriveIntegrated", "processorBrand", "processorCount", "processorSocket", "processorSpeed", "processorType", "ramClockSpeed", "ramFormFactor", "ramSize", "ramTechnology", "rearWebcamResolution", "responseTime", "screenResolution", "series", "softwareIncluded", "speaker", "tabletInputMethod", "tunerTechnology", "uRackSize", "viewingAngle", "notebookDisplayTechnology", "screenSize", "hasColorScreen", "displayTechnology", "monitorTunerTechnology", "voltage", "wattage", "wirelessCarrier", "wirelessType", "additionalFeatures", "specificUsesForProduct", "supportedSoftware", "numberOfDVIPorts", "efficiency"})
/*      */ @XmlRootElement(name="PersonalComputer")
/*      */ public class PersonalComputer
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
/*      */   @XmlElement(name="CardReader")
/*      */   protected CardReaderTypeValues cardReader;
/*      */ 
/*      */   @XmlElement(name="ComputerMemoryType")
/*      */   protected List<String> computerMemoryType;
/*      */ 
/*      */   @XmlElement(name="ComputerTunerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String computerTunerTechnology;
/*      */ 
/*      */   @XmlElement(name="ComputerWirelessType")
/*      */   protected List<String> computerWirelessType;
/*      */ 
/*      */   @XmlElement(name="ConnectivityType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String connectivityType;
/*      */ 
/*      */   @XmlElement(name="DisplayResolutionMaximum")
/*      */   protected String displayResolutionMaximum;
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
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
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
/*      */   @XmlElement(name="MaxExpandedMemorySupported")
/*      */   protected MemorySizeDimension maxExpandedMemorySupported;
/*      */ 
/*      */   @XmlElement(name="ModelNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String modelNumber;
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
/*      */   @XmlElement(name="OpticalDeviceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String opticalDeviceType;
/*      */ 
/*      */   @XmlElement(name="OpticalStorageDeviceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String opticalStorageDeviceType;
/*      */ 
/*      */   @XmlElement(name="OpticalDriveIntegrated")
/*      */   protected BigInteger opticalDriveIntegrated;
/*      */ 
/*      */   @XmlElement(name="ProcessorBrand")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
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
/*      */   @XmlElement(name="U-RackSize")
/*      */   protected BigInteger uRackSize;
/*      */ 
/*      */   @XmlElement(name="ViewingAngle")
/*      */   protected BigInteger viewingAngle;
/*      */ 
/*      */   @XmlElement(name="NotebookDisplayTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String notebookDisplayTechnology;
/*      */ 
/*      */   @XmlElement(name="ScreenSize")
/*      */   protected LengthDimension screenSize;
/*      */ 
/*      */   @XmlElement(name="HasColorScreen")
/*      */   protected Boolean hasColorScreen;
/*      */ 
/*      */   @XmlElement(name="DisplayTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String displayTechnology;
/*      */ 
/*      */   @XmlElement(name="MonitorTunerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String monitorTunerTechnology;
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
/*      */   @XmlElement(name="AdditionalFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String additionalFeatures;
/*      */ 
/*      */   @XmlElement(name="SpecificUsesForProduct")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String specificUsesForProduct;
/*      */ 
/*      */   @XmlElement(name="SupportedSoftware")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String supportedSoftware;
/*      */ 
/*      */   @XmlElement(name="NumberOfDVIPorts")
/*      */   protected BigInteger numberOfDVIPorts;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  369 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  381 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public List<AdditionalDrivesTypeValues> getAdditionalDrives()
/*      */   {
/*  407 */     if (this.additionalDrives == null) {
/*  408 */       this.additionalDrives = new ArrayList();
/*      */     }
/*  410 */     return this.additionalDrives;
/*      */   }
/*      */ 
/*      */   public String getAudio()
/*      */   {
/*  422 */     return this.audio;
/*      */   }
/*      */ 
/*      */   public void setAudio(String value)
/*      */   {
/*  434 */     this.audio = value;
/*      */   }
/*      */ 
/*      */   public CardReaderTypeValues getCardReader()
/*      */   {
/*  446 */     return this.cardReader;
/*      */   }
/*      */ 
/*      */   public void setCardReader(CardReaderTypeValues value)
/*      */   {
/*  458 */     this.cardReader = value;
/*      */   }
/*      */ 
/*      */   public List<String> getComputerMemoryType()
/*      */   {
/*  484 */     if (this.computerMemoryType == null) {
/*  485 */       this.computerMemoryType = new ArrayList();
/*      */     }
/*  487 */     return this.computerMemoryType;
/*      */   }
/*      */ 
/*      */   public String getComputerTunerTechnology()
/*      */   {
/*  499 */     return this.computerTunerTechnology;
/*      */   }
/*      */ 
/*      */   public void setComputerTunerTechnology(String value)
/*      */   {
/*  511 */     this.computerTunerTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<String> getComputerWirelessType()
/*      */   {
/*  537 */     if (this.computerWirelessType == null) {
/*  538 */       this.computerWirelessType = new ArrayList();
/*      */     }
/*  540 */     return this.computerWirelessType;
/*      */   }
/*      */ 
/*      */   public String getConnectivityType()
/*      */   {
/*  552 */     return this.connectivityType;
/*      */   }
/*      */ 
/*      */   public void setConnectivityType(String value)
/*      */   {
/*  564 */     this.connectivityType = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayResolutionMaximum()
/*      */   {
/*  576 */     return this.displayResolutionMaximum;
/*      */   }
/*      */ 
/*      */   public void setDisplayResolutionMaximum(String value)
/*      */   {
/*  588 */     this.displayResolutionMaximum = value;
/*      */   }
/*      */ 
/*      */   public List<GraphicsCard> getGraphicsCard()
/*      */   {
/*  614 */     if (this.graphicsCard == null) {
/*  615 */       this.graphicsCard = new ArrayList();
/*      */     }
/*  617 */     return this.graphicsCard;
/*      */   }
/*      */ 
/*      */   public String getGraphicsChipsetBrand()
/*      */   {
/*  629 */     return this.graphicsChipsetBrand;
/*      */   }
/*      */ 
/*      */   public void setGraphicsChipsetBrand(String value)
/*      */   {
/*  641 */     this.graphicsChipsetBrand = value;
/*      */   }
/*      */ 
/*      */   public String getGraphicsCoProcessor()
/*      */   {
/*  653 */     return this.graphicsCoProcessor;
/*      */   }
/*      */ 
/*      */   public void setGraphicsCoProcessor(String value)
/*      */   {
/*  665 */     this.graphicsCoProcessor = value;
/*      */   }
/*      */ 
/*      */   public String getGraphicsRAMType()
/*      */   {
/*  677 */     return this.graphicsRAMType;
/*      */   }
/*      */ 
/*      */   public void setGraphicsRAMType(String value)
/*      */   {
/*  689 */     this.graphicsRAMType = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getHardDiskRotationalSpeed()
/*      */   {
/*  701 */     return this.hardDiskRotationalSpeed;
/*      */   }
/*      */ 
/*      */   public void setHardDiskRotationalSpeed(BigDecimal value)
/*      */   {
/*  713 */     this.hardDiskRotationalSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getHardDiskTechnology()
/*      */   {
/*  725 */     return this.hardDiskTechnology;
/*      */   }
/*      */ 
/*      */   public void setHardDiskTechnology(String value)
/*      */   {
/*  737 */     this.hardDiskTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<HardDriveInterfaceTypeValues> getHardDriveInterface()
/*      */   {
/*  763 */     if (this.hardDriveInterface == null) {
/*  764 */       this.hardDriveInterface = new ArrayList();
/*      */     }
/*  766 */     return this.hardDriveInterface;
/*      */   }
/*      */ 
/*      */   public List<MemorySizeDimension> getHardDriveSize()
/*      */   {
/*  792 */     if (this.hardDriveSize == null) {
/*  793 */       this.hardDriveSize = new ArrayList();
/*      */     }
/*  795 */     return this.hardDriveSize;
/*      */   }
/*      */ 
/*      */   public String getHardwarePlatform()
/*      */   {
/*  807 */     return this.hardwarePlatform;
/*      */   }
/*      */ 
/*      */   public void setHardwarePlatform(String value)
/*      */   {
/*  819 */     this.hardwarePlatform = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getMaxExpandedMemorySupported()
/*      */   {
/*  831 */     return this.maxExpandedMemorySupported;
/*      */   }
/*      */ 
/*      */   public void setMaxExpandedMemorySupported(MemorySizeDimension value)
/*      */   {
/*  843 */     this.maxExpandedMemorySupported = value;
/*      */   }
/*      */ 
/*      */   public String getModelNumber()
/*      */   {
/*  855 */     return this.modelNumber;
/*      */   }
/*      */ 
/*      */   public void setModelNumber(String value)
/*      */   {
/*  867 */     this.modelNumber = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfAudioOutPorts()
/*      */   {
/*  879 */     return this.numberOfAudioOutPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfAudioOutPorts(BigInteger value)
/*      */   {
/*  891 */     this.numberOfAudioOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfDMIPorts()
/*      */   {
/*  903 */     return this.numberOfDMIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfDMIPorts(BigInteger value)
/*      */   {
/*  915 */     this.numberOfDMIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfEthernetPorts()
/*      */   {
/*  927 */     return this.numberOfEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfEthernetPorts(BigInteger value)
/*      */   {
/*  939 */     this.numberOfEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfFirewirePorts()
/*      */   {
/*  951 */     return this.numberOfFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfFirewirePorts(BigInteger value)
/*      */   {
/*  963 */     this.numberOfFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfGamingPorts()
/*      */   {
/*  975 */     return this.numberOfGamingPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfGamingPorts(BigInteger value)
/*      */   {
/*  987 */     this.numberOfGamingPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHDMIPorts()
/*      */   {
/*  999 */     return this.numberOfHDMIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHDMIPorts(BigInteger value)
/*      */   {
/* 1011 */     this.numberOfHDMIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLPT1PrinterPorts()
/*      */   {
/* 1023 */     return this.numberOfLPT1PrinterPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLPT1PrinterPorts(BigInteger value)
/*      */   {
/* 1035 */     this.numberOfLPT1PrinterPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfMicrophonePorts()
/*      */   {
/* 1047 */     return this.numberOfMicrophonePorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfMicrophonePorts(BigInteger value)
/*      */   {
/* 1059 */     this.numberOfMicrophonePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfPS2Ports()
/*      */   {
/* 1071 */     return this.numberOfPS2Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfPS2Ports(BigInteger value)
/*      */   {
/* 1083 */     this.numberOfPS2Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSerialPorts()
/*      */   {
/* 1095 */     return this.numberOfSerialPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSerialPorts(BigInteger value)
/*      */   {
/* 1107 */     this.numberOfSerialPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfUSB20Ports()
/*      */   {
/* 1119 */     return this.numberOfUSB20Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfUSB20Ports(BigInteger value)
/*      */   {
/* 1131 */     this.numberOfUSB20Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfUSB30Ports()
/*      */   {
/* 1143 */     return this.numberOfUSB30Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfUSB30Ports(BigInteger value)
/*      */   {
/* 1155 */     this.numberOfUSB30Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfVGAPorts()
/*      */   {
/* 1167 */     return this.numberOfVGAPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfVGAPorts(BigInteger value)
/*      */   {
/* 1179 */     this.numberOfVGAPorts = value;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/* 1205 */     if (this.operatingSystem == null) {
/* 1206 */       this.operatingSystem = new ArrayList();
/*      */     }
/* 1208 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public String getOpticalDeviceType()
/*      */   {
/* 1220 */     return this.opticalDeviceType;
/*      */   }
/*      */ 
/*      */   public void setOpticalDeviceType(String value)
/*      */   {
/* 1232 */     this.opticalDeviceType = value;
/*      */   }
/*      */ 
/*      */   public String getOpticalStorageDeviceType()
/*      */   {
/* 1244 */     return this.opticalStorageDeviceType;
/*      */   }
/*      */ 
/*      */   public void setOpticalStorageDeviceType(String value)
/*      */   {
/* 1256 */     this.opticalStorageDeviceType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getOpticalDriveIntegrated()
/*      */   {
/* 1268 */     return this.opticalDriveIntegrated;
/*      */   }
/*      */ 
/*      */   public void setOpticalDriveIntegrated(BigInteger value)
/*      */   {
/* 1280 */     this.opticalDriveIntegrated = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorBrand()
/*      */   {
/* 1292 */     return this.processorBrand;
/*      */   }
/*      */ 
/*      */   public void setProcessorBrand(String value)
/*      */   {
/* 1304 */     this.processorBrand = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getProcessorCount()
/*      */   {
/* 1316 */     return this.processorCount;
/*      */   }
/*      */ 
/*      */   public void setProcessorCount(BigInteger value)
/*      */   {
/* 1328 */     this.processorCount = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorSocket()
/*      */   {
/* 1340 */     return this.processorSocket;
/*      */   }
/*      */ 
/*      */   public void setProcessorSocket(String value)
/*      */   {
/* 1352 */     this.processorSocket = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getProcessorSpeed()
/*      */   {
/* 1364 */     return this.processorSpeed;
/*      */   }
/*      */ 
/*      */   public void setProcessorSpeed(FrequencyDimension value)
/*      */   {
/* 1376 */     this.processorSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorType()
/*      */   {
/* 1388 */     return this.processorType;
/*      */   }
/*      */ 
/*      */   public void setProcessorType(String value)
/*      */   {
/* 1400 */     this.processorType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getRAMClockSpeed()
/*      */   {
/* 1412 */     return this.ramClockSpeed;
/*      */   }
/*      */ 
/*      */   public void setRAMClockSpeed(BigInteger value)
/*      */   {
/* 1424 */     this.ramClockSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getRAMFormFactor()
/*      */   {
/* 1436 */     return this.ramFormFactor;
/*      */   }
/*      */ 
/*      */   public void setRAMFormFactor(String value)
/*      */   {
/* 1448 */     this.ramFormFactor = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getRAMSize()
/*      */   {
/* 1460 */     return this.ramSize;
/*      */   }
/*      */ 
/*      */   public void setRAMSize(MemorySizeDimension value)
/*      */   {
/* 1472 */     this.ramSize = value;
/*      */   }
/*      */ 
/*      */   public String getRAMTechnology()
/*      */   {
/* 1484 */     return this.ramTechnology;
/*      */   }
/*      */ 
/*      */   public void setRAMTechnology(String value)
/*      */   {
/* 1496 */     this.ramTechnology = value;
/*      */   }
/*      */ 
/*      */   public ResolutionFiveDigitDimension getRearWebcamResolution()
/*      */   {
/* 1508 */     return this.rearWebcamResolution;
/*      */   }
/*      */ 
/*      */   public void setRearWebcamResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 1520 */     this.rearWebcamResolution = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getResponseTime()
/*      */   {
/* 1532 */     return this.responseTime;
/*      */   }
/*      */ 
/*      */   public void setResponseTime(BigInteger value)
/*      */   {
/* 1544 */     this.responseTime = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/* 1556 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/* 1568 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public String getSeries()
/*      */   {
/* 1580 */     return this.series;
/*      */   }
/*      */ 
/*      */   public void setSeries(String value)
/*      */   {
/* 1592 */     this.series = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/* 1604 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/* 1616 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeaker()
/*      */   {
/* 1628 */     return this.speaker;
/*      */   }
/*      */ 
/*      */   public void setSpeaker(String value)
/*      */   {
/* 1640 */     this.speaker = value;
/*      */   }
/*      */ 
/*      */   public List<TabletInputMethodTypeValues> getTabletInputMethod()
/*      */   {
/* 1666 */     if (this.tabletInputMethod == null) {
/* 1667 */       this.tabletInputMethod = new ArrayList();
/*      */     }
/* 1669 */     return this.tabletInputMethod;
/*      */   }
/*      */ 
/*      */   public String getTunerTechnology()
/*      */   {
/* 1681 */     return this.tunerTechnology;
/*      */   }
/*      */ 
/*      */   public void setTunerTechnology(String value)
/*      */   {
/* 1693 */     this.tunerTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getURackSize()
/*      */   {
/* 1705 */     return this.uRackSize;
/*      */   }
/*      */ 
/*      */   public void setURackSize(BigInteger value)
/*      */   {
/* 1717 */     this.uRackSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getViewingAngle()
/*      */   {
/* 1729 */     return this.viewingAngle;
/*      */   }
/*      */ 
/*      */   public void setViewingAngle(BigInteger value)
/*      */   {
/* 1741 */     this.viewingAngle = value;
/*      */   }
/*      */ 
/*      */   public String getNotebookDisplayTechnology()
/*      */   {
/* 1753 */     return this.notebookDisplayTechnology;
/*      */   }
/*      */ 
/*      */   public void setNotebookDisplayTechnology(String value)
/*      */   {
/* 1765 */     this.notebookDisplayTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/* 1777 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/* 1789 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public Boolean isHasColorScreen()
/*      */   {
/* 1801 */     return this.hasColorScreen;
/*      */   }
/*      */ 
/*      */   public void setHasColorScreen(Boolean value)
/*      */   {
/* 1813 */     this.hasColorScreen = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayTechnology()
/*      */   {
/* 1825 */     return this.displayTechnology;
/*      */   }
/*      */ 
/*      */   public void setDisplayTechnology(String value)
/*      */   {
/* 1837 */     this.displayTechnology = value;
/*      */   }
/*      */ 
/*      */   public String getMonitorTunerTechnology()
/*      */   {
/* 1849 */     return this.monitorTunerTechnology;
/*      */   }
/*      */ 
/*      */   public void setMonitorTunerTechnology(String value)
/*      */   {
/* 1861 */     this.monitorTunerTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getVoltage()
/*      */   {
/* 1873 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigDecimal value)
/*      */   {
/* 1885 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getWattage()
/*      */   {
/* 1897 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(BigInteger value)
/*      */   {
/* 1909 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public List<WirelessCarrierTypeValues> getWirelessCarrier()
/*      */   {
/* 1935 */     if (this.wirelessCarrier == null) {
/* 1936 */       this.wirelessCarrier = new ArrayList();
/*      */     }
/* 1938 */     return this.wirelessCarrier;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessType()
/*      */   {
/* 1964 */     if (this.wirelessType == null) {
/* 1965 */       this.wirelessType = new ArrayList();
/*      */     }
/* 1967 */     return this.wirelessType;
/*      */   }
/*      */ 
/*      */   public String getAdditionalFeatures()
/*      */   {
/* 1979 */     return this.additionalFeatures;
/*      */   }
/*      */ 
/*      */   public void setAdditionalFeatures(String value)
/*      */   {
/* 1991 */     this.additionalFeatures = value;
/*      */   }
/*      */ 
/*      */   public String getSpecificUsesForProduct()
/*      */   {
/* 2003 */     return this.specificUsesForProduct;
/*      */   }
/*      */ 
/*      */   public void setSpecificUsesForProduct(String value)
/*      */   {
/* 2015 */     this.specificUsesForProduct = value;
/*      */   }
/*      */ 
/*      */   public String getSupportedSoftware()
/*      */   {
/* 2027 */     return this.supportedSoftware;
/*      */   }
/*      */ 
/*      */   public void setSupportedSoftware(String value)
/*      */   {
/* 2039 */     this.supportedSoftware = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfDVIPorts()
/*      */   {
/* 2051 */     return this.numberOfDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfDVIPorts(BigInteger value)
/*      */   {
/* 2063 */     this.numberOfDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 2075 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 2087 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"graphicsCardDescription", "graphicsCardRamSize", "graphicsCardInterface"})
/*      */   public static class GraphicsCard
/*      */   {
/*      */ 
/*      */     @XmlElement(name="GraphicsCardDescription", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String graphicsCardDescription;
/*      */ 
/*      */     @XmlElement(name="GraphicsCardRamSize", required=true)
/*      */     protected MemorySizeDimension graphicsCardRamSize;
/*      */ 
/*      */     @XmlElement(name="GraphicsCardInterface", required=true)
/*      */     protected GraphicsCardInterfaceTypeValues graphicsCardInterface;
/*      */ 
/*      */     public String getGraphicsCardDescription()
/*      */     {
/* 2137 */       return this.graphicsCardDescription;
/*      */     }
/*      */ 
/*      */     public void setGraphicsCardDescription(String value)
/*      */     {
/* 2149 */       this.graphicsCardDescription = value;
/*      */     }
/*      */ 
/*      */     public MemorySizeDimension getGraphicsCardRamSize()
/*      */     {
/* 2161 */       return this.graphicsCardRamSize;
/*      */     }
/*      */ 
/*      */     public void setGraphicsCardRamSize(MemorySizeDimension value)
/*      */     {
/* 2173 */       this.graphicsCardRamSize = value;
/*      */     }
/*      */ 
/*      */     public GraphicsCardInterfaceTypeValues getGraphicsCardInterface()
/*      */     {
/* 2185 */       return this.graphicsCardInterface;
/*      */     }
/*      */ 
/*      */     public void setGraphicsCardInterface(GraphicsCardInterfaceTypeValues value)
/*      */     {
/* 2197 */       this.graphicsCardInterface = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PersonalComputer
 * JD-Core Version:    0.6.2
 */