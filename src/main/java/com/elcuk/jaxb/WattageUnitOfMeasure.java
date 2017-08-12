/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="WattageUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum WattageUnitOfMeasure
/*    */ {
/* 28 */   WATTS("watts"), 
/*    */ 
/* 30 */   KILOWATTS("kilowatts");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private WattageUnitOfMeasure(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static WattageUnitOfMeasure fromValue(String v) {
/* 43 */     for (WattageUnitOfMeasure c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WattageUnitOfMeasure
 * JD-Core Version:    0.6.2
 */