/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*    */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="", propOrder={"isRecalled", "recallDescription"})
/*    */ @XmlRootElement(name="Recall")
/*    */ public class Recall
/*    */ {
/*    */ 
/*    */   @XmlElement(name="IsRecalled")
/*    */   protected boolean isRecalled;
/*    */ 
/*    */   @XmlElement(name="RecallDescription", required=true)
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String recallDescription;
/*    */ 
/*    */   public boolean isIsRecalled()
/*    */   {
/* 58 */     return this.isRecalled;
/*    */   }
/*    */ 
/*    */   public void setIsRecalled(boolean value)
/*    */   {
/* 66 */     this.isRecalled = value;
/*    */   }
/*    */ 
/*    */   public String getRecallDescription()
/*    */   {
/* 78 */     return this.recallDescription;
/*    */   }
/*    */ 
/*    */   public void setRecallDescription(String value)
/*    */   {
/* 90 */     this.recallDescription = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Recall
 * JD-Core Version:    0.6.2
 */