/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"forwardFacingMaximumWeight", "forwardFacingMinimumWeight"})
/*    */ @XmlRootElement(name="ForwardFacingWeight")
/*    */ public class ForwardFacingWeight
/*    */ {
/*    */ 
/*    */   @XmlElement(name="ForwardFacingMaximumWeight")
/*    */   protected WeightDimension forwardFacingMaximumWeight;
/*    */ 
/*    */   @XmlElement(name="ForwardFacingMinimumWeight")
/*    */   protected WeightDimension forwardFacingMinimumWeight;
/*    */ 
/*    */   public WeightDimension getForwardFacingMaximumWeight()
/*    */   {
/* 53 */     return this.forwardFacingMaximumWeight;
/*    */   }
/*    */ 
/*    */   public void setForwardFacingMaximumWeight(WeightDimension value)
/*    */   {
/* 65 */     this.forwardFacingMaximumWeight = value;
/*    */   }
/*    */ 
/*    */   public WeightDimension getForwardFacingMinimumWeight()
/*    */   {
/* 77 */     return this.forwardFacingMinimumWeight;
/*    */   }
/*    */ 
/*    */   public void setForwardFacingMinimumWeight(WeightDimension value)
/*    */   {
/* 89 */     this.forwardFacingMinimumWeight = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ForwardFacingWeight
 * JD-Core Version:    0.6.2
 */