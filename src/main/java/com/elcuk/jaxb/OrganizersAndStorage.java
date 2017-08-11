
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
 *                         &lt;enumeration value="Size"/>
 *                         &lt;enumeration value="Color"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="Style"/>
 *                         &lt;enumeration value="PATTERN"/>
 *                         &lt;enumeration value="Material"/>
 *                         &lt;enumeration value="ItemWeight"/>
 *                         &lt;enumeration value="ItemPackageQuantity"/>
 *                         &lt;enumeration value="CustomerPackageType"/>
 *                         &lt;enumeration value="ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="StyleName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccessoryConnectionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BatteryCapacity" type="{}BatteryPowerDimension" minOccurs="0"/>
 *         &lt;element name="BladeEdge" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BladeLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Brightness" type="{}LumensType" minOccurs="0"/>
 *         &lt;element name="BulbType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CenterLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CompatibleDevices" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CompatibleFastenerRange" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CoolingMethod" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CoolingWattage" type="{}WattageDimension" minOccurs="0"/>
 *         &lt;element name="CornerRadius" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CutType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CuttingWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="EnergyConsumption" type="{}EnergyConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="EnergyEfficiencyRatioCooling" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="EnvironmentalDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="EuEnergyEfficiencyClassHeating" type="{}EuEnergyEfficiencyClassType" minOccurs="0"/>
 *         &lt;element name="EuEnergyLabelEfficiencyClass" type="{}EuEnergyEfficiencyClassType" minOccurs="0"/>
 *         &lt;element name="ExternalTestingCertification" type="{}StringNotNull" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="FlushType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FoldedKnifeSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GritRating" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="HandleMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HeadStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HeaterWattage" type="{}WattageDimension" minOccurs="0"/>
 *         &lt;element name="InsideDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="LaserBeamColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumPower" type="{}MaximumPowerType" minOccurs="0"/>
 *         &lt;element name="MeasurementAccuracy" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MeasurementSystem" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfBasins" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfHoles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="OutsideDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="PerformanceDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PlugFormat" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="PlugProfile" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RecycledContentPercentage" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="RoughIn" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Speed" type="{}SpeedDimension" minOccurs="0"/>
 *         &lt;element name="SpoutHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SpoutReach" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SwitchStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SwitchType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ThreadSize" type="{}LengthDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="ToolTipDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Torque" type="{}TorqueType" minOccurs="0"/>
 *         &lt;element name="UVProtection" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ViewingArea" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ManufacturerWarrantyDescription" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MinimumEfficiencyReportingValue" type="{}MERVType" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Voltage" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}WattageDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BaseDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BeamAngle" type="{}DegreeDimension" minOccurs="0"/>
 *         &lt;element name="BladeColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CircuitBreakerType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Efficiency" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="InternationalProtectionRating" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LightSourceOperatingLife" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="LightingMethod" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumCompatibleLightSourceWattage" type="{}WattageDimension" minOccurs="0"/>
 *         &lt;element name="NumberOfBlades" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLightSources" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="ShadeDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ShadeMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ShortProductDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StartUpTimeDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Strands" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TubingOutsideDiameter" type="{}LengthDimension" minOccurs="0"/>
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
    "accessoryConnectionType",
    "batteryCapacity",
    "bladeEdge",
    "bladeLength",
    "brightness",
    "bulbType",
    "centerLength",
    "compatibleDevices",
    "compatibleFastenerRange",
    "coolingMethod",
    "coolingWattage",
    "cornerRadius",
    "coverage",
    "cutType",
    "cuttingWidth",
    "deviceType",
    "displayStyle",
    "energyConsumption",
    "energyEfficiencyRatioCooling",
    "environmentalDescription",
    "euEnergyEfficiencyClassHeating",
    "euEnergyLabelEfficiencyClass",
    "externalTestingCertification",
    "flushType",
    "foldedKnifeSize",
    "gritRating",
    "handleMaterial",
    "headStyle",
    "heaterWattage",
    "insideDiameter",
    "laserBeamColor",
    "maximumPower",
    "measurementAccuracy",
    "measurementSystem",
    "numberOfBasins",
    "numberOfHoles",
    "numberOfItems",
    "outsideDiameter",
    "performanceDescription",
    "plugFormat",
    "plugProfile",
    "recycledContentPercentage",
    "roughIn",
    "speed",
    "spoutHeight",
    "spoutReach",
    "switchStyle",
    "switchType",
    "threadSize",
    "toolTipDescription",
    "torque",
    "uvProtection",
    "viewingArea",
    "size",
    "color",
    "colorMap",
    "material",
    "displayVolume",
    "displayWeight",
    "displayLength",
    "manufacturerWarrantyDescription",
    "minimumEfficiencyReportingValue",
    "powerSource",
    "sellerWarrantyDescription",
    "voltage",
    "wattage",
    "customerPackageType",
    "baseDiameter",
    "beamAngle",
    "bladeColor",
    "circuitBreakerType",
    "efficiency",
    "internationalProtectionRating",
    "lightSourceOperatingLife",
    "lightingMethod",
    "maximumCompatibleLightSourceWattage",
    "numberOfBlades",
    "numberOfLightSources",
    "shadeDiameter",
    "shadeMaterialType",
    "shortProductDescription",
    "startUpTimeDescription",
    "strands",
    "tubingOutsideDiameter"
})
@XmlRootElement(name = "OrganizersAndStorage")
public class OrganizersAndStorage {

