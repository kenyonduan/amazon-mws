/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="AdditionalDrivesTypeValues")
/*     */ @XmlEnum
/*     */ public enum AdditionalDrivesTypeValues
/*     */ {
/*  49 */   BLU_RAY("blu_ray"), 
/*     */ 
/*  51 */   BLU_RAY_RE("blu_ray_re"), 
/*     */ 
/*  53 */   BLU_RAY_ROM("blu_ray_rom"), 
/*     */ 
/*  55 */   BLU_RAY_RW("blu_ray_rw"), 
/*     */ 
/*  57 */   CD_ROM("cd_rom"), 
/*     */ 
/*  59 */   CD_RW("cd_rw"), 
/*     */ 
/*  61 */   DVD("dvd"), 
/*     */ 
/*  63 */   DVD_CD_RW("dvd_cd_rw"), 
/*     */ 
/*  65 */   DVD_MINUS_RW("dvd_minus_rw"), 
/*     */ 
/*  67 */   DVD_PLUS_MINUS_RW("dvd_plus_minus_rw"), 
/*     */ 
/*  69 */   DVD_PLUS_R("dvd_plus_r"), 
/*     */ 
/*  71 */   DVD_PLUS_RW("dvd_plus_rw"), 
/*     */ 
/*  73 */   DVD_R("dvd_r"), 
/*     */ 
/*  75 */   DVD_RAM("dvd_ram"), 
/*     */ 
/*  77 */   DVD_ROM("dvd_rom"), 
/*     */ 
/*  79 */   DVD_RW("dvd_rw"), 
/*     */ 
/*  81 */   FLOPPY("floppy"), 
/*     */ 
/*  83 */   IDE_TAPE_DRIVE("ide_tape_drive"), 
/*     */ 
/*  85 */   JAZZ("jazz"), 
/*     */ 
/*  87 */   SCSI_CDROM("scsi_cdrom"), 
/*     */ 
/*  89 */   SCSI_TAPE_DRIVE("scsi_tape_drive"), 
/*     */ 
/*  91 */   THUMB_DRIVE("thumb_drive"), 
/*     */ 
/*  93 */   ZIP("zip");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private AdditionalDrivesTypeValues(String v) {
/*  98 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/* 102 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static AdditionalDrivesTypeValues fromValue(String v) {
/* 106 */     for (AdditionalDrivesTypeValues c : values()) {
/* 107 */       if (c.value.equals(v)) {
/* 108 */         return c;
/*     */       }
/*     */     }
/* 111 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AdditionalDrivesTypeValues
 * JD-Core Version:    0.6.2
 */