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
/*    */ @XmlType(name="AirflowDimension", propOrder={"value"})
/*    */ public class AirflowDimension
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   protected BigInteger value;
/*    */ 
/*    */   @XmlAttribute(name="unitOfMeasure", required=true)
/*    */   protected AirflowUnitOfMeasure unitOfMeasure;
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
/*    */   public AirflowUnitOfMeasure getUnitOfMeasure()
/*    */   {
/* 73 */     return this.unitOfMeasure;
/*    */   }
/*    */ 
/*    */   public void setUnitOfMeasure(AirflowUnitOfMeasure value)
/*    */   {
/* 85 */     this.unitOfMeasure = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AirflowDimension
 * JD-Core Version:    0.6.2
 */