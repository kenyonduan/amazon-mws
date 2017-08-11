/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="Originality")
/*    */ @XmlEnum
/*    */ public enum Originality
/*    */ {
/* 36 */   ORIGINAL("Original"), 
/*    */ 
/* 38 */   ORIGINAL_LIMITED_EDITION("Original Limited Edition"), 
/*    */ 
/* 40 */   REPRODUCED("Reproduced"), 
/*    */ 
/* 42 */   REPRODUCED_LIMITED_EDITION("Reproduced Limited Edition"), 
/*    */ 
/* 44 */   REPLICA("Replica"), 
/*    */ 
/* 46 */   REPLICA_LIMITED_EDITION("Replica Limited Edition"), 
/*    */ 
/* 48 */   LIMITED_EDITION("Limited Edition"), 
/*    */ 
/* 50 */   MANUFACTURED("Manufactured"), 
/*    */ 
/* 52 */   LICENSED("Licensed"), 
/*    */ 
/* 54 */   VINTAGE("Vintage");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private Originality(String v) {
/* 59 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 63 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static Originality fromValue(String v) {
/* 67 */     for (Originality c : values()) {
/* 68 */       if (c.value.equals(v)) {
/* 69 */         return c;
/*    */       }
/*    */     }
/* 72 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Originality
 * JD-Core Version:    0.6.2
 */