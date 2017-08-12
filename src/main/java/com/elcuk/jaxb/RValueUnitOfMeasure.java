/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="RValueUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum RValueUnitOfMeasure
/*    */ {
/* 27 */   R_VALUE("r_value");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private RValueUnitOfMeasure(String v) {
/* 32 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 36 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static RValueUnitOfMeasure fromValue(String v) {
/* 40 */     for (RValueUnitOfMeasure c : values()) {
/* 41 */       if (c.value.equals(v)) {
/* 42 */         return c;
/*    */       }
/*    */     }
/* 45 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.RValueUnitOfMeasure
 * JD-Core Version:    0.6.2
 */