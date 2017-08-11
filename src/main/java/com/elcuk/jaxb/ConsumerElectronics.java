
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
 *                         &lt;enumeration value="Size"/>
 *                         &lt;enumeration value="Size-Color"/>
 *                         &lt;enumeration value="Scent"/>
 *                         &lt;enumeration value="Size-Scent"/>
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
 *         &lt;element name="AudibleNoise" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CustomerPackageType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CanShipInOriginalContainer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}EnclosureFinish" minOccurs="0"/>
 *         &lt;element ref="{}EuEnergyLabelEfficiencyClass" minOccurs="0"/>
 *         &lt;element name="IdentityPackageType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}StringNotNull">
 *               &lt;enumeration value="bulk"/>
 *               &lt;enumeration value="frustration_free"/>
 *               &lt;enumeration value="traditional"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Voltage" type="{}VoltageDecimalDimension" minOccurs="0"/>
 *         &lt;element name="Wattage" type="{}WattageIntegerDimension" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="AdditionalFeatures" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="VehicleSpeakerSize" type="{}TwentyStringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeakerDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="TelephoneType" type="{}FortyStringNotNull" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="PDABaseModel" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DigitalMediaFormat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="diskette35"/>
 *               &lt;enumeration value="3480_tape_cartridge"/>
 *               &lt;enumeration value="4_mm_tape"/>
 *               &lt;enumeration value="diskette525"/>
 *               &lt;enumeration value="6250_magstar_tape"/>
 *               &lt;enumeration value="cd"/>
 *               &lt;enumeration value="compact_flash"/>
 *               &lt;enumeration value="dat_tape"/>
 *               &lt;enumeration value="digital_8"/>
 *               &lt;enumeration value="dlt"/>
 *               &lt;enumeration value="dvd_ram"/>
 *               &lt;enumeration value="dvd_rom"/>
 *               &lt;enumeration value="dvd_video"/>
 *               &lt;enumeration value="electronic_software_download"/>
 *               &lt;enumeration value="hi_8"/>
 *               &lt;enumeration value="memory_stick"/>
 *               &lt;enumeration value="minidisc"/>
 *               &lt;enumeration value="minidv"/>
 *               &lt;enumeration value="smart_media"/>
 *               &lt;enumeration value="vhs"/>
 *               &lt;enumeration value="xd_card"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HomeAutomationCommunicationDevice" type="{}ThirtyStringNotNull" minOccurs="0"/>
 *         &lt;element name="DigitalAudioCapacity" type="{}TwentyStringNotNull" minOccurs="0"/>
 *         &lt;element name="VideoProcessor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HolderCapacity" type="{}TwentyStringNotNull" minOccurs="0"/>
 *         &lt;element name="MemorySlotsAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorBrand" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ProcessorType" type="{}ProcessorTypeValues" minOccurs="0"/>
 *         &lt;element name="ProcessorSpeed" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="RAMSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="ScreenResolution" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="SoftwareIncluded" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorScreen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScreenSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="WirelessType" type="{}WirelessTypeValues" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="HardDriveSize" type="{}MemorySizeDimension" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="HardDriveInterface" type="{}HardDriveInterfaceTypeValues" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="OperatingSystem" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="HardwarePlatform" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="ComputerMemoryType" type="{}GraphicsRAMTypeValues" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PurchasingFeeRefSKU" type="{}SKUType" minOccurs="0"/>
 *         &lt;element ref="{}ThreeDTechnology" minOccurs="0"/>
 *         &lt;element ref="{}BiAmpable" minOccurs="0"/>
 *         &lt;element ref="{}AntennaDescription" minOccurs="0"/>
 *         &lt;element ref="{}AudioEncoding" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}Language" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="LoadCapacity" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element ref="{}BaseLength" minOccurs="0"/>
 *         &lt;element ref="{}BaseWidth" minOccurs="0"/>
 *         &lt;element name="BatteryChargeCycles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}BatteryCellType" minOccurs="0"/>
 *         &lt;element name="CableLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}CalibrationTechnology" minOccurs="0"/>
 *         &lt;element ref="{}CameraDescription" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="CameraLens" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ConnectorGender" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}ConnectorTypeUsedOnCable" minOccurs="0"/>
 *         &lt;element ref="{}ControlType" minOccurs="0"/>
 *         &lt;element ref="{}ControllerType" minOccurs="0"/>
 *         &lt;element name="CoolingType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ScreenDimensions" minOccurs="0"/>
 *         &lt;element ref="{}Efficiency" minOccurs="0"/>
 *         &lt;element name="NumberOfFans" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}FinishType" minOccurs="0"/>
 *         &lt;element ref="{}FitType" minOccurs="0"/>
 *         &lt;element ref="{}FrontPanelInputs" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}HorizontalKeystoneCorrection" minOccurs="0"/>
 *         &lt;element ref="{}BuiltInMedia" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="ImageSensor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}IncludedFeatures" minOccurs="0"/>
 *         &lt;element ref="{}Shape" minOccurs="0"/>
 *         &lt;element name="Lens" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LampWattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}MaximumSupportedScreenSize" minOccurs="0"/>
 *         &lt;element ref="{}ThrowRatio" minOccurs="0"/>
 *         &lt;element name="MaximumHorizontalRefreshRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element ref="{}SurgeProtectionRating" minOccurs="0"/>
 *         &lt;element name="MaximumThrowDistance" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumVerticalRefreshRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element ref="{}MaxWeightRecommendation" minOccurs="0"/>
 *         &lt;element ref="{}MediaLayers" minOccurs="0"/>
 *         &lt;element ref="{}MidRangeSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}MidRangeSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}MinFocalLength" minOccurs="0"/>
 *         &lt;element ref="{}MinimumSupportedScreenSize" minOccurs="0"/>
 *         &lt;element name="MinimumHorizontalRefreshRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="MinimumThrowDistance" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MinimumVerticalRefreshRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element ref="{}MountingPattern" minOccurs="0"/>
 *         &lt;element ref="{}MountingType" minOccurs="0"/>
 *         &lt;element ref="{}HeadphoneEarcupMotion" minOccurs="0"/>
 *         &lt;element ref="{}MountMotion" minOccurs="0"/>
 *         &lt;element ref="{}NoiseReductionLevel" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfDrivers" minOccurs="0"/>
 *         &lt;element ref="{}SignalPassthroughTechnology" minOccurs="0"/>
 *         &lt;element name="LampLife" type="{}TimeIntegerDimension" minOccurs="0"/>
 *         &lt;element name="ImageDiagonalSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element ref="{}ParentalControlTechnology" minOccurs="0"/>
 *         &lt;element ref="{}MountBoltPattern" minOccurs="0"/>
 *         &lt;element ref="{}ProjectionMethod" minOccurs="0"/>
 *         &lt;element name="PhotoSensorSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PhotoSensorTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}AntennaLocation" minOccurs="0"/>
 *         &lt;element ref="{}Resolution" minOccurs="0"/>
 *         &lt;element ref="{}SVideoInputType" minOccurs="0"/>
 *         &lt;element ref="{}ScreenFinish" minOccurs="0"/>
 *         &lt;element ref="{}VideoShielded" minOccurs="0"/>
 *         &lt;element ref="{}VideoUpconversionTechnologies" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfSpeakers" minOccurs="0"/>
 *         &lt;element ref="{}GrilleRemoveability" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerGrilleMaterial" minOccurs="0"/>
 *         &lt;element ref="{}MaximumWattage" minOccurs="0"/>
 *         &lt;element ref="{}SubscriptionTermName" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferWattage" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}SubwooferPowerTechnology" minOccurs="0"/>
 *         &lt;element ref="{}InternetApplications" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}TotalCoaxialInputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalComponentInPorts" minOccurs="0"/>
 *         &lt;element name="TotalCompositePorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalEthernetPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalHdmiPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalPowerOutlets" minOccurs="0"/>
 *         &lt;element ref="{}TotalPreampOutputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalSVideoInPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalSubwooferOutputs" minOccurs="0"/>
 *         &lt;element ref="{}TotalVgaInPorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalVideoOutPorts" minOccurs="0"/>
 *         &lt;element ref="{}TrafficFeatures" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ScreenTrigger" type="{}VoltageDecimalDimension" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerDiameter" minOccurs="0"/>
 *         &lt;element ref="{}TweeterSpeakerTechnology" minOccurs="0"/>
 *         &lt;element ref="{}UniversalRemoteCode" minOccurs="0"/>
 *         &lt;element ref="{}VerticalKeystoneCorrection" minOccurs="0"/>
 *         &lt;element ref="{}VideoEncoding" minOccurs="0"/>
 *         &lt;element name="VideoResolution" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element ref="{}WaterResistantDepth" minOccurs="0"/>
 *         &lt;element ref="{}WaterResistantLevel" minOccurs="0"/>
 *         &lt;element name="WirelessTechnology" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}WooferSpeakerMaterial" minOccurs="0"/>
 *         &lt;element ref="{}WooferSpeakerDiameter" minOccurs="0"/>
 *         &lt;element name="ZoomRatio" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ZoomType" minOccurs="0"/>
 *         &lt;element ref="{}AmplifierType" minOccurs="0"/>
 *         &lt;element ref="{}AnalogRGBInput" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{}BatteryPower" minOccurs="0"/>
 *         &lt;element ref="{}BluRayRegion" minOccurs="0"/>
 *         &lt;element ref="{}BoxContents" minOccurs="0"/>
 *         &lt;element ref="{}CameraFilmSpeed" minOccurs="0"/>
 *         &lt;element ref="{}CameraFlash" minOccurs="0"/>
 *         &lt;element ref="{}CoatingDescription" minOccurs="0"/>
 *         &lt;element ref="{}CompatibleMountings" minOccurs="0"/>
 *         &lt;element name="Conductor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}ContinuousShootingSpeed" minOccurs="0"/>
 *         &lt;element ref="{}DigitalZoom" minOccurs="0"/>
 *         &lt;element ref="{}DVDRegion" minOccurs="0"/>
 *         &lt;element ref="{}EffectiveStillResolution" minOccurs="0"/>
 *         &lt;element ref="{}FixedFocalLength" minOccurs="0"/>
 *         &lt;element ref="{}FlashDedication" minOccurs="0"/>
 *         &lt;element ref="{}FlashModesDescription" minOccurs="0"/>
 *         &lt;element ref="{}FocusType" minOccurs="0"/>
 *         &lt;element ref="{}GuideNumber" minOccurs="0"/>
 *         &lt;element ref="{}ImageStabilization" minOccurs="0"/>
 *         &lt;element ref="{}IsHotShoeIncluded" minOccurs="0"/>
 *         &lt;element ref="{}MaxAperture" minOccurs="0"/>
 *         &lt;element ref="{}MaxFocalLength" minOccurs="0"/>
 *         &lt;element ref="{}MaxShutterSpeed" minOccurs="0"/>
 *         &lt;element ref="{}MaxWeightCapacity" minOccurs="0"/>
 *         &lt;element ref="{}MinAperture" minOccurs="0"/>
 *         &lt;element ref="{}MinShutterSpeed" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfHandsets" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfRadioBandsSupported" minOccurs="0"/>
 *         &lt;element ref="{}NumberOfRecordingLoops" minOccurs="0"/>
 *         &lt;element ref="{}OpticalZoom" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterBayonetSize" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterDropInSize" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterEffectSize" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterLensSize" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterMountType" minOccurs="0"/>
 *         &lt;element ref="{}PhotoFilterThreadSize" minOccurs="0"/>
 *         &lt;element ref="{}PowerConsumption" minOccurs="0"/>
 *         &lt;element ref="{}PowerPlugType" minOccurs="0"/>
 *         &lt;element ref="{}RefreshRate" minOccurs="0"/>
 *         &lt;element name="RemoteControlDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemovableMemory" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerMaximumInputPower" minOccurs="0"/>
 *         &lt;element name="TotalDVIPorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalFirewirePorts" minOccurs="0"/>
 *         &lt;element ref="{}TotalMicrophonePorts" minOccurs="0"/>
 *         &lt;element name="TotalSVideoOutPorts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}TotalUSBPorts" minOccurs="0"/>
 *         &lt;element ref="{}TweeterConeMaterialType" minOccurs="0"/>
 *         &lt;element ref="{}TweeterDriverDiameter" minOccurs="0"/>
 *         &lt;element ref="{}ViewFinderType" minOccurs="0"/>
 *         &lt;element ref="{}WaypointsType" minOccurs="0"/>
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
    "audibleNoise",
    "color",
    "colorMap",
    "customerPackageType",
    "canShipInOriginalContainer",
    "enclosureFinish",
    "euEnergyLabelEfficiencyClass",
    "identityPackageType",
    "voltage",
    "wattage",
    "powerSource",
    "additionalFeatures",
    "vehicleSpeakerSize",
    "speakerDiameter",
    "telephoneType",
    "pdaBaseModel",
    "digitalMediaFormat",
    "homeAutomationCommunicationDevice",
    "digitalAudioCapacity",
    "videoProcessor",
    "holderCapacity",
    "memorySlotsAvailable",
    "processorBrand",
    "processorCount",
    "processorType",
    "processorSpeed",
    "ramSize",
    "screenResolution",
    "softwareIncluded",
    "colorScreen",
    "screenSize",
    "wirelessType",
    "hardDriveSize",
    "hardDriveInterface",
    "operatingSystem",
    "hardwarePlatform",
    "computerMemoryType",
    "itemPackageQuantity",
    "purchasingFeeRefSKU",
    "threeDTechnology",
    "biAmpable",
    "antennaDescription",
    "audioEncoding",
    "language",
    "loadCapacity",
    "baseLength",
    "baseWidth",
    "batteryChargeCycles",
    "batteryCellType",
    "cableLength",
    "calibrationTechnology",
    "cameraDescription",
    "cameraLens",
    "connectorGender",
    "connectorTypeUsedOnCable",
    "controlType",
    "controllerType",
    "coolingType",
    "screenDimensions",
    "efficiency",
    "numberOfFans",
    "finishType",
    "fitType",
    "frontPanelInputs",
    "horizontalKeystoneCorrection",
    "builtInMedia",
    "imageSensor",
    "includedFeatures",
    "shape",
    "lens",
    "lampWattage",
    "maximumSupportedScreenSize",
    "throwRatio",
    "maximumHorizontalRefreshRate",
    "surgeProtectionRating",
    "maximumThrowDistance",
    "maximumVerticalRefreshRate",
    "maxWeightRecommendation",
    "mediaLayers",
    "midRangeSpeakerMaterial",
    "midRangeSpeakerDiameter",
    "minFocalLength",
    "minimumSupportedScreenSize",
    "minimumHorizontalRefreshRate",
    "minimumThrowDistance",
    "minimumVerticalRefreshRate",
    "mountingPattern",
    "mountingType",
    "headphoneEarcupMotion",
    "mountMotion",
    "noiseReductionLevel",
    "numberOfDrivers",
    "signalPassthroughTechnology",
    "lampLife",
    "imageDiagonalSize",
    "parentalControlTechnology",
    "mountBoltPattern",
    "projectionMethod",
    "photoSensorSize",
    "photoSensorTechnology",
    "antennaLocation",
    "resolution",
    "sVideoInputType",
    "screenFinish",
    "videoShielded",
    "videoUpconversionTechnologies",
    "numberOfSpeakers",
    "grilleRemoveability",
    "speakerGrilleMaterial",
    "maximumWattage",
    "subscriptionTermName",
    "subwooferWattage",
    "subwooferSpeakerMaterial",
    "subwooferSpeakerDiameter",
    "subwooferPowerTechnology",
    "internetApplications",
    "totalCoaxialInputs",
    "totalComponentInPorts",
    "totalCompositePorts",
    "totalEthernetPorts",
    "totalHdmiPorts",
    "totalPowerOutlets",
    "totalPreampOutputs",
    "totalSVideoInPorts",
    "totalSubwooferOutputs",
    "totalVgaInPorts",
    "totalVideoOutPorts",
    "trafficFeatures",
    "screenTrigger",
    "tweeterSpeakerMaterial",
    "tweeterSpeakerDiameter",
    "tweeterSpeakerTechnology",
    "universalRemoteCode",
    "verticalKeystoneCorrection",
    "videoEncoding",
    "videoResolution",
    "waterResistantDepth",
    "waterResistantLevel",
    "wirelessTechnology",
    "wooferSpeakerMaterial",
    "wooferSpeakerDiameter",
    "zoomRatio",
    "zoomType",
    "amplifierType",
    "analogRGBInput",
    "batteryPower",
    "bluRayRegion",
    "boxContents",
    "cameraFilmSpeed",
    "cameraFlash",
    "coatingDescription",
    "compatibleMountings",
    "conductor",
    "continuousShootingSpeed",
    "digitalZoom",
    "dvdRegion",
    "effectiveStillResolution",
    "fixedFocalLength",
    "flashDedication",
    "flashModesDescription",
    "focusType",
    "guideNumber",
    "imageStabilization",
    "isHotShoeIncluded",
    "maxAperture",
    "maxFocalLength",
    "maxShutterSpeed",
    "maxWeightCapacity",
    "minAperture",
    "minShutterSpeed",
    "numberOfHandsets",
    "numberOfRadioBandsSupported",
    "numberOfRecordingLoops",
    "opticalZoom",
    "photoFilterBayonetSize",
    "photoFilterDropInSize",
    "photoFilterEffectSize",
    "photoFilterLensSize",
    "photoFilterMountType",
    "photoFilterThreadSize",
    "powerConsumption",
    "powerPlugType",
    "refreshRate",
    "remoteControlDescription",
    "removableMemory",
    "speakerMaximumInputPower",
    "totalDVIPorts",
    "totalFirewirePorts",
    "totalMicrophonePorts",
    "totalSVideoOutPorts",
    "totalUSBPorts",
    "tweeterConeMaterialType",
    "tweeterDriverDiameter",
    "viewFinderType",
    "waypointsType"
})
@XmlRootElement(name = "ConsumerElectronics")
public class ConsumerElectronics {

