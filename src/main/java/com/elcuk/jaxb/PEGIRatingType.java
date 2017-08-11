/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="PEGIRatingType")
/*    */ @XmlEnum
/*    */ public enum PEGIRatingType
/*    */ {
/* 32 */   AGES_3_AND_OVER("ages_3_and_over"), 
/*    */ 
/* 34 */   AGES_7_AND_OVER("ages_7_and_over"), 
/*    */ 
/* 36 */   AGES_12_AND_OVER("ages_12_and_over"), 
/*    */ 
/* 38 */   AGES_16_AND_OVER("ages_16_and_over"), 
/*    */ 
/* 40 */   AGES_18_AND_OVER("ages_18_and_over"), 
/*    */ 
/* 42 */   UNKNOWN("unknown");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private PEGIRatingType(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static PEGIRatingType fromValue(String v) {
/* 55 */     for (PEGIRatingType c : values()) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     }
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PEGIRatingType
 * JD-Core Version:    0.6.2
 */