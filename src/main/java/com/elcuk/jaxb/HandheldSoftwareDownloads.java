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
/*     */ @XmlType(name="", propOrder={"applicationVersion", "downloadableFile", "operatingSystem", "systemRequirements", "numberOfLicenses", "maxNumberOfPlayers"})
/*     */ @XmlRootElement(name="HandheldSoftwareDownloads")
/*     */ public class HandheldSoftwareDownloads
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ApplicationVersion", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String applicationVersion;
/*     */ 
/*     */   @XmlElement(name="DownloadableFile", required=true)
/*     */   protected DownloadableFile downloadableFile;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="SystemRequirements")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String systemRequirements;
/*     */ 
/*     */   @XmlElement(name="NumberOfLicenses")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfLicenses;
/*     */ 
/*     */   @XmlElement(name="MaxNumberOfPlayers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger maxNumberOfPlayers;
/*     */ 
/*     */   public String getApplicationVersion()
/*     */   {
/*  80 */     return this.applicationVersion;
/*     */   }
/*     */ 
/*     */   public void setApplicationVersion(String value)
/*     */   {
/*  92 */     this.applicationVersion = value;
/*     */   }
/*     */ 
/*     */   public DownloadableFile getDownloadableFile()
/*     */   {
/* 104 */     return this.downloadableFile;
/*     */   }
/*     */ 
/*     */   public void setDownloadableFile(DownloadableFile value)
/*     */   {
/* 116 */     this.downloadableFile = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 142 */     if (this.operatingSystem == null) {
/* 143 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 145 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getSystemRequirements()
/*     */   {
/* 157 */     return this.systemRequirements;
/*     */   }
/*     */ 
/*     */   public void setSystemRequirements(String value)
/*     */   {
/* 169 */     this.systemRequirements = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfLicenses()
/*     */   {
/* 181 */     return this.numberOfLicenses;
/*     */   }
/*     */ 
/*     */   public void setNumberOfLicenses(BigInteger value)
/*     */   {
/* 193 */     this.numberOfLicenses = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getMaxNumberOfPlayers()
/*     */   {
/* 205 */     return this.maxNumberOfPlayers;
/*     */   }
/*     */ 
/*     */   public void setMaxNumberOfPlayers(BigInteger value)
/*     */   {
/* 217 */     this.maxNumberOfPlayers = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HandheldSoftwareDownloads
 * JD-Core Version:    0.6.2
 */