/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="SerialNumberFormatType")
/*    */ @XmlEnum
/*    */ public enum SerialNumberFormatType
/*    */ {
/* 32 */   A_OR_Z_ALPHANUMERIC_13("a_or_z_alphanumeric_13"), 
/*    */ 
/* 34 */   ALPHANUMERIC_8("alphanumeric_8"), 
/*    */ 
/* 36 */   NUMERIC_14("numeric_14"), 
/*    */ 
/* 38 */   ALPHANUMERIC_14("alphanumeric_14"), 
/*    */ 
/* 40 */   NUMERIC_12("numeric_12"), 
/*    */ 
/* 42 */   W_ALPHANUMERIC_12("w_alphanumeric_12");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private SerialNumberFormatType(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static SerialNumberFormatType fromValue(String v) {
/* 55 */     for (SerialNumberFormatType c : values()) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     }
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SerialNumberFormatType
 * JD-Core Version:    0.6.2
 */