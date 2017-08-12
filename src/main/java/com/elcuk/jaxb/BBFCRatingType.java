/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BBFCRatingType")
/*    */ @XmlEnum
/*    */ public enum BBFCRatingType
/*    */ {
/* 34 */   AGES_12_AND_OVER("ages_12_and_over"), 
/*    */ 
/* 36 */   AGES_15_AND_OVER("ages_15_and_over"), 
/*    */ 
/* 38 */   AGES_18_AND_OVER("ages_18_and_over"), 
/*    */ 
/* 40 */   EXEMPT("exempt"), 
/*    */ 
/* 42 */   PARENTAL_GUIDANCE("parental_guidance"), 
/*    */ 
/* 44 */   TO_BE_ANNOUNCED("to_be_announced"), 
/*    */ 
/* 46 */   UNIVERSAL_CHILDRENS("universal_childrens"), 
/*    */ 
/* 48 */   UNIVERSAL("universal");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private BBFCRatingType(String v) {
/* 53 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 57 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static BBFCRatingType fromValue(String v) {
/* 61 */     for (BBFCRatingType c : values()) {
/* 62 */       if (c.value.equals(v)) {
/* 63 */         return c;
/*    */       }
/*    */     }
/* 66 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BBFCRatingType
 * JD-Core Version:    0.6.2
 */