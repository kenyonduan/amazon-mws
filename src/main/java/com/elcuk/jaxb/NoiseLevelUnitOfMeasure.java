/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="NoiseLevelUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum NoiseLevelUnitOfMeasure
/*    */ {
/* 28 */   D_BA("dBA"), 
/*    */ 
/* 30 */   DECIBELS("decibels");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private NoiseLevelUnitOfMeasure(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static NoiseLevelUnitOfMeasure fromValue(String v) {
/* 43 */     for (NoiseLevelUnitOfMeasure c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.NoiseLevelUnitOfMeasure
 * JD-Core Version:    0.6.2
 */