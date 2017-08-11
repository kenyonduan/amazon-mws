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
/*      */ @XmlType(name="", propOrder={"variationData", "accessoryConnectionType", "batteryCapacity", "bladeEdge", "bladeLength", "compatibleDevices", "compatibleFastenerRange", "coolingMethod", "coolingWattage", "cornerRadius", "coverage", "cutType", "cuttingWidth", "deviceType", "displayStyle", "energyConsumption", "energyEfficiencyRatioCooling", "environmentalDescription", "euEnergyEfficiencyClassHeating", "euEnergyLabelEfficiencyClass", "externalTestingCertification", "flushType", "foldedKnifeSize", "gritRating", "insideDiameter", "laserBeamColor", "maximumPower", "measurementAccuracy", "measurementSystem", "minimumEfficiencyReportingValue", "numberOfItems", "performanceDescription", "toolTipDescription", "torque", "uvProtection", "viewingArea", "size", "centerLength", "brightness", "bulbType", "color", "colorMap", "handleMaterial", "headStyle", "heaterWattage", "material", "displayVolume", "displayWeight", "displayLength", "manufacturerWarrantyDescription", "numberOfBasins", "numberOfHoles", "outsideDiameter", "plugFormat", "plugProfile", "powerSource", "recycledContentPercentage", "roughIn", "speed", "spoutHeight", "spoutReach", "switchStyle", "switchType", "sellerWarrantyDescription", "threadSize", "voltage", "wattage", "customerPackageType", "baseDiameter", "beamAngle", "bladeColor", "circuitBreakerType", "efficiency", "internationalProtectionRating", "lightSourceOperatingLife", "lightingMethod", "maximumCompatibleLightSourceWattage", "numberOfBlades", "numberOfLightSources", "shadeDiameter", "shadeMaterialType", "shortProductDescription", "startUpTimeDescription", "strands", "tubingOutsideDiameter"})
/*      */ @XmlRootElement(name="PlumbingFixtures")
/*      */ public class PlumbingFixtures
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="AccessoryConnectionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String accessoryConnectionType;
/*      */ 
/*      */   @XmlElement(name="BatteryCapacity")
/*      */   protected BatteryPowerDimension batteryCapacity;
/*      */ 
/*      */   @XmlElement(name="BladeEdge")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bladeEdge;
/*      */ 
/*      */   @XmlElement(name="BladeLength")
/*      */   protected LengthDimension bladeLength;
/*      */ 
/*      */   @XmlElement(name="CompatibleDevices")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String compatibleDevices;
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
/*      */   @XmlElement(name="Coverage")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String coverage;
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
/*      */   @XmlElement(name="FoldedKnifeSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String foldedKnifeSize;
/*      */ 
/*      */   @XmlElement(name="GritRating")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger gritRating;
/*      */ 
/*      */   @XmlElement(name="InsideDiameter")
/*      */   protected LengthDimension insideDiameter;
/*      */ 
/*      */   @XmlElement(name="LaserBeamColor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String laserBeamColor;
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
/*      */   @XmlElement(name="MinimumEfficiencyReportingValue")
/*      */   protected Integer minimumEfficiencyReportingValue;
/*      */ 
/*      */   @XmlElement(name="NumberOfItems")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfItems;
/*      */ 
/*      */   @XmlElement(name="PerformanceDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String performanceDescription;
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
/*      */   @XmlElement(name="Size")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String size;
/*      */ 
/*      */   @XmlElement(name="CenterLength")
/*      */   protected LengthDimension centerLength;
/*      */ 
/*      */   @XmlElement(name="Brightness")
/*      */   protected LumensType brightness;
/*      */ 
/*      */   @XmlElement(name="BulbType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bulbType;
/*      */ 
/*      */   @XmlElement(name="Color")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String color;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="HandleMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String handleMaterial;
/*      */ 
/*      */   @XmlElement(name="HeadStyle")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String headStyle;
/*      */ 
/*      */   @XmlElement(name="HeaterWattage")
/*      */   protected WattageDimension heaterWattage;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
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
/*      */   @XmlElement(name="ManufacturerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String manufacturerWarrantyDescription;
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
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="RecycledContentPercentage")
/*      */   protected BigInteger recycledContentPercentage;
/*      */ 
/*      */   @XmlElement(name="RoughIn")
/*      */   protected LengthDimension roughIn;
/*      */ 
/*      */   @XmlElement(name="Speed")
/*      */   protected SpeedDimension speed;
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
/*      */   @XmlElement(name="SellerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sellerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="ThreadSize")
/*      */   protected LengthDimensionOptionalUnit threadSize;
/*      */ 
/*      */   @XmlElement(name="Voltage")
/*      */   protected BigDecimal voltage;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected WattageDimensionOptionalUnit wattage;
/*      */ 
/*      */   @XmlElement(name="CustomerPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String customerPackageType;
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
/*  477 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  489 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getAccessoryConnectionType()
/*      */   {
/*  501 */     return this.accessoryConnectionType;
/*      */   }
/*      */ 
/*      */   public void setAccessoryConnectionType(String value)
/*      */   {
/*  513 */     this.accessoryConnectionType = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerDimension getBatteryCapacity()
/*      */   {
/*  525 */     return this.batteryCapacity;
/*      */   }
/*      */ 
/*      */   public void setBatteryCapacity(BatteryPowerDimension value)
/*      */   {
/*  537 */     this.batteryCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getBladeEdge()
/*      */   {
/*  549 */     return this.bladeEdge;
/*      */   }
/*      */ 
/*      */   public void setBladeEdge(String value)
/*      */   {
/*  561 */     this.bladeEdge = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBladeLength()
/*      */   {
/*  573 */     return this.bladeLength;
/*      */   }
/*      */ 
/*      */   public void setBladeLength(LengthDimension value)
/*      */   {
/*  585 */     this.bladeLength = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleDevices()
/*      */   {
/*  597 */     return this.compatibleDevices;
/*      */   }
/*      */ 
/*      */   public void setCompatibleDevices(String value)
/*      */   {
/*  609 */     this.compatibleDevices = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleFastenerRange()
/*      */   {
/*  621 */     return this.compatibleFastenerRange;
/*      */   }
/*      */ 
/*      */   public void setCompatibleFastenerRange(String value)
/*      */   {
/*  633 */     this.compatibleFastenerRange = value;
/*      */   }
/*      */ 
/*      */   public String getCoolingMethod()
/*      */   {
/*  645 */     return this.coolingMethod;
/*      */   }
/*      */ 
/*      */   public void setCoolingMethod(String value)
/*      */   {
/*  657 */     this.coolingMethod = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getCoolingWattage()
/*      */   {
/*  669 */     return this.coolingWattage;
/*      */   }
/*      */ 
/*      */   public void setCoolingWattage(WattageDimension value)
/*      */   {
/*  681 */     this.coolingWattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCornerRadius()
/*      */   {
/*  693 */     return this.cornerRadius;
/*      */   }
/*      */ 
/*      */   public void setCornerRadius(LengthDimension value)
/*      */   {
/*  705 */     this.cornerRadius = value;
/*      */   }
/*      */ 
/*      */   public String getCoverage()
/*      */   {
/*  717 */     return this.coverage;
/*      */   }
/*      */ 
/*      */   public void setCoverage(String value)
/*      */   {
/*  729 */     this.coverage = value;
/*      */   }
/*      */ 
/*      */   public String getCutType()
/*      */   {
/*  741 */     return this.cutType;
/*      */   }
/*      */ 
/*      */   public void setCutType(String value)
/*      */   {
/*  753 */     this.cutType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCuttingWidth()
/*      */   {
/*  765 */     return this.cuttingWidth;
/*      */   }
/*      */ 
/*      */   public void setCuttingWidth(LengthDimension value)
/*      */   {
/*  777 */     this.cuttingWidth = value;
/*      */   }
/*      */ 
/*      */   public String getDeviceType()
/*      */   {
/*  789 */     return this.deviceType;
/*      */   }
/*      */ 
/*      */   public void setDeviceType(String value)
/*      */   {
/*  801 */     this.deviceType = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayStyle()
/*      */   {
/*  813 */     return this.displayStyle;
/*      */   }
/*      */ 
/*      */   public void setDisplayStyle(String value)
/*      */   {
/*  825 */     this.displayStyle = value;
/*      */   }
/*      */ 
/*      */   public EnergyConsumptionDimension getEnergyConsumption()
/*      */   {
/*  837 */     return this.energyConsumption;
/*      */   }
/*      */ 
/*      */   public void setEnergyConsumption(EnergyConsumptionDimension value)
/*      */   {
/*  849 */     this.energyConsumption = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getEnergyEfficiencyRatioCooling()
/*      */   {
/*  861 */     return this.energyEfficiencyRatioCooling;
/*      */   }
/*      */ 
/*      */   public void setEnergyEfficiencyRatioCooling(BigInteger value)
/*      */   {
/*  873 */     this.energyEfficiencyRatioCooling = value;
/*      */   }
/*      */ 
/*      */   public String getEnvironmentalDescription()
/*      */   {
/*  885 */     return this.environmentalDescription;
/*      */   }
/*      */ 
/*      */   public void setEnvironmentalDescription(String value)
/*      */   {
/*  897 */     this.environmentalDescription = value;
/*      */   }
/*      */ 
/*      */   public EuEnergyEfficiencyClassType getEuEnergyEfficiencyClassHeating()
/*      */   {
/*  909 */     return this.euEnergyEfficiencyClassHeating;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyEfficiencyClassHeating(EuEnergyEfficiencyClassType value)
/*      */   {
/*  921 */     this.euEnergyEfficiencyClassHeating = value;
/*      */   }
/*      */ 
/*      */   public EuEnergyEfficiencyClassType getEuEnergyLabelEfficiencyClass()
/*      */   {
/*  933 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(EuEnergyEfficiencyClassType value)
/*      */   {
/*  945 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public List<String> getExternalTestingCertification()
/*      */   {
/*  971 */     if (this.externalTestingCertification == null) {
/*  972 */       this.externalTestingCertification = new ArrayList();
/*      */     }
/*  974 */     return this.externalTestingCertification;
/*      */   }
/*      */ 
/*      */   public String getFlushType()
/*      */   {
/*  986 */     return this.flushType;
/*      */   }
/*      */ 
/*      */   public void setFlushType(String value)
/*      */   {
/*  998 */     this.flushType = value;
/*      */   }
/*      */ 
/*      */   public String getFoldedKnifeSize()
/*      */   {
/* 1010 */     return this.foldedKnifeSize;
/*      */   }
/*      */ 
/*      */   public void setFoldedKnifeSize(String value)
/*      */   {
/* 1022 */     this.foldedKnifeSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getGritRating()
/*      */   {
/* 1034 */     return this.gritRating;
/*      */   }
/*      */ 
/*      */   public void setGritRating(BigInteger value)
/*      */   {
/* 1046 */     this.gritRating = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getInsideDiameter()
/*      */   {
/* 1058 */     return this.insideDiameter;
/*      */   }
/*      */ 
/*      */   public void setInsideDiameter(LengthDimension value)
/*      */   {
/* 1070 */     this.insideDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getLaserBeamColor()
/*      */   {
/* 1082 */     return this.laserBeamColor;
/*      */   }
/*      */ 
/*      */   public void setLaserBeamColor(String value)
/*      */   {
/* 1094 */     this.laserBeamColor = value;
/*      */   }
/*      */ 
/*      */   public MaximumPowerType getMaximumPower()
/*      */   {
/* 1106 */     return this.maximumPower;
/*      */   }
/*      */ 
/*      */   public void setMaximumPower(MaximumPowerType value)
/*      */   {
/* 1118 */     this.maximumPower = value;
/*      */   }
/*      */ 
/*      */   public String getMeasurementAccuracy()
/*      */   {
/* 1130 */     return this.measurementAccuracy;
/*      */   }
/*      */ 
/*      */   public void setMeasurementAccuracy(String value)
/*      */   {
/* 1142 */     this.measurementAccuracy = value;
/*      */   }
/*      */ 
/*      */   public String getMeasurementSystem()
/*      */   {
/* 1154 */     return this.measurementSystem;
/*      */   }
/*      */ 
/*      */   public void setMeasurementSystem(String value)
/*      */   {
/* 1166 */     this.measurementSystem = value;
/*      */   }
/*      */ 
/*      */   public Integer getMinimumEfficiencyReportingValue()
/*      */   {
/* 1178 */     return this.minimumEfficiencyReportingValue;
/*      */   }
/*      */ 
/*      */   public void setMinimumEfficiencyReportingValue(Integer value)
/*      */   {
/* 1190 */     this.minimumEfficiencyReportingValue = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfItems()
/*      */   {
/* 1202 */     return this.numberOfItems;
/*      */   }
/*      */ 
/*      */   public void setNumberOfItems(BigInteger value)
/*      */   {
/* 1214 */     this.numberOfItems = value;
/*      */   }
/*      */ 
/*      */   public String getPerformanceDescription()
/*      */   {
/* 1226 */     return this.performanceDescription;
/*      */   }
/*      */ 
/*      */   public void setPerformanceDescription(String value)
/*      */   {
/* 1238 */     this.performanceDescription = value;
/*      */   }
/*      */ 
/*      */   public String getToolTipDescription()
/*      */   {
/* 1250 */     return this.toolTipDescription;
/*      */   }
/*      */ 
/*      */   public void setToolTipDescription(String value)
/*      */   {
/* 1262 */     this.toolTipDescription = value;
/*      */   }
/*      */ 
/*      */   public TorqueType getTorque()
/*      */   {
/* 1274 */     return this.torque;
/*      */   }
/*      */ 
/*      */   public void setTorque(TorqueType value)
/*      */   {
/* 1286 */     this.torque = value;
/*      */   }
/*      */ 
/*      */   public String getUVProtection()
/*      */   {
/* 1298 */     return this.uvProtection;
/*      */   }
/*      */ 
/*      */   public void setUVProtection(String value)
/*      */   {
/* 1310 */     this.uvProtection = value;
/*      */   }
/*      */ 
/*      */   public String getViewingArea()
/*      */   {
/* 1322 */     return this.viewingArea;
/*      */   }
/*      */ 
/*      */   public void setViewingArea(String value)
/*      */   {
/* 1334 */     this.viewingArea = value;
/*      */   }
/*      */ 
/*      */   public String getSize()
/*      */   {
/* 1346 */     return this.size;
/*      */   }
/*      */ 
/*      */   public void setSize(String value)
/*      */   {
/* 1358 */     this.size = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCenterLength()
/*      */   {
/* 1370 */     return this.centerLength;
/*      */   }
/*      */ 
/*      */   public void setCenterLength(LengthDimension value)
/*      */   {
/* 1382 */     this.centerLength = value;
/*      */   }
/*      */ 
/*      */   public LumensType getBrightness()
/*      */   {
/* 1394 */     return this.brightness;
/*      */   }
/*      */ 
/*      */   public void setBrightness(LumensType value)
/*      */   {
/* 1406 */     this.brightness = value;
/*      */   }
/*      */ 
/*      */   public String getBulbType()
/*      */   {
/* 1418 */     return this.bulbType;
/*      */   }
/*      */ 
/*      */   public void setBulbType(String value)
/*      */   {
/* 1430 */     this.bulbType = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/* 1442 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/* 1454 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/* 1466 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/* 1478 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getHandleMaterial()
/*      */   {
/* 1490 */     return this.handleMaterial;
/*      */   }
/*      */ 
/*      */   public void setHandleMaterial(String value)
/*      */   {
/* 1502 */     this.handleMaterial = value;
/*      */   }
/*      */ 
/*      */   public String getHeadStyle()
/*      */   {
/* 1514 */     return this.headStyle;
/*      */   }
/*      */ 
/*      */   public void setHeadStyle(String value)
/*      */   {
/* 1526 */     this.headStyle = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getHeaterWattage()
/*      */   {
/* 1538 */     return this.heaterWattage;
/*      */   }
/*      */ 
/*      */   public void setHeaterWattage(WattageDimension value)
/*      */   {
/* 1550 */     this.heaterWattage = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/* 1562 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/* 1574 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getDisplayVolume()
/*      */   {
/* 1586 */     return this.displayVolume;
/*      */   }
/*      */ 
/*      */   public void setDisplayVolume(VolumeDimension value)
/*      */   {
/* 1598 */     this.displayVolume = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/* 1610 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/* 1622 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/* 1634 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/* 1646 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public String getManufacturerWarrantyDescription()
/*      */   {
/* 1658 */     return this.manufacturerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setManufacturerWarrantyDescription(String value)
/*      */   {
/* 1670 */     this.manufacturerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBasins()
/*      */   {
/* 1682 */     return this.numberOfBasins;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBasins(BigInteger value)
/*      */   {
/* 1694 */     this.numberOfBasins = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHoles()
/*      */   {
/* 1706 */     return this.numberOfHoles;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHoles(BigInteger value)
/*      */   {
/* 1718 */     this.numberOfHoles = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getOutsideDiameter()
/*      */   {
/* 1730 */     return this.outsideDiameter;
/*      */   }
/*      */ 
/*      */   public void setOutsideDiameter(LengthDimension value)
/*      */   {
/* 1742 */     this.outsideDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getPlugFormat()
/*      */   {
/* 1754 */     return this.plugFormat;
/*      */   }
/*      */ 
/*      */   public void setPlugFormat(String value)
/*      */   {
/* 1766 */     this.plugFormat = value;
/*      */   }
/*      */ 
/*      */   public String getPlugProfile()
/*      */   {
/* 1778 */     return this.plugProfile;
/*      */   }
/*      */ 
/*      */   public void setPlugProfile(String value)
/*      */   {
/* 1790 */     this.plugProfile = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1802 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1814 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getRecycledContentPercentage()
/*      */   {
/* 1826 */     return this.recycledContentPercentage;
/*      */   }
/*      */ 
/*      */   public void setRecycledContentPercentage(BigInteger value)
/*      */   {
/* 1838 */     this.recycledContentPercentage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getRoughIn()
/*      */   {
/* 1850 */     return this.roughIn;
/*      */   }
/*      */ 
/*      */   public void setRoughIn(LengthDimension value)
/*      */   {
/* 1862 */     this.roughIn = value;
/*      */   }
/*      */ 
/*      */   public SpeedDimension getSpeed()
/*      */   {
/* 1874 */     return this.speed;
/*      */   }
/*      */ 
/*      */   public void setSpeed(SpeedDimension value)
/*      */   {
/* 1886 */     this.speed = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpoutHeight()
/*      */   {
/* 1898 */     return this.spoutHeight;
/*      */   }
/*      */ 
/*      */   public void setSpoutHeight(LengthDimension value)
/*      */   {
/* 1910 */     this.spoutHeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpoutReach()
/*      */   {
/* 1922 */     return this.spoutReach;
/*      */   }
/*      */ 
/*      */   public void setSpoutReach(LengthDimension value)
/*      */   {
/* 1934 */     this.spoutReach = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchStyle()
/*      */   {
/* 1946 */     return this.switchStyle;
/*      */   }
/*      */ 
/*      */   public void setSwitchStyle(String value)
/*      */   {
/* 1958 */     this.switchStyle = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchType()
/*      */   {
/* 1970 */     return this.switchType;
/*      */   }
/*      */ 
/*      */   public void setSwitchType(String value)
/*      */   {
/* 1982 */     this.switchType = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/* 1994 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/* 2006 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public LengthDimensionOptionalUnit getThreadSize()
/*      */   {
/* 2018 */     return this.threadSize;
/*      */   }
/*      */ 
/*      */   public void setThreadSize(LengthDimensionOptionalUnit value)
/*      */   {
/* 2030 */     this.threadSize = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getVoltage()
/*      */   {
/* 2042 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigDecimal value)
/*      */   {
/* 2054 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit getWattage()
/*      */   {
/* 2066 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageDimensionOptionalUnit value)
/*      */   {
/* 2078 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getCustomerPackageType()
/*      */   {
/* 2090 */     return this.customerPackageType;
/*      */   }
/*      */ 
/*      */   public void setCustomerPackageType(String value)
/*      */   {
/* 2102 */     this.customerPackageType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseDiameter()
/*      */   {
/* 2114 */     return this.baseDiameter;
/*      */   }
/*      */ 
/*      */   public void setBaseDiameter(LengthDimension value)
/*      */   {
/* 2126 */     this.baseDiameter = value;
/*      */   }
/*      */ 
/*      */   public DegreeDimension getBeamAngle()
/*      */   {
/* 2138 */     return this.beamAngle;
/*      */   }
/*      */ 
/*      */   public void setBeamAngle(DegreeDimension value)
/*      */   {
/* 2150 */     this.beamAngle = value;
/*      */   }
/*      */ 
/*      */   public String getBladeColor()
/*      */   {
/* 2162 */     return this.bladeColor;
/*      */   }
/*      */ 
/*      */   public void setBladeColor(String value)
/*      */   {
/* 2174 */     this.bladeColor = value;
/*      */   }
/*      */ 
/*      */   public String getCircuitBreakerType()
/*      */   {
/* 2186 */     return this.circuitBreakerType;
/*      */   }
/*      */ 
/*      */   public void setCircuitBreakerType(String value)
/*      */   {
/* 2198 */     this.circuitBreakerType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 2210 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 2222 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   public String getInternationalProtectionRating()
/*      */   {
/* 2234 */     return this.internationalProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setInternationalProtectionRating(String value)
/*      */   {
/* 2246 */     this.internationalProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public TimeDimension getLightSourceOperatingLife()
/*      */   {
/* 2258 */     return this.lightSourceOperatingLife;
/*      */   }
/*      */ 
/*      */   public void setLightSourceOperatingLife(TimeDimension value)
/*      */   {
/* 2270 */     this.lightSourceOperatingLife = value;
/*      */   }
/*      */ 
/*      */   public String getLightingMethod()
/*      */   {
/* 2282 */     return this.lightingMethod;
/*      */   }
/*      */ 
/*      */   public void setLightingMethod(String value)
/*      */   {
/* 2294 */     this.lightingMethod = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getMaximumCompatibleLightSourceWattage()
/*      */   {
/* 2306 */     return this.maximumCompatibleLightSourceWattage;
/*      */   }
/*      */ 
/*      */   public void setMaximumCompatibleLightSourceWattage(WattageDimension value)
/*      */   {
/* 2318 */     this.maximumCompatibleLightSourceWattage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBlades()
/*      */   {
/* 2330 */     return this.numberOfBlades;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBlades(BigInteger value)
/*      */   {
/* 2342 */     this.numberOfBlades = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLightSources()
/*      */   {
/* 2354 */     return this.numberOfLightSources;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLightSources(BigInteger value)
/*      */   {
/* 2366 */     this.numberOfLightSources = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getShadeDiameter()
/*      */   {
/* 2378 */     return this.shadeDiameter;
/*      */   }
/*      */ 
/*      */   public void setShadeDiameter(LengthDimension value)
/*      */   {
/* 2390 */     this.shadeDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getShadeMaterialType()
/*      */   {
/* 2402 */     return this.shadeMaterialType;
/*      */   }
/*      */ 
/*      */   public void setShadeMaterialType(String value)
/*      */   {
/* 2414 */     this.shadeMaterialType = value;
/*      */   }
/*      */ 
/*      */   public String getShortProductDescription()
/*      */   {
/* 2426 */     return this.shortProductDescription;
/*      */   }
/*      */ 
/*      */   public void setShortProductDescription(String value)
/*      */   {
/* 2438 */     this.shortProductDescription = value;
/*      */   }
/*      */ 
/*      */   public String getStartUpTimeDescription()
/*      */   {
/* 2450 */     return this.startUpTimeDescription;
/*      */   }
/*      */ 
/*      */   public void setStartUpTimeDescription(String value)
/*      */   {
/* 2462 */     this.startUpTimeDescription = value;
/*      */   }
/*      */ 
/*      */   public String getStrands()
/*      */   {
/* 2474 */     return this.strands;
/*      */   }
/*      */ 
/*      */   public void setStrands(String value)
/*      */   {
/* 2486 */     this.strands = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getTubingOutsideDiameter()
/*      */   {
/* 2498 */     return this.tubingOutsideDiameter;
/*      */   }
/*      */ 
/*      */   public void setTubingOutsideDiameter(LengthDimension value)
/*      */   {
/* 2510 */     this.tubingOutsideDiameter = value;
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
/* 2581 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 2593 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 2605 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 2617 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PlumbingFixtures
 * JD-Core Version:    0.6.2
 */