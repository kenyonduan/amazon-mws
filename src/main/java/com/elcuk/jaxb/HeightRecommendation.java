/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"minimumHeightRecommended", "maximumHeightRecommended"})
/*    */ @XmlRootElement(name="HeightRecommendation")
/*    */ public class HeightRecommendation
/*    */ {
/*    */ 
/*    */   @XmlElement(name="MinimumHeightRecommended")
/*    */   protected LengthDimension minimumHeightRecommended;
/*    */ 
/*    */   @XmlElement(name="MaximumHeightRecommended")
/*    */   protected LengthDimension maximumHeightRecommended;
/*    */ 
/*    */   public LengthDimension getMinimumHeightRecommended()
/*    */   {
/* 53 */     return this.minimumHeightRecommended;
/*    */   }
/*    */ 
/*    */   public void setMinimumHeightRecommended(LengthDimension value)
/*    */   {
/* 65 */     this.minimumHeightRecommended = value;
/*    */   }
/*    */ 
/*    */   public LengthDimension getMaximumHeightRecommended()
/*    */   {
/* 77 */     return this.maximumHeightRecommended;
/*    */   }
/*    */ 
/*    */   public void setMaximumHeightRecommended(LengthDimension value)
/*    */   {
/* 89 */     this.maximumHeightRecommended = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.HeightRecommendation
 * JD-Core Version:    0.6.2
 */