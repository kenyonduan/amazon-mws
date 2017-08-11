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
/*     */ @XmlType(name="", propOrder={"areBatteriesIncluded", "areBatteriesRequired", "batterySubgroup"})
/*     */ @XmlRootElement(name="Battery")
/*     */ public class Battery
/*     */ {
/*     */ 
/*     */   @XmlElement(name="AreBatteriesIncluded")
/*     */   protected Boolean areBatteriesIncluded;
/*     */ 
/*     */   @XmlElement(name="AreBatteriesRequired")
/*     */   protected Boolean areBatteriesRequired;
/*     */ 
/*     */   @XmlElement(name="BatterySubgroup")
/*     */   protected List<BatterySubgroup> batterySubgroup;
/*     */ 
/*     */   public Boolean isAreBatteriesIncluded()
/*     */   {
/* 100 */     return this.areBatteriesIncluded;
/*     */   }
/*     */ 
/*     */   public void setAreBatteriesIncluded(Boolean value)
/*     */   {
/* 112 */     this.areBatteriesIncluded = value;
/*     */   }
/*     */ 
/*     */   public Boolean isAreBatteriesRequired()
/*     */   {
/* 124 */     return this.areBatteriesRequired;
/*     */   }
/*     */ 
/*     */   public void setAreBatteriesRequired(Boolean value)
/*     */   {
/* 136 */     this.areBatteriesRequired = value;
/*     */   }
/*     */ 
/*     */   public List<BatterySubgroup> getBatterySubgroup()
/*     */   {
/* 162 */     if (this.batterySubgroup == null) {
/* 163 */       this.batterySubgroup = new ArrayList();
/*     */     }
/* 165 */     return this.batterySubgroup;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"batteryType", "numberOfBatteries"})
/*     */   public static class BatterySubgroup
/*     */   {
/*     */ 
/*     */     @XmlElement(name="BatteryType", required=true)
/*     */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */     protected String batteryType;
/*     */ 
/*     */     @XmlElement(name="NumberOfBatteries", required=true)
/*     */     @XmlSchemaType(name="positiveInteger")
/*     */     protected BigInteger numberOfBatteries;
/*     */ 
/*     */     public String getBatteryType()
/*     */     {
/* 238 */       return this.batteryType;
/*     */     }
/*     */ 
/*     */     public void setBatteryType(String value)
/*     */     {
/* 250 */       this.batteryType = value;
/*     */     }
/*     */ 
/*     */     public BigInteger getNumberOfBatteries()
/*     */     {
/* 262 */       return this.numberOfBatteries;
/*     */     }
/*     */ 
/*     */     public void setNumberOfBatteries(BigInteger value)
/*     */     {
/* 274 */       this.numberOfBatteries = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Battery
 * JD-Core Version:    0.6.2
 */