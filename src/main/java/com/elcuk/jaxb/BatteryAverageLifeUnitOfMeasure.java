/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BatteryAverageLifeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum BatteryAverageLifeUnitOfMeasure
/*    */ {
/* 32 */   MINUTES("minutes"), 
/*    */ 
/* 34 */   HOURS("hours"), 
/*    */ 
/* 36 */   DAYS("days"), 
/*    */ 
/* 38 */   WEEKS("weeks"), 
/*    */ 
/* 40 */   MONTHS("months"), 
/*    */ 
/* 42 */   YEARS("years");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private BatteryAverageLifeUnitOfMeasure(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static BatteryAverageLifeUnitOfMeasure fromValue(String v) {
/* 55 */     for (BatteryAverageLifeUnitOfMeasure c : values()) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     }
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BatteryAverageLifeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */