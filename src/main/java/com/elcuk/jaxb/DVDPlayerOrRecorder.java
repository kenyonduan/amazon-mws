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
/*     */ @XmlType(name="", propOrder={"builtInMedia", "numberOfSpeakers", "totalCoaxialInputs", "totalHdmiPorts", "wirelessTechnology"})
/*     */ @XmlRootElement(name="DVDPlayerOrRecorder")
/*     */ public class DVDPlayerOrRecorder
/*     */ {
/*     */ 
/*     */   @XmlElement(name="BuiltInMedia")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> builtInMedia;
/*     */ 
/*     */   @XmlElement(name="NumberOfSpeakers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfSpeakers;
/*     */ 
/*     */   @XmlElement(name="TotalCoaxialInputs")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalCoaxialInputs;
/*     */ 
/*     */   @XmlElement(name="TotalHdmiPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalHdmiPorts;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   public List<String> getBuiltInMedia()
/*     */   {
/*  90 */     if (this.builtInMedia == null) {
/*  91 */       this.builtInMedia = new ArrayList();
/*     */     }
/*  93 */     return this.builtInMedia;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfSpeakers()
/*     */   {
/* 105 */     return this.numberOfSpeakers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSpeakers(BigInteger value)
/*     */   {
/* 117 */     this.numberOfSpeakers = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCoaxialInputs()
/*     */   {
/* 129 */     return this.totalCoaxialInputs;
/*     */   }
/*     */ 
/*     */   public void setTotalCoaxialInputs(BigInteger value)
/*     */   {
/* 141 */     this.totalCoaxialInputs = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalHdmiPorts()
/*     */   {
/* 153 */     return this.totalHdmiPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalHdmiPorts(BigInteger value)
/*     */   {
/* 165 */     this.totalHdmiPorts = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 191 */     if (this.wirelessTechnology == null) {
/* 192 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 194 */     return this.wirelessTechnology;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DVDPlayerOrRecorder
 * JD-Core Version:    0.6.2
 */