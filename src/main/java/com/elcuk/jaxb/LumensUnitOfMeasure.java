/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="LumensUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum LumensUnitOfMeasure
/*    */ {
/* 27 */   LUMENS("Lumens");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private LumensUnitOfMeasure(String v) {
/* 32 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 36 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static LumensUnitOfMeasure fromValue(String v) {
/* 40 */     for (LumensUnitOfMeasure c : values()) {
/* 41 */       if (c.value.equals(v)) {
/* 42 */         return c;
/*    */       }
/*    */     }
/* 45 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.LumensUnitOfMeasure
 * JD-Core Version:    0.6.2
 */