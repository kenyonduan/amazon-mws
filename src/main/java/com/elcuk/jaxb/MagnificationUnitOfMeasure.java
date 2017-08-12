/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="MagnificationUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum MagnificationUnitOfMeasure
/*    */ {
/* 28 */   MULTIPLIER_X("multiplier_x"), 
/*    */ 
/* 30 */   DIOPTERS("diopters");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private MagnificationUnitOfMeasure(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static MagnificationUnitOfMeasure fromValue(String v) {
/* 43 */     for (MagnificationUnitOfMeasure c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MagnificationUnitOfMeasure
 * JD-Core Version:    0.6.2
 */