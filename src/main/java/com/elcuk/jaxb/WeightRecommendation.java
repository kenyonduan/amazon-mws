/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"minimumManufacturerWeightRecommended", "maximumManufacturerWeightRecommended"})
/*    */ @XmlRootElement(name="WeightRecommendation")
/*    */ public class WeightRecommendation
/*    */ {
/*    */ 
/*    */   @XmlElement(name="MinimumManufacturerWeightRecommended")
/*    */   protected WeightIntegerDimension minimumManufacturerWeightRecommended;
/*    */ 
/*    */   @XmlElement(name="MaximumManufacturerWeightRecommended")
/*    */   protected WeightIntegerDimension maximumManufacturerWeightRecommended;
/*    */ 
/*    */   public WeightIntegerDimension getMinimumManufacturerWeightRecommended()
/*    */   {
/* 53 */     return this.minimumManufacturerWeightRecommended;
/*    */   }
/*    */ 
/*    */   public void setMinimumManufacturerWeightRecommended(WeightIntegerDimension value)
/*    */   {
/* 65 */     this.minimumManufacturerWeightRecommended = value;
/*    */   }
/*    */ 
/*    */   public WeightIntegerDimension getMaximumManufacturerWeightRecommended()
/*    */   {
/* 77 */     return this.maximumManufacturerWeightRecommended;
/*    */   }
/*    */ 
/*    */   public void setMaximumManufacturerWeightRecommended(WeightIntegerDimension value)
/*    */   {
/* 89 */     this.maximumManufacturerWeightRecommended = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WeightRecommendation
 * JD-Core Version:    0.6.2
 */