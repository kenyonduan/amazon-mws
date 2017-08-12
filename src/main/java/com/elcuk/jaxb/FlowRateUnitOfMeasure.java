/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="FlowRateUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum FlowRateUnitOfMeasure
/*    */ {
/* 29 */   GALLONS_PER_MINUTE("GallonsPerMinute"), 
/*    */ 
/* 31 */   GALLONS_PER_HOUR("GallonsPerHour"), 
/*    */ 
/* 33 */   CYCLES_PER_GALLON("CyclesPerGallon");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private FlowRateUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static FlowRateUnitOfMeasure fromValue(String v) {
/* 46 */     for (FlowRateUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.FlowRateUnitOfMeasure
 * JD-Core Version:    0.6.2
 */