/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="USKRatingType")
/*    */ @XmlEnum
/*    */ public enum USKRatingType
/*    */ {
/* 35 */   AGES_6_AND_OVER("ages_6_and_over"), 
/*    */ 
/* 37 */   AGES_12_AND_OVER("ages_12_and_over"), 
/*    */ 
/* 39 */   AGES_16_AND_OVER("ages_16_and_over"), 
/*    */ 
/* 41 */   AGES_18_AND_OVER("ages_18_and_over"), 
/*    */ 
/* 43 */   CANNOT_PUBLICIZE("cannot_publicize"), 
/*    */ 
/* 45 */   CHECKED_BY_LEGAL_DEPARTMENT("checked_by_legal_department"), 
/*    */ 
/* 47 */   NOT_CHECKED("not_checked"), 
/*    */ 
/* 49 */   WITHOUT_AGE_LIMITATION("without_age_limitation"), 
/*    */ 
/* 51 */   UNKNOWN("unknown");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private USKRatingType(String v) {
/* 56 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 60 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static USKRatingType fromValue(String v) {
/* 64 */     for (USKRatingType c : values()) {
/* 65 */       if (c.value.equals(v)) {
/* 66 */         return c;
/*    */       }
/*    */     }
/* 69 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.USKRatingType
 * JD-Core Version:    0.6.2
 */