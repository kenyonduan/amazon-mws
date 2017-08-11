/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.XmlValue;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="TabletActiveSurfaceAreaDimension", propOrder={"value"})
/*    */ public class TabletActiveSurfaceAreaDimension
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   protected String value;
/*    */ 
/*    */   @XmlAttribute(name="unitOfMeasure", required=true)
/*    */   protected LengthUnitOfMeasure unitOfMeasure;
/*    */ 
/*    */   public String getValue()
/*    */   {
/* 48 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(String value)
/*    */   {
/* 60 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public LengthUnitOfMeasure getUnitOfMeasure()
/*    */   {
/* 72 */     return this.unitOfMeasure;
/*    */   }
/*    */ 
/*    */   public void setUnitOfMeasure(LengthUnitOfMeasure value)
/*    */   {
/* 84 */     this.unitOfMeasure = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TabletActiveSurfaceAreaDimension
 * JD-Core Version:    0.6.2
 */