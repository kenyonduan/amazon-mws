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
/*    */ @XmlType(name="", propOrder={"mediaLayers"})
/*    */ @XmlRootElement(name="CEBlankMedia")
/*    */ public class CEBlankMedia
/*    */ {
/*    */ 
/*    */   @XmlElement(name="MediaLayers")
/*    */   @XmlSchemaType(name="positiveInteger")
/*    */   protected BigInteger mediaLayers;
/*    */ 
/*    */   public BigInteger getMediaLayers()
/*    */   {
/* 52 */     return this.mediaLayers;
/*    */   }
/*    */ 
/*    */   public void setMediaLayers(BigInteger value)
/*    */   {
/* 64 */     this.mediaLayers = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CEBlankMedia
 * JD-Core Version:    0.6.2
 */