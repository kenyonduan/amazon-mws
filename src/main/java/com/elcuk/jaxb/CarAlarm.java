/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"numberOfSpeakers"})
/*    */ @XmlRootElement(name="CarAlarm")
/*    */ public class CarAlarm
/*    */ {
/*    */ 
/*    */   @XmlElement(name="NumberOfSpeakers")
/*    */   @XmlSchemaType(name="positiveInteger")
/*    */   protected BigInteger numberOfSpeakers;
/*    */ 
/*    */   public BigInteger getNumberOfSpeakers()
/*    */   {
/* 52 */     return this.numberOfSpeakers;
/*    */   }
/*    */ 
/*    */   public void setNumberOfSpeakers(BigInteger value)
/*    */   {
/* 64 */     this.numberOfSpeakers = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CarAlarm
 * JD-Core Version:    0.6.2
 */