/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="TemperatureRangeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum TemperatureRangeUnitOfMeasure
/*    */ {
/* 27 */   F, 
/* 28 */   C;
/*    */ 
/*    */   public String value() {
/* 31 */     return name();
/*    */   }
/*    */ 
/*    */   public static TemperatureRangeUnitOfMeasure fromValue(String v) {
/* 35 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TemperatureRangeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */