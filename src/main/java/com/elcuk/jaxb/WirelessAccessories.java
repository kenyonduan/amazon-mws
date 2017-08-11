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
/*     */ @XmlType(name="", propOrder={"variationData", "color", "colorMap", "additionalFeatures", "talkTime", "standbyTime", "chargingTime", "batteryPower", "solar", "refillable", "extended", "slim", "auxiliary", "batteryType", "antennaType", "compatiblePhoneModels", "manufacturerName", "keywords", "itemPackageQuantity", "headsetType", "headsetStyle"})
/*     */ @XmlRootElement(name="WirelessAccessories")
/*     */ public class WirelessAccessories
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="Color")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String color;
/*     */ 
/*     */   @XmlElement(name="ColorMap")
/*     */   protected String colorMap;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="TalkTime")
/*     */   protected TimeDimension talkTime;
/*     */ 
/*     */   @XmlElement(name="StandbyTime")
/*     */   protected TimeDimension standbyTime;
/*     */ 
/*     */   @XmlElement(name="ChargingTime")
/*     */   protected TimeDimension chargingTime;
/*     */ 
/*     */   @XmlElement(name="BatteryPower")
/*     */   protected BatteryPowerIntegerDimension batteryPower;
/*     */ 
/*     */   @XmlElement(name="Solar")
/*     */   protected Boolean solar;
/*     */ 
/*     */   @XmlElement(name="Refillable")
/*     */   protected Boolean refillable;
/*     */ 
/*     */   @XmlElement(name="Extended")
/*     */   protected Boolean extended;
/*     */ 
/*     */   @XmlElement(name="Slim")
/*     */   protected Boolean slim;
/*     */ 
/*     */   @XmlElement(name="Auxiliary")
/*     */   protected Boolean auxiliary;
/*     */ 
/*     */   @XmlElement(name="BatteryType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String batteryType;
/*     */ 
/*     */   @XmlElement(name="AntennaType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String antennaType;
/*     */ 
/*     */   @XmlElement(name="CompatiblePhoneModels")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> compatiblePhoneModels;
/*     */ 
/*     */   @XmlElement(name="ManufacturerName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String manufacturerName;
/*     */ 
/*     */   @XmlElement(name="Keywords")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> keywords;
/*     */ 
/*     */   @XmlElement(name="ItemPackageQuantity")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger itemPackageQuantity;
/*     */ 
/*     */   @XmlElement(name="HeadsetType")
/*     */   protected HeadsetTypeValue headsetType;
/*     */ 
/*     */   @XmlElement(name="HeadsetStyle")
/*     */   protected HeadsetStyleValue headsetStyle;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 167 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 179 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getColor()
/*     */   {
/* 191 */     return this.color;
/*     */   }
/*     */ 
/*     */   public void setColor(String value)
/*     */   {
/* 203 */     this.color = value;
/*     */   }
/*     */ 
/*     */   public String getColorMap()
/*     */   {
/* 215 */     return this.colorMap;
/*     */   }
/*     */ 
/*     */   public void setColorMap(String value)
/*     */   {
/* 227 */     this.colorMap = value;
/*     */   }
/*     */ 
/*     */   public List<String> getAdditionalFeatures()
/*     */   {
/* 253 */     if (this.additionalFeatures == null) {
/* 254 */       this.additionalFeatures = new ArrayList();
/*     */     }
/* 256 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public TimeDimension getTalkTime()
/*     */   {
/* 268 */     return this.talkTime;
/*     */   }
/*     */ 
/*     */   public void setTalkTime(TimeDimension value)
/*     */   {
/* 280 */     this.talkTime = value;
/*     */   }
/*     */ 
/*     */   public TimeDimension getStandbyTime()
/*     */   {
/* 292 */     return this.standbyTime;
/*     */   }
/*     */ 
/*     */   public void setStandbyTime(TimeDimension value)
/*     */   {
/* 304 */     this.standbyTime = value;
/*     */   }
/*     */ 
/*     */   public TimeDimension getChargingTime()
/*     */   {
/* 316 */     return this.chargingTime;
/*     */   }
/*     */ 
/*     */   public void setChargingTime(TimeDimension value)
/*     */   {
/* 328 */     this.chargingTime = value;
/*     */   }
/*     */ 
/*     */   public BatteryPowerIntegerDimension getBatteryPower()
/*     */   {
/* 340 */     return this.batteryPower;
/*     */   }
/*     */ 
/*     */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*     */   {
/* 352 */     this.batteryPower = value;
/*     */   }
/*     */ 
/*     */   public Boolean isSolar()
/*     */   {
/* 364 */     return this.solar;
/*     */   }
/*     */ 
/*     */   public void setSolar(Boolean value)
/*     */   {
/* 376 */     this.solar = value;
/*     */   }
/*     */ 
/*     */   public Boolean isRefillable()
/*     */   {
/* 388 */     return this.refillable;
/*     */   }
/*     */ 
/*     */   public void setRefillable(Boolean value)
/*     */   {
/* 400 */     this.refillable = value;
/*     */   }
/*     */ 
/*     */   public Boolean isExtended()
/*     */   {
/* 412 */     return this.extended;
/*     */   }
/*     */ 
/*     */   public void setExtended(Boolean value)
/*     */   {
/* 424 */     this.extended = value;
/*     */   }
/*     */ 
/*     */   public Boolean isSlim()
/*     */   {
/* 436 */     return this.slim;
/*     */   }
/*     */ 
/*     */   public void setSlim(Boolean value)
/*     */   {
/* 448 */     this.slim = value;
/*     */   }
/*     */ 
/*     */   public Boolean isAuxiliary()
/*     */   {
/* 460 */     return this.auxiliary;
/*     */   }
/*     */ 
/*     */   public void setAuxiliary(Boolean value)
/*     */   {
/* 472 */     this.auxiliary = value;
/*     */   }
/*     */ 
/*     */   public String getBatteryType()
/*     */   {
/* 484 */     return this.batteryType;
/*     */   }
/*     */ 
/*     */   public void setBatteryType(String value)
/*     */   {
/* 496 */     this.batteryType = value;
/*     */   }
/*     */ 
/*     */   public String getAntennaType()
/*     */   {
/* 508 */     return this.antennaType;
/*     */   }
/*     */ 
/*     */   public void setAntennaType(String value)
/*     */   {
/* 520 */     this.antennaType = value;
/*     */   }
/*     */ 
/*     */   public List<String> getCompatiblePhoneModels()
/*     */   {
/* 546 */     if (this.compatiblePhoneModels == null) {
/* 547 */       this.compatiblePhoneModels = new ArrayList();
/*     */     }
/* 549 */     return this.compatiblePhoneModels;
/*     */   }
/*     */ 
/*     */   public String getManufacturerName()
/*     */   {
/* 561 */     return this.manufacturerName;
/*     */   }
/*     */ 
/*     */   public void setManufacturerName(String value)
/*     */   {
/* 573 */     this.manufacturerName = value;
/*     */   }
/*     */ 
/*     */   public List<String> getKeywords()
/*     */   {
/* 599 */     if (this.keywords == null) {
/* 600 */       this.keywords = new ArrayList();
/*     */     }
/* 602 */     return this.keywords;
/*     */   }
/*     */ 
/*     */   public BigInteger getItemPackageQuantity()
/*     */   {
/* 614 */     return this.itemPackageQuantity;
/*     */   }
/*     */ 
/*     */   public void setItemPackageQuantity(BigInteger value)
/*     */   {
/* 626 */     this.itemPackageQuantity = value;
/*     */   }
/*     */ 
/*     */   public HeadsetTypeValue getHeadsetType()
/*     */   {
/* 638 */     return this.headsetType;
/*     */   }
/*     */ 
/*     */   public void setHeadsetType(HeadsetTypeValue value)
/*     */   {
/* 650 */     this.headsetType = value;
/*     */   }
/*     */ 
/*     */   public HeadsetStyleValue getHeadsetStyle()
/*     */   {
/* 662 */     return this.headsetStyle;
/*     */   }
/*     */ 
/*     */   public void setHeadsetStyle(HeadsetStyleValue value)
/*     */   {
/* 674 */     this.headsetStyle = value;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"parentage", "variationTheme"})
/*     */   public static class VariationData
/*     */   {
/*     */ 
/*     */     @XmlElement(name="Parentage", required=true)
/*     */     protected String parentage;
/*     */ 
/*     */     @XmlElement(name="VariationTheme")
/*     */     protected String variationTheme;
/*     */ 
/*     */     public String getParentage()
/*     */     {
/* 732 */       return this.parentage;
/*     */     }
/*     */ 
/*     */     public void setParentage(String value)
/*     */     {
/* 744 */       this.parentage = value;
/*     */     }
/*     */ 
/*     */     public String getVariationTheme()
/*     */     {
/* 756 */       return this.variationTheme;
/*     */     }
/*     */ 
/*     */     public void setVariationTheme(String value)
/*     */     {
/* 768 */       this.variationTheme = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WirelessAccessories
 * JD-Core Version:    0.6.2
 */