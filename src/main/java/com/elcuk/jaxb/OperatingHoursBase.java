/*    */ package com.elcuk.jaxb;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
/*    */ import javax.xml.bind.annotation.XmlSchemaType;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import javax.xml.datatype.XMLGregorianCalendar;
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name="OperatingHoursBase", propOrder={"open", "close"})
/*    */ public class OperatingHoursBase
/*    */ {
/*    */ 
/*    */   @XmlElement(name="Open", required=true)
/*    */   @XmlSchemaType(name="time")
/*    */   protected XMLGregorianCalendar open;
/*    */ 
/*    */   @XmlElement(name="Close", required=true)
/*    */   @XmlSchemaType(name="time")
/*    */   protected XMLGregorianCalendar close;
/*    */ 
/*    */   public XMLGregorianCalendar getOpen()
/*    */   {
/* 55 */     return this.open;
/*    */   }
/*    */ 
/*    */   public void setOpen(XMLGregorianCalendar value)
/*    */   {
/* 67 */     this.open = value;
/*    */   }
/*    */ 
/*    */   public XMLGregorianCalendar getClose()
/*    */   {
/* 79 */     return this.close;
/*    */   }
/*    */ 
/*    */   public void setClose(XMLGregorianCalendar value)
/*    */   {
/* 91 */     this.close = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.OperatingHoursBase
 * JD-Core Version:    0.6.2
 */