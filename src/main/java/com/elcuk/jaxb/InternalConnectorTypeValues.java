/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="InternalConnectorTypeValues")
/*    */ @XmlEnum
/*    */ public enum InternalConnectorTypeValues
/*    */ {
/* 36 */   EIDE("eide"), 
/*    */ 
/* 38 */   FIBRE_CHANNEL("fibre_channel"), 
/*    */ 
/* 40 */   IDE("ide"), 
/*    */ 
/* 42 */   PCI_EXPRESS_X_4("pci_express_x4"), 
/*    */ 
/* 44 */   PCI_EXPRESS_X_8("pci_express_x8"), 
/*    */ 
/* 46 */   SERIAL_SCSI("serial_scsi"), 
/*    */ 
/* 48 */   SERIAL_ATA_150("serial_ata150"), 
/*    */ 
/* 50 */   SERIAL_ATA_300("serial_ata300"), 
/*    */ 
/* 52 */   SERIAL_ATA_600("serial_ata600"), 
/*    */ 
/* 54 */   SCSI("scsi");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private InternalConnectorTypeValues(String v) {
/* 59 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 63 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static InternalConnectorTypeValues fromValue(String v) {
/* 67 */     for (InternalConnectorTypeValues c : values()) {
/* 68 */       if (c.value.equals(v)) {
/* 69 */         return c;
/*    */       }
/*    */     }
/* 72 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.InternalConnectorTypeValues
 * JD-Core Version:    0.6.2
 */