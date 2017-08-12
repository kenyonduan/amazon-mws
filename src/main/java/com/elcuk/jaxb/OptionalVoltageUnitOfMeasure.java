/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="OptionalVoltageUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum OptionalVoltageUnitOfMeasure
/*    */ {
/* 31 */   VOLTS("volts"), 
/*    */ 
/* 33 */   MILLIVOLTS("millivolts"), 
/*    */ 
/* 35 */   MICROVOLTS("microvolts"), 
/*    */ 
/* 37 */   NANOVOLTS("nanovolts"), 
/*    */ 
/* 39 */   KILOVOLTS("kilovolts");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private OptionalVoltageUnitOfMeasure(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static OptionalVoltageUnitOfMeasure fromValue(String v) {
/* 52 */     for (OptionalVoltageUnitOfMeasure c : values()) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     }
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OptionalVoltageUnitOfMeasure
 * JD-Core Version:    0.6.2
 */