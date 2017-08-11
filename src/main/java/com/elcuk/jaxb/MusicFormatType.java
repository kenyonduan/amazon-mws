/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="MusicFormatType")
/*     */ @XmlEnum
/*     */ public enum MusicFormatType
/*     */ {
/*  76 */   AUTHORIZED_BOOTLEG("authorized_bootleg"), 
/*     */ 
/*  78 */   BSIDES("bsides"), 
/*     */ 
/*  80 */   BEST_OF("best_of"), 
/*     */ 
/*  82 */   BOX_SET("box_set"), 
/*     */ 
/*  84 */   ORIGINAL_RECORDING("original_recording"), 
/*     */ 
/*  86 */   REISSUED("reissued"), 
/*     */ 
/*  88 */   REMASTERED("remastered"), 
/*     */ 
/*  90 */   SOUNDTRACK("soundtrack"), 
/*     */ 
/*  92 */   SPECIAL_EDITION("special_edition"), 
/*     */ 
/*  94 */   SPECIAL_LIMITED_EDITION("special_limited_edition"), 
/*     */ 
/*  96 */   CAST_RECORDING("cast_recording"), 
/*     */ 
/*  98 */   COMPILATION("compilation"), 
/*     */ 
/* 100 */   DELUXE_EDITION("deluxe_edition"), 
/*     */ 
/* 102 */   DIGITAL_SOUND("digital_sound"), 
/*     */ 
/* 104 */   DOUBLE_LP("double_lp"), 
/*     */ 
/* 106 */   EXPLICIT_LYRICS("explicit_lyrics"), 
/*     */ 
/* 108 */   HI_FIDELITY("hi-fidelity"), 
/*     */ 
/* 110 */   IMPORT("import"), 
/*     */ 
/* 112 */   LIMITED_COLLECTORS_EDITION("limited_collectors_edition"), 
/*     */ 
/* 114 */   LIMITED_EDITION("limited_edition"), 
/*     */ 
/* 116 */   REMIXES("remixes"), 
/*     */ 
/* 118 */   LIVE("live"), 
/*     */ 
/* 120 */   EXTRA_TRACKS("extra_tracks"), 
/*     */ 
/* 122 */   CUTOUT("cutout"), 
/*     */ 
/* 124 */   CD_AND_DVD("cd_and_dvd"), 
/*     */ 
/* 126 */   DUAL_DISC("dual_disc"), 
/*     */ 
/* 128 */   HYBRID_SACD("hybrid_sacd"), 
/*     */ 
/* 130 */   CD_SINGLE("cd-single"), 
/*     */ 
/* 132 */   MAXI_SINGLE("maxi_single"), 
/*     */ 
/* 134 */   SACD("sacd"), 
/*     */ 
/* 136 */   MINIDISC("minidisc"), 
/*     */ 
/* 138 */   UK_IMPORT("uk_import"), 
/*     */ 
/* 140 */   US_IMPORT("us_import"), 
/*     */ 
/* 142 */   JP_IMPORT("jp_import"), 
/*     */ 
/* 144 */   ENHANCED("enhanced"), 
/*     */ 
/* 146 */   CLEAN("clean"), 
/*     */ 
/* 148 */   COPY_PROTECTED_CD("copy_protected_cd"), 
/*     */ 
/* 150 */   DOUBLE_CD("double_cd"), 
/*     */ 
/* 152 */   KARAOKE("karaoke"), 
/*     */ 
/* 154 */   MP_3_AUDIO("mp3_audio"), 
/*     */ 
/* 156 */   RINGLE("ringle"), 
/*     */ 
/* 158 */   SHM_CD("shm_cd");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private MusicFormatType(String v) {
/* 163 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/* 167 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static MusicFormatType fromValue(String v) {
/* 171 */     for (MusicFormatType c : values()) {
/* 172 */       if (c.value.equals(v)) {
/* 173 */         return c;
/*     */       }
/*     */     }
/* 176 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MusicFormatType
 * JD-Core Version:    0.6.2
 */