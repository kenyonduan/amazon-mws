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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "energyEfficiencyRating", "mainPowerConnector", "modelNumber", "modular", "numberOfSATAPowerConnectors", "pciExpressConnectorConfiguration", "powerFactorCorrection", "powerSupplyFormFactor", "powerSupplyMaxOutput", "sliCertification", "voltage", "wattage"})
/*     */ @XmlRootElement(name="SystemPowerDevice")
/*     */ public class SystemPowerDevice
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="EnergyEfficiencyRating")
/*     */   protected String energyEfficiencyRating;
/*     */ 
/*     */   @XmlElement(name="MainPowerConnector")
/*     */   protected String mainPowerConnector;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="Modular")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modular;
/*     */ 
/*     */   @XmlElement(name="NumberOfSATAPowerConnectors")
/*     */   protected BigInteger numberOfSATAPowerConnectors;
/*     */ 
/*     */   @XmlElement(name="PCIExpressConnectorConfiguration")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String pciExpressConnectorConfiguration;
/*     */ 
/*     */   @XmlElement(name="PowerFactorCorrection")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerFactorCorrection;
/*     */ 
/*     */   @XmlElement(name="PowerSupplyFormFactor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSupplyFormFactor;
/*     */ 
/*     */   @XmlElement(name="PowerSupplyMaxOutput")
/*     */   protected PowerSixDigitDimension powerSupplyMaxOutput;
/*     */ 
/*     */   @XmlElement(name="SLICertification")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sliCertification;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 112 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 124 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 136 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 148 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getEnergyEfficiencyRating()
/*     */   {
/* 160 */     return this.energyEfficiencyRating;
/*     */   }
/*     */ 
/*     */   public void setEnergyEfficiencyRating(String value)
/*     */   {
/* 172 */     this.energyEfficiencyRating = value;
/*     */   }
/*     */ 
/*     */   public String getMainPowerConnector()
/*     */   {
/* 184 */     return this.mainPowerConnector;
/*     */   }
/*     */ 
/*     */   public void setMainPowerConnector(String value)
/*     */   {
/* 196 */     this.mainPowerConnector = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 208 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 220 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getModular()
/*     */   {
/* 232 */     return this.modular;
/*     */   }
/*     */ 
/*     */   public void setModular(String value)
/*     */   {
/* 244 */     this.modular = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfSATAPowerConnectors()
/*     */   {
/* 256 */     return this.numberOfSATAPowerConnectors;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSATAPowerConnectors(BigInteger value)
/*     */   {
/* 268 */     this.numberOfSATAPowerConnectors = value;
/*     */   }
/*     */ 
/*     */   public String getPCIExpressConnectorConfiguration()
/*     */   {
/* 280 */     return this.pciExpressConnectorConfiguration;
/*     */   }
/*     */ 
/*     */   public void setPCIExpressConnectorConfiguration(String value)
/*     */   {
/* 292 */     this.pciExpressConnectorConfiguration = value;
/*     */   }
/*     */ 
/*     */   public String getPowerFactorCorrection()
/*     */   {
/* 304 */     return this.powerFactorCorrection;
/*     */   }
/*     */ 
/*     */   public void setPowerFactorCorrection(String value)
/*     */   {
/* 316 */     this.powerFactorCorrection = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSupplyFormFactor()
/*     */   {
/* 328 */     return this.powerSupplyFormFactor;
/*     */   }
/*     */ 
/*     */   public void setPowerSupplyFormFactor(String value)
/*     */   {
/* 340 */     this.powerSupplyFormFactor = value;
/*     */   }
/*     */ 
/*     */   public PowerSixDigitDimension getPowerSupplyMaxOutput()
/*     */   {
/* 352 */     return this.powerSupplyMaxOutput;
/*     */   }
/*     */ 
/*     */   public void setPowerSupplyMaxOutput(PowerSixDigitDimension value)
/*     */   {
/* 364 */     this.powerSupplyMaxOutput = value;
/*     */   }
/*     */ 
/*     */   public String getSLICertification()
/*     */   {
/* 376 */     return this.sliCertification;
/*     */   }
/*     */ 
/*     */   public void setSLICertification(String value)
/*     */   {
/* 388 */     this.sliCertification = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 400 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 412 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 424 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 436 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SystemPowerDevice
 * JD-Core Version:    0.6.2
 */