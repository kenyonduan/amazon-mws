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
/*     */ @XmlType(name="", propOrder={"softwareVideoGamesGenre", "esrbRating", "bbfcRating", "pegiRating", "uskRating", "mediaFormat", "operatingSystem", "bundles", "esrbDescriptors", "hardwarePlatform", "pegiDetails", "mfgSuggestedAgeMin", "mfgSuggestedAgeMax", "maxNumberOfPlayers", "softwarePlatform", "onlinePlay"})
/*     */ @XmlRootElement(name="SoftwareGames")
/*     */ public class SoftwareGames
/*     */ {
/*     */ 
/*     */   @XmlElement(name="SoftwareVideoGamesGenre", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> softwareVideoGamesGenre;
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
/*     */   @XmlElement(name="MediaFormat", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> mediaFormat;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="Bundles")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String bundles;
/*     */ 
/*     */   @XmlElement(name="ESRBDescriptors")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> esrbDescriptors;
/*     */ 
/*     */   @XmlElement(name="HardwarePlatform")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> hardwarePlatform;
/*     */ 
/*     */   @XmlElement(name="PEGIDetails")
/*     */   protected PEGIDetailsType pegiDetails;
/*     */ 
/*     */   @XmlElement(name="MFGSuggestedAgeMin")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger mfgSuggestedAgeMin;
/*     */ 
/*     */   @XmlElement(name="MFGSuggestedAgeMax")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger mfgSuggestedAgeMax;
/*     */ 
/*     */   @XmlElement(name="MaxNumberOfPlayers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger maxNumberOfPlayers;
/*     */ 
/*     */   @XmlElement(name="SoftwarePlatform")
/*     */   protected List<SoftwarePlatform> softwarePlatform;
/*     */ 
/*     */   @XmlElement(name="OnlinePlay")
/*     */   protected Boolean onlinePlay;
/*     */ 
/*     */   public List<String> getSoftwareVideoGamesGenre()
/*     */   {
/* 141 */     if (this.softwareVideoGamesGenre == null) {
/* 142 */       this.softwareVideoGamesGenre = new ArrayList();
/*     */     }
/* 144 */     return this.softwareVideoGamesGenre;
/*     */   }
/*     */ 
/*     */   public String getESRBRating()
/*     */   {
/* 156 */     return this.esrbRating;
/*     */   }
/*     */ 
/*     */   public void setESRBRating(String value)
/*     */   {
/* 168 */     this.esrbRating = value;
/*     */   }
/*     */ 
/*     */   public BBFCRatingType getBBFCRating()
/*     */   {
/* 180 */     return this.bbfcRating;
/*     */   }
/*     */ 
/*     */   public void setBBFCRating(BBFCRatingType value)
/*     */   {
/* 192 */     this.bbfcRating = value;
/*     */   }
/*     */ 
/*     */   public PEGIRatingType getPEGIRating()
/*     */   {
/* 204 */     return this.pegiRating;
/*     */   }
/*     */ 
/*     */   public void setPEGIRating(PEGIRatingType value)
/*     */   {
/* 216 */     this.pegiRating = value;
/*     */   }
/*     */ 
/*     */   public USKRatingType getUSKRating()
/*     */   {
/* 228 */     return this.uskRating;
/*     */   }
/*     */ 
/*     */   public void setUSKRating(USKRatingType value)
/*     */   {
/* 240 */     this.uskRating = value;
/*     */   }
/*     */ 
/*     */   public List<String> getMediaFormat()
/*     */   {
/* 266 */     if (this.mediaFormat == null) {
/* 267 */       this.mediaFormat = new ArrayList();
/*     */     }
/* 269 */     return this.mediaFormat;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 295 */     if (this.operatingSystem == null) {
/* 296 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 298 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getBundles()
/*     */   {
/* 310 */     return this.bundles;
/*     */   }
/*     */ 
/*     */   public void setBundles(String value)
/*     */   {
/* 322 */     this.bundles = value;
/*     */   }
/*     */ 
/*     */   public List<String> getESRBDescriptors()
/*     */   {
/* 348 */     if (this.esrbDescriptors == null) {
/* 349 */       this.esrbDescriptors = new ArrayList();
/*     */     }
/* 351 */     return this.esrbDescriptors;
/*     */   }
/*     */ 
/*     */   public List<String> getHardwarePlatform()
/*     */   {
/* 377 */     if (this.hardwarePlatform == null) {
/* 378 */       this.hardwarePlatform = new ArrayList();
/*     */     }
/* 380 */     return this.hardwarePlatform;
/*     */   }
/*     */ 
/*     */   public PEGIDetailsType getPEGIDetails()
/*     */   {
/* 392 */     return this.pegiDetails;
/*     */   }
/*     */ 
/*     */   public void setPEGIDetails(PEGIDetailsType value)
/*     */   {
/* 404 */     this.pegiDetails = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMFGSuggestedAgeMin()
/*     */   {
/* 416 */     return this.mfgSuggestedAgeMin;
/*     */   }
/*     */ 
/*     */   public void setMFGSuggestedAgeMin(BigInteger value)
/*     */   {
/* 428 */     this.mfgSuggestedAgeMin = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMFGSuggestedAgeMax()
/*     */   {
/* 440 */     return this.mfgSuggestedAgeMax;
/*     */   }
/*     */ 
/*     */   public void setMFGSuggestedAgeMax(BigInteger value)
/*     */   {
/* 452 */     this.mfgSuggestedAgeMax = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxNumberOfPlayers()
/*     */   {
/* 464 */     return this.maxNumberOfPlayers;
/*     */   }
/*     */ 
/*     */   public void setMaxNumberOfPlayers(BigInteger value)
/*     */   {
/* 476 */     this.maxNumberOfPlayers = value;
/*     */   }
/*     */ 
/*     */   public List<SoftwarePlatform> getSoftwarePlatform()
/*     */   {
/* 502 */     if (this.softwarePlatform == null) {
/* 503 */       this.softwarePlatform = new ArrayList();
/*     */     }
/* 505 */     return this.softwarePlatform;
/*     */   }
/*     */ 
/*     */   public Boolean isOnlinePlay()
/*     */   {
/* 517 */     return this.onlinePlay;
/*     */   }
/*     */ 
/*     */   public void setOnlinePlay(Boolean value)
/*     */   {
/* 529 */     this.onlinePlay = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SoftwareGames
 * JD-Core Version:    0.6.2
 */