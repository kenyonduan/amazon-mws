/*     */ package com.elcuk.jaxb;
/*     */ 
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
/*     */ @XmlType(name="", propOrder={"boxContents", "maxWeightCapacity", "powerPlugType", "waterResistantLevel", "wirelessTechnology", "efficiency"})
/*     */ @XmlRootElement(name="CameraBagsAndCases")
/*     */ public class CameraBagsAndCases
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BoxContents")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String boxContents;
/*     */ 
/*     */   @XmlElement(name="MaxWeightCapacity")
/*     */   protected WeightDimension maxWeightCapacity;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="WaterResistantLevel")
/*     */   protected WaterResistantType waterResistantLevel;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public String getBoxContents()
/*     */   {
/*  76 */     return this.boxContents;
/*     */   }
/*     */ 
/*     */   public void setBoxContents(String value)
/*     */   {
/*  88 */     this.boxContents = value;
/*     */   }
/*     */ 
/*     */   public WeightDimension getMaxWeightCapacity()
/*     */   {
/* 100 */     return this.maxWeightCapacity;
/*     */   }
/*     */ 
/*     */   public void setMaxWeightCapacity(WeightDimension value)
/*     */   {
/* 112 */     this.maxWeightCapacity = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 124 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 136 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public WaterResistantType getWaterResistantLevel()
/*     */   {
/* 148 */     return this.waterResistantLevel;
/*     */   }
/*     */ 
/*     */   public void setWaterResistantLevel(WaterResistantType value)
/*     */   {
/* 160 */     this.waterResistantLevel = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 186 */     if (this.wirelessTechnology == null) {
/* 187 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 189 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 201 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 213 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CameraBagsAndCases
 * JD-Core Version:    0.6.2
 */