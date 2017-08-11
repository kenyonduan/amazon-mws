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
/*     */ @XmlType(name="", propOrder={"variationData", "inkColor", "inkOrTonerCompatibleDevices"})
/*     */ @XmlRootElement(name="InkOrToner")
/*     */ public class InkOrToner
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="InkColor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> inkColor;
/*     */ 
/*     */   @XmlElement(name="InkOrTonerCompatibleDevices")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String inkOrTonerCompatibleDevices;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/*  63 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/*  75 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public List<String> getInkColor()
/*     */   {
/* 101 */     if (this.inkColor == null) {
/* 102 */       this.inkColor = new ArrayList();
/*     */     }
/* 104 */     return this.inkColor;
/*     */   }
/*     */ 
/*     */   public String getInkOrTonerCompatibleDevices()
/*     */   {
/* 116 */     return this.inkOrTonerCompatibleDevices;
/*     */   }
/*     */ 
/*     */   public void setInkOrTonerCompatibleDevices(String value)
/*     */   {
/* 128 */     this.inkOrTonerCompatibleDevices = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.InkOrToner
 * JD-Core Version:    0.6.2
 */