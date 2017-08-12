/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigDecimal;
/*      */ import java.math.BigInteger;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import javax.xml.bind.annotation.XmlAccessType;
/*      */ import javax.xml.bind.annotation.XmlAccessorType;
/*      */ import javax.xml.bind.annotation.XmlElement;
/*      */ import javax.xml.bind.annotation.XmlRootElement;
/*      */ import javax.xml.bind.annotation.XmlSchemaType;
/*      */ import javax.xml.bind.annotation.XmlType;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ 
/*      */ @XmlAccessorType(XmlAccessType.FIELD)
/*      */ @XmlType(name="", propOrder={"variationData", "audibleNoise", "color", "colorMap", "customerPackageType", "canShipInOriginalContainer", "enclosureFinish", "euEnergyLabelEfficiencyClass", "identityPackageType", "voltage", "wattage", "powerSource", "additionalFeatures", "vehicleSpeakerSize", "speakerDiameter", "telephoneType", "pdaBaseModel", "digitalMediaFormat", "homeAutomationCommunicationDevice", "digitalAudioCapacity", "videoProcessor", "holderCapacity", "memorySlotsAvailable", "processorBrand", "processorCount", "processorType", "processorSpeed", "ramSize", "screenResolution", "softwareIncluded", "colorScreen", "screenSize", "wirelessType", "hardDriveSize", "hardDriveInterface", "operatingSystem", "hardwarePlatform", "computerMemoryType", "itemPackageQuantity", "purchasingFeeRefSKU", "threeDTechnology", "biAmpable", "antennaDescription", "audioEncoding", "language", "loadCapacity", "baseLength", "baseWidth", "batteryChargeCycles", "batteryCellType", "cableLength", "calibrationTechnology", "cameraDescription", "cameraLens", "connectorGender", "connectorTypeUsedOnCable", "controlType", "controllerType", "coolingType", "screenDimensions", "efficiency", "numberOfFans", "finishType", "fitType", "frontPanelInputs", "horizontalKeystoneCorrection", "builtInMedia", "imageSensor", "includedFeatures", "shape", "lens", "lampWattage", "maximumSupportedScreenSize", "throwRatio", "maximumHorizontalRefreshRate", "surgeProtectionRating", "maximumThrowDistance", "maximumVerticalRefreshRate", "maxWeightRecommendation", "mediaLayers", "midRangeSpeakerMaterial", "midRangeSpeakerDiameter", "minFocalLength", "minimumSupportedScreenSize", "minimumHorizontalRefreshRate", "minimumThrowDistance", "minimumVerticalRefreshRate", "mountingPattern", "mountingType", "headphoneEarcupMotion", "mountMotion", "noiseReductionLevel", "numberOfDrivers", "signalPassthroughTechnology", "lampLife", "imageDiagonalSize", "parentalControlTechnology", "mountBoltPattern", "projectionMethod", "photoSensorSize", "photoSensorTechnology", "antennaLocation", "resolution", "sVideoInputType", "screenFinish", "videoShielded", "videoUpconversionTechnologies", "numberOfSpeakers", "grilleRemoveability", "speakerGrilleMaterial", "maximumWattage", "subscriptionTermName", "subwooferWattage", "subwooferSpeakerMaterial", "subwooferSpeakerDiameter", "subwooferPowerTechnology", "internetApplications", "totalCoaxialInputs", "totalComponentInPorts", "totalCompositePorts", "totalEthernetPorts", "totalHdmiPorts", "totalPowerOutlets", "totalPreampOutputs", "totalSVideoInPorts", "totalSubwooferOutputs", "totalVgaInPorts", "totalVideoOutPorts", "trafficFeatures", "screenTrigger", "tweeterSpeakerMaterial", "tweeterSpeakerDiameter", "tweeterSpeakerTechnology", "universalRemoteCode", "verticalKeystoneCorrection", "videoEncoding", "videoResolution", "waterResistantDepth", "waterResistantLevel", "wirelessTechnology", "wooferSpeakerMaterial", "wooferSpeakerDiameter", "zoomRatio", "zoomType", "amplifierType", "analogRGBInput", "batteryPower", "bluRayRegion", "boxContents", "cameraFilmSpeed", "cameraFlash", "coatingDescription", "compatibleMountings", "conductor", "continuousShootingSpeed", "digitalZoom", "dvdRegion", "effectiveStillResolution", "fixedFocalLength", "flashDedication", "flashModesDescription", "focusType", "guideNumber", "imageStabilization", "isHotShoeIncluded", "maxAperture", "maxFocalLength", "maxShutterSpeed", "maxWeightCapacity", "minAperture", "minShutterSpeed", "numberOfHandsets", "numberOfRadioBandsSupported", "numberOfRecordingLoops", "opticalZoom", "photoFilterBayonetSize", "photoFilterDropInSize", "photoFilterEffectSize", "photoFilterLensSize", "photoFilterMountType", "photoFilterThreadSize", "powerConsumption", "powerPlugType", "refreshRate", "remoteControlDescription", "removableMemory", "speakerMaximumInputPower", "totalDVIPorts", "totalFirewirePorts", "totalMicrophonePorts", "totalSVideoOutPorts", "totalUSBPorts", "tweeterConeMaterialType", "tweeterDriverDiameter", "viewFinderType", "waypointsType"})
/*      */ @XmlRootElement(name="ConsumerElectronics")
/*      */ public class ConsumerElectronics
/*      */ {
/*      */ 
/*      */   @XmlElement(name="VariationData")
/*      */   protected VariationData variationData;
/*      */ 
/*      */   @XmlElement(name="AudibleNoise")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger audibleNoise;
/*      */ 
/*      */   @XmlElement(name="Color")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String color;
/*      */ 
/*      */   @XmlElement(name="ColorMap")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String colorMap;
/*      */ 
/*      */   @XmlElement(name="CustomerPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String customerPackageType;
/*      */ 
/*      */   @XmlElement(name="CanShipInOriginalContainer")
/*      */   protected Boolean canShipInOriginalContainer;
/*      */ 
/*      */   @XmlElement(name="EnclosureFinish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String enclosureFinish;
/*      */ 
/*      */   @XmlElement(name="EuEnergyLabelEfficiencyClass")
/*      */   protected String euEnergyLabelEfficiencyClass;
/*      */ 
/*      */   @XmlElement(name="IdentityPackageType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String identityPackageType;
/*      */ 
/*      */   @XmlElement(name="Voltage")
/*      */   protected VoltageDecimalDimension voltage;
/*      */ 
/*      */   @XmlElement(name="Wattage")
/*      */   protected WattageIntegerDimension wattage;
/*      */ 
/*      */   @XmlElement(name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String powerSource;
/*      */ 
/*      */   @XmlElement(name="AdditionalFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String additionalFeatures;
/*      */ 
/*      */   @XmlElement(name="VehicleSpeakerSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String vehicleSpeakerSize;
/*      */ 
/*      */   @XmlElement(name="SpeakerDiameter")
/*      */   protected LengthDimension speakerDiameter;
/*      */ 
/*      */   @XmlElement(name="TelephoneType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> telephoneType;
/*      */ 
/*      */   @XmlElement(name="PDABaseModel")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> pdaBaseModel;
/*      */ 
/*      */   @XmlElement(name="DigitalMediaFormat")
/*      */   protected String digitalMediaFormat;
/*      */ 
/*      */   @XmlElement(name="HomeAutomationCommunicationDevice")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String homeAutomationCommunicationDevice;
/*      */ 
/*      */   @XmlElement(name="DigitalAudioCapacity")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String digitalAudioCapacity;
/*      */ 
/*      */   @XmlElement(name="VideoProcessor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String videoProcessor;
/*      */ 
/*      */   @XmlElement(name="HolderCapacity")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String holderCapacity;
/*      */ 
/*      */   @XmlElement(name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String memorySlotsAvailable;
/*      */ 
/*      */   @XmlElement(name="ProcessorBrand")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String processorBrand;
/*      */ 
/*      */   @XmlElement(name="ProcessorCount")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger processorCount;
/*      */ 
/*      */   @XmlElement(name="ProcessorType")
/*      */   protected String processorType;
/*      */ 
/*      */   @XmlElement(name="ProcessorSpeed")
/*      */   protected FrequencyDimension processorSpeed;
/*      */ 
/*      */   @XmlElement(name="RAMSize")
/*      */   protected MemorySizeDimension ramSize;
/*      */ 
/*      */   @XmlElement(name="ScreenResolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenResolution;
/*      */ 
/*      */   @XmlElement(name="SoftwareIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String softwareIncluded;
/*      */ 
/*      */   @XmlElement(name="ColorScreen")
/*      */   protected Boolean colorScreen;
/*      */ 
/*      */   @XmlElement(name="ScreenSize")
/*      */   protected LengthDimension screenSize;
/*      */ 
/*      */   @XmlElement(name="WirelessType")
/*      */   protected List<String> wirelessType;
/*      */ 
/*      */   @XmlElement(name="HardDriveSize")
/*      */   protected List<MemorySizeDimension> hardDriveSize;
/*      */ 
/*      */   @XmlElement(name="HardDriveInterface")
/*      */   protected List<HardDriveInterfaceTypeValues> hardDriveInterface;
/*      */ 
/*      */   @XmlElement(name="OperatingSystem")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> operatingSystem;
/*      */ 
/*      */   @XmlElement(name="HardwarePlatform")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String hardwarePlatform;
/*      */ 
/*      */   @XmlElement(name="ComputerMemoryType")
/*      */   protected List<String> computerMemoryType;
/*      */ 
/*      */   @XmlElement(name="ItemPackageQuantity")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger itemPackageQuantity;
/*      */ 
/*      */   @XmlElement(name="PurchasingFeeRefSKU")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String purchasingFeeRefSKU;
/*      */ 
/*      */   @XmlElement(name="ThreeDTechnology")
/*      */   protected ThreeDTechnologyValues threeDTechnology;
/*      */ 
/*      */   @XmlElement(name="BiAmpable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String biAmpable;
/*      */ 
/*      */   @XmlElement(name="AntennaDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String antennaDescription;
/*      */ 
/*      */   @XmlElement(name="AudioEncoding")
/*      */   protected List<String> audioEncoding;
/*      */ 
/*      */   @XmlElement(name="Language")
/*      */   protected List<LanguageStringType> language;
/*      */ 
/*      */   @XmlElement(name="LoadCapacity")
/*      */   protected WeightDimension loadCapacity;
/*      */ 
/*      */   @XmlElement(name="BaseLength")
/*      */   protected LengthDimension baseLength;
/*      */ 
/*      */   @XmlElement(name="BaseWidth")
/*      */   protected LengthDimension baseWidth;
/*      */ 
/*      */   @XmlElement(name="BatteryChargeCycles")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger batteryChargeCycles;
/*      */ 
/*      */   @XmlElement(name="BatteryCellType")
/*      */   protected BatteryCellTypeValues batteryCellType;
/*      */ 
/*      */   @XmlElement(name="CableLength")
/*      */   protected LengthDimension cableLength;
/*      */ 
/*      */   @XmlElement(name="CalibrationTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String calibrationTechnology;
/*      */ 
/*      */   @XmlElement(name="CameraDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> cameraDescription;
/*      */ 
/*      */   @XmlElement(name="CameraLens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cameraLens;
/*      */ 
/*      */   @XmlElement(name="ConnectorGender")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> connectorGender;
/*      */ 
/*      */   @XmlElement(name="ConnectorTypeUsedOnCable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String connectorTypeUsedOnCable;
/*      */ 
/*      */   @XmlElement(name="ControlType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String controlType;
/*      */ 
/*      */   @XmlElement(name="ControllerType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String controllerType;
/*      */ 
/*      */   @XmlElement(name="CoolingType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String coolingType;
/*      */ 
/*      */   @XmlElement(name="ScreenDimensions")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenDimensions;
/*      */ 
/*      */   @XmlElement(name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String efficiency;
/*      */ 
/*      */   @XmlElement(name="NumberOfFans")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfFans;
/*      */ 
/*      */   @XmlElement(name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String finishType;
/*      */ 
/*      */   @XmlElement(name="FitType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String fitType;
/*      */ 
/*      */   @XmlElement(name="FrontPanelInputs")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> frontPanelInputs;
/*      */ 
/*      */   @XmlElement(name="HorizontalKeystoneCorrection")
/*      */   protected LengthDimension horizontalKeystoneCorrection;
/*      */ 
/*      */   @XmlElement(name="BuiltInMedia")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> builtInMedia;
/*      */ 
/*      */   @XmlElement(name="ImageSensor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String imageSensor;
/*      */ 
/*      */   @XmlElement(name="IncludedFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String includedFeatures;
/*      */ 
/*      */   @XmlElement(name="Shape")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String shape;
/*      */ 
/*      */   @XmlElement(name="Lens")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String lens;
/*      */ 
/*      */   @XmlElement(name="LampWattage")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger lampWattage;
/*      */ 
/*      */   @XmlElement(name="MaximumSupportedScreenSize")
/*      */   protected LengthDimension maximumSupportedScreenSize;
/*      */ 
/*      */   @XmlElement(name="ThrowRatio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String throwRatio;
/*      */ 
/*      */   @XmlElement(name="MaximumHorizontalRefreshRate")
/*      */   protected FrequencyDimension maximumHorizontalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="SurgeProtectionRating")
/*      */   protected EnergyRatingType surgeProtectionRating;
/*      */ 
/*      */   @XmlElement(name="MaximumThrowDistance")
/*      */   protected LengthDimension maximumThrowDistance;
/*      */ 
/*      */   @XmlElement(name="MaximumVerticalRefreshRate")
/*      */   protected FrequencyDimension maximumVerticalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MaxWeightRecommendation")
/*      */   protected WeightDimension maxWeightRecommendation;
/*      */ 
/*      */   @XmlElement(name="MediaLayers")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger mediaLayers;
/*      */ 
/*      */   @XmlElement(name="MidRangeSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String midRangeSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="MidRangeSpeakerDiameter")
/*      */   protected LengthDimension midRangeSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="MinFocalLength")
/*      */   protected LengthDimension minFocalLength;
/*      */ 
/*      */   @XmlElement(name="MinimumSupportedScreenSize")
/*      */   protected LengthDimension minimumSupportedScreenSize;
/*      */ 
/*      */   @XmlElement(name="MinimumHorizontalRefreshRate")
/*      */   protected FrequencyDimension minimumHorizontalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MinimumThrowDistance")
/*      */   protected LengthDimension minimumThrowDistance;
/*      */ 
/*      */   @XmlElement(name="MinimumVerticalRefreshRate")
/*      */   protected FrequencyDimension minimumVerticalRefreshRate;
/*      */ 
/*      */   @XmlElement(name="MountingPattern")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountingPattern;
/*      */ 
/*      */   @XmlElement(name="MountingType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountingType;
/*      */ 
/*      */   @XmlElement(name="HeadphoneEarcupMotion")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String headphoneEarcupMotion;
/*      */ 
/*      */   @XmlElement(name="MountMotion")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountMotion;
/*      */ 
/*      */   @XmlElement(name="NoiseReductionLevel")
/*      */   protected BigDecimal noiseReductionLevel;
/*      */ 
/*      */   @XmlElement(name="NumberOfDrivers")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfDrivers;
/*      */ 
/*      */   @XmlElement(name="SignalPassthroughTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String signalPassthroughTechnology;
/*      */ 
/*      */   @XmlElement(name="LampLife")
/*      */   protected TimeIntegerDimension lampLife;
/*      */ 
/*      */   @XmlElement(name="ImageDiagonalSize")
/*      */   protected LengthDimension imageDiagonalSize;
/*      */ 
/*      */   @XmlElement(name="ParentalControlTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String parentalControlTechnology;
/*      */ 
/*      */   @XmlElement(name="MountBoltPattern")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String mountBoltPattern;
/*      */ 
/*      */   @XmlElement(name="ProjectionMethod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String projectionMethod;
/*      */ 
/*      */   @XmlElement(name="PhotoSensorSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoSensorSize;
/*      */ 
/*      */   @XmlElement(name="PhotoSensorTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoSensorTechnology;
/*      */ 
/*      */   @XmlElement(name="AntennaLocation")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String antennaLocation;
/*      */ 
/*      */   @XmlElement(name="Resolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String resolution;
/*      */ 
/*      */   @XmlElement(name="SVideoInputType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String sVideoInputType;
/*      */ 
/*      */   @XmlElement(name="ScreenFinish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String screenFinish;
/*      */ 
/*      */   @XmlElement(name="VideoShielded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String videoShielded;
/*      */ 
/*      */   @XmlElement(name="VideoUpconversionTechnologies")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String videoUpconversionTechnologies;
/*      */ 
/*      */   @XmlElement(name="NumberOfSpeakers")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfSpeakers;
/*      */ 
/*      */   @XmlElement(name="GrilleRemoveability")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String grilleRemoveability;
/*      */ 
/*      */   @XmlElement(name="SpeakerGrilleMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String speakerGrilleMaterial;
/*      */ 
/*      */   @XmlElement(name="MaximumWattage")
/*      */   protected WattageDimension maximumWattage;
/*      */ 
/*      */   @XmlElement(name="SubscriptionTermName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String subscriptionTermName;
/*      */ 
/*      */   @XmlElement(name="SubwooferWattage")
/*      */   protected WattageDimension subwooferWattage;
/*      */ 
/*      */   @XmlElement(name="SubwooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String subwooferSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="SubwooferSpeakerDiameter")
/*      */   protected LengthDimension subwooferSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="SubwooferPowerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String subwooferPowerTechnology;
/*      */ 
/*      */   @XmlElement(name="InternetApplications")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> internetApplications;
/*      */ 
/*      */   @XmlElement(name="TotalCoaxialInputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalCoaxialInputs;
/*      */ 
/*      */   @XmlElement(name="TotalComponentInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalComponentInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalCompositePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalCompositePorts;
/*      */ 
/*      */   @XmlElement(name="TotalEthernetPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalEthernetPorts;
/*      */ 
/*      */   @XmlElement(name="TotalHdmiPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalHdmiPorts;
/*      */ 
/*      */   @XmlElement(name="TotalPowerOutlets")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalPowerOutlets;
/*      */ 
/*      */   @XmlElement(name="TotalPreampOutputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalPreampOutputs;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalSubwooferOutputs")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSubwooferOutputs;
/*      */ 
/*      */   @XmlElement(name="TotalVgaInPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVgaInPorts;
/*      */ 
/*      */   @XmlElement(name="TotalVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="TrafficFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> trafficFeatures;
/*      */ 
/*      */   @XmlElement(name="ScreenTrigger")
/*      */   protected VoltageDecimalDimension screenTrigger;
/*      */ 
/*      */   @XmlElement(name="TweeterSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String tweeterSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="TweeterSpeakerDiameter")
/*      */   protected LengthDimension tweeterSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="TweeterSpeakerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String tweeterSpeakerTechnology;
/*      */ 
/*      */   @XmlElement(name="UniversalRemoteCode")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger universalRemoteCode;
/*      */ 
/*      */   @XmlElement(name="VerticalKeystoneCorrection")
/*      */   protected LengthDimension verticalKeystoneCorrection;
/*      */ 
/*      */   @XmlElement(name="VideoEncoding")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String videoEncoding;
/*      */ 
/*      */   @XmlElement(name="VideoResolution")
/*      */   protected PixelDimension videoResolution;
/*      */ 
/*      */   @XmlElement(name="WaterResistantDepth")
/*      */   protected LengthDimension waterResistantDepth;
/*      */ 
/*      */   @XmlElement(name="WaterResistantLevel")
/*      */   protected WaterResistantType waterResistantLevel;
/*      */ 
/*      */   @XmlElement(name="WirelessTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> wirelessTechnology;
/*      */ 
/*      */   @XmlElement(name="WooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String wooferSpeakerMaterial;
/*      */ 
/*      */   @XmlElement(name="WooferSpeakerDiameter")
/*      */   protected LengthDimension wooferSpeakerDiameter;
/*      */ 
/*      */   @XmlElement(name="ZoomRatio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String zoomRatio;
/*      */ 
/*      */   @XmlElement(name="ZoomType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String zoomType;
/*      */ 
/*      */   @XmlElement(name="AmplifierType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String amplifierType;
/*      */ 
/*      */   @XmlElement(name="AnalogRGBInput")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected List<String> analogRGBInput;
/*      */ 
/*      */   @XmlElement(name="BatteryPower")
/*      */   protected BatteryPowerIntegerDimension batteryPower;
/*      */ 
/*      */   @XmlElement(name="BluRayRegion")
/*      */   protected BluRayRegionType bluRayRegion;
/*      */ 
/*      */   @XmlElement(name="BoxContents")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String boxContents;
/*      */ 
/*      */   @XmlElement(name="CameraFilmSpeed")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger cameraFilmSpeed;
/*      */ 
/*      */   @XmlElement(name="CameraFlash")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String cameraFlash;
/*      */ 
/*      */   @XmlElement(name="CoatingDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String coatingDescription;
/*      */ 
/*      */   @XmlElement(name="CompatibleMountings")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String compatibleMountings;
/*      */ 
/*      */   @XmlElement(name="Conductor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String conductor;
/*      */ 
/*      */   @XmlElement(name="ContinuousShootingSpeed")
/*      */   protected ContinuousShootingDimension continuousShootingSpeed;
/*      */ 
/*      */   @XmlElement(name="DigitalZoom")
/*      */   protected ZoomDimension digitalZoom;
/*      */ 
/*      */   @XmlElement(name="DVDRegion")
/*      */   @XmlSchemaType(name="nonNegativeInteger")
/*      */   protected BigInteger dvdRegion;
/*      */ 
/*      */   @XmlElement(name="EffectiveStillResolution")
/*      */   protected ResolutionDimension effectiveStillResolution;
/*      */ 
/*      */   @XmlElement(name="FixedFocalLength")
/*      */   protected LengthDimension fixedFocalLength;
/*      */ 
/*      */   @XmlElement(name="FlashDedication")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String flashDedication;
/*      */ 
/*      */   @XmlElement(name="FlashModesDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String flashModesDescription;
/*      */ 
/*      */   @XmlElement(name="FocusType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String focusType;
/*      */ 
/*      */   @XmlElement(name="GuideNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String guideNumber;
/*      */ 
/*      */   @XmlElement(name="ImageStabilization")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String imageStabilization;
/*      */ 
/*      */   @XmlElement(name="IsHotShoeIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String isHotShoeIncluded;
/*      */ 
/*      */   @XmlElement(name="MaxAperture")
/*      */   protected ApertureDimension maxAperture;
/*      */ 
/*      */   @XmlElement(name="MaxFocalLength")
/*      */   protected LengthDimension maxFocalLength;
/*      */ 
/*      */   @XmlElement(name="MaxShutterSpeed")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String maxShutterSpeed;
/*      */ 
/*      */   @XmlElement(name="MaxWeightCapacity")
/*      */   protected WeightDimension maxWeightCapacity;
/*      */ 
/*      */   @XmlElement(name="MinAperture")
/*      */   protected ApertureDimension minAperture;
/*      */ 
/*      */   @XmlElement(name="MinShutterSpeed")
/*      */   protected BigDecimal minShutterSpeed;
/*      */ 
/*      */   @XmlElement(name="NumberOfHandsets")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfHandsets;
/*      */ 
/*      */   @XmlElement(name="NumberOfRadioBandsSupported")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfRadioBandsSupported;
/*      */ 
/*      */   @XmlElement(name="NumberOfRecordingLoops")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger numberOfRecordingLoops;
/*      */ 
/*      */   @XmlElement(name="OpticalZoom")
/*      */   protected ZoomDimension opticalZoom;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterBayonetSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoFilterBayonetSize;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterDropInSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoFilterDropInSize;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterEffectSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoFilterEffectSize;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterLensSize")
/*      */   protected LengthDimension photoFilterLensSize;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterMountType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String photoFilterMountType;
/*      */ 
/*      */   @XmlElement(name="PhotoFilterThreadSize")
/*      */   protected LengthDimension photoFilterThreadSize;
/*      */ 
/*      */   @XmlElement(name="PowerConsumption")
/*      */   protected PowerDimension powerConsumption;
/*      */ 
/*      */   @XmlElement(name="PowerPlugType")
/*      */   protected PowerPlugType powerPlugType;
/*      */ 
/*      */   @XmlElement(name="RefreshRate")
/*      */   protected FrequencyDimension refreshRate;
/*      */ 
/*      */   @XmlElement(name="RemoteControlDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String remoteControlDescription;
/*      */ 
/*      */   @XmlElement(name="RemovableMemory")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String removableMemory;
/*      */ 
/*      */   @XmlElement(name="SpeakerMaximumInputPower")
/*      */   protected PowerDimension speakerMaximumInputPower;
/*      */ 
/*      */   @XmlElement(name="TotalDVIPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalDVIPorts;
/*      */ 
/*      */   @XmlElement(name="TotalFirewirePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalFirewirePorts;
/*      */ 
/*      */   @XmlElement(name="TotalMicrophonePorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalMicrophonePorts;
/*      */ 
/*      */   @XmlElement(name="TotalSVideoOutPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalSVideoOutPorts;
/*      */ 
/*      */   @XmlElement(name="TotalUSBPorts")
/*      */   @XmlSchemaType(name="positiveInteger")
/*      */   protected BigInteger totalUSBPorts;
/*      */ 
/*      */   @XmlElement(name="TweeterConeMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String tweeterConeMaterialType;
/*      */ 
/*      */   @XmlElement(name="TweeterDriverDiameter")
/*      */   protected LengthDimension tweeterDriverDiameter;
/*      */ 
/*      */   @XmlElement(name="ViewFinderType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String viewFinderType;
/*      */ 
/*      */   @XmlElement(name="WaypointsType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   protected String waypointsType;
/*      */ 
/*      */   public VariationData getVariationData()
/*      */   {
/* 1031 */     return this.variationData;
/*      */   }
/*      */ 
/*      */   public void setVariationData(VariationData value)
/*      */   {
/* 1043 */     this.variationData = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getAudibleNoise()
/*      */   {
/* 1055 */     return this.audibleNoise;
/*      */   }
/*      */ 
/*      */   public void setAudibleNoise(BigInteger value)
/*      */   {
/* 1067 */     this.audibleNoise = value;
/*      */   }
/*      */ 
/*      */   public String getColor()
/*      */   {
/* 1079 */     return this.color;
/*      */   }
/*      */ 
/*      */   public void setColor(String value)
/*      */   {
/* 1091 */     this.color = value;
/*      */   }
/*      */ 
/*      */   public String getColorMap()
/*      */   {
/* 1103 */     return this.colorMap;
/*      */   }
/*      */ 
/*      */   public void setColorMap(String value)
/*      */   {
/* 1115 */     this.colorMap = value;
/*      */   }
/*      */ 
/*      */   public String getCustomerPackageType()
/*      */   {
/* 1127 */     return this.customerPackageType;
/*      */   }
/*      */ 
/*      */   public void setCustomerPackageType(String value)
/*      */   {
/* 1139 */     this.customerPackageType = value;
/*      */   }
/*      */ 
/*      */   public Boolean isCanShipInOriginalContainer()
/*      */   {
/* 1151 */     return this.canShipInOriginalContainer;
/*      */   }
/*      */ 
/*      */   public void setCanShipInOriginalContainer(Boolean value)
/*      */   {
/* 1163 */     this.canShipInOriginalContainer = value;
/*      */   }
/*      */ 
/*      */   public String getEnclosureFinish()
/*      */   {
/* 1175 */     return this.enclosureFinish;
/*      */   }
/*      */ 
/*      */   public void setEnclosureFinish(String value)
/*      */   {
/* 1187 */     this.enclosureFinish = value;
/*      */   }
/*      */ 
/*      */   public String getEuEnergyLabelEfficiencyClass()
/*      */   {
/* 1199 */     return this.euEnergyLabelEfficiencyClass;
/*      */   }
/*      */ 
/*      */   public void setEuEnergyLabelEfficiencyClass(String value)
/*      */   {
/* 1211 */     this.euEnergyLabelEfficiencyClass = value;
/*      */   }
/*      */ 
/*      */   public String getIdentityPackageType()
/*      */   {
/* 1223 */     return this.identityPackageType;
/*      */   }
/*      */ 
/*      */   public void setIdentityPackageType(String value)
/*      */   {
/* 1235 */     this.identityPackageType = value;
/*      */   }
/*      */ 
/*      */   public VoltageDecimalDimension getVoltage()
/*      */   {
/* 1247 */     return this.voltage;
/*      */   }
/*      */ 
/*      */   public void setVoltage(VoltageDecimalDimension value)
/*      */   {
/* 1259 */     this.voltage = value;
/*      */   }
/*      */ 
/*      */   public WattageIntegerDimension getWattage()
/*      */   {
/* 1271 */     return this.wattage;
/*      */   }
/*      */ 
/*      */   public void setWattage(WattageIntegerDimension value)
/*      */   {
/* 1283 */     this.wattage = value;
/*      */   }
/*      */ 
/*      */   public String getPowerSource()
/*      */   {
/* 1295 */     return this.powerSource;
/*      */   }
/*      */ 
/*      */   public void setPowerSource(String value)
/*      */   {
/* 1307 */     this.powerSource = value;
/*      */   }
/*      */ 
/*      */   public String getAdditionalFeatures()
/*      */   {
/* 1319 */     return this.additionalFeatures;
/*      */   }
/*      */ 
/*      */   public void setAdditionalFeatures(String value)
/*      */   {
/* 1331 */     this.additionalFeatures = value;
/*      */   }
/*      */ 
/*      */   public String getVehicleSpeakerSize()
/*      */   {
/* 1343 */     return this.vehicleSpeakerSize;
/*      */   }
/*      */ 
/*      */   public void setVehicleSpeakerSize(String value)
/*      */   {
/* 1355 */     this.vehicleSpeakerSize = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSpeakerDiameter()
/*      */   {
/* 1367 */     return this.speakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSpeakerDiameter(LengthDimension value)
/*      */   {
/* 1379 */     this.speakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public List<String> getTelephoneType()
/*      */   {
/* 1405 */     if (this.telephoneType == null) {
/* 1406 */       this.telephoneType = new ArrayList();
/*      */     }
/* 1408 */     return this.telephoneType;
/*      */   }
/*      */ 
/*      */   public List<String> getPDABaseModel()
/*      */   {
/* 1434 */     if (this.pdaBaseModel == null) {
/* 1435 */       this.pdaBaseModel = new ArrayList();
/*      */     }
/* 1437 */     return this.pdaBaseModel;
/*      */   }
/*      */ 
/*      */   public String getDigitalMediaFormat()
/*      */   {
/* 1449 */     return this.digitalMediaFormat;
/*      */   }
/*      */ 
/*      */   public void setDigitalMediaFormat(String value)
/*      */   {
/* 1461 */     this.digitalMediaFormat = value;
/*      */   }
/*      */ 
/*      */   public String getHomeAutomationCommunicationDevice()
/*      */   {
/* 1473 */     return this.homeAutomationCommunicationDevice;
/*      */   }
/*      */ 
/*      */   public void setHomeAutomationCommunicationDevice(String value)
/*      */   {
/* 1485 */     this.homeAutomationCommunicationDevice = value;
/*      */   }
/*      */ 
/*      */   public String getDigitalAudioCapacity()
/*      */   {
/* 1497 */     return this.digitalAudioCapacity;
/*      */   }
/*      */ 
/*      */   public void setDigitalAudioCapacity(String value)
/*      */   {
/* 1509 */     this.digitalAudioCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getVideoProcessor()
/*      */   {
/* 1521 */     return this.videoProcessor;
/*      */   }
/*      */ 
/*      */   public void setVideoProcessor(String value)
/*      */   {
/* 1533 */     this.videoProcessor = value;
/*      */   }
/*      */ 
/*      */   public String getHolderCapacity()
/*      */   {
/* 1545 */     return this.holderCapacity;
/*      */   }
/*      */ 
/*      */   public void setHolderCapacity(String value)
/*      */   {
/* 1557 */     this.holderCapacity = value;
/*      */   }
/*      */ 
/*      */   public String getMemorySlotsAvailable()
/*      */   {
/* 1569 */     return this.memorySlotsAvailable;
/*      */   }
/*      */ 
/*      */   public void setMemorySlotsAvailable(String value)
/*      */   {
/* 1581 */     this.memorySlotsAvailable = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorBrand()
/*      */   {
/* 1593 */     return this.processorBrand;
/*      */   }
/*      */ 
/*      */   public void setProcessorBrand(String value)
/*      */   {
/* 1605 */     this.processorBrand = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getProcessorCount()
/*      */   {
/* 1617 */     return this.processorCount;
/*      */   }
/*      */ 
/*      */   public void setProcessorCount(BigInteger value)
/*      */   {
/* 1629 */     this.processorCount = value;
/*      */   }
/*      */ 
/*      */   public String getProcessorType()
/*      */   {
/* 1641 */     return this.processorType;
/*      */   }
/*      */ 
/*      */   public void setProcessorType(String value)
/*      */   {
/* 1653 */     this.processorType = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getProcessorSpeed()
/*      */   {
/* 1665 */     return this.processorSpeed;
/*      */   }
/*      */ 
/*      */   public void setProcessorSpeed(FrequencyDimension value)
/*      */   {
/* 1677 */     this.processorSpeed = value;
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension getRAMSize()
/*      */   {
/* 1689 */     return this.ramSize;
/*      */   }
/*      */ 
/*      */   public void setRAMSize(MemorySizeDimension value)
/*      */   {
/* 1701 */     this.ramSize = value;
/*      */   }
/*      */ 
/*      */   public String getScreenResolution()
/*      */   {
/* 1713 */     return this.screenResolution;
/*      */   }
/*      */ 
/*      */   public void setScreenResolution(String value)
/*      */   {
/* 1725 */     this.screenResolution = value;
/*      */   }
/*      */ 
/*      */   public String getSoftwareIncluded()
/*      */   {
/* 1737 */     return this.softwareIncluded;
/*      */   }
/*      */ 
/*      */   public void setSoftwareIncluded(String value)
/*      */   {
/* 1749 */     this.softwareIncluded = value;
/*      */   }
/*      */ 
/*      */   public Boolean isColorScreen()
/*      */   {
/* 1761 */     return this.colorScreen;
/*      */   }
/*      */ 
/*      */   public void setColorScreen(Boolean value)
/*      */   {
/* 1773 */     this.colorScreen = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getScreenSize()
/*      */   {
/* 1785 */     return this.screenSize;
/*      */   }
/*      */ 
/*      */   public void setScreenSize(LengthDimension value)
/*      */   {
/* 1797 */     this.screenSize = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessType()
/*      */   {
/* 1823 */     if (this.wirelessType == null) {
/* 1824 */       this.wirelessType = new ArrayList();
/*      */     }
/* 1826 */     return this.wirelessType;
/*      */   }
/*      */ 
/*      */   public List<MemorySizeDimension> getHardDriveSize()
/*      */   {
/* 1852 */     if (this.hardDriveSize == null) {
/* 1853 */       this.hardDriveSize = new ArrayList();
/*      */     }
/* 1855 */     return this.hardDriveSize;
/*      */   }
/*      */ 
/*      */   public List<HardDriveInterfaceTypeValues> getHardDriveInterface()
/*      */   {
/* 1881 */     if (this.hardDriveInterface == null) {
/* 1882 */       this.hardDriveInterface = new ArrayList();
/*      */     }
/* 1884 */     return this.hardDriveInterface;
/*      */   }
/*      */ 
/*      */   public List<String> getOperatingSystem()
/*      */   {
/* 1910 */     if (this.operatingSystem == null) {
/* 1911 */       this.operatingSystem = new ArrayList();
/*      */     }
/* 1913 */     return this.operatingSystem;
/*      */   }
/*      */ 
/*      */   public String getHardwarePlatform()
/*      */   {
/* 1925 */     return this.hardwarePlatform;
/*      */   }
/*      */ 
/*      */   public void setHardwarePlatform(String value)
/*      */   {
/* 1937 */     this.hardwarePlatform = value;
/*      */   }
/*      */ 
/*      */   public List<String> getComputerMemoryType()
/*      */   {
/* 1963 */     if (this.computerMemoryType == null) {
/* 1964 */       this.computerMemoryType = new ArrayList();
/*      */     }
/* 1966 */     return this.computerMemoryType;
/*      */   }
/*      */ 
/*      */   public BigInteger getItemPackageQuantity()
/*      */   {
/* 1978 */     return this.itemPackageQuantity;
/*      */   }
/*      */ 
/*      */   public void setItemPackageQuantity(BigInteger value)
/*      */   {
/* 1990 */     this.itemPackageQuantity = value;
/*      */   }
/*      */ 
/*      */   public String getPurchasingFeeRefSKU()
/*      */   {
/* 2002 */     return this.purchasingFeeRefSKU;
/*      */   }
/*      */ 
/*      */   public void setPurchasingFeeRefSKU(String value)
/*      */   {
/* 2014 */     this.purchasingFeeRefSKU = value;
/*      */   }
/*      */ 
/*      */   public ThreeDTechnologyValues getThreeDTechnology()
/*      */   {
/* 2026 */     return this.threeDTechnology;
/*      */   }
/*      */ 
/*      */   public void setThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/* 2038 */     this.threeDTechnology = value;
/*      */   }
/*      */ 
/*      */   public String getBiAmpable()
/*      */   {
/* 2050 */     return this.biAmpable;
/*      */   }
/*      */ 
/*      */   public void setBiAmpable(String value)
/*      */   {
/* 2062 */     this.biAmpable = value;
/*      */   }
/*      */ 
/*      */   public String getAntennaDescription()
/*      */   {
/* 2074 */     return this.antennaDescription;
/*      */   }
/*      */ 
/*      */   public void setAntennaDescription(String value)
/*      */   {
/* 2086 */     this.antennaDescription = value;
/*      */   }
/*      */ 
/*      */   public List<String> getAudioEncoding()
/*      */   {
/* 2112 */     if (this.audioEncoding == null) {
/* 2113 */       this.audioEncoding = new ArrayList();
/*      */     }
/* 2115 */     return this.audioEncoding;
/*      */   }
/*      */ 
/*      */   public List<LanguageStringType> getLanguage()
/*      */   {
/* 2141 */     if (this.language == null) {
/* 2142 */       this.language = new ArrayList();
/*      */     }
/* 2144 */     return this.language;
/*      */   }
/*      */ 
/*      */   public WeightDimension getLoadCapacity()
/*      */   {
/* 2156 */     return this.loadCapacity;
/*      */   }
/*      */ 
/*      */   public void setLoadCapacity(WeightDimension value)
/*      */   {
/* 2168 */     this.loadCapacity = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseLength()
/*      */   {
/* 2180 */     return this.baseLength;
/*      */   }
/*      */ 
/*      */   public void setBaseLength(LengthDimension value)
/*      */   {
/* 2192 */     this.baseLength = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getBaseWidth()
/*      */   {
/* 2204 */     return this.baseWidth;
/*      */   }
/*      */ 
/*      */   public void setBaseWidth(LengthDimension value)
/*      */   {
/* 2216 */     this.baseWidth = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getBatteryChargeCycles()
/*      */   {
/* 2228 */     return this.batteryChargeCycles;
/*      */   }
/*      */ 
/*      */   public void setBatteryChargeCycles(BigInteger value)
/*      */   {
/* 2240 */     this.batteryChargeCycles = value;
/*      */   }
/*      */ 
/*      */   public BatteryCellTypeValues getBatteryCellType()
/*      */   {
/* 2252 */     return this.batteryCellType;
/*      */   }
/*      */ 
/*      */   public void setBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/* 2264 */     this.batteryCellType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getCableLength()
/*      */   {
/* 2276 */     return this.cableLength;
/*      */   }
/*      */ 
/*      */   public void setCableLength(LengthDimension value)
/*      */   {
/* 2288 */     this.cableLength = value;
/*      */   }
/*      */ 
/*      */   public String getCalibrationTechnology()
/*      */   {
/* 2300 */     return this.calibrationTechnology;
/*      */   }
/*      */ 
/*      */   public void setCalibrationTechnology(String value)
/*      */   {
/* 2312 */     this.calibrationTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<String> getCameraDescription()
/*      */   {
/* 2338 */     if (this.cameraDescription == null) {
/* 2339 */       this.cameraDescription = new ArrayList();
/*      */     }
/* 2341 */     return this.cameraDescription;
/*      */   }
/*      */ 
/*      */   public String getCameraLens()
/*      */   {
/* 2353 */     return this.cameraLens;
/*      */   }
/*      */ 
/*      */   public void setCameraLens(String value)
/*      */   {
/* 2365 */     this.cameraLens = value;
/*      */   }
/*      */ 
/*      */   public List<String> getConnectorGender()
/*      */   {
/* 2391 */     if (this.connectorGender == null) {
/* 2392 */       this.connectorGender = new ArrayList();
/*      */     }
/* 2394 */     return this.connectorGender;
/*      */   }
/*      */ 
/*      */   public String getConnectorTypeUsedOnCable()
/*      */   {
/* 2406 */     return this.connectorTypeUsedOnCable;
/*      */   }
/*      */ 
/*      */   public void setConnectorTypeUsedOnCable(String value)
/*      */   {
/* 2418 */     this.connectorTypeUsedOnCable = value;
/*      */   }
/*      */ 
/*      */   public String getControlType()
/*      */   {
/* 2430 */     return this.controlType;
/*      */   }
/*      */ 
/*      */   public void setControlType(String value)
/*      */   {
/* 2442 */     this.controlType = value;
/*      */   }
/*      */ 
/*      */   public String getControllerType()
/*      */   {
/* 2454 */     return this.controllerType;
/*      */   }
/*      */ 
/*      */   public void setControllerType(String value)
/*      */   {
/* 2466 */     this.controllerType = value;
/*      */   }
/*      */ 
/*      */   public String getCoolingType()
/*      */   {
/* 2478 */     return this.coolingType;
/*      */   }
/*      */ 
/*      */   public void setCoolingType(String value)
/*      */   {
/* 2490 */     this.coolingType = value;
/*      */   }
/*      */ 
/*      */   public String getScreenDimensions()
/*      */   {
/* 2502 */     return this.screenDimensions;
/*      */   }
/*      */ 
/*      */   public void setScreenDimensions(String value)
/*      */   {
/* 2514 */     this.screenDimensions = value;
/*      */   }
/*      */ 
/*      */   public String getEfficiency()
/*      */   {
/* 2526 */     return this.efficiency;
/*      */   }
/*      */ 
/*      */   public void setEfficiency(String value)
/*      */   {
/* 2538 */     this.efficiency = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfFans()
/*      */   {
/* 2550 */     return this.numberOfFans;
/*      */   }
/*      */ 
/*      */   public void setNumberOfFans(BigInteger value)
/*      */   {
/* 2562 */     this.numberOfFans = value;
/*      */   }
/*      */ 
/*      */   public String getFinishType()
/*      */   {
/* 2574 */     return this.finishType;
/*      */   }
/*      */ 
/*      */   public void setFinishType(String value)
/*      */   {
/* 2586 */     this.finishType = value;
/*      */   }
/*      */ 
/*      */   public String getFitType()
/*      */   {
/* 2598 */     return this.fitType;
/*      */   }
/*      */ 
/*      */   public void setFitType(String value)
/*      */   {
/* 2610 */     this.fitType = value;
/*      */   }
/*      */ 
/*      */   public List<String> getFrontPanelInputs()
/*      */   {
/* 2636 */     if (this.frontPanelInputs == null) {
/* 2637 */       this.frontPanelInputs = new ArrayList();
/*      */     }
/* 2639 */     return this.frontPanelInputs;
/*      */   }
/*      */ 
/*      */   public LengthDimension getHorizontalKeystoneCorrection()
/*      */   {
/* 2651 */     return this.horizontalKeystoneCorrection;
/*      */   }
/*      */ 
/*      */   public void setHorizontalKeystoneCorrection(LengthDimension value)
/*      */   {
/* 2663 */     this.horizontalKeystoneCorrection = value;
/*      */   }
/*      */ 
/*      */   public List<String> getBuiltInMedia()
/*      */   {
/* 2689 */     if (this.builtInMedia == null) {
/* 2690 */       this.builtInMedia = new ArrayList();
/*      */     }
/* 2692 */     return this.builtInMedia;
/*      */   }
/*      */ 
/*      */   public String getImageSensor()
/*      */   {
/* 2704 */     return this.imageSensor;
/*      */   }
/*      */ 
/*      */   public void setImageSensor(String value)
/*      */   {
/* 2716 */     this.imageSensor = value;
/*      */   }
/*      */ 
/*      */   public String getIncludedFeatures()
/*      */   {
/* 2728 */     return this.includedFeatures;
/*      */   }
/*      */ 
/*      */   public void setIncludedFeatures(String value)
/*      */   {
/* 2740 */     this.includedFeatures = value;
/*      */   }
/*      */ 
/*      */   public String getShape()
/*      */   {
/* 2752 */     return this.shape;
/*      */   }
/*      */ 
/*      */   public void setShape(String value)
/*      */   {
/* 2764 */     this.shape = value;
/*      */   }
/*      */ 
/*      */   public String getLens()
/*      */   {
/* 2776 */     return this.lens;
/*      */   }
/*      */ 
/*      */   public void setLens(String value)
/*      */   {
/* 2788 */     this.lens = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getLampWattage()
/*      */   {
/* 2800 */     return this.lampWattage;
/*      */   }
/*      */ 
/*      */   public void setLampWattage(BigInteger value)
/*      */   {
/* 2812 */     this.lampWattage = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMaximumSupportedScreenSize()
/*      */   {
/* 2824 */     return this.maximumSupportedScreenSize;
/*      */   }
/*      */ 
/*      */   public void setMaximumSupportedScreenSize(LengthDimension value)
/*      */   {
/* 2836 */     this.maximumSupportedScreenSize = value;
/*      */   }
/*      */ 
/*      */   public String getThrowRatio()
/*      */   {
/* 2848 */     return this.throwRatio;
/*      */   }
/*      */ 
/*      */   public void setThrowRatio(String value)
/*      */   {
/* 2860 */     this.throwRatio = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMaximumHorizontalRefreshRate()
/*      */   {
/* 2872 */     return this.maximumHorizontalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMaximumHorizontalRefreshRate(FrequencyDimension value)
/*      */   {
/* 2884 */     this.maximumHorizontalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public EnergyRatingType getSurgeProtectionRating()
/*      */   {
/* 2896 */     return this.surgeProtectionRating;
/*      */   }
/*      */ 
/*      */   public void setSurgeProtectionRating(EnergyRatingType value)
/*      */   {
/* 2908 */     this.surgeProtectionRating = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMaximumThrowDistance()
/*      */   {
/* 2920 */     return this.maximumThrowDistance;
/*      */   }
/*      */ 
/*      */   public void setMaximumThrowDistance(LengthDimension value)
/*      */   {
/* 2932 */     this.maximumThrowDistance = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMaximumVerticalRefreshRate()
/*      */   {
/* 2944 */     return this.maximumVerticalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMaximumVerticalRefreshRate(FrequencyDimension value)
/*      */   {
/* 2956 */     this.maximumVerticalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMaxWeightRecommendation()
/*      */   {
/* 2968 */     return this.maxWeightRecommendation;
/*      */   }
/*      */ 
/*      */   public void setMaxWeightRecommendation(WeightDimension value)
/*      */   {
/* 2980 */     this.maxWeightRecommendation = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getMediaLayers()
/*      */   {
/* 2992 */     return this.mediaLayers;
/*      */   }
/*      */ 
/*      */   public void setMediaLayers(BigInteger value)
/*      */   {
/* 3004 */     this.mediaLayers = value;
/*      */   }
/*      */ 
/*      */   public String getMidRangeSpeakerMaterial()
/*      */   {
/* 3016 */     return this.midRangeSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setMidRangeSpeakerMaterial(String value)
/*      */   {
/* 3028 */     this.midRangeSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMidRangeSpeakerDiameter()
/*      */   {
/* 3040 */     return this.midRangeSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setMidRangeSpeakerDiameter(LengthDimension value)
/*      */   {
/* 3052 */     this.midRangeSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMinFocalLength()
/*      */   {
/* 3064 */     return this.minFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMinFocalLength(LengthDimension value)
/*      */   {
/* 3076 */     this.minFocalLength = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMinimumSupportedScreenSize()
/*      */   {
/* 3088 */     return this.minimumSupportedScreenSize;
/*      */   }
/*      */ 
/*      */   public void setMinimumSupportedScreenSize(LengthDimension value)
/*      */   {
/* 3100 */     this.minimumSupportedScreenSize = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMinimumHorizontalRefreshRate()
/*      */   {
/* 3112 */     return this.minimumHorizontalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMinimumHorizontalRefreshRate(FrequencyDimension value)
/*      */   {
/* 3124 */     this.minimumHorizontalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMinimumThrowDistance()
/*      */   {
/* 3136 */     return this.minimumThrowDistance;
/*      */   }
/*      */ 
/*      */   public void setMinimumThrowDistance(LengthDimension value)
/*      */   {
/* 3148 */     this.minimumThrowDistance = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getMinimumVerticalRefreshRate()
/*      */   {
/* 3160 */     return this.minimumVerticalRefreshRate;
/*      */   }
/*      */ 
/*      */   public void setMinimumVerticalRefreshRate(FrequencyDimension value)
/*      */   {
/* 3172 */     this.minimumVerticalRefreshRate = value;
/*      */   }
/*      */ 
/*      */   public String getMountingPattern()
/*      */   {
/* 3184 */     return this.mountingPattern;
/*      */   }
/*      */ 
/*      */   public void setMountingPattern(String value)
/*      */   {
/* 3196 */     this.mountingPattern = value;
/*      */   }
/*      */ 
/*      */   public String getMountingType()
/*      */   {
/* 3208 */     return this.mountingType;
/*      */   }
/*      */ 
/*      */   public void setMountingType(String value)
/*      */   {
/* 3220 */     this.mountingType = value;
/*      */   }
/*      */ 
/*      */   public String getHeadphoneEarcupMotion()
/*      */   {
/* 3232 */     return this.headphoneEarcupMotion;
/*      */   }
/*      */ 
/*      */   public void setHeadphoneEarcupMotion(String value)
/*      */   {
/* 3244 */     this.headphoneEarcupMotion = value;
/*      */   }
/*      */ 
/*      */   public String getMountMotion()
/*      */   {
/* 3256 */     return this.mountMotion;
/*      */   }
/*      */ 
/*      */   public void setMountMotion(String value)
/*      */   {
/* 3268 */     this.mountMotion = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getNoiseReductionLevel()
/*      */   {
/* 3280 */     return this.noiseReductionLevel;
/*      */   }
/*      */ 
/*      */   public void setNoiseReductionLevel(BigDecimal value)
/*      */   {
/* 3292 */     this.noiseReductionLevel = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfDrivers()
/*      */   {
/* 3304 */     return this.numberOfDrivers;
/*      */   }
/*      */ 
/*      */   public void setNumberOfDrivers(BigInteger value)
/*      */   {
/* 3316 */     this.numberOfDrivers = value;
/*      */   }
/*      */ 
/*      */   public String getSignalPassthroughTechnology()
/*      */   {
/* 3328 */     return this.signalPassthroughTechnology;
/*      */   }
/*      */ 
/*      */   public void setSignalPassthroughTechnology(String value)
/*      */   {
/* 3340 */     this.signalPassthroughTechnology = value;
/*      */   }
/*      */ 
/*      */   public TimeIntegerDimension getLampLife()
/*      */   {
/* 3352 */     return this.lampLife;
/*      */   }
/*      */ 
/*      */   public void setLampLife(TimeIntegerDimension value)
/*      */   {
/* 3364 */     this.lampLife = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getImageDiagonalSize()
/*      */   {
/* 3376 */     return this.imageDiagonalSize;
/*      */   }
/*      */ 
/*      */   public void setImageDiagonalSize(LengthDimension value)
/*      */   {
/* 3388 */     this.imageDiagonalSize = value;
/*      */   }
/*      */ 
/*      */   public String getParentalControlTechnology()
/*      */   {
/* 3400 */     return this.parentalControlTechnology;
/*      */   }
/*      */ 
/*      */   public void setParentalControlTechnology(String value)
/*      */   {
/* 3412 */     this.parentalControlTechnology = value;
/*      */   }
/*      */ 
/*      */   public String getMountBoltPattern()
/*      */   {
/* 3424 */     return this.mountBoltPattern;
/*      */   }
/*      */ 
/*      */   public void setMountBoltPattern(String value)
/*      */   {
/* 3436 */     this.mountBoltPattern = value;
/*      */   }
/*      */ 
/*      */   public String getProjectionMethod()
/*      */   {
/* 3448 */     return this.projectionMethod;
/*      */   }
/*      */ 
/*      */   public void setProjectionMethod(String value)
/*      */   {
/* 3460 */     this.projectionMethod = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoSensorSize()
/*      */   {
/* 3472 */     return this.photoSensorSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoSensorSize(String value)
/*      */   {
/* 3484 */     this.photoSensorSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoSensorTechnology()
/*      */   {
/* 3496 */     return this.photoSensorTechnology;
/*      */   }
/*      */ 
/*      */   public void setPhotoSensorTechnology(String value)
/*      */   {
/* 3508 */     this.photoSensorTechnology = value;
/*      */   }
/*      */ 
/*      */   public String getAntennaLocation()
/*      */   {
/* 3520 */     return this.antennaLocation;
/*      */   }
/*      */ 
/*      */   public void setAntennaLocation(String value)
/*      */   {
/* 3532 */     this.antennaLocation = value;
/*      */   }
/*      */ 
/*      */   public String getResolution()
/*      */   {
/* 3544 */     return this.resolution;
/*      */   }
/*      */ 
/*      */   public void setResolution(String value)
/*      */   {
/* 3556 */     this.resolution = value;
/*      */   }
/*      */ 
/*      */   public String getSVideoInputType()
/*      */   {
/* 3568 */     return this.sVideoInputType;
/*      */   }
/*      */ 
/*      */   public void setSVideoInputType(String value)
/*      */   {
/* 3580 */     this.sVideoInputType = value;
/*      */   }
/*      */ 
/*      */   public String getScreenFinish()
/*      */   {
/* 3592 */     return this.screenFinish;
/*      */   }
/*      */ 
/*      */   public void setScreenFinish(String value)
/*      */   {
/* 3604 */     this.screenFinish = value;
/*      */   }
/*      */ 
/*      */   public String getVideoShielded()
/*      */   {
/* 3616 */     return this.videoShielded;
/*      */   }
/*      */ 
/*      */   public void setVideoShielded(String value)
/*      */   {
/* 3628 */     this.videoShielded = value;
/*      */   }
/*      */ 
/*      */   public String getVideoUpconversionTechnologies()
/*      */   {
/* 3640 */     return this.videoUpconversionTechnologies;
/*      */   }
/*      */ 
/*      */   public void setVideoUpconversionTechnologies(String value)
/*      */   {
/* 3652 */     this.videoUpconversionTechnologies = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfSpeakers()
/*      */   {
/* 3664 */     return this.numberOfSpeakers;
/*      */   }
/*      */ 
/*      */   public void setNumberOfSpeakers(BigInteger value)
/*      */   {
/* 3676 */     this.numberOfSpeakers = value;
/*      */   }
/*      */ 
/*      */   public String getGrilleRemoveability()
/*      */   {
/* 3688 */     return this.grilleRemoveability;
/*      */   }
/*      */ 
/*      */   public void setGrilleRemoveability(String value)
/*      */   {
/* 3700 */     this.grilleRemoveability = value;
/*      */   }
/*      */ 
/*      */   public String getSpeakerGrilleMaterial()
/*      */   {
/* 3712 */     return this.speakerGrilleMaterial;
/*      */   }
/*      */ 
/*      */   public void setSpeakerGrilleMaterial(String value)
/*      */   {
/* 3724 */     this.speakerGrilleMaterial = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getMaximumWattage()
/*      */   {
/* 3736 */     return this.maximumWattage;
/*      */   }
/*      */ 
/*      */   public void setMaximumWattage(WattageDimension value)
/*      */   {
/* 3748 */     this.maximumWattage = value;
/*      */   }
/*      */ 
/*      */   public String getSubscriptionTermName()
/*      */   {
/* 3760 */     return this.subscriptionTermName;
/*      */   }
/*      */ 
/*      */   public void setSubscriptionTermName(String value)
/*      */   {
/* 3772 */     this.subscriptionTermName = value;
/*      */   }
/*      */ 
/*      */   public WattageDimension getSubwooferWattage()
/*      */   {
/* 3784 */     return this.subwooferWattage;
/*      */   }
/*      */ 
/*      */   public void setSubwooferWattage(WattageDimension value)
/*      */   {
/* 3796 */     this.subwooferWattage = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferSpeakerMaterial()
/*      */   {
/* 3808 */     return this.subwooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerMaterial(String value)
/*      */   {
/* 3820 */     this.subwooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getSubwooferSpeakerDiameter()
/*      */   {
/* 3832 */     return this.subwooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setSubwooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 3844 */     this.subwooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getSubwooferPowerTechnology()
/*      */   {
/* 3856 */     return this.subwooferPowerTechnology;
/*      */   }
/*      */ 
/*      */   public void setSubwooferPowerTechnology(String value)
/*      */   {
/* 3868 */     this.subwooferPowerTechnology = value;
/*      */   }
/*      */ 
/*      */   public List<String> getInternetApplications()
/*      */   {
/* 3894 */     if (this.internetApplications == null) {
/* 3895 */       this.internetApplications = new ArrayList();
/*      */     }
/* 3897 */     return this.internetApplications;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCoaxialInputs()
/*      */   {
/* 3909 */     return this.totalCoaxialInputs;
/*      */   }
/*      */ 
/*      */   public void setTotalCoaxialInputs(BigInteger value)
/*      */   {
/* 3921 */     this.totalCoaxialInputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalComponentInPorts()
/*      */   {
/* 3933 */     return this.totalComponentInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalComponentInPorts(BigInteger value)
/*      */   {
/* 3945 */     this.totalComponentInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalCompositePorts()
/*      */   {
/* 3957 */     return this.totalCompositePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalCompositePorts(BigInteger value)
/*      */   {
/* 3969 */     this.totalCompositePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalEthernetPorts()
/*      */   {
/* 3981 */     return this.totalEthernetPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalEthernetPorts(BigInteger value)
/*      */   {
/* 3993 */     this.totalEthernetPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalHdmiPorts()
/*      */   {
/* 4005 */     return this.totalHdmiPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalHdmiPorts(BigInteger value)
/*      */   {
/* 4017 */     this.totalHdmiPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalPowerOutlets()
/*      */   {
/* 4029 */     return this.totalPowerOutlets;
/*      */   }
/*      */ 
/*      */   public void setTotalPowerOutlets(BigInteger value)
/*      */   {
/* 4041 */     this.totalPowerOutlets = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalPreampOutputs()
/*      */   {
/* 4053 */     return this.totalPreampOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalPreampOutputs(BigInteger value)
/*      */   {
/* 4065 */     this.totalPreampOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoInPorts()
/*      */   {
/* 4077 */     return this.totalSVideoInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoInPorts(BigInteger value)
/*      */   {
/* 4089 */     this.totalSVideoInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSubwooferOutputs()
/*      */   {
/* 4101 */     return this.totalSubwooferOutputs;
/*      */   }
/*      */ 
/*      */   public void setTotalSubwooferOutputs(BigInteger value)
/*      */   {
/* 4113 */     this.totalSubwooferOutputs = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVgaInPorts()
/*      */   {
/* 4125 */     return this.totalVgaInPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVgaInPorts(BigInteger value)
/*      */   {
/* 4137 */     this.totalVgaInPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalVideoOutPorts()
/*      */   {
/* 4149 */     return this.totalVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalVideoOutPorts(BigInteger value)
/*      */   {
/* 4161 */     this.totalVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public List<String> getTrafficFeatures()
/*      */   {
/* 4187 */     if (this.trafficFeatures == null) {
/* 4188 */       this.trafficFeatures = new ArrayList();
/*      */     }
/* 4190 */     return this.trafficFeatures;
/*      */   }
/*      */ 
/*      */   public VoltageDecimalDimension getScreenTrigger()
/*      */   {
/* 4202 */     return this.screenTrigger;
/*      */   }
/*      */ 
/*      */   public void setScreenTrigger(VoltageDecimalDimension value)
/*      */   {
/* 4214 */     this.screenTrigger = value;
/*      */   }
/*      */ 
/*      */   public String getTweeterSpeakerMaterial()
/*      */   {
/* 4226 */     return this.tweeterSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setTweeterSpeakerMaterial(String value)
/*      */   {
/* 4238 */     this.tweeterSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getTweeterSpeakerDiameter()
/*      */   {
/* 4250 */     return this.tweeterSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setTweeterSpeakerDiameter(LengthDimension value)
/*      */   {
/* 4262 */     this.tweeterSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getTweeterSpeakerTechnology()
/*      */   {
/* 4274 */     return this.tweeterSpeakerTechnology;
/*      */   }
/*      */ 
/*      */   public void setTweeterSpeakerTechnology(String value)
/*      */   {
/* 4286 */     this.tweeterSpeakerTechnology = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getUniversalRemoteCode()
/*      */   {
/* 4298 */     return this.universalRemoteCode;
/*      */   }
/*      */ 
/*      */   public void setUniversalRemoteCode(BigInteger value)
/*      */   {
/* 4310 */     this.universalRemoteCode = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getVerticalKeystoneCorrection()
/*      */   {
/* 4322 */     return this.verticalKeystoneCorrection;
/*      */   }
/*      */ 
/*      */   public void setVerticalKeystoneCorrection(LengthDimension value)
/*      */   {
/* 4334 */     this.verticalKeystoneCorrection = value;
/*      */   }
/*      */ 
/*      */   public String getVideoEncoding()
/*      */   {
/* 4346 */     return this.videoEncoding;
/*      */   }
/*      */ 
/*      */   public void setVideoEncoding(String value)
/*      */   {
/* 4358 */     this.videoEncoding = value;
/*      */   }
/*      */ 
/*      */   public PixelDimension getVideoResolution()
/*      */   {
/* 4370 */     return this.videoResolution;
/*      */   }
/*      */ 
/*      */   public void setVideoResolution(PixelDimension value)
/*      */   {
/* 4382 */     this.videoResolution = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getWaterResistantDepth()
/*      */   {
/* 4394 */     return this.waterResistantDepth;
/*      */   }
/*      */ 
/*      */   public void setWaterResistantDepth(LengthDimension value)
/*      */   {
/* 4406 */     this.waterResistantDepth = value;
/*      */   }
/*      */ 
/*      */   public WaterResistantType getWaterResistantLevel()
/*      */   {
/* 4418 */     return this.waterResistantLevel;
/*      */   }
/*      */ 
/*      */   public void setWaterResistantLevel(WaterResistantType value)
/*      */   {
/* 4430 */     this.waterResistantLevel = value;
/*      */   }
/*      */ 
/*      */   public List<String> getWirelessTechnology()
/*      */   {
/* 4456 */     if (this.wirelessTechnology == null) {
/* 4457 */       this.wirelessTechnology = new ArrayList();
/*      */     }
/* 4459 */     return this.wirelessTechnology;
/*      */   }
/*      */ 
/*      */   public String getWooferSpeakerMaterial()
/*      */   {
/* 4471 */     return this.wooferSpeakerMaterial;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerMaterial(String value)
/*      */   {
/* 4483 */     this.wooferSpeakerMaterial = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getWooferSpeakerDiameter()
/*      */   {
/* 4495 */     return this.wooferSpeakerDiameter;
/*      */   }
/*      */ 
/*      */   public void setWooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 4507 */     this.wooferSpeakerDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getZoomRatio()
/*      */   {
/* 4519 */     return this.zoomRatio;
/*      */   }
/*      */ 
/*      */   public void setZoomRatio(String value)
/*      */   {
/* 4531 */     this.zoomRatio = value;
/*      */   }
/*      */ 
/*      */   public String getZoomType()
/*      */   {
/* 4543 */     return this.zoomType;
/*      */   }
/*      */ 
/*      */   public void setZoomType(String value)
/*      */   {
/* 4555 */     this.zoomType = value;
/*      */   }
/*      */ 
/*      */   public String getAmplifierType()
/*      */   {
/* 4567 */     return this.amplifierType;
/*      */   }
/*      */ 
/*      */   public void setAmplifierType(String value)
/*      */   {
/* 4579 */     this.amplifierType = value;
/*      */   }
/*      */ 
/*      */   public List<String> getAnalogRGBInput()
/*      */   {
/* 4605 */     if (this.analogRGBInput == null) {
/* 4606 */       this.analogRGBInput = new ArrayList();
/*      */     }
/* 4608 */     return this.analogRGBInput;
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension getBatteryPower()
/*      */   {
/* 4620 */     return this.batteryPower;
/*      */   }
/*      */ 
/*      */   public void setBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/* 4632 */     this.batteryPower = value;
/*      */   }
/*      */ 
/*      */   public BluRayRegionType getBluRayRegion()
/*      */   {
/* 4644 */     return this.bluRayRegion;
/*      */   }
/*      */ 
/*      */   public void setBluRayRegion(BluRayRegionType value)
/*      */   {
/* 4656 */     this.bluRayRegion = value;
/*      */   }
/*      */ 
/*      */   public String getBoxContents()
/*      */   {
/* 4668 */     return this.boxContents;
/*      */   }
/*      */ 
/*      */   public void setBoxContents(String value)
/*      */   {
/* 4680 */     this.boxContents = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getCameraFilmSpeed()
/*      */   {
/* 4692 */     return this.cameraFilmSpeed;
/*      */   }
/*      */ 
/*      */   public void setCameraFilmSpeed(BigInteger value)
/*      */   {
/* 4704 */     this.cameraFilmSpeed = value;
/*      */   }
/*      */ 
/*      */   public String getCameraFlash()
/*      */   {
/* 4716 */     return this.cameraFlash;
/*      */   }
/*      */ 
/*      */   public void setCameraFlash(String value)
/*      */   {
/* 4728 */     this.cameraFlash = value;
/*      */   }
/*      */ 
/*      */   public String getCoatingDescription()
/*      */   {
/* 4740 */     return this.coatingDescription;
/*      */   }
/*      */ 
/*      */   public void setCoatingDescription(String value)
/*      */   {
/* 4752 */     this.coatingDescription = value;
/*      */   }
/*      */ 
/*      */   public String getCompatibleMountings()
/*      */   {
/* 4764 */     return this.compatibleMountings;
/*      */   }
/*      */ 
/*      */   public void setCompatibleMountings(String value)
/*      */   {
/* 4776 */     this.compatibleMountings = value;
/*      */   }
/*      */ 
/*      */   public String getConductor()
/*      */   {
/* 4788 */     return this.conductor;
/*      */   }
/*      */ 
/*      */   public void setConductor(String value)
/*      */   {
/* 4800 */     this.conductor = value;
/*      */   }
/*      */ 
/*      */   public ContinuousShootingDimension getContinuousShootingSpeed()
/*      */   {
/* 4812 */     return this.continuousShootingSpeed;
/*      */   }
/*      */ 
/*      */   public void setContinuousShootingSpeed(ContinuousShootingDimension value)
/*      */   {
/* 4824 */     this.continuousShootingSpeed = value;
/*      */   }
/*      */ 
/*      */   public ZoomDimension getDigitalZoom()
/*      */   {
/* 4836 */     return this.digitalZoom;
/*      */   }
/*      */ 
/*      */   public void setDigitalZoom(ZoomDimension value)
/*      */   {
/* 4848 */     this.digitalZoom = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getDVDRegion()
/*      */   {
/* 4860 */     return this.dvdRegion;
/*      */   }
/*      */ 
/*      */   public void setDVDRegion(BigInteger value)
/*      */   {
/* 4872 */     this.dvdRegion = value;
/*      */   }
/*      */ 
/*      */   public ResolutionDimension getEffectiveStillResolution()
/*      */   {
/* 4884 */     return this.effectiveStillResolution;
/*      */   }
/*      */ 
/*      */   public void setEffectiveStillResolution(ResolutionDimension value)
/*      */   {
/* 4896 */     this.effectiveStillResolution = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getFixedFocalLength()
/*      */   {
/* 4908 */     return this.fixedFocalLength;
/*      */   }
/*      */ 
/*      */   public void setFixedFocalLength(LengthDimension value)
/*      */   {
/* 4920 */     this.fixedFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getFlashDedication()
/*      */   {
/* 4932 */     return this.flashDedication;
/*      */   }
/*      */ 
/*      */   public void setFlashDedication(String value)
/*      */   {
/* 4944 */     this.flashDedication = value;
/*      */   }
/*      */ 
/*      */   public String getFlashModesDescription()
/*      */   {
/* 4956 */     return this.flashModesDescription;
/*      */   }
/*      */ 
/*      */   public void setFlashModesDescription(String value)
/*      */   {
/* 4968 */     this.flashModesDescription = value;
/*      */   }
/*      */ 
/*      */   public String getFocusType()
/*      */   {
/* 4980 */     return this.focusType;
/*      */   }
/*      */ 
/*      */   public void setFocusType(String value)
/*      */   {
/* 4992 */     this.focusType = value;
/*      */   }
/*      */ 
/*      */   public String getGuideNumber()
/*      */   {
/* 5004 */     return this.guideNumber;
/*      */   }
/*      */ 
/*      */   public void setGuideNumber(String value)
/*      */   {
/* 5016 */     this.guideNumber = value;
/*      */   }
/*      */ 
/*      */   public String getImageStabilization()
/*      */   {
/* 5028 */     return this.imageStabilization;
/*      */   }
/*      */ 
/*      */   public void setImageStabilization(String value)
/*      */   {
/* 5040 */     this.imageStabilization = value;
/*      */   }
/*      */ 
/*      */   public String getIsHotShoeIncluded()
/*      */   {
/* 5052 */     return this.isHotShoeIncluded;
/*      */   }
/*      */ 
/*      */   public void setIsHotShoeIncluded(String value)
/*      */   {
/* 5064 */     this.isHotShoeIncluded = value;
/*      */   }
/*      */ 
/*      */   public ApertureDimension getMaxAperture()
/*      */   {
/* 5076 */     return this.maxAperture;
/*      */   }
/*      */ 
/*      */   public void setMaxAperture(ApertureDimension value)
/*      */   {
/* 5088 */     this.maxAperture = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getMaxFocalLength()
/*      */   {
/* 5100 */     return this.maxFocalLength;
/*      */   }
/*      */ 
/*      */   public void setMaxFocalLength(LengthDimension value)
/*      */   {
/* 5112 */     this.maxFocalLength = value;
/*      */   }
/*      */ 
/*      */   public String getMaxShutterSpeed()
/*      */   {
/* 5124 */     return this.maxShutterSpeed;
/*      */   }
/*      */ 
/*      */   public void setMaxShutterSpeed(String value)
/*      */   {
/* 5136 */     this.maxShutterSpeed = value;
/*      */   }
/*      */ 
/*      */   public WeightDimension getMaxWeightCapacity()
/*      */   {
/* 5148 */     return this.maxWeightCapacity;
/*      */   }
/*      */ 
/*      */   public void setMaxWeightCapacity(WeightDimension value)
/*      */   {
/* 5160 */     this.maxWeightCapacity = value;
/*      */   }
/*      */ 
/*      */   public ApertureDimension getMinAperture()
/*      */   {
/* 5172 */     return this.minAperture;
/*      */   }
/*      */ 
/*      */   public void setMinAperture(ApertureDimension value)
/*      */   {
/* 5184 */     this.minAperture = value;
/*      */   }
/*      */ 
/*      */   public BigDecimal getMinShutterSpeed()
/*      */   {
/* 5196 */     return this.minShutterSpeed;
/*      */   }
/*      */ 
/*      */   public void setMinShutterSpeed(BigDecimal value)
/*      */   {
/* 5208 */     this.minShutterSpeed = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfHandsets()
/*      */   {
/* 5220 */     return this.numberOfHandsets;
/*      */   }
/*      */ 
/*      */   public void setNumberOfHandsets(BigInteger value)
/*      */   {
/* 5232 */     this.numberOfHandsets = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfRadioBandsSupported()
/*      */   {
/* 5244 */     return this.numberOfRadioBandsSupported;
/*      */   }
/*      */ 
/*      */   public void setNumberOfRadioBandsSupported(BigInteger value)
/*      */   {
/* 5256 */     this.numberOfRadioBandsSupported = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getNumberOfRecordingLoops()
/*      */   {
/* 5268 */     return this.numberOfRecordingLoops;
/*      */   }
/*      */ 
/*      */   public void setNumberOfRecordingLoops(BigInteger value)
/*      */   {
/* 5280 */     this.numberOfRecordingLoops = value;
/*      */   }
/*      */ 
/*      */   public ZoomDimension getOpticalZoom()
/*      */   {
/* 5292 */     return this.opticalZoom;
/*      */   }
/*      */ 
/*      */   public void setOpticalZoom(ZoomDimension value)
/*      */   {
/* 5304 */     this.opticalZoom = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoFilterBayonetSize()
/*      */   {
/* 5316 */     return this.photoFilterBayonetSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterBayonetSize(String value)
/*      */   {
/* 5328 */     this.photoFilterBayonetSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoFilterDropInSize()
/*      */   {
/* 5340 */     return this.photoFilterDropInSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterDropInSize(String value)
/*      */   {
/* 5352 */     this.photoFilterDropInSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoFilterEffectSize()
/*      */   {
/* 5364 */     return this.photoFilterEffectSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterEffectSize(String value)
/*      */   {
/* 5376 */     this.photoFilterEffectSize = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getPhotoFilterLensSize()
/*      */   {
/* 5388 */     return this.photoFilterLensSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterLensSize(LengthDimension value)
/*      */   {
/* 5400 */     this.photoFilterLensSize = value;
/*      */   }
/*      */ 
/*      */   public String getPhotoFilterMountType()
/*      */   {
/* 5412 */     return this.photoFilterMountType;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterMountType(String value)
/*      */   {
/* 5424 */     this.photoFilterMountType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getPhotoFilterThreadSize()
/*      */   {
/* 5436 */     return this.photoFilterThreadSize;
/*      */   }
/*      */ 
/*      */   public void setPhotoFilterThreadSize(LengthDimension value)
/*      */   {
/* 5448 */     this.photoFilterThreadSize = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getPowerConsumption()
/*      */   {
/* 5460 */     return this.powerConsumption;
/*      */   }
/*      */ 
/*      */   public void setPowerConsumption(PowerDimension value)
/*      */   {
/* 5472 */     this.powerConsumption = value;
/*      */   }
/*      */ 
/*      */   public PowerPlugType getPowerPlugType()
/*      */   {
/* 5484 */     return this.powerPlugType;
/*      */   }
/*      */ 
/*      */   public void setPowerPlugType(PowerPlugType value)
/*      */   {
/* 5496 */     this.powerPlugType = value;
/*      */   }
/*      */ 
/*      */   public FrequencyDimension getRefreshRate()
/*      */   {
/* 5508 */     return this.refreshRate;
/*      */   }
/*      */ 
/*      */   public void setRefreshRate(FrequencyDimension value)
/*      */   {
/* 5520 */     this.refreshRate = value;
/*      */   }
/*      */ 
/*      */   public String getRemoteControlDescription()
/*      */   {
/* 5532 */     return this.remoteControlDescription;
/*      */   }
/*      */ 
/*      */   public void setRemoteControlDescription(String value)
/*      */   {
/* 5544 */     this.remoteControlDescription = value;
/*      */   }
/*      */ 
/*      */   public String getRemovableMemory()
/*      */   {
/* 5556 */     return this.removableMemory;
/*      */   }
/*      */ 
/*      */   public void setRemovableMemory(String value)
/*      */   {
/* 5568 */     this.removableMemory = value;
/*      */   }
/*      */ 
/*      */   public PowerDimension getSpeakerMaximumInputPower()
/*      */   {
/* 5580 */     return this.speakerMaximumInputPower;
/*      */   }
/*      */ 
/*      */   public void setSpeakerMaximumInputPower(PowerDimension value)
/*      */   {
/* 5592 */     this.speakerMaximumInputPower = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalDVIPorts()
/*      */   {
/* 5604 */     return this.totalDVIPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalDVIPorts(BigInteger value)
/*      */   {
/* 5616 */     this.totalDVIPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalFirewirePorts()
/*      */   {
/* 5628 */     return this.totalFirewirePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalFirewirePorts(BigInteger value)
/*      */   {
/* 5640 */     this.totalFirewirePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalMicrophonePorts()
/*      */   {
/* 5652 */     return this.totalMicrophonePorts;
/*      */   }
/*      */ 
/*      */   public void setTotalMicrophonePorts(BigInteger value)
/*      */   {
/* 5664 */     this.totalMicrophonePorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalSVideoOutPorts()
/*      */   {
/* 5676 */     return this.totalSVideoOutPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 5688 */     this.totalSVideoOutPorts = value;
/*      */   }
/*      */ 
/*      */   public BigInteger getTotalUSBPorts()
/*      */   {
/* 5700 */     return this.totalUSBPorts;
/*      */   }
/*      */ 
/*      */   public void setTotalUSBPorts(BigInteger value)
/*      */   {
/* 5712 */     this.totalUSBPorts = value;
/*      */   }
/*      */ 
/*      */   public String getTweeterConeMaterialType()
/*      */   {
/* 5724 */     return this.tweeterConeMaterialType;
/*      */   }
/*      */ 
/*      */   public void setTweeterConeMaterialType(String value)
/*      */   {
/* 5736 */     this.tweeterConeMaterialType = value;
/*      */   }
/*      */ 
/*      */   public LengthDimension getTweeterDriverDiameter()
/*      */   {
/* 5748 */     return this.tweeterDriverDiameter;
/*      */   }
/*      */ 
/*      */   public void setTweeterDriverDiameter(LengthDimension value)
/*      */   {
/* 5760 */     this.tweeterDriverDiameter = value;
/*      */   }
/*      */ 
/*      */   public String getViewFinderType()
/*      */   {
/* 5772 */     return this.viewFinderType;
/*      */   }
/*      */ 
/*      */   public void setViewFinderType(String value)
/*      */   {
/* 5784 */     this.viewFinderType = value;
/*      */   }
/*      */ 
/*      */   public String getWaypointsType()
/*      */   {
/* 5796 */     return this.waypointsType;
/*      */   }
/*      */ 
/*      */   public void setWaypointsType(String value)
/*      */   {
/* 5808 */     this.waypointsType = value;
/*      */   }
/*      */ 
/*      */   @XmlAccessorType(XmlAccessType.FIELD)
/*      */   @XmlType(name="", propOrder={"parentage", "variationTheme"})
/*      */   public static class VariationData
/*      */   {
/*      */ 
/*      */     @XmlElement(name="Parentage", required=true)
/*      */     protected String parentage;
/*      */ 
/*      */     @XmlElement(name="VariationTheme")
/*      */     protected String variationTheme;
/*      */ 
/*      */     public String getParentage()
/*      */     {
/* 5876 */       return this.parentage;
/*      */     }
/*      */ 
/*      */     public void setParentage(String value)
/*      */     {
/* 5888 */       this.parentage = value;
/*      */     }
/*      */ 
/*      */     public String getVariationTheme()
/*      */     {
/* 5900 */       return this.variationTheme;
/*      */     }
/*      */ 
/*      */     public void setVariationTheme(String value)
/*      */     {
/* 5912 */       this.variationTheme = value;
/*      */     }
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ConsumerElectronics
 * JD-Core Version:    0.6.2
 */