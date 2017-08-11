
package com.elcuk.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}SKU"/>
 *         &lt;element ref="{}StandardProductID" minOccurs="0"/>
 *         &lt;element name="GtinExemptionReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="bundle"/>
 *               &lt;enumeration value="part"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}RelatedProductID" minOccurs="0"/>
 *         &lt;element ref="{}ProductTaxCode" minOccurs="0"/>
 *         &lt;element name="LaunchDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DiscontinueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExternalProductUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="OffAmazonChannel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="advertise"/>
 *               &lt;enumeration value="exclude"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OnAmazonChannel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="sell"/>
 *               &lt;enumeration value="advertise"/>
 *               &lt;enumeration value="exclude"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Condition" type="{}ConditionInfo" minOccurs="0"/>
 *         &lt;element name="Rebate" type="{}RebateType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="LiquidVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="DescriptionData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Title" type="{}LongStringNotNull"/>
 *                   &lt;element name="Brand" type="{}HundredString" minOccurs="0"/>
 *                   &lt;element name="Designer" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Description" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BulletPoint" type="{}LongStringNotNull" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="ItemDimensions" type="{}Dimensions" minOccurs="0"/>
 *                   &lt;element name="PackageDimensions" type="{}Dimensions" minOccurs="0"/>
 *                   &lt;element name="PackageWeight" type="{}PositiveWeightDimension" minOccurs="0"/>
 *                   &lt;element name="ShippingWeight" type="{}PositiveWeightDimension" minOccurs="0"/>
 *                   &lt;element name="MerchantCatalogNumber" type="{}FortyStringNotNull" minOccurs="0"/>
 *                   &lt;element name="MSRP" type="{}CurrencyAmount" minOccurs="0"/>
 *                   &lt;element name="MSRPWithTax" type="{}CurrencyAmount" minOccurs="0"/>
 *                   &lt;element name="MaxOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="SerialNumberRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Prop65" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="CPSIAWarning" maxOccurs="4" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="choking_hazard_balloon"/>
 *                         &lt;enumeration value="choking_hazard_contains_a_marble"/>
 *                         &lt;enumeration value="choking_hazard_contains_small_ball"/>
 *                         &lt;enumeration value="choking_hazard_is_a_marble"/>
 *                         &lt;enumeration value="choking_hazard_is_a_small_ball"/>
 *                         &lt;enumeration value="choking_hazard_small_parts"/>
 *                         &lt;enumeration value="no_warning_applicable"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CPSIAWarningDescription" type="{}TwoFiftyStringNotNull" minOccurs="0"/>
 *                   &lt;element name="LegalDisclaimer" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *                         &lt;maxLength value="2500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Manufacturer" type="{}HundredString" minOccurs="0"/>
 *                   &lt;element name="MfrPartNumber" type="{}FortyStringNotNull" minOccurs="0"/>
 *                   &lt;element name="SearchTerms" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="PlatinumKeywords" type="{}StringNotNull" maxOccurs="20" minOccurs="0"/>
 *                   &lt;element name="Memorabilia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Autographed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="UsedFor" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="ItemType" type="{}LongStringNotNull" minOccurs="0"/>
 *                   &lt;element name="OtherItemAttributes" type="{}LongStringNotNull" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="TargetAudience" type="{}StringNotNull" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="SubjectContent" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="IsGiftWrapAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="IsGiftMessageAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="PromotionKeywords" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *                   &lt;element name="IsDiscontinuedByManufacturer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="DeliveryScheduleGroupID" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element ref="{}DeliveryChannel" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="PurchasingChannel" maxOccurs="2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="in_store"/>
 *                         &lt;enumeration value="online"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MaxAggregateShipQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="IsCustomizable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="CustomizableTemplateName" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="RecommendedBrowseNode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="MerchantShippingGroupName" type="{}LongString" minOccurs="0"/>
 *                   &lt;element name="FEDAS_ID" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *                         &lt;length value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TSDAgeWarning" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="not_suitable_under_36_months"/>
 *                         &lt;enumeration value="not_suitable_under_3_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_4_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_5_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_6_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_7_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_8_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_9_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_10_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_11_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_12_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_13_years_supervision"/>
 *                         &lt;enumeration value="not_suitable_under_14_years_supervision"/>
 *                         &lt;enumeration value="no_warning_applicable"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TSDWarning" maxOccurs="8" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="only_domestic_use"/>
 *                         &lt;enumeration value="adult_supervision_required"/>
 *                         &lt;enumeration value="protective_equipment_required"/>
 *                         &lt;enumeration value="water_adult_supervision_required"/>
 *                         &lt;enumeration value="toy_inside"/>
 *                         &lt;enumeration value="no_protective_equipment"/>
 *                         &lt;enumeration value="risk_of_entanglement"/>
 *                         &lt;enumeration value="fragrances_allergy_risk"/>
 *                         &lt;enumeration value="no_warning_applicable"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TSDLanguage" maxOccurs="21" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="English"/>
 *                         &lt;enumeration value="French"/>
 *                         &lt;enumeration value="German"/>
 *                         &lt;enumeration value="Italian"/>
 *                         &lt;enumeration value="Spanish"/>
 *                         &lt;enumeration value="Dutch"/>
 *                         &lt;enumeration value="Polish"/>
 *                         &lt;enumeration value="Bulgarian"/>
 *                         &lt;enumeration value="Czech"/>
 *                         &lt;enumeration value="Danish"/>
 *                         &lt;enumeration value="Estonian"/>
 *                         &lt;enumeration value="Finnish"/>
 *                         &lt;enumeration value="Greek"/>
 *                         &lt;enumeration value="Hungarian"/>
 *                         &lt;enumeration value="Latvian"/>
 *                         &lt;enumeration value="Lithuanian"/>
 *                         &lt;enumeration value="Portuguese"/>
 *                         &lt;enumeration value="Romanian"/>
 *                         &lt;enumeration value="Slovak"/>
 *                         &lt;enumeration value="Slovene"/>
 *                         &lt;enumeration value="Swedish"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OptionalPaymentTypeExclusion" maxOccurs="2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="cash_on_delivery"/>
 *                         &lt;enumeration value="cvs"/>
 *                         &lt;enumeration value="exclude_none"/>
 *                         &lt;enumeration value="exclude cod"/>
 *                         &lt;enumeration value="exclude cvs"/>
 *                         &lt;enumeration value="exclude cod and cvs"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DistributionDesignation" type="{}DistributionDesignationValues" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PromoTag" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PromoTagType">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *                         &lt;enumeration value="Sale"/>
 *                         &lt;enumeration value="New"/>
 *                         &lt;enumeration value="NewArrival"/>
 *                         &lt;enumeration value="WebOnly"/>
 *                         &lt;enumeration value="Clearance"/>
 *                         &lt;enumeration value="LimitedOffer"/>
 *                         &lt;enumeration value="SpecialOffer"/>
 *                         &lt;enumeration value="SpecialPurchase"/>
 *                         &lt;enumeration value="OnlyInStores"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="EffectiveFromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="EffectiveThroughDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DiscoveryData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Priority" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         &lt;minInclusive value="1"/>
 *                         &lt;maxInclusive value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BrowseExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="RecommendationExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}Home"/>
 *                   &lt;element ref="{}Sports"/>
 *                   &lt;element ref="{}HomeImprovement"/>
 *                   &lt;element ref="{}Tools"/>
 *                   &lt;element ref="{}CE"/>
 *                   &lt;element ref="{}Computers"/>
 *                   &lt;element ref="{}SoftwareVideoGames"/>
 *                   &lt;element ref="{}Wireless"/>
 *                   &lt;element ref="{}Lighting"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShippedByFreight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnhancedImageURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{}Amazon-Vendor-Only" minOccurs="0"/>
 *         &lt;element ref="{}Amazon-Only" minOccurs="0"/>
 *         &lt;element name="RegisteredParameter" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PrivateLabel"/>
 *               &lt;enumeration value="Specialized"/>
 *               &lt;enumeration value="NonConsumer"/>
 *               &lt;enumeration value="PreConfigured"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sku",
    "standardProductID",
    "gtinExemptionReason",
    "relatedProductID",
    "productTaxCode",
    "launchDate",
    "discontinueDate",
    "releaseDate",
    "externalProductUrl",
    "offAmazonChannel",
    "onAmazonChannel",
    "condition",
    "rebate",
    "itemPackageQuantity",
    "numberOfItems",
    "liquidVolume",
    "descriptionData",
    "promoTag",
    "discoveryData",
    "productData",
    "shippedByFreight",
    "enhancedImageURL",
    "amazonVendorOnly",
    "amazonOnly",
    "registeredParameter"
})
@XmlRootElement(name = "Product")
public class Product {

