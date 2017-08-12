/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlSchemaType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ import javax.xml.datatype.XMLGregorianCalendar;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"settlementData", "order", "adjustment", "otherFee", "otherTransaction", "miscEvent"})
/*      */ @XmlRootElement(name="SettlementReport")
/*      */ public class SettlementReport
/*      */ {
/*      */ 
/*      */   @XmlElement(name="SettlementData", required=true)
/*      */   protected SettlementData settlementData;
/*      */ 
/*      */   @XmlElement(name="Order")
/*      */   protected List<Order> order;
/*      */ 
/*      */   @XmlElement(name="Adjustment")
/*      */   protected List<Adjustment> adjustment;
/*      */ 
/*      */   @XmlElement(name="OtherFee")
/*      */   protected List<OtherFee> otherFee;
/*      */ 
/*      */   @XmlElement(name="OtherTransaction")
/*      */   protected List<OtherTransaction> otherTransaction;
/*      */ 
/*      */   @XmlElement(name="MiscEvent")
/*      */   protected List<MiscEvent> miscEvent;
/*      */ 
/*      */   public SettlementData getSettlementData()
/*      */   {
/*  249 */     return this.settlementData;
/*      */   }
/*      */ 
/*      */   public void setSettlementData(SettlementData value)
/*      */   {
/*  261 */     this.settlementData = value;
/*      */   }
/*      */ 
/*      */   public List<Order> getOrder()
/*      */   {
/*  287 */     if (this.order == null) {
/*  288 */       this.order = new ArrayList();
/*      */     }
/*  290 */     return this.order;
/*      */   }
/*      */ 
/*      */   public List<Adjustment> getAdjustment()
/*      */   {
/*  316 */     if (this.adjustment == null) {
/*  317 */       this.adjustment = new ArrayList();
/*      */     }
/*  319 */     return this.adjustment;
/*      */   }
/*      */ 
/*      */   public List<OtherFee> getOtherFee()
/*      */   {
/*  345 */     if (this.otherFee == null) {
/*  346 */       this.otherFee = new ArrayList();
/*      */     }
/*  348 */     return this.otherFee;
/*      */   }
/*      */ 
/*      */   public List<OtherTransaction> getOtherTransaction()
/*      */   {
/*  374 */     if (this.otherTransaction == null) {
/*  375 */       this.otherTransaction = new ArrayList();
/*      */     }
/*  377 */     return this.otherTransaction;
/*      */   }
/*      */ 
/*      */   public List<MiscEvent> getMiscEvent()
/*      */   {
/*  403 */     if (this.miscEvent == null) {
/*  404 */       this.miscEvent = new ArrayList();
/*      */     }
/*  406 */     return this.miscEvent;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"amazonSettlementID", "totalAmount", "startDate", "endDate", "depositDate"})
/*      */   public static class SettlementData
/*      */   {
/*      */ 
/*      */     @XmlElement(name="AmazonSettlementID", required=true)
/*      */     protected BigInteger amazonSettlementID;
/*      */ 
/*      */     @XmlElement(name="TotalAmount", required=true)
/*      */     protected CurrencyAmount totalAmount;
/*      */ 
/*      */     @XmlElement(name="StartDate", required=true)
/*      */     @XmlSchemaType(name="dateTime")
/*      */     protected XMLGregorianCalendar startDate;
/*      */ 
/*      */     @XmlElement(name="EndDate", required=true)
/*      */     @XmlSchemaType(name="dateTime")
/*      */     protected XMLGregorianCalendar endDate;
/*      */ 
/*      */     @XmlElement(name="DepositDate", required=true)
/*      */     @XmlSchemaType(name="dateTime")
/*      */     protected XMLGregorianCalendar depositDate;
/*      */ 
/*      */     public BigInteger getAmazonSettlementID()
/*      */     {
/* 2672 */       return this.amazonSettlementID;
/*      */     }
/*      */ 
/*      */     public void setAmazonSettlementID(BigInteger value)
/*      */     {
/* 2684 */       this.amazonSettlementID = value;
/*      */     }
/*      */ 
/*      */     public CurrencyAmount getTotalAmount()
/*      */     {
/* 2696 */       return this.totalAmount;
/*      */     }
/*      */ 
/*      */     public void setTotalAmount(CurrencyAmount value)
/*      */     {
/* 2708 */       this.totalAmount = value;
/*      */     }
/*      */ 
/*      */     public XMLGregorianCalendar getStartDate()
/*      */     {
/* 2720 */       return this.startDate;
/*      */     }
/*      */ 
/*      */     public void setStartDate(XMLGregorianCalendar value)
/*      */     {
/* 2732 */       this.startDate = value;
/*      */     }
/*      */ 
/*      */     public XMLGregorianCalendar getEndDate()
/*      */     {
/* 2744 */       return this.endDate;
/*      */     }
/*      */ 
/*      */     public void setEndDate(XMLGregorianCalendar value)
/*      */     {
/* 2756 */       this.endDate = value;
/*      */     }
/*      */ 
/*      */     public XMLGregorianCalendar getDepositDate()
/*      */     {
/* 2768 */       return this.depositDate;
/*      */     }
/*      */ 
/*      */     public void setDepositDate(XMLGregorianCalendar value)
/*      */     {
/* 2780 */       this.depositDate = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"amazonOrderID", "merchantOrderID", "marketplaceName", "merchantFulfillmentID", "transactionType", "transactionID", "postedDate", "amount", "reasonDescription", "fees"})
/*      */   public static class OtherTransaction
/*      */   {
/*      */ 
/*      */     @XmlElement(name="AmazonOrderID")
/*      */     protected String amazonOrderID;
/*      */ 
/*      */     @XmlElement(name="MerchantOrderID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String merchantOrderID;
/*      */ 
/*      */     @XmlElement(name="MarketplaceName")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String marketplaceName;
/*      */ 
/*      */     @XmlElement(name="MerchantFulfillmentID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String merchantFulfillmentID;
/*      */ 
/*      */     @XmlElement(name="TransactionType", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String transactionType;
/*      */ 
/*      */     @XmlElement(name="TransactionID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String transactionID;
/*      */ 
/*      */     @XmlElement(name="PostedDate", required=true)
/*      */     @XmlSchemaType(name="dateTime")
/*      */     protected XMLGregorianCalendar postedDate;
/*      */ 
/*      */     @XmlElement(name="Amount", required=true)
/*      */     protected CurrencyAmount amount;
/*      */ 
/*      */     @XmlElement(name="ReasonDescription")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String reasonDescription;
/*      */ 
/*      */     @XmlElement(name="Fees")
/*      */     protected AmazonFees fees;
/*      */ 
/*      */     public String getAmazonOrderID()
/*      */     {
/* 2382 */       return this.amazonOrderID;
/*      */     }
/*      */ 
/*      */     public void setAmazonOrderID(String value)
/*      */     {
/* 2394 */       this.amazonOrderID = value;
/*      */     }
/*      */ 
/*      */     public String getMerchantOrderID()
/*      */     {
/* 2406 */       return this.merchantOrderID;
/*      */     }
/*      */ 
/*      */     public void setMerchantOrderID(String value)
/*      */     {
/* 2418 */       this.merchantOrderID = value;
/*      */     }
/*      */ 
/*      */     public String getMarketplaceName()
/*      */     {
/* 2430 */       return this.marketplaceName;
/*      */     }
/*      */ 
/*      */     public void setMarketplaceName(String value)
/*      */     {
/* 2442 */       this.marketplaceName = value;
/*      */     }
/*      */ 
/*      */     public String getMerchantFulfillmentID()
/*      */     {
/* 2454 */       return this.merchantFulfillmentID;
/*      */     }
/*      */ 
/*      */     public void setMerchantFulfillmentID(String value)
/*      */     {
/* 2466 */       this.merchantFulfillmentID = value;
/*      */     }
/*      */ 
/*      */     public String getTransactionType()
/*      */     {
/* 2478 */       return this.transactionType;
/*      */     }
/*      */ 
/*      */     public void setTransactionType(String value)
/*      */     {
/* 2490 */       this.transactionType = value;
/*      */     }
/*      */ 
/*      */     public String getTransactionID()
/*      */     {
/* 2502 */       return this.transactionID;
/*      */     }
/*      */ 
/*      */     public void setTransactionID(String value)
/*      */     {
/* 2514 */       this.transactionID = value;
/*      */     }
/*      */ 
/*      */     public XMLGregorianCalendar getPostedDate()
/*      */     {
/* 2526 */       return this.postedDate;
/*      */     }
/*      */ 
/*      */     public void setPostedDate(XMLGregorianCalendar value)
/*      */     {
/* 2538 */       this.postedDate = value;
/*      */     }
/*      */ 
/*      */     public CurrencyAmount getAmount()
/*      */     {
/* 2550 */       return this.amount;
/*      */     }
/*      */ 
/*      */     public void setAmount(CurrencyAmount value)
/*      */     {
/* 2562 */       this.amount = value;
/*      */     }
/*      */ 
/*      */     public String getReasonDescription()
/*      */     {
/* 2574 */       return this.reasonDescription;
/*      */     }
/*      */ 
/*      */     public void setReasonDescription(String value)
/*      */     {
/* 2586 */       this.reasonDescription = value;
/*      */     }
/*      */ 
/*      */     public AmazonFees getFees()
/*      */     {
/* 2598 */       return this.fees;
/*      */     }
/*      */ 
/*      */     public void setFees(AmazonFees value)
/*      */     {
/* 2610 */       this.fees = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"amazonOrderID", "merchantOrderID", "marketplaceName", "merchantFulfillmentID", "postedDate", "amount", "reasonDescription"})
/*      */   public static class OtherFee
/*      */   {
/*      */ 
/*      */     @XmlElement(name="AmazonOrderID")
/*      */     protected String amazonOrderID;
/*      */ 
/*      */     @XmlElement(name="MerchantOrderID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String merchantOrderID;
/*      */ 
/*      */     @XmlElement(name="MarketplaceName", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String marketplaceName;
/*      */ 
/*      */     @XmlElement(name="MerchantFulfillmentID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String merchantFulfillmentID;
/*      */ 
/*      */     @XmlElement(name="PostedDate", required=true)
/*      */     @XmlSchemaType(name="dateTime")
/*      */     protected XMLGregorianCalendar postedDate;
/*      */ 
/*      */     @XmlElement(name="Amount", required=true)
/*      */     protected CurrencyAmount amount;
/*      */ 
/*      */     @XmlElement(name="ReasonDescription", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String reasonDescription;
/*      */ 
/*      */     public String getAmazonOrderID()
/*      */     {
/* 2140 */       return this.amazonOrderID;
/*      */     }
/*      */ 
/*      */     public void setAmazonOrderID(String value)
/*      */     {
/* 2152 */       this.amazonOrderID = value;
/*      */     }
/*      */ 
/*      */     public String getMerchantOrderID()
/*      */     {
/* 2164 */       return this.merchantOrderID;
/*      */     }
/*      */ 
/*      */     public void setMerchantOrderID(String value)
/*      */     {
/* 2176 */       this.merchantOrderID = value;
/*      */     }
/*      */ 
/*      */     public String getMarketplaceName()
/*      */     {
/* 2188 */       return this.marketplaceName;
/*      */     }
/*      */ 
/*      */     public void setMarketplaceName(String value)
/*      */     {
/* 2200 */       this.marketplaceName = value;
/*      */     }
/*      */ 
/*      */     public String getMerchantFulfillmentID()
/*      */     {
/* 2212 */       return this.merchantFulfillmentID;
/*      */     }
/*      */ 
/*      */     public void setMerchantFulfillmentID(String value)
/*      */     {
/* 2224 */       this.merchantFulfillmentID = value;
/*      */     }
/*      */ 
/*      */     public XMLGregorianCalendar getPostedDate()
/*      */     {
/* 2236 */       return this.postedDate;
/*      */     }
/*      */ 
/*      */     public void setPostedDate(XMLGregorianCalendar value)
/*      */     {
/* 2248 */       this.postedDate = value;
/*      */     }
/*      */ 
/*      */     public CurrencyAmount getAmount()
/*      */     {
/* 2260 */       return this.amount;
/*      */     }
/*      */ 
/*      */     public void setAmount(CurrencyAmount value)
/*      */     {
/* 2272 */       this.amount = value;
/*      */     }
/*      */ 
/*      */     public String getReasonDescription()
/*      */     {
/* 2284 */       return this.reasonDescription;
/*      */     }
/*      */ 
/*      */     public void setReasonDescription(String value)
/*      */     {
/* 2296 */       this.reasonDescription = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"amazonOrderID", "merchantOrderID", "shipmentID", "shipmentFees", "marketplaceName", "fulfillment", "orderFee"})
/*      */   public static class Order
/*      */   {
/*      */ 
/*      */     @XmlElement(name="AmazonOrderID", required=true)
/*      */     protected String amazonOrderID;
/*      */ 
/*      */     @XmlElement(name="MerchantOrderID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String merchantOrderID;
/*      */ 
/*      */     @XmlElement(name="ShipmentID")
/*      */     protected Object shipmentID;
/*      */ 
/*      */     @XmlElement(name="ShipmentFees")
/*      */     protected List<AmazonFees> shipmentFees;
/*      */ 
/*      */     @XmlElement(name="MarketplaceName", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String marketplaceName;
/*      */ 
/*      */     @XmlElement(name="Fulfillment", required=true)
/*      */     protected Fulfillment fulfillment;
/*      */ 
/*      */     @XmlElement(name="OrderFee")
/*      */     protected List<AmazonFees> orderFee;
/*      */ 
/*      */     public String getAmazonOrderID()
/*      */     {
/* 1372 */       return this.amazonOrderID;
/*      */     }
/*      */ 
/*      */     public void setAmazonOrderID(String value)
/*      */     {
/* 1384 */       this.amazonOrderID = value;
/*      */     }
/*      */ 
/*      */     public String getMerchantOrderID()
/*      */     {
/* 1396 */       return this.merchantOrderID;
/*      */     }
/*      */ 
/*      */     public void setMerchantOrderID(String value)
/*      */     {
/* 1408 */       this.merchantOrderID = value;
/*      */     }
/*      */ 
/*      */     public Object getShipmentID()
/*      */     {
/* 1420 */       return this.shipmentID;
/*      */     }
/*      */ 
/*      */     public void setShipmentID(Object value)
/*      */     {
/* 1432 */       this.shipmentID = value;
/*      */     }
/*      */ 
/*      */     public List<AmazonFees> getShipmentFees()
/*      */     {
/* 1458 */       if (this.shipmentFees == null) {
/* 1459 */         this.shipmentFees = new ArrayList();
/*      */       }
/* 1461 */       return this.shipmentFees;
/*      */     }
/*      */ 
/*      */     public String getMarketplaceName()
/*      */     {
/* 1473 */       return this.marketplaceName;
/*      */     }
/*      */ 
/*      */     public void setMarketplaceName(String value)
/*      */     {
/* 1485 */       this.marketplaceName = value;
/*      */     }
/*      */ 
/*      */     public Fulfillment getFulfillment()
/*      */     {
/* 1497 */       return this.fulfillment;
/*      */     }
/*      */ 
/*      */     public void setFulfillment(Fulfillment value)
/*      */     {
/* 1509 */       this.fulfillment = value;
/*      */     }
/*      */ 
/*      */     public List<AmazonFees> getOrderFee()
/*      */     {
/* 1535 */       if (this.orderFee == null) {
/* 1536 */         this.orderFee = new ArrayList();
/*      */       }
/* 1538 */       return this.orderFee;
/*      */     }
/*      */ 
/*      */     @XmlAccessorType(XmlAccessType.FIELD)
/*      */     @XmlType(name="", propOrder={"merchantFulfillmentID", "postedDate", "item", "directPayment"})
/*      */     public static class Fulfillment
/*      */     {
/*      */ 
/*      */       @XmlElement(name="MerchantFulfillmentID")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String merchantFulfillmentID;
/*      */ 
/*      */       @XmlElement(name="PostedDate", required=true)
/*      */       @XmlSchemaType(name="dateTime")
/*      */       protected XMLGregorianCalendar postedDate;
/*      */ 
/*      */       @XmlElement(name="Item", required=true)
/*      */       protected List<Item> item;
/*      */ 
/*      */       @XmlElement(name="DirectPayment")
/*      */       protected DirectPaymentType directPayment;
/*      */ 
/*      */       public String getMerchantFulfillmentID()
/*      */       {
/* 1621 */         return this.merchantFulfillmentID;
/*      */       }
/*      */ 
/*      */       public void setMerchantFulfillmentID(String value)
/*      */       {
/* 1633 */         this.merchantFulfillmentID = value;
/*      */       }
/*      */ 
/*      */       public XMLGregorianCalendar getPostedDate()
/*      */       {
/* 1645 */         return this.postedDate;
/*      */       }
/*      */ 
/*      */       public void setPostedDate(XMLGregorianCalendar value)
/*      */       {
/* 1657 */         this.postedDate = value;
/*      */       }
/*      */ 
/*      */       public List<Item> getItem()
/*      */       {
/* 1683 */         if (this.item == null) {
/* 1684 */           this.item = new ArrayList();
/*      */         }
/* 1686 */         return this.item;
/*      */       }
/*      */ 
/*      */       public DirectPaymentType getDirectPayment()
/*      */       {
/* 1698 */         return this.directPayment;
/*      */       }
/*      */ 
/*      */       public void setDirectPayment(DirectPaymentType value)
/*      */       {
/* 1710 */         this.directPayment = value;
/*      */       }
/*      */ 
/*      */       @XmlAccessorType(XmlAccessType.FIELD)
/*      */       @XmlType(name="", propOrder={"amazonOrderItemCode", "merchantOrderItemID", "sku", "quantity", "itemPrice", "itemFees", "promotion"})
/*      */       public static class Item
/*      */       {
/*      */ 
/*      */         @XmlElement(name="AmazonOrderItemCode", required=true)
/*      */         protected String amazonOrderItemCode;
/*      */ 
/*      */         @XmlElement(name="MerchantOrderItemID")
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String merchantOrderItemID;
/*      */ 
/*      */         @XmlElement(name="SKU", required=true)
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String sku;
/*      */ 
/*      */         @XmlElement(name="Quantity", required=true)
/*      */         @XmlSchemaType(name="positiveInteger")
/*      */         protected BigInteger quantity;
/*      */ 
/*      */         @XmlElement(name="ItemPrice", required=true)
/*      */         protected BuyerPrice itemPrice;
/*      */ 
/*      */         @XmlElement(name="ItemFees")
/*      */         protected AmazonFees itemFees;
/*      */ 
/*      */         @XmlElement(name="Promotion")
/*      */         protected List<Promotion> promotion;
/*      */ 
/*      */         public String getAmazonOrderItemCode()
/*      */         {
/* 1790 */           return this.amazonOrderItemCode;
/*      */         }
/*      */ 
/*      */         public void setAmazonOrderItemCode(String value)
/*      */         {
/* 1802 */           this.amazonOrderItemCode = value;
/*      */         }
/*      */ 
/*      */         public String getMerchantOrderItemID()
/*      */         {
/* 1814 */           return this.merchantOrderItemID;
/*      */         }
/*      */ 
/*      */         public void setMerchantOrderItemID(String value)
/*      */         {
/* 1826 */           this.merchantOrderItemID = value;
/*      */         }
/*      */ 
/*      */         public String getSKU()
/*      */         {
/* 1838 */           return this.sku;
/*      */         }
/*      */ 
/*      */         public void setSKU(String value)
/*      */         {
/* 1850 */           this.sku = value;
/*      */         }
/*      */ 
/*      */         public BigInteger getQuantity()
/*      */         {
/* 1862 */           return this.quantity;
/*      */         }
/*      */ 
/*      */         public void setQuantity(BigInteger value)
/*      */         {
/* 1874 */           this.quantity = value;
/*      */         }
/*      */ 
/*      */         public BuyerPrice getItemPrice()
/*      */         {
/* 1886 */           return this.itemPrice;
/*      */         }
/*      */ 
/*      */         public void setItemPrice(BuyerPrice value)
/*      */         {
/* 1898 */           this.itemPrice = value;
/*      */         }
/*      */ 
/*      */         public AmazonFees getItemFees()
/*      */         {
/* 1910 */           return this.itemFees;
/*      */         }
/*      */ 
/*      */         public void setItemFees(AmazonFees value)
/*      */         {
/* 1922 */           this.itemFees = value;
/*      */         }
/*      */ 
/*      */         public List<Promotion> getPromotion()
/*      */         {
/* 1948 */           if (this.promotion == null) {
/* 1949 */             this.promotion = new ArrayList();
/*      */           }
/* 1951 */           return this.promotion;
/*      */         }
/*      */ 
/*      */         @XmlAccessorType(XmlAccessType.FIELD)
/*      */         @XmlType(name="", propOrder={"merchantPromotionID", "type", "amount"})
/*      */         public static class Promotion
/*      */         {
/*      */ 
/*      */           @XmlElement(name="MerchantPromotionID", required=true)
/*      */           @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */           protected String merchantPromotionID;
/*      */ 
/*      */           @XmlElement(name="Type", required=true)
/*      */           @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */           protected String type;
/*      */ 
/*      */           @XmlElement(name="Amount", required=true)
/*      */           protected CurrencyAmount amount;
/*      */ 
/*      */           public String getMerchantPromotionID()
/*      */           {
/* 2002 */             return this.merchantPromotionID;
/*      */           }
/*      */ 
/*      */           public void setMerchantPromotionID(String value)
/*      */           {
/* 2014 */             this.merchantPromotionID = value;
/*      */           }
/*      */ 
/*      */           public String getType()
/*      */           {
/* 2026 */             return this.type;
/*      */           }
/*      */ 
/*      */           public void setType(String value)
/*      */           {
/* 2038 */             this.type = value;
/*      */           }
/*      */ 
/*      */           public CurrencyAmount getAmount()
/*      */           {
/* 2050 */             return this.amount;
/*      */           }
/*      */ 
/*      */           public void setAmount(CurrencyAmount value)
/*      */           {
/* 2062 */             this.amount = value;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"postedDate", "amount"})
/*      */   public static class MiscEvent
/*      */   {
/*      */ 
/*      */     @XmlElement(name="PostedDate", required=true)
/*      */     @XmlSchemaType(name="dateTime")
/*      */     protected XMLGregorianCalendar postedDate;
/*      */ 
/*      */     @XmlElement(name="Amount", required=true)
/*      */     protected CurrencyAmount amount;
/*      */ 
/*      */     public XMLGregorianCalendar getPostedDate()
/*      */     {
/* 1226 */       return this.postedDate;
/*      */     }
/*      */ 
/*      */     public void setPostedDate(XMLGregorianCalendar value)
/*      */     {
/* 1238 */       this.postedDate = value;
/*      */     }
/*      */ 
/*      */     public CurrencyAmount getAmount()
/*      */     {
/* 1250 */       return this.amount;
/*      */     }
/*      */ 
/*      */     public void setAmount(CurrencyAmount value)
/*      */     {
/* 1262 */       this.amount = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"amazonOrderID", "merchantOrderID", "adjustmentID", "marketplaceName", "fulfillment", "orderFeeAdjustment"})
/*      */   public static class Adjustment
/*      */   {
/*      */ 
/*      */     @XmlElement(name="AmazonOrderID", required=true)
/*      */     protected String amazonOrderID;
/*      */ 
/*      */     @XmlElement(name="MerchantOrderID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String merchantOrderID;
/*      */ 
/*      */     @XmlElement(name="AdjustmentID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String adjustmentID;
/*      */ 
/*      */     @XmlElement(name="MarketplaceName", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String marketplaceName;
/*      */ 
/*      */     @XmlElement(name="Fulfillment", required=true)
/*      */     protected Fulfillment fulfillment;
/*      */ 
/*      */     @XmlElement(name="OrderFeeAdjustment")
/*      */     protected List<AmazonFees> orderFeeAdjustment;
/*      */ 
/*      */     public String getAmazonOrderID()
/*      */     {
/*  511 */       return this.amazonOrderID;
/*      */     }
/*      */ 
/*      */     public void setAmazonOrderID(String value)
/*      */     {
/*  523 */       this.amazonOrderID = value;
/*      */     }
/*      */ 
/*      */     public String getMerchantOrderID()
/*      */     {
/*  535 */       return this.merchantOrderID;
/*      */     }
/*      */ 
/*      */     public void setMerchantOrderID(String value)
/*      */     {
/*  547 */       this.merchantOrderID = value;
/*      */     }
/*      */ 
/*      */     public String getAdjustmentID()
/*      */     {
/*  559 */       return this.adjustmentID;
/*      */     }
/*      */ 
/*      */     public void setAdjustmentID(String value)
/*      */     {
/*  571 */       this.adjustmentID = value;
/*      */     }
/*      */ 
/*      */     public String getMarketplaceName()
/*      */     {
/*  583 */       return this.marketplaceName;
/*      */     }
/*      */ 
/*      */     public void setMarketplaceName(String value)
/*      */     {
/*  595 */       this.marketplaceName = value;
/*      */     }
/*      */ 
/*      */     public Fulfillment getFulfillment()
/*      */     {
/*  607 */       return this.fulfillment;
/*      */     }
/*      */ 
/*      */     public void setFulfillment(Fulfillment value)
/*      */     {
/*  619 */       this.fulfillment = value;
/*      */     }
/*      */ 
/*      */     public List<AmazonFees> getOrderFeeAdjustment()
/*      */     {
/*  645 */       if (this.orderFeeAdjustment == null) {
/*  646 */         this.orderFeeAdjustment = new ArrayList();
/*      */       }
/*  648 */       return this.orderFeeAdjustment;
/*      */     }
/*      */ 
/*      */     @XmlAccessorType(XmlAccessType.FIELD)
/*      */     @XmlType(name="", propOrder={"merchantFulfillmentID", "postedDate", "adjustedItem", "directPayment"})
/*      */     public static class Fulfillment
/*      */     {
/*      */ 
/*      */       @XmlElement(name="MerchantFulfillmentID")
/*      */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */       protected String merchantFulfillmentID;
/*      */ 
/*      */       @XmlElement(name="PostedDate", required=true)
/*      */       @XmlSchemaType(name="dateTime")
/*      */       protected XMLGregorianCalendar postedDate;
/*      */ 
/*      */       @XmlElement(name="AdjustedItem", required=true)
/*      */       protected List<AdjustedItem> adjustedItem;
/*      */ 
/*      */       @XmlElement(name="DirectPayment")
/*      */       protected DirectPaymentType directPayment;
/*      */ 
/*      */       public String getMerchantFulfillmentID()
/*      */       {
/*  731 */         return this.merchantFulfillmentID;
/*      */       }
/*      */ 
/*      */       public void setMerchantFulfillmentID(String value)
/*      */       {
/*  743 */         this.merchantFulfillmentID = value;
/*      */       }
/*      */ 
/*      */       public XMLGregorianCalendar getPostedDate()
/*      */       {
/*  755 */         return this.postedDate;
/*      */       }
/*      */ 
/*      */       public void setPostedDate(XMLGregorianCalendar value)
/*      */       {
/*  767 */         this.postedDate = value;
/*      */       }
/*      */ 
/*      */       public List<AdjustedItem> getAdjustedItem()
/*      */       {
/*  793 */         if (this.adjustedItem == null) {
/*  794 */           this.adjustedItem = new ArrayList();
/*      */         }
/*  796 */         return this.adjustedItem;
/*      */       }
/*      */ 
/*      */       public DirectPaymentType getDirectPayment()
/*      */       {
/*  808 */         return this.directPayment;
/*      */       }
/*      */ 
/*      */       public void setDirectPayment(DirectPaymentType value)
/*      */       {
/*  820 */         this.directPayment = value;
/*      */       }
/*      */ 
/*      */       @XmlAccessorType(XmlAccessType.FIELD)
/*      */       @XmlType(name="", propOrder={"amazonOrderItemCode", "merchantOrderItemID", "merchantAdjustmentItemID", "sku", "itemPriceAdjustments", "itemFeeAdjustments", "promotionAdjustment"})
/*      */       public static class AdjustedItem
/*      */       {
/*      */ 
/*      */         @XmlElement(name="AmazonOrderItemCode", required=true)
/*      */         protected String amazonOrderItemCode;
/*      */ 
/*      */         @XmlElement(name="MerchantOrderItemID")
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String merchantOrderItemID;
/*      */ 
/*      */         @XmlElement(name="MerchantAdjustmentItemID")
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String merchantAdjustmentItemID;
/*      */ 
/*      */         @XmlElement(name="SKU", required=true)
/*      */         @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */         protected String sku;
/*      */ 
/*      */         @XmlElement(name="ItemPriceAdjustments", required=true)
/*      */         protected BuyerPrice itemPriceAdjustments;
/*      */ 
/*      */         @XmlElement(name="ItemFeeAdjustments")
/*      */         protected AmazonFees itemFeeAdjustments;
/*      */ 
/*      */         @XmlElement(name="PromotionAdjustment")
/*      */         protected List<PromotionAdjustment> promotionAdjustment;
/*      */ 
/*      */         public String getAmazonOrderItemCode()
/*      */         {
/*  900 */           return this.amazonOrderItemCode;
/*      */         }
/*      */ 
/*      */         public void setAmazonOrderItemCode(String value)
/*      */         {
/*  912 */           this.amazonOrderItemCode = value;
/*      */         }
/*      */ 
/*      */         public String getMerchantOrderItemID()
/*      */         {
/*  924 */           return this.merchantOrderItemID;
/*      */         }
/*      */ 
/*      */         public void setMerchantOrderItemID(String value)
/*      */         {
/*  936 */           this.merchantOrderItemID = value;
/*      */         }
/*      */ 
/*      */         public String getMerchantAdjustmentItemID()
/*      */         {
/*  948 */           return this.merchantAdjustmentItemID;
/*      */         }
/*      */ 
/*      */         public void setMerchantAdjustmentItemID(String value)
/*      */         {
/*  960 */           this.merchantAdjustmentItemID = value;
/*      */         }
/*      */ 
/*      */         public String getSKU()
/*      */         {
/*  972 */           return this.sku;
/*      */         }
/*      */ 
/*      */         public void setSKU(String value)
/*      */         {
/*  984 */           this.sku = value;
/*      */         }
/*      */ 
/*      */         public BuyerPrice getItemPriceAdjustments()
/*      */         {
/*  996 */           return this.itemPriceAdjustments;
/*      */         }
/*      */ 
/*      */         public void setItemPriceAdjustments(BuyerPrice value)
/*      */         {
/* 1008 */           this.itemPriceAdjustments = value;
/*      */         }
/*      */ 
/*      */         public AmazonFees getItemFeeAdjustments()
/*      */         {
/* 1020 */           return this.itemFeeAdjustments;
/*      */         }
/*      */ 
/*      */         public void setItemFeeAdjustments(AmazonFees value)
/*      */         {
/* 1032 */           this.itemFeeAdjustments = value;
/*      */         }
/*      */ 
/*      */         public List<PromotionAdjustment> getPromotionAdjustment()
/*      */         {
/* 1058 */           if (this.promotionAdjustment == null) {
/* 1059 */             this.promotionAdjustment = new ArrayList();
/*      */           }
/* 1061 */           return this.promotionAdjustment;
/*      */         }
/*      */ 
/*      */         @XmlAccessorType(XmlAccessType.FIELD)
/*      */         @XmlType(name="", propOrder={"merchantPromotionID", "type", "amount"})
/*      */         public static class PromotionAdjustment
/*      */         {
/*      */ 
/*      */           @XmlElement(name="MerchantPromotionID", required=true)
/*      */           @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */           protected String merchantPromotionID;
/*      */ 
/*      */           @XmlElement(name="Type", required=true)
/*      */           @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */           protected String type;
/*      */ 
/*      */           @XmlElement(name="Amount", required=true)
/*      */           protected CurrencyAmount amount;
/*      */ 
/*      */           public String getMerchantPromotionID()
/*      */           {
/* 1112 */             return this.merchantPromotionID;
/*      */           }
/*      */ 
/*      */           public void setMerchantPromotionID(String value)
/*      */           {
/* 1124 */             this.merchantPromotionID = value;
/*      */           }
/*      */ 
/*      */           public String getType()
/*      */           {
/* 1136 */             return this.type;
/*      */           }
/*      */ 
/*      */           public void setType(String value)
/*      */           {
/* 1148 */             this.type = value;
/*      */           }
/*      */ 
/*      */           public CurrencyAmount getAmount()
/*      */           {
/* 1160 */             return this.amount;
/*      */           }
/*      */ 
/*      */           public void setAmount(CurrencyAmount value)
/*      */           {
/* 1172 */             this.amount = value;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.SettlementReport
 * JD-Core Version:    0.6.2
 */