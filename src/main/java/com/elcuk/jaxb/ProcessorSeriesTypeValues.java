/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="ProcessorSeriesTypeValues")
/*    */ @XmlEnum
/*    */ public enum ProcessorSeriesTypeValues
/*    */ {
/* 37 */   ATHLON_64("athlon_64"), 
/*    */ 
/* 39 */   ATHLON_64_X_2("athlon_64_x2"), 
/*    */ 
/* 41 */   INTEL_ATOM_230("intel_atom_230"), 
/*    */ 
/* 43 */   INTEL_ATOM_330("intel_atom_330"), 
/*    */ 
/* 45 */   INTEL_ATOM_N_450("intel_atom_n450"), 
/*    */ 
/* 47 */   INTEL_ATOM_N_455("intel_atom_n455"), 
/*    */ 
/* 49 */   INTEL_ATOM_Z_520("intel_atom_z520"), 
/*    */ 
/* 51 */   INTEL_ATOM_Z_530("intel_atom_z530"), 
/*    */ 
/* 53 */   INTEL_XEON("intel_xeon"), 
/*    */ 
/* 55 */   PENTIUM_4("pentium_4"), 
/*    */ 
/* 57 */   SEMPRON("sempron");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private ProcessorSeriesTypeValues(String v) {
/* 62 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 66 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static ProcessorSeriesTypeValues fromValue(String v) {
/* 70 */     for (ProcessorSeriesTypeValues c : values()) {
/* 71 */       if (c.value.equals(v)) {
/* 72 */         return c;
/*    */       }
/*    */     }
/* 75 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ProcessorSeriesTypeValues
 * JD-Core Version:    0.6.2
 */