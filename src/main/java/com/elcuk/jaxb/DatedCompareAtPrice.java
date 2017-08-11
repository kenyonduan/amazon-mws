/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DatedCompareAtPrice", propOrder={"startDate", "endDate", "compareAtPrice"})
/*     */ public class DatedCompareAtPrice
/*     */ {
/*     */ 
/*     */   @XmlElement(name="StartDate")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar startDate;
/*     */ 
/*     */   @XmlElement(name="EndDate")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar endDate;
/*     */ 
/*     */   @XmlElement(name="CompareAtPrice", required=true)
/*     */   protected CurrencyAmount compareAtPrice;
/*     */ 
/*     */   @XmlAttribute(name="delete")
/*     */   protected Boolean delete;
/*     */ 
/*     */   public XMLGregorianCalendar getStartDate()
/*     */   {
/*  63 */     return this.startDate;
/*     */   }
/*     */ 
/*     */   public void setStartDate(XMLGregorianCalendar value)
/*     */   {
/*  75 */     this.startDate = value;
/*     */   }
/*     */ 
/*     */   public XMLGregorianCalendar getEndDate()
/*     */   {
/*  87 */     return this.endDate;
/*     */   }
/*     */ 
/*     */   public void setEndDate(XMLGregorianCalendar value)
/*     */   {
/*  99 */     this.endDate = value;
/*     */   }
/*     */ 
/*     */   public CurrencyAmount getCompareAtPrice()
/*     */   {
/* 111 */     return this.compareAtPrice;
/*     */   }
/*     */ 
/*     */   public void setCompareAtPrice(CurrencyAmount value)
/*     */   {
/* 123 */     this.compareAtPrice = value;
/*     */   }
/*     */ 
/*     */   public Boolean isDelete()
/*     */   {
/* 135 */     return this.delete;
/*     */   }
/*     */ 
/*     */   public void setDelete(Boolean value)
/*     */   {
/* 147 */     this.delete = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DatedCompareAtPrice
 * JD-Core Version:    0.6.2
 */