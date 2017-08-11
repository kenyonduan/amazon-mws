/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="HeadsetTypeValue")
/*    */ @XmlEnum
/*    */ public enum HeadsetTypeValue
/*    */ {
/* 28 */   ONE_EAR("one-ear"), 
/*    */ 
/* 30 */   TWO_EAR("two-ear");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private HeadsetTypeValue(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static HeadsetTypeValue fromValue(String v) {
/* 43 */     for (HeadsetTypeValue c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HeadsetTypeValue
 * JD-Core Version:    0.6.2
 */