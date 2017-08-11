/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="WaterConsumptionUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum WaterConsumptionUnitOfMeasure
/*    */ {
/* 29 */   GALLONS_PER_MINUTE("GallonsPerMinute"), 
/*    */ 
/* 31 */   GALLONS_PER_HOUR("GallonsPerHour"), 
/*    */ 
/* 33 */   GALLONS_PER_FLUSH("GallonsPerFlush");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private WaterConsumptionUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static WaterConsumptionUnitOfMeasure fromValue(String v) {
/* 46 */     for (WaterConsumptionUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WaterConsumptionUnitOfMeasure
 * JD-Core Version:    0.6.2
 */