    @XmlElement(name = "VariationData")
    protected ConsumerElectronics.VariationData variationData;
    @XmlElement(name = "AudibleNoise")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger audibleNoise;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String color;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "CustomerPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String customerPackageType;
    @XmlElement(name = "CanShipInOriginalContainer")
    protected Boolean canShipInOriginalContainer;
    @XmlElement(name = "EnclosureFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String enclosureFinish;
    @XmlElement(name = "EuEnergyLabelEfficiencyClass")
    protected String euEnergyLabelEfficiencyClass;
    @XmlElement(name = "IdentityPackageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String identityPackageType;
    @XmlElement(name = "Voltage")
    protected VoltageDecimalDimension voltage;
    @XmlElement(name = "Wattage")
    protected WattageIntegerDimension wattage;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "VehicleSpeakerSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String vehicleSpeakerSize;
    @XmlElement(name = "SpeakerDiameter")
    protected LengthDimension speakerDiameter;
    @XmlElement(name = "TelephoneType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> telephoneType;
    @XmlElement(name = "PDABaseModel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> pdaBaseModel;
    @XmlElement(name = "DigitalMediaFormat")
    protected String digitalMediaFormat;
    @XmlElement(name = "HomeAutomationCommunicationDevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String homeAutomationCommunicationDevice;
    @XmlElement(name = "DigitalAudioCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String digitalAudioCapacity;
    @XmlElement(name = "VideoProcessor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoProcessor;
    @XmlElement(name = "HolderCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String holderCapacity;
    @XmlElement(name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memorySlotsAvailable;
    @XmlElement(name = "ProcessorBrand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorBrand;
    @XmlElement(name = "ProcessorCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger processorCount;
    @XmlElement(name = "ProcessorType")
    protected String processorType;
    @XmlElement(name = "ProcessorSpeed")
    protected FrequencyDimension processorSpeed;
    @XmlElement(name = "RAMSize")
    protected MemorySizeDimension ramSize;
    @XmlElement(name = "ScreenResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenResolution;
    @XmlElement(name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String softwareIncluded;
    @XmlElement(name = "ColorScreen")
    protected Boolean colorScreen;
    @XmlElement(name = "ScreenSize")
    protected LengthDimension screenSize;
    @XmlElement(name = "WirelessType")
    protected List<String> wirelessType;
    @XmlElement(name = "HardDriveSize")
    protected List<MemorySizeDimension> hardDriveSize;
    @XmlElement(name = "HardDriveInterface")
    @XmlSchemaType(name = "string")
    protected List<HardDriveInterfaceTypeValues> hardDriveInterface;
    @XmlElement(name = "OperatingSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "HardwarePlatform")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hardwarePlatform;
    @XmlElement(name = "ComputerMemoryType")
    protected List<String> computerMemoryType;
    @XmlElement(name = "ItemPackageQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;
    @XmlElement(name = "PurchasingFeeRefSKU")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String purchasingFeeRefSKU;
    @XmlElement(name = "ThreeDTechnology")
    @XmlSchemaType(name = "string")
    protected ThreeDTechnologyValues threeDTechnology;
    @XmlElement(name = "BiAmpable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String biAmpable;
    @XmlElement(name = "AntennaDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String antennaDescription;
    @XmlElement(name = "AudioEncoding")
    protected List<String> audioEncoding;
    @XmlElement(name = "Language")
    @XmlSchemaType(name = "string")
    protected List<LanguageStringType> language;
    @XmlElement(name = "LoadCapacity")
    protected WeightDimension loadCapacity;
    @XmlElement(name = "BaseLength")
    protected LengthDimension baseLength;
    @XmlElement(name = "BaseWidth")
    protected LengthDimension baseWidth;
    @XmlElement(name = "BatteryChargeCycles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryChargeCycles;
    @XmlElement(name = "BatteryCellType")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellType;
    @XmlElement(name = "CableLength")
    protected LengthDimension cableLength;
    @XmlElement(name = "CalibrationTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String calibrationTechnology;
    @XmlElement(name = "CameraDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> cameraDescription;
    @XmlElement(name = "CameraLens")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cameraLens;
    @XmlElement(name = "ConnectorGender")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> connectorGender;
    @XmlElement(name = "ConnectorTypeUsedOnCable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String connectorTypeUsedOnCable;
    @XmlElement(name = "ControlType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String controlType;
    @XmlElement(name = "ControllerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String controllerType;
    @XmlElement(name = "CoolingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coolingType;
    @XmlElement(name = "ScreenDimensions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenDimensions;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;
    @XmlElement(name = "NumberOfFans")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfFans;
    @XmlElement(name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String finishType;
    @XmlElement(name = "FitType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fitType;
    @XmlElement(name = "FrontPanelInputs")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> frontPanelInputs;
    @XmlElement(name = "HorizontalKeystoneCorrection")
    protected LengthDimension horizontalKeystoneCorrection;
    @XmlElement(name = "BuiltInMedia")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> builtInMedia;
    @XmlElement(name = "ImageSensor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String imageSensor;
    @XmlElement(name = "IncludedFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String includedFeatures;
    @XmlElement(name = "Shape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shape;
    @XmlElement(name = "Lens")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lens;
    @XmlElement(name = "LampWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lampWattage;
    @XmlElement(name = "MaximumSupportedScreenSize")
    protected LengthDimension maximumSupportedScreenSize;
    @XmlElement(name = "ThrowRatio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String throwRatio;
    @XmlElement(name = "MaximumHorizontalRefreshRate")
    protected FrequencyDimension maximumHorizontalRefreshRate;
    @XmlElement(name = "SurgeProtectionRating")
    protected EnergyRatingType surgeProtectionRating;
    @XmlElement(name = "MaximumThrowDistance")
    protected LengthDimension maximumThrowDistance;
    @XmlElement(name = "MaximumVerticalRefreshRate")
    protected FrequencyDimension maximumVerticalRefreshRate;
    @XmlElement(name = "MaxWeightRecommendation")
    protected WeightDimension maxWeightRecommendation;
    @XmlElement(name = "MediaLayers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mediaLayers;
    @XmlElement(name = "MidRangeSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String midRangeSpeakerMaterial;
    @XmlElement(name = "MidRangeSpeakerDiameter")
    protected LengthDimension midRangeSpeakerDiameter;
    @XmlElement(name = "MinFocalLength")
    protected LengthDimension minFocalLength;
    @XmlElement(name = "MinimumSupportedScreenSize")
    protected LengthDimension minimumSupportedScreenSize;
    @XmlElement(name = "MinimumHorizontalRefreshRate")
    protected FrequencyDimension minimumHorizontalRefreshRate;
    @XmlElement(name = "MinimumThrowDistance")
    protected LengthDimension minimumThrowDistance;
    @XmlElement(name = "MinimumVerticalRefreshRate")
    protected FrequencyDimension minimumVerticalRefreshRate;
    @XmlElement(name = "MountingPattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountingPattern;
    @XmlElement(name = "MountingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountingType;
    @XmlElement(name = "HeadphoneEarcupMotion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String headphoneEarcupMotion;
    @XmlElement(name = "MountMotion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountMotion;
    @XmlElement(name = "NoiseReductionLevel")
    protected BigDecimal noiseReductionLevel;
    @XmlElement(name = "NumberOfDrivers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfDrivers;
    @XmlElement(name = "SignalPassthroughTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String signalPassthroughTechnology;
    @XmlElement(name = "LampLife")
    protected TimeIntegerDimension lampLife;
    @XmlElement(name = "ImageDiagonalSize")
    protected LengthDimension imageDiagonalSize;
    @XmlElement(name = "ParentalControlTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String parentalControlTechnology;
    @XmlElement(name = "MountBoltPattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mountBoltPattern;
    @XmlElement(name = "ProjectionMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String projectionMethod;
    @XmlElement(name = "PhotoSensorSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoSensorSize;
    @XmlElement(name = "PhotoSensorTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoSensorTechnology;
    @XmlElement(name = "AntennaLocation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String antennaLocation;
    @XmlElement(name = "Resolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String resolution;
    @XmlElement(name = "SVideoInputType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sVideoInputType;
    @XmlElement(name = "ScreenFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String screenFinish;
    @XmlElement(name = "VideoShielded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoShielded;
    @XmlElement(name = "VideoUpconversionTechnologies")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoUpconversionTechnologies;
    @XmlElement(name = "NumberOfSpeakers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSpeakers;
    @XmlElement(name = "GrilleRemoveability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String grilleRemoveability;
    @XmlElement(name = "SpeakerGrilleMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerGrilleMaterial;
    @XmlElement(name = "MaximumWattage")
    protected WattageDimension maximumWattage;
    @XmlElement(name = "SubscriptionTermName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subscriptionTermName;
    @XmlElement(name = "SubwooferWattage")
    protected WattageDimension subwooferWattage;
    @XmlElement(name = "SubwooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subwooferSpeakerMaterial;
    @XmlElement(name = "SubwooferSpeakerDiameter")
    protected LengthDimension subwooferSpeakerDiameter;
    @XmlElement(name = "SubwooferPowerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subwooferPowerTechnology;
    @XmlElement(name = "InternetApplications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> internetApplications;
    @XmlElement(name = "TotalCoaxialInputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCoaxialInputs;
    @XmlElement(name = "TotalComponentInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalComponentInPorts;
    @XmlElement(name = "TotalCompositePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalCompositePorts;
    @XmlElement(name = "TotalEthernetPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalEthernetPorts;
    @XmlElement(name = "TotalHdmiPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalHdmiPorts;
    @XmlElement(name = "TotalPowerOutlets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalPowerOutlets;
    @XmlElement(name = "TotalPreampOutputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalPreampOutputs;
    @XmlElement(name = "TotalSVideoInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoInPorts;
    @XmlElement(name = "TotalSubwooferOutputs")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSubwooferOutputs;
    @XmlElement(name = "TotalVgaInPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVgaInPorts;
    @XmlElement(name = "TotalVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalVideoOutPorts;
    @XmlElement(name = "TrafficFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> trafficFeatures;
    @XmlElement(name = "ScreenTrigger")
    protected VoltageDecimalDimension screenTrigger;
    @XmlElement(name = "TweeterSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tweeterSpeakerMaterial;
    @XmlElement(name = "TweeterSpeakerDiameter")
    protected LengthDimension tweeterSpeakerDiameter;
    @XmlElement(name = "TweeterSpeakerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tweeterSpeakerTechnology;
    @XmlElement(name = "UniversalRemoteCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger universalRemoteCode;
    @XmlElement(name = "VerticalKeystoneCorrection")
    protected LengthDimension verticalKeystoneCorrection;
    @XmlElement(name = "VideoEncoding")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoEncoding;
    @XmlElement(name = "VideoResolution")
    protected PixelDimension videoResolution;
    @XmlElement(name = "WaterResistantDepth")
    protected LengthDimension waterResistantDepth;
    @XmlElement(name = "WaterResistantLevel")
    @XmlSchemaType(name = "string")
    protected WaterResistantType waterResistantLevel;
    @XmlElement(name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> wirelessTechnology;
    @XmlElement(name = "WooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String wooferSpeakerMaterial;
    @XmlElement(name = "WooferSpeakerDiameter")
    protected LengthDimension wooferSpeakerDiameter;
    @XmlElement(name = "ZoomRatio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String zoomRatio;
    @XmlElement(name = "ZoomType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String zoomType;
    @XmlElement(name = "AmplifierType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String amplifierType;
    @XmlElement(name = "AnalogRGBInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> analogRGBInput;
    @XmlElement(name = "BatteryPower")
    protected BatteryPowerIntegerDimension batteryPower;
    @XmlElement(name = "BluRayRegion")
    @XmlSchemaType(name = "string")
    protected BluRayRegionType bluRayRegion;
    @XmlElement(name = "BoxContents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String boxContents;
    @XmlElement(name = "CameraFilmSpeed")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cameraFilmSpeed;
    @XmlElement(name = "CameraFlash")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cameraFlash;
    @XmlElement(name = "CoatingDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coatingDescription;
    @XmlElement(name = "CompatibleMountings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String compatibleMountings;
    @XmlElement(name = "Conductor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String conductor;
    @XmlElement(name = "ContinuousShootingSpeed")
    protected ContinuousShootingDimension continuousShootingSpeed;
    @XmlElement(name = "DigitalZoom")
    protected ZoomDimension digitalZoom;
    @XmlElement(name = "DVDRegion")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dvdRegion;
    @XmlElement(name = "EffectiveStillResolution")
    protected ResolutionDimension effectiveStillResolution;
    @XmlElement(name = "FixedFocalLength")
    protected LengthDimension fixedFocalLength;
    @XmlElement(name = "FlashDedication")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String flashDedication;
    @XmlElement(name = "FlashModesDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String flashModesDescription;
    @XmlElement(name = "FocusType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String focusType;
    @XmlElement(name = "GuideNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String guideNumber;
    @XmlElement(name = "ImageStabilization")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String imageStabilization;
    @XmlElement(name = "IsHotShoeIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String isHotShoeIncluded;
    @XmlElement(name = "MaxAperture")
    protected ApertureDimension maxAperture;
    @XmlElement(name = "MaxFocalLength")
    protected LengthDimension maxFocalLength;
    @XmlElement(name = "MaxShutterSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxShutterSpeed;
    @XmlElement(name = "MaxWeightCapacity")
    protected WeightDimension maxWeightCapacity;
    @XmlElement(name = "MinAperture")
    protected ApertureDimension minAperture;
    @XmlElement(name = "MinShutterSpeed")
    protected BigDecimal minShutterSpeed;
    @XmlElement(name = "NumberOfHandsets")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfHandsets;
    @XmlElement(name = "NumberOfRadioBandsSupported")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfRadioBandsSupported;
    @XmlElement(name = "NumberOfRecordingLoops")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfRecordingLoops;
    @XmlElement(name = "OpticalZoom")
    protected ZoomDimension opticalZoom;
    @XmlElement(name = "PhotoFilterBayonetSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoFilterBayonetSize;
    @XmlElement(name = "PhotoFilterDropInSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoFilterDropInSize;
    @XmlElement(name = "PhotoFilterEffectSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoFilterEffectSize;
    @XmlElement(name = "PhotoFilterLensSize")
    protected LengthDimension photoFilterLensSize;
    @XmlElement(name = "PhotoFilterMountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String photoFilterMountType;
    @XmlElement(name = "PhotoFilterThreadSize")
    protected LengthDimension photoFilterThreadSize;
    @XmlElement(name = "PowerConsumption")
    protected PowerDimension powerConsumption;
    @XmlElement(name = "PowerPlugType")
    @XmlSchemaType(name = "normalizedString")
    protected PowerPlugType powerPlugType;
    @XmlElement(name = "RefreshRate")
    protected FrequencyDimension refreshRate;
    @XmlElement(name = "RemoteControlDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteControlDescription;
    @XmlElement(name = "RemovableMemory")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String removableMemory;
    @XmlElement(name = "SpeakerMaximumInputPower")
    protected PowerDimension speakerMaximumInputPower;
    @XmlElement(name = "TotalDVIPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalDVIPorts;
    @XmlElement(name = "TotalFirewirePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalFirewirePorts;
    @XmlElement(name = "TotalMicrophonePorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalMicrophonePorts;
    @XmlElement(name = "TotalSVideoOutPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalSVideoOutPorts;
    @XmlElement(name = "TotalUSBPorts")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalUSBPorts;
    @XmlElement(name = "TweeterConeMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tweeterConeMaterialType;
    @XmlElement(name = "TweeterDriverDiameter")
    protected LengthDimension tweeterDriverDiameter;
    @XmlElement(name = "ViewFinderType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String viewFinderType;
    @XmlElement(name = "WaypointsType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String waypointsType;

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConsumerElectronics.VariationData }
     *     
     */
    public ConsumerElectronics.VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerElectronics.VariationData }
     *     
     */
    public void setVariationData(ConsumerElectronics.VariationData value) {
        this.variationData = value;
    }

    /**
     * 获取audibleNoise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAudibleNoise() {
        return audibleNoise;
    }

    /**
     * 设置audibleNoise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAudibleNoise(BigInteger value) {
        this.audibleNoise = value;
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
     * 获取enclosureFinish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosureFinish() {
        return enclosureFinish;
    }

    /**
     * 设置enclosureFinish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosureFinish(String value) {
        this.enclosureFinish = value;
    }

    /**
     * 获取euEnergyLabelEfficiencyClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuEnergyLabelEfficiencyClass() {
        return euEnergyLabelEfficiencyClass;
    }

    /**
     * 设置euEnergyLabelEfficiencyClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuEnergyLabelEfficiencyClass(String value) {
        this.euEnergyLabelEfficiencyClass = value;
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
     * 获取voltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VoltageDecimalDimension }
     *     
     */
    public VoltageDecimalDimension getVoltage() {
        return voltage;
    }

    /**
     * 设置voltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageDecimalDimension }
     *     
     */
    public void setVoltage(VoltageDecimalDimension value) {
        this.voltage = value;
    }

    /**
     * 获取wattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageIntegerDimension }
     *     
     */
    public WattageIntegerDimension getWattage() {
        return wattage;
    }

    /**
     * 设置wattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageIntegerDimension }
     *     
     */
    public void setWattage(WattageIntegerDimension value) {
        this.wattage = value;
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
     * 获取additionalFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalFeatures() {
        return additionalFeatures;
    }

    /**
     * 设置additionalFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalFeatures(String value) {
        this.additionalFeatures = value;
    }

    /**
     * 获取vehicleSpeakerSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleSpeakerSize() {
        return vehicleSpeakerSize;
    }

    /**
     * 设置vehicleSpeakerSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleSpeakerSize(String value) {
        this.vehicleSpeakerSize = value;
    }

    /**
     * 获取speakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSpeakerDiameter() {
        return speakerDiameter;
    }

    /**
     * 设置speakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSpeakerDiameter(LengthDimension value) {
        this.speakerDiameter = value;
    }

    /**
     * Gets the value of the telephoneType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelephoneType() {
        if (telephoneType == null) {
            telephoneType = new ArrayList<String>();
        }
        return this.telephoneType;
    }

    /**
     * Gets the value of the pdaBaseModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdaBaseModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDABaseModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPDABaseModel() {
        if (pdaBaseModel == null) {
            pdaBaseModel = new ArrayList<String>();
        }
        return this.pdaBaseModel;
    }

    /**
     * 获取digitalMediaFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalMediaFormat() {
        return digitalMediaFormat;
    }

    /**
     * 设置digitalMediaFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalMediaFormat(String value) {
        this.digitalMediaFormat = value;
    }

    /**
     * 获取homeAutomationCommunicationDevice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAutomationCommunicationDevice() {
        return homeAutomationCommunicationDevice;
    }

    /**
     * 设置homeAutomationCommunicationDevice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAutomationCommunicationDevice(String value) {
        this.homeAutomationCommunicationDevice = value;
    }

    /**
     * 获取digitalAudioCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalAudioCapacity() {
        return digitalAudioCapacity;
    }

    /**
     * 设置digitalAudioCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalAudioCapacity(String value) {
        this.digitalAudioCapacity = value;
    }

    /**
     * 获取videoProcessor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoProcessor() {
        return videoProcessor;
    }

    /**
     * 设置videoProcessor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoProcessor(String value) {
        this.videoProcessor = value;
    }

    /**
     * 获取holderCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderCapacity() {
        return holderCapacity;
    }

    /**
     * 设置holderCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderCapacity(String value) {
        this.holderCapacity = value;
    }

    /**
     * 获取memorySlotsAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemorySlotsAvailable() {
        return memorySlotsAvailable;
    }

    /**
     * 设置memorySlotsAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemorySlotsAvailable(String value) {
        this.memorySlotsAvailable = value;
    }

    /**
     * 获取processorBrand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorBrand() {
        return processorBrand;
    }

    /**
     * 设置processorBrand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorBrand(String value) {
        this.processorBrand = value;
    }

    /**
     * 获取processorCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProcessorCount() {
        return processorCount;
    }

    /**
     * 设置processorCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProcessorCount(BigInteger value) {
        this.processorCount = value;
    }

    /**
     * 获取processorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorType() {
        return processorType;
    }

    /**
     * 设置processorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorType(String value) {
        this.processorType = value;
    }

    /**
     * 获取processorSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getProcessorSpeed() {
        return processorSpeed;
    }

    /**
     * 设置processorSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setProcessorSpeed(FrequencyDimension value) {
        this.processorSpeed = value;
    }

    /**
     * 获取ramSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getRAMSize() {
        return ramSize;
    }

    /**
     * 设置ramSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setRAMSize(MemorySizeDimension value) {
        this.ramSize = value;
    }

    /**
     * 获取screenResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenResolution() {
        return screenResolution;
    }

    /**
     * 设置screenResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenResolution(String value) {
        this.screenResolution = value;
    }

    /**
     * 获取softwareIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareIncluded() {
        return softwareIncluded;
    }

    /**
     * 设置softwareIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareIncluded(String value) {
        this.softwareIncluded = value;
    }

    /**
     * 获取colorScreen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isColorScreen() {
        return colorScreen;
    }

    /**
     * 设置colorScreen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColorScreen(Boolean value) {
        this.colorScreen = value;
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
     * Gets the value of the wirelessType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWirelessType() {
        if (wirelessType == null) {
            wirelessType = new ArrayList<String>();
        }
        return this.wirelessType;
    }

    /**
     * Gets the value of the hardDriveSize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardDriveSize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardDriveSize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemorySizeDimension }
     * 
     * 
     */
    public List<MemorySizeDimension> getHardDriveSize() {
        if (hardDriveSize == null) {
            hardDriveSize = new ArrayList<MemorySizeDimension>();
        }
        return this.hardDriveSize;
    }

    /**
     * Gets the value of the hardDriveInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardDriveInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardDriveInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardDriveInterfaceTypeValues }
     * 
     * 
     */
    public List<HardDriveInterfaceTypeValues> getHardDriveInterface() {
        if (hardDriveInterface == null) {
            hardDriveInterface = new ArrayList<HardDriveInterfaceTypeValues>();
        }
        return this.hardDriveInterface;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperatingSystem() {
        if (operatingSystem == null) {
            operatingSystem = new ArrayList<String>();
        }
        return this.operatingSystem;
    }

    /**
     * 获取hardwarePlatform属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwarePlatform() {
        return hardwarePlatform;
    }

    /**
     * 设置hardwarePlatform属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwarePlatform(String value) {
        this.hardwarePlatform = value;
    }

    /**
     * Gets the value of the computerMemoryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerMemoryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerMemoryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComputerMemoryType() {
        if (computerMemoryType == null) {
            computerMemoryType = new ArrayList<String>();
        }
        return this.computerMemoryType;
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
     * 获取purchasingFeeRefSKU属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingFeeRefSKU() {
        return purchasingFeeRefSKU;
    }

    /**
     * 设置purchasingFeeRefSKU属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingFeeRefSKU(String value) {
        this.purchasingFeeRefSKU = value;
    }

    /**
     * 获取threeDTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ThreeDTechnologyValues }
     *     
     */
    public ThreeDTechnologyValues getThreeDTechnology() {
        return threeDTechnology;
    }

    /**
     * 设置threeDTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDTechnologyValues }
     *     
     */
    public void setThreeDTechnology(ThreeDTechnologyValues value) {
        this.threeDTechnology = value;
    }

    /**
     * 获取biAmpable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiAmpable() {
        return biAmpable;
    }

    /**
     * 设置biAmpable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiAmpable(String value) {
        this.biAmpable = value;
    }

    /**
     * 获取antennaDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaDescription() {
        return antennaDescription;
    }

    /**
     * 设置antennaDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaDescription(String value) {
        this.antennaDescription = value;
    }

    /**
     * Gets the value of the audioEncoding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioEncoding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioEncoding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudioEncoding() {
        if (audioEncoding == null) {
            audioEncoding = new ArrayList<String>();
        }
        return this.audioEncoding;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageStringType }
     * 
     * 
     */
    public List<LanguageStringType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageStringType>();
        }
        return this.language;
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
     * 获取baseWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getBaseWidth() {
        return baseWidth;
    }

    /**
     * 设置baseWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setBaseWidth(LengthDimension value) {
        this.baseWidth = value;
    }

    /**
     * 获取batteryChargeCycles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatteryChargeCycles() {
        return batteryChargeCycles;
    }

    /**
     * 设置batteryChargeCycles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatteryChargeCycles(BigInteger value) {
        this.batteryChargeCycles = value;
    }

    /**
     * 获取batteryCellType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public BatteryCellTypeValues getBatteryCellType() {
        return batteryCellType;
    }

    /**
     * 设置batteryCellType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public void setBatteryCellType(BatteryCellTypeValues value) {
        this.batteryCellType = value;
    }

    /**
     * 获取cableLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getCableLength() {
        return cableLength;
    }

    /**
     * 设置cableLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setCableLength(LengthDimension value) {
        this.cableLength = value;
    }

    /**
     * 获取calibrationTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibrationTechnology() {
        return calibrationTechnology;
    }

    /**
     * 设置calibrationTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibrationTechnology(String value) {
        this.calibrationTechnology = value;
    }

    /**
     * Gets the value of the cameraDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cameraDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCameraDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCameraDescription() {
        if (cameraDescription == null) {
            cameraDescription = new ArrayList<String>();
        }
        return this.cameraDescription;
    }

    /**
     * 获取cameraLens属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraLens() {
        return cameraLens;
    }

    /**
     * 设置cameraLens属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraLens(String value) {
        this.cameraLens = value;
    }

    /**
     * Gets the value of the connectorGender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectorGender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectorGender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConnectorGender() {
        if (connectorGender == null) {
            connectorGender = new ArrayList<String>();
        }
        return this.connectorGender;
    }

    /**
     * 获取connectorTypeUsedOnCable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorTypeUsedOnCable() {
        return connectorTypeUsedOnCable;
    }

    /**
     * 设置connectorTypeUsedOnCable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorTypeUsedOnCable(String value) {
        this.connectorTypeUsedOnCable = value;
    }

    /**
     * 获取controlType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * 设置controlType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlType(String value) {
        this.controlType = value;
    }

    /**
     * 获取controllerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerType() {
        return controllerType;
    }

    /**
     * 设置controllerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerType(String value) {
        this.controllerType = value;
    }

    /**
     * 获取coolingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoolingType() {
        return coolingType;
    }

    /**
     * 设置coolingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoolingType(String value) {
        this.coolingType = value;
    }

    /**
     * 获取screenDimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenDimensions() {
        return screenDimensions;
    }

    /**
     * 设置screenDimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenDimensions(String value) {
        this.screenDimensions = value;
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
     * 获取numberOfFans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfFans() {
        return numberOfFans;
    }

    /**
     * 设置numberOfFans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfFans(BigInteger value) {
        this.numberOfFans = value;
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
     * Gets the value of the frontPanelInputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frontPanelInputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrontPanelInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFrontPanelInputs() {
        if (frontPanelInputs == null) {
            frontPanelInputs = new ArrayList<String>();
        }
        return this.frontPanelInputs;
    }

    /**
     * 获取horizontalKeystoneCorrection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHorizontalKeystoneCorrection() {
        return horizontalKeystoneCorrection;
    }

    /**
     * 设置horizontalKeystoneCorrection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHorizontalKeystoneCorrection(LengthDimension value) {
        this.horizontalKeystoneCorrection = value;
    }

    /**
     * Gets the value of the builtInMedia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the builtInMedia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuiltInMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBuiltInMedia() {
        if (builtInMedia == null) {
            builtInMedia = new ArrayList<String>();
        }
        return this.builtInMedia;
    }

    /**
     * 获取imageSensor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageSensor() {
        return imageSensor;
    }

    /**
     * 设置imageSensor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageSensor(String value) {
        this.imageSensor = value;
    }

    /**
     * 获取includedFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedFeatures() {
        return includedFeatures;
    }

    /**
     * 设置includedFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedFeatures(String value) {
        this.includedFeatures = value;
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
     * 获取lens属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLens() {
        return lens;
    }

    /**
     * 设置lens属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLens(String value) {
        this.lens = value;
    }

    /**
     * 获取lampWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLampWattage() {
        return lampWattage;
    }

    /**
     * 设置lampWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLampWattage(BigInteger value) {
        this.lampWattage = value;
    }

    /**
     * 获取maximumSupportedScreenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumSupportedScreenSize() {
        return maximumSupportedScreenSize;
    }

    /**
     * 设置maximumSupportedScreenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumSupportedScreenSize(LengthDimension value) {
        this.maximumSupportedScreenSize = value;
    }

    /**
     * 获取throwRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThrowRatio() {
        return throwRatio;
    }

    /**
     * 设置throwRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThrowRatio(String value) {
        this.throwRatio = value;
    }

    /**
     * 获取maximumHorizontalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMaximumHorizontalRefreshRate() {
        return maximumHorizontalRefreshRate;
    }

    /**
     * 设置maximumHorizontalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMaximumHorizontalRefreshRate(FrequencyDimension value) {
        this.maximumHorizontalRefreshRate = value;
    }

    /**
     * 获取surgeProtectionRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnergyRatingType }
     *     
     */
    public EnergyRatingType getSurgeProtectionRating() {
        return surgeProtectionRating;
    }

    /**
     * 设置surgeProtectionRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyRatingType }
     *     
     */
    public void setSurgeProtectionRating(EnergyRatingType value) {
        this.surgeProtectionRating = value;
    }

    /**
     * 获取maximumThrowDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumThrowDistance() {
        return maximumThrowDistance;
    }

    /**
     * 设置maximumThrowDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumThrowDistance(LengthDimension value) {
        this.maximumThrowDistance = value;
    }

    /**
     * 获取maximumVerticalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMaximumVerticalRefreshRate() {
        return maximumVerticalRefreshRate;
    }

    /**
     * 设置maximumVerticalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMaximumVerticalRefreshRate(FrequencyDimension value) {
        this.maximumVerticalRefreshRate = value;
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
     * 获取mediaLayers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMediaLayers() {
        return mediaLayers;
    }

    /**
     * 设置mediaLayers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMediaLayers(BigInteger value) {
        this.mediaLayers = value;
    }

    /**
     * 获取midRangeSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidRangeSpeakerMaterial() {
        return midRangeSpeakerMaterial;
    }

    /**
     * 设置midRangeSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidRangeSpeakerMaterial(String value) {
        this.midRangeSpeakerMaterial = value;
    }

    /**
     * 获取midRangeSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMidRangeSpeakerDiameter() {
        return midRangeSpeakerDiameter;
    }

    /**
     * 设置midRangeSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMidRangeSpeakerDiameter(LengthDimension value) {
        this.midRangeSpeakerDiameter = value;
    }

    /**
     * 获取minFocalLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinFocalLength() {
        return minFocalLength;
    }

    /**
     * 设置minFocalLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinFocalLength(LengthDimension value) {
        this.minFocalLength = value;
    }

    /**
     * 获取minimumSupportedScreenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumSupportedScreenSize() {
        return minimumSupportedScreenSize;
    }

    /**
     * 设置minimumSupportedScreenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumSupportedScreenSize(LengthDimension value) {
        this.minimumSupportedScreenSize = value;
    }

    /**
     * 获取minimumHorizontalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMinimumHorizontalRefreshRate() {
        return minimumHorizontalRefreshRate;
    }

    /**
     * 设置minimumHorizontalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMinimumHorizontalRefreshRate(FrequencyDimension value) {
        this.minimumHorizontalRefreshRate = value;
    }

    /**
     * 获取minimumThrowDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumThrowDistance() {
        return minimumThrowDistance;
    }

    /**
     * 设置minimumThrowDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumThrowDistance(LengthDimension value) {
        this.minimumThrowDistance = value;
    }

    /**
     * 获取minimumVerticalRefreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMinimumVerticalRefreshRate() {
        return minimumVerticalRefreshRate;
    }

    /**
     * 设置minimumVerticalRefreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMinimumVerticalRefreshRate(FrequencyDimension value) {
        this.minimumVerticalRefreshRate = value;
    }

    /**
     * 获取mountingPattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountingPattern() {
        return mountingPattern;
    }

    /**
     * 设置mountingPattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountingPattern(String value) {
        this.mountingPattern = value;
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
     * 获取headphoneEarcupMotion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadphoneEarcupMotion() {
        return headphoneEarcupMotion;
    }

    /**
     * 设置headphoneEarcupMotion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadphoneEarcupMotion(String value) {
        this.headphoneEarcupMotion = value;
    }

    /**
     * 获取mountMotion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountMotion() {
        return mountMotion;
    }

    /**
     * 设置mountMotion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountMotion(String value) {
        this.mountMotion = value;
    }

    /**
     * 获取noiseReductionLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoiseReductionLevel() {
        return noiseReductionLevel;
    }

    /**
     * 设置noiseReductionLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoiseReductionLevel(BigDecimal value) {
        this.noiseReductionLevel = value;
    }

    /**
     * 获取numberOfDrivers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDrivers() {
        return numberOfDrivers;
    }

    /**
     * 设置numberOfDrivers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDrivers(BigInteger value) {
        this.numberOfDrivers = value;
    }

    /**
     * 获取signalPassthroughTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalPassthroughTechnology() {
        return signalPassthroughTechnology;
    }

    /**
     * 设置signalPassthroughTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalPassthroughTechnology(String value) {
        this.signalPassthroughTechnology = value;
    }

    /**
     * 获取lampLife属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeIntegerDimension }
     *     
     */
    public TimeIntegerDimension getLampLife() {
        return lampLife;
    }

    /**
     * 设置lampLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntegerDimension }
     *     
     */
    public void setLampLife(TimeIntegerDimension value) {
        this.lampLife = value;
    }

    /**
     * 获取imageDiagonalSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getImageDiagonalSize() {
        return imageDiagonalSize;
    }

    /**
     * 设置imageDiagonalSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setImageDiagonalSize(LengthDimension value) {
        this.imageDiagonalSize = value;
    }

    /**
     * 获取parentalControlTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentalControlTechnology() {
        return parentalControlTechnology;
    }

    /**
     * 设置parentalControlTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentalControlTechnology(String value) {
        this.parentalControlTechnology = value;
    }

    /**
     * 获取mountBoltPattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountBoltPattern() {
        return mountBoltPattern;
    }

    /**
     * 设置mountBoltPattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountBoltPattern(String value) {
        this.mountBoltPattern = value;
    }

    /**
     * 获取projectionMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectionMethod() {
        return projectionMethod;
    }

    /**
     * 设置projectionMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectionMethod(String value) {
        this.projectionMethod = value;
    }

    /**
     * 获取photoSensorSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoSensorSize() {
        return photoSensorSize;
    }

    /**
     * 设置photoSensorSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoSensorSize(String value) {
        this.photoSensorSize = value;
    }

    /**
     * 获取photoSensorTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoSensorTechnology() {
        return photoSensorTechnology;
    }

    /**
     * 设置photoSensorTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoSensorTechnology(String value) {
        this.photoSensorTechnology = value;
    }

    /**
     * 获取antennaLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaLocation() {
        return antennaLocation;
    }

    /**
     * 设置antennaLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaLocation(String value) {
        this.antennaLocation = value;
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
     * 获取sVideoInputType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVideoInputType() {
        return sVideoInputType;
    }

    /**
     * 设置sVideoInputType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVideoInputType(String value) {
        this.sVideoInputType = value;
    }

    /**
     * 获取screenFinish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenFinish() {
        return screenFinish;
    }

    /**
     * 设置screenFinish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenFinish(String value) {
        this.screenFinish = value;
    }

    /**
     * 获取videoShielded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoShielded() {
        return videoShielded;
    }

    /**
     * 设置videoShielded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoShielded(String value) {
        this.videoShielded = value;
    }

    /**
     * 获取videoUpconversionTechnologies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoUpconversionTechnologies() {
        return videoUpconversionTechnologies;
    }

    /**
     * 设置videoUpconversionTechnologies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoUpconversionTechnologies(String value) {
        this.videoUpconversionTechnologies = value;
    }

    /**
     * 获取numberOfSpeakers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * 设置numberOfSpeakers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSpeakers(BigInteger value) {
        this.numberOfSpeakers = value;
    }

    /**
     * 获取grilleRemoveability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrilleRemoveability() {
        return grilleRemoveability;
    }

    /**
     * 设置grilleRemoveability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrilleRemoveability(String value) {
        this.grilleRemoveability = value;
    }

    /**
     * 获取speakerGrilleMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerGrilleMaterial() {
        return speakerGrilleMaterial;
    }

    /**
     * 设置speakerGrilleMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerGrilleMaterial(String value) {
        this.speakerGrilleMaterial = value;
    }

    /**
     * 获取maximumWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getMaximumWattage() {
        return maximumWattage;
    }

    /**
     * 设置maximumWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setMaximumWattage(WattageDimension value) {
        this.maximumWattage = value;
    }

    /**
     * 获取subscriptionTermName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionTermName() {
        return subscriptionTermName;
    }

    /**
     * 设置subscriptionTermName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionTermName(String value) {
        this.subscriptionTermName = value;
    }

    /**
     * 获取subwooferWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WattageDimension }
     *     
     */
    public WattageDimension getSubwooferWattage() {
        return subwooferWattage;
    }

    /**
     * 设置subwooferWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WattageDimension }
     *     
     */
    public void setSubwooferWattage(WattageDimension value) {
        this.subwooferWattage = value;
    }

    /**
     * 获取subwooferSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubwooferSpeakerMaterial() {
        return subwooferSpeakerMaterial;
    }

    /**
     * 设置subwooferSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubwooferSpeakerMaterial(String value) {
        this.subwooferSpeakerMaterial = value;
    }

    /**
     * 获取subwooferSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getSubwooferSpeakerDiameter() {
        return subwooferSpeakerDiameter;
    }

    /**
     * 设置subwooferSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setSubwooferSpeakerDiameter(LengthDimension value) {
        this.subwooferSpeakerDiameter = value;
    }

    /**
     * 获取subwooferPowerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubwooferPowerTechnology() {
        return subwooferPowerTechnology;
    }

    /**
     * 设置subwooferPowerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubwooferPowerTechnology(String value) {
        this.subwooferPowerTechnology = value;
    }

    /**
     * Gets the value of the internetApplications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetApplications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetApplications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInternetApplications() {
        if (internetApplications == null) {
            internetApplications = new ArrayList<String>();
        }
        return this.internetApplications;
    }

    /**
     * 获取totalCoaxialInputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCoaxialInputs() {
        return totalCoaxialInputs;
    }

    /**
     * 设置totalCoaxialInputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCoaxialInputs(BigInteger value) {
        this.totalCoaxialInputs = value;
    }

    /**
     * 获取totalComponentInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalComponentInPorts() {
        return totalComponentInPorts;
    }

    /**
     * 设置totalComponentInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalComponentInPorts(BigInteger value) {
        this.totalComponentInPorts = value;
    }

    /**
     * 获取totalCompositePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCompositePorts() {
        return totalCompositePorts;
    }

    /**
     * 设置totalCompositePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCompositePorts(BigInteger value) {
        this.totalCompositePorts = value;
    }

    /**
     * 获取totalEthernetPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEthernetPorts() {
        return totalEthernetPorts;
    }

    /**
     * 设置totalEthernetPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEthernetPorts(BigInteger value) {
        this.totalEthernetPorts = value;
    }

    /**
     * 获取totalHdmiPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalHdmiPorts() {
        return totalHdmiPorts;
    }

    /**
     * 设置totalHdmiPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalHdmiPorts(BigInteger value) {
        this.totalHdmiPorts = value;
    }

    /**
     * 获取totalPowerOutlets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPowerOutlets() {
        return totalPowerOutlets;
    }

    /**
     * 设置totalPowerOutlets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPowerOutlets(BigInteger value) {
        this.totalPowerOutlets = value;
    }

    /**
     * 获取totalPreampOutputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPreampOutputs() {
        return totalPreampOutputs;
    }

    /**
     * 设置totalPreampOutputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPreampOutputs(BigInteger value) {
        this.totalPreampOutputs = value;
    }

    /**
     * 获取totalSVideoInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSVideoInPorts() {
        return totalSVideoInPorts;
    }

    /**
     * 设置totalSVideoInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSVideoInPorts(BigInteger value) {
        this.totalSVideoInPorts = value;
    }

    /**
     * 获取totalSubwooferOutputs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSubwooferOutputs() {
        return totalSubwooferOutputs;
    }

    /**
     * 设置totalSubwooferOutputs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSubwooferOutputs(BigInteger value) {
        this.totalSubwooferOutputs = value;
    }

    /**
     * 获取totalVgaInPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVgaInPorts() {
        return totalVgaInPorts;
    }

    /**
     * 设置totalVgaInPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVgaInPorts(BigInteger value) {
        this.totalVgaInPorts = value;
    }

    /**
     * 获取totalVideoOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalVideoOutPorts() {
        return totalVideoOutPorts;
    }

    /**
     * 设置totalVideoOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalVideoOutPorts(BigInteger value) {
        this.totalVideoOutPorts = value;
    }

    /**
     * Gets the value of the trafficFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrafficFeatures() {
        if (trafficFeatures == null) {
            trafficFeatures = new ArrayList<String>();
        }
        return this.trafficFeatures;
    }

    /**
     * 获取screenTrigger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VoltageDecimalDimension }
     *     
     */
    public VoltageDecimalDimension getScreenTrigger() {
        return screenTrigger;
    }

    /**
     * 设置screenTrigger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageDecimalDimension }
     *     
     */
    public void setScreenTrigger(VoltageDecimalDimension value) {
        this.screenTrigger = value;
    }

    /**
     * 获取tweeterSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTweeterSpeakerMaterial() {
        return tweeterSpeakerMaterial;
    }

    /**
     * 设置tweeterSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTweeterSpeakerMaterial(String value) {
        this.tweeterSpeakerMaterial = value;
    }

    /**
     * 获取tweeterSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTweeterSpeakerDiameter() {
        return tweeterSpeakerDiameter;
    }

    /**
     * 设置tweeterSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTweeterSpeakerDiameter(LengthDimension value) {
        this.tweeterSpeakerDiameter = value;
    }

    /**
     * 获取tweeterSpeakerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTweeterSpeakerTechnology() {
        return tweeterSpeakerTechnology;
    }

    /**
     * 设置tweeterSpeakerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTweeterSpeakerTechnology(String value) {
        this.tweeterSpeakerTechnology = value;
    }

    /**
     * 获取universalRemoteCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUniversalRemoteCode() {
        return universalRemoteCode;
    }

    /**
     * 设置universalRemoteCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUniversalRemoteCode(BigInteger value) {
        this.universalRemoteCode = value;
    }

    /**
     * 获取verticalKeystoneCorrection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getVerticalKeystoneCorrection() {
        return verticalKeystoneCorrection;
    }

    /**
     * 设置verticalKeystoneCorrection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setVerticalKeystoneCorrection(LengthDimension value) {
        this.verticalKeystoneCorrection = value;
    }

    /**
     * 获取videoEncoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoEncoding() {
        return videoEncoding;
    }

    /**
     * 设置videoEncoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoEncoding(String value) {
        this.videoEncoding = value;
    }

    /**
     * 获取videoResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getVideoResolution() {
        return videoResolution;
    }

    /**
     * 设置videoResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setVideoResolution(PixelDimension value) {
        this.videoResolution = value;
    }

    /**
     * 获取waterResistantDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWaterResistantDepth() {
        return waterResistantDepth;
    }

    /**
     * 设置waterResistantDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWaterResistantDepth(LengthDimension value) {
        this.waterResistantDepth = value;
    }

    /**
     * 获取waterResistantLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WaterResistantType }
     *     
     */
    public WaterResistantType getWaterResistantLevel() {
        return waterResistantLevel;
    }

    /**
     * 设置waterResistantLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WaterResistantType }
     *     
     */
    public void setWaterResistantLevel(WaterResistantType value) {
        this.waterResistantLevel = value;
    }

    /**
     * Gets the value of the wirelessTechnology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wirelessTechnology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirelessTechnology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWirelessTechnology() {
        if (wirelessTechnology == null) {
            wirelessTechnology = new ArrayList<String>();
        }
        return this.wirelessTechnology;
    }

    /**
     * 获取wooferSpeakerMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWooferSpeakerMaterial() {
        return wooferSpeakerMaterial;
    }

    /**
     * 设置wooferSpeakerMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWooferSpeakerMaterial(String value) {
        this.wooferSpeakerMaterial = value;
    }

    /**
     * 获取wooferSpeakerDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getWooferSpeakerDiameter() {
        return wooferSpeakerDiameter;
    }

    /**
     * 设置wooferSpeakerDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setWooferSpeakerDiameter(LengthDimension value) {
        this.wooferSpeakerDiameter = value;
    }

    /**
     * 获取zoomRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoomRatio() {
        return zoomRatio;
    }

    /**
     * 设置zoomRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoomRatio(String value) {
        this.zoomRatio = value;
    }

    /**
     * 获取zoomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoomType() {
        return zoomType;
    }

    /**
     * 设置zoomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoomType(String value) {
        this.zoomType = value;
    }

    /**
     * 获取amplifierType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmplifierType() {
        return amplifierType;
    }

    /**
     * 设置amplifierType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmplifierType(String value) {
        this.amplifierType = value;
    }

    /**
     * Gets the value of the analogRGBInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analogRGBInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalogRGBInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnalogRGBInput() {
        if (analogRGBInput == null) {
            analogRGBInput = new ArrayList<String>();
        }
        return this.analogRGBInput;
    }

    /**
     * 获取batteryPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public BatteryPowerIntegerDimension getBatteryPower() {
        return batteryPower;
    }

    /**
     * 设置batteryPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryPowerIntegerDimension }
     *     
     */
    public void setBatteryPower(BatteryPowerIntegerDimension value) {
        this.batteryPower = value;
    }

    /**
     * 获取bluRayRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BluRayRegionType }
     *     
     */
    public BluRayRegionType getBluRayRegion() {
        return bluRayRegion;
    }

    /**
     * 设置bluRayRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BluRayRegionType }
     *     
     */
    public void setBluRayRegion(BluRayRegionType value) {
        this.bluRayRegion = value;
    }

    /**
     * 获取boxContents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxContents() {
        return boxContents;
    }

    /**
     * 设置boxContents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxContents(String value) {
        this.boxContents = value;
    }

    /**
     * 获取cameraFilmSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCameraFilmSpeed() {
        return cameraFilmSpeed;
    }

    /**
     * 设置cameraFilmSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCameraFilmSpeed(BigInteger value) {
        this.cameraFilmSpeed = value;
    }

    /**
     * 获取cameraFlash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraFlash() {
        return cameraFlash;
    }

    /**
     * 设置cameraFlash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraFlash(String value) {
        this.cameraFlash = value;
    }

    /**
     * 获取coatingDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoatingDescription() {
        return coatingDescription;
    }

    /**
     * 设置coatingDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoatingDescription(String value) {
        this.coatingDescription = value;
    }

    /**
     * 获取compatibleMountings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleMountings() {
        return compatibleMountings;
    }

    /**
     * 设置compatibleMountings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleMountings(String value) {
        this.compatibleMountings = value;
    }

    /**
     * 获取conductor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * 设置conductor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConductor(String value) {
        this.conductor = value;
    }

    /**
     * 获取continuousShootingSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContinuousShootingDimension }
     *     
     */
    public ContinuousShootingDimension getContinuousShootingSpeed() {
        return continuousShootingSpeed;
    }

    /**
     * 设置continuousShootingSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousShootingDimension }
     *     
     */
    public void setContinuousShootingSpeed(ContinuousShootingDimension value) {
        this.continuousShootingSpeed = value;
    }

    /**
     * 获取digitalZoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ZoomDimension }
     *     
     */
    public ZoomDimension getDigitalZoom() {
        return digitalZoom;
    }

    /**
     * 设置digitalZoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ZoomDimension }
     *     
     */
    public void setDigitalZoom(ZoomDimension value) {
        this.digitalZoom = value;
    }

    /**
     * 获取dvdRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDVDRegion() {
        return dvdRegion;
    }

    /**
     * 设置dvdRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDVDRegion(BigInteger value) {
        this.dvdRegion = value;
    }

    /**
     * 获取effectiveStillResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionDimension }
     *     
     */
    public ResolutionDimension getEffectiveStillResolution() {
        return effectiveStillResolution;
    }

    /**
     * 设置effectiveStillResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionDimension }
     *     
     */
    public void setEffectiveStillResolution(ResolutionDimension value) {
        this.effectiveStillResolution = value;
    }

    /**
     * 获取fixedFocalLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getFixedFocalLength() {
        return fixedFocalLength;
    }

    /**
     * 设置fixedFocalLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setFixedFocalLength(LengthDimension value) {
        this.fixedFocalLength = value;
    }

    /**
     * 获取flashDedication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashDedication() {
        return flashDedication;
    }

    /**
     * 设置flashDedication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashDedication(String value) {
        this.flashDedication = value;
    }

    /**
     * 获取flashModesDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashModesDescription() {
        return flashModesDescription;
    }

    /**
     * 设置flashModesDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashModesDescription(String value) {
        this.flashModesDescription = value;
    }

    /**
     * 获取focusType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocusType() {
        return focusType;
    }

    /**
     * 设置focusType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocusType(String value) {
        this.focusType = value;
    }

    /**
     * 获取guideNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuideNumber() {
        return guideNumber;
    }

    /**
     * 设置guideNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuideNumber(String value) {
        this.guideNumber = value;
    }

    /**
     * 获取imageStabilization属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageStabilization() {
        return imageStabilization;
    }

    /**
     * 设置imageStabilization属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageStabilization(String value) {
        this.imageStabilization = value;
    }

    /**
     * 获取isHotShoeIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHotShoeIncluded() {
        return isHotShoeIncluded;
    }

    /**
     * 设置isHotShoeIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHotShoeIncluded(String value) {
        this.isHotShoeIncluded = value;
    }

    /**
     * 获取maxAperture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApertureDimension }
     *     
     */
    public ApertureDimension getMaxAperture() {
        return maxAperture;
    }

    /**
     * 设置maxAperture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApertureDimension }
     *     
     */
    public void setMaxAperture(ApertureDimension value) {
        this.maxAperture = value;
    }

    /**
     * 获取maxFocalLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaxFocalLength() {
        return maxFocalLength;
    }

    /**
     * 设置maxFocalLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaxFocalLength(LengthDimension value) {
        this.maxFocalLength = value;
    }

    /**
     * 获取maxShutterSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxShutterSpeed() {
        return maxShutterSpeed;
    }

    /**
     * 设置maxShutterSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxShutterSpeed(String value) {
        this.maxShutterSpeed = value;
    }

    /**
     * 获取maxWeightCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    /**
     * 设置maxWeightCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setMaxWeightCapacity(WeightDimension value) {
        this.maxWeightCapacity = value;
    }

    /**
     * 获取minAperture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ApertureDimension }
     *     
     */
    public ApertureDimension getMinAperture() {
        return minAperture;
    }

    /**
     * 设置minAperture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ApertureDimension }
     *     
     */
    public void setMinAperture(ApertureDimension value) {
        this.minAperture = value;
    }

    /**
     * 获取minShutterSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinShutterSpeed() {
        return minShutterSpeed;
    }

    /**
     * 设置minShutterSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinShutterSpeed(BigDecimal value) {
        this.minShutterSpeed = value;
    }

    /**
     * 获取numberOfHandsets属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfHandsets() {
        return numberOfHandsets;
    }

    /**
     * 设置numberOfHandsets属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfHandsets(BigInteger value) {
        this.numberOfHandsets = value;
    }

    /**
     * 获取numberOfRadioBandsSupported属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRadioBandsSupported() {
        return numberOfRadioBandsSupported;
    }

    /**
     * 设置numberOfRadioBandsSupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRadioBandsSupported(BigInteger value) {
        this.numberOfRadioBandsSupported = value;
    }

    /**
     * 获取numberOfRecordingLoops属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRecordingLoops() {
        return numberOfRecordingLoops;
    }

    /**
     * 设置numberOfRecordingLoops属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRecordingLoops(BigInteger value) {
        this.numberOfRecordingLoops = value;
    }

    /**
     * 获取opticalZoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ZoomDimension }
     *     
     */
    public ZoomDimension getOpticalZoom() {
        return opticalZoom;
    }

    /**
     * 设置opticalZoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ZoomDimension }
     *     
     */
    public void setOpticalZoom(ZoomDimension value) {
        this.opticalZoom = value;
    }

    /**
     * 获取photoFilterBayonetSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoFilterBayonetSize() {
        return photoFilterBayonetSize;
    }

    /**
     * 设置photoFilterBayonetSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoFilterBayonetSize(String value) {
        this.photoFilterBayonetSize = value;
    }

    /**
     * 获取photoFilterDropInSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoFilterDropInSize() {
        return photoFilterDropInSize;
    }

    /**
     * 设置photoFilterDropInSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoFilterDropInSize(String value) {
        this.photoFilterDropInSize = value;
    }

    /**
     * 获取photoFilterEffectSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoFilterEffectSize() {
        return photoFilterEffectSize;
    }

    /**
     * 设置photoFilterEffectSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoFilterEffectSize(String value) {
        this.photoFilterEffectSize = value;
    }

    /**
     * 获取photoFilterLensSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getPhotoFilterLensSize() {
        return photoFilterLensSize;
    }

    /**
     * 设置photoFilterLensSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setPhotoFilterLensSize(LengthDimension value) {
        this.photoFilterLensSize = value;
    }

    /**
     * 获取photoFilterMountType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotoFilterMountType() {
        return photoFilterMountType;
    }

    /**
     * 设置photoFilterMountType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotoFilterMountType(String value) {
        this.photoFilterMountType = value;
    }

    /**
     * 获取photoFilterThreadSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getPhotoFilterThreadSize() {
        return photoFilterThreadSize;
    }

    /**
     * 设置photoFilterThreadSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setPhotoFilterThreadSize(LengthDimension value) {
        this.photoFilterThreadSize = value;
    }

    /**
     * 获取powerConsumption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerDimension }
     *     
     */
    public PowerDimension getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * 设置powerConsumption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerDimension }
     *     
     */
    public void setPowerConsumption(PowerDimension value) {
        this.powerConsumption = value;
    }

    /**
     * 获取powerPlugType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerPlugType }
     *     
     */
    public PowerPlugType getPowerPlugType() {
        return powerPlugType;
    }

    /**
     * 设置powerPlugType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerPlugType }
     *     
     */
    public void setPowerPlugType(PowerPlugType value) {
        this.powerPlugType = value;
    }

    /**
     * 获取refreshRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getRefreshRate() {
        return refreshRate;
    }

    /**
     * 设置refreshRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setRefreshRate(FrequencyDimension value) {
        this.refreshRate = value;
    }

    /**
     * 获取remoteControlDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteControlDescription() {
        return remoteControlDescription;
    }

    /**
     * 设置remoteControlDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteControlDescription(String value) {
        this.remoteControlDescription = value;
    }

    /**
     * 获取removableMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovableMemory() {
        return removableMemory;
    }

    /**
     * 设置removableMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovableMemory(String value) {
        this.removableMemory = value;
    }

    /**
     * 获取speakerMaximumInputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PowerDimension }
     *     
     */
    public PowerDimension getSpeakerMaximumInputPower() {
        return speakerMaximumInputPower;
    }

    /**
     * 设置speakerMaximumInputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PowerDimension }
     *     
     */
    public void setSpeakerMaximumInputPower(PowerDimension value) {
        this.speakerMaximumInputPower = value;
    }

    /**
     * 获取totalDVIPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDVIPorts() {
        return totalDVIPorts;
    }

    /**
     * 设置totalDVIPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDVIPorts(BigInteger value) {
        this.totalDVIPorts = value;
    }

    /**
     * 获取totalFirewirePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFirewirePorts() {
        return totalFirewirePorts;
    }

    /**
     * 设置totalFirewirePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFirewirePorts(BigInteger value) {
        this.totalFirewirePorts = value;
    }

    /**
     * 获取totalMicrophonePorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMicrophonePorts() {
        return totalMicrophonePorts;
    }

    /**
     * 设置totalMicrophonePorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMicrophonePorts(BigInteger value) {
        this.totalMicrophonePorts = value;
    }

    /**
     * 获取totalSVideoOutPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSVideoOutPorts() {
        return totalSVideoOutPorts;
    }

    /**
     * 设置totalSVideoOutPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSVideoOutPorts(BigInteger value) {
        this.totalSVideoOutPorts = value;
    }

    /**
     * 获取totalUSBPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUSBPorts() {
        return totalUSBPorts;
    }

    /**
     * 设置totalUSBPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUSBPorts(BigInteger value) {
        this.totalUSBPorts = value;
    }

    /**
     * 获取tweeterConeMaterialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTweeterConeMaterialType() {
        return tweeterConeMaterialType;
    }

    /**
     * 设置tweeterConeMaterialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTweeterConeMaterialType(String value) {
        this.tweeterConeMaterialType = value;
    }

    /**
     * 获取tweeterDriverDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTweeterDriverDiameter() {
        return tweeterDriverDiameter;
    }

    /**
     * 设置tweeterDriverDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTweeterDriverDiameter(LengthDimension value) {
        this.tweeterDriverDiameter = value;
    }

    /**
     * 获取viewFinderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewFinderType() {
        return viewFinderType;
    }

    /**
     * 设置viewFinderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewFinderType(String value) {
        this.viewFinderType = value;
    }

    /**
     * 获取waypointsType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaypointsType() {
        return waypointsType;
    }

    /**
     * 设置waypointsType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaypointsType(String value) {
        this.waypointsType = value;
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
