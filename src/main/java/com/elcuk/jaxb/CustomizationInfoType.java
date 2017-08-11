/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*    */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="CustomizationInfoType", propOrder={"type", "data"})
/*    */ public class CustomizationInfoType
/*    */ {
/*    */ 
/*    */   @XmlElement(name="Type", required=true)
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String type;
/*    */ 
/*    */   @XmlElement(name="Data", required=true)
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String data;
/*    */ 
/*    */   public String getType()
/*    */   {
/* 55 */     return this.type;
/*    */   }
/*    */ 
/*    */   public void setType(String value)
/*    */   {
/* 67 */     this.type = value;
/*    */   }
/*    */ 
/*    */   public String getData()
/*    */   {
/* 79 */     return this.data;
/*    */   }
/*    */ 
/*    */   public void setData(String value)
/*    */   {
/* 91 */     this.data = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CustomizationInfoType
 * JD-Core Version:    0.6.2
 */