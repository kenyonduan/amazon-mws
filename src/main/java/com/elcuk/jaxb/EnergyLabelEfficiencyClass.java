/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="EnergyLabelEfficiencyClass")
/*    */ @XmlEnum
/*    */ public enum EnergyLabelEfficiencyClass
/*    */ {
/* 36 */   A("a"), 
/*    */ 
/* 38 */   B("b"), 
/*    */ 
/* 40 */   C("c"), 
/*    */ 
/* 42 */   D("d"), 
/*    */ 
/* 44 */   E("e"), 
/*    */ 
/* 46 */   F("f"), 
/*    */ 
/* 48 */   G("g"), 
/*    */ 
/* 50 */   A_PLUS("a_plus"), 
/*    */ 
/* 52 */   A_PLUS_PLUS("a_plus_plus"), 
/*    */ 
/* 54 */   A_PLUS_PLUS_PLUS("a_plus_plus_plus");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private EnergyLabelEfficiencyClass(String v) {
/* 59 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 63 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static EnergyLabelEfficiencyClass fromValue(String v) {
/* 67 */     for (EnergyLabelEfficiencyClass c : values()) {
/* 68 */       if (c.value.equals(v)) {
/* 69 */         return c;
/*    */       }
/*    */     }
/* 72 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.EnergyLabelEfficiencyClass
 * JD-Core Version:    0.6.2
 */