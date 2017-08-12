/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"product", "relationship", "productImage", "price", "inventory", "override"})
/*     */ @XmlRootElement(name="Listings")
/*     */ public class Listings
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Product")
/*     */   protected Product product;
/*     */ 
/*     */   @XmlElement(name="Relationship")
/*     */   protected Relationship relationship;
/*     */ 
/*     */   @XmlElement(name="ProductImage")
/*     */   protected List<ProductImage> productImage;
/*     */ 
/*     */   @XmlElement(name="Price")
/*     */   protected Price price;
/*     */ 
/*     */   @XmlElement(name="Inventory")
/*     */   protected Inventory inventory;
/*     */ 
/*     */   @XmlElement(name="Override")
/*     */   protected Override override;
/*     */ 
/*     */   public Product getProduct()
/*     */   {
/*  71 */     return this.product;
/*     */   }
/*     */ 
/*     */   public void setProduct(Product value)
/*     */   {
/*  83 */     this.product = value;
/*     */   }
/*     */ 
/*     */   public Relationship getRelationship()
/*     */   {
/*  95 */     return this.relationship;
/*     */   }
/*     */ 
/*     */   public void setRelationship(Relationship value)
/*     */   {
/* 107 */     this.relationship = value;
/*     */   }
/*     */ 
/*     */   public List<ProductImage> getProductImage()
/*     */   {
/* 133 */     if (this.productImage == null) {
/* 134 */       this.productImage = new ArrayList();
/*     */     }
/* 136 */     return this.productImage;
/*     */   }
/*     */ 
/*     */   public Price getPrice()
/*     */   {
/* 148 */     return this.price;
/*     */   }
/*     */ 
/*     */   public void setPrice(Price value)
/*     */   {
/* 160 */     this.price = value;
/*     */   }
/*     */ 
/*     */   public Inventory getInventory()
/*     */   {
/* 172 */     return this.inventory;
/*     */   }
/*     */ 
/*     */   public void setInventory(Inventory value)
/*     */   {
/* 184 */     this.inventory = value;
/*     */   }
/*     */ 
/*     */   public Override getOverride()
/*     */   {
/* 196 */     return this.override;
/*     */   }
/*     */ 
/*     */   public void setOverride(Override value)
/*     */   {
/* 208 */     this.override = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Listings
 * JD-Core Version:    0.6.2
 */