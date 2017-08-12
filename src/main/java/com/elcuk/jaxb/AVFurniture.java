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
/*     */ @XmlType(name="", propOrder={"enclosureFinish", "finishType", "maximumSupportedScreenSize", "maxWeightCapacity", "maxWeightRecommendation", "minimumSupportedScreenSize", "mountingPattern", "mountingType", "mountMotion", "mountBoltPattern", "wirelessTechnology", "efficiency"})
/*     */ @XmlRootElement(name="AVFurniture")
/*     */ public class AVFurniture
/*     */ {
/*     */ 
/*     */   @XmlElement(name="EnclosureFinish")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String enclosureFinish;
/*     */ 
/*     */   @XmlElement(name="FinishType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finishType;
/*     */ 
/*     */   @XmlElement(name="MaximumSupportedScreenSize")
/*     */   protected LengthDimension maximumSupportedScreenSize;
/*     */ 
/*     */   @XmlElement(name="MaxWeightCapacity")
/*     */   protected WeightDimension maxWeightCapacity;
/*     */ 
/*     */   @XmlElement(name="MaxWeightRecommendation")
/*     */   protected WeightDimension maxWeightRecommendation;
/*     */ 
/*     */   @XmlElement(name="MinimumSupportedScreenSize")
/*     */   protected LengthDimension minimumSupportedScreenSize;
/*     */ 
/*     */   @XmlElement(name="MountingPattern")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountingPattern;
/*     */ 
/*     */   @XmlElement(name="MountingType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountingType;
/*     */ 
/*     */   @XmlElement(name="MountMotion")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountMotion;
/*     */ 
/*     */   @XmlElement(name="MountBoltPattern")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountBoltPattern;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public String getEnclosureFinish()
/*     */   {
/* 105 */     return this.enclosureFinish;
/*     */   }
/*     */ 
/*     */   public void setEnclosureFinish(String value)
/*     */   {
/* 117 */     this.enclosureFinish = value;
/*     */   }
/*     */ 
/*     */   public String getFinishType()
/*     */   {
/* 129 */     return this.finishType;
/*     */   }
/*     */ 
/*     */   public void setFinishType(String value)
/*     */   {
/* 141 */     this.finishType = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMaximumSupportedScreenSize()
/*     */   {
/* 153 */     return this.maximumSupportedScreenSize;
/*     */   }
/*     */ 
/*     */   public void setMaximumSupportedScreenSize(LengthDimension value)
/*     */   {
/* 165 */     this.maximumSupportedScreenSize = value;
/*     */   }
/*     */ 
/*     */   public WeightDimension getMaxWeightCapacity()
/*     */   {
/* 177 */     return this.maxWeightCapacity;
/*     */   }
/*     */ 
/*     */   public void setMaxWeightCapacity(WeightDimension value)
/*     */   {
/* 189 */     this.maxWeightCapacity = value;
/*     */   }
/*     */ 
/*     */   public WeightDimension getMaxWeightRecommendation()
/*     */   {
/* 201 */     return this.maxWeightRecommendation;
/*     */   }
/*     */ 
/*     */   public void setMaxWeightRecommendation(WeightDimension value)
/*     */   {
/* 213 */     this.maxWeightRecommendation = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMinimumSupportedScreenSize()
/*     */   {
/* 225 */     return this.minimumSupportedScreenSize;
/*     */   }
/*     */ 
/*     */   public void setMinimumSupportedScreenSize(LengthDimension value)
/*     */   {
/* 237 */     this.minimumSupportedScreenSize = value;
/*     */   }
/*     */ 
/*     */   public String getMountingPattern()
/*     */   {
/* 249 */     return this.mountingPattern;
/*     */   }
/*     */ 
/*     */   public void setMountingPattern(String value)
/*     */   {
/* 261 */     this.mountingPattern = value;
/*     */   }
/*     */ 
/*     */   public String getMountingType()
/*     */   {
/* 273 */     return this.mountingType;
/*     */   }
/*     */ 
/*     */   public void setMountingType(String value)
/*     */   {
/* 285 */     this.mountingType = value;
/*     */   }
/*     */ 
/*     */   public String getMountMotion()
/*     */   {
/* 297 */     return this.mountMotion;
/*     */   }
/*     */ 
/*     */   public void setMountMotion(String value)
/*     */   {
/* 309 */     this.mountMotion = value;
/*     */   }
/*     */ 
/*     */   public String getMountBoltPattern()
/*     */   {
/* 321 */     return this.mountBoltPattern;
/*     */   }
/*     */ 
/*     */   public void setMountBoltPattern(String value)
/*     */   {
/* 333 */     this.mountBoltPattern = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 359 */     if (this.wirelessTechnology == null) {
/* 360 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 362 */     return this.wirelessTechnology;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 374 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 386 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AVFurniture
 * JD-Core Version:    0.6.2
 */