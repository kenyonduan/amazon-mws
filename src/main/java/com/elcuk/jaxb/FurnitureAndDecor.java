/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigDecimal;
/*      */ import java.math.BigInteger;
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
/*      */ @XmlType(name="", propOrder={"battery", "canShipInOriginalContainer", "colorMap", "finish", "identityPackageType", "isStainResistant", "lightSourceType", "material", "maximumCoverageArea", "numberOfSets", "outputCapacity", "pieceCount", "shape", "threadCount", "towelWeight", "variationData", "wattage", "adjustmentType", "formFactor", "frameType", "installationType", "itemHardness", "itemStyling", "lineWeight", "numberOfDoors", "occasionType", "paintType", "paperSize", "seatingCapacity", "specificUsesForProduct", "theme", "materialComposition", "itemTypeName", "powerSourceType", "batteryCellComposition", "batteryDescription", "batteryFormFactor", "lithiumBatteryWeight", "batteryAverageLife", "batteryAverageLifeStandby", "batteryChargeTime", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "sellerWarrantyDescription", "sizeMap", "customerRestrictionType", "efficiency"})
/*      */ @XmlRootElement(name="FurnitureAndDecor")
/*      */ public class FurnitureAndDecor
/*      */ {
/*      */ 
/*      */   @XmlElement(name="Battery")
/*      */   protected Battery battery;
/*      */ 
/*      */   @XmlElement(name="CanShipInOriginalContainer")
/*      */   protected Boolean canShipInOriginalContainer;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="Finish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finish;
/*      */ 
/*      */   @XmlElement(name="IdentityPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String identityPackageType;
/*      */ 
/*      */   @XmlElement(name="IsStainResistant")
/*      */   protected Boolean isStainResistant;
/*      */ 
/*      */   @XmlElement(name="LightSourceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lightSourceType;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
/*      */ 
/*      */   @XmlElement(name="MaximumCoverageArea")
/*      */   protected AreaDimensionOptionalUnit maximumCoverageArea;
/*      */ 
/*      */   @XmlElement(name="NumberOfSets")
/*      */   protected BigInteger numberOfSets;
/*      */ 
/*      */   @XmlElement(name="OutputCapacity")
/*      */   protected VolumeRateDimension outputCapacity;
/*      */ 
/*      */   @XmlElement(name="PieceCount")
/*      */   protected BigInteger pieceCount;
/*      */ 
/*      */   @XmlElement(name="Shape")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shape;
/*      */ 
/*      */   @XmlElement(name="ThreadCount")
/*      */   protected BigInteger threadCount;
/*      */ 
/*      */   @XmlElement(name="TowelWeight")
/*      */   protected WeightDimension towelWeight;
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected WattageDimensionOptionalUnit wattage;
/*      */ 
/*      */   @XmlElement(name="AdjustmentType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String adjustmentType;
/*      */ 
/*      */   @XmlElement(name="FormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String formFactor;
/*      */ 
/*      */   @XmlElement(name="FrameType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String frameType;
/*      */ 
/*      */   @XmlElement(name="InstallationType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String installationType;
/*      */ 
/*      */   @XmlElement(name="ItemHardness")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String itemHardness;
/*      */ 
/*      */   @XmlElement(name="ItemStyling")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String itemStyling;
/*      */ 
/*      */   @XmlElement(name="LineWeight")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lineWeight;
/*      */ 
/*      */   @XmlElement(name="NumberOfDoors")
/*      */   protected BigInteger numberOfDoors;
/*      */ 
/*      */   @XmlElement(name="OccasionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String occasionType;
/*      */ 
/*      */   @XmlElement(name="PaintType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String paintType;
/*      */ 
/*      */   @XmlElement(name="PaperSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String paperSize;
/*      */ 
/*      */   @XmlElement(name="SeatingCapacity")
/*      */   protected BigInteger seatingCapacity;
/*      */ 
/*      */   @XmlElement(name="SpecificUsesForProduct")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String specificUsesForProduct;
/*      */ 
/*      */   @XmlElement(name="Theme")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String theme;
/*      */ 
/*      */   @XmlElement(name="MaterialComposition")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String materialComposition;
/*      */ 
/*      */   @XmlElement(name="ItemTypeName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String itemTypeName;
/*      */ 
/*      */   @XmlElement(name="PowerSourceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSourceType;
/*      */ 
/*      */   @XmlElement(name="BatteryCellComposition")
/*      */   protected BatteryCellTypeValues batteryCellComposition;
/*      */ 
/*      */   @XmlElement(name="BatteryDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String batteryDescription;
/*      */ 
/*      */   @XmlElement(name="BatteryFormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String batteryFormFactor;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryWeight")
/*      */   protected BigDecimal lithiumBatteryWeight;
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
/*      */   @XmlElement(name="LithiumBatteryEnergyContent")
/*      */   protected BigDecimal lithiumBatteryEnergyContent;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryPackaging")
/*      */   protected String lithiumBatteryPackaging;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryVoltage")
/*      */   protected BigDecimal lithiumBatteryVoltage;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumIonCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumIonCells;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumMetalCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumMetalCells;
/*      */ 
/*      */   @XmlElement(name="SellerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sellerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="SizeMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sizeMap;
/*      */ 
/*      */   @XmlElement(name="CustomerRestrictionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String customerRestrictionType;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public Battery getBattery()
/*      */   {
/*  416 */     return this.battery;
/*      */   }
/*      */ 
/*      */   public void setBattery(Battery value)
/*      */   {
/*  428 */     this.battery = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/*  440 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/*  452 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  464 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  476 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getFinish()
/*      */   {
/*  488 */     return this.finish;
/*      */   }
/*      */ 
/*      */   public void setFinish(String value)
/*      */   {
/*  500 */     this.finish = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/*  512 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/*  524 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public Boolean isIsStainResistant()
/*      */   {
/*  536 */     return this.isStainResistant;
/*      */   }
/*      */ 
/*      */   public void setIsStainResistant(Boolean value)
/*      */   {
/*  548 */     this.isStainResistant = value;
/*      */   }
/*      */ 
/*      */   public String getLightSourceType()
/*      */   {
/*  560 */     return this.lightSourceType;
/*      */   }
/*      */ 
/*      */   public void setLightSourceType(String value)
/*      */   {
/*  572 */     this.lightSourceType = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/*  584 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/*  596 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public AreaDimensionOptionalUnit getMaximumCoverageArea()
/*      */   {
/*  608 */     return this.maximumCoverageArea;
/*      */   }
/*      */ 
/*      */   public void setMaximumCoverageArea(AreaDimensionOptionalUnit value)
/*      */   {
/*  620 */     this.maximumCoverageArea = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSets()
/*      */   {
/*  632 */     return this.numberOfSets;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSets(BigInteger value)
/*      */   {
/*  644 */     this.numberOfSets = value;
/*      */   }
/*      */ 
/*      */   public VolumeRateDimension getOutputCapacity()
/*      */   {
/*  656 */     return this.outputCapacity;
/*      */   }
/*      */ 
/*      */   public void setOutputCapacity(VolumeRateDimension value)
/*      */   {
/*  668 */     this.outputCapacity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getPieceCount()
/*      */   {
/*  680 */     return this.pieceCount;
/*      */   }
/*      */ 
/*      */   public void setPieceCount(BigInteger value)
/*      */   {
/*  692 */     this.pieceCount = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/*  704 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/*  716 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getThreadCount()
/*      */   {
/*  728 */     return this.threadCount;
/*      */   }
/*      */ 
/*      */   public void setThreadCount(BigInteger value)
/*      */   {
/*  740 */     this.threadCount = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getTowelWeight()
/*      */   {
/*  752 */     return this.towelWeight;
/*      */   }
/*      */ 
/*      */   public void setTowelWeight(WeightDimension value)
/*      */   {
/*  764 */     this.towelWeight = value;
/*      */   }
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  776 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  788 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit getWattage()
/*      */   {
/*  800 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageDimensionOptionalUnit value)
/*      */   {
/*  812 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getAdjustmentType()
/*      */   {
/*  824 */     return this.adjustmentType;
/*      */   }
/*      */ 
/*      */   public void setAdjustmentType(String value)
/*      */   {
/*  836 */     this.adjustmentType = value;
/*      */   }
/*      */ 
/*      */   public String getFormFactor()
/*      */   {
/*  848 */     return this.formFactor;
/*      */   }
/*      */ 
/*      */   public void setFormFactor(String value)
/*      */   {
/*  860 */     this.formFactor = value;
/*      */   }
/*      */ 
/*      */   public String getFrameType()
/*      */   {
/*  872 */     return this.frameType;
/*      */   }
/*      */ 
/*      */   public void setFrameType(String value)
/*      */   {
/*  884 */     this.frameType = value;
/*      */   }
/*      */ 
/*      */   public String getInstallationType()
/*      */   {
/*  896 */     return this.installationType;
/*      */   }
/*      */ 
/*      */   public void setInstallationType(String value)
/*      */   {
/*  908 */     this.installationType = value;
/*      */   }
/*      */ 
/*      */   public String getItemHardness()
/*      */   {
/*  920 */     return this.itemHardness;
/*      */   }
/*      */ 
/*      */   public void setItemHardness(String value)
/*      */   {
/*  932 */     this.itemHardness = value;
/*      */   }
/*      */ 
/*      */   public String getItemStyling()
/*      */   {
/*  944 */     return this.itemStyling;
/*      */   }
/*      */ 
/*      */   public void setItemStyling(String value)
/*      */   {
/*  956 */     this.itemStyling = value;
/*      */   }
/*      */ 
/*      */   public String getLineWeight()
/*      */   {
/*  968 */     return this.lineWeight;
/*      */   }
/*      */ 
/*      */   public void setLineWeight(String value)
/*      */   {
/*  980 */     this.lineWeight = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfDoors()
/*      */   {
/*  992 */     return this.numberOfDoors;
/*      */   }
/*      */ 
/*      */   public void setNumberOfDoors(BigInteger value)
/*      */   {
/* 1004 */     this.numberOfDoors = value;
/*      */   }
/*      */ 
/*      */   public String getOccasionType()
/*      */   {
/* 1016 */     return this.occasionType;
/*      */   }
/*      */ 
/*      */   public void setOccasionType(String value)
/*      */   {
/* 1028 */     this.occasionType = value;
/*      */   }
/*      */ 
/*      */   public String getPaintType()
/*      */   {
/* 1040 */     return this.paintType;
/*      */   }
/*      */ 
/*      */   public void setPaintType(String value)
/*      */   {
/* 1052 */     this.paintType = value;
/*      */   }
/*      */ 
/*      */   public String getPaperSize()
/*      */   {
/* 1064 */     return this.paperSize;
/*      */   }
/*      */ 
/*      */   public void setPaperSize(String value)
/*      */   {
/* 1076 */     this.paperSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getSeatingCapacity()
/*      */   {
/* 1088 */     return this.seatingCapacity;
/*      */   }
/*      */ 
/*      */   public void setSeatingCapacity(BigInteger value)
/*      */   {
/* 1100 */     this.seatingCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getSpecificUsesForProduct()
/*      */   {
/* 1112 */     return this.specificUsesForProduct;
/*      */   }
/*      */ 
/*      */   public void setSpecificUsesForProduct(String value)
/*      */   {
/* 1124 */     this.specificUsesForProduct = value;
/*      */   }
/*      */ 
/*      */   public String getTheme()
/*      */   {
/* 1136 */     return this.theme;
/*      */   }
/*      */ 
/*      */   public void setTheme(String value)
/*      */   {
/* 1148 */     this.theme = value;
/*      */   }
/*      */ 
/*      */   public String getMaterialComposition()
/*      */   {
/* 1160 */     return this.materialComposition;
/*      */   }
/*      */ 
/*      */   public void setMaterialComposition(String value)
/*      */   {
/* 1172 */     this.materialComposition = value;
/*      */   }
/*      */ 
/*      */   public String getItemTypeName()
/*      */   {
/* 1184 */     return this.itemTypeName;
/*      */   }
/*      */ 
/*      */   public void setItemTypeName(String value)
/*      */   {
/* 1196 */     this.itemTypeName = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSourceType()
/*      */   {
/* 1208 */     return this.powerSourceType;
/*      */   }
/*      */ 
/*      */   public void setPowerSourceType(String value)
/*      */   {
/* 1220 */     this.powerSourceType = value;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellComposition()
/*      */   {
/* 1232 */     return this.batteryCellComposition;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellComposition(BatteryCellTypeValues value)
/*      */   {
/* 1244 */     this.batteryCellComposition = value;
/*      */   }
/*      */ 
/*      */   public String getBatteryDescription()
/*      */   {
/* 1256 */     return this.batteryDescription;
/*      */   }
/*      */ 
/*      */   public void setBatteryDescription(String value)
/*      */   {
/* 1268 */     this.batteryDescription = value;
/*      */   }
/*      */ 
/*      */   public String getBatteryFormFactor()
/*      */   {
/* 1280 */     return this.batteryFormFactor;
/*      */   }
/*      */ 
/*      */   public void setBatteryFormFactor(String value)
/*      */   {
/* 1292 */     this.batteryFormFactor = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryWeight()
/*      */   {
/* 1304 */     return this.lithiumBatteryWeight;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryWeight(BigDecimal value)
/*      */   {
/* 1316 */     this.lithiumBatteryWeight = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLife()
/*      */   {
/* 1328 */     return this.batteryAverageLife;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLife(BigDecimal value)
/*      */   {
/* 1340 */     this.batteryAverageLife = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLifeStandby()
/*      */   {
/* 1352 */     return this.batteryAverageLifeStandby;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLifeStandby(BigDecimal value)
/*      */   {
/* 1364 */     this.batteryAverageLifeStandby = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryChargeTime()
/*      */   {
/* 1376 */     return this.batteryChargeTime;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeTime(BigDecimal value)
/*      */   {
/* 1388 */     this.batteryChargeTime = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryEnergyContent()
/*      */   {
/* 1400 */     return this.lithiumBatteryEnergyContent;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*      */   {
/* 1412 */     this.lithiumBatteryEnergyContent = value;
/*      */   }
/*      */ 
/*      */   public String getLithiumBatteryPackaging()
/*      */   {
/* 1424 */     return this.lithiumBatteryPackaging;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryPackaging(String value)
/*      */   {
/* 1436 */     this.lithiumBatteryPackaging = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryVoltage()
/*      */   {
/* 1448 */     return this.lithiumBatteryVoltage;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryVoltage(BigDecimal value)
/*      */   {
/* 1460 */     this.lithiumBatteryVoltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumIonCells()
/*      */   {
/* 1472 */     return this.numberOfLithiumIonCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumIonCells(BigInteger value)
/*      */   {
/* 1484 */     this.numberOfLithiumIonCells = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumMetalCells()
/*      */   {
/* 1496 */     return this.numberOfLithiumMetalCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*      */   {
/* 1508 */     this.numberOfLithiumMetalCells = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/* 1520 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/* 1532 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getSizeMap()
/*      */   {
/* 1544 */     return this.sizeMap;
/*      */   }
/*      */ 
/*      */   public void setSizeMap(String value)
/*      */   {
/* 1556 */     this.sizeMap = value;
/*      */   }
/*      */ 
/*      */   public String getCustomerRestrictionType()
/*      */   {
/* 1568 */     return this.customerRestrictionType;
/*      */   }
/*      */ 
/*      */   public void setCustomerRestrictionType(String value)
/*      */   {
/* 1580 */     this.customerRestrictionType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1592 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1604 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"variationTheme", "size", "color", "scent", "styleName", "customerPackageType"})
/*      */   public static class VariationData
/*      */   {
/*      */ 
/*      */     @XmlElement(name="VariationTheme")
/*      */     protected String variationTheme;
/*      */ 
/*      */     @XmlElement(name="Size")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String size;
/*      */ 
/*      */     @XmlElement(name="Color")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String color;
/*      */ 
/*      */     @XmlElement(name="Scent")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String scent;
/*      */ 
/*      */     @XmlElement(name="StyleName")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String styleName;
/*      */ 
/*      */     @XmlElement(name="CustomerPackageType")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String customerPackageType;
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 1776 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 1788 */       this.variationTheme = value;
/*      */     }
/*      */ 
/*      */     public String getSize()
/*      */     {
/* 1800 */       return this.size;
/*      */     }
/*      */ 
/*      */     public void setSize(String value)
/*      */     {
/* 1812 */       this.size = value;
/*      */     }
/*      */ 
/*      */     public String getColor()
/*      */     {
/* 1824 */       return this.color;
/*      */     }
/*      */ 
/*      */     public void setColor(String value)
/*      */     {
/* 1836 */       this.color = value;
/*      */     }
/*      */ 
/*      */     public String getScent()
/*      */     {
/* 1848 */       return this.scent;
/*      */     }
/*      */ 
/*      */     public void setScent(String value)
/*      */     {
/* 1860 */       this.scent = value;
/*      */     }
/*      */ 
/*      */     public String getStyleName()
/*      */     {
/* 1872 */       return this.styleName;
/*      */     }
/*      */ 
/*      */     public void setStyleName(String value)
/*      */     {
/* 1884 */       this.styleName = value;
/*      */     }
/*      */ 
/*      */     public String getCustomerPackageType()
/*      */     {
/* 1896 */       return this.customerPackageType;
/*      */     }
/*      */ 
/*      */     public void setCustomerPackageType(String value)
/*      */     {
/* 1908 */       this.customerPackageType = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.FurnitureAndDecor
 * JD-Core Version:    0.6.2
 */