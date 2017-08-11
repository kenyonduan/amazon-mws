/*     */ package com.elcuk.jaxb;
/*     */ 
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
/*     */ @XmlType(name="", propOrder={"connectorType", "biAmpable", "numberOfDrivers", "enclosureFinish", "includedFeatures", "shape", "midRangeSpeakerMaterial", "midRangeSpeakerDiameter", "numberOfSpeakers", "grilleRemoveability", "speakerGrilleMaterial", "maximumWattage", "subwooferWattage", "subwooferSpeakerMaterial", "subwooferSpeakerDiameter", "subwooferPowerTechnology", "tweeterSpeakerMaterial", "tweeterSpeakerDiameter", "tweeterSpeakerTechnology", "wooferSpeakerMaterial", "wooferSpeakerDiameter", "efficiency"})
/*     */ @XmlRootElement(name="Speakers")
/*     */ public class Speakers
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ConnectorType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String connectorType;
/*     */ 
/*     */   @XmlElement(name="BiAmpable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String biAmpable;
/*     */ 
/*     */   @XmlElement(name="NumberOfDrivers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfDrivers;
/*     */ 
/*     */   @XmlElement(name="EnclosureFinish")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String enclosureFinish;
/*     */ 
/*     */   @XmlElement(name="IncludedFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String includedFeatures;
/*     */ 
/*     */   @XmlElement(name="Shape")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String shape;
/*     */ 
/*     */   @XmlElement(name="MidRangeSpeakerMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String midRangeSpeakerMaterial;
/*     */ 
/*     */   @XmlElement(name="MidRangeSpeakerDiameter")
/*     */   protected LengthDimension midRangeSpeakerDiameter;
/*     */ 
/*     */   @XmlElement(name="NumberOfSpeakers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfSpeakers;
/*     */ 
/*     */   @XmlElement(name="GrilleRemoveability")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String grilleRemoveability;
/*     */ 
/*     */   @XmlElement(name="SpeakerGrilleMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String speakerGrilleMaterial;
/*     */ 
/*     */   @XmlElement(name="MaximumWattage")
/*     */   protected WattageDimension maximumWattage;
/*     */ 
/*     */   @XmlElement(name="SubwooferWattage")
/*     */   protected WattageDimension subwooferWattage;
/*     */ 
/*     */   @XmlElement(name="SubwooferSpeakerMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String subwooferSpeakerMaterial;
/*     */ 
/*     */   @XmlElement(name="SubwooferSpeakerDiameter")
/*     */   protected LengthDimension subwooferSpeakerDiameter;
/*     */ 
/*     */   @XmlElement(name="SubwooferPowerTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String subwooferPowerTechnology;
/*     */ 
/*     */   @XmlElement(name="TweeterSpeakerMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String tweeterSpeakerMaterial;
/*     */ 
/*     */   @XmlElement(name="TweeterSpeakerDiameter")
/*     */   protected LengthDimension tweeterSpeakerDiameter;
/*     */ 
/*     */   @XmlElement(name="TweeterSpeakerTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String tweeterSpeakerTechnology;
/*     */ 
/*     */   @XmlElement(name="WooferSpeakerMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String wooferSpeakerMaterial;
/*     */ 
/*     */   @XmlElement(name="WooferSpeakerDiameter")
/*     */   protected LengthDimension wooferSpeakerDiameter;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public String getConnectorType()
/*     */   {
/* 153 */     return this.connectorType;
/*     */   }
/*     */ 
/*     */   public void setConnectorType(String value)
/*     */   {
/* 165 */     this.connectorType = value;
/*     */   }
/*     */ 
/*     */   public String getBiAmpable()
/*     */   {
/* 177 */     return this.biAmpable;
/*     */   }
/*     */ 
/*     */   public void setBiAmpable(String value)
/*     */   {
/* 189 */     this.biAmpable = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfDrivers()
/*     */   {
/* 201 */     return this.numberOfDrivers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfDrivers(BigInteger value)
/*     */   {
/* 213 */     this.numberOfDrivers = value;
/*     */   }
/*     */ 
/*     */   public String getEnclosureFinish()
/*     */   {
/* 225 */     return this.enclosureFinish;
/*     */   }
/*     */ 
/*     */   public void setEnclosureFinish(String value)
/*     */   {
/* 237 */     this.enclosureFinish = value;
/*     */   }
/*     */ 
/*     */   public String getIncludedFeatures()
/*     */   {
/* 249 */     return this.includedFeatures;
/*     */   }
/*     */ 
/*     */   public void setIncludedFeatures(String value)
/*     */   {
/* 261 */     this.includedFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getShape()
/*     */   {
/* 273 */     return this.shape;
/*     */   }
/*     */ 
/*     */   public void setShape(String value)
/*     */   {
/* 285 */     this.shape = value;
/*     */   }
/*     */ 
/*     */   public String getMidRangeSpeakerMaterial()
/*     */   {
/* 297 */     return this.midRangeSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setMidRangeSpeakerMaterial(String value)
/*     */   {
/* 309 */     this.midRangeSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMidRangeSpeakerDiameter()
/*     */   {
/* 321 */     return this.midRangeSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setMidRangeSpeakerDiameter(LengthDimension value)
/*     */   {
/* 333 */     this.midRangeSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfSpeakers()
/*     */   {
/* 345 */     return this.numberOfSpeakers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSpeakers(BigInteger value)
/*     */   {
/* 357 */     this.numberOfSpeakers = value;
/*     */   }
/*     */ 
/*     */   public String getGrilleRemoveability()
/*     */   {
/* 369 */     return this.grilleRemoveability;
/*     */   }
/*     */ 
/*     */   public void setGrilleRemoveability(String value)
/*     */   {
/* 381 */     this.grilleRemoveability = value;
/*     */   }
/*     */ 
/*     */   public String getSpeakerGrilleMaterial()
/*     */   {
/* 393 */     return this.speakerGrilleMaterial;
/*     */   }
/*     */ 
/*     */   public void setSpeakerGrilleMaterial(String value)
/*     */   {
/* 405 */     this.speakerGrilleMaterial = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getMaximumWattage()
/*     */   {
/* 417 */     return this.maximumWattage;
/*     */   }
/*     */ 
/*     */   public void setMaximumWattage(WattageDimension value)
/*     */   {
/* 429 */     this.maximumWattage = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getSubwooferWattage()
/*     */   {
/* 441 */     return this.subwooferWattage;
/*     */   }
/*     */ 
/*     */   public void setSubwooferWattage(WattageDimension value)
/*     */   {
/* 453 */     this.subwooferWattage = value;
/*     */   }
/*     */ 
/*     */   public String getSubwooferSpeakerMaterial()
/*     */   {
/* 465 */     return this.subwooferSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setSubwooferSpeakerMaterial(String value)
/*     */   {
/* 477 */     this.subwooferSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getSubwooferSpeakerDiameter()
/*     */   {
/* 489 */     return this.subwooferSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*     */   {
/* 501 */     this.subwooferSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getSubwooferPowerTechnology()
/*     */   {
/* 513 */     return this.subwooferPowerTechnology;
/*     */   }
/*     */ 
/*     */   public void setSubwooferPowerTechnology(String value)
/*     */   {
/* 525 */     this.subwooferPowerTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getTweeterSpeakerMaterial()
/*     */   {
/* 537 */     return this.tweeterSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setTweeterSpeakerMaterial(String value)
/*     */   {
/* 549 */     this.tweeterSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getTweeterSpeakerDiameter()
/*     */   {
/* 561 */     return this.tweeterSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setTweeterSpeakerDiameter(LengthDimension value)
/*     */   {
/* 573 */     this.tweeterSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getTweeterSpeakerTechnology()
/*     */   {
/* 585 */     return this.tweeterSpeakerTechnology;
/*     */   }
/*     */ 
/*     */   public void setTweeterSpeakerTechnology(String value)
/*     */   {
/* 597 */     this.tweeterSpeakerTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getWooferSpeakerMaterial()
/*     */   {
/* 609 */     return this.wooferSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setWooferSpeakerMaterial(String value)
/*     */   {
/* 621 */     this.wooferSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getWooferSpeakerDiameter()
/*     */   {
/* 633 */     return this.wooferSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setWooferSpeakerDiameter(LengthDimension value)
/*     */   {
/* 645 */     this.wooferSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 657 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 669 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Speakers
 * JD-Core Version:    0.6.2
 */