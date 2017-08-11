/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="SpeedClassRatingTypeValues")
/*    */ @XmlEnum
/*    */ public enum SpeedClassRatingTypeValues
/*    */ {
/* 30 */   CLASS_10("class_10"), 
/*    */ 
/* 32 */   CLASS_2("class_2"), 
/*    */ 
/* 34 */   CLASS_4("class_4"), 
/*    */ 
/* 36 */   CLASS_6("class_6");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private SpeedClassRatingTypeValues(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static SpeedClassRatingTypeValues fromValue(String v) {
/* 49 */     for (SpeedClassRatingTypeValues c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SpeedClassRatingTypeValues
 * JD-Core Version:    0.6.2
 */