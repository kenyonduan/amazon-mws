
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
 *         &lt;element name="AmzMinimum" type="{}OptionalMinimumAgeRecommendedDimension" minOccurs="0"/>
 *         &lt;element name="AirFlowCapacity" type="{}AirFlowDisplacementDimension" minOccurs="0"/>
 *         &lt;element name="AmperageCapacity" type="{}AmperageDimension" minOccurs="0"/>
 *         &lt;element name="AreBatteriesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BatteriesRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BatteryCellType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BatteryDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BatteryLife" type="{}BatteryLifeType" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumIon" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumMetal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="CanShipInOriginalContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapacityDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Certification" type="{}StringNotNull" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="CordLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ExtensionLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Finish" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FlowRate" type="{}FlowRateType" minOccurs="0"/>
 *         &lt;element name="GritType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HandleLeverPlacement" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Horsepower" type="{}PowerDimension" minOccurs="0"/>
 *         &lt;element name="HoseLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemPitch" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="IdentityPackageType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="bulk"/>
 *               &lt;enumeration value="frustration_free"/>
 *               &lt;enumeration value="traditional"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncludedComponent" type="{}StringNotNull" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="InstallationMethod" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IsAdultProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemDiameter" type="{}LengthDimension" minOccurs="0"/>
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
 *         &lt;element name="MaximumPressure" type="{}PressureDimension" minOccurs="0"/>
 *         &lt;element name="MaximumWeightCapacity" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="NumberOfHandles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Pattern" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PPUCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PPUCountType" type="{}TwentyStringNotNull" minOccurs="0"/>
 *         &lt;element name="Shape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SizeMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SoundLevel" type="{}SoundLevelType" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Style" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TemperatureRange" type="{}TemperatureRangeType" minOccurs="0"/>
 *         &lt;element name="Thickness" type="{}ThicknessType" minOccurs="0"/>
 *         &lt;element name="Usage" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WaterConsumption" type="{}WaterConsumptionType" minOccurs="0"/>
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
    "amzMinimum",
    "airFlowCapacity",
    "amperageCapacity",
    "areBatteriesIncluded",
    "batteriesRequired",
    "batteryCellType",
    "batteryDescription",
    "batteryLife",
    "batteryTypeLithiumIon",
    "batteryTypeLithiumMetal",
    "canShipInOriginalContainer",
    "capacityDescription",
    "certification",
    "cordLength",
    "extensionLength",
    "finish",
    "flowRate",
    "gritType",
    "handleLeverPlacement",
    "horsepower",
    "hoseLength",
    "itemPitch",
    "identityPackageType",
    "includedComponent",
    "installationMethod",
    "isAdultProduct",
    "itemDiameter",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "maximumPressure",
    "maximumWeightCapacity",
    "numberOfHandles",
    "numberOfPieces",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "pattern",
    "ppuCount",
    "ppuCountType",
    "shape",
    "sizeMap",
    "soundLevel",
    "specialFeatures",
    "style",
    "temperatureRange",
    "thickness",
    "usage",
    "warrantyType",
    "waterConsumption"
})
@XmlRootElement(name = "HICommon")
public class HICommon {

