/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="LengthUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum LengthUnitOfMeasure
/*    */ {
/* 40 */   MM("MM"), 
/* 41 */   CM("CM"), 
/* 42 */   M("M"), 
/* 43 */   IN("IN"), 
/* 44 */   FT("FT"), 
/* 45 */   INCHES("inches"), 
/*    */ 
/* 47 */   FEET("feet"), 
/*    */ 
/* 49 */   METERS("meters"), 
/*    */ 
/* 51 */   DECIMETERS("decimeters"), 
/*    */ 
/* 53 */   CENTIMETERS("centimeters"), 
/*    */ 
/* 55 */   MILLIMETERS("millimeters"), 
/*    */ 
/* 57 */   MICROMETERS("micrometers"), 
/*    */ 
/* 59 */   NANOMETERS("nanometers"), 
/*    */ 
/* 61 */   PICOMETERS("picometers");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private LengthUnitOfMeasure(String v) {
/* 66 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 70 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static LengthUnitOfMeasure fromValue(String v) {
/* 74 */     for (LengthUnitOfMeasure c : values()) {
/* 75 */       if (c.value.equals(v)) {
/* 76 */         return c;
/*    */       }
/*    */     }
/* 79 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.LengthUnitOfMeasure
 * JD-Core Version:    0.6.2
 */