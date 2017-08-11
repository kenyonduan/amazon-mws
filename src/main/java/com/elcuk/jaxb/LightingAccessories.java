/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
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
/*     */ @XmlType(name="", propOrder={"baseDiameter", "battery", "circuitBreakerInstallationType", "circuitBreakerType", "color", "colorMap", "countryOfOrigin", "displayDepth", "displayDiameter", "displayHeight", "displayLength", "displayWeight", "displayWidth", "includedComponent", "itemDiameter", "maximumCurrent", "numberOfStrands", "plugInstallationType", "plugType", "powerSource", "specificUses", "strandDiameter", "switchStyle", "switchType", "voltage", "volume", "wattage", "efficiency"})
/*     */ @XmlRootElement(name="LightingAccessories")
/*     */ public class LightingAccessories
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BaseDiameter")
/*     */   protected LengthDimension baseDiameter;
/*     */ 
/*     */   @XmlElement(name="Battery")
/*     */   protected Battery battery;
/*     */ 
/*     */   @XmlElement(name="CircuitBreakerInstallationType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String circuitBreakerInstallationType;
/*     */ 
/*     */   @XmlElement(name="CircuitBreakerType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String circuitBreakerType;
/*     */ 
/*     */   @XmlElement(name="Color")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String color;
/*     */ 
/*     */   @XmlElement(name="ColorMap")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String colorMap;
/*     */ 
/*     */   @XmlElement(name="CountryOfOrigin")
/*     */   protected String countryOfOrigin;
/*     */ 
/*     */   @XmlElement(name="DisplayDepth")
/*     */   protected LengthDimension displayDepth;
/*     */ 
/*     */   @XmlElement(name="DisplayDiameter")
/*     */   protected LengthDimension displayDiameter;
/*     */ 
/*     */   @XmlElement(name="DisplayHeight")
/*     */   protected LengthDimension displayHeight;
/*     */ 
/*     */   @XmlElement(name="DisplayLength")
/*     */   protected LengthDimension displayLength;
/*     */ 
/*     */   @XmlElement(name="DisplayWeight")
/*     */   protected WeightDimension displayWeight;
/*     */ 
/*     */   @XmlElement(name="DisplayWidth")
/*     */   protected LengthDimension displayWidth;
/*     */ 
/*     */   @XmlElement(name="IncludedComponent")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> includedComponent;
/*     */ 
/*     */   @XmlElement(name="ItemDiameter")
/*     */   protected LengthDimension itemDiameter;
/*     */ 
/*     */   @XmlElement(name="MaximumCurrent")
/*     */   protected AmperageDimension maximumCurrent;
/*     */ 
/*     */   @XmlElement(name="NumberOfStrands")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String numberOfStrands;
/*     */ 
/*     */   @XmlElement(name="PlugInstallationType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String plugInstallationType;
/*     */ 
/*     */   @XmlElement(name="PlugType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String plugType;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="SpecificUses")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String specificUses;
/*     */ 
/*     */   @XmlElement(name="StrandDiameter")
/*     */   protected LengthDimension strandDiameter;
/*     */ 
/*     */   @XmlElement(name="SwitchStyle")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String switchStyle;
/*     */ 
/*     */   @XmlElement(name="SwitchType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String switchType;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected VoltageIntegerDimensionOptionalUnit voltage;
/*     */ 
/*     */   @XmlElement(name="Volume")
/*     */   protected VolumeDimension volume;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigDecimal wattage;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public LengthDimension getBaseDiameter()
/*     */   {
/* 175 */     return this.baseDiameter;
/*     */   }
/*     */ 
/*     */   public void setBaseDiameter(LengthDimension value)
/*     */   {
/* 187 */     this.baseDiameter = value;
/*     */   }
/*     */ 
/*     */   public Battery getBattery()
/*     */   {
/* 199 */     return this.battery;
/*     */   }
/*     */ 
/*     */   public void setBattery(Battery value)
/*     */   {
/* 211 */     this.battery = value;
/*     */   }
/*     */ 
/*     */   public String getCircuitBreakerInstallationType()
/*     */   {
/* 223 */     return this.circuitBreakerInstallationType;
/*     */   }
/*     */ 
/*     */   public void setCircuitBreakerInstallationType(String value)
/*     */   {
/* 235 */     this.circuitBreakerInstallationType = value;
/*     */   }
/*     */ 
/*     */   public String getCircuitBreakerType()
/*     */   {
/* 247 */     return this.circuitBreakerType;
/*     */   }
/*     */ 
/*     */   public void setCircuitBreakerType(String value)
/*     */   {
/* 259 */     this.circuitBreakerType = value;
/*     */   }
/*     */ 
/*     */   public String getColor()
/*     */   {
/* 271 */     return this.color;
/*     */   }
/*     */ 
/*     */   public void setColor(String value)
/*     */   {
/* 283 */     this.color = value;
/*     */   }
/*     */ 
/*     */   public String getColorMap()
/*     */   {
/* 295 */     return this.colorMap;
/*     */   }
/*     */ 
/*     */   public void setColorMap(String value)
/*     */   {
/* 307 */     this.colorMap = value;
/*     */   }
/*     */ 
/*     */   public String getCountryOfOrigin()
/*     */   {
/* 319 */     return this.countryOfOrigin;
/*     */   }
/*     */ 
/*     */   public void setCountryOfOrigin(String value)
/*     */   {
/* 331 */     this.countryOfOrigin = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getDisplayDepth()
/*     */   {
/* 343 */     return this.displayDepth;
/*     */   }
/*     */ 
/*     */   public void setDisplayDepth(LengthDimension value)
/*     */   {
/* 355 */     this.displayDepth = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getDisplayDiameter()
/*     */   {
/* 367 */     return this.displayDiameter;
/*     */   }
/*     */ 
/*     */   public void setDisplayDiameter(LengthDimension value)
/*     */   {
/* 379 */     this.displayDiameter = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getDisplayHeight()
/*     */   {
/* 391 */     return this.displayHeight;
/*     */   }
/*     */ 
/*     */   public void setDisplayHeight(LengthDimension value)
/*     */   {
/* 403 */     this.displayHeight = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getDisplayLength()
/*     */   {
/* 415 */     return this.displayLength;
/*     */   }
/*     */ 
/*     */   public void setDisplayLength(LengthDimension value)
/*     */   {
/* 427 */     this.displayLength = value;
/*     */   }
/*     */ 
/*     */   public WeightDimension getDisplayWeight()
/*     */   {
/* 439 */     return this.displayWeight;
/*     */   }
/*     */ 
/*     */   public void setDisplayWeight(WeightDimension value)
/*     */   {
/* 451 */     this.displayWeight = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getDisplayWidth()
/*     */   {
/* 463 */     return this.displayWidth;
/*     */   }
/*     */ 
/*     */   public void setDisplayWidth(LengthDimension value)
/*     */   {
/* 475 */     this.displayWidth = value;
/*     */   }
/*     */ 
/*     */   public List<String> getIncludedComponent()
/*     */   {
/* 501 */     if (this.includedComponent == null) {
/* 502 */       this.includedComponent = new ArrayList();
/*     */     }
/* 504 */     return this.includedComponent;
/*     */   }
/*     */ 
/*     */   public LengthDimension getItemDiameter()
/*     */   {
/* 516 */     return this.itemDiameter;
/*     */   }
/*     */ 
/*     */   public void setItemDiameter(LengthDimension value)
/*     */   {
/* 528 */     this.itemDiameter = value;
/*     */   }
/*     */ 
/*     */   public AmperageDimension getMaximumCurrent()
/*     */   {
/* 540 */     return this.maximumCurrent;
/*     */   }
/*     */ 
/*     */   public void setMaximumCurrent(AmperageDimension value)
/*     */   {
/* 552 */     this.maximumCurrent = value;
/*     */   }
/*     */ 
/*     */   public String getNumberOfStrands()
/*     */   {
/* 564 */     return this.numberOfStrands;
/*     */   }
/*     */ 
/*     */   public void setNumberOfStrands(String value)
/*     */   {
/* 576 */     this.numberOfStrands = value;
/*     */   }
/*     */ 
/*     */   public String getPlugInstallationType()
/*     */   {
/* 588 */     return this.plugInstallationType;
/*     */   }
/*     */ 
/*     */   public void setPlugInstallationType(String value)
/*     */   {
/* 600 */     this.plugInstallationType = value;
/*     */   }
/*     */ 
/*     */   public String getPlugType()
/*     */   {
/* 612 */     return this.plugType;
/*     */   }
/*     */ 
/*     */   public void setPlugType(String value)
/*     */   {
/* 624 */     this.plugType = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 636 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 648 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public String getSpecificUses()
/*     */   {
/* 660 */     return this.specificUses;
/*     */   }
/*     */ 
/*     */   public void setSpecificUses(String value)
/*     */   {
/* 672 */     this.specificUses = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getStrandDiameter()
/*     */   {
/* 684 */     return this.strandDiameter;
/*     */   }
/*     */ 
/*     */   public void setStrandDiameter(LengthDimension value)
/*     */   {
/* 696 */     this.strandDiameter = value;
/*     */   }
/*     */ 
/*     */   public String getSwitchStyle()
/*     */   {
/* 708 */     return this.switchStyle;
/*     */   }
/*     */ 
/*     */   public void setSwitchStyle(String value)
/*     */   {
/* 720 */     this.switchStyle = value;
/*     */   }
/*     */ 
/*     */   public String getSwitchType()
/*     */   {
/* 732 */     return this.switchType;
/*     */   }
/*     */ 
/*     */   public void setSwitchType(String value)
/*     */   {
/* 744 */     this.switchType = value;
/*     */   }
/*     */ 
/*     */   public VoltageIntegerDimensionOptionalUnit getVoltage()
/*     */   {
/* 756 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(VoltageIntegerDimensionOptionalUnit value)
/*     */   {
/* 768 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public VolumeDimension getVolume()
/*     */   {
/* 780 */     return this.volume;
/*     */   }
/*     */ 
/*     */   public void setVolume(VolumeDimension value)
/*     */   {
/* 792 */     this.volume = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getWattage()
/*     */   {
/* 804 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigDecimal value)
/*     */   {
/* 816 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 828 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 840 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.LightingAccessories
 * JD-Core Version:    0.6.2
 */