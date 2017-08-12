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
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "additionalFunctionality", "ipProtocolStandards", "lanPortBandwidth", "lanPortNumber", "maxDownstreamTransmissionRate", "maxUpstreamTransmissionRate", "modelNumber", "modemType", "networkAdapterType", "operatingSystemCompatability", "securityProtocol", "simultaneousSessions", "voltage", "wattage", "wirelessDataTransferRate", "wirelessRouterTransmissionBand", "wirelessTechnology"})
/*     */ @XmlRootElement(name="NetworkingDevice")
/*     */ public class NetworkingDevice
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="AdditionalFunctionality")
/*     */   protected List<String> additionalFunctionality;
/*     */ 
/*     */   @XmlElement(name="IPProtocolStandards")
/*     */   protected String ipProtocolStandards;
/*     */ 
/*     */   @XmlElement(name="LANPortBandwidth")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String lanPortBandwidth;
/*     */ 
/*     */   @XmlElement(name="LANPortNumber")
/*     */   protected BigInteger lanPortNumber;
/*     */ 
/*     */   @XmlElement(name="MaxDownstreamTransmissionRate")
/*     */   protected DataTransferSpeedFiveDigitIntegerDimension maxDownstreamTransmissionRate;
/*     */ 
/*     */   @XmlElement(name="MaxUpstreamTransmissionRate")
/*     */   protected DataTransferSpeedFiveDigitIntegerDimension maxUpstreamTransmissionRate;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="ModemType")
/*     */   protected ModemTypeValues modemType;
/*     */ 
/*     */   @XmlElement(name="NetworkAdapterType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String networkAdapterType;
/*     */ 
/*     */   @XmlElement(name="OperatingSystemCompatability")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String operatingSystemCompatability;
/*     */ 
/*     */   @XmlElement(name="SecurityProtocol")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String securityProtocol;
/*     */ 
/*     */   @XmlElement(name="SimultaneousSessions")
/*     */   protected BigInteger simultaneousSessions;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   @XmlElement(name="WirelessDataTransferRate")
/*     */   protected DataTransferSpeedFiveDigitIntegerDimension wirelessDataTransferRate;
/*     */ 
/*     */   @XmlElement(name="WirelessRouterTransmissionBand")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String wirelessRouterTransmissionBand;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String wirelessTechnology;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 135 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 147 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 159 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 171 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public List<String> getAdditionalFunctionality()
/*     */   {
/* 197 */     if (this.additionalFunctionality == null) {
/* 198 */       this.additionalFunctionality = new ArrayList();
/*     */     }
/* 200 */     return this.additionalFunctionality;
/*     */   }
/*     */ 
/*     */   public String getIPProtocolStandards()
/*     */   {
/* 212 */     return this.ipProtocolStandards;
/*     */   }
/*     */ 
/*     */   public void setIPProtocolStandards(String value)
/*     */   {
/* 224 */     this.ipProtocolStandards = value;
/*     */   }
/*     */ 
/*     */   public String getLANPortBandwidth()
/*     */   {
/* 236 */     return this.lanPortBandwidth;
/*     */   }
/*     */ 
/*     */   public void setLANPortBandwidth(String value)
/*     */   {
/* 248 */     this.lanPortBandwidth = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getLANPortNumber()
/*     */   {
/* 260 */     return this.lanPortNumber;
/*     */   }
/*     */ 
/*     */   public void setLANPortNumber(BigInteger value)
/*     */   {
/* 272 */     this.lanPortNumber = value;
/*     */   }
/*     */ 
/*     */   public DataTransferSpeedFiveDigitIntegerDimension getMaxDownstreamTransmissionRate()
/*     */   {
/* 284 */     return this.maxDownstreamTransmissionRate;
/*     */   }
/*     */ 
/*     */   public void setMaxDownstreamTransmissionRate(DataTransferSpeedFiveDigitIntegerDimension value)
/*     */   {
/* 296 */     this.maxDownstreamTransmissionRate = value;
/*     */   }
/*     */ 
/*     */   public DataTransferSpeedFiveDigitIntegerDimension getMaxUpstreamTransmissionRate()
/*     */   {
/* 308 */     return this.maxUpstreamTransmissionRate;
/*     */   }
/*     */ 
/*     */   public void setMaxUpstreamTransmissionRate(DataTransferSpeedFiveDigitIntegerDimension value)
/*     */   {
/* 320 */     this.maxUpstreamTransmissionRate = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 332 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 344 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public ModemTypeValues getModemType()
/*     */   {
/* 356 */     return this.modemType;
/*     */   }
/*     */ 
/*     */   public void setModemType(ModemTypeValues value)
/*     */   {
/* 368 */     this.modemType = value;
/*     */   }
/*     */ 
/*     */   public String getNetworkAdapterType()
/*     */   {
/* 380 */     return this.networkAdapterType;
/*     */   }
/*     */ 
/*     */   public void setNetworkAdapterType(String value)
/*     */   {
/* 392 */     this.networkAdapterType = value;
/*     */   }
/*     */ 
/*     */   public String getOperatingSystemCompatability()
/*     */   {
/* 404 */     return this.operatingSystemCompatability;
/*     */   }
/*     */ 
/*     */   public void setOperatingSystemCompatability(String value)
/*     */   {
/* 416 */     this.operatingSystemCompatability = value;
/*     */   }
/*     */ 
/*     */   public String getSecurityProtocol()
/*     */   {
/* 428 */     return this.securityProtocol;
/*     */   }
/*     */ 
/*     */   public void setSecurityProtocol(String value)
/*     */   {
/* 440 */     this.securityProtocol = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getSimultaneousSessions()
/*     */   {
/* 452 */     return this.simultaneousSessions;
/*     */   }
/*     */ 
/*     */   public void setSimultaneousSessions(BigInteger value)
/*     */   {
/* 464 */     this.simultaneousSessions = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 476 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 488 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 500 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 512 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public DataTransferSpeedFiveDigitIntegerDimension getWirelessDataTransferRate()
/*     */   {
/* 524 */     return this.wirelessDataTransferRate;
/*     */   }
/*     */ 
/*     */   public void setWirelessDataTransferRate(DataTransferSpeedFiveDigitIntegerDimension value)
/*     */   {
/* 536 */     this.wirelessDataTransferRate = value;
/*     */   }
/*     */ 
/*     */   public String getWirelessRouterTransmissionBand()
/*     */   {
/* 548 */     return this.wirelessRouterTransmissionBand;
/*     */   }
/*     */ 
/*     */   public void setWirelessRouterTransmissionBand(String value)
/*     */   {
/* 560 */     this.wirelessRouterTransmissionBand = value;
/*     */   }
/*     */ 
/*     */   public String getWirelessTechnology()
/*     */   {
/* 572 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public void setWirelessTechnology(String value)
/*     */   {
/* 584 */     this.wirelessTechnology = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.NetworkingDevice
 * JD-Core Version:    0.6.2
 */