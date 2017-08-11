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
/*      */ @XmlType(name="", propOrder={"variationData", "battery", "beamAngle", "bulbDiameter", "bulbLength", "bulbLifeSpan", "bulbPowerFactor", "bulbSpecialFeatures", "bulbSwitchingCycles", "bulbType", "bulbWattage", "capType", "certification", "color", "colorMap", "colorRenderingIndex", "colorTemperature", "countryOfOrigin", "displayDepth", "displayDiameter", "displayHeight", "displayLength", "displayWeight", "displayWidth", "energyEfficiencyRating", "incandescentEquivalentWattage", "itemShape", "lampStartupTime", "lampWarmupTime", "lightOutputLuminance", "lumenMaintenanceFactor", "luminousIntensity", "mercuryContent", "ppuCount", "ppuCountType", "specificUses", "voltage", "volume", "wattage", "weightedAnnualEnergyConsumption", "styleName", "specialFeatures", "includedComponent", "lightingMethod", "shadeDiameter", "shadeMaterial", "material", "finishType", "internationalProtectionRating", "numberOfLightSources", "numberOfBlades", "bladeColor", "maximumCompatibleLightSourceWattage", "powerFactor", "mechanicalLifeExpectancy", "circuitType", "circuitBreakerType", "mountingType", "maximumCurrent", "strands", "strandDiameter", "lightSourceDiameter", "efficiency"})
/*      */ @XmlRootElement(name="LightBulbs")
/*      */ public class LightBulbs
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="Battery")
/*      */   protected Battery battery;
/*      */ 
/*      */   @XmlElement(name="BeamAngle")
/*      */   protected DegreeDimension beamAngle;
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
/*      */   @XmlElement(name="IncandescentEquivalentWattage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger incandescentEquivalentWattage;
/*      */ 
/*      */   @XmlElement(name="ItemShape")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String itemShape;
/*      */ 
/*      */   @XmlElement(name="LampStartupTime")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lampStartupTime;
/*      */ 
/*      */   @XmlElement(name="LampWarmupTime")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lampWarmupTime;
/*      */ 
/*      */   @XmlElement(name="LightOutputLuminance")
/*      */   protected LuminanceDimension lightOutputLuminance;
/*      */ 
/*      */   @XmlElement(name="LumenMaintenanceFactor")
/*      */   protected BigDecimal lumenMaintenanceFactor;
/*      */ 
/*      */   @XmlElement(name="LuminousIntensity")
/*      */   protected LuminiousIntensityDimension luminousIntensity;
/*      */ 
/*      */   @XmlElement(name="MercuryContent")
/*      */   protected WeightDimension mercuryContent;
/*      */ 
/*      */   @XmlElement(name="PPUCount")
/*      */   protected BigDecimal ppuCount;
/*      */ 
/*      */   @XmlElement(name="PPUCountType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String ppuCountType;
/*      */ 
/*      */   @XmlElement(name="SpecificUses")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> specificUses;
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
/*      */   @XmlElement(name="StyleName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String styleName;
/*      */ 
/*      */   @XmlElement(name="SpecialFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> specialFeatures;
/*      */ 
/*      */   @XmlElement(name="IncludedComponent")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> includedComponent;
/*      */ 
/*      */   @XmlElement(name="LightingMethod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lightingMethod;
/*      */ 
/*      */   @XmlElement(name="ShadeDiameter")
/*      */   protected LengthDimension shadeDiameter;
/*      */ 
/*      */   @XmlElement(name="ShadeMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shadeMaterial;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
/*      */ 
/*      */   @XmlElement(name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finishType;
/*      */ 
/*      */   @XmlElement(name="InternationalProtectionRating")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String internationalProtectionRating;
/*      */ 
/*      */   @XmlElement(name="NumberOfLightSources")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfLightSources;
/*      */ 
/*      */   @XmlElement(name="NumberOfBlades")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfBlades;
/*      */ 
/*      */   @XmlElement(name="BladeColor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bladeColor;
/*      */ 
/*      */   @XmlElement(name="MaximumCompatibleLightSourceWattage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger maximumCompatibleLightSourceWattage;
/*      */ 
/*      */   @XmlElement(name="PowerFactor")
/*      */   protected BigDecimal powerFactor;
/*      */ 
/*      */   @XmlElement(name="MechanicalLifeExpectancy")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger mechanicalLifeExpectancy;
/*      */ 
/*      */   @XmlElement(name="CircuitType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String circuitType;
/*      */ 
/*      */   @XmlElement(name="CircuitBreakerType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String circuitBreakerType;
/*      */ 
/*      */   @XmlElement(name="MountingType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountingType;
/*      */ 
/*      */   @XmlElement(name="MaximumCurrent")
/*      */   protected AmperageDimension maximumCurrent;
/*      */ 
/*      */   @XmlElement(name="Strands")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String strands;
/*      */ 
/*      */   @XmlElement(name="StrandDiameter")
/*      */   protected LengthDimension strandDiameter;
/*      */ 
/*      */   @XmlElement(name="LightSourceDiameter")
/*      */   protected LengthDimension lightSourceDiameter;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  361 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  373 */     this.variationData = value;
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
/*      */   public DegreeDimension getBeamAngle()
/*      */   {
/*  409 */     return this.beamAngle;
/*      */   }
/*      */ 
/*      */   public void setBeamAngle(DegreeDimension value)
/*      */   {
/*  421 */     this.beamAngle = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBulbDiameter()
/*      */   {
/*  433 */     return this.bulbDiameter;
/*      */   }
/*      */ 
/*      */   public void setBulbDiameter(LengthDimension value)
/*      */   {
/*  445 */     this.bulbDiameter = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBulbLength()
/*      */   {
/*  457 */     return this.bulbLength;
/*      */   }
/*      */ 
/*      */   public void setBulbLength(LengthDimension value)
/*      */   {
/*  469 */     this.bulbLength = value;
/*      */   }
/*      */ 
/*      */   public TimeDimension getBulbLifeSpan()
/*      */   {
/*  481 */     return this.bulbLifeSpan;
/*      */   }
/*      */ 
/*      */   public void setBulbLifeSpan(TimeDimension value)
/*      */   {
/*  493 */     this.bulbLifeSpan = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBulbPowerFactor()
/*      */   {
/*  505 */     return this.bulbPowerFactor;
/*      */   }
/*      */ 
/*      */   public void setBulbPowerFactor(BigDecimal value)
/*      */   {
/*  517 */     this.bulbPowerFactor = value;
/*      */   }
/*      */ 
/*      */   public List<String> getBulbSpecialFeatures()
/*      */   {
/*  543 */     if (this.bulbSpecialFeatures == null) {
/*  544 */       this.bulbSpecialFeatures = new ArrayList();
/*      */     }
/*  546 */     return this.bulbSpecialFeatures;
/*      */   }
/*      */ 
/*      */   public BigInteger getBulbSwitchingCycles()
/*      */   {
/*  558 */     return this.bulbSwitchingCycles;
/*      */   }
/*      */ 
/*      */   public void setBulbSwitchingCycles(BigInteger value)
/*      */   {
/*  570 */     this.bulbSwitchingCycles = value;
/*      */   }
/*      */ 
/*      */   public String getBulbType()
/*      */   {
/*  582 */     return this.bulbType;
/*      */   }
/*      */ 
/*      */   public void setBulbType(String value)
/*      */   {
/*  594 */     this.bulbType = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getBulbWattage()
/*      */   {
/*  606 */     return this.bulbWattage;
/*      */   }
/*      */ 
/*      */   public void setBulbWattage(BigDecimal value)
/*      */   {
/*  618 */     this.bulbWattage = value;
/*      */   }
/*      */ 
/*      */   public String getCapType()
/*      */   {
/*  630 */     return this.capType;
/*      */   }
/*      */ 
/*      */   public void setCapType(String value)
/*      */   {
/*  642 */     this.capType = value;
/*      */   }
/*      */ 
/*      */   public List<String> getCertification()
/*      */   {
/*  668 */     if (this.certification == null) {
/*  669 */       this.certification = new ArrayList();
/*      */     }
/*  671 */     return this.certification;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/*  683 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/*  695 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  707 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  719 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getColorRenderingIndex()
/*      */   {
/*  731 */     return this.colorRenderingIndex;
/*      */   }
/*      */ 
/*      */   public void setColorRenderingIndex(BigInteger value)
/*      */   {
/*  743 */     this.colorRenderingIndex = value;
/*      */   }
/*      */ 
/*      */   public TemperatureRatingDimension getColorTemperature()
/*      */   {
/*  755 */     return this.colorTemperature;
/*      */   }
/*      */ 
/*      */   public void setColorTemperature(TemperatureRatingDimension value)
/*      */   {
/*  767 */     this.colorTemperature = value;
/*      */   }
/*      */ 
/*      */   public String getCountryOfOrigin()
/*      */   {
/*  779 */     return this.countryOfOrigin;
/*      */   }
/*      */ 
/*      */   public void setCountryOfOrigin(String value)
/*      */   {
/*  791 */     this.countryOfOrigin = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayDepth()
/*      */   {
/*  803 */     return this.displayDepth;
/*      */   }
/*      */ 
/*      */   public void setDisplayDepth(LengthDimension value)
/*      */   {
/*  815 */     this.displayDepth = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayDiameter()
/*      */   {
/*  827 */     return this.displayDiameter;
/*      */   }
/*      */ 
/*      */   public void setDisplayDiameter(LengthDimension value)
/*      */   {
/*  839 */     this.displayDiameter = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayHeight()
/*      */   {
/*  851 */     return this.displayHeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayHeight(LengthDimension value)
/*      */   {
/*  863 */     this.displayHeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/*  875 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/*  887 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/*  899 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/*  911 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayWidth()
/*      */   {
/*  923 */     return this.displayWidth;
/*      */   }
/*      */ 
/*      */   public void setDisplayWidth(LengthDimension value)
/*      */   {
/*  935 */     this.displayWidth = value;
/*      */   }
/*      */ 
/*      */   public String getEnergyEfficiencyRating()
/*      */   {
/*  947 */     return this.energyEfficiencyRating;
/*      */   }
/*      */ 
/*      */   public void setEnergyEfficiencyRating(String value)
/*      */   {
/*  959 */     this.energyEfficiencyRating = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getIncandescentEquivalentWattage()
/*      */   {
/*  971 */     return this.incandescentEquivalentWattage;
/*      */   }
/*      */ 
/*      */   public void setIncandescentEquivalentWattage(BigInteger value)
/*      */   {
/*  983 */     this.incandescentEquivalentWattage = value;
/*      */   }
/*      */ 
/*      */   public String getItemShape()
/*      */   {
/*  995 */     return this.itemShape;
/*      */   }
/*      */ 
/*      */   public void setItemShape(String value)
/*      */   {
/* 1007 */     this.itemShape = value;
/*      */   }
/*      */ 
/*      */   public String getLampStartupTime()
/*      */   {
/* 1019 */     return this.lampStartupTime;
/*      */   }
/*      */ 
/*      */   public void setLampStartupTime(String value)
/*      */   {
/* 1031 */     this.lampStartupTime = value;
/*      */   }
/*      */ 
/*      */   public String getLampWarmupTime()
/*      */   {
/* 1043 */     return this.lampWarmupTime;
/*      */   }
/*      */ 
/*      */   public void setLampWarmupTime(String value)
/*      */   {
/* 1055 */     this.lampWarmupTime = value;
/*      */   }
/*      */ 
/*      */   public LuminanceDimension getLightOutputLuminance()
/*      */   {
/* 1067 */     return this.lightOutputLuminance;
/*      */   }
/*      */ 
/*      */   public void setLightOutputLuminance(LuminanceDimension value)
/*      */   {
/* 1079 */     this.lightOutputLuminance = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getLumenMaintenanceFactor()
/*      */   {
/* 1091 */     return this.lumenMaintenanceFactor;
/*      */   }
/*      */ 
/*      */   public void setLumenMaintenanceFactor(BigDecimal value)
/*      */   {
/* 1103 */     this.lumenMaintenanceFactor = value;
/*      */   }
/*      */ 
/*      */   public LuminiousIntensityDimension getLuminousIntensity()
/*      */   {
/* 1115 */     return this.luminousIntensity;
/*      */   }
/*      */ 
/*      */   public void setLuminousIntensity(LuminiousIntensityDimension value)
/*      */   {
/* 1127 */     this.luminousIntensity = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMercuryContent()
/*      */   {
/* 1139 */     return this.mercuryContent;
/*      */   }
/*      */ 
/*      */   public void setMercuryContent(WeightDimension value)
/*      */   {
/* 1151 */     this.mercuryContent = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getPPUCount()
/*      */   {
/* 1163 */     return this.ppuCount;
/*      */   }
/*      */ 
/*      */   public void setPPUCount(BigDecimal value)
/*      */   {
/* 1175 */     this.ppuCount = value;
/*      */   }
/*      */ 
/*      */   public String getPPUCountType()
/*      */   {
/* 1187 */     return this.ppuCountType;
/*      */   }
/*      */ 
/*      */   public void setPPUCountType(String value)
/*      */   {
/* 1199 */     this.ppuCountType = value;
/*      */   }
/*      */ 
/*      */   public List<String> getSpecificUses()
/*      */   {
/* 1225 */     if (this.specificUses == null) {
/* 1226 */       this.specificUses = new ArrayList();
/*      */     }
/* 1228 */     return this.specificUses;
/*      */   }
/*      */ 
/*      */   public VoltageIntegerDimensionOptionalUnit getVoltage()
/*      */   {
/* 1240 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(VoltageIntegerDimensionOptionalUnit value)
/*      */   {
/* 1252 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getVolume()
/*      */   {
/* 1264 */     return this.volume;
/*      */   }
/*      */ 
/*      */   public void setVolume(VolumeDimension value)
/*      */   {
/* 1276 */     this.volume = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getWattage()
/*      */   {
/* 1288 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(BigDecimal value)
/*      */   {
/* 1300 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public EnergyConsumptionDimension getWeightedAnnualEnergyConsumption()
/*      */   {
/* 1312 */     return this.weightedAnnualEnergyConsumption;
/*      */   }
/*      */ 
/*      */   public void setWeightedAnnualEnergyConsumption(EnergyConsumptionDimension value)
/*      */   {
/* 1324 */     this.weightedAnnualEnergyConsumption = value;
/*      */   }
/*      */ 
/*      */   public String getStyleName()
/*      */   {
/* 1336 */     return this.styleName;
/*      */   }
/*      */ 
/*      */   public void setStyleName(String value)
/*      */   {
/* 1348 */     this.styleName = value;
/*      */   }
/*      */ 
/*      */   public List<String> getSpecialFeatures()
/*      */   {
/* 1374 */     if (this.specialFeatures == null) {
/* 1375 */       this.specialFeatures = new ArrayList();
/*      */     }
/* 1377 */     return this.specialFeatures;
/*      */   }
/*      */ 
/*      */   public List<String> getIncludedComponent()
/*      */   {
/* 1403 */     if (this.includedComponent == null) {
/* 1404 */       this.includedComponent = new ArrayList();
/*      */     }
/* 1406 */     return this.includedComponent;
/*      */   }
/*      */ 
/*      */   public String getLightingMethod()
/*      */   {
/* 1418 */     return this.lightingMethod;
/*      */   }
/*      */ 
/*      */   public void setLightingMethod(String value)
/*      */   {
/* 1430 */     this.lightingMethod = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getShadeDiameter()
/*      */   {
/* 1442 */     return this.shadeDiameter;
/*      */   }
/*      */ 
/*      */   public void setShadeDiameter(LengthDimension value)
/*      */   {
/* 1454 */     this.shadeDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getShadeMaterial()
/*      */   {
/* 1466 */     return this.shadeMaterial;
/*      */   }
/*      */ 
/*      */   public void setShadeMaterial(String value)
/*      */   {
/* 1478 */     this.shadeMaterial = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/* 1490 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/* 1502 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/* 1514 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/* 1526 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public String getInternationalProtectionRating()
/*      */   {
/* 1538 */     return this.internationalProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setInternationalProtectionRating(String value)
/*      */   {
/* 1550 */     this.internationalProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLightSources()
/*      */   {
/* 1562 */     return this.numberOfLightSources;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLightSources(BigInteger value)
/*      */   {
/* 1574 */     this.numberOfLightSources = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBlades()
/*      */   {
/* 1586 */     return this.numberOfBlades;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBlades(BigInteger value)
/*      */   {
/* 1598 */     this.numberOfBlades = value;
/*      */   }
/*      */ 
/*      */   public String getBladeColor()
/*      */   {
/* 1610 */     return this.bladeColor;
/*      */   }
/*      */ 
/*      */   public void setBladeColor(String value)
/*      */   {
/* 1622 */     this.bladeColor = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getMaximumCompatibleLightSourceWattage()
/*      */   {
/* 1634 */     return this.maximumCompatibleLightSourceWattage;
/*      */   }
/*      */ 
/*      */   public void setMaximumCompatibleLightSourceWattage(BigInteger value)
/*      */   {
/* 1646 */     this.maximumCompatibleLightSourceWattage = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getPowerFactor()
/*      */   {
/* 1658 */     return this.powerFactor;
/*      */   }
/*      */ 
/*      */   public void setPowerFactor(BigDecimal value)
/*      */   {
/* 1670 */     this.powerFactor = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getMechanicalLifeExpectancy()
/*      */   {
/* 1682 */     return this.mechanicalLifeExpectancy;
/*      */   }
/*      */ 
/*      */   public void setMechanicalLifeExpectancy(BigInteger value)
/*      */   {
/* 1694 */     this.mechanicalLifeExpectancy = value;
/*      */   }
/*      */ 
/*      */   public String getCircuitType()
/*      */   {
/* 1706 */     return this.circuitType;
/*      */   }
/*      */ 
/*      */   public void setCircuitType(String value)
/*      */   {
/* 1718 */     this.circuitType = value;
/*      */   }
/*      */ 
/*      */   public String getCircuitBreakerType()
/*      */   {
/* 1730 */     return this.circuitBreakerType;
/*      */   }
/*      */ 
/*      */   public void setCircuitBreakerType(String value)
/*      */   {
/* 1742 */     this.circuitBreakerType = value;
/*      */   }
/*      */ 
/*      */   public String getMountingType()
/*      */   {
/* 1754 */     return this.mountingType;
/*      */   }
/*      */ 
/*      */   public void setMountingType(String value)
/*      */   {
/* 1766 */     this.mountingType = value;
/*      */   }
/*      */ 
/*      */   public AmperageDimension getMaximumCurrent()
/*      */   {
/* 1778 */     return this.maximumCurrent;
/*      */   }
/*      */ 
/*      */   public void setMaximumCurrent(AmperageDimension value)
/*      */   {
/* 1790 */     this.maximumCurrent = value;
/*      */   }
/*      */ 
/*      */   public String getStrands()
/*      */   {
/* 1802 */     return this.strands;
/*      */   }
/*      */ 
/*      */   public void setStrands(String value)
/*      */   {
/* 1814 */     this.strands = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getStrandDiameter()
/*      */   {
/* 1826 */     return this.strandDiameter;
/*      */   }
/*      */ 
/*      */   public void setStrandDiameter(LengthDimension value)
/*      */   {
/* 1838 */     this.strandDiameter = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getLightSourceDiameter()
/*      */   {
/* 1850 */     return this.lightSourceDiameter;
/*      */   }
/*      */ 
/*      */   public void setLightSourceDiameter(LengthDimension value)
/*      */   {
/* 1862 */     this.lightSourceDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1874 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1886 */     this.efficiency = value;
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
/* 1944 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 1956 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 1968 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 1980 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.LightBulbs
 * JD-Core Version:    0.6.2
 */