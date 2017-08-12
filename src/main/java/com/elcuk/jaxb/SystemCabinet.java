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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "airDuctLocation", "expansionSlots", "externalBayType", "hotswapBayType", "internalBayType", "materialType", "modelNumber", "motherboardCompatibility", "panelWindowLocation", "powerSupplyMaxOutput", "powerSupplyMounting", "systemCabinetFormFactor", "totalFrontPanelAudioInPorts", "totalFrontPanelAudioOutPorts", "totalFrontPaneleSataPorts", "totalFrontPanelFirewire400Ports", "totalFrontPanelFirewire800Ports", "totalFrontPanelUSB10Ports", "totalFrontPanelUSB11Ports", "totalFrontPanelUSB20Ports", "totalFrontPanelUSB30Ports", "totalNumberOfExternalBays", "totalNumberOfHotswapBays", "totalNumberOfInternalBays", "voltage", "wattage"})
/*     */ @XmlRootElement(name="SystemCabinet")
/*     */ public class SystemCabinet
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="AirDuctLocation")
/*     */   protected String airDuctLocation;
/*     */ 
/*     */   @XmlElement(name="ExpansionSlots")
/*     */   protected BigInteger expansionSlots;
/*     */ 
/*     */   @XmlElement(name="ExternalBayType")
/*     */   protected List<LengthFourDigitDimension> externalBayType;
/*     */ 
/*     */   @XmlElement(name="HotswapBayType")
/*     */   protected List<LengthFourDigitDimension> hotswapBayType;
/*     */ 
/*     */   @XmlElement(name="InternalBayType")
/*     */   protected List<LengthFourDigitDimension> internalBayType;
/*     */ 
/*     */   @XmlElement(name="MaterialType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String materialType;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="MotherboardCompatibility")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String motherboardCompatibility;
/*     */ 
/*     */   @XmlElement(name="PanelWindowLocation")
/*     */   protected String panelWindowLocation;
/*     */ 
/*     */   @XmlElement(name="PowerSupplyMaxOutput")
/*     */   protected PowerSixDigitDimension powerSupplyMaxOutput;
/*     */ 
/*     */   @XmlElement(name="PowerSupplyMounting")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSupplyMounting;
/*     */ 
/*     */   @XmlElement(name="SystemCabinetFormFactor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String systemCabinetFormFactor;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPanelAudioInPorts")
/*     */   protected BigInteger totalFrontPanelAudioInPorts;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPanelAudioOutPorts")
/*     */   protected BigInteger totalFrontPanelAudioOutPorts;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPaneleSataPorts")
/*     */   protected BigInteger totalFrontPaneleSataPorts;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPanelFirewire400Ports")
/*     */   protected BigInteger totalFrontPanelFirewire400Ports;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPanelFirewire800Ports")
/*     */   protected BigInteger totalFrontPanelFirewire800Ports;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPanelUSB1.0Ports")
/*     */   protected BigInteger totalFrontPanelUSB10Ports;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPanelUSB1.1Ports")
/*     */   protected BigInteger totalFrontPanelUSB11Ports;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPanelUSB2.0Ports")
/*     */   protected BigInteger totalFrontPanelUSB20Ports;
/*     */ 
/*     */   @XmlElement(name="TotalFrontPanelUSB3.0Ports")
/*     */   protected BigInteger totalFrontPanelUSB30Ports;
/*     */ 
/*     */   @XmlElement(name="TotalNumberOfExternalBays")
/*     */   protected BigInteger totalNumberOfExternalBays;
/*     */ 
/*     */   @XmlElement(name="TotalNumberOfHotswapBays")
/*     */   protected BigInteger totalNumberOfHotswapBays;
/*     */ 
/*     */   @XmlElement(name="TotalNumberOfInternalBays")
/*     */   protected BigInteger totalNumberOfInternalBays;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 169 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 181 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 193 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 205 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getAirDuctLocation()
/*     */   {
/* 217 */     return this.airDuctLocation;
/*     */   }
/*     */ 
/*     */   public void setAirDuctLocation(String value)
/*     */   {
/* 229 */     this.airDuctLocation = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getExpansionSlots()
/*     */   {
/* 241 */     return this.expansionSlots;
/*     */   }
/*     */ 
/*     */   public void setExpansionSlots(BigInteger value)
/*     */   {
/* 253 */     this.expansionSlots = value;
/*     */   }
/*     */ 
/*     */   public List<LengthFourDigitDimension> getExternalBayType()
/*     */   {
/* 279 */     if (this.externalBayType == null) {
/* 280 */       this.externalBayType = new ArrayList();
/*     */     }
/* 282 */     return this.externalBayType;
/*     */   }
/*     */ 
/*     */   public List<LengthFourDigitDimension> getHotswapBayType()
/*     */   {
/* 308 */     if (this.hotswapBayType == null) {
/* 309 */       this.hotswapBayType = new ArrayList();
/*     */     }
/* 311 */     return this.hotswapBayType;
/*     */   }
/*     */ 
/*     */   public List<LengthFourDigitDimension> getInternalBayType()
/*     */   {
/* 337 */     if (this.internalBayType == null) {
/* 338 */       this.internalBayType = new ArrayList();
/*     */     }
/* 340 */     return this.internalBayType;
/*     */   }
/*     */ 
/*     */   public String getMaterialType()
/*     */   {
/* 352 */     return this.materialType;
/*     */   }
/*     */ 
/*     */   public void setMaterialType(String value)
/*     */   {
/* 364 */     this.materialType = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 376 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 388 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getMotherboardCompatibility()
/*     */   {
/* 400 */     return this.motherboardCompatibility;
/*     */   }
/*     */ 
/*     */   public void setMotherboardCompatibility(String value)
/*     */   {
/* 412 */     this.motherboardCompatibility = value;
/*     */   }
/*     */ 
/*     */   public String getPanelWindowLocation()
/*     */   {
/* 424 */     return this.panelWindowLocation;
/*     */   }
/*     */ 
/*     */   public void setPanelWindowLocation(String value)
/*     */   {
/* 436 */     this.panelWindowLocation = value;
/*     */   }
/*     */ 
/*     */   public PowerSixDigitDimension getPowerSupplyMaxOutput()
/*     */   {
/* 448 */     return this.powerSupplyMaxOutput;
/*     */   }
/*     */ 
/*     */   public void setPowerSupplyMaxOutput(PowerSixDigitDimension value)
/*     */   {
/* 460 */     this.powerSupplyMaxOutput = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSupplyMounting()
/*     */   {
/* 472 */     return this.powerSupplyMounting;
/*     */   }
/*     */ 
/*     */   public void setPowerSupplyMounting(String value)
/*     */   {
/* 484 */     this.powerSupplyMounting = value;
/*     */   }
/*     */ 
/*     */   public String getSystemCabinetFormFactor()
/*     */   {
/* 496 */     return this.systemCabinetFormFactor;
/*     */   }
/*     */ 
/*     */   public void setSystemCabinetFormFactor(String value)
/*     */   {
/* 508 */     this.systemCabinetFormFactor = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPanelAudioInPorts()
/*     */   {
/* 520 */     return this.totalFrontPanelAudioInPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPanelAudioInPorts(BigInteger value)
/*     */   {
/* 532 */     this.totalFrontPanelAudioInPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPanelAudioOutPorts()
/*     */   {
/* 544 */     return this.totalFrontPanelAudioOutPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPanelAudioOutPorts(BigInteger value)
/*     */   {
/* 556 */     this.totalFrontPanelAudioOutPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPaneleSataPorts()
/*     */   {
/* 568 */     return this.totalFrontPaneleSataPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPaneleSataPorts(BigInteger value)
/*     */   {
/* 580 */     this.totalFrontPaneleSataPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPanelFirewire400Ports()
/*     */   {
/* 592 */     return this.totalFrontPanelFirewire400Ports;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPanelFirewire400Ports(BigInteger value)
/*     */   {
/* 604 */     this.totalFrontPanelFirewire400Ports = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPanelFirewire800Ports()
/*     */   {
/* 616 */     return this.totalFrontPanelFirewire800Ports;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPanelFirewire800Ports(BigInteger value)
/*     */   {
/* 628 */     this.totalFrontPanelFirewire800Ports = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPanelUSB10Ports()
/*     */   {
/* 640 */     return this.totalFrontPanelUSB10Ports;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPanelUSB10Ports(BigInteger value)
/*     */   {
/* 652 */     this.totalFrontPanelUSB10Ports = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPanelUSB11Ports()
/*     */   {
/* 664 */     return this.totalFrontPanelUSB11Ports;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPanelUSB11Ports(BigInteger value)
/*     */   {
/* 676 */     this.totalFrontPanelUSB11Ports = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPanelUSB20Ports()
/*     */   {
/* 688 */     return this.totalFrontPanelUSB20Ports;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPanelUSB20Ports(BigInteger value)
/*     */   {
/* 700 */     this.totalFrontPanelUSB20Ports = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalFrontPanelUSB30Ports()
/*     */   {
/* 712 */     return this.totalFrontPanelUSB30Ports;
/*     */   }
/*     */ 
/*     */   public void setTotalFrontPanelUSB30Ports(BigInteger value)
/*     */   {
/* 724 */     this.totalFrontPanelUSB30Ports = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalNumberOfExternalBays()
/*     */   {
/* 736 */     return this.totalNumberOfExternalBays;
/*     */   }
/*     */ 
/*     */   public void setTotalNumberOfExternalBays(BigInteger value)
/*     */   {
/* 748 */     this.totalNumberOfExternalBays = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalNumberOfHotswapBays()
/*     */   {
/* 760 */     return this.totalNumberOfHotswapBays;
/*     */   }
/*     */ 
/*     */   public void setTotalNumberOfHotswapBays(BigInteger value)
/*     */   {
/* 772 */     this.totalNumberOfHotswapBays = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalNumberOfInternalBays()
/*     */   {
/* 784 */     return this.totalNumberOfInternalBays;
/*     */   }
/*     */ 
/*     */   public void setTotalNumberOfInternalBays(BigInteger value)
/*     */   {
/* 796 */     this.totalNumberOfInternalBays = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 808 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 820 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 832 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 844 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SystemCabinet
 * JD-Core Version:    0.6.2
 */