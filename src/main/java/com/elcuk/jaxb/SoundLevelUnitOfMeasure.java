/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="SoundLevelUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum SoundLevelUnitOfMeasure
/*    */ {
/* 29 */   SONE("Sone"), 
/*    */ 
/* 31 */   SONES("Sones"), 
/*    */ 
/* 33 */   DECIBEL("decibel");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private SoundLevelUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static SoundLevelUnitOfMeasure fromValue(String v) {
/* 46 */     for (SoundLevelUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SoundLevelUnitOfMeasure
 * JD-Core Version:    0.6.2
 */