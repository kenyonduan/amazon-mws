/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ThicknessUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum ThicknessUnitOfMeasure
/*    */ {
/* 30 */   IN("IN"), 
/* 31 */   CM("CM"), 
/* 32 */   MM("MM"), 
/* 33 */   GAUGE("gauge");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private ThicknessUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ThicknessUnitOfMeasure fromValue(String v) {
/* 46 */     for (ThicknessUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ThicknessUnitOfMeasure
 * JD-Core Version:    0.6.2
 */