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
/*     */ @XmlRootElement(name="StandardProductID")
/*     */ public class StandardProductID
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
/*  72 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String value)
/*     */   {
/*  84 */     this.type = value;
/*     */   }
/*     */ 
/*     */   public String getValue()
/*     */   {
/*  96 */     return this.value;
/*     */   }
/*     */ 
/*     */   public void setValue(String value)
/*     */   {
/* 108 */     this.value = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.StandardProductID
 * JD-Core Version:    0.6.2
 */