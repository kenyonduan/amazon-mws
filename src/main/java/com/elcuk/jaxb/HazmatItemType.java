/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="HazmatItemType")
/*    */ @XmlEnum
/*    */ public enum HazmatItemType
/*    */ {
/* 40 */   BUTANE("butane"), 
/*    */ 
/* 42 */   FUEL_CELL("fuel_cell"), 
/*    */ 
/* 44 */   GASOLINE("gasoline"), 
/*    */ 
/* 46 */   ORM_D_CLASS_1("orm_d_class_1"), 
/*    */ 
/* 48 */   ORM_D_CLASS_2("orm_d_class_2"), 
/*    */ 
/* 50 */   ORM_D_CLASS_3("orm_d_class_3"), 
/*    */ 
/* 52 */   ORM_D_CLASS_4("orm_d_class_4"), 
/*    */ 
/* 54 */   ORM_D_CLASS_5("orm_d_class_5"), 
/*    */ 
/* 56 */   ORM_D_CLASS_6("orm_d_class_6"), 
/*    */ 
/* 58 */   ORM_D_CLASS_7("orm_d_class_7"), 
/*    */ 
/* 60 */   ORM_D_CLASS_8("orm_d_class_8"), 
/*    */ 
/* 62 */   ORM_D_CLASS_9("orm_d_class_9"), 
/*    */ 
/* 64 */   SEALED_LEAD_ACID_BATTERY("sealed_lead_acid_battery"), 
/*    */ 
/* 66 */   UNKNOWN("unknown");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private HazmatItemType(String v) {
/* 71 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 75 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static HazmatItemType fromValue(String v) {
/* 79 */     for (HazmatItemType c : values()) {
/* 80 */       if (c.value.equals(v)) {
/* 81 */         return c;
/*    */       }
/*    */     }
/* 84 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HazmatItemType
 * JD-Core Version:    0.6.2
 */