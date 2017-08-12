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
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"variationData", "accessoryConnectionType", "bladeEdge", "bladeLength", "brightness", "centerLength", "compatibleDevices", "compatibleFastenerRange", "coolingMethod", "coolingWattage", "cornerRadius", "coverage", "cutType", "cuttingWidth", "deviceType", "displayStyle", "displayVolume", "displayWeight", "displayLength", "energyConsumption", "energyEfficiencyRatioCooling", "environmentalDescription", "euEnergyEfficiencyClassHeating", "euEnergyLabelEfficiencyClass", "externalTestingCertification", "flushType", "foldedKnifeSize", "gritRating", "handleMaterial", "headStyle", "heaterWattage", "insideDiameter", "laserBeamColor", "maximumPower", "measurementAccuracy", "measurementSystem", "minimumEfficiencyReportingValue", "numberOfBasins", "numberOfHoles", "performanceDescription", "plugProfile", "plugFormat", "recycledContentPercentage", "roughIn", "speed", "spoutHeight", "spoutReach", "switchStyle", "switchType", "threadSize", "toolTipDescription", "torque", "uvProtection", "viewingArea", "size", "color", "colorMap", "manufacturerWarrantyDescription", "material", "powerSource", "sellerWarrantyDescription", "voltage", "wattage", "customerPackageType", "batteryCapacity", "bulbType", "baseDiameter", "beamAngle", "bladeColor", "circuitBreakerType", "efficiency", "internationalProtectionRating", "lightSourceOperatingLife", "lightingMethod", "maximumCompatibleLightSourceWattage", "numberOfBlades", "numberOfLightSources", "shadeDiameter", "shadeMaterialType", "shortProductDescription", "startUpTimeDescription", "strands", "tubingOutsideDiameter"})
/*      */ @XmlRootElement(name="SecurityElectronics")
/*      */ public class SecurityElectronics
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
/*      */   @XmlElement(name="CenterLength")
/*      */   protected LengthDimension centerLength;
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
/*      */   @XmlElement(name="DisplayVolume")
/*      */   protected VolumeDimension displayVolume;
/*      */ 
/*      */   @XmlElement(name="DisplayWeight")
/*      */   protected WeightDimension displayWeight;
/*      */ 
/*      */   @XmlElement(name="DisplayLength")
/*      */   protected LengthDimension displayLength;
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
/*      */   protected BigInteger gritRating;
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
/*      */   @XmlElement(name="NumberOfBasins")
/*      */   protected BigInteger numberOfBasins;
/*      */ 
/*      */   @XmlElement(name="NumberOfHoles")
/*      */   protected BigInteger numberOfHoles;
/*      */ 
/*      */   @XmlElement(name="PerformanceDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String performanceDescription;
/*      */ 
/*      */   @XmlElement(name="PlugProfile")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String plugProfile;
/*      */ 
/*      */   @XmlElement(name="PlugFormat")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String plugFormat;
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
/*      */   @XmlElement(name="ThreadSize")
/*      */   protected LengthDimensionOptionalUnit threadSize;
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
/*      */   @XmlElement(name="Color")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String color;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="ManufacturerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String manufacturerWarrantyDescription;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="SellerWarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sellerWarrantyDescription;
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
/*      */   @XmlElement(name="BatteryCapacity")
/*      */   protected BatteryPowerDimension batteryCapacity;
/*      */ 
/*      */   @XmlElement(name="BulbType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bulbType;
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
/*  463 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  475 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getAccessoryConnectionType()
/*      */   {
/*  487 */     return this.accessoryConnectionType;
/*      */   }
/*      */ 
/*      */   public void setAccessoryConnectionType(String value)
/*      */   {
/*  499 */     this.accessoryConnectionType = value;
/*      */   }
/*      */ 
/*      */   public String getBladeEdge()
/*      */   {
/*  511 */     return this.bladeEdge;
/*      */   }
/*      */ 
/*      */   public void setBladeEdge(String value)
/*      */   {
/*  523 */     this.bladeEdge = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBladeLength()
/*      */   {
/*  535 */     return this.bladeLength;
/*      */   }
/*      */ 
/*      */   public void setBladeLength(LengthDimension value)
/*      */   {
/*  547 */     this.bladeLength = value;
/*      */   }
/*      */ 
/*      */   public LumensType getBrightness()
/*      */   {
/*  559 */     return this.brightness;
/*      */   }
/*      */ 
/*      */   public void setBrightness(LumensType value)
/*      */   {
/*  571 */     this.brightness = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCenterLength()
/*      */   {
/*  583 */     return this.centerLength;
/*      */   }
/*      */ 
/*      */   public void setCenterLength(LengthDimension value)
/*      */   {
/*  595 */     this.centerLength = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleDevices()
/*      */   {
/*  607 */     return this.compatibleDevices;
/*      */   }
/*      */ 
/*      */   public void setCompatibleDevices(String value)
/*      */   {
/*  619 */     this.compatibleDevices = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleFastenerRange()
/*      */   {
/*  631 */     return this.compatibleFastenerRange;
/*      */   }
/*      */ 
/*      */   public void setCompatibleFastenerRange(String value)
/*      */   {
/*  643 */     this.compatibleFastenerRange = value;
/*      */   }
/*      */ 
/*      */   public String getCoolingMethod()
/*      */   {
/*  655 */     return this.coolingMethod;
/*      */   }
/*      */ 
/*      */   public void setCoolingMethod(String value)
/*      */   {
/*  667 */     this.coolingMethod = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getCoolingWattage()
/*      */   {
/*  679 */     return this.coolingWattage;
/*      */   }
/*      */ 
/*      */   public void setCoolingWattage(WattageDimension value)
/*      */   {
/*  691 */     this.coolingWattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCornerRadius()
/*      */   {
/*  703 */     return this.cornerRadius;
/*      */   }
/*      */ 
/*      */   public void setCornerRadius(LengthDimension value)
/*      */   {
/*  715 */     this.cornerRadius = value;
/*      */   }
/*      */ 
/*      */   public String getCoverage()
/*      */   {
/*  727 */     return this.coverage;
/*      */   }
/*      */ 
/*      */   public void setCoverage(String value)
/*      */   {
/*  739 */     this.coverage = value;
/*      */   }
/*      */ 
/*      */   public String getCutType()
/*      */   {
/*  751 */     return this.cutType;
/*      */   }
/*      */ 
/*      */   public void setCutType(String value)
/*      */   {
/*  763 */     this.cutType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCuttingWidth()
/*      */   {
/*  775 */     return this.cuttingWidth;
/*      */   }
/*      */ 
/*      */   public void setCuttingWidth(LengthDimension value)
/*      */   {
/*  787 */     this.cuttingWidth = value;
/*      */   }
/*      */ 
/*      */   public String getDeviceType()
/*      */   {
/*  799 */     return this.deviceType;
/*      */   }
/*      */ 
/*      */   public void setDeviceType(String value)
/*      */   {
/*  811 */     this.deviceType = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayStyle()
/*      */   {
/*  823 */     return this.displayStyle;
/*      */   }
/*      */ 
/*      */   public void setDisplayStyle(String value)
/*      */   {
/*  835 */     this.displayStyle = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getDisplayVolume()
/*      */   {
/*  847 */     return this.displayVolume;
/*      */   }
/*      */ 
/*      */   public void setDisplayVolume(VolumeDimension value)
/*      */   {
/*  859 */     this.displayVolume = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/*  871 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/*  883 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/*  895 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/*  907 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public EnergyConsumptionDimension getEnergyConsumption()
/*      */   {
/*  919 */     return this.energyConsumption;
/*      */   }
/*      */ 
/*      */   public void setEnergyConsumption(EnergyConsumptionDimension value)
/*      */   {
/*  931 */     this.energyConsumption = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getEnergyEfficiencyRatioCooling()
/*      */   {
/*  943 */     return this.energyEfficiencyRatioCooling;
/*      */   }
/*      */ 
/*      */   public void setEnergyEfficiencyRatioCooling(BigInteger value)
/*      */   {
/*  955 */     this.energyEfficiencyRatioCooling = value;
/*      */   }
/*      */ 
/*      */   public String getEnvironmentalDescription()
/*      */   {
/*  967 */     return this.environmentalDescription;
/*      */   }
/*      */ 
/*      */   public void setEnvironmentalDescription(String value)
/*      */   {
/*  979 */     this.environmentalDescription = value;
/*      */   }
/*      */ 
/*      */   public EuEnergyEfficiencyClassType getEuEnergyEfficiencyClassHeating()
/*      */   {
/*  991 */     return this.euEnergyEfficiencyClassHeating;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyEfficiencyClassHeating(EuEnergyEfficiencyClassType value)
/*      */   {
/* 1003 */     this.euEnergyEfficiencyClassHeating = value;
/*      */   }
/*      */ 
/*      */   public EuEnergyEfficiencyClassType getEuEnergyLabelEfficiencyClass()
/*      */   {
/* 1015 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(EuEnergyEfficiencyClassType value)
/*      */   {
/* 1027 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public List<String> getExternalTestingCertification()
/*      */   {
/* 1053 */     if (this.externalTestingCertification == null) {
/* 1054 */       this.externalTestingCertification = new ArrayList();
/*      */     }
/* 1056 */     return this.externalTestingCertification;
/*      */   }
/*      */ 
/*      */   public String getFlushType()
/*      */   {
/* 1068 */     return this.flushType;
/*      */   }
/*      */ 
/*      */   public void setFlushType(String value)
/*      */   {
/* 1080 */     this.flushType = value;
/*      */   }
/*      */ 
/*      */   public String getFoldedKnifeSize()
/*      */   {
/* 1092 */     return this.foldedKnifeSize;
/*      */   }
/*      */ 
/*      */   public void setFoldedKnifeSize(String value)
/*      */   {
/* 1104 */     this.foldedKnifeSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getGritRating()
/*      */   {
/* 1116 */     return this.gritRating;
/*      */   }
/*      */ 
/*      */   public void setGritRating(BigInteger value)
/*      */   {
/* 1128 */     this.gritRating = value;
/*      */   }
/*      */ 
/*      */   public String getHandleMaterial()
/*      */   {
/* 1140 */     return this.handleMaterial;
/*      */   }
/*      */ 
/*      */   public void setHandleMaterial(String value)
/*      */   {
/* 1152 */     this.handleMaterial = value;
/*      */   }
/*      */ 
/*      */   public String getHeadStyle()
/*      */   {
/* 1164 */     return this.headStyle;
/*      */   }
/*      */ 
/*      */   public void setHeadStyle(String value)
/*      */   {
/* 1176 */     this.headStyle = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getHeaterWattage()
/*      */   {
/* 1188 */     return this.heaterWattage;
/*      */   }
/*      */ 
/*      */   public void setHeaterWattage(WattageDimension value)
/*      */   {
/* 1200 */     this.heaterWattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getInsideDiameter()
/*      */   {
/* 1212 */     return this.insideDiameter;
/*      */   }
/*      */ 
/*      */   public void setInsideDiameter(LengthDimension value)
/*      */   {
/* 1224 */     this.insideDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getLaserBeamColor()
/*      */   {
/* 1236 */     return this.laserBeamColor;
/*      */   }
/*      */ 
/*      */   public void setLaserBeamColor(String value)
/*      */   {
/* 1248 */     this.laserBeamColor = value;
/*      */   }
/*      */ 
/*      */   public MaximumPowerType getMaximumPower()
/*      */   {
/* 1260 */     return this.maximumPower;
/*      */   }
/*      */ 
/*      */   public void setMaximumPower(MaximumPowerType value)
/*      */   {
/* 1272 */     this.maximumPower = value;
/*      */   }
/*      */ 
/*      */   public String getMeasurementAccuracy()
/*      */   {
/* 1284 */     return this.measurementAccuracy;
/*      */   }
/*      */ 
/*      */   public void setMeasurementAccuracy(String value)
/*      */   {
/* 1296 */     this.measurementAccuracy = value;
/*      */   }
/*      */ 
/*      */   public String getMeasurementSystem()
/*      */   {
/* 1308 */     return this.measurementSystem;
/*      */   }
/*      */ 
/*      */   public void setMeasurementSystem(String value)
/*      */   {
/* 1320 */     this.measurementSystem = value;
/*      */   }
/*      */ 
/*      */   public Integer getMinimumEfficiencyReportingValue()
/*      */   {
/* 1332 */     return this.minimumEfficiencyReportingValue;
/*      */   }
/*      */ 
/*      */   public void setMinimumEfficiencyReportingValue(Integer value)
/*      */   {
/* 1344 */     this.minimumEfficiencyReportingValue = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBasins()
/*      */   {
/* 1356 */     return this.numberOfBasins;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBasins(BigInteger value)
/*      */   {
/* 1368 */     this.numberOfBasins = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHoles()
/*      */   {
/* 1380 */     return this.numberOfHoles;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHoles(BigInteger value)
/*      */   {
/* 1392 */     this.numberOfHoles = value;
/*      */   }
/*      */ 
/*      */   public String getPerformanceDescription()
/*      */   {
/* 1404 */     return this.performanceDescription;
/*      */   }
/*      */ 
/*      */   public void setPerformanceDescription(String value)
/*      */   {
/* 1416 */     this.performanceDescription = value;
/*      */   }
/*      */ 
/*      */   public String getPlugProfile()
/*      */   {
/* 1428 */     return this.plugProfile;
/*      */   }
/*      */ 
/*      */   public void setPlugProfile(String value)
/*      */   {
/* 1440 */     this.plugProfile = value;
/*      */   }
/*      */ 
/*      */   public String getPlugFormat()
/*      */   {
/* 1452 */     return this.plugFormat;
/*      */   }
/*      */ 
/*      */   public void setPlugFormat(String value)
/*      */   {
/* 1464 */     this.plugFormat = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getRecycledContentPercentage()
/*      */   {
/* 1476 */     return this.recycledContentPercentage;
/*      */   }
/*      */ 
/*      */   public void setRecycledContentPercentage(BigInteger value)
/*      */   {
/* 1488 */     this.recycledContentPercentage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getRoughIn()
/*      */   {
/* 1500 */     return this.roughIn;
/*      */   }
/*      */ 
/*      */   public void setRoughIn(LengthDimension value)
/*      */   {
/* 1512 */     this.roughIn = value;
/*      */   }
/*      */ 
/*      */   public SpeedDimension getSpeed()
/*      */   {
/* 1524 */     return this.speed;
/*      */   }
/*      */ 
/*      */   public void setSpeed(SpeedDimension value)
/*      */   {
/* 1536 */     this.speed = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpoutHeight()
/*      */   {
/* 1548 */     return this.spoutHeight;
/*      */   }
/*      */ 
/*      */   public void setSpoutHeight(LengthDimension value)
/*      */   {
/* 1560 */     this.spoutHeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpoutReach()
/*      */   {
/* 1572 */     return this.spoutReach;
/*      */   }
/*      */ 
/*      */   public void setSpoutReach(LengthDimension value)
/*      */   {
/* 1584 */     this.spoutReach = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchStyle()
/*      */   {
/* 1596 */     return this.switchStyle;
/*      */   }
/*      */ 
/*      */   public void setSwitchStyle(String value)
/*      */   {
/* 1608 */     this.switchStyle = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchType()
/*      */   {
/* 1620 */     return this.switchType;
/*      */   }
/*      */ 
/*      */   public void setSwitchType(String value)
/*      */   {
/* 1632 */     this.switchType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimensionOptionalUnit getThreadSize()
/*      */   {
/* 1644 */     return this.threadSize;
/*      */   }
/*      */ 
/*      */   public void setThreadSize(LengthDimensionOptionalUnit value)
/*      */   {
/* 1656 */     this.threadSize = value;
/*      */   }
/*      */ 
/*      */   public String getToolTipDescription()
/*      */   {
/* 1668 */     return this.toolTipDescription;
/*      */   }
/*      */ 
/*      */   public void setToolTipDescription(String value)
/*      */   {
/* 1680 */     this.toolTipDescription = value;
/*      */   }
/*      */ 
/*      */   public TorqueType getTorque()
/*      */   {
/* 1692 */     return this.torque;
/*      */   }
/*      */ 
/*      */   public void setTorque(TorqueType value)
/*      */   {
/* 1704 */     this.torque = value;
/*      */   }
/*      */ 
/*      */   public String getUVProtection()
/*      */   {
/* 1716 */     return this.uvProtection;
/*      */   }
/*      */ 
/*      */   public void setUVProtection(String value)
/*      */   {
/* 1728 */     this.uvProtection = value;
/*      */   }
/*      */ 
/*      */   public String getViewingArea()
/*      */   {
/* 1740 */     return this.viewingArea;
/*      */   }
/*      */ 
/*      */   public void setViewingArea(String value)
/*      */   {
/* 1752 */     this.viewingArea = value;
/*      */   }
/*      */ 
/*      */   public String getSize()
/*      */   {
/* 1764 */     return this.size;
/*      */   }
/*      */ 
/*      */   public void setSize(String value)
/*      */   {
/* 1776 */     this.size = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/* 1788 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/* 1800 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/* 1812 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/* 1824 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getManufacturerWarrantyDescription()
/*      */   {
/* 1836 */     return this.manufacturerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setManufacturerWarrantyDescription(String value)
/*      */   {
/* 1848 */     this.manufacturerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/* 1860 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/* 1872 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1884 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1896 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/* 1908 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/* 1920 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getVoltage()
/*      */   {
/* 1932 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigDecimal value)
/*      */   {
/* 1944 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit getWattage()
/*      */   {
/* 1956 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageDimensionOptionalUnit value)
/*      */   {
/* 1968 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getCustomerPackageType()
/*      */   {
/* 1980 */     return this.customerPackageType;
/*      */   }
/*      */ 
/*      */   public void setCustomerPackageType(String value)
/*      */   {
/* 1992 */     this.customerPackageType = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerDimension getBatteryCapacity()
/*      */   {
/* 2004 */     return this.batteryCapacity;
/*      */   }
/*      */ 
/*      */   public void setBatteryCapacity(BatteryPowerDimension value)
/*      */   {
/* 2016 */     this.batteryCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getBulbType()
/*      */   {
/* 2028 */     return this.bulbType;
/*      */   }
/*      */ 
/*      */   public void setBulbType(String value)
/*      */   {
/* 2040 */     this.bulbType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseDiameter()
/*      */   {
/* 2052 */     return this.baseDiameter;
/*      */   }
/*      */ 
/*      */   public void setBaseDiameter(LengthDimension value)
/*      */   {
/* 2064 */     this.baseDiameter = value;
/*      */   }
/*      */ 
/*      */   public DegreeDimension getBeamAngle()
/*      */   {
/* 2076 */     return this.beamAngle;
/*      */   }
/*      */ 
/*      */   public void setBeamAngle(DegreeDimension value)
/*      */   {
/* 2088 */     this.beamAngle = value;
/*      */   }
/*      */ 
/*      */   public String getBladeColor()
/*      */   {
/* 2100 */     return this.bladeColor;
/*      */   }
/*      */ 
/*      */   public void setBladeColor(String value)
/*      */   {
/* 2112 */     this.bladeColor = value;
/*      */   }
/*      */ 
/*      */   public String getCircuitBreakerType()
/*      */   {
/* 2124 */     return this.circuitBreakerType;
/*      */   }
/*      */ 
/*      */   public void setCircuitBreakerType(String value)
/*      */   {
/* 2136 */     this.circuitBreakerType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 2148 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 2160 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   public String getInternationalProtectionRating()
/*      */   {
/* 2172 */     return this.internationalProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setInternationalProtectionRating(String value)
/*      */   {
/* 2184 */     this.internationalProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public TimeDimension getLightSourceOperatingLife()
/*      */   {
/* 2196 */     return this.lightSourceOperatingLife;
/*      */   }
/*      */ 
/*      */   public void setLightSourceOperatingLife(TimeDimension value)
/*      */   {
/* 2208 */     this.lightSourceOperatingLife = value;
/*      */   }
/*      */ 
/*      */   public String getLightingMethod()
/*      */   {
/* 2220 */     return this.lightingMethod;
/*      */   }
/*      */ 
/*      */   public void setLightingMethod(String value)
/*      */   {
/* 2232 */     this.lightingMethod = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getMaximumCompatibleLightSourceWattage()
/*      */   {
/* 2244 */     return this.maximumCompatibleLightSourceWattage;
/*      */   }
/*      */ 
/*      */   public void setMaximumCompatibleLightSourceWattage(WattageDimension value)
/*      */   {
/* 2256 */     this.maximumCompatibleLightSourceWattage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBlades()
/*      */   {
/* 2268 */     return this.numberOfBlades;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBlades(BigInteger value)
/*      */   {
/* 2280 */     this.numberOfBlades = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLightSources()
/*      */   {
/* 2292 */     return this.numberOfLightSources;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLightSources(BigInteger value)
/*      */   {
/* 2304 */     this.numberOfLightSources = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getShadeDiameter()
/*      */   {
/* 2316 */     return this.shadeDiameter;
/*      */   }
/*      */ 
/*      */   public void setShadeDiameter(LengthDimension value)
/*      */   {
/* 2328 */     this.shadeDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getShadeMaterialType()
/*      */   {
/* 2340 */     return this.shadeMaterialType;
/*      */   }
/*      */ 
/*      */   public void setShadeMaterialType(String value)
/*      */   {
/* 2352 */     this.shadeMaterialType = value;
/*      */   }
/*      */ 
/*      */   public String getShortProductDescription()
/*      */   {
/* 2364 */     return this.shortProductDescription;
/*      */   }
/*      */ 
/*      */   public void setShortProductDescription(String value)
/*      */   {
/* 2376 */     this.shortProductDescription = value;
/*      */   }
/*      */ 
/*      */   public String getStartUpTimeDescription()
/*      */   {
/* 2388 */     return this.startUpTimeDescription;
/*      */   }
/*      */ 
/*      */   public void setStartUpTimeDescription(String value)
/*      */   {
/* 2400 */     this.startUpTimeDescription = value;
/*      */   }
/*      */ 
/*      */   public String getStrands()
/*      */   {
/* 2412 */     return this.strands;
/*      */   }
/*      */ 
/*      */   public void setStrands(String value)
/*      */   {
/* 2424 */     this.strands = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getTubingOutsideDiameter()
/*      */   {
/* 2436 */     return this.tubingOutsideDiameter;
/*      */   }
/*      */ 
/*      */   public void setTubingOutsideDiameter(LengthDimension value)
/*      */   {
/* 2448 */     this.tubingOutsideDiameter = value;
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
/* 2518 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 2530 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 2542 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 2554 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SecurityElectronics
 * JD-Core Version:    0.6.2
 */