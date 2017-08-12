/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="MaximumPowerUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum MaximumPowerUnitOfMeasure
/*    */ {
/* 27 */   W, 
/* 28 */   KW;
/*    */ 
/*    */   public String value() {
/* 31 */     return name();
/*    */   }
/*    */ 
/*    */   public static MaximumPowerUnitOfMeasure fromValue(String v) {
/* 35 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MaximumPowerUnitOfMeasure
 * JD-Core Version:    0.6.2
 */