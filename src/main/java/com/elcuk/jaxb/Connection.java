/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*    */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="Connection", propOrder={"connectionType", "numberOfConnections"})
/*    */ public class Connection
/*    */ {
/*    */ 
/*    */   @XmlElement(name="ConnectionType", required=true)
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String connectionType;
/*    */ 
/*    */   @XmlElement(name="NumberOfConnections", required=true)
/*    */   @XmlSchemaType(name="positiveInteger")
/*    */   protected BigInteger numberOfConnections;
/*    */ 
/*    */   public String getConnectionType()
/*    */   {
/* 57 */     return this.connectionType;
/*    */   }
/*    */ 
/*    */   public void setConnectionType(String value)
/*    */   {
/* 69 */     this.connectionType = value;
/*    */   }
/*    */ 
/*    */   public BigInteger getNumberOfConnections()
/*    */   {
/* 81 */     return this.numberOfConnections;
/*    */   }
/*    */ 
/*    */   public void setNumberOfConnections(BigInteger value)
/*    */   {
/* 93 */     this.numberOfConnections = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Connection
 * JD-Core Version:    0.6.2
 */