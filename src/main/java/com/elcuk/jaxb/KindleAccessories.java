/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlSchemaType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"variationData", "color", "colorMap", "voltage", "wattage", "powerSource", "additionalFeatures", "vehicleSpeakerSize", "speakerDiameter", "telephoneType", "pdaBaseModel", "digitalMediaFormat", "homeAutomationCommunicationDevice", "digitalAudioCapacity", "holderCapacity", "memorySlotsAvailable", "processorBrand", "processorCount", "processorType", "processorSpeed", "ramSize", "screenResolution", "softwareIncluded", "colorScreen", "screenSize", "wirelessType", "hardDriveSize", "hardDriveInterface", "operatingSystem", "hardwarePlatform", "computerMemoryType", "itemPackageQuantity", "purchasingFeeRefSKU"})
/*      */ @XmlRootElement(name="KindleAccessories")
/*      */ public class KindleAccessories
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="Color")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String color;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="Voltage")
/*      */   protected VoltageDecimalDimension voltage;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected WattageIntegerDimension wattage;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="AdditionalFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String additionalFeatures;
/*      */ 
/*      */   @XmlElement(name="VehicleSpeakerSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String vehicleSpeakerSize;
/*      */ 
/*      */   @XmlElement(name="SpeakerDiameter")
/*      */   protected LengthDimension speakerDiameter;
/*      */ 
/*      */   @XmlElement(name="TelephoneType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> telephoneType;
/*      */ 
/*      */   @XmlElement(name="PDABaseModel")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> pdaBaseModel;
/*      */ 
/*      */   @XmlElement(name="DigitalMediaFormat")
/*      */   protected String digitalMediaFormat;
/*      */ 
/*      */   @XmlElement(name="HomeAutomationCommunicationDevice")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String homeAutomationCommunicationDevice;
/*      */ 
/*      */   @XmlElement(name="DigitalAudioCapacity")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String digitalAudioCapacity;
/*      */ 
/*      */   @XmlElement(name="HolderCapacity")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String holderCapacity;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="ProcessorBrand")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String processorBrand;
/*      */ 
/*      */   @XmlElement(name="ProcessorCount")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger processorCount;
/*      */ 
/*      */   @XmlElement(name="ProcessorType")
/*      */   protected String processorType;
/*      */ 
/*      */   @XmlElement(name="ProcessorSpeed")
/*      */   protected FrequencyDimension processorSpeed;
/*      */ 
/*      */   @XmlElement(name="RAMSize")
/*      */   protected MemorySizeDimension ramSize;
/*      */ 
/*      */   @XmlElement(name="ScreenResolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenResolution;
/*      */ 
/*      */   @XmlElement(name="SoftwareIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String softwareIncluded;
/*      */ 
/*      */   @XmlElement(name="ColorScreen")
/*      */   protected Boolean colorScreen;
/*      */ 
/*      */   @XmlElement(name="ScreenSize")
/*      */   protected LengthDimension screenSize;
/*      */ 
/*      */   @XmlElement(name="WirelessType")
/*      */   protected List<String> wirelessType;
/*      */ 
/*      */   @XmlElement(name="HardDriveSize")
/*      */   protected List<MemorySizeDimension> hardDriveSize;
/*      */ 
/*      */   @XmlElement(name="HardDriveInterface")
/*      */   protected List<HardDriveInterfaceTypeValues> hardDriveInterface;
/*      */ 
/*      */   @XmlElement(name="OperatingSystem")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> operatingSystem;
/*      */ 
/*      */   @XmlElement(name="HardwarePlatform")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String hardwarePlatform;
/*      */ 
/*      */   @XmlElement(name="ComputerMemoryType")
/*      */   protected List<String> computerMemoryType;
/*      */ 
/*      */   @XmlElement(name="ItemPackageQuantity")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger itemPackageQuantity;
/*      */ 
/*      */   @XmlElement(name="PurchasingFeeRefSKU")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String purchasingFeeRefSKU;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  256 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  268 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/*  280 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/*  292 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  304 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  316 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public VoltageDecimalDimension getVoltage()
/*      */   {
/*  328 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(VoltageDecimalDimension value)
/*      */   {
/*  340 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public WattageIntegerDimension getWattage()
/*      */   {
/*  352 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageIntegerDimension value)
/*      */   {
/*  364 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  376 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  388 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getAdditionalFeatures()
/*      */   {
/*  400 */     return this.additionalFeatures;
/*      */   }
/*      */ 
/*      */   public void setAdditionalFeatures(String value)
/*      */   {
/*  412 */     this.additionalFeatures = value;
/*      */   }
/*      */ 
/*      */   public String getVehicleSpeakerSize()
/*      */   {
/*  424 */     return this.vehicleSpeakerSize;
/*      */   }
/*      */ 
/*      */   public void setVehicleSpeakerSize(String value)
/*      */   {
/*  436 */     this.vehicleSpeakerSize = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpeakerDiameter()
/*      */   {
/*  448 */     return this.speakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSpeakerDiameter(LengthDimension value)
/*      */   {
/*  460 */     this.speakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public List<String> getTelephoneType()
/*      */   {
/*  486 */     if (this.telephoneType == null) {
/*  487 */       this.telephoneType = new ArrayList();
/*      */     }
/*  489 */     return this.telephoneType;
/*      */   }
/*      */ 
/*      */   public List<String> getPDABaseModel()
/*      */   {
/*  515 */     if (this.pdaBaseModel == null) {
/*  516 */       this.pdaBaseModel = new ArrayList();
/*      */     }
/*  518 */     return this.pdaBaseModel;
/*      */   }
/*      */ 
/*      */   public String getDigitalMediaFormat()
/*      */   {
/*  530 */     return this.digitalMediaFormat;
/*      */   }
/*      */ 
/*      */   public void setDigitalMediaFormat(String value)
/*      */   {
/*  542 */     this.digitalMediaFormat = value;
/*      */   }
/*      */ 
/*      */   public String getHomeAutomationCommunicationDevice()
/*      */   {
/*  554 */     return this.homeAutomationCommunicationDevice;
/*      */   }
/*      */ 
/*      */   public void setHomeAutomationCommunicationDevice(String value)
/*      */   {
/*  566 */     this.homeAutomationCommunicationDevice = value;
/*      */   }
/*      */ 
/*      */   public String getDigitalAudioCapacity()
/*      */   {
/*  578 */     return this.digitalAudioCapacity;
/*      */   }
/*      */ 
/*      */   public void setDigitalAudioCapacity(String value)
/*      */   {
/*  590 */     this.digitalAudioCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getHolderCapacity()
/*      */   {
/*  602 */     return this.holderCapacity;
/*      */   }
/*      */ 
/*      */   public void setHolderCapacity(String value)
/*      */   {
/*  614 */     this.holderCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  626 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  638 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorBrand()
/*      */   {
/*  650 */     return this.processorBrand;
/*      */   }
/*      */ 
/*      */   public void setProcessorBrand(String value)
/*      */   {
/*  662 */     this.processorBrand = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getProcessorCount()
/*      */   {
/*  674 */     return this.processorCount;
/*      */   }
/*      */ 
/*      */   public void setProcessorCount(BigInteger value)
/*      */   {
/*  686 */     this.processorCount = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorType()
/*      */   {
/*  698 */     return this.processorType;
/*      */   }
/*      */ 
/*      */   public void setProcessorType(String value)
/*      */   {
/*  710 */     this.processorType = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getProcessorSpeed()
/*      */   {
/*  722 */     return this.processorSpeed;
/*      */   }
/*      */ 
/*      */   public void setProcessorSpeed(FrequencyDimension value)
/*      */   {
/*  734 */     this.processorSpeed = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getRAMSize()
/*      */   {
/*  746 */     return this.ramSize;
/*      */   }
/*      */ 
/*      */   public void setRAMSize(MemorySizeDimension value)
/*      */   {
/*  758 */     this.ramSize = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/*  770 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/*  782 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/*  794 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/*  806 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public Boolean isColorScreen()
/*      */   {
/*  818 */     return this.colorScreen;
/*      */   }
/*      */ 
/*      */   public void setColorScreen(Boolean value)
/*      */   {
/*  830 */     this.colorScreen = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/*  842 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/*  854 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessType()
/*      */   {
/*  880 */     if (this.wirelessType == null) {
/*  881 */       this.wirelessType = new ArrayList();
/*      */     }
/*  883 */     return this.wirelessType;
/*      */   }
/*      */ 
/*      */   public List<MemorySizeDimension> getHardDriveSize()
/*      */   {
/*  909 */     if (this.hardDriveSize == null) {
/*  910 */       this.hardDriveSize = new ArrayList();
/*      */     }
/*  912 */     return this.hardDriveSize;
/*      */   }
/*      */ 
/*      */   public List<HardDriveInterfaceTypeValues> getHardDriveInterface()
/*      */   {
/*  938 */     if (this.hardDriveInterface == null) {
/*  939 */       this.hardDriveInterface = new ArrayList();
/*      */     }
/*  941 */     return this.hardDriveInterface;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/*  967 */     if (this.operatingSystem == null) {
/*  968 */       this.operatingSystem = new ArrayList();
/*      */     }
/*  970 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public String getHardwarePlatform()
/*      */   {
/*  982 */     return this.hardwarePlatform;
/*      */   }
/*      */ 
/*      */   public void setHardwarePlatform(String value)
/*      */   {
/*  994 */     this.hardwarePlatform = value;
/*      */   }
/*      */ 
/*      */   public List<String> getComputerMemoryType()
/*      */   {
/* 1020 */     if (this.computerMemoryType == null) {
/* 1021 */       this.computerMemoryType = new ArrayList();
/*      */     }
/* 1023 */     return this.computerMemoryType;
/*      */   }
/*      */ 
/*      */   public BigInteger getItemPackageQuantity()
/*      */   {
/* 1035 */     return this.itemPackageQuantity;
/*      */   }
/*      */ 
/*      */   public void setItemPackageQuantity(BigInteger value)
/*      */   {
/* 1047 */     this.itemPackageQuantity = value;
/*      */   }
/*      */ 
/*      */   public String getPurchasingFeeRefSKU()
/*      */   {
/* 1059 */     return this.purchasingFeeRefSKU;
/*      */   }
/*      */ 
/*      */   public void setPurchasingFeeRefSKU(String value)
/*      */   {
/* 1071 */     this.purchasingFeeRefSKU = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"parentage", "variationTheme"})
/*      */   public static class VariationData
/*      */   {
/*      */ 
/*      */     @XmlElement(name="Parentage", required=true)
/*      */     protected String parentage;
/*      */ 
/*      */     @XmlElement(name="VariationTheme")
/*      */     protected String variationTheme;
/*      */ 
/*      */     public String getParentage()
/*      */     {
/* 1133 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 1145 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 1157 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 1169 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.KindleAccessories
 * JD-Core Version:    0.6.2
 */