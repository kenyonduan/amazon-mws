/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="AirflowUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum AirflowUnitOfMeasure
/*    */ {
/* 26 */   CFM;
/*    */ 
/*    */   public String value() {
/* 29 */     return name();
/*    */   }
/*    */ 
/*    */   public static AirflowUnitOfMeasure fromValue(String v) {
/* 33 */     return valueOf(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AirflowUnitOfMeasure
 * JD-Core Version:    0.6.2
 */