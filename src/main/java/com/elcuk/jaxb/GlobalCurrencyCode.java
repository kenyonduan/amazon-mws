/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlEnum;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlType(name="GlobalCurrencyCode")
/*     */ @XmlEnum
/*     */ public enum GlobalCurrencyCode
/*     */ {
/* 113 */   AED, 
/* 114 */   ALL, 
/* 115 */   ARS, 
/* 116 */   ATS, 
/* 117 */   AUD, 
/* 118 */   BAM, 
/* 119 */   BEF, 
/* 120 */   BGN, 
/* 121 */   BHD, 
/* 122 */   BOB, 
/* 123 */   BRL, 
/* 124 */   BYR, 
/* 125 */   CAD, 
/* 126 */   CHF, 
/* 127 */   CLP, 
/* 128 */   CNY, 
/* 129 */   COP, 
/* 130 */   CRC, 
/* 131 */   CSD, 
/* 132 */   CZK, 
/* 133 */   DEM, 
/* 134 */   DKK, 
/* 135 */   DOP, 
/* 136 */   DZD, 
/* 137 */   EEK, 
/* 138 */   EGP, 
/* 139 */   ESP, 
/* 140 */   EUR, 
/* 141 */   FIM, 
/* 142 */   FRF, 
/* 143 */   GBP, 
/* 144 */   GRD, 
/* 145 */   GTQ, 
/* 146 */   HKD, 
/* 147 */   HNL, 
/* 148 */   HRK, 
/* 149 */   HUF, 
/* 150 */   IDR, 
/* 151 */   ILS, 
/* 152 */   INR, 
/* 153 */   IQD, 
/* 154 */   ISK, 
/* 155 */   ITL, 
/* 156 */   JOD, 
/* 157 */   JPY, 
/* 158 */   KRW, 
/* 159 */   KWD, 
/* 160 */   LBP, 
/* 161 */   LTL, 
/* 162 */   LUF, 
/* 163 */   LVL, 
/* 164 */   LYD, 
/* 165 */   MAD, 
/* 166 */   MKD, 
/* 167 */   MXN, 
/* 168 */   MYR, 
/* 169 */   NIO, 
/* 170 */   NOK, 
/* 171 */   NZD, 
/* 172 */   OMR, 
/* 173 */   PAB, 
/* 174 */   PEN, 
/* 175 */   PHP, 
/* 176 */   PLN, 
/* 177 */   PTE, 
/* 178 */   PYG, 
/* 179 */   QAR, 
/* 180 */   RON, 
/* 181 */   RSD, 
/* 182 */   RUB, 
/* 183 */   SAR, 
/* 184 */   SDG, 
/* 185 */   SEK, 
/* 186 */   SGD, 
/* 187 */   SKK, 
/* 188 */   SVC, 
/* 189 */   SYP, 
/* 190 */   THB, 
/* 191 */   TND, 
/* 192 */   TRY, 
/* 193 */   TWD, 
/* 194 */   UAH, 
/* 195 */   USD, 
/* 196 */   UYU, 
/* 197 */   VEF, 
/* 198 */   VND, 
/* 199 */   YER, 
/* 200 */   ZAR;
/*     */ 
/*     */   public String value() {
/* 203 */     return name();
/*     */   }
/*     */ 
/*     */   public static GlobalCurrencyCode fromValue(String v) {
/* 207 */     return valueOf(v);
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.GlobalCurrencyCode
 * JD-Core Version:    0.6.2
 */