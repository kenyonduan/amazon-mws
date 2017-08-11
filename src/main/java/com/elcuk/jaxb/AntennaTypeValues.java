/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="AntennaTypeValues")
/*    */ @XmlEnum
/*    */ public enum AntennaTypeValues
/*    */ {
/* 29 */   FIXED("fixed"), 
/*    */ 
/* 31 */   INTERNAL("internal"), 
/*    */ 
/* 33 */   RETRACTABLE("retractable");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private AntennaTypeValues(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static AntennaTypeValues fromValue(String v) {
/* 46 */     for (AntennaTypeValues c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AntennaTypeValues
 * JD-Core Version:    0.6.2
 */