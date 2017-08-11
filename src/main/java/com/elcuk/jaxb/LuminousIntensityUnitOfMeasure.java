/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="LuminousIntensityUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum LuminousIntensityUnitOfMeasure
/*    */ {
/* 27 */   CANDELA("candela");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private LuminousIntensityUnitOfMeasure(String v) {
/* 32 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 36 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static LuminousIntensityUnitOfMeasure fromValue(String v) {
/* 40 */     for (LuminousIntensityUnitOfMeasure c : values()) {
/* 41 */       if (c.value.equals(v)) {
/* 42 */         return c;
/*    */       }
/*    */     }
/* 45 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.LuminousIntensityUnitOfMeasure
 * JD-Core Version:    0.6.2
 */