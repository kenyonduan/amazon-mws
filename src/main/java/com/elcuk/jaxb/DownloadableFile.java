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
/*    */ @XmlType(name="", propOrder={"downloadableFileFormat", "fileSize"})
/*    */ @XmlRootElement(name="DownloadableFile")
/*    */ public class DownloadableFile
/*    */ {
/*    */ 
/*    */   @XmlElement(name="DownloadableFileFormat", required=true)
/*    */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*    */   protected String downloadableFileFormat;
/*    */ 
/*    */   @XmlElement(name="FileSize", required=true)
/*    */   protected MemorySizeDimension fileSize;
/*    */ 
/*    */   public String getDownloadableFileFormat()
/*    */   {
/* 56 */     return this.downloadableFileFormat;
/*    */   }
/*    */ 
/*    */   public void setDownloadableFileFormat(String value)
/*    */   {
/* 68 */     this.downloadableFileFormat = value;
/*    */   }
/*    */ 
/*    */   public MemorySizeDimension getFileSize()
/*    */   {
/* 80 */     return this.fileSize;
/*    */   }
/*    */ 
/*    */   public void setFileSize(MemorySizeDimension value)
/*    */   {
/* 92 */     this.fileSize = value;
/*    */   }
/*    */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.DownloadableFile
 * JD-Core Version:    0.6.2
 */