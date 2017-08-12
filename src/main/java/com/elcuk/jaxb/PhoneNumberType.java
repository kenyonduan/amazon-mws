/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.XmlValue;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="PhoneNumberType", propOrder={"value"})
/*     */ public class PhoneNumberType
/*     */ {
/*     */ 
/*     */   @XmlValue
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String value;
/*     */ 
/*     */   @XmlAttribute(name="Type")
/*     */   protected String type;
/*     */ 
/*     */   @XmlAttribute(name="Description")
/*     */   protected String description;
/*     */ 
/*     */   public String getValue()
/*     */   {
/*  67 */     return this.value;
/*     */   }
/*     */ 
/*     */   public void setValue(String value)
/*     */   {
/*  79 */     this.value = value;
/*     */   }
/*     */ 
/*     */   public String getType()
/*     */   {
/*  91 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String value)
/*     */   {
/* 103 */     this.type = value;
/*     */   }
/*     */ 
/*     */   public String getDescription()
/*     */   {
/* 115 */     return this.description;
/*     */   }
/*     */ 
/*     */   public void setDescription(String value)
/*     */   {
/* 127 */     this.description = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PhoneNumberType
 * JD-Core Version:    0.6.2
 */