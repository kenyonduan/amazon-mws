/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="Customer", propOrder={"name", "formalTitle", "givenName", "familyName", "email", "birthDate", "customerAddress"})
/*     */ public class Customer
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Name")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String name;
/*     */ 
/*     */   @XmlElement(name="FormalTitle")
/*     */   protected String formalTitle;
/*     */ 
/*     */   @XmlElement(name="GivenName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String givenName;
/*     */ 
/*     */   @XmlElement(name="FamilyName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String familyName;
/*     */ 
/*     */   @XmlElement(name="Email")
/*     */   protected EmailAddressType email;
/*     */ 
/*     */   @XmlElement(name="BirthDate")
/*     */   @XmlSchemaType(name="date")
/*     */   protected XMLGregorianCalendar birthDate;
/*     */ 
/*     */   @XmlElement(name="CustomerAddress")
/*     */   protected List<AddressType> customerAddress;
/*     */ 
/*     */   public String getName()
/*     */   {
/*  87 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/*  99 */     this.name = value;
/*     */   }
/*     */ 
/*     */   public String getFormalTitle()
/*     */   {
/* 111 */     return this.formalTitle;
/*     */   }
/*     */ 
/*     */   public void setFormalTitle(String value)
/*     */   {
/* 123 */     this.formalTitle = value;
/*     */   }
/*     */ 
/*     */   public String getGivenName()
/*     */   {
/* 135 */     return this.givenName;
/*     */   }
/*     */ 
/*     */   public void setGivenName(String value)
/*     */   {
/* 147 */     this.givenName = value;
/*     */   }
/*     */ 
/*     */   public String getFamilyName()
/*     */   {
/* 159 */     return this.familyName;
/*     */   }
/*     */ 
/*     */   public void setFamilyName(String value)
/*     */   {
/* 171 */     this.familyName = value;
/*     */   }
/*     */ 
/*     */   public EmailAddressType getEmail()
/*     */   {
/* 183 */     return this.email;
/*     */   }
/*     */ 
/*     */   public void setEmail(EmailAddressType value)
/*     */   {
/* 195 */     this.email = value;
/*     */   }
/*     */ 
/*     */   public XMLGregorianCalendar getBirthDate()
/*     */   {
/* 207 */     return this.birthDate;
/*     */   }
/*     */ 
/*     */   public void setBirthDate(XMLGregorianCalendar value)
/*     */   {
/* 219 */     this.birthDate = value;
/*     */   }
/*     */ 
/*     */   public List<AddressType> getCustomerAddress()
/*     */   {
/* 245 */     if (this.customerAddress == null) {
/* 246 */       this.customerAddress = new ArrayList();
/*     */     }
/* 248 */     return this.customerAddress;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Customer
 * JD-Core Version:    0.6.2
 */