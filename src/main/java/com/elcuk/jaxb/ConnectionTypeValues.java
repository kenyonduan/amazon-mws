/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ConnectionTypeValues")
/*    */ @XmlEnum
/*    */ public enum ConnectionTypeValues
/*    */ {
/* 42 */   EXPRESS_CARD("express_card"), 
/*    */ 
/* 44 */   FIREWIRE_1600("firewire_1600"), 
/*    */ 
/* 46 */   FIREWIRE_3200("firewire_3200"), 
/*    */ 
/* 48 */   FIREWIRE_400("firewire_400"), 
/*    */ 
/* 50 */   FIREWIRE_800("firewire_800"), 
/*    */ 
/* 52 */   FIREWIRE_ESATA("firewire_esata"), 
/*    */ 
/* 54 */   PCI("pci"), 
/*    */ 
/* 56 */   PCI_X_1("pci_x_1"), 
/*    */ 
/* 58 */   PCI_X_16("pci_x_16"), 
/*    */ 
/* 60 */   PCI_X_4("pci_x_4"), 
/*    */ 
/* 62 */   PCI_X_8("pci_x_8"), 
/*    */ 
/* 64 */   PCMCIA("pcmcia"), 
/*    */ 
/* 66 */   USB_1_0("usb1.0"), 
/*    */ 
/* 68 */   USB_1_1("usb1.1"), 
/*    */ 
/* 70 */   USB_2_0("usb2.0"), 
/*    */ 
/* 72 */   USB_3_0("usb3.0");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private ConnectionTypeValues(String v) {
/* 77 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 81 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ConnectionTypeValues fromValue(String v) {
/* 85 */     for (ConnectionTypeValues c : values()) {
/* 86 */       if (c.value.equals(v)) {
/* 87 */         return c;
/*    */       }
/*    */     }
/* 90 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ConnectionTypeValues
 * JD-Core Version:    0.6.2
 */