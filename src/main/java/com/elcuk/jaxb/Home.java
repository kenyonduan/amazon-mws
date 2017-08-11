
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
 *         &lt;element name="ProductType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}BedAndBath"/>
 *                   &lt;element ref="{}FurnitureAndDecor"/>
 *                   &lt;element ref="{}Kitchen"/>
 *                   &lt;element ref="{}OutdoorLiving"/>
 *                   &lt;element ref="{}SeedsAndPlants"/>
 *                   &lt;element ref="{}Art"/>
 *                   &lt;element name="Home">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}Battery" minOccurs="0"/>
 *                             &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="Finish" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="IsStainResistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="LightSourceType" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="MaximumCoverageArea" type="{}AreaDimensionOptionalUnit" minOccurs="0"/>
 *                             &lt;element name="NumberOfSets" type="{}TenDigitInteger" minOccurs="0"/>
 *                             &lt;element name="OutputCapacity" type="{}VolumeRateDimension" minOccurs="0"/>
 *                             &lt;element name="PieceCount" type="{}PositiveInteger" minOccurs="0"/>
 *                             &lt;element name="Shape" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="ThreadCount" type="{}PositiveInteger" minOccurs="0"/>
 *                             &lt;element name="TowelWeight" type="{}WeightDimension" minOccurs="0"/>
 *                             &lt;element name="VariationData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="VariationTheme" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="Size"/>
 *                                             &lt;enumeration value="Color"/>
 *                                             &lt;enumeration value="Scent"/>
 *                                             &lt;enumeration value="Size-Color"/>
 *                                             &lt;enumeration value="Size-Scent"/>
 *                                             &lt;enumeration value="DisplayLength-DisplayWidth"/>
 *                                             &lt;enumeration value="DisplayLength-Material"/>
 *                                             &lt;enumeration value="DisplayLength-Size"/>
 *                                             &lt;enumeration value="DisplayLength-Color"/>
 *                                             &lt;enumeration value="DisplayLength-DisplayHeight"/>
 *                                             &lt;enumeration value="DisplayWidth-Material"/>
 *                                             &lt;enumeration value="DisplayWidth-Size"/>
 *                                             &lt;enumeration value="DisplayWidth-Color"/>
 *                                             &lt;enumeration value="DisplayWidth-DisplayHeight"/>
 *                                             &lt;enumeration value="ItemPackageQuantity-Material"/>
 *                                             &lt;enumeration value="ItemPackageQuantity-Size"/>
 *                                             &lt;enumeration value="ItemPackageQuantity-Color"/>
 *                                             &lt;enumeration value="ItemPackageQuantity-DisplayHeight"/>
 *                                             &lt;enumeration value="DisplayWeight-ItemPackageQuantity"/>
 *                                             &lt;enumeration value="DisplayWeight-Material"/>
 *                                             &lt;enumeration value="DisplayWeight-Size"/>
 *                                             &lt;enumeration value="DisplayWeight-Color"/>
 *                                             &lt;enumeration value="DisplayWeight-DisplayHeight"/>
 *                                             &lt;enumeration value="Material-DisplayLength"/>
 *                                             &lt;enumeration value="Material-DisplayWidth"/>
 *                                             &lt;enumeration value="Material-Size"/>
 *                                             &lt;enumeration value="Material-Color"/>
 *                                             &lt;enumeration value="Material-DisplayHeight"/>
 *                                             &lt;enumeration value="Size-DisplayLength"/>
 *                                             &lt;enumeration value="Size-DisplayWidth"/>
 *                                             &lt;enumeration value="Size-DisplayWeight"/>
 *                                             &lt;enumeration value="Size-Material"/>
 *                                             &lt;enumeration value="Size-Color"/>
 *                                             &lt;enumeration value="Size-DisplayHeight"/>
 *                                             &lt;enumeration value="Color-DisplayLength"/>
 *                                             &lt;enumeration value="Color-DisplayWidth"/>
 *                                             &lt;enumeration value="Color-ItemPackageQuantity"/>
 *                                             &lt;enumeration value="Color-DisplayWeight"/>
 *                                             &lt;enumeration value="Color-Material"/>
 *                                             &lt;enumeration value="Color-Size"/>
 *                                             &lt;enumeration value="Color-DisplayHeight"/>
 *                                             &lt;enumeration value="DisplayHeight"/>
 *                                             &lt;enumeration value="Material"/>
 *                                             &lt;enumeration value="DisplayWeight"/>
 *                                             &lt;enumeration value="DisplayLength"/>
 *                                             &lt;enumeration value="ItemPackageQuantity"/>
 *                                             &lt;enumeration value="DisplayLength-PatternName"/>
 *                                             &lt;enumeration value="DisplayLength-StyleName"/>
 *                                             &lt;enumeration value="DisplayWidth-PatternName"/>
 *                                             &lt;enumeration value="DisplayWidth-StyleName"/>
 *                                             &lt;enumeration value="Occasion-PatternName"/>
 *                                             &lt;enumeration value="Occasion-ItemPackageQuantity"/>
 *                                             &lt;enumeration value="Occasion-Material"/>
 *                                             &lt;enumeration value="Occasion-StyleName"/>
 *                                             &lt;enumeration value="Occasion-Size"/>
 *                                             &lt;enumeration value="Occasion-Color"/>
 *                                             &lt;enumeration value="Occasion-DisplayHeight"/>
 *                                             &lt;enumeration value="PatternName-DisplayLength"/>
 *                                             &lt;enumeration value="PatternName-DisplayWidth"/>
 *                                             &lt;enumeration value="PatternName-Occasion"/>
 *                                             &lt;enumeration value="PatternName-Material"/>
 *                                             &lt;enumeration value="PatternName-StyleName"/>
 *                                             &lt;enumeration value="PatternName-Size"/>
 *                                             &lt;enumeration value="PatternName-Color"/>
 *                                             &lt;enumeration value="PatternName-DisplayHeight"/>
 *                                             &lt;enumeration value="MatteStyle-Material"/>
 *                                             &lt;enumeration value="MatteStyle-StyleName"/>
 *                                             &lt;enumeration value="MatteStyle-Size"/>
 *                                             &lt;enumeration value="MatteStyle-Color"/>
 *                                             &lt;enumeration value="ItemPackageQuantity-Occasion"/>
 *                                             &lt;enumeration value="ItemPackageQuantity-StyleName"/>
 *                                             &lt;enumeration value="DisplayWeight-StyleName"/>
 *                                             &lt;enumeration value="Material-PatternName"/>
 *                                             &lt;enumeration value="Material-MatteStyle"/>
 *                                             &lt;enumeration value="Material-StyleName"/>
 *                                             &lt;enumeration value="StyleName-DisplayLength"/>
 *                                             &lt;enumeration value="StyleName-DisplayWidth"/>
 *                                             &lt;enumeration value="StyleName-Occasion"/>
 *                                             &lt;enumeration value="StyleName-PatternName"/>
 *                                             &lt;enumeration value="StyleName-DisplayWeight"/>
 *                                             &lt;enumeration value="StyleName-Material"/>
 *                                             &lt;enumeration value="StyleName-Size"/>
 *                                             &lt;enumeration value="StyleName-Color"/>
 *                                             &lt;enumeration value="Size-Occasion"/>
 *                                             &lt;enumeration value="Size-PatternName"/>
 *                                             &lt;enumeration value="Size-MatteStyle"/>
 *                                             &lt;enumeration value="Size-StyleName"/>
 *                                             &lt;enumeration value="Color-Occasion"/>
 *                                             &lt;enumeration value="Color-PatternName"/>
 *                                             &lt;enumeration value="Color-MatteStyle"/>
 *                                             &lt;enumeration value="Color-StyleName"/>
 *                                             &lt;enumeration value="MatteStyle"/>
 *                                             &lt;enumeration value="PatternName"/>
 *                                             &lt;enumeration value="Occasion"/>
 *                                             &lt;enumeration value="StyleName"/>
 *                                             &lt;enumeration value="CustomerPackageType"/>
 *                                             &lt;enumeration value="ColorName-CustomerPackageType"/>
 *                                             &lt;enumeration value="SizeName-CustomerPackageType"/>
 *                                             &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
 *                                             &lt;enumeration value="StyleName-CustomerPackageType"/>
 *                                             &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                                       &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *                                       &lt;element name="Scent" type="{}StringNotNull" minOccurs="0"/>
 *                                       &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Wattage" type="{}WattageDimensionOptionalUnit" minOccurs="0"/>
 *                             &lt;element name="InnerMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="ItemDiameter" type="{}LengthDimension" minOccurs="0"/>
 *                             &lt;element name="BatteryCellComposition" type="{}BatteryCellTypeValues" minOccurs="0"/>
 *                             &lt;element name="BatteryFormFactor" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="PaintType" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="CustomerRestrictionType" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="OccasionType" type="{}StringNotNull" minOccurs="0"/>
 *                             &lt;element name="Efficiency" type="{}StringNotNull" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Parentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="collection-parent"/>
 *               &lt;enumeration value="variation-parent"/>
 *               &lt;enumeration value="base-product"/>
 *               &lt;enumeration value="parent"/>
 *               &lt;enumeration value="child"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VariationData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parentage" minOccurs="0">
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
 *                         &lt;enumeration value="Length-Width"/>
 *                         &lt;enumeration value="Length-Material"/>
 *                         &lt;enumeration value="Length-Size"/>
 *                         &lt;enumeration value="Length-Color"/>
 *                         &lt;enumeration value="Length-Height"/>
 *                         &lt;enumeration value="Width-Material"/>
 *                         &lt;enumeration value="Width-Size"/>
 *                         &lt;enumeration value="Width-Color"/>
 *                         &lt;enumeration value="Width-Height"/>
 *                         &lt;enumeration value="NumberOfItemsInPackage-Material"/>
 *                         &lt;enumeration value="NumberOfItemsInPackage-Size"/>
 *                         &lt;enumeration value="NumberOfItemsInPackage-Color"/>
 *                         &lt;enumeration value="NumberOfItemsInPackage-Height"/>
 *                         &lt;enumeration value="Weight-NumberOfItemsInPackage"/>
 *                         &lt;enumeration value="Weight-Material"/>
 *                         &lt;enumeration value="Weight-Size"/>
 *                         &lt;enumeration value="Weight-Color"/>
 *                         &lt;enumeration value="Weight-Height"/>
 *                         &lt;enumeration value="Material-Length"/>
 *                         &lt;enumeration value="Material-Width"/>
 *                         &lt;enumeration value="Material-Size"/>
 *                         &lt;enumeration value="Material-Color"/>
 *                         &lt;enumeration value="Material-Height"/>
 *                         &lt;enumeration value="Size-Length"/>
 *                         &lt;enumeration value="Size-Width"/>
 *                         &lt;enumeration value="Size-Weight"/>
 *                         &lt;enumeration value="Size-Material"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="Size-Height"/>
 *                         &lt;enumeration value="Color-Length"/>
 *                         &lt;enumeration value="Color-Width"/>
 *                         &lt;enumeration value="Color-NumberOfItemsInPackage"/>
 *                         &lt;enumeration value="Color-Weight"/>
 *                         &lt;enumeration value="Color-Material"/>
 *                         &lt;enumeration value="Color-Size"/>
 *                         &lt;enumeration value="Color-Height"/>
 *                         &lt;enumeration value="Height"/>
 *                         &lt;enumeration value="Material"/>
 *                         &lt;enumeration value="Weight"/>
 *                         &lt;enumeration value="Length"/>
 *                         &lt;enumeration value="NumberOfItemsInPackage"/>
 *                         &lt;enumeration value="Length-PatternName"/>
 *                         &lt;enumeration value="Length-StyleName"/>
 *                         &lt;enumeration value="Width-PatternName"/>
 *                         &lt;enumeration value="Width-StyleName"/>
 *                         &lt;enumeration value="Occasion-PatternName"/>
 *                         &lt;enumeration value="Occasion-NumberOfItemsInPackage"/>
 *                         &lt;enumeration value="Occasion-Material"/>
 *                         &lt;enumeration value="Occasion-StyleName"/>
 *                         &lt;enumeration value="Occasion-Size"/>
 *                         &lt;enumeration value="Occasion-Color"/>
 *                         &lt;enumeration value="Occasion-Height"/>
 *                         &lt;enumeration value="PatternName-Length"/>
 *                         &lt;enumeration value="PatternName-Width"/>
 *                         &lt;enumeration value="PatternName-Occasion"/>
 *                         &lt;enumeration value="PatternName-Material"/>
 *                         &lt;enumeration value="PatternName-StyleName"/>
 *                         &lt;enumeration value="PatternName-Size"/>
 *                         &lt;enumeration value="PatternName-Color"/>
 *                         &lt;enumeration value="PatternName-Height"/>
 *                         &lt;enumeration value="MatteStyle-Material"/>
 *                         &lt;enumeration value="MatteStyle-StyleName"/>
 *                         &lt;enumeration value="MatteStyle-Size"/>
 *                         &lt;enumeration value="MatteStyle-Color"/>
 *                         &lt;enumeration value="NumberOfItemsInPackage-Occasion"/>
 *                         &lt;enumeration value="NumberOfItemsInPackage-StyleName"/>
 *                         &lt;enumeration value="Weight-StyleName"/>
 *                         &lt;enumeration value="Material-PatternName"/>
 *                         &lt;enumeration value="Material-MatteStyle"/>
 *                         &lt;enumeration value="Material-StyleName"/>
 *                         &lt;enumeration value="StyleName-Length"/>
 *                         &lt;enumeration value="StyleName-Width"/>
 *                         &lt;enumeration value="StyleName-Occasion"/>
 *                         &lt;enumeration value="StyleName-PatternName"/>
 *                         &lt;enumeration value="StyleName-Weight"/>
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
 *                         &lt;enumeration value="Weight-Length-Color"/>
 *                         &lt;enumeration value="Occasion-Size-Color"/>
 *                         &lt;enumeration value="Weight-Length-Material"/>
 *                         &lt;enumeration value="Weight-Length-StyleName"/>
 *                         &lt;enumeration value="PatternName-Size-Occasion"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatteryDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ColorMap" minOccurs="0"/>
 *         &lt;element name="CanShipInOriginalContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CountryAsLabeled" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryProducedIn" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ImportDesignation" type="{}String" minOccurs="0"/>
 *         &lt;element name="FurDescription" type="{}LongString" minOccurs="0"/>
 *         &lt;element name="IdentityPackageType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="bulk"/>
 *               &lt;enumeration value="frustration_free"/>
 *               &lt;enumeration value="traditional"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IncludedComponents" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="FabricType" type="{}HundredString" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="PatternName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SeatHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Occasion" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="MatteStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayDepth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ManufacturerWarrantyDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="1500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Volume" type="{}VolumeIntegerDimension" minOccurs="0"/>
 *         &lt;element name="VolumeCapacity" type="{}VolumeIntegerDimension" minOccurs="0"/>
 *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ThreadCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="SafetyWarning" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="AwardsWon" type="{}HundredFiftyStringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLife" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLifeStandby" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryChargeTime" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumIon" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumMetal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
 *         &lt;element name="MfgWarrantyDescriptionLabor" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionParts" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfItemsInPackage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PowerSourceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RegionOfOrigin" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="SizeMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Length" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Width" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Height" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Depth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Diameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Weight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="Spread" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SunlightExposure" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="shade"/>
 *               &lt;enumeration value="partial-shade"/>
 *               &lt;enumeration value="partial-sun"/>
 *               &lt;enumeration value="full-sun"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MoistureNeeds" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="little-to-no-watering"/>
 *               &lt;enumeration value="moderate-watering"/>
 *               &lt;enumeration value="regular-watering"/>
 *               &lt;enumeration value="constant-watering"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="USDAHardinessZone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SunsetClimateZone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumberOfSets" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
    "productType",
    "parentage",
    "variationData",
    "batteryDescription",
    "colorMap",
    "canShipInOriginalContainer",
    "countryAsLabeled",
    "countryOfOrigin",
    "countryProducedIn",
    "importDesignation",
    "furDescription",
    "identityPackageType",
    "includedComponents",
    "fabricType",
    "patternName",
    "seatHeight",
    "specialFeatures",
    "styleName",
    "occasion",
    "matteStyle",
    "displayLength",
    "displayWidth",
    "displayHeight",
    "displayDepth",
    "displayDiameter",
    "displayVolume",
    "displayWeight",
    "itemPackageQuantity",
    "manufacturerWarrantyDescription",
    "volume",
    "volumeCapacity",
    "material",
    "threadCount",
    "numberOfPieces",
    "safetyWarning",
    "awardsWon",
    "batteryAverageLife",
    "batteryAverageLifeStandby",
    "batteryChargeTime",
    "batteryTypeLithiumIon",
    "batteryTypeLithiumMetal",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "mfgWarrantyDescriptionLabor",
    "mfgWarrantyDescriptionParts",
    "mfgWarrantyDescriptionType",
    "numberOfItemsInPackage",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "powerSourceType",
    "regionOfOrigin",
    "sellerWarrantyDescription",
    "sizeMap",
    "warnings",
    "wattage",
    "length",
    "width",
    "height",
    "depth",
    "diameter",
    "weight",
    "spread",
    "sunlightExposure",
    "moistureNeeds",
    "usdaHardinessZone",
    "sunsetClimateZone",
    "numberOfSets"
})
@XmlRootElement(name = "Home")
public class Home {

