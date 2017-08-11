/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="PromotionApplicationType")
/*    */ @XmlEnum
/*    */ public enum PromotionApplicationType
/*    */ {
/* 28 */   PRINCIPAL("Principal"), 
/*    */ 
/* 30 */   SHIPPING("Shipping");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private PromotionApplicationType(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static PromotionApplicationType fromValue(String v) {
/* 43 */     for (PromotionApplicationType c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PromotionApplicationType
 * JD-Core Version:    0.6.2
 */