/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="VolumeRateUnitOfMeasure")
/*    */ @XmlEnum
/*    */ public enum VolumeRateUnitOfMeasure
/*    */ {
/* 40 */   MILLILITERS_PER_SECOND("milliliters per second"), 
/*    */ 
/* 42 */   CENTILITERS_PER_SECOND("centiliters per second"), 
/*    */ 
/* 44 */   LITERS_PER_SECOND("liters per second"), 
/*    */ 
/* 46 */   MILLILITERS_PER_MINUTE("milliliters per minute"), 
/*    */ 
/* 48 */   LITERS_PER_MINUTE("liters per minute"), 
/*    */ 
/* 50 */   MICROLITERS_PER_SECOND("microliters per second"), 
/*    */ 
/* 52 */   NANOLITERS_PER_SECOND("nanoliters per second"), 
/*    */ 
/* 54 */   PICOLITERS_PER_SECOND("picoliters per second"), 
/*    */ 
/* 56 */   MICROLITERS_PER_MINUTE("microliters per minute"), 
/*    */ 
/* 58 */   NANOLITERS_PER_MINUTE("nanoliters per minute"), 
/*    */ 
/* 60 */   PICOLITERS_PER_MINUTE("picoliters per minute"), 
/*    */ 
/* 62 */   GALLONS_PER_DAY("gallons_per_day"), 
/*    */ 
/* 64 */   LITERS_PER_DAY("liters_per_day"), 
/*    */ 
/* 66 */   LITERS("liters");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private VolumeRateUnitOfMeasure(String v) {
/* 71 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 75 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static VolumeRateUnitOfMeasure fromValue(String v) {
/* 79 */     for (VolumeRateUnitOfMeasure c : values()) {
/* 80 */       if (c.value.equals(v)) {
/* 81 */         return c;
/*    */       }
/*    */     }
/* 84 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.VolumeRateUnitOfMeasure
 * JD-Core Version:    0.6.2
 */