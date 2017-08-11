
package com.elcuk.jaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element name="CanShipInOriginalContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FabricWarmthDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Finish" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IdentityPackageType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="bulk"/>
 *               &lt;enumeration value="frustration_free"/>
 *               &lt;enumeration value="traditional"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsStainResistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LightSourceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumCoverageArea" type="{}AreaDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="NumberOfSets" type="{}TenDigitInteger" minOccurs="0"/>
 *         &lt;element name="OutputCapacity" type="{}VolumeRateDimension" minOccurs="0"/>
 *         &lt;element name="PieceCount" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="Shape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ThreadCount" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="TowelWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="VariationData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VariationTheme" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Size"/>
 *                         &lt;enumeration value="Color"/>
 *                         &lt;enumeration value="Scent"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="Size-Scent"/>
 *                         &lt;enumeration value="DisplayLength-DisplayWidth"/>
 *                         &lt;enumeration value="DisplayLength-Material"/>
 *                         &lt;enumeration value="DisplayLength-Size"/>
 *                         &lt;enumeration value="DisplayLength-Color"/>
 *                         &lt;enumeration value="DisplayLength-DisplayHeight"/>
 *                         &lt;enumeration value="DisplayWidth-Material"/>
 *                         &lt;enumeration value="DisplayWidth-Size"/>
 *                         &lt;enumeration value="DisplayWidth-Color"/>
 *                         &lt;enumeration value="DisplayWidth-DisplayHeight"/>
 *                         &lt;enumeration value="ItemPackageQuantity-Material"/>
 *                         &lt;enumeration value="ItemPackageQuantity-Size"/>
 *                         &lt;enumeration value="ItemPackageQuantity-Color"/>
 *                         &lt;enumeration value="ItemPackageQuantity-DisplayHeight"/>
 *                         &lt;enumeration value="DisplayWeight-ItemPackageQuantity"/>
 *                         &lt;enumeration value="DisplayWeight-Material"/>
 *                         &lt;enumeration value="DisplayWeight-Size"/>
 *                         &lt;enumeration value="DisplayWeight-Color"/>
 *                         &lt;enumeration value="DisplayWeight-DisplayHeight"/>
 *                         &lt;enumeration value="Material-DisplayLength"/>
 *                         &lt;enumeration value="Material-DisplayWidth"/>
 *                         &lt;enumeration value="Material-Size"/>
 *                         &lt;enumeration value="Material-Color"/>
 *                         &lt;enumeration value="Material-DisplayHeight"/>
 *                         &lt;enumeration value="Size-DisplayLength"/>
 *                         &lt;enumeration value="Size-DisplayWidth"/>
 *                         &lt;enumeration value="Size-DisplayWeight"/>
 *                         &lt;enumeration value="Size-Material"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="Size-DisplayHeight"/>
 *                         &lt;enumeration value="Color-DisplayLength"/>
 *                         &lt;enumeration value="Color-DisplayWidth"/>
 *                         &lt;enumeration value="Color-ItemPackageQuantity"/>
 *                         &lt;enumeration value="Color-DisplayWeight"/>
 *                         &lt;enumeration value="Color-Material"/>
 *                         &lt;enumeration value="Color-Size"/>
 *                         &lt;enumeration value="Color-DisplayHeight"/>
 *                         &lt;enumeration value="DisplayHeight"/>
 *                         &lt;enumeration value="Material"/>
 *                         &lt;enumeration value="DisplayWeight"/>
 *                         &lt;enumeration value="DisplayLength"/>
 *                         &lt;enumeration value="ItemPackageQuantity"/>
 *                         &lt;enumeration value="DisplayLength-PatternName"/>
 *                         &lt;enumeration value="DisplayLength-StyleName"/>
 *                         &lt;enumeration value="DisplayWidth-PatternName"/>
 *                         &lt;enumeration value="DisplayWidth-StyleName"/>
 *                         &lt;enumeration value="Occasion-PatternName"/>
 *                         &lt;enumeration value="Occasion-ItemPackageQuantity"/>
 *                         &lt;enumeration value="Occasion-Material"/>
 *                         &lt;enumeration value="Occasion-StyleName"/>
 *                         &lt;enumeration value="Occasion-Size"/>
 *                         &lt;enumeration value="Occasion-Color"/>
 *                         &lt;enumeration value="Occasion-DisplayHeight"/>
 *                         &lt;enumeration value="PatternName-DisplayLength"/>
 *                         &lt;enumeration value="PatternName-DisplayWidth"/>
 *                         &lt;enumeration value="PatternName-Occasion"/>
 *                         &lt;enumeration value="PatternName-Material"/>
 *                         &lt;enumeration value="PatternName-StyleName"/>
 *                         &lt;enumeration value="PatternName-Size"/>
 *                         &lt;enumeration value="PatternName-Color"/>
 *                         &lt;enumeration value="PatternName-DisplayHeight"/>
 *                         &lt;enumeration value="MatteStyle-Material"/>
 *                         &lt;enumeration value="MatteStyle-StyleName"/>
 *                         &lt;enumeration value="MatteStyle-Size"/>
 *                         &lt;enumeration value="MatteStyle-Color"/>
 *                         &lt;enumeration value="ItemPackageQuantity-Occasion"/>
 *                         &lt;enumeration value="ItemPackageQuantity-StyleName"/>
 *                         &lt;enumeration value="DisplayWeight-StyleName"/>
 *                         &lt;enumeration value="Material-PatternName"/>
 *                         &lt;enumeration value="Material-MatteStyle"/>
 *                         &lt;enumeration value="Material-StyleName"/>
 *                         &lt;enumeration value="StyleName-DisplayLength"/>
 *                         &lt;enumeration value="StyleName-DisplayWidth"/>
 *                         &lt;enumeration value="StyleName-Occasion"/>
 *                         &lt;enumeration value="StyleName-PatternName"/>
 *                         &lt;enumeration value="StyleName-DisplayWeight"/>
 *                         &lt;enumeration value="StyleName-Material"/>
 *                         &lt;enumeration value="StyleName-Size"/>
 *                         &lt;enumeration value="StyleName-Color"/>
 *                         &lt;enumeration value="Size-Occasion"/>
 *                         &lt;enumeration value="Size-PatternName"/>
 *                         &lt;enumeration value="Size-MatteStyle"/>
 *                         &lt;enumeration value="Size-StyleName"/>
 *                         &lt;enumeration value="Color-Occasion"/>
 *                         &lt;enumeration value="Color-PatternName"/>
 *                         &lt;enumeration value="Color-MatteStyle"/>
 *                         &lt;enumeration value="Color-StyleName"/>
 *                         &lt;enumeration value="MatteStyle"/>
 *                         &lt;enumeration value="PatternName"/>
 *                         &lt;enumeration value="Occasion"/>
 *                         &lt;enumeration value="StyleName"/>
 *                         &lt;enumeration value="CustomerPackageType"/>
 *                         &lt;enumeration value="ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="StyleName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Scent" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Wattage" type="{}WattageDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="InnerMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ItemThickness" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ManufacturerMinimumAge" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="ManufacturerMaximumAge" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="Occupancy" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OuterMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Seasons" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaterialComposition" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ItemTypeName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ItemDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CustomerRestrictionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OccasionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PowerSourceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BatteryCellComposition" type="{}BatteryCellTypeValues" minOccurs="0"/>
 *         &lt;element name="BatteryDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BatteryFormFactor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Efficiency" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLife" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLifeStandby" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryChargeTime" type="{}PositiveDimension" minOccurs="0"/>
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
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="SizeMap" type="{}StringNotNull" minOccurs="0"/>
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
    "battery",
    "canShipInOriginalContainer",
    "colorMap",
    "fabricWarmthDescription",
    "finish",
    "identityPackageType",
    "isStainResistant",
    "lightSourceType",
    "material",
    "maximumCoverageArea",
    "numberOfSets",
    "outputCapacity",
    "pieceCount",
    "shape",
    "threadCount",
    "towelWeight",
    "variationData",
    "wattage",
    "innerMaterialType",
    "itemThickness",
    "manufacturerMinimumAge",
    "manufacturerMaximumAge",
    "occupancy",
    "outerMaterialType",
    "seasons",
    "materialComposition",
    "itemTypeName",
    "itemDiameter",
    "customerRestrictionType",
    "occasionType",
    "powerSourceType",
    "batteryCellComposition",
    "batteryDescription",
    "batteryFormFactor",
    "lithiumBatteryWeight",
    "efficiency",
    "batteryAverageLife",
    "batteryAverageLifeStandby",
    "batteryChargeTime",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "sellerWarrantyDescription",
    "sizeMap"
})
@XmlRootElement(name = "BedAndBath")
public class BedAndBath {

    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "CanShipInOriginalContainer")
    protected Boolean canShipInOriginalContainer;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "FabricWarmthDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fabricWarmthDescription;
    @XmlElement(name = "Finish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finish;
    @XmlElement(name = "IdentityPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identityPackageType;
    @XmlElement(name = "IsStainResistant")
    protected Boolean isStainResistant;
    @XmlElement(name = "LightSourceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lightSourceType;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String material;
    @XmlElement(name = "MaximumCoverageArea")
    protected AreaDimensionOptionalUnit maximumCoverageArea;
    @XmlElement(name = "NumberOfSets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSets;
    @XmlElement(name = "OutputCapacity")
    protected VolumeRateDimension outputCapacity;
    @XmlElement(name = "PieceCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pieceCount;
    @XmlElement(name = "Shape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shape;
    @XmlElement(name = "ThreadCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger threadCount;
    @XmlElement(name = "TowelWeight")
    protected WeightDimension towelWeight;
    @XmlElement(name = "VariationData")
    protected BedAndBath.VariationData variationData;
    @XmlElement(name = "Wattage")
    protected WattageDimensionOptionalUnit wattage;
    @XmlElement(name = "InnerMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String innerMaterialType;
    @XmlElement(name = "ItemThickness")
    protected LengthDimension itemThickness;
    @XmlElement(name = "ManufacturerMinimumAge")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger manufacturerMinimumAge;
    @XmlElement(name = "ManufacturerMaximumAge")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger manufacturerMaximumAge;
    @XmlElement(name = "Occupancy")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String occupancy;
    @XmlElement(name = "OuterMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String outerMaterialType;
    @XmlElement(name = "Seasons")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String seasons;
    @XmlElement(name = "MaterialComposition")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String materialComposition;
    @XmlElement(name = "ItemTypeName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemTypeName;
    @XmlElement(name = "ItemDiameter")
    protected LengthDimension itemDiameter;
    @XmlElement(name = "CustomerRestrictionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String customerRestrictionType;
    @XmlElement(name = "OccasionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String occasionType;
    @XmlElement(name = "PowerSourceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSourceType;
    @XmlElement(name = "BatteryCellComposition")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellComposition;
    @XmlElement(name = "BatteryDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String batteryDescription;
    @XmlElement(name = "BatteryFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String batteryFormFactor;
    @XmlElement(name = "LithiumBatteryWeight")
    protected BigDecimal lithiumBatteryWeight;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;
    @XmlElement(name = "BatteryAverageLife")
    protected BigDecimal batteryAverageLife;
    @XmlElement(name = "BatteryAverageLifeStandby")
    protected BigDecimal batteryAverageLifeStandby;
    @XmlElement(name = "BatteryChargeTime")
    protected BigDecimal batteryChargeTime;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    protected BigDecimal lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    protected BigDecimal lithiumBatteryVoltage;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sellerWarrantyDescription;
    @XmlElement(name = "SizeMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sizeMap;

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
     * 获取colorMap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorMap() {
        return colorMap;
    }

    /**
     * 设置colorMap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorMap(String value) {
        this.colorMap = value;
    }

    /**
     * 获取fabricWarmthDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabricWarmthDescription() {
        return fabricWarmthDescription;
    }

    /**
     * 设置fabricWarmthDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabricWarmthDescription(String value) {
        this.fabricWarmthDescription = value;
    }

    /**
     * 获取finish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinish() {
        return finish;
    }

    /**
     * 设置finish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinish(String value) {
        this.finish = value;
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
     * 获取isStainResistant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStainResistant() {
        return isStainResistant;
    }

    /**
     * 设置isStainResistant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStainResistant(Boolean value) {
        this.isStainResistant = value;
    }

    /**
     * 获取lightSourceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightSourceType() {
        return lightSourceType;
    }

    /**
     * 设置lightSourceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightSourceType(String value) {
        this.lightSourceType = value;
    }

    /**
     * 获取material属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * 设置material属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * 获取maximumCoverageArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaDimensionOptionalUnit }
     *     
     */
    public AreaDimensionOptionalUnit getMaximumCoverageArea() {
        return maximumCoverageArea;
    }

    /**
     * 设置maximumCoverageArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaDimensionOptionalUnit }
     *     
     */
    public void setMaximumCoverageArea(AreaDimensionOptionalUnit value) {
        this.maximumCoverageArea = value;
    }

    /**
     * 获取numberOfSets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSets() {
        return numberOfSets;
    }

    /**
     * 设置numberOfSets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSets(BigInteger value) {
        this.numberOfSets = value;
    }

    /**
     * 获取outputCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeRateDimension }
     *     
     */
    public VolumeRateDimension getOutputCapacity() {
        return outputCapacity;
    }

    /**
     * 设置outputCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeRateDimension }
     *     
     */
    public void setOutputCapacity(VolumeRateDimension value) {
        this.outputCapacity = value;
    }

    /**
     * 获取pieceCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPieceCount() {
        return pieceCount;
    }

    /**
     * 设置pieceCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPieceCount(BigInteger value) {
        this.pieceCount = value;
    }

    /**
     * 获取shape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * 设置shape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * 获取threadCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThreadCount() {
        return threadCount;
    }

    /**
     * 设置threadCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThreadCount(BigInteger value) {
        this.threadCount = value;
    }

    /**
     * 获取towelWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getTowelWeight() {
        return towelWeight;
    }

    /**
     * 设置towelWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setTowelWeight(WeightDimension value) {
        this.towelWeight = value;
    }

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BedAndBath.VariationData }
     *     
     */
    public BedAndBath.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BedAndBath.VariationData }
     *     
     */
    public void setVariationData(BedAndBath.VariationData value) {
        this.variationData = value;
    }

    /**
     * 获取wattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimensionOptionalUnit }
     *     
     */
    public WattageDimensionOptionalUnit getWattage() {
        return wattage;
    }

    /**
     * 设置wattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimensionOptionalUnit }
     *     
     */
    public void setWattage(WattageDimensionOptionalUnit value) {
        this.wattage = value;
    }

    /**
     * 获取innerMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInnerMaterialType() {
        return innerMaterialType;
    }

    /**
     * 设置innerMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInnerMaterialType(String value) {
        this.innerMaterialType = value;
    }

    /**
     * 获取itemThickness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getItemThickness() {
        return itemThickness;
    }

    /**
     * 设置itemThickness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setItemThickness(LengthDimension value) {
        this.itemThickness = value;
    }

    /**
     * 获取manufacturerMinimumAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManufacturerMinimumAge() {
        return manufacturerMinimumAge;
    }

    /**
     * 设置manufacturerMinimumAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManufacturerMinimumAge(BigInteger value) {
        this.manufacturerMinimumAge = value;
    }

    /**
     * 获取manufacturerMaximumAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManufacturerMaximumAge() {
        return manufacturerMaximumAge;
    }

    /**
     * 设置manufacturerMaximumAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManufacturerMaximumAge(BigInteger value) {
        this.manufacturerMaximumAge = value;
    }

    /**
     * 获取occupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupancy() {
        return occupancy;
    }

    /**
     * 设置occupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupancy(String value) {
        this.occupancy = value;
    }

    /**
     * 获取outerMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOuterMaterialType() {
        return outerMaterialType;
    }

    /**
     * 设置outerMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOuterMaterialType(String value) {
        this.outerMaterialType = value;
    }

    /**
     * 获取seasons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasons() {
        return seasons;
    }

    /**
     * 设置seasons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasons(String value) {
        this.seasons = value;
    }

    /**
     * 获取materialComposition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialComposition() {
        return materialComposition;
    }

    /**
     * 设置materialComposition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialComposition(String value) {
        this.materialComposition = value;
    }

    /**
     * 获取itemTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeName() {
        return itemTypeName;
    }

    /**
     * 设置itemTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeName(String value) {
        this.itemTypeName = value;
    }

    /**
     * 获取itemDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getItemDiameter() {
        return itemDiameter;
    }

    /**
     * 设置itemDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setItemDiameter(LengthDimension value) {
        this.itemDiameter = value;
    }

    /**
     * 获取customerRestrictionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRestrictionType() {
        return customerRestrictionType;
    }

    /**
     * 设置customerRestrictionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRestrictionType(String value) {
        this.customerRestrictionType = value;
    }

    /**
     * 获取occasionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccasionType() {
        return occasionType;
    }

    /**
     * 设置occasionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccasionType(String value) {
        this.occasionType = value;
    }

    /**
     * 获取powerSourceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSourceType() {
        return powerSourceType;
    }

    /**
     * 设置powerSourceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSourceType(String value) {
        this.powerSourceType = value;
    }

    /**
     * 获取batteryCellComposition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public BatteryCellTypeValues getBatteryCellComposition() {
        return batteryCellComposition;
    }

    /**
     * 设置batteryCellComposition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public void setBatteryCellComposition(BatteryCellTypeValues value) {
        this.batteryCellComposition = value;
    }

    /**
     * 获取batteryDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryDescription() {
        return batteryDescription;
    }

    /**
     * 设置batteryDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryDescription(String value) {
        this.batteryDescription = value;
    }

    /**
     * 获取batteryFormFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryFormFactor() {
        return batteryFormFactor;
    }

    /**
     * 设置batteryFormFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryFormFactor(String value) {
        this.batteryFormFactor = value;
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
     * 获取efficiency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfficiency() {
        return efficiency;
    }

    /**
     * 设置efficiency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfficiency(String value) {
        this.efficiency = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VariationTheme" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Size"/>
     *               &lt;enumeration value="Color"/>
     *               &lt;enumeration value="Scent"/>
     *               &lt;enumeration value="Size-Color"/>
     *               &lt;enumeration value="Size-Scent"/>
     *               &lt;enumeration value="DisplayLength-DisplayWidth"/>
     *               &lt;enumeration value="DisplayLength-Material"/>
     *               &lt;enumeration value="DisplayLength-Size"/>
     *               &lt;enumeration value="DisplayLength-Color"/>
     *               &lt;enumeration value="DisplayLength-DisplayHeight"/>
     *               &lt;enumeration value="DisplayWidth-Material"/>
     *               &lt;enumeration value="DisplayWidth-Size"/>
     *               &lt;enumeration value="DisplayWidth-Color"/>
     *               &lt;enumeration value="DisplayWidth-DisplayHeight"/>
     *               &lt;enumeration value="ItemPackageQuantity-Material"/>
     *               &lt;enumeration value="ItemPackageQuantity-Size"/>
     *               &lt;enumeration value="ItemPackageQuantity-Color"/>
     *               &lt;enumeration value="ItemPackageQuantity-DisplayHeight"/>
     *               &lt;enumeration value="DisplayWeight-ItemPackageQuantity"/>
     *               &lt;enumeration value="DisplayWeight-Material"/>
     *               &lt;enumeration value="DisplayWeight-Size"/>
     *               &lt;enumeration value="DisplayWeight-Color"/>
     *               &lt;enumeration value="DisplayWeight-DisplayHeight"/>
     *               &lt;enumeration value="Material-DisplayLength"/>
     *               &lt;enumeration value="Material-DisplayWidth"/>
     *               &lt;enumeration value="Material-Size"/>
     *               &lt;enumeration value="Material-Color"/>
     *               &lt;enumeration value="Material-DisplayHeight"/>
     *               &lt;enumeration value="Size-DisplayLength"/>
     *               &lt;enumeration value="Size-DisplayWidth"/>
     *               &lt;enumeration value="Size-DisplayWeight"/>
     *               &lt;enumeration value="Size-Material"/>
     *               &lt;enumeration value="Size-Color"/>
     *               &lt;enumeration value="Size-DisplayHeight"/>
     *               &lt;enumeration value="Color-DisplayLength"/>
     *               &lt;enumeration value="Color-DisplayWidth"/>
     *               &lt;enumeration value="Color-ItemPackageQuantity"/>
     *               &lt;enumeration value="Color-DisplayWeight"/>
     *               &lt;enumeration value="Color-Material"/>
     *               &lt;enumeration value="Color-Size"/>
     *               &lt;enumeration value="Color-DisplayHeight"/>
     *               &lt;enumeration value="DisplayHeight"/>
     *               &lt;enumeration value="Material"/>
     *               &lt;enumeration value="DisplayWeight"/>
     *               &lt;enumeration value="DisplayLength"/>
     *               &lt;enumeration value="ItemPackageQuantity"/>
     *               &lt;enumeration value="DisplayLength-PatternName"/>
     *               &lt;enumeration value="DisplayLength-StyleName"/>
     *               &lt;enumeration value="DisplayWidth-PatternName"/>
     *               &lt;enumeration value="DisplayWidth-StyleName"/>
     *               &lt;enumeration value="Occasion-PatternName"/>
     *               &lt;enumeration value="Occasion-ItemPackageQuantity"/>
     *               &lt;enumeration value="Occasion-Material"/>
     *               &lt;enumeration value="Occasion-StyleName"/>
     *               &lt;enumeration value="Occasion-Size"/>
     *               &lt;enumeration value="Occasion-Color"/>
     *               &lt;enumeration value="Occasion-DisplayHeight"/>
     *               &lt;enumeration value="PatternName-DisplayLength"/>
     *               &lt;enumeration value="PatternName-DisplayWidth"/>
     *               &lt;enumeration value="PatternName-Occasion"/>
     *               &lt;enumeration value="PatternName-Material"/>
     *               &lt;enumeration value="PatternName-StyleName"/>
     *               &lt;enumeration value="PatternName-Size"/>
     *               &lt;enumeration value="PatternName-Color"/>
     *               &lt;enumeration value="PatternName-DisplayHeight"/>
     *               &lt;enumeration value="MatteStyle-Material"/>
     *               &lt;enumeration value="MatteStyle-StyleName"/>
     *               &lt;enumeration value="MatteStyle-Size"/>
     *               &lt;enumeration value="MatteStyle-Color"/>
     *               &lt;enumeration value="ItemPackageQuantity-Occasion"/>
     *               &lt;enumeration value="ItemPackageQuantity-StyleName"/>
     *               &lt;enumeration value="DisplayWeight-StyleName"/>
     *               &lt;enumeration value="Material-PatternName"/>
     *               &lt;enumeration value="Material-MatteStyle"/>
     *               &lt;enumeration value="Material-StyleName"/>
     *               &lt;enumeration value="StyleName-DisplayLength"/>
     *               &lt;enumeration value="StyleName-DisplayWidth"/>
     *               &lt;enumeration value="StyleName-Occasion"/>
     *               &lt;enumeration value="StyleName-PatternName"/>
     *               &lt;enumeration value="StyleName-DisplayWeight"/>
     *               &lt;enumeration value="StyleName-Material"/>
     *               &lt;enumeration value="StyleName-Size"/>
     *               &lt;enumeration value="StyleName-Color"/>
     *               &lt;enumeration value="Size-Occasion"/>
     *               &lt;enumeration value="Size-PatternName"/>
     *               &lt;enumeration value="Size-MatteStyle"/>
     *               &lt;enumeration value="Size-StyleName"/>
     *               &lt;enumeration value="Color-Occasion"/>
     *               &lt;enumeration value="Color-PatternName"/>
     *               &lt;enumeration value="Color-MatteStyle"/>
     *               &lt;enumeration value="Color-StyleName"/>
     *               &lt;enumeration value="MatteStyle"/>
     *               &lt;enumeration value="PatternName"/>
     *               &lt;enumeration value="Occasion"/>
     *               &lt;enumeration value="StyleName"/>
     *               &lt;enumeration value="CustomerPackageType"/>
     *               &lt;enumeration value="ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="StyleName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Scent" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
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
        "variationTheme",
        "size",
        "color",
        "scent",
        "styleName",
        "customerPackageType"
    })
    public static class VariationData {

        @XmlElement(name = "VariationTheme")
        protected String variationTheme;
        @XmlElement(name = "Size")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String size;
        @XmlElement(name = "Color")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String color;
        @XmlElement(name = "Scent")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String scent;
        @XmlElement(name = "StyleName")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String styleName;
        @XmlElement(name = "CustomerPackageType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String customerPackageType;

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
         * 获取color属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColor() {
            return color;
        }

        /**
         * 设置color属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColor(String value) {
            this.color = value;
        }

        /**
         * 获取scent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScent() {
            return scent;
        }

        /**
         * 设置scent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScent(String value) {
            this.scent = value;
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

    }

}
