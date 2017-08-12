/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BootSizeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum BootSizeUnitOfMeasure
/*    */ {
/* 27 */   ADULT_US("adult_us");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private BootSizeUnitOfMeasure(String v) {
/* 32 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 36 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static BootSizeUnitOfMeasure fromValue(String v) {
/* 40 */     for (BootSizeUnitOfMeasure c : values()) {
/* 41 */       if (c.value.equals(v)) {
/* 42 */         return c;
/*    */       }
/*    */     }
/* 45 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BootSizeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */