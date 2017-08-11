/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="", propOrder={"shipmentId", "numCartons", "carton"})
/*     */ @XmlRootElement(name="CartonContentsRequest")
/*     */ public class CartonContentsRequest
/*     */ {
/*     */ 
/*     */   @XmlElement(name="ShipmentId", required=true)
/*     */   protected String shipmentId;
/*     */ 
/*     */   @XmlElement(name="NumCartons", required=true)
/*     */   @XmlSchemaType(name="positiveInteger")
/*     */   protected BigInteger numCartons;
/*     */ 
/*     */   @XmlElement(name="Carton", required=true)
/*     */   protected List<Carton> carton;
/*     */ 
/*     */   public String getShipmentId()
/*     */   {
/* 101 */     return this.shipmentId;
/*     */   }
/*     */ 
/*     */   public void setShipmentId(String paramString)
/*     */   {
/* 113 */     this.shipmentId = paramString;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumCartons()
/*     */   {
/* 125 */     return this.numCartons;
/*     */   }
/*     */ 
/*     */   public void setNumCartons(BigInteger paramBigInteger)
/*     */   {
/* 137 */     this.numCartons = paramBigInteger;
/*     */   }
/*     */ 
/*     */   public List<Carton> getCarton()
/*     */   {
/* 163 */     if (this.carton == null) {
/* 164 */       this.carton = new ArrayList();
/*     */     }
/* 166 */     return this.carton;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"cartonId", "item"})
/*     */   public static class Carton
/*     */   {
/*     */ 
/*     */     @XmlElement(name="CartonId", required=true)
/*     */     protected String cartonId;
/*     */ 
/*     */     @XmlElement(name="Item", required=true)
/*     */     protected List<Item> item;
/*     */ 
/*     */     public String getCartonId()
/*     */     {
/* 230 */       return this.cartonId;
/*     */     }
/*     */ 
/*     */     public void setCartonId(String paramString)
/*     */     {
/* 242 */       this.cartonId = paramString;
/*     */     }
/*     */ 
/*     */     public List<Item> getItem()
/*     */     {
/* 268 */       if (this.item == null) {
/* 269 */         this.item = new ArrayList();
/*     */       }
/* 271 */       return this.item;
/*     */     }
/*     */ 
/*     */     @XmlAccessorType(XmlAccessType.FIELD)
/*     */     @XmlType(name="", propOrder={"sku", "quantityShipped", "quantityInCase", "expirationDate"})
/*     */     public static class Item
/*     */     {
/*     */ 
/*     */       @XmlElement(name="SKU", required=true)
/*     */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */       protected String sku;
/*     */ 
/*     */       @XmlElement(name="QuantityShipped", required=true)
/*     */       @XmlSchemaType(name="positiveInteger")
/*     */       protected BigInteger quantityShipped;
/*     */ 
/*     */       @XmlElement(name="QuantityInCase", required=true, defaultValue="1")
/*     */       @XmlSchemaType(name="positiveInteger")
/*     */       protected BigInteger quantityInCase;
/*     */ 
/*     */       @XmlElement(name="ExpirationDate")
/*     */       @XmlSchemaType(name="date")
/*     */       protected XMLGregorianCalendar expirationDate;
/*     */ 
/*     */       public String getSKU()
/*     */       {
/* 328 */         return this.sku;
/*     */       }
/*     */ 
/*     */       public void setSKU(String paramString)
/*     */       {
/* 340 */         this.sku = paramString;
/*     */       }
/*     */ 
/*     */       public BigInteger getQuantityShipped()
/*     */       {
/* 352 */         return this.quantityShipped;
/*     */       }
/*     */ 
/*     */       public void setQuantityShipped(BigInteger paramBigInteger)
/*     */       {
/* 364 */         this.quantityShipped = paramBigInteger;
/*     */       }
/*     */ 
/*     */       public BigInteger getQuantityInCase()
/*     */       {
/* 376 */         return this.quantityInCase;
/*     */       }
/*     */ 
/*     */       public void setQuantityInCase(BigInteger paramBigInteger)
/*     */       {
/* 388 */         this.quantityInCase = paramBigInteger;
/*     */       }
/*     */ 
/*     */       public XMLGregorianCalendar getExpirationDate()
/*     */       {
/* 400 */         return this.expirationDate;
/*     */       }
/*     */ 
/*     */       public void setExpirationDate(XMLGregorianCalendar paramXMLGregorianCalendar)
/*     */       {
/* 412 */         this.expirationDate = paramXMLGregorianCalendar;
/*     */       }
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CartonContentsRequest
 * JD-Core Version:    0.6.2
 */