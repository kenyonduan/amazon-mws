/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ModemTypeValues")
/*    */ @XmlEnum
/*    */ public enum ModemTypeValues
/*    */ {
/* 41 */   ANALOG_MODEM("analog_modem"), 
/*    */ 
/* 43 */   DATA_FAX_VOICE("data_fax_voice"), 
/*    */ 
/* 45 */   ISDN_MODEM("isdn_modem"), 
/*    */ 
/* 47 */   CABLE("cable"), 
/*    */ 
/* 49 */   DATA_MODEM("data_modem"), 
/*    */ 
/* 51 */   NETWORK_MODEM("network_modem"), 
/*    */ 
/* 53 */   CELLULAR("cellular"), 
/*    */ 
/* 55 */   DIGITAL("digital"), 
/*    */ 
/* 57 */   UNKNOWN_MODEM_TYPE("unknown_modem_type"), 
/*    */ 
/* 59 */   CSU("csu"), 
/*    */ 
/* 61 */   DSL("dsl"), 
/*    */ 
/* 63 */   VOICE("voice"), 
/*    */ 
/* 65 */   DATA_FAX("data_fax"), 
/*    */ 
/* 67 */   DSU("dsu"), 
/*    */ 
/* 69 */   WINMODEM("winmodem");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private ModemTypeValues(String v) {
/* 74 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 78 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ModemTypeValues fromValue(String v) {
/* 82 */     for (ModemTypeValues c : values()) {
/* 83 */       if (c.value.equals(v)) {
/* 84 */         return c;
/*    */       }
/*    */     }
/* 87 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ModemTypeValues
 * JD-Core Version:    0.6.2
 */