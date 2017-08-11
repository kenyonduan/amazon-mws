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
/*      */ @XmlType(name="", propOrder={"rebate", "productType", "battery", "displayWeight", "displayVolume", "displayLength", "mfgWarrantyDescriptionParts", "mfgWarrantyDescriptionType", "mfgWarrantyDescriptionLabor", "languageOriginal", "languageSubtitled", "languageDubbed", "parentage", "variationTheme", "batteryAverageLife", "batteryAverageLifeStandby", "batteryChargeTime", "isAdultProduct", "batteryTypeLithiumIon", "batteryTypeLithiumMetal", "colorName", "count", "countryOfOrigin", "customerPackageType", "canShipInOriginalContainer", "identityPackageType", "gappPrcDcz", "gappPrcXcyz", "includedComponents", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "maxOrderQuantity", "numberOfItems", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "powerSource", "publisher", "publishingCompany", "regionOfOrigin", "sellerWarrantyDescription", "size", "sizeMap", "styleName", "targetGender", "warnings", "specificUsesForProduct"})
/*      */ @XmlRootElement(name="SoftwareVideoGames")
/*      */ public class SoftwareVideoGames
/*      */ {
/*      */ 
/*      */   @XmlElement(name="Rebate")
/*      */   protected List<RebateType> rebate;
/*      */ 
/*      */   @XmlElement(name="ProductType", required=true)
/*      */   protected ProductType productType;
/*      */ 
/*      */   @XmlElement(name="Battery")
/*      */   protected Battery battery;
/*      */ 
/*      */   @XmlElement(name="DisplayWeight")
/*      */   protected WeightDimension displayWeight;
/*      */ 
/*      */   @XmlElement(name="DisplayVolume")
/*      */   protected VolumeDimension displayVolume;
/*      */ 
/*      */   @XmlElement(name="DisplayLength")
/*      */   protected LengthDimension displayLength;
/*      */ 
/*      */   @XmlElement(name="MfgWarrantyDescriptionParts")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mfgWarrantyDescriptionParts;
/*      */ 
/*      */   @XmlElement(name="MfgWarrantyDescriptionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mfgWarrantyDescriptionType;
/*      */ 
/*      */   @XmlElement(name="MfgWarrantyDescriptionLabor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mfgWarrantyDescriptionLabor;
/*      */ 
/*      */   @XmlElement(name="LanguageOriginal")
/*      */   protected List<LanguageSWVG> languageOriginal;
/*      */ 
/*      */   @XmlElement(name="LanguageSubtitled")
/*      */   protected List<LanguageSWVG> languageSubtitled;
/*      */ 
/*      */   @XmlElement(name="LanguageDubbed")
/*      */   protected List<LanguageSWVG> languageDubbed;
/*      */ 
/*      */   @XmlElement(name="Parentage")
/*      */   protected String parentage;
/*      */ 
/*      */   @XmlElement(name="VariationTheme")
/*      */   protected String variationTheme;
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
/*      */   @XmlElement(name="IsAdultProduct")
/*      */   protected Boolean isAdultProduct;
/*      */ 
/*      */   @XmlElement(name="BatteryTypeLithiumIon")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryTypeLithiumIon;
/*      */ 
/*      */   @XmlElement(name="BatteryTypeLithiumMetal")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryTypeLithiumMetal;
/*      */ 
/*      */   @XmlElement(name="ColorName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorName;
/*      */ 
/*      */   @XmlElement(name="Count")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger count;
/*      */ 
/*      */   @XmlElement(name="CountryOfOrigin")
/*      */   protected String countryOfOrigin;
/*      */ 
/*      */   @XmlElement(name="CustomerPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String customerPackageType;
/*      */ 
/*      */   @XmlElement(name="CanShipInOriginalContainer")
/*      */   protected Boolean canShipInOriginalContainer;
/*      */ 
/*      */   @XmlElement(name="IdentityPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String identityPackageType;
/*      */ 
/*      */   @XmlElement(name="GappPrcDcz")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String gappPrcDcz;
/*      */ 
/*      */   @XmlElement(name="GappPrcXcyz")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String gappPrcXcyz;
/*      */ 
/*      */   @XmlElement(name="IncludedComponents")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String includedComponents;
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
/*      */   @XmlElement(name="MaxOrderQuantity")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger maxOrderQuantity;
/*      */ 
/*      */   @XmlElement(name="NumberOfItems")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfItems;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumIonCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumIonCells;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumMetalCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumMetalCells;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="Publisher")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String publisher;
/*      */ 
/*      */   @XmlElement(name="PublishingCompany")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String publishingCompany;
/*      */ 
/*      */   @XmlElement(name="RegionOfOrigin")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String regionOfOrigin;
/*      */ 
/*      */   @XmlElement(name="SellerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sellerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="Size")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String size;
/*      */ 
/*      */   @XmlElement(name="SizeMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sizeMap;
/*      */ 
/*      */   @XmlElement(name="StyleName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String styleName;
/*      */ 
/*      */   @XmlElement(name="TargetGender")
/*      */   protected String targetGender;
/*      */ 
/*      */   @XmlElement(name="Warnings")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String warnings;
/*      */ 
/*      */   @XmlElement(name="SpecificUsesForProduct")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> specificUsesForProduct;
/*      */ 
/*      */   public List<RebateType> getRebate()
/*      */   {
/*  346 */     if (this.rebate == null) {
/*  347 */       this.rebate = new ArrayList();
/*      */     }
/*  349 */     return this.rebate;
/*      */   }
/*      */ 
/*      */   public ProductType getProductType()
/*      */   {
/*  361 */     return this.productType;
/*      */   }
/*      */ 
/*      */   public void setProductType(ProductType value)
/*      */   {
/*  373 */     this.productType = value;
/*      */   }
/*      */ 
/*      */   public Battery getBattery()
/*      */   {
/*  385 */     return this.battery;
/*      */   }
/*      */ 
/*      */   public void setBattery(Battery value)
/*      */   {
/*  397 */     this.battery = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/*  409 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/*  421 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getDisplayVolume()
/*      */   {
/*  433 */     return this.displayVolume;
/*      */   }
/*      */ 
/*      */   public void setDisplayVolume(VolumeDimension value)
/*      */   {
/*  445 */     this.displayVolume = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/*  457 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/*  469 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public String getMfgWarrantyDescriptionParts()
/*      */   {
/*  481 */     return this.mfgWarrantyDescriptionParts;
/*      */   }
/*      */ 
/*      */   public void setMfgWarrantyDescriptionParts(String value)
/*      */   {
/*  493 */     this.mfgWarrantyDescriptionParts = value;
/*      */   }
/*      */ 
/*      */   public String getMfgWarrantyDescriptionType()
/*      */   {
/*  505 */     return this.mfgWarrantyDescriptionType;
/*      */   }
/*      */ 
/*      */   public void setMfgWarrantyDescriptionType(String value)
/*      */   {
/*  517 */     this.mfgWarrantyDescriptionType = value;
/*      */   }
/*      */ 
/*      */   public String getMfgWarrantyDescriptionLabor()
/*      */   {
/*  529 */     return this.mfgWarrantyDescriptionLabor;
/*      */   }
/*      */ 
/*      */   public void setMfgWarrantyDescriptionLabor(String value)
/*      */   {
/*  541 */     this.mfgWarrantyDescriptionLabor = value;
/*      */   }
/*      */ 
/*      */   public List<LanguageSWVG> getLanguageOriginal()
/*      */   {
/*  567 */     if (this.languageOriginal == null) {
/*  568 */       this.languageOriginal = new ArrayList();
/*      */     }
/*  570 */     return this.languageOriginal;
/*      */   }
/*      */ 
/*      */   public List<LanguageSWVG> getLanguageSubtitled()
/*      */   {
/*  596 */     if (this.languageSubtitled == null) {
/*  597 */       this.languageSubtitled = new ArrayList();
/*      */     }
/*  599 */     return this.languageSubtitled;
/*      */   }
/*      */ 
/*      */   public List<LanguageSWVG> getLanguageDubbed()
/*      */   {
/*  625 */     if (this.languageDubbed == null) {
/*  626 */       this.languageDubbed = new ArrayList();
/*      */     }
/*  628 */     return this.languageDubbed;
/*      */   }
/*      */ 
/*      */   public String getParentage()
/*      */   {
/*  640 */     return this.parentage;
/*      */   }
/*      */ 
/*      */   public void setParentage(String value)
/*      */   {
/*  652 */     this.parentage = value;
/*      */   }
/*      */ 
/*      */   public String getVariationTheme()
/*      */   {
/*  664 */     return this.variationTheme;
/*      */   }
/*      */ 
/*      */   public void setVariationTheme(String value)
/*      */   {
/*  676 */     this.variationTheme = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLife()
/*      */   {
/*  688 */     return this.batteryAverageLife;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLife(BigDecimal value)
/*      */   {
/*  700 */     this.batteryAverageLife = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryAverageLifeStandby()
/*      */   {
/*  712 */     return this.batteryAverageLifeStandby;
/*      */   }
/*      */ 
/*      */   public void setBatteryAverageLifeStandby(BigDecimal value)
/*      */   {
/*  724 */     this.batteryAverageLifeStandby = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBatteryChargeTime()
/*      */   {
/*  736 */     return this.batteryChargeTime;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeTime(BigDecimal value)
/*      */   {
/*  748 */     this.batteryChargeTime = value;
/*      */   }
/*      */ 
/*      */   public Boolean isIsAdultProduct()
/*      */   {
/*  760 */     return this.isAdultProduct;
/*      */   }
/*      */ 
/*      */   public void setIsAdultProduct(Boolean value)
/*      */   {
/*  772 */     this.isAdultProduct = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryTypeLithiumIon()
/*      */   {
/*  784 */     return this.batteryTypeLithiumIon;
/*      */   }
/*      */ 
/*      */   public void setBatteryTypeLithiumIon(BigInteger value)
/*      */   {
/*  796 */     this.batteryTypeLithiumIon = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryTypeLithiumMetal()
/*      */   {
/*  808 */     return this.batteryTypeLithiumMetal;
/*      */   }
/*      */ 
/*      */   public void setBatteryTypeLithiumMetal(BigInteger value)
/*      */   {
/*  820 */     this.batteryTypeLithiumMetal = value;
/*      */   }
/*      */ 
/*      */   public String getColorName()
/*      */   {
/*  832 */     return this.colorName;
/*      */   }
/*      */ 
/*      */   public void setColorName(String value)
/*      */   {
/*  844 */     this.colorName = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getCount()
/*      */   {
/*  856 */     return this.count;
/*      */   }
/*      */ 
/*      */   public void setCount(BigInteger value)
/*      */   {
/*  868 */     this.count = value;
/*      */   }
/*      */ 
/*      */   public String getCountryOfOrigin()
/*      */   {
/*  880 */     return this.countryOfOrigin;
/*      */   }
/*      */ 
/*      */   public void setCountryOfOrigin(String value)
/*      */   {
/*  892 */     this.countryOfOrigin = value;
/*      */   }
/*      */ 
/*      */   public String getCustomerPackageType()
/*      */   {
/*  904 */     return this.customerPackageType;
/*      */   }
/*      */ 
/*      */   public void setCustomerPackageType(String value)
/*      */   {
/*  916 */     this.customerPackageType = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/*  928 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/*  940 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/*  952 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/*  964 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public String getGappPrcDcz()
/*      */   {
/*  976 */     return this.gappPrcDcz;
/*      */   }
/*      */ 
/*      */   public void setGappPrcDcz(String value)
/*      */   {
/*  988 */     this.gappPrcDcz = value;
/*      */   }
/*      */ 
/*      */   public String getGappPrcXcyz()
/*      */   {
/* 1000 */     return this.gappPrcXcyz;
/*      */   }
/*      */ 
/*      */   public void setGappPrcXcyz(String value)
/*      */   {
/* 1012 */     this.gappPrcXcyz = value;
/*      */   }
/*      */ 
/*      */   public String getIncludedComponents()
/*      */   {
/* 1024 */     return this.includedComponents;
/*      */   }
/*      */ 
/*      */   public void setIncludedComponents(String value)
/*      */   {
/* 1036 */     this.includedComponents = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryEnergyContent()
/*      */   {
/* 1048 */     return this.lithiumBatteryEnergyContent;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*      */   {
/* 1060 */     this.lithiumBatteryEnergyContent = value;
/*      */   }
/*      */ 
/*      */   public String getLithiumBatteryPackaging()
/*      */   {
/* 1072 */     return this.lithiumBatteryPackaging;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryPackaging(String value)
/*      */   {
/* 1084 */     this.lithiumBatteryPackaging = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryVoltage()
/*      */   {
/* 1096 */     return this.lithiumBatteryVoltage;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryVoltage(BigDecimal value)
/*      */   {
/* 1108 */     this.lithiumBatteryVoltage = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLithiumBatteryWeight()
/*      */   {
/* 1120 */     return this.lithiumBatteryWeight;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryWeight(BigDecimal value)
/*      */   {
/* 1132 */     this.lithiumBatteryWeight = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getMaxOrderQuantity()
/*      */   {
/* 1144 */     return this.maxOrderQuantity;
/*      */   }
/*      */ 
/*      */   public void setMaxOrderQuantity(BigInteger value)
/*      */   {
/* 1156 */     this.maxOrderQuantity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfItems()
/*      */   {
/* 1168 */     return this.numberOfItems;
/*      */   }
/*      */ 
/*      */   public void setNumberOfItems(BigInteger value)
/*      */   {
/* 1180 */     this.numberOfItems = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumIonCells()
/*      */   {
/* 1192 */     return this.numberOfLithiumIonCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumIonCells(BigInteger value)
/*      */   {
/* 1204 */     this.numberOfLithiumIonCells = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumMetalCells()
/*      */   {
/* 1216 */     return this.numberOfLithiumMetalCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*      */   {
/* 1228 */     this.numberOfLithiumMetalCells = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1240 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1252 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getPublisher()
/*      */   {
/* 1264 */     return this.publisher;
/*      */   }
/*      */ 
/*      */   public void setPublisher(String value)
/*      */   {
/* 1276 */     this.publisher = value;
/*      */   }
/*      */ 
/*      */   public String getPublishingCompany()
/*      */   {
/* 1288 */     return this.publishingCompany;
/*      */   }
/*      */ 
/*      */   public void setPublishingCompany(String value)
/*      */   {
/* 1300 */     this.publishingCompany = value;
/*      */   }
/*      */ 
/*      */   public String getRegionOfOrigin()
/*      */   {
/* 1312 */     return this.regionOfOrigin;
/*      */   }
/*      */ 
/*      */   public void setRegionOfOrigin(String value)
/*      */   {
/* 1324 */     this.regionOfOrigin = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/* 1336 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/* 1348 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getSize()
/*      */   {
/* 1360 */     return this.size;
/*      */   }
/*      */ 
/*      */   public void setSize(String value)
/*      */   {
/* 1372 */     this.size = value;
/*      */   }
/*      */ 
/*      */   public String getSizeMap()
/*      */   {
/* 1384 */     return this.sizeMap;
/*      */   }
/*      */ 
/*      */   public void setSizeMap(String value)
/*      */   {
/* 1396 */     this.sizeMap = value;
/*      */   }
/*      */ 
/*      */   public String getStyleName()
/*      */   {
/* 1408 */     return this.styleName;
/*      */   }
/*      */ 
/*      */   public void setStyleName(String value)
/*      */   {
/* 1420 */     this.styleName = value;
/*      */   }
/*      */ 
/*      */   public String getTargetGender()
/*      */   {
/* 1432 */     return this.targetGender;
/*      */   }
/*      */ 
/*      */   public void setTargetGender(String value)
/*      */   {
/* 1444 */     this.targetGender = value;
/*      */   }
/*      */ 
/*      */   public String getWarnings()
/*      */   {
/* 1456 */     return this.warnings;
/*      */   }
/*      */ 
/*      */   public void setWarnings(String value)
/*      */   {
/* 1468 */     this.warnings = value;
/*      */   }
/*      */ 
/*      */   public List<String> getSpecificUsesForProduct()
/*      */   {
/* 1494 */     if (this.specificUsesForProduct == null) {
/* 1495 */       this.specificUsesForProduct = new ArrayList();
/*      */     }
/* 1497 */     return this.specificUsesForProduct;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"software", "handheldSoftwareDownloads", "softwareGames", "videoGames", "videoGamesAccessories", "videoGamesHardware"})
/*      */   public static class ProductType
/*      */   {
/*      */ 
/*      */     @XmlElement(name="Software")
/*      */     protected Software software;
/*      */ 
/*      */     @XmlElement(name="HandheldSoftwareDownloads")
/*      */     protected HandheldSoftwareDownloads handheldSoftwareDownloads;
/*      */ 
/*      */     @XmlElement(name="SoftwareGames")
/*      */     protected SoftwareGames softwareGames;
/*      */ 
/*      */     @XmlElement(name="VideoGames")
/*      */     protected VideoGames videoGames;
/*      */ 
/*      */     @XmlElement(name="VideoGamesAccessories")
/*      */     protected VideoGamesAccessories videoGamesAccessories;
/*      */ 
/*      */     @XmlElement(name="VideoGamesHardware")
/*      */     protected VideoGamesHardware videoGamesHardware;
/*      */ 
/*      */     public Software getSoftware()
/*      */     {
/* 1558 */       return this.software;
/*      */     }
/*      */ 
/*      */     public void setSoftware(Software value)
/*      */     {
/* 1570 */       this.software = value;
/*      */     }
/*      */ 
/*      */     public HandheldSoftwareDownloads getHandheldSoftwareDownloads()
/*      */     {
/* 1582 */       return this.handheldSoftwareDownloads;
/*      */     }
/*      */ 
/*      */     public void setHandheldSoftwareDownloads(HandheldSoftwareDownloads value)
/*      */     {
/* 1594 */       this.handheldSoftwareDownloads = value;
/*      */     }
/*      */ 
/*      */     public SoftwareGames getSoftwareGames()
/*      */     {
/* 1606 */       return this.softwareGames;
/*      */     }
/*      */ 
/*      */     public void setSoftwareGames(SoftwareGames value)
/*      */     {
/* 1618 */       this.softwareGames = value;
/*      */     }
/*      */ 
/*      */     public VideoGames getVideoGames()
/*      */     {
/* 1630 */       return this.videoGames;
/*      */     }
/*      */ 
/*      */     public void setVideoGames(VideoGames value)
/*      */     {
/* 1642 */       this.videoGames = value;
/*      */     }
/*      */ 
/*      */     public VideoGamesAccessories getVideoGamesAccessories()
/*      */     {
/* 1654 */       return this.videoGamesAccessories;
/*      */     }
/*      */ 
/*      */     public void setVideoGamesAccessories(VideoGamesAccessories value)
/*      */     {
/* 1666 */       this.videoGamesAccessories = value;
/*      */     }
/*      */ 
/*      */     public VideoGamesHardware getVideoGamesHardware()
/*      */     {
/* 1678 */       return this.videoGamesHardware;
/*      */     }
/*      */ 
/*      */     public void setVideoGamesHardware(VideoGamesHardware value)
/*      */     {
/* 1690 */       this.videoGamesHardware = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SoftwareVideoGames
 * JD-Core Version:    0.6.2
 */