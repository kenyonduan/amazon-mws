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
/*     */ @XmlType(name="", propOrder={"header", "messageType", "marketplaceName", "purgeAndReplace", "effectiveDate", "message"})
/*     */ @XmlRootElement(name="AmazonEnvelope")
/*     */ public class AmazonEnvelope
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Header", required=true)
/*     */   protected Header header;
/*     */ 
/*     */   @XmlElement(name="MessageType", required=true)
/*     */   protected String messageType;
/*     */ 
/*     */   @XmlElement(name="MarketplaceName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String marketplaceName;
/*     */ 
/*     */   @XmlElement(name="PurgeAndReplace")
/*     */   protected Boolean purgeAndReplace;
/*     */ 
/*     */   @XmlElement(name="EffectiveDate")
/*     */   @XmlSchemaType(name="dateTime")
/*     */   protected XMLGregorianCalendar effectiveDate;
/*     */ 
/*     */   @XmlElement(name="Message", required=true)
/*     */   protected List<Message> message;
/*     */ 
/*     */   public Header getHeader()
/*     */   {
/* 123 */     return this.header;
/*     */   }
/*     */ 
/*     */   public void setHeader(Header value)
/*     */   {
/* 133 */     this.header = value;
/*     */   }
/*     */ 
/*     */   public String getMessageType()
/*     */   {
/* 143 */     return this.messageType;
/*     */   }
/*     */ 
/*     */   public void setMessageType(String value)
/*     */   {
/* 153 */     this.messageType = value;
/*     */   }
/*     */ 
/*     */   public String getMarketplaceName()
/*     */   {
/* 166 */     return this.marketplaceName;
/*     */   }
/*     */ 
/*     */   public void setMarketplaceName(String value)
/*     */   {
/* 176 */     this.marketplaceName = value;
/*     */   }
/*     */ 
/*     */   public Boolean isPurgeAndReplace()
/*     */   {
/* 186 */     return this.purgeAndReplace;
/*     */   }
/*     */ 
/*     */   public void setPurgeAndReplace(Boolean value)
/*     */   {
/* 196 */     this.purgeAndReplace = value;
/*     */   }
/*     */ 
/*     */   public XMLGregorianCalendar getEffectiveDate()
/*     */   {
/* 206 */     return this.effectiveDate;
/*     */   }
/*     */ 
/*     */   public void setEffectiveDate(XMLGregorianCalendar value)
/*     */   {
/* 216 */     this.effectiveDate = value;
/*     */   }
/*     */ 
/*     */   public List<Message> getMessage()
/*     */   {
/* 240 */     if (this.message == null) {
/* 241 */       this.message = new ArrayList();
/*     */     }
/* 243 */     return this.message;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"messageID", "operationType", "fulfillmentCenter", "inventory", "listings", "orderAcknowledgement", "orderAdjustment", "orderFulfillment", "override", "price", "processingReport", "product", "productImage", "relationship", "settlementReport", "cartonContentsRequest"})
/*     */   public static class Message
/*     */   {
/*     */ 
/*     */     @XmlElement(name="MessageID", required=true)
/*     */     protected BigInteger messageID;
/*     */ 
/*     */     @XmlElement(name="OperationType")
/*     */     protected String operationType;
/*     */ 
/*     */     @XmlElement(name="FulfillmentCenter")
/*     */     protected FulfillmentCenter fulfillmentCenter;
/*     */ 
/*     */     @XmlElement(name="Inventory")
/*     */     protected Inventory inventory;
/*     */ 
/*     */     @XmlElement(name="Listings")
/*     */     protected Listings listings;
/*     */ 
/*     */     @XmlElement(name="OrderAcknowledgement")
/*     */     protected OrderAcknowledgement orderAcknowledgement;
/*     */ 
/*     */     @XmlElement(name="OrderAdjustment")
/*     */     protected OrderAdjustment orderAdjustment;
/*     */ 
/*     */     @XmlElement(name="OrderFulfillment")
/*     */     protected OrderFulfillment orderFulfillment;
/*     */ 
/*     */     @XmlElement(name="Override")
/*     */     protected Override override;
/*     */ 
/*     */     @XmlElement(name="Price")
/*     */     protected Price price;
/*     */ 
/*     */     @XmlElement(name="ProcessingReport")
/*     */     protected ProcessingReport processingReport;
/*     */ 
/*     */     @XmlElement(name="Product")
/*     */     protected Product product;
/*     */ 
/*     */     @XmlElement(name="ProductImage")
/*     */     protected ProductImage productImage;
/*     */ 
/*     */     @XmlElement(name="Relationship")
/*     */     protected Relationship relationship;
/*     */ 
/*     */     @XmlElement(name="SettlementReport")
/*     */     protected SettlementReport settlementReport;
/*     */ 
/*     */     @XmlElement(name="CartonContentsRequest")
/*     */     protected CartonContentsRequest cartonContentsRequest;
/*     */ 
/*     */     public BigInteger getMessageID()
/*     */     {
/* 350 */       return this.messageID;
/*     */     }
/*     */ 
/*     */     public void setMessageID(BigInteger value)
/*     */     {
/* 360 */       this.messageID = value;
/*     */     }
/*     */ 
/*     */     public String getOperationType()
/*     */     {
/* 370 */       return this.operationType;
/*     */     }
/*     */ 
/*     */     public void setOperationType(String value)
/*     */     {
/* 380 */       this.operationType = value;
/*     */     }
/*     */ 
/*     */     public FulfillmentCenter getFulfillmentCenter()
/*     */     {
/* 390 */       return this.fulfillmentCenter;
/*     */     }
/*     */ 
/*     */     public void setFulfillmentCenter(FulfillmentCenter value)
/*     */     {
/* 400 */       this.fulfillmentCenter = value;
/*     */     }
/*     */ 
/*     */     public Inventory getInventory()
/*     */     {
/* 410 */       return this.inventory;
/*     */     }
/*     */ 
/*     */     public void setInventory(Inventory value)
/*     */     {
/* 420 */       this.inventory = value;
/*     */     }
/*     */ 
/*     */     public Listings getListings()
/*     */     {
/* 430 */       return this.listings;
/*     */     }
/*     */ 
/*     */     public void setListings(Listings value)
/*     */     {
/* 440 */       this.listings = value;
/*     */     }
/*     */ 
/*     */     public OrderAcknowledgement getOrderAcknowledgement()
/*     */     {
/* 450 */       return this.orderAcknowledgement;
/*     */     }
/*     */ 
/*     */     public void setOrderAcknowledgement(OrderAcknowledgement value)
/*     */     {
/* 460 */       this.orderAcknowledgement = value;
/*     */     }
/*     */ 
/*     */     public OrderAdjustment getOrderAdjustment()
/*     */     {
/* 470 */       return this.orderAdjustment;
/*     */     }
/*     */ 
/*     */     public void setOrderAdjustment(OrderAdjustment value)
/*     */     {
/* 480 */       this.orderAdjustment = value;
/*     */     }
/*     */ 
/*     */     public OrderFulfillment getOrderFulfillment()
/*     */     {
/* 490 */       return this.orderFulfillment;
/*     */     }
/*     */ 
/*     */     public void setOrderFulfillment(OrderFulfillment value)
/*     */     {
/* 500 */       this.orderFulfillment = value;
/*     */     }
/*     */ 
/*     */     public Override getOverride()
/*     */     {
/* 510 */       return this.override;
/*     */     }
/*     */ 
/*     */     public void setOverride(Override value)
/*     */     {
/* 520 */       this.override = value;
/*     */     }
/*     */ 
/*     */     public Price getPrice()
/*     */     {
/* 530 */       return this.price;
/*     */     }
/*     */ 
/*     */     public void setPrice(Price value)
/*     */     {
/* 540 */       this.price = value;
/*     */     }
/*     */ 
/*     */     public ProcessingReport getProcessingReport()
/*     */     {
/* 550 */       return this.processingReport;
/*     */     }
/*     */ 
/*     */     public void setProcessingReport(ProcessingReport value)
/*     */     {
/* 560 */       this.processingReport = value;
/*     */     }
/*     */ 
/*     */     public Product getProduct()
/*     */     {
/* 570 */       return this.product;
/*     */     }
/*     */ 
/*     */     public void setProduct(Product value)
/*     */     {
/* 580 */       this.product = value;
/*     */     }
/*     */ 
/*     */     public ProductImage getProductImage()
/*     */     {
/* 590 */       return this.productImage;
/*     */     }
/*     */ 
/*     */     public void setProductImage(ProductImage value)
/*     */     {
/* 600 */       this.productImage = value;
/*     */     }
/*     */ 
/*     */     public Relationship getRelationship()
/*     */     {
/* 610 */       return this.relationship;
/*     */     }
/*     */ 
/*     */     public void setRelationship(Relationship value)
/*     */     {
/* 620 */       this.relationship = value;
/*     */     }
/*     */ 
/*     */     public SettlementReport getSettlementReport()
/*     */     {
/* 630 */       return this.settlementReport;
/*     */     }
/*     */ 
/*     */     public void setSettlementReport(SettlementReport value)
/*     */     {
/* 640 */       this.settlementReport = value;
/*     */     }
/*     */ 
/*     */     public CartonContentsRequest getCartonContentsRequest()
/*     */     {
/* 650 */       return this.cartonContentsRequest;
/*     */     }
/*     */ 
/*     */     public void setCartonContentsRequest(CartonContentsRequest value)
/*     */     {
/* 660 */       this.cartonContentsRequest = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AmazonEnvelope
 * JD-Core Version:    0.6.2
 */