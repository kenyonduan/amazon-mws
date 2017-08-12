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
/*      */ import javax.xml.bind.annotation.XmlSchemaType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"amzMinimum", "airFlowCapacity", "amperageCapacity", "areBatteriesIncluded", "batteriesRequired", "batteryCellType", "batteryDescription", "batteryLife", "batteryTypeLithiumIon", "batteryTypeLithiumMetal", "canShipInOriginalContainer", "capacityDescription", "certification", "cordLength", "extensionLength", "finish", "flowRate", "gritType", "handleLeverPlacement", "horsepower", "hoseLength", "itemPitch", "identityPackageType", "includedComponent", "installationMethod", "isAdultProduct", "itemDiameter", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "maximumPressure", "maximumWeightCapacity", "numberOfHandles", "numberOfPieces", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "pattern", "ppuCount", "ppuCountType", "shape", "sizeMap", "soundLevel", "specialFeatures", "style", "temperatureRange", "thickness", "usage", "warrantyType", "waterConsumption"})
/*      */ @XmlRootElement(name="HICommon")
/*      */ public class HICommon
/*      */ {
/*      */ 
/*      */   @XmlElement(name="AmzMinimum")
/*      */   protected OptionalMinimumAgeRecommendedDimension amzMinimum;
/*      */ 
/*      */   @XmlElement(name="AirFlowCapacity")
/*      */   protected AirFlowDisplacementDimension airFlowCapacity;
/*      */ 
/*      */   @XmlElement(name="AmperageCapacity")
/*      */   protected AmperageDimension amperageCapacity;
/*      */ 
/*      */   @XmlElement(name="AreBatteriesIncluded")
/*      */   protected Boolean areBatteriesIncluded;
/*      */ 
/*      */   @XmlElement(name="BatteriesRequired")
/*      */   protected Boolean batteriesRequired;
/*      */ 
/*      */   @XmlElement(name="BatteryCellType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String batteryCellType;
/*      */ 
/*      */   @XmlElement(name="BatteryDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String batteryDescription;
/*      */ 
/*      */   @XmlElement(name="BatteryLife")
/*      */   protected BatteryLifeType batteryLife;
/*      */ 
/*      */   @XmlElement(name="BatteryTypeLithiumIon")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryTypeLithiumIon;
/*      */ 
/*      */   @XmlElement(name="BatteryTypeLithiumMetal")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryTypeLithiumMetal;
/*      */ 
/*      */   @XmlElement(name="CanShipInOriginalContainer")
/*      */   protected Boolean canShipInOriginalContainer;
/*      */ 
/*      */   @XmlElement(name="CapacityDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String capacityDescription;
/*      */ 
/*      */   @XmlElement(name="Certification")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> certification;
/*      */ 
/*      */   @XmlElement(name="CordLength")
/*      */   protected LengthDimension cordLength;
/*      */ 
/*      */   @XmlElement(name="ExtensionLength")
/*      */   protected LengthDimension extensionLength;
/*      */ 
/*      */   @XmlElement(name="Finish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finish;
/*      */ 
/*      */   @XmlElement(name="FlowRate")
/*      */   protected FlowRateType flowRate;
/*      */ 
/*      */   @XmlElement(name="GritType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String gritType;
/*      */ 
/*      */   @XmlElement(name="HandleLeverPlacement")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String handleLeverPlacement;
/*      */ 
/*      */   @XmlElement(name="Horsepower")
/*      */   protected PowerDimension horsepower;
/*      */ 
/*      */   @XmlElement(name="HoseLength")
/*      */   protected LengthDimension hoseLength;
/*      */ 
/*      */   @XmlElement(name="ItemPitch")
/*      */   protected LengthDimension itemPitch;
/*      */ 
/*      */   @XmlElement(name="IdentityPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String identityPackageType;
/*      */ 
/*      */   @XmlElement(name="IncludedComponent")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> includedComponent;
/*      */ 
/*      */   @XmlElement(name="InstallationMethod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String installationMethod;
/*      */ 
/*      */   @XmlElement(name="IsAdultProduct")
/*      */   protected Boolean isAdultProduct;
/*      */ 
/*      */   @XmlElement(name="ItemDiameter")
/*      */   protected LengthDimension itemDiameter;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryEnergyContent")
/*      */   protected BigDecimal lithiumBatteryEnergyContent;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryPackaging")
/*      */   protected String lithiumBatteryPackaging;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryVoltage")
/*      */   protected BigDecimal lithiumBatteryVoltage;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryWeight")
/*      */   protected BigDecimal lithiumBatteryWeight;
/*      */ 
/*      */   @XmlElement(name="MaximumPressure")
/*      */   protected PressureDimension maximumPressure;
/*      */ 
/*      */   @XmlElement(name="MaximumWeightCapacity")
/*      */   protected WeightDimension maximumWeightCapacity;
/*      */ 
/*      */   @XmlElement(name="NumberOfHandles")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfHandles;
/*      */ 
/*      */   @XmlElement(name="NumberOfPieces")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfPieces;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumIonCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumIonCells;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumMetalCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumMetalCells;
/*      */ 
/*      */   @XmlElement(name="Pattern")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String pattern;
/*      */ 
/*      */   @XmlElement(name="PPUCount")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger ppuCount;
/*      */ 
/*      */   @XmlElement(name="PPUCountType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String ppuCountType;
/*      */ 
/*      */   @XmlElement(name="Shape")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shape;
/*      */ 
/*      */   @XmlElement(name="SizeMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sizeMap;
/*      */ 
/*      */   @XmlElement(name="SoundLevel")
/*      */   protected SoundLevelType soundLevel;
/*      */ 
/*      */   @XmlElement(name="SpecialFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> specialFeatures;
/*      */ 
/*      */   @XmlElement(name="Style")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String style;
/*      */ 
/*      */   @XmlElement(name="TemperatureRange")
/*      */   protected TemperatureRangeType temperatureRange;
/*      */ 
/*      */   @XmlElement(name="Thickness")
/*      */   protected ThicknessType thickness;
/*      */ 
/*      */   @XmlElement(name="Usage")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String usage;
/*      */ 
/*      */   @XmlElement(name="WarrantyType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String warrantyType;
/*      */ 
/*      */   @XmlElement(name="WaterConsumption")
/*      */   protected WaterConsumptionType waterConsumption;
/*      */ 
/*      */   public OptionalMinimumAgeRecommendedDimension getAmzMinimum()
/*      */   {
/*  293 */     return this.amzMinimum;
/*      */   }
/*      */ 
/*      */   public void setAmzMinimum(OptionalMinimumAgeRecommendedDimension value)
/*      */   {
/*  305 */     this.amzMinimum = value;
/*      */   }
/*      */ 
/*      */   public AirFlowDisplacementDimension getAirFlowCapacity()
/*      */   {
/*  317 */     return this.airFlowCapacity;
/*      */   }
/*      */ 
/*      */   public void setAirFlowCapacity(AirFlowDisplacementDimension value)
/*      */   {
/*  329 */     this.airFlowCapacity = value;
/*      */   }
/*      */ 
/*      */   public AmperageDimension getAmperageCapacity()
/*      */   {
/*  341 */     return this.amperageCapacity;
/*      */   }
/*      */ 
/*      */   public void setAmperageCapacity(AmperageDimension value)
/*      */   {
/*  353 */     this.amperageCapacity = value;
/*      */   }
/*      */ 
/*      */   public Boolean isAreBatteriesIncluded()
/*      */   {
/*  365 */     return this.areBatteriesIncluded;
/*      */   }
/*      */ 
/*      */   public void setAreBatteriesIncluded(Boolean value)
/*      */   {
/*  377 */     this.areBatteriesIncluded = value;
/*      */   }
/*      */ 
/*      */   public Boolean isBatteriesRequired()
/*      */   {
/*  389 */     return this.batteriesRequired;
/*      */   }
/*      */ 
/*      */   public void setBatteriesRequired(Boolean value)
/*      */   {
/*  401 */     this.batteriesRequired = value;
/*      */   }
/*      */ 
/*      */   public String getBatteryCellType()
/*      */   {
/*  413 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(String value)
/*      */   {
/*  425 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public String getBatteryDescription()
/*      */   {
/*  437 */     return this.batteryDescription;
/*      */   }
/*      */ 
/*      */   public void setBatteryDescription(String value)
/*      */   {
/*  449 */     this.batteryDescription = value;
/*      */   }
/*      */ 
/*      */   public BatteryLifeType getBatteryLife()
/*      */   {
/*  461 */     return this.batteryLife;
/*      */   }
/*      */ 
/*      */   public void setBatteryLife(BatteryLifeType value)
/*      */   {
/*  473 */     this.batteryLife = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryTypeLithiumIon()
/*      */   {
/*  485 */     return this.batteryTypeLithiumIon;
/*      */   }
/*      */ 
/*      */   public void setBatteryTypeLithiumIon(BigInteger value)
/*      */   {
/*  497 */     this.batteryTypeLithiumIon = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryTypeLithiumMetal()
/*      */   {
/*  509 */     return this.batteryTypeLithiumMetal;
/*      */   }
/*      */ 
/*      */   public void setBatteryTypeLithiumMetal(BigInteger value)
/*      */   {
/*  521 */     this.batteryTypeLithiumMetal = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/*  533 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/*  545 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getCapacityDescription()
/*      */   {
/*  557 */     return this.capacityDescription;
/*      */   }
/*      */ 
/*      */   public void setCapacityDescription(String value)
/*      */   {
/*  569 */     this.capacityDescription = value;
/*      */   }
/*      */ 
/*      */   public List<String> getCertification()
/*      */   {
/*  595 */     if (this.certification == null) {
/*  596 */       this.certification = new ArrayList();
/*      */     }
/*  598 */     return this.certification;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCordLength()
/*      */   {
/*  610 */     return this.cordLength;
/*      */   }
/*      */ 
/*      */   public void setCordLength(LengthDimension value)
/*      */   {
/*  622 */     this.cordLength = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getExtensionLength()
/*      */   {
/*  634 */     return this.extensionLength;
/*      */   }
/*      */ 
/*      */   public void setExtensionLength(LengthDimension value)
/*      */   {
/*  646 */     this.extensionLength = value;
/*      */   }
/*      */ 
/*      */   public String getFinish()
/*      */   {
/*  658 */     return this.finish;
/*      */   }
/*      */ 
/*      */   public void setFinish(String value)
/*      */   {
/*  670 */     this.finish = value;
/*      */   }
/*      */ 
/*      */   public FlowRateType getFlowRate()
/*      */   {
/*  682 */     return this.flowRate;
/*      */   }
/*      */ 
/*      */   public void setFlowRate(FlowRateType value)
/*      */   {
/*  694 */     this.flowRate = value;
/*      */   }
/*      */ 
/*      */   public String getGritType()
/*      */   {
/*  706 */     return this.gritType;
/*      */   }
/*      */ 
/*      */   public void setGritType(String value)
/*      */   {
/*  718 */     this.gritType = value;
/*      */   }
/*      */ 
/*      */   public String getHandleLeverPlacement()
/*      */   {
/*  730 */     return this.handleLeverPlacement;
/*      */   }
/*      */ 
/*      */   public void setHandleLeverPlacement(String value)
/*      */   {
/*  742 */     this.handleLeverPlacement = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getHorsepower()
/*      */   {
/*  754 */     return this.horsepower;
/*      */   }
/*      */ 
/*      */   public void setHorsepower(PowerDimension value)
/*      */   {
/*  766 */     this.horsepower = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getHoseLength()
/*      */   {
/*  778 */     return this.hoseLength;
/*      */   }
/*      */ 
/*      */   public void setHoseLength(LengthDimension value)
/*      */   {
/*  790 */     this.hoseLength = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getItemPitch()
/*      */   {
/*  802 */     return this.itemPitch;
/*      */   }
/*      */ 
/*      */   public void setItemPitch(LengthDimension value)
/*      */   {
/*  814 */     this.itemPitch = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/*  826 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/*  838 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public List<String> getIncludedComponent()
/*      */   {
/*  864 */     if (this.includedComponent == null) {
/*  865 */       this.includedComponent = new ArrayList();
/*      */     }
/*  867 */     return this.includedComponent;
/*      */   }
/*      */ 
/*      */   public String getInstallationMethod()
/*      */   {
/*  879 */     return this.installationMethod;
/*      */   }
/*      */ 
/*      */   public void setInstallationMethod(String value)
/*      */   {
/*  891 */     this.installationMethod = value;
/*      */   }
/*      */ 
/*      */   public Boolean isIsAdultProduct()
/*      */   {
/*  903 */     return this.isAdultProduct;
/*      */   }
/*      */ 
/*      */   public void setIsAdultProduct(Boolean value)
/*      */   {
/*  915 */     this.isAdultProduct = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getItemDiameter()
/*      */   {
/*  927 */     return this.itemDiameter;
/*      */   }
/*      */ 
/*      */   public void setItemDiameter(LengthDimension value)
/*      */   {
/*  939 */     this.itemDiameter = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryEnergyContent()
/*      */   {
/*  951 */     return this.lithiumBatteryEnergyContent;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*      */   {
/*  963 */     this.lithiumBatteryEnergyContent = value;
/*      */   }
/*      */ 
/*      */   public String getLithiumBatteryPackaging()
/*      */   {
/*  975 */     return this.lithiumBatteryPackaging;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryPackaging(String value)
/*      */   {
/*  987 */     this.lithiumBatteryPackaging = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryVoltage()
/*      */   {
/*  999 */     return this.lithiumBatteryVoltage;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryVoltage(BigDecimal value)
/*      */   {
/* 1011 */     this.lithiumBatteryVoltage = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryWeight()
/*      */   {
/* 1023 */     return this.lithiumBatteryWeight;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryWeight(BigDecimal value)
/*      */   {
/* 1035 */     this.lithiumBatteryWeight = value;
/*      */   }
/*      */ 
/*      */   public PressureDimension getMaximumPressure()
/*      */   {
/* 1047 */     return this.maximumPressure;
/*      */   }
/*      */ 
/*      */   public void setMaximumPressure(PressureDimension value)
/*      */   {
/* 1059 */     this.maximumPressure = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMaximumWeightCapacity()
/*      */   {
/* 1071 */     return this.maximumWeightCapacity;
/*      */   }
/*      */ 
/*      */   public void setMaximumWeightCapacity(WeightDimension value)
/*      */   {
/* 1083 */     this.maximumWeightCapacity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHandles()
/*      */   {
/* 1095 */     return this.numberOfHandles;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHandles(BigInteger value)
/*      */   {
/* 1107 */     this.numberOfHandles = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfPieces()
/*      */   {
/* 1119 */     return this.numberOfPieces;
/*      */   }
/*      */ 
/*      */   public void setNumberOfPieces(BigInteger value)
/*      */   {
/* 1131 */     this.numberOfPieces = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumIonCells()
/*      */   {
/* 1143 */     return this.numberOfLithiumIonCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumIonCells(BigInteger value)
/*      */   {
/* 1155 */     this.numberOfLithiumIonCells = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumMetalCells()
/*      */   {
/* 1167 */     return this.numberOfLithiumMetalCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*      */   {
/* 1179 */     this.numberOfLithiumMetalCells = value;
/*      */   }
/*      */ 
/*      */   public String getPattern()
/*      */   {
/* 1191 */     return this.pattern;
/*      */   }
/*      */ 
/*      */   public void setPattern(String value)
/*      */   {
/* 1203 */     this.pattern = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getPPUCount()
/*      */   {
/* 1215 */     return this.ppuCount;
/*      */   }
/*      */ 
/*      */   public void setPPUCount(BigInteger value)
/*      */   {
/* 1227 */     this.ppuCount = value;
/*      */   }
/*      */ 
/*      */   public String getPPUCountType()
/*      */   {
/* 1239 */     return this.ppuCountType;
/*      */   }
/*      */ 
/*      */   public void setPPUCountType(String value)
/*      */   {
/* 1251 */     this.ppuCountType = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/* 1263 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/* 1275 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getSizeMap()
/*      */   {
/* 1287 */     return this.sizeMap;
/*      */   }
/*      */ 
/*      */   public void setSizeMap(String value)
/*      */   {
/* 1299 */     this.sizeMap = value;
/*      */   }
/*      */ 
/*      */   public SoundLevelType getSoundLevel()
/*      */   {
/* 1311 */     return this.soundLevel;
/*      */   }
/*      */ 
/*      */   public void setSoundLevel(SoundLevelType value)
/*      */   {
/* 1323 */     this.soundLevel = value;
/*      */   }
/*      */ 
/*      */   public List<String> getSpecialFeatures()
/*      */   {
/* 1349 */     if (this.specialFeatures == null) {
/* 1350 */       this.specialFeatures = new ArrayList();
/*      */     }
/* 1352 */     return this.specialFeatures;
/*      */   }
/*      */ 
/*      */   public String getStyle()
/*      */   {
/* 1364 */     return this.style;
/*      */   }
/*      */ 
/*      */   public void setStyle(String value)
/*      */   {
/* 1376 */     this.style = value;
/*      */   }
/*      */ 
/*      */   public TemperatureRangeType getTemperatureRange()
/*      */   {
/* 1388 */     return this.temperatureRange;
/*      */   }
/*      */ 
/*      */   public void setTemperatureRange(TemperatureRangeType value)
/*      */   {
/* 1400 */     this.temperatureRange = value;
/*      */   }
/*      */ 
/*      */   public ThicknessType getThickness()
/*      */   {
/* 1412 */     return this.thickness;
/*      */   }
/*      */ 
/*      */   public void setThickness(ThicknessType value)
/*      */   {
/* 1424 */     this.thickness = value;
/*      */   }
/*      */ 
/*      */   public String getUsage()
/*      */   {
/* 1436 */     return this.usage;
/*      */   }
/*      */ 
/*      */   public void setUsage(String value)
/*      */   {
/* 1448 */     this.usage = value;
/*      */   }
/*      */ 
/*      */   public String getWarrantyType()
/*      */   {
/* 1460 */     return this.warrantyType;
/*      */   }
/*      */ 
/*      */   public void setWarrantyType(String value)
/*      */   {
/* 1472 */     this.warrantyType = value;
/*      */   }
/*      */ 
/*      */   public WaterConsumptionType getWaterConsumption()
/*      */   {
/* 1484 */     return this.waterConsumption;
/*      */   }
/*      */ 
/*      */   public void setWaterConsumption(WaterConsumptionType value)
/*      */   {
/* 1496 */     this.waterConsumption = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HICommon
 * JD-Core Version:    0.6.2
 */