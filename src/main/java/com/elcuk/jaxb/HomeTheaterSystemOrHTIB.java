/*     */ package com.elcuk.jaxb;
/*     */ 
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
/*     */ @XmlType(name="", propOrder={"connectorType", "controllerType", "enclosureFinish", "frontPanelInputs", "builtInMedia", "includedFeatures", "shape", "midRangeSpeakerMaterial", "midRangeSpeakerDiameter", "videoUpconversionTechnologies", "numberOfDrivers", "numberOfSpeakers", "grilleRemoveability", "speakerGrilleMaterial", "maximumWattage", "subwooferWattage", "subwooferSpeakerMaterial", "subwooferSpeakerDiameter", "subwooferPowerTechnology", "internetApplications", "tweeterSpeakerMaterial", "tweeterSpeakerDiameter", "tweeterSpeakerTechnology", "wirelessType", "wooferSpeakerMaterial", "wooferSpeakerDiameter"})
/*     */ @XmlRootElement(name="HomeTheaterSystemOrHTIB")
/*     */ public class HomeTheaterSystemOrHTIB
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ConnectorType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String connectorType;
/*     */ 
/*     */   @XmlElement(name="ControllerType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String controllerType;
/*     */ 
/*     */   @XmlElement(name="EnclosureFinish")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String enclosureFinish;
/*     */ 
/*     */   @XmlElement(name="FrontPanelInputs")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> frontPanelInputs;
/*     */ 
/*     */   @XmlElement(name="BuiltInMedia")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> builtInMedia;
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
/*     */   @XmlElement(name="VideoUpconversionTechnologies")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String videoUpconversionTechnologies;
/*     */ 
/*     */   @XmlElement(name="NumberOfDrivers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfDrivers;
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
/*     */   @XmlElement(name="InternetApplications")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> internetApplications;
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
/*     */   @XmlElement(name="WirelessType")
/*     */   protected String wirelessType;
/*     */ 
/*     */   @XmlElement(name="WooferSpeakerMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String wooferSpeakerMaterial;
/*     */ 
/*     */   @XmlElement(name="WooferSpeakerDiameter")
/*     */   protected LengthDimension wooferSpeakerDiameter;
/*     */ 
/*     */   public String getConnectorType()
/*     */   {
/* 174 */     return this.connectorType;
/*     */   }
/*     */ 
/*     */   public void setConnectorType(String value)
/*     */   {
/* 186 */     this.connectorType = value;
/*     */   }
/*     */ 
/*     */   public String getControllerType()
/*     */   {
/* 198 */     return this.controllerType;
/*     */   }
/*     */ 
/*     */   public void setControllerType(String value)
/*     */   {
/* 210 */     this.controllerType = value;
/*     */   }
/*     */ 
/*     */   public String getEnclosureFinish()
/*     */   {
/* 222 */     return this.enclosureFinish;
/*     */   }
/*     */ 
/*     */   public void setEnclosureFinish(String value)
/*     */   {
/* 234 */     this.enclosureFinish = value;
/*     */   }
/*     */ 
/*     */   public List<String> getFrontPanelInputs()
/*     */   {
/* 260 */     if (this.frontPanelInputs == null) {
/* 261 */       this.frontPanelInputs = new ArrayList();
/*     */     }
/* 263 */     return this.frontPanelInputs;
/*     */   }
/*     */ 
/*     */   public List<String> getBuiltInMedia()
/*     */   {
/* 289 */     if (this.builtInMedia == null) {
/* 290 */       this.builtInMedia = new ArrayList();
/*     */     }
/* 292 */     return this.builtInMedia;
/*     */   }
/*     */ 
/*     */   public String getIncludedFeatures()
/*     */   {
/* 304 */     return this.includedFeatures;
/*     */   }
/*     */ 
/*     */   public void setIncludedFeatures(String value)
/*     */   {
/* 316 */     this.includedFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getShape()
/*     */   {
/* 328 */     return this.shape;
/*     */   }
/*     */ 
/*     */   public void setShape(String value)
/*     */   {
/* 340 */     this.shape = value;
/*     */   }
/*     */ 
/*     */   public String getMidRangeSpeakerMaterial()
/*     */   {
/* 352 */     return this.midRangeSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setMidRangeSpeakerMaterial(String value)
/*     */   {
/* 364 */     this.midRangeSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMidRangeSpeakerDiameter()
/*     */   {
/* 376 */     return this.midRangeSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setMidRangeSpeakerDiameter(LengthDimension value)
/*     */   {
/* 388 */     this.midRangeSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getVideoUpconversionTechnologies()
/*     */   {
/* 400 */     return this.videoUpconversionTechnologies;
/*     */   }
/*     */ 
/*     */   public void setVideoUpconversionTechnologies(String value)
/*     */   {
/* 412 */     this.videoUpconversionTechnologies = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfDrivers()
/*     */   {
/* 424 */     return this.numberOfDrivers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfDrivers(BigInteger value)
/*     */   {
/* 436 */     this.numberOfDrivers = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfSpeakers()
/*     */   {
/* 448 */     return this.numberOfSpeakers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSpeakers(BigInteger value)
/*     */   {
/* 460 */     this.numberOfSpeakers = value;
/*     */   }
/*     */ 
/*     */   public String getGrilleRemoveability()
/*     */   {
/* 472 */     return this.grilleRemoveability;
/*     */   }
/*     */ 
/*     */   public void setGrilleRemoveability(String value)
/*     */   {
/* 484 */     this.grilleRemoveability = value;
/*     */   }
/*     */ 
/*     */   public String getSpeakerGrilleMaterial()
/*     */   {
/* 496 */     return this.speakerGrilleMaterial;
/*     */   }
/*     */ 
/*     */   public void setSpeakerGrilleMaterial(String value)
/*     */   {
/* 508 */     this.speakerGrilleMaterial = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getMaximumWattage()
/*     */   {
/* 520 */     return this.maximumWattage;
/*     */   }
/*     */ 
/*     */   public void setMaximumWattage(WattageDimension value)
/*     */   {
/* 532 */     this.maximumWattage = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getSubwooferWattage()
/*     */   {
/* 544 */     return this.subwooferWattage;
/*     */   }
/*     */ 
/*     */   public void setSubwooferWattage(WattageDimension value)
/*     */   {
/* 556 */     this.subwooferWattage = value;
/*     */   }
/*     */ 
/*     */   public String getSubwooferSpeakerMaterial()
/*     */   {
/* 568 */     return this.subwooferSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setSubwooferSpeakerMaterial(String value)
/*     */   {
/* 580 */     this.subwooferSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getSubwooferSpeakerDiameter()
/*     */   {
/* 592 */     return this.subwooferSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*     */   {
/* 604 */     this.subwooferSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getSubwooferPowerTechnology()
/*     */   {
/* 616 */     return this.subwooferPowerTechnology;
/*     */   }
/*     */ 
/*     */   public void setSubwooferPowerTechnology(String value)
/*     */   {
/* 628 */     this.subwooferPowerTechnology = value;
/*     */   }
/*     */ 
/*     */   public List<String> getInternetApplications()
/*     */   {
/* 654 */     if (this.internetApplications == null) {
/* 655 */       this.internetApplications = new ArrayList();
/*     */     }
/* 657 */     return this.internetApplications;
/*     */   }
/*     */ 
/*     */   public String getTweeterSpeakerMaterial()
/*     */   {
/* 669 */     return this.tweeterSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setTweeterSpeakerMaterial(String value)
/*     */   {
/* 681 */     this.tweeterSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getTweeterSpeakerDiameter()
/*     */   {
/* 693 */     return this.tweeterSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setTweeterSpeakerDiameter(LengthDimension value)
/*     */   {
/* 705 */     this.tweeterSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getTweeterSpeakerTechnology()
/*     */   {
/* 717 */     return this.tweeterSpeakerTechnology;
/*     */   }
/*     */ 
/*     */   public void setTweeterSpeakerTechnology(String value)
/*     */   {
/* 729 */     this.tweeterSpeakerTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getWirelessType()
/*     */   {
/* 741 */     return this.wirelessType;
/*     */   }
/*     */ 
/*     */   public void setWirelessType(String value)
/*     */   {
/* 753 */     this.wirelessType = value;
/*     */   }
/*     */ 
/*     */   public String getWooferSpeakerMaterial()
/*     */   {
/* 765 */     return this.wooferSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setWooferSpeakerMaterial(String value)
/*     */   {
/* 777 */     this.wooferSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getWooferSpeakerDiameter()
/*     */   {
/* 789 */     return this.wooferSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setWooferSpeakerDiameter(LengthDimension value)
/*     */   {
/* 801 */     this.wooferSpeakerDiameter = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HomeTheaterSystemOrHTIB
 * JD-Core Version:    0.6.2
 */