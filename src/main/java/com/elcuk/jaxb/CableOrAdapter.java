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
/*     */ @XmlType(name="", propOrder={"analogRGBInput", "cableLength", "coatingDescription", "conductor", "connectorGender", "connectorTypeUsedOnCable", "powerPlugType", "totalVideoOutPorts", "efficiency"})
/*     */ @XmlRootElement(name="CableOrAdapter")
/*     */ public class CableOrAdapter
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AnalogRGBInput")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> analogRGBInput;
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="CoatingDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String coatingDescription;
/*     */ 
/*     */   @XmlElement(name="Conductor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String conductor;
/*     */ 
/*     */   @XmlElement(name="ConnectorGender")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> connectorGender;
/*     */ 
/*     */   @XmlElement(name="ConnectorTypeUsedOnCable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String connectorTypeUsedOnCable;
/*     */ 
/*     */   @XmlElement(name="PowerPlugType")
/*     */   protected PowerPlugType powerPlugType;
/*     */ 
/*     */   @XmlElement(name="TotalVideoOutPorts")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger totalVideoOutPorts;
/*     */ 
/*     */   @XmlElement(name="Efficiency")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String efficiency;
/*     */ 
/*     */   public List<String> getAnalogRGBInput()
/*     */   {
/* 108 */     if (this.analogRGBInput == null) {
/* 109 */       this.analogRGBInput = new ArrayList();
/*     */     }
/* 111 */     return this.analogRGBInput;
/*     */   }
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/* 123 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/* 135 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public String getCoatingDescription()
/*     */   {
/* 147 */     return this.coatingDescription;
/*     */   }
/*     */ 
/*     */   public void setCoatingDescription(String value)
/*     */   {
/* 159 */     this.coatingDescription = value;
/*     */   }
/*     */ 
/*     */   public String getConductor()
/*     */   {
/* 171 */     return this.conductor;
/*     */   }
/*     */ 
/*     */   public void setConductor(String value)
/*     */   {
/* 183 */     this.conductor = value;
/*     */   }
/*     */ 
/*     */   public List<String> getConnectorGender()
/*     */   {
/* 209 */     if (this.connectorGender == null) {
/* 210 */       this.connectorGender = new ArrayList();
/*     */     }
/* 212 */     return this.connectorGender;
/*     */   }
/*     */ 
/*     */   public String getConnectorTypeUsedOnCable()
/*     */   {
/* 224 */     return this.connectorTypeUsedOnCable;
/*     */   }
/*     */ 
/*     */   public void setConnectorTypeUsedOnCable(String value)
/*     */   {
/* 236 */     this.connectorTypeUsedOnCable = value;
/*     */   }
/*     */ 
/*     */   public PowerPlugType getPowerPlugType()
/*     */   {
/* 248 */     return this.powerPlugType;
/*     */   }
/*     */ 
/*     */   public void setPowerPlugType(PowerPlugType value)
/*     */   {
/* 260 */     this.powerPlugType = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getTotalVideoOutPorts()
/*     */   {
/* 272 */     return this.totalVideoOutPorts;
/*     */   }
/*     */ 
/*     */   public void setTotalVideoOutPorts(BigInteger value)
/*     */   {
/* 284 */     this.totalVideoOutPorts = value;
/*     */   }
/*     */ 
/*     */   public String getEfficiency()
/*     */   {
/* 296 */     return this.efficiency;
/*     */   }
/*     */ 
/*     */   public void setEfficiency(String value)
/*     */   {
/* 308 */     this.efficiency = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CableOrAdapter
 * JD-Core Version:    0.6.2
 */