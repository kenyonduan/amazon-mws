/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="HardnessUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum HardnessUnitOfMeasure
/*    */ {
/* 43 */   BRINNELL("brinnell"), 
/*    */ 
/* 45 */   VICKERS("vickers"), 
/*    */ 
/* 47 */   ROCKWELL_A("rockwell_a"), 
/*    */ 
/* 49 */   ROCKWELL_B("rockwell_b"), 
/*    */ 
/* 51 */   ROCKWELL_C("rockwell_c"), 
/*    */ 
/* 53 */   ROCKWELL_D("rockwell_d"), 
/*    */ 
/* 55 */   SHORE_A("shore_a"), 
/*    */ 
/* 57 */   SHORE_B("shore_b"), 
/*    */ 
/* 59 */   SHORE_C("shore_c"), 
/*    */ 
/* 61 */   SHORE_D("shore_d"), 
/*    */ 
/* 63 */   SHORE_DO("shore_do"), 
/*    */ 
/* 65 */   SHORE_E("shore_e"), 
/*    */ 
/* 67 */   SHORE_M("shore_m"), 
/*    */ 
/* 69 */   SHORE_O("shore_o"), 
/*    */ 
/* 71 */   SHORE_OO("shore_oo"), 
/*    */ 
/* 73 */   SHORE_OOO("shore_ooo"), 
/*    */ 
/* 75 */   SHORE_OOO_S("shore_ooo_s");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private HardnessUnitOfMeasure(String v) {
/* 80 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 84 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static HardnessUnitOfMeasure fromValue(String v) {
/* 88 */     for (HardnessUnitOfMeasure c : values()) {
/* 89 */       if (c.value.equals(v)) {
/* 90 */         return c;
/*    */       }
/*    */     }
/* 93 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HardnessUnitOfMeasure
 * JD-Core Version:    0.6.2
 */