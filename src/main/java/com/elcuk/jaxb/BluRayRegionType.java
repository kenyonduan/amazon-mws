/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="BluRayRegionType")
/*    */ @XmlEnum
/*    */ public enum BluRayRegionType
/*    */ {
/* 30 */   REGION_A("region_a"), 
/*    */ 
/* 32 */   REGION_B("region_b"), 
/*    */ 
/* 34 */   REGION_C("region_c"), 
/*    */ 
/* 36 */   REGION_FREE("region_free");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private BluRayRegionType(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static BluRayRegionType fromValue(String v) {
/* 49 */     for (BluRayRegionType c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.BluRayRegionType
 * JD-Core Version:    0.6.2
 */