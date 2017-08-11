/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="HeadsetStyleValue")
/*    */ @XmlEnum
/*    */ public enum HeadsetStyleValue
/*    */ {
/* 29 */   OVER_THE_EAR("over-the-ear"), 
/*    */ 
/* 31 */   BEHIND_THE_EAR("behind-the-ear"), 
/*    */ 
/* 33 */   IN_THE_EAR("in-the-ear");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private HeadsetStyleValue(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static HeadsetStyleValue fromValue(String v) {
/* 46 */     for (HeadsetStyleValue c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HeadsetStyleValue
 * JD-Core Version:    0.6.2
 */