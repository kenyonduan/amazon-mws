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
/*     */ @XmlType(name="", propOrder={"parentSKU", "relation"})
/*     */ @XmlRootElement(name="Relationship")
/*     */ public class Relationship
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ParentSKU", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String parentSKU;
/*     */ 
/*     */   @XmlElement(name="Relation", required=true)
/*     */   protected List<Relation> relation;
/*     */ 
/*     */   public String getParentSKU()
/*     */   {
/*  87 */     return this.parentSKU;
/*     */   }
/*     */ 
/*     */   public void setParentSKU(String value)
/*     */   {
/*  99 */     this.parentSKU = value;
/*     */   }
/*     */ 
/*     */   public List<Relation> getRelation()
/*     */   {
/* 125 */     if (this.relation == null) {
/* 126 */       this.relation = new ArrayList();
/*     */     }
/* 128 */     return this.relation;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"sku", "type"})
/*     */   public static class Relation
/*     */   {
/*     */ 
/*     */     @XmlElement(name="SKU", required=true)
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String sku;
/*     */ 
/*     */     @XmlElement(name="Type", required=true)
/*     */     protected String type;
/*     */ 
/*     */     public String getSKU()
/*     */     {
/* 192 */       return this.sku;
/*     */     }
/*     */ 
/*     */     public void setSKU(String value)
/*     */     {
/* 204 */       this.sku = value;
/*     */     }
/*     */ 
/*     */     public String getType()
/*     */     {
/* 216 */       return this.type;
/*     */     }
/*     */ 
/*     */     public void setType(String value)
/*     */     {
/* 228 */       this.type = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Relationship
 * JD-Core Version:    0.6.2
 */