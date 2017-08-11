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
/*      */ @XmlType(name="", propOrder={"variationData", "accessoryConnectionType", "batteryCapacity", "bladeEdge", "bladeLength", "brightness", "bulbType", "centerLength", "compatibleDevices", "compatibleFastenerRange", "coolingMethod", "coolingWattage", "cornerRadius", "energyConsumption", "energyEfficiencyRatioCooling", "environmentalDescription", "euEnergyEfficiencyClassHeating", "euEnergyLabelEfficiencyClass", "externalTestingCertification", "coverage", "cutType", "cuttingWidth", "deviceType", "displayStyle", "flushType", "foldedKnifeSize", "gritRating", "handleMaterial", "headStyle", "heaterWattage", "insideDiameter", "laserBeamColor", "maximumPower", "measurementAccuracy", "measurementSystem", "minimumEfficiencyReportingValue", "numberOfBasins", "numberOfHoles", "numberOfItems", "outsideDiameter", "performanceDescription", "plugFormat", "plugProfile", "recycledContentPercentage", "roughIn", "speed", "spoutHeight", "spoutReach", "switchStyle", "switchType", "threadSize", "toolTipDescription", "torque", "uvProtection", "viewingArea", "size", "color", "colorMap", "material", "displayVolume", "displayWeight", "displayLength", "manufacturerWarrantyDescription", "powerSource", "rValue", "sellerWarrantyDescription", "voltage", "wattage", "customerPackageType", "baseDiameter", "beamAngle", "bladeColor", "circuitBreakerType", "efficiency", "internationalProtectionRating", "lightSourceOperatingLife", "lightingMethod", "maximumCompatibleLightSourceWattage", "numberOfBlades", "numberOfLightSources", "shadeDiameter", "shadeMaterialType", "shortProductDescription", "startUpTimeDescription", "strands", "tubingOutsideDiameter"})
/*      */ @XmlRootElement(name="BuildingMaterials")
/*      */ public class BuildingMaterials
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
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfBasins;
/*      */ 
/*      */   @XmlElement(name="NumberOfHoles")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfHoles;
/*      */ 
/*      */   @XmlElement(name="NumberOfItems")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfItems;
/*      */ 
/*      */   @XmlElement(name="OutsideDiameter")
/*      */   protected LengthDimension outsideDiameter;
/*      */ 
/*      */   @XmlElement(name="PerformanceDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String performanceDescription;
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
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="RValue")
/*      */   protected Integer rValue;
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
/*  481 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  493 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public String getAccessoryConnectionType()
/*      */   {
/*  505 */     return this.accessoryConnectionType;
/*      */   }
/*      */ 
/*      */   public void setAccessoryConnectionType(String value)
/*      */   {
/*  517 */     this.accessoryConnectionType = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerDimension getBatteryCapacity()
/*      */   {
/*  529 */     return this.batteryCapacity;
/*      */   }
/*      */ 
/*      */   public void setBatteryCapacity(BatteryPowerDimension value)
/*      */   {
/*  541 */     this.batteryCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getBladeEdge()
/*      */   {
/*  553 */     return this.bladeEdge;
/*      */   }
/*      */ 
/*      */   public void setBladeEdge(String value)
/*      */   {
/*  565 */     this.bladeEdge = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBladeLength()
/*      */   {
/*  577 */     return this.bladeLength;
/*      */   }
/*      */ 
/*      */   public void setBladeLength(LengthDimension value)
/*      */   {
/*  589 */     this.bladeLength = value;
/*      */   }
/*      */ 
/*      */   public LumensType getBrightness()
/*      */   {
/*  601 */     return this.brightness;
/*      */   }
/*      */ 
/*      */   public void setBrightness(LumensType value)
/*      */   {
/*  613 */     this.brightness = value;
/*      */   }
/*      */ 
/*      */   public String getBulbType()
/*      */   {
/*  625 */     return this.bulbType;
/*      */   }
/*      */ 
/*      */   public void setBulbType(String value)
/*      */   {
/*  637 */     this.bulbType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCenterLength()
/*      */   {
/*  649 */     return this.centerLength;
/*      */   }
/*      */ 
/*      */   public void setCenterLength(LengthDimension value)
/*      */   {
/*  661 */     this.centerLength = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleDevices()
/*      */   {
/*  673 */     return this.compatibleDevices;
/*      */   }
/*      */ 
/*      */   public void setCompatibleDevices(String value)
/*      */   {
/*  685 */     this.compatibleDevices = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleFastenerRange()
/*      */   {
/*  697 */     return this.compatibleFastenerRange;
/*      */   }
/*      */ 
/*      */   public void setCompatibleFastenerRange(String value)
/*      */   {
/*  709 */     this.compatibleFastenerRange = value;
/*      */   }
/*      */ 
/*      */   public String getCoolingMethod()
/*      */   {
/*  721 */     return this.coolingMethod;
/*      */   }
/*      */ 
/*      */   public void setCoolingMethod(String value)
/*      */   {
/*  733 */     this.coolingMethod = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getCoolingWattage()
/*      */   {
/*  745 */     return this.coolingWattage;
/*      */   }
/*      */ 
/*      */   public void setCoolingWattage(WattageDimension value)
/*      */   {
/*  757 */     this.coolingWattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCornerRadius()
/*      */   {
/*  769 */     return this.cornerRadius;
/*      */   }
/*      */ 
/*      */   public void setCornerRadius(LengthDimension value)
/*      */   {
/*  781 */     this.cornerRadius = value;
/*      */   }
/*      */ 
/*      */   public EnergyConsumptionDimension getEnergyConsumption()
/*      */   {
/*  793 */     return this.energyConsumption;
/*      */   }
/*      */ 
/*      */   public void setEnergyConsumption(EnergyConsumptionDimension value)
/*      */   {
/*  805 */     this.energyConsumption = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getEnergyEfficiencyRatioCooling()
/*      */   {
/*  817 */     return this.energyEfficiencyRatioCooling;
/*      */   }
/*      */ 
/*      */   public void setEnergyEfficiencyRatioCooling(BigInteger value)
/*      */   {
/*  829 */     this.energyEfficiencyRatioCooling = value;
/*      */   }
/*      */ 
/*      */   public String getEnvironmentalDescription()
/*      */   {
/*  841 */     return this.environmentalDescription;
/*      */   }
/*      */ 
/*      */   public void setEnvironmentalDescription(String value)
/*      */   {
/*  853 */     this.environmentalDescription = value;
/*      */   }
/*      */ 
/*      */   public EuEnergyEfficiencyClassType getEuEnergyEfficiencyClassHeating()
/*      */   {
/*  865 */     return this.euEnergyEfficiencyClassHeating;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyEfficiencyClassHeating(EuEnergyEfficiencyClassType value)
/*      */   {
/*  877 */     this.euEnergyEfficiencyClassHeating = value;
/*      */   }
/*      */ 
/*      */   public EuEnergyEfficiencyClassType getEuEnergyLabelEfficiencyClass()
/*      */   {
/*  889 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(EuEnergyEfficiencyClassType value)
/*      */   {
/*  901 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public List<String> getExternalTestingCertification()
/*      */   {
/*  927 */     if (this.externalTestingCertification == null) {
/*  928 */       this.externalTestingCertification = new ArrayList();
/*      */     }
/*  930 */     return this.externalTestingCertification;
/*      */   }
/*      */ 
/*      */   public String getCoverage()
/*      */   {
/*  942 */     return this.coverage;
/*      */   }
/*      */ 
/*      */   public void setCoverage(String value)
/*      */   {
/*  954 */     this.coverage = value;
/*      */   }
/*      */ 
/*      */   public String getCutType()
/*      */   {
/*  966 */     return this.cutType;
/*      */   }
/*      */ 
/*      */   public void setCutType(String value)
/*      */   {
/*  978 */     this.cutType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCuttingWidth()
/*      */   {
/*  990 */     return this.cuttingWidth;
/*      */   }
/*      */ 
/*      */   public void setCuttingWidth(LengthDimension value)
/*      */   {
/* 1002 */     this.cuttingWidth = value;
/*      */   }
/*      */ 
/*      */   public String getDeviceType()
/*      */   {
/* 1014 */     return this.deviceType;
/*      */   }
/*      */ 
/*      */   public void setDeviceType(String value)
/*      */   {
/* 1026 */     this.deviceType = value;
/*      */   }
/*      */ 
/*      */   public String getDisplayStyle()
/*      */   {
/* 1038 */     return this.displayStyle;
/*      */   }
/*      */ 
/*      */   public void setDisplayStyle(String value)
/*      */   {
/* 1050 */     this.displayStyle = value;
/*      */   }
/*      */ 
/*      */   public String getFlushType()
/*      */   {
/* 1062 */     return this.flushType;
/*      */   }
/*      */ 
/*      */   public void setFlushType(String value)
/*      */   {
/* 1074 */     this.flushType = value;
/*      */   }
/*      */ 
/*      */   public String getFoldedKnifeSize()
/*      */   {
/* 1086 */     return this.foldedKnifeSize;
/*      */   }
/*      */ 
/*      */   public void setFoldedKnifeSize(String value)
/*      */   {
/* 1098 */     this.foldedKnifeSize = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getGritRating()
/*      */   {
/* 1110 */     return this.gritRating;
/*      */   }
/*      */ 
/*      */   public void setGritRating(BigInteger value)
/*      */   {
/* 1122 */     this.gritRating = value;
/*      */   }
/*      */ 
/*      */   public String getHandleMaterial()
/*      */   {
/* 1134 */     return this.handleMaterial;
/*      */   }
/*      */ 
/*      */   public void setHandleMaterial(String value)
/*      */   {
/* 1146 */     this.handleMaterial = value;
/*      */   }
/*      */ 
/*      */   public String getHeadStyle()
/*      */   {
/* 1158 */     return this.headStyle;
/*      */   }
/*      */ 
/*      */   public void setHeadStyle(String value)
/*      */   {
/* 1170 */     this.headStyle = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getHeaterWattage()
/*      */   {
/* 1182 */     return this.heaterWattage;
/*      */   }
/*      */ 
/*      */   public void setHeaterWattage(WattageDimension value)
/*      */   {
/* 1194 */     this.heaterWattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getInsideDiameter()
/*      */   {
/* 1206 */     return this.insideDiameter;
/*      */   }
/*      */ 
/*      */   public void setInsideDiameter(LengthDimension value)
/*      */   {
/* 1218 */     this.insideDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getLaserBeamColor()
/*      */   {
/* 1230 */     return this.laserBeamColor;
/*      */   }
/*      */ 
/*      */   public void setLaserBeamColor(String value)
/*      */   {
/* 1242 */     this.laserBeamColor = value;
/*      */   }
/*      */ 
/*      */   public MaximumPowerType getMaximumPower()
/*      */   {
/* 1254 */     return this.maximumPower;
/*      */   }
/*      */ 
/*      */   public void setMaximumPower(MaximumPowerType value)
/*      */   {
/* 1266 */     this.maximumPower = value;
/*      */   }
/*      */ 
/*      */   public String getMeasurementAccuracy()
/*      */   {
/* 1278 */     return this.measurementAccuracy;
/*      */   }
/*      */ 
/*      */   public void setMeasurementAccuracy(String value)
/*      */   {
/* 1290 */     this.measurementAccuracy = value;
/*      */   }
/*      */ 
/*      */   public String getMeasurementSystem()
/*      */   {
/* 1302 */     return this.measurementSystem;
/*      */   }
/*      */ 
/*      */   public void setMeasurementSystem(String value)
/*      */   {
/* 1314 */     this.measurementSystem = value;
/*      */   }
/*      */ 
/*      */   public Integer getMinimumEfficiencyReportingValue()
/*      */   {
/* 1326 */     return this.minimumEfficiencyReportingValue;
/*      */   }
/*      */ 
/*      */   public void setMinimumEfficiencyReportingValue(Integer value)
/*      */   {
/* 1338 */     this.minimumEfficiencyReportingValue = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBasins()
/*      */   {
/* 1350 */     return this.numberOfBasins;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBasins(BigInteger value)
/*      */   {
/* 1362 */     this.numberOfBasins = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHoles()
/*      */   {
/* 1374 */     return this.numberOfHoles;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHoles(BigInteger value)
/*      */   {
/* 1386 */     this.numberOfHoles = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfItems()
/*      */   {
/* 1398 */     return this.numberOfItems;
/*      */   }
/*      */ 
/*      */   public void setNumberOfItems(BigInteger value)
/*      */   {
/* 1410 */     this.numberOfItems = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getOutsideDiameter()
/*      */   {
/* 1422 */     return this.outsideDiameter;
/*      */   }
/*      */ 
/*      */   public void setOutsideDiameter(LengthDimension value)
/*      */   {
/* 1434 */     this.outsideDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getPerformanceDescription()
/*      */   {
/* 1446 */     return this.performanceDescription;
/*      */   }
/*      */ 
/*      */   public void setPerformanceDescription(String value)
/*      */   {
/* 1458 */     this.performanceDescription = value;
/*      */   }
/*      */ 
/*      */   public String getPlugFormat()
/*      */   {
/* 1470 */     return this.plugFormat;
/*      */   }
/*      */ 
/*      */   public void setPlugFormat(String value)
/*      */   {
/* 1482 */     this.plugFormat = value;
/*      */   }
/*      */ 
/*      */   public String getPlugProfile()
/*      */   {
/* 1494 */     return this.plugProfile;
/*      */   }
/*      */ 
/*      */   public void setPlugProfile(String value)
/*      */   {
/* 1506 */     this.plugProfile = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getRecycledContentPercentage()
/*      */   {
/* 1518 */     return this.recycledContentPercentage;
/*      */   }
/*      */ 
/*      */   public void setRecycledContentPercentage(BigInteger value)
/*      */   {
/* 1530 */     this.recycledContentPercentage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getRoughIn()
/*      */   {
/* 1542 */     return this.roughIn;
/*      */   }
/*      */ 
/*      */   public void setRoughIn(LengthDimension value)
/*      */   {
/* 1554 */     this.roughIn = value;
/*      */   }
/*      */ 
/*      */   public SpeedDimension getSpeed()
/*      */   {
/* 1566 */     return this.speed;
/*      */   }
/*      */ 
/*      */   public void setSpeed(SpeedDimension value)
/*      */   {
/* 1578 */     this.speed = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpoutHeight()
/*      */   {
/* 1590 */     return this.spoutHeight;
/*      */   }
/*      */ 
/*      */   public void setSpoutHeight(LengthDimension value)
/*      */   {
/* 1602 */     this.spoutHeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpoutReach()
/*      */   {
/* 1614 */     return this.spoutReach;
/*      */   }
/*      */ 
/*      */   public void setSpoutReach(LengthDimension value)
/*      */   {
/* 1626 */     this.spoutReach = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchStyle()
/*      */   {
/* 1638 */     return this.switchStyle;
/*      */   }
/*      */ 
/*      */   public void setSwitchStyle(String value)
/*      */   {
/* 1650 */     this.switchStyle = value;
/*      */   }
/*      */ 
/*      */   public String getSwitchType()
/*      */   {
/* 1662 */     return this.switchType;
/*      */   }
/*      */ 
/*      */   public void setSwitchType(String value)
/*      */   {
/* 1674 */     this.switchType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimensionOptionalUnit getThreadSize()
/*      */   {
/* 1686 */     return this.threadSize;
/*      */   }
/*      */ 
/*      */   public void setThreadSize(LengthDimensionOptionalUnit value)
/*      */   {
/* 1698 */     this.threadSize = value;
/*      */   }
/*      */ 
/*      */   public String getToolTipDescription()
/*      */   {
/* 1710 */     return this.toolTipDescription;
/*      */   }
/*      */ 
/*      */   public void setToolTipDescription(String value)
/*      */   {
/* 1722 */     this.toolTipDescription = value;
/*      */   }
/*      */ 
/*      */   public TorqueType getTorque()
/*      */   {
/* 1734 */     return this.torque;
/*      */   }
/*      */ 
/*      */   public void setTorque(TorqueType value)
/*      */   {
/* 1746 */     this.torque = value;
/*      */   }
/*      */ 
/*      */   public String getUVProtection()
/*      */   {
/* 1758 */     return this.uvProtection;
/*      */   }
/*      */ 
/*      */   public void setUVProtection(String value)
/*      */   {
/* 1770 */     this.uvProtection = value;
/*      */   }
/*      */ 
/*      */   public String getViewingArea()
/*      */   {
/* 1782 */     return this.viewingArea;
/*      */   }
/*      */ 
/*      */   public void setViewingArea(String value)
/*      */   {
/* 1794 */     this.viewingArea = value;
/*      */   }
/*      */ 
/*      */   public String getSize()
/*      */   {
/* 1806 */     return this.size;
/*      */   }
/*      */ 
/*      */   public void setSize(String value)
/*      */   {
/* 1818 */     this.size = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/* 1830 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/* 1842 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/* 1854 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/* 1866 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/* 1878 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/* 1890 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getDisplayVolume()
/*      */   {
/* 1902 */     return this.displayVolume;
/*      */   }
/*      */ 
/*      */   public void setDisplayVolume(VolumeDimension value)
/*      */   {
/* 1914 */     this.displayVolume = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getDisplayWeight()
/*      */   {
/* 1926 */     return this.displayWeight;
/*      */   }
/*      */ 
/*      */   public void setDisplayWeight(WeightDimension value)
/*      */   {
/* 1938 */     this.displayWeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getDisplayLength()
/*      */   {
/* 1950 */     return this.displayLength;
/*      */   }
/*      */ 
/*      */   public void setDisplayLength(LengthDimension value)
/*      */   {
/* 1962 */     this.displayLength = value;
/*      */   }
/*      */ 
/*      */   public String getManufacturerWarrantyDescription()
/*      */   {
/* 1974 */     return this.manufacturerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setManufacturerWarrantyDescription(String value)
/*      */   {
/* 1986 */     this.manufacturerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1998 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 2010 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public Integer getRValue()
/*      */   {
/* 2022 */     return this.rValue;
/*      */   }
/*      */ 
/*      */   public void setRValue(Integer value)
/*      */   {
/* 2034 */     this.rValue = value;
/*      */   }
/*      */ 
/*      */   public String getSellerWarrantyDescription()
/*      */   {
/* 2046 */     return this.sellerWarrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setSellerWarrantyDescription(String value)
/*      */   {
/* 2058 */     this.sellerWarrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getVoltage()
/*      */   {
/* 2070 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigDecimal value)
/*      */   {
/* 2082 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit getWattage()
/*      */   {
/* 2094 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageDimensionOptionalUnit value)
/*      */   {
/* 2106 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getCustomerPackageType()
/*      */   {
/* 2118 */     return this.customerPackageType;
/*      */   }
/*      */ 
/*      */   public void setCustomerPackageType(String value)
/*      */   {
/* 2130 */     this.customerPackageType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseDiameter()
/*      */   {
/* 2142 */     return this.baseDiameter;
/*      */   }
/*      */ 
/*      */   public void setBaseDiameter(LengthDimension value)
/*      */   {
/* 2154 */     this.baseDiameter = value;
/*      */   }
/*      */ 
/*      */   public DegreeDimension getBeamAngle()
/*      */   {
/* 2166 */     return this.beamAngle;
/*      */   }
/*      */ 
/*      */   public void setBeamAngle(DegreeDimension value)
/*      */   {
/* 2178 */     this.beamAngle = value;
/*      */   }
/*      */ 
/*      */   public String getBladeColor()
/*      */   {
/* 2190 */     return this.bladeColor;
/*      */   }
/*      */ 
/*      */   public void setBladeColor(String value)
/*      */   {
/* 2202 */     this.bladeColor = value;
/*      */   }
/*      */ 
/*      */   public String getCircuitBreakerType()
/*      */   {
/* 2214 */     return this.circuitBreakerType;
/*      */   }
/*      */ 
/*      */   public void setCircuitBreakerType(String value)
/*      */   {
/* 2226 */     this.circuitBreakerType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 2238 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 2250 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   public String getInternationalProtectionRating()
/*      */   {
/* 2262 */     return this.internationalProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setInternationalProtectionRating(String value)
/*      */   {
/* 2274 */     this.internationalProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public TimeDimension getLightSourceOperatingLife()
/*      */   {
/* 2286 */     return this.lightSourceOperatingLife;
/*      */   }
/*      */ 
/*      */   public void setLightSourceOperatingLife(TimeDimension value)
/*      */   {
/* 2298 */     this.lightSourceOperatingLife = value;
/*      */   }
/*      */ 
/*      */   public String getLightingMethod()
/*      */   {
/* 2310 */     return this.lightingMethod;
/*      */   }
/*      */ 
/*      */   public void setLightingMethod(String value)
/*      */   {
/* 2322 */     this.lightingMethod = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getMaximumCompatibleLightSourceWattage()
/*      */   {
/* 2334 */     return this.maximumCompatibleLightSourceWattage;
/*      */   }
/*      */ 
/*      */   public void setMaximumCompatibleLightSourceWattage(WattageDimension value)
/*      */   {
/* 2346 */     this.maximumCompatibleLightSourceWattage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfBlades()
/*      */   {
/* 2358 */     return this.numberOfBlades;
/*      */   }
/*      */ 
/*      */   public void setNumberOfBlades(BigInteger value)
/*      */   {
/* 2370 */     this.numberOfBlades = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfLightSources()
/*      */   {
/* 2382 */     return this.numberOfLightSources;
/*      */   }
/*      */ 
/*      */   public void setNumberOfLightSources(BigInteger value)
/*      */   {
/* 2394 */     this.numberOfLightSources = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getShadeDiameter()
/*      */   {
/* 2406 */     return this.shadeDiameter;
/*      */   }
/*      */ 
/*      */   public void setShadeDiameter(LengthDimension value)
/*      */   {
/* 2418 */     this.shadeDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getShadeMaterialType()
/*      */   {
/* 2430 */     return this.shadeMaterialType;
/*      */   }
/*      */ 
/*      */   public void setShadeMaterialType(String value)
/*      */   {
/* 2442 */     this.shadeMaterialType = value;
/*      */   }
/*      */ 
/*      */   public String getShortProductDescription()
/*      */   {
/* 2454 */     return this.shortProductDescription;
/*      */   }
/*      */ 
/*      */   public void setShortProductDescription(String value)
/*      */   {
/* 2466 */     this.shortProductDescription = value;
/*      */   }
/*      */ 
/*      */   public String getStartUpTimeDescription()
/*      */   {
/* 2478 */     return this.startUpTimeDescription;
/*      */   }
/*      */ 
/*      */   public void setStartUpTimeDescription(String value)
/*      */   {
/* 2490 */     this.startUpTimeDescription = value;
/*      */   }
/*      */ 
/*      */   public String getStrands()
/*      */   {
/* 2502 */     return this.strands;
/*      */   }
/*      */ 
/*      */   public void setStrands(String value)
/*      */   {
/* 2514 */     this.strands = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getTubingOutsideDiameter()
/*      */   {
/* 2526 */     return this.tubingOutsideDiameter;
/*      */   }
/*      */ 
/*      */   public void setTubingOutsideDiameter(LengthDimension value)
/*      */   {
/* 2538 */     this.tubingOutsideDiameter = value;
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
/* 2609 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 2621 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 2633 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 2645 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BuildingMaterials
 * JD-Core Version:    0.6.2
 */