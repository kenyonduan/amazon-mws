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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cableLength", "finishType", "grilleRemoveability", "internetApplications", "midRangeSpeakerDiameter", "midRangeSpeakerMaterial", "numberOfRadioBandsSupported", "powerConsumption", "powerPlugType", "powerSource", "remoteControlDescription", "shape", "speakerGrilleMaterial", "speakerMaximumInputPower", "subwooferPowerTechnology", "subwooferSpeakerDiameter", "subwooferSpeakerMaterial", "subwooferWattage", "totalEthernetPorts", "totalSubwooferOutputs", "tweeterConeMaterialType", "tweeterDriverDiameter", "wirelessTechnology", "wooferSpeakerDiameter", "wooferSpeakerMaterial", "efficiency"})
/*     */ @XmlRootElement(name="RadioOrClockRadio")
/*     */ public class RadioOrClockRadio
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BatteryCellType")
/*     */   protected BatteryCellTypeValues batteryCellType;
/*     */ 
/*     */   @XmlElement(name="BatteryChargeCycles")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryChargeCycles;
/*     */ 
/*     */   @XmlElement(name="BatteryPower")
/*     */   protected BatteryPowerIntegerDimension batteryPower;
/*     */ 
/*     */   @XmlElement(name="BoxContents")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String boxContents;
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="GrilleRemoveability")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String grilleRemoveability;
/*     */ 
/*     */   @XmlElement(name="InternetApplications")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> internetApplications;
/*     */ 
/*     */   @XmlElement(name="MidRangeSpeakerDiameter")
/*     */   protected LengthDimension midRangeSpeakerDiameter;
/*     */ 
/*     */   @XmlElement(name="MidRangeSpeakerMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String midRangeSpeakerMaterial;
/*     */ 
/*     */   @XmlElement(name="NumberOfRadioBandsSupported")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfRadioBandsSupported;
/*     */ 
/*     */   @XmlElement(name="PowerConsumption")
/*     */   protected PowerDimension powerConsumption;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="RemoteControlDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String remoteControlDescription;
/*     */ 
/*     */   @XmlElement(name="Shape")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String shape;
/*     */ 
/*     */   @XmlElement(name="SpeakerGrilleMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String speakerGrilleMaterial;
/*     */ 
/*     */   @XmlElement(name="SpeakerMaximumInputPower")
/*     */   protected PowerDimension speakerMaximumInputPower;
/*     */ 
/*     */   @XmlElement(name="SubwooferPowerTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String subwooferPowerTechnology;
/*     */ 
/*     */   @XmlElement(name="SubwooferSpeakerDiameter")
/*     */   protected LengthDimension subwooferSpeakerDiameter;
/*     */ 
/*     */   @XmlElement(name="SubwooferSpeakerMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String subwooferSpeakerMaterial;
/*     */ 
/*     */   @XmlElement(name="SubwooferWattage")
/*     */   protected WattageDimension subwooferWattage;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="TotalSubwooferOutputs")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalSubwooferOutputs;
/*     */ 
/*     */   @XmlElement(name="TweeterConeMaterialType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String tweeterConeMaterialType;
/*     */ 
/*     */   @XmlElement(name="TweeterDriverDiameter")
/*     */   protected LengthDimension tweeterDriverDiameter;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="WooferSpeakerDiameter")
/*     */   protected LengthDimension wooferSpeakerDiameter;
/*     */ 
/*     */   @XmlElement(name="WooferSpeakerMaterial")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String wooferSpeakerMaterial;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 190 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 202 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 214 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 226 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 238 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 250 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 262 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 274 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/* 286 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/* 298 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 310 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 322 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public String getGrilleRemoveability()
/*     */   {
/* 334 */     return this.grilleRemoveability;
/*     */   }
/*     */ 
/*     */   public void setGrilleRemoveability(String value)
/*     */   {
/* 346 */     this.grilleRemoveability = value;
/*     */   }
/*     */ 
/*     */   public List<String> getInternetApplications()
/*     */   {
/* 372 */     if (this.internetApplications == null) {
/* 373 */       this.internetApplications = new ArrayList();
/*     */     }
/* 375 */     return this.internetApplications;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMidRangeSpeakerDiameter()
/*     */   {
/* 387 */     return this.midRangeSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setMidRangeSpeakerDiameter(LengthDimension value)
/*     */   {
/* 399 */     this.midRangeSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getMidRangeSpeakerMaterial()
/*     */   {
/* 411 */     return this.midRangeSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setMidRangeSpeakerMaterial(String value)
/*     */   {
/* 423 */     this.midRangeSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfRadioBandsSupported()
/*     */   {
/* 435 */     return this.numberOfRadioBandsSupported;
/*     */   }
/*     */ 
/*     */   public void setNumberOfRadioBandsSupported(BigInteger value)
/*     */   {
/* 447 */     this.numberOfRadioBandsSupported = value;
/*     */   }
/*     */ 
/*     */   public PowerDimension getPowerConsumption()
/*     */   {
/* 459 */     return this.powerConsumption;
/*     */   }
/*     */ 
/*     */   public void setPowerConsumption(PowerDimension value)
/*     */   {
/* 471 */     this.powerConsumption = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 483 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 495 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 507 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 519 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getRemoteControlDescription()
/*     */   {
/* 531 */     return this.remoteControlDescription;
/*     */   }
/*     */ 
/*     */   public void setRemoteControlDescription(String value)
/*     */   {
/* 543 */     this.remoteControlDescription = value;
/*     */   }
/*     */ 
/*     */   public String getShape()
/*     */   {
/* 555 */     return this.shape;
/*     */   }
/*     */ 
/*     */   public void setShape(String value)
/*     */   {
/* 567 */     this.shape = value;
/*     */   }
/*     */ 
/*     */   public String getSpeakerGrilleMaterial()
/*     */   {
/* 579 */     return this.speakerGrilleMaterial;
/*     */   }
/*     */ 
/*     */   public void setSpeakerGrilleMaterial(String value)
/*     */   {
/* 591 */     this.speakerGrilleMaterial = value;
/*     */   }
/*     */ 
/*     */   public PowerDimension getSpeakerMaximumInputPower()
/*     */   {
/* 603 */     return this.speakerMaximumInputPower;
/*     */   }
/*     */ 
/*     */   public void setSpeakerMaximumInputPower(PowerDimension value)
/*     */   {
/* 615 */     this.speakerMaximumInputPower = value;
/*     */   }
/*     */ 
/*     */   public String getSubwooferPowerTechnology()
/*     */   {
/* 627 */     return this.subwooferPowerTechnology;
/*     */   }
/*     */ 
/*     */   public void setSubwooferPowerTechnology(String value)
/*     */   {
/* 639 */     this.subwooferPowerTechnology = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getSubwooferSpeakerDiameter()
/*     */   {
/* 651 */     return this.subwooferSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*     */   {
/* 663 */     this.subwooferSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getSubwooferSpeakerMaterial()
/*     */   {
/* 675 */     return this.subwooferSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setSubwooferSpeakerMaterial(String value)
/*     */   {
/* 687 */     this.subwooferSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getSubwooferWattage()
/*     */   {
/* 699 */     return this.subwooferWattage;
/*     */   }
/*     */ 
/*     */   public void setSubwooferWattage(WattageDimension value)
/*     */   {
/* 711 */     this.subwooferWattage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 723 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 735 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalSubwooferOutputs()
/*     */   {
/* 747 */     return this.totalSubwooferOutputs;
/*     */   }
/*     */ 
/*     */   public void setTotalSubwooferOutputs(BigInteger value)
/*     */   {
/* 759 */     this.totalSubwooferOutputs = value;
/*     */   }
/*     */ 
/*     */   public String getTweeterConeMaterialType()
/*     */   {
/* 771 */     return this.tweeterConeMaterialType;
/*     */   }
/*     */ 
/*     */   public void setTweeterConeMaterialType(String value)
/*     */   {
/* 783 */     this.tweeterConeMaterialType = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getTweeterDriverDiameter()
/*     */   {
/* 795 */     return this.tweeterDriverDiameter;
/*     */   }
/*     */ 
/*     */   public void setTweeterDriverDiameter(LengthDimension value)
/*     */   {
/* 807 */     this.tweeterDriverDiameter = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 833 */     if (this.wirelessTechnology == null) {
/* 834 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 836 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public LengthDimension getWooferSpeakerDiameter()
/*     */   {
/* 848 */     return this.wooferSpeakerDiameter;
/*     */   }
/*     */ 
/*     */   public void setWooferSpeakerDiameter(LengthDimension value)
/*     */   {
/* 860 */     this.wooferSpeakerDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getWooferSpeakerMaterial()
/*     */   {
/* 872 */     return this.wooferSpeakerMaterial;
/*     */   }
/*     */ 
/*     */   public void setWooferSpeakerMaterial(String value)
/*     */   {
/* 884 */     this.wooferSpeakerMaterial = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 896 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 908 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.RadioOrClockRadio
 * JD-Core Version:    0.6.2
 */