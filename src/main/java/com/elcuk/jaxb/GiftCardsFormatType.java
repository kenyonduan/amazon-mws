/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="GiftCardsFormatType")
/*    */ @XmlEnum
/*    */ public enum GiftCardsFormatType
/*    */ {
/* 32 */   EMAIL_GIFT_CARDS("email_gift_cards"), 
/*    */ 
/* 34 */   PLASTIC_GIFT_CARDS("plastic_gift_cards"), 
/*    */ 
/* 36 */   PRINT_AT_HOME("print_at_home"), 
/*    */ 
/* 38 */   MULTI_PACK("multi_pack"), 
/*    */ 
/* 40 */   FACEBOOK("facebook"), 
/*    */ 
/* 42 */   GIFT_BOX("gift_box");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private GiftCardsFormatType(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static GiftCardsFormatType fromValue(String v) {
/* 55 */     for (GiftCardsFormatType c : values()) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     }
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.GiftCardsFormatType
 * JD-Core Version:    0.6.2
 */