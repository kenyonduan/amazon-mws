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
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"documentTransactionID", "statusCode", "processingSummary", "result"})
/*     */ @XmlRootElement(name="ProcessingReport")
/*     */ public class ProcessingReport
/*     */ {
/*     */ 
/*     */   @XmlElement(name="DocumentTransactionID", required=true)
/*     */   protected BigInteger documentTransactionID;
/*     */ 
/*     */   @XmlElement(name="StatusCode", required=true)
/*     */   protected String statusCode;
/*     */ 
/*     */   @XmlElement(name="ProcessingSummary")
/*     */   protected ProcessingSummary processingSummary;
/*     */ 
/*     */   @XmlElement(name="Result")
/*     */   protected List<Result> result;
/*     */ 
/*     */   public BigInteger getDocumentTransactionID()
/*     */   {
/* 128 */     return this.documentTransactionID;
/*     */   }
/*     */ 
/*     */   public void setDocumentTransactionID(BigInteger value)
/*     */   {
/* 140 */     this.documentTransactionID = value;
/*     */   }
/*     */ 
/*     */   public String getStatusCode()
/*     */   {
/* 152 */     return this.statusCode;
/*     */   }
/*     */ 
/*     */   public void setStatusCode(String value)
/*     */   {
/* 164 */     this.statusCode = value;
/*     */   }
/*     */ 
/*     */   public ProcessingSummary getProcessingSummary()
/*     */   {
/* 176 */     return this.processingSummary;
/*     */   }
/*     */ 
/*     */   public void setProcessingSummary(ProcessingSummary value)
/*     */   {
/* 188 */     this.processingSummary = value;
/*     */   }
/*     */ 
/*     */   public List<Result> getResult()
/*     */   {
/* 214 */     if (this.result == null) {
/* 215 */       this.result = new ArrayList();
/*     */     }
/* 217 */     return this.result;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"messageID", "resultCode", "resultMessageCode", "resultDescription", "additionalInfo"})
/*     */   public static class Result
/*     */   {
/*     */ 
/*     */     @XmlElement(name="MessageID", required=true)
/*     */     protected BigInteger messageID;
/*     */ 
/*     */     @XmlElement(name="ResultCode", required=true)
/*     */     protected String resultCode;
/*     */ 
/*     */     @XmlElement(name="ResultMessageCode", required=true)
/*     */     protected BigInteger resultMessageCode;
/*     */ 
/*     */     @XmlElement(name="ResultDescription", required=true)
/*     */     protected String resultDescription;
/*     */ 
/*     */     @XmlElement(name="AdditionalInfo")
/*     */     protected AdditionalInfo additionalInfo;
/*     */ 
/*     */     public BigInteger getMessageID()
/*     */     {
/* 443 */       return this.messageID;
/*     */     }
/*     */ 
/*     */     public void setMessageID(BigInteger value)
/*     */     {
/* 455 */       this.messageID = value;
/*     */     }
/*     */ 
/*     */     public String getResultCode()
/*     */     {
/* 467 */       return this.resultCode;
/*     */     }
/*     */ 
/*     */     public void setResultCode(String value)
/*     */     {
/* 479 */       this.resultCode = value;
/*     */     }
/*     */ 
/*     */     public BigInteger getResultMessageCode()
/*     */     {
/* 491 */       return this.resultMessageCode;
/*     */     }
/*     */ 
/*     */     public void setResultMessageCode(BigInteger value)
/*     */     {
/* 503 */       this.resultMessageCode = value;
/*     */     }
/*     */ 
/*     */     public String getResultDescription()
/*     */     {
/* 515 */       return this.resultDescription;
/*     */     }
/*     */ 
/*     */     public void setResultDescription(String value)
/*     */     {
/* 527 */       this.resultDescription = value;
/*     */     }
/*     */ 
/*     */     public AdditionalInfo getAdditionalInfo()
/*     */     {
/* 539 */       return this.additionalInfo;
/*     */     }
/*     */ 
/*     */     public void setAdditionalInfo(AdditionalInfo value)
/*     */     {
/* 551 */       this.additionalInfo = value;
/*     */     }
/*     */ 
/*     */     @XmlAccessorType(XmlAccessType.FIELD)
/*     */     @XmlType(name="", propOrder={"sku", "fulfillmentCenterID", "amazonOrderID", "amazonOrderItemCode"})
/*     */     public static class AdditionalInfo
/*     */     {
/*     */ 
/*     */       @XmlElement(name="SKU")
/*     */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */       protected String sku;
/*     */ 
/*     */       @XmlElement(name="FulfillmentCenterID")
/*     */       @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */       protected String fulfillmentCenterID;
/*     */ 
/*     */       @XmlElement(name="AmazonOrderID")
/*     */       protected String amazonOrderID;
/*     */ 
/*     */       @XmlElement(name="AmazonOrderItemCode")
/*     */       protected String amazonOrderItemCode;
/*     */ 
/*     */       public String getSKU()
/*     */       {
/* 606 */         return this.sku;
/*     */       }
/*     */ 
/*     */       public void setSKU(String value)
/*     */       {
/* 618 */         this.sku = value;
/*     */       }
/*     */ 
/*     */       public String getFulfillmentCenterID()
/*     */       {
/* 630 */         return this.fulfillmentCenterID;
/*     */       }
/*     */ 
/*     */       public void setFulfillmentCenterID(String value)
/*     */       {
/* 642 */         this.fulfillmentCenterID = value;
/*     */       }
/*     */ 
/*     */       public String getAmazonOrderID()
/*     */       {
/* 654 */         return this.amazonOrderID;
/*     */       }
/*     */ 
/*     */       public void setAmazonOrderID(String value)
/*     */       {
/* 666 */         this.amazonOrderID = value;
/*     */       }
/*     */ 
/*     */       public String getAmazonOrderItemCode()
/*     */       {
/* 678 */         return this.amazonOrderItemCode;
/*     */       }
/*     */ 
/*     */       public void setAmazonOrderItemCode(String value)
/*     */       {
/* 690 */         this.amazonOrderItemCode = value;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"messagesProcessed", "messagesSuccessful", "messagesWithError", "messagesWithWarning"})
/*     */   public static class ProcessingSummary
/*     */   {
/*     */ 
/*     */     @XmlElement(name="MessagesProcessed", required=true)
/*     */     @XmlSchemaType(name="nonNegativeInteger")
/*     */     protected BigInteger messagesProcessed;
/*     */ 
/*     */     @XmlElement(name="MessagesSuccessful", required=true)
/*     */     @XmlSchemaType(name="nonNegativeInteger")
/*     */     protected BigInteger messagesSuccessful;
/*     */ 
/*     */     @XmlElement(name="MessagesWithError", required=true)
/*     */     @XmlSchemaType(name="nonNegativeInteger")
/*     */     protected BigInteger messagesWithError;
/*     */ 
/*     */     @XmlElement(name="MessagesWithWarning", required=true)
/*     */     @XmlSchemaType(name="nonNegativeInteger")
/*     */     protected BigInteger messagesWithWarning;
/*     */ 
/*     */     public BigInteger getMessagesProcessed()
/*     */     {
/* 274 */       return this.messagesProcessed;
/*     */     }
/*     */ 
/*     */     public void setMessagesProcessed(BigInteger value)
/*     */     {
/* 286 */       this.messagesProcessed = value;
/*     */     }
/*     */ 
/*     */     public BigInteger getMessagesSuccessful()
/*     */     {
/* 298 */       return this.messagesSuccessful;
/*     */     }
/*     */ 
/*     */     public void setMessagesSuccessful(BigInteger value)
/*     */     {
/* 310 */       this.messagesSuccessful = value;
/*     */     }
/*     */ 
/*     */     public BigInteger getMessagesWithError()
/*     */     {
/* 322 */       return this.messagesWithError;
/*     */     }
/*     */ 
/*     */     public void setMessagesWithError(BigInteger value)
/*     */     {
/* 334 */       this.messagesWithError = value;
/*     */     }
/*     */ 
/*     */     public BigInteger getMessagesWithWarning()
/*     */     {
/* 346 */       return this.messagesWithWarning;
/*     */     }
/*     */ 
/*     */     public void setMessagesWithWarning(BigInteger value)
/*     */     {
/* 358 */       this.messagesWithWarning = value;
/*     */     }
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ProcessingReport
 * JD-Core Version:    0.6.2
 */