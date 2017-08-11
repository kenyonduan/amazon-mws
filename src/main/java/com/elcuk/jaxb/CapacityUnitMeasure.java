/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="CapacityUnitMeasure")
/*     */ @XmlEnum
/*     */ public enum CapacityUnitMeasure
/*     */ {
/*  50 */   CUBIC_CENTIMETERS("cubic_centimeters"), 
/*     */ 
/*  52 */   CUBIC_FEET("cubic_feet"), 
/*     */ 
/*  54 */   CUBIC_INCHES("cubic_inches"), 
/*     */ 
/*  56 */   CUBIC_METERS("cubic_meters"), 
/*     */ 
/*  58 */   CUBIC_YARDS("cubic_yards"), 
/*     */ 
/*  60 */   CUPS("cups"), 
/*     */ 
/*  62 */   FLUID_OUNCES("fluid_ounces"), 
/*     */ 
/*  64 */   GALLONS("gallons"), 
/*     */ 
/*  66 */   IMPERIAL_GALLONS("imperial_gallons"), 
/*     */ 
/*  68 */   LITERS("liters"), 
/*     */ 
/*  70 */   MILLILITERS("milliliters"), 
/*     */ 
/*  72 */   OUNCES("ounces"), 
/*     */ 
/*  74 */   PINTS("pints"), 
/*     */ 
/*  76 */   QUARTS("quarts"), 
/*     */ 
/*  78 */   DECILITERS("deciliters"), 
/*     */ 
/*  80 */   CENTILITERS("centiliters"), 
/*     */ 
/*  82 */   MICROLITERS("microliters"), 
/*     */ 
/*  84 */   NANOLITERS("nanoliters"), 
/*     */ 
/*  86 */   PICOLITERS("picoliters"), 
/*     */ 
/*  88 */   GRAMS("grams"), 
/*     */ 
/*  90 */   KILOGRAMS("kilograms"), 
/*     */ 
/*  92 */   POUNDS("pounds"), 
/*     */ 
/*  94 */   MILLIGRAMS("milligrams");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private CapacityUnitMeasure(String v) {
/*  99 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/* 103 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static CapacityUnitMeasure fromValue(String v) {
/* 107 */     for (CapacityUnitMeasure c : values()) {
/* 108 */       if (c.value.equals(v)) {
/* 109 */         return c;
/*     */       }
/*     */     }
/* 112 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CapacityUnitMeasure
 * JD-Core Version:    0.6.2
 */