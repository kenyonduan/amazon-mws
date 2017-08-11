/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="EnergyConsumptionUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum EnergyConsumptionUnitOfMeasure
/*    */ {
/* 30 */   KILOWATT_HOURS("kilowatt_hours"), 
/*    */ 
/* 32 */   BTU("btu"), 
/*    */ 
/* 34 */   KILOWATTS("kilowatts"), 
/*    */ 
/* 36 */   WATT_HOURS("watt_hours");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private EnergyConsumptionUnitOfMeasure(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static EnergyConsumptionUnitOfMeasure fromValue(String v) {
/* 49 */     for (EnergyConsumptionUnitOfMeasure c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.EnergyConsumptionUnitOfMeasure
 * JD-Core Version:    0.6.2
 */