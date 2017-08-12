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
/*    */ @XmlType(name="", propOrder={"color", "colorMap"})
/*    */ @XmlRootElement(name="ColorSpecification")
/*    */ public class ColorSpecification
/*    */ {
/*    */ 
/*    */   @XmlElement(name="Color", required=true)
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String color;
/*    */ 
/*    */   @XmlElement(name="ColorMap", required=true)
/*    */   protected String colorMap;
/*    */ 
/*    */   public String getColor()
/*    */   {
/* 56 */     return this.color;
/*    */   }
/*    */ 
/*    */   public void setColor(String value)
/*    */   {
/* 68 */     this.color = value;
/*    */   }
/*    */ 
/*    */   public String getColorMap()
/*    */   {
/* 80 */     return this.colorMap;
/*    */   }
/*    */ 
/*    */   public void setColorMap(String value)
/*    */   {
/* 92 */     this.colorMap = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ColorSpecification
 * JD-Core Version:    0.6.2
 */