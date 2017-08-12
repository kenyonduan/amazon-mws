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
/*    */ @XmlType(name="NameValuePair", propOrder={"name", "value"})
/*    */ public class NameValuePair
/*    */ {
/*    */ 
/*    */   @XmlElement(name="Name", required=true)
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String name;
/*    */ 
/*    */   @XmlElement(name="Value", required=true)
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String value;
/*    */ 
/*    */   public String getName()
/*    */   {
/* 55 */     return this.name;
/*    */   }
/*    */ 
/*    */   public void setName(String value)
/*    */   {
/* 67 */     this.name = value;
/*    */   }
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 79 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(String value)
/*    */   {
/* 91 */     this.value = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.NameValuePair
 * JD-Core Version:    0.6.2
 */