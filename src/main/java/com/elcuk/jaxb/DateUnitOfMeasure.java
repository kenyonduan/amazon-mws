/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="DateUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum DateUnitOfMeasure
/*    */ {
/* 30 */   DAYS("days"), 
/*    */ 
/* 32 */   WEEKS("weeks"), 
/*    */ 
/* 34 */   MONTHS("months"), 
/*    */ 
/* 36 */   YEARS("years");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private DateUnitOfMeasure(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static DateUnitOfMeasure fromValue(String v) {
/* 49 */     for (DateUnitOfMeasure c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DateUnitOfMeasure
 * JD-Core Version:    0.6.2
 */