/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"productType", "hiCommon", "battery", "batteryAverageLife", "batteryAverageLifeStandby", "batteryChargeTime", "batteryTypeLithiumIon", "batteryTypeLithiumMetal", "countryOfOrigin", "itemDisplayArea", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "mfrWarrantyDescriptionLabor", "mfrWarrantyDescriptionParts", "mfrWarrantyDescriptionType", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "warnings"})
/*     */ @XmlRootElement(name="HomeImprovement")
/*     */ public class HomeImprovement
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ProductType", required=true)
/*     */   protected ProductType productType;
/*     */ 
/*     */   @XmlElement(name="HICommon")
/*     */   protected HICommon hiCommon;
/*     */ 
/*     */   @XmlElement(name="Battery")
/*     */   protected Battery battery;
/*     */ 
/*     */   @XmlElement(name="BatteryAverageLife")
/*     */   protected BigDecimal batteryAverageLife;
/*     */ 
/*     */   @XmlElement(name="BatteryAverageLifeStandby")
/*     */   protected BigDecimal batteryAverageLifeStandby;
/*     */ 
/*     */   @XmlElement(name="BatteryChargeTime")
/*     */   protected BigDecimal batteryChargeTime;
/*     */ 
/*     */   @XmlElement(name="BatteryTypeLithiumIon")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryTypeLithiumIon;
/*     */ 
/*     */   @XmlElement(name="BatteryTypeLithiumMetal")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryTypeLithiumMetal;
/*     */ 
/*     */   @XmlElement(name="CountryOfOrigin")
/*     */   protected String countryOfOrigin;
/*     */ 
/*     */   @XmlElement(name="ItemDisplayArea")
/*     */   protected AreaDimension itemDisplayArea;
/*     */ 
/*     */   @XmlElement(name="LithiumBatteryEnergyContent")
/*     */   protected BigDecimal lithiumBatteryEnergyContent;
/*     */ 
/*     */   @XmlElement(name="LithiumBatteryPackaging")
/*     */   protected String lithiumBatteryPackaging;
/*     */ 
/*     */   @XmlElement(name="LithiumBatteryVoltage")
/*     */   protected BigDecimal lithiumBatteryVoltage;
/*     */ 
/*     */   @XmlElement(name="LithiumBatteryWeight")
/*     */   protected BigDecimal lithiumBatteryWeight;
/*     */ 
/*     */   @XmlElement(name="MfrWarrantyDescriptionLabor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mfrWarrantyDescriptionLabor;
/*     */ 
/*     */   @XmlElement(name="MfrWarrantyDescriptionParts")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mfrWarrantyDescriptionParts;
/*     */ 
/*     */   @XmlElement(name="MfrWarrantyDescriptionType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mfrWarrantyDescriptionType;
/*     */ 
/*     */   @XmlElement(name="NumberOfLithiumIonCells")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLithiumIonCells;
/*     */ 
/*     */   @XmlElement(name="NumberOfLithiumMetalCells")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLithiumMetalCells;
/*     */ 
/*     */   @XmlElement(name="Warnings")
/*     */   protected Object warnings;
/*     */ 
/*     */   public ProductType getProductType()
/*     */   {
/* 162 */     return this.productType;
/*     */   }
/*     */ 
/*     */   public void setProductType(ProductType value)
/*     */   {
/* 174 */     this.productType = value;
/*     */   }
/*     */ 
/*     */   public HICommon getHICommon()
/*     */   {
/* 186 */     return this.hiCommon;
/*     */   }
/*     */ 
/*     */   public void setHICommon(HICommon value)
/*     */   {
/* 198 */     this.hiCommon = value;
/*     */   }
/*     */ 
/*     */   public Battery getBattery()
/*     */   {
/* 210 */     return this.battery;
/*     */   }
/*     */ 
/*     */   public void setBattery(Battery value)
/*     */   {
/* 222 */     this.battery = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getBatteryAverageLife()
/*     */   {
/* 234 */     return this.batteryAverageLife;
/*     */   }
/*     */ 
/*     */   public void setBatteryAverageLife(BigDecimal value)
/*     */   {
/* 246 */     this.batteryAverageLife = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getBatteryAverageLifeStandby()
/*     */   {
/* 258 */     return this.batteryAverageLifeStandby;
/*     */   }
/*     */ 
/*     */   public void setBatteryAverageLifeStandby(BigDecimal value)
/*     */   {
/* 270 */     this.batteryAverageLifeStandby = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getBatteryChargeTime()
/*     */   {
/* 282 */     return this.batteryChargeTime;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeTime(BigDecimal value)
/*     */   {
/* 294 */     this.batteryChargeTime = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryTypeLithiumIon()
/*     */   {
/* 306 */     return this.batteryTypeLithiumIon;
/*     */   }
/*     */ 
/*     */   public void setBatteryTypeLithiumIon(BigInteger value)
/*     */   {
/* 318 */     this.batteryTypeLithiumIon = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryTypeLithiumMetal()
/*     */   {
/* 330 */     return this.batteryTypeLithiumMetal;
/*     */   }
/*     */ 
/*     */   public void setBatteryTypeLithiumMetal(BigInteger value)
/*     */   {
/* 342 */     this.batteryTypeLithiumMetal = value;
/*     */   }
/*     */ 
/*     */   public String getCountryOfOrigin()
/*     */   {
/* 354 */     return this.countryOfOrigin;
/*     */   }
/*     */ 
/*     */   public void setCountryOfOrigin(String value)
/*     */   {
/* 366 */     this.countryOfOrigin = value;
/*     */   }
/*     */ 
/*     */   public AreaDimension getItemDisplayArea()
/*     */   {
/* 378 */     return this.itemDisplayArea;
/*     */   }
/*     */ 
/*     */   public void setItemDisplayArea(AreaDimension value)
/*     */   {
/* 390 */     this.itemDisplayArea = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryEnergyContent()
/*     */   {
/* 402 */     return this.lithiumBatteryEnergyContent;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*     */   {
/* 414 */     this.lithiumBatteryEnergyContent = value;
/*     */   }
/*     */ 
/*     */   public String getLithiumBatteryPackaging()
/*     */   {
/* 426 */     return this.lithiumBatteryPackaging;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryPackaging(String value)
/*     */   {
/* 438 */     this.lithiumBatteryPackaging = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryVoltage()
/*     */   {
/* 450 */     return this.lithiumBatteryVoltage;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryVoltage(BigDecimal value)
/*     */   {
/* 462 */     this.lithiumBatteryVoltage = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryWeight()
/*     */   {
/* 474 */     return this.lithiumBatteryWeight;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryWeight(BigDecimal value)
/*     */   {
/* 486 */     this.lithiumBatteryWeight = value;
/*     */   }
/*     */ 
/*     */   public String getMfrWarrantyDescriptionLabor()
/*     */   {
/* 498 */     return this.mfrWarrantyDescriptionLabor;
/*     */   }
/*     */ 
/*     */   public void setMfrWarrantyDescriptionLabor(String value)
/*     */   {
/* 510 */     this.mfrWarrantyDescriptionLabor = value;
/*     */   }
/*     */ 
/*     */   public String getMfrWarrantyDescriptionParts()
/*     */   {
/* 522 */     return this.mfrWarrantyDescriptionParts;
/*     */   }
/*     */ 
/*     */   public void setMfrWarrantyDescriptionParts(String value)
/*     */   {
/* 534 */     this.mfrWarrantyDescriptionParts = value;
/*     */   }
/*     */ 
/*     */   public String getMfrWarrantyDescriptionType()
/*     */   {
/* 546 */     return this.mfrWarrantyDescriptionType;
/*     */   }
/*     */ 
/*     */   public void setMfrWarrantyDescriptionType(String value)
/*     */   {
/* 558 */     this.mfrWarrantyDescriptionType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLithiumIonCells()
/*     */   {
/* 570 */     return this.numberOfLithiumIonCells;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLithiumIonCells(BigInteger value)
/*     */   {
/* 582 */     this.numberOfLithiumIonCells = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLithiumMetalCells()
/*     */   {
/* 594 */     return this.numberOfLithiumMetalCells;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*     */   {
/* 606 */     this.numberOfLithiumMetalCells = value;
/*     */   }
/*     */ 
/*     */   public Object getWarnings()
/*     */   {
/* 618 */     return this.warnings;
/*     */   }
/*     */ 
/*     */   public void setWarnings(Object value)
/*     */   {
/* 630 */     this.warnings = value;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"buildingMaterials", "hardware", "electrical", "plumbingFixtures", "tools", "organizersAndStorage", "majorHomeAppliances", "securityElectronics"})
/*     */   public static class ProductType
/*     */   {
/*     */ 
/*     */     @XmlElement(name="BuildingMaterials")
/*     */     protected BuildingMaterials buildingMaterials;
/*     */ 
/*     */     @XmlElement(name="Hardware")
/*     */     protected Hardware hardware;
/*     */ 
/*     */     @XmlElement(name="Electrical")
/*     */     protected Electrical electrical;
/*     */ 
/*     */     @XmlElement(name="PlumbingFixtures")
/*     */     protected PlumbingFixtures plumbingFixtures;
/*     */ 
/*     */     @XmlElement(name="Tools")
/*     */     protected HomeImprovementTools tools;
/*     */ 
/*     */     @XmlElement(name="OrganizersAndStorage")
/*     */     protected OrganizersAndStorage organizersAndStorage;
/*     */ 
/*     */     @XmlElement(name="MajorHomeAppliances")
/*     */     protected MajorHomeAppliances majorHomeAppliances;
/*     */ 
/*     */     @XmlElement(name="SecurityElectronics")
/*     */     protected SecurityElectronics securityElectronics;
/*     */ 
/*     */     public BuildingMaterials getBuildingMaterials()
/*     */     {
/* 699 */       return this.buildingMaterials;
/*     */     }
/*     */ 
/*     */     public void setBuildingMaterials(BuildingMaterials value)
/*     */     {
/* 711 */       this.buildingMaterials = value;
/*     */     }
/*     */ 
/*     */     public Hardware getHardware()
/*     */     {
/* 723 */       return this.hardware;
/*     */     }
/*     */ 
/*     */     public void setHardware(Hardware value)
/*     */     {
/* 735 */       this.hardware = value;
/*     */     }
/*     */ 
/*     */     public Electrical getElectrical()
/*     */     {
/* 747 */       return this.electrical;
/*     */     }
/*     */ 
/*     */     public void setElectrical(Electrical value)
/*     */     {
/* 759 */       this.electrical = value;
/*     */     }
/*     */ 
/*     */     public PlumbingFixtures getPlumbingFixtures()
/*     */     {
/* 771 */       return this.plumbingFixtures;
/*     */     }
/*     */ 
/*     */     public void setPlumbingFixtures(PlumbingFixtures value)
/*     */     {
/* 783 */       this.plumbingFixtures = value;
/*     */     }
/*     */ 
/*     */     public HomeImprovementTools getTools()
/*     */     {
/* 795 */       return this.tools;
/*     */     }
/*     */ 
/*     */     public void setTools(HomeImprovementTools value)
/*     */     {
/* 807 */       this.tools = value;
/*     */     }
/*     */ 
/*     */     public OrganizersAndStorage getOrganizersAndStorage()
/*     */     {
/* 819 */       return this.organizersAndStorage;
/*     */     }
/*     */ 
/*     */     public void setOrganizersAndStorage(OrganizersAndStorage value)
/*     */     {
/* 831 */       this.organizersAndStorage = value;
/*     */     }
/*     */ 
/*     */     public MajorHomeAppliances getMajorHomeAppliances()
/*     */     {
/* 843 */       return this.majorHomeAppliances;
/*     */     }
/*     */ 
/*     */     public void setMajorHomeAppliances(MajorHomeAppliances value)
/*     */     {
/* 855 */       this.majorHomeAppliances = value;
/*     */     }
/*     */ 
/*     */     public SecurityElectronics getSecurityElectronics()
/*     */     {
/* 867 */       return this.securityElectronics;
/*     */     }
/*     */ 
/*     */     public void setSecurityElectronics(SecurityElectronics value)
/*     */     {
/* 879 */       this.securityElectronics = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HomeImprovement
 * JD-Core Version:    0.6.2
 */