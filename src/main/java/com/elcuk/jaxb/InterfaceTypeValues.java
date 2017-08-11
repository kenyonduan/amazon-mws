/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="InterfaceTypeValues")
/*    */ @XmlEnum
/*    */ public enum InterfaceTypeValues
/*    */ {
/* 37 */   EIDE("eide"), 
/*    */ 
/* 39 */   FIBRE_CHANNEL("fibre_channel"), 
/*    */ 
/* 41 */   IDE("ide"), 
/*    */ 
/* 43 */   PCI_X_16("pci_x_16"), 
/*    */ 
/* 45 */   PCI_X_4("pci_x_4"), 
/*    */ 
/* 47 */   PCI_X_8("pci_x_8"), 
/*    */ 
/* 49 */   SAS("sas"), 
/*    */ 
/* 51 */   SATA_1_5_GB("sata_1_5_gb"), 
/*    */ 
/* 53 */   SATA_3_0_GB("sata_3_0_gb"), 
/*    */ 
/* 55 */   SATA_6_0_GB("sata_6_0_gb"), 
/*    */ 
/* 57 */   SCSI("scsi");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private InterfaceTypeValues(String v) {
/* 62 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 66 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static InterfaceTypeValues fromValue(String v) {
/* 70 */     for (InterfaceTypeValues c : values()) {
/* 71 */       if (c.value.equals(v)) {
/* 72 */         return c;
/*    */       }
/*    */     }
/* 75 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.InterfaceTypeValues
 * JD-Core Version:    0.6.2
 */