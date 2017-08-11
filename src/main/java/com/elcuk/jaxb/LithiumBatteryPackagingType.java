/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="LithiumBatteryPackagingType")
/*    */ @XmlEnum
/*    */ public enum LithiumBatteryPackagingType
/*    */ {
/* 29 */   BATTERIES_CONTAINED_IN_EQUIPMENT("batteries_contained_in_equipment"), 
/*    */ 
/* 31 */   BATTERIES_ONLY("batteries_only"), 
/*    */ 
/* 33 */   BATTERIES_PACKED_WITH_EQUIPMENT("batteries_packed_with_equipment");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private LithiumBatteryPackagingType(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static LithiumBatteryPackagingType fromValue(String v) {
/* 46 */     for (LithiumBatteryPackagingType c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.LithiumBatteryPackagingType
 * JD-Core Version:    0.6.2
 */