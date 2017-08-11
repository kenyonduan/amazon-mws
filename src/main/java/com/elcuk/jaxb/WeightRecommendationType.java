/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="WeightRecommendationType", propOrder={"maximumWeightRecommendation", "minimumWeightRecommendation"})
/*    */ public class WeightRecommendationType
/*    */ {
/*    */ 
/*    */   @XmlElement(name="MaximumWeightRecommendation")
/*    */   protected PositiveWeightDimension maximumWeightRecommendation;
/*    */ 
/*    */   @XmlElement(name="MinimumWeightRecommendation")
/*    */   protected PositiveWeightDimension minimumWeightRecommendation;
/*    */ 
/*    */   public PositiveWeightDimension getMaximumWeightRecommendation()
/*    */   {
/* 51 */     return this.maximumWeightRecommendation;
/*    */   }
/*    */ 
/*    */   public void setMaximumWeightRecommendation(PositiveWeightDimension value)
/*    */   {
/* 63 */     this.maximumWeightRecommendation = value;
/*    */   }
/*    */ 
/*    */   public PositiveWeightDimension getMinimumWeightRecommendation()
/*    */   {
/* 75 */     return this.minimumWeightRecommendation;
/*    */   }
/*    */ 
/*    */   public void setMinimumWeightRecommendation(PositiveWeightDimension value)
/*    */   {
/* 87 */     this.minimumWeightRecommendation = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.WeightRecommendationType
 * JD-Core Version:    0.6.2
 */