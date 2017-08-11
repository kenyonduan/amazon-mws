/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BatteryLifeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum BatteryLifeUnitOfMeasure
/*    */ {
/* 29 */   MINUTES("minutes"), 
/*    */ 
/* 31 */   HOURS("hours"), 
/*    */ 
/* 33 */   DAYS("days");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private BatteryLifeUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static BatteryLifeUnitOfMeasure fromValue(String v) {
/* 46 */     for (BatteryLifeUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BatteryLifeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */