/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*    */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"antennaDescription", "antennaLocation"})
/*    */ @XmlRootElement(name="Antenna")
/*    */ public class Antenna
/*    */ {
/*    */ 
/*    */   @XmlElement(name="AntennaDescription")
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String antennaDescription;
/*    */ 
/*    */   @XmlElement(name="AntennaLocation")
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String antennaLocation;
/*    */ 
/*    */   public String getAntennaDescription()
/*    */   {
/* 57 */     return this.antennaDescription;
/*    */   }
/*    */ 
/*    */   public void setAntennaDescription(String value)
/*    */   {
/* 69 */     this.antennaDescription = value;
/*    */   }
/*    */ 
/*    */   public String getAntennaLocation()
/*    */   {
/* 81 */     return this.antennaLocation;
/*    */   }
/*    */ 
/*    */   public void setAntennaLocation(String value)
/*    */   {
/* 93 */     this.antennaLocation = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Antenna
 * JD-Core Version:    0.6.2
 */