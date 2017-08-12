/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"type", "value"})
/*     */ @XmlRootElement(name="RelatedProductID")
/*     */ public class RelatedProductID
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Type", required=true)
/*     */   protected String type;
/*     */ 
/*     */   @XmlElement(name="Value", required=true)
/*     */   protected String value;
/*     */ 
/*     */   public String getType()
/*     */   {
/*  68 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String value)
/*     */   {
/*  80 */     this.type = value;
/*     */   }
/*     */ 
/*     */   public String getValue()
/*     */   {
/*  92 */     return this.value;
/*     */   }
/*     */ 
/*     */   public void setValue(String value)
/*     */   {
/* 104 */     this.value = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.RelatedProductID
 * JD-Core Version:    0.6.2
 */