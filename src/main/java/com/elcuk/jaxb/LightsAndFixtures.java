
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
 *         &lt;element name="VariationData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parentage">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="parent"/>
 *                         &lt;enumeration value="child"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VariationTheme" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Color"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirFlowCapacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BaseDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element name="BulbDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BulbLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BulbLifeSpan" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="BulbPowerFactor" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="BulbSpecialFeatures" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="BulbSwitchingCycles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BulbType" type="{}String" minOccurs="0"/>
 *         &lt;element name="BulbWattage" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="CapType" type="{}String" minOccurs="0"/>
 *         &lt;element name="Certification" type="{}String" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="Collection" type="{}String" minOccurs="0"/>
 *         &lt;element name="Color" type="{}String" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}String" minOccurs="0"/>
 *         &lt;element name="ColorRenderingIndex" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ColorTemperature" type="{}TemperatureRatingDimension" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="DisplayDepth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="EnergyEfficiencyRating" type="{}String" minOccurs="0"/>
 *         &lt;element name="FanBladeColor" type="{}String" minOccurs="0"/>
 *         &lt;element name="FinishType" type="{}String" minOccurs="0"/>
 *         &lt;element name="IncandescentEquivalentWattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="IncludedComponent" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="InternationalProtectionRating" type="{}String" minOccurs="0"/>
 *         &lt;element name="ItemDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="LampStartupTime" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="LampWarmupTime" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="LightingMethod" type="{}String" minOccurs="0"/>
 *         &lt;element name="LightOutputLuminance" type="{}LuminanceDimension" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryEnergyContent" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryPackaging" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="batteries_contained_in_equipment"/>
 *               &lt;enumeration value="batteries_only"/>
 *               &lt;enumeration value="batteries_packed_with_equipment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LithiumBatteryVoltage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryWeight" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="LumenMaintenanceFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LuminousIntensity" type="{}LuminiousIntensityDimension" minOccurs="0"/>
 *         &lt;element name="Material" type="{}String" minOccurs="0"/>
 *         &lt;element name="MaximumCurrent" type="{}AmperageDimension" minOccurs="0"/>
 *         &lt;element name="MaximumSupportedWattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MercuryContent" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="NumberOfBlades" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfBulbSockets" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLights" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PlugType" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="PPUCount" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="PPUCountType" type="{}String" minOccurs="0"/>
 *         &lt;element name="ShadeColor" type="{}String" minOccurs="0"/>
 *         &lt;element name="ShadeDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ShadeMaterial" type="{}String" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SpecificUses" type="{}String" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="StyleName" type="{}String" minOccurs="0"/>
 *         &lt;element name="SwitchStyle" type="{}String" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{}VoltageIntegerDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="Volume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="WeightedAnnualEnergyConsumption" type="{}EnergyConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="FixtureType" type="{}String" minOccurs="0"/>
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
    "variationData",
    "airFlowCapacity",
    "baseDiameter",
    "battery",
    "bulbDiameter",
    "bulbLength",
    "bulbLifeSpan",
    "bulbPowerFactor",
    "bulbSpecialFeatures",
    "bulbSwitchingCycles",
    "bulbType",
    "bulbWattage",
    "capType",
    "certification",
    "collection",
    "color",
    "colorMap",
    "colorRenderingIndex",
    "colorTemperature",
    "countryOfOrigin",
    "displayDepth",
    "displayDiameter",
    "displayHeight",
    "displayLength",
    "displayWeight",
    "displayWidth",
    "energyEfficiencyRating",
    "fanBladeColor",
    "finishType",
    "incandescentEquivalentWattage",
    "includedComponent",
    "internationalProtectionRating",
    "itemDiameter",
    "lampStartupTime",
    "lampWarmupTime",
    "lightingMethod",
    "lightOutputLuminance",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "lumenMaintenanceFactor",
    "luminousIntensity",
    "material",
    "maximumCurrent",
    "maximumSupportedWattage",
    "mercuryContent",
    "numberOfBlades",
    "numberOfBulbSockets",
    "numberOfLights",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "plugType",
    "powerSource",
    "ppuCount",
    "ppuCountType",
    "shadeColor",
    "shadeDiameter",
    "shadeMaterial",
    "specialFeatures",
    "specificUses",
    "styleName",
    "switchStyle",
    "voltage",
    "volume",
    "wattage",
    "weightedAnnualEnergyConsumption",
    "fixtureType",
    "efficiency"
})
@XmlRootElement(name = "LightsAndFixtures")
public class LightsAndFixtures {

