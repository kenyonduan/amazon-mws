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
/*    */ @XmlType(name="", propOrder={"powerSource"})
/*    */ @XmlRootElement(name="TwoWayRadio")
/*    */ public class TwoWayRadio
/*    */ {
/*    */ 
/*    */   @XmlElement(name="PowerSource")
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String powerSource;
/*    */ 
/*    */   public String getPowerSource()
/*    */   {
/* 52 */     return this.powerSource;
/*    */   }
/*    */ 
/*    */   public void setPowerSource(String value)
/*    */   {
/* 64 */     this.powerSource = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TwoWayRadio
 * JD-Core Version:    0.6.2
 */