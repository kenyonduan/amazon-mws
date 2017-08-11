
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
 *                         &lt;enumeration value="Wattage"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element name="BeamAngle" type="{}DegreeDimension" minOccurs="0"/>
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
 *         &lt;element name="IncandescentEquivalentWattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ItemShape" type="{}String" minOccurs="0"/>
 *         &lt;element name="LampStartupTime" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="LampWarmupTime" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="LightOutputLuminance" type="{}LuminanceDimension" minOccurs="0"/>
 *         &lt;element name="LumenMaintenanceFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LuminousIntensity" type="{}LuminiousIntensityDimension" minOccurs="0"/>
 *         &lt;element name="MercuryContent" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="PPUCount" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="PPUCountType" type="{}String" minOccurs="0"/>
 *         &lt;element name="SpecificUses" type="{}String" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{}VoltageIntegerDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="Volume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="WeightedAnnualEnergyConsumption" type="{}EnergyConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="StyleName" type="{}String" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="IncludedComponent" type="{}String" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="LightingMethod" type="{}String" minOccurs="0"/>
 *         &lt;element name="ShadeDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ShadeMaterial" type="{}String" minOccurs="0"/>
 *         &lt;element name="Material" type="{}String" minOccurs="0"/>
 *         &lt;element name="FinishType" type="{}String" minOccurs="0"/>
 *         &lt;element name="InternationalProtectionRating" type="{}String" minOccurs="0"/>
 *         &lt;element name="NumberOfLightSources" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfBlades" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BladeColor" type="{}String" minOccurs="0"/>
 *         &lt;element name="MaximumCompatibleLightSourceWattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PowerFactor" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="MechanicalLifeExpectancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="CircuitType" type="{}String" minOccurs="0"/>
 *         &lt;element name="CircuitBreakerType" type="{}String" minOccurs="0"/>
 *         &lt;element name="MountingType" type="{}String" minOccurs="0"/>
 *         &lt;element name="MaximumCurrent" type="{}AmperageDimension" minOccurs="0"/>
 *         &lt;element name="Strands" type="{}String" minOccurs="0"/>
 *         &lt;element name="StrandDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="LightSourceDiameter" type="{}LengthDimension" minOccurs="0"/>
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
    "battery",
    "beamAngle",
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
    "incandescentEquivalentWattage",
    "itemShape",
    "lampStartupTime",
    "lampWarmupTime",
    "lightOutputLuminance",
    "lumenMaintenanceFactor",
    "luminousIntensity",
    "mercuryContent",
    "ppuCount",
    "ppuCountType",
    "specificUses",
    "voltage",
    "volume",
    "wattage",
    "weightedAnnualEnergyConsumption",
    "styleName",
    "specialFeatures",
    "includedComponent",
    "lightingMethod",
    "shadeDiameter",
    "shadeMaterial",
    "material",
    "finishType",
    "internationalProtectionRating",
    "numberOfLightSources",
    "numberOfBlades",
    "bladeColor",
    "maximumCompatibleLightSourceWattage",
    "powerFactor",
    "mechanicalLifeExpectancy",
    "circuitType",
    "circuitBreakerType",
    "mountingType",
    "maximumCurrent",
    "strands",
    "strandDiameter",
    "lightSourceDiameter",
    "efficiency"
})
@XmlRootElement(name = "LightBulbs")
public class LightBulbs {

