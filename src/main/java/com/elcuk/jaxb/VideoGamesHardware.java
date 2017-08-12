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
/*     */ @XmlType(name="", propOrder={"hardwarePlatform", "bundles", "color", "colorMap", "additionalFeatures", "itemPackageQuantity", "maxNumberOfPlayers"})
/*     */ @XmlRootElement(name="VideoGamesHardware")
/*     */ public class VideoGamesHardware
/*     */ {
/*     */ 
/*     */   @XmlElement(name="HardwarePlatform", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> hardwarePlatform;
/*     */ 
/*     */   @XmlElement(name="Bundles")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String bundles;
/*     */ 
/*     */   @XmlElement(name="Color")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String color;
/*     */ 
/*     */   @XmlElement(name="ColorMap")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String colorMap;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="ItemPackageQuantity")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger itemPackageQuantity;
/*     */ 
/*     */   @XmlElement(name="MaxNumberOfPlayers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger maxNumberOfPlayers;
/*     */ 
/*     */   public List<String> getHardwarePlatform()
/*     */   {
/* 100 */     if (this.hardwarePlatform == null) {
/* 101 */       this.hardwarePlatform = new ArrayList();
/*     */     }
/* 103 */     return this.hardwarePlatform;
/*     */   }
/*     */ 
/*     */   public String getBundles()
/*     */   {
/* 115 */     return this.bundles;
/*     */   }
/*     */ 
/*     */   public void setBundles(String value)
/*     */   {
/* 127 */     this.bundles = value;
/*     */   }
/*     */ 
/*     */   public String getColor()
/*     */   {
/* 139 */     return this.color;
/*     */   }
/*     */ 
/*     */   public void setColor(String value)
/*     */   {
/* 151 */     this.color = value;
/*     */   }
/*     */ 
/*     */   public String getColorMap()
/*     */   {
/* 163 */     return this.colorMap;
/*     */   }
/*     */ 
/*     */   public void setColorMap(String value)
/*     */   {
/* 175 */     this.colorMap = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 187 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 199 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getItemPackageQuantity()
/*     */   {
/* 211 */     return this.itemPackageQuantity;
/*     */   }
/*     */ 
/*     */   public void setItemPackageQuantity(BigInteger value)
/*     */   {
/* 223 */     this.itemPackageQuantity = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxNumberOfPlayers()
/*     */   {
/* 235 */     return this.maxNumberOfPlayers;
/*     */   }
/*     */ 
/*     */   public void setMaxNumberOfPlayers(BigInteger value)
/*     */   {
/* 247 */     this.maxNumberOfPlayers = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.VideoGamesHardware
 * JD-Core Version:    0.6.2
 */