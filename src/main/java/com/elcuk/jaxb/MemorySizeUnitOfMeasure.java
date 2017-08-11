/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="MemorySizeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum MemorySizeUnitOfMeasure
/*    */ {
/* 35 */   TB("TB"), 
/* 36 */   GB("GB"), 
/* 37 */   MB("MB"), 
/* 38 */   KB("KB"), 
/* 39 */   KO("KO"), 
/* 40 */   MO("MO"), 
/* 41 */   GO("GO"), 
/* 42 */   TO("TO"), 
/* 43 */   BYTES("bytes");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private MemorySizeUnitOfMeasure(String v) {
/* 48 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 52 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static MemorySizeUnitOfMeasure fromValue(String v) {
/* 56 */     for (MemorySizeUnitOfMeasure c : values()) {
/* 57 */       if (c.value.equals(v)) {
/* 58 */         return c;
/*    */       }
/*    */     }
/* 61 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MemorySizeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */