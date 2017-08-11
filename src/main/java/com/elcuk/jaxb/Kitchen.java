
package com.elcuk.jaxb;

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
 *         &lt;element name="BladeType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BatteryCellComposition" type="{}BatteryCellTypeValues" minOccurs="0"/>
 *         &lt;element name="BatteryFormFactor" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="BladeMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BladeLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CanShipInOriginalContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
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
 *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumCoverageArea" type="{}AreaDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="NumberOfSets" type="{}TenDigitInteger" minOccurs="0"/>
 *         &lt;element name="OccasionType" type="{}MediumStringNotNull" minOccurs="0"/>
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
 *                         &lt;enumeration value="Size-Color"/>
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
 *                   &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Wattage" type="{}WattageDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="CompatibleDevices" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumWeightCapacity" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="NoiseLevel" type="{}NoiseLevelDimension" minOccurs="0"/>
 *         &lt;element name="KitchenOutputCapacity" type="{}VolumeAndVolumeRateDimension" minOccurs="0"/>
 *         &lt;element name="Runtime" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="SpecificUsesForProduct" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="AnnualEnergyConsumption" type="{}EnergyConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="EuEnergyLabelEfficiencyClass" type="{}EnergyLabelEfficiencyClass" minOccurs="0"/>
 *         &lt;element name="HasAutomaticShutoff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberOfSpeeds" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="KitchenOperatingPressure" type="{}PressureDimension" minOccurs="0"/>
 *         &lt;element name="PowerSourceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VacuumCleanerCarpetCleaningClass" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VacuumCleanerDustReemissionClass" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VacuumCleanerHardfloorCleaningClass" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ItemDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Efficiency" type="{}StringNotNull" minOccurs="0"/>
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
    "bladeType",
    "batteryCellComposition",
    "batteryFormFactor",
    "bladeMaterial",
    "bladeLength",
    "canShipInOriginalContainer",
    "colorMap",
    "finish",
    "identityPackageType",
    "isStainResistant",
    "material",
    "maximumCoverageArea",
    "numberOfSets",
    "occasionType",
    "outputCapacity",
    "pieceCount",
    "shape",
    "threadCount",
    "towelWeight",
    "variationData",
    "wattage",
    "compatibleDevices",
    "maximumWeightCapacity",
    "noiseLevel",
    "kitchenOutputCapacity",
    "runtime",
    "specificUsesForProduct",
    "annualEnergyConsumption",
    "euEnergyLabelEfficiencyClass",
    "hasAutomaticShutoff",
    "numberOfSpeeds",
    "kitchenOperatingPressure",
    "powerSourceType",
    "vacuumCleanerCarpetCleaningClass",
    "vacuumCleanerDustReemissionClass",
    "vacuumCleanerHardfloorCleaningClass",
    "itemDiameter",
    "efficiency"
})
@XmlRootElement(name = "Kitchen")
public class Kitchen {

    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "BladeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeType;
    @XmlElement(name = "BatteryCellComposition")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellComposition;
    @XmlElement(name = "BatteryFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String batteryFormFactor;
    @XmlElement(name = "BladeMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeMaterial;
    @XmlElement(name = "BladeLength")
    protected LengthDimension bladeLength;
    @XmlElement(name = "CanShipInOriginalContainer")
    protected Boolean canShipInOriginalContainer;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "Finish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finish;
    @XmlElement(name = "IdentityPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identityPackageType;
    @XmlElement(name = "IsStainResistant")
    protected Boolean isStainResistant;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String material;
    @XmlElement(name = "MaximumCoverageArea")
    protected AreaDimensionOptionalUnit maximumCoverageArea;
    @XmlElement(name = "NumberOfSets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSets;
    @XmlElement(name = "OccasionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String occasionType;
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
    protected Kitchen.VariationData variationData;
    @XmlElement(name = "Wattage")
    protected WattageDimensionOptionalUnit wattage;
    @XmlElement(name = "CompatibleDevices")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String compatibleDevices;
    @XmlElement(name = "MaximumWeightCapacity")
    protected WeightDimension maximumWeightCapacity;
    @XmlElement(name = "NoiseLevel")
    protected NoiseLevelDimension noiseLevel;
    @XmlElement(name = "KitchenOutputCapacity")
    protected VolumeAndVolumeRateDimension kitchenOutputCapacity;
    @XmlElement(name = "Runtime")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger runtime;
    @XmlElement(name = "SpecificUsesForProduct")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String specificUsesForProduct;
    @XmlElement(name = "AnnualEnergyConsumption")
    protected EnergyConsumptionDimension annualEnergyConsumption;
    @XmlElement(name = "EuEnergyLabelEfficiencyClass")
    @XmlSchemaType(name = "string")
    protected EnergyLabelEfficiencyClass euEnergyLabelEfficiencyClass;
    @XmlElement(name = "HasAutomaticShutoff")
    protected Boolean hasAutomaticShutoff;
    @XmlElement(name = "NumberOfSpeeds")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSpeeds;
    @XmlElement(name = "KitchenOperatingPressure")
    protected PressureDimension kitchenOperatingPressure;
    @XmlElement(name = "PowerSourceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSourceType;
    @XmlElement(name = "VacuumCleanerCarpetCleaningClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vacuumCleanerCarpetCleaningClass;
    @XmlElement(name = "VacuumCleanerDustReemissionClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vacuumCleanerDustReemissionClass;
    @XmlElement(name = "VacuumCleanerHardfloorCleaningClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vacuumCleanerHardfloorCleaningClass;
    @XmlElement(name = "ItemDiameter")
    protected LengthDimension itemDiameter;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

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
     * 获取bladeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBladeType() {
        return bladeType;
    }

    /**
     * 设置bladeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBladeType(String value) {
        this.bladeType = value;
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
     * 获取bladeMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBladeMaterial() {
        return bladeMaterial;
    }

    /**
     * 设置bladeMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBladeMaterial(String value) {
        this.bladeMaterial = value;
    }

    /**
     * 获取bladeLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBladeLength() {
        return bladeLength;
    }

    /**
     * 设置bladeLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBladeLength(LengthDimension value) {
        this.bladeLength = value;
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
     *     {@link Kitchen.VariationData }
     *     
     */
    public Kitchen.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Kitchen.VariationData }
     *     
     */
    public void setVariationData(Kitchen.VariationData value) {
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
     * 获取compatibleDevices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleDevices() {
        return compatibleDevices;
    }

    /**
     * 设置compatibleDevices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleDevices(String value) {
        this.compatibleDevices = value;
    }

    /**
     * 获取maximumWeightCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaximumWeightCapacity() {
        return maximumWeightCapacity;
    }

    /**
     * 设置maximumWeightCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaximumWeightCapacity(WeightDimension value) {
        this.maximumWeightCapacity = value;
    }

    /**
     * 获取noiseLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoiseLevelDimension }
     *     
     */
    public NoiseLevelDimension getNoiseLevel() {
        return noiseLevel;
    }

    /**
     * 设置noiseLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseLevelDimension }
     *     
     */
    public void setNoiseLevel(NoiseLevelDimension value) {
        this.noiseLevel = value;
    }

    /**
     * 获取kitchenOutputCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeAndVolumeRateDimension }
     *     
     */
    public VolumeAndVolumeRateDimension getKitchenOutputCapacity() {
        return kitchenOutputCapacity;
    }

    /**
     * 设置kitchenOutputCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeAndVolumeRateDimension }
     *     
     */
    public void setKitchenOutputCapacity(VolumeAndVolumeRateDimension value) {
        this.kitchenOutputCapacity = value;
    }

    /**
     * 获取runtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRuntime() {
        return runtime;
    }

    /**
     * 设置runtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRuntime(BigInteger value) {
        this.runtime = value;
    }

    /**
     * 获取specificUsesForProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUsesForProduct() {
        return specificUsesForProduct;
    }

    /**
     * 设置specificUsesForProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUsesForProduct(String value) {
        this.specificUsesForProduct = value;
    }

    /**
     * 获取annualEnergyConsumption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public EnergyConsumptionDimension getAnnualEnergyConsumption() {
        return annualEnergyConsumption;
    }

    /**
     * 设置annualEnergyConsumption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public void setAnnualEnergyConsumption(EnergyConsumptionDimension value) {
        this.annualEnergyConsumption = value;
    }

    /**
     * 获取euEnergyLabelEfficiencyClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnergyLabelEfficiencyClass }
     *     
     */
    public EnergyLabelEfficiencyClass getEuEnergyLabelEfficiencyClass() {
        return euEnergyLabelEfficiencyClass;
    }

    /**
     * 设置euEnergyLabelEfficiencyClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyLabelEfficiencyClass }
     *     
     */
    public void setEuEnergyLabelEfficiencyClass(EnergyLabelEfficiencyClass value) {
        this.euEnergyLabelEfficiencyClass = value;
    }

    /**
     * 获取hasAutomaticShutoff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAutomaticShutoff() {
        return hasAutomaticShutoff;
    }

    /**
     * 设置hasAutomaticShutoff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAutomaticShutoff(Boolean value) {
        this.hasAutomaticShutoff = value;
    }

    /**
     * 获取numberOfSpeeds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpeeds() {
        return numberOfSpeeds;
    }

    /**
     * 设置numberOfSpeeds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpeeds(BigInteger value) {
        this.numberOfSpeeds = value;
    }

    /**
     * 获取kitchenOperatingPressure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PressureDimension }
     *     
     */
    public PressureDimension getKitchenOperatingPressure() {
        return kitchenOperatingPressure;
    }

    /**
     * 设置kitchenOperatingPressure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PressureDimension }
     *     
     */
    public void setKitchenOperatingPressure(PressureDimension value) {
        this.kitchenOperatingPressure = value;
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
     * 获取vacuumCleanerCarpetCleaningClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVacuumCleanerCarpetCleaningClass() {
        return vacuumCleanerCarpetCleaningClass;
    }

    /**
     * 设置vacuumCleanerCarpetCleaningClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVacuumCleanerCarpetCleaningClass(String value) {
        this.vacuumCleanerCarpetCleaningClass = value;
    }

    /**
     * 获取vacuumCleanerDustReemissionClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVacuumCleanerDustReemissionClass() {
        return vacuumCleanerDustReemissionClass;
    }

    /**
     * 设置vacuumCleanerDustReemissionClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVacuumCleanerDustReemissionClass(String value) {
        this.vacuumCleanerDustReemissionClass = value;
    }

    /**
     * 获取vacuumCleanerHardfloorCleaningClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVacuumCleanerHardfloorCleaningClass() {
        return vacuumCleanerHardfloorCleaningClass;
    }

    /**
     * 设置vacuumCleanerHardfloorCleaningClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVacuumCleanerHardfloorCleaningClass(String value) {
        this.vacuumCleanerHardfloorCleaningClass = value;
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
     *               &lt;enumeration value="Size-Color"/>
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
