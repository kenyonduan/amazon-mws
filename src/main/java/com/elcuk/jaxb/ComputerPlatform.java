/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"type", "systemRequirements"})
/*     */ @XmlRootElement(name="ComputerPlatform")
/*     */ public class ComputerPlatform
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Type", required=true)
/*     */   protected String type;
/*     */ 
/*     */   @XmlElement(name="SystemRequirements")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String systemRequirements;
/*     */ 
/*     */   public String getType()
/*     */   {
/*  64 */     return this.type;
/*     */   }
/*     */ 
/*     */   public void setType(String value)
/*     */   {
/*  76 */     this.type = value;
/*     */   }
/*     */ 
/*     */   public String getSystemRequirements()
/*     */   {
/*  88 */     return this.systemRequirements;
/*     */   }
/*     */ 
/*     */   public void setSystemRequirements(String value)
/*     */   {
/* 100 */     this.systemRequirements = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerPlatform
 * JD-Core Version:    0.6.2
 */