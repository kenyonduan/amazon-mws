/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlEnum;
/*    */ import javax.xml.bind.annotation.XmlEnumValue;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlType(name="PrintingMediaTypeValues")
/*    */ @XmlEnum
/*    */ public enum PrintingMediaTypeValues
/*    */ {
/* 38 */   BACK_PRINT_FILM("back_print_film"), 
/*    */ 
/* 40 */   BANNER_PAPER("banner_paper"), 
/*    */ 
/* 42 */   CARD_STOCK("card_stock"), 
/*    */ 
/* 44 */   ENVELOPES("envelopes"), 
/*    */ 
/* 46 */   FABRIC("fabric"), 
/*    */ 
/* 48 */   GLOSSY_FILM("glossy_film"), 
/*    */ 
/* 50 */   GLOSSY_PHOTO_PAPER("glossy_photo_paper"), 
/*    */ 
/* 52 */   HIGH_RESOLUTION_PAPER("high_resolution_paper"), 
/*    */ 
/* 54 */   LABELS("labels"), 
/*    */ 
/* 56 */   PAPER_PLAIN("paper_plain"), 
/*    */ 
/* 58 */   TRANSPARENCIES("transparencies"), 
/*    */ 
/* 60 */   UNKNOWN("unknown");
/*    */ 
/*    */   private final String value;
/*    */ 
/*    */   private PrintingMediaTypeValues(String v) {
/* 65 */     this.value = v;
/*    */   }
/*    */ 
/*    */   public String value() {
/* 69 */     return this.value;
/*    */   }
/*    */ 
/*    */   public static PrintingMediaTypeValues fromValue(String v) {
/* 73 */     for (PrintingMediaTypeValues c : values()) {
/* 74 */       if (c.value.equals(v)) {
/* 75 */         return c;
/*    */       }
/*    */     }
/* 78 */     throw new IllegalArgumentException(v);
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PrintingMediaTypeValues
 * JD-Core Version:    0.6.2
 */