/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlSeeAlso;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.XmlValue;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="CurrencyAmountWithDefault", propOrder={"value"})
/*    */ @XmlSeeAlso({OverrideCurrencyAmount.class})
/*    */ public class CurrencyAmountWithDefault
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   protected BigDecimal value;
/*    */ 
/*    */   @XmlAttribute(required=true)
/*    */   protected BaseCurrencyCodeWithDefault currency;
/*    */ 
/*    */   public BigDecimal getValue()
/*    */   {
/* 53 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(BigDecimal value)
/*    */   {
/* 65 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public BaseCurrencyCodeWithDefault getCurrency()
/*    */   {
/* 77 */     return this.currency;
/*    */   }
/*    */ 
/*    */   public void setCurrency(BaseCurrencyCodeWithDefault value)
/*    */   {
/* 89 */     this.currency = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CurrencyAmountWithDefault
 * JD-Core Version:    0.6.2
 */