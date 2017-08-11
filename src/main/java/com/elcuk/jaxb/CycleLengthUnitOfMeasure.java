/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="CycleLengthUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum CycleLengthUnitOfMeasure
/*    */ {
/* 27 */   CM, 
/* 28 */   IN;
/*    */ 
/*    */   public String value() {
/* 31 */     return name();
/*    */   }
/*    */ 
/*    */   public static CycleLengthUnitOfMeasure fromValue(String v) {
/* 35 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CycleLengthUnitOfMeasure
 * JD-Core Version:    0.6.2
 */