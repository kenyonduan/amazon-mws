/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="VolumeUnitOfMeasure")
/*     */ @XmlEnum
/*     */ public enum VolumeUnitOfMeasure
/*     */ {
/*  46 */   CUBIC_CM("cubic-cm"), 
/*     */ 
/*  48 */   CUBIC_FT("cubic-ft"), 
/*     */ 
/*  50 */   CUBIC_IN("cubic-in"), 
/*     */ 
/*  52 */   CUBIC_M("cubic-m"), 
/*     */ 
/*  54 */   CUBIC_YD("cubic-yd"), 
/*     */ 
/*  56 */   CUP("cup"), 
/*     */ 
/*  58 */   FLUID_OZ("fluid-oz"), 
/*     */ 
/*  60 */   GALLON("gallon"), 
/*     */ 
/*  62 */   LITER("liter"), 
/*     */ 
/*  64 */   MILLILITER("milliliter"), 
/*     */ 
/*  66 */   OUNCE("ounce"), 
/*     */ 
/*  68 */   PINT("pint"), 
/*     */ 
/*  70 */   QUART("quart"), 
/*     */ 
/*  72 */   LITERS("liters"), 
/*     */ 
/*  74 */   DECILITERS("deciliters"), 
/*     */ 
/*  76 */   CENTILITERS("centiliters"), 
/*     */ 
/*  78 */   MILLILITERS("milliliters"), 
/*     */ 
/*  80 */   MICROLITERS("microliters"), 
/*     */ 
/*  82 */   NANOLITERS("nanoliters"), 
/*     */ 
/*  84 */   PICOLITERS("picoliters");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private VolumeUnitOfMeasure(String v) {
/*  89 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/*  93 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static VolumeUnitOfMeasure fromValue(String v) {
/*  97 */     for (VolumeUnitOfMeasure c : values()) {
/*  98 */       if (c.value.equals(v)) {
/*  99 */         return c;
/*     */       }
/*     */     }
/* 102 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.VolumeUnitOfMeasure
 * JD-Core Version:    0.6.2
 */