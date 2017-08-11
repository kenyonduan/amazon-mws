/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlAttribute;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.XmlValue;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="FrequencyIntegerDimension", propOrder={"value"})
/*    */ public class FrequencyIntegerDimension
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   @XmlSchemaType(name="positiveInteger")
/*    */   protected BigInteger value;
/*    */ 
/*    */   @XmlAttribute(name="unitOfMeasure", required=true)
/*    */   protected FrequencyUnitOfMeasure unitOfMeasure;
/*    */ 
/*    */   public BigInteger getValue()
/*    */   {
/* 51 */     return this.value;
/*    */   }
/*    */ 
/*    */   public void setValue(BigInteger value)
/*    */   {
/* 63 */     this.value = value;
/*    */   }
/*    */ 
/*    */   public FrequencyUnitOfMeasure getUnitOfMeasure()
/*    */   {
/* 75 */     return this.unitOfMeasure;
/*    */   }
/*    */ 
/*    */   public void setUnitOfMeasure(FrequencyUnitOfMeasure value)
/*    */   {
/* 87 */     this.unitOfMeasure = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.FrequencyIntegerDimension
 * JD-Core Version:    0.6.2
 */