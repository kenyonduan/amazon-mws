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
/*      */ @XmlType(name="", propOrder={"productType", "parentage", "variationData", "batteryDescription", "colorMap", "canShipInOriginalContainer", "countryAsLabeled", "countryOfOrigin", "countryProducedIn", "importDesignation", "furDescription", "identityPackageType", "includedComponents", "fabricType", "patternName", "seatHeight", "specialFeatures", "styleName", "occasion", "matteStyle", "displayLength", "displayWidth", "displayHeight", "displayDepth", "displayDiameter", "displayVolume", "displayWeight", "itemPackageQuantity", "manufacturerWarrantyDescription", "volume", "volumeCapacity", "material", "threadCount", "numberOfPieces", "safetyWarning", "awardsWon", "batteryAverageLife", "batteryAverageLifeStandby", "batteryChargeTime", "batteryTypeLithiumIon", "batteryTypeLithiumMetal", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "mfgWarrantyDescriptionLabor", "mfgWarrantyDescriptionParts", "mfgWarrantyDescriptionType", "numberOfItemsInPackage", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "powerSourceType", "regionOfOrigin", "sellerWarrantyDescription", "sizeMap", "warnings", "wattage", "length", "width", "height", "depth", "diameter", "weight", "spread", "sunlightExposure", "moistureNeeds", "usdaHardinessZone", "sunsetClimateZone", "numberOfSets"})
/*      */ @XmlRootElement(name="Home")
/*      */ public class Home
/*      */ {
/*      */ 
/*      */   @XmlElement(name="ProductType")
/*      */   protected ProductType productType;
/*      */ 
/*      */   @XmlElement(name="Parentage")
/*      */   protected String parentage;
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="BatteryDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String batteryDescription;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="CanShipInOriginalContainer")
/*      */   protected Boolean canShipInOriginalContainer;
/*      */ 
/*      */   @XmlElement(name="CountryAsLabeled")
/*      */   protected String countryAsLabeled;
/*      */ 
/*      */   @XmlElement(name="CountryOfOrigin")
/*      */   protected String countryOfOrigin;
/*      */ 
/*      */   @XmlElement(name="CountryProducedIn")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String countryProducedIn;
/*      */ 
/*      */   @XmlElement(name="ImportDesignation")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String importDesignation;
/*      */ 
/*      */   @XmlElement(name="FurDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String furDescription;
/*      */ 
/*      */   @XmlElement(name="IdentityPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String identityPackageType;
/*      */ 
/*      */   @XmlElement(name="IncludedComponents")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> includedComponents;
/*      */ 
/*      */   @XmlElement(name="FabricType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> fabricType;
/*      */ 
/*      */   @XmlElement(name="PatternName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String patternName;
/*      */ 
/*      */   @XmlElement(name="SeatHeight")
/*      */   protected LengthDimension seatHeight;
/*      */ 
/*      */   @XmlElement(name="SpecialFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> specialFeatures;
/*      */ 
/*      */   @XmlElement(name="StyleName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String styleName;
/*      */ 
/*      */   @XmlElement(name="Occasion")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String occasion;
/*      */ 
/*      */   @XmlElement(name="MatteStyle")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String matteStyle;
/*      */ 
/*      */   @XmlElement(name="DisplayLength")
/*      */   protected LengthDimension displayLength;
/*      */ 
/*      */   @XmlElement(name="DisplayWidth")
/*      */   protected LengthDimension displayWidth;
/*      */ 
/*      */   @XmlElement(name="DisplayHeight")
/*      */   protected LengthDimension displayHeight;
/*      */ 
/*      */   @XmlElement(name="DisplayDepth")
/*      */   protected LengthDimension displayDepth;
/*      */ 
/*      */   @XmlElement(name="DisplayDiameter")
/*      */   protected LengthDimension displayDiameter;
/*      */ 
/*      */   @XmlElement(name="DisplayVolume")
/*      */   protected VolumeDimension displayVolume;
/*      */ 
/*      */   @XmlElement(name="DisplayWeight")
/*      */   protected WeightDimension displayWeight;
/*      */ 
/*      */   @XmlElement(name="ItemPackageQuantity", defaultValue="1")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger itemPackageQuantity;
/*      */ 
/*      */   @XmlElement(name="ManufacturerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String manufacturerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="Volume")
/*      */   protected VolumeIntegerDimension volume;
/*      */ 
/*      */   @XmlElement(name="VolumeCapacity")
/*      */   protected VolumeIntegerDimension volumeCapacity;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
/*      */ 
/*      */   @XmlElement(name="ThreadCount")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger threadCount;
/*      */ 
/*      */   @XmlElement(name="NumberOfPieces")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfPieces;
/*      */ 
/*      */   @XmlElement(name="SafetyWarning")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String safetyWarning;
/*      */ 
/*      */   @XmlElement(name="AwardsWon")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> awardsWon;
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
/*      */   @XmlElement(name="BatteryTypeLithiumIon")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryTypeLithiumIon;
/*      */ 
/*      */   @XmlElement(name="BatteryTypeLithiumMetal")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryTypeLithiumMetal;
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
/*      */   @XmlElement(name="MfgWarrantyDescriptionLabor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mfgWarrantyDescriptionLabor;
/*      */ 
/*      */   @XmlElement(name="MfgWarrantyDescriptionParts")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mfgWarrantyDescriptionParts;
/*      */ 
/*      */   @XmlElement(name="MfgWarrantyDescriptionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mfgWarrantyDescriptionType;
/*      */ 
/*      */   @XmlElement(name="NumberOfItemsInPackage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfItemsInPackage;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumIonCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumIonCells;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumMetalCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumMetalCells;
/*      */ 
/*      */   @XmlElement(name="PowerSourceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSourceType;
/*      */ 
/*      */   @XmlElement(name="RegionOfOrigin")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String regionOfOrigin;
/*      */ 
/*      */   @XmlElement(name="SellerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sellerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="SizeMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sizeMap;
/*      */ 
/*      */   @XmlElement(name="Warnings")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String warnings;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger wattage;
/*      */ 
/*      */   @XmlElement(name="Length")
/*      */   protected LengthDimension length;
/*      */ 
/*      */   @XmlElement(name="Width")
/*      */   protected LengthDimension width;
/*      */ 
/*      */   @XmlElement(name="Height")
/*      */   protected LengthDimension height;
/*      */ 
/*      */   @XmlElement(name="Depth")
/*      */   protected LengthDimension depth;
/*      */ 
/*      */   @XmlElement(name="Diameter")
/*      */   protected LengthDimension diameter;
/*      */ 
/*      */   @XmlElement(name="Weight")
/*      */   protected WeightDimension weight;
/*      */ 
/*      */   @XmlElement(name="Spread")
/*      */   protected LengthDimension spread;
/*      */ 
/*      */   @XmlElement(name="SunlightExposure")
/*      */   protected String sunlightExposure;
/*      */ 
/*      */   @XmlElement(name="MoistureNeeds")
/*      */   protected String moistureNeeds;
/*      */ 
/*      */   @XmlElement(name="USDAHardinessZone")
/*      */   protected Integer usdaHardinessZone;
/*      */ 
/*      */   @XmlElement(name="SunsetClimateZone")
/*      */   protected Integer sunsetClimateZone;
/*      */ 
/*      */   @XmlElement(name="NumberOfSets")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfSets;
/*      */ 
/*      */   public ProductType getProductType()
/*      */   {
/*  722 */     return this.productType;
/*      */   }
/*      */ 
/*      */   public void setProductType(ProductType value)
/*      */   {
/*  734 */     this.productType = value;
/*      */   }
/*      */ 
/*      */   public String getParentage()
/*      */   {
/*  746 */     return this.parentage;
/*      */   }
/*      */ 
/*      */   public void setParentage(String value)
/*      */   {
/*  758 */     this.parentage = value;
/*      */   }
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  770 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  782 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getBatteryDescription()
/*      */   {
/*  794 */     return this.batteryDescription;
/*      */   }
/*      */ 
/*      */   public void setBatteryDescription(String value)
/*      */   {
/*  806 */     this.batteryDescription = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  818 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  830 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/*  842 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/*  854 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getCountryAsLabeled()
/*      */   {
/*  866 */     return this.countryAsLabeled;
/*      */   }
/*      */ 
/*      */   public void setCountryAsLabeled(String value)
/*      */   {
/*  878 */     this.countryAsLabeled = value;
/*      */   }
/*      */ 
/*      */   public String getCountryOfOrigin()
/*      */   {
/*  890 */     return this.countryOfOrigin;
/*      */   }
/*      */ 
/*      */   public void setCountryOfOrigin(String value)
/*      */   {
/*  902 */     this.countryOfOrigin = value;
/*      */   }
/*      */ 
/*      */   public String getCountryProducedIn()
/*      */   {
/*  914 */     return this.countryProducedIn;
/*      */   }
/*      */ 
/*      */   public void setCountryProducedIn(String value)
/*      */   {
/*  926 */     this.countryProducedIn = value;
/*      */   }
/*      */ 
/*      */   public String getImportDesignation()
/*      */   {
/*  938 */     return this.importDesignation;
/*      */   }
/*      */ 
/*      */   public void setImportDesignation(String value)
/*      */   {
/*  950 */     this.importDesignation = value;
/*      */   }
/*      */ 
/*      */   public String getFurDescription()
/*      */   {
/*  962 */     return this.furDescription;
/*      */   }
/*      */ 
/*      */   public void setFurDescription(String value)
/*      */   {
/*  974 */     this.furDescription = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/*  986 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/*  998 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public List<String> getIncludedComponents()
/*      */   {
/* 1024 */     if (this.includedComponents == null) {
/* 1025 */       this.includedComponents = new ArrayList();
/*      */     }
/* 1027 */     return this.includedComponents;
/*      */   }
/*      */ 
/*      */   public List<String> getFabricType()
/*      */   {
/* 1053 */     if (this.fabricType == null) {
/* 1054 */       this.fabricType = new ArrayList();
/*      */     }
/* 1056 */     return this.fabricType;
/*      */   }
/*      */ 
/*      */   public String getPatternName()
/*      */   {
/* 1068 */     return this.patternName;
/*      */   }
/*      */ 
/*      */   public void setPatternName(String value)
/*      */   {
/* 1080 */     this.patternName = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSeatHeight()
/*      */   {
/* 1092 */     return this.seatHeight;
/*      */   }
/*      */ 
/*      */   public void setSeatHeight(LengthDimension value)
/*      */   {
/* 1104 */     this.seatHeight = value;
/*      */   }
/*      */ 
/*      */   public List<String> getSpecialFeatures()
/*      */   {
/* 1130 */     if (this.specialFeatures == null) {
/* 1131 */       this.specialFeatures = new ArrayList();
/*      */     }
/* 1133 */     return this.specialFeatures;
/*      */   }
/*      */ 
/*      */   public String getStyleName()
/*      */   {
/* 1145 */     return this.styleName;
/*      */   }
/*      */ 
/*      */   public void setStyleName(String value)
/*      */   {
/* 1157 */     this.styleName = value;
/*      */   }
/*      */ 
/*      */   public String getOccasion()
/*      */   {
/* 1169 */     return this.occasion;
/*      */   }
/*      */ 
/*      */   public void setOccasion(String value)
/*      */   {
/* 1181 */     this.occasion = value;
/*      */   }
/*      */ 
/*      */   public String getMatteStyle()
/*      */   {
/* 1193 */     return this.matteStyle;
/*      */   }
/*      */ 
/*      */   public void setMatteStyle(String value)
/*      */   {
/* 1205 */     this.matteStyle = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/* 1217 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/* 1229 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayWidth()
/*      */   {
/* 1241 */     return this.displayWidth;
/*      */   }
/*      */ 
/*      */   public void setDisplayWidth(LengthDimension value)
/*      */   {
/* 1253 */     this.displayWidth = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayHeight()
/*      */   {
/* 1265 */     return this.displayHeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayHeight(LengthDimension value)
/*      */   {
/* 1277 */     this.displayHeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayDepth()
/*      */   {
/* 1289 */     return this.displayDepth;
/*      */   }
/*      */ 
/*      */   public void setDisplayDepth(LengthDimension value)
/*      */   {
/* 1301 */     this.displayDepth = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayDiameter()
/*      */   {
/* 1313 */     return this.displayDiameter;
/*      */   }
/*      */ 
/*      */   public void setDisplayDiameter(LengthDimension value)
/*      */   {
/* 1325 */     this.displayDiameter = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getDisplayVolume()
/*      */   {
/* 1337 */     return this.displayVolume;
/*      */   }
/*      */ 
/*      */   public void setDisplayVolume(VolumeDimension value)
/*      */   {
/* 1349 */     this.displayVolume = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/* 1361 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/* 1373 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getItemPackageQuantity()
/*      */   {
/* 1385 */     return this.itemPackageQuantity;
/*      */   }
/*      */ 
/*      */   public void setItemPackageQuantity(BigInteger value)
/*      */   {
/* 1397 */     this.itemPackageQuantity = value;
/*      */   }
/*      */ 
/*      */   public String getManufacturerWarrantyDescription()
/*      */   {
/* 1409 */     return this.manufacturerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setManufacturerWarrantyDescription(String value)
/*      */   {
/* 1421 */     this.manufacturerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public VolumeIntegerDimension getVolume()
/*      */   {
/* 1433 */     return this.volume;
/*      */   }
/*      */ 
/*      */   public void setVolume(VolumeIntegerDimension value)
/*      */   {
/* 1445 */     this.volume = value;
/*      */   }
/*      */ 
/*      */   public VolumeIntegerDimension getVolumeCapacity()
/*      */   {
/* 1457 */     return this.volumeCapacity;
/*      */   }
/*      */ 
/*      */   public void setVolumeCapacity(VolumeIntegerDimension value)
/*      */   {
/* 1469 */     this.volumeCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/* 1481 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/* 1493 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getThreadCount()
/*      */   {
/* 1505 */     return this.threadCount;
/*      */   }
/*      */ 
/*      */   public void setThreadCount(BigInteger value)
/*      */   {
/* 1517 */     this.threadCount = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfPieces()
/*      */   {
/* 1529 */     return this.numberOfPieces;
/*      */   }
/*      */ 
/*      */   public void setNumberOfPieces(BigInteger value)
/*      */   {
/* 1541 */     this.numberOfPieces = value;
/*      */   }
/*      */ 
/*      */   public String getSafetyWarning()
/*      */   {
/* 1553 */     return this.safetyWarning;
/*      */   }
/*      */ 
/*      */   public void setSafetyWarning(String value)
/*      */   {
/* 1565 */     this.safetyWarning = value;
/*      */   }
/*      */ 
/*      */   public List<String> getAwardsWon()
/*      */   {
/* 1591 */     if (this.awardsWon == null) {
/* 1592 */       this.awardsWon = new ArrayList();
/*      */     }
/* 1594 */     return this.awardsWon;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLife()
/*      */   {
/* 1606 */     return this.batteryAverageLife;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLife(BigDecimal value)
/*      */   {
/* 1618 */     this.batteryAverageLife = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLifeStandby()
/*      */   {
/* 1630 */     return this.batteryAverageLifeStandby;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLifeStandby(BigDecimal value)
/*      */   {
/* 1642 */     this.batteryAverageLifeStandby = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryChargeTime()
/*      */   {
/* 1654 */     return this.batteryChargeTime;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeTime(BigDecimal value)
/*      */   {
/* 1666 */     this.batteryChargeTime = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryTypeLithiumIon()
/*      */   {
/* 1678 */     return this.batteryTypeLithiumIon;
/*      */   }
/*      */ 
/*      */   public void setBatteryTypeLithiumIon(BigInteger value)
/*      */   {
/* 1690 */     this.batteryTypeLithiumIon = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryTypeLithiumMetal()
/*      */   {
/* 1702 */     return this.batteryTypeLithiumMetal;
/*      */   }
/*      */ 
/*      */   public void setBatteryTypeLithiumMetal(BigInteger value)
/*      */   {
/* 1714 */     this.batteryTypeLithiumMetal = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryEnergyContent()
/*      */   {
/* 1726 */     return this.lithiumBatteryEnergyContent;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*      */   {
/* 1738 */     this.lithiumBatteryEnergyContent = value;
/*      */   }
/*      */ 
/*      */   public String getLithiumBatteryPackaging()
/*      */   {
/* 1750 */     return this.lithiumBatteryPackaging;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryPackaging(String value)
/*      */   {
/* 1762 */     this.lithiumBatteryPackaging = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryVoltage()
/*      */   {
/* 1774 */     return this.lithiumBatteryVoltage;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryVoltage(BigDecimal value)
/*      */   {
/* 1786 */     this.lithiumBatteryVoltage = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryWeight()
/*      */   {
/* 1798 */     return this.lithiumBatteryWeight;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryWeight(BigDecimal value)
/*      */   {
/* 1810 */     this.lithiumBatteryWeight = value;
/*      */   }
/*      */ 
/*      */   public String getMfgWarrantyDescriptionLabor()
/*      */   {
/* 1822 */     return this.mfgWarrantyDescriptionLabor;
/*      */   }
/*      */ 
/*      */   public void setMfgWarrantyDescriptionLabor(String value)
/*      */   {
/* 1834 */     this.mfgWarrantyDescriptionLabor = value;
/*      */   }
/*      */ 
/*      */   public String getMfgWarrantyDescriptionParts()
/*      */   {
/* 1846 */     return this.mfgWarrantyDescriptionParts;
/*      */   }
/*      */ 
/*      */   public void setMfgWarrantyDescriptionParts(String value)
/*      */   {
/* 1858 */     this.mfgWarrantyDescriptionParts = value;
/*      */   }
/*      */ 
/*      */   public String getMfgWarrantyDescriptionType()
/*      */   {
/* 1870 */     return this.mfgWarrantyDescriptionType;
/*      */   }
/*      */ 
/*      */   public void setMfgWarrantyDescriptionType(String value)
/*      */   {
/* 1882 */     this.mfgWarrantyDescriptionType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfItemsInPackage()
/*      */   {
/* 1894 */     return this.numberOfItemsInPackage;
/*      */   }
/*      */ 
/*      */   public void setNumberOfItemsInPackage(BigInteger value)
/*      */   {
/* 1906 */     this.numberOfItemsInPackage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumIonCells()
/*      */   {
/* 1918 */     return this.numberOfLithiumIonCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumIonCells(BigInteger value)
/*      */   {
/* 1930 */     this.numberOfLithiumIonCells = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumMetalCells()
/*      */   {
/* 1942 */     return this.numberOfLithiumMetalCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*      */   {
/* 1954 */     this.numberOfLithiumMetalCells = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSourceType()
/*      */   {
/* 1966 */     return this.powerSourceType;
/*      */   }
/*      */ 
/*      */   public void setPowerSourceType(String value)
/*      */   {
/* 1978 */     this.powerSourceType = value;
/*      */   }
/*      */ 
/*      */   public String getRegionOfOrigin()
/*      */   {
/* 1990 */     return this.regionOfOrigin;
/*      */   }
/*      */ 
/*      */   public void setRegionOfOrigin(String value)
/*      */   {
/* 2002 */     this.regionOfOrigin = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/* 2014 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/* 2026 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getSizeMap()
/*      */   {
/* 2038 */     return this.sizeMap;
/*      */   }
/*      */ 
/*      */   public void setSizeMap(String value)
/*      */   {
/* 2050 */     this.sizeMap = value;
/*      */   }
/*      */ 
/*      */   public String getWarnings()
/*      */   {
/* 2062 */     return this.warnings;
/*      */   }
/*      */ 
/*      */   public void setWarnings(String value)
/*      */   {
/* 2074 */     this.warnings = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getWattage()
/*      */   {
/* 2086 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(BigInteger value)
/*      */   {
/* 2098 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getLength()
/*      */   {
/* 2110 */     return this.length;
/*      */   }
/*      */ 
/*      */   public void setLength(LengthDimension value)
/*      */   {
/* 2122 */     this.length = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getWidth()
/*      */   {
/* 2134 */     return this.width;
/*      */   }
/*      */ 
/*      */   public void setWidth(LengthDimension value)
/*      */   {
/* 2146 */     this.width = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getHeight()
/*      */   {
/* 2158 */     return this.height;
/*      */   }
/*      */ 
/*      */   public void setHeight(LengthDimension value)
/*      */   {
/* 2170 */     this.height = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDepth()
/*      */   {
/* 2182 */     return this.depth;
/*      */   }
/*      */ 
/*      */   public void setDepth(LengthDimension value)
/*      */   {
/* 2194 */     this.depth = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDiameter()
/*      */   {
/* 2206 */     return this.diameter;
/*      */   }
/*      */ 
/*      */   public void setDiameter(LengthDimension value)
/*      */   {
/* 2218 */     this.diameter = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getWeight()
/*      */   {
/* 2230 */     return this.weight;
/*      */   }
/*      */ 
/*      */   public void setWeight(WeightDimension value)
/*      */   {
/* 2242 */     this.weight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpread()
/*      */   {
/* 2254 */     return this.spread;
/*      */   }
/*      */ 
/*      */   public void setSpread(LengthDimension value)
/*      */   {
/* 2266 */     this.spread = value;
/*      */   }
/*      */ 
/*      */   public String getSunlightExposure()
/*      */   {
/* 2278 */     return this.sunlightExposure;
/*      */   }
/*      */ 
/*      */   public void setSunlightExposure(String value)
/*      */   {
/* 2290 */     this.sunlightExposure = value;
/*      */   }
/*      */ 
/*      */   public String getMoistureNeeds()
/*      */   {
/* 2302 */     return this.moistureNeeds;
/*      */   }
/*      */ 
/*      */   public void setMoistureNeeds(String value)
/*      */   {
/* 2314 */     this.moistureNeeds = value;
/*      */   }
/*      */ 
/*      */   public Integer getUSDAHardinessZone()
/*      */   {
/* 2326 */     return this.usdaHardinessZone;
/*      */   }
/*      */ 
/*      */   public void setUSDAHardinessZone(Integer value)
/*      */   {
/* 2338 */     this.usdaHardinessZone = value;
/*      */   }
/*      */ 
/*      */   public Integer getSunsetClimateZone()
/*      */   {
/* 2350 */     return this.sunsetClimateZone;
/*      */   }
/*      */ 
/*      */   public void setSunsetClimateZone(Integer value)
/*      */   {
/* 2362 */     this.sunsetClimateZone = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSets()
/*      */   {
/* 2374 */     return this.numberOfSets;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSets(BigInteger value)
/*      */   {
/* 2386 */     this.numberOfSets = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"parentage", "variationTheme", "size", "color"})
/*      */   public static class VariationData
/*      */   {
/*      */ 
/*      */     @XmlElement(name="Parentage")
/*      */     protected String parentage;
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
/*      */     public String getParentage()
/*      */     {
/* 4004 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 4016 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 4028 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 4040 */       this.variationTheme = value;
/*      */     }
/*      */ 
/*      */     public String getSize()
/*      */     {
/* 4052 */       return this.size;
/*      */     }
/*      */ 
/*      */     public void setSize(String value)
/*      */     {
/* 4064 */       this.size = value;
/*      */     }
/*      */ 
/*      */     public String getColor()
/*      */     {
/* 4076 */       return this.color;
/*      */     }
/*      */ 
/*      */     public void setColor(String value)
/*      */     {
/* 4088 */       this.color = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"bedAndBath", "furnitureAndDecor", "kitchen", "outdoorLiving", "seedsAndPlants", "art", "home"})
/*      */   public static class ProductType
/*      */   {
/*      */ 
/*      */     @XmlElement(name="BedAndBath")
/*      */     protected BedAndBath bedAndBath;
/*      */ 
/*      */     @XmlElement(name="FurnitureAndDecor")
/*      */     protected FurnitureAndDecor furnitureAndDecor;
/*      */ 
/*      */     @XmlElement(name="Kitchen")
/*      */     protected Kitchen kitchen;
/*      */ 
/*      */     @XmlElement(name="OutdoorLiving")
/*      */     protected OutdoorLiving outdoorLiving;
/*      */ 
/*      */     @XmlElement(name="SeedsAndPlants")
/*      */     protected SeedsAndPlants seedsAndPlants;
/*      */ 
/*      */     @XmlElement(name="Art")
/*      */     protected Art art;
/*      */ 
/*      */     @XmlElement(name="Home")
/*      */     protected InnerHome home;
/*      */ 
/*      */     public BedAndBath getBedAndBath()
/*      */     {
/* 2603 */       return this.bedAndBath;
/*      */     }
/*      */ 
/*      */     public void setBedAndBath(BedAndBath value)
/*      */     {
/* 2615 */       this.bedAndBath = value;
/*      */     }
/*      */ 
/*      */     public FurnitureAndDecor getFurnitureAndDecor()
/*      */     {
/* 2627 */       return this.furnitureAndDecor;
/*      */     }
/*      */ 
/*      */     public void setFurnitureAndDecor(FurnitureAndDecor value)
/*      */     {
/* 2639 */       this.furnitureAndDecor = value;
/*      */     }
/*      */ 
/*      */     public Kitchen getKitchen()
/*      */     {
/* 2651 */       return this.kitchen;
/*      */     }
/*      */ 
/*      */     public void setKitchen(Kitchen value)
/*      */     {
/* 2663 */       this.kitchen = value;
/*      */     }
/*      */ 
/*      */     public OutdoorLiving getOutdoorLiving()
/*      */     {
/* 2675 */       return this.outdoorLiving;
/*      */     }
/*      */ 
/*      */     public void setOutdoorLiving(OutdoorLiving value)
/*      */     {
/* 2687 */       this.outdoorLiving = value;
/*      */     }
/*      */ 
/*      */     public SeedsAndPlants getSeedsAndPlants()
/*      */     {
/* 2699 */       return this.seedsAndPlants;
/*      */     }
/*      */ 
/*      */     public void setSeedsAndPlants(SeedsAndPlants value)
/*      */     {
/* 2711 */       this.seedsAndPlants = value;
/*      */     }
/*      */ 
/*      */     public Art getArt()
/*      */     {
/* 2723 */       return this.art;
/*      */     }
/*      */ 
/*      */     public void setArt(Art value)
/*      */     {
/* 2735 */       this.art = value;
/*      */     }
/*      */ 
/*      */     public InnerHome getHome()
/*      */     {
/* 2747 */       return this.home;
/*      */     }
/*      */ 
/*      */     public void setHome(InnerHome value)
/*      */     {
/* 2759 */       this.home = value;
/*      */     }
/*      */ 
/*      */     @XmlAccessorType(XmlAccessType.FIELD)
/*      */     @XmlType(name="", propOrder={"battery", "colorMap", "finish", "isStainResistant", "lightSourceType", "material", "maximumCoverageArea", "numberOfSets", "outputCapacity", "pieceCount", "shape", "threadCount", "towelWeight", "variationData", "wattage", "innerMaterialType", "itemDiameter", "batteryCellComposition", "batteryFormFactor", "paintType", "customerRestrictionType", "occasionType", "efficiency"})
/*      */     public static class InnerHome
/*      */     {
/*      */ 
/*      */       @XmlElement(name="Battery")
/*      */       protected Battery battery;
/*      */ 
/*      */       @XmlElement(name="ColorMap")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String colorMap;
/*      */ 
/*      */       @XmlElement(name="Finish")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String finish;
/*      */ 
/*      */       @XmlElement(name="IsStainResistant")
/*      */       protected Boolean isStainResistant;
/*      */ 
/*      */       @XmlElement(name="LightSourceType")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String lightSourceType;
/*      */ 
/*      */       @XmlElement(name="Material")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String material;
/*      */ 
/*      */       @XmlElement(name="MaximumCoverageArea")
/*      */       protected AreaDimensionOptionalUnit maximumCoverageArea;
/*      */ 
/*      */       @XmlElement(name="NumberOfSets")
/*      */       protected BigInteger numberOfSets;
/*      */ 
/*      */       @XmlElement(name="OutputCapacity")
/*      */       protected VolumeRateDimension outputCapacity;
/*      */ 
/*      */       @XmlElement(name="PieceCount")
/*      */       protected BigInteger pieceCount;
/*      */ 
/*      */       @XmlElement(name="Shape")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String shape;
/*      */ 
/*      */       @XmlElement(name="ThreadCount")
/*      */       protected BigInteger threadCount;
/*      */ 
/*      */       @XmlElement(name="TowelWeight")
/*      */       protected WeightDimension towelWeight;
/*      */ 
/*      */       @XmlElement(name="VariationData")
/*      */       protected VariationData variationData;
/*      */ 
/*      */       @XmlElement(name="Wattage")
/*      */       protected WattageDimensionOptionalUnit wattage;
/*      */ 
/*      */       @XmlElement(name="InnerMaterialType")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String innerMaterialType;
/*      */ 
/*      */       @XmlElement(name="ItemDiameter")
/*      */       protected LengthDimension itemDiameter;
/*      */ 
/*      */       @XmlElement(name="BatteryCellComposition")
/*      */       protected BatteryCellTypeValues batteryCellComposition;
/*      */ 
/*      */       @XmlElement(name="BatteryFormFactor")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String batteryFormFactor;
/*      */ 
/*      */       @XmlElement(name="PaintType")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String paintType;
/*      */ 
/*      */       @XmlElement(name="CustomerRestrictionType")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String customerRestrictionType;
/*      */ 
/*      */       @XmlElement(name="OccasionType")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String occasionType;
/*      */ 
/*      */       @XmlElement(name="Efficiency")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String efficiency;
/*      */ 
/*      */       public Battery getBattery()
/*      */       {
/* 3019 */         return this.battery;
/*      */       }
/*      */ 
/*      */       public void setBattery(Battery value)
/*      */       {
/* 3031 */         this.battery = value;
/*      */       }
/*      */ 
/*      */       public String getColorMap()
/*      */       {
/* 3043 */         return this.colorMap;
/*      */       }
/*      */ 
/*      */       public void setColorMap(String value)
/*      */       {
/* 3055 */         this.colorMap = value;
/*      */       }
/*      */ 
/*      */       public String getFinish()
/*      */       {
/* 3067 */         return this.finish;
/*      */       }
/*      */ 
/*      */       public void setFinish(String value)
/*      */       {
/* 3079 */         this.finish = value;
/*      */       }
/*      */ 
/*      */       public Boolean isIsStainResistant()
/*      */       {
/* 3091 */         return this.isStainResistant;
/*      */       }
/*      */ 
/*      */       public void setIsStainResistant(Boolean value)
/*      */       {
/* 3103 */         this.isStainResistant = value;
/*      */       }
/*      */ 
/*      */       public String getLightSourceType()
/*      */       {
/* 3115 */         return this.lightSourceType;
/*      */       }
/*      */ 
/*      */       public void setLightSourceType(String value)
/*      */       {
/* 3127 */         this.lightSourceType = value;
/*      */       }
/*      */ 
/*      */       public String getMaterial()
/*      */       {
/* 3139 */         return this.material;
/*      */       }
/*      */ 
/*      */       public void setMaterial(String value)
/*      */       {
/* 3151 */         this.material = value;
/*      */       }
/*      */ 
/*      */       public AreaDimensionOptionalUnit getMaximumCoverageArea()
/*      */       {
/* 3163 */         return this.maximumCoverageArea;
/*      */       }
/*      */ 
/*      */       public void setMaximumCoverageArea(AreaDimensionOptionalUnit value)
/*      */       {
/* 3175 */         this.maximumCoverageArea = value;
/*      */       }
/*      */ 
/*      */       public BigInteger getNumberOfSets()
/*      */       {
/* 3187 */         return this.numberOfSets;
/*      */       }
/*      */ 
/*      */       public void setNumberOfSets(BigInteger value)
/*      */       {
/* 3199 */         this.numberOfSets = value;
/*      */       }
/*      */ 
/*      */       public VolumeRateDimension getOutputCapacity()
/*      */       {
/* 3211 */         return this.outputCapacity;
/*      */       }
/*      */ 
/*      */       public void setOutputCapacity(VolumeRateDimension value)
/*      */       {
/* 3223 */         this.outputCapacity = value;
/*      */       }
/*      */ 
/*      */       public BigInteger getPieceCount()
/*      */       {
/* 3235 */         return this.pieceCount;
/*      */       }
/*      */ 
/*      */       public void setPieceCount(BigInteger value)
/*      */       {
/* 3247 */         this.pieceCount = value;
/*      */       }
/*      */ 
/*      */       public String getShape()
/*      */       {
/* 3259 */         return this.shape;
/*      */       }
/*      */ 
/*      */       public void setShape(String value)
/*      */       {
/* 3271 */         this.shape = value;
/*      */       }
/*      */ 
/*      */       public BigInteger getThreadCount()
/*      */       {
/* 3283 */         return this.threadCount;
/*      */       }
/*      */ 
/*      */       public void setThreadCount(BigInteger value)
/*      */       {
/* 3295 */         this.threadCount = value;
/*      */       }
/*      */ 
/*      */       public WeightDimension getTowelWeight()
/*      */       {
/* 3307 */         return this.towelWeight;
/*      */       }
/*      */ 
/*      */       public void setTowelWeight(WeightDimension value)
/*      */       {
/* 3319 */         this.towelWeight = value;
/*      */       }
/*      */ 
/*      */       public VariationData getVariationData()
/*      */       {
/* 3331 */         return this.variationData;
/*      */       }
/*      */ 
/*      */       public void setVariationData(VariationData value)
/*      */       {
/* 3343 */         this.variationData = value;
/*      */       }
/*      */ 
/*      */       public WattageDimensionOptionalUnit getWattage()
/*      */       {
/* 3355 */         return this.wattage;
/*      */       }
/*      */ 
/*      */       public void setWattage(WattageDimensionOptionalUnit value)
/*      */       {
/* 3367 */         this.wattage = value;
/*      */       }
/*      */ 
/*      */       public String getInnerMaterialType()
/*      */       {
/* 3379 */         return this.innerMaterialType;
/*      */       }
/*      */ 
/*      */       public void setInnerMaterialType(String value)
/*      */       {
/* 3391 */         this.innerMaterialType = value;
/*      */       }
/*      */ 
/*      */       public LengthDimension getItemDiameter()
/*      */       {
/* 3403 */         return this.itemDiameter;
/*      */       }
/*      */ 
/*      */       public void setItemDiameter(LengthDimension value)
/*      */       {
/* 3415 */         this.itemDiameter = value;
/*      */       }
/*      */ 
/*      */       public BatteryCellTypeValues getBatteryCellComposition()
/*      */       {
/* 3427 */         return this.batteryCellComposition;
/*      */       }
/*      */ 
/*      */       public void setBatteryCellComposition(BatteryCellTypeValues value)
/*      */       {
/* 3439 */         this.batteryCellComposition = value;
/*      */       }
/*      */ 
/*      */       public String getBatteryFormFactor()
/*      */       {
/* 3451 */         return this.batteryFormFactor;
/*      */       }
/*      */ 
/*      */       public void setBatteryFormFactor(String value)
/*      */       {
/* 3463 */         this.batteryFormFactor = value;
/*      */       }
/*      */ 
/*      */       public String getPaintType()
/*      */       {
/* 3475 */         return this.paintType;
/*      */       }
/*      */ 
/*      */       public void setPaintType(String value)
/*      */       {
/* 3487 */         this.paintType = value;
/*      */       }
/*      */ 
/*      */       public String getCustomerRestrictionType()
/*      */       {
/* 3499 */         return this.customerRestrictionType;
/*      */       }
/*      */ 
/*      */       public void setCustomerRestrictionType(String value)
/*      */       {
/* 3511 */         this.customerRestrictionType = value;
/*      */       }
/*      */ 
/*      */       public String getOccasionType()
/*      */       {
/* 3523 */         return this.occasionType;
/*      */       }
/*      */ 
/*      */       public void setOccasionType(String value)
/*      */       {
/* 3535 */         this.occasionType = value;
/*      */       }
/*      */ 
/*      */       public String getEfficiency()
/*      */       {
/* 3547 */         return this.efficiency;
/*      */       }
/*      */ 
/*      */       public void setEfficiency(String value)
/*      */       {
/* 3559 */         this.efficiency = value;
/*      */       }
/*      */ 
/*      */       @XmlAccessorType(XmlAccessType.FIELD)
/*      */       @XmlType(name="", propOrder={"variationTheme", "size", "color", "scent", "customerPackageType"})
/*      */       public static class VariationData
/*      */       {
/*      */ 
/*      */         @XmlElement(name="VariationTheme")
/*      */         protected String variationTheme;
/*      */ 
/*      */         @XmlElement(name="Size")
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String size;
/*      */ 
/*      */         @XmlElement(name="Color")
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String color;
/*      */ 
/*      */         @XmlElement(name="Scent")
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String scent;
/*      */ 
/*      */         @XmlElement(name="CustomerPackageType")
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String customerPackageType;
/*      */ 
/*      */         public String getVariationTheme()
/*      */         {
/* 3726 */           return this.variationTheme;
/*      */         }
/*      */ 
/*      */         public void setVariationTheme(String value)
/*      */         {
/* 3738 */           this.variationTheme = value;
/*      */         }
/*      */ 
/*      */         public String getSize()
/*      */         {
/* 3750 */           return this.size;
/*      */         }
/*      */ 
/*      */         public void setSize(String value)
/*      */         {
/* 3762 */           this.size = value;
/*      */         }
/*      */ 
/*      */         public String getColor()
/*      */         {
/* 3774 */           return this.color;
/*      */         }
/*      */ 
/*      */         public void setColor(String value)
/*      */         {
/* 3786 */           this.color = value;
/*      */         }
/*      */ 
/*      */         public String getScent()
/*      */         {
/* 3798 */           return this.scent;
/*      */         }
/*      */ 
/*      */         public void setScent(String value)
/*      */         {
/* 3810 */           this.scent = value;
/*      */         }
/*      */ 
/*      */         public String getCustomerPackageType()
/*      */         {
/* 3822 */           return this.customerPackageType;
/*      */         }
/*      */ 
/*      */         public void setCustomerPackageType(String value)
/*      */         {
/* 3834 */           this.customerPackageType = value;
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Home
 * JD-Core Version:    0.6.2
 */