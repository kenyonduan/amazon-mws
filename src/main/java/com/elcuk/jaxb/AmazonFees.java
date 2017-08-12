/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AmazonFees", propOrder={"fee"})
/*     */ public class AmazonFees
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Fee", required=true)
/*     */   protected List<Fee> fee;
/*     */ 
/*     */   public List<Fee> getFee()
/*     */   {
/*  79 */     if (this.fee == null) {
/*  80 */       this.fee = new ArrayList();
/*     */     }
/*  82 */     return this.fee;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"type", "amount"})
/*     */   public static class Fee
/*     */   {
/*     */ 
/*     */     @XmlElement(name="Type", required=true)
/*     */     protected String type;
/*     */ 
/*     */     @XmlElement(name="Amount", required=true)
/*     */     protected CurrencyAmount amount;
/*     */ 
/*     */     public String getType()
/*     */     {
/* 132 */       return this.type;
/*     */     }
/*     */ 
/*     */     public void setType(String value)
/*     */     {
/* 144 */       this.type = value;
/*     */     }
/*     */ 
/*     */     public CurrencyAmount getAmount()
/*     */     {
/* 156 */       return this.amount;
/*     */     }
/*     */ 
/*     */     public void setAmount(CurrencyAmount value)
/*     */     {
/* 168 */       this.amount = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AmazonFees
 * JD-Core Version:    0.6.2
 */