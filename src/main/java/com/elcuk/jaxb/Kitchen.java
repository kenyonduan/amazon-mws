/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"battery", "bladeType", "batteryCellComposition", "batteryFormFactor", "bladeMaterial", "bladeLength", "canShipInOriginalContainer", "colorMap", "finish", "identityPackageType", "isStainResistant", "material", "maximumCoverageArea", "numberOfSets", "occasionType", "outputCapacity", "pieceCount", "shape", "threadCount", "towelWeight", "variationData", "wattage", "compatibleDevices", "maximumWeightCapacity", "noiseLevel", "kitchenOutputCapacity", "runtime", "specificUsesForProduct", "annualEnergyConsumption", "euEnergyLabelEfficiencyClass", "hasAutomaticShutoff", "numberOfSpeeds", "kitchenOperatingPressure", "powerSourceType", "vacuumCleanerCarpetCleaningClass", "vacuumCleanerDustReemissionClass", "vacuumCleanerHardfloorCleaningClass", "itemDiameter", "efficiency"})
/*      */ @XmlRootElement(name="Kitchen")
/*      */ public class Kitchen
/*      */ {
/*      */ 
/*      */   @XmlElement(name="Battery")
/*      */   protected Battery battery;
/*      */ 
/*      */   @XmlElement(name="BladeType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bladeType;
/*      */ 
/*      */   @XmlElement(name="BatteryCellComposition")
/*      */   protected BatteryCellTypeValues batteryCellComposition;
/*      */ 
/*      */   @XmlElement(name="BatteryFormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String batteryFormFactor;
/*      */ 
/*      */   @XmlElement(name="BladeMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String bladeMaterial;
/*      */ 
/*      */   @XmlElement(name="BladeLength")
/*      */   protected LengthDimension bladeLength;
/*      */ 
/*      */   @XmlElement(name="CanShipInOriginalContainer")
/*      */   protected Boolean canShipInOriginalContainer;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
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
/*      */   @XmlElement(name="OccasionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String occasionType;
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
/*      */   @XmlElement(name="CompatibleDevices")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String compatibleDevices;
/*      */ 
/*      */   @XmlElement(name="MaximumWeightCapacity")
/*      */   protected WeightDimension maximumWeightCapacity;
/*      */ 
/*      */   @XmlElement(name="NoiseLevel")
/*      */   protected NoiseLevelDimension noiseLevel;
/*      */ 
/*      */   @XmlElement(name="KitchenOutputCapacity")
/*      */   protected VolumeAndVolumeRateDimension kitchenOutputCapacity;
/*      */ 
/*      */   @XmlElement(name="Runtime")
/*      */   protected BigInteger runtime;
/*      */ 
/*      */   @XmlElement(name="SpecificUsesForProduct")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String specificUsesForProduct;
/*      */ 
/*      */   @XmlElement(name="AnnualEnergyConsumption")
/*      */   protected EnergyConsumptionDimension annualEnergyConsumption;
/*      */ 
/*      */   @XmlElement(name="EuEnergyLabelEfficiencyClass")
/*      */   protected EnergyLabelEfficiencyClass euEnergyLabelEfficiencyClass;
/*      */ 
/*      */   @XmlElement(name="HasAutomaticShutoff")
/*      */   protected Boolean hasAutomaticShutoff;
/*      */ 
/*      */   @XmlElement(name="NumberOfSpeeds")
/*      */   protected BigInteger numberOfSpeeds;
/*      */ 
/*      */   @XmlElement(name="KitchenOperatingPressure")
/*      */   protected PressureDimension kitchenOperatingPressure;
/*      */ 
/*      */   @XmlElement(name="PowerSourceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSourceType;
/*      */ 
/*      */   @XmlElement(name="VacuumCleanerCarpetCleaningClass")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String vacuumCleanerCarpetCleaningClass;
/*      */ 
/*      */   @XmlElement(name="VacuumCleanerDustReemissionClass")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String vacuumCleanerDustReemissionClass;
/*      */ 
/*      */   @XmlElement(name="VacuumCleanerHardfloorCleaningClass")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String vacuumCleanerHardfloorCleaningClass;
/*      */ 
/*      */   @XmlElement(name="ItemDiameter")
/*      */   protected LengthDimension itemDiameter;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   public Battery getBattery()
/*      */   {
/*  346 */     return this.battery;
/*      */   }
/*      */ 
/*      */   public void setBattery(Battery value)
/*      */   {
/*  358 */     this.battery = value;
/*      */   }
/*      */ 
/*      */   public String getBladeType()
/*      */   {
/*  370 */     return this.bladeType;
/*      */   }
/*      */ 
/*      */   public void setBladeType(String value)
/*      */   {
/*  382 */     this.bladeType = value;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellComposition()
/*      */   {
/*  394 */     return this.batteryCellComposition;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellComposition(BatteryCellTypeValues value)
/*      */   {
/*  406 */     this.batteryCellComposition = value;
/*      */   }
/*      */ 
/*      */   public String getBatteryFormFactor()
/*      */   {
/*  418 */     return this.batteryFormFactor;
/*      */   }
/*      */ 
/*      */   public void setBatteryFormFactor(String value)
/*      */   {
/*  430 */     this.batteryFormFactor = value;
/*      */   }
/*      */ 
/*      */   public String getBladeMaterial()
/*      */   {
/*  442 */     return this.bladeMaterial;
/*      */   }
/*      */ 
/*      */   public void setBladeMaterial(String value)
/*      */   {
/*  454 */     this.bladeMaterial = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBladeLength()
/*      */   {
/*  466 */     return this.bladeLength;
/*      */   }
/*      */ 
/*      */   public void setBladeLength(LengthDimension value)
/*      */   {
/*  478 */     this.bladeLength = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/*  490 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/*  502 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  514 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  526 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getFinish()
/*      */   {
/*  538 */     return this.finish;
/*      */   }
/*      */ 
/*      */   public void setFinish(String value)
/*      */   {
/*  550 */     this.finish = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/*  562 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/*  574 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public Boolean isIsStainResistant()
/*      */   {
/*  586 */     return this.isStainResistant;
/*      */   }
/*      */ 
/*      */   public void setIsStainResistant(Boolean value)
/*      */   {
/*  598 */     this.isStainResistant = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/*  610 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/*  622 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public AreaDimensionOptionalUnit getMaximumCoverageArea()
/*      */   {
/*  634 */     return this.maximumCoverageArea;
/*      */   }
/*      */ 
/*      */   public void setMaximumCoverageArea(AreaDimensionOptionalUnit value)
/*      */   {
/*  646 */     this.maximumCoverageArea = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSets()
/*      */   {
/*  658 */     return this.numberOfSets;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSets(BigInteger value)
/*      */   {
/*  670 */     this.numberOfSets = value;
/*      */   }
/*      */ 
/*      */   public String getOccasionType()
/*      */   {
/*  682 */     return this.occasionType;
/*      */   }
/*      */ 
/*      */   public void setOccasionType(String value)
/*      */   {
/*  694 */     this.occasionType = value;
/*      */   }
/*      */ 
/*      */   public VolumeRateDimension getOutputCapacity()
/*      */   {
/*  706 */     return this.outputCapacity;
/*      */   }
/*      */ 
/*      */   public void setOutputCapacity(VolumeRateDimension value)
/*      */   {
/*  718 */     this.outputCapacity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getPieceCount()
/*      */   {
/*  730 */     return this.pieceCount;
/*      */   }
/*      */ 
/*      */   public void setPieceCount(BigInteger value)
/*      */   {
/*  742 */     this.pieceCount = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/*  754 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/*  766 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getThreadCount()
/*      */   {
/*  778 */     return this.threadCount;
/*      */   }
/*      */ 
/*      */   public void setThreadCount(BigInteger value)
/*      */   {
/*  790 */     this.threadCount = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getTowelWeight()
/*      */   {
/*  802 */     return this.towelWeight;
/*      */   }
/*      */ 
/*      */   public void setTowelWeight(WeightDimension value)
/*      */   {
/*  814 */     this.towelWeight = value;
/*      */   }
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  826 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  838 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit getWattage()
/*      */   {
/*  850 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageDimensionOptionalUnit value)
/*      */   {
/*  862 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleDevices()
/*      */   {
/*  874 */     return this.compatibleDevices;
/*      */   }
/*      */ 
/*      */   public void setCompatibleDevices(String value)
/*      */   {
/*  886 */     this.compatibleDevices = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMaximumWeightCapacity()
/*      */   {
/*  898 */     return this.maximumWeightCapacity;
/*      */   }
/*      */ 
/*      */   public void setMaximumWeightCapacity(WeightDimension value)
/*      */   {
/*  910 */     this.maximumWeightCapacity = value;
/*      */   }
/*      */ 
/*      */   public NoiseLevelDimension getNoiseLevel()
/*      */   {
/*  922 */     return this.noiseLevel;
/*      */   }
/*      */ 
/*      */   public void setNoiseLevel(NoiseLevelDimension value)
/*      */   {
/*  934 */     this.noiseLevel = value;
/*      */   }
/*      */ 
/*      */   public VolumeAndVolumeRateDimension getKitchenOutputCapacity()
/*      */   {
/*  946 */     return this.kitchenOutputCapacity;
/*      */   }
/*      */ 
/*      */   public void setKitchenOutputCapacity(VolumeAndVolumeRateDimension value)
/*      */   {
/*  958 */     this.kitchenOutputCapacity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getRuntime()
/*      */   {
/*  970 */     return this.runtime;
/*      */   }
/*      */ 
/*      */   public void setRuntime(BigInteger value)
/*      */   {
/*  982 */     this.runtime = value;
/*      */   }
/*      */ 
/*      */   public String getSpecificUsesForProduct()
/*      */   {
/*  994 */     return this.specificUsesForProduct;
/*      */   }
/*      */ 
/*      */   public void setSpecificUsesForProduct(String value)
/*      */   {
/* 1006 */     this.specificUsesForProduct = value;
/*      */   }
/*      */ 
/*      */   public EnergyConsumptionDimension getAnnualEnergyConsumption()
/*      */   {
/* 1018 */     return this.annualEnergyConsumption;
/*      */   }
/*      */ 
/*      */   public void setAnnualEnergyConsumption(EnergyConsumptionDimension value)
/*      */   {
/* 1030 */     this.annualEnergyConsumption = value;
/*      */   }
/*      */ 
/*      */   public EnergyLabelEfficiencyClass getEuEnergyLabelEfficiencyClass()
/*      */   {
/* 1042 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(EnergyLabelEfficiencyClass value)
/*      */   {
/* 1054 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public Boolean isHasAutomaticShutoff()
/*      */   {
/* 1066 */     return this.hasAutomaticShutoff;
/*      */   }
/*      */ 
/*      */   public void setHasAutomaticShutoff(Boolean value)
/*      */   {
/* 1078 */     this.hasAutomaticShutoff = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSpeeds()
/*      */   {
/* 1090 */     return this.numberOfSpeeds;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSpeeds(BigInteger value)
/*      */   {
/* 1102 */     this.numberOfSpeeds = value;
/*      */   }
/*      */ 
/*      */   public PressureDimension getKitchenOperatingPressure()
/*      */   {
/* 1114 */     return this.kitchenOperatingPressure;
/*      */   }
/*      */ 
/*      */   public void setKitchenOperatingPressure(PressureDimension value)
/*      */   {
/* 1126 */     this.kitchenOperatingPressure = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSourceType()
/*      */   {
/* 1138 */     return this.powerSourceType;
/*      */   }
/*      */ 
/*      */   public void setPowerSourceType(String value)
/*      */   {
/* 1150 */     this.powerSourceType = value;
/*      */   }
/*      */ 
/*      */   public String getVacuumCleanerCarpetCleaningClass()
/*      */   {
/* 1162 */     return this.vacuumCleanerCarpetCleaningClass;
/*      */   }
/*      */ 
/*      */   public void setVacuumCleanerCarpetCleaningClass(String value)
/*      */   {
/* 1174 */     this.vacuumCleanerCarpetCleaningClass = value;
/*      */   }
/*      */ 
/*      */   public String getVacuumCleanerDustReemissionClass()
/*      */   {
/* 1186 */     return this.vacuumCleanerDustReemissionClass;
/*      */   }
/*      */ 
/*      */   public void setVacuumCleanerDustReemissionClass(String value)
/*      */   {
/* 1198 */     this.vacuumCleanerDustReemissionClass = value;
/*      */   }
/*      */ 
/*      */   public String getVacuumCleanerHardfloorCleaningClass()
/*      */   {
/* 1210 */     return this.vacuumCleanerHardfloorCleaningClass;
/*      */   }
/*      */ 
/*      */   public void setVacuumCleanerHardfloorCleaningClass(String value)
/*      */   {
/* 1222 */     this.vacuumCleanerHardfloorCleaningClass = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getItemDiameter()
/*      */   {
/* 1234 */     return this.itemDiameter;
/*      */   }
/*      */ 
/*      */   public void setItemDiameter(LengthDimension value)
/*      */   {
/* 1246 */     this.itemDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 1258 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 1270 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"variationTheme", "size", "color", "styleName", "customerPackageType"})
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
/*      */     @XmlElement(name="CustomerPackageType")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String customerPackageType;
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 1435 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 1447 */       this.variationTheme = value;
/*      */     }
/*      */ 
/*      */     public String getSize()
/*      */     {
/* 1459 */       return this.size;
/*      */     }
/*      */ 
/*      */     public void setSize(String value)
/*      */     {
/* 1471 */       this.size = value;
/*      */     }
/*      */ 
/*      */     public String getColor()
/*      */     {
/* 1483 */       return this.color;
/*      */     }
/*      */ 
/*      */     public void setColor(String value)
/*      */     {
/* 1495 */       this.color = value;
/*      */     }
/*      */ 
/*      */     public String getStyleName()
/*      */     {
/* 1507 */       return this.styleName;
/*      */     }
/*      */ 
/*      */     public void setStyleName(String value)
/*      */     {
/* 1519 */       this.styleName = value;
/*      */     }
/*      */ 
/*      */     public String getCustomerPackageType()
/*      */     {
/* 1531 */       return this.customerPackageType;
/*      */     }
/*      */ 
/*      */     public void setCustomerPackageType(String value)
/*      */     {
/* 1543 */       this.customerPackageType = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Kitchen
 * JD-Core Version:    0.6.2
 */