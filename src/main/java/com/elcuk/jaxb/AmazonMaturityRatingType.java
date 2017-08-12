/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="AmazonMaturityRatingType")
/*    */ @XmlEnum
/*    */ public enum AmazonMaturityRatingType
/*    */ {
/* 33 */   ADULT_CONTENT("adult_content"), 
/*    */ 
/* 35 */   AGES_13_AND_OLDER("ages_13_and_older"), 
/*    */ 
/* 37 */   AGES_17_AND_OLDER("ages_17_and_older"), 
/*    */ 
/* 39 */   AGES_9_AND_OLDER("ages_9_and_older"), 
/*    */ 
/* 41 */   ALL_AGES("all_ages"), 
/*    */ 
/* 43 */   CHILDREN("children"), 
/*    */ 
/* 45 */   RATING_PENDING("rating_pending");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private AmazonMaturityRatingType(String v) {
/* 50 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 54 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static AmazonMaturityRatingType fromValue(String v) {
/* 58 */     for (AmazonMaturityRatingType c : values()) {
/* 59 */       if (c.value.equals(v)) {
/* 60 */         return c;
/*    */       }
/*    */     }
/* 63 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AmazonMaturityRatingType
 * JD-Core Version:    0.6.2
 */