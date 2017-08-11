/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="PowerPlugType")
/*    */ @XmlEnum
/*    */ public enum PowerPlugType
/*    */ {
/* 43 */   TYPE_A_2_PIN_JP("type_a_2pin_jp"), 
/*    */ 
/* 45 */   TYPE_E_2_PIN_FR("type_e_2pin_fr"), 
/*    */ 
/* 47 */   TYPE_J_3_PIN_CH("type_j_3pin_ch"), 
/*    */ 
/* 49 */   TYPE_A_2_PIN_NA("type_a_2pin_na"), 
/*    */ 
/* 51 */   TYPE_EF_2_PIN_EU("type_ef_2pin_eu"), 
/*    */ 
/* 53 */   TYPE_K_3_PIN_DK("type_k_3pin_dk"), 
/*    */ 
/* 55 */   TYPE_B_3_PIN_JP("type_b_3pin_jp"), 
/*    */ 
/* 57 */   TYPE_F_2_PIN_DE("type_f_2pin_de"), 
/*    */ 
/* 59 */   TYPE_L_3_PIN_IT("type_l_3pin_it"), 
/*    */ 
/* 61 */   TYPE_B_3_PIN_NA("type_b_3pin_na"), 
/*    */ 
/* 63 */   TYPE_G_3_PIN_UK("type_g_3pin_uk"), 
/*    */ 
/* 65 */   TYPE_M_3_PIN_ZA("type_m_3pin_za"), 
/*    */ 
/* 67 */   TYPE_C_2_PIN_EU("type_c_2pin_eu"), 
/*    */ 
/* 69 */   TYPE_H_3_PIN_IL("type_h_3pin_il"), 
/*    */ 
/* 71 */   TYPE_N_3_PIN_BR("type_n_3pin_br"), 
/*    */ 
/* 73 */   TYPE_D_3_PIN_IN("type_d_3pin_in"), 
/*    */ 
/* 75 */   TYPE_I_3_PIN_AU("type_i_3pin_au");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private PowerPlugType(String v) {
/* 80 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 84 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static PowerPlugType fromValue(String v) {
/* 88 */     for (PowerPlugType c : values()) {
/* 89 */       if (c.value.equals(v)) {
/* 90 */         return c;
/*    */       }
/*    */     }
/* 93 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PowerPlugType
 * JD-Core Version:    0.6.2
 */