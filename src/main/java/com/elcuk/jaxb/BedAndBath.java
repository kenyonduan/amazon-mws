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
/*      */ @XmlType(name="", propOrder={"battery", "canShipInOriginalContainer", "colorMap", "fabricWarmthDescription", "finish", "identityPackageType", "isStainResistant", "lightSourceType", "material", "maximumCoverageArea", "numberOfSets", "outputCapacity", "pieceCount", "shape", "threadCount", "towelWeight", "variationData", "wattage", "innerMaterialType", "itemThickness", "manufacturerMinimumAge", "manufacturerMaximumAge", "occupancy", "outerMaterialType", "seasons", "materialComposition", "itemTypeName", "itemDiameter", "customerRestrictionType", "occasionType", "powerSourceType", "batteryCellComposition", "batteryDescription", "batteryFormFactor", "lithiumBatteryWeight", "efficiency", "batteryAverageLife", "batteryAverageLifeStandby", "batteryChargeTime", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "sellerWarrantyDescription", "sizeMap"})
/*      */ @XmlRootElement(name="BedAndBath")
/*      */ public class BedAndBath
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
/*      */   @XmlElement(name="FabricWarmthDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String fabricWarmthDescription;
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
/*      */   @XmlElement(name="InnerMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String innerMaterialType;
/*      */ 
/*      */   @XmlElement(name="ItemThickness")
/*      */   protected LengthDimension itemThickness;
/*      */ 
/*      */   @XmlElement(name="ManufacturerMinimumAge")
/*      */   protected BigInteger manufacturerMinimumAge;
/*      */ 
/*      */   @XmlElement(name="ManufacturerMaximumAge")
/*      */   protected BigInteger manufacturerMaximumAge;
/*      */ 
/*      */   @XmlElement(name="Occupancy")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String occupancy;
/*      */ 
/*      */   @XmlElement(name="OuterMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String outerMaterialType;
/*      */ 
/*      */   @XmlElement(name="Seasons")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String seasons;
/*      */ 
/*      */   @XmlElement(name="MaterialComposition")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String materialComposition;
/*      */ 
/*      */   @XmlElement(name="ItemTypeName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String itemTypeName;
/*      */ 
/*      */   @XmlElement(name="ItemDiameter")
/*      */   protected LengthDimension itemDiameter;
/*      */ 
/*      */   @XmlElement(name="CustomerRestrictionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String customerRestrictionType;
/*      */ 
/*      */   @XmlElement(name="OccasionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String occasionType;
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
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
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
/*      */   public Battery getBattery()
/*      */   {
/*  394 */     return this.battery;
/*      */   }
/*      */ 
/*      */   public void setBattery(Battery value)
/*      */   {
/*  406 */     this.battery = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/*  418 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/*  430 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  442 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  454 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getFabricWarmthDescription()
/*      */   {
/*  466 */     return this.fabricWarmthDescription;
/*      */   }
/*      */ 
/*      */   public void setFabricWarmthDescription(String value)
/*      */   {
/*  478 */     this.fabricWarmthDescription = value;
/*      */   }
/*      */ 
/*      */   public String getFinish()
/*      */   {
/*  490 */     return this.finish;
/*      */   }
/*      */ 
/*      */   public void setFinish(String value)
/*      */   {
/*  502 */     this.finish = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/*  514 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/*  526 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public Boolean isIsStainResistant()
/*      */   {
/*  538 */     return this.isStainResistant;
/*      */   }
/*      */ 
/*      */   public void setIsStainResistant(Boolean value)
/*      */   {
/*  550 */     this.isStainResistant = value;
/*      */   }
/*      */ 
/*      */   public String getLightSourceType()
/*      */   {
/*  562 */     return this.lightSourceType;
/*      */   }
/*      */ 
/*      */   public void setLightSourceType(String value)
/*      */   {
/*  574 */     this.lightSourceType = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/*  586 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/*  598 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public AreaDimensionOptionalUnit getMaximumCoverageArea()
/*      */   {
/*  610 */     return this.maximumCoverageArea;
/*      */   }
/*      */ 
/*      */   public void setMaximumCoverageArea(AreaDimensionOptionalUnit value)
/*      */   {
/*  622 */     this.maximumCoverageArea = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSets()
/*      */   {
/*  634 */     return this.numberOfSets;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSets(BigInteger value)
/*      */   {
/*  646 */     this.numberOfSets = value;
/*      */   }
/*      */ 
/*      */   public VolumeRateDimension getOutputCapacity()
/*      */   {
/*  658 */     return this.outputCapacity;
/*      */   }
/*      */ 
/*      */   public void setOutputCapacity(VolumeRateDimension value)
/*      */   {
/*  670 */     this.outputCapacity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getPieceCount()
/*      */   {
/*  682 */     return this.pieceCount;
/*      */   }
/*      */ 
/*      */   public void setPieceCount(BigInteger value)
/*      */   {
/*  694 */     this.pieceCount = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/*  706 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/*  718 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getThreadCount()
/*      */   {
/*  730 */     return this.threadCount;
/*      */   }
/*      */ 
/*      */   public void setThreadCount(BigInteger value)
/*      */   {
/*  742 */     this.threadCount = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getTowelWeight()
/*      */   {
/*  754 */     return this.towelWeight;
/*      */   }
/*      */ 
/*      */   public void setTowelWeight(WeightDimension value)
/*      */   {
/*  766 */     this.towelWeight = value;
/*      */   }
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  778 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  790 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit getWattage()
/*      */   {
/*  802 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageDimensionOptionalUnit value)
/*      */   {
/*  814 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getInnerMaterialType()
/*      */   {
/*  826 */     return this.innerMaterialType;
/*      */   }
/*      */ 
/*      */   public void setInnerMaterialType(String value)
/*      */   {
/*  838 */     this.innerMaterialType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getItemThickness()
/*      */   {
/*  850 */     return this.itemThickness;
/*      */   }
/*      */ 
/*      */   public void setItemThickness(LengthDimension value)
/*      */   {
/*  862 */     this.itemThickness = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getManufacturerMinimumAge()
/*      */   {
/*  874 */     return this.manufacturerMinimumAge;
/*      */   }
/*      */ 
/*      */   public void setManufacturerMinimumAge(BigInteger value)
/*      */   {
/*  886 */     this.manufacturerMinimumAge = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getManufacturerMaximumAge()
/*      */   {
/*  898 */     return this.manufacturerMaximumAge;
/*      */   }
/*      */ 
/*      */   public void setManufacturerMaximumAge(BigInteger value)
/*      */   {
/*  910 */     this.manufacturerMaximumAge = value;
/*      */   }
/*      */ 
/*      */   public String getOccupancy()
/*      */   {
/*  922 */     return this.occupancy;
/*      */   }
/*      */ 
/*      */   public void setOccupancy(String value)
/*      */   {
/*  934 */     this.occupancy = value;
/*      */   }
/*      */ 
/*      */   public String getOuterMaterialType()
/*      */   {
/*  946 */     return this.outerMaterialType;
/*      */   }
/*      */ 
/*      */   public void setOuterMaterialType(String value)
/*      */   {
/*  958 */     this.outerMaterialType = value;
/*      */   }
/*      */ 
/*      */   public String getSeasons()
/*      */   {
/*  970 */     return this.seasons;
/*      */   }
/*      */ 
/*      */   public void setSeasons(String value)
/*      */   {
/*  982 */     this.seasons = value;
/*      */   }
/*      */ 
/*      */   public String getMaterialComposition()
/*      */   {
/*  994 */     return this.materialComposition;
/*      */   }
/*      */ 
/*      */   public void setMaterialComposition(String value)
/*      */   {
/* 1006 */     this.materialComposition = value;
/*      */   }
/*      */ 
/*      */   public String getItemTypeName()
/*      */   {
/* 1018 */     return this.itemTypeName;
/*      */   }
/*      */ 
/*      */   public void setItemTypeName(String value)
/*      */   {
/* 1030 */     this.itemTypeName = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getItemDiameter()
/*      */   {
/* 1042 */     return this.itemDiameter;
/*      */   }
/*      */ 
/*      */   public void setItemDiameter(LengthDimension value)
/*      */   {
/* 1054 */     this.itemDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getCustomerRestrictionType()
/*      */   {
/* 1066 */     return this.customerRestrictionType;
/*      */   }
/*      */ 
/*      */   public void setCustomerRestrictionType(String value)
/*      */   {
/* 1078 */     this.customerRestrictionType = value;
/*      */   }
/*      */ 
/*      */   public String getOccasionType()
/*      */   {
/* 1090 */     return this.occasionType;
/*      */   }
/*      */ 
/*      */   public void setOccasionType(String value)
/*      */   {
/* 1102 */     this.occasionType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSourceType()
/*      */   {
/* 1114 */     return this.powerSourceType;
/*      */   }
/*      */ 
/*      */   public void setPowerSourceType(String value)
/*      */   {
/* 1126 */     this.powerSourceType = value;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellComposition()
/*      */   {
/* 1138 */     return this.batteryCellComposition;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellComposition(BatteryCellTypeValues value)
/*      */   {
/* 1150 */     this.batteryCellComposition = value;
/*      */   }
/*      */ 
/*      */   public String getBatteryDescription()
/*      */   {
/* 1162 */     return this.batteryDescription;
/*      */   }
/*      */ 
/*      */   public void setBatteryDescription(String value)
/*      */   {
/* 1174 */     this.batteryDescription = value;
/*      */   }
/*      */ 
/*      */   public String getBatteryFormFactor()
/*      */   {
/* 1186 */     return this.batteryFormFactor;
/*      */   }
/*      */ 
/*      */   public void setBatteryFormFactor(String value)
/*      */   {
/* 1198 */     this.batteryFormFactor = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryWeight()
/*      */   {
/* 1210 */     return this.lithiumBatteryWeight;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryWeight(BigDecimal value)
/*      */   {
/* 1222 */     this.lithiumBatteryWeight = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1234 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1246 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLife()
/*      */   {
/* 1258 */     return this.batteryAverageLife;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLife(BigDecimal value)
/*      */   {
/* 1270 */     this.batteryAverageLife = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLifeStandby()
/*      */   {
/* 1282 */     return this.batteryAverageLifeStandby;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLifeStandby(BigDecimal value)
/*      */   {
/* 1294 */     this.batteryAverageLifeStandby = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryChargeTime()
/*      */   {
/* 1306 */     return this.batteryChargeTime;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeTime(BigDecimal value)
/*      */   {
/* 1318 */     this.batteryChargeTime = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryEnergyContent()
/*      */   {
/* 1330 */     return this.lithiumBatteryEnergyContent;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*      */   {
/* 1342 */     this.lithiumBatteryEnergyContent = value;
/*      */   }
/*      */ 
/*      */   public String getLithiumBatteryPackaging()
/*      */   {
/* 1354 */     return this.lithiumBatteryPackaging;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryPackaging(String value)
/*      */   {
/* 1366 */     this.lithiumBatteryPackaging = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryVoltage()
/*      */   {
/* 1378 */     return this.lithiumBatteryVoltage;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryVoltage(BigDecimal value)
/*      */   {
/* 1390 */     this.lithiumBatteryVoltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumIonCells()
/*      */   {
/* 1402 */     return this.numberOfLithiumIonCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumIonCells(BigInteger value)
/*      */   {
/* 1414 */     this.numberOfLithiumIonCells = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumMetalCells()
/*      */   {
/* 1426 */     return this.numberOfLithiumMetalCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*      */   {
/* 1438 */     this.numberOfLithiumMetalCells = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/* 1450 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/* 1462 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getSizeMap()
/*      */   {
/* 1474 */     return this.sizeMap;
/*      */   }
/*      */ 
/*      */   public void setSizeMap(String value)
/*      */   {
/* 1486 */     this.sizeMap = value;
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
/* 1658 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 1670 */       this.variationTheme = value;
/*      */     }
/*      */ 
/*      */     public String getSize()
/*      */     {
/* 1682 */       return this.size;
/*      */     }
/*      */ 
/*      */     public void setSize(String value)
/*      */     {
/* 1694 */       this.size = value;
/*      */     }
/*      */ 
/*      */     public String getColor()
/*      */     {
/* 1706 */       return this.color;
/*      */     }
/*      */ 
/*      */     public void setColor(String value)
/*      */     {
/* 1718 */       this.color = value;
/*      */     }
/*      */ 
/*      */     public String getScent()
/*      */     {
/* 1730 */       return this.scent;
/*      */     }
/*      */ 
/*      */     public void setScent(String value)
/*      */     {
/* 1742 */       this.scent = value;
/*      */     }
/*      */ 
/*      */     public String getStyleName()
/*      */     {
/* 1754 */       return this.styleName;
/*      */     }
/*      */ 
/*      */     public void setStyleName(String value)
/*      */     {
/* 1766 */       this.styleName = value;
/*      */     }
/*      */ 
/*      */     public String getCustomerPackageType()
/*      */     {
/* 1778 */       return this.customerPackageType;
/*      */     }
/*      */ 
/*      */     public void setCustomerPackageType(String value)
/*      */     {
/* 1790 */       this.customerPackageType = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BedAndBath
 * JD-Core Version:    0.6.2
 */