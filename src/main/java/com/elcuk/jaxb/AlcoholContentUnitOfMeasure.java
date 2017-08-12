/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="AlcoholContentUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum AlcoholContentUnitOfMeasure
/*    */ {
/* 29 */   PERCENT_BY_VOLUME("percent_by_volume"), 
/*    */ 
/* 31 */   PERCENT_BY_WEIGHT("percent_by_weight"), 
/*    */ 
/* 33 */   UNIT_OF_ALCOHOL("unit_of_alcohol");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private AlcoholContentUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static AlcoholContentUnitOfMeasure fromValue(String v) {
/* 46 */     for (AlcoholContentUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AlcoholContentUnitOfMeasure
 * JD-Core Version:    0.6.2
 */