/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="OptionalEnergyConsumptionUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum OptionalEnergyConsumptionUnitOfMeasure
/*    */ {
/* 28 */   WATT_HOURS("watt_hours"), 
/*    */ 
/* 30 */   KILOWATTS("kilowatts");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private OptionalEnergyConsumptionUnitOfMeasure(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static OptionalEnergyConsumptionUnitOfMeasure fromValue(String v) {
/* 43 */     for (OptionalEnergyConsumptionUnitOfMeasure c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OptionalEnergyConsumptionUnitOfMeasure
 * JD-Core Version:    0.6.2
 */