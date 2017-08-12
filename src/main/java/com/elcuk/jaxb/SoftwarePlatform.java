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
/*    */ @XmlType(name="", propOrder={"hardwarePlatform", "systemRequirements"})
/*    */ @XmlRootElement(name="SoftwarePlatform")
/*    */ public class SoftwarePlatform
/*    */ {
/*    */ 
/*    */   @XmlElement(name="HardwarePlatform", required=true)
/*    */   protected HardwarePlatformType hardwarePlatform;
/*    */ 
/*    */   @XmlElement(name="SystemRequirements", defaultValue="N/A")
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String systemRequirements;
/*    */ 
/*    */   public HardwarePlatformType getHardwarePlatform()
/*    */   {
/* 56 */     return this.hardwarePlatform;
/*    */   }
/*    */ 
/*    */   public void setHardwarePlatform(HardwarePlatformType value)
/*    */   {
/* 68 */     this.hardwarePlatform = value;
/*    */   }
/*    */ 
/*    */   public String getSystemRequirements()
/*    */   {
/* 80 */     return this.systemRequirements;
/*    */   }
/*    */ 
/*    */   public void setSystemRequirements(String value)
/*    */   {
/* 92 */     this.systemRequirements = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SoftwarePlatform
 * JD-Core Version:    0.6.2
 */