    @XmlElement(name = "ProductType")
    protected Home.ProductType productType;
    @XmlElement(name = "Parentage")
    protected String parentage;
    @XmlElement(name = "VariationData")
    protected Home.VariationData variationData;
    @XmlElement(name = "BatteryDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String batteryDescription;
    @XmlElement(name = "ColorMap")
    protected String colorMap;
    @XmlElement(name = "CanShipInOriginalContainer")
    protected Boolean canShipInOriginalContainer;
    @XmlElement(name = "CountryAsLabeled")
    protected String countryAsLabeled;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "CountryProducedIn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String countryProducedIn;
    @XmlElement(name = "ImportDesignation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String importDesignation;
    @XmlElement(name = "FurDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String furDescription;
    @XmlElement(name = "IdentityPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identityPackageType;
    @XmlElement(name = "IncludedComponents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> includedComponents;
    @XmlElement(name = "FabricType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> fabricType;
    @XmlElement(name = "PatternName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String patternName;
    @XmlElement(name = "SeatHeight")
    protected LengthDimension seatHeight;
    @XmlElement(name = "SpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specialFeatures;
    @XmlElement(name = "StyleName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String styleName;
    @XmlElement(name = "Occasion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String occasion;
    @XmlElement(name = "MatteStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String matteStyle;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "DisplayWidth")
    protected LengthDimension displayWidth;
    @XmlElement(name = "DisplayHeight")
    protected LengthDimension displayHeight;
    @XmlElement(name = "DisplayDepth")
    protected LengthDimension displayDepth;
    @XmlElement(name = "DisplayDiameter")
    protected LengthDimension displayDiameter;
    @XmlElement(name = "DisplayVolume")
    protected VolumeDimension displayVolume;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "ItemPackageQuantity", defaultValue = "1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;
    @XmlElement(name = "ManufacturerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturerWarrantyDescription;
    @XmlElement(name = "Volume")
    protected VolumeIntegerDimension volume;
    @XmlElement(name = "VolumeCapacity")
    protected VolumeIntegerDimension volumeCapacity;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String material;
    @XmlElement(name = "ThreadCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger threadCount;
    @XmlElement(name = "NumberOfPieces")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPieces;
    @XmlElement(name = "SafetyWarning")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String safetyWarning;
    @XmlElement(name = "AwardsWon")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> awardsWon;
    @XmlElement(name = "BatteryAverageLife")
    protected BigDecimal batteryAverageLife;
    @XmlElement(name = "BatteryAverageLifeStandby")
    protected BigDecimal batteryAverageLifeStandby;
    @XmlElement(name = "BatteryChargeTime")
    protected BigDecimal batteryChargeTime;
    @XmlElement(name = "BatteryTypeLithiumIon")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumIon;
    @XmlElement(name = "BatteryTypeLithiumMetal")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumMetal;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    protected BigDecimal lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    protected BigDecimal lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    protected BigDecimal lithiumBatteryWeight;
    @XmlElement(name = "MfgWarrantyDescriptionLabor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfgWarrantyDescriptionLabor;
    @XmlElement(name = "MfgWarrantyDescriptionParts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfgWarrantyDescriptionParts;
    @XmlElement(name = "MfgWarrantyDescriptionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfgWarrantyDescriptionType;
    @XmlElement(name = "NumberOfItemsInPackage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItemsInPackage;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "PowerSourceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSourceType;
    @XmlElement(name = "RegionOfOrigin")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String regionOfOrigin;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sellerWarrantyDescription;
    @XmlElement(name = "SizeMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sizeMap;
    @XmlElement(name = "Warnings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warnings;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;
    @XmlElement(name = "Length")
    protected LengthDimension length;
    @XmlElement(name = "Width")
    protected LengthDimension width;
    @XmlElement(name = "Height")
    protected LengthDimension height;
    @XmlElement(name = "Depth")
    protected LengthDimension depth;
    @XmlElement(name = "Diameter")
    protected LengthDimension diameter;
    @XmlElement(name = "Weight")
    protected WeightDimension weight;
    @XmlElement(name = "Spread")
    protected LengthDimension spread;
    @XmlElement(name = "SunlightExposure")
    protected String sunlightExposure;
    @XmlElement(name = "MoistureNeeds")
    protected String moistureNeeds;
    @XmlElement(name = "USDAHardinessZone")
    protected Integer usdaHardinessZone;
    @XmlElement(name = "SunsetClimateZone")
    protected Integer sunsetClimateZone;
    @XmlElement(name = "NumberOfSets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSets;

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Home.ProductType }
     *     
     */
    public Home.ProductType getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Home.ProductType }
     *     
     */
    public void setProductType(Home.ProductType value) {
        this.productType = value;
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
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Home.VariationData }
     *     
     */
    public Home.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Home.VariationData }
     *     
     */
    public void setVariationData(Home.VariationData value) {
        this.variationData = value;
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
     * 获取countryAsLabeled属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAsLabeled() {
        return countryAsLabeled;
    }

    /**
     * 设置countryAsLabeled属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAsLabeled(String value) {
        this.countryAsLabeled = value;
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
     * 获取countryProducedIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryProducedIn() {
        return countryProducedIn;
    }

    /**
     * 设置countryProducedIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryProducedIn(String value) {
        this.countryProducedIn = value;
    }

    /**
     * 获取importDesignation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportDesignation() {
        return importDesignation;
    }

    /**
     * 设置importDesignation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportDesignation(String value) {
        this.importDesignation = value;
    }

    /**
     * 获取furDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurDescription() {
        return furDescription;
    }

    /**
     * 设置furDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurDescription(String value) {
        this.furDescription = value;
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
     * Gets the value of the includedComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedComponents() {
        if (includedComponents == null) {
            includedComponents = new ArrayList<String>();
        }
        return this.includedComponents;
    }

    /**
     * Gets the value of the fabricType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fabricType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFabricType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFabricType() {
        if (fabricType == null) {
            fabricType = new ArrayList<String>();
        }
        return this.fabricType;
    }

    /**
     * 获取patternName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternName() {
        return patternName;
    }

    /**
     * 设置patternName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternName(String value) {
        this.patternName = value;
    }

    /**
     * 获取seatHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSeatHeight() {
        return seatHeight;
    }

    /**
     * 设置seatHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSeatHeight(LengthDimension value) {
        this.seatHeight = value;
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
     * 获取occasion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccasion() {
        return occasion;
    }

    /**
     * 设置occasion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccasion(String value) {
        this.occasion = value;
    }

    /**
     * 获取matteStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatteStyle() {
        return matteStyle;
    }

    /**
     * 设置matteStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatteStyle(String value) {
        this.matteStyle = value;
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
     * 获取volume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeIntegerDimension }
     *     
     */
    public VolumeIntegerDimension getVolume() {
        return volume;
    }

    /**
     * 设置volume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeIntegerDimension }
     *     
     */
    public void setVolume(VolumeIntegerDimension value) {
        this.volume = value;
    }

    /**
     * 获取volumeCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeIntegerDimension }
     *     
     */
    public VolumeIntegerDimension getVolumeCapacity() {
        return volumeCapacity;
    }

    /**
     * 设置volumeCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeIntegerDimension }
     *     
     */
    public void setVolumeCapacity(VolumeIntegerDimension value) {
        this.volumeCapacity = value;
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
     * 获取safetyWarning属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafetyWarning() {
        return safetyWarning;
    }

    /**
     * 设置safetyWarning属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafetyWarning(String value) {
        this.safetyWarning = value;
    }

    /**
     * Gets the value of the awardsWon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardsWon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardsWon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAwardsWon() {
        if (awardsWon == null) {
            awardsWon = new ArrayList<String>();
        }
        return this.awardsWon;
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
     * 获取numberOfItemsInPackage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItemsInPackage() {
        return numberOfItemsInPackage;
    }

    /**
     * 设置numberOfItemsInPackage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItemsInPackage(BigInteger value) {
        this.numberOfItemsInPackage = value;
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
     * 获取wattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWattage() {
        return wattage;
    }

    /**
     * 设置wattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWattage(BigInteger value) {
        this.wattage = value;
    }

    /**
     * 获取length属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getLength() {
        return length;
    }

    /**
     * 设置length属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setLength(LengthDimension value) {
        this.length = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWidth(LengthDimension value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHeight(LengthDimension value) {
        this.height = value;
    }

    /**
     * 获取depth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDepth() {
        return depth;
    }

    /**
     * 设置depth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDepth(LengthDimension value) {
        this.depth = value;
    }

    /**
     * 获取diameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDiameter() {
        return diameter;
    }

    /**
     * 设置diameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDiameter(LengthDimension value) {
        this.diameter = value;
    }

    /**
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setWeight(WeightDimension value) {
        this.weight = value;
    }

    /**
     * 获取spread属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSpread() {
        return spread;
    }

    /**
     * 设置spread属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSpread(LengthDimension value) {
        this.spread = value;
    }

    /**
     * 获取sunlightExposure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunlightExposure() {
        return sunlightExposure;
    }

    /**
     * 设置sunlightExposure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunlightExposure(String value) {
        this.sunlightExposure = value;
    }

    /**
     * 获取moistureNeeds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoistureNeeds() {
        return moistureNeeds;
    }

    /**
     * 设置moistureNeeds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoistureNeeds(String value) {
        this.moistureNeeds = value;
    }

    /**
     * 获取usdaHardinessZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUSDAHardinessZone() {
        return usdaHardinessZone;
    }

    /**
     * 设置usdaHardinessZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUSDAHardinessZone(Integer value) {
        this.usdaHardinessZone = value;
    }

    /**
     * 获取sunsetClimateZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSunsetClimateZone() {
        return sunsetClimateZone;
    }

    /**
     * 设置sunsetClimateZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSunsetClimateZone(Integer value) {
        this.sunsetClimateZone = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{}BedAndBath"/>
     *         &lt;element ref="{}FurnitureAndDecor"/>
     *         &lt;element ref="{}Kitchen"/>
     *         &lt;element ref="{}OutdoorLiving"/>
     *         &lt;element ref="{}SeedsAndPlants"/>
     *         &lt;element ref="{}Art"/>
     *         &lt;element name="Home">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}Battery" minOccurs="0"/>
     *                   &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="Finish" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="IsStainResistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="LightSourceType" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="MaximumCoverageArea" type="{}AreaDimensionOptionalUnit" minOccurs="0"/>
     *                   &lt;element name="NumberOfSets" type="{}TenDigitInteger" minOccurs="0"/>
     *                   &lt;element name="OutputCapacity" type="{}VolumeRateDimension" minOccurs="0"/>
     *                   &lt;element name="PieceCount" type="{}PositiveInteger" minOccurs="0"/>
     *                   &lt;element name="Shape" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="ThreadCount" type="{}PositiveInteger" minOccurs="0"/>
     *                   &lt;element name="TowelWeight" type="{}WeightDimension" minOccurs="0"/>
     *                   &lt;element name="VariationData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="VariationTheme" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="Size"/>
     *                                   &lt;enumeration value="Color"/>
     *                                   &lt;enumeration value="Scent"/>
     *                                   &lt;enumeration value="Size-Color"/>
     *                                   &lt;enumeration value="Size-Scent"/>
     *                                   &lt;enumeration value="DisplayLength-DisplayWidth"/>
     *                                   &lt;enumeration value="DisplayLength-Material"/>
     *                                   &lt;enumeration value="DisplayLength-Size"/>
     *                                   &lt;enumeration value="DisplayLength-Color"/>
     *                                   &lt;enumeration value="DisplayLength-DisplayHeight"/>
     *                                   &lt;enumeration value="DisplayWidth-Material"/>
     *                                   &lt;enumeration value="DisplayWidth-Size"/>
     *                                   &lt;enumeration value="DisplayWidth-Color"/>
     *                                   &lt;enumeration value="DisplayWidth-DisplayHeight"/>
     *                                   &lt;enumeration value="ItemPackageQuantity-Material"/>
     *                                   &lt;enumeration value="ItemPackageQuantity-Size"/>
     *                                   &lt;enumeration value="ItemPackageQuantity-Color"/>
     *                                   &lt;enumeration value="ItemPackageQuantity-DisplayHeight"/>
     *                                   &lt;enumeration value="DisplayWeight-ItemPackageQuantity"/>
     *                                   &lt;enumeration value="DisplayWeight-Material"/>
     *                                   &lt;enumeration value="DisplayWeight-Size"/>
     *                                   &lt;enumeration value="DisplayWeight-Color"/>
     *                                   &lt;enumeration value="DisplayWeight-DisplayHeight"/>
     *                                   &lt;enumeration value="Material-DisplayLength"/>
     *                                   &lt;enumeration value="Material-DisplayWidth"/>
     *                                   &lt;enumeration value="Material-Size"/>
     *                                   &lt;enumeration value="Material-Color"/>
     *                                   &lt;enumeration value="Material-DisplayHeight"/>
     *                                   &lt;enumeration value="Size-DisplayLength"/>
     *                                   &lt;enumeration value="Size-DisplayWidth"/>
     *                                   &lt;enumeration value="Size-DisplayWeight"/>
     *                                   &lt;enumeration value="Size-Material"/>
     *                                   &lt;enumeration value="Size-Color"/>
     *                                   &lt;enumeration value="Size-DisplayHeight"/>
     *                                   &lt;enumeration value="Color-DisplayLength"/>
     *                                   &lt;enumeration value="Color-DisplayWidth"/>
     *                                   &lt;enumeration value="Color-ItemPackageQuantity"/>
     *                                   &lt;enumeration value="Color-DisplayWeight"/>
     *                                   &lt;enumeration value="Color-Material"/>
     *                                   &lt;enumeration value="Color-Size"/>
     *                                   &lt;enumeration value="Color-DisplayHeight"/>
     *                                   &lt;enumeration value="DisplayHeight"/>
     *                                   &lt;enumeration value="Material"/>
     *                                   &lt;enumeration value="DisplayWeight"/>
     *                                   &lt;enumeration value="DisplayLength"/>
     *                                   &lt;enumeration value="ItemPackageQuantity"/>
     *                                   &lt;enumeration value="DisplayLength-PatternName"/>
     *                                   &lt;enumeration value="DisplayLength-StyleName"/>
     *                                   &lt;enumeration value="DisplayWidth-PatternName"/>
     *                                   &lt;enumeration value="DisplayWidth-StyleName"/>
     *                                   &lt;enumeration value="Occasion-PatternName"/>
     *                                   &lt;enumeration value="Occasion-ItemPackageQuantity"/>
     *                                   &lt;enumeration value="Occasion-Material"/>
     *                                   &lt;enumeration value="Occasion-StyleName"/>
     *                                   &lt;enumeration value="Occasion-Size"/>
     *                                   &lt;enumeration value="Occasion-Color"/>
     *                                   &lt;enumeration value="Occasion-DisplayHeight"/>
     *                                   &lt;enumeration value="PatternName-DisplayLength"/>
     *                                   &lt;enumeration value="PatternName-DisplayWidth"/>
     *                                   &lt;enumeration value="PatternName-Occasion"/>
     *                                   &lt;enumeration value="PatternName-Material"/>
     *                                   &lt;enumeration value="PatternName-StyleName"/>
     *                                   &lt;enumeration value="PatternName-Size"/>
     *                                   &lt;enumeration value="PatternName-Color"/>
     *                                   &lt;enumeration value="PatternName-DisplayHeight"/>
     *                                   &lt;enumeration value="MatteStyle-Material"/>
     *                                   &lt;enumeration value="MatteStyle-StyleName"/>
     *                                   &lt;enumeration value="MatteStyle-Size"/>
     *                                   &lt;enumeration value="MatteStyle-Color"/>
     *                                   &lt;enumeration value="ItemPackageQuantity-Occasion"/>
     *                                   &lt;enumeration value="ItemPackageQuantity-StyleName"/>
     *                                   &lt;enumeration value="DisplayWeight-StyleName"/>
     *                                   &lt;enumeration value="Material-PatternName"/>
     *                                   &lt;enumeration value="Material-MatteStyle"/>
     *                                   &lt;enumeration value="Material-StyleName"/>
     *                                   &lt;enumeration value="StyleName-DisplayLength"/>
     *                                   &lt;enumeration value="StyleName-DisplayWidth"/>
     *                                   &lt;enumeration value="StyleName-Occasion"/>
     *                                   &lt;enumeration value="StyleName-PatternName"/>
     *                                   &lt;enumeration value="StyleName-DisplayWeight"/>
     *                                   &lt;enumeration value="StyleName-Material"/>
     *                                   &lt;enumeration value="StyleName-Size"/>
     *                                   &lt;enumeration value="StyleName-Color"/>
     *                                   &lt;enumeration value="Size-Occasion"/>
     *                                   &lt;enumeration value="Size-PatternName"/>
     *                                   &lt;enumeration value="Size-MatteStyle"/>
     *                                   &lt;enumeration value="Size-StyleName"/>
     *                                   &lt;enumeration value="Color-Occasion"/>
     *                                   &lt;enumeration value="Color-PatternName"/>
     *                                   &lt;enumeration value="Color-MatteStyle"/>
     *                                   &lt;enumeration value="Color-StyleName"/>
     *                                   &lt;enumeration value="MatteStyle"/>
     *                                   &lt;enumeration value="PatternName"/>
     *                                   &lt;enumeration value="Occasion"/>
     *                                   &lt;enumeration value="StyleName"/>
     *                                   &lt;enumeration value="CustomerPackageType"/>
     *                                   &lt;enumeration value="ColorName-CustomerPackageType"/>
     *                                   &lt;enumeration value="SizeName-CustomerPackageType"/>
     *                                   &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
     *                                   &lt;enumeration value="StyleName-CustomerPackageType"/>
     *                                   &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *                             &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
     *                             &lt;element name="Scent" type="{}StringNotNull" minOccurs="0"/>
     *                             &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Wattage" type="{}WattageDimensionOptionalUnit" minOccurs="0"/>
     *                   &lt;element name="InnerMaterialType" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="ItemDiameter" type="{}LengthDimension" minOccurs="0"/>
     *                   &lt;element name="BatteryCellComposition" type="{}BatteryCellTypeValues" minOccurs="0"/>
     *                   &lt;element name="BatteryFormFactor" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="PaintType" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="CustomerRestrictionType" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="OccasionType" type="{}StringNotNull" minOccurs="0"/>
     *                   &lt;element name="Efficiency" type="{}StringNotNull" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "bedAndBath",
        "furnitureAndDecor",
        "kitchen",
        "outdoorLiving",
        "seedsAndPlants",
        "art",
        "home"
    })
    public static class ProductType {

        @XmlElement(name = "BedAndBath")
        protected BedAndBath bedAndBath;
        @XmlElement(name = "FurnitureAndDecor")
        protected FurnitureAndDecor furnitureAndDecor;
        @XmlElement(name = "Kitchen")
        protected Kitchen kitchen;
        @XmlElement(name = "OutdoorLiving")
        protected OutdoorLiving outdoorLiving;
        @XmlElement(name = "SeedsAndPlants")
        protected SeedsAndPlants seedsAndPlants;
        @XmlElement(name = "Art")
        protected Art art;
        @XmlElement(name = "Home")
        protected Home.ProductType.Home home;

        /**
         * 获取bedAndBath属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BedAndBath }
         *     
         */
        public BedAndBath getBedAndBath() {
            return bedAndBath;
        }

        /**
         * 设置bedAndBath属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BedAndBath }
         *     
         */
        public void setBedAndBath(BedAndBath value) {
            this.bedAndBath = value;
        }

        /**
         * 获取furnitureAndDecor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FurnitureAndDecor }
         *     
         */
        public FurnitureAndDecor getFurnitureAndDecor() {
            return furnitureAndDecor;
        }

        /**
         * 设置furnitureAndDecor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FurnitureAndDecor }
         *     
         */
        public void setFurnitureAndDecor(FurnitureAndDecor value) {
            this.furnitureAndDecor = value;
        }

        /**
         * 获取kitchen属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Kitchen }
         *     
         */
        public Kitchen getKitchen() {
            return kitchen;
        }

        /**
         * 设置kitchen属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Kitchen }
         *     
         */
        public void setKitchen(Kitchen value) {
            this.kitchen = value;
        }

        /**
         * 获取outdoorLiving属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OutdoorLiving }
         *     
         */
        public OutdoorLiving getOutdoorLiving() {
            return outdoorLiving;
        }

        /**
         * 设置outdoorLiving属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OutdoorLiving }
         *     
         */
        public void setOutdoorLiving(OutdoorLiving value) {
            this.outdoorLiving = value;
        }

        /**
         * 获取seedsAndPlants属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SeedsAndPlants }
         *     
         */
        public SeedsAndPlants getSeedsAndPlants() {
            return seedsAndPlants;
        }

        /**
         * 设置seedsAndPlants属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SeedsAndPlants }
         *     
         */
        public void setSeedsAndPlants(SeedsAndPlants value) {
            this.seedsAndPlants = value;
        }

        /**
         * 获取art属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Art }
         *     
         */
        public Art getArt() {
            return art;
        }

        /**
         * 设置art属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Art }
         *     
         */
        public void setArt(Art value) {
            this.art = value;
        }

        /**
         * 获取home属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Home.ProductType.Home }
         *     
         */
        public Home.ProductType.Home getHome() {
            return home;
        }

        /**
         * 设置home属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Home.ProductType.Home }
         *     
         */
        public void setHome(Home.ProductType.Home value) {
            this.home = value;
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
         *         &lt;element ref="{}Battery" minOccurs="0"/>
         *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
         *         &lt;element name="Finish" type="{}StringNotNull" minOccurs="0"/>
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
         *                   &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Wattage" type="{}WattageDimensionOptionalUnit" minOccurs="0"/>
         *         &lt;element name="InnerMaterialType" type="{}StringNotNull" minOccurs="0"/>
         *         &lt;element name="ItemDiameter" type="{}LengthDimension" minOccurs="0"/>
         *         &lt;element name="BatteryCellComposition" type="{}BatteryCellTypeValues" minOccurs="0"/>
         *         &lt;element name="BatteryFormFactor" type="{}StringNotNull" minOccurs="0"/>
         *         &lt;element name="PaintType" type="{}StringNotNull" minOccurs="0"/>
         *         &lt;element name="CustomerRestrictionType" type="{}StringNotNull" minOccurs="0"/>
         *         &lt;element name="OccasionType" type="{}StringNotNull" minOccurs="0"/>
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
            "colorMap",
            "finish",
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
            "itemDiameter",
            "batteryCellComposition",
            "batteryFormFactor",
            "paintType",
            "customerRestrictionType",
            "occasionType",
            "efficiency"
        })
        public static class Home {

            @XmlElement(name = "Battery")
            protected Battery battery;
            @XmlElement(name = "ColorMap")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String colorMap;
            @XmlElement(name = "Finish")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String finish;
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
            protected Home.ProductType.Home.VariationData variationData;
            @XmlElement(name = "Wattage")
            protected WattageDimensionOptionalUnit wattage;
            @XmlElement(name = "InnerMaterialType")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String innerMaterialType;
            @XmlElement(name = "ItemDiameter")
            protected LengthDimension itemDiameter;
            @XmlElement(name = "BatteryCellComposition")
            @XmlSchemaType(name = "string")
            protected BatteryCellTypeValues batteryCellComposition;
            @XmlElement(name = "BatteryFormFactor")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String batteryFormFactor;
            @XmlElement(name = "PaintType")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String paintType;
            @XmlElement(name = "CustomerRestrictionType")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String customerRestrictionType;
            @XmlElement(name = "OccasionType")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String occasionType;
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
             *     {@link Home.ProductType.Home.VariationData }
             *     
             */
            public Home.ProductType.Home.VariationData getVariationData() {
                return variationData;
            }

            /**
             * 设置variationData属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Home.ProductType.Home.VariationData }
             *     
             */
            public void setVariationData(Home.ProductType.Home.VariationData value) {
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
             * 获取paintType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaintType() {
                return paintType;
            }

            /**
             * 设置paintType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaintType(String value) {
                this.paintType = value;
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
     *               &lt;enumeration value="Size"/>
     *               &lt;enumeration value="Color"/>
     *               &lt;enumeration value="Length-Width"/>
     *               &lt;enumeration value="Length-Material"/>
     *               &lt;enumeration value="Length-Size"/>
     *               &lt;enumeration value="Length-Color"/>
     *               &lt;enumeration value="Length-Height"/>
     *               &lt;enumeration value="Width-Material"/>
     *               &lt;enumeration value="Width-Size"/>
     *               &lt;enumeration value="Width-Color"/>
     *               &lt;enumeration value="Width-Height"/>
     *               &lt;enumeration value="NumberOfItemsInPackage-Material"/>
     *               &lt;enumeration value="NumberOfItemsInPackage-Size"/>
     *               &lt;enumeration value="NumberOfItemsInPackage-Color"/>
     *               &lt;enumeration value="NumberOfItemsInPackage-Height"/>
     *               &lt;enumeration value="Weight-NumberOfItemsInPackage"/>
     *               &lt;enumeration value="Weight-Material"/>
     *               &lt;enumeration value="Weight-Size"/>
     *               &lt;enumeration value="Weight-Color"/>
     *               &lt;enumeration value="Weight-Height"/>
     *               &lt;enumeration value="Material-Length"/>
     *               &lt;enumeration value="Material-Width"/>
     *               &lt;enumeration value="Material-Size"/>
     *               &lt;enumeration value="Material-Color"/>
     *               &lt;enumeration value="Material-Height"/>
     *               &lt;enumeration value="Size-Length"/>
     *               &lt;enumeration value="Size-Width"/>
     *               &lt;enumeration value="Size-Weight"/>
     *               &lt;enumeration value="Size-Material"/>
     *               &lt;enumeration value="Size-Color"/>
     *               &lt;enumeration value="Size-Height"/>
     *               &lt;enumeration value="Color-Length"/>
     *               &lt;enumeration value="Color-Width"/>
     *               &lt;enumeration value="Color-NumberOfItemsInPackage"/>
     *               &lt;enumeration value="Color-Weight"/>
     *               &lt;enumeration value="Color-Material"/>
     *               &lt;enumeration value="Color-Size"/>
     *               &lt;enumeration value="Color-Height"/>
     *               &lt;enumeration value="Height"/>
     *               &lt;enumeration value="Material"/>
     *               &lt;enumeration value="Weight"/>
     *               &lt;enumeration value="Length"/>
     *               &lt;enumeration value="NumberOfItemsInPackage"/>
     *               &lt;enumeration value="Length-PatternName"/>
     *               &lt;enumeration value="Length-StyleName"/>
     *               &lt;enumeration value="Width-PatternName"/>
     *               &lt;enumeration value="Width-StyleName"/>
     *               &lt;enumeration value="Occasion-PatternName"/>
     *               &lt;enumeration value="Occasion-NumberOfItemsInPackage"/>
     *               &lt;enumeration value="Occasion-Material"/>
     *               &lt;enumeration value="Occasion-StyleName"/>
     *               &lt;enumeration value="Occasion-Size"/>
     *               &lt;enumeration value="Occasion-Color"/>
     *               &lt;enumeration value="Occasion-Height"/>
     *               &lt;enumeration value="PatternName-Length"/>
     *               &lt;enumeration value="PatternName-Width"/>
     *               &lt;enumeration value="PatternName-Occasion"/>
     *               &lt;enumeration value="PatternName-Material"/>
     *               &lt;enumeration value="PatternName-StyleName"/>
     *               &lt;enumeration value="PatternName-Size"/>
     *               &lt;enumeration value="PatternName-Color"/>
     *               &lt;enumeration value="PatternName-Height"/>
     *               &lt;enumeration value="MatteStyle-Material"/>
     *               &lt;enumeration value="MatteStyle-StyleName"/>
     *               &lt;enumeration value="MatteStyle-Size"/>
     *               &lt;enumeration value="MatteStyle-Color"/>
     *               &lt;enumeration value="NumberOfItemsInPackage-Occasion"/>
     *               &lt;enumeration value="NumberOfItemsInPackage-StyleName"/>
     *               &lt;enumeration value="Weight-StyleName"/>
     *               &lt;enumeration value="Material-PatternName"/>
     *               &lt;enumeration value="Material-MatteStyle"/>
     *               &lt;enumeration value="Material-StyleName"/>
     *               &lt;enumeration value="StyleName-Length"/>
     *               &lt;enumeration value="StyleName-Width"/>
     *               &lt;enumeration value="StyleName-Occasion"/>
     *               &lt;enumeration value="StyleName-PatternName"/>
     *               &lt;enumeration value="StyleName-Weight"/>
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
     *               &lt;enumeration value="Weight-Length-Color"/>
     *               &lt;enumeration value="Occasion-Size-Color"/>
     *               &lt;enumeration value="Weight-Length-Material"/>
     *               &lt;enumeration value="Weight-Length-StyleName"/>
     *               &lt;enumeration value="PatternName-Size-Occasion"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
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
        "variationTheme",
        "size",
        "color"
    })
    public static class VariationData {

        @XmlElement(name = "Parentage")
        protected String parentage;
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

    }

}
