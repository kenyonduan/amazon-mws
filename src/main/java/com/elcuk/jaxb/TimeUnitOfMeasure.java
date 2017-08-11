/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="TimeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum TimeUnitOfMeasure
/*    */ {
/* 37 */   SEC("sec"), 
/*    */ 
/* 39 */   MIN("min"), 
/*    */ 
/* 41 */   HR("hr"), 
/*    */ 
/* 43 */   DAYS("days"), 
/*    */ 
/* 45 */   HOURS("hours"), 
/*    */ 
/* 47 */   MINUTES("minutes"), 
/*    */ 
/* 49 */   SECONDS("seconds"), 
/*    */ 
/* 51 */   MILLISECONDS("milliseconds"), 
/*    */ 
/* 53 */   MICROSECONDS("microseconds"), 
/*    */ 
/* 55 */   NANOSECONDS("nanoseconds"), 
/*    */ 
/* 57 */   PICOSECONDS("picoseconds");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private TimeUnitOfMeasure(String v) {
/* 62 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 66 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static TimeUnitOfMeasure fromValue(String v) {
/* 70 */     for (TimeUnitOfMeasure c : values()) {
/* 71 */       if (c.value.equals(v)) {
/* 72 */         return c;
/*    */       }
/*    */     }
/* 75 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TimeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */