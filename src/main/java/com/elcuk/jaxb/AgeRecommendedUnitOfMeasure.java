/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="AgeRecommendedUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum AgeRecommendedUnitOfMeasure
/*    */ {
/* 28 */   MONTHS("months"), 
/*    */ 
/* 30 */   YEARS("years");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private AgeRecommendedUnitOfMeasure(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static AgeRecommendedUnitOfMeasure fromValue(String v) {
/* 43 */     for (AgeRecommendedUnitOfMeasure c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AgeRecommendedUnitOfMeasure
 * JD-Core Version:    0.6.2
 */