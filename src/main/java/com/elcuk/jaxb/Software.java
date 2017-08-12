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
/*     */ @XmlType(name="", propOrder={"mediaFormat", "operatingSystem", "bundles", "childrensSoftwareGenre", "esrbRating", "bbfcRating", "pegiRating", "uskRating", "esrbDescriptors", "hardwarePlatform", "pegiDetails", "maxNumberOfPlayers", "mfgSuggestedAgeMin", "mfgSuggestedAgeMax", "softwarePlatform", "applicationVersion", "numberOfLicenses"})
/*     */ @XmlRootElement(name="Software")
/*     */ public class Software
/*     */ {
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
/*     */   @XmlElement(name="ChildrensSoftwareGenre")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> childrensSoftwareGenre;
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
/*     */   @XmlElement(name="MaxNumberOfPlayers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger maxNumberOfPlayers;
/*     */ 
/*     */   @XmlElement(name="MFGSuggestedAgeMin")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger mfgSuggestedAgeMin;
/*     */ 
/*     */   @XmlElement(name="MFGSuggestedAgeMax")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger mfgSuggestedAgeMax;
/*     */ 
/*     */   @XmlElement(name="SoftwarePlatform")
/*     */   protected List<SoftwarePlatform> softwarePlatform;
/*     */ 
/*     */   @XmlElement(name="ApplicationVersion")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String applicationVersion;
/*     */ 
/*     */   @XmlElement(name="NumberOfLicenses")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLicenses;
/*     */ 
/*     */   public List<String> getMediaFormat()
/*     */   {
/* 147 */     if (this.mediaFormat == null) {
/* 148 */       this.mediaFormat = new ArrayList();
/*     */     }
/* 150 */     return this.mediaFormat;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 176 */     if (this.operatingSystem == null) {
/* 177 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 179 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getBundles()
/*     */   {
/* 191 */     return this.bundles;
/*     */   }
/*     */ 
/*     */   public void setBundles(String value)
/*     */   {
/* 203 */     this.bundles = value;
/*     */   }
/*     */ 
/*     */   public List<String> getChildrensSoftwareGenre()
/*     */   {
/* 229 */     if (this.childrensSoftwareGenre == null) {
/* 230 */       this.childrensSoftwareGenre = new ArrayList();
/*     */     }
/* 232 */     return this.childrensSoftwareGenre;
/*     */   }
/*     */ 
/*     */   public String getESRBRating()
/*     */   {
/* 244 */     return this.esrbRating;
/*     */   }
/*     */ 
/*     */   public void setESRBRating(String value)
/*     */   {
/* 256 */     this.esrbRating = value;
/*     */   }
/*     */ 
/*     */   public BBFCRatingType getBBFCRating()
/*     */   {
/* 268 */     return this.bbfcRating;
/*     */   }
/*     */ 
/*     */   public void setBBFCRating(BBFCRatingType value)
/*     */   {
/* 280 */     this.bbfcRating = value;
/*     */   }
/*     */ 
/*     */   public PEGIRatingType getPEGIRating()
/*     */   {
/* 292 */     return this.pegiRating;
/*     */   }
/*     */ 
/*     */   public void setPEGIRating(PEGIRatingType value)
/*     */   {
/* 304 */     this.pegiRating = value;
/*     */   }
/*     */ 
/*     */   public USKRatingType getUSKRating()
/*     */   {
/* 316 */     return this.uskRating;
/*     */   }
/*     */ 
/*     */   public void setUSKRating(USKRatingType value)
/*     */   {
/* 328 */     this.uskRating = value;
/*     */   }
/*     */ 
/*     */   public List<String> getESRBDescriptors()
/*     */   {
/* 354 */     if (this.esrbDescriptors == null) {
/* 355 */       this.esrbDescriptors = new ArrayList();
/*     */     }
/* 357 */     return this.esrbDescriptors;
/*     */   }
/*     */ 
/*     */   public List<String> getHardwarePlatform()
/*     */   {
/* 383 */     if (this.hardwarePlatform == null) {
/* 384 */       this.hardwarePlatform = new ArrayList();
/*     */     }
/* 386 */     return this.hardwarePlatform;
/*     */   }
/*     */ 
/*     */   public PEGIDetailsType getPEGIDetails()
/*     */   {
/* 398 */     return this.pegiDetails;
/*     */   }
/*     */ 
/*     */   public void setPEGIDetails(PEGIDetailsType value)
/*     */   {
/* 410 */     this.pegiDetails = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxNumberOfPlayers()
/*     */   {
/* 422 */     return this.maxNumberOfPlayers;
/*     */   }
/*     */ 
/*     */   public void setMaxNumberOfPlayers(BigInteger value)
/*     */   {
/* 434 */     this.maxNumberOfPlayers = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMFGSuggestedAgeMin()
/*     */   {
/* 446 */     return this.mfgSuggestedAgeMin;
/*     */   }
/*     */ 
/*     */   public void setMFGSuggestedAgeMin(BigInteger value)
/*     */   {
/* 458 */     this.mfgSuggestedAgeMin = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMFGSuggestedAgeMax()
/*     */   {
/* 470 */     return this.mfgSuggestedAgeMax;
/*     */   }
/*     */ 
/*     */   public void setMFGSuggestedAgeMax(BigInteger value)
/*     */   {
/* 482 */     this.mfgSuggestedAgeMax = value;
/*     */   }
/*     */ 
/*     */   public List<SoftwarePlatform> getSoftwarePlatform()
/*     */   {
/* 508 */     if (this.softwarePlatform == null) {
/* 509 */       this.softwarePlatform = new ArrayList();
/*     */     }
/* 511 */     return this.softwarePlatform;
/*     */   }
/*     */ 
/*     */   public String getApplicationVersion()
/*     */   {
/* 523 */     return this.applicationVersion;
/*     */   }
/*     */ 
/*     */   public void setApplicationVersion(String value)
/*     */   {
/* 535 */     this.applicationVersion = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLicenses()
/*     */   {
/* 547 */     return this.numberOfLicenses;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLicenses(BigInteger value)
/*     */   {
/* 559 */     this.numberOfLicenses = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Software
 * JD-Core Version:    0.6.2
 */