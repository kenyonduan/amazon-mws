/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="DensityUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum DensityUnitOfMeasure
/*    */ {
/* 27 */   GRAMS_PER_SQUARE_METER("grams_per_square_meter");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private DensityUnitOfMeasure(String v) {
/* 32 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 36 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static DensityUnitOfMeasure fromValue(String v) {
/* 40 */     for (DensityUnitOfMeasure c : values()) {
/* 41 */       if (c.value.equals(v)) {
/* 42 */         return c;
/*    */       }
/*    */     }
/* 45 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DensityUnitOfMeasure
 * JD-Core Version:    0.6.2
 */