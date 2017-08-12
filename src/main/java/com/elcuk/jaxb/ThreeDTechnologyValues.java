/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ThreeDTechnologyValues")
/*    */ @XmlEnum
/*    */ public enum ThreeDTechnologyValues
/*    */ {
/* 30 */   ACTIVE("active"), 
/*    */ 
/* 32 */   ANAGLYPHIC("anaglyphic"), 
/*    */ 
/* 34 */   AUTO_STEREOSCOPIC("auto_stereoscopic"), 
/*    */ 
/* 36 */   PASSIVE("passive");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private ThreeDTechnologyValues(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ThreeDTechnologyValues fromValue(String v) {
/* 49 */     for (ThreeDTechnologyValues c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ThreeDTechnologyValues
 * JD-Core Version:    0.6.2
 */