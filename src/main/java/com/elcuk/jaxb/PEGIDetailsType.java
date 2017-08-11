/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="PEGIDetailsType", propOrder={"badLanguage", "fear", "violence", "discrimination", "drugs", "sexualContent"})
/*     */ public class PEGIDetailsType
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BadLanguage")
/*     */   protected Boolean badLanguage;
/*     */ 
/*     */   @XmlElement(name="Fear")
/*     */   protected Boolean fear;
/*     */ 
/*     */   @XmlElement(name="Violence")
/*     */   protected Boolean violence;
/*     */ 
/*     */   @XmlElement(name="Discrimination")
/*     */   protected Boolean discrimination;
/*     */ 
/*     */   @XmlElement(name="Drugs")
/*     */   protected Boolean drugs;
/*     */ 
/*     */   @XmlElement(name="SexualContent")
/*     */   protected Boolean sexualContent;
/*     */ 
/*     */   public Boolean isBadLanguage()
/*     */   {
/*  67 */     return this.badLanguage;
/*     */   }
/*     */ 
/*     */   public void setBadLanguage(Boolean value)
/*     */   {
/*  79 */     this.badLanguage = value;
/*     */   }
/*     */ 
/*     */   public Boolean isFear()
/*     */   {
/*  91 */     return this.fear;
/*     */   }
/*     */ 
/*     */   public void setFear(Boolean value)
/*     */   {
/* 103 */     this.fear = value;
/*     */   }
/*     */ 
/*     */   public Boolean isViolence()
/*     */   {
/* 115 */     return this.violence;
/*     */   }
/*     */ 
/*     */   public void setViolence(Boolean value)
/*     */   {
/* 127 */     this.violence = value;
/*     */   }
/*     */ 
/*     */   public Boolean isDiscrimination()
/*     */   {
/* 139 */     return this.discrimination;
/*     */   }
/*     */ 
/*     */   public void setDiscrimination(Boolean value)
/*     */   {
/* 151 */     this.discrimination = value;
/*     */   }
/*     */ 
/*     */   public Boolean isDrugs()
/*     */   {
/* 163 */     return this.drugs;
/*     */   }
/*     */ 
/*     */   public void setDrugs(Boolean value)
/*     */   {
/* 175 */     this.drugs = value;
/*     */   }
/*     */ 
/*     */   public Boolean isSexualContent()
/*     */   {
/* 187 */     return this.sexualContent;
/*     */   }
/*     */ 
/*     */   public void setSexualContent(Boolean value)
/*     */   {
/* 199 */     this.sexualContent = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PEGIDetailsType
 * JD-Core Version:    0.6.2
 */