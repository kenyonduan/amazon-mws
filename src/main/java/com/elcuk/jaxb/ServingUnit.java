/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ServingUnit")
/*    */ @XmlEnum
/*    */ public enum ServingUnit
/*    */ {
/* 33 */   PERCENT_FDA("percent-fda"), 
/*    */ 
/* 35 */   MG("mg"), 
/*    */ 
/* 37 */   GR("gr"), 
/*    */ 
/* 39 */   ML("ml"), 
/*    */ 
/* 41 */   GRAMS("grams"), 
/*    */ 
/* 43 */   MILLIGRAMS("milligrams"), 
/*    */ 
/* 45 */   MILLILITERS("milliliters");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private ServingUnit(String v) {
/* 50 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 54 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ServingUnit fromValue(String v) {
/* 58 */     for (ServingUnit c : values()) {
/* 59 */       if (c.value.equals(v)) {
/* 60 */         return c;
/*    */       }
/*    */     }
/* 63 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ServingUnit
 * JD-Core Version:    0.6.2
 */