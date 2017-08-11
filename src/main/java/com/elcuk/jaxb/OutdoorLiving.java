/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
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
/*      */ @XmlType(name="", propOrder={"battery", "canShipInOriginalContainer", "colorMap", "engineType", "identityPackageType", "isStainResistant", "hoseLength", "material", "numberOfSets", "poolType", "powerSource", "theme", "variationData", "wattage", "voltage", "threadCount", "itemForm", "cuttingLengthDerived", "cutType", "outerMaterialType", "warrantyDescription", "unitCount", "shape", "installationType", "efficiency", "outputCapacity", "batteryWeight", "cuttingWidth", "occasionType"})
/*      */ @XmlRootElement(name="OutdoorLiving")
/*      */ public class OutdoorLiving
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
/*      */   @XmlElement(name="EngineType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String engineType;
/*      */ 
/*      */   @XmlElement(name="IdentityPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String identityPackageType;
/*      */ 
/*      */   @XmlElement(name="IsStainResistant")
/*      */   protected Boolean isStainResistant;
/*      */ 
/*      */   @XmlElement(name="HoseLength")
/*      */   protected LengthDimension hoseLength;
/*      */ 
/*      */   @XmlElement(name="Material")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String material;
/*      */ 
/*      */   @XmlElement(name="NumberOfSets")
/*      */   protected BigInteger numberOfSets;
/*      */ 
/*      */   @XmlElement(name="PoolType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String poolType;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="Theme")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String theme;
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected WattageDimensionOptionalUnit wattage;
/*      */ 
/*      */   @XmlElement(name="Voltage")
/*      */   protected BigInteger voltage;
/*      */ 
/*      */   @XmlElement(name="ThreadCount")
/*      */   protected BigInteger threadCount;
/*      */ 
/*      */   @XmlElement(name="ItemForm")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String itemForm;
/*      */ 
/*      */   @XmlElement(name="CuttingLengthDerived")
/*      */   protected LengthDimension cuttingLengthDerived;
/*      */ 
/*      */   @XmlElement(name="CutType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cutType;
/*      */ 
/*      */   @XmlElement(name="OuterMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String outerMaterialType;
/*      */ 
/*      */   @XmlElement(name="WarrantyDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String warrantyDescription;
/*      */ 
/*      */   @XmlElement(name="UnitCount")
/*      */   protected UnitCount unitCount;
/*      */ 
/*      */   @XmlElement(name="Shape")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shape;
/*      */ 
/*      */   @XmlElement(name="InstallationType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String installationType;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   @XmlElement(name="OutputCapacity")
/*      */   protected VolumeRateDimension outputCapacity;
/*      */ 
/*      */   @XmlElement(name="BatteryWeight")
/*      */   protected WeightDimension batteryWeight;
/*      */ 
/*      */   @XmlElement(name="CuttingWidth")
/*      */   protected LengthDimension cuttingWidth;
/*      */ 
/*      */   @XmlElement(name="OccasionType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String occasionType;
/*      */ 
/*      */   public Battery getBattery()
/*      */   {
/*  320 */     return this.battery;
/*      */   }
/*      */ 
/*      */   public void setBattery(Battery value)
/*      */   {
/*  332 */     this.battery = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/*  344 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/*  356 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/*  368 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/*  380 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getEngineType()
/*      */   {
/*  392 */     return this.engineType;
/*      */   }
/*      */ 
/*      */   public void setEngineType(String value)
/*      */   {
/*  404 */     this.engineType = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/*  416 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/*  428 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public Boolean isIsStainResistant()
/*      */   {
/*  440 */     return this.isStainResistant;
/*      */   }
/*      */ 
/*      */   public void setIsStainResistant(Boolean value)
/*      */   {
/*  452 */     this.isStainResistant = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getHoseLength()
/*      */   {
/*  464 */     return this.hoseLength;
/*      */   }
/*      */ 
/*      */   public void setHoseLength(LengthDimension value)
/*      */   {
/*  476 */     this.hoseLength = value;
/*      */   }
/*      */ 
/*      */   public String getMaterial()
/*      */   {
/*  488 */     return this.material;
/*      */   }
/*      */ 
/*      */   public void setMaterial(String value)
/*      */   {
/*  500 */     this.material = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSets()
/*      */   {
/*  512 */     return this.numberOfSets;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSets(BigInteger value)
/*      */   {
/*  524 */     this.numberOfSets = value;
/*      */   }
/*      */ 
/*      */   public String getPoolType()
/*      */   {
/*  536 */     return this.poolType;
/*      */   }
/*      */ 
/*      */   public void setPoolType(String value)
/*      */   {
/*  548 */     this.poolType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  560 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  572 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getTheme()
/*      */   {
/*  584 */     return this.theme;
/*      */   }
/*      */ 
/*      */   public void setTheme(String value)
/*      */   {
/*  596 */     this.theme = value;
/*      */   }
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/*  608 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/*  620 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit getWattage()
/*      */   {
/*  632 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageDimensionOptionalUnit value)
/*      */   {
/*  644 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getVoltage()
/*      */   {
/*  656 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(BigInteger value)
/*      */   {
/*  668 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getThreadCount()
/*      */   {
/*  680 */     return this.threadCount;
/*      */   }
/*      */ 
/*      */   public void setThreadCount(BigInteger value)
/*      */   {
/*  692 */     this.threadCount = value;
/*      */   }
/*      */ 
/*      */   public String getItemForm()
/*      */   {
/*  704 */     return this.itemForm;
/*      */   }
/*      */ 
/*      */   public void setItemForm(String value)
/*      */   {
/*  716 */     this.itemForm = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCuttingLengthDerived()
/*      */   {
/*  728 */     return this.cuttingLengthDerived;
/*      */   }
/*      */ 
/*      */   public void setCuttingLengthDerived(LengthDimension value)
/*      */   {
/*  740 */     this.cuttingLengthDerived = value;
/*      */   }
/*      */ 
/*      */   public String getCutType()
/*      */   {
/*  752 */     return this.cutType;
/*      */   }
/*      */ 
/*      */   public void setCutType(String value)
/*      */   {
/*  764 */     this.cutType = value;
/*      */   }
/*      */ 
/*      */   public String getOuterMaterialType()
/*      */   {
/*  776 */     return this.outerMaterialType;
/*      */   }
/*      */ 
/*      */   public void setOuterMaterialType(String value)
/*      */   {
/*  788 */     this.outerMaterialType = value;
/*      */   }
/*      */ 
/*      */   public String getWarrantyDescription()
/*      */   {
/*  800 */     return this.warrantyDescription;
/*      */   }
/*      */ 
/*      */   public void setWarrantyDescription(String value)
/*      */   {
/*  812 */     this.warrantyDescription = value;
/*      */   }
/*      */ 
/*      */   public UnitCount getUnitCount()
/*      */   {
/*  824 */     return this.unitCount;
/*      */   }
/*      */ 
/*      */   public void setUnitCount(UnitCount value)
/*      */   {
/*  836 */     this.unitCount = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/*  848 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/*  860 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getInstallationType()
/*      */   {
/*  872 */     return this.installationType;
/*      */   }
/*      */ 
/*      */   public void setInstallationType(String value)
/*      */   {
/*  884 */     this.installationType = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/*  896 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/*  908 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   public VolumeRateDimension getOutputCapacity()
/*      */   {
/*  920 */     return this.outputCapacity;
/*      */   }
/*      */ 
/*      */   public void setOutputCapacity(VolumeRateDimension value)
/*      */   {
/*  932 */     this.outputCapacity = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getBatteryWeight()
/*      */   {
/*  944 */     return this.batteryWeight;
/*      */   }
/*      */ 
/*      */   public void setBatteryWeight(WeightDimension value)
/*      */   {
/*  956 */     this.batteryWeight = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCuttingWidth()
/*      */   {
/*  968 */     return this.cuttingWidth;
/*      */   }
/*      */ 
/*      */   public void setCuttingWidth(LengthDimension value)
/*      */   {
/*  980 */     this.cuttingWidth = value;
/*      */   }
/*      */ 
/*      */   public String getOccasionType()
/*      */   {
/*  992 */     return this.occasionType;
/*      */   }
/*      */ 
/*      */   public void setOccasionType(String value)
/*      */   {
/* 1004 */     this.occasionType = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"variationTheme", "size", "color", "styleName", "scentName", "customerPackageType", "metalType"})
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
/*      */     @XmlElement(name="MetalType")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String metalType;
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 1262 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 1274 */       this.variationTheme = value;
/*      */     }
/*      */ 
/*      */     public String getSize()
/*      */     {
/* 1286 */       return this.size;
/*      */     }
/*      */ 
/*      */     public void setSize(String value)
/*      */     {
/* 1298 */       this.size = value;
/*      */     }
/*      */ 
/*      */     public String getColor()
/*      */     {
/* 1310 */       return this.color;
/*      */     }
/*      */ 
/*      */     public void setColor(String value)
/*      */     {
/* 1322 */       this.color = value;
/*      */     }
/*      */ 
/*      */     public String getStyleName()
/*      */     {
/* 1334 */       return this.styleName;
/*      */     }
/*      */ 
/*      */     public void setStyleName(String value)
/*      */     {
/* 1346 */       this.styleName = value;
/*      */     }
/*      */ 
/*      */     public String getScentName()
/*      */     {
/* 1358 */       return this.scentName;
/*      */     }
/*      */ 
/*      */     public void setScentName(String value)
/*      */     {
/* 1370 */       this.scentName = value;
/*      */     }
/*      */ 
/*      */     public String getCustomerPackageType()
/*      */     {
/* 1382 */       return this.customerPackageType;
/*      */     }
/*      */ 
/*      */     public void setCustomerPackageType(String value)
/*      */     {
/* 1394 */       this.customerPackageType = value;
/*      */     }
/*      */ 
/*      */     public String getMetalType()
/*      */     {
/* 1406 */       return this.metalType;
/*      */     }
/*      */ 
/*      */     public void setMetalType(String value)
/*      */     {
/* 1418 */       this.metalType = value;
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
/* 1047 */       return this.value;
/*      */     }
/*      */ 
/*      */     public void setValue(BigInteger value)
/*      */     {
/* 1059 */       this.value = value;
/*      */     }
/*      */ 
/*      */     public String getUnitOfMeasure()
/*      */     {
/* 1071 */       return this.unitOfMeasure;
/*      */     }
/*      */ 
/*      */     public void setUnitOfMeasure(String value)
/*      */     {
/* 1083 */       this.unitOfMeasure = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OutdoorLiving
 * JD-Core Version:    0.6.2
 */