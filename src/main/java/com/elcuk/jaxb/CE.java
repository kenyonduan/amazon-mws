/*       */ package com.elcuk.jaxb;
/*       */ 
/*       */ import java.math.BigDecimal;
/*       */ import java.math.BigInteger;
/*       */ import java.util.ArrayList;
/*       */ import java.util.List;
/*       */ import javax.xml.bind.annotation.XmlAccessType;
/*       */ import javax.xml.bind.annotation.XmlAccessorType;
/*       */ import javax.xml.bind.annotation.XmlAttribute;
/*       */ import javax.xml.bind.annotation.XmlElement;
/*       */ import javax.xml.bind.annotation.XmlRootElement;
/*       */ import javax.xml.bind.annotation.XmlSchemaType;
/*       */ import javax.xml.bind.annotation.XmlType;
/*       */ import javax.xml.bind.annotation.XmlValue;
/*       */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*       */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*       */ 
/*       */ @XmlAccessorType(XmlAccessType.FIELD)
/*       */ @XmlType(name="", propOrder={"rebate", "productType", "productSubtype", "analogVideoFormat", "annualEnergyConsumption", "answeringSystemType", "antennaLength", "antennaType", "aspectRatio", "audioFeaturesDescription", "audioInput", "audioOutputEffects", "audioOutputMode", "audioOutputResponseBandwidth", "audioOutputType", "audioSensitivity", "autoRedial", "battery", "batteryAverageLife", "batteryAverageLifeTalkTime", "bufferSize", "batteryTypeLithiumIon", "batteryTypeLithiumMetal", "biometricSecurityFeatures", "builtInDecoders", "buttonQuantity", "cabinetMaterial", "cableFeature", "cableTechnology", "cableType", "cacheMemoryInstalledSize", "callAlerts", "callerIdentification", "carryingStrap", "cassetteSystemType", "cdChangerType", "cdDiskCapacity", "cdLoadType", "cdPlaybackMode", "cdSystemType", "cellularEnhancementProtocol", "coaxialDigitalInput", "coaxialDigitalOutput", "color", "colorDepth", "colorMap", "colorSupport", "compatibleCartridge", "compatibleDevices", "componentType", "compressedCapacity", "computerPeripheralConnector", "conferenceCallCapability", "connectivityProtocol", "connectivityTechnology", "copierType", "copySizeMaximum", "countryOfOrigin", "crossoverFrequency", "dacDataWidth", "dataCompressionProtocol", "dataLinkProtocol", "dataService", "dataStorageCapability", "dataTransferRate", "deviceType", "dgps", "dialerType", "digitalPlayerType", "digitalRecordingTime", "digitalSignalingProtocol", "digitalStorageCapacity", "digitalZoom", "displayColorSupport", "displayLanguageOptions", "displayLineQuantity", "displayResolutionMaximum", "displayTechnology", "displayType", "dockingStationExternalInterface", "driveUnits", "duplex", "dvdDiskCapacity", "dvdDiskChangerType", "dvdMediaLoadType", "dvdPictureZoomPower", "dvdPlaybackMode", "dvdType", "dvrCompressionRate", "dvrMaxRecordingTime", "dvrServiceDescription", "enclosure", "equalizer", "equalizerBandChannels", "errorCorrectionProtocol", "eyeRelief", "faceplateType", "faxMachineCompatibility", "faxType", "flashMemoryInstalledSize", "floppyDiskDrive", "formFactor", "freeAirResonantFrequency", "frequencyRange", "frequencyRequired", "frequencyResponseCurve", "frontAccessibleBaysQuantity", "fuseDescription", "gpsNavigation", "graphicsCoprocessor", "graphicsCoprocessorQuantity", "graphicsRam", "greyscaleDepth", "handsetDepth", "handsetHeight", "handsetLocator", "handsetWeight", "handsetWidth", "hardDiskDescription", "hardDiskInstalledQuantity", "hardDiskRotationalSpeed", "hardwareInterface", "hasCommercialSkip", "hasDVDPictureZoom", "hasParentalChannelLock", "headphonesFormFactor", "headphonesJack", "headphonesTechnology", "horizontalResolution", "hotSwapBaysQuantity", "humanInterfaceInput", "humanInterfaceOutput", "imageAspectRatio", "imageBrightness", "imageContrastRatio", "impedance", "includesMP3Player", "includesRechargableBattery", "includesRemote", "includesSpeakerphone", "inputAdapter", "inputChannelQuantity", "inputConnection", "inputConnectorType", "inputDevice", "inputDeviceInterface", "intercom", "internalBaysQuantity", "isdnTerminalAdapterInterface", "isHDTVCompatible", "isWaterproof", "itemDisplayDepth", "itemDisplayHeight", "itemDisplayLength", "itemDisplayLengthMaximum", "itemDisplayWeight", "itemDisplayWidth", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "keyboardDescription", "lampType", "leftConnectorGender", "leftConnectorType", "manufacturerWarrantyType", "mapType", "materialComposition", "materialType", "maxCopyResolutionBlackWhite", "maxCopyResolutionColor", "maximumBridgedOutputPower", "maximumExternalResolution", "maximumImageSize", "maximumLinearPeakExcursion", "maximumOutputPower", "maximumRange", "maximumRangeIndoors", "maximumSampleRate", "maximumScreenDistance", "maxInputSheetCapacity", "maxPrintResolutionBlackWhite", "maxPrintResolutionColor", "mediaFormat", "mediaLoadType", "mediaSizeMaximum", "mediaType", "memoryStorageCapacity", "memoryTechnology", "mfgWarrantyDescriptionLabor", "mfgWarrantyDescriptionParts", "microphoneFormFactor", "microphoneOperationMode", "microphoneTechnology", "miniDiscSystem", "minimumImageSize", "minimumScreenDistance", "minimumSystemRequirementDescription", "model", "modelName", "modemDescription", "modemInterface", "modemType", "monthlyDutyCycle", "mountingHoleDiameter", "movementDetectionTechnology", "multilineOperation", "multimediaFunctionality", "navigationRoutes", "networkingFeature", "networkInterfaceDescription", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "numberOfPorts", "numberOfSupportedZones", "objectiveLensDiameter", "operatingHumidity", "opticalDigitalInput", "opticalDigitalOutput", "opticalSensorInterpolatedResolution", "opticalSensorResolution", "opticalStorageDevice", "opticalStorageInstalledQuantity", "opticalStorageReadSpeed", "opticalStorageRewriteSpeed", "opticalStorageSecondaryReadSpeed", "opticalStorageSecondaryRewriteSpeed", "opticalStorageSecondaryType", "opticalStorageSecondaryWriteSpeed", "opticalStorageWriteSpeed", "outputChannelQuantity", "outputConnection", "outputConnectorQuantity", "outputConnectorType", "outputPower", "outputWattage", "packageContentType", "packageTypeName", "pcConnectionAvailable", "phoneBaseDepth", "phoneBaseHeight", "phoneBaseWeight", "phoneBaseWidth", "portedBoxVolume", "powerAmplifierClass", "powerDevice", "powerGain", "powerLoadRating", "preampOutputChannels", "presetChannelQuantity", "printerInterface", "printerOutput", "printerResolutionBWHorizontalMax", "printerResolutionBWVerticalMax", "printerResolutionColorHorizontalMax", "printerResolutionColorVerticalMax", "printerTechnology", "processorDescription", "processorMaximum", "processorModelNumber", "processorUpgrade", "programmability", "qtsTotalQFactor", "radioBandsSupported", "radioChannels", "raidLevel", "ramMemoryInstalledSize", "ramMemoryMaximumSize", "ramMemoryTechnology", "rangefinderType", "receiverDescription", "recordingCapacity", "remoteControlAudioControls", "remoteControlDescription", "remoteControlTechnology", "remoteManagementProtocol", "removableMediaCapacity", "removableMemory", "removableStorage", "removableStorageInterface", "removableStorageNativeCapacity", "responseTime", "rightConnectorGender", "rightConnectorType", "routingProtocol", "satelliteServiceDescription", "sbas", "scanElementType", "scannerInterface", "scannerType", "scsiSignalingType", "sealedBoxVolume", "searchSpeed", "secondaryCache", "sellerWarrantyDescription", "signalToNoiseRatio", "size", "speakerAmplificationType", "speakerConnectivity", "speakerDriverMaterial", "speakersCrossoverChannelQuantity", "speakersIncludedDescription", "speakersMaximumOutputPower", "speakersNominalOutputPower", "speakersResponseBandwidth", "speakerSystemClass", "speakerType", "specialFeatures", "specificationMet", "specificUses", "ssdDriveArchitechture", "standardInputSheetCapacity", "storageController", "storageControllerInterface", "storageHumidity", "storageInterface", "styleName", "supportedAudioFormat", "supportedDevices", "supportedDevicesQuantity", "supportedImageFormat", "supportedImageType", "supportedMediaSize", "supportedMotherboard", "supportedStandards", "surgeSuppression", "surroundSoundChannels", "surroundSoundEffects", "switchingProtocol", "systemBusSpeed", "talkRangeMaximum", "tapeLength", "televisionInterface", "televisionPCInterfaceType", "temperatureRating", "totalHarmonicDistortion", "tracklogPoints", "tracks", "transportProtocol", "tuner", "tunerTechnology", "tvTunerSecondaryAudioProgram", "upsTechnology", "vcrType", "verticalResolution", "videoCaptureFormat", "videoCaptureResolution", "videoHeadQuantity", "videoInput", "videoInputDigitalStandard", "videoInputFormat", "videoOutputFormat", "videoOutput", "videoOutputInterface", "videoOutputMode", "videoPlaybackFormat", "videotapePlaybackSpeed", "videotapeRecordingSpeed", "voiceCommunicationSupport", "voiceCoilDescription", "voicemailCapability", "voiceOperatedTransmission", "voipProtocols", "volumeAcousticSuspension", "warnings", "warrantyDescription", "waterproofRating", "waypoints", "waypointsPerRoute", "weatherproof", "writeSpeed"})
/*       */ @XmlRootElement(name="CE")
/*       */ public class CE
/*       */ {
/*       */ 
/*       */   @XmlElement(name="Rebate")
/*       */   protected List<RebateType> rebate;
/*       */ 
/*       */   @XmlElement(name="ProductType", required=true)
/*       */   protected ProductType productType;
/*       */ 
/*       */   @XmlElement(name="ProductSubtype")
/*       */   protected String productSubtype;
/*       */ 
/*       */   @XmlElement(name="AnalogVideoFormat")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> analogVideoFormat;
/*       */ 
/*       */   @XmlElement(name="AnnualEnergyConsumption")
/*       */   protected EnergyConsumptionDimension annualEnergyConsumption;
/*       */ 
/*       */   @XmlElement(name="AnsweringSystemType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String answeringSystemType;
/*       */ 
/*       */   @XmlElement(name="AntennaLength")
/*       */   protected LengthDimension antennaLength;
/*       */ 
/*       */   @XmlElement(name="AntennaType")
/*       */   protected AntennaTypeValues antennaType;
/*       */ 
/*       */   @XmlElement(name="AspectRatio")
/*       */   protected String aspectRatio;
/*       */ 
/*       */   @XmlElement(name="AudioFeaturesDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String audioFeaturesDescription;
/*       */ 
/*       */   @XmlElement(name="AudioInput")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> audioInput;
/*       */ 
/*       */   @XmlElement(name="AudioOutputEffects")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> audioOutputEffects;
/*       */ 
/*       */   @XmlElement(name="AudioOutputMode")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> audioOutputMode;
/*       */ 
/*       */   @XmlElement(name="AudioOutputResponseBandwidth")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String audioOutputResponseBandwidth;
/*       */ 
/*       */   @XmlElement(name="AudioOutputType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String audioOutputType;
/*       */ 
/*       */   @XmlElement(name="AudioSensitivity")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger audioSensitivity;
/*       */ 
/*       */   @XmlElement(name="AutoRedial")
/*       */   protected Boolean autoRedial;
/*       */ 
/*       */   @XmlElement(name="Battery")
/*       */   protected Battery battery;
/*       */ 
/*       */   @XmlElement(name="BatteryAverageLife")
/*       */   protected TimeDimension batteryAverageLife;
/*       */ 
/*       */   @XmlElement(name="BatteryAverageLifeTalkTime")
/*       */   protected TimeDimension batteryAverageLifeTalkTime;
/*       */ 
/*       */   @XmlElement(name="BufferSize")
/*       */   protected MemorySizeDimension bufferSize;
/*       */ 
/*       */   @XmlElement(name="BatteryTypeLithiumIon")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger batteryTypeLithiumIon;
/*       */ 
/*       */   @XmlElement(name="BatteryTypeLithiumMetal")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger batteryTypeLithiumMetal;
/*       */ 
/*       */   @XmlElement(name="BiometricSecurityFeatures")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String biometricSecurityFeatures;
/*       */ 
/*       */   @XmlElement(name="BuiltInDecoders")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> builtInDecoders;
/*       */ 
/*       */   @XmlElement(name="ButtonQuantity")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger buttonQuantity;
/*       */ 
/*       */   @XmlElement(name="CabinetMaterial")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cabinetMaterial;
/*       */ 
/*       */   @XmlElement(name="CableFeature")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> cableFeature;
/*       */ 
/*       */   @XmlElement(name="CableTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> cableTechnology;
/*       */ 
/*       */   @XmlElement(name="CableType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cableType;
/*       */ 
/*       */   @XmlElement(name="CacheMemoryInstalledSize")
/*       */   protected MemorySizeDimension cacheMemoryInstalledSize;
/*       */ 
/*       */   @XmlElement(name="CallAlerts")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String callAlerts;
/*       */ 
/*       */   @XmlElement(name="CallerIdentification")
/*       */   protected Boolean callerIdentification;
/*       */ 
/*       */   @XmlElement(name="CarryingStrap")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> carryingStrap;
/*       */ 
/*       */   @XmlElement(name="CassetteSystemType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cassetteSystemType;
/*       */ 
/*       */   @XmlElement(name="CDChangerType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cdChangerType;
/*       */ 
/*       */   @XmlElement(name="CDDiskCapacity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger cdDiskCapacity;
/*       */ 
/*       */   @XmlElement(name="CDLoadType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cdLoadType;
/*       */ 
/*       */   @XmlElement(name="CDPlaybackMode")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> cdPlaybackMode;
/*       */ 
/*       */   @XmlElement(name="CDSystemType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cdSystemType;
/*       */ 
/*       */   @XmlElement(name="CellularEnhancementProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> cellularEnhancementProtocol;
/*       */ 
/*       */   @XmlElement(name="CoaxialDigitalInput")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String coaxialDigitalInput;
/*       */ 
/*       */   @XmlElement(name="CoaxialDigitalOutput")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String coaxialDigitalOutput;
/*       */ 
/*       */   @XmlElement(name="Color")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String color;
/*       */ 
/*       */   @XmlElement(name="ColorDepth")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> colorDepth;
/*       */ 
/*       */   @XmlElement(name="ColorMap")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String colorMap;
/*       */ 
/*       */   @XmlElement(name="ColorSupport")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> colorSupport;
/*       */ 
/*       */   @XmlElement(name="CompatibleCartridge")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> compatibleCartridge;
/*       */ 
/*       */   @XmlElement(name="CompatibleDevices")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> compatibleDevices;
/*       */ 
/*       */   @XmlElement(name="ComponentType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> componentType;
/*       */ 
/*       */   @XmlElement(name="CompressedCapacity")
/*       */   protected MemorySizeDimension compressedCapacity;
/*       */ 
/*       */   @XmlElement(name="ComputerPeripheralConnector")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> computerPeripheralConnector;
/*       */ 
/*       */   @XmlElement(name="ConferenceCallCapability")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String conferenceCallCapability;
/*       */ 
/*       */   @XmlElement(name="ConnectivityProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> connectivityProtocol;
/*       */ 
/*       */   @XmlElement(name="ConnectivityTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String connectivityTechnology;
/*       */ 
/*       */   @XmlElement(name="CopierType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String copierType;
/*       */ 
/*       */   @XmlElement(name="CopySizeMaximum")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String copySizeMaximum;
/*       */ 
/*       */   @XmlElement(name="CountryOfOrigin")
/*       */   protected String countryOfOrigin;
/*       */ 
/*       */   @XmlElement(name="CrossoverFrequency")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String crossoverFrequency;
/*       */ 
/*       */   @XmlElement(name="DACDataWidth")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dacDataWidth;
/*       */ 
/*       */   @XmlElement(name="DataCompressionProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> dataCompressionProtocol;
/*       */ 
/*       */   @XmlElement(name="DataLinkProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> dataLinkProtocol;
/*       */ 
/*       */   @XmlElement(name="DataService")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dataService;
/*       */ 
/*       */   @XmlElement(name="DataStorageCapability")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dataStorageCapability;
/*       */ 
/*       */   @XmlElement(name="DataTransferRate")
/*       */   protected DataTransferRate dataTransferRate;
/*       */ 
/*       */   @XmlElement(name="DeviceType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String deviceType;
/*       */ 
/*       */   @XmlElement(name="DGPS")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dgps;
/*       */ 
/*       */   @XmlElement(name="DialerType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dialerType;
/*       */ 
/*       */   @XmlElement(name="DigitalPlayerType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String digitalPlayerType;
/*       */ 
/*       */   @XmlElement(name="DigitalRecordingTime")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> digitalRecordingTime;
/*       */ 
/*       */   @XmlElement(name="DigitalSignalingProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> digitalSignalingProtocol;
/*       */ 
/*       */   @XmlElement(name="DigitalStorageCapacity")
/*       */   protected MemorySizeDimension digitalStorageCapacity;
/*       */ 
/*       */   @XmlElement(name="DigitalZoom")
/*       */   protected ZoomDimension digitalZoom;
/*       */ 
/*       */   @XmlElement(name="DisplayColorSupport")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> displayColorSupport;
/*       */ 
/*       */   @XmlElement(name="DisplayLanguageOptions")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String displayLanguageOptions;
/*       */ 
/*       */   @XmlElement(name="DisplayLineQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger displayLineQuantity;
/*       */ 
/*       */   @XmlElement(name="DisplayResolutionMaximum")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String displayResolutionMaximum;
/*       */ 
/*       */   @XmlElement(name="DisplayTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String displayTechnology;
/*       */ 
/*       */   @XmlElement(name="DisplayType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String displayType;
/*       */ 
/*       */   @XmlElement(name="DockingStationExternalInterface")
/*       */   protected DockingStationExternalInterfaceTypeValues dockingStationExternalInterface;
/*       */ 
/*       */   @XmlElement(name="DriveUnits")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String driveUnits;
/*       */ 
/*       */   @XmlElement(name="Duplex")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String duplex;
/*       */ 
/*       */   @XmlElement(name="DVDDiskCapacity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger dvdDiskCapacity;
/*       */ 
/*       */   @XmlElement(name="DVDDiskChangerType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dvdDiskChangerType;
/*       */ 
/*       */   @XmlElement(name="DVDMediaLoadType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dvdMediaLoadType;
/*       */ 
/*       */   @XmlElement(name="DVDPictureZoomPower")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> dvdPictureZoomPower;
/*       */ 
/*       */   @XmlElement(name="DVDPlaybackMode")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> dvdPlaybackMode;
/*       */ 
/*       */   @XmlElement(name="DVDType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dvdType;
/*       */ 
/*       */   @XmlElement(name="DVRCompressionRate")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dvrCompressionRate;
/*       */ 
/*       */   @XmlElement(name="DVRMaxRecordingTime")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger dvrMaxRecordingTime;
/*       */ 
/*       */   @XmlElement(name="DVRServiceDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String dvrServiceDescription;
/*       */ 
/*       */   @XmlElement(name="Enclosure")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String enclosure;
/*       */ 
/*       */   @XmlElement(name="Equalizer")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String equalizer;
/*       */ 
/*       */   @XmlElement(name="EqualizerBandChannels")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String equalizerBandChannels;
/*       */ 
/*       */   @XmlElement(name="ErrorCorrectionProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> errorCorrectionProtocol;
/*       */ 
/*       */   @XmlElement(name="EyeRelief")
/*       */   protected LengthDimension eyeRelief;
/*       */ 
/*       */   @XmlElement(name="FaceplateType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String faceplateType;
/*       */ 
/*       */   @XmlElement(name="FaxMachineCompatibility")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String faxMachineCompatibility;
/*       */ 
/*       */   @XmlElement(name="FaxType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String faxType;
/*       */ 
/*       */   @XmlElement(name="FlashMemoryInstalledSize")
/*       */   protected MemorySizeDimension flashMemoryInstalledSize;
/*       */ 
/*       */   @XmlElement(name="FloppyDiskDrive")
/*       */   protected String floppyDiskDrive;
/*       */ 
/*       */   @XmlElement(name="FormFactor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> formFactor;
/*       */ 
/*       */   @XmlElement(name="FreeAirResonantFrequency")
/*       */   protected FrequencyDimension freeAirResonantFrequency;
/*       */ 
/*       */   @XmlElement(name="FrequencyRange")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> frequencyRange;
/*       */ 
/*       */   @XmlElement(name="FrequencyRequired")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String frequencyRequired;
/*       */ 
/*       */   @XmlElement(name="FrequencyResponseCurve")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String frequencyResponseCurve;
/*       */ 
/*       */   @XmlElement(name="FrontAccessibleBaysQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger frontAccessibleBaysQuantity;
/*       */ 
/*       */   @XmlElement(name="FuseDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fuseDescription;
/*       */ 
/*       */   @XmlElement(name="GPSNavigation")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String gpsNavigation;
/*       */ 
/*       */   @XmlElement(name="GraphicsCoprocessor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String graphicsCoprocessor;
/*       */ 
/*       */   @XmlElement(name="GraphicsCoprocessorQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger graphicsCoprocessorQuantity;
/*       */ 
/*       */   @XmlElement(name="GraphicsRam")
/*       */   protected BigDecimal graphicsRam;
/*       */ 
/*       */   @XmlElement(name="GreyscaleDepth")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> greyscaleDepth;
/*       */ 
/*       */   @XmlElement(name="HandsetDepth")
/*       */   protected LengthDimension handsetDepth;
/*       */ 
/*       */   @XmlElement(name="HandsetHeight")
/*       */   protected LengthDimension handsetHeight;
/*       */ 
/*       */   @XmlElement(name="HandsetLocator")
/*       */   protected Boolean handsetLocator;
/*       */ 
/*       */   @XmlElement(name="HandsetWeight")
/*       */   protected WeightDimension handsetWeight;
/*       */ 
/*       */   @XmlElement(name="HandsetWidth")
/*       */   protected LengthDimension handsetWidth;
/*       */ 
/*       */   @XmlElement(name="HardDiskDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String hardDiskDescription;
/*       */ 
/*       */   @XmlElement(name="HardDiskInstalledQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger hardDiskInstalledQuantity;
/*       */ 
/*       */   @XmlElement(name="HardDiskRotationalSpeed")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger hardDiskRotationalSpeed;
/*       */ 
/*       */   @XmlElement(name="HardwareInterface")
/*       */   protected List<String> hardwareInterface;
/*       */ 
/*       */   @XmlElement(name="HasCommercialSkip")
/*       */   protected Boolean hasCommercialSkip;
/*       */ 
/*       */   @XmlElement(name="HasDVDPictureZoom")
/*       */   protected Boolean hasDVDPictureZoom;
/*       */ 
/*       */   @XmlElement(name="HasParentalChannelLock")
/*       */   protected Boolean hasParentalChannelLock;
/*       */ 
/*       */   @XmlElement(name="HeadphonesFormFactor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String headphonesFormFactor;
/*       */ 
/*       */   @XmlElement(name="HeadphonesJack")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String headphonesJack;
/*       */ 
/*       */   @XmlElement(name="HeadphonesTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String headphonesTechnology;
/*       */ 
/*       */   @XmlElement(name="HorizontalResolution")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger horizontalResolution;
/*       */ 
/*       */   @XmlElement(name="HotSwapBaysQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger hotSwapBaysQuantity;
/*       */ 
/*       */   @XmlElement(name="HumanInterfaceInput")
/*       */   protected List<HumanInterfaceInputType> humanInterfaceInput;
/*       */ 
/*       */   @XmlElement(name="HumanInterfaceOutput")
/*       */   protected HumanInterfaceOutputType humanInterfaceOutput;
/*       */ 
/*       */   @XmlElement(name="ImageAspectRatio")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> imageAspectRatio;
/*       */ 
/*       */   @XmlElement(name="ImageBrightness")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String imageBrightness;
/*       */ 
/*       */   @XmlElement(name="ImageContrastRatio")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String imageContrastRatio;
/*       */ 
/*       */   @XmlElement(name="Impedance")
/*       */   protected ResistanceDimension impedance;
/*       */ 
/*       */   @XmlElement(name="IncludesMP3Player")
/*       */   protected Boolean includesMP3Player;
/*       */ 
/*       */   @XmlElement(name="IncludesRechargableBattery")
/*       */   protected Boolean includesRechargableBattery;
/*       */ 
/*       */   @XmlElement(name="IncludesRemote")
/*       */   protected Boolean includesRemote;
/*       */ 
/*       */   @XmlElement(name="IncludesSpeakerphone")
/*       */   protected Boolean includesSpeakerphone;
/*       */ 
/*       */   @XmlElement(name="InputAdapter")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> inputAdapter;
/*       */ 
/*       */   @XmlElement(name="InputChannelQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger inputChannelQuantity;
/*       */ 
/*       */   @XmlElement(name="InputConnection")
/*       */   protected List<Connection> inputConnection;
/*       */ 
/*       */   @XmlElement(name="InputConnectorType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> inputConnectorType;
/*       */ 
/*       */   @XmlElement(name="InputDevice")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> inputDevice;
/*       */ 
/*       */   @XmlElement(name="InputDeviceInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> inputDeviceInterface;
/*       */ 
/*       */   @XmlElement(name="Intercom")
/*       */   protected Boolean intercom;
/*       */ 
/*       */   @XmlElement(name="InternalBaysQuantity")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger internalBaysQuantity;
/*       */ 
/*       */   @XmlElement(name="ISDNTerminalAdapterInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String isdnTerminalAdapterInterface;
/*       */ 
/*       */   @XmlElement(name="IsHDTVCompatible")
/*       */   protected Boolean isHDTVCompatible;
/*       */ 
/*       */   @XmlElement(name="IsWaterproof")
/*       */   protected Boolean isWaterproof;
/*       */ 
/*       */   @XmlElement(name="ItemDisplayDepth")
/*       */   protected LengthDimension itemDisplayDepth;
/*       */ 
/*       */   @XmlElement(name="ItemDisplayHeight")
/*       */   protected LengthDimension itemDisplayHeight;
/*       */ 
/*       */   @XmlElement(name="ItemDisplayLength")
/*       */   protected LengthDimension itemDisplayLength;
/*       */ 
/*       */   @XmlElement(name="ItemDisplayLengthMaximum")
/*       */   protected LengthDimension itemDisplayLengthMaximum;
/*       */ 
/*       */   @XmlElement(name="ItemDisplayWeight")
/*       */   protected WeightDimension itemDisplayWeight;
/*       */ 
/*       */   @XmlElement(name="ItemDisplayWidth")
/*       */   protected LengthDimension itemDisplayWidth;
/*       */ 
/*       */   @XmlElement(name="LithiumBatteryEnergyContent")
/*       */   protected BigDecimal lithiumBatteryEnergyContent;
/*       */ 
/*       */   @XmlElement(name="LithiumBatteryPackaging")
/*       */   protected String lithiumBatteryPackaging;
/*       */ 
/*       */   @XmlElement(name="LithiumBatteryVoltage")
/*       */   protected BigDecimal lithiumBatteryVoltage;
/*       */ 
/*       */   @XmlElement(name="LithiumBatteryWeight")
/*       */   protected BigDecimal lithiumBatteryWeight;
/*       */ 
/*       */   @XmlElement(name="KeyboardDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String keyboardDescription;
/*       */ 
/*       */   @XmlElement(name="LampType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String lampType;
/*       */ 
/*       */   @XmlElement(name="LeftConnectorGender")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String leftConnectorGender;
/*       */ 
/*       */   @XmlElement(name="LeftConnectorType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> leftConnectorType;
/*       */ 
/*       */   @XmlElement(name="ManufacturerWarrantyType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String manufacturerWarrantyType;
/*       */ 
/*       */   @XmlElement(name="MapType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> mapType;
/*       */ 
/*       */   @XmlElement(name="MaterialComposition")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> materialComposition;
/*       */ 
/*       */   @XmlElement(name="MaterialType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> materialType;
/*       */ 
/*       */   @XmlElement(name="MaxCopyResolutionBlackWhite")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String maxCopyResolutionBlackWhite;
/*       */ 
/*       */   @XmlElement(name="MaxCopyResolutionColor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String maxCopyResolutionColor;
/*       */ 
/*       */   @XmlElement(name="MaximumBridgedOutputPower")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger maximumBridgedOutputPower;
/*       */ 
/*       */   @XmlElement(name="MaximumExternalResolution")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String maximumExternalResolution;
/*       */ 
/*       */   @XmlElement(name="MaximumImageSize")
/*       */   protected LengthDimension maximumImageSize;
/*       */ 
/*       */   @XmlElement(name="MaximumLinearPeakExcursion")
/*       */   protected LengthDimension maximumLinearPeakExcursion;
/*       */ 
/*       */   @XmlElement(name="MaximumOutputPower")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String maximumOutputPower;
/*       */ 
/*       */   @XmlElement(name="MaximumRange")
/*       */   protected LengthDimension maximumRange;
/*       */ 
/*       */   @XmlElement(name="MaximumRangeIndoors")
/*       */   protected LengthDimension maximumRangeIndoors;
/*       */ 
/*       */   @XmlElement(name="MaximumSampleRate")
/*       */   protected FrequencyDimension maximumSampleRate;
/*       */ 
/*       */   @XmlElement(name="MaximumScreenDistance")
/*       */   protected LengthDimension maximumScreenDistance;
/*       */ 
/*       */   @XmlElement(name="MaxInputSheetCapacity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger maxInputSheetCapacity;
/*       */ 
/*       */   @XmlElement(name="MaxPrintResolutionBlackWhite")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> maxPrintResolutionBlackWhite;
/*       */ 
/*       */   @XmlElement(name="MaxPrintResolutionColor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> maxPrintResolutionColor;
/*       */ 
/*       */   @XmlElement(name="MediaFormat")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mediaFormat;
/*       */ 
/*       */   @XmlElement(name="MediaLoadType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mediaLoadType;
/*       */ 
/*       */   @XmlElement(name="MediaSizeMaximum")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> mediaSizeMaximum;
/*       */ 
/*       */   @XmlElement(name="MediaType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> mediaType;
/*       */ 
/*       */   @XmlElement(name="MemoryStorageCapacity")
/*       */   protected MemorySizeDimension memoryStorageCapacity;
/*       */ 
/*       */   @XmlElement(name="MemoryTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String memoryTechnology;
/*       */ 
/*       */   @XmlElement(name="MfgWarrantyDescriptionLabor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mfgWarrantyDescriptionLabor;
/*       */ 
/*       */   @XmlElement(name="MfgWarrantyDescriptionParts")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mfgWarrantyDescriptionParts;
/*       */ 
/*       */   @XmlElement(name="MicrophoneFormFactor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String microphoneFormFactor;
/*       */ 
/*       */   @XmlElement(name="MicrophoneOperationMode")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> microphoneOperationMode;
/*       */ 
/*       */   @XmlElement(name="MicrophoneTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String microphoneTechnology;
/*       */ 
/*       */   @XmlElement(name="MiniDiscSystem")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String miniDiscSystem;
/*       */ 
/*       */   @XmlElement(name="MinimumImageSize")
/*       */   protected LengthDimension minimumImageSize;
/*       */ 
/*       */   @XmlElement(name="MinimumScreenDistance")
/*       */   protected LengthDimension minimumScreenDistance;
/*       */ 
/*       */   @XmlElement(name="MinimumSystemRequirementDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String minimumSystemRequirementDescription;
/*       */ 
/*       */   @XmlElement(name="Model")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String model;
/*       */ 
/*       */   @XmlElement(name="ModelName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String modelName;
/*       */ 
/*       */   @XmlElement(name="ModemDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String modemDescription;
/*       */ 
/*       */   @XmlElement(name="ModemInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String modemInterface;
/*       */ 
/*       */   @XmlElement(name="ModemType")
/*       */   protected ModemTypeValues modemType;
/*       */ 
/*       */   @XmlElement(name="MonthlyDutyCycle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String monthlyDutyCycle;
/*       */ 
/*       */   @XmlElement(name="MountingHoleDiameter")
/*       */   protected LengthDimension mountingHoleDiameter;
/*       */ 
/*       */   @XmlElement(name="MovementDetectionTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String movementDetectionTechnology;
/*       */ 
/*       */   @XmlElement(name="MultilineOperation")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> multilineOperation;
/*       */ 
/*       */   @XmlElement(name="MultimediaFunctionality")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> multimediaFunctionality;
/*       */ 
/*       */   @XmlElement(name="NavigationRoutes")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger navigationRoutes;
/*       */ 
/*       */   @XmlElement(name="NetworkingFeature")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> networkingFeature;
/*       */ 
/*       */   @XmlElement(name="NetworkInterfaceDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String networkInterfaceDescription;
/*       */ 
/*       */   @XmlElement(name="NumberOfLithiumIonCells")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfLithiumIonCells;
/*       */ 
/*       */   @XmlElement(name="NumberOfLithiumMetalCells")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfLithiumMetalCells;
/*       */ 
/*       */   @XmlElement(name="NumberOfPorts")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger numberOfPorts;
/*       */ 
/*       */   @XmlElement(name="NumberOfSupportedZones")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfSupportedZones;
/*       */ 
/*       */   @XmlElement(name="ObjectiveLensDiameter")
/*       */   protected LengthDimension objectiveLensDiameter;
/*       */ 
/*       */   @XmlElement(name="OperatingHumidity")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String operatingHumidity;
/*       */ 
/*       */   @XmlElement(name="OpticalDigitalInput")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String opticalDigitalInput;
/*       */ 
/*       */   @XmlElement(name="OpticalDigitalOutput")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String opticalDigitalOutput;
/*       */ 
/*       */   @XmlElement(name="OpticalSensorInterpolatedResolution")
/*       */   protected PixelDimension opticalSensorInterpolatedResolution;
/*       */ 
/*       */   @XmlElement(name="OpticalSensorResolution")
/*       */   protected PixelDimension opticalSensorResolution;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageDevice")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> opticalStorageDevice;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageInstalledQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger opticalStorageInstalledQuantity;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageReadSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String opticalStorageReadSpeed;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageRewriteSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String opticalStorageRewriteSpeed;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageSecondaryReadSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String opticalStorageSecondaryReadSpeed;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageSecondaryRewriteSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String opticalStorageSecondaryRewriteSpeed;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageSecondaryType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> opticalStorageSecondaryType;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageSecondaryWriteSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String opticalStorageSecondaryWriteSpeed;
/*       */ 
/*       */   @XmlElement(name="OpticalStorageWriteSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String opticalStorageWriteSpeed;
/*       */ 
/*       */   @XmlElement(name="OutputChannelQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger outputChannelQuantity;
/*       */ 
/*       */   @XmlElement(name="OutputConnection")
/*       */   protected List<Connection> outputConnection;
/*       */ 
/*       */   @XmlElement(name="OutputConnectorQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger outputConnectorQuantity;
/*       */ 
/*       */   @XmlElement(name="OutputConnectorType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> outputConnectorType;
/*       */ 
/*       */   @XmlElement(name="OutputPower")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger outputPower;
/*       */ 
/*       */   @XmlElement(name="OutputWattage")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger outputWattage;
/*       */ 
/*       */   @XmlElement(name="PackageContentType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String packageContentType;
/*       */ 
/*       */   @XmlElement(name="PackageTypeName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String packageTypeName;
/*       */ 
/*       */   @XmlElement(name="PCConnectionAvailable")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String pcConnectionAvailable;
/*       */ 
/*       */   @XmlElement(name="PhoneBaseDepth")
/*       */   protected LengthDimension phoneBaseDepth;
/*       */ 
/*       */   @XmlElement(name="PhoneBaseHeight")
/*       */   protected LengthDimension phoneBaseHeight;
/*       */ 
/*       */   @XmlElement(name="PhoneBaseWeight")
/*       */   protected WeightDimension phoneBaseWeight;
/*       */ 
/*       */   @XmlElement(name="PhoneBaseWidth")
/*       */   protected LengthDimension phoneBaseWidth;
/*       */ 
/*       */   @XmlElement(name="PortedBoxVolume")
/*       */   protected PortedBoxVolume portedBoxVolume;
/*       */ 
/*       */   @XmlElement(name="PowerAmplifierClass")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String powerAmplifierClass;
/*       */ 
/*       */   @XmlElement(name="PowerDevice")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String powerDevice;
/*       */ 
/*       */   @XmlElement(name="PowerGain")
/*       */   protected VoltageIntegerDimension powerGain;
/*       */ 
/*       */   @XmlElement(name="PowerLoadRating")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String powerLoadRating;
/*       */ 
/*       */   @XmlElement(name="PreampOutputChannels")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger preampOutputChannels;
/*       */ 
/*       */   @XmlElement(name="PresetChannelQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger presetChannelQuantity;
/*       */ 
/*       */   @XmlElement(name="PrinterInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String printerInterface;
/*       */ 
/*       */   @XmlElement(name="PrinterOutput")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String printerOutput;
/*       */ 
/*       */   @XmlElement(name="PrinterResolutionBWHorizontalMax")
/*       */   protected PixelDimension printerResolutionBWHorizontalMax;
/*       */ 
/*       */   @XmlElement(name="PrinterResolutionBWVerticalMax")
/*       */   protected PixelDimension printerResolutionBWVerticalMax;
/*       */ 
/*       */   @XmlElement(name="PrinterResolutionColorHorizontalMax")
/*       */   protected PixelDimension printerResolutionColorHorizontalMax;
/*       */ 
/*       */   @XmlElement(name="PrinterResolutionColorVerticalMax")
/*       */   protected PixelDimension printerResolutionColorVerticalMax;
/*       */ 
/*       */   @XmlElement(name="PrinterTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String printerTechnology;
/*       */ 
/*       */   @XmlElement(name="ProcessorDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String processorDescription;
/*       */ 
/*       */   @XmlElement(name="ProcessorMaximum")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger processorMaximum;
/*       */ 
/*       */   @XmlElement(name="ProcessorModelNumber")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String processorModelNumber;
/*       */ 
/*       */   @XmlElement(name="ProcessorUpgrade")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String processorUpgrade;
/*       */ 
/*       */   @XmlElement(name="Programmability")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> programmability;
/*       */ 
/*       */   @XmlElement(name="QtsTotalQFactor")
/*       */   protected BigDecimal qtsTotalQFactor;
/*       */ 
/*       */   @XmlElement(name="RadioBandsSupported")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String radioBandsSupported;
/*       */ 
/*       */   @XmlElement(name="RadioChannels")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String radioChannels;
/*       */ 
/*       */   @XmlElement(name="RAIDLevel")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> raidLevel;
/*       */ 
/*       */   @XmlElement(name="RAMMemoryInstalledSize")
/*       */   protected MemorySizeDimension ramMemoryInstalledSize;
/*       */ 
/*       */   @XmlElement(name="RAMMemoryMaximumSize")
/*       */   protected MemorySizeDimension ramMemoryMaximumSize;
/*       */ 
/*       */   @XmlElement(name="RAMMemoryTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String ramMemoryTechnology;
/*       */ 
/*       */   @XmlElement(name="RangefinderType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String rangefinderType;
/*       */ 
/*       */   @XmlElement(name="ReceiverDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String receiverDescription;
/*       */ 
/*       */   @XmlElement(name="RecordingCapacity")
/*       */   protected MemorySizeDimension recordingCapacity;
/*       */ 
/*       */   @XmlElement(name="RemoteControlAudioControls")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> remoteControlAudioControls;
/*       */ 
/*       */   @XmlElement(name="RemoteControlDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String remoteControlDescription;
/*       */ 
/*       */   @XmlElement(name="RemoteControlTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String remoteControlTechnology;
/*       */ 
/*       */   @XmlElement(name="RemoteManagementProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> remoteManagementProtocol;
/*       */ 
/*       */   @XmlElement(name="RemovableMediaCapacity")
/*       */   protected MemorySizeDimension removableMediaCapacity;
/*       */ 
/*       */   @XmlElement(name="RemovableMemory")
/*       */   protected String removableMemory;
/*       */ 
/*       */   @XmlElement(name="RemovableStorage")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String removableStorage;
/*       */ 
/*       */   @XmlElement(name="RemovableStorageInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String removableStorageInterface;
/*       */ 
/*       */   @XmlElement(name="RemovableStorageNativeCapacity")
/*       */   protected MemorySizeDimension removableStorageNativeCapacity;
/*       */ 
/*       */   @XmlElement(name="ResponseTime")
/*       */   protected TimeDimension responseTime;
/*       */ 
/*       */   @XmlElement(name="RightConnectorGender")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String rightConnectorGender;
/*       */ 
/*       */   @XmlElement(name="RightConnectorType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> rightConnectorType;
/*       */ 
/*       */   @XmlElement(name="RoutingProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> routingProtocol;
/*       */ 
/*       */   @XmlElement(name="SatelliteServiceDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> satelliteServiceDescription;
/*       */ 
/*       */   @XmlElement(name="SBAS")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> sbas;
/*       */ 
/*       */   @XmlElement(name="ScanElementType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String scanElementType;
/*       */ 
/*       */   @XmlElement(name="ScannerInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String scannerInterface;
/*       */ 
/*       */   @XmlElement(name="ScannerType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String scannerType;
/*       */ 
/*       */   @XmlElement(name="SCSISignalingType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String scsiSignalingType;
/*       */ 
/*       */   @XmlElement(name="SealedBoxVolume")
/*       */   protected SealedBoxVolume sealedBoxVolume;
/*       */ 
/*       */   @XmlElement(name="SearchSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> searchSpeed;
/*       */ 
/*       */   @XmlElement(name="SecondaryCache")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger secondaryCache;
/*       */ 
/*       */   @XmlElement(name="SellerWarrantyDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String sellerWarrantyDescription;
/*       */ 
/*       */   @XmlElement(name="SignalToNoiseRatio")
/*       */   protected BigDecimal signalToNoiseRatio;
/*       */ 
/*       */   @XmlElement(name="Size")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String size;
/*       */ 
/*       */   @XmlElement(name="SpeakerAmplificationType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speakerAmplificationType;
/*       */ 
/*       */   @XmlElement(name="SpeakerConnectivity")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speakerConnectivity;
/*       */ 
/*       */   @XmlElement(name="SpeakerDriverMaterial")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speakerDriverMaterial;
/*       */ 
/*       */   @XmlElement(name="SpeakersCrossoverChannelQuantity")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> speakersCrossoverChannelQuantity;
/*       */ 
/*       */   @XmlElement(name="SpeakersIncludedDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speakersIncludedDescription;
/*       */ 
/*       */   @XmlElement(name="SpeakersMaximumOutputPower")
/*       */   protected BigDecimal speakersMaximumOutputPower;
/*       */ 
/*       */   @XmlElement(name="SpeakersNominalOutputPower")
/*       */   protected BigDecimal speakersNominalOutputPower;
/*       */ 
/*       */   @XmlElement(name="SpeakersResponseBandwidth")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speakersResponseBandwidth;
/*       */ 
/*       */   @XmlElement(name="SpeakerSystemClass")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speakerSystemClass;
/*       */ 
/*       */   @XmlElement(name="SpeakerType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speakerType;
/*       */ 
/*       */   @XmlElement(name="SpecialFeatures")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> specialFeatures;
/*       */ 
/*       */   @XmlElement(name="SpecificationMet")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> specificationMet;
/*       */ 
/*       */   @XmlElement(name="SpecificUses")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String specificUses;
/*       */ 
/*       */   @XmlElement(name="SSDDriveArchitechture")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String ssdDriveArchitechture;
/*       */ 
/*       */   @XmlElement(name="StandardInputSheetCapacity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger standardInputSheetCapacity;
/*       */ 
/*       */   @XmlElement(name="StorageController")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String storageController;
/*       */ 
/*       */   @XmlElement(name="StorageControllerInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String storageControllerInterface;
/*       */ 
/*       */   @XmlElement(name="StorageHumidity")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String storageHumidity;
/*       */ 
/*       */   @XmlElement(name="StorageInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String storageInterface;
/*       */ 
/*       */   @XmlElement(name="StyleName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String styleName;
/*       */ 
/*       */   @XmlElement(name="SupportedAudioFormat")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> supportedAudioFormat;
/*       */ 
/*       */   @XmlElement(name="SupportedDevices")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> supportedDevices;
/*       */ 
/*       */   @XmlElement(name="SupportedDevicesQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger supportedDevicesQuantity;
/*       */ 
/*       */   @XmlElement(name="SupportedImageFormat")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> supportedImageFormat;
/*       */ 
/*       */   @XmlElement(name="SupportedImageType")
/*       */   protected List<String> supportedImageType;
/*       */ 
/*       */   @XmlElement(name="SupportedMediaSize")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String supportedMediaSize;
/*       */ 
/*       */   @XmlElement(name="SupportedMotherboard")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String supportedMotherboard;
/*       */ 
/*       */   @XmlElement(name="SupportedStandards")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> supportedStandards;
/*       */ 
/*       */   @XmlElement(name="SurgeSuppression")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String surgeSuppression;
/*       */ 
/*       */   @XmlElement(name="SurroundSoundChannels")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String surroundSoundChannels;
/*       */ 
/*       */   @XmlElement(name="SurroundSoundEffects")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> surroundSoundEffects;
/*       */ 
/*       */   @XmlElement(name="SwitchingProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> switchingProtocol;
/*       */ 
/*       */   @XmlElement(name="SystemBusSpeed")
/*       */   protected BigDecimal systemBusSpeed;
/*       */ 
/*       */   @XmlElement(name="TalkRangeMaximum")
/*       */   protected LengthDimension talkRangeMaximum;
/*       */ 
/*       */   @XmlElement(name="TapeLength")
/*       */   protected TimeDimension tapeLength;
/*       */ 
/*       */   @XmlElement(name="TelevisionInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String televisionInterface;
/*       */ 
/*       */   @XmlElement(name="TelevisionPCInterfaceType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String televisionPCInterfaceType;
/*       */ 
/*       */   @XmlElement(name="TemperatureRating")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String temperatureRating;
/*       */ 
/*       */   @XmlElement(name="TotalHarmonicDistortion")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String totalHarmonicDistortion;
/*       */ 
/*       */   @XmlElement(name="TracklogPoints")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger tracklogPoints;
/*       */ 
/*       */   @XmlElement(name="Tracks")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger tracks;
/*       */ 
/*       */   @XmlElement(name="TransportProtocol")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> transportProtocol;
/*       */ 
/*       */   @XmlElement(name="Tuner")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String tuner;
/*       */ 
/*       */   @XmlElement(name="TunerTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> tunerTechnology;
/*       */ 
/*       */   @XmlElement(name="TVTunerSecondaryAudioProgram")
/*       */   protected Boolean tvTunerSecondaryAudioProgram;
/*       */ 
/*       */   @XmlElement(name="UPSTechnology")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String upsTechnology;
/*       */ 
/*       */   @XmlElement(name="VCRType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> vcrType;
/*       */ 
/*       */   @XmlElement(name="VerticalResolution")
/*       */   protected PixelDimension verticalResolution;
/*       */ 
/*       */   @XmlElement(name="VideoCaptureFormat")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videoCaptureFormat;
/*       */ 
/*       */   @XmlElement(name="VideoCaptureResolution")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videoCaptureResolution;
/*       */ 
/*       */   @XmlElement(name="VideoHeadQuantity")
/*       */   @XmlSchemaType(name="nonNegativeInteger")
/*       */   protected BigInteger videoHeadQuantity;
/*       */ 
/*       */   @XmlElement(name="VideoInput")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videoInput;
/*       */ 
/*       */   @XmlElement(name="VideoInputDigitalStandard")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videoInputDigitalStandard;
/*       */ 
/*       */   @XmlElement(name="VideoInputFormat")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videoInputFormat;
/*       */ 
/*       */   @XmlElement(name="VideoOutputFormat")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String videoOutputFormat;
/*       */ 
/*       */   @XmlElement(name="VideoOutput")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videoOutput;
/*       */ 
/*       */   @XmlElement(name="VideoOutputInterface")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videoOutputInterface;
/*       */ 
/*       */   @XmlElement(name="VideoOutputMode")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String videoOutputMode;
/*       */ 
/*       */   @XmlElement(name="VideoPlaybackFormat")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videoPlaybackFormat;
/*       */ 
/*       */   @XmlElement(name="VideotapePlaybackSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> videotapePlaybackSpeed;
/*       */ 
/*       */   @XmlElement(name="VideotapeRecordingSpeed")
/*       */   protected String videotapeRecordingSpeed;
/*       */ 
/*       */   @XmlElement(name="VoiceCommunicationSupport")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> voiceCommunicationSupport;
/*       */ 
/*       */   @XmlElement(name="VoiceCoilDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String voiceCoilDescription;
/*       */ 
/*       */   @XmlElement(name="VoicemailCapability")
/*       */   protected Boolean voicemailCapability;
/*       */ 
/*       */   @XmlElement(name="VoiceOperatedTransmission")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String voiceOperatedTransmission;
/*       */ 
/*       */   @XmlElement(name="VOIPProtocols")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> voipProtocols;
/*       */ 
/*       */   @XmlElement(name="VolumeAcousticSuspension")
/*       */   protected VolumeDimension volumeAcousticSuspension;
/*       */ 
/*       */   @XmlElement(name="Warnings")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String warnings;
/*       */ 
/*       */   @XmlElement(name="WarrantyDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String warrantyDescription;
/*       */ 
/*       */   @XmlElement(name="WaterproofRating")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String waterproofRating;
/*       */ 
/*       */   @XmlElement(name="Waypoints")
/*       */   protected BigDecimal waypoints;
/*       */ 
/*       */   @XmlElement(name="WaypointsPerRoute")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger waypointsPerRoute;
/*       */ 
/*       */   @XmlElement(name="Weatherproof")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String weatherproof;
/*       */ 
/*       */   @XmlElement(name="WriteSpeed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String writeSpeed;
/*       */ 
/*       */   public List<RebateType> getRebate()
/*       */   {
/*  2005 */     if (this.rebate == null) {
/*  2006 */       this.rebate = new ArrayList();
/*       */     }
/*  2008 */     return this.rebate;
/*       */   }
/*       */ 
/*       */   public ProductType getProductType()
/*       */   {
/*  2020 */     return this.productType;
/*       */   }
/*       */ 
/*       */   public void setProductType(ProductType value)
/*       */   {
/*  2032 */     this.productType = value;
/*       */   }
/*       */ 
/*       */   public String getProductSubtype()
/*       */   {
/*  2044 */     return this.productSubtype;
/*       */   }
/*       */ 
/*       */   public void setProductSubtype(String value)
/*       */   {
/*  2056 */     this.productSubtype = value;
/*       */   }
/*       */ 
/*       */   public List<String> getAnalogVideoFormat()
/*       */   {
/*  2082 */     if (this.analogVideoFormat == null) {
/*  2083 */       this.analogVideoFormat = new ArrayList();
/*       */     }
/*  2085 */     return this.analogVideoFormat;
/*       */   }
/*       */ 
/*       */   public EnergyConsumptionDimension getAnnualEnergyConsumption()
/*       */   {
/*  2097 */     return this.annualEnergyConsumption;
/*       */   }
/*       */ 
/*       */   public void setAnnualEnergyConsumption(EnergyConsumptionDimension value)
/*       */   {
/*  2109 */     this.annualEnergyConsumption = value;
/*       */   }
/*       */ 
/*       */   public String getAnsweringSystemType()
/*       */   {
/*  2121 */     return this.answeringSystemType;
/*       */   }
/*       */ 
/*       */   public void setAnsweringSystemType(String value)
/*       */   {
/*  2133 */     this.answeringSystemType = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getAntennaLength()
/*       */   {
/*  2145 */     return this.antennaLength;
/*       */   }
/*       */ 
/*       */   public void setAntennaLength(LengthDimension value)
/*       */   {
/*  2157 */     this.antennaLength = value;
/*       */   }
/*       */ 
/*       */   public AntennaTypeValues getAntennaType()
/*       */   {
/*  2169 */     return this.antennaType;
/*       */   }
/*       */ 
/*       */   public void setAntennaType(AntennaTypeValues value)
/*       */   {
/*  2181 */     this.antennaType = value;
/*       */   }
/*       */ 
/*       */   public String getAspectRatio()
/*       */   {
/*  2193 */     return this.aspectRatio;
/*       */   }
/*       */ 
/*       */   public void setAspectRatio(String value)
/*       */   {
/*  2205 */     this.aspectRatio = value;
/*       */   }
/*       */ 
/*       */   public String getAudioFeaturesDescription()
/*       */   {
/*  2217 */     return this.audioFeaturesDescription;
/*       */   }
/*       */ 
/*       */   public void setAudioFeaturesDescription(String value)
/*       */   {
/*  2229 */     this.audioFeaturesDescription = value;
/*       */   }
/*       */ 
/*       */   public List<String> getAudioInput()
/*       */   {
/*  2255 */     if (this.audioInput == null) {
/*  2256 */       this.audioInput = new ArrayList();
/*       */     }
/*  2258 */     return this.audioInput;
/*       */   }
/*       */ 
/*       */   public List<String> getAudioOutputEffects()
/*       */   {
/*  2284 */     if (this.audioOutputEffects == null) {
/*  2285 */       this.audioOutputEffects = new ArrayList();
/*       */     }
/*  2287 */     return this.audioOutputEffects;
/*       */   }
/*       */ 
/*       */   public List<String> getAudioOutputMode()
/*       */   {
/*  2313 */     if (this.audioOutputMode == null) {
/*  2314 */       this.audioOutputMode = new ArrayList();
/*       */     }
/*  2316 */     return this.audioOutputMode;
/*       */   }
/*       */ 
/*       */   public String getAudioOutputResponseBandwidth()
/*       */   {
/*  2328 */     return this.audioOutputResponseBandwidth;
/*       */   }
/*       */ 
/*       */   public void setAudioOutputResponseBandwidth(String value)
/*       */   {
/*  2340 */     this.audioOutputResponseBandwidth = value;
/*       */   }
/*       */ 
/*       */   public String getAudioOutputType()
/*       */   {
/*  2352 */     return this.audioOutputType;
/*       */   }
/*       */ 
/*       */   public void setAudioOutputType(String value)
/*       */   {
/*  2364 */     this.audioOutputType = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getAudioSensitivity()
/*       */   {
/*  2376 */     return this.audioSensitivity;
/*       */   }
/*       */ 
/*       */   public void setAudioSensitivity(BigInteger value)
/*       */   {
/*  2388 */     this.audioSensitivity = value;
/*       */   }
/*       */ 
/*       */   public Boolean isAutoRedial()
/*       */   {
/*  2400 */     return this.autoRedial;
/*       */   }
/*       */ 
/*       */   public void setAutoRedial(Boolean value)
/*       */   {
/*  2412 */     this.autoRedial = value;
/*       */   }
/*       */ 
/*       */   public Battery getBattery()
/*       */   {
/*  2424 */     return this.battery;
/*       */   }
/*       */ 
/*       */   public void setBattery(Battery value)
/*       */   {
/*  2436 */     this.battery = value;
/*       */   }
/*       */ 
/*       */   public TimeDimension getBatteryAverageLife()
/*       */   {
/*  2448 */     return this.batteryAverageLife;
/*       */   }
/*       */ 
/*       */   public void setBatteryAverageLife(TimeDimension value)
/*       */   {
/*  2460 */     this.batteryAverageLife = value;
/*       */   }
/*       */ 
/*       */   public TimeDimension getBatteryAverageLifeTalkTime()
/*       */   {
/*  2472 */     return this.batteryAverageLifeTalkTime;
/*       */   }
/*       */ 
/*       */   public void setBatteryAverageLifeTalkTime(TimeDimension value)
/*       */   {
/*  2484 */     this.batteryAverageLifeTalkTime = value;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getBufferSize()
/*       */   {
/*  2496 */     return this.bufferSize;
/*       */   }
/*       */ 
/*       */   public void setBufferSize(MemorySizeDimension value)
/*       */   {
/*  2508 */     this.bufferSize = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getBatteryTypeLithiumIon()
/*       */   {
/*  2520 */     return this.batteryTypeLithiumIon;
/*       */   }
/*       */ 
/*       */   public void setBatteryTypeLithiumIon(BigInteger value)
/*       */   {
/*  2532 */     this.batteryTypeLithiumIon = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getBatteryTypeLithiumMetal()
/*       */   {
/*  2544 */     return this.batteryTypeLithiumMetal;
/*       */   }
/*       */ 
/*       */   public void setBatteryTypeLithiumMetal(BigInteger value)
/*       */   {
/*  2556 */     this.batteryTypeLithiumMetal = value;
/*       */   }
/*       */ 
/*       */   public String getBiometricSecurityFeatures()
/*       */   {
/*  2568 */     return this.biometricSecurityFeatures;
/*       */   }
/*       */ 
/*       */   public void setBiometricSecurityFeatures(String value)
/*       */   {
/*  2580 */     this.biometricSecurityFeatures = value;
/*       */   }
/*       */ 
/*       */   public List<String> getBuiltInDecoders()
/*       */   {
/*  2606 */     if (this.builtInDecoders == null) {
/*  2607 */       this.builtInDecoders = new ArrayList();
/*       */     }
/*  2609 */     return this.builtInDecoders;
/*       */   }
/*       */ 
/*       */   public BigInteger getButtonQuantity()
/*       */   {
/*  2621 */     return this.buttonQuantity;
/*       */   }
/*       */ 
/*       */   public void setButtonQuantity(BigInteger value)
/*       */   {
/*  2633 */     this.buttonQuantity = value;
/*       */   }
/*       */ 
/*       */   public String getCabinetMaterial()
/*       */   {
/*  2645 */     return this.cabinetMaterial;
/*       */   }
/*       */ 
/*       */   public void setCabinetMaterial(String value)
/*       */   {
/*  2657 */     this.cabinetMaterial = value;
/*       */   }
/*       */ 
/*       */   public List<String> getCableFeature()
/*       */   {
/*  2683 */     if (this.cableFeature == null) {
/*  2684 */       this.cableFeature = new ArrayList();
/*       */     }
/*  2686 */     return this.cableFeature;
/*       */   }
/*       */ 
/*       */   public List<String> getCableTechnology()
/*       */   {
/*  2712 */     if (this.cableTechnology == null) {
/*  2713 */       this.cableTechnology = new ArrayList();
/*       */     }
/*  2715 */     return this.cableTechnology;
/*       */   }
/*       */ 
/*       */   public String getCableType()
/*       */   {
/*  2727 */     return this.cableType;
/*       */   }
/*       */ 
/*       */   public void setCableType(String value)
/*       */   {
/*  2739 */     this.cableType = value;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getCacheMemoryInstalledSize()
/*       */   {
/*  2751 */     return this.cacheMemoryInstalledSize;
/*       */   }
/*       */ 
/*       */   public void setCacheMemoryInstalledSize(MemorySizeDimension value)
/*       */   {
/*  2763 */     this.cacheMemoryInstalledSize = value;
/*       */   }
/*       */ 
/*       */   public String getCallAlerts()
/*       */   {
/*  2775 */     return this.callAlerts;
/*       */   }
/*       */ 
/*       */   public void setCallAlerts(String value)
/*       */   {
/*  2787 */     this.callAlerts = value;
/*       */   }
/*       */ 
/*       */   public Boolean isCallerIdentification()
/*       */   {
/*  2799 */     return this.callerIdentification;
/*       */   }
/*       */ 
/*       */   public void setCallerIdentification(Boolean value)
/*       */   {
/*  2811 */     this.callerIdentification = value;
/*       */   }
/*       */ 
/*       */   public List<String> getCarryingStrap()
/*       */   {
/*  2837 */     if (this.carryingStrap == null) {
/*  2838 */       this.carryingStrap = new ArrayList();
/*       */     }
/*  2840 */     return this.carryingStrap;
/*       */   }
/*       */ 
/*       */   public String getCassetteSystemType()
/*       */   {
/*  2852 */     return this.cassetteSystemType;
/*       */   }
/*       */ 
/*       */   public void setCassetteSystemType(String value)
/*       */   {
/*  2864 */     this.cassetteSystemType = value;
/*       */   }
/*       */ 
/*       */   public String getCDChangerType()
/*       */   {
/*  2876 */     return this.cdChangerType;
/*       */   }
/*       */ 
/*       */   public void setCDChangerType(String value)
/*       */   {
/*  2888 */     this.cdChangerType = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getCDDiskCapacity()
/*       */   {
/*  2900 */     return this.cdDiskCapacity;
/*       */   }
/*       */ 
/*       */   public void setCDDiskCapacity(BigInteger value)
/*       */   {
/*  2912 */     this.cdDiskCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getCDLoadType()
/*       */   {
/*  2924 */     return this.cdLoadType;
/*       */   }
/*       */ 
/*       */   public void setCDLoadType(String value)
/*       */   {
/*  2936 */     this.cdLoadType = value;
/*       */   }
/*       */ 
/*       */   public List<String> getCDPlaybackMode()
/*       */   {
/*  2962 */     if (this.cdPlaybackMode == null) {
/*  2963 */       this.cdPlaybackMode = new ArrayList();
/*       */     }
/*  2965 */     return this.cdPlaybackMode;
/*       */   }
/*       */ 
/*       */   public String getCDSystemType()
/*       */   {
/*  2977 */     return this.cdSystemType;
/*       */   }
/*       */ 
/*       */   public void setCDSystemType(String value)
/*       */   {
/*  2989 */     this.cdSystemType = value;
/*       */   }
/*       */ 
/*       */   public List<String> getCellularEnhancementProtocol()
/*       */   {
/*  3015 */     if (this.cellularEnhancementProtocol == null) {
/*  3016 */       this.cellularEnhancementProtocol = new ArrayList();
/*       */     }
/*  3018 */     return this.cellularEnhancementProtocol;
/*       */   }
/*       */ 
/*       */   public String getCoaxialDigitalInput()
/*       */   {
/*  3030 */     return this.coaxialDigitalInput;
/*       */   }
/*       */ 
/*       */   public void setCoaxialDigitalInput(String value)
/*       */   {
/*  3042 */     this.coaxialDigitalInput = value;
/*       */   }
/*       */ 
/*       */   public String getCoaxialDigitalOutput()
/*       */   {
/*  3054 */     return this.coaxialDigitalOutput;
/*       */   }
/*       */ 
/*       */   public void setCoaxialDigitalOutput(String value)
/*       */   {
/*  3066 */     this.coaxialDigitalOutput = value;
/*       */   }
/*       */ 
/*       */   public String getColor()
/*       */   {
/*  3078 */     return this.color;
/*       */   }
/*       */ 
/*       */   public void setColor(String value)
/*       */   {
/*  3090 */     this.color = value;
/*       */   }
/*       */ 
/*       */   public List<String> getColorDepth()
/*       */   {
/*  3116 */     if (this.colorDepth == null) {
/*  3117 */       this.colorDepth = new ArrayList();
/*       */     }
/*  3119 */     return this.colorDepth;
/*       */   }
/*       */ 
/*       */   public String getColorMap()
/*       */   {
/*  3131 */     return this.colorMap;
/*       */   }
/*       */ 
/*       */   public void setColorMap(String value)
/*       */   {
/*  3143 */     this.colorMap = value;
/*       */   }
/*       */ 
/*       */   public List<String> getColorSupport()
/*       */   {
/*  3169 */     if (this.colorSupport == null) {
/*  3170 */       this.colorSupport = new ArrayList();
/*       */     }
/*  3172 */     return this.colorSupport;
/*       */   }
/*       */ 
/*       */   public List<String> getCompatibleCartridge()
/*       */   {
/*  3198 */     if (this.compatibleCartridge == null) {
/*  3199 */       this.compatibleCartridge = new ArrayList();
/*       */     }
/*  3201 */     return this.compatibleCartridge;
/*       */   }
/*       */ 
/*       */   public List<String> getCompatibleDevices()
/*       */   {
/*  3227 */     if (this.compatibleDevices == null) {
/*  3228 */       this.compatibleDevices = new ArrayList();
/*       */     }
/*  3230 */     return this.compatibleDevices;
/*       */   }
/*       */ 
/*       */   public List<String> getComponentType()
/*       */   {
/*  3256 */     if (this.componentType == null) {
/*  3257 */       this.componentType = new ArrayList();
/*       */     }
/*  3259 */     return this.componentType;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getCompressedCapacity()
/*       */   {
/*  3271 */     return this.compressedCapacity;
/*       */   }
/*       */ 
/*       */   public void setCompressedCapacity(MemorySizeDimension value)
/*       */   {
/*  3283 */     this.compressedCapacity = value;
/*       */   }
/*       */ 
/*       */   public List<String> getComputerPeripheralConnector()
/*       */   {
/*  3309 */     if (this.computerPeripheralConnector == null) {
/*  3310 */       this.computerPeripheralConnector = new ArrayList();
/*       */     }
/*  3312 */     return this.computerPeripheralConnector;
/*       */   }
/*       */ 
/*       */   public String getConferenceCallCapability()
/*       */   {
/*  3324 */     return this.conferenceCallCapability;
/*       */   }
/*       */ 
/*       */   public void setConferenceCallCapability(String value)
/*       */   {
/*  3336 */     this.conferenceCallCapability = value;
/*       */   }
/*       */ 
/*       */   public List<String> getConnectivityProtocol()
/*       */   {
/*  3362 */     if (this.connectivityProtocol == null) {
/*  3363 */       this.connectivityProtocol = new ArrayList();
/*       */     }
/*  3365 */     return this.connectivityProtocol;
/*       */   }
/*       */ 
/*       */   public String getConnectivityTechnology()
/*       */   {
/*  3377 */     return this.connectivityTechnology;
/*       */   }
/*       */ 
/*       */   public void setConnectivityTechnology(String value)
/*       */   {
/*  3389 */     this.connectivityTechnology = value;
/*       */   }
/*       */ 
/*       */   public String getCopierType()
/*       */   {
/*  3401 */     return this.copierType;
/*       */   }
/*       */ 
/*       */   public void setCopierType(String value)
/*       */   {
/*  3413 */     this.copierType = value;
/*       */   }
/*       */ 
/*       */   public String getCopySizeMaximum()
/*       */   {
/*  3425 */     return this.copySizeMaximum;
/*       */   }
/*       */ 
/*       */   public void setCopySizeMaximum(String value)
/*       */   {
/*  3437 */     this.copySizeMaximum = value;
/*       */   }
/*       */ 
/*       */   public String getCountryOfOrigin()
/*       */   {
/*  3449 */     return this.countryOfOrigin;
/*       */   }
/*       */ 
/*       */   public void setCountryOfOrigin(String value)
/*       */   {
/*  3461 */     this.countryOfOrigin = value;
/*       */   }
/*       */ 
/*       */   public String getCrossoverFrequency()
/*       */   {
/*  3473 */     return this.crossoverFrequency;
/*       */   }
/*       */ 
/*       */   public void setCrossoverFrequency(String value)
/*       */   {
/*  3485 */     this.crossoverFrequency = value;
/*       */   }
/*       */ 
/*       */   public String getDACDataWidth()
/*       */   {
/*  3497 */     return this.dacDataWidth;
/*       */   }
/*       */ 
/*       */   public void setDACDataWidth(String value)
/*       */   {
/*  3509 */     this.dacDataWidth = value;
/*       */   }
/*       */ 
/*       */   public List<String> getDataCompressionProtocol()
/*       */   {
/*  3535 */     if (this.dataCompressionProtocol == null) {
/*  3536 */       this.dataCompressionProtocol = new ArrayList();
/*       */     }
/*  3538 */     return this.dataCompressionProtocol;
/*       */   }
/*       */ 
/*       */   public List<String> getDataLinkProtocol()
/*       */   {
/*  3564 */     if (this.dataLinkProtocol == null) {
/*  3565 */       this.dataLinkProtocol = new ArrayList();
/*       */     }
/*  3567 */     return this.dataLinkProtocol;
/*       */   }
/*       */ 
/*       */   public String getDataService()
/*       */   {
/*  3579 */     return this.dataService;
/*       */   }
/*       */ 
/*       */   public void setDataService(String value)
/*       */   {
/*  3591 */     this.dataService = value;
/*       */   }
/*       */ 
/*       */   public String getDataStorageCapability()
/*       */   {
/*  3603 */     return this.dataStorageCapability;
/*       */   }
/*       */ 
/*       */   public void setDataStorageCapability(String value)
/*       */   {
/*  3615 */     this.dataStorageCapability = value;
/*       */   }
/*       */ 
/*       */   public DataTransferRate getDataTransferRate()
/*       */   {
/*  3627 */     return this.dataTransferRate;
/*       */   }
/*       */ 
/*       */   public void setDataTransferRate(DataTransferRate value)
/*       */   {
/*  3639 */     this.dataTransferRate = value;
/*       */   }
/*       */ 
/*       */   public String getDeviceType()
/*       */   {
/*  3651 */     return this.deviceType;
/*       */   }
/*       */ 
/*       */   public void setDeviceType(String value)
/*       */   {
/*  3663 */     this.deviceType = value;
/*       */   }
/*       */ 
/*       */   public String getDGPS()
/*       */   {
/*  3675 */     return this.dgps;
/*       */   }
/*       */ 
/*       */   public void setDGPS(String value)
/*       */   {
/*  3687 */     this.dgps = value;
/*       */   }
/*       */ 
/*       */   public String getDialerType()
/*       */   {
/*  3699 */     return this.dialerType;
/*       */   }
/*       */ 
/*       */   public void setDialerType(String value)
/*       */   {
/*  3711 */     this.dialerType = value;
/*       */   }
/*       */ 
/*       */   public String getDigitalPlayerType()
/*       */   {
/*  3723 */     return this.digitalPlayerType;
/*       */   }
/*       */ 
/*       */   public void setDigitalPlayerType(String value)
/*       */   {
/*  3735 */     this.digitalPlayerType = value;
/*       */   }
/*       */ 
/*       */   public List<String> getDigitalRecordingTime()
/*       */   {
/*  3761 */     if (this.digitalRecordingTime == null) {
/*  3762 */       this.digitalRecordingTime = new ArrayList();
/*       */     }
/*  3764 */     return this.digitalRecordingTime;
/*       */   }
/*       */ 
/*       */   public List<String> getDigitalSignalingProtocol()
/*       */   {
/*  3790 */     if (this.digitalSignalingProtocol == null) {
/*  3791 */       this.digitalSignalingProtocol = new ArrayList();
/*       */     }
/*  3793 */     return this.digitalSignalingProtocol;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getDigitalStorageCapacity()
/*       */   {
/*  3805 */     return this.digitalStorageCapacity;
/*       */   }
/*       */ 
/*       */   public void setDigitalStorageCapacity(MemorySizeDimension value)
/*       */   {
/*  3817 */     this.digitalStorageCapacity = value;
/*       */   }
/*       */ 
/*       */   public ZoomDimension getDigitalZoom()
/*       */   {
/*  3829 */     return this.digitalZoom;
/*       */   }
/*       */ 
/*       */   public void setDigitalZoom(ZoomDimension value)
/*       */   {
/*  3841 */     this.digitalZoom = value;
/*       */   }
/*       */ 
/*       */   public List<String> getDisplayColorSupport()
/*       */   {
/*  3867 */     if (this.displayColorSupport == null) {
/*  3868 */       this.displayColorSupport = new ArrayList();
/*       */     }
/*  3870 */     return this.displayColorSupport;
/*       */   }
/*       */ 
/*       */   public String getDisplayLanguageOptions()
/*       */   {
/*  3882 */     return this.displayLanguageOptions;
/*       */   }
/*       */ 
/*       */   public void setDisplayLanguageOptions(String value)
/*       */   {
/*  3894 */     this.displayLanguageOptions = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getDisplayLineQuantity()
/*       */   {
/*  3906 */     return this.displayLineQuantity;
/*       */   }
/*       */ 
/*       */   public void setDisplayLineQuantity(BigInteger value)
/*       */   {
/*  3918 */     this.displayLineQuantity = value;
/*       */   }
/*       */ 
/*       */   public String getDisplayResolutionMaximum()
/*       */   {
/*  3930 */     return this.displayResolutionMaximum;
/*       */   }
/*       */ 
/*       */   public void setDisplayResolutionMaximum(String value)
/*       */   {
/*  3942 */     this.displayResolutionMaximum = value;
/*       */   }
/*       */ 
/*       */   public String getDisplayTechnology()
/*       */   {
/*  3954 */     return this.displayTechnology;
/*       */   }
/*       */ 
/*       */   public void setDisplayTechnology(String value)
/*       */   {
/*  3966 */     this.displayTechnology = value;
/*       */   }
/*       */ 
/*       */   public String getDisplayType()
/*       */   {
/*  3978 */     return this.displayType;
/*       */   }
/*       */ 
/*       */   public void setDisplayType(String value)
/*       */   {
/*  3990 */     this.displayType = value;
/*       */   }
/*       */ 
/*       */   public DockingStationExternalInterfaceTypeValues getDockingStationExternalInterface()
/*       */   {
/*  4002 */     return this.dockingStationExternalInterface;
/*       */   }
/*       */ 
/*       */   public void setDockingStationExternalInterface(DockingStationExternalInterfaceTypeValues value)
/*       */   {
/*  4014 */     this.dockingStationExternalInterface = value;
/*       */   }
/*       */ 
/*       */   public String getDriveUnits()
/*       */   {
/*  4026 */     return this.driveUnits;
/*       */   }
/*       */ 
/*       */   public void setDriveUnits(String value)
/*       */   {
/*  4038 */     this.driveUnits = value;
/*       */   }
/*       */ 
/*       */   public String getDuplex()
/*       */   {
/*  4050 */     return this.duplex;
/*       */   }
/*       */ 
/*       */   public void setDuplex(String value)
/*       */   {
/*  4062 */     this.duplex = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getDVDDiskCapacity()
/*       */   {
/*  4074 */     return this.dvdDiskCapacity;
/*       */   }
/*       */ 
/*       */   public void setDVDDiskCapacity(BigInteger value)
/*       */   {
/*  4086 */     this.dvdDiskCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getDVDDiskChangerType()
/*       */   {
/*  4098 */     return this.dvdDiskChangerType;
/*       */   }
/*       */ 
/*       */   public void setDVDDiskChangerType(String value)
/*       */   {
/*  4110 */     this.dvdDiskChangerType = value;
/*       */   }
/*       */ 
/*       */   public String getDVDMediaLoadType()
/*       */   {
/*  4122 */     return this.dvdMediaLoadType;
/*       */   }
/*       */ 
/*       */   public void setDVDMediaLoadType(String value)
/*       */   {
/*  4134 */     this.dvdMediaLoadType = value;
/*       */   }
/*       */ 
/*       */   public List<String> getDVDPictureZoomPower()
/*       */   {
/*  4160 */     if (this.dvdPictureZoomPower == null) {
/*  4161 */       this.dvdPictureZoomPower = new ArrayList();
/*       */     }
/*  4163 */     return this.dvdPictureZoomPower;
/*       */   }
/*       */ 
/*       */   public List<String> getDVDPlaybackMode()
/*       */   {
/*  4189 */     if (this.dvdPlaybackMode == null) {
/*  4190 */       this.dvdPlaybackMode = new ArrayList();
/*       */     }
/*  4192 */     return this.dvdPlaybackMode;
/*       */   }
/*       */ 
/*       */   public String getDVDType()
/*       */   {
/*  4204 */     return this.dvdType;
/*       */   }
/*       */ 
/*       */   public void setDVDType(String value)
/*       */   {
/*  4216 */     this.dvdType = value;
/*       */   }
/*       */ 
/*       */   public String getDVRCompressionRate()
/*       */   {
/*  4228 */     return this.dvrCompressionRate;
/*       */   }
/*       */ 
/*       */   public void setDVRCompressionRate(String value)
/*       */   {
/*  4240 */     this.dvrCompressionRate = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getDVRMaxRecordingTime()
/*       */   {
/*  4252 */     return this.dvrMaxRecordingTime;
/*       */   }
/*       */ 
/*       */   public void setDVRMaxRecordingTime(BigInteger value)
/*       */   {
/*  4264 */     this.dvrMaxRecordingTime = value;
/*       */   }
/*       */ 
/*       */   public String getDVRServiceDescription()
/*       */   {
/*  4276 */     return this.dvrServiceDescription;
/*       */   }
/*       */ 
/*       */   public void setDVRServiceDescription(String value)
/*       */   {
/*  4288 */     this.dvrServiceDescription = value;
/*       */   }
/*       */ 
/*       */   public String getEnclosure()
/*       */   {
/*  4300 */     return this.enclosure;
/*       */   }
/*       */ 
/*       */   public void setEnclosure(String value)
/*       */   {
/*  4312 */     this.enclosure = value;
/*       */   }
/*       */ 
/*       */   public String getEqualizer()
/*       */   {
/*  4324 */     return this.equalizer;
/*       */   }
/*       */ 
/*       */   public void setEqualizer(String value)
/*       */   {
/*  4336 */     this.equalizer = value;
/*       */   }
/*       */ 
/*       */   public String getEqualizerBandChannels()
/*       */   {
/*  4348 */     return this.equalizerBandChannels;
/*       */   }
/*       */ 
/*       */   public void setEqualizerBandChannels(String value)
/*       */   {
/*  4360 */     this.equalizerBandChannels = value;
/*       */   }
/*       */ 
/*       */   public List<String> getErrorCorrectionProtocol()
/*       */   {
/*  4386 */     if (this.errorCorrectionProtocol == null) {
/*  4387 */       this.errorCorrectionProtocol = new ArrayList();
/*       */     }
/*  4389 */     return this.errorCorrectionProtocol;
/*       */   }
/*       */ 
/*       */   public LengthDimension getEyeRelief()
/*       */   {
/*  4401 */     return this.eyeRelief;
/*       */   }
/*       */ 
/*       */   public void setEyeRelief(LengthDimension value)
/*       */   {
/*  4413 */     this.eyeRelief = value;
/*       */   }
/*       */ 
/*       */   public String getFaceplateType()
/*       */   {
/*  4425 */     return this.faceplateType;
/*       */   }
/*       */ 
/*       */   public void setFaceplateType(String value)
/*       */   {
/*  4437 */     this.faceplateType = value;
/*       */   }
/*       */ 
/*       */   public String getFaxMachineCompatibility()
/*       */   {
/*  4449 */     return this.faxMachineCompatibility;
/*       */   }
/*       */ 
/*       */   public void setFaxMachineCompatibility(String value)
/*       */   {
/*  4461 */     this.faxMachineCompatibility = value;
/*       */   }
/*       */ 
/*       */   public String getFaxType()
/*       */   {
/*  4473 */     return this.faxType;
/*       */   }
/*       */ 
/*       */   public void setFaxType(String value)
/*       */   {
/*  4485 */     this.faxType = value;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getFlashMemoryInstalledSize()
/*       */   {
/*  4497 */     return this.flashMemoryInstalledSize;
/*       */   }
/*       */ 
/*       */   public void setFlashMemoryInstalledSize(MemorySizeDimension value)
/*       */   {
/*  4509 */     this.flashMemoryInstalledSize = value;
/*       */   }
/*       */ 
/*       */   public String getFloppyDiskDrive()
/*       */   {
/*  4521 */     return this.floppyDiskDrive;
/*       */   }
/*       */ 
/*       */   public void setFloppyDiskDrive(String value)
/*       */   {
/*  4533 */     this.floppyDiskDrive = value;
/*       */   }
/*       */ 
/*       */   public List<String> getFormFactor()
/*       */   {
/*  4559 */     if (this.formFactor == null) {
/*  4560 */       this.formFactor = new ArrayList();
/*       */     }
/*  4562 */     return this.formFactor;
/*       */   }
/*       */ 
/*       */   public FrequencyDimension getFreeAirResonantFrequency()
/*       */   {
/*  4574 */     return this.freeAirResonantFrequency;
/*       */   }
/*       */ 
/*       */   public void setFreeAirResonantFrequency(FrequencyDimension value)
/*       */   {
/*  4586 */     this.freeAirResonantFrequency = value;
/*       */   }
/*       */ 
/*       */   public List<String> getFrequencyRange()
/*       */   {
/*  4612 */     if (this.frequencyRange == null) {
/*  4613 */       this.frequencyRange = new ArrayList();
/*       */     }
/*  4615 */     return this.frequencyRange;
/*       */   }
/*       */ 
/*       */   public String getFrequencyRequired()
/*       */   {
/*  4627 */     return this.frequencyRequired;
/*       */   }
/*       */ 
/*       */   public void setFrequencyRequired(String value)
/*       */   {
/*  4639 */     this.frequencyRequired = value;
/*       */   }
/*       */ 
/*       */   public String getFrequencyResponseCurve()
/*       */   {
/*  4651 */     return this.frequencyResponseCurve;
/*       */   }
/*       */ 
/*       */   public void setFrequencyResponseCurve(String value)
/*       */   {
/*  4663 */     this.frequencyResponseCurve = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getFrontAccessibleBaysQuantity()
/*       */   {
/*  4675 */     return this.frontAccessibleBaysQuantity;
/*       */   }
/*       */ 
/*       */   public void setFrontAccessibleBaysQuantity(BigInteger value)
/*       */   {
/*  4687 */     this.frontAccessibleBaysQuantity = value;
/*       */   }
/*       */ 
/*       */   public String getFuseDescription()
/*       */   {
/*  4699 */     return this.fuseDescription;
/*       */   }
/*       */ 
/*       */   public void setFuseDescription(String value)
/*       */   {
/*  4711 */     this.fuseDescription = value;
/*       */   }
/*       */ 
/*       */   public String getGPSNavigation()
/*       */   {
/*  4723 */     return this.gpsNavigation;
/*       */   }
/*       */ 
/*       */   public void setGPSNavigation(String value)
/*       */   {
/*  4735 */     this.gpsNavigation = value;
/*       */   }
/*       */ 
/*       */   public String getGraphicsCoprocessor()
/*       */   {
/*  4747 */     return this.graphicsCoprocessor;
/*       */   }
/*       */ 
/*       */   public void setGraphicsCoprocessor(String value)
/*       */   {
/*  4759 */     this.graphicsCoprocessor = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getGraphicsCoprocessorQuantity()
/*       */   {
/*  4771 */     return this.graphicsCoprocessorQuantity;
/*       */   }
/*       */ 
/*       */   public void setGraphicsCoprocessorQuantity(BigInteger value)
/*       */   {
/*  4783 */     this.graphicsCoprocessorQuantity = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getGraphicsRam()
/*       */   {
/*  4795 */     return this.graphicsRam;
/*       */   }
/*       */ 
/*       */   public void setGraphicsRam(BigDecimal value)
/*       */   {
/*  4807 */     this.graphicsRam = value;
/*       */   }
/*       */ 
/*       */   public List<String> getGreyscaleDepth()
/*       */   {
/*  4833 */     if (this.greyscaleDepth == null) {
/*  4834 */       this.greyscaleDepth = new ArrayList();
/*       */     }
/*  4836 */     return this.greyscaleDepth;
/*       */   }
/*       */ 
/*       */   public LengthDimension getHandsetDepth()
/*       */   {
/*  4848 */     return this.handsetDepth;
/*       */   }
/*       */ 
/*       */   public void setHandsetDepth(LengthDimension value)
/*       */   {
/*  4860 */     this.handsetDepth = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getHandsetHeight()
/*       */   {
/*  4872 */     return this.handsetHeight;
/*       */   }
/*       */ 
/*       */   public void setHandsetHeight(LengthDimension value)
/*       */   {
/*  4884 */     this.handsetHeight = value;
/*       */   }
/*       */ 
/*       */   public Boolean isHandsetLocator()
/*       */   {
/*  4896 */     return this.handsetLocator;
/*       */   }
/*       */ 
/*       */   public void setHandsetLocator(Boolean value)
/*       */   {
/*  4908 */     this.handsetLocator = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getHandsetWeight()
/*       */   {
/*  4920 */     return this.handsetWeight;
/*       */   }
/*       */ 
/*       */   public void setHandsetWeight(WeightDimension value)
/*       */   {
/*  4932 */     this.handsetWeight = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getHandsetWidth()
/*       */   {
/*  4944 */     return this.handsetWidth;
/*       */   }
/*       */ 
/*       */   public void setHandsetWidth(LengthDimension value)
/*       */   {
/*  4956 */     this.handsetWidth = value;
/*       */   }
/*       */ 
/*       */   public String getHardDiskDescription()
/*       */   {
/*  4968 */     return this.hardDiskDescription;
/*       */   }
/*       */ 
/*       */   public void setHardDiskDescription(String value)
/*       */   {
/*  4980 */     this.hardDiskDescription = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getHardDiskInstalledQuantity()
/*       */   {
/*  4992 */     return this.hardDiskInstalledQuantity;
/*       */   }
/*       */ 
/*       */   public void setHardDiskInstalledQuantity(BigInteger value)
/*       */   {
/*  5004 */     this.hardDiskInstalledQuantity = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getHardDiskRotationalSpeed()
/*       */   {
/*  5016 */     return this.hardDiskRotationalSpeed;
/*       */   }
/*       */ 
/*       */   public void setHardDiskRotationalSpeed(BigInteger value)
/*       */   {
/*  5028 */     this.hardDiskRotationalSpeed = value;
/*       */   }
/*       */ 
/*       */   public List<String> getHardwareInterface()
/*       */   {
/*  5054 */     if (this.hardwareInterface == null) {
/*  5055 */       this.hardwareInterface = new ArrayList();
/*       */     }
/*  5057 */     return this.hardwareInterface;
/*       */   }
/*       */ 
/*       */   public Boolean isHasCommercialSkip()
/*       */   {
/*  5069 */     return this.hasCommercialSkip;
/*       */   }
/*       */ 
/*       */   public void setHasCommercialSkip(Boolean value)
/*       */   {
/*  5081 */     this.hasCommercialSkip = value;
/*       */   }
/*       */ 
/*       */   public Boolean isHasDVDPictureZoom()
/*       */   {
/*  5093 */     return this.hasDVDPictureZoom;
/*       */   }
/*       */ 
/*       */   public void setHasDVDPictureZoom(Boolean value)
/*       */   {
/*  5105 */     this.hasDVDPictureZoom = value;
/*       */   }
/*       */ 
/*       */   public Boolean isHasParentalChannelLock()
/*       */   {
/*  5117 */     return this.hasParentalChannelLock;
/*       */   }
/*       */ 
/*       */   public void setHasParentalChannelLock(Boolean value)
/*       */   {
/*  5129 */     this.hasParentalChannelLock = value;
/*       */   }
/*       */ 
/*       */   public String getHeadphonesFormFactor()
/*       */   {
/*  5141 */     return this.headphonesFormFactor;
/*       */   }
/*       */ 
/*       */   public void setHeadphonesFormFactor(String value)
/*       */   {
/*  5153 */     this.headphonesFormFactor = value;
/*       */   }
/*       */ 
/*       */   public String getHeadphonesJack()
/*       */   {
/*  5165 */     return this.headphonesJack;
/*       */   }
/*       */ 
/*       */   public void setHeadphonesJack(String value)
/*       */   {
/*  5177 */     this.headphonesJack = value;
/*       */   }
/*       */ 
/*       */   public String getHeadphonesTechnology()
/*       */   {
/*  5189 */     return this.headphonesTechnology;
/*       */   }
/*       */ 
/*       */   public void setHeadphonesTechnology(String value)
/*       */   {
/*  5201 */     this.headphonesTechnology = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getHorizontalResolution()
/*       */   {
/*  5213 */     return this.horizontalResolution;
/*       */   }
/*       */ 
/*       */   public void setHorizontalResolution(BigInteger value)
/*       */   {
/*  5225 */     this.horizontalResolution = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getHotSwapBaysQuantity()
/*       */   {
/*  5237 */     return this.hotSwapBaysQuantity;
/*       */   }
/*       */ 
/*       */   public void setHotSwapBaysQuantity(BigInteger value)
/*       */   {
/*  5249 */     this.hotSwapBaysQuantity = value;
/*       */   }
/*       */ 
/*       */   public List<HumanInterfaceInputType> getHumanInterfaceInput()
/*       */   {
/*  5275 */     if (this.humanInterfaceInput == null) {
/*  5276 */       this.humanInterfaceInput = new ArrayList();
/*       */     }
/*  5278 */     return this.humanInterfaceInput;
/*       */   }
/*       */ 
/*       */   public HumanInterfaceOutputType getHumanInterfaceOutput()
/*       */   {
/*  5290 */     return this.humanInterfaceOutput;
/*       */   }
/*       */ 
/*       */   public void setHumanInterfaceOutput(HumanInterfaceOutputType value)
/*       */   {
/*  5302 */     this.humanInterfaceOutput = value;
/*       */   }
/*       */ 
/*       */   public List<String> getImageAspectRatio()
/*       */   {
/*  5328 */     if (this.imageAspectRatio == null) {
/*  5329 */       this.imageAspectRatio = new ArrayList();
/*       */     }
/*  5331 */     return this.imageAspectRatio;
/*       */   }
/*       */ 
/*       */   public String getImageBrightness()
/*       */   {
/*  5343 */     return this.imageBrightness;
/*       */   }
/*       */ 
/*       */   public void setImageBrightness(String value)
/*       */   {
/*  5355 */     this.imageBrightness = value;
/*       */   }
/*       */ 
/*       */   public String getImageContrastRatio()
/*       */   {
/*  5367 */     return this.imageContrastRatio;
/*       */   }
/*       */ 
/*       */   public void setImageContrastRatio(String value)
/*       */   {
/*  5379 */     this.imageContrastRatio = value;
/*       */   }
/*       */ 
/*       */   public ResistanceDimension getImpedance()
/*       */   {
/*  5391 */     return this.impedance;
/*       */   }
/*       */ 
/*       */   public void setImpedance(ResistanceDimension value)
/*       */   {
/*  5403 */     this.impedance = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIncludesMP3Player()
/*       */   {
/*  5415 */     return this.includesMP3Player;
/*       */   }
/*       */ 
/*       */   public void setIncludesMP3Player(Boolean value)
/*       */   {
/*  5427 */     this.includesMP3Player = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIncludesRechargableBattery()
/*       */   {
/*  5439 */     return this.includesRechargableBattery;
/*       */   }
/*       */ 
/*       */   public void setIncludesRechargableBattery(Boolean value)
/*       */   {
/*  5451 */     this.includesRechargableBattery = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIncludesRemote()
/*       */   {
/*  5463 */     return this.includesRemote;
/*       */   }
/*       */ 
/*       */   public void setIncludesRemote(Boolean value)
/*       */   {
/*  5475 */     this.includesRemote = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIncludesSpeakerphone()
/*       */   {
/*  5487 */     return this.includesSpeakerphone;
/*       */   }
/*       */ 
/*       */   public void setIncludesSpeakerphone(Boolean value)
/*       */   {
/*  5499 */     this.includesSpeakerphone = value;
/*       */   }
/*       */ 
/*       */   public List<String> getInputAdapter()
/*       */   {
/*  5525 */     if (this.inputAdapter == null) {
/*  5526 */       this.inputAdapter = new ArrayList();
/*       */     }
/*  5528 */     return this.inputAdapter;
/*       */   }
/*       */ 
/*       */   public BigInteger getInputChannelQuantity()
/*       */   {
/*  5540 */     return this.inputChannelQuantity;
/*       */   }
/*       */ 
/*       */   public void setInputChannelQuantity(BigInteger value)
/*       */   {
/*  5552 */     this.inputChannelQuantity = value;
/*       */   }
/*       */ 
/*       */   public List<Connection> getInputConnection()
/*       */   {
/*  5578 */     if (this.inputConnection == null) {
/*  5579 */       this.inputConnection = new ArrayList();
/*       */     }
/*  5581 */     return this.inputConnection;
/*       */   }
/*       */ 
/*       */   public List<String> getInputConnectorType()
/*       */   {
/*  5607 */     if (this.inputConnectorType == null) {
/*  5608 */       this.inputConnectorType = new ArrayList();
/*       */     }
/*  5610 */     return this.inputConnectorType;
/*       */   }
/*       */ 
/*       */   public List<String> getInputDevice()
/*       */   {
/*  5636 */     if (this.inputDevice == null) {
/*  5637 */       this.inputDevice = new ArrayList();
/*       */     }
/*  5639 */     return this.inputDevice;
/*       */   }
/*       */ 
/*       */   public List<String> getInputDeviceInterface()
/*       */   {
/*  5665 */     if (this.inputDeviceInterface == null) {
/*  5666 */       this.inputDeviceInterface = new ArrayList();
/*       */     }
/*  5668 */     return this.inputDeviceInterface;
/*       */   }
/*       */ 
/*       */   public Boolean isIntercom()
/*       */   {
/*  5680 */     return this.intercom;
/*       */   }
/*       */ 
/*       */   public void setIntercom(Boolean value)
/*       */   {
/*  5692 */     this.intercom = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getInternalBaysQuantity()
/*       */   {
/*  5704 */     return this.internalBaysQuantity;
/*       */   }
/*       */ 
/*       */   public void setInternalBaysQuantity(BigInteger value)
/*       */   {
/*  5716 */     this.internalBaysQuantity = value;
/*       */   }
/*       */ 
/*       */   public String getISDNTerminalAdapterInterface()
/*       */   {
/*  5728 */     return this.isdnTerminalAdapterInterface;
/*       */   }
/*       */ 
/*       */   public void setISDNTerminalAdapterInterface(String value)
/*       */   {
/*  5740 */     this.isdnTerminalAdapterInterface = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIsHDTVCompatible()
/*       */   {
/*  5752 */     return this.isHDTVCompatible;
/*       */   }
/*       */ 
/*       */   public void setIsHDTVCompatible(Boolean value)
/*       */   {
/*  5764 */     this.isHDTVCompatible = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIsWaterproof()
/*       */   {
/*  5776 */     return this.isWaterproof;
/*       */   }
/*       */ 
/*       */   public void setIsWaterproof(Boolean value)
/*       */   {
/*  5788 */     this.isWaterproof = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getItemDisplayDepth()
/*       */   {
/*  5800 */     return this.itemDisplayDepth;
/*       */   }
/*       */ 
/*       */   public void setItemDisplayDepth(LengthDimension value)
/*       */   {
/*  5812 */     this.itemDisplayDepth = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getItemDisplayHeight()
/*       */   {
/*  5824 */     return this.itemDisplayHeight;
/*       */   }
/*       */ 
/*       */   public void setItemDisplayHeight(LengthDimension value)
/*       */   {
/*  5836 */     this.itemDisplayHeight = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getItemDisplayLength()
/*       */   {
/*  5848 */     return this.itemDisplayLength;
/*       */   }
/*       */ 
/*       */   public void setItemDisplayLength(LengthDimension value)
/*       */   {
/*  5860 */     this.itemDisplayLength = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getItemDisplayLengthMaximum()
/*       */   {
/*  5872 */     return this.itemDisplayLengthMaximum;
/*       */   }
/*       */ 
/*       */   public void setItemDisplayLengthMaximum(LengthDimension value)
/*       */   {
/*  5884 */     this.itemDisplayLengthMaximum = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getItemDisplayWeight()
/*       */   {
/*  5896 */     return this.itemDisplayWeight;
/*       */   }
/*       */ 
/*       */   public void setItemDisplayWeight(WeightDimension value)
/*       */   {
/*  5908 */     this.itemDisplayWeight = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getItemDisplayWidth()
/*       */   {
/*  5920 */     return this.itemDisplayWidth;
/*       */   }
/*       */ 
/*       */   public void setItemDisplayWidth(LengthDimension value)
/*       */   {
/*  5932 */     this.itemDisplayWidth = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getLithiumBatteryEnergyContent()
/*       */   {
/*  5944 */     return this.lithiumBatteryEnergyContent;
/*       */   }
/*       */ 
/*       */   public void setLithiumBatteryEnergyContent(BigDecimal value)
/*       */   {
/*  5956 */     this.lithiumBatteryEnergyContent = value;
/*       */   }
/*       */ 
/*       */   public String getLithiumBatteryPackaging()
/*       */   {
/*  5968 */     return this.lithiumBatteryPackaging;
/*       */   }
/*       */ 
/*       */   public void setLithiumBatteryPackaging(String value)
/*       */   {
/*  5980 */     this.lithiumBatteryPackaging = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getLithiumBatteryVoltage()
/*       */   {
/*  5992 */     return this.lithiumBatteryVoltage;
/*       */   }
/*       */ 
/*       */   public void setLithiumBatteryVoltage(BigDecimal value)
/*       */   {
/*  6004 */     this.lithiumBatteryVoltage = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getLithiumBatteryWeight()
/*       */   {
/*  6016 */     return this.lithiumBatteryWeight;
/*       */   }
/*       */ 
/*       */   public void setLithiumBatteryWeight(BigDecimal value)
/*       */   {
/*  6028 */     this.lithiumBatteryWeight = value;
/*       */   }
/*       */ 
/*       */   public String getKeyboardDescription()
/*       */   {
/*  6040 */     return this.keyboardDescription;
/*       */   }
/*       */ 
/*       */   public void setKeyboardDescription(String value)
/*       */   {
/*  6052 */     this.keyboardDescription = value;
/*       */   }
/*       */ 
/*       */   public String getLampType()
/*       */   {
/*  6064 */     return this.lampType;
/*       */   }
/*       */ 
/*       */   public void setLampType(String value)
/*       */   {
/*  6076 */     this.lampType = value;
/*       */   }
/*       */ 
/*       */   public String getLeftConnectorGender()
/*       */   {
/*  6088 */     return this.leftConnectorGender;
/*       */   }
/*       */ 
/*       */   public void setLeftConnectorGender(String value)
/*       */   {
/*  6100 */     this.leftConnectorGender = value;
/*       */   }
/*       */ 
/*       */   public List<String> getLeftConnectorType()
/*       */   {
/*  6126 */     if (this.leftConnectorType == null) {
/*  6127 */       this.leftConnectorType = new ArrayList();
/*       */     }
/*  6129 */     return this.leftConnectorType;
/*       */   }
/*       */ 
/*       */   public String getManufacturerWarrantyType()
/*       */   {
/*  6141 */     return this.manufacturerWarrantyType;
/*       */   }
/*       */ 
/*       */   public void setManufacturerWarrantyType(String value)
/*       */   {
/*  6153 */     this.manufacturerWarrantyType = value;
/*       */   }
/*       */ 
/*       */   public List<String> getMapType()
/*       */   {
/*  6179 */     if (this.mapType == null) {
/*  6180 */       this.mapType = new ArrayList();
/*       */     }
/*  6182 */     return this.mapType;
/*       */   }
/*       */ 
/*       */   public List<String> getMaterialComposition()
/*       */   {
/*  6208 */     if (this.materialComposition == null) {
/*  6209 */       this.materialComposition = new ArrayList();
/*       */     }
/*  6211 */     return this.materialComposition;
/*       */   }
/*       */ 
/*       */   public List<String> getMaterialType()
/*       */   {
/*  6237 */     if (this.materialType == null) {
/*  6238 */       this.materialType = new ArrayList();
/*       */     }
/*  6240 */     return this.materialType;
/*       */   }
/*       */ 
/*       */   public String getMaxCopyResolutionBlackWhite()
/*       */   {
/*  6252 */     return this.maxCopyResolutionBlackWhite;
/*       */   }
/*       */ 
/*       */   public void setMaxCopyResolutionBlackWhite(String value)
/*       */   {
/*  6264 */     this.maxCopyResolutionBlackWhite = value;
/*       */   }
/*       */ 
/*       */   public String getMaxCopyResolutionColor()
/*       */   {
/*  6276 */     return this.maxCopyResolutionColor;
/*       */   }
/*       */ 
/*       */   public void setMaxCopyResolutionColor(String value)
/*       */   {
/*  6288 */     this.maxCopyResolutionColor = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getMaximumBridgedOutputPower()
/*       */   {
/*  6300 */     return this.maximumBridgedOutputPower;
/*       */   }
/*       */ 
/*       */   public void setMaximumBridgedOutputPower(BigInteger value)
/*       */   {
/*  6312 */     this.maximumBridgedOutputPower = value;
/*       */   }
/*       */ 
/*       */   public String getMaximumExternalResolution()
/*       */   {
/*  6324 */     return this.maximumExternalResolution;
/*       */   }
/*       */ 
/*       */   public void setMaximumExternalResolution(String value)
/*       */   {
/*  6336 */     this.maximumExternalResolution = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMaximumImageSize()
/*       */   {
/*  6348 */     return this.maximumImageSize;
/*       */   }
/*       */ 
/*       */   public void setMaximumImageSize(LengthDimension value)
/*       */   {
/*  6360 */     this.maximumImageSize = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMaximumLinearPeakExcursion()
/*       */   {
/*  6372 */     return this.maximumLinearPeakExcursion;
/*       */   }
/*       */ 
/*       */   public void setMaximumLinearPeakExcursion(LengthDimension value)
/*       */   {
/*  6384 */     this.maximumLinearPeakExcursion = value;
/*       */   }
/*       */ 
/*       */   public String getMaximumOutputPower()
/*       */   {
/*  6396 */     return this.maximumOutputPower;
/*       */   }
/*       */ 
/*       */   public void setMaximumOutputPower(String value)
/*       */   {
/*  6408 */     this.maximumOutputPower = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMaximumRange()
/*       */   {
/*  6420 */     return this.maximumRange;
/*       */   }
/*       */ 
/*       */   public void setMaximumRange(LengthDimension value)
/*       */   {
/*  6432 */     this.maximumRange = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMaximumRangeIndoors()
/*       */   {
/*  6444 */     return this.maximumRangeIndoors;
/*       */   }
/*       */ 
/*       */   public void setMaximumRangeIndoors(LengthDimension value)
/*       */   {
/*  6456 */     this.maximumRangeIndoors = value;
/*       */   }
/*       */ 
/*       */   public FrequencyDimension getMaximumSampleRate()
/*       */   {
/*  6468 */     return this.maximumSampleRate;
/*       */   }
/*       */ 
/*       */   public void setMaximumSampleRate(FrequencyDimension value)
/*       */   {
/*  6480 */     this.maximumSampleRate = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMaximumScreenDistance()
/*       */   {
/*  6492 */     return this.maximumScreenDistance;
/*       */   }
/*       */ 
/*       */   public void setMaximumScreenDistance(LengthDimension value)
/*       */   {
/*  6504 */     this.maximumScreenDistance = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getMaxInputSheetCapacity()
/*       */   {
/*  6516 */     return this.maxInputSheetCapacity;
/*       */   }
/*       */ 
/*       */   public void setMaxInputSheetCapacity(BigInteger value)
/*       */   {
/*  6528 */     this.maxInputSheetCapacity = value;
/*       */   }
/*       */ 
/*       */   public List<String> getMaxPrintResolutionBlackWhite()
/*       */   {
/*  6554 */     if (this.maxPrintResolutionBlackWhite == null) {
/*  6555 */       this.maxPrintResolutionBlackWhite = new ArrayList();
/*       */     }
/*  6557 */     return this.maxPrintResolutionBlackWhite;
/*       */   }
/*       */ 
/*       */   public List<String> getMaxPrintResolutionColor()
/*       */   {
/*  6583 */     if (this.maxPrintResolutionColor == null) {
/*  6584 */       this.maxPrintResolutionColor = new ArrayList();
/*       */     }
/*  6586 */     return this.maxPrintResolutionColor;
/*       */   }
/*       */ 
/*       */   public String getMediaFormat()
/*       */   {
/*  6598 */     return this.mediaFormat;
/*       */   }
/*       */ 
/*       */   public void setMediaFormat(String value)
/*       */   {
/*  6610 */     this.mediaFormat = value;
/*       */   }
/*       */ 
/*       */   public String getMediaLoadType()
/*       */   {
/*  6622 */     return this.mediaLoadType;
/*       */   }
/*       */ 
/*       */   public void setMediaLoadType(String value)
/*       */   {
/*  6634 */     this.mediaLoadType = value;
/*       */   }
/*       */ 
/*       */   public List<String> getMediaSizeMaximum()
/*       */   {
/*  6660 */     if (this.mediaSizeMaximum == null) {
/*  6661 */       this.mediaSizeMaximum = new ArrayList();
/*       */     }
/*  6663 */     return this.mediaSizeMaximum;
/*       */   }
/*       */ 
/*       */   public List<String> getMediaType()
/*       */   {
/*  6689 */     if (this.mediaType == null) {
/*  6690 */       this.mediaType = new ArrayList();
/*       */     }
/*  6692 */     return this.mediaType;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getMemoryStorageCapacity()
/*       */   {
/*  6704 */     return this.memoryStorageCapacity;
/*       */   }
/*       */ 
/*       */   public void setMemoryStorageCapacity(MemorySizeDimension value)
/*       */   {
/*  6716 */     this.memoryStorageCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getMemoryTechnology()
/*       */   {
/*  6728 */     return this.memoryTechnology;
/*       */   }
/*       */ 
/*       */   public void setMemoryTechnology(String value)
/*       */   {
/*  6740 */     this.memoryTechnology = value;
/*       */   }
/*       */ 
/*       */   public String getMfgWarrantyDescriptionLabor()
/*       */   {
/*  6752 */     return this.mfgWarrantyDescriptionLabor;
/*       */   }
/*       */ 
/*       */   public void setMfgWarrantyDescriptionLabor(String value)
/*       */   {
/*  6764 */     this.mfgWarrantyDescriptionLabor = value;
/*       */   }
/*       */ 
/*       */   public String getMfgWarrantyDescriptionParts()
/*       */   {
/*  6776 */     return this.mfgWarrantyDescriptionParts;
/*       */   }
/*       */ 
/*       */   public void setMfgWarrantyDescriptionParts(String value)
/*       */   {
/*  6788 */     this.mfgWarrantyDescriptionParts = value;
/*       */   }
/*       */ 
/*       */   public String getMicrophoneFormFactor()
/*       */   {
/*  6800 */     return this.microphoneFormFactor;
/*       */   }
/*       */ 
/*       */   public void setMicrophoneFormFactor(String value)
/*       */   {
/*  6812 */     this.microphoneFormFactor = value;
/*       */   }
/*       */ 
/*       */   public List<String> getMicrophoneOperationMode()
/*       */   {
/*  6838 */     if (this.microphoneOperationMode == null) {
/*  6839 */       this.microphoneOperationMode = new ArrayList();
/*       */     }
/*  6841 */     return this.microphoneOperationMode;
/*       */   }
/*       */ 
/*       */   public String getMicrophoneTechnology()
/*       */   {
/*  6853 */     return this.microphoneTechnology;
/*       */   }
/*       */ 
/*       */   public void setMicrophoneTechnology(String value)
/*       */   {
/*  6865 */     this.microphoneTechnology = value;
/*       */   }
/*       */ 
/*       */   public String getMiniDiscSystem()
/*       */   {
/*  6877 */     return this.miniDiscSystem;
/*       */   }
/*       */ 
/*       */   public void setMiniDiscSystem(String value)
/*       */   {
/*  6889 */     this.miniDiscSystem = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMinimumImageSize()
/*       */   {
/*  6901 */     return this.minimumImageSize;
/*       */   }
/*       */ 
/*       */   public void setMinimumImageSize(LengthDimension value)
/*       */   {
/*  6913 */     this.minimumImageSize = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMinimumScreenDistance()
/*       */   {
/*  6925 */     return this.minimumScreenDistance;
/*       */   }
/*       */ 
/*       */   public void setMinimumScreenDistance(LengthDimension value)
/*       */   {
/*  6937 */     this.minimumScreenDistance = value;
/*       */   }
/*       */ 
/*       */   public String getMinimumSystemRequirementDescription()
/*       */   {
/*  6949 */     return this.minimumSystemRequirementDescription;
/*       */   }
/*       */ 
/*       */   public void setMinimumSystemRequirementDescription(String value)
/*       */   {
/*  6961 */     this.minimumSystemRequirementDescription = value;
/*       */   }
/*       */ 
/*       */   public String getModel()
/*       */   {
/*  6973 */     return this.model;
/*       */   }
/*       */ 
/*       */   public void setModel(String value)
/*       */   {
/*  6985 */     this.model = value;
/*       */   }
/*       */ 
/*       */   public String getModelName()
/*       */   {
/*  6997 */     return this.modelName;
/*       */   }
/*       */ 
/*       */   public void setModelName(String value)
/*       */   {
/*  7009 */     this.modelName = value;
/*       */   }
/*       */ 
/*       */   public String getModemDescription()
/*       */   {
/*  7021 */     return this.modemDescription;
/*       */   }
/*       */ 
/*       */   public void setModemDescription(String value)
/*       */   {
/*  7033 */     this.modemDescription = value;
/*       */   }
/*       */ 
/*       */   public String getModemInterface()
/*       */   {
/*  7045 */     return this.modemInterface;
/*       */   }
/*       */ 
/*       */   public void setModemInterface(String value)
/*       */   {
/*  7057 */     this.modemInterface = value;
/*       */   }
/*       */ 
/*       */   public ModemTypeValues getModemType()
/*       */   {
/*  7069 */     return this.modemType;
/*       */   }
/*       */ 
/*       */   public void setModemType(ModemTypeValues value)
/*       */   {
/*  7081 */     this.modemType = value;
/*       */   }
/*       */ 
/*       */   public String getMonthlyDutyCycle()
/*       */   {
/*  7093 */     return this.monthlyDutyCycle;
/*       */   }
/*       */ 
/*       */   public void setMonthlyDutyCycle(String value)
/*       */   {
/*  7105 */     this.monthlyDutyCycle = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMountingHoleDiameter()
/*       */   {
/*  7117 */     return this.mountingHoleDiameter;
/*       */   }
/*       */ 
/*       */   public void setMountingHoleDiameter(LengthDimension value)
/*       */   {
/*  7129 */     this.mountingHoleDiameter = value;
/*       */   }
/*       */ 
/*       */   public String getMovementDetectionTechnology()
/*       */   {
/*  7141 */     return this.movementDetectionTechnology;
/*       */   }
/*       */ 
/*       */   public void setMovementDetectionTechnology(String value)
/*       */   {
/*  7153 */     this.movementDetectionTechnology = value;
/*       */   }
/*       */ 
/*       */   public List<String> getMultilineOperation()
/*       */   {
/*  7179 */     if (this.multilineOperation == null) {
/*  7180 */       this.multilineOperation = new ArrayList();
/*       */     }
/*  7182 */     return this.multilineOperation;
/*       */   }
/*       */ 
/*       */   public List<String> getMultimediaFunctionality()
/*       */   {
/*  7208 */     if (this.multimediaFunctionality == null) {
/*  7209 */       this.multimediaFunctionality = new ArrayList();
/*       */     }
/*  7211 */     return this.multimediaFunctionality;
/*       */   }
/*       */ 
/*       */   public BigInteger getNavigationRoutes()
/*       */   {
/*  7223 */     return this.navigationRoutes;
/*       */   }
/*       */ 
/*       */   public void setNavigationRoutes(BigInteger value)
/*       */   {
/*  7235 */     this.navigationRoutes = value;
/*       */   }
/*       */ 
/*       */   public List<String> getNetworkingFeature()
/*       */   {
/*  7261 */     if (this.networkingFeature == null) {
/*  7262 */       this.networkingFeature = new ArrayList();
/*       */     }
/*  7264 */     return this.networkingFeature;
/*       */   }
/*       */ 
/*       */   public String getNetworkInterfaceDescription()
/*       */   {
/*  7276 */     return this.networkInterfaceDescription;
/*       */   }
/*       */ 
/*       */   public void setNetworkInterfaceDescription(String value)
/*       */   {
/*  7288 */     this.networkInterfaceDescription = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfLithiumIonCells()
/*       */   {
/*  7300 */     return this.numberOfLithiumIonCells;
/*       */   }
/*       */ 
/*       */   public void setNumberOfLithiumIonCells(BigInteger value)
/*       */   {
/*  7312 */     this.numberOfLithiumIonCells = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfLithiumMetalCells()
/*       */   {
/*  7324 */     return this.numberOfLithiumMetalCells;
/*       */   }
/*       */ 
/*       */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*       */   {
/*  7336 */     this.numberOfLithiumMetalCells = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfPorts()
/*       */   {
/*  7348 */     return this.numberOfPorts;
/*       */   }
/*       */ 
/*       */   public void setNumberOfPorts(BigInteger value)
/*       */   {
/*  7360 */     this.numberOfPorts = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfSupportedZones()
/*       */   {
/*  7372 */     return this.numberOfSupportedZones;
/*       */   }
/*       */ 
/*       */   public void setNumberOfSupportedZones(BigInteger value)
/*       */   {
/*  7384 */     this.numberOfSupportedZones = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getObjectiveLensDiameter()
/*       */   {
/*  7396 */     return this.objectiveLensDiameter;
/*       */   }
/*       */ 
/*       */   public void setObjectiveLensDiameter(LengthDimension value)
/*       */   {
/*  7408 */     this.objectiveLensDiameter = value;
/*       */   }
/*       */ 
/*       */   public String getOperatingHumidity()
/*       */   {
/*  7420 */     return this.operatingHumidity;
/*       */   }
/*       */ 
/*       */   public void setOperatingHumidity(String value)
/*       */   {
/*  7432 */     this.operatingHumidity = value;
/*       */   }
/*       */ 
/*       */   public String getOpticalDigitalInput()
/*       */   {
/*  7444 */     return this.opticalDigitalInput;
/*       */   }
/*       */ 
/*       */   public void setOpticalDigitalInput(String value)
/*       */   {
/*  7456 */     this.opticalDigitalInput = value;
/*       */   }
/*       */ 
/*       */   public String getOpticalDigitalOutput()
/*       */   {
/*  7468 */     return this.opticalDigitalOutput;
/*       */   }
/*       */ 
/*       */   public void setOpticalDigitalOutput(String value)
/*       */   {
/*  7480 */     this.opticalDigitalOutput = value;
/*       */   }
/*       */ 
/*       */   public PixelDimension getOpticalSensorInterpolatedResolution()
/*       */   {
/*  7492 */     return this.opticalSensorInterpolatedResolution;
/*       */   }
/*       */ 
/*       */   public void setOpticalSensorInterpolatedResolution(PixelDimension value)
/*       */   {
/*  7504 */     this.opticalSensorInterpolatedResolution = value;
/*       */   }
/*       */ 
/*       */   public PixelDimension getOpticalSensorResolution()
/*       */   {
/*  7516 */     return this.opticalSensorResolution;
/*       */   }
/*       */ 
/*       */   public void setOpticalSensorResolution(PixelDimension value)
/*       */   {
/*  7528 */     this.opticalSensorResolution = value;
/*       */   }
/*       */ 
/*       */   public List<String> getOpticalStorageDevice()
/*       */   {
/*  7554 */     if (this.opticalStorageDevice == null) {
/*  7555 */       this.opticalStorageDevice = new ArrayList();
/*       */     }
/*  7557 */     return this.opticalStorageDevice;
/*       */   }
/*       */ 
/*       */   public BigInteger getOpticalStorageInstalledQuantity()
/*       */   {
/*  7569 */     return this.opticalStorageInstalledQuantity;
/*       */   }
/*       */ 
/*       */   public void setOpticalStorageInstalledQuantity(BigInteger value)
/*       */   {
/*  7581 */     this.opticalStorageInstalledQuantity = value;
/*       */   }
/*       */ 
/*       */   public String getOpticalStorageReadSpeed()
/*       */   {
/*  7593 */     return this.opticalStorageReadSpeed;
/*       */   }
/*       */ 
/*       */   public void setOpticalStorageReadSpeed(String value)
/*       */   {
/*  7605 */     this.opticalStorageReadSpeed = value;
/*       */   }
/*       */ 
/*       */   public String getOpticalStorageRewriteSpeed()
/*       */   {
/*  7617 */     return this.opticalStorageRewriteSpeed;
/*       */   }
/*       */ 
/*       */   public void setOpticalStorageRewriteSpeed(String value)
/*       */   {
/*  7629 */     this.opticalStorageRewriteSpeed = value;
/*       */   }
/*       */ 
/*       */   public String getOpticalStorageSecondaryReadSpeed()
/*       */   {
/*  7641 */     return this.opticalStorageSecondaryReadSpeed;
/*       */   }
/*       */ 
/*       */   public void setOpticalStorageSecondaryReadSpeed(String value)
/*       */   {
/*  7653 */     this.opticalStorageSecondaryReadSpeed = value;
/*       */   }
/*       */ 
/*       */   public String getOpticalStorageSecondaryRewriteSpeed()
/*       */   {
/*  7665 */     return this.opticalStorageSecondaryRewriteSpeed;
/*       */   }
/*       */ 
/*       */   public void setOpticalStorageSecondaryRewriteSpeed(String value)
/*       */   {
/*  7677 */     this.opticalStorageSecondaryRewriteSpeed = value;
/*       */   }
/*       */ 
/*       */   public List<String> getOpticalStorageSecondaryType()
/*       */   {
/*  7703 */     if (this.opticalStorageSecondaryType == null) {
/*  7704 */       this.opticalStorageSecondaryType = new ArrayList();
/*       */     }
/*  7706 */     return this.opticalStorageSecondaryType;
/*       */   }
/*       */ 
/*       */   public String getOpticalStorageSecondaryWriteSpeed()
/*       */   {
/*  7718 */     return this.opticalStorageSecondaryWriteSpeed;
/*       */   }
/*       */ 
/*       */   public void setOpticalStorageSecondaryWriteSpeed(String value)
/*       */   {
/*  7730 */     this.opticalStorageSecondaryWriteSpeed = value;
/*       */   }
/*       */ 
/*       */   public String getOpticalStorageWriteSpeed()
/*       */   {
/*  7742 */     return this.opticalStorageWriteSpeed;
/*       */   }
/*       */ 
/*       */   public void setOpticalStorageWriteSpeed(String value)
/*       */   {
/*  7754 */     this.opticalStorageWriteSpeed = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getOutputChannelQuantity()
/*       */   {
/*  7766 */     return this.outputChannelQuantity;
/*       */   }
/*       */ 
/*       */   public void setOutputChannelQuantity(BigInteger value)
/*       */   {
/*  7778 */     this.outputChannelQuantity = value;
/*       */   }
/*       */ 
/*       */   public List<Connection> getOutputConnection()
/*       */   {
/*  7804 */     if (this.outputConnection == null) {
/*  7805 */       this.outputConnection = new ArrayList();
/*       */     }
/*  7807 */     return this.outputConnection;
/*       */   }
/*       */ 
/*       */   public BigInteger getOutputConnectorQuantity()
/*       */   {
/*  7819 */     return this.outputConnectorQuantity;
/*       */   }
/*       */ 
/*       */   public void setOutputConnectorQuantity(BigInteger value)
/*       */   {
/*  7831 */     this.outputConnectorQuantity = value;
/*       */   }
/*       */ 
/*       */   public List<String> getOutputConnectorType()
/*       */   {
/*  7857 */     if (this.outputConnectorType == null) {
/*  7858 */       this.outputConnectorType = new ArrayList();
/*       */     }
/*  7860 */     return this.outputConnectorType;
/*       */   }
/*       */ 
/*       */   public BigInteger getOutputPower()
/*       */   {
/*  7872 */     return this.outputPower;
/*       */   }
/*       */ 
/*       */   public void setOutputPower(BigInteger value)
/*       */   {
/*  7884 */     this.outputPower = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getOutputWattage()
/*       */   {
/*  7896 */     return this.outputWattage;
/*       */   }
/*       */ 
/*       */   public void setOutputWattage(BigInteger value)
/*       */   {
/*  7908 */     this.outputWattage = value;
/*       */   }
/*       */ 
/*       */   public String getPackageContentType()
/*       */   {
/*  7920 */     return this.packageContentType;
/*       */   }
/*       */ 
/*       */   public void setPackageContentType(String value)
/*       */   {
/*  7932 */     this.packageContentType = value;
/*       */   }
/*       */ 
/*       */   public String getPackageTypeName()
/*       */   {
/*  7944 */     return this.packageTypeName;
/*       */   }
/*       */ 
/*       */   public void setPackageTypeName(String value)
/*       */   {
/*  7956 */     this.packageTypeName = value;
/*       */   }
/*       */ 
/*       */   public String getPCConnectionAvailable()
/*       */   {
/*  7968 */     return this.pcConnectionAvailable;
/*       */   }
/*       */ 
/*       */   public void setPCConnectionAvailable(String value)
/*       */   {
/*  7980 */     this.pcConnectionAvailable = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getPhoneBaseDepth()
/*       */   {
/*  7992 */     return this.phoneBaseDepth;
/*       */   }
/*       */ 
/*       */   public void setPhoneBaseDepth(LengthDimension value)
/*       */   {
/*  8004 */     this.phoneBaseDepth = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getPhoneBaseHeight()
/*       */   {
/*  8016 */     return this.phoneBaseHeight;
/*       */   }
/*       */ 
/*       */   public void setPhoneBaseHeight(LengthDimension value)
/*       */   {
/*  8028 */     this.phoneBaseHeight = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getPhoneBaseWeight()
/*       */   {
/*  8040 */     return this.phoneBaseWeight;
/*       */   }
/*       */ 
/*       */   public void setPhoneBaseWeight(WeightDimension value)
/*       */   {
/*  8052 */     this.phoneBaseWeight = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getPhoneBaseWidth()
/*       */   {
/*  8064 */     return this.phoneBaseWidth;
/*       */   }
/*       */ 
/*       */   public void setPhoneBaseWidth(LengthDimension value)
/*       */   {
/*  8076 */     this.phoneBaseWidth = value;
/*       */   }
/*       */ 
/*       */   public PortedBoxVolume getPortedBoxVolume()
/*       */   {
/*  8088 */     return this.portedBoxVolume;
/*       */   }
/*       */ 
/*       */   public void setPortedBoxVolume(PortedBoxVolume value)
/*       */   {
/*  8100 */     this.portedBoxVolume = value;
/*       */   }
/*       */ 
/*       */   public String getPowerAmplifierClass()
/*       */   {
/*  8112 */     return this.powerAmplifierClass;
/*       */   }
/*       */ 
/*       */   public void setPowerAmplifierClass(String value)
/*       */   {
/*  8124 */     this.powerAmplifierClass = value;
/*       */   }
/*       */ 
/*       */   public String getPowerDevice()
/*       */   {
/*  8136 */     return this.powerDevice;
/*       */   }
/*       */ 
/*       */   public void setPowerDevice(String value)
/*       */   {
/*  8148 */     this.powerDevice = value;
/*       */   }
/*       */ 
/*       */   public VoltageIntegerDimension getPowerGain()
/*       */   {
/*  8160 */     return this.powerGain;
/*       */   }
/*       */ 
/*       */   public void setPowerGain(VoltageIntegerDimension value)
/*       */   {
/*  8172 */     this.powerGain = value;
/*       */   }
/*       */ 
/*       */   public String getPowerLoadRating()
/*       */   {
/*  8184 */     return this.powerLoadRating;
/*       */   }
/*       */ 
/*       */   public void setPowerLoadRating(String value)
/*       */   {
/*  8196 */     this.powerLoadRating = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getPreampOutputChannels()
/*       */   {
/*  8208 */     return this.preampOutputChannels;
/*       */   }
/*       */ 
/*       */   public void setPreampOutputChannels(BigInteger value)
/*       */   {
/*  8220 */     this.preampOutputChannels = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getPresetChannelQuantity()
/*       */   {
/*  8232 */     return this.presetChannelQuantity;
/*       */   }
/*       */ 
/*       */   public void setPresetChannelQuantity(BigInteger value)
/*       */   {
/*  8244 */     this.presetChannelQuantity = value;
/*       */   }
/*       */ 
/*       */   public String getPrinterInterface()
/*       */   {
/*  8256 */     return this.printerInterface;
/*       */   }
/*       */ 
/*       */   public void setPrinterInterface(String value)
/*       */   {
/*  8268 */     this.printerInterface = value;
/*       */   }
/*       */ 
/*       */   public String getPrinterOutput()
/*       */   {
/*  8280 */     return this.printerOutput;
/*       */   }
/*       */ 
/*       */   public void setPrinterOutput(String value)
/*       */   {
/*  8292 */     this.printerOutput = value;
/*       */   }
/*       */ 
/*       */   public PixelDimension getPrinterResolutionBWHorizontalMax()
/*       */   {
/*  8304 */     return this.printerResolutionBWHorizontalMax;
/*       */   }
/*       */ 
/*       */   public void setPrinterResolutionBWHorizontalMax(PixelDimension value)
/*       */   {
/*  8316 */     this.printerResolutionBWHorizontalMax = value;
/*       */   }
/*       */ 
/*       */   public PixelDimension getPrinterResolutionBWVerticalMax()
/*       */   {
/*  8328 */     return this.printerResolutionBWVerticalMax;
/*       */   }
/*       */ 
/*       */   public void setPrinterResolutionBWVerticalMax(PixelDimension value)
/*       */   {
/*  8340 */     this.printerResolutionBWVerticalMax = value;
/*       */   }
/*       */ 
/*       */   public PixelDimension getPrinterResolutionColorHorizontalMax()
/*       */   {
/*  8352 */     return this.printerResolutionColorHorizontalMax;
/*       */   }
/*       */ 
/*       */   public void setPrinterResolutionColorHorizontalMax(PixelDimension value)
/*       */   {
/*  8364 */     this.printerResolutionColorHorizontalMax = value;
/*       */   }
/*       */ 
/*       */   public PixelDimension getPrinterResolutionColorVerticalMax()
/*       */   {
/*  8376 */     return this.printerResolutionColorVerticalMax;
/*       */   }
/*       */ 
/*       */   public void setPrinterResolutionColorVerticalMax(PixelDimension value)
/*       */   {
/*  8388 */     this.printerResolutionColorVerticalMax = value;
/*       */   }
/*       */ 
/*       */   public String getPrinterTechnology()
/*       */   {
/*  8400 */     return this.printerTechnology;
/*       */   }
/*       */ 
/*       */   public void setPrinterTechnology(String value)
/*       */   {
/*  8412 */     this.printerTechnology = value;
/*       */   }
/*       */ 
/*       */   public String getProcessorDescription()
/*       */   {
/*  8424 */     return this.processorDescription;
/*       */   }
/*       */ 
/*       */   public void setProcessorDescription(String value)
/*       */   {
/*  8436 */     this.processorDescription = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getProcessorMaximum()
/*       */   {
/*  8448 */     return this.processorMaximum;
/*       */   }
/*       */ 
/*       */   public void setProcessorMaximum(BigInteger value)
/*       */   {
/*  8460 */     this.processorMaximum = value;
/*       */   }
/*       */ 
/*       */   public String getProcessorModelNumber()
/*       */   {
/*  8472 */     return this.processorModelNumber;
/*       */   }
/*       */ 
/*       */   public void setProcessorModelNumber(String value)
/*       */   {
/*  8484 */     this.processorModelNumber = value;
/*       */   }
/*       */ 
/*       */   public String getProcessorUpgrade()
/*       */   {
/*  8496 */     return this.processorUpgrade;
/*       */   }
/*       */ 
/*       */   public void setProcessorUpgrade(String value)
/*       */   {
/*  8508 */     this.processorUpgrade = value;
/*       */   }
/*       */ 
/*       */   public List<String> getProgrammability()
/*       */   {
/*  8534 */     if (this.programmability == null) {
/*  8535 */       this.programmability = new ArrayList();
/*       */     }
/*  8537 */     return this.programmability;
/*       */   }
/*       */ 
/*       */   public BigDecimal getQtsTotalQFactor()
/*       */   {
/*  8549 */     return this.qtsTotalQFactor;
/*       */   }
/*       */ 
/*       */   public void setQtsTotalQFactor(BigDecimal value)
/*       */   {
/*  8561 */     this.qtsTotalQFactor = value;
/*       */   }
/*       */ 
/*       */   public String getRadioBandsSupported()
/*       */   {
/*  8573 */     return this.radioBandsSupported;
/*       */   }
/*       */ 
/*       */   public void setRadioBandsSupported(String value)
/*       */   {
/*  8585 */     this.radioBandsSupported = value;
/*       */   }
/*       */ 
/*       */   public String getRadioChannels()
/*       */   {
/*  8597 */     return this.radioChannels;
/*       */   }
/*       */ 
/*       */   public void setRadioChannels(String value)
/*       */   {
/*  8609 */     this.radioChannels = value;
/*       */   }
/*       */ 
/*       */   public List<String> getRAIDLevel()
/*       */   {
/*  8635 */     if (this.raidLevel == null) {
/*  8636 */       this.raidLevel = new ArrayList();
/*       */     }
/*  8638 */     return this.raidLevel;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getRAMMemoryInstalledSize()
/*       */   {
/*  8650 */     return this.ramMemoryInstalledSize;
/*       */   }
/*       */ 
/*       */   public void setRAMMemoryInstalledSize(MemorySizeDimension value)
/*       */   {
/*  8662 */     this.ramMemoryInstalledSize = value;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getRAMMemoryMaximumSize()
/*       */   {
/*  8674 */     return this.ramMemoryMaximumSize;
/*       */   }
/*       */ 
/*       */   public void setRAMMemoryMaximumSize(MemorySizeDimension value)
/*       */   {
/*  8686 */     this.ramMemoryMaximumSize = value;
/*       */   }
/*       */ 
/*       */   public String getRAMMemoryTechnology()
/*       */   {
/*  8698 */     return this.ramMemoryTechnology;
/*       */   }
/*       */ 
/*       */   public void setRAMMemoryTechnology(String value)
/*       */   {
/*  8710 */     this.ramMemoryTechnology = value;
/*       */   }
/*       */ 
/*       */   public String getRangefinderType()
/*       */   {
/*  8722 */     return this.rangefinderType;
/*       */   }
/*       */ 
/*       */   public void setRangefinderType(String value)
/*       */   {
/*  8734 */     this.rangefinderType = value;
/*       */   }
/*       */ 
/*       */   public String getReceiverDescription()
/*       */   {
/*  8746 */     return this.receiverDescription;
/*       */   }
/*       */ 
/*       */   public void setReceiverDescription(String value)
/*       */   {
/*  8758 */     this.receiverDescription = value;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getRecordingCapacity()
/*       */   {
/*  8770 */     return this.recordingCapacity;
/*       */   }
/*       */ 
/*       */   public void setRecordingCapacity(MemorySizeDimension value)
/*       */   {
/*  8782 */     this.recordingCapacity = value;
/*       */   }
/*       */ 
/*       */   public List<String> getRemoteControlAudioControls()
/*       */   {
/*  8808 */     if (this.remoteControlAudioControls == null) {
/*  8809 */       this.remoteControlAudioControls = new ArrayList();
/*       */     }
/*  8811 */     return this.remoteControlAudioControls;
/*       */   }
/*       */ 
/*       */   public String getRemoteControlDescription()
/*       */   {
/*  8823 */     return this.remoteControlDescription;
/*       */   }
/*       */ 
/*       */   public void setRemoteControlDescription(String value)
/*       */   {
/*  8835 */     this.remoteControlDescription = value;
/*       */   }
/*       */ 
/*       */   public String getRemoteControlTechnology()
/*       */   {
/*  8847 */     return this.remoteControlTechnology;
/*       */   }
/*       */ 
/*       */   public void setRemoteControlTechnology(String value)
/*       */   {
/*  8859 */     this.remoteControlTechnology = value;
/*       */   }
/*       */ 
/*       */   public List<String> getRemoteManagementProtocol()
/*       */   {
/*  8885 */     if (this.remoteManagementProtocol == null) {
/*  8886 */       this.remoteManagementProtocol = new ArrayList();
/*       */     }
/*  8888 */     return this.remoteManagementProtocol;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getRemovableMediaCapacity()
/*       */   {
/*  8900 */     return this.removableMediaCapacity;
/*       */   }
/*       */ 
/*       */   public void setRemovableMediaCapacity(MemorySizeDimension value)
/*       */   {
/*  8912 */     this.removableMediaCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getRemovableMemory()
/*       */   {
/*  8924 */     return this.removableMemory;
/*       */   }
/*       */ 
/*       */   public void setRemovableMemory(String value)
/*       */   {
/*  8936 */     this.removableMemory = value;
/*       */   }
/*       */ 
/*       */   public String getRemovableStorage()
/*       */   {
/*  8948 */     return this.removableStorage;
/*       */   }
/*       */ 
/*       */   public void setRemovableStorage(String value)
/*       */   {
/*  8960 */     this.removableStorage = value;
/*       */   }
/*       */ 
/*       */   public String getRemovableStorageInterface()
/*       */   {
/*  8972 */     return this.removableStorageInterface;
/*       */   }
/*       */ 
/*       */   public void setRemovableStorageInterface(String value)
/*       */   {
/*  8984 */     this.removableStorageInterface = value;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getRemovableStorageNativeCapacity()
/*       */   {
/*  8996 */     return this.removableStorageNativeCapacity;
/*       */   }
/*       */ 
/*       */   public void setRemovableStorageNativeCapacity(MemorySizeDimension value)
/*       */   {
/*  9008 */     this.removableStorageNativeCapacity = value;
/*       */   }
/*       */ 
/*       */   public TimeDimension getResponseTime()
/*       */   {
/*  9020 */     return this.responseTime;
/*       */   }
/*       */ 
/*       */   public void setResponseTime(TimeDimension value)
/*       */   {
/*  9032 */     this.responseTime = value;
/*       */   }
/*       */ 
/*       */   public String getRightConnectorGender()
/*       */   {
/*  9044 */     return this.rightConnectorGender;
/*       */   }
/*       */ 
/*       */   public void setRightConnectorGender(String value)
/*       */   {
/*  9056 */     this.rightConnectorGender = value;
/*       */   }
/*       */ 
/*       */   public List<String> getRightConnectorType()
/*       */   {
/*  9082 */     if (this.rightConnectorType == null) {
/*  9083 */       this.rightConnectorType = new ArrayList();
/*       */     }
/*  9085 */     return this.rightConnectorType;
/*       */   }
/*       */ 
/*       */   public List<String> getRoutingProtocol()
/*       */   {
/*  9111 */     if (this.routingProtocol == null) {
/*  9112 */       this.routingProtocol = new ArrayList();
/*       */     }
/*  9114 */     return this.routingProtocol;
/*       */   }
/*       */ 
/*       */   public List<String> getSatelliteServiceDescription()
/*       */   {
/*  9140 */     if (this.satelliteServiceDescription == null) {
/*  9141 */       this.satelliteServiceDescription = new ArrayList();
/*       */     }
/*  9143 */     return this.satelliteServiceDescription;
/*       */   }
/*       */ 
/*       */   public List<String> getSBAS()
/*       */   {
/*  9169 */     if (this.sbas == null) {
/*  9170 */       this.sbas = new ArrayList();
/*       */     }
/*  9172 */     return this.sbas;
/*       */   }
/*       */ 
/*       */   public String getScanElementType()
/*       */   {
/*  9184 */     return this.scanElementType;
/*       */   }
/*       */ 
/*       */   public void setScanElementType(String value)
/*       */   {
/*  9196 */     this.scanElementType = value;
/*       */   }
/*       */ 
/*       */   public String getScannerInterface()
/*       */   {
/*  9208 */     return this.scannerInterface;
/*       */   }
/*       */ 
/*       */   public void setScannerInterface(String value)
/*       */   {
/*  9220 */     this.scannerInterface = value;
/*       */   }
/*       */ 
/*       */   public String getScannerType()
/*       */   {
/*  9232 */     return this.scannerType;
/*       */   }
/*       */ 
/*       */   public void setScannerType(String value)
/*       */   {
/*  9244 */     this.scannerType = value;
/*       */   }
/*       */ 
/*       */   public String getSCSISignalingType()
/*       */   {
/*  9256 */     return this.scsiSignalingType;
/*       */   }
/*       */ 
/*       */   public void setSCSISignalingType(String value)
/*       */   {
/*  9268 */     this.scsiSignalingType = value;
/*       */   }
/*       */ 
/*       */   public SealedBoxVolume getSealedBoxVolume()
/*       */   {
/*  9280 */     return this.sealedBoxVolume;
/*       */   }
/*       */ 
/*       */   public void setSealedBoxVolume(SealedBoxVolume value)
/*       */   {
/*  9292 */     this.sealedBoxVolume = value;
/*       */   }
/*       */ 
/*       */   public List<String> getSearchSpeed()
/*       */   {
/*  9318 */     if (this.searchSpeed == null) {
/*  9319 */       this.searchSpeed = new ArrayList();
/*       */     }
/*  9321 */     return this.searchSpeed;
/*       */   }
/*       */ 
/*       */   public BigInteger getSecondaryCache()
/*       */   {
/*  9333 */     return this.secondaryCache;
/*       */   }
/*       */ 
/*       */   public void setSecondaryCache(BigInteger value)
/*       */   {
/*  9345 */     this.secondaryCache = value;
/*       */   }
/*       */ 
/*       */   public String getSellerWarrantyDescription()
/*       */   {
/*  9357 */     return this.sellerWarrantyDescription;
/*       */   }
/*       */ 
/*       */   public void setSellerWarrantyDescription(String value)
/*       */   {
/*  9369 */     this.sellerWarrantyDescription = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getSignalToNoiseRatio()
/*       */   {
/*  9381 */     return this.signalToNoiseRatio;
/*       */   }
/*       */ 
/*       */   public void setSignalToNoiseRatio(BigDecimal value)
/*       */   {
/*  9393 */     this.signalToNoiseRatio = value;
/*       */   }
/*       */ 
/*       */   public String getSize()
/*       */   {
/*  9405 */     return this.size;
/*       */   }
/*       */ 
/*       */   public void setSize(String value)
/*       */   {
/*  9417 */     this.size = value;
/*       */   }
/*       */ 
/*       */   public String getSpeakerAmplificationType()
/*       */   {
/*  9429 */     return this.speakerAmplificationType;
/*       */   }
/*       */ 
/*       */   public void setSpeakerAmplificationType(String value)
/*       */   {
/*  9441 */     this.speakerAmplificationType = value;
/*       */   }
/*       */ 
/*       */   public String getSpeakerConnectivity()
/*       */   {
/*  9453 */     return this.speakerConnectivity;
/*       */   }
/*       */ 
/*       */   public void setSpeakerConnectivity(String value)
/*       */   {
/*  9465 */     this.speakerConnectivity = value;
/*       */   }
/*       */ 
/*       */   public String getSpeakerDriverMaterial()
/*       */   {
/*  9477 */     return this.speakerDriverMaterial;
/*       */   }
/*       */ 
/*       */   public void setSpeakerDriverMaterial(String value)
/*       */   {
/*  9489 */     this.speakerDriverMaterial = value;
/*       */   }
/*       */ 
/*       */   public List<String> getSpeakersCrossoverChannelQuantity()
/*       */   {
/*  9515 */     if (this.speakersCrossoverChannelQuantity == null) {
/*  9516 */       this.speakersCrossoverChannelQuantity = new ArrayList();
/*       */     }
/*  9518 */     return this.speakersCrossoverChannelQuantity;
/*       */   }
/*       */ 
/*       */   public String getSpeakersIncludedDescription()
/*       */   {
/*  9530 */     return this.speakersIncludedDescription;
/*       */   }
/*       */ 
/*       */   public void setSpeakersIncludedDescription(String value)
/*       */   {
/*  9542 */     this.speakersIncludedDescription = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getSpeakersMaximumOutputPower()
/*       */   {
/*  9554 */     return this.speakersMaximumOutputPower;
/*       */   }
/*       */ 
/*       */   public void setSpeakersMaximumOutputPower(BigDecimal value)
/*       */   {
/*  9566 */     this.speakersMaximumOutputPower = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getSpeakersNominalOutputPower()
/*       */   {
/*  9578 */     return this.speakersNominalOutputPower;
/*       */   }
/*       */ 
/*       */   public void setSpeakersNominalOutputPower(BigDecimal value)
/*       */   {
/*  9590 */     this.speakersNominalOutputPower = value;
/*       */   }
/*       */ 
/*       */   public String getSpeakersResponseBandwidth()
/*       */   {
/*  9602 */     return this.speakersResponseBandwidth;
/*       */   }
/*       */ 
/*       */   public void setSpeakersResponseBandwidth(String value)
/*       */   {
/*  9614 */     this.speakersResponseBandwidth = value;
/*       */   }
/*       */ 
/*       */   public String getSpeakerSystemClass()
/*       */   {
/*  9626 */     return this.speakerSystemClass;
/*       */   }
/*       */ 
/*       */   public void setSpeakerSystemClass(String value)
/*       */   {
/*  9638 */     this.speakerSystemClass = value;
/*       */   }
/*       */ 
/*       */   public String getSpeakerType()
/*       */   {
/*  9650 */     return this.speakerType;
/*       */   }
/*       */ 
/*       */   public void setSpeakerType(String value)
/*       */   {
/*  9662 */     this.speakerType = value;
/*       */   }
/*       */ 
/*       */   public List<String> getSpecialFeatures()
/*       */   {
/*  9688 */     if (this.specialFeatures == null) {
/*  9689 */       this.specialFeatures = new ArrayList();
/*       */     }
/*  9691 */     return this.specialFeatures;
/*       */   }
/*       */ 
/*       */   public List<String> getSpecificationMet()
/*       */   {
/*  9717 */     if (this.specificationMet == null) {
/*  9718 */       this.specificationMet = new ArrayList();
/*       */     }
/*  9720 */     return this.specificationMet;
/*       */   }
/*       */ 
/*       */   public String getSpecificUses()
/*       */   {
/*  9732 */     return this.specificUses;
/*       */   }
/*       */ 
/*       */   public void setSpecificUses(String value)
/*       */   {
/*  9744 */     this.specificUses = value;
/*       */   }
/*       */ 
/*       */   public String getSSDDriveArchitechture()
/*       */   {
/*  9756 */     return this.ssdDriveArchitechture;
/*       */   }
/*       */ 
/*       */   public void setSSDDriveArchitechture(String value)
/*       */   {
/*  9768 */     this.ssdDriveArchitechture = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getStandardInputSheetCapacity()
/*       */   {
/*  9780 */     return this.standardInputSheetCapacity;
/*       */   }
/*       */ 
/*       */   public void setStandardInputSheetCapacity(BigInteger value)
/*       */   {
/*  9792 */     this.standardInputSheetCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getStorageController()
/*       */   {
/*  9804 */     return this.storageController;
/*       */   }
/*       */ 
/*       */   public void setStorageController(String value)
/*       */   {
/*  9816 */     this.storageController = value;
/*       */   }
/*       */ 
/*       */   public String getStorageControllerInterface()
/*       */   {
/*  9828 */     return this.storageControllerInterface;
/*       */   }
/*       */ 
/*       */   public void setStorageControllerInterface(String value)
/*       */   {
/*  9840 */     this.storageControllerInterface = value;
/*       */   }
/*       */ 
/*       */   public String getStorageHumidity()
/*       */   {
/*  9852 */     return this.storageHumidity;
/*       */   }
/*       */ 
/*       */   public void setStorageHumidity(String value)
/*       */   {
/*  9864 */     this.storageHumidity = value;
/*       */   }
/*       */ 
/*       */   public String getStorageInterface()
/*       */   {
/*  9876 */     return this.storageInterface;
/*       */   }
/*       */ 
/*       */   public void setStorageInterface(String value)
/*       */   {
/*  9888 */     this.storageInterface = value;
/*       */   }
/*       */ 
/*       */   public String getStyleName()
/*       */   {
/*  9900 */     return this.styleName;
/*       */   }
/*       */ 
/*       */   public void setStyleName(String value)
/*       */   {
/*  9912 */     this.styleName = value;
/*       */   }
/*       */ 
/*       */   public List<String> getSupportedAudioFormat()
/*       */   {
/*  9938 */     if (this.supportedAudioFormat == null) {
/*  9939 */       this.supportedAudioFormat = new ArrayList();
/*       */     }
/*  9941 */     return this.supportedAudioFormat;
/*       */   }
/*       */ 
/*       */   public List<String> getSupportedDevices()
/*       */   {
/*  9967 */     if (this.supportedDevices == null) {
/*  9968 */       this.supportedDevices = new ArrayList();
/*       */     }
/*  9970 */     return this.supportedDevices;
/*       */   }
/*       */ 
/*       */   public BigInteger getSupportedDevicesQuantity()
/*       */   {
/*  9982 */     return this.supportedDevicesQuantity;
/*       */   }
/*       */ 
/*       */   public void setSupportedDevicesQuantity(BigInteger value)
/*       */   {
/*  9994 */     this.supportedDevicesQuantity = value;
/*       */   }
/*       */ 
/*       */   public List<String> getSupportedImageFormat()
/*       */   {
/* 10020 */     if (this.supportedImageFormat == null) {
/* 10021 */       this.supportedImageFormat = new ArrayList();
/*       */     }
/* 10023 */     return this.supportedImageFormat;
/*       */   }
/*       */ 
/*       */   public List<String> getSupportedImageType()
/*       */   {
/* 10049 */     if (this.supportedImageType == null) {
/* 10050 */       this.supportedImageType = new ArrayList();
/*       */     }
/* 10052 */     return this.supportedImageType;
/*       */   }
/*       */ 
/*       */   public String getSupportedMediaSize()
/*       */   {
/* 10064 */     return this.supportedMediaSize;
/*       */   }
/*       */ 
/*       */   public void setSupportedMediaSize(String value)
/*       */   {
/* 10076 */     this.supportedMediaSize = value;
/*       */   }
/*       */ 
/*       */   public String getSupportedMotherboard()
/*       */   {
/* 10088 */     return this.supportedMotherboard;
/*       */   }
/*       */ 
/*       */   public void setSupportedMotherboard(String value)
/*       */   {
/* 10100 */     this.supportedMotherboard = value;
/*       */   }
/*       */ 
/*       */   public List<String> getSupportedStandards()
/*       */   {
/* 10126 */     if (this.supportedStandards == null) {
/* 10127 */       this.supportedStandards = new ArrayList();
/*       */     }
/* 10129 */     return this.supportedStandards;
/*       */   }
/*       */ 
/*       */   public String getSurgeSuppression()
/*       */   {
/* 10141 */     return this.surgeSuppression;
/*       */   }
/*       */ 
/*       */   public void setSurgeSuppression(String value)
/*       */   {
/* 10153 */     this.surgeSuppression = value;
/*       */   }
/*       */ 
/*       */   public String getSurroundSoundChannels()
/*       */   {
/* 10165 */     return this.surroundSoundChannels;
/*       */   }
/*       */ 
/*       */   public void setSurroundSoundChannels(String value)
/*       */   {
/* 10177 */     this.surroundSoundChannels = value;
/*       */   }
/*       */ 
/*       */   public List<String> getSurroundSoundEffects()
/*       */   {
/* 10203 */     if (this.surroundSoundEffects == null) {
/* 10204 */       this.surroundSoundEffects = new ArrayList();
/*       */     }
/* 10206 */     return this.surroundSoundEffects;
/*       */   }
/*       */ 
/*       */   public List<String> getSwitchingProtocol()
/*       */   {
/* 10232 */     if (this.switchingProtocol == null) {
/* 10233 */       this.switchingProtocol = new ArrayList();
/*       */     }
/* 10235 */     return this.switchingProtocol;
/*       */   }
/*       */ 
/*       */   public BigDecimal getSystemBusSpeed()
/*       */   {
/* 10247 */     return this.systemBusSpeed;
/*       */   }
/*       */ 
/*       */   public void setSystemBusSpeed(BigDecimal value)
/*       */   {
/* 10259 */     this.systemBusSpeed = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getTalkRangeMaximum()
/*       */   {
/* 10271 */     return this.talkRangeMaximum;
/*       */   }
/*       */ 
/*       */   public void setTalkRangeMaximum(LengthDimension value)
/*       */   {
/* 10283 */     this.talkRangeMaximum = value;
/*       */   }
/*       */ 
/*       */   public TimeDimension getTapeLength()
/*       */   {
/* 10295 */     return this.tapeLength;
/*       */   }
/*       */ 
/*       */   public void setTapeLength(TimeDimension value)
/*       */   {
/* 10307 */     this.tapeLength = value;
/*       */   }
/*       */ 
/*       */   public String getTelevisionInterface()
/*       */   {
/* 10319 */     return this.televisionInterface;
/*       */   }
/*       */ 
/*       */   public void setTelevisionInterface(String value)
/*       */   {
/* 10331 */     this.televisionInterface = value;
/*       */   }
/*       */ 
/*       */   public String getTelevisionPCInterfaceType()
/*       */   {
/* 10343 */     return this.televisionPCInterfaceType;
/*       */   }
/*       */ 
/*       */   public void setTelevisionPCInterfaceType(String value)
/*       */   {
/* 10355 */     this.televisionPCInterfaceType = value;
/*       */   }
/*       */ 
/*       */   public String getTemperatureRating()
/*       */   {
/* 10367 */     return this.temperatureRating;
/*       */   }
/*       */ 
/*       */   public void setTemperatureRating(String value)
/*       */   {
/* 10379 */     this.temperatureRating = value;
/*       */   }
/*       */ 
/*       */   public String getTotalHarmonicDistortion()
/*       */   {
/* 10391 */     return this.totalHarmonicDistortion;
/*       */   }
/*       */ 
/*       */   public void setTotalHarmonicDistortion(String value)
/*       */   {
/* 10403 */     this.totalHarmonicDistortion = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getTracklogPoints()
/*       */   {
/* 10415 */     return this.tracklogPoints;
/*       */   }
/*       */ 
/*       */   public void setTracklogPoints(BigInteger value)
/*       */   {
/* 10427 */     this.tracklogPoints = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getTracks()
/*       */   {
/* 10439 */     return this.tracks;
/*       */   }
/*       */ 
/*       */   public void setTracks(BigInteger value)
/*       */   {
/* 10451 */     this.tracks = value;
/*       */   }
/*       */ 
/*       */   public List<String> getTransportProtocol()
/*       */   {
/* 10477 */     if (this.transportProtocol == null) {
/* 10478 */       this.transportProtocol = new ArrayList();
/*       */     }
/* 10480 */     return this.transportProtocol;
/*       */   }
/*       */ 
/*       */   public String getTuner()
/*       */   {
/* 10492 */     return this.tuner;
/*       */   }
/*       */ 
/*       */   public void setTuner(String value)
/*       */   {
/* 10504 */     this.tuner = value;
/*       */   }
/*       */ 
/*       */   public List<String> getTunerTechnology()
/*       */   {
/* 10530 */     if (this.tunerTechnology == null) {
/* 10531 */       this.tunerTechnology = new ArrayList();
/*       */     }
/* 10533 */     return this.tunerTechnology;
/*       */   }
/*       */ 
/*       */   public Boolean isTVTunerSecondaryAudioProgram()
/*       */   {
/* 10545 */     return this.tvTunerSecondaryAudioProgram;
/*       */   }
/*       */ 
/*       */   public void setTVTunerSecondaryAudioProgram(Boolean value)
/*       */   {
/* 10557 */     this.tvTunerSecondaryAudioProgram = value;
/*       */   }
/*       */ 
/*       */   public String getUPSTechnology()
/*       */   {
/* 10569 */     return this.upsTechnology;
/*       */   }
/*       */ 
/*       */   public void setUPSTechnology(String value)
/*       */   {
/* 10581 */     this.upsTechnology = value;
/*       */   }
/*       */ 
/*       */   public List<String> getVCRType()
/*       */   {
/* 10607 */     if (this.vcrType == null) {
/* 10608 */       this.vcrType = new ArrayList();
/*       */     }
/* 10610 */     return this.vcrType;
/*       */   }
/*       */ 
/*       */   public PixelDimension getVerticalResolution()
/*       */   {
/* 10622 */     return this.verticalResolution;
/*       */   }
/*       */ 
/*       */   public void setVerticalResolution(PixelDimension value)
/*       */   {
/* 10634 */     this.verticalResolution = value;
/*       */   }
/*       */ 
/*       */   public List<String> getVideoCaptureFormat()
/*       */   {
/* 10660 */     if (this.videoCaptureFormat == null) {
/* 10661 */       this.videoCaptureFormat = new ArrayList();
/*       */     }
/* 10663 */     return this.videoCaptureFormat;
/*       */   }
/*       */ 
/*       */   public List<String> getVideoCaptureResolution()
/*       */   {
/* 10689 */     if (this.videoCaptureResolution == null) {
/* 10690 */       this.videoCaptureResolution = new ArrayList();
/*       */     }
/* 10692 */     return this.videoCaptureResolution;
/*       */   }
/*       */ 
/*       */   public BigInteger getVideoHeadQuantity()
/*       */   {
/* 10704 */     return this.videoHeadQuantity;
/*       */   }
/*       */ 
/*       */   public void setVideoHeadQuantity(BigInteger value)
/*       */   {
/* 10716 */     this.videoHeadQuantity = value;
/*       */   }
/*       */ 
/*       */   public List<String> getVideoInput()
/*       */   {
/* 10742 */     if (this.videoInput == null) {
/* 10743 */       this.videoInput = new ArrayList();
/*       */     }
/* 10745 */     return this.videoInput;
/*       */   }
/*       */ 
/*       */   public List<String> getVideoInputDigitalStandard()
/*       */   {
/* 10771 */     if (this.videoInputDigitalStandard == null) {
/* 10772 */       this.videoInputDigitalStandard = new ArrayList();
/*       */     }
/* 10774 */     return this.videoInputDigitalStandard;
/*       */   }
/*       */ 
/*       */   public List<String> getVideoInputFormat()
/*       */   {
/* 10800 */     if (this.videoInputFormat == null) {
/* 10801 */       this.videoInputFormat = new ArrayList();
/*       */     }
/* 10803 */     return this.videoInputFormat;
/*       */   }
/*       */ 
/*       */   public String getVideoOutputFormat()
/*       */   {
/* 10815 */     return this.videoOutputFormat;
/*       */   }
/*       */ 
/*       */   public void setVideoOutputFormat(String value)
/*       */   {
/* 10827 */     this.videoOutputFormat = value;
/*       */   }
/*       */ 
/*       */   public List<String> getVideoOutput()
/*       */   {
/* 10853 */     if (this.videoOutput == null) {
/* 10854 */       this.videoOutput = new ArrayList();
/*       */     }
/* 10856 */     return this.videoOutput;
/*       */   }
/*       */ 
/*       */   public List<String> getVideoOutputInterface()
/*       */   {
/* 10882 */     if (this.videoOutputInterface == null) {
/* 10883 */       this.videoOutputInterface = new ArrayList();
/*       */     }
/* 10885 */     return this.videoOutputInterface;
/*       */   }
/*       */ 
/*       */   public String getVideoOutputMode()
/*       */   {
/* 10897 */     return this.videoOutputMode;
/*       */   }
/*       */ 
/*       */   public void setVideoOutputMode(String value)
/*       */   {
/* 10909 */     this.videoOutputMode = value;
/*       */   }
/*       */ 
/*       */   public List<String> getVideoPlaybackFormat()
/*       */   {
/* 10935 */     if (this.videoPlaybackFormat == null) {
/* 10936 */       this.videoPlaybackFormat = new ArrayList();
/*       */     }
/* 10938 */     return this.videoPlaybackFormat;
/*       */   }
/*       */ 
/*       */   public List<String> getVideotapePlaybackSpeed()
/*       */   {
/* 10964 */     if (this.videotapePlaybackSpeed == null) {
/* 10965 */       this.videotapePlaybackSpeed = new ArrayList();
/*       */     }
/* 10967 */     return this.videotapePlaybackSpeed;
/*       */   }
/*       */ 
/*       */   public String getVideotapeRecordingSpeed()
/*       */   {
/* 10979 */     return this.videotapeRecordingSpeed;
/*       */   }
/*       */ 
/*       */   public void setVideotapeRecordingSpeed(String value)
/*       */   {
/* 10991 */     this.videotapeRecordingSpeed = value;
/*       */   }
/*       */ 
/*       */   public List<String> getVoiceCommunicationSupport()
/*       */   {
/* 11017 */     if (this.voiceCommunicationSupport == null) {
/* 11018 */       this.voiceCommunicationSupport = new ArrayList();
/*       */     }
/* 11020 */     return this.voiceCommunicationSupport;
/*       */   }
/*       */ 
/*       */   public String getVoiceCoilDescription()
/*       */   {
/* 11032 */     return this.voiceCoilDescription;
/*       */   }
/*       */ 
/*       */   public void setVoiceCoilDescription(String value)
/*       */   {
/* 11044 */     this.voiceCoilDescription = value;
/*       */   }
/*       */ 
/*       */   public Boolean isVoicemailCapability()
/*       */   {
/* 11056 */     return this.voicemailCapability;
/*       */   }
/*       */ 
/*       */   public void setVoicemailCapability(Boolean value)
/*       */   {
/* 11068 */     this.voicemailCapability = value;
/*       */   }
/*       */ 
/*       */   public String getVoiceOperatedTransmission()
/*       */   {
/* 11080 */     return this.voiceOperatedTransmission;
/*       */   }
/*       */ 
/*       */   public void setVoiceOperatedTransmission(String value)
/*       */   {
/* 11092 */     this.voiceOperatedTransmission = value;
/*       */   }
/*       */ 
/*       */   public List<String> getVOIPProtocols()
/*       */   {
/* 11118 */     if (this.voipProtocols == null) {
/* 11119 */       this.voipProtocols = new ArrayList();
/*       */     }
/* 11121 */     return this.voipProtocols;
/*       */   }
/*       */ 
/*       */   public VolumeDimension getVolumeAcousticSuspension()
/*       */   {
/* 11133 */     return this.volumeAcousticSuspension;
/*       */   }
/*       */ 
/*       */   public void setVolumeAcousticSuspension(VolumeDimension value)
/*       */   {
/* 11145 */     this.volumeAcousticSuspension = value;
/*       */   }
/*       */ 
/*       */   public String getWarnings()
/*       */   {
/* 11157 */     return this.warnings;
/*       */   }
/*       */ 
/*       */   public void setWarnings(String value)
/*       */   {
/* 11169 */     this.warnings = value;
/*       */   }
/*       */ 
/*       */   public String getWarrantyDescription()
/*       */   {
/* 11181 */     return this.warrantyDescription;
/*       */   }
/*       */ 
/*       */   public void setWarrantyDescription(String value)
/*       */   {
/* 11193 */     this.warrantyDescription = value;
/*       */   }
/*       */ 
/*       */   public String getWaterproofRating()
/*       */   {
/* 11205 */     return this.waterproofRating;
/*       */   }
/*       */ 
/*       */   public void setWaterproofRating(String value)
/*       */   {
/* 11217 */     this.waterproofRating = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getWaypoints()
/*       */   {
/* 11229 */     return this.waypoints;
/*       */   }
/*       */ 
/*       */   public void setWaypoints(BigDecimal value)
/*       */   {
/* 11241 */     this.waypoints = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getWaypointsPerRoute()
/*       */   {
/* 11253 */     return this.waypointsPerRoute;
/*       */   }
/*       */ 
/*       */   public void setWaypointsPerRoute(BigInteger value)
/*       */   {
/* 11265 */     this.waypointsPerRoute = value;
/*       */   }
/*       */ 
/*       */   public String getWeatherproof()
/*       */   {
/* 11277 */     return this.weatherproof;
/*       */   }
/*       */ 
/*       */   public void setWeatherproof(String value)
/*       */   {
/* 11289 */     this.weatherproof = value;
/*       */   }
/*       */ 
/*       */   public String getWriteSpeed()
/*       */   {
/* 11301 */     return this.writeSpeed;
/*       */   }
/*       */ 
/*       */   public void setWriteSpeed(String value)
/*       */   {
/* 11313 */     this.writeSpeed = value;
/*       */   }
/*       */ 
/*       */   @XmlAccessorType(XmlAccessType.FIELD)
/*       */   @XmlType(name="", propOrder={"value"})
/*       */   public static class SealedBoxVolume
/*       */   {
/*       */ 
/*       */     @XmlValue
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String value;
/*       */ 
/*       */     @XmlAttribute(name="unitOfMeasure", required=true)
/*       */     protected VolumeUnitOfMeasure unitOfMeasure;
/*       */ 
/*       */     public String getValue()
/*       */     {
/* 13138 */       return this.value;
/*       */     }
/*       */ 
/*       */     public void setValue(String value)
/*       */     {
/* 13150 */       this.value = value;
/*       */     }
/*       */ 
/*       */     public VolumeUnitOfMeasure getUnitOfMeasure()
/*       */     {
/* 13162 */       return this.unitOfMeasure;
/*       */     }
/*       */ 
/*       */     public void setUnitOfMeasure(VolumeUnitOfMeasure value)
/*       */     {
/* 13174 */       this.unitOfMeasure = value;
/*       */     }
/*       */   }
/*       */ 
/*       */   @XmlAccessorType(XmlAccessType.FIELD)
/*       */   @XmlType(name="", propOrder={"antenna", "audioVideoAccessory", "avFurniture", "barCodeReader", "ceBinocular", "ceCamcorder", "cameraBagsAndCases", "ceBattery", "ceBlankMedia", "cableOrAdapter", "ceCameraFlash", "cameraLenses", "cameraOtherAccessories", "cameraPowerSupply", "carAlarm", "carAudioOrTheater", "carElectronics", "consumerElectronics", "ceDigitalCamera", "digitalPictureFrame", "digitalVideoRecorder", "dvdPlayerOrRecorder", "ceFilmCamera", "gpsOrNavigationAccessory", "gpsOrNavigationSystem", "handheldOrPDA", "headphones", "homeTheaterSystemOrHTIB", "kindleAccessories", "kindleEReaderAccessories", "kindleFireAccessories", "mediaPlayer", "mediaPlayerOrEReaderAccessory", "mediaStorage", "miscAudioComponents", "pc", "pda", "phone", "phoneAccessory", "photographicStudioItems", "portableAudio", "portableAvDevice", "powerSuppliesOrProtection", "radarDetector", "radioOrClockRadio", "receiverOrAmplifier", "remoteControl", "speakers", "stereoShelfSystem", "ceTelescope", "television", "tuner", "tvCombos", "twoWayRadio", "vcr", "ceVideoProjector", "videoProjectorsAndAccessories"})
/*       */   public static class ProductType
/*       */   {
/*       */ 
/*       */     @XmlElement(name="Antenna")
/*       */     protected Antenna antenna;
/*       */ 
/*       */     @XmlElement(name="AudioVideoAccessory")
/*       */     protected AudioVideoAccessory audioVideoAccessory;
/*       */ 
/*       */     @XmlElement(name="AVFurniture")
/*       */     protected AVFurniture avFurniture;
/*       */ 
/*       */     @XmlElement(name="BarCodeReader")
/*       */     protected BarCodeReader barCodeReader;
/*       */ 
/*       */     @XmlElement(name="CEBinocular")
/*       */     protected CEBinocular ceBinocular;
/*       */ 
/*       */     @XmlElement(name="CECamcorder")
/*       */     protected CECamcorder ceCamcorder;
/*       */ 
/*       */     @XmlElement(name="CameraBagsAndCases")
/*       */     protected CameraBagsAndCases cameraBagsAndCases;
/*       */ 
/*       */     @XmlElement(name="CEBattery")
/*       */     protected CEBattery ceBattery;
/*       */ 
/*       */     @XmlElement(name="CEBlankMedia")
/*       */     protected CEBlankMedia ceBlankMedia;
/*       */ 
/*       */     @XmlElement(name="CableOrAdapter")
/*       */     protected CableOrAdapter cableOrAdapter;
/*       */ 
/*       */     @XmlElement(name="CECameraFlash")
/*       */     protected CECameraFlash ceCameraFlash;
/*       */ 
/*       */     @XmlElement(name="CameraLenses")
/*       */     protected CameraLenses cameraLenses;
/*       */ 
/*       */     @XmlElement(name="CameraOtherAccessories")
/*       */     protected CameraOtherAccessories cameraOtherAccessories;
/*       */ 
/*       */     @XmlElement(name="CameraPowerSupply")
/*       */     protected CameraPowerSupply cameraPowerSupply;
/*       */ 
/*       */     @XmlElement(name="CarAlarm")
/*       */     protected CarAlarm carAlarm;
/*       */ 
/*       */     @XmlElement(name="CarAudioOrTheater")
/*       */     protected CarAudioOrTheater carAudioOrTheater;
/*       */ 
/*       */     @XmlElement(name="CarElectronics")
/*       */     protected CarElectronics carElectronics;
/*       */ 
/*       */     @XmlElement(name="ConsumerElectronics")
/*       */     protected ConsumerElectronics consumerElectronics;
/*       */ 
/*       */     @XmlElement(name="CEDigitalCamera")
/*       */     protected CEDigitalCamera ceDigitalCamera;
/*       */ 
/*       */     @XmlElement(name="DigitalPictureFrame")
/*       */     protected DigitalPictureFrame digitalPictureFrame;
/*       */ 
/*       */     @XmlElement(name="DigitalVideoRecorder")
/*       */     protected DigitalVideoRecorder digitalVideoRecorder;
/*       */ 
/*       */     @XmlElement(name="DVDPlayerOrRecorder")
/*       */     protected DVDPlayerOrRecorder dvdPlayerOrRecorder;
/*       */ 
/*       */     @XmlElement(name="CEFilmCamera")
/*       */     protected CEFilmCamera ceFilmCamera;
/*       */ 
/*       */     @XmlElement(name="GPSOrNavigationAccessory")
/*       */     protected GPSOrNavigationAccessory gpsOrNavigationAccessory;
/*       */ 
/*       */     @XmlElement(name="GPSOrNavigationSystem")
/*       */     protected GPSOrNavigationSystem gpsOrNavigationSystem;
/*       */ 
/*       */     @XmlElement(name="HandheldOrPDA")
/*       */     protected HandheldOrPDA handheldOrPDA;
/*       */ 
/*       */     @XmlElement(name="Headphones")
/*       */     protected Headphones headphones;
/*       */ 
/*       */     @XmlElement(name="HomeTheaterSystemOrHTIB")
/*       */     protected HomeTheaterSystemOrHTIB homeTheaterSystemOrHTIB;
/*       */ 
/*       */     @XmlElement(name="KindleAccessories")
/*       */     protected KindleAccessories kindleAccessories;
/*       */ 
/*       */     @XmlElement(name="KindleEReaderAccessories")
/*       */     protected KindleEReaderAccessories kindleEReaderAccessories;
/*       */ 
/*       */     @XmlElement(name="KindleFireAccessories")
/*       */     protected KindleFireAccessories kindleFireAccessories;
/*       */ 
/*       */     @XmlElement(name="MediaPlayer")
/*       */     protected MediaPlayer mediaPlayer;
/*       */ 
/*       */     @XmlElement(name="MediaPlayerOrEReaderAccessory")
/*       */     protected MediaPlayerOrEReaderAccessory mediaPlayerOrEReaderAccessory;
/*       */ 
/*       */     @XmlElement(name="MediaStorage")
/*       */     protected MediaStorage mediaStorage;
/*       */ 
/*       */     @XmlElement(name="MiscAudioComponents")
/*       */     protected MiscAudioComponents miscAudioComponents;
/*       */ 
/*       */     @XmlElement(name="PC")
/*       */     protected PC pc;
/*       */ 
/*       */     @XmlElement(name="PDA")
/*       */     protected PDA pda;
/*       */ 
/*       */     @XmlElement(name="Phone")
/*       */     protected Phone phone;
/*       */ 
/*       */     @XmlElement(name="PhoneAccessory")
/*       */     protected PhoneAccessory phoneAccessory;
/*       */ 
/*       */     @XmlElement(name="PhotographicStudioItems")
/*       */     protected PhotographicStudioItems photographicStudioItems;
/*       */ 
/*       */     @XmlElement(name="PortableAudio")
/*       */     protected PortableAudio portableAudio;
/*       */ 
/*       */     @XmlElement(name="PortableAvDevice")
/*       */     protected PortableAvDevice portableAvDevice;
/*       */ 
/*       */     @XmlElement(name="PowerSuppliesOrProtection")
/*       */     protected PowerSuppliesOrProtection powerSuppliesOrProtection;
/*       */ 
/*       */     @XmlElement(name="RadarDetector")
/*       */     protected RadarDetector radarDetector;
/*       */ 
/*       */     @XmlElement(name="RadioOrClockRadio")
/*       */     protected RadioOrClockRadio radioOrClockRadio;
/*       */ 
/*       */     @XmlElement(name="ReceiverOrAmplifier")
/*       */     protected ReceiverOrAmplifier receiverOrAmplifier;
/*       */ 
/*       */     @XmlElement(name="RemoteControl")
/*       */     protected RemoteControl remoteControl;
/*       */ 
/*       */     @XmlElement(name="Speakers")
/*       */     protected Speakers speakers;
/*       */ 
/*       */     @XmlElement(name="StereoShelfSystem")
/*       */     protected StereoShelfSystem stereoShelfSystem;
/*       */ 
/*       */     @XmlElement(name="CETelescope")
/*       */     protected CETelescope ceTelescope;
/*       */ 
/*       */     @XmlElement(name="Television")
/*       */     protected Television television;
/*       */ 
/*       */     @XmlElement(name="Tuner")
/*       */     protected Tuner tuner;
/*       */ 
/*       */     @XmlElement(name="TVCombos")
/*       */     protected TVCombos tvCombos;
/*       */ 
/*       */     @XmlElement(name="TwoWayRadio")
/*       */     protected TwoWayRadio twoWayRadio;
/*       */ 
/*       */     @XmlElement(name="VCR")
/*       */     protected VCR vcr;
/*       */ 
/*       */     @XmlElement(name="CEVideoProjector")
/*       */     protected CEVideoProjector ceVideoProjector;
/*       */ 
/*       */     @XmlElement(name="VideoProjectorsAndAccessories")
/*       */     protected VideoProjectorsAndAccessories videoProjectorsAndAccessories;
/*       */ 
/*       */     public Antenna getAntenna()
/*       */     {
/* 11738 */       return this.antenna;
/*       */     }
/*       */ 
/*       */     public void setAntenna(Antenna value)
/*       */     {
/* 11750 */       this.antenna = value;
/*       */     }
/*       */ 
/*       */     public AudioVideoAccessory getAudioVideoAccessory()
/*       */     {
/* 11762 */       return this.audioVideoAccessory;
/*       */     }
/*       */ 
/*       */     public void setAudioVideoAccessory(AudioVideoAccessory value)
/*       */     {
/* 11774 */       this.audioVideoAccessory = value;
/*       */     }
/*       */ 
/*       */     public AVFurniture getAVFurniture()
/*       */     {
/* 11786 */       return this.avFurniture;
/*       */     }
/*       */ 
/*       */     public void setAVFurniture(AVFurniture value)
/*       */     {
/* 11798 */       this.avFurniture = value;
/*       */     }
/*       */ 
/*       */     public BarCodeReader getBarCodeReader()
/*       */     {
/* 11810 */       return this.barCodeReader;
/*       */     }
/*       */ 
/*       */     public void setBarCodeReader(BarCodeReader value)
/*       */     {
/* 11822 */       this.barCodeReader = value;
/*       */     }
/*       */ 
/*       */     public CEBinocular getCEBinocular()
/*       */     {
/* 11834 */       return this.ceBinocular;
/*       */     }
/*       */ 
/*       */     public void setCEBinocular(CEBinocular value)
/*       */     {
/* 11846 */       this.ceBinocular = value;
/*       */     }
/*       */ 
/*       */     public CECamcorder getCECamcorder()
/*       */     {
/* 11858 */       return this.ceCamcorder;
/*       */     }
/*       */ 
/*       */     public void setCECamcorder(CECamcorder value)
/*       */     {
/* 11870 */       this.ceCamcorder = value;
/*       */     }
/*       */ 
/*       */     public CameraBagsAndCases getCameraBagsAndCases()
/*       */     {
/* 11882 */       return this.cameraBagsAndCases;
/*       */     }
/*       */ 
/*       */     public void setCameraBagsAndCases(CameraBagsAndCases value)
/*       */     {
/* 11894 */       this.cameraBagsAndCases = value;
/*       */     }
/*       */ 
/*       */     public CEBattery getCEBattery()
/*       */     {
/* 11906 */       return this.ceBattery;
/*       */     }
/*       */ 
/*       */     public void setCEBattery(CEBattery value)
/*       */     {
/* 11918 */       this.ceBattery = value;
/*       */     }
/*       */ 
/*       */     public CEBlankMedia getCEBlankMedia()
/*       */     {
/* 11930 */       return this.ceBlankMedia;
/*       */     }
/*       */ 
/*       */     public void setCEBlankMedia(CEBlankMedia value)
/*       */     {
/* 11942 */       this.ceBlankMedia = value;
/*       */     }
/*       */ 
/*       */     public CableOrAdapter getCableOrAdapter()
/*       */     {
/* 11954 */       return this.cableOrAdapter;
/*       */     }
/*       */ 
/*       */     public void setCableOrAdapter(CableOrAdapter value)
/*       */     {
/* 11966 */       this.cableOrAdapter = value;
/*       */     }
/*       */ 
/*       */     public CECameraFlash getCECameraFlash()
/*       */     {
/* 11978 */       return this.ceCameraFlash;
/*       */     }
/*       */ 
/*       */     public void setCECameraFlash(CECameraFlash value)
/*       */     {
/* 11990 */       this.ceCameraFlash = value;
/*       */     }
/*       */ 
/*       */     public CameraLenses getCameraLenses()
/*       */     {
/* 12002 */       return this.cameraLenses;
/*       */     }
/*       */ 
/*       */     public void setCameraLenses(CameraLenses value)
/*       */     {
/* 12014 */       this.cameraLenses = value;
/*       */     }
/*       */ 
/*       */     public CameraOtherAccessories getCameraOtherAccessories()
/*       */     {
/* 12026 */       return this.cameraOtherAccessories;
/*       */     }
/*       */ 
/*       */     public void setCameraOtherAccessories(CameraOtherAccessories value)
/*       */     {
/* 12038 */       this.cameraOtherAccessories = value;
/*       */     }
/*       */ 
/*       */     public CameraPowerSupply getCameraPowerSupply()
/*       */     {
/* 12050 */       return this.cameraPowerSupply;
/*       */     }
/*       */ 
/*       */     public void setCameraPowerSupply(CameraPowerSupply value)
/*       */     {
/* 12062 */       this.cameraPowerSupply = value;
/*       */     }
/*       */ 
/*       */     public CarAlarm getCarAlarm()
/*       */     {
/* 12074 */       return this.carAlarm;
/*       */     }
/*       */ 
/*       */     public void setCarAlarm(CarAlarm value)
/*       */     {
/* 12086 */       this.carAlarm = value;
/*       */     }
/*       */ 
/*       */     public CarAudioOrTheater getCarAudioOrTheater()
/*       */     {
/* 12098 */       return this.carAudioOrTheater;
/*       */     }
/*       */ 
/*       */     public void setCarAudioOrTheater(CarAudioOrTheater value)
/*       */     {
/* 12110 */       this.carAudioOrTheater = value;
/*       */     }
/*       */ 
/*       */     public CarElectronics getCarElectronics()
/*       */     {
/* 12122 */       return this.carElectronics;
/*       */     }
/*       */ 
/*       */     public void setCarElectronics(CarElectronics value)
/*       */     {
/* 12134 */       this.carElectronics = value;
/*       */     }
/*       */ 
/*       */     public ConsumerElectronics getConsumerElectronics()
/*       */     {
/* 12146 */       return this.consumerElectronics;
/*       */     }
/*       */ 
/*       */     public void setConsumerElectronics(ConsumerElectronics value)
/*       */     {
/* 12158 */       this.consumerElectronics = value;
/*       */     }
/*       */ 
/*       */     public CEDigitalCamera getCEDigitalCamera()
/*       */     {
/* 12170 */       return this.ceDigitalCamera;
/*       */     }
/*       */ 
/*       */     public void setCEDigitalCamera(CEDigitalCamera value)
/*       */     {
/* 12182 */       this.ceDigitalCamera = value;
/*       */     }
/*       */ 
/*       */     public DigitalPictureFrame getDigitalPictureFrame()
/*       */     {
/* 12194 */       return this.digitalPictureFrame;
/*       */     }
/*       */ 
/*       */     public void setDigitalPictureFrame(DigitalPictureFrame value)
/*       */     {
/* 12206 */       this.digitalPictureFrame = value;
/*       */     }
/*       */ 
/*       */     public DigitalVideoRecorder getDigitalVideoRecorder()
/*       */     {
/* 12218 */       return this.digitalVideoRecorder;
/*       */     }
/*       */ 
/*       */     public void setDigitalVideoRecorder(DigitalVideoRecorder value)
/*       */     {
/* 12230 */       this.digitalVideoRecorder = value;
/*       */     }
/*       */ 
/*       */     public DVDPlayerOrRecorder getDVDPlayerOrRecorder()
/*       */     {
/* 12242 */       return this.dvdPlayerOrRecorder;
/*       */     }
/*       */ 
/*       */     public void setDVDPlayerOrRecorder(DVDPlayerOrRecorder value)
/*       */     {
/* 12254 */       this.dvdPlayerOrRecorder = value;
/*       */     }
/*       */ 
/*       */     public CEFilmCamera getCEFilmCamera()
/*       */     {
/* 12266 */       return this.ceFilmCamera;
/*       */     }
/*       */ 
/*       */     public void setCEFilmCamera(CEFilmCamera value)
/*       */     {
/* 12278 */       this.ceFilmCamera = value;
/*       */     }
/*       */ 
/*       */     public GPSOrNavigationAccessory getGPSOrNavigationAccessory()
/*       */     {
/* 12290 */       return this.gpsOrNavigationAccessory;
/*       */     }
/*       */ 
/*       */     public void setGPSOrNavigationAccessory(GPSOrNavigationAccessory value)
/*       */     {
/* 12302 */       this.gpsOrNavigationAccessory = value;
/*       */     }
/*       */ 
/*       */     public GPSOrNavigationSystem getGPSOrNavigationSystem()
/*       */     {
/* 12314 */       return this.gpsOrNavigationSystem;
/*       */     }
/*       */ 
/*       */     public void setGPSOrNavigationSystem(GPSOrNavigationSystem value)
/*       */     {
/* 12326 */       this.gpsOrNavigationSystem = value;
/*       */     }
/*       */ 
/*       */     public HandheldOrPDA getHandheldOrPDA()
/*       */     {
/* 12338 */       return this.handheldOrPDA;
/*       */     }
/*       */ 
/*       */     public void setHandheldOrPDA(HandheldOrPDA value)
/*       */     {
/* 12350 */       this.handheldOrPDA = value;
/*       */     }
/*       */ 
/*       */     public Headphones getHeadphones()
/*       */     {
/* 12362 */       return this.headphones;
/*       */     }
/*       */ 
/*       */     public void setHeadphones(Headphones value)
/*       */     {
/* 12374 */       this.headphones = value;
/*       */     }
/*       */ 
/*       */     public HomeTheaterSystemOrHTIB getHomeTheaterSystemOrHTIB()
/*       */     {
/* 12386 */       return this.homeTheaterSystemOrHTIB;
/*       */     }
/*       */ 
/*       */     public void setHomeTheaterSystemOrHTIB(HomeTheaterSystemOrHTIB value)
/*       */     {
/* 12398 */       this.homeTheaterSystemOrHTIB = value;
/*       */     }
/*       */ 
/*       */     public KindleAccessories getKindleAccessories()
/*       */     {
/* 12410 */       return this.kindleAccessories;
/*       */     }
/*       */ 
/*       */     public void setKindleAccessories(KindleAccessories value)
/*       */     {
/* 12422 */       this.kindleAccessories = value;
/*       */     }
/*       */ 
/*       */     public KindleEReaderAccessories getKindleEReaderAccessories()
/*       */     {
/* 12434 */       return this.kindleEReaderAccessories;
/*       */     }
/*       */ 
/*       */     public void setKindleEReaderAccessories(KindleEReaderAccessories value)
/*       */     {
/* 12446 */       this.kindleEReaderAccessories = value;
/*       */     }
/*       */ 
/*       */     public KindleFireAccessories getKindleFireAccessories()
/*       */     {
/* 12458 */       return this.kindleFireAccessories;
/*       */     }
/*       */ 
/*       */     public void setKindleFireAccessories(KindleFireAccessories value)
/*       */     {
/* 12470 */       this.kindleFireAccessories = value;
/*       */     }
/*       */ 
/*       */     public MediaPlayer getMediaPlayer()
/*       */     {
/* 12482 */       return this.mediaPlayer;
/*       */     }
/*       */ 
/*       */     public void setMediaPlayer(MediaPlayer value)
/*       */     {
/* 12494 */       this.mediaPlayer = value;
/*       */     }
/*       */ 
/*       */     public MediaPlayerOrEReaderAccessory getMediaPlayerOrEReaderAccessory()
/*       */     {
/* 12506 */       return this.mediaPlayerOrEReaderAccessory;
/*       */     }
/*       */ 
/*       */     public void setMediaPlayerOrEReaderAccessory(MediaPlayerOrEReaderAccessory value)
/*       */     {
/* 12518 */       this.mediaPlayerOrEReaderAccessory = value;
/*       */     }
/*       */ 
/*       */     public MediaStorage getMediaStorage()
/*       */     {
/* 12530 */       return this.mediaStorage;
/*       */     }
/*       */ 
/*       */     public void setMediaStorage(MediaStorage value)
/*       */     {
/* 12542 */       this.mediaStorage = value;
/*       */     }
/*       */ 
/*       */     public MiscAudioComponents getMiscAudioComponents()
/*       */     {
/* 12554 */       return this.miscAudioComponents;
/*       */     }
/*       */ 
/*       */     public void setMiscAudioComponents(MiscAudioComponents value)
/*       */     {
/* 12566 */       this.miscAudioComponents = value;
/*       */     }
/*       */ 
/*       */     public PC getPC()
/*       */     {
/* 12578 */       return this.pc;
/*       */     }
/*       */ 
/*       */     public void setPC(PC value)
/*       */     {
/* 12590 */       this.pc = value;
/*       */     }
/*       */ 
/*       */     public PDA getPDA()
/*       */     {
/* 12602 */       return this.pda;
/*       */     }
/*       */ 
/*       */     public void setPDA(PDA value)
/*       */     {
/* 12614 */       this.pda = value;
/*       */     }
/*       */ 
/*       */     public Phone getPhone()
/*       */     {
/* 12626 */       return this.phone;
/*       */     }
/*       */ 
/*       */     public void setPhone(Phone value)
/*       */     {
/* 12638 */       this.phone = value;
/*       */     }
/*       */ 
/*       */     public PhoneAccessory getPhoneAccessory()
/*       */     {
/* 12650 */       return this.phoneAccessory;
/*       */     }
/*       */ 
/*       */     public void setPhoneAccessory(PhoneAccessory value)
/*       */     {
/* 12662 */       this.phoneAccessory = value;
/*       */     }
/*       */ 
/*       */     public PhotographicStudioItems getPhotographicStudioItems()
/*       */     {
/* 12674 */       return this.photographicStudioItems;
/*       */     }
/*       */ 
/*       */     public void setPhotographicStudioItems(PhotographicStudioItems value)
/*       */     {
/* 12686 */       this.photographicStudioItems = value;
/*       */     }
/*       */ 
/*       */     public PortableAudio getPortableAudio()
/*       */     {
/* 12698 */       return this.portableAudio;
/*       */     }
/*       */ 
/*       */     public void setPortableAudio(PortableAudio value)
/*       */     {
/* 12710 */       this.portableAudio = value;
/*       */     }
/*       */ 
/*       */     public PortableAvDevice getPortableAvDevice()
/*       */     {
/* 12722 */       return this.portableAvDevice;
/*       */     }
/*       */ 
/*       */     public void setPortableAvDevice(PortableAvDevice value)
/*       */     {
/* 12734 */       this.portableAvDevice = value;
/*       */     }
/*       */ 
/*       */     public PowerSuppliesOrProtection getPowerSuppliesOrProtection()
/*       */     {
/* 12746 */       return this.powerSuppliesOrProtection;
/*       */     }
/*       */ 
/*       */     public void setPowerSuppliesOrProtection(PowerSuppliesOrProtection value)
/*       */     {
/* 12758 */       this.powerSuppliesOrProtection = value;
/*       */     }
/*       */ 
/*       */     public RadarDetector getRadarDetector()
/*       */     {
/* 12770 */       return this.radarDetector;
/*       */     }
/*       */ 
/*       */     public void setRadarDetector(RadarDetector value)
/*       */     {
/* 12782 */       this.radarDetector = value;
/*       */     }
/*       */ 
/*       */     public RadioOrClockRadio getRadioOrClockRadio()
/*       */     {
/* 12794 */       return this.radioOrClockRadio;
/*       */     }
/*       */ 
/*       */     public void setRadioOrClockRadio(RadioOrClockRadio value)
/*       */     {
/* 12806 */       this.radioOrClockRadio = value;
/*       */     }
/*       */ 
/*       */     public ReceiverOrAmplifier getReceiverOrAmplifier()
/*       */     {
/* 12818 */       return this.receiverOrAmplifier;
/*       */     }
/*       */ 
/*       */     public void setReceiverOrAmplifier(ReceiverOrAmplifier value)
/*       */     {
/* 12830 */       this.receiverOrAmplifier = value;
/*       */     }
/*       */ 
/*       */     public RemoteControl getRemoteControl()
/*       */     {
/* 12842 */       return this.remoteControl;
/*       */     }
/*       */ 
/*       */     public void setRemoteControl(RemoteControl value)
/*       */     {
/* 12854 */       this.remoteControl = value;
/*       */     }
/*       */ 
/*       */     public Speakers getSpeakers()
/*       */     {
/* 12866 */       return this.speakers;
/*       */     }
/*       */ 
/*       */     public void setSpeakers(Speakers value)
/*       */     {
/* 12878 */       this.speakers = value;
/*       */     }
/*       */ 
/*       */     public StereoShelfSystem getStereoShelfSystem()
/*       */     {
/* 12890 */       return this.stereoShelfSystem;
/*       */     }
/*       */ 
/*       */     public void setStereoShelfSystem(StereoShelfSystem value)
/*       */     {
/* 12902 */       this.stereoShelfSystem = value;
/*       */     }
/*       */ 
/*       */     public CETelescope getCETelescope()
/*       */     {
/* 12914 */       return this.ceTelescope;
/*       */     }
/*       */ 
/*       */     public void setCETelescope(CETelescope value)
/*       */     {
/* 12926 */       this.ceTelescope = value;
/*       */     }
/*       */ 
/*       */     public Television getTelevision()
/*       */     {
/* 12938 */       return this.television;
/*       */     }
/*       */ 
/*       */     public void setTelevision(Television value)
/*       */     {
/* 12950 */       this.television = value;
/*       */     }
/*       */ 
/*       */     public Tuner getTuner()
/*       */     {
/* 12962 */       return this.tuner;
/*       */     }
/*       */ 
/*       */     public void setTuner(Tuner value)
/*       */     {
/* 12974 */       this.tuner = value;
/*       */     }
/*       */ 
/*       */     public TVCombos getTVCombos()
/*       */     {
/* 12986 */       return this.tvCombos;
/*       */     }
/*       */ 
/*       */     public void setTVCombos(TVCombos value)
/*       */     {
/* 12998 */       this.tvCombos = value;
/*       */     }
/*       */ 
/*       */     public TwoWayRadio getTwoWayRadio()
/*       */     {
/* 13010 */       return this.twoWayRadio;
/*       */     }
/*       */ 
/*       */     public void setTwoWayRadio(TwoWayRadio value)
/*       */     {
/* 13022 */       this.twoWayRadio = value;
/*       */     }
/*       */ 
/*       */     public VCR getVCR()
/*       */     {
/* 13034 */       return this.vcr;
/*       */     }
/*       */ 
/*       */     public void setVCR(VCR value)
/*       */     {
/* 13046 */       this.vcr = value;
/*       */     }
/*       */ 
/*       */     public CEVideoProjector getCEVideoProjector()
/*       */     {
/* 13058 */       return this.ceVideoProjector;
/*       */     }
/*       */ 
/*       */     public void setCEVideoProjector(CEVideoProjector value)
/*       */     {
/* 13070 */       this.ceVideoProjector = value;
/*       */     }
/*       */ 
/*       */     public VideoProjectorsAndAccessories getVideoProjectorsAndAccessories()
/*       */     {
/* 13082 */       return this.videoProjectorsAndAccessories;
/*       */     }
/*       */ 
/*       */     public void setVideoProjectorsAndAccessories(VideoProjectorsAndAccessories value)
/*       */     {
/* 13094 */       this.videoProjectorsAndAccessories = value;
/*       */     }
/*       */   }
/*       */ 
/*       */   @XmlAccessorType(XmlAccessType.FIELD)
/*       */   @XmlType(name="", propOrder={"value"})
/*       */   public static class PortedBoxVolume
/*       */   {
/*       */ 
/*       */     @XmlValue
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String value;
/*       */ 
/*       */     @XmlAttribute(name="unitOfMeasure", required=true)
/*       */     protected VolumeUnitOfMeasure unitOfMeasure;
/*       */ 
/*       */     public String getValue()
/*       */     {
/* 11435 */       return this.value;
/*       */     }
/*       */ 
/*       */     public void setValue(String value)
/*       */     {
/* 11447 */       this.value = value;
/*       */     }
/*       */ 
/*       */     public VolumeUnitOfMeasure getUnitOfMeasure()
/*       */     {
/* 11459 */       return this.unitOfMeasure;
/*       */     }
/*       */ 
/*       */     public void setUnitOfMeasure(VolumeUnitOfMeasure value)
/*       */     {
/* 11471 */       this.unitOfMeasure = value;
/*       */     }
/*       */   }
/*       */ 
/*       */   @XmlAccessorType(XmlAccessType.FIELD)
/*       */   @XmlType(name="", propOrder={"value"})
/*       */   public static class DataTransferRate
/*       */   {
/*       */ 
/*       */     @XmlValue
/*       */     @XmlSchemaType(name="nonNegativeInteger")
/*       */     protected BigInteger value;
/*       */ 
/*       */     @XmlAttribute(name="unitOfMeasure", required=true)
/*       */     protected DataTransferUnitOfMeasure unitOfMeasure;
/*       */ 
/*       */     public BigInteger getValue()
/*       */     {
/* 11355 */       return this.value;
/*       */     }
/*       */ 
/*       */     public void setValue(BigInteger value)
/*       */     {
/* 11367 */       this.value = value;
/*       */     }
/*       */ 
/*       */     public DataTransferUnitOfMeasure getUnitOfMeasure()
/*       */     {
/* 11379 */       return this.unitOfMeasure;
/*       */     }
/*       */ 
/*       */     public void setUnitOfMeasure(DataTransferUnitOfMeasure value)
/*       */     {
/* 11391 */       this.unitOfMeasure = value;
/*       */     }
/*       */   }
/*       */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.CE
 * JD-Core Version:    0.6.2
 */