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
/*      */ @XmlType(name="", propOrder={"productType", "assemblyRequired", "battery", "batteryAverageLife", "batteryAverageLifeStandby", "batteryChargeTime", "color", "colorMap", "countryOfOrigin", "displayLength", "displayVolume", "displayWeight", "harmonizedCode", "includedComponents", "isPortable", "itemPackageQuantity", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "manufacturerWarrantyType", "mfrWarrantyDescriptionLabor", "mfrWarrantyDescriptionParts", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "powerSource", "remoteIncluded", "size", "sellerWarrantyDescription", "warnings", "deliveryScheduleGroupId"})
/*      */ @XmlRootElement(name="Computers")
/*      */ public class Computers
/*      */ {
/*      */ 
/*      */   @XmlElement(name="ProductType", required=true)
/*      */   protected ProductType productType;
/*      */ 
/*      */   @XmlElement(name="AssemblyRequired")
/*      */   protected Boolean assemblyRequired;
/*      */ 
/*      */   @XmlElement(name="Battery")
/*      */   protected Battery battery;
/*      */ 
/*      */   @XmlElement(name="BatteryAverageLife")
/*      */   protected BigDecimal batteryAverageLife;
/*      */ 
/*      */   @XmlElement(name="BatteryAverageLifeStandby")
/*      */   protected BigDecimal batteryAverageLifeStandby;
/*      */ 
/*      */   @XmlElement(name="BatteryChargeTime")
/*      */   protected BigDecimal batteryChargeTime;
/*      */ 
/*      */   @XmlElement(name="Color")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String color;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="CountryOfOrigin")
/*      */   protected String countryOfOrigin;
/*      */ 
/*      */   @XmlElement(name="DisplayLength")
/*      */   protected LengthDimension displayLength;
/*      */ 
/*      */   @XmlElement(name="DisplayVolume")
/*      */   protected VolumeDimension displayVolume;
/*      */ 
/*      */   @XmlElement(name="DisplayWeight")
/*      */   protected WeightDimension displayWeight;
/*      */ 
/*      */   @XmlElement(name="HarmonizedCode")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String harmonizedCode;
/*      */ 
/*      */   @XmlElement(name="IncludedComponents")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> includedComponents;
/*      */ 
/*      */   @XmlElement(name="IsPortable", type=Boolean.class)
/*      */   protected List<Boolean> isPortable;
/*      */ 
/*      */   @XmlElement(name="ItemPackageQuantity")
/*      */   protected BigInteger itemPackageQuantity;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryEnergyContent")
/*      */   protected BigInteger lithiumBatteryEnergyContent;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryPackaging")
/*      */   protected String lithiumBatteryPackaging;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryVoltage")
/*      */   protected BigInteger lithiumBatteryVoltage;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryWeight")
/*      */   protected BigInteger lithiumBatteryWeight;
/*      */ 
/*      */   @XmlElement(name="ManufacturerWarrantyType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String manufacturerWarrantyType;
/*      */ 
/*      */   @XmlElement(name="MfrWarrantyDescriptionLabor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mfrWarrantyDescriptionLabor;
/*      */ 
/*      */   @XmlElement(name="MfrWarrantyDescriptionParts")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mfrWarrantyDescriptionParts;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumIonCells")
/*      */   protected BigInteger numberOfLithiumIonCells;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumMetalCells")
/*      */   protected BigInteger numberOfLithiumMetalCells;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="RemoteIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String remoteIncluded;
/*      */ 
/*      */   @XmlElement(name="Size")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String size;
/*      */ 
/*      */   @XmlElement(name="SellerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sellerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="Warnings")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String warnings;
/*      */ 
/*      */   @XmlElement(name="DeliveryScheduleGroupId")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String deliveryScheduleGroupId;
/*      */ 
/*      */   public ProductType getProductType()
/*      */   {
/*  233 */     return this.productType;
/*      */   }
/*      */ 
/*      */   public void setProductType(ProductType value)
/*      */   {
/*  245 */     this.productType = value;
/*      */   }
/*      */ 
/*      */   public Boolean isAssemblyRequired()
/*      */   {
/*  257 */     return this.assemblyRequired;
/*      */   }
/*      */ 
/*      */   public void setAssemblyRequired(Boolean value)
/*      */   {
/*  269 */     this.assemblyRequired = value;
/*      */   }
/*      */ 
/*      */   public Battery getBattery()
/*      */   {
/*  281 */     return this.battery;
/*      */   }
/*      */ 
/*      */   public void setBattery(Battery value)
/*      */   {
/*  293 */     this.battery = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLife()
/*      */   {
/*  305 */     return this.batteryAverageLife;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLife(BigDecimal value)
/*      */   {
/*  317 */     this.batteryAverageLife = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLifeStandby()
/*      */   {
/*  329 */     return this.batteryAverageLifeStandby;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLifeStandby(BigDecimal value)
/*      */   {
/*  341 */     this.batteryAverageLifeStandby = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryChargeTime()
/*      */   {
/*  353 */     return this.batteryChargeTime;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeTime(BigDecimal value)
/*      */   {
/*  365 */     this.batteryChargeTime = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/*  377 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/*  389 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  401 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  413 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getCountryOfOrigin()
/*      */   {
/*  425 */     return this.countryOfOrigin;
/*      */   }
/*      */ 
/*      */   public void setCountryOfOrigin(String value)
/*      */   {
/*  437 */     this.countryOfOrigin = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/*  449 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/*  461 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getDisplayVolume()
/*      */   {
/*  473 */     return this.displayVolume;
/*      */   }
/*      */ 
/*      */   public void setDisplayVolume(VolumeDimension value)
/*      */   {
/*  485 */     this.displayVolume = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/*  497 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/*  509 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public String getHarmonizedCode()
/*      */   {
/*  521 */     return this.harmonizedCode;
/*      */   }
/*      */ 
/*      */   public void setHarmonizedCode(String value)
/*      */   {
/*  533 */     this.harmonizedCode = value;
/*      */   }
/*      */ 
/*      */   public List<String> getIncludedComponents()
/*      */   {
/*  559 */     if (this.includedComponents == null) {
/*  560 */       this.includedComponents = new ArrayList();
/*      */     }
/*  562 */     return this.includedComponents;
/*      */   }
/*      */ 
/*      */   public List<Boolean> getIsPortable()
/*      */   {
/*  588 */     if (this.isPortable == null) {
/*  589 */       this.isPortable = new ArrayList();
/*      */     }
/*  591 */     return this.isPortable;
/*      */   }
/*      */ 
/*      */   public BigInteger getItemPackageQuantity()
/*      */   {
/*  603 */     return this.itemPackageQuantity;
/*      */   }
/*      */ 
/*      */   public void setItemPackageQuantity(BigInteger value)
/*      */   {
/*  615 */     this.itemPackageQuantity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLithiumBatteryEnergyContent()
/*      */   {
/*  627 */     return this.lithiumBatteryEnergyContent;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryEnergyContent(BigInteger value)
/*      */   {
/*  639 */     this.lithiumBatteryEnergyContent = value;
/*      */   }
/*      */ 
/*      */   public String getLithiumBatteryPackaging()
/*      */   {
/*  651 */     return this.lithiumBatteryPackaging;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryPackaging(String value)
/*      */   {
/*  663 */     this.lithiumBatteryPackaging = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLithiumBatteryVoltage()
/*      */   {
/*  675 */     return this.lithiumBatteryVoltage;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryVoltage(BigInteger value)
/*      */   {
/*  687 */     this.lithiumBatteryVoltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLithiumBatteryWeight()
/*      */   {
/*  699 */     return this.lithiumBatteryWeight;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryWeight(BigInteger value)
/*      */   {
/*  711 */     this.lithiumBatteryWeight = value;
/*      */   }
/*      */ 
/*      */   public String getManufacturerWarrantyType()
/*      */   {
/*  723 */     return this.manufacturerWarrantyType;
/*      */   }
/*      */ 
/*      */   public void setManufacturerWarrantyType(String value)
/*      */   {
/*  735 */     this.manufacturerWarrantyType = value;
/*      */   }
/*      */ 
/*      */   public String getMfrWarrantyDescriptionLabor()
/*      */   {
/*  747 */     return this.mfrWarrantyDescriptionLabor;
/*      */   }
/*      */ 
/*      */   public void setMfrWarrantyDescriptionLabor(String value)
/*      */   {
/*  759 */     this.mfrWarrantyDescriptionLabor = value;
/*      */   }
/*      */ 
/*      */   public String getMfrWarrantyDescriptionParts()
/*      */   {
/*  771 */     return this.mfrWarrantyDescriptionParts;
/*      */   }
/*      */ 
/*      */   public void setMfrWarrantyDescriptionParts(String value)
/*      */   {
/*  783 */     this.mfrWarrantyDescriptionParts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumIonCells()
/*      */   {
/*  795 */     return this.numberOfLithiumIonCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumIonCells(BigInteger value)
/*      */   {
/*  807 */     this.numberOfLithiumIonCells = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumMetalCells()
/*      */   {
/*  819 */     return this.numberOfLithiumMetalCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*      */   {
/*  831 */     this.numberOfLithiumMetalCells = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  843 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  855 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteIncluded()
/*      */   {
/*  867 */     return this.remoteIncluded;
/*      */   }
/*      */ 
/*      */   public void setRemoteIncluded(String value)
/*      */   {
/*  879 */     this.remoteIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSize()
/*      */   {
/*  891 */     return this.size;
/*      */   }
/*      */ 
/*      */   public void setSize(String value)
/*      */   {
/*  903 */     this.size = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/*  915 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/*  927 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getWarnings()
/*      */   {
/*  939 */     return this.warnings;
/*      */   }
/*      */ 
/*      */   public void setWarnings(String value)
/*      */   {
/*  951 */     this.warnings = value;
/*      */   }
/*      */ 
/*      */   public String getDeliveryScheduleGroupId()
/*      */   {
/*  963 */     return this.deliveryScheduleGroupId;
/*      */   }
/*      */ 
/*      */   public void setDeliveryScheduleGroupId(String value)
/*      */   {
/*  975 */     this.deliveryScheduleGroupId = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"carryingCaseOrBag", "computerAddOn", "computerComponent", "computerCoolingDevice", "computerDriveOrStorage", "computerInputDevice", "computerProcessor", "computerSpeaker", "computer", "flashMemory", "inkOrToner", "keyboards", "memoryReader", "monitor", "motherboard", "networkingDevice", "notebookComputer", "personalComputer", "printer", "ramMemory", "scanner", "soundCard", "systemCabinet", "systemPowerDevice", "tabletComputer", "videoCard", "videoProjector", "webcam"})
/*      */   public static class ProductType
/*      */   {
/*      */ 
/*      */     @XmlElement(name="CarryingCaseOrBag")
/*      */     protected CarryingCaseOrBag carryingCaseOrBag;
/*      */ 
/*      */     @XmlElement(name="ComputerAddOn")
/*      */     protected ComputerAddOn computerAddOn;
/*      */ 
/*      */     @XmlElement(name="ComputerComponent")
/*      */     protected ComputerComponent computerComponent;
/*      */ 
/*      */     @XmlElement(name="ComputerCoolingDevice")
/*      */     protected ComputerCoolingDevice computerCoolingDevice;
/*      */ 
/*      */     @XmlElement(name="ComputerDriveOrStorage")
/*      */     protected ComputerDriveOrStorage computerDriveOrStorage;
/*      */ 
/*      */     @XmlElement(name="ComputerInputDevice")
/*      */     protected ComputerInputDevice computerInputDevice;
/*      */ 
/*      */     @XmlElement(name="ComputerProcessor")
/*      */     protected ComputerProcessor computerProcessor;
/*      */ 
/*      */     @XmlElement(name="ComputerSpeaker")
/*      */     protected ComputerSpeaker computerSpeaker;
/*      */ 
/*      */     @XmlElement(name="Computer")
/*      */     protected Computer computer;
/*      */ 
/*      */     @XmlElement(name="FlashMemory")
/*      */     protected FlashMemory flashMemory;
/*      */ 
/*      */     @XmlElement(name="InkOrToner")
/*      */     protected InkOrToner inkOrToner;
/*      */ 
/*      */     @XmlElement(name="Keyboards")
/*      */     protected Keyboards keyboards;
/*      */ 
/*      */     @XmlElement(name="MemoryReader")
/*      */     protected MemoryReader memoryReader;
/*      */ 
/*      */     @XmlElement(name="Monitor")
/*      */     protected Monitor monitor;
/*      */ 
/*      */     @XmlElement(name="Motherboard")
/*      */     protected Motherboard motherboard;
/*      */ 
/*      */     @XmlElement(name="NetworkingDevice")
/*      */     protected NetworkingDevice networkingDevice;
/*      */ 
/*      */     @XmlElement(name="NotebookComputer")
/*      */     protected NotebookComputer notebookComputer;
/*      */ 
/*      */     @XmlElement(name="PersonalComputer")
/*      */     protected PersonalComputer personalComputer;
/*      */ 
/*      */     @XmlElement(name="Printer")
/*      */     protected Printer printer;
/*      */ 
/*      */     @XmlElement(name="RamMemory")
/*      */     protected RamMemory ramMemory;
/*      */ 
/*      */     @XmlElement(name="Scanner")
/*      */     protected Scanner scanner;
/*      */ 
/*      */     @XmlElement(name="SoundCard")
/*      */     protected SoundCard soundCard;
/*      */ 
/*      */     @XmlElement(name="SystemCabinet")
/*      */     protected SystemCabinet systemCabinet;
/*      */ 
/*      */     @XmlElement(name="SystemPowerDevice")
/*      */     protected SystemPowerDevice systemPowerDevice;
/*      */ 
/*      */     @XmlElement(name="TabletComputer")
/*      */     protected TabletComputer tabletComputer;
/*      */ 
/*      */     @XmlElement(name="VideoCard")
/*      */     protected VideoCard videoCard;
/*      */ 
/*      */     @XmlElement(name="VideoProjector")
/*      */     protected VideoProjector videoProjector;
/*      */ 
/*      */     @XmlElement(name="Webcam")
/*      */     protected Webcam webcam;
/*      */ 
/*      */     public CarryingCaseOrBag getCarryingCaseOrBag()
/*      */     {
/* 1124 */       return this.carryingCaseOrBag;
/*      */     }
/*      */ 
/*      */     public void setCarryingCaseOrBag(CarryingCaseOrBag value)
/*      */     {
/* 1136 */       this.carryingCaseOrBag = value;
/*      */     }
/*      */ 
/*      */     public ComputerAddOn getComputerAddOn()
/*      */     {
/* 1148 */       return this.computerAddOn;
/*      */     }
/*      */ 
/*      */     public void setComputerAddOn(ComputerAddOn value)
/*      */     {
/* 1160 */       this.computerAddOn = value;
/*      */     }
/*      */ 
/*      */     public ComputerComponent getComputerComponent()
/*      */     {
/* 1172 */       return this.computerComponent;
/*      */     }
/*      */ 
/*      */     public void setComputerComponent(ComputerComponent value)
/*      */     {
/* 1184 */       this.computerComponent = value;
/*      */     }
/*      */ 
/*      */     public ComputerCoolingDevice getComputerCoolingDevice()
/*      */     {
/* 1196 */       return this.computerCoolingDevice;
/*      */     }
/*      */ 
/*      */     public void setComputerCoolingDevice(ComputerCoolingDevice value)
/*      */     {
/* 1208 */       this.computerCoolingDevice = value;
/*      */     }
/*      */ 
/*      */     public ComputerDriveOrStorage getComputerDriveOrStorage()
/*      */     {
/* 1220 */       return this.computerDriveOrStorage;
/*      */     }
/*      */ 
/*      */     public void setComputerDriveOrStorage(ComputerDriveOrStorage value)
/*      */     {
/* 1232 */       this.computerDriveOrStorage = value;
/*      */     }
/*      */ 
/*      */     public ComputerInputDevice getComputerInputDevice()
/*      */     {
/* 1244 */       return this.computerInputDevice;
/*      */     }
/*      */ 
/*      */     public void setComputerInputDevice(ComputerInputDevice value)
/*      */     {
/* 1256 */       this.computerInputDevice = value;
/*      */     }
/*      */ 
/*      */     public ComputerProcessor getComputerProcessor()
/*      */     {
/* 1268 */       return this.computerProcessor;
/*      */     }
/*      */ 
/*      */     public void setComputerProcessor(ComputerProcessor value)
/*      */     {
/* 1280 */       this.computerProcessor = value;
/*      */     }
/*      */ 
/*      */     public ComputerSpeaker getComputerSpeaker()
/*      */     {
/* 1292 */       return this.computerSpeaker;
/*      */     }
/*      */ 
/*      */     public void setComputerSpeaker(ComputerSpeaker value)
/*      */     {
/* 1304 */       this.computerSpeaker = value;
/*      */     }
/*      */ 
/*      */     public Computer getComputer()
/*      */     {
/* 1316 */       return this.computer;
/*      */     }
/*      */ 
/*      */     public void setComputer(Computer value)
/*      */     {
/* 1328 */       this.computer = value;
/*      */     }
/*      */ 
/*      */     public FlashMemory getFlashMemory()
/*      */     {
/* 1340 */       return this.flashMemory;
/*      */     }
/*      */ 
/*      */     public void setFlashMemory(FlashMemory value)
/*      */     {
/* 1352 */       this.flashMemory = value;
/*      */     }
/*      */ 
/*      */     public InkOrToner getInkOrToner()
/*      */     {
/* 1364 */       return this.inkOrToner;
/*      */     }
/*      */ 
/*      */     public void setInkOrToner(InkOrToner value)
/*      */     {
/* 1376 */       this.inkOrToner = value;
/*      */     }
/*      */ 
/*      */     public Keyboards getKeyboards()
/*      */     {
/* 1388 */       return this.keyboards;
/*      */     }
/*      */ 
/*      */     public void setKeyboards(Keyboards value)
/*      */     {
/* 1400 */       this.keyboards = value;
/*      */     }
/*      */ 
/*      */     public MemoryReader getMemoryReader()
/*      */     {
/* 1412 */       return this.memoryReader;
/*      */     }
/*      */ 
/*      */     public void setMemoryReader(MemoryReader value)
/*      */     {
/* 1424 */       this.memoryReader = value;
/*      */     }
/*      */ 
/*      */     public Monitor getMonitor()
/*      */     {
/* 1436 */       return this.monitor;
/*      */     }
/*      */ 
/*      */     public void setMonitor(Monitor value)
/*      */     {
/* 1448 */       this.monitor = value;
/*      */     }
/*      */ 
/*      */     public Motherboard getMotherboard()
/*      */     {
/* 1460 */       return this.motherboard;
/*      */     }
/*      */ 
/*      */     public void setMotherboard(Motherboard value)
/*      */     {
/* 1472 */       this.motherboard = value;
/*      */     }
/*      */ 
/*      */     public NetworkingDevice getNetworkingDevice()
/*      */     {
/* 1484 */       return this.networkingDevice;
/*      */     }
/*      */ 
/*      */     public void setNetworkingDevice(NetworkingDevice value)
/*      */     {
/* 1496 */       this.networkingDevice = value;
/*      */     }
/*      */ 
/*      */     public NotebookComputer getNotebookComputer()
/*      */     {
/* 1508 */       return this.notebookComputer;
/*      */     }
/*      */ 
/*      */     public void setNotebookComputer(NotebookComputer value)
/*      */     {
/* 1520 */       this.notebookComputer = value;
/*      */     }
/*      */ 
/*      */     public PersonalComputer getPersonalComputer()
/*      */     {
/* 1532 */       return this.personalComputer;
/*      */     }
/*      */ 
/*      */     public void setPersonalComputer(PersonalComputer value)
/*      */     {
/* 1544 */       this.personalComputer = value;
/*      */     }
/*      */ 
/*      */     public Printer getPrinter()
/*      */     {
/* 1556 */       return this.printer;
/*      */     }
/*      */ 
/*      */     public void setPrinter(Printer value)
/*      */     {
/* 1568 */       this.printer = value;
/*      */     }
/*      */ 
/*      */     public RamMemory getRamMemory()
/*      */     {
/* 1580 */       return this.ramMemory;
/*      */     }
/*      */ 
/*      */     public void setRamMemory(RamMemory value)
/*      */     {
/* 1592 */       this.ramMemory = value;
/*      */     }
/*      */ 
/*      */     public Scanner getScanner()
/*      */     {
/* 1604 */       return this.scanner;
/*      */     }
/*      */ 
/*      */     public void setScanner(Scanner value)
/*      */     {
/* 1616 */       this.scanner = value;
/*      */     }
/*      */ 
/*      */     public SoundCard getSoundCard()
/*      */     {
/* 1628 */       return this.soundCard;
/*      */     }
/*      */ 
/*      */     public void setSoundCard(SoundCard value)
/*      */     {
/* 1640 */       this.soundCard = value;
/*      */     }
/*      */ 
/*      */     public SystemCabinet getSystemCabinet()
/*      */     {
/* 1652 */       return this.systemCabinet;
/*      */     }
/*      */ 
/*      */     public void setSystemCabinet(SystemCabinet value)
/*      */     {
/* 1664 */       this.systemCabinet = value;
/*      */     }
/*      */ 
/*      */     public SystemPowerDevice getSystemPowerDevice()
/*      */     {
/* 1676 */       return this.systemPowerDevice;
/*      */     }
/*      */ 
/*      */     public void setSystemPowerDevice(SystemPowerDevice value)
/*      */     {
/* 1688 */       this.systemPowerDevice = value;
/*      */     }
/*      */ 
/*      */     public TabletComputer getTabletComputer()
/*      */     {
/* 1700 */       return this.tabletComputer;
/*      */     }
/*      */ 
/*      */     public void setTabletComputer(TabletComputer value)
/*      */     {
/* 1712 */       this.tabletComputer = value;
/*      */     }
/*      */ 
/*      */     public VideoCard getVideoCard()
/*      */     {
/* 1724 */       return this.videoCard;
/*      */     }
/*      */ 
/*      */     public void setVideoCard(VideoCard value)
/*      */     {
/* 1736 */       this.videoCard = value;
/*      */     }
/*      */ 
/*      */     public VideoProjector getVideoProjector()
/*      */     {
/* 1748 */       return this.videoProjector;
/*      */     }
/*      */ 
/*      */     public void setVideoProjector(VideoProjector value)
/*      */     {
/* 1760 */       this.videoProjector = value;
/*      */     }
/*      */ 
/*      */     public Webcam getWebcam()
/*      */     {
/* 1772 */       return this.webcam;
/*      */     }
/*      */ 
/*      */     public void setWebcam(Webcam value)
/*      */     {
/* 1784 */       this.webcam = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Computers
 * JD-Core Version:    0.6.2
 */