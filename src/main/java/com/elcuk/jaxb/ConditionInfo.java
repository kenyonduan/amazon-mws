/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*    */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="ConditionInfo", propOrder={"conditionType", "conditionNote"})
/*    */ public class ConditionInfo
/*    */ {
/*    */ 
/*    */   @XmlElement(name="ConditionType", required=true)
/*    */   protected String conditionType;
/*    */ 
/*    */   @XmlElement(name="ConditionNote")
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String conditionNote;
/*    */ 
/*    */   public String getConditionType()
/*    */   {
/* 54 */     return this.conditionType;
/*    */   }
/*    */ 
/*    */   public void setConditionType(String value)
/*    */   {
/* 66 */     this.conditionType = value;
/*    */   }
/*    */ 
/*    */   public String getConditionNote()
/*    */   {
/* 78 */     return this.conditionNote;
/*    */   }
/*    */ 
/*    */   public void setConditionNote(String value)
/*    */   {
/* 90 */     this.conditionNote = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ConditionInfo
 * JD-Core Version:    0.6.2
 */