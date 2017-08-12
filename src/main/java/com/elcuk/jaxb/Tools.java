/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="", propOrder={"gritRating", "horsepower", "styleName", "finishTypes", "diameter", "length", "width", "height", "weight", "powerSource", "wattage", "voltage", "numberOfItemsInPackage", "batteryTypeLithiumIon", "batteryTypeLithiumMetal", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "numberOfLithiumIonCells", "numberOfLithiumMetalCells"})
/*     */ @XmlRootElement(name="Tools")
/*     */ public class Tools
/*     */ {
/*     */ 
/*     */   @XmlElement(name="GritRating")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger gritRating;
/*     */ 
/*     */   @XmlElement(name="Horsepower")
/*     */   protected BigDecimal horsepower;
/*     */ 
/*     */   @XmlElement(name="StyleName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String styleName;
/*     */ 
/*     */   @XmlElement(name="FinishTypes")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishTypes;
/*     */ 
/*     */   @XmlElement(name="Diameter")
/*     */   protected LengthDimension diameter;
/*     */ 
/*     */   @XmlElement(name="Length")
/*     */   protected LengthDimension length;
/*     */ 
/*     */   @XmlElement(name="Width")
/*     */   protected LengthDimension width;
/*     */ 
/*     */   @XmlElement(name="Height")
/*     */   protected LengthDimension height;
/*     */ 
/*     */   @XmlElement(name="Weight")
/*     */   protected WeightDimension weight;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   protected List<String> powerSource;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger voltage;
/*     */ 
/*     */   @XmlElement(name="NumberOfItemsInPackage")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfItemsInPackage;
/*     */ 
/*     */   @XmlElement(name="BatteryTypeLithiumIon")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryTypeLithiumIon;
/*     */ 
/*     */   @XmlElement(name="BatteryTypeLithiumMetal")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryTypeLithiumMetal;
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
/*     */   @XmlElement(name="NumberOfLithiumIonCells")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLithiumIonCells;
/*     */ 
/*     */   @XmlElement(name="NumberOfLithiumMetalCells")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLithiumMetalCells;
/*     */ 
/*     */   public BigInteger getGritRating()
/*     */   {
/* 164 */     return this.gritRating;
/*     */   }
/*     */ 
/*     */   public void setGritRating(BigInteger value)
/*     */   {
/* 176 */     this.gritRating = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getHorsepower()
/*     */   {
/* 188 */     return this.horsepower;
/*     */   }
/*     */ 
/*     */   public void setHorsepower(BigDecimal value)
/*     */   {
/* 200 */     this.horsepower = value;
/*     */   }
/*     */ 
/*     */   public String getStyleName()
/*     */   {
/* 212 */     return this.styleName;
/*     */   }
/*     */ 
/*     */   public void setStyleName(String value)
/*     */   {
/* 224 */     this.styleName = value;
/*     */   }
/*     */ 
/*     */   public String getFinishTypes()
/*     */   {
/* 236 */     return this.finishTypes;
/*     */   }
/*     */ 
/*     */   public void setFinishTypes(String value)
/*     */   {
/* 248 */     this.finishTypes = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getDiameter()
/*     */   {
/* 260 */     return this.diameter;
/*     */   }
/*     */ 
/*     */   public void setDiameter(LengthDimension value)
/*     */   {
/* 272 */     this.diameter = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getLength()
/*     */   {
/* 284 */     return this.length;
/*     */   }
/*     */ 
/*     */   public void setLength(LengthDimension value)
/*     */   {
/* 296 */     this.length = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getWidth()
/*     */   {
/* 308 */     return this.width;
/*     */   }
/*     */ 
/*     */   public void setWidth(LengthDimension value)
/*     */   {
/* 320 */     this.width = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getHeight()
/*     */   {
/* 332 */     return this.height;
/*     */   }
/*     */ 
/*     */   public void setHeight(LengthDimension value)
/*     */   {
/* 344 */     this.height = value;
/*     */   }
/*     */ 
/*     */   public WeightDimension getWeight()
/*     */   {
/* 356 */     return this.weight;
/*     */   }
/*     */ 
/*     */   public void setWeight(WeightDimension value)
/*     */   {
/* 368 */     this.weight = value;
/*     */   }
/*     */ 
/*     */   public List<String> getPowerSource()
/*     */   {
/* 394 */     if (this.powerSource == null) {
/* 395 */       this.powerSource = new ArrayList();
/*     */     }
/* 397 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 409 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 421 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getVoltage()
/*     */   {
/* 433 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigInteger value)
/*     */   {
/* 445 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfItemsInPackage()
/*     */   {
/* 457 */     return this.numberOfItemsInPackage;
/*     */   }
/*     */ 
/*     */   public void setNumberOfItemsInPackage(BigInteger value)
/*     */   {
/* 469 */     this.numberOfItemsInPackage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryTypeLithiumIon()
/*     */   {
/* 481 */     return this.batteryTypeLithiumIon;
/*     */   }
/*     */ 
/*     */   public void setBatteryTypeLithiumIon(BigInteger value)
/*     */   {
/* 493 */     this.batteryTypeLithiumIon = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryTypeLithiumMetal()
/*     */   {
/* 505 */     return this.batteryTypeLithiumMetal;
/*     */   }
/*     */ 
/*     */   public void setBatteryTypeLithiumMetal(BigInteger value)
/*     */   {
/* 517 */     this.batteryTypeLithiumMetal = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryEnergyContent()
/*     */   {
/* 529 */     return this.lithiumBatteryEnergyContent;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*     */   {
/* 541 */     this.lithiumBatteryEnergyContent = value;
/*     */   }
/*     */ 
/*     */   public String getLithiumBatteryPackaging()
/*     */   {
/* 553 */     return this.lithiumBatteryPackaging;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryPackaging(String value)
/*     */   {
/* 565 */     this.lithiumBatteryPackaging = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryVoltage()
/*     */   {
/* 577 */     return this.lithiumBatteryVoltage;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryVoltage(BigDecimal value)
/*     */   {
/* 589 */     this.lithiumBatteryVoltage = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getLithiumBatteryWeight()
/*     */   {
/* 601 */     return this.lithiumBatteryWeight;
/*     */   }
/*     */ 
/*     */   public void setLithiumBatteryWeight(BigDecimal value)
/*     */   {
/* 613 */     this.lithiumBatteryWeight = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLithiumIonCells()
/*     */   {
/* 625 */     return this.numberOfLithiumIonCells;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLithiumIonCells(BigInteger value)
/*     */   {
/* 637 */     this.numberOfLithiumIonCells = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLithiumMetalCells()
/*     */   {
/* 649 */     return this.numberOfLithiumMetalCells;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*     */   {
/* 661 */     this.numberOfLithiumMetalCells = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Tools
 * JD-Core Version:    0.6.2
 */