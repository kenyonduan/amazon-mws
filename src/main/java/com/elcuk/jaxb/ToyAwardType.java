/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="ToyAwardType")
/*     */ @XmlEnum
/*     */ public enum ToyAwardType
/*     */ {
/*  57 */   AUSTRALIA_TOY_FAIR_BOYS_TOY_OF_THE_YEAR("australia_toy_fair_boys_toy_of_the_year"), 
/*     */ 
/*  59 */   AUSTRALIA_TOY_FAIR_TOY_OF_THE_YEAR("australia_toy_fair_toy_of_the_year"), 
/*     */ 
/*  61 */   BABY_AND_YOU("baby_and_you"), 
/*     */ 
/*  63 */   BABYWORLD("babyworld"), 
/*     */ 
/*  65 */   CHILD_MAGAZINE("child_magazine"), 
/*     */ 
/*  67 */   CREATIVE_CHILD_MAGAZINE("creative_child_magazine"), 
/*     */ 
/*  69 */   DR_TOYS_100_BEST_CHILD_PRODUCTS("dr_toys_100_best_child_products"), 
/*     */ 
/*  71 */   ENERGIZER_BATTERY_OPERATED_TOY_OF_THE_YR("energizer_battery_operated_toy_of_the_yr"), 
/*     */ 
/*  73 */   FAMILY_FUN_TOY_OF_THE_YEAR_SEAL("family_fun_toy_of_the_year_seal"), 
/*     */ 
/*  75 */   GAMES_MAGAZINE("games_magazine"), 
/*     */ 
/*  77 */   GOMAMA_TODAY("gomama_today"), 
/*     */ 
/*  79 */   GERMAN_TOY_ASSOCIATION_TOY_OF_THE_YEAR("german_toy_association_toy_of_the_year"), 
/*     */ 
/*  81 */   HAMLEYS_TOY_OF_THE_YEAR("hamleys_toy_of_the_year"), 
/*     */ 
/*  83 */   JUNIOR("junior"), 
/*     */ 
/*  85 */   LION_MARK("lion_mark"), 
/*     */ 
/*  87 */   MOTHER_AND_BABY("mother_and_baby"), 
/*     */ 
/*  89 */   MUM_KNOWS_BEST("mum_knows_best"), 
/*     */ 
/*  91 */   NATIONAL_PARENTING_APPROVAL_AWARD("national_parenting_approval_award"), 
/*     */ 
/*  93 */   NORWEGIAN_TOY_ASSOCIATION_TOY_OF_THE_YR("norwegian_toy_association_toy_of_the_yr"), 
/*     */ 
/*  95 */   OPPENHEIM_TOYS("oppenheim_toys"), 
/*     */ 
/*  97 */   PARENTS_CHOICE_PORTFOLIO("parents_choice_portfolio"), 
/*     */ 
/*  99 */   PARENTS_MAGAZINE("parents_magazine"), 
/*     */ 
/* 101 */   PRACTICAL_PARENTING("practical_parenting"), 
/*     */ 
/* 103 */   PRIMA_BABY("prima_baby"), 
/*     */ 
/* 105 */   REDDOT("reddot"), 
/*     */ 
/* 107 */   RDJ_FRANCE_BEST_ELECTRONIC_TOY_OF_THE_YR("rdj_france_best_electronic_toy_of_the_yr"), 
/*     */ 
/* 109 */   RDJ_FRANCE_BEST_TOY_OF_THE_YEAR("rdj_france_best_toy_of_the_year"), 
/*     */ 
/* 111 */   THE_TIMES("the_times"), 
/*     */ 
/* 113 */   TOY_WISHES("toy_wishes"), 
/*     */ 
/* 115 */   UK_NPD_REPORT_NUMBER_ONE_SELLING_TOY("uk_npd_report_number_one_selling_toy"), 
/*     */ 
/* 117 */   UNKNOWN("unknown");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private ToyAwardType(String v) {
/* 122 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/* 126 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static ToyAwardType fromValue(String v) {
/* 130 */     for (ToyAwardType c : values()) {
/* 131 */       if (c.value.equals(v)) {
/* 132 */         return c;
/*     */       }
/*     */     }
/* 135 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ToyAwardType
 * JD-Core Version:    0.6.2
 */