/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"shoulderHarnessMaximumHeight", "shoulderHarnessMinimumHeight"})
/*    */ @XmlRootElement(name="ShoulderHarnessHeight")
/*    */ public class ShoulderHarnessHeight
/*    */ {
/*    */ 
/*    */   @XmlElement(name="ShoulderHarnessMaximumHeight")
/*    */   protected LengthDimension shoulderHarnessMaximumHeight;
/*    */ 
/*    */   @XmlElement(name="ShoulderHarnessMinimumHeight")
/*    */   protected LengthDimension shoulderHarnessMinimumHeight;
/*    */ 
/*    */   public LengthDimension getShoulderHarnessMaximumHeight()
/*    */   {
/* 53 */     return this.shoulderHarnessMaximumHeight;
/*    */   }
/*    */ 
/*    */   public void setShoulderHarnessMaximumHeight(LengthDimension value)
/*    */   {
/* 65 */     this.shoulderHarnessMaximumHeight = value;
/*    */   }
/*    */ 
/*    */   public LengthDimension getShoulderHarnessMinimumHeight()
/*    */   {
/* 77 */     return this.shoulderHarnessMinimumHeight;
/*    */   }
/*    */ 
/*    */   public void setShoulderHarnessMinimumHeight(LengthDimension value)
/*    */   {
/* 89 */     this.shoulderHarnessMinimumHeight = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ShoulderHarnessHeight
 * JD-Core Version:    0.6.2
 */