    @XmlElement(name = "SKU", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sku;
    @XmlElement(name = "StandardProductID")
    protected StandardProductID standardProductID;
    @XmlElement(name = "GtinExemptionReason")
    protected String gtinExemptionReason;
    @XmlElement(name = "RelatedProductID")
    protected RelatedProductID relatedProductID;
    @XmlElement(name = "ProductTaxCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String productTaxCode;
    @XmlElement(name = "LaunchDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar launchDate;
    @XmlElement(name = "DiscontinueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar discontinueDate;
    @XmlElement(name = "ReleaseDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDate;
    @XmlElement(name = "ExternalProductUrl")
    @XmlSchemaType(name = "anyURI")
    protected String externalProductUrl;
    @XmlElement(name = "OffAmazonChannel")
    protected String offAmazonChannel;
    @XmlElement(name = "OnAmazonChannel")
    protected String onAmazonChannel;
    @XmlElement(name = "Condition")
    protected ConditionInfo condition;
    @XmlElement(name = "Rebate")
    protected List<RebateType> rebate;
    @XmlElement(name = "ItemPackageQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;
    @XmlElement(name = "NumberOfItems")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItems;
    @XmlElement(name = "LiquidVolume")
    protected VolumeDimension liquidVolume;
    @XmlElement(name = "DescriptionData")
    protected Product.DescriptionData descriptionData;
    @XmlElement(name = "PromoTag")
    protected Product.PromoTag promoTag;
    @XmlElement(name = "DiscoveryData")
    protected Product.DiscoveryData discoveryData;
    @XmlElement(name = "ProductData")
    protected Product.ProductData productData;
    @XmlElement(name = "ShippedByFreight")
    protected Boolean shippedByFreight;
    @XmlElement(name = "EnhancedImageURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> enhancedImageURL;
    @XmlElement(name = "Amazon-Vendor-Only")
    protected AmazonVendorOnly amazonVendorOnly;
    @XmlElement(name = "Amazon-Only")
    protected AmazonOnly amazonOnly;
    @XmlElement(name = "RegisteredParameter")
    protected String registeredParameter;

    /**
     * 获取sku属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * 设置sku属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * 获取standardProductID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StandardProductID }
     *     
     */
    public StandardProductID getStandardProductID() {
        return standardProductID;
    }

    /**
     * 设置standardProductID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StandardProductID }
     *     
     */
    public void setStandardProductID(StandardProductID value) {
        this.standardProductID = value;
    }

    /**
     * 获取gtinExemptionReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtinExemptionReason() {
        return gtinExemptionReason;
    }

    /**
     * 设置gtinExemptionReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtinExemptionReason(String value) {
        this.gtinExemptionReason = value;
    }

    /**
     * 获取relatedProductID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelatedProductID }
     *     
     */
    public RelatedProductID getRelatedProductID() {
        return relatedProductID;
    }

    /**
     * 设置relatedProductID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedProductID }
     *     
     */
    public void setRelatedProductID(RelatedProductID value) {
        this.relatedProductID = value;
    }

    /**
     * 获取productTaxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTaxCode() {
        return productTaxCode;
    }

    /**
     * 设置productTaxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTaxCode(String value) {
        this.productTaxCode = value;
    }

    /**
     * 获取launchDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLaunchDate() {
        return launchDate;
    }

    /**
     * 设置launchDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLaunchDate(XMLGregorianCalendar value) {
        this.launchDate = value;
    }

    /**
     * 获取discontinueDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscontinueDate() {
        return discontinueDate;
    }

    /**
     * 设置discontinueDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscontinueDate(XMLGregorianCalendar value) {
        this.discontinueDate = value;
    }

    /**
     * 获取releaseDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * 设置releaseDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

    /**
     * 获取externalProductUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalProductUrl() {
        return externalProductUrl;
    }

    /**
     * 设置externalProductUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalProductUrl(String value) {
        this.externalProductUrl = value;
    }

    /**
     * 获取offAmazonChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffAmazonChannel() {
        return offAmazonChannel;
    }

    /**
     * 设置offAmazonChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffAmazonChannel(String value) {
        this.offAmazonChannel = value;
    }

    /**
     * 获取onAmazonChannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnAmazonChannel() {
        return onAmazonChannel;
    }

    /**
     * 设置onAmazonChannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnAmazonChannel(String value) {
        this.onAmazonChannel = value;
    }

    /**
     * 获取condition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConditionInfo }
     *     
     */
    public ConditionInfo getCondition() {
        return condition;
    }

    /**
     * 设置condition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionInfo }
     *     
     */
    public void setCondition(ConditionInfo value) {
        this.condition = value;
    }

    /**
     * Gets the value of the rebate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rebate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRebate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RebateType }
     * 
     * 
     */
    public List<RebateType> getRebate() {
        if (rebate == null) {
            rebate = new ArrayList<RebateType>();
        }
        return this.rebate;
    }

    /**
     * 获取itemPackageQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemPackageQuantity() {
        return itemPackageQuantity;
    }

    /**
     * 设置itemPackageQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemPackageQuantity(BigInteger value) {
        this.itemPackageQuantity = value;
    }

    /**
     * 获取numberOfItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * 设置numberOfItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItems(BigInteger value) {
        this.numberOfItems = value;
    }

    /**
     * 获取liquidVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getLiquidVolume() {
        return liquidVolume;
    }

    /**
     * 设置liquidVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setLiquidVolume(VolumeDimension value) {
        this.liquidVolume = value;
    }

    /**
     * 获取descriptionData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Product.DescriptionData }
     *     
     */
    public Product.DescriptionData getDescriptionData() {
        return descriptionData;
    }

    /**
     * 设置descriptionData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Product.DescriptionData }
     *     
     */
    public void setDescriptionData(Product.DescriptionData value) {
        this.descriptionData = value;
    }

    /**
     * 获取promoTag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Product.PromoTag }
     *     
     */
    public Product.PromoTag getPromoTag() {
        return promoTag;
    }

    /**
     * 设置promoTag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Product.PromoTag }
     *     
     */
    public void setPromoTag(Product.PromoTag value) {
        this.promoTag = value;
    }

    /**
     * 获取discoveryData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Product.DiscoveryData }
     *     
     */
    public Product.DiscoveryData getDiscoveryData() {
        return discoveryData;
    }

    /**
     * 设置discoveryData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Product.DiscoveryData }
     *     
     */
    public void setDiscoveryData(Product.DiscoveryData value) {
        this.discoveryData = value;
    }

    /**
     * 获取productData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Product.ProductData }
     *     
     */
    public Product.ProductData getProductData() {
        return productData;
    }

    /**
     * 设置productData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Product.ProductData }
     *     
     */
    public void setProductData(Product.ProductData value) {
        this.productData = value;
    }

    /**
     * 获取shippedByFreight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippedByFreight() {
        return shippedByFreight;
    }

    /**
     * 设置shippedByFreight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippedByFreight(Boolean value) {
        this.shippedByFreight = value;
    }

    /**
     * Gets the value of the enhancedImageURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedImageURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedImageURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnhancedImageURL() {
        if (enhancedImageURL == null) {
            enhancedImageURL = new ArrayList<String>();
        }
        return this.enhancedImageURL;
    }

    /**
     * 获取amazonVendorOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmazonVendorOnly }
     *     
     */
    public AmazonVendorOnly getAmazonVendorOnly() {
        return amazonVendorOnly;
    }

    /**
     * 设置amazonVendorOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmazonVendorOnly }
     *     
     */
    public void setAmazonVendorOnly(AmazonVendorOnly value) {
        this.amazonVendorOnly = value;
    }

    /**
     * 获取amazonOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmazonOnly }
     *     
     */
    public AmazonOnly getAmazonOnly() {
        return amazonOnly;
    }

    /**
     * 设置amazonOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmazonOnly }
     *     
     */
    public void setAmazonOnly(AmazonOnly value) {
        this.amazonOnly = value;
    }

    /**
     * 获取registeredParameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredParameter() {
        return registeredParameter;
    }

    /**
     * 设置registeredParameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredParameter(String value) {
        this.registeredParameter = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Title" type="{}LongStringNotNull"/>
     *         &lt;element name="Brand" type="{}HundredString" minOccurs="0"/>
     *         &lt;element name="Designer" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Description" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BulletPoint" type="{}LongStringNotNull" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="ItemDimensions" type="{}Dimensions" minOccurs="0"/>
     *         &lt;element name="PackageDimensions" type="{}Dimensions" minOccurs="0"/>
     *         &lt;element name="PackageWeight" type="{}PositiveWeightDimension" minOccurs="0"/>
     *         &lt;element name="ShippingWeight" type="{}PositiveWeightDimension" minOccurs="0"/>
     *         &lt;element name="MerchantCatalogNumber" type="{}FortyStringNotNull" minOccurs="0"/>
     *         &lt;element name="MSRP" type="{}CurrencyAmount" minOccurs="0"/>
     *         &lt;element name="MSRPWithTax" type="{}CurrencyAmount" minOccurs="0"/>
     *         &lt;element name="MaxOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="SerialNumberRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Prop65" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CPSIAWarning" maxOccurs="4" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="choking_hazard_balloon"/>
     *               &lt;enumeration value="choking_hazard_contains_a_marble"/>
     *               &lt;enumeration value="choking_hazard_contains_small_ball"/>
     *               &lt;enumeration value="choking_hazard_is_a_marble"/>
     *               &lt;enumeration value="choking_hazard_is_a_small_ball"/>
     *               &lt;enumeration value="choking_hazard_small_parts"/>
     *               &lt;enumeration value="no_warning_applicable"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CPSIAWarningDescription" type="{}TwoFiftyStringNotNull" minOccurs="0"/>
     *         &lt;element name="LegalDisclaimer" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
     *               &lt;maxLength value="2500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Manufacturer" type="{}HundredString" minOccurs="0"/>
     *         &lt;element name="MfrPartNumber" type="{}FortyStringNotNull" minOccurs="0"/>
     *         &lt;element name="SearchTerms" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="PlatinumKeywords" type="{}StringNotNull" maxOccurs="20" minOccurs="0"/>
     *         &lt;element name="Memorabilia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Autographed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="UsedFor" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="ItemType" type="{}LongStringNotNull" minOccurs="0"/>
     *         &lt;element name="OtherItemAttributes" type="{}LongStringNotNull" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="TargetAudience" type="{}StringNotNull" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="SubjectContent" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="IsGiftWrapAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="IsGiftMessageAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="PromotionKeywords" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
     *         &lt;element name="IsDiscontinuedByManufacturer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="DeliveryScheduleGroupID" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element ref="{}DeliveryChannel" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="PurchasingChannel" maxOccurs="2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="in_store"/>
     *               &lt;enumeration value="online"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MaxAggregateShipQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="IsCustomizable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="CustomizableTemplateName" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="RecommendedBrowseNode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="MerchantShippingGroupName" type="{}LongString" minOccurs="0"/>
     *         &lt;element name="FEDAS_ID" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
     *               &lt;length value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TSDAgeWarning" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="not_suitable_under_36_months"/>
     *               &lt;enumeration value="not_suitable_under_3_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_4_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_5_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_6_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_7_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_8_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_9_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_10_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_11_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_12_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_13_years_supervision"/>
     *               &lt;enumeration value="not_suitable_under_14_years_supervision"/>
     *               &lt;enumeration value="no_warning_applicable"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TSDWarning" maxOccurs="8" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="only_domestic_use"/>
     *               &lt;enumeration value="adult_supervision_required"/>
     *               &lt;enumeration value="protective_equipment_required"/>
     *               &lt;enumeration value="water_adult_supervision_required"/>
     *               &lt;enumeration value="toy_inside"/>
     *               &lt;enumeration value="no_protective_equipment"/>
     *               &lt;enumeration value="risk_of_entanglement"/>
     *               &lt;enumeration value="fragrances_allergy_risk"/>
     *               &lt;enumeration value="no_warning_applicable"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TSDLanguage" maxOccurs="21" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="English"/>
     *               &lt;enumeration value="French"/>
     *               &lt;enumeration value="German"/>
     *               &lt;enumeration value="Italian"/>
     *               &lt;enumeration value="Spanish"/>
     *               &lt;enumeration value="Dutch"/>
     *               &lt;enumeration value="Polish"/>
     *               &lt;enumeration value="Bulgarian"/>
     *               &lt;enumeration value="Czech"/>
     *               &lt;enumeration value="Danish"/>
     *               &lt;enumeration value="Estonian"/>
     *               &lt;enumeration value="Finnish"/>
     *               &lt;enumeration value="Greek"/>
     *               &lt;enumeration value="Hungarian"/>
     *               &lt;enumeration value="Latvian"/>
     *               &lt;enumeration value="Lithuanian"/>
     *               &lt;enumeration value="Portuguese"/>
     *               &lt;enumeration value="Romanian"/>
     *               &lt;enumeration value="Slovak"/>
     *               &lt;enumeration value="Slovene"/>
     *               &lt;enumeration value="Swedish"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OptionalPaymentTypeExclusion" maxOccurs="2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="cash_on_delivery"/>
     *               &lt;enumeration value="cvs"/>
     *               &lt;enumeration value="exclude_none"/>
     *               &lt;enumeration value="exclude cod"/>
     *               &lt;enumeration value="exclude cvs"/>
     *               &lt;enumeration value="exclude cod and cvs"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DistributionDesignation" type="{}DistributionDesignationValues" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "brand",
        "designer",
        "description",
        "bulletPoint",
        "itemDimensions",
        "packageDimensions",
        "packageWeight",
        "shippingWeight",
        "merchantCatalogNumber",
        "msrp",
        "msrpWithTax",
        "maxOrderQuantity",
        "serialNumberRequired",
        "prop65",
        "cpsiaWarning",
        "cpsiaWarningDescription",
        "legalDisclaimer",
        "manufacturer",
        "mfrPartNumber",
        "searchTerms",
        "platinumKeywords",
        "memorabilia",
        "autographed",
        "usedFor",
        "itemType",
        "otherItemAttributes",
        "targetAudience",
        "subjectContent",
        "isGiftWrapAvailable",
        "isGiftMessageAvailable",
        "promotionKeywords",
        "isDiscontinuedByManufacturer",
        "deliveryScheduleGroupID",
        "deliveryChannel",
        "purchasingChannel",
        "maxAggregateShipQuantity",
        "isCustomizable",
        "customizableTemplateName",
        "recommendedBrowseNode",
        "merchantShippingGroupName",
        "fedasid",
        "tsdAgeWarning",
        "tsdWarning",
        "tsdLanguage",
        "optionalPaymentTypeExclusion",
        "distributionDesignation"
    })
    public static class DescriptionData {

        @XmlElement(name = "Title", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String title;
        @XmlElement(name = "Brand")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String brand;
        @XmlElement(name = "Designer")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String designer;
        @XmlElement(name = "Description")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String description;
        @XmlElement(name = "BulletPoint")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> bulletPoint;
        @XmlElement(name = "ItemDimensions")
        protected Dimensions itemDimensions;
        @XmlElement(name = "PackageDimensions")
        protected Dimensions packageDimensions;
        @XmlElement(name = "PackageWeight")
        protected PositiveWeightDimension packageWeight;
        @XmlElement(name = "ShippingWeight")
        protected PositiveWeightDimension shippingWeight;
        @XmlElement(name = "MerchantCatalogNumber")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String merchantCatalogNumber;
        @XmlElement(name = "MSRP")
        protected CurrencyAmount msrp;
        @XmlElement(name = "MSRPWithTax")
        protected CurrencyAmount msrpWithTax;
        @XmlElement(name = "MaxOrderQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxOrderQuantity;
        @XmlElement(name = "SerialNumberRequired")
        protected Boolean serialNumberRequired;
        @XmlElement(name = "Prop65")
        protected Boolean prop65;
        @XmlElement(name = "CPSIAWarning")
        protected List<String> cpsiaWarning;
        @XmlElement(name = "CPSIAWarningDescription")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String cpsiaWarningDescription;
        @XmlElement(name = "LegalDisclaimer")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String legalDisclaimer;
        @XmlElement(name = "Manufacturer")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String manufacturer;
        @XmlElement(name = "MfrPartNumber")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String mfrPartNumber;
        @XmlElement(name = "SearchTerms")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> searchTerms;
        @XmlElement(name = "PlatinumKeywords")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> platinumKeywords;
        @XmlElement(name = "Memorabilia")
        protected Boolean memorabilia;
        @XmlElement(name = "Autographed")
        protected Boolean autographed;
        @XmlElement(name = "UsedFor")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> usedFor;
        @XmlElement(name = "ItemType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String itemType;
        @XmlElement(name = "OtherItemAttributes")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> otherItemAttributes;
        @XmlElement(name = "TargetAudience")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> targetAudience;
        @XmlElement(name = "SubjectContent")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> subjectContent;
        @XmlElement(name = "IsGiftWrapAvailable")
        protected Boolean isGiftWrapAvailable;
        @XmlElement(name = "IsGiftMessageAvailable")
        protected Boolean isGiftMessageAvailable;
        @XmlElement(name = "PromotionKeywords")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> promotionKeywords;
        @XmlElement(name = "IsDiscontinuedByManufacturer")
        protected Boolean isDiscontinuedByManufacturer;
        @XmlElement(name = "DeliveryScheduleGroupID")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String deliveryScheduleGroupID;
        @XmlElement(name = "DeliveryChannel")
        protected List<String> deliveryChannel;
        @XmlElement(name = "PurchasingChannel")
        protected List<String> purchasingChannel;
        @XmlElement(name = "MaxAggregateShipQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxAggregateShipQuantity;
        @XmlElement(name = "IsCustomizable")
        protected Boolean isCustomizable;
        @XmlElement(name = "CustomizableTemplateName")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String customizableTemplateName;
        @XmlElement(name = "RecommendedBrowseNode")
        @XmlSchemaType(name = "positiveInteger")
        protected List<BigInteger> recommendedBrowseNode;
        @XmlElement(name = "MerchantShippingGroupName")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String merchantShippingGroupName;
        @XmlElement(name = "FEDAS_ID")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String fedasid;
        @XmlElement(name = "TSDAgeWarning")
        protected String tsdAgeWarning;
        @XmlElement(name = "TSDWarning")
        protected List<String> tsdWarning;
        @XmlElement(name = "TSDLanguage")
        protected List<String> tsdLanguage;
        @XmlElement(name = "OptionalPaymentTypeExclusion")
        protected List<String> optionalPaymentTypeExclusion;
        @XmlElement(name = "DistributionDesignation")
        @XmlSchemaType(name = "string")
        protected DistributionDesignationValues distributionDesignation;

        /**
         * 获取title属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * 设置title属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * 获取brand属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrand() {
            return brand;
        }

        /**
         * 设置brand属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrand(String value) {
            this.brand = value;
        }

        /**
         * 获取designer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesigner() {
            return designer;
        }

        /**
         * 设置designer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesigner(String value) {
            this.designer = value;
        }

        /**
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the bulletPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bulletPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBulletPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBulletPoint() {
            if (bulletPoint == null) {
                bulletPoint = new ArrayList<String>();
            }
            return this.bulletPoint;
        }

        /**
         * 获取itemDimensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Dimensions }
         *     
         */
        public Dimensions getItemDimensions() {
            return itemDimensions;
        }

        /**
         * 设置itemDimensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Dimensions }
         *     
         */
        public void setItemDimensions(Dimensions value) {
            this.itemDimensions = value;
        }

        /**
         * 获取packageDimensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Dimensions }
         *     
         */
        public Dimensions getPackageDimensions() {
            return packageDimensions;
        }

        /**
         * 设置packageDimensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Dimensions }
         *     
         */
        public void setPackageDimensions(Dimensions value) {
            this.packageDimensions = value;
        }

        /**
         * 获取packageWeight属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PositiveWeightDimension }
         *     
         */
        public PositiveWeightDimension getPackageWeight() {
            return packageWeight;
        }

        /**
         * 设置packageWeight属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PositiveWeightDimension }
         *     
         */
        public void setPackageWeight(PositiveWeightDimension value) {
            this.packageWeight = value;
        }

        /**
         * 获取shippingWeight属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PositiveWeightDimension }
         *     
         */
        public PositiveWeightDimension getShippingWeight() {
            return shippingWeight;
        }

        /**
         * 设置shippingWeight属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PositiveWeightDimension }
         *     
         */
        public void setShippingWeight(PositiveWeightDimension value) {
            this.shippingWeight = value;
        }

        /**
         * 获取merchantCatalogNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMerchantCatalogNumber() {
            return merchantCatalogNumber;
        }

        /**
         * 设置merchantCatalogNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMerchantCatalogNumber(String value) {
            this.merchantCatalogNumber = value;
        }

        /**
         * 获取msrp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmount }
         *     
         */
        public CurrencyAmount getMSRP() {
            return msrp;
        }

        /**
         * 设置msrp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmount }
         *     
         */
        public void setMSRP(CurrencyAmount value) {
            this.msrp = value;
        }

        /**
         * 获取msrpWithTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmount }
         *     
         */
        public CurrencyAmount getMSRPWithTax() {
            return msrpWithTax;
        }

        /**
         * 设置msrpWithTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmount }
         *     
         */
        public void setMSRPWithTax(CurrencyAmount value) {
            this.msrpWithTax = value;
        }

        /**
         * 获取maxOrderQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxOrderQuantity() {
            return maxOrderQuantity;
        }

        /**
         * 设置maxOrderQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxOrderQuantity(BigInteger value) {
            this.maxOrderQuantity = value;
        }

        /**
         * 获取serialNumberRequired属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSerialNumberRequired() {
            return serialNumberRequired;
        }

        /**
         * 设置serialNumberRequired属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSerialNumberRequired(Boolean value) {
            this.serialNumberRequired = value;
        }

        /**
         * 获取prop65属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isProp65() {
            return prop65;
        }

        /**
         * 设置prop65属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setProp65(Boolean value) {
            this.prop65 = value;
        }

        /**
         * Gets the value of the cpsiaWarning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cpsiaWarning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCPSIAWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCPSIAWarning() {
            if (cpsiaWarning == null) {
                cpsiaWarning = new ArrayList<String>();
            }
            return this.cpsiaWarning;
        }

        /**
         * 获取cpsiaWarningDescription属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPSIAWarningDescription() {
            return cpsiaWarningDescription;
        }

        /**
         * 设置cpsiaWarningDescription属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPSIAWarningDescription(String value) {
            this.cpsiaWarningDescription = value;
        }

        /**
         * 获取legalDisclaimer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalDisclaimer() {
            return legalDisclaimer;
        }

        /**
         * 设置legalDisclaimer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalDisclaimer(String value) {
            this.legalDisclaimer = value;
        }

        /**
         * 获取manufacturer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManufacturer() {
            return manufacturer;
        }

        /**
         * 设置manufacturer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManufacturer(String value) {
            this.manufacturer = value;
        }

        /**
         * 获取mfrPartNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMfrPartNumber() {
            return mfrPartNumber;
        }

        /**
         * 设置mfrPartNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMfrPartNumber(String value) {
            this.mfrPartNumber = value;
        }

        /**
         * Gets the value of the searchTerms property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchTerms property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchTerms().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSearchTerms() {
            if (searchTerms == null) {
                searchTerms = new ArrayList<String>();
            }
            return this.searchTerms;
        }

        /**
         * Gets the value of the platinumKeywords property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the platinumKeywords property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlatinumKeywords().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPlatinumKeywords() {
            if (platinumKeywords == null) {
                platinumKeywords = new ArrayList<String>();
            }
            return this.platinumKeywords;
        }

        /**
         * 获取memorabilia属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMemorabilia() {
            return memorabilia;
        }

        /**
         * 设置memorabilia属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMemorabilia(Boolean value) {
            this.memorabilia = value;
        }

        /**
         * 获取autographed属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAutographed() {
            return autographed;
        }

        /**
         * 设置autographed属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutographed(Boolean value) {
            this.autographed = value;
        }

        /**
         * Gets the value of the usedFor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the usedFor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUsedFor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUsedFor() {
            if (usedFor == null) {
                usedFor = new ArrayList<String>();
            }
            return this.usedFor;
        }

        /**
         * 获取itemType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemType() {
            return itemType;
        }

        /**
         * 设置itemType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemType(String value) {
            this.itemType = value;
        }

        /**
         * Gets the value of the otherItemAttributes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherItemAttributes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherItemAttributes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOtherItemAttributes() {
            if (otherItemAttributes == null) {
                otherItemAttributes = new ArrayList<String>();
            }
            return this.otherItemAttributes;
        }

        /**
         * Gets the value of the targetAudience property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetAudience property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTargetAudience().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTargetAudience() {
            if (targetAudience == null) {
                targetAudience = new ArrayList<String>();
            }
            return this.targetAudience;
        }

        /**
         * Gets the value of the subjectContent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subjectContent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubjectContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubjectContent() {
            if (subjectContent == null) {
                subjectContent = new ArrayList<String>();
            }
            return this.subjectContent;
        }

        /**
         * 获取isGiftWrapAvailable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsGiftWrapAvailable() {
            return isGiftWrapAvailable;
        }

        /**
         * 设置isGiftWrapAvailable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsGiftWrapAvailable(Boolean value) {
            this.isGiftWrapAvailable = value;
        }

        /**
         * 获取isGiftMessageAvailable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsGiftMessageAvailable() {
            return isGiftMessageAvailable;
        }

        /**
         * 设置isGiftMessageAvailable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsGiftMessageAvailable(Boolean value) {
            this.isGiftMessageAvailable = value;
        }

        /**
         * Gets the value of the promotionKeywords property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionKeywords property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionKeywords().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionKeywords() {
            if (promotionKeywords == null) {
                promotionKeywords = new ArrayList<String>();
            }
            return this.promotionKeywords;
        }

        /**
         * 获取isDiscontinuedByManufacturer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsDiscontinuedByManufacturer() {
            return isDiscontinuedByManufacturer;
        }

        /**
         * 设置isDiscontinuedByManufacturer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsDiscontinuedByManufacturer(Boolean value) {
            this.isDiscontinuedByManufacturer = value;
        }

        /**
         * 获取deliveryScheduleGroupID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliveryScheduleGroupID() {
            return deliveryScheduleGroupID;
        }

        /**
         * 设置deliveryScheduleGroupID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliveryScheduleGroupID(String value) {
            this.deliveryScheduleGroupID = value;
        }

        /**
         * Gets the value of the deliveryChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deliveryChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeliveryChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDeliveryChannel() {
            if (deliveryChannel == null) {
                deliveryChannel = new ArrayList<String>();
            }
            return this.deliveryChannel;
        }

        /**
         * Gets the value of the purchasingChannel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchasingChannel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPurchasingChannel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPurchasingChannel() {
            if (purchasingChannel == null) {
                purchasingChannel = new ArrayList<String>();
            }
            return this.purchasingChannel;
        }

        /**
         * 获取maxAggregateShipQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxAggregateShipQuantity() {
            return maxAggregateShipQuantity;
        }

        /**
         * 设置maxAggregateShipQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxAggregateShipQuantity(BigInteger value) {
            this.maxAggregateShipQuantity = value;
        }

        /**
         * 获取isCustomizable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsCustomizable() {
            return isCustomizable;
        }

        /**
         * 设置isCustomizable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsCustomizable(Boolean value) {
            this.isCustomizable = value;
        }

        /**
         * 获取customizableTemplateName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomizableTemplateName() {
            return customizableTemplateName;
        }

        /**
         * 设置customizableTemplateName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomizableTemplateName(String value) {
            this.customizableTemplateName = value;
        }

        /**
         * Gets the value of the recommendedBrowseNode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendedBrowseNode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendedBrowseNode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getRecommendedBrowseNode() {
            if (recommendedBrowseNode == null) {
                recommendedBrowseNode = new ArrayList<BigInteger>();
            }
            return this.recommendedBrowseNode;
        }

        /**
         * 获取merchantShippingGroupName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMerchantShippingGroupName() {
            return merchantShippingGroupName;
        }

        /**
         * 设置merchantShippingGroupName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMerchantShippingGroupName(String value) {
            this.merchantShippingGroupName = value;
        }

        /**
         * 获取fedasid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFEDASID() {
            return fedasid;
        }

        /**
         * 设置fedasid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFEDASID(String value) {
            this.fedasid = value;
        }

        /**
         * 获取tsdAgeWarning属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTSDAgeWarning() {
            return tsdAgeWarning;
        }

        /**
         * 设置tsdAgeWarning属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTSDAgeWarning(String value) {
            this.tsdAgeWarning = value;
        }

        /**
         * Gets the value of the tsdWarning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tsdWarning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTSDWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTSDWarning() {
            if (tsdWarning == null) {
                tsdWarning = new ArrayList<String>();
            }
            return this.tsdWarning;
        }

        /**
         * Gets the value of the tsdLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tsdLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTSDLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTSDLanguage() {
            if (tsdLanguage == null) {
                tsdLanguage = new ArrayList<String>();
            }
            return this.tsdLanguage;
        }

        /**
         * Gets the value of the optionalPaymentTypeExclusion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the optionalPaymentTypeExclusion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOptionalPaymentTypeExclusion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOptionalPaymentTypeExclusion() {
            if (optionalPaymentTypeExclusion == null) {
                optionalPaymentTypeExclusion = new ArrayList<String>();
            }
            return this.optionalPaymentTypeExclusion;
        }

        /**
         * 获取distributionDesignation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DistributionDesignationValues }
         *     
         */
        public DistributionDesignationValues getDistributionDesignation() {
            return distributionDesignation;
        }

        /**
         * 设置distributionDesignation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DistributionDesignationValues }
         *     
         */
        public void setDistributionDesignation(DistributionDesignationValues value) {
            this.distributionDesignation = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Priority" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               &lt;minInclusive value="1"/>
     *               &lt;maxInclusive value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BrowseExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="RecommendationExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priority",
        "browseExclusion",
        "recommendationExclusion"
    })
    public static class DiscoveryData {

        @XmlElement(name = "Priority")
        protected Integer priority;
        @XmlElement(name = "BrowseExclusion")
        protected Boolean browseExclusion;
        @XmlElement(name = "RecommendationExclusion")
        protected Boolean recommendationExclusion;

        /**
         * 获取priority属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPriority() {
            return priority;
        }

        /**
         * 设置priority属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPriority(Integer value) {
            this.priority = value;
        }

        /**
         * 获取browseExclusion属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBrowseExclusion() {
            return browseExclusion;
        }

        /**
         * 设置browseExclusion属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBrowseExclusion(Boolean value) {
            this.browseExclusion = value;
        }

        /**
         * 获取recommendationExclusion属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRecommendationExclusion() {
            return recommendationExclusion;
        }

        /**
         * 设置recommendationExclusion属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRecommendationExclusion(Boolean value) {
            this.recommendationExclusion = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{}Home"/>
     *         &lt;element ref="{}Sports"/>
     *         &lt;element ref="{}HomeImprovement"/>
     *         &lt;element ref="{}Tools"/>
     *         &lt;element ref="{}CE"/>
     *         &lt;element ref="{}Computers"/>
     *         &lt;element ref="{}SoftwareVideoGames"/>
     *         &lt;element ref="{}Wireless"/>
     *         &lt;element ref="{}Lighting"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "home",
        "sports",
        "homeImprovement",
        "tools",
        "ce",
        "computers",
        "softwareVideoGames",
        "wireless",
        "lighting"
    })
    public static class ProductData {

        @XmlElement(name = "Home")
        protected Home home;
        @XmlElement(name = "Sports")
        protected Sports sports;
        @XmlElement(name = "HomeImprovement")
        protected HomeImprovement homeImprovement;
        @XmlElement(name = "Tools")
        protected Tools tools;
        @XmlElement(name = "CE")
        protected CE ce;
        @XmlElement(name = "Computers")
        protected Computers computers;
        @XmlElement(name = "SoftwareVideoGames")
        protected SoftwareVideoGames softwareVideoGames;
        @XmlElement(name = "Wireless")
        protected Wireless wireless;
        @XmlElement(name = "Lighting")
        protected Lighting lighting;

        /**
         * 获取home属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Home }
         *     
         */
        public Home getHome() {
            return home;
        }

        /**
         * 设置home属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Home }
         *     
         */
        public void setHome(Home value) {
            this.home = value;
        }

        /**
         * 获取sports属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Sports }
         *     
         */
        public Sports getSports() {
            return sports;
        }

        /**
         * 设置sports属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Sports }
         *     
         */
        public void setSports(Sports value) {
            this.sports = value;
        }

        /**
         * 获取homeImprovement属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HomeImprovement }
         *     
         */
        public HomeImprovement getHomeImprovement() {
            return homeImprovement;
        }

        /**
         * 设置homeImprovement属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HomeImprovement }
         *     
         */
        public void setHomeImprovement(HomeImprovement value) {
            this.homeImprovement = value;
        }

        /**
         * 获取tools属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Tools }
         *     
         */
        public Tools getTools() {
            return tools;
        }

        /**
         * 设置tools属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Tools }
         *     
         */
        public void setTools(Tools value) {
            this.tools = value;
        }

        /**
         * 获取ce属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CE }
         *     
         */
        public CE getCE() {
            return ce;
        }

        /**
         * 设置ce属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CE }
         *     
         */
        public void setCE(CE value) {
            this.ce = value;
        }

        /**
         * 获取computers属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Computers }
         *     
         */
        public Computers getComputers() {
            return computers;
        }

        /**
         * 设置computers属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Computers }
         *     
         */
        public void setComputers(Computers value) {
            this.computers = value;
        }

        /**
         * 获取softwareVideoGames属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SoftwareVideoGames }
         *     
         */
        public SoftwareVideoGames getSoftwareVideoGames() {
            return softwareVideoGames;
        }

        /**
         * 设置softwareVideoGames属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SoftwareVideoGames }
         *     
         */
        public void setSoftwareVideoGames(SoftwareVideoGames value) {
            this.softwareVideoGames = value;
        }

        /**
         * 获取wireless属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Wireless }
         *     
         */
        public Wireless getWireless() {
            return wireless;
        }

        /**
         * 设置wireless属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Wireless }
         *     
         */
        public void setWireless(Wireless value) {
            this.wireless = value;
        }

        /**
         * 获取lighting属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Lighting }
         *     
         */
        public Lighting getLighting() {
            return lighting;
        }

        /**
         * 设置lighting属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Lighting }
         *     
         */
        public void setLighting(Lighting value) {
            this.lighting = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PromoTagType">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
     *               &lt;enumeration value="Sale"/>
     *               &lt;enumeration value="New"/>
     *               &lt;enumeration value="NewArrival"/>
     *               &lt;enumeration value="WebOnly"/>
     *               &lt;enumeration value="Clearance"/>
     *               &lt;enumeration value="LimitedOffer"/>
     *               &lt;enumeration value="SpecialOffer"/>
     *               &lt;enumeration value="SpecialPurchase"/>
     *               &lt;enumeration value="OnlyInStores"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="EffectiveFromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="EffectiveThroughDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "promoTagType",
        "effectiveFromDate",
        "effectiveThroughDate"
    })
    public static class PromoTag {

        @XmlElement(name = "PromoTagType", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String promoTagType;
        @XmlElement(name = "EffectiveFromDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveFromDate;
        @XmlElement(name = "EffectiveThroughDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveThroughDate;

        /**
         * 获取promoTagType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromoTagType() {
            return promoTagType;
        }

        /**
         * 设置promoTagType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromoTagType(String value) {
            this.promoTagType = value;
        }

        /**
         * 获取effectiveFromDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveFromDate() {
            return effectiveFromDate;
        }

        /**
         * 设置effectiveFromDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveFromDate(XMLGregorianCalendar value) {
            this.effectiveFromDate = value;
        }

        /**
         * 获取effectiveThroughDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveThroughDate() {
            return effectiveThroughDate;
        }

        /**
         * 设置effectiveThroughDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveThroughDate(XMLGregorianCalendar value) {
            this.effectiveThroughDate = value;
        }

    }

}
