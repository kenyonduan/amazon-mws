/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlAttribute;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="CharacterDataType", propOrder={"sku", "effectiveTimestamp", "plugin", "additionalMessageDiscriminator", "payload"})
/*     */ public class CharacterDataType
/*     */ {
/*     */ 
/*     */   @XmlElement(name="SKU", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sku;
/*     */ 
/*     */   @XmlElement(name="EffectiveTimestamp")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar effectiveTimestamp;
/*     */ 
/*     */   @XmlElement(name="Plugin")
/*     */   protected List<String> plugin;
/*     */ 
/*     */   @XmlElement(name="AdditionalMessageDiscriminator")
/*     */   protected String additionalMessageDiscriminator;
/*     */ 
/*     */   @XmlElement(name="Payload", required=true)
/*     */   protected String payload;
/*     */ 
/*     */   @XmlAttribute(name="schemaVersion")
/*     */   protected String schemaVersion;
/*     */ 
/*     */   @XmlAttribute(name="isOfferOnlyUpdate")
/*     */   protected Boolean isOfferOnlyUpdate;
/*     */ 
/*     */   public String getSKU()
/*     */   {
/*  78 */     return this.sku;
/*     */   }
/*     */ 
/*     */   public void setSKU(String value)
/*     */   {
/*  90 */     this.sku = value;
/*     */   }
/*     */ 
/*     */   public XMLGregorianCalendar getEffectiveTimestamp()
/*     */   {
/* 102 */     return this.effectiveTimestamp;
/*     */   }
/*     */ 
/*     */   public void setEffectiveTimestamp(XMLGregorianCalendar value)
/*     */   {
/* 114 */     this.effectiveTimestamp = value;
/*     */   }
/*     */ 
/*     */   public List<String> getPlugin()
/*     */   {
/* 140 */     if (this.plugin == null) {
/* 141 */       this.plugin = new ArrayList();
/*     */     }
/* 143 */     return this.plugin;
/*     */   }
/*     */ 
/*     */   public String getAdditionalMessageDiscriminator()
/*     */   {
/* 155 */     return this.additionalMessageDiscriminator;
/*     */   }
/*     */ 
/*     */   public void setAdditionalMessageDiscriminator(String value)
/*     */   {
/* 167 */     this.additionalMessageDiscriminator = value;
/*     */   }
/*     */ 
/*     */   public String getPayload()
/*     */   {
/* 179 */     return this.payload;
/*     */   }
/*     */ 
/*     */   public void setPayload(String value)
/*     */   {
/* 191 */     this.payload = value;
/*     */   }
/*     */ 
/*     */   public String getSchemaVersion()
/*     */   {
/* 203 */     return this.schemaVersion;
/*     */   }
/*     */ 
/*     */   public void setSchemaVersion(String value)
/*     */   {
/* 215 */     this.schemaVersion = value;
/*     */   }
/*     */ 
/*     */   public Boolean isIsOfferOnlyUpdate()
/*     */   {
/* 227 */     return this.isOfferOnlyUpdate;
/*     */   }
/*     */ 
/*     */   public void setIsOfferOnlyUpdate(Boolean value)
/*     */   {
/* 239 */     this.isOfferOnlyUpdate = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CharacterDataType
 * JD-Core Version:    0.6.2
 */