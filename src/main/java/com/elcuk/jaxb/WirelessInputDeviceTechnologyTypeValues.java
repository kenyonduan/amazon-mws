/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="WirelessInputDeviceTechnologyTypeValues")
/*    */ @XmlEnum
/*    */ public enum WirelessInputDeviceTechnologyTypeValues
/*    */ {
/* 31 */   BLUETOOTH("bluetooth"), 
/*    */ 
/* 33 */   INFRARED("infrared"), 
/*    */ 
/* 35 */   PS_2("ps/2"), 
/*    */ 
/* 37 */   RADIO_FREQUENCY("radio_frequency"), 
/*    */ 
/* 39 */   USB("usb");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private WirelessInputDeviceTechnologyTypeValues(String v) {
/* 44 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 48 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static WirelessInputDeviceTechnologyTypeValues fromValue(String v) {
/* 52 */     for (WirelessInputDeviceTechnologyTypeValues c : values()) {
/* 53 */       if (c.value.equals(v)) {
/* 54 */         return c;
/*    */       }
/*    */     }
/* 57 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WirelessInputDeviceTechnologyTypeValues
 * JD-Core Version:    0.6.2
 */