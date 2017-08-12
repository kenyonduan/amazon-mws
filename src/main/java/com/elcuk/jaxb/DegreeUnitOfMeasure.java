/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="DegreeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum DegreeUnitOfMeasure
/*    */ {
/* 34 */   DEGREES("degrees"), 
/*    */ 
/* 36 */   MICRORADIAN("microradian"), 
/*    */ 
/* 38 */   ARC_MINUTE("arc_minute"), 
/*    */ 
/* 40 */   ARC_SEC("arc_sec"), 
/*    */ 
/* 42 */   MILLIRADIAN("milliradian"), 
/*    */ 
/* 44 */   RADIANS("radians"), 
/*    */ 
/* 46 */   TURNS("turns"), 
/*    */ 
/* 48 */   REVOLUTIONS("revolutions");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private DegreeUnitOfMeasure(String v) {
/* 53 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 57 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static DegreeUnitOfMeasure fromValue(String v) {
/* 61 */     for (DegreeUnitOfMeasure c : values()) {
/* 62 */       if (c.value.equals(v)) {
/* 63 */         return c;
/*    */       }
/*    */     }
/* 66 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DegreeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */