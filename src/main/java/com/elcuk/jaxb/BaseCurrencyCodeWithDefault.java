/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BaseCurrencyCodeWithDefault")
/*    */ @XmlEnum
/*    */ public enum BaseCurrencyCodeWithDefault
/*    */ {
/* 31 */   USD, 
/* 32 */   GBP, 
/* 33 */   EUR, 
/* 34 */   JPY, 
/* 35 */   CAD, 
/* 36 */   DEFAULT;
/*    */ 
/*    */   public String value() {
/* 39 */     return name();
/*    */   }
/*    */ 
/*    */   public static BaseCurrencyCodeWithDefault fromValue(String v) {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BaseCurrencyCodeWithDefault
 * JD-Core Version:    0.6.2
 */