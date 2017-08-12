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
/*      */ @XmlType(name="", propOrder={"variationData", "acAdapterIncluded", "automaticBackupSoftwareIncluded", "averagelatency", "averageseektime", "averagewritetime", "bufferSize", "cableInterface", "cacheSize", "dataTransferRate", "dockingStationExternalInterface", "driveMemoryStorageCapacity", "driveRPM", "hardDriveSize", "includedHarddrivedescription", "interfaceType", "internalConnector", "memoryStorageCapacity", "modelNumber", "nasNetworkInterface", "numberOfexternalBays", "numberOfHardDrives", "numberOfInternalBays", "opticalDriveType", "physicalHardDriveFormFactor", "platformCompatability", "raid", "ssdConnectorPins", "ssdDriveArchitechture", "storageMaterialType", "storageReadSpeed", "storageWriteSpeed", "totalFirewire1600Connectors", "totalFirewire3200Connectors", "totalFirewire400Connectors", "totalFirewire800Connectors", "totalSataConnectors", "totalUSB10Connectors", "totalUSB11Connectors", "totalUSB20Connectors", "totalUSB30Connectors", "efficiency"})
/*      */ @XmlRootElement(name="ComputerDriveOrStorage")
/*      */ public class ComputerDriveOrStorage
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="ACAdapterIncluded")
/*      */   protected Boolean acAdapterIncluded;
/*      */ 
/*      */   @XmlElement(name="AutomaticBackupSoftwareIncluded")
/*      */   protected Boolean automaticBackupSoftwareIncluded;
/*      */ 
/*      */   @XmlElement(name="Averagelatency")
/*      */   protected BigInteger averagelatency;
/*      */ 
/*      */   @XmlElement(name="Averageseektime")
/*      */   protected BigInteger averageseektime;
/*      */ 
/*      */   @XmlElement(name="Averagewritetime")
/*      */   protected BigInteger averagewritetime;
/*      */ 
/*      */   @XmlElement(name="BufferSize")
/*      */   protected MemorySizeIntegerDimension bufferSize;
/*      */ 
/*      */   @XmlElement(name="CableInterface")
/*      */   protected List<String> cableInterface;
/*      */ 
/*      */   @XmlElement(name="CacheSize")
/*      */   protected MemorySizeIntegerDimension cacheSize;
/*      */ 
/*      */   @XmlElement(name="DataTransferRate")
/*      */   protected BigInteger dataTransferRate;
/*      */ 
/*      */   @XmlElement(name="DockingStationExternalInterface")
/*      */   protected DockingStationExternalInterfaceTypeValues dockingStationExternalInterface;
/*      */ 
/*      */   @XmlElement(name="DriveMemoryStorageCapacity")
/*      */   protected MemorySizeIntegerDimension driveMemoryStorageCapacity;
/*      */ 
/*      */   @XmlElement(name="DriveRPM")
/*      */   protected BigInteger driveRPM;
/*      */ 
/*      */   @XmlElement(name="HardDriveSize")
/*      */   protected List<MemorySizeDimension> hardDriveSize;
/*      */ 
/*      */   @XmlElement(name="IncludedHarddrivedescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String includedHarddrivedescription;
/*      */ 
/*      */   @XmlElement(name="InterfaceType")
/*      */   protected InterfaceTypeValues interfaceType;
/*      */ 
/*      */   @XmlElement(name="InternalConnector")
/*      */   protected List<InternalConnectorTypeValues> internalConnector;
/*      */ 
/*      */   @XmlElement(name="MemoryStorageCapacity")
/*      */   protected MemorySizeIntegerDimension memoryStorageCapacity;
/*      */ 
/*      */   @XmlElement(name="ModelNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String modelNumber;
/*      */ 
/*      */   @XmlElement(name="NASNetworkInterface")
/*      */   protected List<DataTransferSpeedIntegerDimension> nasNetworkInterface;
/*      */ 
/*      */   @XmlElement(name="NumberOfexternalBays")
/*      */   protected BigInteger numberOfexternalBays;
/*      */ 
/*      */   @XmlElement(name="NumberOfHardDrives")
/*      */   protected BigInteger numberOfHardDrives;
/*      */ 
/*      */   @XmlElement(name="NumberOfInternalBays")
/*      */   protected BigInteger numberOfInternalBays;
/*      */ 
/*      */   @XmlElement(name="OpticalDriveType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String opticalDriveType;
/*      */ 
/*      */   @XmlElement(name="PhysicalHardDriveFormFactor")
/*      */   protected List<BigDecimal> physicalHardDriveFormFactor;
/*      */ 
/*      */   @XmlElement(name="PlatformCompatability")
/*      */   protected String platformCompatability;
/*      */ 
/*      */   @XmlElement(name="RAID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String raid;
/*      */ 
/*      */   @XmlElement(name="SSDConnectorPins")
/*      */   protected BigInteger ssdConnectorPins;
/*      */ 
/*      */   @XmlElement(name="SSDDriveArchitechture")
/*      */   protected String ssdDriveArchitechture;
/*      */ 
/*      */   @XmlElement(name="StorageMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String storageMaterialType;
/*      */ 
/*      */   @XmlElement(name="StorageReadSpeed")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String storageReadSpeed;
/*      */ 
/*      */   @XmlElement(name="StorageWriteSpeed")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String storageWriteSpeed;
/*      */ 
/*      */   @XmlElement(name="TotalFirewire1600Connectors")
/*      */   protected BigInteger totalFirewire1600Connectors;
/*      */ 
/*      */   @XmlElement(name="TotalFirewire3200Connectors")
/*      */   protected BigInteger totalFirewire3200Connectors;
/*      */ 
/*      */   @XmlElement(name="TotalFirewire400Connectors")
/*      */   protected BigInteger totalFirewire400Connectors;
/*      */ 
/*      */   @XmlElement(name="TotalFirewire800Connectors")
/*      */   protected BigInteger totalFirewire800Connectors;
/*      */ 
/*      */   @XmlElement(name="TotalSataConnectors")
/*      */   protected BigInteger totalSataConnectors;
/*      */ 
/*      */   @XmlElement(name="TotalUSB1.0Connectors")
/*      */   protected BigInteger totalUSB10Connectors;
/*      */ 
/*      */   @XmlElement(name="TotalUSB1.1Connectors")
/*      */   protected BigInteger totalUSB11Connectors;
/*      */ 
/*      */   @XmlElement(name="TotalUSB2.0Connectors")
/*      */   protected BigInteger totalUSB20Connectors;
/*      */ 
/*      */   @XmlElement(name="TotalUSB3.0Connectors")
/*      */   protected BigInteger totalUSB30Connectors;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  227 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  239 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public Boolean isACAdapterIncluded()
/*      */   {
/*  251 */     return this.acAdapterIncluded;
/*      */   }
/*      */ 
/*      */   public void setACAdapterIncluded(Boolean value)
/*      */   {
/*  263 */     this.acAdapterIncluded = value;
/*      */   }
/*      */ 
/*      */   public Boolean isAutomaticBackupSoftwareIncluded()
/*      */   {
/*  275 */     return this.automaticBackupSoftwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setAutomaticBackupSoftwareIncluded(Boolean value)
/*      */   {
/*  287 */     this.automaticBackupSoftwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getAveragelatency()
/*      */   {
/*  299 */     return this.averagelatency;
/*      */   }
/*      */ 
/*      */   public void setAveragelatency(BigInteger value)
/*      */   {
/*  311 */     this.averagelatency = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getAverageseektime()
/*      */   {
/*  323 */     return this.averageseektime;
/*      */   }
/*      */ 
/*      */   public void setAverageseektime(BigInteger value)
/*      */   {
/*  335 */     this.averageseektime = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getAveragewritetime()
/*      */   {
/*  347 */     return this.averagewritetime;
/*      */   }
/*      */ 
/*      */   public void setAveragewritetime(BigInteger value)
/*      */   {
/*  359 */     this.averagewritetime = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeIntegerDimension getBufferSize()
/*      */   {
/*  371 */     return this.bufferSize;
/*      */   }
/*      */ 
/*      */   public void setBufferSize(MemorySizeIntegerDimension value)
/*      */   {
/*  383 */     this.bufferSize = value;
/*      */   }
/*      */ 
/*      */   public List<String> getCableInterface()
/*      */   {
/*  409 */     if (this.cableInterface == null) {
/*  410 */       this.cableInterface = new ArrayList();
/*      */     }
/*  412 */     return this.cableInterface;
/*      */   }
/*      */ 
/*      */   public MemorySizeIntegerDimension getCacheSize()
/*      */   {
/*  424 */     return this.cacheSize;
/*      */   }
/*      */ 
/*      */   public void setCacheSize(MemorySizeIntegerDimension value)
/*      */   {
/*  436 */     this.cacheSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getDataTransferRate()
/*      */   {
/*  448 */     return this.dataTransferRate;
/*      */   }
/*      */ 
/*      */   public void setDataTransferRate(BigInteger value)
/*      */   {
/*  460 */     this.dataTransferRate = value;
/*      */   }
/*      */ 
/*      */   public DockingStationExternalInterfaceTypeValues getDockingStationExternalInterface()
/*      */   {
/*  472 */     return this.dockingStationExternalInterface;
/*      */   }
/*      */ 
/*      */   public void setDockingStationExternalInterface(DockingStationExternalInterfaceTypeValues value)
/*      */   {
/*  484 */     this.dockingStationExternalInterface = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeIntegerDimension getDriveMemoryStorageCapacity()
/*      */   {
/*  496 */     return this.driveMemoryStorageCapacity;
/*      */   }
/*      */ 
/*      */   public void setDriveMemoryStorageCapacity(MemorySizeIntegerDimension value)
/*      */   {
/*  508 */     this.driveMemoryStorageCapacity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getDriveRPM()
/*      */   {
/*  520 */     return this.driveRPM;
/*      */   }
/*      */ 
/*      */   public void setDriveRPM(BigInteger value)
/*      */   {
/*  532 */     this.driveRPM = value;
/*      */   }
/*      */ 
/*      */   public List<MemorySizeDimension> getHardDriveSize()
/*      */   {
/*  558 */     if (this.hardDriveSize == null) {
/*  559 */       this.hardDriveSize = new ArrayList();
/*      */     }
/*  561 */     return this.hardDriveSize;
/*      */   }
/*      */ 
/*      */   public String getIncludedHarddrivedescription()
/*      */   {
/*  573 */     return this.includedHarddrivedescription;
/*      */   }
/*      */ 
/*      */   public void setIncludedHarddrivedescription(String value)
/*      */   {
/*  585 */     this.includedHarddrivedescription = value;
/*      */   }
/*      */ 
/*      */   public InterfaceTypeValues getInterfaceType()
/*      */   {
/*  597 */     return this.interfaceType;
/*      */   }
/*      */ 
/*      */   public void setInterfaceType(InterfaceTypeValues value)
/*      */   {
/*  609 */     this.interfaceType = value;
/*      */   }
/*      */ 
/*      */   public List<InternalConnectorTypeValues> getInternalConnector()
/*      */   {
/*  635 */     if (this.internalConnector == null) {
/*  636 */       this.internalConnector = new ArrayList();
/*      */     }
/*  638 */     return this.internalConnector;
/*      */   }
/*      */ 
/*      */   public MemorySizeIntegerDimension getMemoryStorageCapacity()
/*      */   {
/*  650 */     return this.memoryStorageCapacity;
/*      */   }
/*      */ 
/*      */   public void setMemoryStorageCapacity(MemorySizeIntegerDimension value)
/*      */   {
/*  662 */     this.memoryStorageCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getModelNumber()
/*      */   {
/*  674 */     return this.modelNumber;
/*      */   }
/*      */ 
/*      */   public void setModelNumber(String value)
/*      */   {
/*  686 */     this.modelNumber = value;
/*      */   }
/*      */ 
/*      */   public List<DataTransferSpeedIntegerDimension> getNASNetworkInterface()
/*      */   {
/*  712 */     if (this.nasNetworkInterface == null) {
/*  713 */       this.nasNetworkInterface = new ArrayList();
/*      */     }
/*  715 */     return this.nasNetworkInterface;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfexternalBays()
/*      */   {
/*  727 */     return this.numberOfexternalBays;
/*      */   }
/*      */ 
/*      */   public void setNumberOfexternalBays(BigInteger value)
/*      */   {
/*  739 */     this.numberOfexternalBays = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHardDrives()
/*      */   {
/*  751 */     return this.numberOfHardDrives;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHardDrives(BigInteger value)
/*      */   {
/*  763 */     this.numberOfHardDrives = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfInternalBays()
/*      */   {
/*  775 */     return this.numberOfInternalBays;
/*      */   }
/*      */ 
/*      */   public void setNumberOfInternalBays(BigInteger value)
/*      */   {
/*  787 */     this.numberOfInternalBays = value;
/*      */   }
/*      */ 
/*      */   public String getOpticalDriveType()
/*      */   {
/*  799 */     return this.opticalDriveType;
/*      */   }
/*      */ 
/*      */   public void setOpticalDriveType(String value)
/*      */   {
/*  811 */     this.opticalDriveType = value;
/*      */   }
/*      */ 
/*      */   public List<BigDecimal> getPhysicalHardDriveFormFactor()
/*      */   {
/*  837 */     if (this.physicalHardDriveFormFactor == null) {
/*  838 */       this.physicalHardDriveFormFactor = new ArrayList();
/*      */     }
/*  840 */     return this.physicalHardDriveFormFactor;
/*      */   }
/*      */ 
/*      */   public String getPlatformCompatability()
/*      */   {
/*  852 */     return this.platformCompatability;
/*      */   }
/*      */ 
/*      */   public void setPlatformCompatability(String value)
/*      */   {
/*  864 */     this.platformCompatability = value;
/*      */   }
/*      */ 
/*      */   public String getRAID()
/*      */   {
/*  876 */     return this.raid;
/*      */   }
/*      */ 
/*      */   public void setRAID(String value)
/*      */   {
/*  888 */     this.raid = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getSSDConnectorPins()
/*      */   {
/*  900 */     return this.ssdConnectorPins;
/*      */   }
/*      */ 
/*      */   public void setSSDConnectorPins(BigInteger value)
/*      */   {
/*  912 */     this.ssdConnectorPins = value;
/*      */   }
/*      */ 
/*      */   public String getSSDDriveArchitechture()
/*      */   {
/*  924 */     return this.ssdDriveArchitechture;
/*      */   }
/*      */ 
/*      */   public void setSSDDriveArchitechture(String value)
/*      */   {
/*  936 */     this.ssdDriveArchitechture = value;
/*      */   }
/*      */ 
/*      */   public String getStorageMaterialType()
/*      */   {
/*  948 */     return this.storageMaterialType;
/*      */   }
/*      */ 
/*      */   public void setStorageMaterialType(String value)
/*      */   {
/*  960 */     this.storageMaterialType = value;
/*      */   }
/*      */ 
/*      */   public String getStorageReadSpeed()
/*      */   {
/*  972 */     return this.storageReadSpeed;
/*      */   }
/*      */ 
/*      */   public void setStorageReadSpeed(String value)
/*      */   {
/*  984 */     this.storageReadSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getStorageWriteSpeed()
/*      */   {
/*  996 */     return this.storageWriteSpeed;
/*      */   }
/*      */ 
/*      */   public void setStorageWriteSpeed(String value)
/*      */   {
/* 1008 */     this.storageWriteSpeed = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewire1600Connectors()
/*      */   {
/* 1020 */     return this.totalFirewire1600Connectors;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewire1600Connectors(BigInteger value)
/*      */   {
/* 1032 */     this.totalFirewire1600Connectors = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewire3200Connectors()
/*      */   {
/* 1044 */     return this.totalFirewire3200Connectors;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewire3200Connectors(BigInteger value)
/*      */   {
/* 1056 */     this.totalFirewire3200Connectors = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewire400Connectors()
/*      */   {
/* 1068 */     return this.totalFirewire400Connectors;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewire400Connectors(BigInteger value)
/*      */   {
/* 1080 */     this.totalFirewire400Connectors = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewire800Connectors()
/*      */   {
/* 1092 */     return this.totalFirewire800Connectors;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewire800Connectors(BigInteger value)
/*      */   {
/* 1104 */     this.totalFirewire800Connectors = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSataConnectors()
/*      */   {
/* 1116 */     return this.totalSataConnectors;
/*      */   }
/*      */ 
/*      */   public void setTotalSataConnectors(BigInteger value)
/*      */   {
/* 1128 */     this.totalSataConnectors = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSB10Connectors()
/*      */   {
/* 1140 */     return this.totalUSB10Connectors;
/*      */   }
/*      */ 
/*      */   public void setTotalUSB10Connectors(BigInteger value)
/*      */   {
/* 1152 */     this.totalUSB10Connectors = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSB11Connectors()
/*      */   {
/* 1164 */     return this.totalUSB11Connectors;
/*      */   }
/*      */ 
/*      */   public void setTotalUSB11Connectors(BigInteger value)
/*      */   {
/* 1176 */     this.totalUSB11Connectors = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSB20Connectors()
/*      */   {
/* 1188 */     return this.totalUSB20Connectors;
/*      */   }
/*      */ 
/*      */   public void setTotalUSB20Connectors(BigInteger value)
/*      */   {
/* 1200 */     this.totalUSB20Connectors = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSB30Connectors()
/*      */   {
/* 1212 */     return this.totalUSB30Connectors;
/*      */   }
/*      */ 
/*      */   public void setTotalUSB30Connectors(BigInteger value)
/*      */   {
/* 1224 */     this.totalUSB30Connectors = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1236 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1248 */     this.efficiency = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerDriveOrStorage
 * JD-Core Version:    0.6.2
 */