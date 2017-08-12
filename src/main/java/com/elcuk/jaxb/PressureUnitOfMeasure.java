/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="PressureUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum PressureUnitOfMeasure
/*    */ {
/* 29 */   BARS("bars"), 
/*    */ 
/* 31 */   PSI("psi"), 
/*    */ 
/* 33 */   PASCAL("pascal");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private PressureUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static PressureUnitOfMeasure fromValue(String v) {
/* 46 */     for (PressureUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PressureUnitOfMeasure
 * JD-Core Version:    0.6.2
 */