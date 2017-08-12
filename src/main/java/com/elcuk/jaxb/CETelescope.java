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
/*     */ @XmlType(name="", propOrder={"batteryChargeCycles", "batteryCellType", "batteryPower", "boxContents", "cableLength", "coatingDescription", "compatibleMountings", "conductor", "connectorGender", "digitalZoom", "finishType", "fixedFocalLength", "focusType", "imageStabilization", "maxAperture", "maxFocalLength", "memorySlotsAvailable", "minAperture", "opticalZoom", "powerSource", "remoteControlDescription", "softwareIncluded", "totalFirewirePorts", "totalSVideoOutPorts", "totalUSBPorts", "viewFinderType", "efficiency"})
/*     */ @XmlRootElement(name="CETelescope")
/*     */ public class CETelescope
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BatteryChargeCycles")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger batteryChargeCycles;
/*     */ 
/*     */   @XmlElement(name="BatteryCellType")
/*     */   protected BatteryCellTypeValues batteryCellType;
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
/*     */   @XmlElement(name="CoatingDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String coatingDescription;
/*     */ 
/*     */   @XmlElement(name="CompatibleMountings")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String compatibleMountings;
/*     */ 
/*     */   @XmlElement(name="Conductor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String conductor;
/*     */ 
/*     */   @XmlElement(name="ConnectorGender")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> connectorGender;
/*     */ 
/*     */   @XmlElement(name="DigitalZoom")
/*     */   protected ZoomDimension digitalZoom;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="FixedFocalLength")
/*     */   protected LengthDimension fixedFocalLength;
/*     */ 
/*     */   @XmlElement(name="FocusType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String focusType;
/*     */ 
/*     */   @XmlElement(name="ImageStabilization")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String imageStabilization;
/*     */ 
/*     */   @XmlElement(name="MaxAperture")
/*     */   protected ApertureDimension maxAperture;
/*     */ 
/*     */   @XmlElement(name="MaxFocalLength")
/*     */   protected LengthDimension maxFocalLength;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="MinAperture")
/*     */   protected ApertureDimension minAperture;
/*     */ 
/*     */   @XmlElement(name="OpticalZoom")
/*     */   protected ZoomDimension opticalZoom;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="RemoteControlDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String remoteControlDescription;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="TotalFirewirePorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalFirewirePorts;
/*     */ 
/*     */   @XmlElement(name="TotalSVideoOutPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalSVideoOutPorts;
/*     */ 
/*     */   @XmlElement(name="TotalUSBPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalUSBPorts;
/*     */ 
/*     */   @XmlElement(name="ViewFinderType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String viewFinderType;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 177 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 189 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 201 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 213 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 225 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 237 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/* 249 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/* 261 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/* 273 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/* 285 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public String getCoatingDescription()
/*     */   {
/* 297 */     return this.coatingDescription;
/*     */   }
/*     */ 
/*     */   public void setCoatingDescription(String value)
/*     */   {
/* 309 */     this.coatingDescription = value;
/*     */   }
/*     */ 
/*     */   public String getCompatibleMountings()
/*     */   {
/* 321 */     return this.compatibleMountings;
/*     */   }
/*     */ 
/*     */   public void setCompatibleMountings(String value)
/*     */   {
/* 333 */     this.compatibleMountings = value;
/*     */   }
/*     */ 
/*     */   public String getConductor()
/*     */   {
/* 345 */     return this.conductor;
/*     */   }
/*     */ 
/*     */   public void setConductor(String value)
/*     */   {
/* 357 */     this.conductor = value;
/*     */   }
/*     */ 
/*     */   public List<String> getConnectorGender()
/*     */   {
/* 383 */     if (this.connectorGender == null) {
/* 384 */       this.connectorGender = new ArrayList();
/*     */     }
/* 386 */     return this.connectorGender;
/*     */   }
/*     */ 
/*     */   public ZoomDimension getDigitalZoom()
/*     */   {
/* 398 */     return this.digitalZoom;
/*     */   }
/*     */ 
/*     */   public void setDigitalZoom(ZoomDimension value)
/*     */   {
/* 410 */     this.digitalZoom = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 422 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 434 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getFixedFocalLength()
/*     */   {
/* 446 */     return this.fixedFocalLength;
/*     */   }
/*     */ 
/*     */   public void setFixedFocalLength(LengthDimension value)
/*     */   {
/* 458 */     this.fixedFocalLength = value;
/*     */   }
/*     */ 
/*     */   public String getFocusType()
/*     */   {
/* 470 */     return this.focusType;
/*     */   }
/*     */ 
/*     */   public void setFocusType(String value)
/*     */   {
/* 482 */     this.focusType = value;
/*     */   }
/*     */ 
/*     */   public String getImageStabilization()
/*     */   {
/* 494 */     return this.imageStabilization;
/*     */   }
/*     */ 
/*     */   public void setImageStabilization(String value)
/*     */   {
/* 506 */     this.imageStabilization = value;
/*     */   }
/*     */ 
/*     */   public ApertureDimension getMaxAperture()
/*     */   {
/* 518 */     return this.maxAperture;
/*     */   }
/*     */ 
/*     */   public void setMaxAperture(ApertureDimension value)
/*     */   {
/* 530 */     this.maxAperture = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMaxFocalLength()
/*     */   {
/* 542 */     return this.maxFocalLength;
/*     */   }
/*     */ 
/*     */   public void setMaxFocalLength(LengthDimension value)
/*     */   {
/* 554 */     this.maxFocalLength = value;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 566 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 578 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public ApertureDimension getMinAperture()
/*     */   {
/* 590 */     return this.minAperture;
/*     */   }
/*     */ 
/*     */   public void setMinAperture(ApertureDimension value)
/*     */   {
/* 602 */     this.minAperture = value;
/*     */   }
/*     */ 
/*     */   public ZoomDimension getOpticalZoom()
/*     */   {
/* 614 */     return this.opticalZoom;
/*     */   }
/*     */ 
/*     */   public void setOpticalZoom(ZoomDimension value)
/*     */   {
/* 626 */     this.opticalZoom = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 638 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 650 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getRemoteControlDescription()
/*     */   {
/* 662 */     return this.remoteControlDescription;
/*     */   }
/*     */ 
/*     */   public void setRemoteControlDescription(String value)
/*     */   {
/* 674 */     this.remoteControlDescription = value;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 686 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 698 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFirewirePorts()
/*     */   {
/* 710 */     return this.totalFirewirePorts;
/*     */   }
/*     */ 
/*     */   public void setTotalFirewirePorts(BigInteger value)
/*     */   {
/* 722 */     this.totalFirewirePorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalSVideoOutPorts()
/*     */   {
/* 734 */     return this.totalSVideoOutPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalSVideoOutPorts(BigInteger value)
/*     */   {
/* 746 */     this.totalSVideoOutPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalUSBPorts()
/*     */   {
/* 758 */     return this.totalUSBPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalUSBPorts(BigInteger value)
/*     */   {
/* 770 */     this.totalUSBPorts = value;
/*     */   }
/*     */ 
/*     */   public String getViewFinderType()
/*     */   {
/* 782 */     return this.viewFinderType;
/*     */   }
/*     */ 
/*     */   public void setViewFinderType(String value)
/*     */   {
/* 794 */     this.viewFinderType = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 806 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 818 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CETelescope
 * JD-Core Version:    0.6.2
 */