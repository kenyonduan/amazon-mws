/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="StoneCreationMethod")
/*    */ @XmlEnum
/*    */ public enum StoneCreationMethod
/*    */ {
/* 29 */   NATURAL("natural"), 
/*    */ 
/* 31 */   SIMULATED("simulated"), 
/*    */ 
/* 33 */   SYNTHETIC("synthetic");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private StoneCreationMethod(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static StoneCreationMethod fromValue(String v) {
/* 46 */     for (StoneCreationMethod c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.StoneCreationMethod
 * JD-Core Version:    0.6.2
 */