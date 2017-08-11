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
/*     */ @XmlType(name="DirectPaymentType", propOrder={"component"})
/*     */ public class DirectPaymentType
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Component", required=true)
/*     */   protected List<Component> component;
/*     */ 
/*     */   public List<Component> getComponent()
/*     */   {
/*  74 */     if (this.component == null) {
/*  75 */       this.component = new ArrayList();
/*     */     }
/*  77 */     return this.component;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"type", "amount"})
/*     */   public static class Component
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
/* 122 */       return this.type;
/*     */     }
/*     */ 
/*     */     public void setType(String value)
/*     */     {
/* 134 */       this.type = value;
/*     */     }
/*     */ 
/*     */     public CurrencyAmount getAmount()
/*     */     {
/* 146 */       return this.amount;
/*     */     }
/*     */ 
/*     */     public void setAmount(CurrencyAmount value)
/*     */     {
/* 158 */       this.amount = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DirectPaymentType
 * JD-Core Version:    0.6.2
 */