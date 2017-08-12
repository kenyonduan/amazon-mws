/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BatteryCellTypeValues")
/*    */ @XmlEnum
/*    */ public enum BatteryCellTypeValues
/*    */ {
/* 41 */   NI_CAD("NiCAD"), 
/*    */ 
/* 43 */   NI_MH("NiMh"), 
/*    */ 
/* 45 */   ALKALINE("alkaline"), 
/*    */ 
/* 47 */   ALUMINUM_OXYGEN("aluminum_oxygen"), 
/*    */ 
/* 49 */   LEAD_ACID("lead_acid"), 
/*    */ 
/* 51 */   LEAD_CALCIUM("lead_calcium"), 
/*    */ 
/* 53 */   LITHIUM("lithium"), 
/*    */ 
/* 55 */   LITHIUM_ION("lithium_ion"), 
/*    */ 
/* 57 */   LITHIUM_MANGANESE_DIOXIDE("lithium_manganese_dioxide"), 
/*    */ 
/* 59 */   LITHIUM_METAL("lithium_metal"), 
/*    */ 
/* 61 */   LITHIUM_POLYMER("lithium_polymer"), 
/*    */ 
/* 63 */   MANGANESE("manganese"), 
/*    */ 
/* 65 */   POLYMER("polymer"), 
/*    */ 
/* 67 */   SILVER_OXIDE("silver_oxide"), 
/*    */ 
/* 69 */   ZINC("zinc");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private BatteryCellTypeValues(String v) {
/* 74 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 78 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static BatteryCellTypeValues fromValue(String v) {
/* 82 */     for (BatteryCellTypeValues c : values()) {
/* 83 */       if (c.value.equals(v)) {
/* 84 */         return c;
/*    */       }
/*    */     }
/* 87 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BatteryCellTypeValues
 * JD-Core Version:    0.6.2
 */