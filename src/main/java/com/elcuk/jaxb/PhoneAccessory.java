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
/*     */ @XmlType(name="", propOrder={"batteryCellType", "batteryChargeCycles", "batteryPower", "connectorGender", "finishType", "internetApplications", "memorySlotsAvailable", "powerPlugType", "powerSource", "screenSize", "softwareIncluded", "wirelessTechnology", "efficiency"})
/*     */ @XmlRootElement(name="PhoneAccessory")
/*     */ public class PhoneAccessory
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
/*     */   @XmlElement(name="ConnectorGender")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> connectorGender;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="InternetApplications")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> internetApplications;
/*     */ 
/*     */   @XmlElement(name="MemorySlotsAvailable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memorySlotsAvailable;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="SoftwareIncluded")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String softwareIncluded;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public BatteryCellTypeValues getBatteryCellType()
/*     */   {
/* 112 */     return this.batteryCellType;
/*     */   }
/*     */ 
/*     */   public void setBatteryCellType(BatteryCellTypeValues value)
/*     */   {
/* 124 */     this.batteryCellType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getBatteryChargeCycles()
/*     */   {
/* 136 */     return this.batteryChargeCycles;
/*     */   }
/*     */ 
/*     */   public void setBatteryChargeCycles(BigInteger value)
/*     */   {
/* 148 */     this.batteryChargeCycles = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 160 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 172 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public List<String> getConnectorGender()
/*     */   {
/* 198 */     if (this.connectorGender == null) {
/* 199 */       this.connectorGender = new ArrayList();
/*     */     }
/* 201 */     return this.connectorGender;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 213 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 225 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getInternetApplications()
/*     */   {
/* 251 */     if (this.internetApplications == null) {
/* 252 */       this.internetApplications = new ArrayList();
/*     */     }
/* 254 */     return this.internetApplications;
/*     */   }
/*     */ 
/*     */   public String getMemorySlotsAvailable()
/*     */   {
/* 266 */     return this.memorySlotsAvailable;
/*     */   }
/*     */ 
/*     */   public void setMemorySlotsAvailable(String value)
/*     */   {
/* 278 */     this.memorySlotsAvailable = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 290 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 302 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 314 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 326 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 338 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 350 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public String getSoftwareIncluded()
/*     */   {
/* 362 */     return this.softwareIncluded;
/*     */   }
/*     */ 
/*     */   public void setSoftwareIncluded(String value)
/*     */   {
/* 374 */     this.softwareIncluded = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 400 */     if (this.wirelessTechnology == null) {
/* 401 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 403 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 415 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 427 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PhoneAccessory
 * JD-Core Version:    0.6.2
 */