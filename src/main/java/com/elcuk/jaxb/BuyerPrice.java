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
/*     */ @XmlType(name="BuyerPrice", propOrder={"component"})
/*     */ public class BuyerPrice
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Component", required=true)
/*     */   protected List<Component> component;
/*     */ 
/*     */   public List<Component> getComponent()
/*     */   {
/*  96 */     if (this.component == null) {
/*  97 */       this.component = new ArrayList();
/*     */     }
/*  99 */     return this.component;
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
/* 166 */       return this.type;
/*     */     }
/*     */ 
/*     */     public void setType(String value)
/*     */     {
/* 178 */       this.type = value;
/*     */     }
/*     */ 
/*     */     public CurrencyAmount getAmount()
/*     */     {
/* 190 */       return this.amount;
/*     */     }
/*     */ 
/*     */     public void setAmount(CurrencyAmount value)
/*     */     {
/* 202 */       this.amount = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BuyerPrice
 * JD-Core Version:    0.6.2
 */