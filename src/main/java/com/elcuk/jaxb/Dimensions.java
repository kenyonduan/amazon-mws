/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="Dimensions", propOrder={"length", "width", "height", "weight"})
/*     */ public class Dimensions
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Length")
/*     */   protected LengthDimension length;
/*     */ 
/*     */   @XmlElement(name="Width")
/*     */   protected LengthDimension width;
/*     */ 
/*     */   @XmlElement(name="Height")
/*     */   protected LengthDimension height;
/*     */ 
/*     */   @XmlElement(name="Weight")
/*     */   protected WeightDimension weight;
/*     */ 
/*     */   public LengthDimension getLength()
/*     */   {
/*  59 */     return this.length;
/*     */   }
/*     */ 
/*     */   public void setLength(LengthDimension value)
/*     */   {
/*  71 */     this.length = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getWidth()
/*     */   {
/*  83 */     return this.width;
/*     */   }
/*     */ 
/*     */   public void setWidth(LengthDimension value)
/*     */   {
/*  95 */     this.width = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getHeight()
/*     */   {
/* 107 */     return this.height;
/*     */   }
/*     */ 
/*     */   public void setHeight(LengthDimension value)
/*     */   {
/* 119 */     this.height = value;
/*     */   }
/*     */ 
/*     */   public WeightDimension getWeight()
/*     */   {
/* 131 */     return this.weight;
/*     */   }
/*     */ 
/*     */   public void setWeight(WeightDimension value)
/*     */   {
/* 143 */     this.weight = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Dimensions
 * JD-Core Version:    0.6.2
 */