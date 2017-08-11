/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ResolutionUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum ResolutionUnitOfMeasure
/*    */ {
/* 29 */   MEGAPIXELS("megapixels"), 
/*    */ 
/* 31 */   PIXELS("pixels"), 
/*    */ 
/* 33 */   LINES_PER_INCH("lines_per_inch");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private ResolutionUnitOfMeasure(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ResolutionUnitOfMeasure fromValue(String v) {
/* 46 */     for (ResolutionUnitOfMeasure c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ResolutionUnitOfMeasure
 * JD-Core Version:    0.6.2
 */