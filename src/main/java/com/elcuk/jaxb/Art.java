/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"battery", "canShipInOriginalContainer", "colorMap", "finish", "identityPackageType", "isStainResistant", "material", "maximumCoverageArea", "outputCapacity", "pieceCount", "paintType", "shape", "threadCount", "towelWeight", "variationData", "wattage"})
/*     */ @XmlRootElement(name="Art")
/*     */ public class Art
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Battery")
/*     */   protected Battery battery;
/*     */ 
/*     */   @XmlElement(name="CanShipInOriginalContainer")
/*     */   protected Boolean canShipInOriginalContainer;
/*     */ 
/*     */   @XmlElement(name="ColorMap")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String colorMap;
/*     */ 
/*     */   @XmlElement(name="Finish")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String finish;
/*     */ 
/*     */   @XmlElement(name="IdentityPackageType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String identityPackageType;
/*     */ 
/*     */   @XmlElement(name="IsStainResistant")
/*     */   protected Boolean isStainResistant;
/*     */ 
/*     */   @XmlElement(name="Material")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String material;
/*     */ 
/*     */   @XmlElement(name="MaximumCoverageArea")
/*     */   protected AreaDimensionOptionalUnit maximumCoverageArea;
/*     */ 
/*     */   @XmlElement(name="OutputCapacity")
/*     */   protected VolumeRateDimension outputCapacity;
/*     */ 
/*     */   @XmlElement(name="PieceCount")
/*     */   protected BigInteger pieceCount;
/*     */ 
/*     */   @XmlElement(name="PaintType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String paintType;
/*     */ 
/*     */   @XmlElement(name="Shape")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String shape;
/*     */ 
/*     */   @XmlElement(name="ThreadCount")
/*     */   protected BigInteger threadCount;
/*     */ 
/*     */   @XmlElement(name="TowelWeight")
/*     */   protected WeightDimension towelWeight;
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected WattageDimensionOptionalUnit wattage;
/*     */ 
/*     */   public Battery getBattery()
/*     */   {
/* 247 */     return this.battery;
/*     */   }
/*     */ 
/*     */   public void setBattery(Battery value)
/*     */   {
/* 259 */     this.battery = value;
/*     */   }
/*     */ 
/*     */   public Boolean isCanShipInOriginalContainer()
/*     */   {
/* 271 */     return this.canShipInOriginalContainer;
/*     */   }
/*     */ 
/*     */   public void setCanShipInOriginalContainer(Boolean value)
/*     */   {
/* 283 */     this.canShipInOriginalContainer = value;
/*     */   }
/*     */ 
/*     */   public String getColorMap()
/*     */   {
/* 295 */     return this.colorMap;
/*     */   }
/*     */ 
/*     */   public void setColorMap(String value)
/*     */   {
/* 307 */     this.colorMap = value;
/*     */   }
/*     */ 
/*     */   public String getFinish()
/*     */   {
/* 319 */     return this.finish;
/*     */   }
/*     */ 
/*     */   public void setFinish(String value)
/*     */   {
/* 331 */     this.finish = value;
/*     */   }
/*     */ 
/*     */   public String getIdentityPackageType()
/*     */   {
/* 343 */     return this.identityPackageType;
/*     */   }
/*     */ 
/*     */   public void setIdentityPackageType(String value)
/*     */   {
/* 355 */     this.identityPackageType = value;
/*     */   }
/*     */ 
/*     */   public Boolean isIsStainResistant()
/*     */   {
/* 367 */     return this.isStainResistant;
/*     */   }
/*     */ 
/*     */   public void setIsStainResistant(Boolean value)
/*     */   {
/* 379 */     this.isStainResistant = value;
/*     */   }
/*     */ 
/*     */   public String getMaterial()
/*     */   {
/* 391 */     return this.material;
/*     */   }
/*     */ 
/*     */   public void setMaterial(String value)
/*     */   {
/* 403 */     this.material = value;
/*     */   }
/*     */ 
/*     */   public AreaDimensionOptionalUnit getMaximumCoverageArea()
/*     */   {
/* 415 */     return this.maximumCoverageArea;
/*     */   }
/*     */ 
/*     */   public void setMaximumCoverageArea(AreaDimensionOptionalUnit value)
/*     */   {
/* 427 */     this.maximumCoverageArea = value;
/*     */   }
/*     */ 
/*     */   public VolumeRateDimension getOutputCapacity()
/*     */   {
/* 439 */     return this.outputCapacity;
/*     */   }
/*     */ 
/*     */   public void setOutputCapacity(VolumeRateDimension value)
/*     */   {
/* 451 */     this.outputCapacity = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getPieceCount()
/*     */   {
/* 463 */     return this.pieceCount;
/*     */   }
/*     */ 
/*     */   public void setPieceCount(BigInteger value)
/*     */   {
/* 475 */     this.pieceCount = value;
/*     */   }
/*     */ 
/*     */   public String getPaintType()
/*     */   {
/* 487 */     return this.paintType;
/*     */   }
/*     */ 
/*     */   public void setPaintType(String value)
/*     */   {
/* 499 */     this.paintType = value;
/*     */   }
/*     */ 
/*     */   public String getShape()
/*     */   {
/* 511 */     return this.shape;
/*     */   }
/*     */ 
/*     */   public void setShape(String value)
/*     */   {
/* 523 */     this.shape = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getThreadCount()
/*     */   {
/* 535 */     return this.threadCount;
/*     */   }
/*     */ 
/*     */   public void setThreadCount(BigInteger value)
/*     */   {
/* 547 */     this.threadCount = value;
/*     */   }
/*     */ 
/*     */   public WeightDimension getTowelWeight()
/*     */   {
/* 559 */     return this.towelWeight;
/*     */   }
/*     */ 
/*     */   public void setTowelWeight(WeightDimension value)
/*     */   {
/* 571 */     this.towelWeight = value;
/*     */   }
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 583 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 595 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public WattageDimensionOptionalUnit getWattage()
/*     */   {
/* 607 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(WattageDimensionOptionalUnit value)
/*     */   {
/* 619 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"variationTheme", "size", "color", "scent", "styleName", "customerPackageType"})
/*     */   public static class VariationData
/*     */   {
/*     */ 
/*     */     @XmlElement(name="VariationTheme")
/*     */     protected String variationTheme;
/*     */ 
/*     */     @XmlElement(name="Size")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String size;
/*     */ 
/*     */     @XmlElement(name="Color")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String color;
/*     */ 
/*     */     @XmlElement(name="Scent")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String scent;
/*     */ 
/*     */     @XmlElement(name="StyleName")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String styleName;
/*     */ 
/*     */     @XmlElement(name="CustomerPackageType")
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String customerPackageType;
/*     */ 
/*     */     public String getVariationTheme()
/*     */     {
/* 791 */       return this.variationTheme;
/*     */     }
/*     */ 
/*     */     public void setVariationTheme(String value)
/*     */     {
/* 803 */       this.variationTheme = value;
/*     */     }
/*     */ 
/*     */     public String getSize()
/*     */     {
/* 815 */       return this.size;
/*     */     }
/*     */ 
/*     */     public void setSize(String value)
/*     */     {
/* 827 */       this.size = value;
/*     */     }
/*     */ 
/*     */     public String getColor()
/*     */     {
/* 839 */       return this.color;
/*     */     }
/*     */ 
/*     */     public void setColor(String value)
/*     */     {
/* 851 */       this.color = value;
/*     */     }
/*     */ 
/*     */     public String getScent()
/*     */     {
/* 863 */       return this.scent;
/*     */     }
/*     */ 
/*     */     public void setScent(String value)
/*     */     {
/* 875 */       this.scent = value;
/*     */     }
/*     */ 
/*     */     public String getStyleName()
/*     */     {
/* 887 */       return this.styleName;
/*     */     }
/*     */ 
/*     */     public void setStyleName(String value)
/*     */     {
/* 899 */       this.styleName = value;
/*     */     }
/*     */ 
/*     */     public String getCustomerPackageType()
/*     */     {
/* 911 */       return this.customerPackageType;
/*     */     }
/*     */ 
/*     */     public void setCustomerPackageType(String value)
/*     */     {
/* 923 */       this.customerPackageType = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Art
 * JD-Core Version:    0.6.2
 */