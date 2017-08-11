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
/*    */ @XmlType(name="", propOrder={"holderCapacity"})
/*    */ @XmlRootElement(name="MediaStorage")
/*    */ public class MediaStorage
/*    */ {
/*    */ 
/*    */   @XmlElement(name="HolderCapacity")
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String holderCapacity;
/*    */ 
/*    */   public String getHolderCapacity()
/*    */   {
/* 52 */     return this.holderCapacity;
/*    */   }
/*    */ 
/*    */   public void setHolderCapacity(String value)
/*    */   {
/* 64 */     this.holderCapacity = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.MediaStorage
 * JD-Core Version:    0.6.2
 */