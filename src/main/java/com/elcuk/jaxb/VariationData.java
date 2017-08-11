/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"parentage", "variationTheme"})
/*     */ @XmlRootElement(name="VariationData")
/*     */ public class VariationData
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Parentage", required=true)
/*     */   protected String parentage;
/*     */ 
/*     */   @XmlElement(name="VariationTheme")
/*     */   protected String variationTheme;
/*     */ 
/*     */   public String getParentage()
/*     */   {
/*  65 */     return this.parentage;
/*     */   }
/*     */ 
/*     */   public void setParentage(String value)
/*     */   {
/*  77 */     this.parentage = value;
/*     */   }
/*     */ 
/*     */   public String getVariationTheme()
/*     */   {
/*  89 */     return this.variationTheme;
/*     */   }
/*     */ 
/*     */   public void setVariationTheme(String value)
/*     */   {
/* 101 */     this.variationTheme = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.VariationData
 * JD-Core Version:    0.6.2
 */