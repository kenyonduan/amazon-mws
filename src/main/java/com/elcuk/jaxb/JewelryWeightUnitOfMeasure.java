/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="JewelryWeightUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum JewelryWeightUnitOfMeasure
/*    */ {
/* 31 */   GR, 
/* 32 */   KG, 
/* 33 */   OZ, 
/* 34 */   LB, 
/* 35 */   CARATS, 
/* 36 */   DWT;
/*    */ 
/*    */   public String value() {
/* 39 */     return name();
/*    */   }
/*    */ 
/*    */   public static JewelryWeightUnitOfMeasure fromValue(String v) {
/* 43 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.JewelryWeightUnitOfMeasure
 * JD-Core Version:    0.6.2
 */