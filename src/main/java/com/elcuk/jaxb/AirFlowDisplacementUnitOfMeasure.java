/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="AirFlowDisplacementUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum AirFlowDisplacementUnitOfMeasure
/*    */ {
/* 28 */   CUBIC_FEET_PER_MINUTE("cubic_feet_per_minute"), 
/*    */ 
/* 30 */   CUBIC_FEET_PER_HOUR("cubic_feet_per_hour");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private AirFlowDisplacementUnitOfMeasure(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static AirFlowDisplacementUnitOfMeasure fromValue(String v) {
/* 43 */     for (AirFlowDisplacementUnitOfMeasure c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AirFlowDisplacementUnitOfMeasure
 * JD-Core Version:    0.6.2
 */