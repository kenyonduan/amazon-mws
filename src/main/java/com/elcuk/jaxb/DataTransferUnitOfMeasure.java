/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="DataTransferUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum DataTransferUnitOfMeasure
/*    */ {
/* 31 */   K_HZ("KHz"), 
/*    */ 
/* 33 */   M_HZ("MHz"), 
/*    */ 
/* 35 */   G_HZ("GHz"), 
/*    */ 
/* 37 */   MBPS("Mbps"), 
/*    */ 
/* 39 */   GBPS("Gbps");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private DataTransferUnitOfMeasure(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static DataTransferUnitOfMeasure fromValue(String v) {
/* 52 */     for (DataTransferUnitOfMeasure c : values()) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     }
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DataTransferUnitOfMeasure
 * JD-Core Version:    0.6.2
 */