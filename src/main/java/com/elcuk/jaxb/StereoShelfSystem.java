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
/*     */ @XmlType(name="", propOrder={"numberOfSpeakers", "maximumWattage", "wirelessTechnology"})
/*     */ @XmlRootElement(name="StereoShelfSystem")
/*     */ public class StereoShelfSystem
/*     */ {
/*     */ 
/*     */   @XmlElement(name="NumberOfSpeakers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfSpeakers;
/*     */ 
/*     */   @XmlElement(name="MaximumWattage")
/*     */   protected WattageDimension maximumWattage;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   public BigInteger getNumberOfSpeakers()
/*     */   {
/*  65 */     return this.numberOfSpeakers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSpeakers(BigInteger value)
/*     */   {
/*  77 */     this.numberOfSpeakers = value;
/*     */   }
/*     */ 
/*     */   public WattageDimension getMaximumWattage()
/*     */   {
/*  89 */     return this.maximumWattage;
/*     */   }
/*     */ 
/*     */   public void setMaximumWattage(WattageDimension value)
/*     */   {
/* 101 */     this.maximumWattage = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 127 */     if (this.wirelessTechnology == null) {
/* 128 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 130 */     return this.wirelessTechnology;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.StereoShelfSystem
 * JD-Core Version:    0.6.2
 */