
package com.elcuk.jaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ProductType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="SportingGoods"/>
 *               &lt;enumeration value="GolfClubHybrid"/>
 *               &lt;enumeration value="GolfClubIron"/>
 *               &lt;enumeration value="GolfClubPutter"/>
 *               &lt;enumeration value="GolfClubWedge"/>
 *               &lt;enumeration value="GolfClubWood"/>
 *               &lt;enumeration value="GolfClubs"/>
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
 *                         &lt;enumeration value="AgeGenderCategory"/>
 *                         &lt;enumeration value="Amperage"/>
 *                         &lt;enumeration value="BikeRimSize"/>
 *                         &lt;enumeration value="BikeRimSizeMaterial"/>
 *                         &lt;enumeration value="BootSize"/>
 *                         &lt;enumeration value="BootSizeCalfSize"/>
 *                         &lt;enumeration value="CalfSize"/>
 *                         &lt;enumeration value="Caliber"/>
 *                         &lt;enumeration value="CaliberRounds"/>
 *                         &lt;enumeration value="Capacity"/>
 *                         &lt;enumeration value="Color"/>
 *                         &lt;enumeration value="ColorDesign"/>
 *                         &lt;enumeration value="ColorFlavor"/>
 *                         &lt;enumeration value="ColorItemThickness"/>
 *                         &lt;enumeration value="ColorLength"/>
 *                         &lt;enumeration value="ColorLensColor"/>
 *                         &lt;enumeration value="ColorQuantity"/>
 *                         &lt;enumeration value="ColorRounds"/>
 *                         &lt;enumeration value="ColorShaftMaterial"/>
 *                         &lt;enumeration value="ColorShaftType"/>
 *                         &lt;enumeration value="ColorShape"/>
 *                         &lt;enumeration value="ColorSize"/>
 *                         &lt;enumeration value="ColorStyle"/>
 *                         &lt;enumeration value="ColorTensionLevel"/>
 *                         &lt;enumeration value="ColorWattage"/>
 *                         &lt;enumeration value="ColorWeight"/>
 *                         &lt;enumeration value="ColorWheelSize"/>
 *                         &lt;enumeration value="ColorWidth"/>
 *                         &lt;enumeration value="Curvature"/>
 *                         &lt;enumeration value="CurvatureHand"/>
 *                         &lt;enumeration value="Design"/>
 *                         &lt;enumeration value="DesignFlavor"/>
 *                         &lt;enumeration value="DesignLength"/>
 *                         &lt;enumeration value="DesignLensColor"/>
 *                         &lt;enumeration value="DesignShaftMaterial"/>
 *                         &lt;enumeration value="DesignShaftType"/>
 *                         &lt;enumeration value="DesignShape"/>
 *                         &lt;enumeration value="DesignSize"/>
 *                         &lt;enumeration value="DesignStyle"/>
 *                         &lt;enumeration value="DesignTensionLevel"/>
 *                         &lt;enumeration value="DesignWeight"/>
 *                         &lt;enumeration value="DesignWheelSize"/>
 *                         &lt;enumeration value="DesignWidth"/>
 *                         &lt;enumeration value="Diameter"/>
 *                         &lt;enumeration value="DivingHoodThickness"/>
 *                         &lt;enumeration value="FencingPommelType"/>
 *                         &lt;enumeration value="FencingPommelTypeGripType"/>
 *                         &lt;enumeration value="Flavor"/>
 *                         &lt;enumeration value="FlavorSize"/>
 *                         &lt;enumeration value="GolfFlex"/>
 *                         &lt;enumeration value="GolfFlexGolfLoft"/>
 *                         &lt;enumeration value="GolfFlexMaterial"/>
 *                         &lt;enumeration value="GolfFlexShaftMaterial"/>
 *                         &lt;enumeration value="GolfLoft"/>
 *                         &lt;enumeration value="GolfLoftShaftMaterial"/>
 *                         &lt;enumeration value="GripSize"/>
 *                         &lt;enumeration value="GripSizeGripType"/>
 *                         &lt;enumeration value="GripSizeHeadSize"/>
 *                         &lt;enumeration value="GripType"/>
 *                         &lt;enumeration value="Hand"/>
 *                         &lt;enumeration value="HandBounceGolfFlex"/>
 *                         &lt;enumeration value="HandBounceShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HandClubGolfFlex"/>
 *                         &lt;enumeration value="HandClubShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HandGolfFlex"/>
 *                         &lt;enumeration value="HandIronsGolfFlex"/>
 *                         &lt;enumeration value="HandIronsLieAngleGolfFlex"/>
 *                         &lt;enumeration value="HandIronsLieAngleShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HandIronsShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HandLength"/>
 *                         &lt;enumeration value="HandLieAngle"/>
 *                         &lt;enumeration value="HandLieAngleGolfFlex"/>
 *                         &lt;enumeration value="HandLieAngleLength"/>
 *                         &lt;enumeration value="HandLieAngleShaftType"/>
 *                         &lt;enumeration value="HandLieAngleShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HandLieAngleShaftTypeLength"/>
 *                         &lt;enumeration value="HandGolfLoftBounceGolfFlex"/>
 *                         &lt;enumeration value="HandGolfLoftBounceShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HandGolfLoftGolfFlex"/>
 *                         &lt;enumeration value="HandGolfLoftShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HandModel"/>
 *                         &lt;enumeration value="HandModelLength"/>
 *                         &lt;enumeration value="HandModelShaftType"/>
 *                         &lt;enumeration value="HandModelShaftTypeLength"/>
 *                         &lt;enumeration value="HandShaftLength"/>
 *                         &lt;enumeration value="HandShaftMaterialGolfFlex"/>
 *                         &lt;enumeration value="HandShaftMaterialGolfFlexGolfLoft"/>
 *                         &lt;enumeration value="HandShaftType"/>
 *                         &lt;enumeration value="HandShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HandShaftTypeLength"/>
 *                         &lt;enumeration value="HandSize"/>
 *                         &lt;enumeration value="HandTensionLevel"/>
 *                         &lt;enumeration value="HandWeight"/>
 *                         &lt;enumeration value="HandWoodGolfFlex"/>
 *                         &lt;enumeration value="HandWoodShaftTypeGolfFlex"/>
 *                         &lt;enumeration value="HeadSize"/>
 *                         &lt;enumeration value="HeadSizeShape"/>
 *                         &lt;enumeration value="Height"/>
 *                         &lt;enumeration value="HeightSize"/>
 *                         &lt;enumeration value="HeightStyle"/>
 *                         &lt;enumeration value="HeightWeight"/>
 *                         &lt;enumeration value="HeightWidth"/>
 *                         &lt;enumeration value="ItemThickness"/>
 *                         &lt;enumeration value="Length"/>
 *                         &lt;enumeration value="LengthLineCapacity"/>
 *                         &lt;enumeration value="LengthLineWeight"/>
 *                         &lt;enumeration value="LengthMaterial"/>
 *                         &lt;enumeration value="LengthShaftType"/>
 *                         &lt;enumeration value="LengthSize"/>
 *                         &lt;enumeration value="LengthStyle"/>
 *                         &lt;enumeration value="LengthWeight"/>
 *                         &lt;enumeration value="LengthWeightSupported"/>
 *                         &lt;enumeration value="LengthWidth"/>
 *                         &lt;enumeration value="LensColor"/>
 *                         &lt;enumeration value="LensColorMaterial"/>
 *                         &lt;enumeration value="LensColorShape"/>
 *                         &lt;enumeration value="LineCapacity"/>
 *                         &lt;enumeration value="LineCapacitySize"/>
 *                         &lt;enumeration value="LineCapacityWeight"/>
 *                         &lt;enumeration value="LineWeight"/>
 *                         &lt;enumeration value="LineWeightSize"/>
 *                         &lt;enumeration value="Material"/>
 *                         &lt;enumeration value="MaterialShape"/>
 *                         &lt;enumeration value="MaterialSize"/>
 *                         &lt;enumeration value="MaterialStyle"/>
 *                         &lt;enumeration value="MaterialTensionLevel"/>
 *                         &lt;enumeration value="MaterialWeight"/>
 *                         &lt;enumeration value="MaterialWheelSize"/>
 *                         &lt;enumeration value="MaterialWidth"/>
 *                         &lt;enumeration value="Quantity"/>
 *                         &lt;enumeration value="QuantityShape"/>
 *                         &lt;enumeration value="QuantitySize"/>
 *                         &lt;enumeration value="QuantityWeight"/>
 *                         &lt;enumeration value="Rounds"/>
 *                         &lt;enumeration value="RoundsSize"/>
 *                         &lt;enumeration value="ShaftMaterial"/>
 *                         &lt;enumeration value="ShaftMaterialShaftType"/>
 *                         &lt;enumeration value="ShaftType"/>
 *                         &lt;enumeration value="Shape"/>
 *                         &lt;enumeration value="ShapeSize"/>
 *                         &lt;enumeration value="ShapeTensionLevel"/>
 *                         &lt;enumeration value="ShapeWeight"/>
 *                         &lt;enumeration value="Size"/>
 *                         &lt;enumeration value="SizeStyle"/>
 *                         &lt;enumeration value="SizeTensionLevel"/>
 *                         &lt;enumeration value="SizeWattage"/>
 *                         &lt;enumeration value="SizeWeight"/>
 *                         &lt;enumeration value="SizeWeightSupported"/>
 *                         &lt;enumeration value="SizeWheelSize"/>
 *                         &lt;enumeration value="SizeWidth"/>
 *                         &lt;enumeration value="StyleTensionLevel"/>
 *                         &lt;enumeration value="StyleWeight"/>
 *                         &lt;enumeration value="StyleWheelSize"/>
 *                         &lt;enumeration value="StyleWidth"/>
 *                         &lt;enumeration value="TemperatureRating"/>
 *                         &lt;enumeration value="TemperatureRatingColor"/>
 *                         &lt;enumeration value="TemperatureRatingDesign"/>
 *                         &lt;enumeration value="TemperatureRatingHand"/>
 *                         &lt;enumeration value="TemperatureRatingLength"/>
 *                         &lt;enumeration value="TemperatureRatingMaterial"/>
 *                         &lt;enumeration value="TemperatureRatingShape"/>
 *                         &lt;enumeration value="TemperatureRatingSize"/>
 *                         &lt;enumeration value="TensionLevel"/>
 *                         &lt;enumeration value="TensionLevelWeight"/>
 *                         &lt;enumeration value="TensionLevelWeightSupported"/>
 *                         &lt;enumeration value="Wattage"/>
 *                         &lt;enumeration value="Weight"/>
 *                         &lt;enumeration value="WeightSupported"/>
 *                         &lt;enumeration value="WeightWidth"/>
 *                         &lt;enumeration value="WheelSize"/>
 *                         &lt;enumeration value="WheelSizeWeight"/>
 *                         &lt;enumeration value="Width"/>
 *                         &lt;enumeration value="CustomerPackageType"/>
 *                         &lt;enumeration value="ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
 *                         &lt;enumeration value="StyleName-CustomerPackageType"/>
 *                         &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AgeGenderCategory" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Amperage" type="{}AmperageDimension" minOccurs="0"/>
 *                   &lt;element name="BikeRimSize" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="BootSize" type="{}Dimension" minOccurs="0"/>
 *                   &lt;element name="Bounce" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="CalfSize" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Caliber" type="{}FourDecimal" minOccurs="0"/>
 *                   &lt;element name="Capacity" type="{}VolumeDimension" minOccurs="0"/>
 *                   &lt;element name="Club" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Curvature" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Department" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="Design" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Diameter" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="DivingHoodThickness" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="FencingPommelType" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Flavor" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="GolfFlex" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="GolfLoft" type="{}DegreeDimension" minOccurs="0"/>
 *                   &lt;element name="GripSize" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="GripType" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Hand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HeadSize" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Height" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="Irons" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="ItemThickness" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="Length" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="LensColor" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="LieAngle" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="LineCapacity" type="{}OptionalLineCapacityDimension" minOccurs="0"/>
 *                   &lt;element name="LineWeight" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Model" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="Occupancy" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="Rounds" type="{}PositiveInteger" minOccurs="0"/>
 *                   &lt;element name="ShaftLength" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="ShaftMaterial" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="ShaftType" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Shape" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Style" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="TemperatureRating" type="{}TemperatureRatingDimension" minOccurs="0"/>
 *                   &lt;element name="TensionLevel" type="{}StringNotNull" minOccurs="0"/>
 *                   &lt;element name="Volume" type="{}VolumeDimension" minOccurs="0"/>
 *                   &lt;element name="Wattage" type="{}WattageDimension" minOccurs="0"/>
 *                   &lt;element name="Weight" type="{}WeightDimension" minOccurs="0"/>
 *                   &lt;element name="WeightSupported" type="{}WeightDimension" minOccurs="0"/>
 *                   &lt;element name="WheelSize" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="Width" type="{}LengthDimension" minOccurs="0"/>
 *                   &lt;element name="Wood" type="{}StringNotNull" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaterialComposition" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Packaging" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IsCustomizable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomizableTemplateName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IsAdultProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ModelYear" type="{}FourDigitYear" minOccurs="0"/>
 *         &lt;element name="Season" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="AccessLocation" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Action" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ActiveIngredients" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Alarm" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ApparentScaleSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="AvailableCourses" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BackingLineCapacity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BaseLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLife" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLifeStandby" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryChargeTime" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryLife" type="{}AssemblyTimeDimension" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumIon" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumMetal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BeamWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BearingMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BeltStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BikeWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="BladeGrind" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BladeLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BladeShape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BladeType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BMXBikeType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BoatFenderDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BoilRateDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BoomLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BottomStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BrakeType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BrakeWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BreakingStrength" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="BTUs" type="{}OptionalEnergyOutputDimension" minOccurs="0"/>
 *         &lt;element name="Buildup" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BulbType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BurnTime" type="{}BurnTimeDimension" minOccurs="0"/>
 *         &lt;element name="CanShipInOriginalContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Capability" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CapType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CareInstructions" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CenterlineLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ClosureType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CollarType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CompatibleDevices" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CompatibleHoseDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CompatibleRopeDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Construction" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ControlProgramName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CoreMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CountryAsLabeled" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="CourseCapacity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CoverageArea" type="{}AreaDimension" minOccurs="0"/>
 *         &lt;element name="CrankLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="CuffType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CupSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Cycles" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DeckLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DeckWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Directions" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayFeatures" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplaySize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="EffectiveEdgeLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="EngineDisplacement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="unitOfMeasure">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="CID"/>
 *                       &lt;enumeration value="l"/>
 *                       &lt;enumeration value="cc"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EventName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Eye" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="FabricType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FabricWash" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FillMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FishingLineType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FishType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FittingType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FitType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FloorArea" type="{}AreaDimension" minOccurs="0"/>
 *         &lt;element name="FloorLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="FloorWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="FlyLineNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="FoldedLength" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FrameHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="FrameMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FrameType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FrequencyBand" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FrontPleatType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FuelCapacity" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="FuelType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Functions" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FurDescription" type="{}LongString" minOccurs="0"/>
 *         &lt;element name="GearDirection" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GeographicCoverage" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GloveType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GripMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GuardMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HandleMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HandleType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HeatRating" type="{}TemperatureRatingDimension" minOccurs="0"/>
 *         &lt;element name="HP" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="HullShape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IdentityPackageType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="bulk"/>
 *               &lt;enumeration value="frustration_free"/>
 *               &lt;enumeration value="traditional"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImportDesignation" type="{}String" minOccurs="0"/>
 *         &lt;element name="ImpactForce" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="Ingredients" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Inseam" type="{}OptionalLengthIntegerDimension" minOccurs="0"/>
 *         &lt;element name="InsulationType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Intensity" type="{}OptionalLuminiousIntensityDimension" minOccurs="0"/>
 *         &lt;element name="IsAssemblyRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemTypeName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IsSigned" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="JerseyType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="KnifeFunction" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LampType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LaptopCapacity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LashLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="LeagueName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LegStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LensMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LensShape" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LifeVestType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LightIntensity" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="LineWeight" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LiningMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryEnergyContent" type="{}OptionalEnergyConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryPackaging" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="batteries_contained_in_equipment"/>
 *               &lt;enumeration value="batteries_only"/>
 *               &lt;enumeration value="batteries_packed_with_equipment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LithiumBatteryVoltage" type="{}OptionalVoltageDecimalDimension" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryWeight" type="{}OptionalWeightDimension" minOccurs="0"/>
 *         &lt;element name="LoadCapacity" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="LockType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Loudness" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="LureWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="ManufacturerDefinedQualityDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MartialArtsType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumCompatibleBootSize" type="{}BootSizeDimension" minOccurs="0"/>
 *         &lt;element name="MaximumCompatibleRopeDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumInclinePercentage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MaximumLegSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumMagnification" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="MaximumPitchSpeed" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="unitOfMeasure">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="kilometer"/>
 *                       &lt;enumeration value="mph"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaximumResistance" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="MaximumStrideLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumTensionRating" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="MaximumUserWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="MaximumWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="MaxWeightRecommendation" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="MechanicalStructure" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Memory" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="MfrWarrantyDescriptionLabor" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfrWarrantyDescriptionParts" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfrWarrantyDescriptionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MinimumCompatibleBootSize" type="{}BootSizeDimension" minOccurs="0"/>
 *         &lt;element name="MinimumCompatibleRopeDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MinimumLegSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MinimumMagnification" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="MinimumTensionRating" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="MinimumTorsoFit" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MinimumWeightRecommendation" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="MonitorFeatures" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MotorSize" type="{}OptionalMotorSizeDimension" minOccurs="0"/>
 *         &lt;element name="MountainBikeProportionalFrameSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MountainBikeType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MountType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MovementType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NeckStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfBlades" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfCarriagePositions" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfDoors" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfExercises" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfFootPositions" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfGearLoops" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfHeadPositions" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfHolds" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfHorses" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLevels" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPages" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPockets" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPoles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPrograms" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfResistanceLevels" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfSpeeds" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfSprings" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ObjectiveLensSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="OperationMode" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Orientation" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OuterMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PackedSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PadType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PatternStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PeakHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="Pixels" type="{}OptionalResolutionDimension" minOccurs="0"/>
 *         &lt;element name="PlayerName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PocketDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PositionAccuracy" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PPUCount" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PPUCountType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ProportionalFrameSize" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="PullType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Range" type="{}StringLengthOptionalDimension" minOccurs="0"/>
 *         &lt;element name="RearDerailleurCompatibleChainSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="RecommendedWorkoutSpace" type="{}AreaDimensionOptionalUnit" minOccurs="0"/>
 *         &lt;element name="ReelDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ReelModel" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Region" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Resistance" type="{}OptionalResistanceDimension" minOccurs="0"/>
 *         &lt;element name="ResistanceMechanism" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RiseStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RoadBikeProportionalFrameSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="RoadBikeType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RodLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="RodWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="Routes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="R-Value" type="{}OptionalRValueDimension" minOccurs="0"/>
 *         &lt;element name="Scale" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScreenColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SeatHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="ShellMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ShirtType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ShoeWidth" type="{}StringLengthOptionalDimension" minOccurs="0"/>
 *         &lt;element name="SizeMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SkillLevel" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SkiStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SleepingCapacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="SleeveLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="SleeveType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SnowboardStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SockHeight" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SockStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SonarType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpecificUsageForProduct" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Speed" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeedRating" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Sport" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="State" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StaticElongationPercentage" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="StaticWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="StrapType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Strength" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="StyleKeywords" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SupportType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SuspensionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TargetGender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="male"/>
 *               &lt;enumeration value="female"/>
 *               &lt;enumeration value="unisex"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TargetZones" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="TeamName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TensionSupported" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="Theme" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ThreadSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TopStyle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TopTubeLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="TrailerType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TurnRadius" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="UIAAFallRating" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="UnderwireType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="UniformNumber" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="UsageCapacity" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="UVProtection" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="VolumeCapacityName" type="{}OptionalVolumeDimension" minOccurs="0"/>
 *         &lt;element name="WaistSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="WaistWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="WarmthRating" type="{}TemperatureRatingDimension" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Warranty" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="WaterBottleCapType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WaterResistanceRating" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="WaterType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="Watts" type="{}WattageDimension" minOccurs="0"/>
 *         &lt;element name="WayPoints" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="WeightCapacity" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="WhatsInTheBox" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="WheelType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ThreadPitch" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DriveSystem" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BladeMaterialType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SportsNumberOfPockets" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="WorkingLoadLimit" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="WatchMovementType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TankVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="PowerRating" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PatternType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OutputPower" type="{}OutputPowerDimension" minOccurs="0"/>
 *         &lt;element name="OpticalPower" type="{}OpticalPowerDimension" minOccurs="0"/>
 *         &lt;element name="MinimumHeightRecommendation" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="AgeRangeDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CollectionName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BandSizeNumber" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="BatteryCellComposition" type="{}BatteryCellTypeValues" minOccurs="0"/>
 *         &lt;element name="BatteryDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BatteryFormFactor" type="{}StringNotNull" minOccurs="0"/>
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
    "variationData",
    "materialComposition",
    "packaging",
    "isCustomizable",
    "customizableTemplateName",
    "isAdultProduct",
    "modelYear",
    "season",
    "accessLocation",
    "action",
    "activeIngredients",
    "alarm",
    "apparentScaleSize",
    "availableCourses",
    "backingLineCapacity",
    "baseLength",
    "battery",
    "batteryAverageLife",
    "batteryAverageLifeStandby",
    "batteryChargeTime",
    "batteryLife",
    "batteryTypeLithiumIon",
    "batteryTypeLithiumMetal",
    "beamWidth",
    "bearingMaterialType",
    "beltStyle",
    "bikeWeight",
    "bladeGrind",
    "bladeLength",
    "bladeShape",
    "bladeType",
    "bmxBikeType",
    "boatFenderDiameter",
    "boilRateDescription",
    "boomLength",
    "bottomStyle",
    "brakeType",
    "brakeWidth",
    "breakingStrength",
    "btUs",
    "buildup",
    "bulbType",
    "burnTime",
    "canShipInOriginalContainer",
    "capability",
    "capType",
    "careInstructions",
    "centerlineLength",
    "closureType",
    "collarType",
    "colorMap",
    "compatibleDevices",
    "compatibleHoseDiameter",
    "compatibleRopeDiameter",
    "construction",
    "controlProgramName",
    "coreMaterialType",
    "countryAsLabeled",
    "countryOfOrigin",
    "courseCapacity",
    "coverageArea",
    "crankLength",
    "cuffType",
    "cupSize",
    "cycles",
    "deckLength",
    "deckWidth",
    "directions",
    "displayFeatures",
    "displayLength",
    "displaySize",
    "displayType",
    "displayVolume",
    "displayWeight",
    "effectiveEdgeLength",
    "engineDisplacement",
    "eventName",
    "eye",
    "fabricType",
    "fabricWash",
    "fillMaterialType",
    "fishingLineType",
    "fishType",
    "fittingType",
    "fitType",
    "floorArea",
    "floorLength",
    "floorWidth",
    "flyLineNumber",
    "foldedLength",
    "frameHeight",
    "frameMaterial",
    "frameType",
    "frequencyBand",
    "frontPleatType",
    "fuelCapacity",
    "fuelType",
    "functions",
    "furDescription",
    "gearDirection",
    "geographicCoverage",
    "gloveType",
    "gripMaterialType",
    "guardMaterialType",
    "handleMaterial",
    "handleType",
    "heatRating",
    "hp",
    "hullShape",
    "identityPackageType",
    "importDesignation",
    "impactForce",
    "ingredients",
    "inseam",
    "insulationType",
    "intensity",
    "isAssemblyRequired",
    "itemTypeName",
    "isSigned",
    "jerseyType",
    "knifeFunction",
    "lampType",
    "laptopCapacity",
    "lashLength",
    "leagueName",
    "legStyle",
    "lensMaterial",
    "lensShape",
    "lifeVestType",
    "lightIntensity",
    "lineWeight",
    "liningMaterial",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "loadCapacity",
    "lockType",
    "loudness",
    "lureWeight",
    "manufacturerDefinedQualityDescription",
    "martialArtsType",
    "maximumCompatibleBootSize",
    "maximumCompatibleRopeDiameter",
    "maximumHeight",
    "maximumInclinePercentage",
    "maximumLegSize",
    "maximumMagnification",
    "maximumPitchSpeed",
    "maximumResistance",
    "maximumStrideLength",
    "maximumTensionRating",
    "maximumUserWeight",
    "maximumWeight",
    "maxWeightRecommendation",
    "mechanicalStructure",
    "memory",
    "mfrWarrantyDescriptionLabor",
    "mfrWarrantyDescriptionParts",
    "mfrWarrantyDescriptionType",
    "minimumCompatibleBootSize",
    "minimumCompatibleRopeDiameter",
    "minimumLegSize",
    "minimumMagnification",
    "minimumTensionRating",
    "minimumTorsoFit",
    "minimumWeightRecommendation",
    "monitorFeatures",
    "motorSize",
    "mountainBikeProportionalFrameSize",
    "mountainBikeType",
    "mountType",
    "movementType",
    "neckStyle",
    "numberOfBlades",
    "numberOfCarriagePositions",
    "numberOfDoors",
    "numberOfExercises",
    "numberOfFootPositions",
    "numberOfGearLoops",
    "numberOfHeadPositions",
    "numberOfHolds",
    "numberOfHorses",
    "numberOfLevels",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "numberOfPages",
    "numberOfPieces",
    "numberOfPockets",
    "numberOfPoles",
    "numberOfPrograms",
    "numberOfResistanceLevels",
    "numberOfSpeeds",
    "numberOfSprings",
    "objectiveLensSize",
    "operationMode",
    "orientation",
    "outerMaterialType",
    "packedSize",
    "padType",
    "patternStyle",
    "peakHeight",
    "pixels",
    "playerName",
    "pocketDescription",
    "positionAccuracy",
    "powerSource",
    "ppuCount",
    "ppuCountType",
    "proportionalFrameSize",
    "pullType",
    "range",
    "rearDerailleurCompatibleChainSize",
    "recommendedWorkoutSpace",
    "reelDiameter",
    "reelModel",
    "region",
    "resistance",
    "resistanceMechanism",
    "resolution",
    "riseStyle",
    "roadBikeProportionalFrameSize",
    "roadBikeType",
    "rodLength",
    "rodWeight",
    "routes",
    "rValue",
    "scale",
    "screenColor",
    "screenSize",
    "seatHeight",
    "seatingCapacity",
    "sellerWarrantyDescription",
    "shellMaterial",
    "shirtType",
    "shoeWidth",
    "sizeMap",
    "skillLevel",
    "skiStyle",
    "sleepingCapacity",
    "sleeveLength",
    "sleeveType",
    "snowboardStyle",
    "sockHeight",
    "sockStyle",
    "sonarType",
    "specialFeatures",
    "specificUsageForProduct",
    "speed",
    "speedRating",
    "sport",
    "state",
    "staticElongationPercentage",
    "staticWeight",
    "strapType",
    "strength",
    "styleKeywords",
    "supportType",
    "suspensionType",
    "targetGender",
    "targetZones",
    "teamName",
    "tensionSupported",
    "theme",
    "threadSize",
    "topStyle",
    "topTubeLength",
    "trailerType",
    "turnRadius",
    "uiaaFallRating",
    "underwireType",
    "uniformNumber",
    "usageCapacity",
    "uvProtection",
    "volumeCapacityName",
    "waistSize",
    "waistWidth",
    "warmthRating",
    "warnings",
    "warranty",
    "waterBottleCapType",
    "waterResistanceRating",
    "waterType",
    "wattage",
    "watts",
    "wayPoints",
    "weightCapacity",
    "whatsInTheBox",
    "wheelType",
    "threadPitch",
    "driveSystem",
    "bladeMaterialType",
    "sportsNumberOfPockets",
    "workingLoadLimit",
    "watchMovementType",
    "tankVolume",
    "powerRating",
    "patternType",
    "outputPower",
    "opticalPower",
    "minimumHeightRecommendation",
    "itemDiameter",
    "ageRangeDescription",
    "collectionName",
    "bandSizeNumber",
    "batteryCellComposition",
    "batteryDescription",
    "batteryFormFactor"
})
@XmlRootElement(name = "Sports")
public class Sports {

    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "VariationData")
    protected Sports.VariationData variationData;
    @XmlElement(name = "MaterialComposition")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String materialComposition;
    @XmlElement(name = "Packaging")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String packaging;
    @XmlElement(name = "IsCustomizable")
    protected Boolean isCustomizable;
    @XmlElement(name = "CustomizableTemplateName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String customizableTemplateName;
    @XmlElement(name = "IsAdultProduct")
    protected Boolean isAdultProduct;
    @XmlElement(name = "ModelYear")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger modelYear;
    @XmlElement(name = "Season")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String season;
    @XmlElement(name = "AccessLocation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accessLocation;
    @XmlElement(name = "Action")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String action;
    @XmlElement(name = "ActiveIngredients")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String activeIngredients;
    @XmlElement(name = "Alarm")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String alarm;
    @XmlElement(name = "ApparentScaleSize")
    protected LengthDimension apparentScaleSize;
    @XmlElement(name = "AvailableCourses")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String availableCourses;
    @XmlElement(name = "BackingLineCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String backingLineCapacity;
    @XmlElement(name = "BaseLength")
    protected LengthDimension baseLength;
    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "BatteryAverageLife")
    protected BigDecimal batteryAverageLife;
    @XmlElement(name = "BatteryAverageLifeStandby")
    protected BigDecimal batteryAverageLifeStandby;
    @XmlElement(name = "BatteryChargeTime")
    protected BigDecimal batteryChargeTime;
    @XmlElement(name = "BatteryLife")
    protected List<AssemblyTimeDimension> batteryLife;
    @XmlElement(name = "BatteryTypeLithiumIon")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumIon;
    @XmlElement(name = "BatteryTypeLithiumMetal")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumMetal;
    @XmlElement(name = "BeamWidth")
    protected LengthDimension beamWidth;
    @XmlElement(name = "BearingMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bearingMaterialType;
    @XmlElement(name = "BeltStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String beltStyle;
    @XmlElement(name = "BikeWeight")
    protected WeightDimension bikeWeight;
    @XmlElement(name = "BladeGrind")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeGrind;
    @XmlElement(name = "BladeLength")
    protected LengthDimension bladeLength;
    @XmlElement(name = "BladeShape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeShape;
    @XmlElement(name = "BladeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeType;
    @XmlElement(name = "BMXBikeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bmxBikeType;
    @XmlElement(name = "BoatFenderDiameter")
    protected LengthDimension boatFenderDiameter;
    @XmlElement(name = "BoilRateDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String boilRateDescription;
    @XmlElement(name = "BoomLength")
    protected LengthDimension boomLength;
    @XmlElement(name = "BottomStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bottomStyle;
    @XmlElement(name = "BrakeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String brakeType;
    @XmlElement(name = "BrakeWidth")
    protected LengthDimension brakeWidth;
    @XmlElement(name = "BreakingStrength")
    protected WeightDimension breakingStrength;
    @XmlElement(name = "BTUs")
    protected OptionalEnergyOutputDimension btUs;
    @XmlElement(name = "Buildup")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String buildup;
    @XmlElement(name = "BulbType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bulbType;
    @XmlElement(name = "BurnTime")
    protected BurnTimeDimension burnTime;
    @XmlElement(name = "CanShipInOriginalContainer")
    protected Boolean canShipInOriginalContainer;
    @XmlElement(name = "Capability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String capability;
    @XmlElement(name = "CapType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String capType;
    @XmlElement(name = "CareInstructions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String careInstructions;
    @XmlElement(name = "CenterlineLength")
    protected LengthDimension centerlineLength;
    @XmlElement(name = "ClosureType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String closureType;
    @XmlElement(name = "CollarType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String collarType;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "CompatibleDevices")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String compatibleDevices;
    @XmlElement(name = "CompatibleHoseDiameter")
    protected LengthDimension compatibleHoseDiameter;
    @XmlElement(name = "CompatibleRopeDiameter")
    protected LengthDimension compatibleRopeDiameter;
    @XmlElement(name = "Construction")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String construction;
    @XmlElement(name = "ControlProgramName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String controlProgramName;
    @XmlElement(name = "CoreMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coreMaterialType;
    @XmlElement(name = "CountryAsLabeled")
    protected String countryAsLabeled;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "CourseCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String courseCapacity;
    @XmlElement(name = "CoverageArea")
    protected AreaDimension coverageArea;
    @XmlElement(name = "CrankLength")
    protected LengthDimension crankLength;
    @XmlElement(name = "CuffType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cuffType;
    @XmlElement(name = "CupSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cupSize;
    @XmlElement(name = "Cycles")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cycles;
    @XmlElement(name = "DeckLength")
    protected LengthDimension deckLength;
    @XmlElement(name = "DeckWidth")
    protected LengthDimension deckWidth;
    @XmlElement(name = "Directions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String directions;
    @XmlElement(name = "DisplayFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayFeatures;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "DisplaySize")
    protected LengthDimension displaySize;
    @XmlElement(name = "DisplayType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayType;
    @XmlElement(name = "DisplayVolume")
    protected VolumeDimension displayVolume;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "EffectiveEdgeLength")
    protected LengthDimension effectiveEdgeLength;
    @XmlElement(name = "EngineDisplacement")
    protected Sports.EngineDisplacement engineDisplacement;
    @XmlElement(name = "EventName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String eventName;
    @XmlElement(name = "Eye")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger eye;
    @XmlElement(name = "FabricType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fabricType;
    @XmlElement(name = "FabricWash")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fabricWash;
    @XmlElement(name = "FillMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fillMaterialType;
    @XmlElement(name = "FishingLineType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fishingLineType;
    @XmlElement(name = "FishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fishType;
    @XmlElement(name = "FittingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fittingType;
    @XmlElement(name = "FitType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fitType;
    @XmlElement(name = "FloorArea")
    protected AreaDimension floorArea;
    @XmlElement(name = "FloorLength")
    protected LengthDimension floorLength;
    @XmlElement(name = "FloorWidth")
    protected LengthDimension floorWidth;
    @XmlElement(name = "FlyLineNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger flyLineNumber;
    @XmlElement(name = "FoldedLength")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String foldedLength;
    @XmlElement(name = "FrameHeight")
    protected LengthDimension frameHeight;
    @XmlElement(name = "FrameMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String frameMaterial;
    @XmlElement(name = "FrameType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String frameType;
    @XmlElement(name = "FrequencyBand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String frequencyBand;
    @XmlElement(name = "FrontPleatType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String frontPleatType;
    @XmlElement(name = "FuelCapacity")
    protected VolumeDimension fuelCapacity;
    @XmlElement(name = "FuelType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fuelType;
    @XmlElement(name = "Functions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String functions;
    @XmlElement(name = "FurDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String furDescription;
    @XmlElement(name = "GearDirection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gearDirection;
    @XmlElement(name = "GeographicCoverage")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String geographicCoverage;
    @XmlElement(name = "GloveType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gloveType;
    @XmlElement(name = "GripMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gripMaterialType;
    @XmlElement(name = "GuardMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String guardMaterialType;
    @XmlElement(name = "HandleMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String handleMaterial;
    @XmlElement(name = "HandleType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String handleType;
    @XmlElement(name = "HeatRating")
    protected TemperatureRatingDimension heatRating;
    @XmlElement(name = "HP")
    protected BigDecimal hp;
    @XmlElement(name = "HullShape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hullShape;
    @XmlElement(name = "IdentityPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identityPackageType;
    @XmlElement(name = "ImportDesignation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String importDesignation;
    @XmlElement(name = "ImpactForce")
    protected BigDecimal impactForce;
    @XmlElement(name = "Ingredients")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ingredients;
    @XmlElement(name = "Inseam")
    protected OptionalLengthIntegerDimension inseam;
    @XmlElement(name = "InsulationType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String insulationType;
    @XmlElement(name = "Intensity")
    protected OptionalLuminiousIntensityDimension intensity;
    @XmlElement(name = "IsAssemblyRequired")
    protected Boolean isAssemblyRequired;
    @XmlElement(name = "ItemTypeName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemTypeName;
    @XmlElement(name = "IsSigned")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String isSigned;
    @XmlElement(name = "JerseyType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String jerseyType;
    @XmlElement(name = "KnifeFunction")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String knifeFunction;
    @XmlElement(name = "LampType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lampType;
    @XmlElement(name = "LaptopCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String laptopCapacity;
    @XmlElement(name = "LashLength")
    protected LengthDimension lashLength;
    @XmlElement(name = "LeagueName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String leagueName;
    @XmlElement(name = "LegStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String legStyle;
    @XmlElement(name = "LensMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lensMaterial;
    @XmlElement(name = "LensShape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lensShape;
    @XmlElement(name = "LifeVestType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lifeVestType;
    @XmlElement(name = "LightIntensity")
    protected BigDecimal lightIntensity;
    @XmlElement(name = "LineWeight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lineWeight;
    @XmlElement(name = "LiningMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String liningMaterial;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    protected OptionalEnergyConsumptionDimension lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    protected OptionalVoltageDecimalDimension lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    protected OptionalWeightDimension lithiumBatteryWeight;
    @XmlElement(name = "LoadCapacity")
    protected WeightDimension loadCapacity;
    @XmlElement(name = "LockType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lockType;
    @XmlElement(name = "Loudness")
    protected BigDecimal loudness;
    @XmlElement(name = "LureWeight")
    protected WeightDimension lureWeight;
    @XmlElement(name = "ManufacturerDefinedQualityDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String manufacturerDefinedQualityDescription;
    @XmlElement(name = "MartialArtsType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String martialArtsType;
    @XmlElement(name = "MaximumCompatibleBootSize")
    protected BootSizeDimension maximumCompatibleBootSize;
    @XmlElement(name = "MaximumCompatibleRopeDiameter")
    protected LengthDimension maximumCompatibleRopeDiameter;
    @XmlElement(name = "MaximumHeight")
    protected LengthDimension maximumHeight;
    @XmlElement(name = "MaximumInclinePercentage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumInclinePercentage;
    @XmlElement(name = "MaximumLegSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maximumLegSize;
    @XmlElement(name = "MaximumMagnification")
    protected BigDecimal maximumMagnification;
    @XmlElement(name = "MaximumPitchSpeed")
    protected Sports.MaximumPitchSpeed maximumPitchSpeed;
    @XmlElement(name = "MaximumResistance")
    protected WeightDimension maximumResistance;
    @XmlElement(name = "MaximumStrideLength")
    protected LengthDimension maximumStrideLength;
    @XmlElement(name = "MaximumTensionRating")
    protected WeightDimension maximumTensionRating;
    @XmlElement(name = "MaximumUserWeight")
    protected WeightDimension maximumUserWeight;
    @XmlElement(name = "MaximumWeight")
    protected WeightDimension maximumWeight;
    @XmlElement(name = "MaxWeightRecommendation")
    protected WeightDimension maxWeightRecommendation;
    @XmlElement(name = "MechanicalStructure")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mechanicalStructure;
    @XmlElement(name = "Memory")
    protected MemorySizeDimension memory;
    @XmlElement(name = "MfrWarrantyDescriptionLabor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfrWarrantyDescriptionLabor;
    @XmlElement(name = "MfrWarrantyDescriptionParts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfrWarrantyDescriptionParts;
    @XmlElement(name = "MfrWarrantyDescriptionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfrWarrantyDescriptionType;
    @XmlElement(name = "MinimumCompatibleBootSize")
    protected BootSizeDimension minimumCompatibleBootSize;
    @XmlElement(name = "MinimumCompatibleRopeDiameter")
    protected LengthDimension minimumCompatibleRopeDiameter;
    @XmlElement(name = "MinimumLegSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String minimumLegSize;
    @XmlElement(name = "MinimumMagnification")
    protected BigDecimal minimumMagnification;
    @XmlElement(name = "MinimumTensionRating")
    protected WeightDimension minimumTensionRating;
    @XmlElement(name = "MinimumTorsoFit")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String minimumTorsoFit;
    @XmlElement(name = "MinimumWeightRecommendation")
    protected WeightDimension minimumWeightRecommendation;
    @XmlElement(name = "MonitorFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String monitorFeatures;
    @XmlElement(name = "MotorSize")
    protected OptionalMotorSizeDimension motorSize;
    @XmlElement(name = "MountainBikeProportionalFrameSize")
    protected LengthDimension mountainBikeProportionalFrameSize;
    @XmlElement(name = "MountainBikeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountainBikeType;
    @XmlElement(name = "MountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountType;
    @XmlElement(name = "MovementType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String movementType;
    @XmlElement(name = "NeckStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String neckStyle;
    @XmlElement(name = "NumberOfBlades")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBlades;
    @XmlElement(name = "NumberOfCarriagePositions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfCarriagePositions;
    @XmlElement(name = "NumberOfDoors")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDoors;
    @XmlElement(name = "NumberOfExercises")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfExercises;
    @XmlElement(name = "NumberOfFootPositions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfFootPositions;
    @XmlElement(name = "NumberOfGearLoops")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfGearLoops;
    @XmlElement(name = "NumberOfHeadPositions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHeadPositions;
    @XmlElement(name = "NumberOfHolds")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHolds;
    @XmlElement(name = "NumberOfHorses")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHorses;
    @XmlElement(name = "NumberOfLevels")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLevels;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "NumberOfPages")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPages;
    @XmlElement(name = "NumberOfPieces")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPieces;
    @XmlElement(name = "NumberOfPockets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPockets;
    @XmlElement(name = "NumberOfPoles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPoles;
    @XmlElement(name = "NumberOfPrograms")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfPrograms;
    @XmlElement(name = "NumberOfResistanceLevels")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfResistanceLevels;
    @XmlElement(name = "NumberOfSpeeds")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSpeeds;
    @XmlElement(name = "NumberOfSprings")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSprings;
    @XmlElement(name = "ObjectiveLensSize")
    protected LengthDimension objectiveLensSize;
    @XmlElement(name = "OperationMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String operationMode;
    @XmlElement(name = "Orientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String orientation;
    @XmlElement(name = "OuterMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String outerMaterialType;
    @XmlElement(name = "PackedSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String packedSize;
    @XmlElement(name = "PadType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String padType;
    @XmlElement(name = "PatternStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String patternStyle;
    @XmlElement(name = "PeakHeight")
    protected LengthDimension peakHeight;
    @XmlElement(name = "Pixels")
    protected OptionalResolutionDimension pixels;
    @XmlElement(name = "PlayerName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String playerName;
    @XmlElement(name = "PocketDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pocketDescription;
    @XmlElement(name = "PositionAccuracy")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String positionAccuracy;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "PPUCount")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ppuCount;
    @XmlElement(name = "PPUCountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ppuCountType;
    @XmlElement(name = "ProportionalFrameSize")
    protected BigDecimal proportionalFrameSize;
    @XmlElement(name = "PullType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pullType;
    @XmlElement(name = "Range")
    protected StringLengthOptionalDimension range;
    @XmlElement(name = "RearDerailleurCompatibleChainSize")
    protected LengthDimension rearDerailleurCompatibleChainSize;
    @XmlElement(name = "RecommendedWorkoutSpace")
    protected AreaDimensionOptionalUnit recommendedWorkoutSpace;
    @XmlElement(name = "ReelDiameter")
    protected LengthDimension reelDiameter;
    @XmlElement(name = "ReelModel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String reelModel;
    @XmlElement(name = "Region")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String region;
    @XmlElement(name = "Resistance")
    protected OptionalResistanceDimension resistance;
    @XmlElement(name = "ResistanceMechanism")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String resistanceMechanism;
    @XmlElement(name = "Resolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String resolution;
    @XmlElement(name = "RiseStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String riseStyle;
    @XmlElement(name = "RoadBikeProportionalFrameSize")
    protected LengthDimension roadBikeProportionalFrameSize;
    @XmlElement(name = "RoadBikeType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String roadBikeType;
    @XmlElement(name = "RodLength")
    protected LengthDimension rodLength;
    @XmlElement(name = "RodWeight")
    protected WeightDimension rodWeight;
    @XmlElement(name = "Routes")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger routes;
    @XmlElement(name = "R-Value")
    protected OptionalRValueDimension rValue;
    @XmlElement(name = "Scale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scale;
    @XmlElement(name = "ScreenColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenColor;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "SeatHeight")
    protected LengthDimension seatHeight;
    @XmlElement(name = "SeatingCapacity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger seatingCapacity;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sellerWarrantyDescription;
    @XmlElement(name = "ShellMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shellMaterial;
    @XmlElement(name = "ShirtType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shirtType;
    @XmlElement(name = "ShoeWidth")
    protected StringLengthOptionalDimension shoeWidth;
    @XmlElement(name = "SizeMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sizeMap;
    @XmlElement(name = "SkillLevel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String skillLevel;
    @XmlElement(name = "SkiStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String skiStyle;
    @XmlElement(name = "SleepingCapacity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sleepingCapacity;
    @XmlElement(name = "SleeveLength")
    protected LengthDimension sleeveLength;
    @XmlElement(name = "SleeveType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sleeveType;
    @XmlElement(name = "SnowboardStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String snowboardStyle;
    @XmlElement(name = "SockHeight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sockHeight;
    @XmlElement(name = "SockStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sockStyle;
    @XmlElement(name = "SonarType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sonarType;
    @XmlElement(name = "SpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String specialFeatures;
    @XmlElement(name = "SpecificUsageForProduct")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String specificUsageForProduct;
    @XmlElement(name = "Speed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speed;
    @XmlElement(name = "SpeedRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speedRating;
    @XmlElement(name = "Sport")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sport;
    @XmlElement(name = "State")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String state;
    @XmlElement(name = "StaticElongationPercentage")
    protected BigDecimal staticElongationPercentage;
    @XmlElement(name = "StaticWeight")
    protected WeightDimension staticWeight;
    @XmlElement(name = "StrapType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String strapType;
    @XmlElement(name = "Strength")
    protected WeightDimension strength;
    @XmlElement(name = "StyleKeywords")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> styleKeywords;
    @XmlElement(name = "SupportType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String supportType;
    @XmlElement(name = "SuspensionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String suspensionType;
    @XmlElement(name = "TargetGender")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String targetGender;
    @XmlElement(name = "TargetZones")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger targetZones;
    @XmlElement(name = "TeamName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String teamName;
    @XmlElement(name = "TensionSupported")
    protected WeightDimension tensionSupported;
    @XmlElement(name = "Theme")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String theme;
    @XmlElement(name = "ThreadSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String threadSize;
    @XmlElement(name = "TopStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String topStyle;
    @XmlElement(name = "TopTubeLength")
    protected LengthDimension topTubeLength;
    @XmlElement(name = "TrailerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String trailerType;
    @XmlElement(name = "TurnRadius")
    protected LengthDimension turnRadius;
    @XmlElement(name = "UIAAFallRating")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger uiaaFallRating;
    @XmlElement(name = "UnderwireType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String underwireType;
    @XmlElement(name = "UniformNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String uniformNumber;
    @XmlElement(name = "UsageCapacity")
    protected WeightDimension usageCapacity;
    @XmlElement(name = "UVProtection")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger uvProtection;
    @XmlElement(name = "VolumeCapacityName")
    protected OptionalVolumeDimension volumeCapacityName;
    @XmlElement(name = "WaistSize")
    protected LengthDimension waistSize;
    @XmlElement(name = "WaistWidth")
    protected LengthDimension waistWidth;
    @XmlElement(name = "WarmthRating")
    protected TemperatureRatingDimension warmthRating;
    @XmlElement(name = "Warnings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warnings;
    @XmlElement(name = "Warranty")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warranty;
    @XmlElement(name = "WaterBottleCapType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String waterBottleCapType;
    @XmlElement(name = "WaterResistanceRating")
    protected LengthDimension waterResistanceRating;
    @XmlElement(name = "WaterType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String waterType;
    @XmlElement(name = "Wattage")
    protected BigDecimal wattage;
    @XmlElement(name = "Watts")
    protected WattageDimension watts;
    @XmlElement(name = "WayPoints")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wayPoints;
    @XmlElement(name = "WeightCapacity")
    protected WeightDimension weightCapacity;
    @XmlElement(name = "WhatsInTheBox")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String whatsInTheBox;
    @XmlElement(name = "WheelType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wheelType;
    @XmlElement(name = "ThreadPitch")
    protected LengthDimension threadPitch;
    @XmlElement(name = "DriveSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String driveSystem;
    @XmlElement(name = "BladeMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bladeMaterialType;
    @XmlElement(name = "SportsNumberOfPockets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sportsNumberOfPockets;
    @XmlElement(name = "WorkingLoadLimit")
    protected WeightDimension workingLoadLimit;
    @XmlElement(name = "WatchMovementType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String watchMovementType;
    @XmlElement(name = "TankVolume")
    protected VolumeDimension tankVolume;
    @XmlElement(name = "PowerRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerRating;
    @XmlElement(name = "PatternType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String patternType;
    @XmlElement(name = "OutputPower")
    protected OutputPowerDimension outputPower;
    @XmlElement(name = "OpticalPower")
    protected OpticalPowerDimension opticalPower;
    @XmlElement(name = "MinimumHeightRecommendation")
    protected LengthDimension minimumHeightRecommendation;
    @XmlElement(name = "ItemDiameter")
    protected LengthDimension itemDiameter;
    @XmlElement(name = "AgeRangeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ageRangeDescription;
    @XmlElement(name = "CollectionName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String collectionName;
    @XmlElement(name = "BandSizeNumber")
    protected LengthDimension bandSizeNumber;
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

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sports.VariationData }
     *     
     */
    public Sports.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sports.VariationData }
     *     
     */
    public void setVariationData(Sports.VariationData value) {
        this.variationData = value;
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
     * 获取packaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackaging() {
        return packaging;
    }

    /**
     * 设置packaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackaging(String value) {
        this.packaging = value;
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
     * 获取modelYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModelYear() {
        return modelYear;
    }

    /**
     * 设置modelYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModelYear(BigInteger value) {
        this.modelYear = value;
    }

    /**
     * 获取season属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeason() {
        return season;
    }

    /**
     * 设置season属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeason(String value) {
        this.season = value;
    }

    /**
     * 获取accessLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLocation() {
        return accessLocation;
    }

    /**
     * 设置accessLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLocation(String value) {
        this.accessLocation = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * 获取activeIngredients属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveIngredients() {
        return activeIngredients;
    }

    /**
     * 设置activeIngredients属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveIngredients(String value) {
        this.activeIngredients = value;
    }

    /**
     * 获取alarm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarm() {
        return alarm;
    }

    /**
     * 设置alarm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarm(String value) {
        this.alarm = value;
    }

    /**
     * 获取apparentScaleSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getApparentScaleSize() {
        return apparentScaleSize;
    }

    /**
     * 设置apparentScaleSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setApparentScaleSize(LengthDimension value) {
        this.apparentScaleSize = value;
    }

    /**
     * 获取availableCourses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableCourses() {
        return availableCourses;
    }

    /**
     * 设置availableCourses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableCourses(String value) {
        this.availableCourses = value;
    }

    /**
     * 获取backingLineCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackingLineCapacity() {
        return backingLineCapacity;
    }

    /**
     * 设置backingLineCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackingLineCapacity(String value) {
        this.backingLineCapacity = value;
    }

    /**
     * 获取baseLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBaseLength() {
        return baseLength;
    }

    /**
     * 设置baseLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBaseLength(LengthDimension value) {
        this.baseLength = value;
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
     * Gets the value of the batteryLife property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batteryLife property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatteryLife().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyTimeDimension }
     * 
     * 
     */
    public List<AssemblyTimeDimension> getBatteryLife() {
        if (batteryLife == null) {
            batteryLife = new ArrayList<AssemblyTimeDimension>();
        }
        return this.batteryLife;
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
     * 获取beamWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBeamWidth() {
        return beamWidth;
    }

    /**
     * 设置beamWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBeamWidth(LengthDimension value) {
        this.beamWidth = value;
    }

    /**
     * 获取bearingMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearingMaterialType() {
        return bearingMaterialType;
    }

    /**
     * 设置bearingMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearingMaterialType(String value) {
        this.bearingMaterialType = value;
    }

    /**
     * 获取beltStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeltStyle() {
        return beltStyle;
    }

    /**
     * 设置beltStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeltStyle(String value) {
        this.beltStyle = value;
    }

    /**
     * 获取bikeWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getBikeWeight() {
        return bikeWeight;
    }

    /**
     * 设置bikeWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setBikeWeight(WeightDimension value) {
        this.bikeWeight = value;
    }

    /**
     * 获取bladeGrind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBladeGrind() {
        return bladeGrind;
    }

    /**
     * 设置bladeGrind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBladeGrind(String value) {
        this.bladeGrind = value;
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
     * 获取bladeShape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBladeShape() {
        return bladeShape;
    }

    /**
     * 设置bladeShape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBladeShape(String value) {
        this.bladeShape = value;
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
     * 获取bmxBikeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBMXBikeType() {
        return bmxBikeType;
    }

    /**
     * 设置bmxBikeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBMXBikeType(String value) {
        this.bmxBikeType = value;
    }

    /**
     * 获取boatFenderDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBoatFenderDiameter() {
        return boatFenderDiameter;
    }

    /**
     * 设置boatFenderDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBoatFenderDiameter(LengthDimension value) {
        this.boatFenderDiameter = value;
    }

    /**
     * 获取boilRateDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoilRateDescription() {
        return boilRateDescription;
    }

    /**
     * 设置boilRateDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoilRateDescription(String value) {
        this.boilRateDescription = value;
    }

    /**
     * 获取boomLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBoomLength() {
        return boomLength;
    }

    /**
     * 设置boomLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBoomLength(LengthDimension value) {
        this.boomLength = value;
    }

    /**
     * 获取bottomStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottomStyle() {
        return bottomStyle;
    }

    /**
     * 设置bottomStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottomStyle(String value) {
        this.bottomStyle = value;
    }

    /**
     * 获取brakeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrakeType() {
        return brakeType;
    }

    /**
     * 设置brakeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrakeType(String value) {
        this.brakeType = value;
    }

    /**
     * 获取brakeWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBrakeWidth() {
        return brakeWidth;
    }

    /**
     * 设置brakeWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBrakeWidth(LengthDimension value) {
        this.brakeWidth = value;
    }

    /**
     * 获取breakingStrength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getBreakingStrength() {
        return breakingStrength;
    }

    /**
     * 设置breakingStrength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setBreakingStrength(WeightDimension value) {
        this.breakingStrength = value;
    }

    /**
     * 获取btUs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalEnergyOutputDimension }
     *     
     */
    public OptionalEnergyOutputDimension getBTUs() {
        return btUs;
    }

    /**
     * 设置btUs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalEnergyOutputDimension }
     *     
     */
    public void setBTUs(OptionalEnergyOutputDimension value) {
        this.btUs = value;
    }

    /**
     * 获取buildup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildup() {
        return buildup;
    }

    /**
     * 设置buildup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildup(String value) {
        this.buildup = value;
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
     * 获取burnTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BurnTimeDimension }
     *     
     */
    public BurnTimeDimension getBurnTime() {
        return burnTime;
    }

    /**
     * 设置burnTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BurnTimeDimension }
     *     
     */
    public void setBurnTime(BurnTimeDimension value) {
        this.burnTime = value;
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
     * 获取capability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapability() {
        return capability;
    }

    /**
     * 设置capability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapability(String value) {
        this.capability = value;
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
     * 获取careInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareInstructions() {
        return careInstructions;
    }

    /**
     * 设置careInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareInstructions(String value) {
        this.careInstructions = value;
    }

    /**
     * 获取centerlineLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCenterlineLength() {
        return centerlineLength;
    }

    /**
     * 设置centerlineLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCenterlineLength(LengthDimension value) {
        this.centerlineLength = value;
    }

    /**
     * 获取closureType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosureType() {
        return closureType;
    }

    /**
     * 设置closureType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosureType(String value) {
        this.closureType = value;
    }

    /**
     * 获取collarType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollarType() {
        return collarType;
    }

    /**
     * 设置collarType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollarType(String value) {
        this.collarType = value;
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
     * 获取compatibleHoseDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCompatibleHoseDiameter() {
        return compatibleHoseDiameter;
    }

    /**
     * 设置compatibleHoseDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCompatibleHoseDiameter(LengthDimension value) {
        this.compatibleHoseDiameter = value;
    }

    /**
     * 获取compatibleRopeDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCompatibleRopeDiameter() {
        return compatibleRopeDiameter;
    }

    /**
     * 设置compatibleRopeDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCompatibleRopeDiameter(LengthDimension value) {
        this.compatibleRopeDiameter = value;
    }

    /**
     * 获取construction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstruction() {
        return construction;
    }

    /**
     * 设置construction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstruction(String value) {
        this.construction = value;
    }

    /**
     * 获取controlProgramName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlProgramName() {
        return controlProgramName;
    }

    /**
     * 设置controlProgramName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlProgramName(String value) {
        this.controlProgramName = value;
    }

    /**
     * 获取coreMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreMaterialType() {
        return coreMaterialType;
    }

    /**
     * 设置coreMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreMaterialType(String value) {
        this.coreMaterialType = value;
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
     * 获取courseCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCapacity() {
        return courseCapacity;
    }

    /**
     * 设置courseCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCapacity(String value) {
        this.courseCapacity = value;
    }

    /**
     * 获取coverageArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaDimension }
     *     
     */
    public AreaDimension getCoverageArea() {
        return coverageArea;
    }

    /**
     * 设置coverageArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaDimension }
     *     
     */
    public void setCoverageArea(AreaDimension value) {
        this.coverageArea = value;
    }

    /**
     * 获取crankLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCrankLength() {
        return crankLength;
    }

    /**
     * 设置crankLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCrankLength(LengthDimension value) {
        this.crankLength = value;
    }

    /**
     * 获取cuffType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuffType() {
        return cuffType;
    }

    /**
     * 设置cuffType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuffType(String value) {
        this.cuffType = value;
    }

    /**
     * 获取cupSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCupSize() {
        return cupSize;
    }

    /**
     * 设置cupSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCupSize(String value) {
        this.cupSize = value;
    }

    /**
     * 获取cycles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycles() {
        return cycles;
    }

    /**
     * 设置cycles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycles(String value) {
        this.cycles = value;
    }

    /**
     * 获取deckLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDeckLength() {
        return deckLength;
    }

    /**
     * 设置deckLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDeckLength(LengthDimension value) {
        this.deckLength = value;
    }

    /**
     * 获取deckWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDeckWidth() {
        return deckWidth;
    }

    /**
     * 设置deckWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDeckWidth(LengthDimension value) {
        this.deckWidth = value;
    }

    /**
     * 获取directions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirections() {
        return directions;
    }

    /**
     * 设置directions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirections(String value) {
        this.directions = value;
    }

    /**
     * 获取displayFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFeatures() {
        return displayFeatures;
    }

    /**
     * 设置displayFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFeatures(String value) {
        this.displayFeatures = value;
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
     * 获取displaySize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplaySize() {
        return displaySize;
    }

    /**
     * 设置displaySize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplaySize(LengthDimension value) {
        this.displaySize = value;
    }

    /**
     * 获取displayType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * 设置displayType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
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
     * 获取effectiveEdgeLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getEffectiveEdgeLength() {
        return effectiveEdgeLength;
    }

    /**
     * 设置effectiveEdgeLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setEffectiveEdgeLength(LengthDimension value) {
        this.effectiveEdgeLength = value;
    }

    /**
     * 获取engineDisplacement属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sports.EngineDisplacement }
     *     
     */
    public Sports.EngineDisplacement getEngineDisplacement() {
        return engineDisplacement;
    }

    /**
     * 设置engineDisplacement属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sports.EngineDisplacement }
     *     
     */
    public void setEngineDisplacement(Sports.EngineDisplacement value) {
        this.engineDisplacement = value;
    }

    /**
     * 获取eventName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * 设置eventName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * 获取eye属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEye() {
        return eye;
    }

    /**
     * 设置eye属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEye(BigInteger value) {
        this.eye = value;
    }

    /**
     * 获取fabricType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabricType() {
        return fabricType;
    }

    /**
     * 设置fabricType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabricType(String value) {
        this.fabricType = value;
    }

    /**
     * 获取fabricWash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabricWash() {
        return fabricWash;
    }

    /**
     * 设置fabricWash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabricWash(String value) {
        this.fabricWash = value;
    }

    /**
     * 获取fillMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillMaterialType() {
        return fillMaterialType;
    }

    /**
     * 设置fillMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillMaterialType(String value) {
        this.fillMaterialType = value;
    }

    /**
     * 获取fishingLineType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFishingLineType() {
        return fishingLineType;
    }

    /**
     * 设置fishingLineType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFishingLineType(String value) {
        this.fishingLineType = value;
    }

    /**
     * 获取fishType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFishType() {
        return fishType;
    }

    /**
     * 设置fishType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFishType(String value) {
        this.fishType = value;
    }

    /**
     * 获取fittingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFittingType() {
        return fittingType;
    }

    /**
     * 设置fittingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFittingType(String value) {
        this.fittingType = value;
    }

    /**
     * 获取fitType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFitType() {
        return fitType;
    }

    /**
     * 设置fitType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFitType(String value) {
        this.fitType = value;
    }

    /**
     * 获取floorArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaDimension }
     *     
     */
    public AreaDimension getFloorArea() {
        return floorArea;
    }

    /**
     * 设置floorArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaDimension }
     *     
     */
    public void setFloorArea(AreaDimension value) {
        this.floorArea = value;
    }

    /**
     * 获取floorLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getFloorLength() {
        return floorLength;
    }

    /**
     * 设置floorLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setFloorLength(LengthDimension value) {
        this.floorLength = value;
    }

    /**
     * 获取floorWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getFloorWidth() {
        return floorWidth;
    }

    /**
     * 设置floorWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setFloorWidth(LengthDimension value) {
        this.floorWidth = value;
    }

    /**
     * 获取flyLineNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlyLineNumber() {
        return flyLineNumber;
    }

    /**
     * 设置flyLineNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlyLineNumber(BigInteger value) {
        this.flyLineNumber = value;
    }

    /**
     * 获取foldedLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldedLength() {
        return foldedLength;
    }

    /**
     * 设置foldedLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldedLength(String value) {
        this.foldedLength = value;
    }

    /**
     * 获取frameHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getFrameHeight() {
        return frameHeight;
    }

    /**
     * 设置frameHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setFrameHeight(LengthDimension value) {
        this.frameHeight = value;
    }

    /**
     * 获取frameMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameMaterial() {
        return frameMaterial;
    }

    /**
     * 设置frameMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameMaterial(String value) {
        this.frameMaterial = value;
    }

    /**
     * 获取frameType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameType() {
        return frameType;
    }

    /**
     * 设置frameType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameType(String value) {
        this.frameType = value;
    }

    /**
     * 获取frequencyBand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyBand() {
        return frequencyBand;
    }

    /**
     * 设置frequencyBand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyBand(String value) {
        this.frequencyBand = value;
    }

    /**
     * 获取frontPleatType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontPleatType() {
        return frontPleatType;
    }

    /**
     * 设置frontPleatType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontPleatType(String value) {
        this.frontPleatType = value;
    }

    /**
     * 获取fuelCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * 设置fuelCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setFuelCapacity(VolumeDimension value) {
        this.fuelCapacity = value;
    }

    /**
     * 获取fuelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * 设置fuelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * 获取functions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctions() {
        return functions;
    }

    /**
     * 设置functions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctions(String value) {
        this.functions = value;
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
     * 获取gearDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGearDirection() {
        return gearDirection;
    }

    /**
     * 设置gearDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGearDirection(String value) {
        this.gearDirection = value;
    }

    /**
     * 获取geographicCoverage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicCoverage() {
        return geographicCoverage;
    }

    /**
     * 设置geographicCoverage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicCoverage(String value) {
        this.geographicCoverage = value;
    }

    /**
     * 获取gloveType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGloveType() {
        return gloveType;
    }

    /**
     * 设置gloveType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGloveType(String value) {
        this.gloveType = value;
    }

    /**
     * 获取gripMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGripMaterialType() {
        return gripMaterialType;
    }

    /**
     * 设置gripMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGripMaterialType(String value) {
        this.gripMaterialType = value;
    }

    /**
     * 获取guardMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuardMaterialType() {
        return guardMaterialType;
    }

    /**
     * 设置guardMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuardMaterialType(String value) {
        this.guardMaterialType = value;
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
     * 获取handleType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleType() {
        return handleType;
    }

    /**
     * 设置handleType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleType(String value) {
        this.handleType = value;
    }

    /**
     * 获取heatRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TemperatureRatingDimension }
     *     
     */
    public TemperatureRatingDimension getHeatRating() {
        return heatRating;
    }

    /**
     * 设置heatRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureRatingDimension }
     *     
     */
    public void setHeatRating(TemperatureRatingDimension value) {
        this.heatRating = value;
    }

    /**
     * 获取hp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHP() {
        return hp;
    }

    /**
     * 设置hp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHP(BigDecimal value) {
        this.hp = value;
    }

    /**
     * 获取hullShape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHullShape() {
        return hullShape;
    }

    /**
     * 设置hullShape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHullShape(String value) {
        this.hullShape = value;
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
     * 获取impactForce属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpactForce() {
        return impactForce;
    }

    /**
     * 设置impactForce属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpactForce(BigDecimal value) {
        this.impactForce = value;
    }

    /**
     * 获取ingredients属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * 设置ingredients属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredients(String value) {
        this.ingredients = value;
    }

    /**
     * 获取inseam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalLengthIntegerDimension }
     *     
     */
    public OptionalLengthIntegerDimension getInseam() {
        return inseam;
    }

    /**
     * 设置inseam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalLengthIntegerDimension }
     *     
     */
    public void setInseam(OptionalLengthIntegerDimension value) {
        this.inseam = value;
    }

    /**
     * 获取insulationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsulationType() {
        return insulationType;
    }

    /**
     * 设置insulationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsulationType(String value) {
        this.insulationType = value;
    }

    /**
     * 获取intensity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalLuminiousIntensityDimension }
     *     
     */
    public OptionalLuminiousIntensityDimension getIntensity() {
        return intensity;
    }

    /**
     * 设置intensity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalLuminiousIntensityDimension }
     *     
     */
    public void setIntensity(OptionalLuminiousIntensityDimension value) {
        this.intensity = value;
    }

    /**
     * 获取isAssemblyRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAssemblyRequired() {
        return isAssemblyRequired;
    }

    /**
     * 设置isAssemblyRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAssemblyRequired(Boolean value) {
        this.isAssemblyRequired = value;
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
     * 获取isSigned属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSigned() {
        return isSigned;
    }

    /**
     * 设置isSigned属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSigned(String value) {
        this.isSigned = value;
    }

    /**
     * 获取jerseyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJerseyType() {
        return jerseyType;
    }

    /**
     * 设置jerseyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJerseyType(String value) {
        this.jerseyType = value;
    }

    /**
     * 获取knifeFunction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnifeFunction() {
        return knifeFunction;
    }

    /**
     * 设置knifeFunction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnifeFunction(String value) {
        this.knifeFunction = value;
    }

    /**
     * 获取lampType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLampType() {
        return lampType;
    }

    /**
     * 设置lampType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLampType(String value) {
        this.lampType = value;
    }

    /**
     * 获取laptopCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaptopCapacity() {
        return laptopCapacity;
    }

    /**
     * 设置laptopCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaptopCapacity(String value) {
        this.laptopCapacity = value;
    }

    /**
     * 获取lashLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getLashLength() {
        return lashLength;
    }

    /**
     * 设置lashLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setLashLength(LengthDimension value) {
        this.lashLength = value;
    }

    /**
     * 获取leagueName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeagueName() {
        return leagueName;
    }

    /**
     * 设置leagueName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeagueName(String value) {
        this.leagueName = value;
    }

    /**
     * 获取legStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegStyle() {
        return legStyle;
    }

    /**
     * 设置legStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegStyle(String value) {
        this.legStyle = value;
    }

    /**
     * 获取lensMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLensMaterial() {
        return lensMaterial;
    }

    /**
     * 设置lensMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLensMaterial(String value) {
        this.lensMaterial = value;
    }

    /**
     * 获取lensShape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLensShape() {
        return lensShape;
    }

    /**
     * 设置lensShape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLensShape(String value) {
        this.lensShape = value;
    }

    /**
     * 获取lifeVestType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeVestType() {
        return lifeVestType;
    }

    /**
     * 设置lifeVestType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeVestType(String value) {
        this.lifeVestType = value;
    }

    /**
     * 获取lightIntensity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLightIntensity() {
        return lightIntensity;
    }

    /**
     * 设置lightIntensity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLightIntensity(BigDecimal value) {
        this.lightIntensity = value;
    }

    /**
     * 获取lineWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineWeight() {
        return lineWeight;
    }

    /**
     * 设置lineWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineWeight(String value) {
        this.lineWeight = value;
    }

    /**
     * 获取liningMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiningMaterial() {
        return liningMaterial;
    }

    /**
     * 设置liningMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiningMaterial(String value) {
        this.liningMaterial = value;
    }

    /**
     * 获取lithiumBatteryEnergyContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalEnergyConsumptionDimension }
     *     
     */
    public OptionalEnergyConsumptionDimension getLithiumBatteryEnergyContent() {
        return lithiumBatteryEnergyContent;
    }

    /**
     * 设置lithiumBatteryEnergyContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalEnergyConsumptionDimension }
     *     
     */
    public void setLithiumBatteryEnergyContent(OptionalEnergyConsumptionDimension value) {
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
     *     {@link OptionalVoltageDecimalDimension }
     *     
     */
    public OptionalVoltageDecimalDimension getLithiumBatteryVoltage() {
        return lithiumBatteryVoltage;
    }

    /**
     * 设置lithiumBatteryVoltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalVoltageDecimalDimension }
     *     
     */
    public void setLithiumBatteryVoltage(OptionalVoltageDecimalDimension value) {
        this.lithiumBatteryVoltage = value;
    }

    /**
     * 获取lithiumBatteryWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalWeightDimension }
     *     
     */
    public OptionalWeightDimension getLithiumBatteryWeight() {
        return lithiumBatteryWeight;
    }

    /**
     * 设置lithiumBatteryWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalWeightDimension }
     *     
     */
    public void setLithiumBatteryWeight(OptionalWeightDimension value) {
        this.lithiumBatteryWeight = value;
    }

    /**
     * 获取loadCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * 设置loadCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setLoadCapacity(WeightDimension value) {
        this.loadCapacity = value;
    }

    /**
     * 获取lockType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * 设置lockType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockType(String value) {
        this.lockType = value;
    }

    /**
     * 获取loudness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoudness() {
        return loudness;
    }

    /**
     * 设置loudness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoudness(BigDecimal value) {
        this.loudness = value;
    }

    /**
     * 获取lureWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getLureWeight() {
        return lureWeight;
    }

    /**
     * 设置lureWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setLureWeight(WeightDimension value) {
        this.lureWeight = value;
    }

    /**
     * 获取manufacturerDefinedQualityDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerDefinedQualityDescription() {
        return manufacturerDefinedQualityDescription;
    }

    /**
     * 设置manufacturerDefinedQualityDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerDefinedQualityDescription(String value) {
        this.manufacturerDefinedQualityDescription = value;
    }

    /**
     * 获取martialArtsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMartialArtsType() {
        return martialArtsType;
    }

    /**
     * 设置martialArtsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMartialArtsType(String value) {
        this.martialArtsType = value;
    }

    /**
     * 获取maximumCompatibleBootSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BootSizeDimension }
     *     
     */
    public BootSizeDimension getMaximumCompatibleBootSize() {
        return maximumCompatibleBootSize;
    }

    /**
     * 设置maximumCompatibleBootSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BootSizeDimension }
     *     
     */
    public void setMaximumCompatibleBootSize(BootSizeDimension value) {
        this.maximumCompatibleBootSize = value;
    }

    /**
     * 获取maximumCompatibleRopeDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumCompatibleRopeDiameter() {
        return maximumCompatibleRopeDiameter;
    }

    /**
     * 设置maximumCompatibleRopeDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumCompatibleRopeDiameter(LengthDimension value) {
        this.maximumCompatibleRopeDiameter = value;
    }

    /**
     * 获取maximumHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumHeight() {
        return maximumHeight;
    }

    /**
     * 设置maximumHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumHeight(LengthDimension value) {
        this.maximumHeight = value;
    }

    /**
     * 获取maximumInclinePercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumInclinePercentage() {
        return maximumInclinePercentage;
    }

    /**
     * 设置maximumInclinePercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumInclinePercentage(BigInteger value) {
        this.maximumInclinePercentage = value;
    }

    /**
     * 获取maximumLegSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumLegSize() {
        return maximumLegSize;
    }

    /**
     * 设置maximumLegSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumLegSize(String value) {
        this.maximumLegSize = value;
    }

    /**
     * 获取maximumMagnification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumMagnification() {
        return maximumMagnification;
    }

    /**
     * 设置maximumMagnification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumMagnification(BigDecimal value) {
        this.maximumMagnification = value;
    }

    /**
     * 获取maximumPitchSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Sports.MaximumPitchSpeed }
     *     
     */
    public Sports.MaximumPitchSpeed getMaximumPitchSpeed() {
        return maximumPitchSpeed;
    }

    /**
     * 设置maximumPitchSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Sports.MaximumPitchSpeed }
     *     
     */
    public void setMaximumPitchSpeed(Sports.MaximumPitchSpeed value) {
        this.maximumPitchSpeed = value;
    }

    /**
     * 获取maximumResistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaximumResistance() {
        return maximumResistance;
    }

    /**
     * 设置maximumResistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaximumResistance(WeightDimension value) {
        this.maximumResistance = value;
    }

    /**
     * 获取maximumStrideLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumStrideLength() {
        return maximumStrideLength;
    }

    /**
     * 设置maximumStrideLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumStrideLength(LengthDimension value) {
        this.maximumStrideLength = value;
    }

    /**
     * 获取maximumTensionRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaximumTensionRating() {
        return maximumTensionRating;
    }

    /**
     * 设置maximumTensionRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaximumTensionRating(WeightDimension value) {
        this.maximumTensionRating = value;
    }

    /**
     * 获取maximumUserWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaximumUserWeight() {
        return maximumUserWeight;
    }

    /**
     * 设置maximumUserWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaximumUserWeight(WeightDimension value) {
        this.maximumUserWeight = value;
    }

    /**
     * 获取maximumWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaximumWeight() {
        return maximumWeight;
    }

    /**
     * 设置maximumWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaximumWeight(WeightDimension value) {
        this.maximumWeight = value;
    }

    /**
     * 获取maxWeightRecommendation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaxWeightRecommendation() {
        return maxWeightRecommendation;
    }

    /**
     * 设置maxWeightRecommendation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaxWeightRecommendation(WeightDimension value) {
        this.maxWeightRecommendation = value;
    }

    /**
     * 获取mechanicalStructure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanicalStructure() {
        return mechanicalStructure;
    }

    /**
     * 设置mechanicalStructure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanicalStructure(String value) {
        this.mechanicalStructure = value;
    }

    /**
     * 获取memory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getMemory() {
        return memory;
    }

    /**
     * 设置memory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setMemory(MemorySizeDimension value) {
        this.memory = value;
    }

    /**
     * 获取mfrWarrantyDescriptionLabor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrWarrantyDescriptionLabor() {
        return mfrWarrantyDescriptionLabor;
    }

    /**
     * 设置mfrWarrantyDescriptionLabor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrWarrantyDescriptionLabor(String value) {
        this.mfrWarrantyDescriptionLabor = value;
    }

    /**
     * 获取mfrWarrantyDescriptionParts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrWarrantyDescriptionParts() {
        return mfrWarrantyDescriptionParts;
    }

    /**
     * 设置mfrWarrantyDescriptionParts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrWarrantyDescriptionParts(String value) {
        this.mfrWarrantyDescriptionParts = value;
    }

    /**
     * 获取mfrWarrantyDescriptionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrWarrantyDescriptionType() {
        return mfrWarrantyDescriptionType;
    }

    /**
     * 设置mfrWarrantyDescriptionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrWarrantyDescriptionType(String value) {
        this.mfrWarrantyDescriptionType = value;
    }

    /**
     * 获取minimumCompatibleBootSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BootSizeDimension }
     *     
     */
    public BootSizeDimension getMinimumCompatibleBootSize() {
        return minimumCompatibleBootSize;
    }

    /**
     * 设置minimumCompatibleBootSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BootSizeDimension }
     *     
     */
    public void setMinimumCompatibleBootSize(BootSizeDimension value) {
        this.minimumCompatibleBootSize = value;
    }

    /**
     * 获取minimumCompatibleRopeDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumCompatibleRopeDiameter() {
        return minimumCompatibleRopeDiameter;
    }

    /**
     * 设置minimumCompatibleRopeDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumCompatibleRopeDiameter(LengthDimension value) {
        this.minimumCompatibleRopeDiameter = value;
    }

    /**
     * 获取minimumLegSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumLegSize() {
        return minimumLegSize;
    }

    /**
     * 设置minimumLegSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumLegSize(String value) {
        this.minimumLegSize = value;
    }

    /**
     * 获取minimumMagnification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumMagnification() {
        return minimumMagnification;
    }

    /**
     * 设置minimumMagnification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumMagnification(BigDecimal value) {
        this.minimumMagnification = value;
    }

    /**
     * 获取minimumTensionRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMinimumTensionRating() {
        return minimumTensionRating;
    }

    /**
     * 设置minimumTensionRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMinimumTensionRating(WeightDimension value) {
        this.minimumTensionRating = value;
    }

    /**
     * 获取minimumTorsoFit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumTorsoFit() {
        return minimumTorsoFit;
    }

    /**
     * 设置minimumTorsoFit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumTorsoFit(String value) {
        this.minimumTorsoFit = value;
    }

    /**
     * 获取minimumWeightRecommendation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMinimumWeightRecommendation() {
        return minimumWeightRecommendation;
    }

    /**
     * 设置minimumWeightRecommendation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMinimumWeightRecommendation(WeightDimension value) {
        this.minimumWeightRecommendation = value;
    }

    /**
     * 获取monitorFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorFeatures() {
        return monitorFeatures;
    }

    /**
     * 设置monitorFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorFeatures(String value) {
        this.monitorFeatures = value;
    }

    /**
     * 获取motorSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalMotorSizeDimension }
     *     
     */
    public OptionalMotorSizeDimension getMotorSize() {
        return motorSize;
    }

    /**
     * 设置motorSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalMotorSizeDimension }
     *     
     */
    public void setMotorSize(OptionalMotorSizeDimension value) {
        this.motorSize = value;
    }

    /**
     * 获取mountainBikeProportionalFrameSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMountainBikeProportionalFrameSize() {
        return mountainBikeProportionalFrameSize;
    }

    /**
     * 设置mountainBikeProportionalFrameSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMountainBikeProportionalFrameSize(LengthDimension value) {
        this.mountainBikeProportionalFrameSize = value;
    }

    /**
     * 获取mountainBikeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountainBikeType() {
        return mountainBikeType;
    }

    /**
     * 设置mountainBikeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountainBikeType(String value) {
        this.mountainBikeType = value;
    }

    /**
     * 获取mountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountType() {
        return mountType;
    }

    /**
     * 设置mountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountType(String value) {
        this.mountType = value;
    }

    /**
     * 获取movementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * 设置movementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * 获取neckStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeckStyle() {
        return neckStyle;
    }

    /**
     * 设置neckStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeckStyle(String value) {
        this.neckStyle = value;
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
     * 获取numberOfCarriagePositions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCarriagePositions() {
        return numberOfCarriagePositions;
    }

    /**
     * 设置numberOfCarriagePositions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCarriagePositions(BigInteger value) {
        this.numberOfCarriagePositions = value;
    }

    /**
     * 获取numberOfDoors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * 设置numberOfDoors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDoors(BigInteger value) {
        this.numberOfDoors = value;
    }

    /**
     * 获取numberOfExercises属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfExercises() {
        return numberOfExercises;
    }

    /**
     * 设置numberOfExercises属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfExercises(BigInteger value) {
        this.numberOfExercises = value;
    }

    /**
     * 获取numberOfFootPositions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFootPositions() {
        return numberOfFootPositions;
    }

    /**
     * 设置numberOfFootPositions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFootPositions(BigInteger value) {
        this.numberOfFootPositions = value;
    }

    /**
     * 获取numberOfGearLoops属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfGearLoops() {
        return numberOfGearLoops;
    }

    /**
     * 设置numberOfGearLoops属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfGearLoops(BigInteger value) {
        this.numberOfGearLoops = value;
    }

    /**
     * 获取numberOfHeadPositions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHeadPositions() {
        return numberOfHeadPositions;
    }

    /**
     * 设置numberOfHeadPositions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHeadPositions(BigInteger value) {
        this.numberOfHeadPositions = value;
    }

    /**
     * 获取numberOfHolds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHolds() {
        return numberOfHolds;
    }

    /**
     * 设置numberOfHolds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHolds(BigInteger value) {
        this.numberOfHolds = value;
    }

    /**
     * 获取numberOfHorses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHorses() {
        return numberOfHorses;
    }

    /**
     * 设置numberOfHorses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHorses(BigInteger value) {
        this.numberOfHorses = value;
    }

    /**
     * 获取numberOfLevels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfLevels() {
        return numberOfLevels;
    }

    /**
     * 设置numberOfLevels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfLevels(BigInteger value) {
        this.numberOfLevels = value;
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
     * 获取numberOfPages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * 设置numberOfPages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPages(BigInteger value) {
        this.numberOfPages = value;
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
     * 获取numberOfPockets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPockets() {
        return numberOfPockets;
    }

    /**
     * 设置numberOfPockets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPockets(BigInteger value) {
        this.numberOfPockets = value;
    }

    /**
     * 获取numberOfPoles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPoles() {
        return numberOfPoles;
    }

    /**
     * 设置numberOfPoles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPoles(BigInteger value) {
        this.numberOfPoles = value;
    }

    /**
     * 获取numberOfPrograms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPrograms() {
        return numberOfPrograms;
    }

    /**
     * 设置numberOfPrograms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPrograms(BigInteger value) {
        this.numberOfPrograms = value;
    }

    /**
     * 获取numberOfResistanceLevels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResistanceLevels() {
        return numberOfResistanceLevels;
    }

    /**
     * 设置numberOfResistanceLevels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResistanceLevels(BigInteger value) {
        this.numberOfResistanceLevels = value;
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
     * 获取numberOfSprings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSprings() {
        return numberOfSprings;
    }

    /**
     * 设置numberOfSprings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSprings(BigInteger value) {
        this.numberOfSprings = value;
    }

    /**
     * 获取objectiveLensSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getObjectiveLensSize() {
        return objectiveLensSize;
    }

    /**
     * 设置objectiveLensSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setObjectiveLensSize(LengthDimension value) {
        this.objectiveLensSize = value;
    }

    /**
     * 获取operationMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationMode() {
        return operationMode;
    }

    /**
     * 设置operationMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationMode(String value) {
        this.operationMode = value;
    }

    /**
     * 获取orientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * 设置orientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
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
     * 获取packedSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackedSize() {
        return packedSize;
    }

    /**
     * 设置packedSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackedSize(String value) {
        this.packedSize = value;
    }

    /**
     * 获取padType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadType() {
        return padType;
    }

    /**
     * 设置padType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadType(String value) {
        this.padType = value;
    }

    /**
     * 获取patternStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternStyle() {
        return patternStyle;
    }

    /**
     * 设置patternStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternStyle(String value) {
        this.patternStyle = value;
    }

    /**
     * 获取peakHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getPeakHeight() {
        return peakHeight;
    }

    /**
     * 设置peakHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setPeakHeight(LengthDimension value) {
        this.peakHeight = value;
    }

    /**
     * 获取pixels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalResolutionDimension }
     *     
     */
    public OptionalResolutionDimension getPixels() {
        return pixels;
    }

    /**
     * 设置pixels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalResolutionDimension }
     *     
     */
    public void setPixels(OptionalResolutionDimension value) {
        this.pixels = value;
    }

    /**
     * 获取playerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * 设置playerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerName(String value) {
        this.playerName = value;
    }

    /**
     * 获取pocketDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPocketDescription() {
        return pocketDescription;
    }

    /**
     * 设置pocketDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPocketDescription(String value) {
        this.pocketDescription = value;
    }

    /**
     * 获取positionAccuracy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionAccuracy() {
        return positionAccuracy;
    }

    /**
     * 设置positionAccuracy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionAccuracy(String value) {
        this.positionAccuracy = value;
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
     *     {@link String }
     *     
     */
    public String getPPUCount() {
        return ppuCount;
    }

    /**
     * 设置ppuCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPPUCount(String value) {
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
     * 获取proportionalFrameSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProportionalFrameSize() {
        return proportionalFrameSize;
    }

    /**
     * 设置proportionalFrameSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProportionalFrameSize(BigDecimal value) {
        this.proportionalFrameSize = value;
    }

    /**
     * 获取pullType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPullType() {
        return pullType;
    }

    /**
     * 设置pullType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPullType(String value) {
        this.pullType = value;
    }

    /**
     * 获取range属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StringLengthOptionalDimension }
     *     
     */
    public StringLengthOptionalDimension getRange() {
        return range;
    }

    /**
     * 设置range属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StringLengthOptionalDimension }
     *     
     */
    public void setRange(StringLengthOptionalDimension value) {
        this.range = value;
    }

    /**
     * 获取rearDerailleurCompatibleChainSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getRearDerailleurCompatibleChainSize() {
        return rearDerailleurCompatibleChainSize;
    }

    /**
     * 设置rearDerailleurCompatibleChainSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setRearDerailleurCompatibleChainSize(LengthDimension value) {
        this.rearDerailleurCompatibleChainSize = value;
    }

    /**
     * 获取recommendedWorkoutSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaDimensionOptionalUnit }
     *     
     */
    public AreaDimensionOptionalUnit getRecommendedWorkoutSpace() {
        return recommendedWorkoutSpace;
    }

    /**
     * 设置recommendedWorkoutSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaDimensionOptionalUnit }
     *     
     */
    public void setRecommendedWorkoutSpace(AreaDimensionOptionalUnit value) {
        this.recommendedWorkoutSpace = value;
    }

    /**
     * 获取reelDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getReelDiameter() {
        return reelDiameter;
    }

    /**
     * 设置reelDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setReelDiameter(LengthDimension value) {
        this.reelDiameter = value;
    }

    /**
     * 获取reelModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReelModel() {
        return reelModel;
    }

    /**
     * 设置reelModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReelModel(String value) {
        this.reelModel = value;
    }

    /**
     * 获取region属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置region属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * 获取resistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalResistanceDimension }
     *     
     */
    public OptionalResistanceDimension getResistance() {
        return resistance;
    }

    /**
     * 设置resistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalResistanceDimension }
     *     
     */
    public void setResistance(OptionalResistanceDimension value) {
        this.resistance = value;
    }

    /**
     * 获取resistanceMechanism属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResistanceMechanism() {
        return resistanceMechanism;
    }

    /**
     * 设置resistanceMechanism属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResistanceMechanism(String value) {
        this.resistanceMechanism = value;
    }

    /**
     * 获取resolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * 设置resolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * 获取riseStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiseStyle() {
        return riseStyle;
    }

    /**
     * 设置riseStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiseStyle(String value) {
        this.riseStyle = value;
    }

    /**
     * 获取roadBikeProportionalFrameSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getRoadBikeProportionalFrameSize() {
        return roadBikeProportionalFrameSize;
    }

    /**
     * 设置roadBikeProportionalFrameSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setRoadBikeProportionalFrameSize(LengthDimension value) {
        this.roadBikeProportionalFrameSize = value;
    }

    /**
     * 获取roadBikeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadBikeType() {
        return roadBikeType;
    }

    /**
     * 设置roadBikeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadBikeType(String value) {
        this.roadBikeType = value;
    }

    /**
     * 获取rodLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getRodLength() {
        return rodLength;
    }

    /**
     * 设置rodLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setRodLength(LengthDimension value) {
        this.rodLength = value;
    }

    /**
     * 获取rodWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getRodWeight() {
        return rodWeight;
    }

    /**
     * 设置rodWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setRodWeight(WeightDimension value) {
        this.rodWeight = value;
    }

    /**
     * 获取routes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoutes() {
        return routes;
    }

    /**
     * 设置routes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoutes(BigInteger value) {
        this.routes = value;
    }

    /**
     * 获取rValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalRValueDimension }
     *     
     */
    public OptionalRValueDimension getRValue() {
        return rValue;
    }

    /**
     * 设置rValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalRValueDimension }
     *     
     */
    public void setRValue(OptionalRValueDimension value) {
        this.rValue = value;
    }

    /**
     * 获取scale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        return scale;
    }

    /**
     * 设置scale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * 获取screenColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenColor() {
        return screenColor;
    }

    /**
     * 设置screenColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenColor(String value) {
        this.screenColor = value;
    }

    /**
     * 获取screenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getScreenSize() {
        return screenSize;
    }

    /**
     * 设置screenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setScreenSize(LengthDimension value) {
        this.screenSize = value;
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
     * 获取seatingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatingCapacity() {
        return seatingCapacity;
    }

    /**
     * 设置seatingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatingCapacity(BigInteger value) {
        this.seatingCapacity = value;
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
     * 获取shellMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShellMaterial() {
        return shellMaterial;
    }

    /**
     * 设置shellMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShellMaterial(String value) {
        this.shellMaterial = value;
    }

    /**
     * 获取shirtType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShirtType() {
        return shirtType;
    }

    /**
     * 设置shirtType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShirtType(String value) {
        this.shirtType = value;
    }

    /**
     * 获取shoeWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StringLengthOptionalDimension }
     *     
     */
    public StringLengthOptionalDimension getShoeWidth() {
        return shoeWidth;
    }

    /**
     * 设置shoeWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StringLengthOptionalDimension }
     *     
     */
    public void setShoeWidth(StringLengthOptionalDimension value) {
        this.shoeWidth = value;
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
     * 获取skillLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkillLevel() {
        return skillLevel;
    }

    /**
     * 设置skillLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkillLevel(String value) {
        this.skillLevel = value;
    }

    /**
     * 获取skiStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkiStyle() {
        return skiStyle;
    }

    /**
     * 设置skiStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkiStyle(String value) {
        this.skiStyle = value;
    }

    /**
     * 获取sleepingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSleepingCapacity() {
        return sleepingCapacity;
    }

    /**
     * 设置sleepingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSleepingCapacity(BigInteger value) {
        this.sleepingCapacity = value;
    }

    /**
     * 获取sleeveLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSleeveLength() {
        return sleeveLength;
    }

    /**
     * 设置sleeveLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSleeveLength(LengthDimension value) {
        this.sleeveLength = value;
    }

    /**
     * 获取sleeveType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSleeveType() {
        return sleeveType;
    }

    /**
     * 设置sleeveType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSleeveType(String value) {
        this.sleeveType = value;
    }

    /**
     * 获取snowboardStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnowboardStyle() {
        return snowboardStyle;
    }

    /**
     * 设置snowboardStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnowboardStyle(String value) {
        this.snowboardStyle = value;
    }

    /**
     * 获取sockHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSockHeight() {
        return sockHeight;
    }

    /**
     * 设置sockHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSockHeight(String value) {
        this.sockHeight = value;
    }

    /**
     * 获取sockStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSockStyle() {
        return sockStyle;
    }

    /**
     * 设置sockStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSockStyle(String value) {
        this.sockStyle = value;
    }

    /**
     * 获取sonarType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonarType() {
        return sonarType;
    }

    /**
     * 设置sonarType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonarType(String value) {
        this.sonarType = value;
    }

    /**
     * 获取specialFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * 设置specialFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFeatures(String value) {
        this.specialFeatures = value;
    }

    /**
     * 获取specificUsageForProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUsageForProduct() {
        return specificUsageForProduct;
    }

    /**
     * 设置specificUsageForProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUsageForProduct(String value) {
        this.specificUsageForProduct = value;
    }

    /**
     * 获取speed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * 设置speed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeed(String value) {
        this.speed = value;
    }

    /**
     * 获取speedRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedRating() {
        return speedRating;
    }

    /**
     * 设置speedRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedRating(String value) {
        this.speedRating = value;
    }

    /**
     * 获取sport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSport() {
        return sport;
    }

    /**
     * 设置sport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSport(String value) {
        this.sport = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取staticElongationPercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStaticElongationPercentage() {
        return staticElongationPercentage;
    }

    /**
     * 设置staticElongationPercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStaticElongationPercentage(BigDecimal value) {
        this.staticElongationPercentage = value;
    }

    /**
     * 获取staticWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getStaticWeight() {
        return staticWeight;
    }

    /**
     * 设置staticWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setStaticWeight(WeightDimension value) {
        this.staticWeight = value;
    }

    /**
     * 获取strapType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrapType() {
        return strapType;
    }

    /**
     * 设置strapType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrapType(String value) {
        this.strapType = value;
    }

    /**
     * 获取strength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getStrength() {
        return strength;
    }

    /**
     * 设置strength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setStrength(WeightDimension value) {
        this.strength = value;
    }

    /**
     * Gets the value of the styleKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStyleKeywords() {
        if (styleKeywords == null) {
            styleKeywords = new ArrayList<String>();
        }
        return this.styleKeywords;
    }

    /**
     * 获取supportType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportType() {
        return supportType;
    }

    /**
     * 设置supportType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportType(String value) {
        this.supportType = value;
    }

    /**
     * 获取suspensionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspensionType() {
        return suspensionType;
    }

    /**
     * 设置suspensionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspensionType(String value) {
        this.suspensionType = value;
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
     * 获取targetZones属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetZones() {
        return targetZones;
    }

    /**
     * 设置targetZones属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetZones(BigInteger value) {
        this.targetZones = value;
    }

    /**
     * 获取teamName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 设置teamName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * 获取tensionSupported属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getTensionSupported() {
        return tensionSupported;
    }

    /**
     * 设置tensionSupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setTensionSupported(WeightDimension value) {
        this.tensionSupported = value;
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
     * 获取threadSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadSize() {
        return threadSize;
    }

    /**
     * 设置threadSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadSize(String value) {
        this.threadSize = value;
    }

    /**
     * 获取topStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopStyle() {
        return topStyle;
    }

    /**
     * 设置topStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopStyle(String value) {
        this.topStyle = value;
    }

    /**
     * 获取topTubeLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTopTubeLength() {
        return topTubeLength;
    }

    /**
     * 设置topTubeLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTopTubeLength(LengthDimension value) {
        this.topTubeLength = value;
    }

    /**
     * 获取trailerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrailerType() {
        return trailerType;
    }

    /**
     * 设置trailerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrailerType(String value) {
        this.trailerType = value;
    }

    /**
     * 获取turnRadius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTurnRadius() {
        return turnRadius;
    }

    /**
     * 设置turnRadius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTurnRadius(LengthDimension value) {
        this.turnRadius = value;
    }

    /**
     * 获取uiaaFallRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUIAAFallRating() {
        return uiaaFallRating;
    }

    /**
     * 设置uiaaFallRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUIAAFallRating(BigInteger value) {
        this.uiaaFallRating = value;
    }

    /**
     * 获取underwireType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderwireType() {
        return underwireType;
    }

    /**
     * 设置underwireType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderwireType(String value) {
        this.underwireType = value;
    }

    /**
     * 获取uniformNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniformNumber() {
        return uniformNumber;
    }

    /**
     * 设置uniformNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniformNumber(String value) {
        this.uniformNumber = value;
    }

    /**
     * 获取usageCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getUsageCapacity() {
        return usageCapacity;
    }

    /**
     * 设置usageCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setUsageCapacity(WeightDimension value) {
        this.usageCapacity = value;
    }

    /**
     * 获取uvProtection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUVProtection() {
        return uvProtection;
    }

    /**
     * 设置uvProtection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUVProtection(BigInteger value) {
        this.uvProtection = value;
    }

    /**
     * 获取volumeCapacityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalVolumeDimension }
     *     
     */
    public OptionalVolumeDimension getVolumeCapacityName() {
        return volumeCapacityName;
    }

    /**
     * 设置volumeCapacityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalVolumeDimension }
     *     
     */
    public void setVolumeCapacityName(OptionalVolumeDimension value) {
        this.volumeCapacityName = value;
    }

    /**
     * 获取waistSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWaistSize() {
        return waistSize;
    }

    /**
     * 设置waistSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWaistSize(LengthDimension value) {
        this.waistSize = value;
    }

    /**
     * 获取waistWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWaistWidth() {
        return waistWidth;
    }

    /**
     * 设置waistWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWaistWidth(LengthDimension value) {
        this.waistWidth = value;
    }

    /**
     * 获取warmthRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TemperatureRatingDimension }
     *     
     */
    public TemperatureRatingDimension getWarmthRating() {
        return warmthRating;
    }

    /**
     * 设置warmthRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureRatingDimension }
     *     
     */
    public void setWarmthRating(TemperatureRatingDimension value) {
        this.warmthRating = value;
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
     * 获取warranty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarranty() {
        return warranty;
    }

    /**
     * 设置warranty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarranty(String value) {
        this.warranty = value;
    }

    /**
     * 获取waterBottleCapType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterBottleCapType() {
        return waterBottleCapType;
    }

    /**
     * 设置waterBottleCapType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterBottleCapType(String value) {
        this.waterBottleCapType = value;
    }

    /**
     * 获取waterResistanceRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWaterResistanceRating() {
        return waterResistanceRating;
    }

    /**
     * 设置waterResistanceRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWaterResistanceRating(LengthDimension value) {
        this.waterResistanceRating = value;
    }

    /**
     * 获取waterType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterType() {
        return waterType;
    }

    /**
     * 设置waterType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterType(String value) {
        this.waterType = value;
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
     * 获取watts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getWatts() {
        return watts;
    }

    /**
     * 设置watts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setWatts(WattageDimension value) {
        this.watts = value;
    }

    /**
     * 获取wayPoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWayPoints() {
        return wayPoints;
    }

    /**
     * 设置wayPoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWayPoints(BigInteger value) {
        this.wayPoints = value;
    }

    /**
     * 获取weightCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getWeightCapacity() {
        return weightCapacity;
    }

    /**
     * 设置weightCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setWeightCapacity(WeightDimension value) {
        this.weightCapacity = value;
    }

    /**
     * 获取whatsInTheBox属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhatsInTheBox() {
        return whatsInTheBox;
    }

    /**
     * 设置whatsInTheBox属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhatsInTheBox(String value) {
        this.whatsInTheBox = value;
    }

    /**
     * 获取wheelType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWheelType() {
        return wheelType;
    }

    /**
     * 设置wheelType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWheelType(String value) {
        this.wheelType = value;
    }

    /**
     * 获取threadPitch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getThreadPitch() {
        return threadPitch;
    }

    /**
     * 设置threadPitch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setThreadPitch(LengthDimension value) {
        this.threadPitch = value;
    }

    /**
     * 获取driveSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveSystem() {
        return driveSystem;
    }

    /**
     * 设置driveSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveSystem(String value) {
        this.driveSystem = value;
    }

    /**
     * 获取bladeMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBladeMaterialType() {
        return bladeMaterialType;
    }

    /**
     * 设置bladeMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBladeMaterialType(String value) {
        this.bladeMaterialType = value;
    }

    /**
     * 获取sportsNumberOfPockets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSportsNumberOfPockets() {
        return sportsNumberOfPockets;
    }

    /**
     * 设置sportsNumberOfPockets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSportsNumberOfPockets(BigInteger value) {
        this.sportsNumberOfPockets = value;
    }

    /**
     * 获取workingLoadLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getWorkingLoadLimit() {
        return workingLoadLimit;
    }

    /**
     * 设置workingLoadLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setWorkingLoadLimit(WeightDimension value) {
        this.workingLoadLimit = value;
    }

    /**
     * 获取watchMovementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatchMovementType() {
        return watchMovementType;
    }

    /**
     * 设置watchMovementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatchMovementType(String value) {
        this.watchMovementType = value;
    }

    /**
     * 获取tankVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getTankVolume() {
        return tankVolume;
    }

    /**
     * 设置tankVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setTankVolume(VolumeDimension value) {
        this.tankVolume = value;
    }

    /**
     * 获取powerRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerRating() {
        return powerRating;
    }

    /**
     * 设置powerRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerRating(String value) {
        this.powerRating = value;
    }

    /**
     * 获取patternType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternType() {
        return patternType;
    }

    /**
     * 设置patternType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternType(String value) {
        this.patternType = value;
    }

    /**
     * 获取outputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OutputPowerDimension }
     *     
     */
    public OutputPowerDimension getOutputPower() {
        return outputPower;
    }

    /**
     * 设置outputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OutputPowerDimension }
     *     
     */
    public void setOutputPower(OutputPowerDimension value) {
        this.outputPower = value;
    }

    /**
     * 获取opticalPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OpticalPowerDimension }
     *     
     */
    public OpticalPowerDimension getOpticalPower() {
        return opticalPower;
    }

    /**
     * 设置opticalPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalPowerDimension }
     *     
     */
    public void setOpticalPower(OpticalPowerDimension value) {
        this.opticalPower = value;
    }

    /**
     * 获取minimumHeightRecommendation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumHeightRecommendation() {
        return minimumHeightRecommendation;
    }

    /**
     * 设置minimumHeightRecommendation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumHeightRecommendation(LengthDimension value) {
        this.minimumHeightRecommendation = value;
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
     * 获取ageRangeDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeRangeDescription() {
        return ageRangeDescription;
    }

    /**
     * 设置ageRangeDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeRangeDescription(String value) {
        this.ageRangeDescription = value;
    }

    /**
     * 获取collectionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * 设置collectionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionName(String value) {
        this.collectionName = value;
    }

    /**
     * 获取bandSizeNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBandSizeNumber() {
        return bandSizeNumber;
    }

    /**
     * 设置bandSizeNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBandSizeNumber(LengthDimension value) {
        this.bandSizeNumber = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="unitOfMeasure">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="CID"/>
     *             &lt;enumeration value="l"/>
     *             &lt;enumeration value="cc"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class EngineDisplacement {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "unitOfMeasure")
        protected String unitOfMeasure;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="unitOfMeasure">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="kilometer"/>
     *             &lt;enumeration value="mph"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class MaximumPitchSpeed {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "unitOfMeasure")
        protected String unitOfMeasure;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
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
     *               &lt;enumeration value="AgeGenderCategory"/>
     *               &lt;enumeration value="Amperage"/>
     *               &lt;enumeration value="BikeRimSize"/>
     *               &lt;enumeration value="BikeRimSizeMaterial"/>
     *               &lt;enumeration value="BootSize"/>
     *               &lt;enumeration value="BootSizeCalfSize"/>
     *               &lt;enumeration value="CalfSize"/>
     *               &lt;enumeration value="Caliber"/>
     *               &lt;enumeration value="CaliberRounds"/>
     *               &lt;enumeration value="Capacity"/>
     *               &lt;enumeration value="Color"/>
     *               &lt;enumeration value="ColorDesign"/>
     *               &lt;enumeration value="ColorFlavor"/>
     *               &lt;enumeration value="ColorItemThickness"/>
     *               &lt;enumeration value="ColorLength"/>
     *               &lt;enumeration value="ColorLensColor"/>
     *               &lt;enumeration value="ColorQuantity"/>
     *               &lt;enumeration value="ColorRounds"/>
     *               &lt;enumeration value="ColorShaftMaterial"/>
     *               &lt;enumeration value="ColorShaftType"/>
     *               &lt;enumeration value="ColorShape"/>
     *               &lt;enumeration value="ColorSize"/>
     *               &lt;enumeration value="ColorStyle"/>
     *               &lt;enumeration value="ColorTensionLevel"/>
     *               &lt;enumeration value="ColorWattage"/>
     *               &lt;enumeration value="ColorWeight"/>
     *               &lt;enumeration value="ColorWheelSize"/>
     *               &lt;enumeration value="ColorWidth"/>
     *               &lt;enumeration value="Curvature"/>
     *               &lt;enumeration value="CurvatureHand"/>
     *               &lt;enumeration value="Design"/>
     *               &lt;enumeration value="DesignFlavor"/>
     *               &lt;enumeration value="DesignLength"/>
     *               &lt;enumeration value="DesignLensColor"/>
     *               &lt;enumeration value="DesignShaftMaterial"/>
     *               &lt;enumeration value="DesignShaftType"/>
     *               &lt;enumeration value="DesignShape"/>
     *               &lt;enumeration value="DesignSize"/>
     *               &lt;enumeration value="DesignStyle"/>
     *               &lt;enumeration value="DesignTensionLevel"/>
     *               &lt;enumeration value="DesignWeight"/>
     *               &lt;enumeration value="DesignWheelSize"/>
     *               &lt;enumeration value="DesignWidth"/>
     *               &lt;enumeration value="Diameter"/>
     *               &lt;enumeration value="DivingHoodThickness"/>
     *               &lt;enumeration value="FencingPommelType"/>
     *               &lt;enumeration value="FencingPommelTypeGripType"/>
     *               &lt;enumeration value="Flavor"/>
     *               &lt;enumeration value="FlavorSize"/>
     *               &lt;enumeration value="GolfFlex"/>
     *               &lt;enumeration value="GolfFlexGolfLoft"/>
     *               &lt;enumeration value="GolfFlexMaterial"/>
     *               &lt;enumeration value="GolfFlexShaftMaterial"/>
     *               &lt;enumeration value="GolfLoft"/>
     *               &lt;enumeration value="GolfLoftShaftMaterial"/>
     *               &lt;enumeration value="GripSize"/>
     *               &lt;enumeration value="GripSizeGripType"/>
     *               &lt;enumeration value="GripSizeHeadSize"/>
     *               &lt;enumeration value="GripType"/>
     *               &lt;enumeration value="Hand"/>
     *               &lt;enumeration value="HandBounceGolfFlex"/>
     *               &lt;enumeration value="HandBounceShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HandClubGolfFlex"/>
     *               &lt;enumeration value="HandClubShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HandGolfFlex"/>
     *               &lt;enumeration value="HandIronsGolfFlex"/>
     *               &lt;enumeration value="HandIronsLieAngleGolfFlex"/>
     *               &lt;enumeration value="HandIronsLieAngleShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HandIronsShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HandLength"/>
     *               &lt;enumeration value="HandLieAngle"/>
     *               &lt;enumeration value="HandLieAngleGolfFlex"/>
     *               &lt;enumeration value="HandLieAngleLength"/>
     *               &lt;enumeration value="HandLieAngleShaftType"/>
     *               &lt;enumeration value="HandLieAngleShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HandLieAngleShaftTypeLength"/>
     *               &lt;enumeration value="HandGolfLoftBounceGolfFlex"/>
     *               &lt;enumeration value="HandGolfLoftBounceShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HandGolfLoftGolfFlex"/>
     *               &lt;enumeration value="HandGolfLoftShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HandModel"/>
     *               &lt;enumeration value="HandModelLength"/>
     *               &lt;enumeration value="HandModelShaftType"/>
     *               &lt;enumeration value="HandModelShaftTypeLength"/>
     *               &lt;enumeration value="HandShaftLength"/>
     *               &lt;enumeration value="HandShaftMaterialGolfFlex"/>
     *               &lt;enumeration value="HandShaftMaterialGolfFlexGolfLoft"/>
     *               &lt;enumeration value="HandShaftType"/>
     *               &lt;enumeration value="HandShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HandShaftTypeLength"/>
     *               &lt;enumeration value="HandSize"/>
     *               &lt;enumeration value="HandTensionLevel"/>
     *               &lt;enumeration value="HandWeight"/>
     *               &lt;enumeration value="HandWoodGolfFlex"/>
     *               &lt;enumeration value="HandWoodShaftTypeGolfFlex"/>
     *               &lt;enumeration value="HeadSize"/>
     *               &lt;enumeration value="HeadSizeShape"/>
     *               &lt;enumeration value="Height"/>
     *               &lt;enumeration value="HeightSize"/>
     *               &lt;enumeration value="HeightStyle"/>
     *               &lt;enumeration value="HeightWeight"/>
     *               &lt;enumeration value="HeightWidth"/>
     *               &lt;enumeration value="ItemThickness"/>
     *               &lt;enumeration value="Length"/>
     *               &lt;enumeration value="LengthLineCapacity"/>
     *               &lt;enumeration value="LengthLineWeight"/>
     *               &lt;enumeration value="LengthMaterial"/>
     *               &lt;enumeration value="LengthShaftType"/>
     *               &lt;enumeration value="LengthSize"/>
     *               &lt;enumeration value="LengthStyle"/>
     *               &lt;enumeration value="LengthWeight"/>
     *               &lt;enumeration value="LengthWeightSupported"/>
     *               &lt;enumeration value="LengthWidth"/>
     *               &lt;enumeration value="LensColor"/>
     *               &lt;enumeration value="LensColorMaterial"/>
     *               &lt;enumeration value="LensColorShape"/>
     *               &lt;enumeration value="LineCapacity"/>
     *               &lt;enumeration value="LineCapacitySize"/>
     *               &lt;enumeration value="LineCapacityWeight"/>
     *               &lt;enumeration value="LineWeight"/>
     *               &lt;enumeration value="LineWeightSize"/>
     *               &lt;enumeration value="Material"/>
     *               &lt;enumeration value="MaterialShape"/>
     *               &lt;enumeration value="MaterialSize"/>
     *               &lt;enumeration value="MaterialStyle"/>
     *               &lt;enumeration value="MaterialTensionLevel"/>
     *               &lt;enumeration value="MaterialWeight"/>
     *               &lt;enumeration value="MaterialWheelSize"/>
     *               &lt;enumeration value="MaterialWidth"/>
     *               &lt;enumeration value="Quantity"/>
     *               &lt;enumeration value="QuantityShape"/>
     *               &lt;enumeration value="QuantitySize"/>
     *               &lt;enumeration value="QuantityWeight"/>
     *               &lt;enumeration value="Rounds"/>
     *               &lt;enumeration value="RoundsSize"/>
     *               &lt;enumeration value="ShaftMaterial"/>
     *               &lt;enumeration value="ShaftMaterialShaftType"/>
     *               &lt;enumeration value="ShaftType"/>
     *               &lt;enumeration value="Shape"/>
     *               &lt;enumeration value="ShapeSize"/>
     *               &lt;enumeration value="ShapeTensionLevel"/>
     *               &lt;enumeration value="ShapeWeight"/>
     *               &lt;enumeration value="Size"/>
     *               &lt;enumeration value="SizeStyle"/>
     *               &lt;enumeration value="SizeTensionLevel"/>
     *               &lt;enumeration value="SizeWattage"/>
     *               &lt;enumeration value="SizeWeight"/>
     *               &lt;enumeration value="SizeWeightSupported"/>
     *               &lt;enumeration value="SizeWheelSize"/>
     *               &lt;enumeration value="SizeWidth"/>
     *               &lt;enumeration value="StyleTensionLevel"/>
     *               &lt;enumeration value="StyleWeight"/>
     *               &lt;enumeration value="StyleWheelSize"/>
     *               &lt;enumeration value="StyleWidth"/>
     *               &lt;enumeration value="TemperatureRating"/>
     *               &lt;enumeration value="TemperatureRatingColor"/>
     *               &lt;enumeration value="TemperatureRatingDesign"/>
     *               &lt;enumeration value="TemperatureRatingHand"/>
     *               &lt;enumeration value="TemperatureRatingLength"/>
     *               &lt;enumeration value="TemperatureRatingMaterial"/>
     *               &lt;enumeration value="TemperatureRatingShape"/>
     *               &lt;enumeration value="TemperatureRatingSize"/>
     *               &lt;enumeration value="TensionLevel"/>
     *               &lt;enumeration value="TensionLevelWeight"/>
     *               &lt;enumeration value="TensionLevelWeightSupported"/>
     *               &lt;enumeration value="Wattage"/>
     *               &lt;enumeration value="Weight"/>
     *               &lt;enumeration value="WeightSupported"/>
     *               &lt;enumeration value="WeightWidth"/>
     *               &lt;enumeration value="WheelSize"/>
     *               &lt;enumeration value="WheelSizeWeight"/>
     *               &lt;enumeration value="Width"/>
     *               &lt;enumeration value="CustomerPackageType"/>
     *               &lt;enumeration value="ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-ColorName-CustomerPackageType"/>
     *               &lt;enumeration value="StyleName-CustomerPackageType"/>
     *               &lt;enumeration value="SizeName-StyleName-CustomerPackageType"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AgeGenderCategory" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Amperage" type="{}AmperageDimension" minOccurs="0"/>
     *         &lt;element name="BikeRimSize" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="BootSize" type="{}Dimension" minOccurs="0"/>
     *         &lt;element name="Bounce" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="CalfSize" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Caliber" type="{}FourDecimal" minOccurs="0"/>
     *         &lt;element name="Capacity" type="{}VolumeDimension" minOccurs="0"/>
     *         &lt;element name="Club" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Curvature" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Department" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="Design" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Diameter" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="DivingHoodThickness" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="FencingPommelType" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Flavor" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="GolfFlex" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="GolfLoft" type="{}DegreeDimension" minOccurs="0"/>
     *         &lt;element name="GripSize" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="GripType" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Hand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HeadSize" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Height" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="Irons" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="ItemThickness" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="Length" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="LensColor" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="LieAngle" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="LineCapacity" type="{}OptionalLineCapacityDimension" minOccurs="0"/>
     *         &lt;element name="LineWeight" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Material" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Model" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="Occupancy" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="Rounds" type="{}PositiveInteger" minOccurs="0"/>
     *         &lt;element name="ShaftLength" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="ShaftMaterial" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="ShaftType" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Shape" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Style" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="TemperatureRating" type="{}TemperatureRatingDimension" minOccurs="0"/>
     *         &lt;element name="TensionLevel" type="{}StringNotNull" minOccurs="0"/>
     *         &lt;element name="Volume" type="{}VolumeDimension" minOccurs="0"/>
     *         &lt;element name="Wattage" type="{}WattageDimension" minOccurs="0"/>
     *         &lt;element name="Weight" type="{}WeightDimension" minOccurs="0"/>
     *         &lt;element name="WeightSupported" type="{}WeightDimension" minOccurs="0"/>
     *         &lt;element name="WheelSize" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="Width" type="{}LengthDimension" minOccurs="0"/>
     *         &lt;element name="Wood" type="{}StringNotNull" minOccurs="0"/>
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
        "ageGenderCategory",
        "amperage",
        "bikeRimSize",
        "bootSize",
        "bounce",
        "calfSize",
        "caliber",
        "capacity",
        "club",
        "color",
        "curvature",
        "customerPackageType",
        "department",
        "design",
        "diameter",
        "divingHoodThickness",
        "fencingPommelType",
        "flavor",
        "golfFlex",
        "golfLoft",
        "gripSize",
        "gripType",
        "hand",
        "headSize",
        "height",
        "irons",
        "itemThickness",
        "length",
        "lensColor",
        "lieAngle",
        "lineCapacity",
        "lineWeight",
        "material",
        "model",
        "numberOfItems",
        "occupancy",
        "quantity",
        "rounds",
        "shaftLength",
        "shaftMaterial",
        "shaftType",
        "shape",
        "size",
        "style",
        "temperatureRating",
        "tensionLevel",
        "volume",
        "wattage",
        "weight",
        "weightSupported",
        "wheelSize",
        "width",
        "wood"
    })
    public static class VariationData {

        @XmlElement(name = "Parentage")
        protected String parentage;
        @XmlElement(name = "VariationTheme")
        protected String variationTheme;
        @XmlElement(name = "AgeGenderCategory")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String ageGenderCategory;
        @XmlElement(name = "Amperage")
        protected AmperageDimension amperage;
        @XmlElement(name = "BikeRimSize")
        protected LengthDimension bikeRimSize;
        @XmlElement(name = "BootSize")
        protected BigDecimal bootSize;
        @XmlElement(name = "Bounce")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String bounce;
        @XmlElement(name = "CalfSize")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String calfSize;
        @XmlElement(name = "Caliber")
        protected BigDecimal caliber;
        @XmlElement(name = "Capacity")
        protected VolumeDimension capacity;
        @XmlElement(name = "Club")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String club;
        @XmlElement(name = "Color")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String color;
        @XmlElement(name = "Curvature")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String curvature;
        @XmlElement(name = "CustomerPackageType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String customerPackageType;
        @XmlElement(name = "Department")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> department;
        @XmlElement(name = "Design")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String design;
        @XmlElement(name = "Diameter")
        protected LengthDimension diameter;
        @XmlElement(name = "DivingHoodThickness")
        protected LengthDimension divingHoodThickness;
        @XmlElement(name = "FencingPommelType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String fencingPommelType;
        @XmlElement(name = "Flavor")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String flavor;
        @XmlElement(name = "GolfFlex")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String golfFlex;
        @XmlElement(name = "GolfLoft")
        protected DegreeDimension golfLoft;
        @XmlElement(name = "GripSize")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String gripSize;
        @XmlElement(name = "GripType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String gripType;
        @XmlElement(name = "Hand")
        protected String hand;
        @XmlElement(name = "HeadSize")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String headSize;
        @XmlElement(name = "Height")
        protected LengthDimension height;
        @XmlElement(name = "Irons")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String irons;
        @XmlElement(name = "ItemThickness")
        protected LengthDimension itemThickness;
        @XmlElement(name = "Length")
        protected LengthDimension length;
        @XmlElement(name = "LensColor")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lensColor;
        @XmlElement(name = "LieAngle")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lieAngle;
        @XmlElement(name = "LineCapacity")
        protected OptionalLineCapacityDimension lineCapacity;
        @XmlElement(name = "LineWeight")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String lineWeight;
        @XmlElement(name = "Material")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String material;
        @XmlElement(name = "Model")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String model;
        @XmlElement(name = "NumberOfItems")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger numberOfItems;
        @XmlElement(name = "Occupancy")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String occupancy;
        @XmlElement(name = "Quantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;
        @XmlElement(name = "Rounds")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger rounds;
        @XmlElement(name = "ShaftLength")
        protected LengthDimension shaftLength;
        @XmlElement(name = "ShaftMaterial")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String shaftMaterial;
        @XmlElement(name = "ShaftType")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String shaftType;
        @XmlElement(name = "Shape")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String shape;
        @XmlElement(name = "Size")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String size;
        @XmlElement(name = "Style")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String style;
        @XmlElement(name = "TemperatureRating")
        protected TemperatureRatingDimension temperatureRating;
        @XmlElement(name = "TensionLevel")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String tensionLevel;
        @XmlElement(name = "Volume")
        protected VolumeDimension volume;
        @XmlElement(name = "Wattage")
        protected WattageDimension wattage;
        @XmlElement(name = "Weight")
        protected WeightDimension weight;
        @XmlElement(name = "WeightSupported")
        protected WeightDimension weightSupported;
        @XmlElement(name = "WheelSize")
        protected LengthDimension wheelSize;
        @XmlElement(name = "Width")
        protected LengthDimension width;
        @XmlElement(name = "Wood")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String wood;

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
         * 获取ageGenderCategory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeGenderCategory() {
            return ageGenderCategory;
        }

        /**
         * 设置ageGenderCategory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeGenderCategory(String value) {
            this.ageGenderCategory = value;
        }

        /**
         * 获取amperage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AmperageDimension }
         *     
         */
        public AmperageDimension getAmperage() {
            return amperage;
        }

        /**
         * 设置amperage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AmperageDimension }
         *     
         */
        public void setAmperage(AmperageDimension value) {
            this.amperage = value;
        }

        /**
         * 获取bikeRimSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LengthDimension }
         *     
         */
        public LengthDimension getBikeRimSize() {
            return bikeRimSize;
        }

        /**
         * 设置bikeRimSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LengthDimension }
         *     
         */
        public void setBikeRimSize(LengthDimension value) {
            this.bikeRimSize = value;
        }

        /**
         * 获取bootSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBootSize() {
            return bootSize;
        }

        /**
         * 设置bootSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBootSize(BigDecimal value) {
            this.bootSize = value;
        }

        /**
         * 获取bounce属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBounce() {
            return bounce;
        }

        /**
         * 设置bounce属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBounce(String value) {
            this.bounce = value;
        }

        /**
         * 获取calfSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalfSize() {
            return calfSize;
        }

        /**
         * 设置calfSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalfSize(String value) {
            this.calfSize = value;
        }

        /**
         * 获取caliber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCaliber() {
            return caliber;
        }

        /**
         * 设置caliber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCaliber(BigDecimal value) {
            this.caliber = value;
        }

        /**
         * 获取capacity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VolumeDimension }
         *     
         */
        public VolumeDimension getCapacity() {
            return capacity;
        }

        /**
         * 设置capacity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VolumeDimension }
         *     
         */
        public void setCapacity(VolumeDimension value) {
            this.capacity = value;
        }

        /**
         * 获取club属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClub() {
            return club;
        }

        /**
         * 设置club属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClub(String value) {
            this.club = value;
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
         * 获取curvature属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurvature() {
            return curvature;
        }

        /**
         * 设置curvature属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurvature(String value) {
            this.curvature = value;
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
         * Gets the value of the department property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the department property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDepartment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDepartment() {
            if (department == null) {
                department = new ArrayList<String>();
            }
            return this.department;
        }

        /**
         * 获取design属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesign() {
            return design;
        }

        /**
         * 设置design属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesign(String value) {
            this.design = value;
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
         * 获取divingHoodThickness属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LengthDimension }
         *     
         */
        public LengthDimension getDivingHoodThickness() {
            return divingHoodThickness;
        }

        /**
         * 设置divingHoodThickness属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LengthDimension }
         *     
         */
        public void setDivingHoodThickness(LengthDimension value) {
            this.divingHoodThickness = value;
        }

        /**
         * 获取fencingPommelType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFencingPommelType() {
            return fencingPommelType;
        }

        /**
         * 设置fencingPommelType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFencingPommelType(String value) {
            this.fencingPommelType = value;
        }

        /**
         * 获取flavor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlavor() {
            return flavor;
        }

        /**
         * 设置flavor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlavor(String value) {
            this.flavor = value;
        }

        /**
         * 获取golfFlex属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGolfFlex() {
            return golfFlex;
        }

        /**
         * 设置golfFlex属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGolfFlex(String value) {
            this.golfFlex = value;
        }

        /**
         * 获取golfLoft属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DegreeDimension }
         *     
         */
        public DegreeDimension getGolfLoft() {
            return golfLoft;
        }

        /**
         * 设置golfLoft属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DegreeDimension }
         *     
         */
        public void setGolfLoft(DegreeDimension value) {
            this.golfLoft = value;
        }

        /**
         * 获取gripSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGripSize() {
            return gripSize;
        }

        /**
         * 设置gripSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGripSize(String value) {
            this.gripSize = value;
        }

        /**
         * 获取gripType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGripType() {
            return gripType;
        }

        /**
         * 设置gripType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGripType(String value) {
            this.gripType = value;
        }

        /**
         * 获取hand属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHand() {
            return hand;
        }

        /**
         * 设置hand属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHand(String value) {
            this.hand = value;
        }

        /**
         * 获取headSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeadSize() {
            return headSize;
        }

        /**
         * 设置headSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeadSize(String value) {
            this.headSize = value;
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
         * 获取irons属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIrons() {
            return irons;
        }

        /**
         * 设置irons属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIrons(String value) {
            this.irons = value;
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
         * 获取lensColor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLensColor() {
            return lensColor;
        }

        /**
         * 设置lensColor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLensColor(String value) {
            this.lensColor = value;
        }

        /**
         * 获取lieAngle属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLieAngle() {
            return lieAngle;
        }

        /**
         * 设置lieAngle属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLieAngle(String value) {
            this.lieAngle = value;
        }

        /**
         * 获取lineCapacity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OptionalLineCapacityDimension }
         *     
         */
        public OptionalLineCapacityDimension getLineCapacity() {
            return lineCapacity;
        }

        /**
         * 设置lineCapacity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OptionalLineCapacityDimension }
         *     
         */
        public void setLineCapacity(OptionalLineCapacityDimension value) {
            this.lineCapacity = value;
        }

        /**
         * 获取lineWeight属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLineWeight() {
            return lineWeight;
        }

        /**
         * 设置lineWeight属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLineWeight(String value) {
            this.lineWeight = value;
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
         * 获取model属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModel() {
            return model;
        }

        /**
         * 设置model属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModel(String value) {
            this.model = value;
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
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * 获取rounds属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRounds() {
            return rounds;
        }

        /**
         * 设置rounds属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRounds(BigInteger value) {
            this.rounds = value;
        }

        /**
         * 获取shaftLength属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LengthDimension }
         *     
         */
        public LengthDimension getShaftLength() {
            return shaftLength;
        }

        /**
         * 设置shaftLength属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LengthDimension }
         *     
         */
        public void setShaftLength(LengthDimension value) {
            this.shaftLength = value;
        }

        /**
         * 获取shaftMaterial属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShaftMaterial() {
            return shaftMaterial;
        }

        /**
         * 设置shaftMaterial属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShaftMaterial(String value) {
            this.shaftMaterial = value;
        }

        /**
         * 获取shaftType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShaftType() {
            return shaftType;
        }

        /**
         * 设置shaftType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShaftType(String value) {
            this.shaftType = value;
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
         * 获取temperatureRating属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TemperatureRatingDimension }
         *     
         */
        public TemperatureRatingDimension getTemperatureRating() {
            return temperatureRating;
        }

        /**
         * 设置temperatureRating属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TemperatureRatingDimension }
         *     
         */
        public void setTemperatureRating(TemperatureRatingDimension value) {
            this.temperatureRating = value;
        }

        /**
         * 获取tensionLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTensionLevel() {
            return tensionLevel;
        }

        /**
         * 设置tensionLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTensionLevel(String value) {
            this.tensionLevel = value;
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
         *     {@link WattageDimension }
         *     
         */
        public WattageDimension getWattage() {
            return wattage;
        }

        /**
         * 设置wattage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link WattageDimension }
         *     
         */
        public void setWattage(WattageDimension value) {
            this.wattage = value;
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
         * 获取weightSupported属性的值。
         * 
         * @return
         *     possible object is
         *     {@link WeightDimension }
         *     
         */
        public WeightDimension getWeightSupported() {
            return weightSupported;
        }

        /**
         * 设置weightSupported属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link WeightDimension }
         *     
         */
        public void setWeightSupported(WeightDimension value) {
            this.weightSupported = value;
        }

        /**
         * 获取wheelSize属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LengthDimension }
         *     
         */
        public LengthDimension getWheelSize() {
            return wheelSize;
        }

        /**
         * 设置wheelSize属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LengthDimension }
         *     
         */
        public void setWheelSize(LengthDimension value) {
            this.wheelSize = value;
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
         * 获取wood属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWood() {
            return wood;
        }

        /**
         * 设置wood属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWood(String value) {
            this.wood = value;
        }

    }

}
