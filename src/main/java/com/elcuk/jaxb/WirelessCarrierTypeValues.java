/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="WirelessCarrierTypeValues")
/*    */ @XmlEnum
/*    */ public enum WirelessCarrierTypeValues
/*    */ {
/* 30 */   ATT("att "), 
/*    */ 
/* 32 */   SPRINTPCS("sprintpcs"), 
/*    */ 
/* 34 */   T_MOBILE("t_mobile"), 
/*    */ 
/* 36 */   VERIZON("verizon");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private WirelessCarrierTypeValues(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static WirelessCarrierTypeValues fromValue(String v) {
/* 49 */     for (WirelessCarrierTypeValues c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WirelessCarrierTypeValues
 * JD-Core Version:    0.6.2
 */