/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="IdentityPackageType")
/*    */ @XmlEnum
/*    */ public enum IdentityPackageType
/*    */ {
/* 29 */   BULK("bulk"), 
/*    */ 
/* 31 */   FRUSTRATION_FREE("frustration_free"), 
/*    */ 
/* 33 */   TRADITIONAL("traditional");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private IdentityPackageType(String v) {
/* 38 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 42 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static IdentityPackageType fromValue(String v) {
/* 46 */     for (IdentityPackageType c : values()) {
/* 47 */       if (c.value.equals(v)) {
/* 48 */         return c;
/*    */       }
/*    */     }
/* 51 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.IdentityPackageType
 * JD-Core Version:    0.6.2
 */