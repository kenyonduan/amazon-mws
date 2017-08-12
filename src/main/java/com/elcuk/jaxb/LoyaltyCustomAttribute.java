/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.XmlValue;
/*    */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*    */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="LoyaltyCustomAttribute", propOrder={"value"})
/*    */ public class LoyaltyCustomAttribute
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String value;
/*    */ 
/*    */   @XmlAttribute(name="attributeName")
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String attributeName;
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 52 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(String value)
/*    */   {
/* 64 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public String getAttributeName()
/*    */   {
/* 76 */     return this.attributeName;
/*    */   }
/*    */ 
/*    */   public void setAttributeName(String value)
/*    */   {
/* 88 */     this.attributeName = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.LoyaltyCustomAttribute
 * JD-Core Version:    0.6.2
 */