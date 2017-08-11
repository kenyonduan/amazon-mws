/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="MotorSizeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum MotorSizeUnitOfMeasure
/*    */ {
/* 28 */   HORSEPOWER("horsepower"), 
/*    */ 
/* 30 */   KILOWATTS("kilowatts");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private MotorSizeUnitOfMeasure(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static MotorSizeUnitOfMeasure fromValue(String v) {
/* 43 */     for (MotorSizeUnitOfMeasure c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MotorSizeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */