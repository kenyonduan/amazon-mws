/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="MonitorConnectorsTypeValues")
/*    */ @XmlEnum
/*    */ public enum MonitorConnectorsTypeValues
/*    */ {
/* 37 */   AUDIO_VIDEO_PORT("audio_video_port"), 
/*    */ 
/* 39 */   DMI("dmi"), 
/*    */ 
/* 41 */   ETHERNET("ethernet"), 
/*    */ 
/* 43 */   GAMEPORT("gameport"), 
/*    */ 
/* 45 */   HDMI("hdmi"), 
/*    */ 
/* 47 */   IEEE_1394("ieee_1394"), 
/*    */ 
/* 49 */   PS_2("ps/2"), 
/*    */ 
/* 51 */   SERIAL_INTERFACE("serial_interface"), 
/*    */ 
/* 53 */   USB_2_0("usb2.0"), 
/*    */ 
/* 55 */   USB_3_0("usb3.0"), 
/*    */ 
/* 57 */   VGA("vga");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private MonitorConnectorsTypeValues(String v) {
/* 62 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 66 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static MonitorConnectorsTypeValues fromValue(String v) {
/* 70 */     for (MonitorConnectorsTypeValues c : values()) {
/* 71 */       if (c.value.equals(v)) {
/* 72 */         return c;
/*    */       }
/*    */     }
/* 75 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MonitorConnectorsTypeValues
 * JD-Core Version:    0.6.2
 */