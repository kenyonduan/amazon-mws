
package com.elcuk.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="EngineType" type="{}StringNotNull" minOccurs="0"/>
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
 *         &lt;element name="HoseLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfSets" type="{}TenDigitInteger" minOccurs="0"/>
 *         &lt;element name="PoolType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Theme" type="{}StringNotNull" minOccurs="0"/>
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
 *                         &lt;enumeration value="ItemDisplayLength-ItemDisplayWidth"/>
 *                         &lt;enumeration value="ItemDisplayLength-MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayLength-SizeName"/>
 *                         &lt;enumeration value="ItemDisplayLength-ColorName"/>
 *                         &lt;enumeration value="ItemDisplayLength-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ItemDisplayWidth-MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayWidth-SizeName"/>
 *                         &lt;enumeration value="ItemDisplayWidth-ColorName"/>
 *                         &lt;enumeration value="ItemDisplayWidth-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ItemPackageQuantity-MaterialType"/>
 *                         &lt;enumeration value="ItemPackageQuantity-SizeName"/>
 *                         &lt;enumeration value="ItemPackageQuantity-ColorName"/>
 *                         &lt;enumeration value="ItemPackageQuantity-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ItemPackageQuantity"/>
 *                         &lt;enumeration value="ItemDisplayWeight-MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayWeight-SizeName"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ColorName"/>
 *                         &lt;enumeration value="ItemDisplayWeight-ItemDisplayHeight"/>
 *                         &lt;enumeration value="MaterialType-ItemDisplayLength"/>
 *                         &lt;enumeration value="MaterialType-ItemDisplayWidth"/>
 *                         &lt;enumeration value="MaterialType-SizeName"/>
 *                         &lt;enumeration value="MaterialType-ColorName"/>
 *                         &lt;enumeration value="MaterialType-ItemDisplayHeight"/>
 *                         &lt;enumeration value="SizeName-ItemDisplayLength"/>
 *                         &lt;enumeration value="SizeName-ItemDisplayWidth"/>
 *                         &lt;enumeration value="SizeName-ItemDisplayWeight"/>
 *                         &lt;enumeration value="SizeName-MaterialType"/>
 *                         &lt;enumeration value="SizeName-ColorName"/>
 *                         &lt;enumeration value="SizeName-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ColorName-ItemDisplayLength"/>
 *                         &lt;enumeration value="ColorName-ItemDisplayWidth"/>
 *                         &lt;enumeration value="ColorName-ItemPackageQuantity"/>
 *                         &lt;enumeration value="ColorName-ItemDisplayWeight"/>
 *                         &lt;enumeration value="ColorName-MaterialType"/>
 *                         &lt;enumeration value="ColorName-SizeName"/>
 *                         &lt;enumeration value="ColorName-ItemDisplayHeight"/>
 *                         &lt;enumeration value="ItemDisplayHeight"/>
 *                         &lt;enumeration value="MaterialType"/>
 *                         &lt;enumeration value="ItemDisplayWeight"/>
 *                         &lt;enumeration value="ItemDisplayLength"/>
 *                         &lt;enumeration value="ItemPackageQuantity"/>
 *                         &lt;enumeration value="ItemDisplayLength-PatternName"/>
 *                         &lt;enumeration value="ItemDisplayLength-StyleName"/>
 *                         &lt;enumeration value="ItemDisplayWidth-PatternName"/>
 *                         &lt;enumeration value="ItemDisplayWidth-StyleName"/>
 *                         &lt;enumeration value="Occasion-PatternName"/>
 *                         &lt;enumeration value="Occasion-ItemPackageQuantity"/>
 *                         &lt;enumeration value="Occasion-MaterialType"/>
 *                         &lt;enumeration value="Occasion-StyleName"/>
 *                         &lt;enumeration value="Occasion-SizeName"/>
 *                         &lt;enumeration value="Occasion-ColorName"/>
 *                         &lt;enumeration value="Occasion-ItemDisplayHeight"/>
 *                         &lt;enumeration value="PatternName-ItemDisplayLength"/>
 *                         &lt;enumeration value="PatternName-ItemDisplayWidth"/>
 *                         &lt;enumeration value="PatternName-Occasion"/>
 *                         &lt;enumeration value="PatternName-MaterialType"/>
 *                         &lt;enumeration value="PatternName-StyleName"/>
 *                         &lt;enumeration value="PatternName-SizeName"/>
 *                         &lt;enumeration value="PatternName-ColorName"/>
 *                         &lt;enumeration value="PatternName-ItemDisplayHeight"/>
 *                         &lt;enumeration value="MatteStyle-MaterialType"/>
 *                         &lt;enumeration value="MatteStyle-StyleName"/>
 *                         &lt;enumeration value="MatteStyle-SizeName"/>
 *                         &lt;enumeration value="MatteStyle-ColorName"/>
 *                         &lt;enumeration value="ItemPackageQuantity-Occasion"/>
 *                         &lt;enumeration value="ItemPackageQuantity-StyleName"/>
 *                         &lt;enumeration value="ItemDisplayWeight-StyleName"/>
 *                         &lt;enumeration value="MaterialType-PatternName"/>
 *                         &lt;enumeration value="MaterialType-MatteStyle"/>
 *                         &lt;enumeration value="MaterialType-StyleName"/>
 *                         &lt;enumeration value="StyleName-ItemDisplayLength"/>
 *                         &lt;enumeration value="StyleName-ItemDisplayWidth"/>
 *                         &lt;enumeration value="StyleName-Occasion"/>
 *                         &lt;enumeration value="StyleName-PatternName"/>
 *                         &lt;enumeration value="StyleName-ItemDisplayWeight"/>
 *                         &lt;enumeration value="StyleName-MaterialType"/>
 *                         &lt;enumeration value="StyleName-SizeName"/>
 *                         &lt;enumeration value="StyleName-ColorName"/>
 *                         &lt;enumeration value="SizeName-Occasion"/>
 *                         &lt;enumeration value="SizeName-PatternName"/>
 *                         &lt;enumeration value="SizeName-MatteStyle"/>
 *                         &lt;enumeration value="SizeName-StyleName"/>
 *                         &lt;enumeration value="ColorName-Occasion"/>
 *                         &lt;enumeration value="ColorName-PatternName"/>
 *                         &lt;enumeration value="ColorName-MatteStyle"/>
 *                         &lt;enumeration value="ColorName-StyleName"/>
 *                         &lt;enumeration value="MatteStyle"/>
 *                         &lt;enumeration value="PatternName"/>
 *                         &lt;enumeration value="Occasion"/>
 *                         &lt;enumeration value="StyleName"/>
 *                         &lt;enumeration value="ScentName"/>
 *                         &lt;enumeration value="CustomerPackageType"/>
 *                         &lt;enumeration value="ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="StyleName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
 *                         &lt;enumeration value="MetalType"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="ScentName" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="MetalType" type="{}StringNotNull" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Wattage" type="{}WattageDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="ThreadCount" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="ItemForm" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CuttingLengthDerived" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CutType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OuterMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WarrantyDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="UnitCount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                 &lt;attribute name="unitOfMeasure" use="required" type="{}StringNotNull" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Shape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="InstallationType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Efficiency" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OutputCapacity" type="{}VolumeRateDimension" minOccurs="0"/>
 *         &lt;element name="BatteryWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="CuttingWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="OccasionType" type="{}StringNotNull" minOccurs="0"/>
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
    "engineType",
    "identityPackageType",
    "isStainResistant",
    "hoseLength",
    "material",
    "numberOfSets",
    "poolType",
    "powerSource",
    "theme",
    "variationData",
    "wattage",
    "voltage",
    "threadCount",
    "itemForm",
    "cuttingLengthDerived",
    "cutType",
    "outerMaterialType",
    "warrantyDescription",
    "unitCount",
    "shape",
    "installationType",
    "efficiency",
    "outputCapacity",
    "batteryWeight",
    "cuttingWidth",
    "occasionType"
})
@XmlRootElement(name = "OutdoorLiving")
public class OutdoorLiving {

    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "CanShipInOriginalContainer")
    protected Boolean canShipInOriginalContainer;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "EngineType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String engineType;
    @XmlElement(name = "IdentityPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identityPackageType;
    @XmlElement(name = "IsStainResistant")
    protected Boolean isStainResistant;
    @XmlElement(name = "HoseLength")
    protected LengthDimension hoseLength;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String material;
    @XmlElement(name = "NumberOfSets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSets;
    @XmlElement(name = "PoolType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String poolType;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "Theme")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String theme;
    @XmlElement(name = "VariationData")
    protected OutdoorLiving.VariationData variationData;
    @XmlElement(name = "Wattage")
    protected WattageDimensionOptionalUnit wattage;
    @XmlElement(name = "Voltage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger voltage;
    @XmlElement(name = "ThreadCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger threadCount;
    @XmlElement(name = "ItemForm")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemForm;
    @XmlElement(name = "CuttingLengthDerived")
    protected LengthDimension cuttingLengthDerived;
    @XmlElement(name = "CutType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cutType;
    @XmlElement(name = "OuterMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String outerMaterialType;
    @XmlElement(name = "WarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warrantyDescription;
    @XmlElement(name = "UnitCount")
    protected OutdoorLiving.UnitCount unitCount;
    @XmlElement(name = "Shape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shape;
    @XmlElement(name = "InstallationType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String installationType;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;
    @XmlElement(name = "OutputCapacity")
    protected VolumeRateDimension outputCapacity;
    @XmlElement(name = "BatteryWeight")
    protected WeightDimension batteryWeight;
    @XmlElement(name = "CuttingWidth")
    protected LengthDimension cuttingWidth;
    @XmlElement(name = "OccasionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String occasionType;

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
     * 获取engineType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * 设置engineType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineType(String value) {
        this.engineType = value;
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
     * 获取hoseLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHoseLength() {
        return hoseLength;
    }

    /**
     * 设置hoseLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHoseLength(LengthDimension value) {
        this.hoseLength = value;
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
     * 获取poolType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolType() {
        return poolType;
    }

    /**
     * 设置poolType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolType(String value) {
        this.poolType = value;
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
     * 获取theme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置theme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OutdoorLiving.VariationData }
     *     
     */
    public OutdoorLiving.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OutdoorLiving.VariationData }
     *     
     */
    public void setVariationData(OutdoorLiving.VariationData value) {
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
     * 获取voltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVoltage() {
        return voltage;
    }

    /**
     * 设置voltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVoltage(BigInteger value) {
        this.voltage = value;
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
     * 获取itemForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemForm() {
        return itemForm;
    }

    /**
     * 设置itemForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemForm(String value) {
        this.itemForm = value;
    }

    /**
     * 获取cuttingLengthDerived属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCuttingLengthDerived() {
        return cuttingLengthDerived;
    }

    /**
     * 设置cuttingLengthDerived属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCuttingLengthDerived(LengthDimension value) {
        this.cuttingLengthDerived = value;
    }

    /**
     * 获取cutType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutType() {
        return cutType;
    }

    /**
     * 设置cutType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutType(String value) {
        this.cutType = value;
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
     * 获取warrantyDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyDescription() {
        return warrantyDescription;
    }

    /**
     * 设置warrantyDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyDescription(String value) {
        this.warrantyDescription = value;
    }

    /**
     * 获取unitCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OutdoorLiving.UnitCount }
     *     
     */
    public OutdoorLiving.UnitCount getUnitCount() {
        return unitCount;
    }

    /**
     * 设置unitCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OutdoorLiving.UnitCount }
     *     
     */
    public void setUnitCount(OutdoorLiving.UnitCount value) {
        this.unitCount = value;
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
     * 获取installationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationType() {
        return installationType;
    }

    /**
     * 设置installationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationType(String value) {
        this.installationType = value;
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
     * 获取batteryWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getBatteryWeight() {
        return batteryWeight;
    }

    /**
     * 设置batteryWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setBatteryWeight(WeightDimension value) {
        this.batteryWeight = value;
    }

    /**
     * 获取cuttingWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCuttingWidth() {
        return cuttingWidth;
    }

    /**
     * 设置cuttingWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCuttingWidth(LengthDimension value) {
        this.cuttingWidth = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
     *       &lt;attribute name="unitOfMeasure" use="required" type="{}StringNotNull" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UnitCount {

        @XmlValue
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger value;
        @XmlAttribute(name = "unitOfMeasure", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String unitOfMeasure;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
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
     *         &lt;element name="VariationTheme" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Size"/>
     *               &lt;enumeration value="Color"/>
     *               &lt;enumeration value="Size-Color"/>
     *               &lt;enumeration value="ItemDisplayLength-ItemDisplayWidth"/>
     *               &lt;enumeration value="ItemDisplayLength-MaterialType"/>
     *               &lt;enumeration value="ItemDisplayLength-SizeName"/>
     *               &lt;enumeration value="ItemDisplayLength-ColorName"/>
     *               &lt;enumeration value="ItemDisplayLength-ItemDisplayHeight"/>
     *               &lt;enumeration value="ItemDisplayWidth-MaterialType"/>
     *               &lt;enumeration value="ItemDisplayWidth-SizeName"/>
     *               &lt;enumeration value="ItemDisplayWidth-ColorName"/>
     *               &lt;enumeration value="ItemDisplayWidth-ItemDisplayHeight"/>
     *               &lt;enumeration value="ItemPackageQuantity-MaterialType"/>
     *               &lt;enumeration value="ItemPackageQuantity-SizeName"/>
     *               &lt;enumeration value="ItemPackageQuantity-ColorName"/>
     *               &lt;enumeration value="ItemPackageQuantity-ItemDisplayHeight"/>
     *               &lt;enumeration value="ItemDisplayWeight-ItemPackageQuantity"/>
     *               &lt;enumeration value="ItemDisplayWeight-MaterialType"/>
     *               &lt;enumeration value="ItemDisplayWeight-SizeName"/>
     *               &lt;enumeration value="ItemDisplayWeight-ColorName"/>
     *               &lt;enumeration value="ItemDisplayWeight-ItemDisplayHeight"/>
     *               &lt;enumeration value="MaterialType-ItemDisplayLength"/>
     *               &lt;enumeration value="MaterialType-ItemDisplayWidth"/>
     *               &lt;enumeration value="MaterialType-SizeName"/>
     *               &lt;enumeration value="MaterialType-ColorName"/>
     *               &lt;enumeration value="MaterialType-ItemDisplayHeight"/>
     *               &lt;enumeration value="SizeName-ItemDisplayLength"/>
     *               &lt;enumeration value="SizeName-ItemDisplayWidth"/>
     *               &lt;enumeration value="SizeName-ItemDisplayWeight"/>
     *               &lt;enumeration value="SizeName-MaterialType"/>
     *               &lt;enumeration value="SizeName-ColorName"/>
     *               &lt;enumeration value="SizeName-ItemDisplayHeight"/>
     *               &lt;enumeration value="ColorName-ItemDisplayLength"/>
     *               &lt;enumeration value="ColorName-ItemDisplayWidth"/>
     *               &lt;enumeration value="ColorName-ItemPackageQuantity"/>
     *               &lt;enumeration value="ColorName-ItemDisplayWeight"/>
     *               &lt;enumeration value="ColorName-MaterialType"/>
     *               &lt;enumeration value="ColorName-SizeName"/>
     *               &lt;enumeration value="ColorName-ItemDisplayHeight"/>
     *               &lt;enumeration value="ItemDisplayHeight"/>
     *               &lt;enumeration value="MaterialType"/>
     *               &lt;enumeration value="ItemDisplayWeight"/>
     *               &lt;enumeration value="ItemDisplayLength"/>
     *               &lt;enumeration value="ItemPackageQuantity"/>
     *               &lt;enumeration value="ItemDisplayLength-PatternName"/>
     *               &lt;enumeration value="ItemDisplayLength-StyleName"/>
     *               &lt;enumeration value="ItemDisplayWidth-PatternName"/>
     *               &lt;enumeration value="ItemDisplayWidth-StyleName"/>
     *               &lt;enumeration value="Occasion-PatternName"/>
     *               &lt;enumeration value="Occasion-ItemPackageQuantity"/>
     *               &lt;enumeration value="Occasion-MaterialType"/>
     *               &lt;enumeration value="Occasion-StyleName"/>
     *               &lt;enumeration value="Occasion-SizeName"/>
     *               &lt;enumeration value="Occasion-ColorName"/>
     *               &lt;enumeration value="Occasion-ItemDisplayHeight"/>
     *               &lt;enumeration value="PatternName-ItemDisplayLength"/>
     *               &lt;enumeration value="PatternName-ItemDisplayWidth"/>
     *               &lt;enumeration value="PatternName-Occasion"/>
     *               &lt;enumeration value="PatternName-MaterialType"/>
     *               &lt;enumeration value="PatternName-StyleName"/>
     *               &lt;enumeration value="PatternName-SizeName"/>
     *               &lt;enumeration value="PatternName-ColorName"/>
     *               &lt;enumeration value="PatternName-ItemDisplayHeight"/>
     *               &lt;enumeration value="MatteStyle-MaterialType"/>
     *               &lt;enumeration value="MatteStyle-StyleName"/>
     *               &lt;enumeration value="MatteStyle-SizeName"/>
     *               &lt;enumeration value="MatteStyle-ColorName"/>
     *               &lt;enumeration value="ItemPackageQuantity-Occasion"/>
     *               &lt;enumeration value="ItemPackageQuantity-StyleName"/>
     *               &lt;enumeration value="ItemDisplayWeight-StyleName"/>
     *               &lt;enumeration value="MaterialType-PatternName"/>
     *               &lt;enumeration value="MaterialType-MatteStyle"/>
     *               &lt;enumeration value="MaterialType-StyleName"/>
     *               &lt;enumeration value="StyleName-ItemDisplayLength"/>
     *               &lt;enumeration value="StyleName-ItemDisplayWidth"/>
     *               &lt;enumeration value="StyleName-Occasion"/>
     *               &lt;enumeration value="StyleName-PatternName"/>
     *               &lt;enumeration value="StyleName-ItemDisplayWeight"/>
     *               &lt;enumeration value="StyleName-MaterialType"/>
     *               &lt;enumeration value="StyleName-SizeName"/>
     *               &lt;enumeration value="StyleName-ColorName"/>
     *               &lt;enumeration value="SizeName-Occasion"/>
     *               &lt;enumeration value="SizeName-PatternName"/>
     *               &lt;enumeration value="SizeName-MatteStyle"/>
     *               &lt;enumeration value="SizeName-StyleName"/>
     *               &lt;enumeration value="ColorName-Occasion"/>
     *               &lt;enumeration value="ColorName-PatternName"/>
     *               &lt;enumeration value="ColorName-MatteStyle"/>
     *               &lt;enumeration value="ColorName-StyleName"/>
     *               &lt;enumeration value="MatteStyle"/>
     *               &lt;enumeration value="PatternName"/>
     *               &lt;enumeration value="Occasion"/>
     *               &lt;enumeration value="StyleName"/>
     *               &lt;enumeration value="ScentName"/>
     *               &lt;enumeration value="CustomerPackageType"/>
     *               &lt;enumeration value="ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="StyleName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
     *               &lt;enumeration value="MetalType"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="ScentName" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="MetalType" type="{}StringNotNull" minOccurs="0"/>
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
        "scentName",
        "customerPackageType",
        "metalType"
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
        @XmlElement(name = "ScentName")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String scentName;
        @XmlElement(name = "CustomerPackageType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String customerPackageType;
        @XmlElement(name = "MetalType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String metalType;

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
         * 获取scentName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScentName() {
            return scentName;
        }

        /**
         * 设置scentName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScentName(String value) {
            this.scentName = value;
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
         * 获取metalType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetalType() {
            return metalType;
        }

        /**
         * 设置metalType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetalType(String value) {
            this.metalType = value;
        }

    }

}
