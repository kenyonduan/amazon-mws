/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="NeckSizeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum NeckSizeUnitOfMeasure
/*    */ {
/* 30 */   CM, 
/* 31 */   IN, 
/* 32 */   MM, 
/* 33 */   M, 
/* 34 */   FT;
/*    */ 
/*    */   public String value() {
/* 37 */     return name();
/*    */   }
/*    */ 
/*    */   public static NeckSizeUnitOfMeasure fromValue(String v) {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.NeckSizeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */