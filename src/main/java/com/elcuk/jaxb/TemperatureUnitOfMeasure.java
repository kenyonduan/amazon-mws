/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="TemperatureUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum TemperatureUnitOfMeasure
/*    */ {
/* 27 */   C, 
/* 28 */   F;
/*    */ 
/*    */   public String value() {
/* 31 */     return name();
/*    */   }
/*    */ 
/*    */   public static TemperatureUnitOfMeasure fromValue(String v) {
/* 35 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TemperatureUnitOfMeasure
 * JD-Core Version:    0.6.2
 */