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
/*    */ @XmlType(name="EmailAddressType", propOrder={"value"})
/*    */ public class EmailAddressType
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String value;
/*    */ 
/*    */   @XmlAttribute(name="PreferredFormat")
/*    */   protected String preferredFormat;
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 58 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(String value)
/*    */   {
/* 70 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public String getPreferredFormat()
/*    */   {
/* 82 */     return this.preferredFormat;
/*    */   }
/*    */ 
/*    */   public void setPreferredFormat(String value)
/*    */   {
/* 94 */     this.preferredFormat = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.EmailAddressType
 * JD-Core Version:    0.6.2
 */