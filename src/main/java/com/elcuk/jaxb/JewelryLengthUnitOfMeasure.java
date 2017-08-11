/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="JewelryLengthUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum JewelryLengthUnitOfMeasure
/*    */ {
/* 28 */   MM, 
/* 29 */   CM, 
/* 30 */   IN;
/*    */ 
/*    */   public String value() {
/* 33 */     return name();
/*    */   }
/*    */ 
/*    */   public static JewelryLengthUnitOfMeasure fromValue(String v) {
/* 37 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.JewelryLengthUnitOfMeasure
 * JD-Core Version:    0.6.2
 */