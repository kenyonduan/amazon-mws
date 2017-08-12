/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlAttribute;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlSchemaType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.XmlValue;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"battery", "canShipInOriginalContainer", "colorMap", "identityPackageType", "threadCount", "plantOrAnimalProductType", "germinationTime", "expectedBloomingPeriod", "harvestDate", "seasons", "material", "moistureNeeds", "poolType", "powerSource", "spread", "sunlightExposure", "sunsetClimateZone", "usdaHardinessZone", "variationData", "isStainResistant", "warrantyDescription", "unitCount", "occasionType", "foliageType", "breedRecommendation", "ageRangeDescription"})
/*      */ @XmlRootElement(name="SeedsAndPlants")
/*      */ public class SeedsAndPlants
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
/*      */   @XmlElement(name="IdentityPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String identityPackageType;
/*      */ 
/*      */   @XmlElement(name="ThreadCount")
/*      */   protected BigInteger threadCount;
/*      */ 
/*      */   @XmlElement(name="PlantOrAnimalProductType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String plantOrAnimalProductType;
/*      */ 
/*      */   @XmlElement(name="GerminationTime")
/*      */   protected TimeDimension germinationTime;
/*      */ 
/*      */   @XmlElement(name="ExpectedBloomingPeriod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String expectedBloomingPeriod;
/*      */ 
/*      */   @XmlElement(name="HarvestDate")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String harvestDate;
/*      */ 
/*      */   @XmlElement(name="Seasons")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String seasons;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
/*      */ 
/*      */   @XmlElement(name="MoistureNeeds")
/*      */   protected String moistureNeeds;
/*      */ 
/*      */   @XmlElement(name="PoolType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String poolType;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="Spread")
/*      */   protected LengthDimension spread;
/*      */ 
/*      */   @XmlElement(name="SunlightExposure")
/*      */   protected String sunlightExposure;
/*      */ 
/*      */   @XmlElement(name="SunsetClimateZone", type=Integer.class)
/*      */   protected List<Integer> sunsetClimateZone;
/*      */ 
/*      */   @XmlElement(name="USDAHardinessZone", type=Integer.class)
/*      */   protected List<Integer> usdaHardinessZone;
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="IsStainResistant")
/*      */   protected Boolean isStainResistant;
/*      */ 
/*      */   @XmlElement(name="WarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String warrantyDescription;
/*      */ 
/*      */   @XmlElement(name="UnitCount")
/*      */   protected UnitCount unitCount;
/*      */ 
/*      */   @XmlElement(name="OccasionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String occasionType;
/*      */ 
/*      */   @XmlElement(name="FoliageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String foliageType;
/*      */ 
/*      */   @XmlElement(name="BreedRecommendation")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String breedRecommendation;
/*      */ 
/*      */   @XmlElement(name="AgeRangeDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String ageRangeDescription;
/*      */ 
/*      */   public Battery getBattery()
/*      */   {
/*  250 */     return this.battery;
/*      */   }
/*      */ 
/*      */   public void setBattery(Battery value)
/*      */   {
/*  262 */     this.battery = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/*  274 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/*  286 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  298 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  310 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/*  322 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/*  334 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getThreadCount()
/*      */   {
/*  346 */     return this.threadCount;
/*      */   }
/*      */ 
/*      */   public void setThreadCount(BigInteger value)
/*      */   {
/*  358 */     this.threadCount = value;
/*      */   }
/*      */ 
/*      */   public String getPlantOrAnimalProductType()
/*      */   {
/*  370 */     return this.plantOrAnimalProductType;
/*      */   }
/*      */ 
/*      */   public void setPlantOrAnimalProductType(String value)
/*      */   {
/*  382 */     this.plantOrAnimalProductType = value;
/*      */   }
/*      */ 
/*      */   public TimeDimension getGerminationTime()
/*      */   {
/*  394 */     return this.germinationTime;
/*      */   }
/*      */ 
/*      */   public void setGerminationTime(TimeDimension value)
/*      */   {
/*  406 */     this.germinationTime = value;
/*      */   }
/*      */ 
/*      */   public String getExpectedBloomingPeriod()
/*      */   {
/*  418 */     return this.expectedBloomingPeriod;
/*      */   }
/*      */ 
/*      */   public void setExpectedBloomingPeriod(String value)
/*      */   {
/*  430 */     this.expectedBloomingPeriod = value;
/*      */   }
/*      */ 
/*      */   public String getHarvestDate()
/*      */   {
/*  442 */     return this.harvestDate;
/*      */   }
/*      */ 
/*      */   public void setHarvestDate(String value)
/*      */   {
/*  454 */     this.harvestDate = value;
/*      */   }
/*      */ 
/*      */   public String getSeasons()
/*      */   {
/*  466 */     return this.seasons;
/*      */   }
/*      */ 
/*      */   public void setSeasons(String value)
/*      */   {
/*  478 */     this.seasons = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/*  490 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/*  502 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public String getMoistureNeeds()
/*      */   {
/*  514 */     return this.moistureNeeds;
/*      */   }
/*      */ 
/*      */   public void setMoistureNeeds(String value)
/*      */   {
/*  526 */     this.moistureNeeds = value;
/*      */   }
/*      */ 
/*      */   public String getPoolType()
/*      */   {
/*  538 */     return this.poolType;
/*      */   }
/*      */ 
/*      */   public void setPoolType(String value)
/*      */   {
/*  550 */     this.poolType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  562 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  574 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpread()
/*      */   {
/*  586 */     return this.spread;
/*      */   }
/*      */ 
/*      */   public void setSpread(LengthDimension value)
/*      */   {
/*  598 */     this.spread = value;
/*      */   }
/*      */ 
/*      */   public String getSunlightExposure()
/*      */   {
/*  610 */     return this.sunlightExposure;
/*      */   }
/*      */ 
/*      */   public void setSunlightExposure(String value)
/*      */   {
/*  622 */     this.sunlightExposure = value;
/*      */   }
/*      */ 
/*      */   public List<Integer> getSunsetClimateZone()
/*      */   {
/*  648 */     if (this.sunsetClimateZone == null) {
/*  649 */       this.sunsetClimateZone = new ArrayList();
/*      */     }
/*  651 */     return this.sunsetClimateZone;
/*      */   }
/*      */ 
/*      */   public List<Integer> getUSDAHardinessZone()
/*      */   {
/*  677 */     if (this.usdaHardinessZone == null) {
/*  678 */       this.usdaHardinessZone = new ArrayList();
/*      */     }
/*  680 */     return this.usdaHardinessZone;
/*      */   }
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  692 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  704 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public Boolean isIsStainResistant()
/*      */   {
/*  716 */     return this.isStainResistant;
/*      */   }
/*      */ 
/*      */   public void setIsStainResistant(Boolean value)
/*      */   {
/*  728 */     this.isStainResistant = value;
/*      */   }
/*      */ 
/*      */   public String getWarrantyDescription()
/*      */   {
/*  740 */     return this.warrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setWarrantyDescription(String value)
/*      */   {
/*  752 */     this.warrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public UnitCount getUnitCount()
/*      */   {
/*  764 */     return this.unitCount;
/*      */   }
/*      */ 
/*      */   public void setUnitCount(UnitCount value)
/*      */   {
/*  776 */     this.unitCount = value;
/*      */   }
/*      */ 
/*      */   public String getOccasionType()
/*      */   {
/*  788 */     return this.occasionType;
/*      */   }
/*      */ 
/*      */   public void setOccasionType(String value)
/*      */   {
/*  800 */     this.occasionType = value;
/*      */   }
/*      */ 
/*      */   public String getFoliageType()
/*      */   {
/*  812 */     return this.foliageType;
/*      */   }
/*      */ 
/*      */   public void setFoliageType(String value)
/*      */   {
/*  824 */     this.foliageType = value;
/*      */   }
/*      */ 
/*      */   public String getBreedRecommendation()
/*      */   {
/*  836 */     return this.breedRecommendation;
/*      */   }
/*      */ 
/*      */   public void setBreedRecommendation(String value)
/*      */   {
/*  848 */     this.breedRecommendation = value;
/*      */   }
/*      */ 
/*      */   public String getAgeRangeDescription()
/*      */   {
/*  860 */     return this.ageRangeDescription;
/*      */   }
/*      */ 
/*      */   public void setAgeRangeDescription(String value)
/*      */   {
/*  872 */     this.ageRangeDescription = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"variationTheme", "size", "color", "styleName", "scentName", "customerPackageType"})
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
/*      */     @XmlElement(name="StyleName")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String styleName;
/*      */ 
/*      */     @XmlElement(name="ScentName")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String scentName;
/*      */ 
/*      */     @XmlElement(name="CustomerPackageType")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String customerPackageType;
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 1035 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 1047 */       this.variationTheme = value;
/*      */     }
/*      */ 
/*      */     public String getSize()
/*      */     {
/* 1059 */       return this.size;
/*      */     }
/*      */ 
/*      */     public void setSize(String value)
/*      */     {
/* 1071 */       this.size = value;
/*      */     }
/*      */ 
/*      */     public String getColor()
/*      */     {
/* 1083 */       return this.color;
/*      */     }
/*      */ 
/*      */     public void setColor(String value)
/*      */     {
/* 1095 */       this.color = value;
/*      */     }
/*      */ 
/*      */     public String getStyleName()
/*      */     {
/* 1107 */       return this.styleName;
/*      */     }
/*      */ 
/*      */     public void setStyleName(String value)
/*      */     {
/* 1119 */       this.styleName = value;
/*      */     }
/*      */ 
/*      */     public String getScentName()
/*      */     {
/* 1131 */       return this.scentName;
/*      */     }
/*      */ 
/*      */     public void setScentName(String value)
/*      */     {
/* 1143 */       this.scentName = value;
/*      */     }
/*      */ 
/*      */     public String getCustomerPackageType()
/*      */     {
/* 1155 */       return this.customerPackageType;
/*      */     }
/*      */ 
/*      */     public void setCustomerPackageType(String value)
/*      */     {
/* 1167 */       this.customerPackageType = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"value"})
/*      */   public static class UnitCount
/*      */   {
/*      */ 
/*      */     @XmlValue
/*      */     @XmlSchemaType(name="positiveInteger")
/*      */     protected BigInteger value;
/*      */ 
/*      */     @XmlAttribute(name="unitOfMeasure", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String unitOfMeasure;
/*      */ 
/*      */     public BigInteger getValue()
/*      */     {
/*  915 */       return this.value;
/*      */     }
/*      */ 
/*      */     public void setValue(BigInteger value)
/*      */     {
/*  927 */       this.value = value;
/*      */     }
/*      */ 
/*      */     public String getUnitOfMeasure()
/*      */     {
/*  939 */       return this.unitOfMeasure;
/*      */     }
/*      */ 
/*      */     public void setUnitOfMeasure(String value)
/*      */     {
/*  951 */       this.unitOfMeasure = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SeedsAndPlants
 * JD-Core Version:    0.6.2
 */