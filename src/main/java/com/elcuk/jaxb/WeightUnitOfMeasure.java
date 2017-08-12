/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="WeightUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum WeightUnitOfMeasure
/*    */ {
/* 30 */   GR, 
/* 31 */   KG, 
/* 32 */   OZ, 
/* 33 */   LB, 
/* 34 */   MG;
/*    */ 
/*    */   public String value() {
/* 37 */     return name();
/*    */   }
/*    */ 
/*    */   public static WeightUnitOfMeasure fromValue(String v) {
/* 41 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WeightUnitOfMeasure
 * JD-Core Version:    0.6.2
 */