/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
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
/*     */ @XmlType(name="", propOrder={"numberOfSpeakers", "screenSize", "vehicleSpeakerSize"})
/*     */ @XmlRootElement(name="CarAudioOrTheater")
/*     */ public class CarAudioOrTheater
/*     */ {
/*     */ 
/*     */   @XmlElement(name="NumberOfSpeakers")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numberOfSpeakers;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="VehicleSpeakerSize")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String vehicleSpeakerSize;
/*     */ 
/*     */   public BigInteger getNumberOfSpeakers()
/*     */   {
/*  63 */     return this.numberOfSpeakers;
/*     */   }
/*     */ 
/*     */   public void setNumberOfSpeakers(BigInteger value)
/*     */   {
/*  75 */     this.numberOfSpeakers = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/*  87 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/*  99 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public String getVehicleSpeakerSize()
/*     */   {
/* 111 */     return this.vehicleSpeakerSize;
/*     */   }
/*     */ 
/*     */   public void setVehicleSpeakerSize(String value)
/*     */   {
/* 123 */     this.vehicleSpeakerSize = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CarAudioOrTheater
 * JD-Core Version:    0.6.2
 */