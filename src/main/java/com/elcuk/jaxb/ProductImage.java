/*     */ package com.elcuk.jaxb;
/*     */ 
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
/*     */ @XmlType(name="", propOrder={"sku", "imageType", "imageLocation"})
/*     */ @XmlRootElement(name="ProductImage")
/*     */ public class ProductImage
/*     */ {
/*     */ 
/*     */   @XmlElement(name="SKU", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sku;
/*     */ 
/*     */   @XmlElement(name="ImageType", required=true)
/*     */   protected String imageType;
/*     */ 
/*     */   @XmlElement(name="ImageLocation")
/*     */   @XmlSchemaType(name="anyURI")
/*     */   protected String imageLocation;
/*     */ 
/*     */   public String getSKU()
/*     */   {
/*  78 */     return this.sku;
/*     */   }
/*     */ 
/*     */   public void setSKU(String value)
/*     */   {
/*  90 */     this.sku = value;
/*     */   }
/*     */ 
/*     */   public String getImageType()
/*     */   {
/* 102 */     return this.imageType;
/*     */   }
/*     */ 
/*     */   public void setImageType(String value)
/*     */   {
/* 114 */     this.imageType = value;
/*     */   }
/*     */ 
/*     */   public String getImageLocation()
/*     */   {
/* 126 */     return this.imageLocation;
/*     */   }
/*     */ 
/*     */   public void setImageLocation(String value)
/*     */   {
/* 138 */     this.imageLocation = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ProductImage
 * JD-Core Version:    0.6.2
 */