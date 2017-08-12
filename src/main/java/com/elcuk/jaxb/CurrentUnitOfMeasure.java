/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="CurrentUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum CurrentUnitOfMeasure
/*    */ {
/* 28 */   M_A("mA"), 
/*    */ 
/* 30 */   A("A");
/*    */ 
/*    */   private final String value;
/*    */ 
/* 34 */   private CurrentUnitOfMeasure(String v) { this.value = v; }
/*    */ 
/*    */   public String value()
/*    */   {
/* 38 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static CurrentUnitOfMeasure fromValue(String v) {
/* 42 */     for (CurrentUnitOfMeasure c : values()) {
/* 43 */       if (c.value.equals(v)) {
/* 44 */         return c;
/*    */       }
/*    */     }
/* 47 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CurrentUnitOfMeasure
 * JD-Core Version:    0.6.2
 */