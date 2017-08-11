/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="PixelUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum PixelUnitOfMeasure
/*    */ {
/* 28 */   PIXELS("pixels"), 
/*    */ 
/* 30 */   MP("MP");
/*    */ 
/*    */   private final String value;
/*    */ 
/* 34 */   private PixelUnitOfMeasure(String v) { this.value = v; }
/*    */ 
/*    */   public String value()
/*    */   {
/* 38 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static PixelUnitOfMeasure fromValue(String v) {
/* 42 */     for (PixelUnitOfMeasure c : values()) {
/* 43 */       if (c.value.equals(v)) {
/* 44 */         return c;
/*    */       }
/*    */     }
/* 47 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PixelUnitOfMeasure
 * JD-Core Version:    0.6.2
 */