    @XmlElement(name = "VariationData")
    protected LightsAndFixtures.VariationData variationData;
    @XmlElement(name = "AirFlowCapacity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger airFlowCapacity;
    @XmlElement(name = "BaseDiameter")
    protected LengthDimension baseDiameter;
    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "BulbDiameter")
    protected LengthDimension bulbDiameter;
    @XmlElement(name = "BulbLength")
    protected LengthDimension bulbLength;
    @XmlElement(name = "BulbLifeSpan")
    protected TimeDimension bulbLifeSpan;
    @XmlElement(name = "BulbPowerFactor")
    protected BigDecimal bulbPowerFactor;
    @XmlElement(name = "BulbSpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> bulbSpecialFeatures;
    @XmlElement(name = "BulbSwitchingCycles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bulbSwitchingCycles;
    @XmlElement(name = "BulbType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bulbType;
    @XmlElement(name = "BulbWattage")
    protected BigDecimal bulbWattage;
    @XmlElement(name = "CapType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String capType;
    @XmlElement(name = "Certification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> certification;
    @XmlElement(name = "Collection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String collection;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String color;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "ColorRenderingIndex")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger colorRenderingIndex;
    @XmlElement(name = "ColorTemperature")
    protected TemperatureRatingDimension colorTemperature;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "DisplayDepth")
    protected LengthDimension displayDepth;
    @XmlElement(name = "DisplayDiameter")
    protected LengthDimension displayDiameter;
    @XmlElement(name = "DisplayHeight")
    protected LengthDimension displayHeight;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "DisplayWidth")
    protected LengthDimension displayWidth;
    @XmlElement(name = "EnergyEfficiencyRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String energyEfficiencyRating;
    @XmlElement(name = "FanBladeColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fanBladeColor;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "IncandescentEquivalentWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger incandescentEquivalentWattage;
    @XmlElement(name = "IncludedComponent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> includedComponent;
    @XmlElement(name = "InternationalProtectionRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String internationalProtectionRating;
    @XmlElement(name = "ItemDiameter")
    protected LengthDimension itemDiameter;
    @XmlElement(name = "LampStartupTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lampStartupTime;
    @XmlElement(name = "LampWarmupTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lampWarmupTime;
    @XmlElement(name = "LightingMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lightingMethod;
    @XmlElement(name = "LightOutputLuminance")
    protected LuminanceDimension lightOutputLuminance;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lithiumBatteryWeight;
    @XmlElement(name = "LumenMaintenanceFactor")
    protected BigDecimal lumenMaintenanceFactor;
    @XmlElement(name = "LuminousIntensity")
    protected LuminiousIntensityDimension luminousIntensity;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String material;
    @XmlElement(name = "MaximumCurrent")
    protected AmperageDimension maximumCurrent;
    @XmlElement(name = "MaximumSupportedWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumSupportedWattage;
    @XmlElement(name = "MercuryContent")
    protected WeightDimension mercuryContent;
    @XmlElement(name = "NumberOfBlades")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBlades;
    @XmlElement(name = "NumberOfBulbSockets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBulbSockets;
    @XmlElement(name = "NumberOfLights")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLights;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "PlugType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String plugType;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "PPUCount")
    protected BigDecimal ppuCount;
    @XmlElement(name = "PPUCountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ppuCountType;
    @XmlElement(name = "ShadeColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shadeColor;
    @XmlElement(name = "ShadeDiameter")
    protected LengthDimension shadeDiameter;
    @XmlElement(name = "ShadeMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shadeMaterial;
    @XmlElement(name = "SpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specialFeatures;
    @XmlElement(name = "SpecificUses")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specificUses;
    @XmlElement(name = "StyleName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String styleName;
    @XmlElement(name = "SwitchStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String switchStyle;
    @XmlElement(name = "Voltage")
    protected VoltageIntegerDimensionOptionalUnit voltage;
    @XmlElement(name = "Volume")
    protected VolumeDimension volume;
    @XmlElement(name = "Wattage")
    protected BigDecimal wattage;
    @XmlElement(name = "WeightedAnnualEnergyConsumption")
    protected EnergyConsumptionDimension weightedAnnualEnergyConsumption;
    @XmlElement(name = "FixtureType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fixtureType;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LightsAndFixtures.VariationData }
     *     
     */
    public LightsAndFixtures.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LightsAndFixtures.VariationData }
     *     
     */
    public void setVariationData(LightsAndFixtures.VariationData value) {
        this.variationData = value;
    }

    /**
     * 获取airFlowCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAirFlowCapacity() {
        return airFlowCapacity;
    }

    /**
     * 设置airFlowCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAirFlowCapacity(BigInteger value) {
        this.airFlowCapacity = value;
    }

    /**
     * 获取baseDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBaseDiameter() {
        return baseDiameter;
    }

    /**
     * 设置baseDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBaseDiameter(LengthDimension value) {
        this.baseDiameter = value;
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
     * 获取bulbDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBulbDiameter() {
        return bulbDiameter;
    }

    /**
     * 设置bulbDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBulbDiameter(LengthDimension value) {
        this.bulbDiameter = value;
    }

    /**
     * 获取bulbLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBulbLength() {
        return bulbLength;
    }

    /**
     * 设置bulbLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBulbLength(LengthDimension value) {
        this.bulbLength = value;
    }

    /**
     * 获取bulbLifeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getBulbLifeSpan() {
        return bulbLifeSpan;
    }

    /**
     * 设置bulbLifeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setBulbLifeSpan(TimeDimension value) {
        this.bulbLifeSpan = value;
    }

    /**
     * 获取bulbPowerFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBulbPowerFactor() {
        return bulbPowerFactor;
    }

    /**
     * 设置bulbPowerFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBulbPowerFactor(BigDecimal value) {
        this.bulbPowerFactor = value;
    }

    /**
     * Gets the value of the bulbSpecialFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulbSpecialFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulbSpecialFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBulbSpecialFeatures() {
        if (bulbSpecialFeatures == null) {
            bulbSpecialFeatures = new ArrayList<String>();
        }
        return this.bulbSpecialFeatures;
    }

    /**
     * 获取bulbSwitchingCycles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBulbSwitchingCycles() {
        return bulbSwitchingCycles;
    }

    /**
     * 设置bulbSwitchingCycles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBulbSwitchingCycles(BigInteger value) {
        this.bulbSwitchingCycles = value;
    }

    /**
     * 获取bulbType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulbType() {
        return bulbType;
    }

    /**
     * 设置bulbType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulbType(String value) {
        this.bulbType = value;
    }

    /**
     * 获取bulbWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBulbWattage() {
        return bulbWattage;
    }

    /**
     * 设置bulbWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBulbWattage(BigDecimal value) {
        this.bulbWattage = value;
    }

    /**
     * 获取capType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapType() {
        return capType;
    }

    /**
     * 设置capType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapType(String value) {
        this.capType = value;
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
     * 获取collection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollection() {
        return collection;
    }

    /**
     * 设置collection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollection(String value) {
        this.collection = value;
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
     * 获取colorRenderingIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColorRenderingIndex() {
        return colorRenderingIndex;
    }

    /**
     * 设置colorRenderingIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColorRenderingIndex(BigInteger value) {
        this.colorRenderingIndex = value;
    }

    /**
     * 获取colorTemperature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TemperatureRatingDimension }
     *     
     */
    public TemperatureRatingDimension getColorTemperature() {
        return colorTemperature;
    }

    /**
     * 设置colorTemperature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureRatingDimension }
     *     
     */
    public void setColorTemperature(TemperatureRatingDimension value) {
        this.colorTemperature = value;
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
     * 获取displayDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplayDepth() {
        return displayDepth;
    }

    /**
     * 设置displayDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplayDepth(LengthDimension value) {
        this.displayDepth = value;
    }

    /**
     * 获取displayDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplayDiameter() {
        return displayDiameter;
    }

    /**
     * 设置displayDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplayDiameter(LengthDimension value) {
        this.displayDiameter = value;
    }

    /**
     * 获取displayHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplayHeight() {
        return displayHeight;
    }

    /**
     * 设置displayHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplayHeight(LengthDimension value) {
        this.displayHeight = value;
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
     * 获取displayWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplayWidth() {
        return displayWidth;
    }

    /**
     * 设置displayWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplayWidth(LengthDimension value) {
        this.displayWidth = value;
    }

    /**
     * 获取energyEfficiencyRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyEfficiencyRating() {
        return energyEfficiencyRating;
    }

    /**
     * 设置energyEfficiencyRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyEfficiencyRating(String value) {
        this.energyEfficiencyRating = value;
    }

    /**
     * 获取fanBladeColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFanBladeColor() {
        return fanBladeColor;
    }

    /**
     * 设置fanBladeColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFanBladeColor(String value) {
        this.fanBladeColor = value;
    }

    /**
     * 获取finishType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishType() {
        return finishType;
    }

    /**
     * 设置finishType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishType(String value) {
        this.finishType = value;
    }

    /**
     * 获取incandescentEquivalentWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncandescentEquivalentWattage() {
        return incandescentEquivalentWattage;
    }

    /**
     * 设置incandescentEquivalentWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncandescentEquivalentWattage(BigInteger value) {
        this.incandescentEquivalentWattage = value;
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
     * 获取internationalProtectionRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalProtectionRating() {
        return internationalProtectionRating;
    }

    /**
     * 设置internationalProtectionRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalProtectionRating(String value) {
        this.internationalProtectionRating = value;
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
     * 获取lampStartupTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLampStartupTime() {
        return lampStartupTime;
    }

    /**
     * 设置lampStartupTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLampStartupTime(String value) {
        this.lampStartupTime = value;
    }

    /**
     * 获取lampWarmupTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLampWarmupTime() {
        return lampWarmupTime;
    }

    /**
     * 设置lampWarmupTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLampWarmupTime(String value) {
        this.lampWarmupTime = value;
    }

    /**
     * 获取lightingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightingMethod() {
        return lightingMethod;
    }

    /**
     * 设置lightingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightingMethod(String value) {
        this.lightingMethod = value;
    }

    /**
     * 获取lightOutputLuminance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LuminanceDimension }
     *     
     */
    public LuminanceDimension getLightOutputLuminance() {
        return lightOutputLuminance;
    }

    /**
     * 设置lightOutputLuminance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LuminanceDimension }
     *     
     */
    public void setLightOutputLuminance(LuminanceDimension value) {
        this.lightOutputLuminance = value;
    }

    /**
     * 获取lithiumBatteryEnergyContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLithiumBatteryEnergyContent() {
        return lithiumBatteryEnergyContent;
    }

    /**
     * 设置lithiumBatteryEnergyContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLithiumBatteryEnergyContent(BigInteger value) {
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLithiumBatteryVoltage() {
        return lithiumBatteryVoltage;
    }

    /**
     * 设置lithiumBatteryVoltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLithiumBatteryVoltage(BigInteger value) {
        this.lithiumBatteryVoltage = value;
    }

    /**
     * 获取lithiumBatteryWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLithiumBatteryWeight() {
        return lithiumBatteryWeight;
    }

    /**
     * 设置lithiumBatteryWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLithiumBatteryWeight(BigInteger value) {
        this.lithiumBatteryWeight = value;
    }

    /**
     * 获取lumenMaintenanceFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLumenMaintenanceFactor() {
        return lumenMaintenanceFactor;
    }

    /**
     * 设置lumenMaintenanceFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLumenMaintenanceFactor(BigDecimal value) {
        this.lumenMaintenanceFactor = value;
    }

    /**
     * 获取luminousIntensity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LuminiousIntensityDimension }
     *     
     */
    public LuminiousIntensityDimension getLuminousIntensity() {
        return luminousIntensity;
    }

    /**
     * 设置luminousIntensity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LuminiousIntensityDimension }
     *     
     */
    public void setLuminousIntensity(LuminiousIntensityDimension value) {
        this.luminousIntensity = value;
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
     * 获取maximumCurrent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmperageDimension }
     *     
     */
    public AmperageDimension getMaximumCurrent() {
        return maximumCurrent;
    }

    /**
     * 设置maximumCurrent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmperageDimension }
     *     
     */
    public void setMaximumCurrent(AmperageDimension value) {
        this.maximumCurrent = value;
    }

    /**
     * 获取maximumSupportedWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumSupportedWattage() {
        return maximumSupportedWattage;
    }

    /**
     * 设置maximumSupportedWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumSupportedWattage(BigInteger value) {
        this.maximumSupportedWattage = value;
    }

    /**
     * 获取mercuryContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMercuryContent() {
        return mercuryContent;
    }

    /**
     * 设置mercuryContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMercuryContent(WeightDimension value) {
        this.mercuryContent = value;
    }

    /**
     * 获取numberOfBlades属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBlades() {
        return numberOfBlades;
    }

    /**
     * 设置numberOfBlades属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBlades(BigInteger value) {
        this.numberOfBlades = value;
    }

    /**
     * 获取numberOfBulbSockets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBulbSockets() {
        return numberOfBulbSockets;
    }

    /**
     * 设置numberOfBulbSockets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBulbSockets(BigInteger value) {
        this.numberOfBulbSockets = value;
    }

    /**
     * 获取numberOfLights属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLights() {
        return numberOfLights;
    }

    /**
     * 设置numberOfLights属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLights(BigInteger value) {
        this.numberOfLights = value;
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
     * 获取plugType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlugType() {
        return plugType;
    }

    /**
     * 设置plugType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlugType(String value) {
        this.plugType = value;
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
     * 获取ppuCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPPUCount() {
        return ppuCount;
    }

    /**
     * 设置ppuCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPPUCount(BigDecimal value) {
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
     * 获取shadeColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadeColor() {
        return shadeColor;
    }

    /**
     * 设置shadeColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadeColor(String value) {
        this.shadeColor = value;
    }

    /**
     * 获取shadeDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getShadeDiameter() {
        return shadeDiameter;
    }

    /**
     * 设置shadeDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setShadeDiameter(LengthDimension value) {
        this.shadeDiameter = value;
    }

    /**
     * 获取shadeMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadeMaterial() {
        return shadeMaterial;
    }

    /**
     * 设置shadeMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadeMaterial(String value) {
        this.shadeMaterial = value;
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
     * Gets the value of the specificUses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificUses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificUses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecificUses() {
        if (specificUses == null) {
            specificUses = new ArrayList<String>();
        }
        return this.specificUses;
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
     * 获取switchStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchStyle() {
        return switchStyle;
    }

    /**
     * 设置switchStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchStyle(String value) {
        this.switchStyle = value;
    }

    /**
     * 获取voltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VoltageIntegerDimensionOptionalUnit }
     *     
     */
    public VoltageIntegerDimensionOptionalUnit getVoltage() {
        return voltage;
    }

    /**
     * 设置voltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageIntegerDimensionOptionalUnit }
     *     
     */
    public void setVoltage(VoltageIntegerDimensionOptionalUnit value) {
        this.voltage = value;
    }

    /**
     * 获取volume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getVolume() {
        return volume;
    }

    /**
     * 设置volume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setVolume(VolumeDimension value) {
        this.volume = value;
    }

    /**
     * 获取wattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWattage() {
        return wattage;
    }

    /**
     * 设置wattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWattage(BigDecimal value) {
        this.wattage = value;
    }

    /**
     * 获取weightedAnnualEnergyConsumption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public EnergyConsumptionDimension getWeightedAnnualEnergyConsumption() {
        return weightedAnnualEnergyConsumption;
    }

    /**
     * 设置weightedAnnualEnergyConsumption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public void setWeightedAnnualEnergyConsumption(EnergyConsumptionDimension value) {
        this.weightedAnnualEnergyConsumption = value;
    }

    /**
     * 获取fixtureType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixtureType() {
        return fixtureType;
    }

    /**
     * 设置fixtureType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixtureType(String value) {
        this.fixtureType = value;
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
     *         &lt;element name="Parentage">
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
        "parentage",
        "variationTheme"
    })
    public static class VariationData {

        @XmlElement(name = "Parentage", required = true)
        protected String parentage;
        @XmlElement(name = "VariationTheme")
        protected String variationTheme;

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

    }

}
