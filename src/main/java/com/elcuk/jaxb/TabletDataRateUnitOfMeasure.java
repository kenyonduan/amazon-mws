/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="TabletDataRateUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum TabletDataRateUnitOfMeasure
/*    */ {
/* 26 */   PPS;
/*    */ 
/*    */   public String value() {
/* 29 */     return name();
/*    */   }
/*    */ 
/*    */   public static TabletDataRateUnitOfMeasure fromValue(String v) {
/* 33 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TabletDataRateUnitOfMeasure
 * JD-Core Version:    0.6.2
 */