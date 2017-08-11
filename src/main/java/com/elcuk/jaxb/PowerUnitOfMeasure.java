/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="PowerUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum PowerUnitOfMeasure
/*    */ {
/* 30 */   WATTS("watts"), 
/*    */ 
/* 32 */   KILOWATTS("kilowatts"), 
/*    */ 
/* 34 */   HORSEPOWER("horsepower"), 
/*    */ 
/* 36 */   WATTS_PER_SEC("watts-per-sec");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private PowerUnitOfMeasure(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static PowerUnitOfMeasure fromValue(String v) {
/* 49 */     for (PowerUnitOfMeasure c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PowerUnitOfMeasure
 * JD-Core Version:    0.6.2
 */