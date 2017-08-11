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
/*     */ @XmlType(name="", propOrder={"compatiblePhoneModels", "manufacturerName", "additionalFeatures", "keywords", "applicationVersion"})
/*     */ @XmlRootElement(name="WirelessDownloads")
/*     */ public class WirelessDownloads
/*     */ {
/*     */ 
/*     */   @XmlElement(name="CompatiblePhoneModels")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> compatiblePhoneModels;
/*     */ 
/*     */   @XmlElement(name="ManufacturerName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String manufacturerName;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="Keywords")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> keywords;
/*     */ 
/*     */   @XmlElement(name="ApplicationVersion")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String applicationVersion;
/*     */ 
/*     */   public List<String> getCompatiblePhoneModels()
/*     */   {
/*  88 */     if (this.compatiblePhoneModels == null) {
/*  89 */       this.compatiblePhoneModels = new ArrayList();
/*     */     }
/*  91 */     return this.compatiblePhoneModels;
/*     */   }
/*     */ 
/*     */   public String getManufacturerName()
/*     */   {
/* 103 */     return this.manufacturerName;
/*     */   }
/*     */ 
/*     */   public void setManufacturerName(String value)
/*     */   {
/* 115 */     this.manufacturerName = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 127 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 139 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public List<String> getKeywords()
/*     */   {
/* 165 */     if (this.keywords == null) {
/* 166 */       this.keywords = new ArrayList();
/*     */     }
/* 168 */     return this.keywords;
/*     */   }
/*     */ 
/*     */   public String getApplicationVersion()
/*     */   {
/* 180 */     return this.applicationVersion;
/*     */   }
/*     */ 
/*     */   public void setApplicationVersion(String value)
/*     */   {
/* 192 */     this.applicationVersion = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WirelessDownloads
 * JD-Core Version:    0.6.2
 */