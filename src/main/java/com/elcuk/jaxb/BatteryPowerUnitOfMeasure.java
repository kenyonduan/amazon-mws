/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BatteryPowerUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum BatteryPowerUnitOfMeasure
/*    */ {
/* 30 */   MILLIAMP_HOURS("milliamp_hours"), 
/*    */ 
/* 32 */   AMP_HOURS("amp_hours"), 
/*    */ 
/* 34 */   VOLT_AMPERES("volt_amperes"), 
/*    */ 
/* 36 */   WATT_HOURS("watt_hours");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private BatteryPowerUnitOfMeasure(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static BatteryPowerUnitOfMeasure fromValue(String v) {
/* 49 */     for (BatteryPowerUnitOfMeasure c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BatteryPowerUnitOfMeasure
 * JD-Core Version:    0.6.2
 */