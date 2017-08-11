/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"rearFacingMaximumWeight", "rearFacingMinimumWeight"})
/*    */ @XmlRootElement(name="RearFacingWeight")
/*    */ public class RearFacingWeight
/*    */ {
/*    */ 
/*    */   @XmlElement(name="RearFacingMaximumWeight")
/*    */   protected WeightDimension rearFacingMaximumWeight;
/*    */ 
/*    */   @XmlElement(name="RearFacingMinimumWeight")
/*    */   protected WeightDimension rearFacingMinimumWeight;
/*    */ 
/*    */   public WeightDimension getRearFacingMaximumWeight()
/*    */   {
/* 53 */     return this.rearFacingMaximumWeight;
/*    */   }
/*    */ 
/*    */   public void setRearFacingMaximumWeight(WeightDimension value)
/*    */   {
/* 65 */     this.rearFacingMaximumWeight = value;
/*    */   }
/*    */ 
/*    */   public WeightDimension getRearFacingMinimumWeight()
/*    */   {
/* 77 */     return this.rearFacingMinimumWeight;
/*    */   }
/*    */ 
/*    */   public void setRearFacingMinimumWeight(WeightDimension value)
/*    */   {
/* 89 */     this.rearFacingMinimumWeight = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.RearFacingWeight
 * JD-Core Version:    0.6.2
 */