/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ClothingSizeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum ClothingSizeUnitOfMeasure
/*    */ {
/* 27 */   IN, 
/* 28 */   CM;
/*    */ 
/*    */   public String value() {
/* 31 */     return name();
/*    */   }
/*    */ 
/*    */   public static ClothingSizeUnitOfMeasure fromValue(String v) {
/* 35 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ClothingSizeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */