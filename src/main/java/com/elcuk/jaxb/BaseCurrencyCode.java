/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BaseCurrencyCode")
/*    */ @XmlEnum
/*    */ public enum BaseCurrencyCode
/*    */ {
/* 33 */   USD, 
/* 34 */   GBP, 
/* 35 */   EUR, 
/* 36 */   JPY, 
/* 37 */   CAD, 
/* 38 */   CNY, 
/* 39 */   INR, 
/* 40 */   MXN;
/*    */ 
/*    */   public String value() {
/* 43 */     return name();
/*    */   }
/*    */ 
/*    */   public static BaseCurrencyCode fromValue(String v) {
/* 47 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BaseCurrencyCode
 * JD-Core Version:    0.6.2
 */