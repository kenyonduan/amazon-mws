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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "cpuSocketType", "frontSideBusSpeed", "graphicsCardInterface", "hdmiPorts", "integratedAudioChannels", "maxEthernetSpeed", "maxMemorySupported", "memoryStandard", "modelNumber", "motherboardFormFactor", "multiGPUTechnology", "northbridge", "numberOfeSATAPorts", "numberOfEthernetPorts", "numberOfFireWire400Ports", "numberOfFireWire800Ports", "numberOfIDEPorts", "numberOfMemorySlots", "numberOfPCIExpressSlots", "numberOfSATAPorts", "numberOfUSBPorts", "onboardVideo", "sataraid", "sataStandardsSupported", "southbridge", "spdifOutput", "typeOfMemorySlot", "usbPortType", "voltage", "wattage"})
/*     */ @XmlRootElement(name="Motherboard")
/*     */ public class Motherboard
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="CPUSocketType")
/*     */   protected String cpuSocketType;
/*     */ 
/*     */   @XmlElement(name="FrontSideBusSpeed")
/*     */   protected BigInteger frontSideBusSpeed;
/*     */ 
/*     */   @XmlElement(name="GraphicsCardInterface")
/*     */   protected List<GraphicsCardInterfaceTypeValues> graphicsCardInterface;
/*     */ 
/*     */   @XmlElement(name="HDMIPorts")
/*     */   protected BigInteger hdmiPorts;
/*     */ 
/*     */   @XmlElement(name="IntegratedAudioChannels")
/*     */   protected BigInteger integratedAudioChannels;
/*     */ 
/*     */   @XmlElement(name="MaxEthernetSpeed")
/*     */   protected MaxEthernetSpeedTypeValues maxEthernetSpeed;
/*     */ 
/*     */   @XmlElement(name="MaxMemorySupported")
/*     */   protected MemorySizeIntegerDimension maxMemorySupported;
/*     */ 
/*     */   @XmlElement(name="MemoryStandard")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String memoryStandard;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="MotherboardFormFactor")
/*     */   protected String motherboardFormFactor;
/*     */ 
/*     */   @XmlElement(name="MultiGPUTechnology")
/*     */   protected String multiGPUTechnology;
/*     */ 
/*     */   @XmlElement(name="Northbridge")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String northbridge;
/*     */ 
/*     */   @XmlElement(name="NumberOfeSATAPorts")
/*     */   protected BigInteger numberOfeSATAPorts;
/*     */ 
/*     */   @XmlElement(name="NumberOfEthernetPorts")
/*     */   protected BigInteger numberOfEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="NumberOfFireWire400Ports")
/*     */   protected BigInteger numberOfFireWire400Ports;
/*     */ 
/*     */   @XmlElement(name="NumberOfFireWire800Ports")
/*     */   protected BigInteger numberOfFireWire800Ports;
/*     */ 
/*     */   @XmlElement(name="NumberOfIDEPorts")
/*     */   protected BigInteger numberOfIDEPorts;
/*     */ 
/*     */   @XmlElement(name="NumberOfMemorySlots")
/*     */   protected BigInteger numberOfMemorySlots;
/*     */ 
/*     */   @XmlElement(name="NumberOfPCIExpressSlots")
/*     */   protected BigInteger numberOfPCIExpressSlots;
/*     */ 
/*     */   @XmlElement(name="NumberOfSATAPorts")
/*     */   protected BigInteger numberOfSATAPorts;
/*     */ 
/*     */   @XmlElement(name="NumberOfUSBPorts")
/*     */   protected BigInteger numberOfUSBPorts;
/*     */ 
/*     */   @XmlElement(name="OnboardVideo")
/*     */   protected String onboardVideo;
/*     */ 
/*     */   @XmlElement(name="SATARAID")
/*     */   protected String sataraid;
/*     */ 
/*     */   @XmlElement(name="SATAStandardsSupported")
/*     */   protected List<String> sataStandardsSupported;
/*     */ 
/*     */   @XmlElement(name="Southbridge")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String southbridge;
/*     */ 
/*     */   @XmlElement(name="SPDIFOutput")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String spdifOutput;
/*     */ 
/*     */   @XmlElement(name="TypeOfMemorySlot")
/*     */   protected BigInteger typeOfMemorySlot;
/*     */ 
/*     */   @XmlElement(name="USBPortType")
/*     */   protected BigInteger usbPortType;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 185 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 197 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 209 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 221 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getCPUSocketType()
/*     */   {
/* 233 */     return this.cpuSocketType;
/*     */   }
/*     */ 
/*     */   public void setCPUSocketType(String value)
/*     */   {
/* 245 */     this.cpuSocketType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getFrontSideBusSpeed()
/*     */   {
/* 257 */     return this.frontSideBusSpeed;
/*     */   }
/*     */ 
/*     */   public void setFrontSideBusSpeed(BigInteger value)
/*     */   {
/* 269 */     this.frontSideBusSpeed = value;
/*     */   }
/*     */ 
/*     */   public List<GraphicsCardInterfaceTypeValues> getGraphicsCardInterface()
/*     */   {
/* 295 */     if (this.graphicsCardInterface == null) {
/* 296 */       this.graphicsCardInterface = new ArrayList();
/*     */     }
/* 298 */     return this.graphicsCardInterface;
/*     */   }
/*     */ 
/*     */   public BigInteger getHDMIPorts()
/*     */   {
/* 310 */     return this.hdmiPorts;
/*     */   }
/*     */ 
/*     */   public void setHDMIPorts(BigInteger value)
/*     */   {
/* 322 */     this.hdmiPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getIntegratedAudioChannels()
/*     */   {
/* 334 */     return this.integratedAudioChannels;
/*     */   }
/*     */ 
/*     */   public void setIntegratedAudioChannels(BigInteger value)
/*     */   {
/* 346 */     this.integratedAudioChannels = value;
/*     */   }
/*     */ 
/*     */   public MaxEthernetSpeedTypeValues getMaxEthernetSpeed()
/*     */   {
/* 358 */     return this.maxEthernetSpeed;
/*     */   }
/*     */ 
/*     */   public void setMaxEthernetSpeed(MaxEthernetSpeedTypeValues value)
/*     */   {
/* 370 */     this.maxEthernetSpeed = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeIntegerDimension getMaxMemorySupported()
/*     */   {
/* 382 */     return this.maxMemorySupported;
/*     */   }
/*     */ 
/*     */   public void setMaxMemorySupported(MemorySizeIntegerDimension value)
/*     */   {
/* 394 */     this.maxMemorySupported = value;
/*     */   }
/*     */ 
/*     */   public String getMemoryStandard()
/*     */   {
/* 406 */     return this.memoryStandard;
/*     */   }
/*     */ 
/*     */   public void setMemoryStandard(String value)
/*     */   {
/* 418 */     this.memoryStandard = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 430 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 442 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getMotherboardFormFactor()
/*     */   {
/* 454 */     return this.motherboardFormFactor;
/*     */   }
/*     */ 
/*     */   public void setMotherboardFormFactor(String value)
/*     */   {
/* 466 */     this.motherboardFormFactor = value;
/*     */   }
/*     */ 
/*     */   public String getMultiGPUTechnology()
/*     */   {
/* 478 */     return this.multiGPUTechnology;
/*     */   }
/*     */ 
/*     */   public void setMultiGPUTechnology(String value)
/*     */   {
/* 490 */     this.multiGPUTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getNorthbridge()
/*     */   {
/* 502 */     return this.northbridge;
/*     */   }
/*     */ 
/*     */   public void setNorthbridge(String value)
/*     */   {
/* 514 */     this.northbridge = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfeSATAPorts()
/*     */   {
/* 526 */     return this.numberOfeSATAPorts;
/*     */   }
/*     */ 
/*     */   public void setNumberOfeSATAPorts(BigInteger value)
/*     */   {
/* 538 */     this.numberOfeSATAPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfEthernetPorts()
/*     */   {
/* 550 */     return this.numberOfEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setNumberOfEthernetPorts(BigInteger value)
/*     */   {
/* 562 */     this.numberOfEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfFireWire400Ports()
/*     */   {
/* 574 */     return this.numberOfFireWire400Ports;
/*     */   }
/*     */ 
/*     */   public void setNumberOfFireWire400Ports(BigInteger value)
/*     */   {
/* 586 */     this.numberOfFireWire400Ports = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfFireWire800Ports()
/*     */   {
/* 598 */     return this.numberOfFireWire800Ports;
/*     */   }
/*     */ 
/*     */   public void setNumberOfFireWire800Ports(BigInteger value)
/*     */   {
/* 610 */     this.numberOfFireWire800Ports = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfIDEPorts()
/*     */   {
/* 622 */     return this.numberOfIDEPorts;
/*     */   }
/*     */ 
/*     */   public void setNumberOfIDEPorts(BigInteger value)
/*     */   {
/* 634 */     this.numberOfIDEPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfMemorySlots()
/*     */   {
/* 646 */     return this.numberOfMemorySlots;
/*     */   }
/*     */ 
/*     */   public void setNumberOfMemorySlots(BigInteger value)
/*     */   {
/* 658 */     this.numberOfMemorySlots = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfPCIExpressSlots()
/*     */   {
/* 670 */     return this.numberOfPCIExpressSlots;
/*     */   }
/*     */ 
/*     */   public void setNumberOfPCIExpressSlots(BigInteger value)
/*     */   {
/* 682 */     this.numberOfPCIExpressSlots = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfSATAPorts()
/*     */   {
/* 694 */     return this.numberOfSATAPorts;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSATAPorts(BigInteger value)
/*     */   {
/* 706 */     this.numberOfSATAPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfUSBPorts()
/*     */   {
/* 718 */     return this.numberOfUSBPorts;
/*     */   }
/*     */ 
/*     */   public void setNumberOfUSBPorts(BigInteger value)
/*     */   {
/* 730 */     this.numberOfUSBPorts = value;
/*     */   }
/*     */ 
/*     */   public String getOnboardVideo()
/*     */   {
/* 742 */     return this.onboardVideo;
/*     */   }
/*     */ 
/*     */   public void setOnboardVideo(String value)
/*     */   {
/* 754 */     this.onboardVideo = value;
/*     */   }
/*     */ 
/*     */   public String getSATARAID()
/*     */   {
/* 766 */     return this.sataraid;
/*     */   }
/*     */ 
/*     */   public void setSATARAID(String value)
/*     */   {
/* 778 */     this.sataraid = value;
/*     */   }
/*     */ 
/*     */   public List<String> getSATAStandardsSupported()
/*     */   {
/* 804 */     if (this.sataStandardsSupported == null) {
/* 805 */       this.sataStandardsSupported = new ArrayList();
/*     */     }
/* 807 */     return this.sataStandardsSupported;
/*     */   }
/*     */ 
/*     */   public String getSouthbridge()
/*     */   {
/* 819 */     return this.southbridge;
/*     */   }
/*     */ 
/*     */   public void setSouthbridge(String value)
/*     */   {
/* 831 */     this.southbridge = value;
/*     */   }
/*     */ 
/*     */   public String getSPDIFOutput()
/*     */   {
/* 843 */     return this.spdifOutput;
/*     */   }
/*     */ 
/*     */   public void setSPDIFOutput(String value)
/*     */   {
/* 855 */     this.spdifOutput = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTypeOfMemorySlot()
/*     */   {
/* 867 */     return this.typeOfMemorySlot;
/*     */   }
/*     */ 
/*     */   public void setTypeOfMemorySlot(BigInteger value)
/*     */   {
/* 879 */     this.typeOfMemorySlot = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getUSBPortType()
/*     */   {
/* 891 */     return this.usbPortType;
/*     */   }
/*     */ 
/*     */   public void setUSBPortType(BigInteger value)
/*     */   {
/* 903 */     this.usbPortType = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 915 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 927 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 939 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 951 */     this.wattage = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Motherboard
 * JD-Core Version:    0.6.2
 */