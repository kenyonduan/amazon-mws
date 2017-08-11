/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="TemperatureRatingUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum TemperatureRatingUnitOfMeasure
/*    */ {
/* 29 */   DEGREES_CELSIUS("degrees-celsius"), 
/*    */ 
/* 31 */   DEGREES_FAHRENHEIT("degrees-fahrenheit"), 
/*    */ 
/* 33 */   KELVIN("kelvin");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private TemperatureRatingUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static TemperatureRatingUnitOfMeasure fromValue(String v) {
/* 46 */     for (TemperatureRatingUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TemperatureRatingUnitOfMeasure
 * JD-Core Version:    0.6.2
 */