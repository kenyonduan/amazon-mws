/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="OverrideCurrencyAmount")
/*    */ public class OverrideCurrencyAmount extends CurrencyAmountWithDefault
/*    */ {
/*    */ 
/*    */   @XmlAttribute
/*    */   protected Boolean zero;
/*    */ 
/*    */   public Boolean isZero()
/*    */   {
/* 45 */     return this.zero;
/*    */   }
/*    */ 
/*    */   public void setZero(Boolean value)
/*    */   {
/* 57 */     this.zero = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OverrideCurrencyAmount
 * JD-Core Version:    0.6.2
 */