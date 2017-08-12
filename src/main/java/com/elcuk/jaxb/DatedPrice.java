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
/*     */ @XmlType(name="DatedPrice", propOrder={"startDate", "endDate", "price", "previousPrice"})
/*     */ public class DatedPrice
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
/*     */   @XmlElement(name="Price")
/*     */   protected CurrencyAmount price;
/*     */ 
/*     */   @XmlElement(name="PreviousPrice")
/*     */   protected CurrencyAmount previousPrice;
/*     */ 
/*     */   @XmlAttribute(name="delete")
/*     */   protected Boolean delete;
/*     */ 
/*     */   public XMLGregorianCalendar getStartDate()
/*     */   {
/*  69 */     return this.startDate;
/*     */   }
/*     */ 
/*     */   public void setStartDate(XMLGregorianCalendar value)
/*     */   {
/*  81 */     this.startDate = value;
/*     */   }
/*     */ 
/*     */   public XMLGregorianCalendar getEndDate()
/*     */   {
/*  93 */     return this.endDate;
/*     */   }
/*     */ 
/*     */   public void setEndDate(XMLGregorianCalendar value)
/*     */   {
/* 105 */     this.endDate = value;
/*     */   }
/*     */ 
/*     */   public CurrencyAmount getPrice()
/*     */   {
/* 117 */     return this.price;
/*     */   }
/*     */ 
/*     */   public void setPrice(CurrencyAmount value)
/*     */   {
/* 129 */     this.price = value;
/*     */   }
/*     */ 
/*     */   public CurrencyAmount getPreviousPrice()
/*     */   {
/* 141 */     return this.previousPrice;
/*     */   }
/*     */ 
/*     */   public void setPreviousPrice(CurrencyAmount value)
/*     */   {
/* 153 */     this.previousPrice = value;
/*     */   }
/*     */ 
/*     */   public Boolean isDelete()
/*     */   {
/* 165 */     return this.delete;
/*     */   }
/*     */ 
/*     */   public void setDelete(Boolean value)
/*     */   {
/* 177 */     this.delete = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DatedPrice
 * JD-Core Version:    0.6.2
 */