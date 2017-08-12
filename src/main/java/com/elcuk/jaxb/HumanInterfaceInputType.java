/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="HumanInterfaceInputType")
/*    */ @XmlEnum
/*    */ public enum HumanInterfaceInputType
/*    */ {
/* 37 */   BUTTONS("buttons"), 
/*    */ 
/* 39 */   DIAL("dial"), 
/*    */ 
/* 41 */   HANDWRITING_RECOGNITION("handwriting_recognition"), 
/*    */ 
/* 43 */   KEYBOARD("keyboard"), 
/*    */ 
/* 45 */   KEYPAD("keypad"), 
/*    */ 
/* 47 */   KEYPAD_STROKE("keypad_stroke"), 
/*    */ 
/* 49 */   MICROPHONE("microphone"), 
/*    */ 
/* 51 */   TOUCH_SCREEN("touch_screen"), 
/*    */ 
/* 53 */   TOUCH_SCREEN_STYLUS_PEN("touch_screen_stylus_pen"), 
/*    */ 
/* 55 */   TRACKPOINT_POINTING_DEVICE("trackpoint_pointing_device");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private HumanInterfaceInputType(String v) {
/* 60 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 64 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static HumanInterfaceInputType fromValue(String v) {
/* 68 */     for (HumanInterfaceInputType c : values()) {
/* 69 */       if (c.value.equals(v)) {
/* 70 */         return c;
/*    */       }
/*    */     }
/* 73 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HumanInterfaceInputType
 * JD-Core Version:    0.6.2
 */