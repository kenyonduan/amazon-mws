/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="HumanInterfaceOutputType")
/*    */ @XmlEnum
/*    */ public enum HumanInterfaceOutputType
/*    */ {
/* 28 */   SCREEN("screen"), 
/*    */ 
/* 30 */   SPEAKER("speaker");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private HumanInterfaceOutputType(String v) {
/* 35 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 39 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static HumanInterfaceOutputType fromValue(String v) {
/* 43 */     for (HumanInterfaceOutputType c : values()) {
/* 44 */       if (c.value.equals(v)) {
/* 45 */         return c;
/*    */       }
/*    */     }
/* 48 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HumanInterfaceOutputType
 * JD-Core Version:    0.6.2
 */