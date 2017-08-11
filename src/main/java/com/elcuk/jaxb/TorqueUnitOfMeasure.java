/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="TorqueUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum TorqueUnitOfMeasure
/*    */ {
/* 37 */   FOOT_LBS("foot-lbs"), 
/*    */ 
/* 39 */   INCH_LBS("inch-lbs"), 
/*    */ 
/* 41 */   CENTIMETER_KILOGRAMS("centimeter_kilograms"), 
/*    */ 
/* 43 */   FOOT_POUNDS("foot_pounds"), 
/*    */ 
/* 45 */   INCH_OUNCES("inch_ounces"), 
/*    */ 
/* 47 */   INCH_POUNDS("inch_pounds"), 
/*    */ 
/* 49 */   KILONEWTONS("kilonewtons"), 
/*    */ 
/* 51 */   KILOGRAMS_PER_MILLIMETER("kilograms_per_millimeter"), 
/*    */ 
/* 53 */   NEWTON_METERS("newton_meters"), 
/*    */ 
/* 55 */   NEWTON_MILLIMETERS("newton_millimeters"), 
/*    */ 
/* 57 */   NEWTONS("newtons");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private TorqueUnitOfMeasure(String v) {
/* 62 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 66 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static TorqueUnitOfMeasure fromValue(String v) {
/* 70 */     for (TorqueUnitOfMeasure c : values()) {
/* 71 */       if (c.value.equals(v)) {
/* 72 */         return c;
/*    */       }
/*    */     }
/* 75 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TorqueUnitOfMeasure
 * JD-Core Version:    0.6.2
 */