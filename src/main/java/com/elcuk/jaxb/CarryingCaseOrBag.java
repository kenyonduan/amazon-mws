/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
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
/*     */ @XmlType(name="", propOrder={"variationData", "checkpointTSAFriendly", "compatibleDeviceSize", "compatibleDeviceFormFactor", "handOrientation", "holderCapacity", "materialType", "modelNumber"})
/*     */ @XmlRootElement(name="CarryingCaseOrBag")
/*     */ public class CarryingCaseOrBag
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="CheckpointTSAFriendly")
/*     */   protected String checkpointTSAFriendly;
/*     */ 
/*     */   @XmlElement(name="CompatibleDeviceSize")
/*     */   protected BigDecimal compatibleDeviceSize;
/*     */ 
/*     */   @XmlElement(name="CompatibleDeviceFormFactor")
/*     */   protected List<String> compatibleDeviceFormFactor;
/*     */ 
/*     */   @XmlElement(name="HandOrientation")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String handOrientation;
/*     */ 
/*     */   @XmlElement(name="HolderCapacity")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String holderCapacity;
/*     */ 
/*     */   @XmlElement(name="MaterialType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String materialType;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/*  86 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/*  98 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getCheckpointTSAFriendly()
/*     */   {
/* 110 */     return this.checkpointTSAFriendly;
/*     */   }
/*     */ 
/*     */   public void setCheckpointTSAFriendly(String value)
/*     */   {
/* 122 */     this.checkpointTSAFriendly = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getCompatibleDeviceSize()
/*     */   {
/* 134 */     return this.compatibleDeviceSize;
/*     */   }
/*     */ 
/*     */   public void setCompatibleDeviceSize(BigDecimal value)
/*     */   {
/* 146 */     this.compatibleDeviceSize = value;
/*     */   }
/*     */ 
/*     */   public List<String> getCompatibleDeviceFormFactor()
/*     */   {
/* 172 */     if (this.compatibleDeviceFormFactor == null) {
/* 173 */       this.compatibleDeviceFormFactor = new ArrayList();
/*     */     }
/* 175 */     return this.compatibleDeviceFormFactor;
/*     */   }
/*     */ 
/*     */   public String getHandOrientation()
/*     */   {
/* 187 */     return this.handOrientation;
/*     */   }
/*     */ 
/*     */   public void setHandOrientation(String value)
/*     */   {
/* 199 */     this.handOrientation = value;
/*     */   }
/*     */ 
/*     */   public String getHolderCapacity()
/*     */   {
/* 211 */     return this.holderCapacity;
/*     */   }
/*     */ 
/*     */   public void setHolderCapacity(String value)
/*     */   {
/* 223 */     this.holderCapacity = value;
/*     */   }
/*     */ 
/*     */   public String getMaterialType()
/*     */   {
/* 235 */     return this.materialType;
/*     */   }
/*     */ 
/*     */   public void setMaterialType(String value)
/*     */   {
/* 247 */     this.materialType = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 259 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 271 */     this.modelNumber = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CarryingCaseOrBag
 * JD-Core Version:    0.6.2
 */