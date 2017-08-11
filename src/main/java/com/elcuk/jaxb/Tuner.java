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
/*     */ @XmlType(name="", propOrder={"internetApplications", "totalCoaxialInputs", "totalCompositePorts", "totalEthernetPorts", "totalHdmiPorts"})
/*     */ @XmlRootElement(name="Tuner")
/*     */ public class Tuner
/*     */ {
/*     */ 
/*     */   @XmlElement(name="InternetApplications")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> internetApplications;
/*     */ 
/*     */   @XmlElement(name="TotalCoaxialInputs")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalCoaxialInputs;
/*     */ 
/*     */   @XmlElement(name="TotalCompositePorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalCompositePorts;
/*     */ 
/*     */   @XmlElement(name="TotalEthernetPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalEthernetPorts;
/*     */ 
/*     */   @XmlElement(name="TotalHdmiPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalHdmiPorts;
/*     */ 
/*     */   public List<String> getInternetApplications()
/*     */   {
/*  90 */     if (this.internetApplications == null) {
/*  91 */       this.internetApplications = new ArrayList();
/*     */     }
/*  93 */     return this.internetApplications;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCoaxialInputs()
/*     */   {
/* 105 */     return this.totalCoaxialInputs;
/*     */   }
/*     */ 
/*     */   public void setTotalCoaxialInputs(BigInteger value)
/*     */   {
/* 117 */     this.totalCoaxialInputs = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalCompositePorts()
/*     */   {
/* 129 */     return this.totalCompositePorts;
/*     */   }
/*     */ 
/*     */   public void setTotalCompositePorts(BigInteger value)
/*     */   {
/* 141 */     this.totalCompositePorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalEthernetPorts()
/*     */   {
/* 153 */     return this.totalEthernetPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalEthernetPorts(BigInteger value)
/*     */   {
/* 165 */     this.totalEthernetPorts = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalHdmiPorts()
/*     */   {
/* 177 */     return this.totalHdmiPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalHdmiPorts(BigInteger value)
/*     */   {
/* 189 */     this.totalHdmiPorts = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Tuner
 * JD-Core Version:    0.6.2
 */