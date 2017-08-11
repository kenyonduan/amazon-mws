
package com.elcuk.jaxb;

import java.math.BigDecimal;
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
 *         &lt;element name="Rebate" type="{}RebateType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ProductType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}Software"/>
 *                   &lt;element ref="{}HandheldSoftwareDownloads"/>
 *                   &lt;element ref="{}SoftwareGames"/>
 *                   &lt;element ref="{}VideoGames"/>
 *                   &lt;element ref="{}VideoGamesAccessories"/>
 *                   &lt;element ref="{}VideoGamesHardware"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionParts" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionLabor" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="LanguageOriginal" type="{}LanguageSWVG" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="LanguageSubtitled" type="{}LanguageSWVG" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="LanguageDubbed" type="{}LanguageSWVG" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="Parentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="parent"/>
 *               &lt;enumeration value="child"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VariationTheme" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Color"/>
 *               &lt;enumeration value="Size"/>
 *               &lt;enumeration value="Size-Color"/>
 *               &lt;enumeration value="Scent"/>
 *               &lt;enumeration value="Size-Scent"/>
 *               &lt;enumeration value="CustomerPackageType"/>
 *               &lt;enumeration value="ColorName-CustomerPackageType"/>
 *               &lt;enumeration value="SizeName-CustomerPackageType"/>
 *               &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
 *               &lt;enumeration value="StyleName-CustomerPackageType"/>
 *               &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BatteryAverageLife" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLifeStandby" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="BatteryChargeTime" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="IsAdultProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumIon" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumMetal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ColorName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CanShipInOriginalContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IdentityPackageType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="bulk"/>
 *               &lt;enumeration value="frustration_free"/>
 *               &lt;enumeration value="traditional"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GappPrcDcz" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GappPrcXcyz" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IncludedComponents" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryEnergyContent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryPackaging" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="batteries_contained_in_equipment"/>
 *               &lt;enumeration value="batteries_only"/>
 *               &lt;enumeration value="batteries_packed_with_equipment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LithiumBatteryVoltage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Publisher" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PublishingCompany" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RegionOfOrigin" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SizeMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TargetGender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="male"/>
 *               &lt;enumeration value="female"/>
 *               &lt;enumeration value="unisex"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="SpecificUsesForProduct" type="{}SuperLongStringNotNull" maxOccurs="5" minOccurs="0"/>
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
    "rebate",
    "productType",
    "battery",
    "displayWeight",
    "displayVolume",
    "displayLength",
    "mfgWarrantyDescriptionParts",
    "mfgWarrantyDescriptionType",
    "mfgWarrantyDescriptionLabor",
    "languageOriginal",
    "languageSubtitled",
    "languageDubbed",
    "parentage",
    "variationTheme",
    "batteryAverageLife",
    "batteryAverageLifeStandby",
    "batteryChargeTime",
    "isAdultProduct",
    "batteryTypeLithiumIon",
    "batteryTypeLithiumMetal",
    "colorName",
    "count",
    "countryOfOrigin",
    "customerPackageType",
    "canShipInOriginalContainer",
    "identityPackageType",
    "gappPrcDcz",
    "gappPrcXcyz",
    "includedComponents",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "maxOrderQuantity",
    "numberOfItems",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "powerSource",
    "publisher",
    "publishingCompany",
    "regionOfOrigin",
    "sellerWarrantyDescription",
    "size",
    "sizeMap",
    "styleName",
    "targetGender",
    "warnings",
    "specificUsesForProduct"
})
@XmlRootElement(name = "SoftwareVideoGames")
public class SoftwareVideoGames {

