/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlEnumValue;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="AllergenInformationType")
/*     */ @XmlEnum
/*     */ public enum AllergenInformationType
/*     */ {
/* 102 */   ABALONE("abalone"), 
/*     */ 
/* 104 */   ABALONE_FREE("abalone_free"), 
/*     */ 
/* 106 */   AMBERJACK("amberjack"), 
/*     */ 
/* 108 */   AMBERJACK_FREE("amberjack_free"), 
/*     */ 
/* 110 */   APPLE("apple"), 
/*     */ 
/* 112 */   APPLE_FREE("apple_free"), 
/*     */ 
/* 114 */   BANANA("banana"), 
/*     */ 
/* 116 */   BANANA_FREE("banana_free"), 
/*     */ 
/* 118 */   BARLEY("barley"), 
/*     */ 
/* 120 */   BARLEY_FREE("barley_free"), 
/*     */ 
/* 122 */   BEEF("beef"), 
/*     */ 
/* 124 */   BEEF_FREE("beef_free"), 
/*     */ 
/* 126 */   BUCKWHEAT("buckwheat"), 
/*     */ 
/* 128 */   BUCKWHEAT_FREE("buckwheat_free"), 
/*     */ 
/* 130 */   CELERY("celery"), 
/*     */ 
/* 132 */   CELERY_FREE("celery_free"), 
/*     */ 
/* 134 */   CHICKEN_MEAT("chicken_meat"), 
/*     */ 
/* 136 */   CHICKEN_MEAT_FREE("chicken_meat_free"), 
/*     */ 
/* 138 */   CODFISH("codfish"), 
/*     */ 
/* 140 */   CODFISH_FREE("codfish_free"), 
/*     */ 
/* 142 */   CRAB("crab"), 
/*     */ 
/* 144 */   CRAB_FREE("crab_free"), 
/*     */ 
/* 146 */   DAIRY("dairy"), 
/*     */ 
/* 148 */   DAIRY_FREE("dairy_free"), 
/*     */ 
/* 150 */   EGGS("eggs"), 
/*     */ 
/* 152 */   EGG_FREE("egg_free"), 
/*     */ 
/* 154 */   FISH("fish"), 
/*     */ 
/* 156 */   FISH_FREE("fish_free"), 
/*     */ 
/* 158 */   GELATIN("gelatin"), 
/*     */ 
/* 160 */   GELATIN_FREE("gelatin_free"), 
/*     */ 
/* 162 */   GLUTEN("gluten"), 
/*     */ 
/* 164 */   GLUTEN_FREE("gluten_free"), 
/*     */ 
/* 166 */   KIWI("kiwi"), 
/*     */ 
/* 168 */   KIWI_FREE("kiwi_free"), 
/*     */ 
/* 170 */   MACKEREL("mackerel"), 
/*     */ 
/* 172 */   MACKEREL_FREE("mackerel_free"), 
/*     */ 
/* 174 */   MELON("melon"), 
/*     */ 
/* 176 */   MELON_FREE("melon_free"), 
/*     */ 
/* 178 */   MUSHROOM("mushroom"), 
/*     */ 
/* 180 */   MUSHROOM_FREE("mushroom_free"), 
/*     */ 
/* 182 */   OCTOPUS("octopus"), 
/*     */ 
/* 184 */   OCTOPUS_FREE("octopus_free"), 
/*     */ 
/* 186 */   ORANGE("orange"), 
/*     */ 
/* 188 */   ORANGE_FREE("orange_free"), 
/*     */ 
/* 190 */   PEACH("peach"), 
/*     */ 
/* 192 */   PEACH_FREE("peach_free"), 
/*     */ 
/* 194 */   PEANUTS("peanuts"), 
/*     */ 
/* 196 */   PEANUT_FREE("peanut_free"), 
/*     */ 
/* 198 */   PORK("pork"), 
/*     */ 
/* 200 */   PORK_FREE("pork_free"), 
/*     */ 
/* 202 */   SALMON("salmon"), 
/*     */ 
/* 204 */   SALMON_FREE("salmon_free"), 
/*     */ 
/* 206 */   SALMON_ROE("salmon_roe"), 
/*     */ 
/* 208 */   SALMON_ROE_FREE("salmon_roe_free"), 
/*     */ 
/* 210 */   SCAD("scad"), 
/*     */ 
/* 212 */   SCAD_FREE("scad_free"), 
/*     */ 
/* 214 */   SCALLOP("scallop"), 
/*     */ 
/* 216 */   SCALLOP_FREE("scallop_free"), 
/*     */ 
/* 218 */   SESAME_SEEDS("sesame_seeds"), 
/*     */ 
/* 220 */   SESAME_SEEDS_FREE("sesame_seeds_free"), 
/*     */ 
/* 222 */   SHELLFISH("shellfish"), 
/*     */ 
/* 224 */   SHELLFISH_FREE("shellfish_free"), 
/*     */ 
/* 226 */   SHRIMP("shrimp"), 
/*     */ 
/* 228 */   SHRIMP_FREE("shrimp_free"), 
/*     */ 
/* 230 */   SOY("soy"), 
/*     */ 
/* 232 */   SOY_FREE("soy_free"), 
/*     */ 
/* 234 */   SQUID("squid"), 
/*     */ 
/* 236 */   SQUID_FREE("squid_free"), 
/*     */ 
/* 238 */   TREE_NUTS("tree_nuts"), 
/*     */ 
/* 240 */   TREE_NUT_FREE("tree_nut_free"), 
/*     */ 
/* 242 */   TUNA("tuna"), 
/*     */ 
/* 244 */   TUNA_FREE("tuna_free"), 
/*     */ 
/* 246 */   WALNUT("walnut"), 
/*     */ 
/* 248 */   WALNUT_FREE("walnut_free"), 
/*     */ 
/* 250 */   YAM("yam"), 
/*     */ 
/* 252 */   YAM_FREE("yam_free");
/*     */ 
/*     */   private final String value;
/*     */ 
/*     */   private AllergenInformationType(String v) {
/* 257 */     this.value = v;
/*     */   }
/*     */ 
/*     */   public String value() {
/* 261 */     return this.value;
/*     */   }
/*     */ 
/*     */   public static AllergenInformationType fromValue(String v) {
/* 265 */     for (AllergenInformationType c : values()) {
/* 266 */       if (c.value.equals(v)) {
/* 267 */         return c;
/*     */       }
/*     */     }
/* 270 */     throw new IllegalArgumentException(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AllergenInformationType
 * JD-Core Version:    0.6.2
 */