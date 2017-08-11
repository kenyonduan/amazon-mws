/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigDecimal;
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlSchemaType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="HomeImprovementTools", propOrder={"variationData", "accessoryConnectionType", "bladeEdge", "bladeLength", "brightness", "bulbType", "centerLength", "compatibleDevices", "coverage", "compatibleFastenerRange", "coolingMethod", "coolingWattage", "cornerRadius", "cuttingDiameter", "cutType", "cuttingWidth", "deviceType", "displayStyle", "energyConsumption", "energyEfficiencyRatioCooling", "environmentalDescription", "euEnergyEfficiencyClassHeating", "euEnergyLabelEfficiencyClass", "externalTestingCertification", "flushType", "headStyle", "heaterWattage", "insideDiameter", "numberOfBasins", "numberOfHoles", "outsideDiameter", "plugFormat", "plugProfile", "recycledContentPercentage", "roughIn", "spoutHeight", "spoutReach", "switchStyle", "switchType", "threadSize", "size", "color", "colorMap", "customerPackageType", "displayDiameter", "displayVolume", "displayWeight", "displayLength", "displayWidth", "displayHeight", "foldedKnifeSize", "handleMaterial", "powerSource", "horsepower", "laserBeamColor", "material", "maximumPower", "measurementAccuracy", "measurementSystem", "wattage", "voltage", "batteryCapacity", "gritRating", "numberOfItems", "minimumAge", "manufacturerWarrantyDescription", "performanceDescription", "speed", "sellerWarrantyDescription", "toolTipDescription", "torque", "uvProtection", "viewingArea", "minimumEfficiencyReportingValue", "baseDiameter", "beamAngle", "bladeColor", "circuitBreakerType", "efficiency", "internationalProtectionRating", "lightSourceOperatingLife", "lightingMethod", "maximumCompatibleLightSourceWattage", "numberOfBlades", "numberOfLightSources", "shadeDiameter", "shadeMaterialType", "shortProductDescription", "startUpTimeDescription", "strands", "tubingOutsideDiameter"})
/*      */ public class HomeImprovementTools
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="AccessoryConnectionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String accessoryConnectionType;
/*      */ 
/*      */   @XmlElement(name="BladeEdge")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bladeEdge;
/*      */ 
/*      */   @XmlElement(name="BladeLength")
/*      */   protected LengthDimension bladeLength;
/*      */ 
/*      */   @XmlElement(name="Brightness")
/*      */   protected LumensType brightness;
/*      */ 
/*      */   @XmlElement(name="BulbType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bulbType;
/*      */ 
/*      */   @XmlElement(name="CenterLength")
/*      */   protected LengthDimension centerLength;
/*      */ 
/*      */   @XmlElement(name="CompatibleDevices")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String compatibleDevices;
/*      */ 
/*      */   @XmlElement(name="Coverage")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String coverage;
/*      */ 
/*      */   @XmlElement(name="CompatibleFastenerRange")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String compatibleFastenerRange;
/*      */ 
/*      */   @XmlElement(name="CoolingMethod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String coolingMethod;
/*      */ 
/*      */   @XmlElement(name="CoolingWattage")
/*      */   protected WattageDimension coolingWattage;
/*      */ 
/*      */   @XmlElement(name="CornerRadius")
/*      */   protected LengthDimension cornerRadius;
/*      */ 
/*      */   @XmlElement(name="CuttingDiameter")
/*      */   protected LengthDimension cuttingDiameter;
/*      */ 
/*      */   @XmlElement(name="CutType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cutType;
/*      */ 
/*      */   @XmlElement(name="CuttingWidth")
/*      */   protected LengthDimension cuttingWidth;
/*      */ 
/*      */   @XmlElement(name="DeviceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String deviceType;
/*      */ 
/*      */   @XmlElement(name="DisplayStyle")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String displayStyle;
/*      */ 
/*      */   @XmlElement(name="EnergyConsumption")
/*      */   protected EnergyConsumptionDimension energyConsumption;
/*      */ 
/*      */   @XmlElement(name="EnergyEfficiencyRatioCooling")
/*      */   protected BigInteger energyEfficiencyRatioCooling;
/*      */ 
/*      */   @XmlElement(name="EnvironmentalDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String environmentalDescription;
/*      */ 
/*      */   @XmlElement(name="EuEnergyEfficiencyClassHeating")
/*      */   protected EuEnergyEfficiencyClassType euEnergyEfficiencyClassHeating;
/*      */ 
/*      */   @XmlElement(name="EuEnergyLabelEfficiencyClass")
/*      */   protected EuEnergyEfficiencyClassType euEnergyLabelEfficiencyClass;
/*      */ 
/*      */   @XmlElement(name="ExternalTestingCertification")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> externalTestingCertification;
/*      */ 
/*      */   @XmlElement(name="FlushType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String flushType;
/*      */ 
/*      */   @XmlElement(name="HeadStyle")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String headStyle;
/*      */ 
/*      */   @XmlElement(name="HeaterWattage")
/*      */   protected WattageDimension heaterWattage;
/*      */ 
/*      */   @XmlElement(name="InsideDiameter")
/*      */   protected LengthDimension insideDiameter;
/*      */ 
/*      */   @XmlElement(name="NumberOfBasins")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfBasins;
/*      */ 
/*      */   @XmlElement(name="NumberOfHoles")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfHoles;
/*      */ 
/*      */   @XmlElement(name="OutsideDiameter")
/*      */   protected LengthDimension outsideDiameter;
/*      */ 
/*      */   @XmlElement(name="PlugFormat")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String plugFormat;
/*      */ 
/*      */   @XmlElement(name="PlugProfile")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String plugProfile;
/*      */ 
/*      */   @XmlElement(name="RecycledContentPercentage")
/*      */   protected BigInteger recycledContentPercentage;
/*      */ 
/*      */   @XmlElement(name="RoughIn")
/*      */   protected LengthDimension roughIn;
/*      */ 
/*      */   @XmlElement(name="SpoutHeight")
/*      */   protected LengthDimension spoutHeight;
/*      */ 
/*      */   @XmlElement(name="SpoutReach")
/*      */   protected LengthDimension spoutReach;
/*      */ 
/*      */   @XmlElement(name="SwitchStyle")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String switchStyle;
/*      */ 
/*      */   @XmlElement(name="SwitchType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String switchType;
/*      */ 
/*      */   @XmlElement(name="ThreadSize")
/*      */   protected LengthDimensionOptionalUnit threadSize;
/*      */ 
/*      */   @XmlElement(name="Size")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String size;
/*      */ 
/*      */   @XmlElement(name="Color")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String color;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="CustomerPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String customerPackageType;
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
/*      */   @XmlElement(name="DisplayLength")
/*      */   protected LengthDimension displayLength;
/*      */ 
/*      */   @XmlElement(name="DisplayWidth")
/*      */   protected LengthDimension displayWidth;
/*      */ 
/*      */   @XmlElement(name="DisplayHeight")
/*      */   protected LengthDimension displayHeight;
/*      */ 
/*      */   @XmlElement(name="FoldedKnifeSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String foldedKnifeSize;
/*      */ 
/*      */   @XmlElement(name="HandleMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String handleMaterial;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="Horsepower")
/*      */   protected PowerDimension horsepower;
/*      */ 
/*      */   @XmlElement(name="LaserBeamColor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String laserBeamColor;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
/*      */ 
/*      */   @XmlElement(name="MaximumPower")
/*      */   protected MaximumPowerType maximumPower;
/*      */ 
/*      */   @XmlElement(name="MeasurementAccuracy")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String measurementAccuracy;
/*      */ 
/*      */   @XmlElement(name="MeasurementSystem")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String measurementSystem;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected WattageDimensionOptionalUnit wattage;
/*      */ 
/*      */   @XmlElement(name="Voltage")
/*      */   protected BigDecimal voltage;
/*      */ 
/*      */   @XmlElement(name="BatteryCapacity")
/*      */   protected BatteryPowerDimension batteryCapacity;
/*      */ 
/*      */   @XmlElement(name="GritRating")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger gritRating;
/*      */ 
/*      */   @XmlElement(name="NumberOfItems")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfItems;
/*      */ 
/*      */   @XmlElement(name="MinimumAge")
/*      */   protected AgeRecommendedDimension minimumAge;
/*      */ 
/*      */   @XmlElement(name="ManufacturerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String manufacturerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="PerformanceDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String performanceDescription;
/*      */ 
/*      */   @XmlElement(name="Speed")
/*      */   protected OptionalSpeedDimension speed;
/*      */ 
/*      */   @XmlElement(name="SellerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sellerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="ToolTipDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String toolTipDescription;
/*      */ 
/*      */   @XmlElement(name="Torque")
/*      */   protected TorqueType torque;
/*      */ 
/*      */   @XmlElement(name="UVProtection")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String uvProtection;
/*      */ 
/*      */   @XmlElement(name="ViewingArea")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String viewingArea;
/*      */ 
/*      */   @XmlElement(name="MinimumEfficiencyReportingValue")
/*      */   protected Integer minimumEfficiencyReportingValue;
/*      */ 
/*      */   @XmlElement(name="BaseDiameter")
/*      */   protected LengthDimension baseDiameter;
/*      */ 
/*      */   @XmlElement(name="BeamAngle")
/*      */   protected DegreeDimension beamAngle;
/*      */ 
/*      */   @XmlElement(name="BladeColor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bladeColor;
/*      */ 
/*      */   @XmlElement(name="CircuitBreakerType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String circuitBreakerType;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   @XmlElement(name="InternationalProtectionRating")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String internationalProtectionRating;
/*      */ 
/*      */   @XmlElement(name="LightSourceOperatingLife")
/*      */   protected TimeDimension lightSourceOperatingLife;
/*      */ 
/*      */   @XmlElement(name="LightingMethod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lightingMethod;
/*      */ 
/*      */   @XmlElement(name="MaximumCompatibleLightSourceWattage")
/*      */   protected WattageDimension maximumCompatibleLightSourceWattage;
/*      */ 
/*      */   @XmlElement(name="NumberOfBlades")
/*      */   protected BigInteger numberOfBlades;
/*      */ 
/*      */   @XmlElement(name="NumberOfLightSources")
/*      */   protected BigInteger numberOfLightSources;
/*      */ 
/*      */   @XmlElement(name="ShadeDiameter")
/*      */   protected LengthDimension shadeDiameter;
/*      */ 
/*      */   @XmlElement(name="ShadeMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shadeMaterialType;
/*      */ 
/*      */   @XmlElement(name="ShortProductDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shortProductDescription;
/*      */ 
/*      */   @XmlElement(name="StartUpTimeDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String startUpTimeDescription;
/*      */ 
/*      */   @XmlElement(name="Strands")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String strands;
/*      */ 
/*      */   @XmlElement(name="TubingOutsideDiameter")
/*      */   protected LengthDimension tubingOutsideDiameter;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  498 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  510 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getAccessoryConnectionType()
/*      */   {
/*  522 */     return this.accessoryConnectionType;
/*      */   }
/*      */ 
/*      */   public void setAccessoryConnectionType(String value)
/*      */   {
/*  534 */     this.accessoryConnectionType = value;
/*      */   }
/*      */ 
/*      */   public String getBladeEdge()
/*      */   {
/*  546 */     return this.bladeEdge;
/*      */   }
/*      */ 
/*      */   public void setBladeEdge(String value)
/*      */   {
/*  558 */     this.bladeEdge = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBladeLength()
/*      */   {
/*  570 */     return this.bladeLength;
/*      */   }
/*      */ 
/*      */   public void setBladeLength(LengthDimension value)
/*      */   {
/*  582 */     this.bladeLength = value;
/*      */   }
/*      */ 
/*      */   public LumensType getBrightness()
/*      */   {
/*  594 */     return this.brightness;
/*      */   }
/*      */ 
/*      */   public void setBrightness(LumensType value)
/*      */   {
/*  606 */     this.brightness = value;
/*      */   }
/*      */ 
/*      */   public String getBulbType()
/*      */   {
/*  618 */     return this.bulbType;
/*      */   }
/*      */ 
/*      */   public void setBulbType(String value)
/*      */   {
/*  630 */     this.bulbType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCenterLength()
/*      */   {
/*  642 */     return this.centerLength;
/*      */   }
/*      */ 
/*      */   public void setCenterLength(LengthDimension value)
/*      */   {
/*  654 */     this.centerLength = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleDevices()
/*      */   {
/*  666 */     return this.compatibleDevices;
/*      */   }
/*      */ 
/*      */   public void setCompatibleDevices(String value)
/*      */   {
/*  678 */     this.compatibleDevices = value;
/*      */   }
/*      */ 
/*      */   public String getCoverage()
/*      */   {
/*  690 */     return this.coverage;
/*      */   }
/*      */ 
/*      */   public void setCoverage(String value)
/*      */   {
/*  702 */     this.coverage = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleFastenerRange()
/*      */   {
/*  714 */     return this.compatibleFastenerRange;
/*      */   }
/*      */ 
/*      */   public void setCompatibleFastenerRange(String value)
/*      */   {
/*  726 */     this.compatibleFastenerRange = value;
/*      */   }
/*      */ 
/*      */   public String getCoolingMethod()
/*      */   {
/*  738 */     return this.coolingMethod;
/*      */   }
/*      */ 
/*      */   public void setCoolingMethod(String value)
/*      */   {
/*  750 */     this.coolingMethod = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getCoolingWattage()
/*      */   {
/*  762 */     return this.coolingWattage;
/*      */   }
/*      */ 
/*      */   public void setCoolingWattage(WattageDimension value)
/*      */   {
/*  774 */     this.coolingWattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCornerRadius()
/*      */   {
/*  786 */     return this.cornerRadius;
/*      */   }
/*      */ 
/*      */   public void setCornerRadius(LengthDimension value)
/*      */   {
/*  798 */     this.cornerRadius = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCuttingDiameter()
/*      */   {
/*  810 */     return this.cuttingDiameter;
/*      */   }
/*      */ 
/*      */   public void setCuttingDiameter(LengthDimension value)
/*      */   {
/*  822 */     this.cuttingDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getCutType()
/*      */   {
/*  834 */     return this.cutType;
/*      */   }
/*      */ 
/*      */   public void setCutType(String value)
/*      */   {
/*  846 */     this.cutType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCuttingWidth()
/*      */   {
/*  858 */     return this.cuttingWidth;
/*      */   }
/*      */ 
/*      */   public void setCuttingWidth(LengthDimension value)
/*      */   {
/*  870 */     this.cuttingWidth = value;
/*      */   }
/*      */ 
/*      */   public String getDeviceType()
/*      */   {
/*  882 */     return this.deviceType;
/*      */   }
/*      */ 
/*      */   public void setDeviceType(String value)
/*      */   {
/*  894 */     this.deviceType = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayStyle()
/*      */   {
/*  906 */     return this.displayStyle;
/*      */   }
/*      */ 
/*      */   public void setDisplayStyle(String value)
/*      */   {
/*  918 */     this.displayStyle = value;
/*      */   }
/*      */ 
/*      */   public EnergyConsumptionDimension getEnergyConsumption()
/*      */   {
/*  930 */     return this.energyConsumption;
/*      */   }
/*      */ 
/*      */   public void setEnergyConsumption(EnergyConsumptionDimension value)
/*      */   {
/*  942 */     this.energyConsumption = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getEnergyEfficiencyRatioCooling()
/*      */   {
/*  954 */     return this.energyEfficiencyRatioCooling;
/*      */   }
/*      */ 
/*      */   public void setEnergyEfficiencyRatioCooling(BigInteger value)
/*      */   {
/*  966 */     this.energyEfficiencyRatioCooling = value;
/*      */   }
/*      */ 
/*      */   public String getEnvironmentalDescription()
/*      */   {
/*  978 */     return this.environmentalDescription;
/*      */   }
/*      */ 
/*      */   public void setEnvironmentalDescription(String value)
/*      */   {
/*  990 */     this.environmentalDescription = value;
/*      */   }
/*      */ 
/*      */   public EuEnergyEfficiencyClassType getEuEnergyEfficiencyClassHeating()
/*      */   {
/* 1002 */     return this.euEnergyEfficiencyClassHeating;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyEfficiencyClassHeating(EuEnergyEfficiencyClassType value)
/*      */   {
/* 1014 */     this.euEnergyEfficiencyClassHeating = value;
/*      */   }
/*      */ 
/*      */   public EuEnergyEfficiencyClassType getEuEnergyLabelEfficiencyClass()
/*      */   {
/* 1026 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(EuEnergyEfficiencyClassType value)
/*      */   {
/* 1038 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public List<String> getExternalTestingCertification()
/*      */   {
/* 1064 */     if (this.externalTestingCertification == null) {
/* 1065 */       this.externalTestingCertification = new ArrayList();
/*      */     }
/* 1067 */     return this.externalTestingCertification;
/*      */   }
/*      */ 
/*      */   public String getFlushType()
/*      */   {
/* 1079 */     return this.flushType;
/*      */   }
/*      */ 
/*      */   public void setFlushType(String value)
/*      */   {
/* 1091 */     this.flushType = value;
/*      */   }
/*      */ 
/*      */   public String getHeadStyle()
/*      */   {
/* 1103 */     return this.headStyle;
/*      */   }
/*      */ 
/*      */   public void setHeadStyle(String value)
/*      */   {
/* 1115 */     this.headStyle = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getHeaterWattage()
/*      */   {
/* 1127 */     return this.heaterWattage;
/*      */   }
/*      */ 
/*      */   public void setHeaterWattage(WattageDimension value)
/*      */   {
/* 1139 */     this.heaterWattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getInsideDiameter()
/*      */   {
/* 1151 */     return this.insideDiameter;
/*      */   }
/*      */ 
/*      */   public void setInsideDiameter(LengthDimension value)
/*      */   {
/* 1163 */     this.insideDiameter = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBasins()
/*      */   {
/* 1175 */     return this.numberOfBasins;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBasins(BigInteger value)
/*      */   {
/* 1187 */     this.numberOfBasins = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHoles()
/*      */   {
/* 1199 */     return this.numberOfHoles;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHoles(BigInteger value)
/*      */   {
/* 1211 */     this.numberOfHoles = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getOutsideDiameter()
/*      */   {
/* 1223 */     return this.outsideDiameter;
/*      */   }
/*      */ 
/*      */   public void setOutsideDiameter(LengthDimension value)
/*      */   {
/* 1235 */     this.outsideDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getPlugFormat()
/*      */   {
/* 1247 */     return this.plugFormat;
/*      */   }
/*      */ 
/*      */   public void setPlugFormat(String value)
/*      */   {
/* 1259 */     this.plugFormat = value;
/*      */   }
/*      */ 
/*      */   public String getPlugProfile()
/*      */   {
/* 1271 */     return this.plugProfile;
/*      */   }
/*      */ 
/*      */   public void setPlugProfile(String value)
/*      */   {
/* 1283 */     this.plugProfile = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getRecycledContentPercentage()
/*      */   {
/* 1295 */     return this.recycledContentPercentage;
/*      */   }
/*      */ 
/*      */   public void setRecycledContentPercentage(BigInteger value)
/*      */   {
/* 1307 */     this.recycledContentPercentage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getRoughIn()
/*      */   {
/* 1319 */     return this.roughIn;
/*      */   }
/*      */ 
/*      */   public void setRoughIn(LengthDimension value)
/*      */   {
/* 1331 */     this.roughIn = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpoutHeight()
/*      */   {
/* 1343 */     return this.spoutHeight;
/*      */   }
/*      */ 
/*      */   public void setSpoutHeight(LengthDimension value)
/*      */   {
/* 1355 */     this.spoutHeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpoutReach()
/*      */   {
/* 1367 */     return this.spoutReach;
/*      */   }
/*      */ 
/*      */   public void setSpoutReach(LengthDimension value)
/*      */   {
/* 1379 */     this.spoutReach = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchStyle()
/*      */   {
/* 1391 */     return this.switchStyle;
/*      */   }
/*      */ 
/*      */   public void setSwitchStyle(String value)
/*      */   {
/* 1403 */     this.switchStyle = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchType()
/*      */   {
/* 1415 */     return this.switchType;
/*      */   }
/*      */ 
/*      */   public void setSwitchType(String value)
/*      */   {
/* 1427 */     this.switchType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimensionOptionalUnit getThreadSize()
/*      */   {
/* 1439 */     return this.threadSize;
/*      */   }
/*      */ 
/*      */   public void setThreadSize(LengthDimensionOptionalUnit value)
/*      */   {
/* 1451 */     this.threadSize = value;
/*      */   }
/*      */ 
/*      */   public String getSize()
/*      */   {
/* 1463 */     return this.size;
/*      */   }
/*      */ 
/*      */   public void setSize(String value)
/*      */   {
/* 1475 */     this.size = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/* 1487 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/* 1499 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/* 1511 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/* 1523 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getCustomerPackageType()
/*      */   {
/* 1535 */     return this.customerPackageType;
/*      */   }
/*      */ 
/*      */   public void setCustomerPackageType(String value)
/*      */   {
/* 1547 */     this.customerPackageType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayDiameter()
/*      */   {
/* 1559 */     return this.displayDiameter;
/*      */   }
/*      */ 
/*      */   public void setDisplayDiameter(LengthDimension value)
/*      */   {
/* 1571 */     this.displayDiameter = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getDisplayVolume()
/*      */   {
/* 1583 */     return this.displayVolume;
/*      */   }
/*      */ 
/*      */   public void setDisplayVolume(VolumeDimension value)
/*      */   {
/* 1595 */     this.displayVolume = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/* 1607 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/* 1619 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/* 1631 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/* 1643 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayWidth()
/*      */   {
/* 1655 */     return this.displayWidth;
/*      */   }
/*      */ 
/*      */   public void setDisplayWidth(LengthDimension value)
/*      */   {
/* 1667 */     this.displayWidth = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayHeight()
/*      */   {
/* 1679 */     return this.displayHeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayHeight(LengthDimension value)
/*      */   {
/* 1691 */     this.displayHeight = value;
/*      */   }
/*      */ 
/*      */   public String getFoldedKnifeSize()
/*      */   {
/* 1703 */     return this.foldedKnifeSize;
/*      */   }
/*      */ 
/*      */   public void setFoldedKnifeSize(String value)
/*      */   {
/* 1715 */     this.foldedKnifeSize = value;
/*      */   }
/*      */ 
/*      */   public String getHandleMaterial()
/*      */   {
/* 1727 */     return this.handleMaterial;
/*      */   }
/*      */ 
/*      */   public void setHandleMaterial(String value)
/*      */   {
/* 1739 */     this.handleMaterial = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1751 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1763 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getHorsepower()
/*      */   {
/* 1775 */     return this.horsepower;
/*      */   }
/*      */ 
/*      */   public void setHorsepower(PowerDimension value)
/*      */   {
/* 1787 */     this.horsepower = value;
/*      */   }
/*      */ 
/*      */   public String getLaserBeamColor()
/*      */   {
/* 1799 */     return this.laserBeamColor;
/*      */   }
/*      */ 
/*      */   public void setLaserBeamColor(String value)
/*      */   {
/* 1811 */     this.laserBeamColor = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/* 1823 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/* 1835 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public MaximumPowerType getMaximumPower()
/*      */   {
/* 1847 */     return this.maximumPower;
/*      */   }
/*      */ 
/*      */   public void setMaximumPower(MaximumPowerType value)
/*      */   {
/* 1859 */     this.maximumPower = value;
/*      */   }
/*      */ 
/*      */   public String getMeasurementAccuracy()
/*      */   {
/* 1871 */     return this.measurementAccuracy;
/*      */   }
/*      */ 
/*      */   public void setMeasurementAccuracy(String value)
/*      */   {
/* 1883 */     this.measurementAccuracy = value;
/*      */   }
/*      */ 
/*      */   public String getMeasurementSystem()
/*      */   {
/* 1895 */     return this.measurementSystem;
/*      */   }
/*      */ 
/*      */   public void setMeasurementSystem(String value)
/*      */   {
/* 1907 */     this.measurementSystem = value;
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit getWattage()
/*      */   {
/* 1919 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageDimensionOptionalUnit value)
/*      */   {
/* 1931 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getVoltage()
/*      */   {
/* 1943 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigDecimal value)
/*      */   {
/* 1955 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerDimension getBatteryCapacity()
/*      */   {
/* 1967 */     return this.batteryCapacity;
/*      */   }
/*      */ 
/*      */   public void setBatteryCapacity(BatteryPowerDimension value)
/*      */   {
/* 1979 */     this.batteryCapacity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getGritRating()
/*      */   {
/* 1991 */     return this.gritRating;
/*      */   }
/*      */ 
/*      */   public void setGritRating(BigInteger value)
/*      */   {
/* 2003 */     this.gritRating = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfItems()
/*      */   {
/* 2015 */     return this.numberOfItems;
/*      */   }
/*      */ 
/*      */   public void setNumberOfItems(BigInteger value)
/*      */   {
/* 2027 */     this.numberOfItems = value;
/*      */   }
/*      */ 
/*      */   public AgeRecommendedDimension getMinimumAge()
/*      */   {
/* 2039 */     return this.minimumAge;
/*      */   }
/*      */ 
/*      */   public void setMinimumAge(AgeRecommendedDimension value)
/*      */   {
/* 2051 */     this.minimumAge = value;
/*      */   }
/*      */ 
/*      */   public String getManufacturerWarrantyDescription()
/*      */   {
/* 2063 */     return this.manufacturerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setManufacturerWarrantyDescription(String value)
/*      */   {
/* 2075 */     this.manufacturerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getPerformanceDescription()
/*      */   {
/* 2087 */     return this.performanceDescription;
/*      */   }
/*      */ 
/*      */   public void setPerformanceDescription(String value)
/*      */   {
/* 2099 */     this.performanceDescription = value;
/*      */   }
/*      */ 
/*      */   public OptionalSpeedDimension getSpeed()
/*      */   {
/* 2111 */     return this.speed;
/*      */   }
/*      */ 
/*      */   public void setSpeed(OptionalSpeedDimension value)
/*      */   {
/* 2123 */     this.speed = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/* 2135 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/* 2147 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getToolTipDescription()
/*      */   {
/* 2159 */     return this.toolTipDescription;
/*      */   }
/*      */ 
/*      */   public void setToolTipDescription(String value)
/*      */   {
/* 2171 */     this.toolTipDescription = value;
/*      */   }
/*      */ 
/*      */   public TorqueType getTorque()
/*      */   {
/* 2183 */     return this.torque;
/*      */   }
/*      */ 
/*      */   public void setTorque(TorqueType value)
/*      */   {
/* 2195 */     this.torque = value;
/*      */   }
/*      */ 
/*      */   public String getUVProtection()
/*      */   {
/* 2207 */     return this.uvProtection;
/*      */   }
/*      */ 
/*      */   public void setUVProtection(String value)
/*      */   {
/* 2219 */     this.uvProtection = value;
/*      */   }
/*      */ 
/*      */   public String getViewingArea()
/*      */   {
/* 2231 */     return this.viewingArea;
/*      */   }
/*      */ 
/*      */   public void setViewingArea(String value)
/*      */   {
/* 2243 */     this.viewingArea = value;
/*      */   }
/*      */ 
/*      */   public Integer getMinimumEfficiencyReportingValue()
/*      */   {
/* 2255 */     return this.minimumEfficiencyReportingValue;
/*      */   }
/*      */ 
/*      */   public void setMinimumEfficiencyReportingValue(Integer value)
/*      */   {
/* 2267 */     this.minimumEfficiencyReportingValue = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseDiameter()
/*      */   {
/* 2279 */     return this.baseDiameter;
/*      */   }
/*      */ 
/*      */   public void setBaseDiameter(LengthDimension value)
/*      */   {
/* 2291 */     this.baseDiameter = value;
/*      */   }
/*      */ 
/*      */   public DegreeDimension getBeamAngle()
/*      */   {
/* 2303 */     return this.beamAngle;
/*      */   }
/*      */ 
/*      */   public void setBeamAngle(DegreeDimension value)
/*      */   {
/* 2315 */     this.beamAngle = value;
/*      */   }
/*      */ 
/*      */   public String getBladeColor()
/*      */   {
/* 2327 */     return this.bladeColor;
/*      */   }
/*      */ 
/*      */   public void setBladeColor(String value)
/*      */   {
/* 2339 */     this.bladeColor = value;
/*      */   }
/*      */ 
/*      */   public String getCircuitBreakerType()
/*      */   {
/* 2351 */     return this.circuitBreakerType;
/*      */   }
/*      */ 
/*      */   public void setCircuitBreakerType(String value)
/*      */   {
/* 2363 */     this.circuitBreakerType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 2375 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 2387 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   public String getInternationalProtectionRating()
/*      */   {
/* 2399 */     return this.internationalProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setInternationalProtectionRating(String value)
/*      */   {
/* 2411 */     this.internationalProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public TimeDimension getLightSourceOperatingLife()
/*      */   {
/* 2423 */     return this.lightSourceOperatingLife;
/*      */   }
/*      */ 
/*      */   public void setLightSourceOperatingLife(TimeDimension value)
/*      */   {
/* 2435 */     this.lightSourceOperatingLife = value;
/*      */   }
/*      */ 
/*      */   public String getLightingMethod()
/*      */   {
/* 2447 */     return this.lightingMethod;
/*      */   }
/*      */ 
/*      */   public void setLightingMethod(String value)
/*      */   {
/* 2459 */     this.lightingMethod = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getMaximumCompatibleLightSourceWattage()
/*      */   {
/* 2471 */     return this.maximumCompatibleLightSourceWattage;
/*      */   }
/*      */ 
/*      */   public void setMaximumCompatibleLightSourceWattage(WattageDimension value)
/*      */   {
/* 2483 */     this.maximumCompatibleLightSourceWattage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBlades()
/*      */   {
/* 2495 */     return this.numberOfBlades;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBlades(BigInteger value)
/*      */   {
/* 2507 */     this.numberOfBlades = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLightSources()
/*      */   {
/* 2519 */     return this.numberOfLightSources;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLightSources(BigInteger value)
/*      */   {
/* 2531 */     this.numberOfLightSources = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getShadeDiameter()
/*      */   {
/* 2543 */     return this.shadeDiameter;
/*      */   }
/*      */ 
/*      */   public void setShadeDiameter(LengthDimension value)
/*      */   {
/* 2555 */     this.shadeDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getShadeMaterialType()
/*      */   {
/* 2567 */     return this.shadeMaterialType;
/*      */   }
/*      */ 
/*      */   public void setShadeMaterialType(String value)
/*      */   {
/* 2579 */     this.shadeMaterialType = value;
/*      */   }
/*      */ 
/*      */   public String getShortProductDescription()
/*      */   {
/* 2591 */     return this.shortProductDescription;
/*      */   }
/*      */ 
/*      */   public void setShortProductDescription(String value)
/*      */   {
/* 2603 */     this.shortProductDescription = value;
/*      */   }
/*      */ 
/*      */   public String getStartUpTimeDescription()
/*      */   {
/* 2615 */     return this.startUpTimeDescription;
/*      */   }
/*      */ 
/*      */   public void setStartUpTimeDescription(String value)
/*      */   {
/* 2627 */     this.startUpTimeDescription = value;
/*      */   }
/*      */ 
/*      */   public String getStrands()
/*      */   {
/* 2639 */     return this.strands;
/*      */   }
/*      */ 
/*      */   public void setStrands(String value)
/*      */   {
/* 2651 */     this.strands = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getTubingOutsideDiameter()
/*      */   {
/* 2663 */     return this.tubingOutsideDiameter;
/*      */   }
/*      */ 
/*      */   public void setTubingOutsideDiameter(LengthDimension value)
/*      */   {
/* 2675 */     this.tubingOutsideDiameter = value;
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
/* 2745 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 2757 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 2769 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 2781 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HomeImprovementTools
 * JD-Core Version:    0.6.2
 */