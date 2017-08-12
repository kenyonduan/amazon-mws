/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
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
/*     */ @XmlType(name="", propOrder={"variationData", "size", "color", "colorMap", "material", "minimumEfficiencyReportingValue", "powerSource", "voltage", "wattage", "batteryCapacity", "manufacturerWarrantyDescription", "sellerWarrantyDescription", "customerPackageType"})
/*     */ @XmlRootElement(name="MajorHomeAppliances")
/*     */ public class MajorHomeAppliances
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="Size")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String size;
/*     */ 
/*     */   @XmlElement(name="Color")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String color;
/*     */ 
/*     */   @XmlElement(name="ColorMap")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String colorMap;
/*     */ 
/*     */   @XmlElement(name="Material")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String material;
/*     */ 
/*     */   @XmlElement(name="MinimumEfficiencyReportingValue")
/*     */   protected Integer minimumEfficiencyReportingValue;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   @XmlElement(name="BatteryCapacity")
/*     */   protected BigDecimal batteryCapacity;
/*     */ 
/*     */   @XmlElement(name="ManufacturerWarrantyDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String manufacturerWarrantyDescription;
/*     */ 
/*     */   @XmlElement(name="SellerWarrantyDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sellerWarrantyDescription;
/*     */ 
/*     */   @XmlElement(name="CustomerPackageType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String customerPackageType;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 146 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 158 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getSize()
/*     */   {
/* 170 */     return this.size;
/*     */   }
/*     */ 
/*     */   public void setSize(String value)
/*     */   {
/* 182 */     this.size = value;
/*     */   }
/*     */ 
/*     */   public String getColor()
/*     */   {
/* 194 */     return this.color;
/*     */   }
/*     */ 
/*     */   public void setColor(String value)
/*     */   {
/* 206 */     this.color = value;
/*     */   }
/*     */ 
/*     */   public String getColorMap()
/*     */   {
/* 218 */     return this.colorMap;
/*     */   }
/*     */ 
/*     */   public void setColorMap(String value)
/*     */   {
/* 230 */     this.colorMap = value;
/*     */   }
/*     */ 
/*     */   public String getMaterial()
/*     */   {
/* 242 */     return this.material;
/*     */   }
/*     */ 
/*     */   public void setMaterial(String value)
/*     */   {
/* 254 */     this.material = value;
/*     */   }
/*     */ 
/*     */   public Integer getMinimumEfficiencyReportingValue()
/*     */   {
/* 266 */     return this.minimumEfficiencyReportingValue;
/*     */   }
/*     */ 
/*     */   public void setMinimumEfficiencyReportingValue(Integer value)
/*     */   {
/* 278 */     this.minimumEfficiencyReportingValue = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 290 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 302 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 314 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 326 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 338 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 350 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getBatteryCapacity()
/*     */   {
/* 362 */     return this.batteryCapacity;
/*     */   }
/*     */ 
/*     */   public void setBatteryCapacity(BigDecimal value)
/*     */   {
/* 374 */     this.batteryCapacity = value;
/*     */   }
/*     */ 
/*     */   public String getManufacturerWarrantyDescription()
/*     */   {
/* 386 */     return this.manufacturerWarrantyDescription;
/*     */   }
/*     */ 
/*     */   public void setManufacturerWarrantyDescription(String value)
/*     */   {
/* 398 */     this.manufacturerWarrantyDescription = value;
/*     */   }
/*     */ 
/*     */   public String getSellerWarrantyDescription()
/*     */   {
/* 410 */     return this.sellerWarrantyDescription;
/*     */   }
/*     */ 
/*     */   public void setSellerWarrantyDescription(String value)
/*     */   {
/* 422 */     this.sellerWarrantyDescription = value;
/*     */   }
/*     */ 
/*     */   public String getCustomerPackageType()
/*     */   {
/* 434 */     return this.customerPackageType;
/*     */   }
/*     */ 
/*     */   public void setCustomerPackageType(String value)
/*     */   {
/* 446 */     this.customerPackageType = value;
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
/* 515 */       return this.parentage;
/*     */     }
/*     */ 
/*     */     public void setParentage(String value)
/*     */     {
/* 527 */       this.parentage = value;
/*     */     }
/*     */ 
/*     */     public String getVariationTheme()
/*     */     {
/* 539 */       return this.variationTheme;
/*     */     }
/*     */ 
/*     */     public void setVariationTheme(String value)
/*     */     {
/* 551 */       this.variationTheme = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MajorHomeAppliances
 * JD-Core Version:    0.6.2
 */