    @XmlElement(name = "VariationData")
    protected LightBulbs.VariationData variationData;
    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "BeamAngle")
    protected DegreeDimension beamAngle;
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
    @XmlElement(name = "IncandescentEquivalentWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger incandescentEquivalentWattage;
    @XmlElement(name = "ItemShape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemShape;
    @XmlElement(name = "LampStartupTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lampStartupTime;
    @XmlElement(name = "LampWarmupTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lampWarmupTime;
    @XmlElement(name = "LightOutputLuminance")
    protected LuminanceDimension lightOutputLuminance;
    @XmlElement(name = "LumenMaintenanceFactor")
    protected BigDecimal lumenMaintenanceFactor;
    @XmlElement(name = "LuminousIntensity")
    protected LuminiousIntensityDimension luminousIntensity;
    @XmlElement(name = "MercuryContent")
    protected WeightDimension mercuryContent;
    @XmlElement(name = "PPUCount")
    protected BigDecimal ppuCount;
    @XmlElement(name = "PPUCountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ppuCountType;
    @XmlElement(name = "SpecificUses")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specificUses;
    @XmlElement(name = "Voltage")
    protected VoltageIntegerDimensionOptionalUnit voltage;
    @XmlElement(name = "Volume")
    protected VolumeDimension volume;
    @XmlElement(name = "Wattage")
    protected BigDecimal wattage;
    @XmlElement(name = "WeightedAnnualEnergyConsumption")
    protected EnergyConsumptionDimension weightedAnnualEnergyConsumption;
    @XmlElement(name = "StyleName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String styleName;
    @XmlElement(name = "SpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specialFeatures;
    @XmlElement(name = "IncludedComponent")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> includedComponent;
    @XmlElement(name = "LightingMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lightingMethod;
    @XmlElement(name = "ShadeDiameter")
    protected LengthDimension shadeDiameter;
    @XmlElement(name = "ShadeMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shadeMaterial;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String material;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "InternationalProtectionRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String internationalProtectionRating;
    @XmlElement(name = "NumberOfLightSources")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLightSources;
    @XmlElement(name = "NumberOfBlades")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBlades;
    @XmlElement(name = "BladeColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeColor;
    @XmlElement(name = "MaximumCompatibleLightSourceWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumCompatibleLightSourceWattage;
    @XmlElement(name = "PowerFactor")
    protected BigDecimal powerFactor;
    @XmlElement(name = "MechanicalLifeExpectancy")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mechanicalLifeExpectancy;
    @XmlElement(name = "CircuitType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String circuitType;
    @XmlElement(name = "CircuitBreakerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String circuitBreakerType;
    @XmlElement(name = "MountingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountingType;
    @XmlElement(name = "MaximumCurrent")
    protected AmperageDimension maximumCurrent;
    @XmlElement(name = "Strands")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String strands;
    @XmlElement(name = "StrandDiameter")
    protected LengthDimension strandDiameter;
    @XmlElement(name = "LightSourceDiameter")
    protected LengthDimension lightSourceDiameter;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LightBulbs.VariationData }
     *     
     */
    public LightBulbs.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LightBulbs.VariationData }
     *     
     */
    public void setVariationData(LightBulbs.VariationData value) {
        this.variationData = value;
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
     * 获取beamAngle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DegreeDimension }
     *     
     */
    public DegreeDimension getBeamAngle() {
        return beamAngle;
    }

    /**
     * 设置beamAngle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeDimension }
     *     
     */
    public void setBeamAngle(DegreeDimension value) {
        this.beamAngle = value;
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
     * 获取itemShape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemShape() {
        return itemShape;
    }

    /**
     * 设置itemShape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemShape(String value) {
        this.itemShape = value;
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
     * 获取numberOfLightSources属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLightSources() {
        return numberOfLightSources;
    }

    /**
     * 设置numberOfLightSources属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLightSources(BigInteger value) {
        this.numberOfLightSources = value;
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
     * 获取bladeColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBladeColor() {
        return bladeColor;
    }

    /**
     * 设置bladeColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBladeColor(String value) {
        this.bladeColor = value;
    }

    /**
     * 获取maximumCompatibleLightSourceWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumCompatibleLightSourceWattage() {
        return maximumCompatibleLightSourceWattage;
    }

    /**
     * 设置maximumCompatibleLightSourceWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumCompatibleLightSourceWattage(BigInteger value) {
        this.maximumCompatibleLightSourceWattage = value;
    }

    /**
     * 获取powerFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPowerFactor() {
        return powerFactor;
    }

    /**
     * 设置powerFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPowerFactor(BigDecimal value) {
        this.powerFactor = value;
    }

    /**
     * 获取mechanicalLifeExpectancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMechanicalLifeExpectancy() {
        return mechanicalLifeExpectancy;
    }

    /**
     * 设置mechanicalLifeExpectancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMechanicalLifeExpectancy(BigInteger value) {
        this.mechanicalLifeExpectancy = value;
    }

    /**
     * 获取circuitType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitType() {
        return circuitType;
    }

    /**
     * 设置circuitType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitType(String value) {
        this.circuitType = value;
    }

    /**
     * 获取circuitBreakerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircuitBreakerType() {
        return circuitBreakerType;
    }

    /**
     * 设置circuitBreakerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircuitBreakerType(String value) {
        this.circuitBreakerType = value;
    }

    /**
     * 获取mountingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountingType() {
        return mountingType;
    }

    /**
     * 设置mountingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountingType(String value) {
        this.mountingType = value;
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
     * 获取strands属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrands() {
        return strands;
    }

    /**
     * 设置strands属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrands(String value) {
        this.strands = value;
    }

    /**
     * 获取strandDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getStrandDiameter() {
        return strandDiameter;
    }

    /**
     * 设置strandDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setStrandDiameter(LengthDimension value) {
        this.strandDiameter = value;
    }

    /**
     * 获取lightSourceDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getLightSourceDiameter() {
        return lightSourceDiameter;
    }

    /**
     * 设置lightSourceDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setLightSourceDiameter(LengthDimension value) {
        this.lightSourceDiameter = value;
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
     *               &lt;enumeration value="Wattage"/>
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
