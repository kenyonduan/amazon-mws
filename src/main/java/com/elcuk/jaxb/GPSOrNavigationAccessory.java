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
/*     */ @XmlType(name="", propOrder={"cableLength", "operatingSystem", "powerSource", "screenSize", "totalEthernetPorts", "wirelessType"})
/*     */ @XmlRootElement(name="GPSOrNavigationAccessory")
/*     */ public class GPSOrNavigationAccessory
/*     */ {
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="OperatingSystem")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> operatingSystem;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="ScreenSize")
/*     */   protected LengthDimension screenSize;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="WirelessType")
/*     */   protected String wirelessType;
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/*  78 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/*  90 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public List<String> getOperatingSystem()
/*     */   {
/* 116 */     if (this.operatingSystem == null) {
/* 117 */       this.operatingSystem = new ArrayList();
/*     */     }
/* 119 */     return this.operatingSystem;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 131 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 143 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getScreenSize()
/*     */   {
/* 155 */     return this.screenSize;
/*     */   }
/*     */ 
/*     */   public void setScreenSize(LengthDimension value)
/*     */   {
/* 167 */     this.screenSize = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 179 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 191 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public String getWirelessType()
/*     */   {
/* 203 */     return this.wirelessType;
/*     */   }
/*     */ 
/*     */   public void setWirelessType(String value)
/*     */   {
/* 215 */     this.wirelessType = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.GPSOrNavigationAccessory
 * JD-Core Version:    0.6.2
 */