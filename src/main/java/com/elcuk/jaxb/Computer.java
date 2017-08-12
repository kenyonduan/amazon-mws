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
/*     */ @XmlType(name="", propOrder={"variationData", "cableLength", "connectionInterface", "connectorNumber", "modelNumber", "numberOfUSBHubConnectorPorts", "pressureLevels", "tabletMaximumDataRate", "tabletMinimumSystemRequirements", "tabletResolution", "tabletSurfaceActiveArea", "tvTunerMemory", "tvTunerVideoOutputInterface", "tvTunerVideoStandard", "voltage", "wattage"})
/*     */ @XmlRootElement(name="Computer")
/*     */ public class Computer
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthSevenDigitDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="ConnectionInterface")
/*     */   protected List<ConnectionTypeValues> connectionInterface;
/*     */ 
/*     */   @XmlElement(name="ConnectorNumber")
/*     */   protected BigInteger connectorNumber;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="NumberOfUSBHubConnectorPorts")
/*     */   protected BigInteger numberOfUSBHubConnectorPorts;
/*     */ 
/*     */   @XmlElement(name="PressureLevels")
/*     */   protected PressureLevelSixDigitIntegerDimension pressureLevels;
/*     */ 
/*     */   @XmlElement(name="TabletMaximumDataRate")
/*     */   protected TabletDataRateDimension tabletMaximumDataRate;
/*     */ 
/*     */   @XmlElement(name="TabletMinimumSystemRequirements")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String tabletMinimumSystemRequirements;
/*     */ 
/*     */   @XmlElement(name="TabletResolution")
/*     */   protected TabletResolutionDimension tabletResolution;
/*     */ 
/*     */   @XmlElement(name="TabletSurfaceActiveArea")
/*     */   protected TabletActiveSurfaceAreaDimension tabletSurfaceActiveArea;
/*     */ 
/*     */   @XmlElement(name="TVTunerMemory")
/*     */   protected MemorySizeTenDigitIntegerDimension tvTunerMemory;
/*     */ 
/*     */   @XmlElement(name="TVTunerVideoOutputInterface")
/*     */   protected List<String> tvTunerVideoOutputInterface;
/*     */ 
/*     */   @XmlElement(name="TVTunerVideoStandard")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String tvTunerVideoStandard;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 118 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 130 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public LengthSevenDigitDimension getCableLength()
/*     */   {
/* 142 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthSevenDigitDimension value)
/*     */   {
/* 154 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public List<ConnectionTypeValues> getConnectionInterface()
/*     */   {
/* 180 */     if (this.connectionInterface == null) {
/* 181 */       this.connectionInterface = new ArrayList();
/*     */     }
/* 183 */     return this.connectionInterface;
/*     */   }
/*     */ 
/*     */   public BigInteger getConnectorNumber()
/*     */   {
/* 195 */     return this.connectorNumber;
/*     */   }
/*     */ 
/*     */   public void setConnectorNumber(BigInteger value)
/*     */   {
/* 207 */     this.connectorNumber = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 219 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 231 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfUSBHubConnectorPorts()
/*     */   {
/* 243 */     return this.numberOfUSBHubConnectorPorts;
/*     */   }
/*     */ 
/*     */   public void setNumberOfUSBHubConnectorPorts(BigInteger value)
/*     */   {
/* 255 */     this.numberOfUSBHubConnectorPorts = value;
/*     */   }
/*     */ 
/*     */   public PressureLevelSixDigitIntegerDimension getPressureLevels()
/*     */   {
/* 267 */     return this.pressureLevels;
/*     */   }
/*     */ 
/*     */   public void setPressureLevels(PressureLevelSixDigitIntegerDimension value)
/*     */   {
/* 279 */     this.pressureLevels = value;
/*     */   }
/*     */ 
/*     */   public TabletDataRateDimension getTabletMaximumDataRate()
/*     */   {
/* 291 */     return this.tabletMaximumDataRate;
/*     */   }
/*     */ 
/*     */   public void setTabletMaximumDataRate(TabletDataRateDimension value)
/*     */   {
/* 303 */     this.tabletMaximumDataRate = value;
/*     */   }
/*     */ 
/*     */   public String getTabletMinimumSystemRequirements()
/*     */   {
/* 315 */     return this.tabletMinimumSystemRequirements;
/*     */   }
/*     */ 
/*     */   public void setTabletMinimumSystemRequirements(String value)
/*     */   {
/* 327 */     this.tabletMinimumSystemRequirements = value;
/*     */   }
/*     */ 
/*     */   public TabletResolutionDimension getTabletResolution()
/*     */   {
/* 339 */     return this.tabletResolution;
/*     */   }
/*     */ 
/*     */   public void setTabletResolution(TabletResolutionDimension value)
/*     */   {
/* 351 */     this.tabletResolution = value;
/*     */   }
/*     */ 
/*     */   public TabletActiveSurfaceAreaDimension getTabletSurfaceActiveArea()
/*     */   {
/* 363 */     return this.tabletSurfaceActiveArea;
/*     */   }
/*     */ 
/*     */   public void setTabletSurfaceActiveArea(TabletActiveSurfaceAreaDimension value)
/*     */   {
/* 375 */     this.tabletSurfaceActiveArea = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeTenDigitIntegerDimension getTVTunerMemory()
/*     */   {
/* 387 */     return this.tvTunerMemory;
/*     */   }
/*     */ 
/*     */   public void setTVTunerMemory(MemorySizeTenDigitIntegerDimension value)
/*     */   {
/* 399 */     this.tvTunerMemory = value;
/*     */   }
/*     */ 
/*     */   public List<String> getTVTunerVideoOutputInterface()
/*     */   {
/* 425 */     if (this.tvTunerVideoOutputInterface == null) {
/* 426 */       this.tvTunerVideoOutputInterface = new ArrayList();
/*     */     }
/* 428 */     return this.tvTunerVideoOutputInterface;
/*     */   }
/*     */ 
/*     */   public String getTVTunerVideoStandard()
/*     */   {
/* 440 */     return this.tvTunerVideoStandard;
/*     */   }
/*     */ 
/*     */   public void setTVTunerVideoStandard(String value)
/*     */   {
/* 452 */     this.tvTunerVideoStandard = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 464 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 476 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 488 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 500 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Computer
 * JD-Core Version:    0.6.2
 */