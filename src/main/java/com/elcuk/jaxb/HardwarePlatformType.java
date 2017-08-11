/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="HardwarePlatformType")
/*    */ @XmlEnum
/*    */ public enum HardwarePlatformType
/*    */ {
/* 30 */   LINUX("linux"), 
/*    */ 
/* 32 */   MAC("mac"), 
/*    */ 
/* 34 */   WINDOWS("windows"), 
/*    */ 
/* 36 */   UNIX("unix");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private HardwarePlatformType(String v) {
/* 41 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static HardwarePlatformType fromValue(String v) {
/* 49 */     for (HardwarePlatformType c : values()) {
/* 50 */       if (c.value.equals(v)) {
/* 51 */         return c;
/*    */       }
/*    */     }
/* 54 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HardwarePlatformType
 * JD-Core Version:    0.6.2
 */