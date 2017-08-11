/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"consoleVideoGamesGenre", "esrbRating", "bbfcRating", "pegiRating", "uskRating", "hardwarePlatform", "bundles", "esrbDescriptors", "pegiDetails", "maxNumberOfPlayers", "numberOfLicenses"})
/*     */ @XmlRootElement(name="VideoGames")
/*     */ public class VideoGames
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ConsoleVideoGamesGenre", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> consoleVideoGamesGenre;
/*     */ 
/*     */   @XmlElement(name="ESRBRating")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String esrbRating;
/*     */ 
/*     */   @XmlElement(name="BBFCRating")
/*     */   protected BBFCRatingType bbfcRating;
/*     */ 
/*     */   @XmlElement(name="PEGIRating")
/*     */   protected PEGIRatingType pegiRating;
/*     */ 
/*     */   @XmlElement(name="USKRating")
/*     */   protected USKRatingType uskRating;
/*     */ 
/*     */   @XmlElement(name="HardwarePlatform", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> hardwarePlatform;
/*     */ 
/*     */   @XmlElement(name="Bundles")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String bundles;
/*     */ 
/*     */   @XmlElement(name="ESRBDescriptors")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> esrbDescriptors;
/*     */ 
/*     */   @XmlElement(name="PEGIDetails")
/*     */   protected PEGIDetailsType pegiDetails;
/*     */ 
/*     */   @XmlElement(name="MaxNumberOfPlayers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger maxNumberOfPlayers;
/*     */ 
/*     */   @XmlElement(name="NumberOfLicenses")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLicenses;
/*     */ 
/*     */   public List<String> getConsoleVideoGamesGenre()
/*     */   {
/* 118 */     if (this.consoleVideoGamesGenre == null) {
/* 119 */       this.consoleVideoGamesGenre = new ArrayList();
/*     */     }
/* 121 */     return this.consoleVideoGamesGenre;
/*     */   }
/*     */ 
/*     */   public String getESRBRating()
/*     */   {
/* 133 */     return this.esrbRating;
/*     */   }
/*     */ 
/*     */   public void setESRBRating(String value)
/*     */   {
/* 145 */     this.esrbRating = value;
/*     */   }
/*     */ 
/*     */   public BBFCRatingType getBBFCRating()
/*     */   {
/* 157 */     return this.bbfcRating;
/*     */   }
/*     */ 
/*     */   public void setBBFCRating(BBFCRatingType value)
/*     */   {
/* 169 */     this.bbfcRating = value;
/*     */   }
/*     */ 
/*     */   public PEGIRatingType getPEGIRating()
/*     */   {
/* 181 */     return this.pegiRating;
/*     */   }
/*     */ 
/*     */   public void setPEGIRating(PEGIRatingType value)
/*     */   {
/* 193 */     this.pegiRating = value;
/*     */   }
/*     */ 
/*     */   public USKRatingType getUSKRating()
/*     */   {
/* 205 */     return this.uskRating;
/*     */   }
/*     */ 
/*     */   public void setUSKRating(USKRatingType value)
/*     */   {
/* 217 */     this.uskRating = value;
/*     */   }
/*     */ 
/*     */   public List<String> getHardwarePlatform()
/*     */   {
/* 243 */     if (this.hardwarePlatform == null) {
/* 244 */       this.hardwarePlatform = new ArrayList();
/*     */     }
/* 246 */     return this.hardwarePlatform;
/*     */   }
/*     */ 
/*     */   public String getBundles()
/*     */   {
/* 258 */     return this.bundles;
/*     */   }
/*     */ 
/*     */   public void setBundles(String value)
/*     */   {
/* 270 */     this.bundles = value;
/*     */   }
/*     */ 
/*     */   public List<String> getESRBDescriptors()
/*     */   {
/* 296 */     if (this.esrbDescriptors == null) {
/* 297 */       this.esrbDescriptors = new ArrayList();
/*     */     }
/* 299 */     return this.esrbDescriptors;
/*     */   }
/*     */ 
/*     */   public PEGIDetailsType getPEGIDetails()
/*     */   {
/* 311 */     return this.pegiDetails;
/*     */   }
/*     */ 
/*     */   public void setPEGIDetails(PEGIDetailsType value)
/*     */   {
/* 323 */     this.pegiDetails = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxNumberOfPlayers()
/*     */   {
/* 335 */     return this.maxNumberOfPlayers;
/*     */   }
/*     */ 
/*     */   public void setMaxNumberOfPlayers(BigInteger value)
/*     */   {
/* 347 */     this.maxNumberOfPlayers = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLicenses()
/*     */   {
/* 359 */     return this.numberOfLicenses;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLicenses(BigInteger value)
/*     */   {
/* 371 */     this.numberOfLicenses = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.VideoGames
 * JD-Core Version:    0.6.2
 */