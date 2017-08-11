/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="MaxEthernetSpeedTypeValues")
/*    */ @XmlEnum
/*    */ public enum MaxEthernetSpeedTypeValues
/*    */ {
/* 29 */   ETHERNET_10_BASE_T("ethernet_10base_t"), 
/*    */ 
/* 31 */   ETHERNET_100_BASE_T("ethernet_100base_t"), 
/*    */ 
/* 33 */   ETHERNET_100_BASE_TX("ethernet_100base_tx");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private MaxEthernetSpeedTypeValues(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static MaxEthernetSpeedTypeValues fromValue(String v) {
/* 46 */     for (MaxEthernetSpeedTypeValues c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MaxEthernetSpeedTypeValues
 * JD-Core Version:    0.6.2
 */