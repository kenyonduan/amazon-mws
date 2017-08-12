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
/*      */ @XmlType(name="", propOrder={"variationData", "airFlowCapacity", "baseDiameter", "battery", "bulbDiameter", "bulbLength", "bulbLifeSpan", "bulbPowerFactor", "bulbSpecialFeatures", "bulbSwitchingCycles", "bulbType", "bulbWattage", "capType", "certification", "collection", "color", "colorMap", "colorRenderingIndex", "colorTemperature", "countryOfOrigin", "displayDepth", "displayDiameter", "displayHeight", "displayLength", "displayWeight", "displayWidth", "energyEfficiencyRating", "fanBladeColor", "finishType", "incandescentEquivalentWattage", "includedComponent", "internationalProtectionRating", "itemDiameter", "lampStartupTime", "lampWarmupTime", "lightingMethod", "lightOutputLuminance", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "lumenMaintenanceFactor", "luminousIntensity", "material", "maximumCurrent", "maximumSupportedWattage", "mercuryContent", "numberOfBlades", "numberOfBulbSockets", "numberOfLights", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "plugType", "powerSource", "ppuCount", "ppuCountType", "shadeColor", "shadeDiameter", "shadeMaterial", "specialFeatures", "specificUses", "styleName", "switchStyle", "voltage", "volume", "wattage", "weightedAnnualEnergyConsumption", "fixtureType", "efficiency"})
/*      */ @XmlRootElement(name="LightsAndFixtures")
/*      */ public class LightsAndFixtures
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="AirFlowCapacity")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger airFlowCapacity;
/*      */ 
/*      */   @XmlElement(name="BaseDiameter")
/*      */   protected LengthDimension baseDiameter;
/*      */ 
/*      */   @XmlElement(name="Battery")
/*      */   protected Battery battery;
/*      */ 
/*      */   @XmlElement(name="BulbDiameter")
/*      */   protected LengthDimension bulbDiameter;
/*      */ 
/*      */   @XmlElement(name="BulbLength")
/*      */   protected LengthDimension bulbLength;
/*      */ 
/*      */   @XmlElement(name="BulbLifeSpan")
/*      */   protected TimeDimension bulbLifeSpan;
/*      */ 
/*      */   @XmlElement(name="BulbPowerFactor")
/*      */   protected BigDecimal bulbPowerFactor;
/*      */ 
/*      */   @XmlElement(name="BulbSpecialFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> bulbSpecialFeatures;
/*      */ 
/*      */   @XmlElement(name="BulbSwitchingCycles")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger bulbSwitchingCycles;
/*      */ 
/*      */   @XmlElement(name="BulbType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bulbType;
/*      */ 
/*      */   @XmlElement(name="BulbWattage")
/*      */   protected BigDecimal bulbWattage;
/*      */ 
/*      */   @XmlElement(name="CapType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String capType;
/*      */ 
/*      */   @XmlElement(name="Certification")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> certification;
/*      */ 
/*      */   @XmlElement(name="Collection")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String collection;
/*      */ 
/*      */   @XmlElement(name="Color")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String color;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="ColorRenderingIndex")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger colorRenderingIndex;
/*      */ 
/*      */   @XmlElement(name="ColorTemperature")
/*      */   protected TemperatureRatingDimension colorTemperature;
/*      */ 
/*      */   @XmlElement(name="CountryOfOrigin")
/*      */   protected String countryOfOrigin;
/*      */ 
/*      */   @XmlElement(name="DisplayDepth")
/*      */   protected LengthDimension displayDepth;
/*      */ 
/*      */   @XmlElement(name="DisplayDiameter")
/*      */   protected LengthDimension displayDiameter;
/*      */ 
/*      */   @XmlElement(name="DisplayHeight")
/*      */   protected LengthDimension displayHeight;
/*      */ 
/*      */   @XmlElement(name="DisplayLength")
/*      */   protected LengthDimension displayLength;
/*      */ 
/*      */   @XmlElement(name="DisplayWeight")
/*      */   protected WeightDimension displayWeight;
/*      */ 
/*      */   @XmlElement(name="DisplayWidth")
/*      */   protected LengthDimension displayWidth;
/*      */ 
/*      */   @XmlElement(name="EnergyEfficiencyRating")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String energyEfficiencyRating;
/*      */ 
/*      */   @XmlElement(name="FanBladeColor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String fanBladeColor;
/*      */ 
/*      */   @XmlElement(name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finishType;
/*      */ 
/*      */   @XmlElement(name="IncandescentEquivalentWattage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger incandescentEquivalentWattage;
/*      */ 
/*      */   @XmlElement(name="IncludedComponent")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> includedComponent;
/*      */ 
/*      */   @XmlElement(name="InternationalProtectionRating")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String internationalProtectionRating;
/*      */ 
/*      */   @XmlElement(name="ItemDiameter")
/*      */   protected LengthDimension itemDiameter;
/*      */ 
/*      */   @XmlElement(name="LampStartupTime")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lampStartupTime;
/*      */ 
/*      */   @XmlElement(name="LampWarmupTime")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lampWarmupTime;
/*      */ 
/*      */   @XmlElement(name="LightingMethod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lightingMethod;
/*      */ 
/*      */   @XmlElement(name="LightOutputLuminance")
/*      */   protected LuminanceDimension lightOutputLuminance;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryEnergyContent")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger lithiumBatteryEnergyContent;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryPackaging")
/*      */   protected String lithiumBatteryPackaging;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryVoltage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger lithiumBatteryVoltage;
/*      */ 
/*      */   @XmlElement(name="LithiumBatteryWeight")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger lithiumBatteryWeight;
/*      */ 
/*      */   @XmlElement(name="LumenMaintenanceFactor")
/*      */   protected BigDecimal lumenMaintenanceFactor;
/*      */ 
/*      */   @XmlElement(name="LuminousIntensity")
/*      */   protected LuminiousIntensityDimension luminousIntensity;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
/*      */ 
/*      */   @XmlElement(name="MaximumCurrent")
/*      */   protected AmperageDimension maximumCurrent;
/*      */ 
/*      */   @XmlElement(name="MaximumSupportedWattage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger maximumSupportedWattage;
/*      */ 
/*      */   @XmlElement(name="MercuryContent")
/*      */   protected WeightDimension mercuryContent;
/*      */ 
/*      */   @XmlElement(name="NumberOfBlades")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfBlades;
/*      */ 
/*      */   @XmlElement(name="NumberOfBulbSockets")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfBulbSockets;
/*      */ 
/*      */   @XmlElement(name="NumberOfLights")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLights;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumIonCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumIonCells;
/*      */ 
/*      */   @XmlElement(name="NumberOfLithiumMetalCells")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLithiumMetalCells;
/*      */ 
/*      */   @XmlElement(name="PlugType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String plugType;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="PPUCount")
/*      */   protected BigDecimal ppuCount;
/*      */ 
/*      */   @XmlElement(name="PPUCountType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String ppuCountType;
/*      */ 
/*      */   @XmlElement(name="ShadeColor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shadeColor;
/*      */ 
/*      */   @XmlElement(name="ShadeDiameter")
/*      */   protected LengthDimension shadeDiameter;
/*      */ 
/*      */   @XmlElement(name="ShadeMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shadeMaterial;
/*      */ 
/*      */   @XmlElement(name="SpecialFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> specialFeatures;
/*      */ 
/*      */   @XmlElement(name="SpecificUses")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> specificUses;
/*      */ 
/*      */   @XmlElement(name="StyleName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String styleName;
/*      */ 
/*      */   @XmlElement(name="SwitchStyle")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String switchStyle;
/*      */ 
/*      */   @XmlElement(name="Voltage")
/*      */   protected VoltageIntegerDimensionOptionalUnit voltage;
/*      */ 
/*      */   @XmlElement(name="Volume")
/*      */   protected VolumeDimension volume;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected BigDecimal wattage;
/*      */ 
/*      */   @XmlElement(name="WeightedAnnualEnergyConsumption")
/*      */   protected EnergyConsumptionDimension weightedAnnualEnergyConsumption;
/*      */ 
/*      */   @XmlElement(name="FixtureType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String fixtureType;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  400 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  412 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getAirFlowCapacity()
/*      */   {
/*  424 */     return this.airFlowCapacity;
/*      */   }
/*      */ 
/*      */   public void setAirFlowCapacity(BigInteger value)
/*      */   {
/*  436 */     this.airFlowCapacity = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseDiameter()
/*      */   {
/*  448 */     return this.baseDiameter;
/*      */   }
/*      */ 
/*      */   public void setBaseDiameter(LengthDimension value)
/*      */   {
/*  460 */     this.baseDiameter = value;
/*      */   }
/*      */ 
/*      */   public Battery getBattery()
/*      */   {
/*  472 */     return this.battery;
/*      */   }
/*      */ 
/*      */   public void setBattery(Battery value)
/*      */   {
/*  484 */     this.battery = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBulbDiameter()
/*      */   {
/*  496 */     return this.bulbDiameter;
/*      */   }
/*      */ 
/*      */   public void setBulbDiameter(LengthDimension value)
/*      */   {
/*  508 */     this.bulbDiameter = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBulbLength()
/*      */   {
/*  520 */     return this.bulbLength;
/*      */   }
/*      */ 
/*      */   public void setBulbLength(LengthDimension value)
/*      */   {
/*  532 */     this.bulbLength = value;
/*      */   }
/*      */ 
/*      */   public TimeDimension getBulbLifeSpan()
/*      */   {
/*  544 */     return this.bulbLifeSpan;
/*      */   }
/*      */ 
/*      */   public void setBulbLifeSpan(TimeDimension value)
/*      */   {
/*  556 */     this.bulbLifeSpan = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBulbPowerFactor()
/*      */   {
/*  568 */     return this.bulbPowerFactor;
/*      */   }
/*      */ 
/*      */   public void setBulbPowerFactor(BigDecimal value)
/*      */   {
/*  580 */     this.bulbPowerFactor = value;
/*      */   }
/*      */ 
/*      */   public List<String> getBulbSpecialFeatures()
/*      */   {
/*  606 */     if (this.bulbSpecialFeatures == null) {
/*  607 */       this.bulbSpecialFeatures = new ArrayList();
/*      */     }
/*  609 */     return this.bulbSpecialFeatures;
/*      */   }
/*      */ 
/*      */   public BigInteger getBulbSwitchingCycles()
/*      */   {
/*  621 */     return this.bulbSwitchingCycles;
/*      */   }
/*      */ 
/*      */   public void setBulbSwitchingCycles(BigInteger value)
/*      */   {
/*  633 */     this.bulbSwitchingCycles = value;
/*      */   }
/*      */ 
/*      */   public String getBulbType()
/*      */   {
/*  645 */     return this.bulbType;
/*      */   }
/*      */ 
/*      */   public void setBulbType(String value)
/*      */   {
/*  657 */     this.bulbType = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBulbWattage()
/*      */   {
/*  669 */     return this.bulbWattage;
/*      */   }
/*      */ 
/*      */   public void setBulbWattage(BigDecimal value)
/*      */   {
/*  681 */     this.bulbWattage = value;
/*      */   }
/*      */ 
/*      */   public String getCapType()
/*      */   {
/*  693 */     return this.capType;
/*      */   }
/*      */ 
/*      */   public void setCapType(String value)
/*      */   {
/*  705 */     this.capType = value;
/*      */   }
/*      */ 
/*      */   public List<String> getCertification()
/*      */   {
/*  731 */     if (this.certification == null) {
/*  732 */       this.certification = new ArrayList();
/*      */     }
/*  734 */     return this.certification;
/*      */   }
/*      */ 
/*      */   public String getCollection()
/*      */   {
/*  746 */     return this.collection;
/*      */   }
/*      */ 
/*      */   public void setCollection(String value)
/*      */   {
/*  758 */     this.collection = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/*  770 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/*  782 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  794 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  806 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getColorRenderingIndex()
/*      */   {
/*  818 */     return this.colorRenderingIndex;
/*      */   }
/*      */ 
/*      */   public void setColorRenderingIndex(BigInteger value)
/*      */   {
/*  830 */     this.colorRenderingIndex = value;
/*      */   }
/*      */ 
/*      */   public TemperatureRatingDimension getColorTemperature()
/*      */   {
/*  842 */     return this.colorTemperature;
/*      */   }
/*      */ 
/*      */   public void setColorTemperature(TemperatureRatingDimension value)
/*      */   {
/*  854 */     this.colorTemperature = value;
/*      */   }
/*      */ 
/*      */   public String getCountryOfOrigin()
/*      */   {
/*  866 */     return this.countryOfOrigin;
/*      */   }
/*      */ 
/*      */   public void setCountryOfOrigin(String value)
/*      */   {
/*  878 */     this.countryOfOrigin = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayDepth()
/*      */   {
/*  890 */     return this.displayDepth;
/*      */   }
/*      */ 
/*      */   public void setDisplayDepth(LengthDimension value)
/*      */   {
/*  902 */     this.displayDepth = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayDiameter()
/*      */   {
/*  914 */     return this.displayDiameter;
/*      */   }
/*      */ 
/*      */   public void setDisplayDiameter(LengthDimension value)
/*      */   {
/*  926 */     this.displayDiameter = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayHeight()
/*      */   {
/*  938 */     return this.displayHeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayHeight(LengthDimension value)
/*      */   {
/*  950 */     this.displayHeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/*  962 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/*  974 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/*  986 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/*  998 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayWidth()
/*      */   {
/* 1010 */     return this.displayWidth;
/*      */   }
/*      */ 
/*      */   public void setDisplayWidth(LengthDimension value)
/*      */   {
/* 1022 */     this.displayWidth = value;
/*      */   }
/*      */ 
/*      */   public String getEnergyEfficiencyRating()
/*      */   {
/* 1034 */     return this.energyEfficiencyRating;
/*      */   }
/*      */ 
/*      */   public void setEnergyEfficiencyRating(String value)
/*      */   {
/* 1046 */     this.energyEfficiencyRating = value;
/*      */   }
/*      */ 
/*      */   public String getFanBladeColor()
/*      */   {
/* 1058 */     return this.fanBladeColor;
/*      */   }
/*      */ 
/*      */   public void setFanBladeColor(String value)
/*      */   {
/* 1070 */     this.fanBladeColor = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/* 1082 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/* 1094 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getIncandescentEquivalentWattage()
/*      */   {
/* 1106 */     return this.incandescentEquivalentWattage;
/*      */   }
/*      */ 
/*      */   public void setIncandescentEquivalentWattage(BigInteger value)
/*      */   {
/* 1118 */     this.incandescentEquivalentWattage = value;
/*      */   }
/*      */ 
/*      */   public List<String> getIncludedComponent()
/*      */   {
/* 1144 */     if (this.includedComponent == null) {
/* 1145 */       this.includedComponent = new ArrayList();
/*      */     }
/* 1147 */     return this.includedComponent;
/*      */   }
/*      */ 
/*      */   public String getInternationalProtectionRating()
/*      */   {
/* 1159 */     return this.internationalProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setInternationalProtectionRating(String value)
/*      */   {
/* 1171 */     this.internationalProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getItemDiameter()
/*      */   {
/* 1183 */     return this.itemDiameter;
/*      */   }
/*      */ 
/*      */   public void setItemDiameter(LengthDimension value)
/*      */   {
/* 1195 */     this.itemDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getLampStartupTime()
/*      */   {
/* 1207 */     return this.lampStartupTime;
/*      */   }
/*      */ 
/*      */   public void setLampStartupTime(String value)
/*      */   {
/* 1219 */     this.lampStartupTime = value;
/*      */   }
/*      */ 
/*      */   public String getLampWarmupTime()
/*      */   {
/* 1231 */     return this.lampWarmupTime;
/*      */   }
/*      */ 
/*      */   public void setLampWarmupTime(String value)
/*      */   {
/* 1243 */     this.lampWarmupTime = value;
/*      */   }
/*      */ 
/*      */   public String getLightingMethod()
/*      */   {
/* 1255 */     return this.lightingMethod;
/*      */   }
/*      */ 
/*      */   public void setLightingMethod(String value)
/*      */   {
/* 1267 */     this.lightingMethod = value;
/*      */   }
/*      */ 
/*      */   public LuminanceDimension getLightOutputLuminance()
/*      */   {
/* 1279 */     return this.lightOutputLuminance;
/*      */   }
/*      */ 
/*      */   public void setLightOutputLuminance(LuminanceDimension value)
/*      */   {
/* 1291 */     this.lightOutputLuminance = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLithiumBatteryEnergyContent()
/*      */   {
/* 1303 */     return this.lithiumBatteryEnergyContent;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryEnergyContent(BigInteger value)
/*      */   {
/* 1315 */     this.lithiumBatteryEnergyContent = value;
/*      */   }
/*      */ 
/*      */   public String getLithiumBatteryPackaging()
/*      */   {
/* 1327 */     return this.lithiumBatteryPackaging;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryPackaging(String value)
/*      */   {
/* 1339 */     this.lithiumBatteryPackaging = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLithiumBatteryVoltage()
/*      */   {
/* 1351 */     return this.lithiumBatteryVoltage;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryVoltage(BigInteger value)
/*      */   {
/* 1363 */     this.lithiumBatteryVoltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLithiumBatteryWeight()
/*      */   {
/* 1375 */     return this.lithiumBatteryWeight;
/*      */   }
/*      */ 
/*      */   public void setLithiumBatteryWeight(BigInteger value)
/*      */   {
/* 1387 */     this.lithiumBatteryWeight = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLumenMaintenanceFactor()
/*      */   {
/* 1399 */     return this.lumenMaintenanceFactor;
/*      */   }
/*      */ 
/*      */   public void setLumenMaintenanceFactor(BigDecimal value)
/*      */   {
/* 1411 */     this.lumenMaintenanceFactor = value;
/*      */   }
/*      */ 
/*      */   public LuminiousIntensityDimension getLuminousIntensity()
/*      */   {
/* 1423 */     return this.luminousIntensity;
/*      */   }
/*      */ 
/*      */   public void setLuminousIntensity(LuminiousIntensityDimension value)
/*      */   {
/* 1435 */     this.luminousIntensity = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/* 1447 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/* 1459 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public AmperageDimension getMaximumCurrent()
/*      */   {
/* 1471 */     return this.maximumCurrent;
/*      */   }
/*      */ 
/*      */   public void setMaximumCurrent(AmperageDimension value)
/*      */   {
/* 1483 */     this.maximumCurrent = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getMaximumSupportedWattage()
/*      */   {
/* 1495 */     return this.maximumSupportedWattage;
/*      */   }
/*      */ 
/*      */   public void setMaximumSupportedWattage(BigInteger value)
/*      */   {
/* 1507 */     this.maximumSupportedWattage = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMercuryContent()
/*      */   {
/* 1519 */     return this.mercuryContent;
/*      */   }
/*      */ 
/*      */   public void setMercuryContent(WeightDimension value)
/*      */   {
/* 1531 */     this.mercuryContent = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBlades()
/*      */   {
/* 1543 */     return this.numberOfBlades;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBlades(BigInteger value)
/*      */   {
/* 1555 */     this.numberOfBlades = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBulbSockets()
/*      */   {
/* 1567 */     return this.numberOfBulbSockets;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBulbSockets(BigInteger value)
/*      */   {
/* 1579 */     this.numberOfBulbSockets = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLights()
/*      */   {
/* 1591 */     return this.numberOfLights;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLights(BigInteger value)
/*      */   {
/* 1603 */     this.numberOfLights = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumIonCells()
/*      */   {
/* 1615 */     return this.numberOfLithiumIonCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumIonCells(BigInteger value)
/*      */   {
/* 1627 */     this.numberOfLithiumIonCells = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLithiumMetalCells()
/*      */   {
/* 1639 */     return this.numberOfLithiumMetalCells;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*      */   {
/* 1651 */     this.numberOfLithiumMetalCells = value;
/*      */   }
/*      */ 
/*      */   public String getPlugType()
/*      */   {
/* 1663 */     return this.plugType;
/*      */   }
/*      */ 
/*      */   public void setPlugType(String value)
/*      */   {
/* 1675 */     this.plugType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1687 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1699 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getPPUCount()
/*      */   {
/* 1711 */     return this.ppuCount;
/*      */   }
/*      */ 
/*      */   public void setPPUCount(BigDecimal value)
/*      */   {
/* 1723 */     this.ppuCount = value;
/*      */   }
/*      */ 
/*      */   public String getPPUCountType()
/*      */   {
/* 1735 */     return this.ppuCountType;
/*      */   }
/*      */ 
/*      */   public void setPPUCountType(String value)
/*      */   {
/* 1747 */     this.ppuCountType = value;
/*      */   }
/*      */ 
/*      */   public String getShadeColor()
/*      */   {
/* 1759 */     return this.shadeColor;
/*      */   }
/*      */ 
/*      */   public void setShadeColor(String value)
/*      */   {
/* 1771 */     this.shadeColor = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getShadeDiameter()
/*      */   {
/* 1783 */     return this.shadeDiameter;
/*      */   }
/*      */ 
/*      */   public void setShadeDiameter(LengthDimension value)
/*      */   {
/* 1795 */     this.shadeDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getShadeMaterial()
/*      */   {
/* 1807 */     return this.shadeMaterial;
/*      */   }
/*      */ 
/*      */   public void setShadeMaterial(String value)
/*      */   {
/* 1819 */     this.shadeMaterial = value;
/*      */   }
/*      */ 
/*      */   public List<String> getSpecialFeatures()
/*      */   {
/* 1845 */     if (this.specialFeatures == null) {
/* 1846 */       this.specialFeatures = new ArrayList();
/*      */     }
/* 1848 */     return this.specialFeatures;
/*      */   }
/*      */ 
/*      */   public List<String> getSpecificUses()
/*      */   {
/* 1874 */     if (this.specificUses == null) {
/* 1875 */       this.specificUses = new ArrayList();
/*      */     }
/* 1877 */     return this.specificUses;
/*      */   }
/*      */ 
/*      */   public String getStyleName()
/*      */   {
/* 1889 */     return this.styleName;
/*      */   }
/*      */ 
/*      */   public void setStyleName(String value)
/*      */   {
/* 1901 */     this.styleName = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchStyle()
/*      */   {
/* 1913 */     return this.switchStyle;
/*      */   }
/*      */ 
/*      */   public void setSwitchStyle(String value)
/*      */   {
/* 1925 */     this.switchStyle = value;
/*      */   }
/*      */ 
/*      */   public VoltageIntegerDimensionOptionalUnit getVoltage()
/*      */   {
/* 1937 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(VoltageIntegerDimensionOptionalUnit value)
/*      */   {
/* 1949 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getVolume()
/*      */   {
/* 1961 */     return this.volume;
/*      */   }
/*      */ 
/*      */   public void setVolume(VolumeDimension value)
/*      */   {
/* 1973 */     this.volume = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getWattage()
/*      */   {
/* 1985 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(BigDecimal value)
/*      */   {
/* 1997 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public EnergyConsumptionDimension getWeightedAnnualEnergyConsumption()
/*      */   {
/* 2009 */     return this.weightedAnnualEnergyConsumption;
/*      */   }
/*      */ 
/*      */   public void setWeightedAnnualEnergyConsumption(EnergyConsumptionDimension value)
/*      */   {
/* 2021 */     this.weightedAnnualEnergyConsumption = value;
/*      */   }
/*      */ 
/*      */   public String getFixtureType()
/*      */   {
/* 2033 */     return this.fixtureType;
/*      */   }
/*      */ 
/*      */   public void setFixtureType(String value)
/*      */   {
/* 2045 */     this.fixtureType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 2057 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 2069 */     this.efficiency = value;
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
/* 2127 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 2139 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 2151 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 2163 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.LightsAndFixtures
 * JD-Core Version:    0.6.2
 */