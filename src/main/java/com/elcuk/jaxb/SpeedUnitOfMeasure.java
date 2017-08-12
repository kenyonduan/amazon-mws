/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="SpeedUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum SpeedUnitOfMeasure
/*    */ {
/* 34 */   FEET_PER_MINUTE("feet_per_minute"), 
/*    */ 
/* 36 */   MILES_PER_HOUR("miles_per_hour"), 
/*    */ 
/* 38 */   KILOMETERS_PER_HOUR("kilometers_per_hour"), 
/*    */ 
/* 40 */   RPM("RPM"), 
/* 41 */   RPS("RPS"), 
/* 42 */   METERS_PER_SECOND("meters per second"), 
/*    */ 
/* 44 */   CENTIMETERS_PER_SECOND("centimeters per second"), 
/*    */ 
/* 46 */   MILLIMETERS_PER_SECOND("millimeters per second");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private SpeedUnitOfMeasure(String v) {
/* 51 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 55 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static SpeedUnitOfMeasure fromValue(String v) {
/* 59 */     for (SpeedUnitOfMeasure c : values()) {
/* 60 */       if (c.value.equals(v)) {
/* 61 */         return c;
/*    */       }
/*    */     }
/* 64 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SpeedUnitOfMeasure
 * JD-Core Version:    0.6.2
 */