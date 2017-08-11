/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="InputVideoConnectorsTypeValues")
/*    */ @XmlEnum
/*    */ public enum InputVideoConnectorsTypeValues
/*    */ {
/* 36 */   COMPONENT_VIDEO("component_video"), 
/*    */ 
/* 38 */   COMPOSITE_VIDEO("composite_video"), 
/*    */ 
/* 40 */   DVI_X_1("dvi_x_1"), 
/*    */ 
/* 42 */   DVI_X_2("dvi_x_2"), 
/*    */ 
/* 44 */   DVI_X_4("dvi_x_4"), 
/*    */ 
/* 46 */   D_SUB("d_sub"), 
/*    */ 
/* 48 */   HDMI("hdmi"), 
/*    */ 
/* 50 */   MINI_HDMI("mini_hdmi"), 
/*    */ 
/* 52 */   S_VIDEO("s_video"), 
/*    */ 
/* 54 */   VGA("vga");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private InputVideoConnectorsTypeValues(String v) {
/* 59 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 63 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static InputVideoConnectorsTypeValues fromValue(String v) {
/* 67 */     for (InputVideoConnectorsTypeValues c : values()) {
/* 68 */       if (c.value.equals(v)) {
/* 69 */         return c;
/*    */       }
/*    */     }
/* 72 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.InputVideoConnectorsTypeValues
 * JD-Core Version:    0.6.2
 */