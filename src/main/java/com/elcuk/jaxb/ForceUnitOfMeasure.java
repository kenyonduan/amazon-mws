/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ForceUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum ForceUnitOfMeasure
/*    */ {
/* 31 */   NEWTONS("newtons"), 
/*    */ 
/* 33 */   NEWTON("Newton"), 
/*    */ 
/* 35 */   POUNDS("pounds"), 
/*    */ 
/* 37 */   KILOGRAMS("kilograms"), 
/*    */ 
/* 39 */   PSI("PSI");
/*    */ 
/*    */   private final String value;
/*    */ 
/* 43 */   private ForceUnitOfMeasure(String v) { this.value = v; }
/*    */ 
/*    */   public String value()
/*    */   {
/* 47 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ForceUnitOfMeasure fromValue(String v) {
/* 51 */     for (ForceUnitOfMeasure c : values()) {
/* 52 */       if (c.value.equals(v)) {
/* 53 */         return c;
/*    */       }
/*    */     }
/* 56 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ForceUnitOfMeasure
 * JD-Core Version:    0.6.2
 */