/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"sku", "fulfillmentCenterID", "available", "quantity", "lookup", "restockDate", "fulfillmentLatency", "switchFulfillmentTo"})
/*     */ @XmlRootElement(name="Inventory")
/*     */ public class Inventory
/*     */ {
/*     */ 
/*     */   @XmlElement(name="SKU", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String sku;
/*     */ 
/*     */   @XmlElement(name="FulfillmentCenterID")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String fulfillmentCenterID;
/*     */ 
/*     */   @XmlElement(name="Available")
/*     */   protected Boolean available;
/*     */ 
/*     */   @XmlElement(name="Quantity")
/*     */   @XmlSchemaType(name="nonNegativeInteger")
/*     */   protected BigInteger quantity;
/*     */ 
/*     */   @XmlElement(name="Lookup")
/*     */   protected String lookup;
/*     */ 
/*     */   @XmlElement(name="RestockDate")
/*     */   @XmlSchemaType(name="date")
/*     */   protected XMLGregorianCalendar restockDate;
/*     */ 
/*     */   @XmlElement(name="FulfillmentLatency")
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger fulfillmentLatency;
/*     */ 
/*     */   @XmlElement(name="SwitchFulfillmentTo")
/*     */   protected String switchFulfillmentTo;
/*     */ 
/*     */   public String getSKU()
/*     */   {
/* 102 */     return this.sku;
/*     */   }
/*     */ 
/*     */   public void setSKU(String value)
/*     */   {
/* 114 */     this.sku = value;
/*     */   }
/*     */ 
/*     */   public String getFulfillmentCenterID()
/*     */   {
/* 126 */     return this.fulfillmentCenterID;
/*     */   }
/*     */ 
/*     */   public void setFulfillmentCenterID(String value)
/*     */   {
/* 138 */     this.fulfillmentCenterID = value;
/*     */   }
/*     */ 
/*     */   public Boolean isAvailable()
/*     */   {
/* 150 */     return this.available;
/*     */   }
/*     */ 
/*     */   public void setAvailable(Boolean value)
/*     */   {
/* 162 */     this.available = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getQuantity()
/*     */   {
/* 174 */     return this.quantity;
/*     */   }
/*     */ 
/*     */   public void setQuantity(BigInteger value)
/*     */   {
/* 186 */     this.quantity = value;
/*     */   }
/*     */ 
/*     */   public String getLookup()
/*     */   {
/* 198 */     return this.lookup;
/*     */   }
/*     */ 
/*     */   public void setLookup(String value)
/*     */   {
/* 210 */     this.lookup = value;
/*     */   }
/*     */ 
/*     */   public XMLGregorianCalendar getRestockDate()
/*     */   {
/* 222 */     return this.restockDate;
/*     */   }
/*     */ 
/*     */   public void setRestockDate(XMLGregorianCalendar value)
/*     */   {
/* 234 */     this.restockDate = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getFulfillmentLatency()
/*     */   {
/* 246 */     return this.fulfillmentLatency;
/*     */   }
/*     */ 
/*     */   public void setFulfillmentLatency(BigInteger value)
/*     */   {
/* 258 */     this.fulfillmentLatency = value;
/*     */   }
/*     */ 
/*     */   public String getSwitchFulfillmentTo()
/*     */   {
/* 270 */     return this.switchFulfillmentTo;
/*     */   }
/*     */ 
/*     */   public void setSwitchFulfillmentTo(String value)
/*     */   {
/* 282 */     this.switchFulfillmentTo = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Inventory
 * JD-Core Version:    0.6.2
 */