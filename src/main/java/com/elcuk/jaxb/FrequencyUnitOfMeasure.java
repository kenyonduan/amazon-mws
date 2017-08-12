/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="FrequencyUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum FrequencyUnitOfMeasure
/*    */ {
/* 30 */   HZ("Hz"), 
/*    */ 
/* 32 */   K_HZ("KHz"), 
/*    */ 
/* 34 */   M_HZ("MHz"), 
/*    */ 
/* 36 */   G_HZ("GHz");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private FrequencyUnitOfMeasure(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static FrequencyUnitOfMeasure fromValue(String v) {
/* 49 */     for (FrequencyUnitOfMeasure c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.FrequencyUnitOfMeasure
 * JD-Core Version:    0.6.2
 */