    @XmlElement(name = "VariationData")
    protected OrganizersAndStorage.VariationData variationData;
    @XmlElement(name = "AccessoryConnectionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accessoryConnectionType;
    @XmlElement(name = "BatteryCapacity")
    protected BatteryPowerDimension batteryCapacity;
    @XmlElement(name = "BladeEdge")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeEdge;
    @XmlElement(name = "BladeLength")
    protected LengthDimension bladeLength;
    @XmlElement(name = "Brightness")
    protected LumensType brightness;
    @XmlElement(name = "BulbType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bulbType;
    @XmlElement(name = "CenterLength")
    protected LengthDimension centerLength;
    @XmlElement(name = "CompatibleDevices")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String compatibleDevices;
    @XmlElement(name = "CompatibleFastenerRange")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String compatibleFastenerRange;
    @XmlElement(name = "CoolingMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coolingMethod;
    @XmlElement(name = "CoolingWattage")
    protected WattageDimension coolingWattage;
    @XmlElement(name = "CornerRadius")
    protected LengthDimension cornerRadius;
    @XmlElement(name = "Coverage")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coverage;
    @XmlElement(name = "CutType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cutType;
    @XmlElement(name = "CuttingWidth")
    protected LengthDimension cuttingWidth;
    @XmlElement(name = "DeviceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String deviceType;
    @XmlElement(name = "DisplayStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayStyle;
    @XmlElement(name = "EnergyConsumption")
    protected EnergyConsumptionDimension energyConsumption;
    @XmlElement(name = "EnergyEfficiencyRatioCooling")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger energyEfficiencyRatioCooling;
    @XmlElement(name = "EnvironmentalDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String environmentalDescription;
    @XmlElement(name = "EuEnergyEfficiencyClassHeating")
    @XmlSchemaType(name = "string")
    protected EuEnergyEfficiencyClassType euEnergyEfficiencyClassHeating;
    @XmlElement(name = "EuEnergyLabelEfficiencyClass")
    @XmlSchemaType(name = "string")
    protected EuEnergyEfficiencyClassType euEnergyLabelEfficiencyClass;
    @XmlElement(name = "ExternalTestingCertification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> externalTestingCertification;
    @XmlElement(name = "FlushType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String flushType;
    @XmlElement(name = "FoldedKnifeSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String foldedKnifeSize;
    @XmlElement(name = "GritRating")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gritRating;
    @XmlElement(name = "HandleMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String handleMaterial;
    @XmlElement(name = "HeadStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String headStyle;
    @XmlElement(name = "HeaterWattage")
    protected WattageDimension heaterWattage;
    @XmlElement(name = "InsideDiameter")
    protected LengthDimension insideDiameter;
    @XmlElement(name = "LaserBeamColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String laserBeamColor;
    @XmlElement(name = "MaximumPower")
    protected MaximumPowerType maximumPower;
    @XmlElement(name = "MeasurementAccuracy")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String measurementAccuracy;
    @XmlElement(name = "MeasurementSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String measurementSystem;
    @XmlElement(name = "NumberOfBasins")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBasins;
    @XmlElement(name = "NumberOfHoles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHoles;
    @XmlElement(name = "NumberOfItems")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItems;
    @XmlElement(name = "OutsideDiameter")
    protected LengthDimension outsideDiameter;
    @XmlElement(name = "PerformanceDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String performanceDescription;
    @XmlElement(name = "PlugFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String plugFormat;
    @XmlElement(name = "PlugProfile")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String plugProfile;
    @XmlElement(name = "RecycledContentPercentage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger recycledContentPercentage;
    @XmlElement(name = "RoughIn")
    protected LengthDimension roughIn;
    @XmlElement(name = "Speed")
    protected SpeedDimension speed;
    @XmlElement(name = "SpoutHeight")
    protected LengthDimension spoutHeight;
    @XmlElement(name = "SpoutReach")
    protected LengthDimension spoutReach;
    @XmlElement(name = "SwitchStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String switchStyle;
    @XmlElement(name = "SwitchType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String switchType;
    @XmlElement(name = "ThreadSize")
    protected LengthDimensionOptionalUnit threadSize;
    @XmlElement(name = "ToolTipDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String toolTipDescription;
    @XmlElement(name = "Torque")
    protected TorqueType torque;
    @XmlElement(name = "UVProtection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uvProtection;
    @XmlElement(name = "ViewingArea")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String viewingArea;
    @XmlElement(name = "Size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String size;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String color;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String material;
    @XmlElement(name = "DisplayVolume")
    protected VolumeDimension displayVolume;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "ManufacturerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String manufacturerWarrantyDescription;
    @XmlElement(name = "MinimumEfficiencyReportingValue")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer minimumEfficiencyReportingValue;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sellerWarrantyDescription;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    protected WattageDimensionOptionalUnit wattage;
    @XmlElement(name = "CustomerPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String customerPackageType;
    @XmlElement(name = "BaseDiameter")
    protected LengthDimension baseDiameter;
    @XmlElement(name = "BeamAngle")
    protected DegreeDimension beamAngle;
    @XmlElement(name = "BladeColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeColor;
    @XmlElement(name = "CircuitBreakerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String circuitBreakerType;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;
    @XmlElement(name = "InternationalProtectionRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String internationalProtectionRating;
    @XmlElement(name = "LightSourceOperatingLife")
    protected TimeDimension lightSourceOperatingLife;
    @XmlElement(name = "LightingMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lightingMethod;
    @XmlElement(name = "MaximumCompatibleLightSourceWattage")
    protected WattageDimension maximumCompatibleLightSourceWattage;
    @XmlElement(name = "NumberOfBlades")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBlades;
    @XmlElement(name = "NumberOfLightSources")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLightSources;
    @XmlElement(name = "ShadeDiameter")
    protected LengthDimension shadeDiameter;
    @XmlElement(name = "ShadeMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shadeMaterialType;
    @XmlElement(name = "ShortProductDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shortProductDescription;
    @XmlElement(name = "StartUpTimeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String startUpTimeDescription;
    @XmlElement(name = "Strands")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String strands;
    @XmlElement(name = "TubingOutsideDiameter")
    protected LengthDimension tubingOutsideDiameter;

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrganizersAndStorage.VariationData }
     *     
     */
    public OrganizersAndStorage.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizersAndStorage.VariationData }
     *     
     */
    public void setVariationData(OrganizersAndStorage.VariationData value) {
        this.variationData = value;
    }

    /**
     * 获取accessoryConnectionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessoryConnectionType() {
        return accessoryConnectionType;
    }

    /**
     * 设置accessoryConnectionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessoryConnectionType(String value) {
        this.accessoryConnectionType = value;
    }

    /**
     * 获取batteryCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryPowerDimension }
     *     
     */
    public BatteryPowerDimension getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * 设置batteryCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryPowerDimension }
     *     
     */
    public void setBatteryCapacity(BatteryPowerDimension value) {
        this.batteryCapacity = value;
    }

    /**
     * 获取bladeEdge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBladeEdge() {
        return bladeEdge;
    }

    /**
     * 设置bladeEdge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBladeEdge(String value) {
        this.bladeEdge = value;
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
     * 获取brightness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LumensType }
     *     
     */
    public LumensType getBrightness() {
        return brightness;
    }

    /**
     * 设置brightness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LumensType }
     *     
     */
    public void setBrightness(LumensType value) {
        this.brightness = value;
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
     * 获取centerLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCenterLength() {
        return centerLength;
    }

    /**
     * 设置centerLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCenterLength(LengthDimension value) {
        this.centerLength = value;
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
     * 获取compatibleFastenerRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleFastenerRange() {
        return compatibleFastenerRange;
    }

    /**
     * 设置compatibleFastenerRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleFastenerRange(String value) {
        this.compatibleFastenerRange = value;
    }

    /**
     * 获取coolingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoolingMethod() {
        return coolingMethod;
    }

    /**
     * 设置coolingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoolingMethod(String value) {
        this.coolingMethod = value;
    }

    /**
     * 获取coolingWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getCoolingWattage() {
        return coolingWattage;
    }

    /**
     * 设置coolingWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setCoolingWattage(WattageDimension value) {
        this.coolingWattage = value;
    }

    /**
     * 获取cornerRadius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCornerRadius() {
        return cornerRadius;
    }

    /**
     * 设置cornerRadius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCornerRadius(LengthDimension value) {
        this.cornerRadius = value;
    }

    /**
     * 获取coverage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * 设置coverage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
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
     * 获取deviceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设置deviceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * 获取displayStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayStyle() {
        return displayStyle;
    }

    /**
     * 设置displayStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayStyle(String value) {
        this.displayStyle = value;
    }

    /**
     * 获取energyConsumption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public EnergyConsumptionDimension getEnergyConsumption() {
        return energyConsumption;
    }

    /**
     * 设置energyConsumption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public void setEnergyConsumption(EnergyConsumptionDimension value) {
        this.energyConsumption = value;
    }

    /**
     * 获取energyEfficiencyRatioCooling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnergyEfficiencyRatioCooling() {
        return energyEfficiencyRatioCooling;
    }

    /**
     * 设置energyEfficiencyRatioCooling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnergyEfficiencyRatioCooling(BigInteger value) {
        this.energyEfficiencyRatioCooling = value;
    }

    /**
     * 获取environmentalDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentalDescription() {
        return environmentalDescription;
    }

    /**
     * 设置environmentalDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentalDescription(String value) {
        this.environmentalDescription = value;
    }

    /**
     * 获取euEnergyEfficiencyClassHeating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EuEnergyEfficiencyClassType }
     *     
     */
    public EuEnergyEfficiencyClassType getEuEnergyEfficiencyClassHeating() {
        return euEnergyEfficiencyClassHeating;
    }

    /**
     * 设置euEnergyEfficiencyClassHeating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EuEnergyEfficiencyClassType }
     *     
     */
    public void setEuEnergyEfficiencyClassHeating(EuEnergyEfficiencyClassType value) {
        this.euEnergyEfficiencyClassHeating = value;
    }

    /**
     * 获取euEnergyLabelEfficiencyClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EuEnergyEfficiencyClassType }
     *     
     */
    public EuEnergyEfficiencyClassType getEuEnergyLabelEfficiencyClass() {
        return euEnergyLabelEfficiencyClass;
    }

    /**
     * 设置euEnergyLabelEfficiencyClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EuEnergyEfficiencyClassType }
     *     
     */
    public void setEuEnergyLabelEfficiencyClass(EuEnergyEfficiencyClassType value) {
        this.euEnergyLabelEfficiencyClass = value;
    }

    /**
     * Gets the value of the externalTestingCertification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalTestingCertification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalTestingCertification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExternalTestingCertification() {
        if (externalTestingCertification == null) {
            externalTestingCertification = new ArrayList<String>();
        }
        return this.externalTestingCertification;
    }

    /**
     * 获取flushType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlushType() {
        return flushType;
    }

    /**
     * 设置flushType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlushType(String value) {
        this.flushType = value;
    }

    /**
     * 获取foldedKnifeSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldedKnifeSize() {
        return foldedKnifeSize;
    }

    /**
     * 设置foldedKnifeSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldedKnifeSize(String value) {
        this.foldedKnifeSize = value;
    }

    /**
     * 获取gritRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGritRating() {
        return gritRating;
    }

    /**
     * 设置gritRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGritRating(BigInteger value) {
        this.gritRating = value;
    }

    /**
     * 获取handleMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleMaterial() {
        return handleMaterial;
    }

    /**
     * 设置handleMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleMaterial(String value) {
        this.handleMaterial = value;
    }

    /**
     * 获取headStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadStyle() {
        return headStyle;
    }

    /**
     * 设置headStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadStyle(String value) {
        this.headStyle = value;
    }

    /**
     * 获取heaterWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getHeaterWattage() {
        return heaterWattage;
    }

    /**
     * 设置heaterWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setHeaterWattage(WattageDimension value) {
        this.heaterWattage = value;
    }

    /**
     * 获取insideDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getInsideDiameter() {
        return insideDiameter;
    }

    /**
     * 设置insideDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setInsideDiameter(LengthDimension value) {
        this.insideDiameter = value;
    }

    /**
     * 获取laserBeamColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaserBeamColor() {
        return laserBeamColor;
    }

    /**
     * 设置laserBeamColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaserBeamColor(String value) {
        this.laserBeamColor = value;
    }

    /**
     * 获取maximumPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MaximumPowerType }
     *     
     */
    public MaximumPowerType getMaximumPower() {
        return maximumPower;
    }

    /**
     * 设置maximumPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumPowerType }
     *     
     */
    public void setMaximumPower(MaximumPowerType value) {
        this.maximumPower = value;
    }

    /**
     * 获取measurementAccuracy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementAccuracy() {
        return measurementAccuracy;
    }

    /**
     * 设置measurementAccuracy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementAccuracy(String value) {
        this.measurementAccuracy = value;
    }

    /**
     * 获取measurementSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * 设置measurementSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSystem(String value) {
        this.measurementSystem = value;
    }

    /**
     * 获取numberOfBasins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBasins() {
        return numberOfBasins;
    }

    /**
     * 设置numberOfBasins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBasins(BigInteger value) {
        this.numberOfBasins = value;
    }

    /**
     * 获取numberOfHoles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHoles() {
        return numberOfHoles;
    }

    /**
     * 设置numberOfHoles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHoles(BigInteger value) {
        this.numberOfHoles = value;
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
     * 获取outsideDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getOutsideDiameter() {
        return outsideDiameter;
    }

    /**
     * 设置outsideDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setOutsideDiameter(LengthDimension value) {
        this.outsideDiameter = value;
    }

    /**
     * 获取performanceDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceDescription() {
        return performanceDescription;
    }

    /**
     * 设置performanceDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceDescription(String value) {
        this.performanceDescription = value;
    }

    /**
     * 获取plugFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlugFormat() {
        return plugFormat;
    }

    /**
     * 设置plugFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlugFormat(String value) {
        this.plugFormat = value;
    }

    /**
     * 获取plugProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlugProfile() {
        return plugProfile;
    }

    /**
     * 设置plugProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlugProfile(String value) {
        this.plugProfile = value;
    }

    /**
     * 获取recycledContentPercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecycledContentPercentage() {
        return recycledContentPercentage;
    }

    /**
     * 设置recycledContentPercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecycledContentPercentage(BigInteger value) {
        this.recycledContentPercentage = value;
    }

    /**
     * 获取roughIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getRoughIn() {
        return roughIn;
    }

    /**
     * 设置roughIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setRoughIn(LengthDimension value) {
        this.roughIn = value;
    }

    /**
     * 获取speed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpeedDimension }
     *     
     */
    public SpeedDimension getSpeed() {
        return speed;
    }

    /**
     * 设置speed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedDimension }
     *     
     */
    public void setSpeed(SpeedDimension value) {
        this.speed = value;
    }

    /**
     * 获取spoutHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSpoutHeight() {
        return spoutHeight;
    }

    /**
     * 设置spoutHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSpoutHeight(LengthDimension value) {
        this.spoutHeight = value;
    }

    /**
     * 获取spoutReach属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSpoutReach() {
        return spoutReach;
    }

    /**
     * 设置spoutReach属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSpoutReach(LengthDimension value) {
        this.spoutReach = value;
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
     * 获取switchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchType() {
        return switchType;
    }

    /**
     * 设置switchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchType(String value) {
        this.switchType = value;
    }

    /**
     * 获取threadSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimensionOptionalUnit }
     *     
     */
    public LengthDimensionOptionalUnit getThreadSize() {
        return threadSize;
    }

    /**
     * 设置threadSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimensionOptionalUnit }
     *     
     */
    public void setThreadSize(LengthDimensionOptionalUnit value) {
        this.threadSize = value;
    }

    /**
     * 获取toolTipDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolTipDescription() {
        return toolTipDescription;
    }

    /**
     * 设置toolTipDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolTipDescription(String value) {
        this.toolTipDescription = value;
    }

    /**
     * 获取torque属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TorqueType }
     *     
     */
    public TorqueType getTorque() {
        return torque;
    }

    /**
     * 设置torque属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TorqueType }
     *     
     */
    public void setTorque(TorqueType value) {
        this.torque = value;
    }

    /**
     * 获取uvProtection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUVProtection() {
        return uvProtection;
    }

    /**
     * 设置uvProtection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUVProtection(String value) {
        this.uvProtection = value;
    }

    /**
     * 获取viewingArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewingArea() {
        return viewingArea;
    }

    /**
     * 设置viewingArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewingArea(String value) {
        this.viewingArea = value;
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
     * 获取manufacturerWarrantyDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerWarrantyDescription() {
        return manufacturerWarrantyDescription;
    }

    /**
     * 设置manufacturerWarrantyDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerWarrantyDescription(String value) {
        this.manufacturerWarrantyDescription = value;
    }

    /**
     * 获取minimumEfficiencyReportingValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumEfficiencyReportingValue() {
        return minimumEfficiencyReportingValue;
    }

    /**
     * 设置minimumEfficiencyReportingValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumEfficiencyReportingValue(Integer value) {
        this.minimumEfficiencyReportingValue = value;
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
     * 获取voltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltage() {
        return voltage;
    }

    /**
     * 设置voltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltage(BigDecimal value) {
        this.voltage = value;
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
     * 获取lightSourceOperatingLife属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getLightSourceOperatingLife() {
        return lightSourceOperatingLife;
    }

    /**
     * 设置lightSourceOperatingLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setLightSourceOperatingLife(TimeDimension value) {
        this.lightSourceOperatingLife = value;
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
     * 获取maximumCompatibleLightSourceWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getMaximumCompatibleLightSourceWattage() {
        return maximumCompatibleLightSourceWattage;
    }

    /**
     * 设置maximumCompatibleLightSourceWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setMaximumCompatibleLightSourceWattage(WattageDimension value) {
        this.maximumCompatibleLightSourceWattage = value;
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
     * 获取shadeMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadeMaterialType() {
        return shadeMaterialType;
    }

    /**
     * 设置shadeMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadeMaterialType(String value) {
        this.shadeMaterialType = value;
    }

    /**
     * 获取shortProductDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortProductDescription() {
        return shortProductDescription;
    }

    /**
     * 设置shortProductDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortProductDescription(String value) {
        this.shortProductDescription = value;
    }

    /**
     * 获取startUpTimeDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartUpTimeDescription() {
        return startUpTimeDescription;
    }

    /**
     * 设置startUpTimeDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartUpTimeDescription(String value) {
        this.startUpTimeDescription = value;
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
     * 获取tubingOutsideDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTubingOutsideDiameter() {
        return tubingOutsideDiameter;
    }

    /**
     * 设置tubingOutsideDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTubingOutsideDiameter(LengthDimension value) {
        this.tubingOutsideDiameter = value;
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
     *               &lt;enumeration value="Size"/>
     *               &lt;enumeration value="Color"/>
     *               &lt;enumeration value="Size-Color"/>
     *               &lt;enumeration value="Style"/>
     *               &lt;enumeration value="PATTERN"/>
     *               &lt;enumeration value="Material"/>
     *               &lt;enumeration value="ItemWeight"/>
     *               &lt;enumeration value="ItemPackageQuantity"/>
     *               &lt;enumeration value="CustomerPackageType"/>
     *               &lt;enumeration value="ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="StyleName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
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
