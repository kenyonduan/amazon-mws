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
/*    */ @XmlType(name="TabletDataRateDimension", propOrder={"value"})
/*    */ public class TabletDataRateDimension
/*    */ {
/*    */ 
/*    */   @XmlValue
/*    */   protected BigInteger value;
/*    */ 
/*    */   @XmlAttribute(name="unitOfMeasure", required=true)
/*    */   protected TabletDataRateUnitOfMeasure unitOfMeasure;
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
/*    */   public TabletDataRateUnitOfMeasure getUnitOfMeasure()
/*    */   {
/* 73 */     return this.unitOfMeasure;
/*    */   }
/*    */ 
/*    */   public void setUnitOfMeasure(TabletDataRateUnitOfMeasure value)
/*    */   {
/* 85 */     this.unitOfMeasure = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.TabletDataRateDimension
 * JD-Core Version:    0.6.2
 */