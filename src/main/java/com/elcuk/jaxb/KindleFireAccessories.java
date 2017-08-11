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
/*      */ @XmlRootElement(name="KindleFireAccessories")
/*      */ public class KindleFireAccessories
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
/*  254 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  266 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/*  278 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/*  290 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  302 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  314 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public VoltageDecimalDimension getVoltage()
/*      */   {
/*  326 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(VoltageDecimalDimension value)
/*      */   {
/*  338 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public WattageIntegerDimension getWattage()
/*      */   {
/*  350 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageIntegerDimension value)
/*      */   {
/*  362 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  374 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  386 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getAdditionalFeatures()
/*      */   {
/*  398 */     return this.additionalFeatures;
/*      */   }
/*      */ 
/*      */   public void setAdditionalFeatures(String value)
/*      */   {
/*  410 */     this.additionalFeatures = value;
/*      */   }
/*      */ 
/*      */   public String getVehicleSpeakerSize()
/*      */   {
/*  422 */     return this.vehicleSpeakerSize;
/*      */   }
/*      */ 
/*      */   public void setVehicleSpeakerSize(String value)
/*      */   {
/*  434 */     this.vehicleSpeakerSize = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpeakerDiameter()
/*      */   {
/*  446 */     return this.speakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSpeakerDiameter(LengthDimension value)
/*      */   {
/*  458 */     this.speakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public List<String> getTelephoneType()
/*      */   {
/*  484 */     if (this.telephoneType == null) {
/*  485 */       this.telephoneType = new ArrayList();
/*      */     }
/*  487 */     return this.telephoneType;
/*      */   }
/*      */ 
/*      */   public List<String> getPDABaseModel()
/*      */   {
/*  513 */     if (this.pdaBaseModel == null) {
/*  514 */       this.pdaBaseModel = new ArrayList();
/*      */     }
/*  516 */     return this.pdaBaseModel;
/*      */   }
/*      */ 
/*      */   public String getDigitalMediaFormat()
/*      */   {
/*  528 */     return this.digitalMediaFormat;
/*      */   }
/*      */ 
/*      */   public void setDigitalMediaFormat(String value)
/*      */   {
/*  540 */     this.digitalMediaFormat = value;
/*      */   }
/*      */ 
/*      */   public String getHomeAutomationCommunicationDevice()
/*      */   {
/*  552 */     return this.homeAutomationCommunicationDevice;
/*      */   }
/*      */ 
/*      */   public void setHomeAutomationCommunicationDevice(String value)
/*      */   {
/*  564 */     this.homeAutomationCommunicationDevice = value;
/*      */   }
/*      */ 
/*      */   public String getDigitalAudioCapacity()
/*      */   {
/*  576 */     return this.digitalAudioCapacity;
/*      */   }
/*      */ 
/*      */   public void setDigitalAudioCapacity(String value)
/*      */   {
/*  588 */     this.digitalAudioCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getHolderCapacity()
/*      */   {
/*  600 */     return this.holderCapacity;
/*      */   }
/*      */ 
/*      */   public void setHolderCapacity(String value)
/*      */   {
/*  612 */     this.holderCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  624 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  636 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorBrand()
/*      */   {
/*  648 */     return this.processorBrand;
/*      */   }
/*      */ 
/*      */   public void setProcessorBrand(String value)
/*      */   {
/*  660 */     this.processorBrand = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getProcessorCount()
/*      */   {
/*  672 */     return this.processorCount;
/*      */   }
/*      */ 
/*      */   public void setProcessorCount(BigInteger value)
/*      */   {
/*  684 */     this.processorCount = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorType()
/*      */   {
/*  696 */     return this.processorType;
/*      */   }
/*      */ 
/*      */   public void setProcessorType(String value)
/*      */   {
/*  708 */     this.processorType = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getProcessorSpeed()
/*      */   {
/*  720 */     return this.processorSpeed;
/*      */   }
/*      */ 
/*      */   public void setProcessorSpeed(FrequencyDimension value)
/*      */   {
/*  732 */     this.processorSpeed = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getRAMSize()
/*      */   {
/*  744 */     return this.ramSize;
/*      */   }
/*      */ 
/*      */   public void setRAMSize(MemorySizeDimension value)
/*      */   {
/*  756 */     this.ramSize = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/*  768 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/*  780 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/*  792 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/*  804 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public Boolean isColorScreen()
/*      */   {
/*  816 */     return this.colorScreen;
/*      */   }
/*      */ 
/*      */   public void setColorScreen(Boolean value)
/*      */   {
/*  828 */     this.colorScreen = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/*  840 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/*  852 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessType()
/*      */   {
/*  878 */     if (this.wirelessType == null) {
/*  879 */       this.wirelessType = new ArrayList();
/*      */     }
/*  881 */     return this.wirelessType;
/*      */   }
/*      */ 
/*      */   public List<MemorySizeDimension> getHardDriveSize()
/*      */   {
/*  907 */     if (this.hardDriveSize == null) {
/*  908 */       this.hardDriveSize = new ArrayList();
/*      */     }
/*  910 */     return this.hardDriveSize;
/*      */   }
/*      */ 
/*      */   public List<HardDriveInterfaceTypeValues> getHardDriveInterface()
/*      */   {
/*  936 */     if (this.hardDriveInterface == null) {
/*  937 */       this.hardDriveInterface = new ArrayList();
/*      */     }
/*  939 */     return this.hardDriveInterface;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/*  965 */     if (this.operatingSystem == null) {
/*  966 */       this.operatingSystem = new ArrayList();
/*      */     }
/*  968 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public String getHardwarePlatform()
/*      */   {
/*  980 */     return this.hardwarePlatform;
/*      */   }
/*      */ 
/*      */   public void setHardwarePlatform(String value)
/*      */   {
/*  992 */     this.hardwarePlatform = value;
/*      */   }
/*      */ 
/*      */   public List<String> getComputerMemoryType()
/*      */   {
/* 1018 */     if (this.computerMemoryType == null) {
/* 1019 */       this.computerMemoryType = new ArrayList();
/*      */     }
/* 1021 */     return this.computerMemoryType;
/*      */   }
/*      */ 
/*      */   public BigInteger getItemPackageQuantity()
/*      */   {
/* 1033 */     return this.itemPackageQuantity;
/*      */   }
/*      */ 
/*      */   public void setItemPackageQuantity(BigInteger value)
/*      */   {
/* 1045 */     this.itemPackageQuantity = value;
/*      */   }
/*      */ 
/*      */   public String getPurchasingFeeRefSKU()
/*      */   {
/* 1057 */     return this.purchasingFeeRefSKU;
/*      */   }
/*      */ 
/*      */   public void setPurchasingFeeRefSKU(String value)
/*      */   {
/* 1069 */     this.purchasingFeeRefSKU = value;
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
/* 1129 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 1141 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 1153 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 1165 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.KindleFireAccessories
 * JD-Core Version:    0.6.2
 */