    @XmlElement(name = "AmzMinimum")
    protected OptionalMinimumAgeRecommendedDimension amzMinimum;
    @XmlElement(name = "AirFlowCapacity")
    protected AirFlowDisplacementDimension airFlowCapacity;
    @XmlElement(name = "AmperageCapacity")
    protected AmperageDimension amperageCapacity;
    @XmlElement(name = "AreBatteriesIncluded")
    protected Boolean areBatteriesIncluded;
    @XmlElement(name = "BatteriesRequired")
    protected Boolean batteriesRequired;
    @XmlElement(name = "BatteryCellType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String batteryCellType;
    @XmlElement(name = "BatteryDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String batteryDescription;
    @XmlElement(name = "BatteryLife")
    protected BatteryLifeType batteryLife;
    @XmlElement(name = "BatteryTypeLithiumIon")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumIon;
    @XmlElement(name = "BatteryTypeLithiumMetal")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumMetal;
    @XmlElement(name = "CanShipInOriginalContainer")
    protected Boolean canShipInOriginalContainer;
    @XmlElement(name = "CapacityDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String capacityDescription;
    @XmlElement(name = "Certification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> certification;
    @XmlElement(name = "CordLength")
    protected LengthDimension cordLength;
    @XmlElement(name = "ExtensionLength")
    protected LengthDimension extensionLength;
    @XmlElement(name = "Finish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finish;
    @XmlElement(name = "FlowRate")
    protected FlowRateType flowRate;
    @XmlElement(name = "GritType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gritType;
    @XmlElement(name = "HandleLeverPlacement")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String handleLeverPlacement;
    @XmlElement(name = "Horsepower")
    protected PowerDimension horsepower;
    @XmlElement(name = "HoseLength")
    protected LengthDimension hoseLength;
    @XmlElement(name = "ItemPitch")
    protected LengthDimension itemPitch;
    @XmlElement(name = "IdentityPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identityPackageType;
    @XmlElement(name = "IncludedComponent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> includedComponent;
    @XmlElement(name = "InstallationMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String installationMethod;
    @XmlElement(name = "IsAdultProduct")
    protected Boolean isAdultProduct;
    @XmlElement(name = "ItemDiameter")
    protected LengthDimension itemDiameter;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    protected BigDecimal lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    protected BigDecimal lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    protected BigDecimal lithiumBatteryWeight;
    @XmlElement(name = "MaximumPressure")
    protected PressureDimension maximumPressure;
    @XmlElement(name = "MaximumWeightCapacity")
    protected WeightDimension maximumWeightCapacity;
    @XmlElement(name = "NumberOfHandles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHandles;
    @XmlElement(name = "NumberOfPieces")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPieces;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "Pattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pattern;
    @XmlElement(name = "PPUCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ppuCount;
    @XmlElement(name = "PPUCountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ppuCountType;
    @XmlElement(name = "Shape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shape;
    @XmlElement(name = "SizeMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sizeMap;
    @XmlElement(name = "SoundLevel")
    protected SoundLevelType soundLevel;
    @XmlElement(name = "SpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specialFeatures;
    @XmlElement(name = "Style")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String style;
    @XmlElement(name = "TemperatureRange")
    protected TemperatureRangeType temperatureRange;
    @XmlElement(name = "Thickness")
    protected ThicknessType thickness;
    @XmlElement(name = "Usage")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String usage;
    @XmlElement(name = "WarrantyType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warrantyType;
    @XmlElement(name = "WaterConsumption")
    protected WaterConsumptionType waterConsumption;

    /**
     * 获取amzMinimum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalMinimumAgeRecommendedDimension }
     *     
     */
    public OptionalMinimumAgeRecommendedDimension getAmzMinimum() {
        return amzMinimum;
    }

    /**
     * 设置amzMinimum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalMinimumAgeRecommendedDimension }
     *     
     */
    public void setAmzMinimum(OptionalMinimumAgeRecommendedDimension value) {
        this.amzMinimum = value;
    }

    /**
     * 获取airFlowCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirFlowDisplacementDimension }
     *     
     */
    public AirFlowDisplacementDimension getAirFlowCapacity() {
        return airFlowCapacity;
    }

    /**
     * 设置airFlowCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirFlowDisplacementDimension }
     *     
     */
    public void setAirFlowCapacity(AirFlowDisplacementDimension value) {
        this.airFlowCapacity = value;
    }

    /**
     * 获取amperageCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmperageDimension }
     *     
     */
    public AmperageDimension getAmperageCapacity() {
        return amperageCapacity;
    }

    /**
     * 设置amperageCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmperageDimension }
     *     
     */
    public void setAmperageCapacity(AmperageDimension value) {
        this.amperageCapacity = value;
    }

    /**
     * 获取areBatteriesIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreBatteriesIncluded() {
        return areBatteriesIncluded;
    }

    /**
     * 设置areBatteriesIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreBatteriesIncluded(Boolean value) {
        this.areBatteriesIncluded = value;
    }

    /**
     * 获取batteriesRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBatteriesRequired() {
        return batteriesRequired;
    }

    /**
     * 设置batteriesRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBatteriesRequired(Boolean value) {
        this.batteriesRequired = value;
    }

    /**
     * 获取batteryCellType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryCellType() {
        return batteryCellType;
    }

    /**
     * 设置batteryCellType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryCellType(String value) {
        this.batteryCellType = value;
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
     * 获取batteryLife属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryLifeType }
     *     
     */
    public BatteryLifeType getBatteryLife() {
        return batteryLife;
    }

    /**
     * 设置batteryLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryLifeType }
     *     
     */
    public void setBatteryLife(BatteryLifeType value) {
        this.batteryLife = value;
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
     * 获取capacityDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapacityDescription() {
        return capacityDescription;
    }

    /**
     * 设置capacityDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapacityDescription(String value) {
        this.capacityDescription = value;
    }

    /**
     * Gets the value of the certification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCertification() {
        if (certification == null) {
            certification = new ArrayList<String>();
        }
        return this.certification;
    }

    /**
     * 获取cordLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCordLength() {
        return cordLength;
    }

    /**
     * 设置cordLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCordLength(LengthDimension value) {
        this.cordLength = value;
    }

    /**
     * 获取extensionLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getExtensionLength() {
        return extensionLength;
    }

    /**
     * 设置extensionLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setExtensionLength(LengthDimension value) {
        this.extensionLength = value;
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
     * 获取flowRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlowRateType }
     *     
     */
    public FlowRateType getFlowRate() {
        return flowRate;
    }

    /**
     * 设置flowRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlowRateType }
     *     
     */
    public void setFlowRate(FlowRateType value) {
        this.flowRate = value;
    }

    /**
     * 获取gritType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGritType() {
        return gritType;
    }

    /**
     * 设置gritType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGritType(String value) {
        this.gritType = value;
    }

    /**
     * 获取handleLeverPlacement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleLeverPlacement() {
        return handleLeverPlacement;
    }

    /**
     * 设置handleLeverPlacement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleLeverPlacement(String value) {
        this.handleLeverPlacement = value;
    }

    /**
     * 获取horsepower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerDimension }
     *     
     */
    public PowerDimension getHorsepower() {
        return horsepower;
    }

    /**
     * 设置horsepower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerDimension }
     *     
     */
    public void setHorsepower(PowerDimension value) {
        this.horsepower = value;
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
     * 获取itemPitch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getItemPitch() {
        return itemPitch;
    }

    /**
     * 设置itemPitch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setItemPitch(LengthDimension value) {
        this.itemPitch = value;
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
     * Gets the value of the includedComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedComponent() {
        if (includedComponent == null) {
            includedComponent = new ArrayList<String>();
        }
        return this.includedComponent;
    }

    /**
     * 获取installationMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallationMethod() {
        return installationMethod;
    }

    /**
     * 设置installationMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallationMethod(String value) {
        this.installationMethod = value;
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
     * 获取maximumPressure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PressureDimension }
     *     
     */
    public PressureDimension getMaximumPressure() {
        return maximumPressure;
    }

    /**
     * 设置maximumPressure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PressureDimension }
     *     
     */
    public void setMaximumPressure(PressureDimension value) {
        this.maximumPressure = value;
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
     * 获取numberOfHandles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHandles() {
        return numberOfHandles;
    }

    /**
     * 设置numberOfHandles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHandles(BigInteger value) {
        this.numberOfHandles = value;
    }

    /**
     * 获取numberOfPieces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * 设置numberOfPieces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPieces(BigInteger value) {
        this.numberOfPieces = value;
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
     * 获取pattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * 设置pattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * 获取ppuCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPPUCount() {
        return ppuCount;
    }

    /**
     * 设置ppuCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPPUCount(BigInteger value) {
        this.ppuCount = value;
    }

    /**
     * 获取ppuCountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPPUCountType() {
        return ppuCountType;
    }

    /**
     * 设置ppuCountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPUCountType(String value) {
        this.ppuCountType = value;
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
     * 获取soundLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SoundLevelType }
     *     
     */
    public SoundLevelType getSoundLevel() {
        return soundLevel;
    }

    /**
     * 设置soundLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SoundLevelType }
     *     
     */
    public void setSoundLevel(SoundLevelType value) {
        this.soundLevel = value;
    }

    /**
     * Gets the value of the specialFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialFeatures() {
        if (specialFeatures == null) {
            specialFeatures = new ArrayList<String>();
        }
        return this.specialFeatures;
    }

    /**
     * 获取style属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置style属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * 获取temperatureRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TemperatureRangeType }
     *     
     */
    public TemperatureRangeType getTemperatureRange() {
        return temperatureRange;
    }

    /**
     * 设置temperatureRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureRangeType }
     *     
     */
    public void setTemperatureRange(TemperatureRangeType value) {
        this.temperatureRange = value;
    }

    /**
     * 获取thickness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ThicknessType }
     *     
     */
    public ThicknessType getThickness() {
        return thickness;
    }

    /**
     * 设置thickness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ThicknessType }
     *     
     */
    public void setThickness(ThicknessType value) {
        this.thickness = value;
    }

    /**
     * 获取usage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * 设置usage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * 获取warrantyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyType() {
        return warrantyType;
    }

    /**
     * 设置warrantyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyType(String value) {
        this.warrantyType = value;
    }

    /**
     * 获取waterConsumption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WaterConsumptionType }
     *     
     */
    public WaterConsumptionType getWaterConsumption() {
        return waterConsumption;
    }

    /**
     * 设置waterConsumption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WaterConsumptionType }
     *     
     */
    public void setWaterConsumption(WaterConsumptionType value) {
        this.waterConsumption = value;
    }

}
