/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RebateType", propOrder={"rebateStartDate", "rebateEndDate", "rebateMessage", "rebateName"})
/*     */ public class RebateType
/*     */ {
/*     */ 
/*     */   @XmlElement(name="RebateStartDate", required=true)
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar rebateStartDate;
/*     */ 
/*     */   @XmlElement(name="RebateEndDate", required=true)
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar rebateEndDate;
/*     */ 
/*     */   @XmlElement(name="RebateMessage", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String rebateMessage;
/*     */ 
/*     */   @XmlElement(name="RebateName", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String rebateName;
/*     */ 
/*     */   public XMLGregorianCalendar getRebateStartDate()
/*     */   {
/*  67 */     return this.rebateStartDate;
/*     */   }
/*     */ 
/*     */   public void setRebateStartDate(XMLGregorianCalendar value)
/*     */   {
/*  79 */     this.rebateStartDate = value;
/*     */   }
/*     */ 
/*     */   public XMLGregorianCalendar getRebateEndDate()
/*     */   {
/*  91 */     return this.rebateEndDate;
/*     */   }
/*     */ 
/*     */   public void setRebateEndDate(XMLGregorianCalendar value)
/*     */   {
/* 103 */     this.rebateEndDate = value;
/*     */   }
/*     */ 
/*     */   public String getRebateMessage()
/*     */   {
/* 115 */     return this.rebateMessage;
/*     */   }
/*     */ 
/*     */   public void setRebateMessage(String value)
/*     */   {
/* 127 */     this.rebateMessage = value;
/*     */   }
/*     */ 
/*     */   public String getRebateName()
/*     */   {
/* 139 */     return this.rebateName;
/*     */   }
/*     */ 
/*     */   public void setRebateName(String value)
/*     */   {
/* 151 */     this.rebateName = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.RebateType
 * JD-Core Version:    0.6.2
 */