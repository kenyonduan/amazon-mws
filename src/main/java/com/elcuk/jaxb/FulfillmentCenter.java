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
/*     */ @XmlType(name="", propOrder={"fulfillmentCenterID", "supportsInStorePickup", "operatingHours"})
/*     */ @XmlRootElement(name="FulfillmentCenter")
/*     */ public class FulfillmentCenter
/*     */ {
/*     */ 
/*     */   @XmlElement(name="FulfillmentCenterID", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String fulfillmentCenterID;
/*     */ 
/*     */   @XmlElement(name="SupportsInStorePickup")
/*     */   protected boolean supportsInStorePickup;
/*     */ 
/*     */   @XmlElement(name="OperatingHours", required=true)
/*     */   protected OperatingHours operatingHours;
/*     */ 
/*     */   public String getFulfillmentCenterID()
/*     */   {
/*  76 */     return this.fulfillmentCenterID;
/*     */   }
/*     */ 
/*     */   public void setFulfillmentCenterID(String value)
/*     */   {
/*  88 */     this.fulfillmentCenterID = value;
/*     */   }
/*     */ 
/*     */   public boolean isSupportsInStorePickup()
/*     */   {
/*  96 */     return this.supportsInStorePickup;
/*     */   }
/*     */ 
/*     */   public void setSupportsInStorePickup(boolean value)
/*     */   {
/* 104 */     this.supportsInStorePickup = value;
/*     */   }
/*     */ 
/*     */   public OperatingHours getOperatingHours()
/*     */   {
/* 116 */     return this.operatingHours;
/*     */   }
/*     */ 
/*     */   public void setOperatingHours(OperatingHours value)
/*     */   {
/* 128 */     this.operatingHours = value;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"})
/*     */   public static class OperatingHours
/*     */   {
/*     */ 
/*     */     @XmlElement(name="Monday")
/*     */     protected OperatingHoursBase monday;
/*     */ 
/*     */     @XmlElement(name="Tuesday")
/*     */     protected OperatingHoursBase tuesday;
/*     */ 
/*     */     @XmlElement(name="Wednesday")
/*     */     protected OperatingHoursBase wednesday;
/*     */ 
/*     */     @XmlElement(name="Thursday")
/*     */     protected OperatingHoursBase thursday;
/*     */ 
/*     */     @XmlElement(name="Friday")
/*     */     protected OperatingHoursBase friday;
/*     */ 
/*     */     @XmlElement(name="Saturday")
/*     */     protected OperatingHoursBase saturday;
/*     */ 
/*     */     @XmlElement(name="Sunday")
/*     */     protected OperatingHoursBase sunday;
/*     */ 
/*     */     public OperatingHoursBase getMonday()
/*     */     {
/* 193 */       return this.monday;
/*     */     }
/*     */ 
/*     */     public void setMonday(OperatingHoursBase value)
/*     */     {
/* 205 */       this.monday = value;
/*     */     }
/*     */ 
/*     */     public OperatingHoursBase getTuesday()
/*     */     {
/* 217 */       return this.tuesday;
/*     */     }
/*     */ 
/*     */     public void setTuesday(OperatingHoursBase value)
/*     */     {
/* 229 */       this.tuesday = value;
/*     */     }
/*     */ 
/*     */     public OperatingHoursBase getWednesday()
/*     */     {
/* 241 */       return this.wednesday;
/*     */     }
/*     */ 
/*     */     public void setWednesday(OperatingHoursBase value)
/*     */     {
/* 253 */       this.wednesday = value;
/*     */     }
/*     */ 
/*     */     public OperatingHoursBase getThursday()
/*     */     {
/* 265 */       return this.thursday;
/*     */     }
/*     */ 
/*     */     public void setThursday(OperatingHoursBase value)
/*     */     {
/* 277 */       this.thursday = value;
/*     */     }
/*     */ 
/*     */     public OperatingHoursBase getFriday()
/*     */     {
/* 289 */       return this.friday;
/*     */     }
/*     */ 
/*     */     public void setFriday(OperatingHoursBase value)
/*     */     {
/* 301 */       this.friday = value;
/*     */     }
/*     */ 
/*     */     public OperatingHoursBase getSaturday()
/*     */     {
/* 313 */       return this.saturday;
/*     */     }
/*     */ 
/*     */     public void setSaturday(OperatingHoursBase value)
/*     */     {
/* 325 */       this.saturday = value;
/*     */     }
/*     */ 
/*     */     public OperatingHoursBase getSunday()
/*     */     {
/* 337 */       return this.sunday;
/*     */     }
/*     */ 
/*     */     public void setSunday(OperatingHoursBase value)
/*     */     {
/* 349 */       this.sunday = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.FulfillmentCenter
 * JD-Core Version:    0.6.2
 */