    @XmlElement(name = "Rebate")
    protected List<RebateType> rebate;
    @XmlElement(name = "ProductType", required = true)
    protected SoftwareVideoGames.ProductType productType;
    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "DisplayVolume")
    protected VolumeDimension displayVolume;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "MfgWarrantyDescriptionParts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfgWarrantyDescriptionParts;
    @XmlElement(name = "MfgWarrantyDescriptionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfgWarrantyDescriptionType;
    @XmlElement(name = "MfgWarrantyDescriptionLabor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfgWarrantyDescriptionLabor;
    @XmlElement(name = "LanguageOriginal")
    @XmlSchemaType(name = "string")
    protected List<LanguageSWVG> languageOriginal;
    @XmlElement(name = "LanguageSubtitled")
    @XmlSchemaType(name = "string")
    protected List<LanguageSWVG> languageSubtitled;
    @XmlElement(name = "LanguageDubbed")
    @XmlSchemaType(name = "string")
    protected List<LanguageSWVG> languageDubbed;
    @XmlElement(name = "Parentage")
    protected String parentage;
    @XmlElement(name = "VariationTheme")
    protected String variationTheme;
    @XmlElement(name = "BatteryAverageLife")
    protected BigDecimal batteryAverageLife;
    @XmlElement(name = "BatteryAverageLifeStandby")
    protected BigDecimal batteryAverageLifeStandby;
    @XmlElement(name = "BatteryChargeTime")
    protected BigDecimal batteryChargeTime;
    @XmlElement(name = "IsAdultProduct")
    protected Boolean isAdultProduct;
    @XmlElement(name = "BatteryTypeLithiumIon")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumIon;
    @XmlElement(name = "BatteryTypeLithiumMetal")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumMetal;
    @XmlElement(name = "ColorName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorName;
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger count;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "CustomerPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String customerPackageType;
    @XmlElement(name = "CanShipInOriginalContainer")
    protected Boolean canShipInOriginalContainer;
    @XmlElement(name = "IdentityPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identityPackageType;
    @XmlElement(name = "GappPrcDcz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gappPrcDcz;
    @XmlElement(name = "GappPrcXcyz")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gappPrcXcyz;
    @XmlElement(name = "IncludedComponents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String includedComponents;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    protected BigDecimal lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    protected BigDecimal lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    protected BigDecimal lithiumBatteryWeight;
    @XmlElement(name = "MaxOrderQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxOrderQuantity;
    @XmlElement(name = "NumberOfItems")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItems;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "Publisher")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publisher;
    @XmlElement(name = "PublishingCompany")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publishingCompany;
    @XmlElement(name = "RegionOfOrigin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String regionOfOrigin;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sellerWarrantyDescription;
    @XmlElement(name = "Size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String size;
    @XmlElement(name = "SizeMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sizeMap;
    @XmlElement(name = "StyleName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String styleName;
    @XmlElement(name = "TargetGender")
    protected String targetGender;
    @XmlElement(name = "Warnings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warnings;
    @XmlElement(name = "SpecificUsesForProduct")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specificUsesForProduct;

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
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SoftwareVideoGames.ProductType }
     *     
     */
    public SoftwareVideoGames.ProductType getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareVideoGames.ProductType }
     *     
     */
    public void setProductType(SoftwareVideoGames.ProductType value) {
        this.productType = value;
    }

    /**
     * 获取battery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Battery }
     *     
     */
    public Battery getBattery() {
        return battery;
    }

    /**
     * 设置battery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Battery }
     *     
     */
    public void setBattery(Battery value) {
        this.battery = value;
    }

    /**
     * 获取displayWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getDisplayWeight() {
        return displayWeight;
    }

    /**
     * 设置displayWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setDisplayWeight(WeightDimension value) {
        this.displayWeight = value;
    }

    /**
     * 获取displayVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getDisplayVolume() {
        return displayVolume;
    }

    /**
     * 设置displayVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setDisplayVolume(VolumeDimension value) {
        this.displayVolume = value;
    }

    /**
     * 获取displayLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplayLength() {
        return displayLength;
    }

    /**
     * 设置displayLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplayLength(LengthDimension value) {
        this.displayLength = value;
    }

    /**
     * 获取mfgWarrantyDescriptionParts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgWarrantyDescriptionParts() {
        return mfgWarrantyDescriptionParts;
    }

    /**
     * 设置mfgWarrantyDescriptionParts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgWarrantyDescriptionParts(String value) {
        this.mfgWarrantyDescriptionParts = value;
    }

    /**
     * 获取mfgWarrantyDescriptionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgWarrantyDescriptionType() {
        return mfgWarrantyDescriptionType;
    }

    /**
     * 设置mfgWarrantyDescriptionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgWarrantyDescriptionType(String value) {
        this.mfgWarrantyDescriptionType = value;
    }

    /**
     * 获取mfgWarrantyDescriptionLabor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgWarrantyDescriptionLabor() {
        return mfgWarrantyDescriptionLabor;
    }

    /**
     * 设置mfgWarrantyDescriptionLabor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgWarrantyDescriptionLabor(String value) {
        this.mfgWarrantyDescriptionLabor = value;
    }

    /**
     * Gets the value of the languageOriginal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOriginal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageOriginal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageSWVG }
     * 
     * 
     */
    public List<LanguageSWVG> getLanguageOriginal() {
        if (languageOriginal == null) {
            languageOriginal = new ArrayList<LanguageSWVG>();
        }
        return this.languageOriginal;
    }

    /**
     * Gets the value of the languageSubtitled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageSubtitled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageSubtitled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageSWVG }
     * 
     * 
     */
    public List<LanguageSWVG> getLanguageSubtitled() {
        if (languageSubtitled == null) {
            languageSubtitled = new ArrayList<LanguageSWVG>();
        }
        return this.languageSubtitled;
    }

    /**
     * Gets the value of the languageDubbed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageDubbed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageDubbed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageSWVG }
     * 
     * 
     */
    public List<LanguageSWVG> getLanguageDubbed() {
        if (languageDubbed == null) {
            languageDubbed = new ArrayList<LanguageSWVG>();
        }
        return this.languageDubbed;
    }

    /**
     * 获取parentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentage() {
        return parentage;
    }

    /**
     * 设置parentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentage(String value) {
        this.parentage = value;
    }

    /**
     * 获取variationTheme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationTheme() {
        return variationTheme;
    }

    /**
     * 设置variationTheme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationTheme(String value) {
        this.variationTheme = value;
    }

    /**
     * 获取batteryAverageLife属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryAverageLife() {
        return batteryAverageLife;
    }

    /**
     * 设置batteryAverageLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryAverageLife(BigDecimal value) {
        this.batteryAverageLife = value;
    }

    /**
     * 获取batteryAverageLifeStandby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryAverageLifeStandby() {
        return batteryAverageLifeStandby;
    }

    /**
     * 设置batteryAverageLifeStandby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryAverageLifeStandby(BigDecimal value) {
        this.batteryAverageLifeStandby = value;
    }

    /**
     * 获取batteryChargeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryChargeTime() {
        return batteryChargeTime;
    }

    /**
     * 设置batteryChargeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryChargeTime(BigDecimal value) {
        this.batteryChargeTime = value;
    }

    /**
     * 获取isAdultProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdultProduct() {
        return isAdultProduct;
    }

    /**
     * 设置isAdultProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdultProduct(Boolean value) {
        this.isAdultProduct = value;
    }

    /**
     * 获取batteryTypeLithiumIon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryTypeLithiumIon() {
        return batteryTypeLithiumIon;
    }

    /**
     * 设置batteryTypeLithiumIon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryTypeLithiumIon(BigInteger value) {
        this.batteryTypeLithiumIon = value;
    }

    /**
     * 获取batteryTypeLithiumMetal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryTypeLithiumMetal() {
        return batteryTypeLithiumMetal;
    }

    /**
     * 设置batteryTypeLithiumMetal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryTypeLithiumMetal(BigInteger value) {
        this.batteryTypeLithiumMetal = value;
    }

    /**
     * 获取colorName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * 设置colorName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
    }

    /**
     * 获取count属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * 获取countryOfOrigin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * 设置countryOfOrigin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOrigin(String value) {
        this.countryOfOrigin = value;
    }

    /**
     * 获取customerPackageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPackageType() {
        return customerPackageType;
    }

    /**
     * 设置customerPackageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPackageType(String value) {
        this.customerPackageType = value;
    }

    /**
     * 获取canShipInOriginalContainer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanShipInOriginalContainer() {
        return canShipInOriginalContainer;
    }

    /**
     * 设置canShipInOriginalContainer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanShipInOriginalContainer(Boolean value) {
        this.canShipInOriginalContainer = value;
    }

    /**
     * 获取identityPackageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityPackageType() {
        return identityPackageType;
    }

    /**
     * 设置identityPackageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityPackageType(String value) {
        this.identityPackageType = value;
    }

    /**
     * 获取gappPrcDcz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGappPrcDcz() {
        return gappPrcDcz;
    }

    /**
     * 设置gappPrcDcz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGappPrcDcz(String value) {
        this.gappPrcDcz = value;
    }

    /**
     * 获取gappPrcXcyz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGappPrcXcyz() {
        return gappPrcXcyz;
    }

    /**
     * 设置gappPrcXcyz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGappPrcXcyz(String value) {
        this.gappPrcXcyz = value;
    }

    /**
     * 获取includedComponents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedComponents() {
        return includedComponents;
    }

    /**
     * 设置includedComponents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedComponents(String value) {
        this.includedComponents = value;
    }

    /**
     * 获取lithiumBatteryEnergyContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLithiumBatteryEnergyContent() {
        return lithiumBatteryEnergyContent;
    }

    /**
     * 设置lithiumBatteryEnergyContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLithiumBatteryEnergyContent(BigDecimal value) {
        this.lithiumBatteryEnergyContent = value;
    }

    /**
     * 获取lithiumBatteryPackaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLithiumBatteryPackaging() {
        return lithiumBatteryPackaging;
    }

    /**
     * 设置lithiumBatteryPackaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLithiumBatteryPackaging(String value) {
        this.lithiumBatteryPackaging = value;
    }

    /**
     * 获取lithiumBatteryVoltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLithiumBatteryVoltage() {
        return lithiumBatteryVoltage;
    }

    /**
     * 设置lithiumBatteryVoltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLithiumBatteryVoltage(BigDecimal value) {
        this.lithiumBatteryVoltage = value;
    }

    /**
     * 获取lithiumBatteryWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLithiumBatteryWeight() {
        return lithiumBatteryWeight;
    }

    /**
     * 设置lithiumBatteryWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLithiumBatteryWeight(BigDecimal value) {
        this.lithiumBatteryWeight = value;
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
     * 获取numberOfLithiumIonCells属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLithiumIonCells() {
        return numberOfLithiumIonCells;
    }

    /**
     * 设置numberOfLithiumIonCells属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLithiumIonCells(BigInteger value) {
        this.numberOfLithiumIonCells = value;
    }

    /**
     * 获取numberOfLithiumMetalCells属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLithiumMetalCells() {
        return numberOfLithiumMetalCells;
    }

    /**
     * 设置numberOfLithiumMetalCells属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLithiumMetalCells(BigInteger value) {
        this.numberOfLithiumMetalCells = value;
    }

    /**
     * 获取powerSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * 设置powerSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSource(String value) {
        this.powerSource = value;
    }

    /**
     * 获取publisher属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 设置publisher属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * 获取publishingCompany属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishingCompany() {
        return publishingCompany;
    }

    /**
     * 设置publishingCompany属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishingCompany(String value) {
        this.publishingCompany = value;
    }

    /**
     * 获取regionOfOrigin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionOfOrigin() {
        return regionOfOrigin;
    }

    /**
     * 设置regionOfOrigin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionOfOrigin(String value) {
        this.regionOfOrigin = value;
    }

    /**
     * 获取sellerWarrantyDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerWarrantyDescription() {
        return sellerWarrantyDescription;
    }

    /**
     * 设置sellerWarrantyDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerWarrantyDescription(String value) {
        this.sellerWarrantyDescription = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * 获取sizeMap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeMap() {
        return sizeMap;
    }

    /**
     * 设置sizeMap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeMap(String value) {
        this.sizeMap = value;
    }

    /**
     * 获取styleName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * 设置styleName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

    /**
     * 获取targetGender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetGender() {
        return targetGender;
    }

    /**
     * 设置targetGender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetGender(String value) {
        this.targetGender = value;
    }

    /**
     * 获取warnings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnings() {
        return warnings;
    }

    /**
     * 设置warnings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnings(String value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the specificUsesForProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificUsesForProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificUsesForProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecificUsesForProduct() {
        if (specificUsesForProduct == null) {
            specificUsesForProduct = new ArrayList<String>();
        }
        return this.specificUsesForProduct;
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
     *         &lt;element ref="{}Software"/>
     *         &lt;element ref="{}HandheldSoftwareDownloads"/>
     *         &lt;element ref="{}SoftwareGames"/>
     *         &lt;element ref="{}VideoGames"/>
     *         &lt;element ref="{}VideoGamesAccessories"/>
     *         &lt;element ref="{}VideoGamesHardware"/>
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
        "software",
        "handheldSoftwareDownloads",
        "softwareGames",
        "videoGames",
        "videoGamesAccessories",
        "videoGamesHardware"
    })
    public static class ProductType {

        @XmlElement(name = "Software")
        protected Software software;
        @XmlElement(name = "HandheldSoftwareDownloads")
        protected HandheldSoftwareDownloads handheldSoftwareDownloads;
        @XmlElement(name = "SoftwareGames")
        protected SoftwareGames softwareGames;
        @XmlElement(name = "VideoGames")
        protected VideoGames videoGames;
        @XmlElement(name = "VideoGamesAccessories")
        protected VideoGamesAccessories videoGamesAccessories;
        @XmlElement(name = "VideoGamesHardware")
        protected VideoGamesHardware videoGamesHardware;

        /**
         * 获取software属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Software }
         *     
         */
        public Software getSoftware() {
            return software;
        }

        /**
         * 设置software属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Software }
         *     
         */
        public void setSoftware(Software value) {
            this.software = value;
        }

        /**
         * 获取handheldSoftwareDownloads属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HandheldSoftwareDownloads }
         *     
         */
        public HandheldSoftwareDownloads getHandheldSoftwareDownloads() {
            return handheldSoftwareDownloads;
        }

        /**
         * 设置handheldSoftwareDownloads属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HandheldSoftwareDownloads }
         *     
         */
        public void setHandheldSoftwareDownloads(HandheldSoftwareDownloads value) {
            this.handheldSoftwareDownloads = value;
        }

        /**
         * 获取softwareGames属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SoftwareGames }
         *     
         */
        public SoftwareGames getSoftwareGames() {
            return softwareGames;
        }

        /**
         * 设置softwareGames属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SoftwareGames }
         *     
         */
        public void setSoftwareGames(SoftwareGames value) {
            this.softwareGames = value;
        }

        /**
         * 获取videoGames属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VideoGames }
         *     
         */
        public VideoGames getVideoGames() {
            return videoGames;
        }

        /**
         * 设置videoGames属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VideoGames }
         *     
         */
        public void setVideoGames(VideoGames value) {
            this.videoGames = value;
        }

        /**
         * 获取videoGamesAccessories属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VideoGamesAccessories }
         *     
         */
        public VideoGamesAccessories getVideoGamesAccessories() {
            return videoGamesAccessories;
        }

        /**
         * 设置videoGamesAccessories属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VideoGamesAccessories }
         *     
         */
        public void setVideoGamesAccessories(VideoGamesAccessories value) {
            this.videoGamesAccessories = value;
        }

        /**
         * 获取videoGamesHardware属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VideoGamesHardware }
         *     
         */
        public VideoGamesHardware getVideoGamesHardware() {
            return videoGamesHardware;
        }

        /**
         * 设置videoGamesHardware属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VideoGamesHardware }
         *     
         */
        public void setVideoGamesHardware(VideoGamesHardware value) {
            this.videoGamesHardware = value;
        }

    }

}
