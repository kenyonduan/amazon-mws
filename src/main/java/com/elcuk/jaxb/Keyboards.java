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
/*     */ @XmlType(name="", propOrder={"variationData", "handOrientation", "inputDeviceDesignStyle", "keyboardDescription", "modelNumber", "voltage", "wattage", "wirelessInputDeviceProtocol", "wirelessInputDeviceTechnology"})
/*     */ @XmlRootElement(name="Keyboards")
/*     */ public class Keyboards
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="HandOrientation")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String handOrientation;
/*     */ 
/*     */   @XmlElement(name="InputDeviceDesignStyle")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String inputDeviceDesignStyle;
/*     */ 
/*     */   @XmlElement(name="KeyboardDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String keyboardDescription;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   @XmlElement(name="WirelessInputDeviceProtocol")
/*     */   protected String wirelessInputDeviceProtocol;
/*     */ 
/*     */   @XmlElement(name="WirelessInputDeviceTechnology")
/*     */   protected WirelessInputDeviceTechnologyTypeValues wirelessInputDeviceTechnology;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/*  89 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 101 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getHandOrientation()
/*     */   {
/* 113 */     return this.handOrientation;
/*     */   }
/*     */ 
/*     */   public void setHandOrientation(String value)
/*     */   {
/* 125 */     this.handOrientation = value;
/*     */   }
/*     */ 
/*     */   public String getInputDeviceDesignStyle()
/*     */   {
/* 137 */     return this.inputDeviceDesignStyle;
/*     */   }
/*     */ 
/*     */   public void setInputDeviceDesignStyle(String value)
/*     */   {
/* 149 */     this.inputDeviceDesignStyle = value;
/*     */   }
/*     */ 
/*     */   public String getKeyboardDescription()
/*     */   {
/* 161 */     return this.keyboardDescription;
/*     */   }
/*     */ 
/*     */   public void setKeyboardDescription(String value)
/*     */   {
/* 173 */     this.keyboardDescription = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 185 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 197 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 209 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 221 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 233 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 245 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public String getWirelessInputDeviceProtocol()
/*     */   {
/* 257 */     return this.wirelessInputDeviceProtocol;
/*     */   }
/*     */ 
/*     */   public void setWirelessInputDeviceProtocol(String value)
/*     */   {
/* 269 */     this.wirelessInputDeviceProtocol = value;
/*     */   }
/*     */ 
/*     */   public WirelessInputDeviceTechnologyTypeValues getWirelessInputDeviceTechnology()
/*     */   {
/* 281 */     return this.wirelessInputDeviceTechnology;
/*     */   }
/*     */ 
/*     */   public void setWirelessInputDeviceTechnology(WirelessInputDeviceTechnologyTypeValues value)
/*     */   {
/* 293 */     this.wirelessInputDeviceTechnology = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Keyboards
 * JD-Core Version:    0.6.2
 */