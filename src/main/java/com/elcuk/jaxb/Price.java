/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"sku", "standardPrice", "map", "depositAmount", "sale", "previous"})
/*     */ @XmlRootElement(name="Price")
/*     */ public class Price
/*     */ {
/*     */ 
/*     */   @XmlElement(name="SKU", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sku;
/*     */ 
/*     */   @XmlElement(name="StandardPrice", required=true)
/*     */   protected OverrideCurrencyAmount standardPrice;
/*     */ 
/*     */   @XmlElement(name="MAP")
/*     */   protected OverrideCurrencyAmount map;
/*     */ 
/*     */   @XmlElement(name="DepositAmount")
/*     */   protected CurrencyAmountWithDefault depositAmount;
/*     */ 
/*     */   @XmlElement(name="Sale")
/*     */   protected Sale sale;
/*     */ 
/*     */   @XmlElement(name="Previous")
/*     */   protected DatedPrice previous;
/*     */ 
/*     */   public String getSKU()
/*     */   {
/*  86 */     return this.sku;
/*     */   }
/*     */ 
/*     */   public void setSKU(String value)
/*     */   {
/*  98 */     this.sku = value;
/*     */   }
/*     */ 
/*     */   public OverrideCurrencyAmount getStandardPrice()
/*     */   {
/* 110 */     return this.standardPrice;
/*     */   }
/*     */ 
/*     */   public void setStandardPrice(OverrideCurrencyAmount value)
/*     */   {
/* 122 */     this.standardPrice = value;
/*     */   }
/*     */ 
/*     */   public OverrideCurrencyAmount getMAP()
/*     */   {
/* 134 */     return this.map;
/*     */   }
/*     */ 
/*     */   public void setMAP(OverrideCurrencyAmount value)
/*     */   {
/* 146 */     this.map = value;
/*     */   }
/*     */ 
/*     */   public CurrencyAmountWithDefault getDepositAmount()
/*     */   {
/* 158 */     return this.depositAmount;
/*     */   }
/*     */ 
/*     */   public void setDepositAmount(CurrencyAmountWithDefault value)
/*     */   {
/* 170 */     this.depositAmount = value;
/*     */   }
/*     */ 
/*     */   public Sale getSale()
/*     */   {
/* 182 */     return this.sale;
/*     */   }
/*     */ 
/*     */   public void setSale(Sale value)
/*     */   {
/* 194 */     this.sale = value;
/*     */   }
/*     */ 
/*     */   public DatedPrice getPrevious()
/*     */   {
/* 206 */     return this.previous;
/*     */   }
/*     */ 
/*     */   public void setPrevious(DatedPrice value)
/*     */   {
/* 218 */     this.previous = value;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"startDate", "endDate", "salePrice"})
/*     */   public static class Sale
/*     */   {
/*     */ 
/*     */     @XmlElement(name="StartDate", required=true)
/*     */     @XmlSchemaType(name="dateTime")
/*     */     protected XMLGregorianCalendar startDate;
/*     */ 
/*     */     @XmlElement(name="EndDate", required=true)
/*     */     @XmlSchemaType(name="dateTime")
/*     */     protected XMLGregorianCalendar endDate;
/*     */ 
/*     */     @XmlElement(name="SalePrice", required=true)
/*     */     protected OverrideCurrencyAmount salePrice;
/*     */ 
/*     */     public XMLGregorianCalendar getStartDate()
/*     */     {
/* 269 */       return this.startDate;
/*     */     }
/*     */ 
/*     */     public void setStartDate(XMLGregorianCalendar value)
/*     */     {
/* 281 */       this.startDate = value;
/*     */     }
/*     */ 
/*     */     public XMLGregorianCalendar getEndDate()
/*     */     {
/* 293 */       return this.endDate;
/*     */     }
/*     */ 
/*     */     public void setEndDate(XMLGregorianCalendar value)
/*     */     {
/* 305 */       this.endDate = value;
/*     */     }
/*     */ 
/*     */     public OverrideCurrencyAmount getSalePrice()
/*     */     {
/* 317 */       return this.salePrice;
/*     */     }
/*     */ 
/*     */     public void setSalePrice(OverrideCurrencyAmount value)
/*     */     {
/* 329 */       this.salePrice = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Price
 * JD-Core Version:    0.6.2
 */