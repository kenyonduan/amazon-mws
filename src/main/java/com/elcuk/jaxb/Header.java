/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"documentVersion", "merchantIdentifier", "overrideReleaseId"})
/*     */ @XmlRootElement(name="Header")
/*     */ public class Header
/*     */ {
/*     */ 
/*     */   @XmlElement(name="DocumentVersion", required=true)
/*     */   protected String documentVersion;
/*     */ 
/*     */   @XmlElement(name="MerchantIdentifier", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String merchantIdentifier;
/*     */ 
/*     */   @XmlElement(name="OverrideReleaseId")
/*     */   protected String overrideReleaseId;
/*     */ 
/*     */   public String getDocumentVersion()
/*     */   {
/*  72 */     return this.documentVersion;
/*     */   }
/*     */ 
/*     */   public void setDocumentVersion(String value)
/*     */   {
/*  84 */     this.documentVersion = value;
/*     */   }
/*     */ 
/*     */   public String getMerchantIdentifier()
/*     */   {
/*  96 */     return this.merchantIdentifier;
/*     */   }
/*     */ 
/*     */   public void setMerchantIdentifier(String value)
/*     */   {
/* 108 */     this.merchantIdentifier = value;
/*     */   }
/*     */ 
/*     */   public String getOverrideReleaseId()
/*     */   {
/* 120 */     return this.overrideReleaseId;
/*     */   }
/*     */ 
/*     */   public void setOverrideReleaseId(String value)
/*     */   {
/* 132 */     this.overrideReleaseId = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Header
 * JD-Core Version:    0.6.2
 */