/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="MemoryCardTypeValues")
/*     */ @XmlEnum
/*     */ public enum MemoryCardTypeValues
/*     */ {
/*  62 */   COMPACTFLASH_TYPE_I("compactflash_type_i"), 
/*     */ 
/*  64 */   COMPACTFLASH_TYPE_II("compactflash_type_ii"), 
/*     */ 
/*  66 */   HS_MMC("hs_mmc"), 
/*     */ 
/*  68 */   MEMORY_STICK("memory_stick"), 
/*     */ 
/*  70 */   MEMORY_STICK_DUO("memory_stick_duo"), 
/*     */ 
/*  72 */   MEMORY_STICK_MICRO("memory_stick_micro"), 
/*     */ 
/*  74 */   MEMORY_STICK_PRO("memory_stick_pro"), 
/*     */ 
/*  76 */   MEMORY_STICK_PRO_DUO("memory_stick_pro_duo"), 
/*     */ 
/*  78 */   MEMORY_STICK_PRO_HG_DUO("memory_stick_pro_hg_duo"), 
/*     */ 
/*  80 */   MEMORY_STICK_SELECT("memory_stick_select"), 
/*     */ 
/*  82 */   MEMORY_STICK_XC("memory_stick_xc"), 
/*     */ 
/*  84 */   MEMORY_STICK_XC_HG_MICRO("memory_stick_xc_hg_micro"), 
/*     */ 
/*  86 */   MEMORY_STICK_XC_MICRO("memory_stick_xc_micro"), 
/*     */ 
/*  88 */   MI_CARD("MiCard"), 
/*     */ 
/*  90 */   MICROSD("microsd"), 
/*     */ 
/*  92 */   MICRO_SDHC("micro_sdhc"), 
/*     */ 
/*  94 */   MICRO_SDXC("micro_sdxc"), 
/*     */ 
/*  96 */   MINISD("minisd"), 
/*     */ 
/*  98 */   MINI_SDHC("mini_sdhc"), 
/*     */ 
/* 100 */   MINI_SDXC("mini_sdxc"), 
/*     */ 
/* 102 */   MMC_MICRO("mmc_micro"), 
/*     */ 
/* 104 */   MULTIMEDIA_CARD("multimedia_card"), 
/*     */ 
/* 106 */   MULTIMEDIA_CARD_MOBILE("multimedia_card_mobile"), 
/*     */ 
/* 108 */   MULTIMEDIA_CARD_PLUS("multimedia_card_plus"), 
/*     */ 
/* 110 */   RS_MMC("rs_mmc"), 
/*     */ 
/* 112 */   SDHC("sdhc"), 
/*     */ 
/* 114 */   SDIO("sdio"), 
/*     */ 
/* 116 */   SDXC("sdxc"), 
/*     */ 
/* 118 */   SECURE_DIGITAL("secure_digital"), 
/*     */ 
/* 120 */   SECURE_MMC("secure_mmc"), 
/*     */ 
/* 122 */   SMARTMEDIA_CARD("smartmedia_card"), 
/*     */ 
/* 124 */   TRANSFLASH("transflash"), 
/*     */ 
/* 126 */   XD_PICTURE_CARD("xd_picture_card"), 
/*     */ 
/* 128 */   XD_PICTURE_CARD_H("xd_picture_card_h"), 
/*     */ 
/* 130 */   XD_PICTURE_CARD_M("xd_picture_card_m"), 
/*     */ 
/* 132 */   XD_PICTURE_CARD_M_PLUS("xd_picture_card_m_plus");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private MemoryCardTypeValues(String v) {
/* 137 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/* 141 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static MemoryCardTypeValues fromValue(String v) {
/* 145 */     for (MemoryCardTypeValues c : values()) {
/* 146 */       if (c.value.equals(v)) {
/* 147 */         return c;
/*     */       }
/*     */     }
/* 150 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MemoryCardTypeValues
 * JD-Core Version:    0.6.2
 */