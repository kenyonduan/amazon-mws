/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.XmlValue;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="NoiseLevelSixDigitDimension", propOrder={"value"})
/*    */ public class NoiseLevelSixDigitDimension
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   protected BigInteger value;
/*    */ 
/*    */   @XmlAttribute(name="unitOfMeasure", required=true)
/*    */   protected NoiseLevelUnitOfMeasure unitOfMeasure;
/*    */ 
/*    */   public BigInteger getValue()
/*    */   {
/* 49 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(BigInteger value)
/*    */   {
/* 61 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public NoiseLevelUnitOfMeasure getUnitOfMeasure()
/*    */   {
/* 73 */     return this.unitOfMeasure;
/*    */   }
/*    */ 
/*    */   public void setUnitOfMeasure(NoiseLevelUnitOfMeasure value)
/*    */   {
/* 85 */     this.unitOfMeasure = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.NoiseLevelSixDigitDimension
 * JD-Core Version:    0.6.2
 */