/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="AmperageUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum AmperageUnitOfMeasure
/*    */ {
/* 32 */   AMPS("amps"), 
/*    */ 
/* 34 */   KILOAMPS("kiloamps"), 
/*    */ 
/* 36 */   MICROAMPS("microamps"), 
/*    */ 
/* 38 */   MILLIAMPS("milliamps"), 
/*    */ 
/* 40 */   NANOAMPS("nanoamps"), 
/*    */ 
/* 42 */   PICOAMPS("picoamps");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private AmperageUnitOfMeasure(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static AmperageUnitOfMeasure fromValue(String v) {
/* 55 */     for (AmperageUnitOfMeasure c : values()) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     }
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AmperageUnitOfMeasure
 * JD-Core Version:    0.6.2
 */