/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="GraphicsCardInterfaceTypeValues")
/*    */ @XmlEnum
/*    */ public enum GraphicsCardInterfaceTypeValues
/*    */ {
/* 31 */   AGP("agp"), 
/*    */ 
/* 33 */   INTEGRATED("integrated"), 
/*    */ 
/* 35 */   PCI("pci"), 
/*    */ 
/* 37 */   PCI_E("pci_e"), 
/*    */ 
/* 39 */   UNKNOWN("unknown");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private GraphicsCardInterfaceTypeValues(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static GraphicsCardInterfaceTypeValues fromValue(String v) {
/* 52 */     for (GraphicsCardInterfaceTypeValues c : values()) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     }
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.GraphicsCardInterfaceTypeValues
 * JD-Core Version:    0.6.2
 */