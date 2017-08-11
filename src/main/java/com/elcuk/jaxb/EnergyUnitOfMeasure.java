/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="EnergyUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum EnergyUnitOfMeasure
/*    */ {
/* 30 */   BTU("BTU"), 
/* 31 */   WATTS("watts"), 
/*    */ 
/* 33 */   JOULES("joules"), 
/*    */ 
/* 35 */   KILOJOULES("kilojoules");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private EnergyUnitOfMeasure(String v) {
/* 40 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 44 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static EnergyUnitOfMeasure fromValue(String v) {
/* 48 */     for (EnergyUnitOfMeasure c : values()) {
/* 49 */       if (c.value.equals(v)) {
/* 50 */         return c;
/*    */       }
/*    */     }
/* 53 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.EnergyUnitOfMeasure
 * JD-Core Version:    0.6.2
 */