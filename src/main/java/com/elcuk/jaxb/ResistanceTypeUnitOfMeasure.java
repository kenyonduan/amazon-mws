/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ResistanceTypeUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum ResistanceTypeUnitOfMeasure
/*    */ {
/* 27 */   POUNDS("pounds");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private ResistanceTypeUnitOfMeasure(String v) {
/* 32 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 36 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ResistanceTypeUnitOfMeasure fromValue(String v) {
/* 40 */     for (ResistanceTypeUnitOfMeasure c : values()) {
/* 41 */       if (c.value.equals(v)) {
/* 42 */         return c;
/*    */       }
/*    */     }
/* 45 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ResistanceTypeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */