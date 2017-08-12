/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="CarSeatWeightGroupEUType")
/*    */ @XmlEnum
/*    */ public enum CarSeatWeightGroupEUType
/*    */ {
/* 31 */   GROUP_ZERO("group_zero"), 
/*    */ 
/* 33 */   GROUP_ZERO_PLUS("group_zero_plus"), 
/*    */ 
/* 35 */   GROUP_ONE("group_one"), 
/*    */ 
/* 37 */   GROUP_TWO("group_two"), 
/*    */ 
/* 39 */   GROUP_THREE("group_three");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private CarSeatWeightGroupEUType(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static CarSeatWeightGroupEUType fromValue(String v) {
/* 52 */     for (CarSeatWeightGroupEUType c : values()) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     }
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CarSeatWeightGroupEUType
 * JD-Core Version:    0.6.2
 */