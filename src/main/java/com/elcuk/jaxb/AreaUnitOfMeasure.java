/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="AreaUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum AreaUnitOfMeasure
/*    */ {
/* 30 */   SQUARE_IN("square-in"), 
/*    */ 
/* 32 */   SQUARE_FT("square-ft"), 
/*    */ 
/* 34 */   SQUARE_CM("square-cm"), 
/*    */ 
/* 36 */   SQUARE_M("square-m");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private AreaUnitOfMeasure(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static AreaUnitOfMeasure fromValue(String v) {
/* 49 */     for (AreaUnitOfMeasure c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AreaUnitOfMeasure
 * JD-Core Version:    0.6.2
 */