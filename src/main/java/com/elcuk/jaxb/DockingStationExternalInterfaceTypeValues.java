/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="DockingStationExternalInterfaceTypeValues")
/*    */ @XmlEnum
/*    */ public enum DockingStationExternalInterfaceTypeValues
/*    */ {
/* 35 */   FIREWIRE_1600("firewire_1600"), 
/*    */ 
/* 37 */   FIREWIRE_3200("firewire_3200"), 
/*    */ 
/* 39 */   FIREWIRE_400("firewire_400"), 
/*    */ 
/* 41 */   FIREWIRE_800("firewire_800"), 
/*    */ 
/* 43 */   FIREWIRE_ESATA("firewire_esata"), 
/*    */ 
/* 45 */   USB_1_0("usb1.0"), 
/*    */ 
/* 47 */   USB_1_1("usb1.1"), 
/*    */ 
/* 49 */   USB_2_0("usb2.0"), 
/*    */ 
/* 51 */   USB_3_0("usb3.0");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private DockingStationExternalInterfaceTypeValues(String v) {
/* 56 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 60 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static DockingStationExternalInterfaceTypeValues fromValue(String v) {
/* 64 */     for (DockingStationExternalInterfaceTypeValues c : values()) {
/* 65 */       if (c.value.equals(v)) {
/* 66 */         return c;
/*    */       }
/*    */     }
/* 69 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DockingStationExternalInterfaceTypeValues
 * JD-Core Version:    0.6.2
 */