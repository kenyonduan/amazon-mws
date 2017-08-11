/*      */ package com.elcuk.jaxb;
/*      */ 
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
/*      */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "boxContents", "cableLength", "euEnergyLabelEfficiencyClass", "finishType", "fixedFocalLength", "grilleRemoveability", "internetApplications", "lens", "maxAperture", "maxFocalLength", "memorySlotsAvailable", "minAperture", "minFocalLength", "powerConsumption", "powerPlugType", "powerSource", "remoteControlDescription", "shape", "softwareIncluded", "speakerGrilleMaterial", "speakerMaximumInputPower", "subwooferPowerTechnology", "subwooferSpeakerDiameter", "subwooferSpeakerMaterial", "subwooferWattage", "threeDTechnology", "totalComponentInPorts", "totalDVIPorts", "totalEthernetPorts", "totalHdmiPorts", "totalSubwooferOutputs", "totalSVideoInPorts", "totalVgaInPorts", "wirelessTechnology", "wooferSpeakerDiameter", "wooferSpeakerMaterial"})
/*      */ @XmlRootElement(name="VideoProjectorsAndAccessories")
/*      */ public class VideoProjectorsAndAccessories
/*      */ {
/*      */ 
/*      */   @XmlElement(name="BatteryCellType")
/*      */   protected BatteryCellTypeValues batteryCellType;
/*      */ 
/*      */   @XmlElement(name="BatteryChargeCycles")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryChargeCycles;
/*      */ 
/*      */   @XmlElement(name="BatteryPower")
/*      */   protected BatteryPowerIntegerDimension batteryPower;
/*      */ 
/*      */   @XmlElement(name="BoxContents")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String boxContents;
/*      */ 
/*      */   @XmlElement(name="CableLength")
/*      */   protected LengthDimension cableLength;
/*      */ 
/*      */   @XmlElement(name="EuEnergyLabelEfficiencyClass")
/*      */   protected String euEnergyLabelEfficiencyClass;
/*      */ 
/*      */   @XmlElement(name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finishType;
/*      */ 
/*      */   @XmlElement(name="FixedFocalLength")
/*      */   protected LengthDimension fixedFocalLength;
/*      */ 
/*      */   @XmlElement(name="GrilleRemoveability")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String grilleRemoveability;
/*      */ 
/*      */   @XmlElement(name="InternetApplications")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> internetApplications;
/*      */ 
/*      */   @XmlElement(name="Lens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lens;
/*      */ 
/*      */   @XmlElement(name="MaxAperture")
/*      */   protected ApertureDimension maxAperture;
/*      */ 
/*      */   @XmlElement(name="MaxFocalLength")
/*      */   protected LengthDimension maxFocalLength;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="MinAperture")
/*      */   protected ApertureDimension minAperture;
/*      */ 
/*      */   @XmlElement(name="MinFocalLength")
/*      */   protected LengthDimension minFocalLength;
/*      */ 
/*      */   @XmlElement(name="PowerConsumption")
/*      */   protected PowerDimension powerConsumption;
/*      */ 
/*      */   @XmlElement(name="PowerPlugType")
/*      */   protected PowerPlugType powerPlugType;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="RemoteControlDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String remoteControlDescription;
/*      */ 
/*      */   @XmlElement(name="Shape")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shape;
/*      */ 
/*      */   @XmlElement(name="SoftwareIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String softwareIncluded;
/*      */ 
/*      */   @XmlElement(name="SpeakerGrilleMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String speakerGrilleMaterial;
/*      */ 
/*      */   @XmlElement(name="SpeakerMaximumInputPower")
/*      */   protected PowerDimension speakerMaximumInputPower;
/*      */ 
/*      */   @XmlElement(name="SubwooferPowerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String subwooferPowerTechnology;
/*      */ 
/*      */   @XmlElement(name="SubwooferSpeakerDiameter")
/*      */   protected LengthDimension subwooferSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="SubwooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String subwooferSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="SubwooferWattage")
/*      */   protected WattageDimension subwooferWattage;
/*      */ 
/*      */   @XmlElement(name="ThreeDTechnology")
/*      */   protected ThreeDTechnologyValues threeDTechnology;
/*      */ 
/*      */   @XmlElement(name="TotalComponentInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalComponentInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalDVIPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalDVIPorts;
/*      */ 
/*      */   @XmlElement(name="TotalEthernetPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalEthernetPorts;
/*      */ 
/*      */   @XmlElement(name="TotalHdmiPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalHdmiPorts;
/*      */ 
/*      */   @XmlElement(name="TotalSubwooferOutputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSubwooferOutputs;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalVgaInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVgaInPorts;
/*      */ 
/*      */   @XmlElement(name="WirelessTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> wirelessTechnology;
/*      */ 
/*      */   @XmlElement(name="WooferSpeakerDiameter")
/*      */   protected LengthDimension wooferSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="WooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String wooferSpeakerMaterial;
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/*  230 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/*  242 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/*  254 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/*  266 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/*  278 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/*  290 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/*  302 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/*  314 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/*  326 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/*  338 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public String getEuEnergyLabelEfficiencyClass()
/*      */   {
/*  350 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(String value)
/*      */   {
/*  362 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/*  374 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/*  386 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getFixedFocalLength()
/*      */   {
/*  398 */     return this.fixedFocalLength;
/*      */   }
/*      */ 
/*      */   public void setFixedFocalLength(LengthDimension value)
/*      */   {
/*  410 */     this.fixedFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getGrilleRemoveability()
/*      */   {
/*  422 */     return this.grilleRemoveability;
/*      */   }
/*      */ 
/*      */   public void setGrilleRemoveability(String value)
/*      */   {
/*  434 */     this.grilleRemoveability = value;
/*      */   }
/*      */ 
/*      */   public List<String> getInternetApplications()
/*      */   {
/*  460 */     if (this.internetApplications == null) {
/*  461 */       this.internetApplications = new ArrayList();
/*      */     }
/*  463 */     return this.internetApplications;
/*      */   }
/*      */ 
/*      */   public String getLens()
/*      */   {
/*  475 */     return this.lens;
/*      */   }
/*      */ 
/*      */   public void setLens(String value)
/*      */   {
/*  487 */     this.lens = value;
/*      */   }
/*      */ 
/*      */   public ApertureDimension getMaxAperture()
/*      */   {
/*  499 */     return this.maxAperture;
/*      */   }
/*      */ 
/*      */   public void setMaxAperture(ApertureDimension value)
/*      */   {
/*  511 */     this.maxAperture = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMaxFocalLength()
/*      */   {
/*  523 */     return this.maxFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMaxFocalLength(LengthDimension value)
/*      */   {
/*  535 */     this.maxFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/*  547 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/*  559 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public ApertureDimension getMinAperture()
/*      */   {
/*  571 */     return this.minAperture;
/*      */   }
/*      */ 
/*      */   public void setMinAperture(ApertureDimension value)
/*      */   {
/*  583 */     this.minAperture = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMinFocalLength()
/*      */   {
/*  595 */     return this.minFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMinFocalLength(LengthDimension value)
/*      */   {
/*  607 */     this.minFocalLength = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getPowerConsumption()
/*      */   {
/*  619 */     return this.powerConsumption;
/*      */   }
/*      */ 
/*      */   public void setPowerConsumption(PowerDimension value)
/*      */   {
/*  631 */     this.powerConsumption = value;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/*  643 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/*  655 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/*  667 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/*  679 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/*  691 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/*  703 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/*  715 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/*  727 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/*  739 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/*  751 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public String getSpeakerGrilleMaterial()
/*      */   {
/*  763 */     return this.speakerGrilleMaterial;
/*      */   }
/*      */ 
/*      */   public void setSpeakerGrilleMaterial(String value)
/*      */   {
/*  775 */     this.speakerGrilleMaterial = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getSpeakerMaximumInputPower()
/*      */   {
/*  787 */     return this.speakerMaximumInputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakerMaximumInputPower(PowerDimension value)
/*      */   {
/*  799 */     this.speakerMaximumInputPower = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferPowerTechnology()
/*      */   {
/*  811 */     return this.subwooferPowerTechnology;
/*      */   }
/*      */ 
/*      */   public void setSubwooferPowerTechnology(String value)
/*      */   {
/*  823 */     this.subwooferPowerTechnology = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSubwooferSpeakerDiameter()
/*      */   {
/*  835 */     return this.subwooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*      */   {
/*  847 */     this.subwooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferSpeakerMaterial()
/*      */   {
/*  859 */     return this.subwooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerMaterial(String value)
/*      */   {
/*  871 */     this.subwooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getSubwooferWattage()
/*      */   {
/*  883 */     return this.subwooferWattage;
/*      */   }
/*      */ 
/*      */   public void setSubwooferWattage(WattageDimension value)
/*      */   {
/*  895 */     this.subwooferWattage = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/*  907 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/*  919 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalComponentInPorts()
/*      */   {
/*  931 */     return this.totalComponentInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalComponentInPorts(BigInteger value)
/*      */   {
/*  943 */     this.totalComponentInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/*  955 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/*  967 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalEthernetPorts()
/*      */   {
/*  979 */     return this.totalEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalEthernetPorts(BigInteger value)
/*      */   {
/*  991 */     this.totalEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/* 1003 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/* 1015 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSubwooferOutputs()
/*      */   {
/* 1027 */     return this.totalSubwooferOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalSubwooferOutputs(BigInteger value)
/*      */   {
/* 1039 */     this.totalSubwooferOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoInPorts()
/*      */   {
/* 1051 */     return this.totalSVideoInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoInPorts(BigInteger value)
/*      */   {
/* 1063 */     this.totalSVideoInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVgaInPorts()
/*      */   {
/* 1075 */     return this.totalVgaInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVgaInPorts(BigInteger value)
/*      */   {
/* 1087 */     this.totalVgaInPorts = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessTechnology()
/*      */   {
/* 1113 */     if (this.wirelessTechnology == null) {
/* 1114 */       this.wirelessTechnology = new ArrayList();
/*      */     }
/* 1116 */     return this.wirelessTechnology;
/*      */   }
/*      */ 
/*      */   public LengthDimension getWooferSpeakerDiameter()
/*      */   {
/* 1128 */     return this.wooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1140 */     this.wooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getWooferSpeakerMaterial()
/*      */   {
/* 1152 */     return this.wooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerMaterial(String value)
/*      */   {
/* 1164 */     this.wooferSpeakerMaterial = value;
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.VideoProjectorsAndAccessories
 * JD-Core Version:    0.6.2
 */