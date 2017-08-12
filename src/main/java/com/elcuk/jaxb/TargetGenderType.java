/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="TargetGenderType")
/*    */ @XmlEnum
/*    */ public enum TargetGenderType
/*    */ {
/* 29 */   MALE("male"), 
/*    */ 
/* 31 */   FEMALE("female"), 
/*    */ 
/* 33 */   UNISEX("unisex");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private TargetGenderType(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static TargetGenderType fromValue(String v) {
/* 46 */     for (TargetGenderType c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TargetGenderType
 * JD-Core Version:    0.6.2
 */