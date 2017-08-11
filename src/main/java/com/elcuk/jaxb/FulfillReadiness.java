/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="FulfillReadiness")
/*    */ @XmlEnum
/*    */ public enum FulfillReadiness
/*    */ {
/* 32 */   DROP_SHIP_READY("drop_ship_ready"), 
/*    */ 
/* 34 */   NOT_READY("not_ready"), 
/*    */ 
/* 36 */   RECEIVE_READY("receive_ready"), 
/*    */ 
/* 38 */   EXCEPTION_RECEIVE_READY("exception_receive_ready"), 
/*    */ 
/* 40 */   PO_READY("po_ready"), 
/*    */ 
/* 42 */   UNKNOWN("unknown");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private FulfillReadiness(String v) {
/* 47 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static FulfillReadiness fromValue(String v) {
/* 55 */     for (FulfillReadiness c : values()) {
/* 56 */       if (c.value.equals(v)) {
/* 57 */         return c;
/*    */       }
/*    */     }
/* 60 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.FulfillReadiness
 * JD-Core Version:    0.6.2
 */