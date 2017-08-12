/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"cost"})
/*    */ @XmlRootElement(name="Amazon-Vendor-Only")
/*    */ public class AmazonVendorOnly
/*    */ {
/*    */ 
/*    */   @XmlElement(name="Cost", required=true)
/*    */   protected CurrencyAmount cost;
/*    */ 
/*    */   public CurrencyAmount getCost()
/*    */   {
/* 49 */     return this.cost;
/*    */   }
/*    */ 
/*    */   public void setCost(CurrencyAmount value)
/*    */   {
/* 61 */     this.cost = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AmazonVendorOnly
 * JD-Core Version:    0.6.2
 */