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
/*      */ @XmlType(name="", propOrder={"variationData", "additionalDrives", "audio", "cardReader", "computerMemoryType", "computerTunerTechnology", "computerWirelessType", "displayResolutionMaximum", "graphicsCard", "graphicsCoProcessor", "connectivityType", "graphicsChipsetBrand", "graphicsRAMType", "hardDiskRotationalSpeed", "hardDiskTechnology", "hardDriveInterface", "hardDriveSize", "hardwarePlatform", "hasColorScreen", "maxExpandedMemorySupported", "modelNumber", "monitorTunerTechnology", "numberOfAudioOutPorts", "numberOfDMIPorts", "numberOfEthernetPorts", "numberOfFirewirePorts", "numberOfGamingPorts", "numberOfHDMIPorts", "numberOfLPT1PrinterPorts", "numberOfMicrophonePorts", "numberOfPS2Ports", "numberOfSerialPorts", "numberOfUSB20Ports", "numberOfUSB30Ports", "numberOfVGAPorts", "notebookDisplayTechnology", "operatingSystem", "opticalDeviceType", "opticalDriveIntegrated", "opticalStorageDeviceType", "processorBrand", "processorCount", "processorSocket", "processorSpeed", "processorType", "ramSize", "ramClockSpeed", "ramFormFactor", "ramTechnology", "rearWebcamResolution", "responseTime", "screenResolution", "screenSize", "series", "softwareIncluded", "speaker", "tabletInputMethod", "tunerTechnology", "uRackSize", "viewingAngle", "voltage", "wattage", "wirelessCarrier", "wirelessType", "additionalFeatures", "specificUsesForProduct", "supportedSoftware", "numberOfDVIPorts", "efficiency"})
/*      */ @XmlRootElement(name="NotebookComputer")
/*      */ public class NotebookComputer
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
/*      */   @XmlElement(name="DisplayResolutionMaximum")
/*      */   protected String displayResolutionMaximum;
/*      */ 
/*      */   @XmlElement(name="GraphicsCard")
/*      */   protected List<GraphicsCard> graphicsCard;
/*      */ 
/*      */   @XmlElement(name="GraphicsCoProcessor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String graphicsCoProcessor;
/*      */ 
/*      */   @XmlElement(name="ConnectivityType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String connectivityType;
/*      */ 
/*      */   @XmlElement(name="GraphicsChipsetBrand")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String graphicsChipsetBrand;
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
/*      */   @XmlElement(name="HardDriveSize", required=true)
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
/*      */   @XmlElement(name="MonitorTunerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String monitorTunerTechnology;
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
/*      */   @XmlElement(name="NotebookDisplayTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String notebookDisplayTechnology;
/*      */ 
/*      */   @XmlElement(name="OperatingSystem", required=true)
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> operatingSystem;
/*      */ 
/*      */   @XmlElement(name="OpticalDeviceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String opticalDeviceType;
/*      */ 
/*      */   @XmlElement(name="OpticalDriveIntegrated")
/*      */   protected BigInteger opticalDriveIntegrated;
/*      */ 
/*      */   @XmlElement(name="OpticalStorageDeviceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String opticalStorageDeviceType;
/*      */ 
/*      */   @XmlElement(name="ProcessorBrand", required=true)
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
/*      */   @XmlElement(name="ProcessorSpeed", required=true)
/*      */   protected FrequencyDimension processorSpeed;
/*      */ 
/*      */   @XmlElement(name="ProcessorType")
/*      */   protected String processorType;
/*      */ 
/*      */   @XmlElement(name="RAMSize", required=true)
/*      */   protected MemorySizeDimension ramSize;
/*      */ 
/*      */   @XmlElement(name="RAMClockSpeed")
/*      */   protected BigInteger ramClockSpeed;
/*      */ 
/*      */   @XmlElement(name="RAMFormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String ramFormFactor;
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
/*      */   @XmlElement(name="U-RackSize")
/*      */   protected BigInteger uRackSize;
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
/*  363 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  375 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public List<AdditionalDrivesTypeValues> getAdditionalDrives()
/*      */   {
/*  401 */     if (this.additionalDrives == null) {
/*  402 */       this.additionalDrives = new ArrayList();
/*      */     }
/*  404 */     return this.additionalDrives;
/*      */   }
/*      */ 
/*      */   public String getAudio()
/*      */   {
/*  416 */     return this.audio;
/*      */   }
/*      */ 
/*      */   public void setAudio(String value)
/*      */   {
/*  428 */     this.audio = value;
/*      */   }
/*      */ 
/*      */   public CardReaderTypeValues getCardReader()
/*      */   {
/*  440 */     return this.cardReader;
/*      */   }
/*      */ 
/*      */   public void setCardReader(CardReaderTypeValues value)
/*      */   {
/*  452 */     this.cardReader = value;
/*      */   }
/*      */ 
/*      */   public List<String> getComputerMemoryType()
/*      */   {
/*  478 */     if (this.computerMemoryType == null) {
/*  479 */       this.computerMemoryType = new ArrayList();
/*      */     }
/*  481 */     return this.computerMemoryType;
/*      */   }
/*      */ 
/*      */   public String getComputerTunerTechnology()
/*      */   {
/*  493 */     return this.computerTunerTechnology;
/*      */   }
/*      */ 
/*      */   public void setComputerTunerTechnology(String value)
/*      */   {
/*  505 */     this.computerTunerTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<String> getComputerWirelessType()
/*      */   {
/*  531 */     if (this.computerWirelessType == null) {
/*  532 */       this.computerWirelessType = new ArrayList();
/*      */     }
/*  534 */     return this.computerWirelessType;
/*      */   }
/*      */ 
/*      */   public String getDisplayResolutionMaximum()
/*      */   {
/*  546 */     return this.displayResolutionMaximum;
/*      */   }
/*      */ 
/*      */   public void setDisplayResolutionMaximum(String value)
/*      */   {
/*  558 */     this.displayResolutionMaximum = value;
/*      */   }
/*      */ 
/*      */   public List<GraphicsCard> getGraphicsCard()
/*      */   {
/*  584 */     if (this.graphicsCard == null) {
/*  585 */       this.graphicsCard = new ArrayList();
/*      */     }
/*  587 */     return this.graphicsCard;
/*      */   }
/*      */ 
/*      */   public String getGraphicsCoProcessor()
/*      */   {
/*  599 */     return this.graphicsCoProcessor;
/*      */   }
/*      */ 
/*      */   public void setGraphicsCoProcessor(String value)
/*      */   {
/*  611 */     this.graphicsCoProcessor = value;
/*      */   }
/*      */ 
/*      */   public String getConnectivityType()
/*      */   {
/*  623 */     return this.connectivityType;
/*      */   }
/*      */ 
/*      */   public void setConnectivityType(String value)
/*      */   {
/*  635 */     this.connectivityType = value;
/*      */   }
/*      */ 
/*      */   public String getGraphicsChipsetBrand()
/*      */   {
/*  647 */     return this.graphicsChipsetBrand;
/*      */   }
/*      */ 
/*      */   public void setGraphicsChipsetBrand(String value)
/*      */   {
/*  659 */     this.graphicsChipsetBrand = value;
/*      */   }
/*      */ 
/*      */   public String getGraphicsRAMType()
/*      */   {
/*  671 */     return this.graphicsRAMType;
/*      */   }
/*      */ 
/*      */   public void setGraphicsRAMType(String value)
/*      */   {
/*  683 */     this.graphicsRAMType = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getHardDiskRotationalSpeed()
/*      */   {
/*  695 */     return this.hardDiskRotationalSpeed;
/*      */   }
/*      */ 
/*      */   public void setHardDiskRotationalSpeed(BigDecimal value)
/*      */   {
/*  707 */     this.hardDiskRotationalSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getHardDiskTechnology()
/*      */   {
/*  719 */     return this.hardDiskTechnology;
/*      */   }
/*      */ 
/*      */   public void setHardDiskTechnology(String value)
/*      */   {
/*  731 */     this.hardDiskTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<HardDriveInterfaceTypeValues> getHardDriveInterface()
/*      */   {
/*  757 */     if (this.hardDriveInterface == null) {
/*  758 */       this.hardDriveInterface = new ArrayList();
/*      */     }
/*  760 */     return this.hardDriveInterface;
/*      */   }
/*      */ 
/*      */   public List<MemorySizeDimension> getHardDriveSize()
/*      */   {
/*  786 */     if (this.hardDriveSize == null) {
/*  787 */       this.hardDriveSize = new ArrayList();
/*      */     }
/*  789 */     return this.hardDriveSize;
/*      */   }
/*      */ 
/*      */   public String getHardwarePlatform()
/*      */   {
/*  801 */     return this.hardwarePlatform;
/*      */   }
/*      */ 
/*      */   public void setHardwarePlatform(String value)
/*      */   {
/*  813 */     this.hardwarePlatform = value;
/*      */   }
/*      */ 
/*      */   public Boolean isHasColorScreen()
/*      */   {
/*  825 */     return this.hasColorScreen;
/*      */   }
/*      */ 
/*      */   public void setHasColorScreen(Boolean value)
/*      */   {
/*  837 */     this.hasColorScreen = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getMaxExpandedMemorySupported()
/*      */   {
/*  849 */     return this.maxExpandedMemorySupported;
/*      */   }
/*      */ 
/*      */   public void setMaxExpandedMemorySupported(MemorySizeDimension value)
/*      */   {
/*  861 */     this.maxExpandedMemorySupported = value;
/*      */   }
/*      */ 
/*      */   public String getModelNumber()
/*      */   {
/*  873 */     return this.modelNumber;
/*      */   }
/*      */ 
/*      */   public void setModelNumber(String value)
/*      */   {
/*  885 */     this.modelNumber = value;
/*      */   }
/*      */ 
/*      */   public String getMonitorTunerTechnology()
/*      */   {
/*  897 */     return this.monitorTunerTechnology;
/*      */   }
/*      */ 
/*      */   public void setMonitorTunerTechnology(String value)
/*      */   {
/*  909 */     this.monitorTunerTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfAudioOutPorts()
/*      */   {
/*  921 */     return this.numberOfAudioOutPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfAudioOutPorts(BigInteger value)
/*      */   {
/*  933 */     this.numberOfAudioOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfDMIPorts()
/*      */   {
/*  945 */     return this.numberOfDMIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfDMIPorts(BigInteger value)
/*      */   {
/*  957 */     this.numberOfDMIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfEthernetPorts()
/*      */   {
/*  969 */     return this.numberOfEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfEthernetPorts(BigInteger value)
/*      */   {
/*  981 */     this.numberOfEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfFirewirePorts()
/*      */   {
/*  993 */     return this.numberOfFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfFirewirePorts(BigInteger value)
/*      */   {
/* 1005 */     this.numberOfFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfGamingPorts()
/*      */   {
/* 1017 */     return this.numberOfGamingPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfGamingPorts(BigInteger value)
/*      */   {
/* 1029 */     this.numberOfGamingPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHDMIPorts()
/*      */   {
/* 1041 */     return this.numberOfHDMIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHDMIPorts(BigInteger value)
/*      */   {
/* 1053 */     this.numberOfHDMIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLPT1PrinterPorts()
/*      */   {
/* 1065 */     return this.numberOfLPT1PrinterPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLPT1PrinterPorts(BigInteger value)
/*      */   {
/* 1077 */     this.numberOfLPT1PrinterPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfMicrophonePorts()
/*      */   {
/* 1089 */     return this.numberOfMicrophonePorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfMicrophonePorts(BigInteger value)
/*      */   {
/* 1101 */     this.numberOfMicrophonePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfPS2Ports()
/*      */   {
/* 1113 */     return this.numberOfPS2Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfPS2Ports(BigInteger value)
/*      */   {
/* 1125 */     this.numberOfPS2Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSerialPorts()
/*      */   {
/* 1137 */     return this.numberOfSerialPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSerialPorts(BigInteger value)
/*      */   {
/* 1149 */     this.numberOfSerialPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfUSB20Ports()
/*      */   {
/* 1161 */     return this.numberOfUSB20Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfUSB20Ports(BigInteger value)
/*      */   {
/* 1173 */     this.numberOfUSB20Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfUSB30Ports()
/*      */   {
/* 1185 */     return this.numberOfUSB30Ports;
/*      */   }
/*      */ 
/*      */   public void setNumberOfUSB30Ports(BigInteger value)
/*      */   {
/* 1197 */     this.numberOfUSB30Ports = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfVGAPorts()
/*      */   {
/* 1209 */     return this.numberOfVGAPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfVGAPorts(BigInteger value)
/*      */   {
/* 1221 */     this.numberOfVGAPorts = value;
/*      */   }
/*      */ 
/*      */   public String getNotebookDisplayTechnology()
/*      */   {
/* 1233 */     return this.notebookDisplayTechnology;
/*      */   }
/*      */ 
/*      */   public void setNotebookDisplayTechnology(String value)
/*      */   {
/* 1245 */     this.notebookDisplayTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/* 1271 */     if (this.operatingSystem == null) {
/* 1272 */       this.operatingSystem = new ArrayList();
/*      */     }
/* 1274 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public String getOpticalDeviceType()
/*      */   {
/* 1286 */     return this.opticalDeviceType;
/*      */   }
/*      */ 
/*      */   public void setOpticalDeviceType(String value)
/*      */   {
/* 1298 */     this.opticalDeviceType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getOpticalDriveIntegrated()
/*      */   {
/* 1310 */     return this.opticalDriveIntegrated;
/*      */   }
/*      */ 
/*      */   public void setOpticalDriveIntegrated(BigInteger value)
/*      */   {
/* 1322 */     this.opticalDriveIntegrated = value;
/*      */   }
/*      */ 
/*      */   public String getOpticalStorageDeviceType()
/*      */   {
/* 1334 */     return this.opticalStorageDeviceType;
/*      */   }
/*      */ 
/*      */   public void setOpticalStorageDeviceType(String value)
/*      */   {
/* 1346 */     this.opticalStorageDeviceType = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorBrand()
/*      */   {
/* 1358 */     return this.processorBrand;
/*      */   }
/*      */ 
/*      */   public void setProcessorBrand(String value)
/*      */   {
/* 1370 */     this.processorBrand = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getProcessorCount()
/*      */   {
/* 1382 */     return this.processorCount;
/*      */   }
/*      */ 
/*      */   public void setProcessorCount(BigInteger value)
/*      */   {
/* 1394 */     this.processorCount = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorSocket()
/*      */   {
/* 1406 */     return this.processorSocket;
/*      */   }
/*      */ 
/*      */   public void setProcessorSocket(String value)
/*      */   {
/* 1418 */     this.processorSocket = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getProcessorSpeed()
/*      */   {
/* 1430 */     return this.processorSpeed;
/*      */   }
/*      */ 
/*      */   public void setProcessorSpeed(FrequencyDimension value)
/*      */   {
/* 1442 */     this.processorSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorType()
/*      */   {
/* 1454 */     return this.processorType;
/*      */   }
/*      */ 
/*      */   public void setProcessorType(String value)
/*      */   {
/* 1466 */     this.processorType = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getRAMSize()
/*      */   {
/* 1478 */     return this.ramSize;
/*      */   }
/*      */ 
/*      */   public void setRAMSize(MemorySizeDimension value)
/*      */   {
/* 1490 */     this.ramSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getRAMClockSpeed()
/*      */   {
/* 1502 */     return this.ramClockSpeed;
/*      */   }
/*      */ 
/*      */   public void setRAMClockSpeed(BigInteger value)
/*      */   {
/* 1514 */     this.ramClockSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getRAMFormFactor()
/*      */   {
/* 1526 */     return this.ramFormFactor;
/*      */   }
/*      */ 
/*      */   public void setRAMFormFactor(String value)
/*      */   {
/* 1538 */     this.ramFormFactor = value;
/*      */   }
/*      */ 
/*      */   public String getRAMTechnology()
/*      */   {
/* 1550 */     return this.ramTechnology;
/*      */   }
/*      */ 
/*      */   public void setRAMTechnology(String value)
/*      */   {
/* 1562 */     this.ramTechnology = value;
/*      */   }
/*      */ 
/*      */   public ResolutionFiveDigitDimension getRearWebcamResolution()
/*      */   {
/* 1574 */     return this.rearWebcamResolution;
/*      */   }
/*      */ 
/*      */   public void setRearWebcamResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 1586 */     this.rearWebcamResolution = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getResponseTime()
/*      */   {
/* 1598 */     return this.responseTime;
/*      */   }
/*      */ 
/*      */   public void setResponseTime(BigInteger value)
/*      */   {
/* 1610 */     this.responseTime = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/* 1622 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/* 1634 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/* 1646 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/* 1658 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public String getSeries()
/*      */   {
/* 1670 */     return this.series;
/*      */   }
/*      */ 
/*      */   public void setSeries(String value)
/*      */   {
/* 1682 */     this.series = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/* 1694 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/* 1706 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeaker()
/*      */   {
/* 1718 */     return this.speaker;
/*      */   }
/*      */ 
/*      */   public void setSpeaker(String value)
/*      */   {
/* 1730 */     this.speaker = value;
/*      */   }
/*      */ 
/*      */   public List<TabletInputMethodTypeValues> getTabletInputMethod()
/*      */   {
/* 1756 */     if (this.tabletInputMethod == null) {
/* 1757 */       this.tabletInputMethod = new ArrayList();
/*      */     }
/* 1759 */     return this.tabletInputMethod;
/*      */   }
/*      */ 
/*      */   public String getTunerTechnology()
/*      */   {
/* 1771 */     return this.tunerTechnology;
/*      */   }
/*      */ 
/*      */   public void setTunerTechnology(String value)
/*      */   {
/* 1783 */     this.tunerTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getURackSize()
/*      */   {
/* 1795 */     return this.uRackSize;
/*      */   }
/*      */ 
/*      */   public void setURackSize(BigInteger value)
/*      */   {
/* 1807 */     this.uRackSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getViewingAngle()
/*      */   {
/* 1819 */     return this.viewingAngle;
/*      */   }
/*      */ 
/*      */   public void setViewingAngle(BigInteger value)
/*      */   {
/* 1831 */     this.viewingAngle = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getVoltage()
/*      */   {
/* 1843 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigDecimal value)
/*      */   {
/* 1855 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getWattage()
/*      */   {
/* 1867 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(BigInteger value)
/*      */   {
/* 1879 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public List<WirelessCarrierTypeValues> getWirelessCarrier()
/*      */   {
/* 1905 */     if (this.wirelessCarrier == null) {
/* 1906 */       this.wirelessCarrier = new ArrayList();
/*      */     }
/* 1908 */     return this.wirelessCarrier;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessType()
/*      */   {
/* 1934 */     if (this.wirelessType == null) {
/* 1935 */       this.wirelessType = new ArrayList();
/*      */     }
/* 1937 */     return this.wirelessType;
/*      */   }
/*      */ 
/*      */   public String getAdditionalFeatures()
/*      */   {
/* 1949 */     return this.additionalFeatures;
/*      */   }
/*      */ 
/*      */   public void setAdditionalFeatures(String value)
/*      */   {
/* 1961 */     this.additionalFeatures = value;
/*      */   }
/*      */ 
/*      */   public String getSpecificUsesForProduct()
/*      */   {
/* 1973 */     return this.specificUsesForProduct;
/*      */   }
/*      */ 
/*      */   public void setSpecificUsesForProduct(String value)
/*      */   {
/* 1985 */     this.specificUsesForProduct = value;
/*      */   }
/*      */ 
/*      */   public String getSupportedSoftware()
/*      */   {
/* 1997 */     return this.supportedSoftware;
/*      */   }
/*      */ 
/*      */   public void setSupportedSoftware(String value)
/*      */   {
/* 2009 */     this.supportedSoftware = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfDVIPorts()
/*      */   {
/* 2021 */     return this.numberOfDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setNumberOfDVIPorts(BigInteger value)
/*      */   {
/* 2033 */     this.numberOfDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 2045 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 2057 */     this.efficiency = value;
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
/* 2107 */       return this.graphicsCardDescription;
/*      */     }
/*      */ 
/*      */     public void setGraphicsCardDescription(String value)
/*      */     {
/* 2119 */       this.graphicsCardDescription = value;
/*      */     }
/*      */ 
/*      */     public MemorySizeDimension getGraphicsCardRamSize()
/*      */     {
/* 2131 */       return this.graphicsCardRamSize;
/*      */     }
/*      */ 
/*      */     public void setGraphicsCardRamSize(MemorySizeDimension value)
/*      */     {
/* 2143 */       this.graphicsCardRamSize = value;
/*      */     }
/*      */ 
/*      */     public GraphicsCardInterfaceTypeValues getGraphicsCardInterface()
/*      */     {
/* 2155 */       return this.graphicsCardInterface;
/*      */     }
/*      */ 
/*      */     public void setGraphicsCardInterface(GraphicsCardInterfaceTypeValues value)
/*      */     {
/* 2167 */       this.graphicsCardInterface = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.NotebookComputer
 * JD-Core Version:    0.6.2
 */