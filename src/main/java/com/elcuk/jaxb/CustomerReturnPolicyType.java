/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="CustomerReturnPolicyType")
/*    */ @XmlEnum
/*    */ public enum CustomerReturnPolicyType
/*    */ {
/* 32 */   COLLECTIBLE("collectible"), 
/*    */ 
/* 34 */   RESTOCKING_FEE("restocking_fee"), 
/*    */ 
/* 36 */   STANDARD("standard"), 
/*    */ 
/* 38 */   NON_RETURNABLE("non_returnable"), 
/*    */ 
/* 40 */   SEASONAL("seasonal"), 
/*    */ 
/* 42 */   UNKNOWN("unknown");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private CustomerReturnPolicyType(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static CustomerReturnPolicyType fromValue(String v) {
/* 55 */     for (CustomerReturnPolicyType c : values()) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     }
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CustomerReturnPolicyType
 * JD-Core Version:    0.6.2
 */