/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="ComputerPlatformValues")
/*     */ @XmlEnum
/*     */ public enum ComputerPlatformValues
/*     */ {
/*  51 */   GAME_BOY_ADVANCE("game_boy_advance"), 
/*     */ 
/*  53 */   GAMEBOY("gameboy"), 
/*     */ 
/*  55 */   GAMEBOY_COLOR("gameboy_color"), 
/*     */ 
/*  57 */   GAMECUBE("gamecube"), 
/*     */ 
/*  59 */   GIZMONDO("gizmondo"), 
/*     */ 
/*  61 */   LINUX("linux"), 
/*     */ 
/*  63 */   MACINTOSH("macintosh"), 
/*     */ 
/*  65 */   N_GAGE("n_gage"), 
/*     */ 
/*  67 */   NINTENDO_DS("nintendo_ds"), 
/*     */ 
/*  69 */   NINTENDO_NES("nintendo_NES"), 
/*     */ 
/*  71 */   NINTENDO_SUPER_NES("nintendo_super_NES"), 
/*     */ 
/*  73 */   NINTENDO_WII("nintendo_wii"), 
/*     */ 
/*  75 */   NINTENDO_64("nintendo64"), 
/*     */ 
/*  77 */   PALM("palm"), 
/*     */ 
/*  79 */   PLAYSTATION("playstation"), 
/*     */ 
/*  81 */   PLAYSTATION_2("playstation_2"), 
/*     */ 
/*  83 */   PLAYSTATION_VITA("playstation_vita"), 
/*     */ 
/*  85 */   POCKET_PC("pocket_pc"), 
/*     */ 
/*  87 */   POWERMAC("powermac"), 
/*     */ 
/*  89 */   SEGA_SATURN("sega_saturn"), 
/*     */ 
/*  91 */   SONY_PSP("sony_psp"), 
/*     */ 
/*  93 */   SUPER_NINTENDO("super_nintendo"), 
/*     */ 
/*  95 */   UNIX("unix"), 
/*     */ 
/*  97 */   WINDOWS("windows"), 
/*     */ 
/*  99 */   XBOX("xbox");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private ComputerPlatformValues(String v) {
/* 104 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/* 108 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static ComputerPlatformValues fromValue(String v) {
/* 112 */     for (ComputerPlatformValues c : values()) {
/* 113 */       if (c.value.equals(v)) {
/* 114 */         return c;
/*     */       }
/*     */     }
/* 117 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerPlatformValues
 * JD-Core Version:    0.6.2
 */