/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="WaterResistantType")
/*    */ @XmlEnum
/*    */ public enum WaterResistantType
/*    */ {
/* 29 */   NOT_WATER_RESISTANT("not_water_resistant"), 
/*    */ 
/* 31 */   WATER_RESISTANT("water_resistant"), 
/*    */ 
/* 33 */   WATERPROOF("waterproof");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private WaterResistantType(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static WaterResistantType fromValue(String v) {
/* 46 */     for (WaterResistantType c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WaterResistantType
 * JD-Core Version:    0.6.2
 */