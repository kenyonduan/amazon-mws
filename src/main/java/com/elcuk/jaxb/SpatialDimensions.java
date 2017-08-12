/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SpatialDimensions", propOrder={"length", "width", "height"})
/*     */ public class SpatialDimensions
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
/*     */   public LengthDimension getLength()
/*     */   {
/*  55 */     return this.length;
/*     */   }
/*     */ 
/*     */   public void setLength(LengthDimension value)
/*     */   {
/*  67 */     this.length = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getWidth()
/*     */   {
/*  79 */     return this.width;
/*     */   }
/*     */ 
/*     */   public void setWidth(LengthDimension value)
/*     */   {
/*  91 */     this.width = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getHeight()
/*     */   {
/* 103 */     return this.height;
/*     */   }
/*     */ 
/*     */   public void setHeight(LengthDimension value)
/*     */   {
/* 115 */     this.height = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SpatialDimensions
 * JD-Core Version:    0.6.2
 */