/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"graphicsCardDescription", "graphicsCoprocessor", "graphicsProcessorManufacturer", "graphicsCardRamSize", "graphicsCardInterface"})
/*     */ @XmlRootElement(name="GraphicsCard")
/*     */ public class GraphicsCard
/*     */ {
/*     */ 
/*     */   @XmlElement(name="GraphicsCardDescription")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String graphicsCardDescription;
/*     */ 
/*     */   @XmlElement(name="GraphicsCoprocessor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String graphicsCoprocessor;
/*     */ 
/*     */   @XmlElement(name="GraphicsProcessorManufacturer")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String graphicsProcessorManufacturer;
/*     */ 
/*     */   @XmlElement(name="GraphicsCardRamSize")
/*     */   protected MemorySizeDimension graphicsCardRamSize;
/*     */ 
/*     */   @XmlElement(name="GraphicsCardInterface")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String graphicsCardInterface;
/*     */ 
/*     */   public String getGraphicsCardDescription()
/*     */   {
/*  71 */     return this.graphicsCardDescription;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCardDescription(String value)
/*     */   {
/*  83 */     this.graphicsCardDescription = value;
/*     */   }
/*     */ 
/*     */   public String getGraphicsCoprocessor()
/*     */   {
/*  95 */     return this.graphicsCoprocessor;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCoprocessor(String value)
/*     */   {
/* 107 */     this.graphicsCoprocessor = value;
/*     */   }
/*     */ 
/*     */   public String getGraphicsProcessorManufacturer()
/*     */   {
/* 119 */     return this.graphicsProcessorManufacturer;
/*     */   }
/*     */ 
/*     */   public void setGraphicsProcessorManufacturer(String value)
/*     */   {
/* 131 */     this.graphicsProcessorManufacturer = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeDimension getGraphicsCardRamSize()
/*     */   {
/* 143 */     return this.graphicsCardRamSize;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCardRamSize(MemorySizeDimension value)
/*     */   {
/* 155 */     this.graphicsCardRamSize = value;
/*     */   }
/*     */ 
/*     */   public String getGraphicsCardInterface()
/*     */   {
/* 167 */     return this.graphicsCardInterface;
/*     */   }
/*     */ 
/*     */   public void setGraphicsCardInterface(String value)
/*     */   {
/* 179 */     this.graphicsCardInterface = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.GraphicsCard
 * JD-Core Version:    0.6.2
 */