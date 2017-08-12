/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"cableLength", "connectorGender", "connectorTypeUsedOnCable", "maximumSupportedScreenSize", "minimumSupportedScreenSize", "mountingPattern", "mountingType", "mountMotion", "mountBoltPattern", "powerSource", "wirelessTechnology"})
/*     */ @XmlRootElement(name="AudioVideoAccessory")
/*     */ public class AudioVideoAccessory
/*     */ {
/*     */ 
/*     */   @XmlElement(name="CableLength")
/*     */   protected LengthDimension cableLength;
/*     */ 
/*     */   @XmlElement(name="ConnectorGender")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> connectorGender;
/*     */ 
/*     */   @XmlElement(name="ConnectorTypeUsedOnCable")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String connectorTypeUsedOnCable;
/*     */ 
/*     */   @XmlElement(name="MaximumSupportedScreenSize")
/*     */   protected LengthDimension maximumSupportedScreenSize;
/*     */ 
/*     */   @XmlElement(name="MinimumSupportedScreenSize")
/*     */   protected LengthDimension minimumSupportedScreenSize;
/*     */ 
/*     */   @XmlElement(name="MountingPattern")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountingPattern;
/*     */ 
/*     */   @XmlElement(name="MountingType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountingType;
/*     */ 
/*     */   @XmlElement(name="MountMotion")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountMotion;
/*     */ 
/*     */   @XmlElement(name="MountBoltPattern")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String mountBoltPattern;
/*     */ 
/*     */   @XmlElement(name="PowerSource")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String powerSource;
/*     */ 
/*     */   @XmlElement(name="WirelessTechnology")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected List<String> wirelessTechnology;
/*     */ 
/*     */   public LengthDimension getCableLength()
/*     */   {
/* 101 */     return this.cableLength;
/*     */   }
/*     */ 
/*     */   public void setCableLength(LengthDimension value)
/*     */   {
/* 113 */     this.cableLength = value;
/*     */   }
/*     */ 
/*     */   public List<String> getConnectorGender()
/*     */   {
/* 139 */     if (this.connectorGender == null) {
/* 140 */       this.connectorGender = new ArrayList();
/*     */     }
/* 142 */     return this.connectorGender;
/*     */   }
/*     */ 
/*     */   public String getConnectorTypeUsedOnCable()
/*     */   {
/* 154 */     return this.connectorTypeUsedOnCable;
/*     */   }
/*     */ 
/*     */   public void setConnectorTypeUsedOnCable(String value)
/*     */   {
/* 166 */     this.connectorTypeUsedOnCable = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMaximumSupportedScreenSize()
/*     */   {
/* 178 */     return this.maximumSupportedScreenSize;
/*     */   }
/*     */ 
/*     */   public void setMaximumSupportedScreenSize(LengthDimension value)
/*     */   {
/* 190 */     this.maximumSupportedScreenSize = value;
/*     */   }
/*     */ 
/*     */   public LengthDimension getMinimumSupportedScreenSize()
/*     */   {
/* 202 */     return this.minimumSupportedScreenSize;
/*     */   }
/*     */ 
/*     */   public void setMinimumSupportedScreenSize(LengthDimension value)
/*     */   {
/* 214 */     this.minimumSupportedScreenSize = value;
/*     */   }
/*     */ 
/*     */   public String getMountingPattern()
/*     */   {
/* 226 */     return this.mountingPattern;
/*     */   }
/*     */ 
/*     */   public void setMountingPattern(String value)
/*     */   {
/* 238 */     this.mountingPattern = value;
/*     */   }
/*     */ 
/*     */   public String getMountingType()
/*     */   {
/* 250 */     return this.mountingType;
/*     */   }
/*     */ 
/*     */   public void setMountingType(String value)
/*     */   {
/* 262 */     this.mountingType = value;
/*     */   }
/*     */ 
/*     */   public String getMountMotion()
/*     */   {
/* 274 */     return this.mountMotion;
/*     */   }
/*     */ 
/*     */   public void setMountMotion(String value)
/*     */   {
/* 286 */     this.mountMotion = value;
/*     */   }
/*     */ 
/*     */   public String getMountBoltPattern()
/*     */   {
/* 298 */     return this.mountBoltPattern;
/*     */   }
/*     */ 
/*     */   public void setMountBoltPattern(String value)
/*     */   {
/* 310 */     this.mountBoltPattern = value;
/*     */   }
/*     */ 
/*     */   public String getPowerSource()
/*     */   {
/* 322 */     return this.powerSource;
/*     */   }
/*     */ 
/*     */   public void setPowerSource(String value)
/*     */   {
/* 334 */     this.powerSource = value;
/*     */   }
/*     */ 
/*     */   public List<String> getWirelessTechnology()
/*     */   {
/* 360 */     if (this.wirelessTechnology == null) {
/* 361 */       this.wirelessTechnology = new ArrayList();
/*     */     }
/* 363 */     return this.wirelessTechnology;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AudioVideoAccessory
 * JD-Core Version:    0.6.2
 */