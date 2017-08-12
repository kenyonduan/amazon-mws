/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="DataTransferSpeedUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum DataTransferSpeedUnitOfMeasure
/*    */ {
/* 29 */   KBPS("kbps"), 
/*    */ 
/* 31 */   MBPS("mbps"), 
/*    */ 
/* 33 */   GBPS("gbps");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private DataTransferSpeedUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static DataTransferSpeedUnitOfMeasure fromValue(String v) {
/* 46 */     for (DataTransferSpeedUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DataTransferSpeedUnitOfMeasure
 * JD-Core Version:    0.6.2
 */