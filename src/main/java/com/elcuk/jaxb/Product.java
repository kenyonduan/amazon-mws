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
/*      */ @XmlType(name="", propOrder={"sku", "standardProductID", "gtinExemptionReason", "relatedProductID", "productTaxCode", "launchDate", "discontinueDate", "releaseDate", "externalProductUrl", "offAmazonChannel", "onAmazonChannel", "condition", "rebate", "itemPackageQuantity", "numberOfItems", "liquidVolume", "descriptionData", "promoTag", "discoveryData", "productData", "shippedByFreight", "enhancedImageURL", "amazonVendorOnly", "amazonOnly", "registeredParameter"})
/*      */ @XmlRootElement(name="Product")
/*      */ public class Product
/*      */ {
/*      */ 
/*      */   @XmlElement(name="SKU", required=true)
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sku;
/*      */ 
/*      */   @XmlElement(name="StandardProductID")
/*      */   protected StandardProductID standardProductID;
/*      */ 
/*      */   @XmlElement(name="GtinExemptionReason")
/*      */   protected String gtinExemptionReason;
/*      */ 
/*      */   @XmlElement(name="RelatedProductID")
/*      */   protected RelatedProductID relatedProductID;
/*      */ 
/*      */   @XmlElement(name="ProductTaxCode")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String productTaxCode;
/*      */ 
/*      */   @XmlElement(name="LaunchDate")
/*      */   @XmlSchemaType(name="dateTime")
/*      */   protected XMLGregorianCalendar launchDate;
/*      */ 
/*      */   @XmlElement(name="DiscontinueDate")
/*      */   @XmlSchemaType(name="dateTime")
/*      */   protected XMLGregorianCalendar discontinueDate;
/*      */ 
/*      */   @XmlElement(name="ReleaseDate")
/*      */   @XmlSchemaType(name="dateTime")
/*      */   protected XMLGregorianCalendar releaseDate;
/*      */ 
/*      */   @XmlElement(name="ExternalProductUrl")
/*      */   @XmlSchemaType(name="anyURI")
/*      */   protected String externalProductUrl;
/*      */ 
/*      */   @XmlElement(name="OffAmazonChannel")
/*      */   protected String offAmazonChannel;
/*      */ 
/*      */   @XmlElement(name="OnAmazonChannel")
/*      */   protected String onAmazonChannel;
/*      */ 
/*      */   @XmlElement(name="Condition")
/*      */   protected ConditionInfo condition;
/*      */ 
/*      */   @XmlElement(name="Rebate")
/*      */   protected List<RebateType> rebate;
/*      */ 
/*      */   @XmlElement(name="ItemPackageQuantity")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger itemPackageQuantity;
/*      */ 
/*      */   @XmlElement(name="NumberOfItems")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfItems;
/*      */ 
/*      */   @XmlElement(name="LiquidVolume")
/*      */   protected VolumeDimension liquidVolume;
/*      */ 
/*      */   @XmlElement(name="DescriptionData")
/*      */   protected DescriptionData descriptionData;
/*      */ 
/*      */   @XmlElement(name="PromoTag")
/*      */   protected PromoTag promoTag;
/*      */ 
/*      */   @XmlElement(name="DiscoveryData")
/*      */   protected DiscoveryData discoveryData;
/*      */ 
/*      */   @XmlElement(name="ProductData")
/*      */   protected ProductData productData;
/*      */ 
/*      */   @XmlElement(name="ShippedByFreight")
/*      */   protected Boolean shippedByFreight;
/*      */ 
/*      */   @XmlElement(name="EnhancedImageURL")
/*      */   @XmlSchemaType(name="anyURI")
/*      */   protected List<String> enhancedImageURL;
/*      */ 
/*      */   @XmlElement(name="Amazon-Vendor-Only")
/*      */   protected AmazonVendorOnly amazonVendorOnly;
/*      */ 
/*      */   @XmlElement(name="Amazon-Only")
/*      */   protected AmazonOnly amazonOnly;
/*      */ 
/*      */   @XmlElement(name="RegisteredParameter")
/*      */   protected String registeredParameter;
/*      */ 
/*      */   public String getSKU()
/*      */   {
/*  418 */     return this.sku;
/*      */   }
/*      */ 
/*      */   public void setSKU(String value)
/*      */   {
/*  430 */     this.sku = value;
/*      */   }
/*      */ 
/*      */   public StandardProductID getStandardProductID()
/*      */   {
/*  442 */     return this.standardProductID;
/*      */   }
/*      */ 
/*      */   public void setStandardProductID(StandardProductID value)
/*      */   {
/*  454 */     this.standardProductID = value;
/*      */   }
/*      */ 
/*      */   public String getGtinExemptionReason()
/*      */   {
/*  466 */     return this.gtinExemptionReason;
/*      */   }
/*      */ 
/*      */   public void setGtinExemptionReason(String value)
/*      */   {
/*  478 */     this.gtinExemptionReason = value;
/*      */   }
/*      */ 
/*      */   public RelatedProductID getRelatedProductID()
/*      */   {
/*  490 */     return this.relatedProductID;
/*      */   }
/*      */ 
/*      */   public void setRelatedProductID(RelatedProductID value)
/*      */   {
/*  502 */     this.relatedProductID = value;
/*      */   }
/*      */ 
/*      */   public String getProductTaxCode()
/*      */   {
/*  514 */     return this.productTaxCode;
/*      */   }
/*      */ 
/*      */   public void setProductTaxCode(String value)
/*      */   {
/*  526 */     this.productTaxCode = value;
/*      */   }
/*      */ 
/*      */   public XMLGregorianCalendar getLaunchDate()
/*      */   {
/*  538 */     return this.launchDate;
/*      */   }
/*      */ 
/*      */   public void setLaunchDate(XMLGregorianCalendar value)
/*      */   {
/*  550 */     this.launchDate = value;
/*      */   }
/*      */ 
/*      */   public XMLGregorianCalendar getDiscontinueDate()
/*      */   {
/*  562 */     return this.discontinueDate;
/*      */   }
/*      */ 
/*      */   public void setDiscontinueDate(XMLGregorianCalendar value)
/*      */   {
/*  574 */     this.discontinueDate = value;
/*      */   }
/*      */ 
/*      */   public XMLGregorianCalendar getReleaseDate()
/*      */   {
/*  586 */     return this.releaseDate;
/*      */   }
/*      */ 
/*      */   public void setReleaseDate(XMLGregorianCalendar value)
/*      */   {
/*  598 */     this.releaseDate = value;
/*      */   }
/*      */ 
/*      */   public String getExternalProductUrl()
/*      */   {
/*  610 */     return this.externalProductUrl;
/*      */   }
/*      */ 
/*      */   public void setExternalProductUrl(String value)
/*      */   {
/*  622 */     this.externalProductUrl = value;
/*      */   }
/*      */ 
/*      */   public String getOffAmazonChannel()
/*      */   {
/*  634 */     return this.offAmazonChannel;
/*      */   }
/*      */ 
/*      */   public void setOffAmazonChannel(String value)
/*      */   {
/*  646 */     this.offAmazonChannel = value;
/*      */   }
/*      */ 
/*      */   public String getOnAmazonChannel()
/*      */   {
/*  658 */     return this.onAmazonChannel;
/*      */   }
/*      */ 
/*      */   public void setOnAmazonChannel(String value)
/*      */   {
/*  670 */     this.onAmazonChannel = value;
/*      */   }
/*      */ 
/*      */   public ConditionInfo getCondition()
/*      */   {
/*  682 */     return this.condition;
/*      */   }
/*      */ 
/*      */   public void setCondition(ConditionInfo value)
/*      */   {
/*  694 */     this.condition = value;
/*      */   }
/*      */ 
/*      */   public List<RebateType> getRebate()
/*      */   {
/*  720 */     if (this.rebate == null) {
/*  721 */       this.rebate = new ArrayList();
/*      */     }
/*  723 */     return this.rebate;
/*      */   }
/*      */ 
/*      */   public BigInteger getItemPackageQuantity()
/*      */   {
/*  735 */     return this.itemPackageQuantity;
/*      */   }
/*      */ 
/*      */   public void setItemPackageQuantity(BigInteger value)
/*      */   {
/*  747 */     this.itemPackageQuantity = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfItems()
/*      */   {
/*  759 */     return this.numberOfItems;
/*      */   }
/*      */ 
/*      */   public void setNumberOfItems(BigInteger value)
/*      */   {
/*  771 */     this.numberOfItems = value;
/*      */   }
/*      */ 
/*      */   public VolumeDimension getLiquidVolume()
/*      */   {
/*  783 */     return this.liquidVolume;
/*      */   }
/*      */ 
/*      */   public void setLiquidVolume(VolumeDimension value)
/*      */   {
/*  795 */     this.liquidVolume = value;
/*      */   }
/*      */ 
/*      */   public DescriptionData getDescriptionData()
/*      */   {
/*  807 */     return this.descriptionData;
/*      */   }
/*      */ 
/*      */   public void setDescriptionData(DescriptionData value)
/*      */   {
/*  819 */     this.descriptionData = value;
/*      */   }
/*      */ 
/*      */   public PromoTag getPromoTag()
/*      */   {
/*  831 */     return this.promoTag;
/*      */   }
/*      */ 
/*      */   public void setPromoTag(PromoTag value)
/*      */   {
/*  843 */     this.promoTag = value;
/*      */   }
/*      */ 
/*      */   public DiscoveryData getDiscoveryData()
/*      */   {
/*  855 */     return this.discoveryData;
/*      */   }
/*      */ 
/*      */   public void setDiscoveryData(DiscoveryData value)
/*      */   {
/*  867 */     this.discoveryData = value;
/*      */   }
/*      */ 
/*      */   public ProductData getProductData()
/*      */   {
/*  879 */     return this.productData;
/*      */   }
/*      */ 
/*      */   public void setProductData(ProductData value)
/*      */   {
/*  891 */     this.productData = value;
/*      */   }
/*      */ 
/*      */   public Boolean isShippedByFreight()
/*      */   {
/*  903 */     return this.shippedByFreight;
/*      */   }
/*      */ 
/*      */   public void setShippedByFreight(Boolean value)
/*      */   {
/*  915 */     this.shippedByFreight = value;
/*      */   }
/*      */ 
/*      */   public List<String> getEnhancedImageURL()
/*      */   {
/*  941 */     if (this.enhancedImageURL == null) {
/*  942 */       this.enhancedImageURL = new ArrayList();
/*      */     }
/*  944 */     return this.enhancedImageURL;
/*      */   }
/*      */ 
/*      */   public AmazonVendorOnly getAmazonVendorOnly()
/*      */   {
/*  956 */     return this.amazonVendorOnly;
/*      */   }
/*      */ 
/*      */   public void setAmazonVendorOnly(AmazonVendorOnly value)
/*      */   {
/*  968 */     this.amazonVendorOnly = value;
/*      */   }
/*      */ 
/*      */   public AmazonOnly getAmazonOnly()
/*      */   {
/*  980 */     return this.amazonOnly;
/*      */   }
/*      */ 
/*      */   public void setAmazonOnly(AmazonOnly value)
/*      */   {
/*  992 */     this.amazonOnly = value;
/*      */   }
/*      */ 
/*      */   public String getRegisteredParameter()
/*      */   {
/* 1004 */     return this.registeredParameter;
/*      */   }
/*      */ 
/*      */   public void setRegisteredParameter(String value)
/*      */   {
/* 1016 */     this.registeredParameter = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"promoTagType", "effectiveFromDate", "effectiveThroughDate"})
/*      */   public static class PromoTag
/*      */   {
/*      */ 
/*      */     @XmlElement(name="PromoTagType", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String promoTagType;
/*      */ 
/*      */     @XmlElement(name="EffectiveFromDate", required=true)
/*      */     @XmlSchemaType(name="date")
/*      */     protected XMLGregorianCalendar effectiveFromDate;
/*      */ 
/*      */     @XmlElement(name="EffectiveThroughDate")
/*      */     @XmlSchemaType(name="date")
/*      */     protected XMLGregorianCalendar effectiveThroughDate;
/*      */ 
/*      */     public String getPromoTagType()
/*      */     {
/* 3029 */       return this.promoTagType;
/*      */     }
/*      */ 
/*      */     public void setPromoTagType(String value)
/*      */     {
/* 3041 */       this.promoTagType = value;
/*      */     }
/*      */ 
/*      */     public XMLGregorianCalendar getEffectiveFromDate()
/*      */     {
/* 3053 */       return this.effectiveFromDate;
/*      */     }
/*      */ 
/*      */     public void setEffectiveFromDate(XMLGregorianCalendar value)
/*      */     {
/* 3065 */       this.effectiveFromDate = value;
/*      */     }
/*      */ 
/*      */     public XMLGregorianCalendar getEffectiveThroughDate()
/*      */     {
/* 3077 */       return this.effectiveThroughDate;
/*      */     }
/*      */ 
/*      */     public void setEffectiveThroughDate(XMLGregorianCalendar value)
/*      */     {
/* 3089 */       this.effectiveThroughDate = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"home", "sports", "homeImprovement", "tools", "ce", "computers", "softwareVideoGames", "wireless", "lighting"})
/*      */   public static class ProductData
/*      */   {
/*      */ 
/*      */     @XmlElement(name="Home")
/*      */     protected Home home;
/*      */ 
/*      */     @XmlElement(name="Sports")
/*      */     protected Sports sports;
/*      */ 
/*      */     @XmlElement(name="HomeImprovement")
/*      */     protected HomeImprovement homeImprovement;
/*      */ 
/*      */     @XmlElement(name="Tools")
/*      */     protected Tools tools;
/*      */ 
/*      */     @XmlElement(name="CE")
/*      */     protected CE ce;
/*      */ 
/*      */     @XmlElement(name="Computers")
/*      */     protected Computers computers;
/*      */ 
/*      */     @XmlElement(name="SoftwareVideoGames")
/*      */     protected SoftwareVideoGames softwareVideoGames;
/*      */ 
/*      */     @XmlElement(name="Wireless")
/*      */     protected Wireless wireless;
/*      */ 
/*      */     @XmlElement(name="Lighting")
/*      */     protected Lighting lighting;
/*      */ 
/*      */     public Home getHome()
/*      */     {
/* 2757 */       return this.home;
/*      */     }
/*      */ 
/*      */     public void setHome(Home value)
/*      */     {
/* 2769 */       this.home = value;
/*      */     }
/*      */ 
/*      */     public Sports getSports()
/*      */     {
/* 2781 */       return this.sports;
/*      */     }
/*      */ 
/*      */     public void setSports(Sports value)
/*      */     {
/* 2793 */       this.sports = value;
/*      */     }
/*      */ 
/*      */     public HomeImprovement getHomeImprovement()
/*      */     {
/* 2805 */       return this.homeImprovement;
/*      */     }
/*      */ 
/*      */     public void setHomeImprovement(HomeImprovement value)
/*      */     {
/* 2817 */       this.homeImprovement = value;
/*      */     }
/*      */ 
/*      */     public Tools getTools()
/*      */     {
/* 2829 */       return this.tools;
/*      */     }
/*      */ 
/*      */     public void setTools(Tools value)
/*      */     {
/* 2841 */       this.tools = value;
/*      */     }
/*      */ 
/*      */     public CE getCE()
/*      */     {
/* 2853 */       return this.ce;
/*      */     }
/*      */ 
/*      */     public void setCE(CE value)
/*      */     {
/* 2865 */       this.ce = value;
/*      */     }
/*      */ 
/*      */     public Computers getComputers()
/*      */     {
/* 2877 */       return this.computers;
/*      */     }
/*      */ 
/*      */     public void setComputers(Computers value)
/*      */     {
/* 2889 */       this.computers = value;
/*      */     }
/*      */ 
/*      */     public SoftwareVideoGames getSoftwareVideoGames()
/*      */     {
/* 2901 */       return this.softwareVideoGames;
/*      */     }
/*      */ 
/*      */     public void setSoftwareVideoGames(SoftwareVideoGames value)
/*      */     {
/* 2913 */       this.softwareVideoGames = value;
/*      */     }
/*      */ 
/*      */     public Wireless getWireless()
/*      */     {
/* 2925 */       return this.wireless;
/*      */     }
/*      */ 
/*      */     public void setWireless(Wireless value)
/*      */     {
/* 2937 */       this.wireless = value;
/*      */     }
/*      */ 
/*      */     public Lighting getLighting()
/*      */     {
/* 2949 */       return this.lighting;
/*      */     }
/*      */ 
/*      */     public void setLighting(Lighting value)
/*      */     {
/* 2961 */       this.lighting = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"priority", "browseExclusion", "recommendationExclusion"})
/*      */   public static class DiscoveryData
/*      */   {
/*      */ 
/*      */     @XmlElement(name="Priority")
/*      */     protected Integer priority;
/*      */ 
/*      */     @XmlElement(name="BrowseExclusion")
/*      */     protected Boolean browseExclusion;
/*      */ 
/*      */     @XmlElement(name="RecommendationExclusion")
/*      */     protected Boolean recommendationExclusion;
/*      */ 
/*      */     public Integer getPriority()
/*      */     {
/* 2622 */       return this.priority;
/*      */     }
/*      */ 
/*      */     public void setPriority(Integer value)
/*      */     {
/* 2634 */       this.priority = value;
/*      */     }
/*      */ 
/*      */     public Boolean isBrowseExclusion()
/*      */     {
/* 2646 */       return this.browseExclusion;
/*      */     }
/*      */ 
/*      */     public void setBrowseExclusion(Boolean value)
/*      */     {
/* 2658 */       this.browseExclusion = value;
/*      */     }
/*      */ 
/*      */     public Boolean isRecommendationExclusion()
/*      */     {
/* 2670 */       return this.recommendationExclusion;
/*      */     }
/*      */ 
/*      */     public void setRecommendationExclusion(Boolean value)
/*      */     {
/* 2682 */       this.recommendationExclusion = value;
/*      */     }
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"title", "brand", "designer", "description", "bulletPoint", "itemDimensions", "packageDimensions", "packageWeight", "shippingWeight", "merchantCatalogNumber", "msrp", "msrpWithTax", "maxOrderQuantity", "serialNumberRequired", "prop65", "cpsiaWarning", "cpsiaWarningDescription", "legalDisclaimer", "manufacturer", "mfrPartNumber", "searchTerms", "platinumKeywords", "memorabilia", "autographed", "usedFor", "itemType", "otherItemAttributes", "targetAudience", "subjectContent", "isGiftWrapAvailable", "isGiftMessageAvailable", "promotionKeywords", "isDiscontinuedByManufacturer", "deliveryScheduleGroupID", "deliveryChannel", "purchasingChannel", "maxAggregateShipQuantity", "isCustomizable", "customizableTemplateName", "recommendedBrowseNode", "merchantShippingGroupName", "fedasid", "tsdAgeWarning", "tsdWarning", "tsdLanguage", "optionalPaymentTypeExclusion", "distributionDesignation"})
/*      */   public static class DescriptionData
/*      */   {
/*      */ 
/*      */     @XmlElement(name="Title", required=true)
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String title;
/*      */ 
/*      */     @XmlElement(name="Brand")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String brand;
/*      */ 
/*      */     @XmlElement(name="Designer")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String designer;
/*      */ 
/*      */     @XmlElement(name="Description")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String description;
/*      */ 
/*      */     @XmlElement(name="BulletPoint")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected List<String> bulletPoint;
/*      */ 
/*      */     @XmlElement(name="ItemDimensions")
/*      */     protected Dimensions itemDimensions;
/*      */ 
/*      */     @XmlElement(name="PackageDimensions")
/*      */     protected Dimensions packageDimensions;
/*      */ 
/*      */     @XmlElement(name="PackageWeight")
/*      */     protected PositiveWeightDimension packageWeight;
/*      */ 
/*      */     @XmlElement(name="ShippingWeight")
/*      */     protected PositiveWeightDimension shippingWeight;
/*      */ 
/*      */     @XmlElement(name="MerchantCatalogNumber")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String merchantCatalogNumber;
/*      */ 
/*      */     @XmlElement(name="MSRP")
/*      */     protected CurrencyAmount msrp;
/*      */ 
/*      */     @XmlElement(name="MSRPWithTax")
/*      */     protected CurrencyAmount msrpWithTax;
/*      */ 
/*      */     @XmlElement(name="MaxOrderQuantity")
/*      */     @XmlSchemaType(name="positiveInteger")
/*      */     protected BigInteger maxOrderQuantity;
/*      */ 
/*      */     @XmlElement(name="SerialNumberRequired")
/*      */     protected Boolean serialNumberRequired;
/*      */ 
/*      */     @XmlElement(name="Prop65")
/*      */     protected Boolean prop65;
/*      */ 
/*      */     @XmlElement(name="CPSIAWarning")
/*      */     protected List<String> cpsiaWarning;
/*      */ 
/*      */     @XmlElement(name="CPSIAWarningDescription")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String cpsiaWarningDescription;
/*      */ 
/*      */     @XmlElement(name="LegalDisclaimer")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String legalDisclaimer;
/*      */ 
/*      */     @XmlElement(name="Manufacturer")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String manufacturer;
/*      */ 
/*      */     @XmlElement(name="MfrPartNumber")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String mfrPartNumber;
/*      */ 
/*      */     @XmlElement(name="SearchTerms")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected List<String> searchTerms;
/*      */ 
/*      */     @XmlElement(name="PlatinumKeywords")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected List<String> platinumKeywords;
/*      */ 
/*      */     @XmlElement(name="Memorabilia")
/*      */     protected Boolean memorabilia;
/*      */ 
/*      */     @XmlElement(name="Autographed")
/*      */     protected Boolean autographed;
/*      */ 
/*      */     @XmlElement(name="UsedFor")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected List<String> usedFor;
/*      */ 
/*      */     @XmlElement(name="ItemType")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String itemType;
/*      */ 
/*      */     @XmlElement(name="OtherItemAttributes")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected List<String> otherItemAttributes;
/*      */ 
/*      */     @XmlElement(name="TargetAudience")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected List<String> targetAudience;
/*      */ 
/*      */     @XmlElement(name="SubjectContent")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected List<String> subjectContent;
/*      */ 
/*      */     @XmlElement(name="IsGiftWrapAvailable")
/*      */     protected Boolean isGiftWrapAvailable;
/*      */ 
/*      */     @XmlElement(name="IsGiftMessageAvailable")
/*      */     protected Boolean isGiftMessageAvailable;
/*      */ 
/*      */     @XmlElement(name="PromotionKeywords")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected List<String> promotionKeywords;
/*      */ 
/*      */     @XmlElement(name="IsDiscontinuedByManufacturer")
/*      */     protected Boolean isDiscontinuedByManufacturer;
/*      */ 
/*      */     @XmlElement(name="DeliveryScheduleGroupID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String deliveryScheduleGroupID;
/*      */ 
/*      */     @XmlElement(name="DeliveryChannel")
/*      */     protected List<String> deliveryChannel;
/*      */ 
/*      */     @XmlElement(name="PurchasingChannel")
/*      */     protected List<String> purchasingChannel;
/*      */ 
/*      */     @XmlElement(name="MaxAggregateShipQuantity")
/*      */     @XmlSchemaType(name="positiveInteger")
/*      */     protected BigInteger maxAggregateShipQuantity;
/*      */ 
/*      */     @XmlElement(name="IsCustomizable")
/*      */     protected Boolean isCustomizable;
/*      */ 
/*      */     @XmlElement(name="CustomizableTemplateName")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String customizableTemplateName;
/*      */ 
/*      */     @XmlElement(name="RecommendedBrowseNode")
/*      */     @XmlSchemaType(name="positiveInteger")
/*      */     protected List<BigInteger> recommendedBrowseNode;
/*      */ 
/*      */     @XmlElement(name="MerchantShippingGroupName")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String merchantShippingGroupName;
/*      */ 
/*      */     @XmlElement(name="FEDAS_ID")
/*      */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */     protected String fedasid;
/*      */ 
/*      */     @XmlElement(name="TSDAgeWarning")
/*      */     protected String tsdAgeWarning;
/*      */ 
/*      */     @XmlElement(name="TSDWarning")
/*      */     protected List<String> tsdWarning;
/*      */ 
/*      */     @XmlElement(name="TSDLanguage")
/*      */     protected List<String> tsdLanguage;
/*      */ 
/*      */     @XmlElement(name="OptionalPaymentTypeExclusion")
/*      */     protected List<String> optionalPaymentTypeExclusion;
/*      */ 
/*      */     @XmlElement(name="DistributionDesignation")
/*      */     protected DistributionDesignationValues distributionDesignation;
/*      */ 
/*      */     public String getTitle()
/*      */     {
/* 1373 */       return this.title;
/*      */     }
/*      */ 
/*      */     public void setTitle(String value)
/*      */     {
/* 1385 */       this.title = value;
/*      */     }
/*      */ 
/*      */     public String getBrand()
/*      */     {
/* 1397 */       return this.brand;
/*      */     }
/*      */ 
/*      */     public void setBrand(String value)
/*      */     {
/* 1409 */       this.brand = value;
/*      */     }
/*      */ 
/*      */     public String getDesigner()
/*      */     {
/* 1421 */       return this.designer;
/*      */     }
/*      */ 
/*      */     public void setDesigner(String value)
/*      */     {
/* 1433 */       this.designer = value;
/*      */     }
/*      */ 
/*      */     public String getDescription()
/*      */     {
/* 1445 */       return this.description;
/*      */     }
/*      */ 
/*      */     public void setDescription(String value)
/*      */     {
/* 1457 */       this.description = value;
/*      */     }
/*      */ 
/*      */     public List<String> getBulletPoint()
/*      */     {
/* 1483 */       if (this.bulletPoint == null) {
/* 1484 */         this.bulletPoint = new ArrayList();
/*      */       }
/* 1486 */       return this.bulletPoint;
/*      */     }
/*      */ 
/*      */     public Dimensions getItemDimensions()
/*      */     {
/* 1498 */       return this.itemDimensions;
/*      */     }
/*      */ 
/*      */     public void setItemDimensions(Dimensions value)
/*      */     {
/* 1510 */       this.itemDimensions = value;
/*      */     }
/*      */ 
/*      */     public Dimensions getPackageDimensions()
/*      */     {
/* 1522 */       return this.packageDimensions;
/*      */     }
/*      */ 
/*      */     public void setPackageDimensions(Dimensions value)
/*      */     {
/* 1534 */       this.packageDimensions = value;
/*      */     }
/*      */ 
/*      */     public PositiveWeightDimension getPackageWeight()
/*      */     {
/* 1546 */       return this.packageWeight;
/*      */     }
/*      */ 
/*      */     public void setPackageWeight(PositiveWeightDimension value)
/*      */     {
/* 1558 */       this.packageWeight = value;
/*      */     }
/*      */ 
/*      */     public PositiveWeightDimension getShippingWeight()
/*      */     {
/* 1570 */       return this.shippingWeight;
/*      */     }
/*      */ 
/*      */     public void setShippingWeight(PositiveWeightDimension value)
/*      */     {
/* 1582 */       this.shippingWeight = value;
/*      */     }
/*      */ 
/*      */     public String getMerchantCatalogNumber()
/*      */     {
/* 1594 */       return this.merchantCatalogNumber;
/*      */     }
/*      */ 
/*      */     public void setMerchantCatalogNumber(String value)
/*      */     {
/* 1606 */       this.merchantCatalogNumber = value;
/*      */     }
/*      */ 
/*      */     public CurrencyAmount getMSRP()
/*      */     {
/* 1618 */       return this.msrp;
/*      */     }
/*      */ 
/*      */     public void setMSRP(CurrencyAmount value)
/*      */     {
/* 1630 */       this.msrp = value;
/*      */     }
/*      */ 
/*      */     public CurrencyAmount getMSRPWithTax()
/*      */     {
/* 1642 */       return this.msrpWithTax;
/*      */     }
/*      */ 
/*      */     public void setMSRPWithTax(CurrencyAmount value)
/*      */     {
/* 1654 */       this.msrpWithTax = value;
/*      */     }
/*      */ 
/*      */     public BigInteger getMaxOrderQuantity()
/*      */     {
/* 1666 */       return this.maxOrderQuantity;
/*      */     }
/*      */ 
/*      */     public void setMaxOrderQuantity(BigInteger value)
/*      */     {
/* 1678 */       this.maxOrderQuantity = value;
/*      */     }
/*      */ 
/*      */     public Boolean isSerialNumberRequired()
/*      */     {
/* 1690 */       return this.serialNumberRequired;
/*      */     }
/*      */ 
/*      */     public void setSerialNumberRequired(Boolean value)
/*      */     {
/* 1702 */       this.serialNumberRequired = value;
/*      */     }
/*      */ 
/*      */     public Boolean isProp65()
/*      */     {
/* 1714 */       return this.prop65;
/*      */     }
/*      */ 
/*      */     public void setProp65(Boolean value)
/*      */     {
/* 1726 */       this.prop65 = value;
/*      */     }
/*      */ 
/*      */     public List<String> getCPSIAWarning()
/*      */     {
/* 1752 */       if (this.cpsiaWarning == null) {
/* 1753 */         this.cpsiaWarning = new ArrayList();
/*      */       }
/* 1755 */       return this.cpsiaWarning;
/*      */     }
/*      */ 
/*      */     public String getCPSIAWarningDescription()
/*      */     {
/* 1767 */       return this.cpsiaWarningDescription;
/*      */     }
/*      */ 
/*      */     public void setCPSIAWarningDescription(String value)
/*      */     {
/* 1779 */       this.cpsiaWarningDescription = value;
/*      */     }
/*      */ 
/*      */     public String getLegalDisclaimer()
/*      */     {
/* 1791 */       return this.legalDisclaimer;
/*      */     }
/*      */ 
/*      */     public void setLegalDisclaimer(String value)
/*      */     {
/* 1803 */       this.legalDisclaimer = value;
/*      */     }
/*      */ 
/*      */     public String getManufacturer()
/*      */     {
/* 1815 */       return this.manufacturer;
/*      */     }
/*      */ 
/*      */     public void setManufacturer(String value)
/*      */     {
/* 1827 */       this.manufacturer = value;
/*      */     }
/*      */ 
/*      */     public String getMfrPartNumber()
/*      */     {
/* 1839 */       return this.mfrPartNumber;
/*      */     }
/*      */ 
/*      */     public void setMfrPartNumber(String value)
/*      */     {
/* 1851 */       this.mfrPartNumber = value;
/*      */     }
/*      */ 
/*      */     public List<String> getSearchTerms()
/*      */     {
/* 1877 */       if (this.searchTerms == null) {
/* 1878 */         this.searchTerms = new ArrayList();
/*      */       }
/* 1880 */       return this.searchTerms;
/*      */     }
/*      */ 
/*      */     public List<String> getPlatinumKeywords()
/*      */     {
/* 1906 */       if (this.platinumKeywords == null) {
/* 1907 */         this.platinumKeywords = new ArrayList();
/*      */       }
/* 1909 */       return this.platinumKeywords;
/*      */     }
/*      */ 
/*      */     public Boolean isMemorabilia()
/*      */     {
/* 1921 */       return this.memorabilia;
/*      */     }
/*      */ 
/*      */     public void setMemorabilia(Boolean value)
/*      */     {
/* 1933 */       this.memorabilia = value;
/*      */     }
/*      */ 
/*      */     public Boolean isAutographed()
/*      */     {
/* 1945 */       return this.autographed;
/*      */     }
/*      */ 
/*      */     public void setAutographed(Boolean value)
/*      */     {
/* 1957 */       this.autographed = value;
/*      */     }
/*      */ 
/*      */     public List<String> getUsedFor()
/*      */     {
/* 1983 */       if (this.usedFor == null) {
/* 1984 */         this.usedFor = new ArrayList();
/*      */       }
/* 1986 */       return this.usedFor;
/*      */     }
/*      */ 
/*      */     public String getItemType()
/*      */     {
/* 1998 */       return this.itemType;
/*      */     }
/*      */ 
/*      */     public void setItemType(String value)
/*      */     {
/* 2010 */       this.itemType = value;
/*      */     }
/*      */ 
/*      */     public List<String> getOtherItemAttributes()
/*      */     {
/* 2036 */       if (this.otherItemAttributes == null) {
/* 2037 */         this.otherItemAttributes = new ArrayList();
/*      */       }
/* 2039 */       return this.otherItemAttributes;
/*      */     }
/*      */ 
/*      */     public List<String> getTargetAudience()
/*      */     {
/* 2065 */       if (this.targetAudience == null) {
/* 2066 */         this.targetAudience = new ArrayList();
/*      */       }
/* 2068 */       return this.targetAudience;
/*      */     }
/*      */ 
/*      */     public List<String> getSubjectContent()
/*      */     {
/* 2094 */       if (this.subjectContent == null) {
/* 2095 */         this.subjectContent = new ArrayList();
/*      */       }
/* 2097 */       return this.subjectContent;
/*      */     }
/*      */ 
/*      */     public Boolean isIsGiftWrapAvailable()
/*      */     {
/* 2109 */       return this.isGiftWrapAvailable;
/*      */     }
/*      */ 
/*      */     public void setIsGiftWrapAvailable(Boolean value)
/*      */     {
/* 2121 */       this.isGiftWrapAvailable = value;
/*      */     }
/*      */ 
/*      */     public Boolean isIsGiftMessageAvailable()
/*      */     {
/* 2133 */       return this.isGiftMessageAvailable;
/*      */     }
/*      */ 
/*      */     public void setIsGiftMessageAvailable(Boolean value)
/*      */     {
/* 2145 */       this.isGiftMessageAvailable = value;
/*      */     }
/*      */ 
/*      */     public List<String> getPromotionKeywords()
/*      */     {
/* 2171 */       if (this.promotionKeywords == null) {
/* 2172 */         this.promotionKeywords = new ArrayList();
/*      */       }
/* 2174 */       return this.promotionKeywords;
/*      */     }
/*      */ 
/*      */     public Boolean isIsDiscontinuedByManufacturer()
/*      */     {
/* 2186 */       return this.isDiscontinuedByManufacturer;
/*      */     }
/*      */ 
/*      */     public void setIsDiscontinuedByManufacturer(Boolean value)
/*      */     {
/* 2198 */       this.isDiscontinuedByManufacturer = value;
/*      */     }
/*      */ 
/*      */     public String getDeliveryScheduleGroupID()
/*      */     {
/* 2210 */       return this.deliveryScheduleGroupID;
/*      */     }
/*      */ 
/*      */     public void setDeliveryScheduleGroupID(String value)
/*      */     {
/* 2222 */       this.deliveryScheduleGroupID = value;
/*      */     }
/*      */ 
/*      */     public List<String> getDeliveryChannel()
/*      */     {
/* 2248 */       if (this.deliveryChannel == null) {
/* 2249 */         this.deliveryChannel = new ArrayList();
/*      */       }
/* 2251 */       return this.deliveryChannel;
/*      */     }
/*      */ 
/*      */     public List<String> getPurchasingChannel()
/*      */     {
/* 2277 */       if (this.purchasingChannel == null) {
/* 2278 */         this.purchasingChannel = new ArrayList();
/*      */       }
/* 2280 */       return this.purchasingChannel;
/*      */     }
/*      */ 
/*      */     public BigInteger getMaxAggregateShipQuantity()
/*      */     {
/* 2292 */       return this.maxAggregateShipQuantity;
/*      */     }
/*      */ 
/*      */     public void setMaxAggregateShipQuantity(BigInteger value)
/*      */     {
/* 2304 */       this.maxAggregateShipQuantity = value;
/*      */     }
/*      */ 
/*      */     public Boolean isIsCustomizable()
/*      */     {
/* 2316 */       return this.isCustomizable;
/*      */     }
/*      */ 
/*      */     public void setIsCustomizable(Boolean value)
/*      */     {
/* 2328 */       this.isCustomizable = value;
/*      */     }
/*      */ 
/*      */     public String getCustomizableTemplateName()
/*      */     {
/* 2340 */       return this.customizableTemplateName;
/*      */     }
/*      */ 
/*      */     public void setCustomizableTemplateName(String value)
/*      */     {
/* 2352 */       this.customizableTemplateName = value;
/*      */     }
/*      */ 
/*      */     public List<BigInteger> getRecommendedBrowseNode()
/*      */     {
/* 2378 */       if (this.recommendedBrowseNode == null) {
/* 2379 */         this.recommendedBrowseNode = new ArrayList();
/*      */       }
/* 2381 */       return this.recommendedBrowseNode;
/*      */     }
/*      */ 
/*      */     public String getMerchantShippingGroupName()
/*      */     {
/* 2393 */       return this.merchantShippingGroupName;
/*      */     }
/*      */ 
/*      */     public void setMerchantShippingGroupName(String value)
/*      */     {
/* 2405 */       this.merchantShippingGroupName = value;
/*      */     }
/*      */ 
/*      */     public String getFEDASID()
/*      */     {
/* 2417 */       return this.fedasid;
/*      */     }
/*      */ 
/*      */     public void setFEDASID(String value)
/*      */     {
/* 2429 */       this.fedasid = value;
/*      */     }
/*      */ 
/*      */     public String getTSDAgeWarning()
/*      */     {
/* 2441 */       return this.tsdAgeWarning;
/*      */     }
/*      */ 
/*      */     public void setTSDAgeWarning(String value)
/*      */     {
/* 2453 */       this.tsdAgeWarning = value;
/*      */     }
/*      */ 
/*      */     public List<String> getTSDWarning()
/*      */     {
/* 2479 */       if (this.tsdWarning == null) {
/* 2480 */         this.tsdWarning = new ArrayList();
/*      */       }
/* 2482 */       return this.tsdWarning;
/*      */     }
/*      */ 
/*      */     public List<String> getTSDLanguage()
/*      */     {
/* 2508 */       if (this.tsdLanguage == null) {
/* 2509 */         this.tsdLanguage = new ArrayList();
/*      */       }
/* 2511 */       return this.tsdLanguage;
/*      */     }
/*      */ 
/*      */     public List<String> getOptionalPaymentTypeExclusion()
/*      */     {
/* 2537 */       if (this.optionalPaymentTypeExclusion == null) {
/* 2538 */         this.optionalPaymentTypeExclusion = new ArrayList();
/*      */       }
/* 2540 */       return this.optionalPaymentTypeExclusion;
/*      */     }
/*      */ 
/*      */     public DistributionDesignationValues getDistributionDesignation()
/*      */     {
/* 2552 */       return this.distributionDesignation;
/*      */     }
/*      */ 
/*      */     public void setDistributionDesignation(DistributionDesignationValues value)
/*      */     {
/* 2564 */       this.distributionDesignation = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Product
 * JD-Core Version:    0.6.2
 */