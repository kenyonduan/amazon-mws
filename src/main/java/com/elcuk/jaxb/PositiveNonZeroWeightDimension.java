/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.XmlValue;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="PositiveNonZeroWeightDimension", propOrder={"value"})
/*    */ public class PositiveNonZeroWeightDimension
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   protected BigDecimal value;
/*    */ 
/*    */   @XmlAttribute(name="unitOfMeasure", required=true)
/*    */   protected WeightUnitOfMeasure unitOfMeasure;
/*    */ 
/*    */   public BigDecimal getValue()
/*    */   {
/* 49 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(BigDecimal value)
/*    */   {
/* 61 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public WeightUnitOfMeasure getUnitOfMeasure()
/*    */   {
/* 73 */     return this.unitOfMeasure;
/*    */   }
/*    */ 
/*    */   public void setUnitOfMeasure(WeightUnitOfMeasure value)
/*    */   {
/* 85 */     this.unitOfMeasure = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.PositiveNonZeroWeightDimension
 * JD-Core Version:    0.6.2
 */