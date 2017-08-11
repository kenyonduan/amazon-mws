/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"variationData", "acAdapterCurrent", "cableLength", "cableSpeed", "cableType", "compatibleDevices", "compatibleDeviceSize", "conductor", "connectionType", "connectorNumber", "maximumHorizontalVideoResolution", "maximumVerticalVideoResolution", "modelNumber", "numberOfFans", "numberOfMonitorConnections", "privacyScreenMaterialType", "privacyScreenSize", "voltage", "wattage"})
/*     */ @XmlRootElement(name="ComputerAddOn")
/*     */ public class ComputerAddOn
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="ACAdapterCurrent")
/*     */   protected CurrentFiveDigitDimension acAdapterCurrent;
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthSevenDigitDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="CableSpeed")
/*     */   protected DataTransferSpeedDimension cableSpeed;
/*     */ 
/*     */   @XmlElement(name="CableType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String cableType;
/*     */ 
/*     */   @XmlElement(name="CompatibleDevices")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String compatibleDevices;
/*     */ 
/*     */   @XmlElement(name="CompatibleDeviceSize")
/*     */   protected BigDecimal compatibleDeviceSize;
/*     */ 
/*     */   @XmlElement(name="Conductor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String conductor;
/*     */ 
/*     */   @XmlElement(name="ConnectionType")
/*     */   protected ConnectionTypeValues connectionType;
/*     */ 
/*     */   @XmlElement(name="ConnectorNumber")
/*     */   protected BigInteger connectorNumber;
/*     */ 
/*     */   @XmlElement(name="MaximumHorizontalVideoResolution")
/*     */   protected BigInteger maximumHorizontalVideoResolution;
/*     */ 
/*     */   @XmlElement(name="MaximumVerticalVideoResolution")
/*     */   protected BigInteger maximumVerticalVideoResolution;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="NumberOfFans")
/*     */   protected BigInteger numberOfFans;
/*     */ 
/*     */   @XmlElement(name="NumberOfMonitorConnections")
/*     */   protected BigInteger numberOfMonitorConnections;
/*     */ 
/*     */   @XmlElement(name="PrivacyScreenMaterialType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String privacyScreenMaterialType;
/*     */ 
/*     */   @XmlElement(name="PrivacyScreenSize")
/*     */   protected BigInteger privacyScreenSize;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 130 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 142 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public CurrentFiveDigitDimension getACAdapterCurrent()
/*     */   {
/* 154 */     return this.acAdapterCurrent;
/*     */   }
/*     */ 
/*     */   public void setACAdapterCurrent(CurrentFiveDigitDimension value)
/*     */   {
/* 166 */     this.acAdapterCurrent = value;
/*     */   }
/*     */ 
/*     */   public LengthSevenDigitDimension getCableLength()
/*     */   {
/* 178 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthSevenDigitDimension value)
/*     */   {
/* 190 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public DataTransferSpeedDimension getCableSpeed()
/*     */   {
/* 202 */     return this.cableSpeed;
/*     */   }
/*     */ 
/*     */   public void setCableSpeed(DataTransferSpeedDimension value)
/*     */   {
/* 214 */     this.cableSpeed = value;
/*     */   }
/*     */ 
/*     */   public String getCableType()
/*     */   {
/* 226 */     return this.cableType;
/*     */   }
/*     */ 
/*     */   public void setCableType(String value)
/*     */   {
/* 238 */     this.cableType = value;
/*     */   }
/*     */ 
/*     */   public String getCompatibleDevices()
/*     */   {
/* 250 */     return this.compatibleDevices;
/*     */   }
/*     */ 
/*     */   public void setCompatibleDevices(String value)
/*     */   {
/* 262 */     this.compatibleDevices = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getCompatibleDeviceSize()
/*     */   {
/* 274 */     return this.compatibleDeviceSize;
/*     */   }
/*     */ 
/*     */   public void setCompatibleDeviceSize(BigDecimal value)
/*     */   {
/* 286 */     this.compatibleDeviceSize = value;
/*     */   }
/*     */ 
/*     */   public String getConductor()
/*     */   {
/* 298 */     return this.conductor;
/*     */   }
/*     */ 
/*     */   public void setConductor(String value)
/*     */   {
/* 310 */     this.conductor = value;
/*     */   }
/*     */ 
/*     */   public ConnectionTypeValues getConnectionType()
/*     */   {
/* 322 */     return this.connectionType;
/*     */   }
/*     */ 
/*     */   public void setConnectionType(ConnectionTypeValues value)
/*     */   {
/* 334 */     this.connectionType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getConnectorNumber()
/*     */   {
/* 346 */     return this.connectorNumber;
/*     */   }
/*     */ 
/*     */   public void setConnectorNumber(BigInteger value)
/*     */   {
/* 358 */     this.connectorNumber = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaximumHorizontalVideoResolution()
/*     */   {
/* 370 */     return this.maximumHorizontalVideoResolution;
/*     */   }
/*     */ 
/*     */   public void setMaximumHorizontalVideoResolution(BigInteger value)
/*     */   {
/* 382 */     this.maximumHorizontalVideoResolution = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaximumVerticalVideoResolution()
/*     */   {
/* 394 */     return this.maximumVerticalVideoResolution;
/*     */   }
/*     */ 
/*     */   public void setMaximumVerticalVideoResolution(BigInteger value)
/*     */   {
/* 406 */     this.maximumVerticalVideoResolution = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 418 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 430 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfFans()
/*     */   {
/* 442 */     return this.numberOfFans;
/*     */   }
/*     */ 
/*     */   public void setNumberOfFans(BigInteger value)
/*     */   {
/* 454 */     this.numberOfFans = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfMonitorConnections()
/*     */   {
/* 466 */     return this.numberOfMonitorConnections;
/*     */   }
/*     */ 
/*     */   public void setNumberOfMonitorConnections(BigInteger value)
/*     */   {
/* 478 */     this.numberOfMonitorConnections = value;
/*     */   }
/*     */ 
/*     */   public String getPrivacyScreenMaterialType()
/*     */   {
/* 490 */     return this.privacyScreenMaterialType;
/*     */   }
/*     */ 
/*     */   public void setPrivacyScreenMaterialType(String value)
/*     */   {
/* 502 */     this.privacyScreenMaterialType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getPrivacyScreenSize()
/*     */   {
/* 514 */     return this.privacyScreenSize;
/*     */   }
/*     */ 
/*     */   public void setPrivacyScreenSize(BigInteger value)
/*     */   {
/* 526 */     this.privacyScreenSize = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 538 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 550 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 562 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 574 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerAddOn
 * JD-Core Version:    0.6.2
 */