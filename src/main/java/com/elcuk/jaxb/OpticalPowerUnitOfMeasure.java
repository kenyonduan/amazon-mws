/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="OpticalPowerUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum OpticalPowerUnitOfMeasure
/*    */ {
/* 27 */   DIOPTERS("diopters");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private OpticalPowerUnitOfMeasure(String v) {
/* 32 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 36 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static OpticalPowerUnitOfMeasure fromValue(String v) {
/* 40 */     for (OpticalPowerUnitOfMeasure c : values()) {
/* 41 */       if (c.value.equals(v)) {
/* 42 */         return c;
/*    */       }
/*    */     }
/* 45 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OpticalPowerUnitOfMeasure
 * JD-Core Version:    0.6.2
 */