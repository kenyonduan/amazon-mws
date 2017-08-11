
package com.elcuk.jaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.elcuk.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProcessorBrand_QNAME = new QName("", "ProcessorBrand");
    private final static QName _MaxMemorySupported_QNAME = new QName("", "MaxMemorySupported");
    private final static QName _InputVideoConnectors_QNAME = new QName("", "InputVideoConnectors");
    private final static QName _PowerConsumption_QNAME = new QName("", "PowerConsumption");
    private final static QName _MaximumOperatingDistance_QNAME = new QName("", "MaximumOperatingDistance");
    private final static QName _PowerSource_QNAME = new QName("", "PowerSource");
    private final static QName _RAMSize_QNAME = new QName("", "RAMSize");
    private final static QName _CableInterface_QNAME = new QName("", "CableInterface");
    private final static QName _DriveRPM_QNAME = new QName("", "DriveRPM");
    private final static QName _DockingStationExternalInterface_QNAME = new QName("", "DockingStationExternalInterface");
    private final static QName _NumberOfLPT1PrinterPorts_QNAME = new QName("", "NumberOfLPT1PrinterPorts");
    private final static QName _SVideoInputType_QNAME = new QName("", "SVideoInputType");
    private final static QName _FanPowerConnector_QNAME = new QName("", "FanPowerConnector");
    private final static QName _FixedFocalLength_QNAME = new QName("", "FixedFocalLength");
    private final static QName _Averageseektime_QNAME = new QName("", "Averageseektime");
    private final static QName _WirelessTechnology_QNAME = new QName("", "WirelessTechnology");
    private final static QName _DisplayResolutionMaximum_QNAME = new QName("", "DisplayResolutionMaximum");
    private final static QName _NumberOfButtons_QNAME = new QName("", "NumberOfButtons");
    private final static QName _SpeedRating_QNAME = new QName("", "SpeedRating");
    private final static QName _MemoryStorageCapacity_QNAME = new QName("", "MemoryStorageCapacity");
    private final static QName _BluRayRegion_QNAME = new QName("", "BluRayRegion");
    private final static QName _ShaderClock_QNAME = new QName("", "ShaderClock");
    private final static QName _NoiseReductionLevel_QNAME = new QName("", "NoiseReductionLevel");
    private final static QName _MinShutterSpeed_QNAME = new QName("", "MinShutterSpeed");
    private final static QName _TotalNumberOfInternalBays_QNAME = new QName("", "TotalNumberOfInternalBays");
    private final static QName _RAMFormFactor_QNAME = new QName("", "RAMFormFactor");
    private final static QName _ThreeDTechnology_QNAME = new QName("", "ThreeDTechnology");
    private final static QName _CasLatency_QNAME = new QName("", "CasLatency");
    private final static QName _HardwarePlatform_QNAME = new QName("", "HardwarePlatform");
    private final static QName _TabletSurfaceActiveArea_QNAME = new QName("", "TabletSurfaceActiveArea");
    private final static QName _HardDriveSize_QNAME = new QName("", "HardDriveSize");
    private final static QName _NumberOfPorts_QNAME = new QName("", "NumberOfPorts");
    private final static QName _MemorySlotsAvailable_QNAME = new QName("", "MemorySlotsAvailable");
    private final static QName _StorageMaterialType_QNAME = new QName("", "StorageMaterialType");
    private final static QName _TVTunerVideoOutputInterface_QNAME = new QName("", "TVTunerVideoOutputInterface");
    private final static QName _ExpansionSlots_QNAME = new QName("", "ExpansionSlots");
    private final static QName _DigitalZoom_QNAME = new QName("", "DigitalZoom");
    private final static QName _GraphicsCardMaxResolution_QNAME = new QName("", "GraphicsCardMaxResolution");
    private final static QName _LargestFanSize_QNAME = new QName("", "LargestFanSize");
    private final static QName _TunerTechnology_QNAME = new QName("", "TunerTechnology");
    private final static QName _MaxDownstreamTransmissionRate_QNAME = new QName("", "MaxDownstreamTransmissionRate");
    private final static QName _ReadSpeed_QNAME = new QName("", "ReadSpeed");
    private final static QName _PowerPlugType_QNAME = new QName("", "PowerPlugType");
    private final static QName _AntennaLocation_QNAME = new QName("", "AntennaLocation");
    private final static QName _NumberOfSerialPorts_QNAME = new QName("", "NumberOfSerialPorts");
    private final static QName _PrimaryHeadphoneUse_QNAME = new QName("", "PrimaryHeadphoneUse");
    private final static QName _Speaker_QNAME = new QName("", "Speaker");
    private final static QName _ProjectionMethod_QNAME = new QName("", "ProjectionMethod");
    private final static QName _ComputerMemoryFormFactor_QNAME = new QName("", "ComputerMemoryFormFactor");
    private final static QName _PressureLevels_QNAME = new QName("", "PressureLevels");
    private final static QName _TotalMiniHDMIPorts_QNAME = new QName("", "TotalMiniHDMIPorts");
    private final static QName _FlashModesDescription_QNAME = new QName("", "FlashModesDescription");
    private final static QName _TweeterDriverDiameter_QNAME = new QName("", "TweeterDriverDiameter");
    private final static QName _DurationOfMapService_QNAME = new QName("", "DurationOfMapService");
    private final static QName _MediaLayers_QNAME = new QName("", "MediaLayers");
    private final static QName _FrontWebcamResolution_QNAME = new QName("", "FrontWebcamResolution");
    private final static QName _PhotoFilterMountType_QNAME = new QName("", "PhotoFilterMountType");
    private final static QName _TotalFrontPanelUSB11Ports_QNAME = new QName("", "TotalFrontPanelUSB1.1Ports");
    private final static QName _USBPortType_QNAME = new QName("", "USBPortType");
    private final static QName _BatteryChargeCycles_QNAME = new QName("", "BatteryChargeCycles");
    private final static QName _BaseLength_QNAME = new QName("", "BaseLength");
    private final static QName _Audio_QNAME = new QName("", "Audio");
    private final static QName _ThreeDReady_QNAME = new QName("", "ThreeDReady");
    private final static QName _CompatibleDeviceSize_QNAME = new QName("", "CompatibleDeviceSize");
    private final static QName _ProductTaxCode_QNAME = new QName("", "ProductTaxCode");
    private final static QName _OpticalDriveIntegrated_QNAME = new QName("", "OpticalDriveIntegrated");
    private final static QName _WebcamVideoCaptureResolution_QNAME = new QName("", "WebcamVideoCaptureResolution");
    private final static QName _ImageStabilization_QNAME = new QName("", "ImageStabilization");
    private final static QName _MotherboardFormFactor_QNAME = new QName("", "MotherboardFormFactor");
    private final static QName _NumberOfeSATAPorts_QNAME = new QName("", "NumberOfeSATAPorts");
    private final static QName _FocusType_QNAME = new QName("", "FocusType");
    private final static QName _CableType_QNAME = new QName("", "CableType");
    private final static QName _WirelessInputDeviceTechnology_QNAME = new QName("", "WirelessInputDeviceTechnology");
    private final static QName _CPUSocketType_QNAME = new QName("", "CPUSocketType");
    private final static QName _MaxAperture_QNAME = new QName("", "MaxAperture");
    private final static QName _MerchantFulfillmentID_QNAME = new QName("", "MerchantFulfillmentID");
    private final static QName _PlatformCompatability_QNAME = new QName("", "PlatformCompatability");
    private final static QName _ProcessorCoolingDevice_QNAME = new QName("", "ProcessorCoolingDevice");
    private final static QName _TotalUSB10Connectors_QNAME = new QName("", "TotalUSB1.0Connectors");
    private final static QName _NASNetworkInterface_QNAME = new QName("", "NASNetworkInterface");
    private final static QName _CameraFilmSpeed_QNAME = new QName("", "CameraFilmSpeed");
    private final static QName _ConnectionType_QNAME = new QName("", "ConnectionType");
    private final static QName _TotalUSB30Connectors_QNAME = new QName("", "TotalUSB3.0Connectors");
    private final static QName _MarketplaceName_QNAME = new QName("", "MarketplaceName");
    private final static QName _MemoryStandard_QNAME = new QName("", "MemoryStandard");
    private final static QName _NumberOfSATAPorts_QNAME = new QName("", "NumberOfSATAPorts");
    private final static QName _MountingType_QNAME = new QName("", "MountingType");
    private final static QName _SubscriptionTermName_QNAME = new QName("", "SubscriptionTermName");
    private final static QName _MinimumSupportedScreenSize_QNAME = new QName("", "MinimumSupportedScreenSize");
    private final static QName _ContrastRatio_QNAME = new QName("", "ContrastRatio");
    private final static QName _TotalCompositePorts_QNAME = new QName("", "TotalCompositePorts");
    private final static QName _HeadphoneStyle_QNAME = new QName("", "HeadphoneStyle");
    private final static QName _InputDeviceInterfaceTechnology_QNAME = new QName("", "InputDeviceInterfaceTechnology");
    private final static QName _NumberOfGamingPorts_QNAME = new QName("", "NumberOfGamingPorts");
    private final static QName _MaxEthernetSpeed_QNAME = new QName("", "MaxEthernetSpeed");
    private final static QName _OperatingSystem_QNAME = new QName("", "OperatingSystem");
    private final static QName _CoreClock_QNAME = new QName("", "CoreClock");
    private final static QName _SATARAID_QNAME = new QName("", "SATARAID");
    private final static QName _ProcessorType_QNAME = new QName("", "ProcessorType");
    private final static QName _MultiGPUTechnology_QNAME = new QName("", "MultiGPUTechnology");
    private final static QName _NumberOfUSB20Ports_QNAME = new QName("", "NumberOfUSB2.0Ports");
    private final static QName _InputDeviceDesignStyle_QNAME = new QName("", "InputDeviceDesignStyle");
    private final static QName _TotalDVIPorts_QNAME = new QName("", "TotalDVIPorts");
    private final static QName _Language_QNAME = new QName("", "Language");
    private final static QName _NetworkingProtocol_QNAME = new QName("", "NetworkingProtocol");
    private final static QName _AmplifierType_QNAME = new QName("", "AmplifierType");
    private final static QName _ComputerWirelessType_QNAME = new QName("", "ComputerWirelessType");
    private final static QName _SignalPassthroughTechnology_QNAME = new QName("", "SignalPassthroughTechnology");
    private final static QName _MaxWeightRecommendation_QNAME = new QName("", "MaxWeightRecommendation");
    private final static QName _PrintingMediaType_QNAME = new QName("", "PrintingMediaType");
    private final static QName _VideoUpconversionTechnologies_QNAME = new QName("", "VideoUpconversionTechnologies");
    private final static QName _NumberOfSATAPowerConnectors_QNAME = new QName("", "NumberOfSATAPowerConnectors");
    private final static QName _NumberOfHDMIPorts_QNAME = new QName("", "NumberOfHDMIPorts");
    private final static QName _MinimumSystemRequirements_QNAME = new QName("", "MinimumSystemRequirements");
    private final static QName _FlashDedication_QNAME = new QName("", "FlashDedication");
    private final static QName _ImageSensor_QNAME = new QName("", "ImageSensor");
    private final static QName _BufferSize_QNAME = new QName("", "BufferSize");
    private final static QName _CacheSize_QNAME = new QName("", "CacheSize");
    private final static QName _CPUSocketCompatability_QNAME = new QName("", "CPUSocketCompatability");
    private final static QName _HasProgrammableButtons_QNAME = new QName("", "HasProgrammableButtons");
    private final static QName _SKU_QNAME = new QName("", "SKU");
    private final static QName _NumberOfFirewirePorts_QNAME = new QName("", "NumberOfFirewirePorts");
    private final static QName _TotalNumberOfExternalBays_QNAME = new QName("", "TotalNumberOfExternalBays");
    private final static QName _NumberOfPS2Ports_QNAME = new QName("", "NumberOfPS2Ports");
    private final static QName _SpeakersNominalOutputPower_QNAME = new QName("", "SpeakersNominalOutputPower");
    private final static QName _PhotoFilterEffectSize_QNAME = new QName("", "PhotoFilterEffectSize");
    private final static QName _MaximumVerticalRefreshRate_QNAME = new QName("", "MaximumVerticalRefreshRate");
    private final static QName _SpeakersMaximumOutputPower_QNAME = new QName("", "SpeakersMaximumOutputPower");
    private final static QName _CalibrationTechnology_QNAME = new QName("", "CalibrationTechnology");
    private final static QName _Address_QNAME = new QName("", "Address");
    private final static QName _CompatibleMemoryCard_QNAME = new QName("", "CompatibleMemoryCard");
    private final static QName _PowerFactorCorrection_QNAME = new QName("", "PowerFactorCorrection");
    private final static QName _HasColorScreen_QNAME = new QName("", "HasColorScreen");
    private final static QName _BoxContents_QNAME = new QName("", "BoxContents");
    private final static QName _PCIExpressConnectorConfiguration_QNAME = new QName("", "PCIExpressConnectorConfiguration");
    private final static QName _ShipOption_QNAME = new QName("", "ShipOption");
    private final static QName _TotalPreampOutputs_QNAME = new QName("", "TotalPreampOutputs");
    private final static QName _TotalMicrophonePorts_QNAME = new QName("", "TotalMicrophonePorts");
    private final static QName _ConnectorNumber_QNAME = new QName("", "ConnectorNumber");
    private final static QName _InternetApplications_QNAME = new QName("", "InternetApplications");
    private final static QName _TotalFrontPanelUSB30Ports_QNAME = new QName("", "TotalFrontPanelUSB3.0Ports");
    private final static QName _DVDRegion_QNAME = new QName("", "DVDRegion");
    private final static QName _ThrowRatio_QNAME = new QName("", "ThrowRatio");
    private final static QName _ScreenResolution_QNAME = new QName("", "ScreenResolution");
    private final static QName _Denomination_QNAME = new QName("", "Denomination");
    private final static QName _DeliveryChannel_QNAME = new QName("", "DeliveryChannel");
    private final static QName _PhotoFilterBayonetSize_QNAME = new QName("", "PhotoFilterBayonetSize");
    private final static QName _MemoryCardType_QNAME = new QName("", "MemoryCardType");
    private final static QName _TabletInputMethod_QNAME = new QName("", "TabletInputMethod");
    private final static QName _MaxUpstreamTransmissionRate_QNAME = new QName("", "MaxUpstreamTransmissionRate");
    private final static QName _ScreenTrigger_QNAME = new QName("", "ScreenTrigger");
    private final static QName _ZoomType_QNAME = new QName("", "ZoomType");
    private final static QName _TotalFirewire800Connectors_QNAME = new QName("", "TotalFirewire800Connectors");
    private final static QName _TweeterSpeakerDiameter_QNAME = new QName("", "TweeterSpeakerDiameter");
    private final static QName _ColorMap_QNAME = new QName("", "ColorMap");
    private final static QName _SoundCardInterface_QNAME = new QName("", "SoundCardInterface");
    private final static QName _TotalVideoOutPorts_QNAME = new QName("", "TotalVideoOutPorts");
    private final static QName _FrontPanelInputs_QNAME = new QName("", "FrontPanelInputs");
    private final static QName _RemoteIncluded_QNAME = new QName("", "RemoteIncluded");
    private final static QName _TotalFirewire400Connectors_QNAME = new QName("", "TotalFirewire400Connectors");
    private final static QName _TotalComponentInPorts_QNAME = new QName("", "TotalComponentInPorts");
    private final static QName _AmazonOrderItemCode_QNAME = new QName("", "AmazonOrderItemCode");
    private final static QName _SpeakerGrilleMaterial_QNAME = new QName("", "SpeakerGrilleMaterial");
    private final static QName _PhotoFilterDropInSize_QNAME = new QName("", "PhotoFilterDropInSize");
    private final static QName _KeystoneCorrection_QNAME = new QName("", "KeystoneCorrection");
    private final static QName _GraphicsCardCooler_QNAME = new QName("", "GraphicsCardCooler");
    private final static QName _KeyboardDescription_QNAME = new QName("", "KeyboardDescription");
    private final static QName _AudioEncoding_QNAME = new QName("", "AudioEncoding");
    private final static QName _ResponseTime_QNAME = new QName("", "ResponseTime");
    private final static QName _SSDConnectorPins_QNAME = new QName("", "SSDConnectorPins");
    private final static QName _NumberOfSpeakers_QNAME = new QName("", "NumberOfSpeakers");
    private final static QName _LampWattage_QNAME = new QName("", "LampWattage");
    private final static QName _NumberOfSatelliteSpeakers_QNAME = new QName("", "NumberOfSatelliteSpeakers");
    private final static QName _AmazonOrderID_QNAME = new QName("", "AmazonOrderID");
    private final static QName _NumberOfEthernetPorts_QNAME = new QName("", "NumberOfEthernetPorts");
    private final static QName _SLICertification_QNAME = new QName("", "SLICertification");
    private final static QName _Averagelatency_QNAME = new QName("", "Averagelatency");
    private final static QName _ConnectivityType_QNAME = new QName("", "ConnectivityType");
    private final static QName _DeviceHardwareCompatability_QNAME = new QName("", "DeviceHardwareCompatability");
    private final static QName _CarrierCode_QNAME = new QName("", "CarrierCode");
    private final static QName _BiAmpable_QNAME = new QName("", "BiAmpable");
    private final static QName _SubwooferPowerTechnology_QNAME = new QName("", "SubwooferPowerTechnology");
    private final static QName _TotalFrontPaneleSataPorts_QNAME = new QName("", "TotalFrontPaneleSataPorts");
    private final static QName _ProcessorCount_QNAME = new QName("", "ProcessorCount");
    private final static QName _ComputerMemoryTechnology_QNAME = new QName("", "ComputerMemoryTechnology");
    private final static QName _TabletResolution_QNAME = new QName("", "TabletResolution");
    private final static QName _SpeakerMaximumInputPower_QNAME = new QName("", "SpeakerMaximumInputPower");
    private final static QName _TotalVgaInPorts_QNAME = new QName("", "TotalVgaInPorts");
    private final static QName _InterfaceType_QNAME = new QName("", "InterfaceType");
    private final static QName _ParentalControlTechnology_QNAME = new QName("", "ParentalControlTechnology");
    private final static QName _ImageDiagonalSize_QNAME = new QName("", "ImageDiagonalSize");
    private final static QName _MaximumSupportedScreenSize_QNAME = new QName("", "MaximumSupportedScreenSize");
    private final static QName _MaxFocalLength_QNAME = new QName("", "MaxFocalLength");
    private final static QName _WirelessStandard_QNAME = new QName("", "WirelessStandard");
    private final static QName _SpeakerCount_QNAME = new QName("", "SpeakerCount");
    private final static QName _AntennaDescription_QNAME = new QName("", "AntennaDescription");
    private final static QName _NumberOfLithiumMetalCells_QNAME = new QName("", "NumberOfLithiumMetalCells");
    private final static QName _NetworkAdapterType_QNAME = new QName("", "NetworkAdapterType");
    private final static QName _SpeakerDiameter_QNAME = new QName("", "SpeakerDiameter");
    private final static QName _TotalUSB20Connectors_QNAME = new QName("", "TotalUSB2.0Connectors");
    private final static QName _HotswapBayType_QNAME = new QName("", "HotswapBayType");
    private final static QName _ACAdapterCurrent_QNAME = new QName("", "ACAdapterCurrent");
    private final static QName _MaximumHorizontalVideoResolution_QNAME = new QName("", "MaximumHorizontalVideoResolution");
    private final static QName _TweeterSpeakerMaterial_QNAME = new QName("", "TweeterSpeakerMaterial");
    private final static QName _NumberOfUSBHubConnectorPorts_QNAME = new QName("", "NumberOfUSBHubConnectorPorts");
    private final static QName _MaximumThrowRatio_QNAME = new QName("", "MaximumThrowRatio");
    private final static QName _CableSpeed_QNAME = new QName("", "CableSpeed");
    private final static QName _NumberOfexternalBays_QNAME = new QName("", "NumberOfexternalBays");
    private final static QName _InternalConnector_QNAME = new QName("", "InternalConnector");
    private final static QName _MinimumVerticalRefreshRate_QNAME = new QName("", "MinimumVerticalRefreshRate");
    private final static QName _MountMotion_QNAME = new QName("", "MountMotion");
    private final static QName _MerchantPromotionID_QNAME = new QName("", "MerchantPromotionID");
    private final static QName _TotalFrontPanelAudioInPorts_QNAME = new QName("", "TotalFrontPanelAudioInPorts");
    private final static QName _HasAutoFocus_QNAME = new QName("", "HasAutoFocus");
    private final static QName _RecordingCapacity_QNAME = new QName("", "RecordingCapacity");
    private final static QName _ViewingAngle_QNAME = new QName("", "ViewingAngle");
    private final static QName _LANPortBandwidth_QNAME = new QName("", "LANPortBandwidth");
    private final static QName _Remote_QNAME = new QName("", "Remote");
    private final static QName _ComputerMemoryType_QNAME = new QName("", "ComputerMemoryType");
    private final static QName _FanIncluded_QNAME = new QName("", "FanIncluded");
    private final static QName _URacksize_QNAME = new QName("", "URacksize");
    private final static QName _TotalSVideoInPorts_QNAME = new QName("", "TotalSVideoInPorts");
    private final static QName _ProcessorSeries_QNAME = new QName("", "ProcessorSeries");
    private final static QName _MaxExpandedMemorySupported_QNAME = new QName("", "MaxExpandedMemorySupported");
    private final static QName _ProcessorSpeed_QNAME = new QName("", "ProcessorSpeed");
    private final static QName _HardDiskRotationalSpeed_QNAME = new QName("", "HardDiskRotationalSpeed");
    private final static QName _VerticalKeystoneCorrection_QNAME = new QName("", "VerticalKeystoneCorrection");
    private final static QName _MinimumImageSize_QNAME = new QName("", "MinimumImageSize");
    private final static QName _SPDIFOutput_QNAME = new QName("", "SPDIFOutput");
    private final static QName _PresentationRemoteOperatingDistance_QNAME = new QName("", "PresentationRemoteOperatingDistance");
    private final static QName _AdditionalFunctionality_QNAME = new QName("", "AdditionalFunctionality");
    private final static QName _Northbridge_QNAME = new QName("", "Northbridge");
    private final static QName _TVTunerVideoStandard_QNAME = new QName("", "TVTunerVideoStandard");
    private final static QName _PanelWindowLocation_QNAME = new QName("", "PanelWindowLocation");
    private final static QName _Series_QNAME = new QName("", "Series");
    private final static QName _Southbridge_QNAME = new QName("", "Southbridge");
    private final static QName _WirelessInputDeviceProtocol_QNAME = new QName("", "WirelessInputDeviceProtocol");
    private final static QName _PowerSupplyMaxOutput_QNAME = new QName("", "PowerSupplyMaxOutput");
    private final static QName _DigitalAudioCapacity_QNAME = new QName("", "DigitalAudioCapacity");
    private final static QName _FinishType_QNAME = new QName("", "FinishType");
    private final static QName _FanMaximumAirflow_QNAME = new QName("", "FanMaximumAirflow");
    private final static QName _GraphicsRAMType_QNAME = new QName("", "GraphicsRAMType");
    private final static QName _ACAdapterIncluded_QNAME = new QName("", "ACAdapterIncluded");
    private final static QName _ScreenDimensions_QNAME = new QName("", "ScreenDimensions");
    private final static QName _MerchantOrderItemID_QNAME = new QName("", "MerchantOrderItemID");
    private final static QName _WaterResistantDepth_QNAME = new QName("", "WaterResistantDepth");
    private final static QName _GraphicsCoProcessor_QNAME = new QName("", "GraphicsCoProcessor");
    private final static QName _NumberOfFans_QNAME = new QName("", "NumberOfFans");
    private final static QName _MaximumThrowDistance_QNAME = new QName("", "MaximumThrowDistance");
    private final static QName _ControllerType_QNAME = new QName("", "ControllerType");
    private final static QName _MaxShutterSpeed_QNAME = new QName("", "MaxShutterSpeed");
    private final static QName _HeadphoneFormFactor_QNAME = new QName("", "HeadphoneFormFactor");
    private final static QName _MaxMemorySpeed_QNAME = new QName("", "MaxMemorySpeed");
    private final static QName _MinimumThrowRatio_QNAME = new QName("", "MinimumThrowRatio");
    private final static QName _TotalEthernetPorts_QNAME = new QName("", "TotalEthernetPorts");
    private final static QName _SpeakerOutputChannelQuantity_QNAME = new QName("", "SpeakerOutputChannelQuantity");
    private final static QName _WooferSpeakerDiameter_QNAME = new QName("", "WooferSpeakerDiameter");
    private final static QName _HolderCapacity_QNAME = new QName("", "HolderCapacity");
    private final static QName _HDMIPorts_QNAME = new QName("", "HDMIPorts");
    private final static QName _LANPortNumber_QNAME = new QName("", "LANPortNumber");
    private final static QName _IncludedHarddrivedescription_QNAME = new QName("", "IncludedHarddrivedescription");
    private final static QName _TotalFirewirePorts_QNAME = new QName("", "TotalFirewirePorts");
    private final static QName _TotalHdmiPorts_QNAME = new QName("", "TotalHdmiPorts");
    private final static QName _NumberOfIDEPorts_QNAME = new QName("", "NumberOfIDEPorts");
    private final static QName _ComponentWriteSpeed_QNAME = new QName("", "ComponentWriteSpeed");
    private final static QName _WirelessDataTransferRate_QNAME = new QName("", "WirelessDataTransferRate");
    private final static QName _RAMTechnology_QNAME = new QName("", "RAMTechnology");
    private final static QName _OnboardVideo_QNAME = new QName("", "OnboardVideo");
    private final static QName _Averagewritetime_QNAME = new QName("", "Averagewritetime");
    private final static QName _HardDriveInterface_QNAME = new QName("", "HardDriveInterface");
    private final static QName _ChipsetType_QNAME = new QName("", "ChipsetType");
    private final static QName _CableLength_QNAME = new QName("", "CableLength");
    private final static QName _PhysicalHardDriveFormFactor_QNAME = new QName("", "PhysicalHardDriveFormFactor");
    private final static QName _NumberOfVGAPorts_QNAME = new QName("", "NumberOfVGAPorts");
    private final static QName _FrontSideBusSpeed_QNAME = new QName("", "FrontSideBusSpeed");
    private final static QName _OperatingSystemCompatability_QNAME = new QName("", "OperatingSystemCompatability");
    private final static QName _TrafficFeatures_QNAME = new QName("", "TrafficFeatures");
    private final static QName _TweeterSpeakerTechnology_QNAME = new QName("", "TweeterSpeakerTechnology");
    private final static QName _CompatibleDevices_QNAME = new QName("", "CompatibleDevices");
    private final static QName _CompatibleMountings_QNAME = new QName("", "CompatibleMountings");
    private final static QName _NumberOfDMIPorts_QNAME = new QName("", "NumberOfDMIPorts");
    private final static QName _MidRangeSpeakerDiameter_QNAME = new QName("", "MidRangeSpeakerDiameter");
    private final static QName _FitType_QNAME = new QName("", "FitType");
    private final static QName _ConnectorType_QNAME = new QName("", "ConnectorType");
    private final static QName _ViewFinderType_QNAME = new QName("", "ViewFinderType");
    private final static QName _ProcessorSocket_QNAME = new QName("", "ProcessorSocket");
    private final static QName _MultiChannelKit_QNAME = new QName("", "MultiChannelKit");
    private final static QName _GrilleRemoveability_QNAME = new QName("", "GrilleRemoveability");
    private final static QName _IPProtocolStandards_QNAME = new QName("", "IPProtocolStandards");
    private final static QName _MountBoltPattern_QNAME = new QName("", "MountBoltPattern");
    private final static QName _NumberOfHardDrives_QNAME = new QName("", "NumberOfHardDrives");
    private final static QName _AmazonCustomerID_QNAME = new QName("", "AmazonCustomerID");
    private final static QName _BuiltInMicrophone_QNAME = new QName("", "BuiltInMicrophone");
    private final static QName _OpticalZoom_QNAME = new QName("", "OpticalZoom");
    private final static QName _PresentationRemoteMemory_QNAME = new QName("", "PresentationRemoteMemory");
    private final static QName _TotalVGAOutPorts_QNAME = new QName("", "TotalVGAOutPorts");
    private final static QName _NumberOfDrivers_QNAME = new QName("", "NumberOfDrivers");
    private final static QName _RefreshRate_QNAME = new QName("", "RefreshRate");
    private final static QName _AdditionalFeatures_QNAME = new QName("", "AdditionalFeatures");
    private final static QName _FulfillmentMethod_QNAME = new QName("", "FulfillmentMethod");
    private final static QName _GraphicsCardMemoryInterface_QNAME = new QName("", "GraphicsCardMemoryInterface");
    private final static QName _BundledSoftware_QNAME = new QName("", "BundledSoftware");
    private final static QName _RAMClockSpeed_QNAME = new QName("", "RAMClockSpeed");
    private final static QName _Modular_QNAME = new QName("", "Modular");
    private final static QName _MaterialType_QNAME = new QName("", "MaterialType");
    private final static QName _OpticalStorageDeviceType_QNAME = new QName("", "OpticalStorageDeviceType");
    private final static QName _SampleRate_QNAME = new QName("", "SampleRate");
    private final static QName _Efficiency_QNAME = new QName("", "Efficiency");
    private final static QName _ExternalBayType_QNAME = new QName("", "ExternalBayType");
    private final static QName _NoiseCanceling_QNAME = new QName("", "NoiseCanceling");
    private final static QName _CacheMemory_QNAME = new QName("", "CacheMemory");
    private final static QName _BuiltInMedia_QNAME = new QName("", "BuiltInMedia");
    private final static QName _CheckpointTSAFriendly_QNAME = new QName("", "CheckpointTSAFriendly");
    private final static QName _GraphicsChipsetBrand_QNAME = new QName("", "GraphicsChipsetBrand");
    private final static QName _GraphicsRAMSize_QNAME = new QName("", "GraphicsRAMSize");
    private final static QName _InputVideoCompatability_QNAME = new QName("", "InputVideoCompatability");
    private final static QName _NumberOfHandsets_QNAME = new QName("", "NumberOfHandsets");
    private final static QName _NumberOfMicrophonePorts_QNAME = new QName("", "NumberOfMicrophonePorts");
    private final static QName _TweeterConeMaterialType_QNAME = new QName("", "TweeterConeMaterialType");
    private final static QName _PresentationRemoteLaserColor_QNAME = new QName("", "PresentationRemoteLaserColor");
    private final static QName _AutomaticBackupSoftwareIncluded_QNAME = new QName("", "AutomaticBackupSoftwareIncluded");
    private final static QName _CompatibleDeviceFormFactor_QNAME = new QName("", "CompatibleDeviceFormFactor");
    private final static QName _PrivacyScreenSize_QNAME = new QName("", "PrivacyScreenSize");
    private final static QName _AudioOutputMode_QNAME = new QName("", "AudioOutputMode");
    private final static QName _CharacterData_QNAME = new QName("", "CharacterData");
    private final static QName _MotherboardCompatibility_QNAME = new QName("", "MotherboardCompatibility");
    private final static QName _AnalogRGBInput_QNAME = new QName("", "AnalogRGBInput");
    private final static QName _MaxWebcamImageResolution_QNAME = new QName("", "MaxWebcamImageResolution");
    private final static QName _Conductor_QNAME = new QName("", "Conductor");
    private final static QName _TotalSubwooferOutputs_QNAME = new QName("", "TotalSubwooferOutputs");
    private final static QName _ConnectorGender_QNAME = new QName("", "ConnectorGender");
    private final static QName _TabletMaximumDataRate_QNAME = new QName("", "TabletMaximumDataRate");
    private final static QName _PhotoFilterLensSize_QNAME = new QName("", "PhotoFilterLensSize");
    private final static QName _NumberOfAudioOutPorts_QNAME = new QName("", "NumberOfAudioOutPorts");
    private final static QName _StorageReadSpeed_QNAME = new QName("", "StorageReadSpeed");
    private final static QName _GraphicsDescription_QNAME = new QName("", "GraphicsDescription");
    private final static QName _StorageWriteSpeed_QNAME = new QName("", "StorageWriteSpeed");
    private final static QName _ModemType_QNAME = new QName("", "ModemType");
    private final static QName _MaximumHorizontalRefreshRate_QNAME = new QName("", "MaximumHorizontalRefreshRate");
    private final static QName _ExternalCustomerID_QNAME = new QName("", "ExternalCustomerID");
    private final static QName _Channels_QNAME = new QName("", "Channels");
    private final static QName _TotalUSBPorts_QNAME = new QName("", "TotalUSBPorts");
    private final static QName _ScreenFinish_QNAME = new QName("", "ScreenFinish");
    private final static QName _AdditionalDrives_QNAME = new QName("", "AdditionalDrives");
    private final static QName _WirelessCarrier_QNAME = new QName("", "WirelessCarrier");
    private final static QName _SATAStandardsSupported_QNAME = new QName("", "SATAStandardsSupported");
    private final static QName _WaterResistantLevel_QNAME = new QName("", "WaterResistantLevel");
    private final static QName _SSDDriveArchitechture_QNAME = new QName("", "SSDDriveArchitechture");
    private final static QName _SimultaneousSessions_QNAME = new QName("", "SimultaneousSessions");
    private final static QName _GraphicsCardMemoryType_QNAME = new QName("", "GraphicsCardMemoryType");
    private final static QName _AudibleNoise_QNAME = new QName("", "AudibleNoise");
    private final static QName _PowerSupplyFormFactor_QNAME = new QName("", "PowerSupplyFormFactor");
    private final static QName _CoatingDescription_QNAME = new QName("", "CoatingDescription");
    private final static QName _GuideNumber_QNAME = new QName("", "GuideNumber");
    private final static QName _NumberOfRadioBandsSupported_QNAME = new QName("", "NumberOfRadioBandsSupported");
    private final static QName _TotalFrontPanelUSB20Ports_QNAME = new QName("", "TotalFrontPanelUSB2.0Ports");
    private final static QName _FanLED_QNAME = new QName("", "FanLED");
    private final static QName _TotalFirewire3200Connectors_QNAME = new QName("", "TotalFirewire3200Connectors");
    private final static QName _SurgeProtectionRating_QNAME = new QName("", "SurgeProtectionRating");
    private final static QName _TotalSataConnectors_QNAME = new QName("", "TotalSataConnectors");
    private final static QName _CoolingType_QNAME = new QName("", "CoolingType");
    private final static QName _MaximumApertureRange_QNAME = new QName("", "MaximumApertureRange");
    private final static QName _SoundCardMinSystemRequirements_QNAME = new QName("", "SoundCardMinSystemRequirements");
    private final static QName _NumberOfFireWire400Ports_QNAME = new QName("", "NumberOfFireWire400Ports");
    private final static QName _ZoomRatio_QNAME = new QName("", "ZoomRatio");
    private final static QName _DigitalMediaFormat_QNAME = new QName("", "DigitalMediaFormat");
    private final static QName _WooferSpeakerMaterial_QNAME = new QName("", "WooferSpeakerMaterial");
    private final static QName _AspectRatio_QNAME = new QName("", "AspectRatio");
    private final static QName _SoftwareIncluded_QNAME = new QName("", "SoftwareIncluded");
    private final static QName _CameraType_QNAME = new QName("", "CameraType");
    private final static QName _TVTunerMemory_QNAME = new QName("", "TVTunerMemory");
    private final static QName _TotalFrontPanelAudioOutPorts_QNAME = new QName("", "TotalFrontPanelAudioOutPorts");
    private final static QName _NumberOfInternalBays_QNAME = new QName("", "NumberOfInternalBays");
    private final static QName _CardReader_QNAME = new QName("", "CardReader");
    private final static QName _VideoShielded_QNAME = new QName("", "VideoShielded");
    private final static QName _MerchantOrderID_QNAME = new QName("", "MerchantOrderID");
    private final static QName _BatteryCellType_QNAME = new QName("", "BatteryCellType");
    private final static QName _ShipmentID_QNAME = new QName("", "ShipmentID");
    private final static QName _TotalFrontPanelUSB10Ports_QNAME = new QName("", "TotalFrontPanelUSB1.0Ports");
    private final static QName _BatteryPower_QNAME = new QName("", "BatteryPower");
    private final static QName _SpeakerSurroundSoundChannelConfiguration_QNAME = new QName("", "SpeakerSurroundSoundChannelConfiguration");
    private final static QName _TypeOfMemorySlot_QNAME = new QName("", "TypeOfMemorySlot");
    private final static QName _MountingPattern_QNAME = new QName("", "MountingPattern");
    private final static QName _InputType_QNAME = new QName("", "InputType");
    private final static QName _TabletMinimumSystemRequirements_QNAME = new QName("", "TabletMinimumSystemRequirements");
    private final static QName _RearWebcamResolution_QNAME = new QName("", "RearWebcamResolution");
    private final static QName _ControlType_QNAME = new QName("", "ControlType");
    private final static QName _SpeedClassRating_QNAME = new QName("", "SpeedClassRating");
    private final static QName _EuEnergyLabelEfficiencyClass_QNAME = new QName("", "EuEnergyLabelEfficiencyClass");
    private final static QName _Shape_QNAME = new QName("", "Shape");
    private final static QName _ProjectorBrightness_QNAME = new QName("", "ProjectorBrightness");
    private final static QName _TotalCoaxialInputs_QNAME = new QName("", "TotalCoaxialInputs");
    private final static QName _MaximumVerticalVideoResolution_QNAME = new QName("", "MaximumVerticalVideoResolution");
    private final static QName _TotalUSB11Connectors_QNAME = new QName("", "TotalUSB1.1Connectors");
    private final static QName _NumberOfUSB30Ports_QNAME = new QName("", "NumberOfUSB3.0Ports");
    private final static QName _PrinterWirelessType_QNAME = new QName("", "PrinterWirelessType");
    private final static QName _FanMaximumSpeed_QNAME = new QName("", "FanMaximumSpeed");
    private final static QName _FulfillmentCenterID_QNAME = new QName("", "FulfillmentCenterID");
    private final static QName _ScreenSize_QNAME = new QName("", "ScreenSize");
    private final static QName _HorizontalKeystoneCorrection_QNAME = new QName("", "HorizontalKeystoneCorrection");
    private final static QName _MediaInput_QNAME = new QName("", "MediaInput");
    private final static QName _EffectiveStillResolution_QNAME = new QName("", "EffectiveStillResolution");
    private final static QName _MaxWeightCapacity_QNAME = new QName("", "MaxWeightCapacity");
    private final static QName _OpticalDriveType_QNAME = new QName("", "OpticalDriveType");
    private final static QName _ContinuousShootingSpeed_QNAME = new QName("", "ContinuousShootingSpeed");
    private final static QName _SubwooferSpeakerMaterial_QNAME = new QName("", "SubwooferSpeakerMaterial");
    private final static QName _CameraFlash_QNAME = new QName("", "CameraFlash");
    private final static QName _PowerSupplyMounting_QNAME = new QName("", "PowerSupplyMounting");
    private final static QName _MonitorBrightness_QNAME = new QName("", "MonitorBrightness");
    private final static QName _CompatibleProcessorTypes_QNAME = new QName("", "CompatibleProcessorTypes");
    private final static QName _LampLife_QNAME = new QName("", "LampLife");
    private final static QName _PromotionClaimCode_QNAME = new QName("", "PromotionClaimCode");
    private final static QName _WirelessType_QNAME = new QName("", "WirelessType");
    private final static QName _VideoEncoding_QNAME = new QName("", "VideoEncoding");
    private final static QName _TotalNumberOfHotswapBays_QNAME = new QName("", "TotalNumberOfHotswapBays");
    private final static QName _SystemCabinetFormFactor_QNAME = new QName("", "SystemCabinetFormFactor");
    private final static QName _TotalFrontPanelFirewire400Ports_QNAME = new QName("", "TotalFrontPanelFirewire400Ports");
    private final static QName _TotalFrontPanelFirewire800Ports_QNAME = new QName("", "TotalFrontPanelFirewire800Ports");
    private final static QName _BuiltinSpeaker_QNAME = new QName("", "BuiltinSpeaker");
    private final static QName _EnclosureFinish_QNAME = new QName("", "EnclosureFinish");
    private final static QName _TotalHDMIPorts_QNAME = new QName("", "TotalHDMIPorts");
    private final static QName _FanMaximumNoiseLevel_QNAME = new QName("", "FanMaximumNoiseLevel");
    private final static QName _Wattage_QNAME = new QName("", "Wattage");
    private final static QName _MinimumHorizontalRefreshRate_QNAME = new QName("", "MinimumHorizontalRefreshRate");
    private final static QName _EffectiveInputArea_QNAME = new QName("", "EffectiveInputArea");
    private final static QName _InternalBayType_QNAME = new QName("", "InternalBayType");
    private final static QName _TotalSVideoOutPorts_QNAME = new QName("", "TotalSVideoOutPorts");
    private final static QName _TotalPowerOutlets_QNAME = new QName("", "TotalPowerOutlets");
    private final static QName _IncludedFeatures_QNAME = new QName("", "IncludedFeatures");
    private final static QName _SubwooferSpeakerDiameter_QNAME = new QName("", "SubwooferSpeakerDiameter");
    private final static QName _CameraDescription_QNAME = new QName("", "CameraDescription");
    private final static QName _OutputWattage_QNAME = new QName("", "OutputWattage");
    private final static QName _NotebookDisplayTechnology_QNAME = new QName("", "NotebookDisplayTechnology");
    private final static QName _HeatsinkMaterial_QNAME = new QName("", "HeatsinkMaterial");
    private final static QName _MinFocalLength_QNAME = new QName("", "MinFocalLength");
    private final static QName _ModelNumber_QNAME = new QName("", "ModelNumber");
    private final static QName _DeviceSoftwareCompatability_QNAME = new QName("", "DeviceSoftwareCompatability");
    private final static QName _MemoryCapacityPerSTICK_QNAME = new QName("", "MemoryCapacityPerSTICK");
    private final static QName _CommunicationInterface_QNAME = new QName("", "CommunicationInterface");
    private final static QName _HeadphoneEarcupMotion_QNAME = new QName("", "HeadphoneEarcupMotion");
    private final static QName _NumberOfMonitorConnections_QNAME = new QName("", "NumberOfMonitorConnections");
    private final static QName _GraphicsCardInterface_QNAME = new QName("", "GraphicsCardInterface");
    private final static QName _NumberOfMemorySticks_QNAME = new QName("", "NumberOfMemorySticks");
    private final static QName _HardDiskTechnology_QNAME = new QName("", "HardDiskTechnology");
    private final static QName _TrackingMethod_QNAME = new QName("", "TrackingMethod");
    private final static QName _RAID_QNAME = new QName("", "RAID");
    private final static QName _NumberOfPCIExpressSlots_QNAME = new QName("", "NumberOfPCIExpressSlots");
    private final static QName _AirDuctLocation_QNAME = new QName("", "AirDuctLocation");
    private final static QName _ScannerResolution_QNAME = new QName("", "ScannerResolution");
    private final static QName _NumberOfLithiumIonCells_QNAME = new QName("", "NumberOfLithiumIonCells");
    private final static QName _VideoCallingResolution_QNAME = new QName("", "VideoCallingResolution");
    private final static QName _WaypointsType_QNAME = new QName("", "WaypointsType");
    private final static QName _DisplayTechnology_QNAME = new QName("", "DisplayTechnology");
    private final static QName _EnergyEfficiencyRating_QNAME = new QName("", "EnergyEfficiencyRating");
    private final static QName _ConditionType_QNAME = new QName("", "ConditionType");
    private final static QName _Resolution_QNAME = new QName("", "Resolution");
    private final static QName _IsHotShoeIncluded_QNAME = new QName("", "IsHotShoeIncluded");
    private final static QName _CardReaderInterface_QNAME = new QName("", "CardReaderInterface");
    private final static QName _SpeakerOut_QNAME = new QName("", "SpeakerOut");
    private final static QName _ThreeDAPI_QNAME = new QName("", "ThreeDAPI");
    private final static QName _MonitorConnectors_QNAME = new QName("", "MonitorConnectors");
    private final static QName _HandOrientation_QNAME = new QName("", "HandOrientation");
    private final static QName _PrivacyScreenMaterialType_QNAME = new QName("", "PrivacyScreenMaterialType");
    private final static QName _ConnectorTypeUsedOnCable_QNAME = new QName("", "ConnectorTypeUsedOnCable");
    private final static QName _IntegratedAudioChannels_QNAME = new QName("", "IntegratedAudioChannels");
    private final static QName _Voltage_QNAME = new QName("", "Voltage");
    private final static QName _Zoom_QNAME = new QName("", "Zoom");
    private final static QName _MinimumThrowDistance_QNAME = new QName("", "MinimumThrowDistance");
    private final static QName _OpticalOut_QNAME = new QName("", "OpticalOut");
    private final static QName _EffectiveMemoryClock_QNAME = new QName("", "EffectiveMemoryClock");
    private final static QName _UniversalRemoteCode_QNAME = new QName("", "UniversalRemoteCode");
    private final static QName _DigitalStillResolution_QNAME = new QName("", "DigitalStillResolution");
    private final static QName _OpticalIn_QNAME = new QName("", "OpticalIn");
    private final static QName _VoltageRating_QNAME = new QName("", "VoltageRating");
    private final static QName _BaseWidth_QNAME = new QName("", "BaseWidth");
    private final static QName _MaximumWattage_QNAME = new QName("", "MaximumWattage");
    private final static QName _WirelessRouterTransmissionBand_QNAME = new QName("", "WirelessRouterTransmissionBand");
    private final static QName _FulfillmentServiceLevel_QNAME = new QName("", "FulfillmentServiceLevel");
    private final static QName _NumberOfFireWire800Ports_QNAME = new QName("", "NumberOfFireWire800Ports");
    private final static QName _MaximumImageSize_QNAME = new QName("", "MaximumImageSize");
    private final static QName _MainPowerConnector_QNAME = new QName("", "MainPowerConnector");
    private final static QName _PhotoFilterThreadSize_QNAME = new QName("", "PhotoFilterThreadSize");
    private final static QName _SecurityProtocol_QNAME = new QName("", "SecurityProtocol");
    private final static QName _FrequencyRange_QNAME = new QName("", "FrequencyRange");
    private final static QName _SubwooferWattage_QNAME = new QName("", "SubwooferWattage");
    private final static QName _NumberOfMemorySlots_QNAME = new QName("", "NumberOfMemorySlots");
    private final static QName _MinAperture_QNAME = new QName("", "MinAperture");
    private final static QName _ConnectionInterface_QNAME = new QName("", "ConnectionInterface");
    private final static QName _LineIn_QNAME = new QName("", "LineIn");
    private final static QName _MidRangeSpeakerMaterial_QNAME = new QName("", "MidRangeSpeakerMaterial");
    private final static QName _WriteSpeed_QNAME = new QName("", "WriteSpeed");
    private final static QName _TotalFirewire1600Connectors_QNAME = new QName("", "TotalFirewire1600Connectors");
    private final static QName _MovementDetectionTechnology_QNAME = new QName("", "MovementDetectionTechnology");
    private final static QName _NumberOfRecordingLoops_QNAME = new QName("", "NumberOfRecordingLoops");
    private final static QName _NumberOfUSBPorts_QNAME = new QName("", "NumberOfUSBPorts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.elcuk.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link CE }
     * 
     */
    public CE createCE() {
        return new CE();
    }

    /**
     * Create an instance of {@link Battery }
     * 
     */
    public Battery createBattery() {
        return new Battery();
    }

    /**
     * Create an instance of {@link KindleAccessories }
     * 
     */
    public KindleAccessories createKindleAccessories() {
        return new KindleAccessories();
    }

    /**
     * Create an instance of {@link BedAndBath }
     * 
     */
    public BedAndBath createBedAndBath() {
        return new BedAndBath();
    }

    /**
     * Create an instance of {@link OrganizersAndStorage }
     * 
     */
    public OrganizersAndStorage createOrganizersAndStorage() {
        return new OrganizersAndStorage();
    }

    /**
     * Create an instance of {@link Computers }
     * 
     */
    public Computers createComputers() {
        return new Computers();
    }

    /**
     * Create an instance of {@link TabletComputer }
     * 
     */
    public TabletComputer createTabletComputer() {
        return new TabletComputer();
    }

    /**
     * Create an instance of {@link OutdoorLiving }
     * 
     */
    public OutdoorLiving createOutdoorLiving() {
        return new OutdoorLiving();
    }

    /**
     * Create an instance of {@link Hardware }
     * 
     */
    public Hardware createHardware() {
        return new Hardware();
    }

    /**
     * Create an instance of {@link com.elcuk.jaxb.Home }
     * 
     */
    public com.elcuk.jaxb.Home createHome() {
        return new com.elcuk.jaxb.Home();
    }

    /**
     * Create an instance of {@link WirelessAccessories }
     * 
     */
    public WirelessAccessories createWirelessAccessories() {
        return new WirelessAccessories();
    }

    /**
     * Create an instance of {@link PlumbingFixtures }
     * 
     */
    public PlumbingFixtures createPlumbingFixtures() {
        return new PlumbingFixtures();
    }

    /**
     * Create an instance of {@link HomeImprovement }
     * 
     */
    public HomeImprovement createHomeImprovement() {
        return new HomeImprovement();
    }

    /**
     * Create an instance of {@link BuildingMaterials }
     * 
     */
    public BuildingMaterials createBuildingMaterials() {
        return new BuildingMaterials();
    }

    /**
     * Create an instance of {@link Lighting }
     * 
     */
    public Lighting createLighting() {
        return new Lighting();
    }

    /**
     * Create an instance of {@link SecurityElectronics }
     * 
     */
    public SecurityElectronics createSecurityElectronics() {
        return new SecurityElectronics();
    }

    /**
     * Create an instance of {@link LightBulbs }
     * 
     */
    public LightBulbs createLightBulbs() {
        return new LightBulbs();
    }

    /**
     * Create an instance of {@link Art }
     * 
     */
    public Art createArt() {
        return new Art();
    }

    /**
     * Create an instance of {@link MajorHomeAppliances }
     * 
     */
    public MajorHomeAppliances createMajorHomeAppliances() {
        return new MajorHomeAppliances();
    }

    /**
     * Create an instance of {@link PersonalComputer }
     * 
     */
    public PersonalComputer createPersonalComputer() {
        return new PersonalComputer();
    }

    /**
     * Create an instance of {@link FurnitureAndDecor }
     * 
     */
    public FurnitureAndDecor createFurnitureAndDecor() {
        return new FurnitureAndDecor();
    }

    /**
     * Create an instance of {@link KindleEReaderAccessories }
     * 
     */
    public KindleEReaderAccessories createKindleEReaderAccessories() {
        return new KindleEReaderAccessories();
    }

    /**
     * Create an instance of {@link SeedsAndPlants }
     * 
     */
    public SeedsAndPlants createSeedsAndPlants() {
        return new SeedsAndPlants();
    }

    /**
     * Create an instance of {@link LightsAndFixtures }
     * 
     */
    public LightsAndFixtures createLightsAndFixtures() {
        return new LightsAndFixtures();
    }

    /**
     * Create an instance of {@link NotebookComputer }
     * 
     */
    public NotebookComputer createNotebookComputer() {
        return new NotebookComputer();
    }

    /**
     * Create an instance of {@link Kitchen }
     * 
     */
    public Kitchen createKitchen() {
        return new Kitchen();
    }

    /**
     * Create an instance of {@link SoftwareVideoGames }
     * 
     */
    public SoftwareVideoGames createSoftwareVideoGames() {
        return new SoftwareVideoGames();
    }

    /**
     * Create an instance of {@link ConsumerElectronics }
     * 
     */
    public ConsumerElectronics createConsumerElectronics() {
        return new ConsumerElectronics();
    }

    /**
     * Create an instance of {@link ComputerComponent }
     * 
     */
    public ComputerComponent createComputerComponent() {
        return new ComputerComponent();
    }

    /**
     * Create an instance of {@link Wireless }
     * 
     */
    public Wireless createWireless() {
        return new Wireless();
    }

    /**
     * Create an instance of {@link Sports }
     * 
     */
    public Sports createSports() {
        return new Sports();
    }

    /**
     * Create an instance of {@link Electrical }
     * 
     */
    public Electrical createElectrical() {
        return new Electrical();
    }

    /**
     * Create an instance of {@link KindleFireAccessories }
     * 
     */
    public KindleFireAccessories createKindleFireAccessories() {
        return new KindleFireAccessories();
    }

    /**
     * Create an instance of {@link PromotionDataType }
     * 
     */
    public PromotionDataType createPromotionDataType() {
        return new PromotionDataType();
    }

    /**
     * Create an instance of {@link BuyerPrice }
     * 
     */
    public BuyerPrice createBuyerPrice() {
        return new BuyerPrice();
    }

    /**
     * Create an instance of {@link HomeImprovementTools }
     * 
     */
    public HomeImprovementTools createHomeImprovementTools() {
        return new HomeImprovementTools();
    }

    /**
     * Create an instance of {@link AmazonFees }
     * 
     */
    public AmazonFees createAmazonFees() {
        return new AmazonFees();
    }

    /**
     * Create an instance of {@link DirectPaymentType }
     * 
     */
    public DirectPaymentType createDirectPaymentType() {
        return new DirectPaymentType();
    }

    /**
     * Create an instance of {@link com.elcuk.jaxb.Home.ProductType }
     * 
     */
    public com.elcuk.jaxb.Home.ProductType createHomeProductType() {
        return new com.elcuk.jaxb.Home.ProductType();
    }

    /**
     * Create an instance of {@link com.elcuk.jaxb.Home.ProductType.Home }
     * 
     */
    public com.elcuk.jaxb.Home.ProductType.Home createHomeProductTypeHome() {
        return new com.elcuk.jaxb.Home.ProductType.Home();
    }

    /**
     * Create an instance of {@link MemorySizeIntegerDimension }
     * 
     */
    public MemorySizeIntegerDimension createMemorySizeIntegerDimension() {
        return new MemorySizeIntegerDimension();
    }

    /**
     * Create an instance of {@link StandardProductID }
     * 
     */
    public StandardProductID createStandardProductID() {
        return new StandardProductID();
    }

    /**
     * Create an instance of {@link RelatedProductID }
     * 
     */
    public RelatedProductID createRelatedProductID() {
        return new RelatedProductID();
    }

    /**
     * Create an instance of {@link ConditionInfo }
     * 
     */
    public ConditionInfo createConditionInfo() {
        return new ConditionInfo();
    }

    /**
     * Create an instance of {@link RebateType }
     * 
     */
    public RebateType createRebateType() {
        return new RebateType();
    }

    /**
     * Create an instance of {@link VolumeDimension }
     * 
     */
    public VolumeDimension createVolumeDimension() {
        return new VolumeDimension();
    }

    /**
     * Create an instance of {@link Product.DescriptionData }
     * 
     */
    public Product.DescriptionData createProductDescriptionData() {
        return new Product.DescriptionData();
    }

    /**
     * Create an instance of {@link Product.PromoTag }
     * 
     */
    public Product.PromoTag createProductPromoTag() {
        return new Product.PromoTag();
    }

    /**
     * Create an instance of {@link Product.DiscoveryData }
     * 
     */
    public Product.DiscoveryData createProductDiscoveryData() {
        return new Product.DiscoveryData();
    }

    /**
     * Create an instance of {@link Product.ProductData }
     * 
     */
    public Product.ProductData createProductProductData() {
        return new Product.ProductData();
    }

    /**
     * Create an instance of {@link AmazonVendorOnly }
     * 
     */
    public AmazonVendorOnly createAmazonVendorOnly() {
        return new AmazonVendorOnly();
    }

    /**
     * Create an instance of {@link CurrencyAmount }
     * 
     */
    public CurrencyAmount createCurrencyAmount() {
        return new CurrencyAmount();
    }

    /**
     * Create an instance of {@link AmazonOnly }
     * 
     */
    public AmazonOnly createAmazonOnly() {
        return new AmazonOnly();
    }

    /**
     * Create an instance of {@link PowerDimension }
     * 
     */
    public PowerDimension createPowerDimension() {
        return new PowerDimension();
    }

    /**
     * Create an instance of {@link LengthIntegerDimension }
     * 
     */
    public LengthIntegerDimension createLengthIntegerDimension() {
        return new LengthIntegerDimension();
    }

    /**
     * Create an instance of {@link MemorySizeDimension }
     * 
     */
    public MemorySizeDimension createMemorySizeDimension() {
        return new MemorySizeDimension();
    }

    /**
     * Create an instance of {@link LengthDimension }
     * 
     */
    public LengthDimension createLengthDimension() {
        return new LengthDimension();
    }

    /**
     * Create an instance of {@link FrequencyIntegerDimension }
     * 
     */
    public FrequencyIntegerDimension createFrequencyIntegerDimension() {
        return new FrequencyIntegerDimension();
    }

    /**
     * Create an instance of {@link RearFacingWeight }
     * 
     */
    public RearFacingWeight createRearFacingWeight() {
        return new RearFacingWeight();
    }

    /**
     * Create an instance of {@link WeightDimension }
     * 
     */
    public WeightDimension createWeightDimension() {
        return new WeightDimension();
    }

    /**
     * Create an instance of {@link PowerSuppliesOrProtection }
     * 
     */
    public PowerSuppliesOrProtection createPowerSuppliesOrProtection() {
        return new PowerSuppliesOrProtection();
    }

    /**
     * Create an instance of {@link BatteryPowerIntegerDimension }
     * 
     */
    public BatteryPowerIntegerDimension createBatteryPowerIntegerDimension() {
        return new BatteryPowerIntegerDimension();
    }

    /**
     * Create an instance of {@link EnergyRatingType }
     * 
     */
    public EnergyRatingType createEnergyRatingType() {
        return new EnergyRatingType();
    }

    /**
     * Create an instance of {@link HandheldOrPDA }
     * 
     */
    public HandheldOrPDA createHandheldOrPDA() {
        return new HandheldOrPDA();
    }

    /**
     * Create an instance of {@link FrequencyDimension }
     * 
     */
    public FrequencyDimension createFrequencyDimension() {
        return new FrequencyDimension();
    }

    /**
     * Create an instance of {@link Headphones }
     * 
     */
    public Headphones createHeadphones() {
        return new Headphones();
    }

    /**
     * Create an instance of {@link CECamcorder }
     * 
     */
    public CECamcorder createCECamcorder() {
        return new CECamcorder();
    }

    /**
     * Create an instance of {@link ZoomDimension }
     * 
     */
    public ZoomDimension createZoomDimension() {
        return new ZoomDimension();
    }

    /**
     * Create an instance of {@link ResolutionDimension }
     * 
     */
    public ResolutionDimension createResolutionDimension() {
        return new ResolutionDimension();
    }

    /**
     * Create an instance of {@link ApertureDimension }
     * 
     */
    public ApertureDimension createApertureDimension() {
        return new ApertureDimension();
    }

    /**
     * Create an instance of {@link TabletActiveSurfaceAreaDimension }
     * 
     */
    public TabletActiveSurfaceAreaDimension createTabletActiveSurfaceAreaDimension() {
        return new TabletActiveSurfaceAreaDimension();
    }

    /**
     * Create an instance of {@link CEDigitalCamera }
     * 
     */
    public CEDigitalCamera createCEDigitalCamera() {
        return new CEDigitalCamera();
    }

    /**
     * Create an instance of {@link ContinuousShootingDimension }
     * 
     */
    public ContinuousShootingDimension createContinuousShootingDimension() {
        return new ContinuousShootingDimension();
    }

    /**
     * Create an instance of {@link PixelDimension }
     * 
     */
    public PixelDimension createPixelDimension() {
        return new PixelDimension();
    }

    /**
     * Create an instance of {@link PhoneAccessory }
     * 
     */
    public PhoneAccessory createPhoneAccessory() {
        return new PhoneAccessory();
    }

    /**
     * Create an instance of {@link LengthFiveDigitDimension }
     * 
     */
    public LengthFiveDigitDimension createLengthFiveDigitDimension() {
        return new LengthFiveDigitDimension();
    }

    /**
     * Create an instance of {@link DataTransferSpeedFiveDigitIntegerDimension }
     * 
     */
    public DataTransferSpeedFiveDigitIntegerDimension createDataTransferSpeedFiveDigitIntegerDimension() {
        return new DataTransferSpeedFiveDigitIntegerDimension();
    }

    /**
     * Create an instance of {@link DataTransferSpeedIntegerDimension }
     * 
     */
    public DataTransferSpeedIntegerDimension createDataTransferSpeedIntegerDimension() {
        return new DataTransferSpeedIntegerDimension();
    }

    /**
     * Create an instance of {@link CE.ProductType }
     * 
     */
    public CE.ProductType createCEProductType() {
        return new CE.ProductType();
    }

    /**
     * Create an instance of {@link EnergyConsumptionDimension }
     * 
     */
    public EnergyConsumptionDimension createEnergyConsumptionDimension() {
        return new EnergyConsumptionDimension();
    }

    /**
     * Create an instance of {@link Battery.BatterySubgroup }
     * 
     */
    public Battery.BatterySubgroup createBatteryBatterySubgroup() {
        return new Battery.BatterySubgroup();
    }

    /**
     * Create an instance of {@link TimeDimension }
     * 
     */
    public TimeDimension createTimeDimension() {
        return new TimeDimension();
    }

    /**
     * Create an instance of {@link CE.DataTransferRate }
     * 
     */
    public CE.DataTransferRate createCEDataTransferRate() {
        return new CE.DataTransferRate();
    }

    /**
     * Create an instance of {@link ResistanceDimension }
     * 
     */
    public ResistanceDimension createResistanceDimension() {
        return new ResistanceDimension();
    }

    /**
     * Create an instance of {@link Connection }
     * 
     */
    public Connection createConnection() {
        return new Connection();
    }

    /**
     * Create an instance of {@link CE.PortedBoxVolume }
     * 
     */
    public CE.PortedBoxVolume createCEPortedBoxVolume() {
        return new CE.PortedBoxVolume();
    }

    /**
     * Create an instance of {@link VoltageIntegerDimension }
     * 
     */
    public VoltageIntegerDimension createVoltageIntegerDimension() {
        return new VoltageIntegerDimension();
    }

    /**
     * Create an instance of {@link CE.SealedBoxVolume }
     * 
     */
    public CE.SealedBoxVolume createCESealedBoxVolume() {
        return new CE.SealedBoxVolume();
    }

    /**
     * Create an instance of {@link KindleAccessories.VariationData }
     * 
     */
    public KindleAccessories.VariationData createKindleAccessoriesVariationData() {
        return new KindleAccessories.VariationData();
    }

    /**
     * Create an instance of {@link VoltageDecimalDimension }
     * 
     */
    public VoltageDecimalDimension createVoltageDecimalDimension() {
        return new VoltageDecimalDimension();
    }

    /**
     * Create an instance of {@link WattageIntegerDimension }
     * 
     */
    public WattageIntegerDimension createWattageIntegerDimension() {
        return new WattageIntegerDimension();
    }

    /**
     * Create an instance of {@link PressureLevelSixDigitIntegerDimension }
     * 
     */
    public PressureLevelSixDigitIntegerDimension createPressureLevelSixDigitIntegerDimension() {
        return new PressureLevelSixDigitIntegerDimension();
    }

    /**
     * Create an instance of {@link AreaDimensionOptionalUnit }
     * 
     */
    public AreaDimensionOptionalUnit createAreaDimensionOptionalUnit() {
        return new AreaDimensionOptionalUnit();
    }

    /**
     * Create an instance of {@link VolumeRateDimension }
     * 
     */
    public VolumeRateDimension createVolumeRateDimension() {
        return new VolumeRateDimension();
    }

    /**
     * Create an instance of {@link BedAndBath.VariationData }
     * 
     */
    public BedAndBath.VariationData createBedAndBathVariationData() {
        return new BedAndBath.VariationData();
    }

    /**
     * Create an instance of {@link WattageDimensionOptionalUnit }
     * 
     */
    public WattageDimensionOptionalUnit createWattageDimensionOptionalUnit() {
        return new WattageDimensionOptionalUnit();
    }

    /**
     * Create an instance of {@link Television }
     * 
     */
    public Television createTelevision() {
        return new Television();
    }

    /**
     * Create an instance of {@link WattageDimension }
     * 
     */
    public WattageDimension createWattageDimension() {
        return new WattageDimension();
    }

    /**
     * Create an instance of {@link ResolutionFiveDigitDimension }
     * 
     */
    public ResolutionFiveDigitDimension createResolutionFiveDigitDimension() {
        return new ResolutionFiveDigitDimension();
    }

    /**
     * Create an instance of {@link com.elcuk.jaxb.VariationData }
     * 
     */
    public com.elcuk.jaxb.VariationData createVariationData() {
        return new com.elcuk.jaxb.VariationData();
    }

    /**
     * Create an instance of {@link LightingAccessories }
     * 
     */
    public LightingAccessories createLightingAccessories() {
        return new LightingAccessories();
    }

    /**
     * Create an instance of {@link AmperageDimension }
     * 
     */
    public AmperageDimension createAmperageDimension() {
        return new AmperageDimension();
    }

    /**
     * Create an instance of {@link VoltageIntegerDimensionOptionalUnit }
     * 
     */
    public VoltageIntegerDimensionOptionalUnit createVoltageIntegerDimensionOptionalUnit() {
        return new VoltageIntegerDimensionOptionalUnit();
    }

    /**
     * Create an instance of {@link GPSOrNavigationAccessory }
     * 
     */
    public GPSOrNavigationAccessory createGPSOrNavigationAccessory() {
        return new GPSOrNavigationAccessory();
    }

    /**
     * Create an instance of {@link AVFurniture }
     * 
     */
    public AVFurniture createAVFurniture() {
        return new AVFurniture();
    }

    /**
     * Create an instance of {@link CameraLenses }
     * 
     */
    public CameraLenses createCameraLenses() {
        return new CameraLenses();
    }

    /**
     * Create an instance of {@link MediaStorage }
     * 
     */
    public MediaStorage createMediaStorage() {
        return new MediaStorage();
    }

    /**
     * Create an instance of {@link FlashMemory }
     * 
     */
    public FlashMemory createFlashMemory() {
        return new FlashMemory();
    }

    /**
     * Create an instance of {@link TimeIntegerDimension }
     * 
     */
    public TimeIntegerDimension createTimeIntegerDimension() {
        return new TimeIntegerDimension();
    }

    /**
     * Create an instance of {@link OrganizersAndStorage.VariationData }
     * 
     */
    public OrganizersAndStorage.VariationData createOrganizersAndStorageVariationData() {
        return new OrganizersAndStorage.VariationData();
    }

    /**
     * Create an instance of {@link BatteryPowerDimension }
     * 
     */
    public BatteryPowerDimension createBatteryPowerDimension() {
        return new BatteryPowerDimension();
    }

    /**
     * Create an instance of {@link LumensType }
     * 
     */
    public LumensType createLumensType() {
        return new LumensType();
    }

    /**
     * Create an instance of {@link MaximumPowerType }
     * 
     */
    public MaximumPowerType createMaximumPowerType() {
        return new MaximumPowerType();
    }

    /**
     * Create an instance of {@link SpeedDimension }
     * 
     */
    public SpeedDimension createSpeedDimension() {
        return new SpeedDimension();
    }

    /**
     * Create an instance of {@link LengthDimensionOptionalUnit }
     * 
     */
    public LengthDimensionOptionalUnit createLengthDimensionOptionalUnit() {
        return new LengthDimensionOptionalUnit();
    }

    /**
     * Create an instance of {@link TorqueType }
     * 
     */
    public TorqueType createTorqueType() {
        return new TorqueType();
    }

    /**
     * Create an instance of {@link DegreeDimension }
     * 
     */
    public DegreeDimension createDegreeDimension() {
        return new DegreeDimension();
    }

    /**
     * Create an instance of {@link Computers.ProductType }
     * 
     */
    public Computers.ProductType createComputersProductType() {
        return new Computers.ProductType();
    }

    /**
     * Create an instance of {@link Scanner }
     * 
     */
    public Scanner createScanner() {
        return new Scanner();
    }

    /**
     * Create an instance of {@link CEBinocular }
     * 
     */
    public CEBinocular createCEBinocular() {
        return new CEBinocular();
    }

    /**
     * Create an instance of {@link TabletComputer.GraphicsCard }
     * 
     */
    public TabletComputer.GraphicsCard createTabletComputerGraphicsCard() {
        return new TabletComputer.GraphicsCard();
    }

    /**
     * Create an instance of {@link PDA }
     * 
     */
    public PDA createPDA() {
        return new PDA();
    }

    /**
     * Create an instance of {@link OutdoorLiving.VariationData }
     * 
     */
    public OutdoorLiving.VariationData createOutdoorLivingVariationData() {
        return new OutdoorLiving.VariationData();
    }

    /**
     * Create an instance of {@link OutdoorLiving.UnitCount }
     * 
     */
    public OutdoorLiving.UnitCount createOutdoorLivingUnitCount() {
        return new OutdoorLiving.UnitCount();
    }

    /**
     * Create an instance of {@link ReceiverOrAmplifier }
     * 
     */
    public ReceiverOrAmplifier createReceiverOrAmplifier() {
        return new ReceiverOrAmplifier();
    }

    /**
     * Create an instance of {@link VideoCard }
     * 
     */
    public VideoCard createVideoCard() {
        return new VideoCard();
    }

    /**
     * Create an instance of {@link MemoryInterfaceDimension }
     * 
     */
    public MemoryInterfaceDimension createMemoryInterfaceDimension() {
        return new MemoryInterfaceDimension();
    }

    /**
     * Create an instance of {@link Hardware.VariationData }
     * 
     */
    public Hardware.VariationData createHardwareVariationData() {
        return new Hardware.VariationData();
    }

    /**
     * Create an instance of {@link com.elcuk.jaxb.Home.VariationData }
     * 
     */
    public com.elcuk.jaxb.Home.VariationData createHomeVariationData() {
        return new com.elcuk.jaxb.Home.VariationData();
    }

    /**
     * Create an instance of {@link VolumeIntegerDimension }
     * 
     */
    public VolumeIntegerDimension createVolumeIntegerDimension() {
        return new VolumeIntegerDimension();
    }

    /**
     * Create an instance of {@link CameraOtherAccessories }
     * 
     */
    public CameraOtherAccessories createCameraOtherAccessories() {
        return new CameraOtherAccessories();
    }

    /**
     * Create an instance of {@link SoftwarePlatform }
     * 
     */
    public SoftwarePlatform createSoftwarePlatform() {
        return new SoftwarePlatform();
    }

    /**
     * Create an instance of {@link Speakers }
     * 
     */
    public Speakers createSpeakers() {
        return new Speakers();
    }

    /**
     * Create an instance of {@link VideoProjectorsAndAccessories }
     * 
     */
    public VideoProjectorsAndAccessories createVideoProjectorsAndAccessories() {
        return new VideoProjectorsAndAccessories();
    }

    /**
     * Create an instance of {@link WirelessAccessories.VariationData }
     * 
     */
    public WirelessAccessories.VariationData createWirelessAccessoriesVariationData() {
        return new WirelessAccessories.VariationData();
    }

    /**
     * Create an instance of {@link DownloadableFile }
     * 
     */
    public DownloadableFile createDownloadableFile() {
        return new DownloadableFile();
    }

    /**
     * Create an instance of {@link FrequencyFiveDigitIntegerDimension }
     * 
     */
    public FrequencyFiveDigitIntegerDimension createFrequencyFiveDigitIntegerDimension() {
        return new FrequencyFiveDigitIntegerDimension();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link PlumbingFixtures.VariationData }
     * 
     */
    public PlumbingFixtures.VariationData createPlumbingFixturesVariationData() {
        return new PlumbingFixtures.VariationData();
    }

    /**
     * Create an instance of {@link RemoteControl }
     * 
     */
    public RemoteControl createRemoteControl() {
        return new RemoteControl();
    }

    /**
     * Create an instance of {@link MemoryReader }
     * 
     */
    public MemoryReader createMemoryReader() {
        return new MemoryReader();
    }

    /**
     * Create an instance of {@link DataTransferSpeedTenIntegerDimension }
     * 
     */
    public DataTransferSpeedTenIntegerDimension createDataTransferSpeedTenIntegerDimension() {
        return new DataTransferSpeedTenIntegerDimension();
    }

    /**
     * Create an instance of {@link AgeRecommendation }
     * 
     */
    public AgeRecommendation createAgeRecommendation() {
        return new AgeRecommendation();
    }

    /**
     * Create an instance of {@link MinimumAgeRecommendedDimension }
     * 
     */
    public MinimumAgeRecommendedDimension createMinimumAgeRecommendedDimension() {
        return new MinimumAgeRecommendedDimension();
    }

    /**
     * Create an instance of {@link AgeRecommendedDimension }
     * 
     */
    public AgeRecommendedDimension createAgeRecommendedDimension() {
        return new AgeRecommendedDimension();
    }

    /**
     * Create an instance of {@link HomeImprovement.ProductType }
     * 
     */
    public HomeImprovement.ProductType createHomeImprovementProductType() {
        return new HomeImprovement.ProductType();
    }

    /**
     * Create an instance of {@link HICommon }
     * 
     */
    public HICommon createHICommon() {
        return new HICommon();
    }

    /**
     * Create an instance of {@link OptionalMinimumAgeRecommendedDimension }
     * 
     */
    public OptionalMinimumAgeRecommendedDimension createOptionalMinimumAgeRecommendedDimension() {
        return new OptionalMinimumAgeRecommendedDimension();
    }

    /**
     * Create an instance of {@link AirFlowDisplacementDimension }
     * 
     */
    public AirFlowDisplacementDimension createAirFlowDisplacementDimension() {
        return new AirFlowDisplacementDimension();
    }

    /**
     * Create an instance of {@link BatteryLifeType }
     * 
     */
    public BatteryLifeType createBatteryLifeType() {
        return new BatteryLifeType();
    }

    /**
     * Create an instance of {@link FlowRateType }
     * 
     */
    public FlowRateType createFlowRateType() {
        return new FlowRateType();
    }

    /**
     * Create an instance of {@link PressureDimension }
     * 
     */
    public PressureDimension createPressureDimension() {
        return new PressureDimension();
    }

    /**
     * Create an instance of {@link SoundLevelType }
     * 
     */
    public SoundLevelType createSoundLevelType() {
        return new SoundLevelType();
    }

    /**
     * Create an instance of {@link TemperatureRangeType }
     * 
     */
    public TemperatureRangeType createTemperatureRangeType() {
        return new TemperatureRangeType();
    }

    /**
     * Create an instance of {@link ThicknessType }
     * 
     */
    public ThicknessType createThicknessType() {
        return new ThicknessType();
    }

    /**
     * Create an instance of {@link WaterConsumptionType }
     * 
     */
    public WaterConsumptionType createWaterConsumptionType() {
        return new WaterConsumptionType();
    }

    /**
     * Create an instance of {@link AreaDimension }
     * 
     */
    public AreaDimension createAreaDimension() {
        return new AreaDimension();
    }

    /**
     * Create an instance of {@link VoltageFiveDigitIntegerDimension }
     * 
     */
    public VoltageFiveDigitIntegerDimension createVoltageFiveDigitIntegerDimension() {
        return new VoltageFiveDigitIntegerDimension();
    }

    /**
     * Create an instance of {@link LengthSevenDigitDimension }
     * 
     */
    public LengthSevenDigitDimension createLengthSevenDigitDimension() {
        return new LengthSevenDigitDimension();
    }

    /**
     * Create an instance of {@link BuildingMaterials.VariationData }
     * 
     */
    public BuildingMaterials.VariationData createBuildingMaterialsVariationData() {
        return new BuildingMaterials.VariationData();
    }

    /**
     * Create an instance of {@link DigitalVideoRecorder }
     * 
     */
    public DigitalVideoRecorder createDigitalVideoRecorder() {
        return new DigitalVideoRecorder();
    }

    /**
     * Create an instance of {@link DVDPlayerOrRecorder }
     * 
     */
    public DVDPlayerOrRecorder createDVDPlayerOrRecorder() {
        return new DVDPlayerOrRecorder();
    }

    /**
     * Create an instance of {@link Tools }
     * 
     */
    public Tools createTools() {
        return new Tools();
    }

    /**
     * Create an instance of {@link VideoProjector }
     * 
     */
    public VideoProjector createVideoProjector() {
        return new VideoProjector();
    }

    /**
     * Create an instance of {@link BurnTimeSixDigitDimension }
     * 
     */
    public BurnTimeSixDigitDimension createBurnTimeSixDigitDimension() {
        return new BurnTimeSixDigitDimension();
    }

    /**
     * Create an instance of {@link LuminanceFiveDigitDimension }
     * 
     */
    public LuminanceFiveDigitDimension createLuminanceFiveDigitDimension() {
        return new LuminanceFiveDigitDimension();
    }

    /**
     * Create an instance of {@link TabletResolutionDimension }
     * 
     */
    public TabletResolutionDimension createTabletResolutionDimension() {
        return new TabletResolutionDimension();
    }

    /**
     * Create an instance of {@link RadioOrClockRadio }
     * 
     */
    public RadioOrClockRadio createRadioOrClockRadio() {
        return new RadioOrClockRadio();
    }

    /**
     * Create an instance of {@link HomeTheaterSystemOrHTIB }
     * 
     */
    public HomeTheaterSystemOrHTIB createHomeTheaterSystemOrHTIB() {
        return new HomeTheaterSystemOrHTIB();
    }

    /**
     * Create an instance of {@link ComputerAddOn }
     * 
     */
    public ComputerAddOn createComputerAddOn() {
        return new ComputerAddOn();
    }

    /**
     * Create an instance of {@link CurrentFiveDigitDimension }
     * 
     */
    public CurrentFiveDigitDimension createCurrentFiveDigitDimension() {
        return new CurrentFiveDigitDimension();
    }

    /**
     * Create an instance of {@link DataTransferSpeedDimension }
     * 
     */
    public DataTransferSpeedDimension createDataTransferSpeedDimension() {
        return new DataTransferSpeedDimension();
    }

    /**
     * Create an instance of {@link LengthFourDigitDimension }
     * 
     */
    public LengthFourDigitDimension createLengthFourDigitDimension() {
        return new LengthFourDigitDimension();
    }

    /**
     * Create an instance of {@link InkOrToner }
     * 
     */
    public InkOrToner createInkOrToner() {
        return new InkOrToner();
    }

    /**
     * Create an instance of {@link HandheldSoftwareDownloads }
     * 
     */
    public HandheldSoftwareDownloads createHandheldSoftwareDownloads() {
        return new HandheldSoftwareDownloads();
    }

    /**
     * Create an instance of {@link ComputerDriveOrStorage }
     * 
     */
    public ComputerDriveOrStorage createComputerDriveOrStorage() {
        return new ComputerDriveOrStorage();
    }

    /**
     * Create an instance of {@link SystemCabinet }
     * 
     */
    public SystemCabinet createSystemCabinet() {
        return new SystemCabinet();
    }

    /**
     * Create an instance of {@link PowerSixDigitDimension }
     * 
     */
    public PowerSixDigitDimension createPowerSixDigitDimension() {
        return new PowerSixDigitDimension();
    }

    /**
     * Create an instance of {@link Monitor }
     * 
     */
    public Monitor createMonitor() {
        return new Monitor();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link Lighting.ProductType }
     * 
     */
    public Lighting.ProductType createLightingProductType() {
        return new Lighting.ProductType();
    }

    /**
     * Create an instance of {@link CurencyDimension }
     * 
     */
    public CurencyDimension createCurencyDimension() {
        return new CurencyDimension();
    }

    /**
     * Create an instance of {@link VideoGamesHardware }
     * 
     */
    public VideoGamesHardware createVideoGamesHardware() {
        return new VideoGamesHardware();
    }

    /**
     * Create an instance of {@link MiscAudioComponents }
     * 
     */
    public MiscAudioComponents createMiscAudioComponents() {
        return new MiscAudioComponents();
    }

    /**
     * Create an instance of {@link CEFilmCamera }
     * 
     */
    public CEFilmCamera createCEFilmCamera() {
        return new CEFilmCamera();
    }

    /**
     * Create an instance of {@link CECameraFlash }
     * 
     */
    public CECameraFlash createCECameraFlash() {
        return new CECameraFlash();
    }

    /**
     * Create an instance of {@link ComputerSpeaker }
     * 
     */
    public ComputerSpeaker createComputerSpeaker() {
        return new ComputerSpeaker();
    }

    /**
     * Create an instance of {@link PC }
     * 
     */
    public PC createPC() {
        return new PC();
    }

    /**
     * Create an instance of {@link com.elcuk.jaxb.GraphicsCard }
     * 
     */
    public com.elcuk.jaxb.GraphicsCard createGraphicsCard() {
        return new com.elcuk.jaxb.GraphicsCard();
    }

    /**
     * Create an instance of {@link AirflowDimension }
     * 
     */
    public AirflowDimension createAirflowDimension() {
        return new AirflowDimension();
    }

    /**
     * Create an instance of {@link SecurityElectronics.VariationData }
     * 
     */
    public SecurityElectronics.VariationData createSecurityElectronicsVariationData() {
        return new SecurityElectronics.VariationData();
    }

    /**
     * Create an instance of {@link LightBulbs.VariationData }
     * 
     */
    public LightBulbs.VariationData createLightBulbsVariationData() {
        return new LightBulbs.VariationData();
    }

    /**
     * Create an instance of {@link TemperatureRatingDimension }
     * 
     */
    public TemperatureRatingDimension createTemperatureRatingDimension() {
        return new TemperatureRatingDimension();
    }

    /**
     * Create an instance of {@link LuminanceDimension }
     * 
     */
    public LuminanceDimension createLuminanceDimension() {
        return new LuminanceDimension();
    }

    /**
     * Create an instance of {@link LuminiousIntensityDimension }
     * 
     */
    public LuminiousIntensityDimension createLuminiousIntensityDimension() {
        return new LuminiousIntensityDimension();
    }

    /**
     * Create an instance of {@link TVCombos }
     * 
     */
    public TVCombos createTVCombos() {
        return new TVCombos();
    }

    /**
     * Create an instance of {@link ComputerPlatform }
     * 
     */
    public ComputerPlatform createComputerPlatform() {
        return new ComputerPlatform();
    }

    /**
     * Create an instance of {@link PhotographicStudioItems }
     * 
     */
    public PhotographicStudioItems createPhotographicStudioItems() {
        return new PhotographicStudioItems();
    }

    /**
     * Create an instance of {@link Webcam }
     * 
     */
    public Webcam createWebcam() {
        return new Webcam();
    }

    /**
     * Create an instance of {@link BarCodeReader }
     * 
     */
    public BarCodeReader createBarCodeReader() {
        return new BarCodeReader();
    }

    /**
     * Create an instance of {@link VideoGames }
     * 
     */
    public VideoGames createVideoGames() {
        return new VideoGames();
    }

    /**
     * Create an instance of {@link PEGIDetailsType }
     * 
     */
    public PEGIDetailsType createPEGIDetailsType() {
        return new PEGIDetailsType();
    }

    /**
     * Create an instance of {@link ComputerProcessor }
     * 
     */
    public ComputerProcessor createComputerProcessor() {
        return new ComputerProcessor();
    }

    /**
     * Create an instance of {@link Art.VariationData }
     * 
     */
    public Art.VariationData createArtVariationData() {
        return new Art.VariationData();
    }

    /**
     * Create an instance of {@link WirelessDownloads }
     * 
     */
    public WirelessDownloads createWirelessDownloads() {
        return new WirelessDownloads();
    }

    /**
     * Create an instance of {@link PortableAvDevice }
     * 
     */
    public PortableAvDevice createPortableAvDevice() {
        return new PortableAvDevice();
    }

    /**
     * Create an instance of {@link ShoulderHarnessHeight }
     * 
     */
    public ShoulderHarnessHeight createShoulderHarnessHeight() {
        return new ShoulderHarnessHeight();
    }

    /**
     * Create an instance of {@link MajorHomeAppliances.VariationData }
     * 
     */
    public MajorHomeAppliances.VariationData createMajorHomeAppliancesVariationData() {
        return new MajorHomeAppliances.VariationData();
    }

    /**
     * Create an instance of {@link TwoWayRadio }
     * 
     */
    public TwoWayRadio createTwoWayRadio() {
        return new TwoWayRadio();
    }

    /**
     * Create an instance of {@link CEBattery }
     * 
     */
    public CEBattery createCEBattery() {
        return new CEBattery();
    }

    /**
     * Create an instance of {@link PortableAudio }
     * 
     */
    public PortableAudio createPortableAudio() {
        return new PortableAudio();
    }

    /**
     * Create an instance of {@link ComputerCoolingDevice }
     * 
     */
    public ComputerCoolingDevice createComputerCoolingDevice() {
        return new ComputerCoolingDevice();
    }

    /**
     * Create an instance of {@link NoiseLevelSixDigitDimension }
     * 
     */
    public NoiseLevelSixDigitDimension createNoiseLevelSixDigitDimension() {
        return new NoiseLevelSixDigitDimension();
    }

    /**
     * Create an instance of {@link SpeedSixDigitDimension }
     * 
     */
    public SpeedSixDigitDimension createSpeedSixDigitDimension() {
        return new SpeedSixDigitDimension();
    }

    /**
     * Create an instance of {@link PersonalComputer.GraphicsCard }
     * 
     */
    public PersonalComputer.GraphicsCard createPersonalComputerGraphicsCard() {
        return new PersonalComputer.GraphicsCard();
    }

    /**
     * Create an instance of {@link MemorySizeFiveDigitDimension }
     * 
     */
    public MemorySizeFiveDigitDimension createMemorySizeFiveDigitDimension() {
        return new MemorySizeFiveDigitDimension();
    }

    /**
     * Create an instance of {@link WeightRecommendation }
     * 
     */
    public WeightRecommendation createWeightRecommendation() {
        return new WeightRecommendation();
    }

    /**
     * Create an instance of {@link WeightIntegerDimension }
     * 
     */
    public WeightIntegerDimension createWeightIntegerDimension() {
        return new WeightIntegerDimension();
    }

    /**
     * Create an instance of {@link CableOrAdapter }
     * 
     */
    public CableOrAdapter createCableOrAdapter() {
        return new CableOrAdapter();
    }

    /**
     * Create an instance of {@link MediaPlayer }
     * 
     */
    public MediaPlayer createMediaPlayer() {
        return new MediaPlayer();
    }

    /**
     * Create an instance of {@link FurnitureAndDecor.VariationData }
     * 
     */
    public FurnitureAndDecor.VariationData createFurnitureAndDecorVariationData() {
        return new FurnitureAndDecor.VariationData();
    }

    /**
     * Create an instance of {@link KindleEReaderAccessories.VariationData }
     * 
     */
    public KindleEReaderAccessories.VariationData createKindleEReaderAccessoriesVariationData() {
        return new KindleEReaderAccessories.VariationData();
    }

    /**
     * Create an instance of {@link SeedsAndPlants.VariationData }
     * 
     */
    public SeedsAndPlants.VariationData createSeedsAndPlantsVariationData() {
        return new SeedsAndPlants.VariationData();
    }

    /**
     * Create an instance of {@link SeedsAndPlants.UnitCount }
     * 
     */
    public SeedsAndPlants.UnitCount createSeedsAndPlantsUnitCount() {
        return new SeedsAndPlants.UnitCount();
    }

    /**
     * Create an instance of {@link RadarDetector }
     * 
     */
    public RadarDetector createRadarDetector() {
        return new RadarDetector();
    }

    /**
     * Create an instance of {@link LightsAndFixtures.VariationData }
     * 
     */
    public LightsAndFixtures.VariationData createLightsAndFixturesVariationData() {
        return new LightsAndFixtures.VariationData();
    }

    /**
     * Create an instance of {@link FrequencyThreeDigitIntegerDimension }
     * 
     */
    public FrequencyThreeDigitIntegerDimension createFrequencyThreeDigitIntegerDimension() {
        return new FrequencyThreeDigitIntegerDimension();
    }

    /**
     * Create an instance of {@link Recall }
     * 
     */
    public Recall createRecall() {
        return new Recall();
    }

    /**
     * Create an instance of {@link CarAudioOrTheater }
     * 
     */
    public CarAudioOrTheater createCarAudioOrTheater() {
        return new CarAudioOrTheater();
    }

    /**
     * Create an instance of {@link CEVideoProjector }
     * 
     */
    public CEVideoProjector createCEVideoProjector() {
        return new CEVideoProjector();
    }

    /**
     * Create an instance of {@link NotebookComputer.GraphicsCard }
     * 
     */
    public NotebookComputer.GraphicsCard createNotebookComputerGraphicsCard() {
        return new NotebookComputer.GraphicsCard();
    }

    /**
     * Create an instance of {@link StereoShelfSystem }
     * 
     */
    public StereoShelfSystem createStereoShelfSystem() {
        return new StereoShelfSystem();
    }

    /**
     * Create an instance of {@link CharacterDataType }
     * 
     */
    public CharacterDataType createCharacterDataType() {
        return new CharacterDataType();
    }

    /**
     * Create an instance of {@link DigitalPictureFrame }
     * 
     */
    public DigitalPictureFrame createDigitalPictureFrame() {
        return new DigitalPictureFrame();
    }

    /**
     * Create an instance of {@link Kitchen.VariationData }
     * 
     */
    public Kitchen.VariationData createKitchenVariationData() {
        return new Kitchen.VariationData();
    }

    /**
     * Create an instance of {@link NoiseLevelDimension }
     * 
     */
    public NoiseLevelDimension createNoiseLevelDimension() {
        return new NoiseLevelDimension();
    }

    /**
     * Create an instance of {@link VolumeAndVolumeRateDimension }
     * 
     */
    public VolumeAndVolumeRateDimension createVolumeAndVolumeRateDimension() {
        return new VolumeAndVolumeRateDimension();
    }

    /**
     * Create an instance of {@link SoftwareVideoGames.ProductType }
     * 
     */
    public SoftwareVideoGames.ProductType createSoftwareVideoGamesProductType() {
        return new SoftwareVideoGames.ProductType();
    }

    /**
     * Create an instance of {@link MediaPlayerOrEReaderAccessory }
     * 
     */
    public MediaPlayerOrEReaderAccessory createMediaPlayerOrEReaderAccessory() {
        return new MediaPlayerOrEReaderAccessory();
    }

    /**
     * Create an instance of {@link TabletDataRateDimension }
     * 
     */
    public TabletDataRateDimension createTabletDataRateDimension() {
        return new TabletDataRateDimension();
    }

    /**
     * Create an instance of {@link ComputerInputDevice }
     * 
     */
    public ComputerInputDevice createComputerInputDevice() {
        return new ComputerInputDevice();
    }

    /**
     * Create an instance of {@link Antenna }
     * 
     */
    public Antenna createAntenna() {
        return new Antenna();
    }

    /**
     * Create an instance of {@link VideoGamesAccessories }
     * 
     */
    public VideoGamesAccessories createVideoGamesAccessories() {
        return new VideoGamesAccessories();
    }

    /**
     * Create an instance of {@link MemorySizeTenDigitIntegerDimension }
     * 
     */
    public MemorySizeTenDigitIntegerDimension createMemorySizeTenDigitIntegerDimension() {
        return new MemorySizeTenDigitIntegerDimension();
    }

    /**
     * Create an instance of {@link Computer }
     * 
     */
    public Computer createComputer() {
        return new Computer();
    }

    /**
     * Create an instance of {@link SoftwareGames }
     * 
     */
    public SoftwareGames createSoftwareGames() {
        return new SoftwareGames();
    }

    /**
     * Create an instance of {@link ConsumerElectronics.VariationData }
     * 
     */
    public ConsumerElectronics.VariationData createConsumerElectronicsVariationData() {
        return new ConsumerElectronics.VariationData();
    }

    /**
     * Create an instance of {@link VCR }
     * 
     */
    public VCR createVCR() {
        return new VCR();
    }

    /**
     * Create an instance of {@link CETelescope }
     * 
     */
    public CETelescope createCETelescope() {
        return new CETelescope();
    }

    /**
     * Create an instance of {@link ColorSpecification }
     * 
     */
    public ColorSpecification createColorSpecification() {
        return new ColorSpecification();
    }

    /**
     * Create an instance of {@link SystemPowerDevice }
     * 
     */
    public SystemPowerDevice createSystemPowerDevice() {
        return new SystemPowerDevice();
    }

    /**
     * Create an instance of {@link GPSOrNavigationSystem }
     * 
     */
    public GPSOrNavigationSystem createGPSOrNavigationSystem() {
        return new GPSOrNavigationSystem();
    }

    /**
     * Create an instance of {@link HeightRecommendation }
     * 
     */
    public HeightRecommendation createHeightRecommendation() {
        return new HeightRecommendation();
    }

    /**
     * Create an instance of {@link AudioVideoAccessory }
     * 
     */
    public AudioVideoAccessory createAudioVideoAccessory() {
        return new AudioVideoAccessory();
    }

    /**
     * Create an instance of {@link Keyboards }
     * 
     */
    public Keyboards createKeyboards() {
        return new Keyboards();
    }

    /**
     * Create an instance of {@link ComputerComponent.ComponentMemoryStorageCapacity }
     * 
     */
    public ComputerComponent.ComponentMemoryStorageCapacity createComputerComponentComponentMemoryStorageCapacity() {
        return new ComputerComponent.ComponentMemoryStorageCapacity();
    }

    /**
     * Create an instance of {@link Wireless.ProductType }
     * 
     */
    public Wireless.ProductType createWirelessProductType() {
        return new Wireless.ProductType();
    }

    /**
     * Create an instance of {@link CarAlarm }
     * 
     */
    public CarAlarm createCarAlarm() {
        return new CarAlarm();
    }

    /**
     * Create an instance of {@link Tuner }
     * 
     */
    public Tuner createTuner() {
        return new Tuner();
    }

    /**
     * Create an instance of {@link Printer }
     * 
     */
    public Printer createPrinter() {
        return new Printer();
    }

    /**
     * Create an instance of {@link CarElectronics }
     * 
     */
    public CarElectronics createCarElectronics() {
        return new CarElectronics();
    }

    /**
     * Create an instance of {@link ForwardFacingWeight }
     * 
     */
    public ForwardFacingWeight createForwardFacingWeight() {
        return new ForwardFacingWeight();
    }

    /**
     * Create an instance of {@link Sports.VariationData }
     * 
     */
    public Sports.VariationData createSportsVariationData() {
        return new Sports.VariationData();
    }

    /**
     * Create an instance of {@link AssemblyTimeDimension }
     * 
     */
    public AssemblyTimeDimension createAssemblyTimeDimension() {
        return new AssemblyTimeDimension();
    }

    /**
     * Create an instance of {@link OptionalEnergyOutputDimension }
     * 
     */
    public OptionalEnergyOutputDimension createOptionalEnergyOutputDimension() {
        return new OptionalEnergyOutputDimension();
    }

    /**
     * Create an instance of {@link BurnTimeDimension }
     * 
     */
    public BurnTimeDimension createBurnTimeDimension() {
        return new BurnTimeDimension();
    }

    /**
     * Create an instance of {@link Sports.EngineDisplacement }
     * 
     */
    public Sports.EngineDisplacement createSportsEngineDisplacement() {
        return new Sports.EngineDisplacement();
    }

    /**
     * Create an instance of {@link OptionalLengthIntegerDimension }
     * 
     */
    public OptionalLengthIntegerDimension createOptionalLengthIntegerDimension() {
        return new OptionalLengthIntegerDimension();
    }

    /**
     * Create an instance of {@link OptionalLuminiousIntensityDimension }
     * 
     */
    public OptionalLuminiousIntensityDimension createOptionalLuminiousIntensityDimension() {
        return new OptionalLuminiousIntensityDimension();
    }

    /**
     * Create an instance of {@link OptionalEnergyConsumptionDimension }
     * 
     */
    public OptionalEnergyConsumptionDimension createOptionalEnergyConsumptionDimension() {
        return new OptionalEnergyConsumptionDimension();
    }

    /**
     * Create an instance of {@link OptionalVoltageDecimalDimension }
     * 
     */
    public OptionalVoltageDecimalDimension createOptionalVoltageDecimalDimension() {
        return new OptionalVoltageDecimalDimension();
    }

    /**
     * Create an instance of {@link OptionalWeightDimension }
     * 
     */
    public OptionalWeightDimension createOptionalWeightDimension() {
        return new OptionalWeightDimension();
    }

    /**
     * Create an instance of {@link BootSizeDimension }
     * 
     */
    public BootSizeDimension createBootSizeDimension() {
        return new BootSizeDimension();
    }

    /**
     * Create an instance of {@link Sports.MaximumPitchSpeed }
     * 
     */
    public Sports.MaximumPitchSpeed createSportsMaximumPitchSpeed() {
        return new Sports.MaximumPitchSpeed();
    }

    /**
     * Create an instance of {@link OptionalMotorSizeDimension }
     * 
     */
    public OptionalMotorSizeDimension createOptionalMotorSizeDimension() {
        return new OptionalMotorSizeDimension();
    }

    /**
     * Create an instance of {@link OptionalResolutionDimension }
     * 
     */
    public OptionalResolutionDimension createOptionalResolutionDimension() {
        return new OptionalResolutionDimension();
    }

    /**
     * Create an instance of {@link StringLengthOptionalDimension }
     * 
     */
    public StringLengthOptionalDimension createStringLengthOptionalDimension() {
        return new StringLengthOptionalDimension();
    }

    /**
     * Create an instance of {@link OptionalResistanceDimension }
     * 
     */
    public OptionalResistanceDimension createOptionalResistanceDimension() {
        return new OptionalResistanceDimension();
    }

    /**
     * Create an instance of {@link OptionalRValueDimension }
     * 
     */
    public OptionalRValueDimension createOptionalRValueDimension() {
        return new OptionalRValueDimension();
    }

    /**
     * Create an instance of {@link OptionalVolumeDimension }
     * 
     */
    public OptionalVolumeDimension createOptionalVolumeDimension() {
        return new OptionalVolumeDimension();
    }

    /**
     * Create an instance of {@link OutputPowerDimension }
     * 
     */
    public OutputPowerDimension createOutputPowerDimension() {
        return new OutputPowerDimension();
    }

    /**
     * Create an instance of {@link OpticalPowerDimension }
     * 
     */
    public OpticalPowerDimension createOpticalPowerDimension() {
        return new OpticalPowerDimension();
    }

    /**
     * Create an instance of {@link MemorySizeFiveDigitIntegerDimension }
     * 
     */
    public MemorySizeFiveDigitIntegerDimension createMemorySizeFiveDigitIntegerDimension() {
        return new MemorySizeFiveDigitIntegerDimension();
    }

    /**
     * Create an instance of {@link NetworkingDevice }
     * 
     */
    public NetworkingDevice createNetworkingDevice() {
        return new NetworkingDevice();
    }

    /**
     * Create an instance of {@link Software }
     * 
     */
    public Software createSoftware() {
        return new Software();
    }

    /**
     * Create an instance of {@link CEBlankMedia }
     * 
     */
    public CEBlankMedia createCEBlankMedia() {
        return new CEBlankMedia();
    }

    /**
     * Create an instance of {@link CarryingCaseOrBag }
     * 
     */
    public CarryingCaseOrBag createCarryingCaseOrBag() {
        return new CarryingCaseOrBag();
    }

    /**
     * Create an instance of {@link Electrical.VariationData }
     * 
     */
    public Electrical.VariationData createElectricalVariationData() {
        return new Electrical.VariationData();
    }

    /**
     * Create an instance of {@link CameraPowerSupply }
     * 
     */
    public CameraPowerSupply createCameraPowerSupply() {
        return new CameraPowerSupply();
    }

    /**
     * Create an instance of {@link VoltageSevenDigitDecimalDimension }
     * 
     */
    public VoltageSevenDigitDecimalDimension createVoltageSevenDigitDecimalDimension() {
        return new VoltageSevenDigitDecimalDimension();
    }

    /**
     * Create an instance of {@link CameraBagsAndCases }
     * 
     */
    public CameraBagsAndCases createCameraBagsAndCases() {
        return new CameraBagsAndCases();
    }

    /**
     * Create an instance of {@link KindleFireAccessories.VariationData }
     * 
     */
    public KindleFireAccessories.VariationData createKindleFireAccessoriesVariationData() {
        return new KindleFireAccessories.VariationData();
    }

    /**
     * Create an instance of {@link RamMemory }
     * 
     */
    public RamMemory createRamMemory() {
        return new RamMemory();
    }

    /**
     * Create an instance of {@link Motherboard }
     * 
     */
    public Motherboard createMotherboard() {
        return new Motherboard();
    }

    /**
     * Create an instance of {@link SoundCard }
     * 
     */
    public SoundCard createSoundCard() {
        return new SoundCard();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link CapacityUnit }
     * 
     */
    public CapacityUnit createCapacityUnit() {
        return new CapacityUnit();
    }

    /**
     * Create an instance of {@link HardnessDimension }
     * 
     */
    public HardnessDimension createHardnessDimension() {
        return new HardnessDimension();
    }

    /**
     * Create an instance of {@link ServingDimension }
     * 
     */
    public ServingDimension createServingDimension() {
        return new ServingDimension();
    }

    /**
     * Create an instance of {@link AddressTypeSupportNonCity }
     * 
     */
    public AddressTypeSupportNonCity createAddressTypeSupportNonCity() {
        return new AddressTypeSupportNonCity();
    }

    /**
     * Create an instance of {@link SpatialDimensions }
     * 
     */
    public SpatialDimensions createSpatialDimensions() {
        return new SpatialDimensions();
    }

    /**
     * Create an instance of {@link CustomizationInfoType }
     * 
     */
    public CustomizationInfoType createCustomizationInfoType() {
        return new CustomizationInfoType();
    }

    /**
     * Create an instance of {@link PositiveWeightDimension }
     * 
     */
    public PositiveWeightDimension createPositiveWeightDimension() {
        return new PositiveWeightDimension();
    }

    /**
     * Create an instance of {@link Dimensions }
     * 
     */
    public Dimensions createDimensions() {
        return new Dimensions();
    }

    /**
     * Create an instance of {@link CurrentDimension }
     * 
     */
    public CurrentDimension createCurrentDimension() {
        return new CurrentDimension();
    }

    /**
     * Create an instance of {@link NeckSizeDimension }
     * 
     */
    public NeckSizeDimension createNeckSizeDimension() {
        return new NeckSizeDimension();
    }

    /**
     * Create an instance of {@link OptionalMagnificationDimension }
     * 
     */
    public OptionalMagnificationDimension createOptionalMagnificationDimension() {
        return new OptionalMagnificationDimension();
    }

    /**
     * Create an instance of {@link LuminanceIntegerDimension }
     * 
     */
    public LuminanceIntegerDimension createLuminanceIntegerDimension() {
        return new LuminanceIntegerDimension();
    }

    /**
     * Create an instance of {@link JewelryLengthDimension }
     * 
     */
    public JewelryLengthDimension createJewelryLengthDimension() {
        return new JewelryLengthDimension();
    }

    /**
     * Create an instance of {@link LuminancePositiveIntegerDimension }
     * 
     */
    public LuminancePositiveIntegerDimension createLuminancePositiveIntegerDimension() {
        return new LuminancePositiveIntegerDimension();
    }

    /**
     * Create an instance of {@link VineyardYieldDimension }
     * 
     */
    public VineyardYieldDimension createVineyardYieldDimension() {
        return new VineyardYieldDimension();
    }

    /**
     * Create an instance of {@link StringTemperatureDimension }
     * 
     */
    public StringTemperatureDimension createStringTemperatureDimension() {
        return new StringTemperatureDimension();
    }

    /**
     * Create an instance of {@link StringTimeDimension }
     * 
     */
    public StringTimeDimension createStringTimeDimension() {
        return new StringTimeDimension();
    }

    /**
     * Create an instance of {@link CycleLengthDimension }
     * 
     */
    public CycleLengthDimension createCycleLengthDimension() {
        return new CycleLengthDimension();
    }

    /**
     * Create an instance of {@link ForceDimension }
     * 
     */
    public ForceDimension createForceDimension() {
        return new ForceDimension();
    }

    /**
     * Create an instance of {@link GraduationInterval }
     * 
     */
    public GraduationInterval createGraduationInterval() {
        return new GraduationInterval();
    }

    /**
     * Create an instance of {@link DatedPrice }
     * 
     */
    public DatedPrice createDatedPrice() {
        return new DatedPrice();
    }

    /**
     * Create an instance of {@link WeightRecommendationType }
     * 
     */
    public WeightRecommendationType createWeightRecommendationType() {
        return new WeightRecommendationType();
    }

    /**
     * Create an instance of {@link MagnificationDimension }
     * 
     */
    public MagnificationDimension createMagnificationDimension() {
        return new MagnificationDimension();
    }

    /**
     * Create an instance of {@link DatedCompareAtPrice }
     * 
     */
    public DatedCompareAtPrice createDatedCompareAtPrice() {
        return new DatedCompareAtPrice();
    }

    /**
     * Create an instance of {@link PhoneNumberType }
     * 
     */
    public PhoneNumberType createPhoneNumberType() {
        return new PhoneNumberType();
    }

    /**
     * Create an instance of {@link LoyaltyCustomAttribute }
     * 
     */
    public LoyaltyCustomAttribute createLoyaltyCustomAttribute() {
        return new LoyaltyCustomAttribute();
    }

    /**
     * Create an instance of {@link MillimeterDecimalDimension }
     * 
     */
    public MillimeterDecimalDimension createMillimeterDecimalDimension() {
        return new MillimeterDecimalDimension();
    }

    /**
     * Create an instance of {@link ClothingSizeDimension }
     * 
     */
    public ClothingSizeDimension createClothingSizeDimension() {
        return new ClothingSizeDimension();
    }

    /**
     * Create an instance of {@link OptionalSpeedDimension }
     * 
     */
    public OptionalSpeedDimension createOptionalSpeedDimension() {
        return new OptionalSpeedDimension();
    }

    /**
     * Create an instance of {@link PositiveNonZeroWeightDimension }
     * 
     */
    public PositiveNonZeroWeightDimension createPositiveNonZeroWeightDimension() {
        return new PositiveNonZeroWeightDimension();
    }

    /**
     * Create an instance of {@link DensityDimension }
     * 
     */
    public DensityDimension createDensityDimension() {
        return new DensityDimension();
    }

    /**
     * Create an instance of {@link BatteryLifeDimension }
     * 
     */
    public BatteryLifeDimension createBatteryLifeDimension() {
        return new BatteryLifeDimension();
    }

    /**
     * Create an instance of {@link OptionalLineCapacityDimension }
     * 
     */
    public OptionalLineCapacityDimension createOptionalLineCapacityDimension() {
        return new OptionalLineCapacityDimension();
    }

    /**
     * Create an instance of {@link AlcoholContentDimension }
     * 
     */
    public AlcoholContentDimension createAlcoholContentDimension() {
        return new AlcoholContentDimension();
    }

    /**
     * Create an instance of {@link SweetnessAtHarvestDimension }
     * 
     */
    public SweetnessAtHarvestDimension createSweetnessAtHarvestDimension() {
        return new SweetnessAtHarvestDimension();
    }

    /**
     * Create an instance of {@link PositiveCurrencyAmount }
     * 
     */
    public PositiveCurrencyAmount createPositiveCurrencyAmount() {
        return new PositiveCurrencyAmount();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link DateIntegerDimension }
     * 
     */
    public DateIntegerDimension createDateIntegerDimension() {
        return new DateIntegerDimension();
    }

    /**
     * Create an instance of {@link TemperatureDimension }
     * 
     */
    public TemperatureDimension createTemperatureDimension() {
        return new TemperatureDimension();
    }

    /**
     * Create an instance of {@link SubscriptionTermDimension }
     * 
     */
    public SubscriptionTermDimension createSubscriptionTermDimension() {
        return new SubscriptionTermDimension();
    }

    /**
     * Create an instance of {@link StringLengthDimension }
     * 
     */
    public StringLengthDimension createStringLengthDimension() {
        return new StringLengthDimension();
    }

    /**
     * Create an instance of {@link JewelryWeightDimension }
     * 
     */
    public JewelryWeightDimension createJewelryWeightDimension() {
        return new JewelryWeightDimension();
    }

    /**
     * Create an instance of {@link EmailAddressType }
     * 
     */
    public EmailAddressType createEmailAddressType() {
        return new EmailAddressType();
    }

    /**
     * Create an instance of {@link SunProtectionDimension }
     * 
     */
    public SunProtectionDimension createSunProtectionDimension() {
        return new SunProtectionDimension();
    }

    /**
     * Create an instance of {@link PromotionDataType.Component }
     * 
     */
    public PromotionDataType.Component createPromotionDataTypeComponent() {
        return new PromotionDataType.Component();
    }

    /**
     * Create an instance of {@link BuyerPrice.Component }
     * 
     */
    public BuyerPrice.Component createBuyerPriceComponent() {
        return new BuyerPrice.Component();
    }

    /**
     * Create an instance of {@link HomeImprovementTools.VariationData }
     * 
     */
    public HomeImprovementTools.VariationData createHomeImprovementToolsVariationData() {
        return new HomeImprovementTools.VariationData();
    }

    /**
     * Create an instance of {@link AmazonFees.Fee }
     * 
     */
    public AmazonFees.Fee createAmazonFeesFee() {
        return new AmazonFees.Fee();
    }

    /**
     * Create an instance of {@link DirectPaymentType.Component }
     * 
     */
    public DirectPaymentType.Component createDirectPaymentTypeComponent() {
        return new DirectPaymentType.Component();
    }

    /**
     * Create an instance of {@link com.elcuk.jaxb.Home.ProductType.Home.VariationData }
     * 
     */
    public com.elcuk.jaxb.Home.ProductType.Home.VariationData createHomeProductTypeHomeVariationData() {
        return new com.elcuk.jaxb.Home.ProductType.Home.VariationData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProcessorBrand")
    public JAXBElement<String> createProcessorBrand(String value) {
        return new JAXBElement<String>(_ProcessorBrand_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxMemorySupported")
    public JAXBElement<MemorySizeIntegerDimension> createMaxMemorySupported(MemorySizeIntegerDimension value) {
        return new JAXBElement<MemorySizeIntegerDimension>(_MaxMemorySupported_QNAME, MemorySizeIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputVideoConnectorsTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InputVideoConnectors")
    public JAXBElement<InputVideoConnectorsTypeValues> createInputVideoConnectors(InputVideoConnectorsTypeValues value) {
        return new JAXBElement<InputVideoConnectorsTypeValues>(_InputVideoConnectors_QNAME, InputVideoConnectorsTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PowerConsumption")
    public JAXBElement<PowerDimension> createPowerConsumption(PowerDimension value) {
        return new JAXBElement<PowerDimension>(_PowerConsumption_QNAME, PowerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumOperatingDistance")
    public JAXBElement<LengthIntegerDimension> createMaximumOperatingDistance(LengthIntegerDimension value) {
        return new JAXBElement<LengthIntegerDimension>(_MaximumOperatingDistance_QNAME, LengthIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPowerSource(String value) {
        return new JAXBElement<String>(_PowerSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RAMSize")
    public JAXBElement<MemorySizeDimension> createRAMSize(MemorySizeDimension value) {
        return new JAXBElement<MemorySizeDimension>(_RAMSize_QNAME, MemorySizeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CableInterface")
    public JAXBElement<String> createCableInterface(String value) {
        return new JAXBElement<String>(_CableInterface_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DriveRPM")
    public JAXBElement<BigInteger> createDriveRPM(BigInteger value) {
        return new JAXBElement<BigInteger>(_DriveRPM_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DockingStationExternalInterfaceTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DockingStationExternalInterface")
    public JAXBElement<DockingStationExternalInterfaceTypeValues> createDockingStationExternalInterface(DockingStationExternalInterfaceTypeValues value) {
        return new JAXBElement<DockingStationExternalInterfaceTypeValues>(_DockingStationExternalInterface_QNAME, DockingStationExternalInterfaceTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfLPT1PrinterPorts")
    public JAXBElement<BigInteger> createNumberOfLPT1PrinterPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfLPT1PrinterPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SVideoInputType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSVideoInputType(String value) {
        return new JAXBElement<String>(_SVideoInputType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FanPowerConnector")
    public JAXBElement<String> createFanPowerConnector(String value) {
        return new JAXBElement<String>(_FanPowerConnector_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FixedFocalLength")
    public JAXBElement<LengthDimension> createFixedFocalLength(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_FixedFocalLength_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Averageseektime")
    public JAXBElement<BigInteger> createAverageseektime(BigInteger value) {
        return new JAXBElement<BigInteger>(_Averageseektime_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WirelessTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWirelessTechnology(String value) {
        return new JAXBElement<String>(_WirelessTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DisplayResolutionMaximum")
    public JAXBElement<String> createDisplayResolutionMaximum(String value) {
        return new JAXBElement<String>(_DisplayResolutionMaximum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfButtons")
    public JAXBElement<BigInteger> createNumberOfButtons(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfButtons_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeedRating")
    public JAXBElement<String> createSpeedRating(String value) {
        return new JAXBElement<String>(_SpeedRating_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MemoryStorageCapacity")
    public JAXBElement<MemorySizeIntegerDimension> createMemoryStorageCapacity(MemorySizeIntegerDimension value) {
        return new JAXBElement<MemorySizeIntegerDimension>(_MemoryStorageCapacity_QNAME, MemorySizeIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BluRayRegionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BluRayRegion")
    public JAXBElement<BluRayRegionType> createBluRayRegion(BluRayRegionType value) {
        return new JAXBElement<BluRayRegionType>(_BluRayRegion_QNAME, BluRayRegionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ShaderClock")
    public JAXBElement<FrequencyIntegerDimension> createShaderClock(FrequencyIntegerDimension value) {
        return new JAXBElement<FrequencyIntegerDimension>(_ShaderClock_QNAME, FrequencyIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NoiseReductionLevel")
    public JAXBElement<BigDecimal> createNoiseReductionLevel(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NoiseReductionLevel_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinShutterSpeed")
    public JAXBElement<BigDecimal> createMinShutterSpeed(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MinShutterSpeed_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalNumberOfInternalBays")
    public JAXBElement<BigInteger> createTotalNumberOfInternalBays(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalNumberOfInternalBays_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RAMFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRAMFormFactor(String value) {
        return new JAXBElement<String>(_RAMFormFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThreeDTechnologyValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ThreeDTechnology")
    public JAXBElement<ThreeDTechnologyValues> createThreeDTechnology(ThreeDTechnologyValues value) {
        return new JAXBElement<ThreeDTechnologyValues>(_ThreeDTechnology_QNAME, ThreeDTechnologyValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CasLatency")
    public JAXBElement<BigInteger> createCasLatency(BigInteger value) {
        return new JAXBElement<BigInteger>(_CasLatency_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HardwarePlatform")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHardwarePlatform(String value) {
        return new JAXBElement<String>(_HardwarePlatform_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabletActiveSurfaceAreaDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TabletSurfaceActiveArea")
    public JAXBElement<TabletActiveSurfaceAreaDimension> createTabletSurfaceActiveArea(TabletActiveSurfaceAreaDimension value) {
        return new JAXBElement<TabletActiveSurfaceAreaDimension>(_TabletSurfaceActiveArea_QNAME, TabletActiveSurfaceAreaDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HardDriveSize")
    public JAXBElement<MemorySizeDimension> createHardDriveSize(MemorySizeDimension value) {
        return new JAXBElement<MemorySizeDimension>(_HardDriveSize_QNAME, MemorySizeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfPorts")
    public JAXBElement<BigInteger> createNumberOfPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MemorySlotsAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMemorySlotsAvailable(String value) {
        return new JAXBElement<String>(_MemorySlotsAvailable_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StorageMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStorageMaterialType(String value) {
        return new JAXBElement<String>(_StorageMaterialType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TVTunerVideoOutputInterface")
    public JAXBElement<String> createTVTunerVideoOutputInterface(String value) {
        return new JAXBElement<String>(_TVTunerVideoOutputInterface_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExpansionSlots")
    public JAXBElement<BigInteger> createExpansionSlots(BigInteger value) {
        return new JAXBElement<BigInteger>(_ExpansionSlots_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoomDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DigitalZoom")
    public JAXBElement<ZoomDimension> createDigitalZoom(ZoomDimension value) {
        return new JAXBElement<ZoomDimension>(_DigitalZoom_QNAME, ZoomDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsCardMaxResolution")
    public JAXBElement<String> createGraphicsCardMaxResolution(String value) {
        return new JAXBElement<String>(_GraphicsCardMaxResolution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LargestFanSize")
    public JAXBElement<LengthFiveDigitDimension> createLargestFanSize(LengthFiveDigitDimension value) {
        return new JAXBElement<LengthFiveDigitDimension>(_LargestFanSize_QNAME, LengthFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TunerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTunerTechnology(String value) {
        return new JAXBElement<String>(_TunerTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransferSpeedFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxDownstreamTransmissionRate")
    public JAXBElement<DataTransferSpeedFiveDigitIntegerDimension> createMaxDownstreamTransmissionRate(DataTransferSpeedFiveDigitIntegerDimension value) {
        return new JAXBElement<DataTransferSpeedFiveDigitIntegerDimension>(_MaxDownstreamTransmissionRate_QNAME, DataTransferSpeedFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransferSpeedIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ReadSpeed")
    public JAXBElement<DataTransferSpeedIntegerDimension> createReadSpeed(DataTransferSpeedIntegerDimension value) {
        return new JAXBElement<DataTransferSpeedIntegerDimension>(_ReadSpeed_QNAME, DataTransferSpeedIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerPlugType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PowerPlugType")
    public JAXBElement<PowerPlugType> createPowerPlugType(PowerPlugType value) {
        return new JAXBElement<PowerPlugType>(_PowerPlugType_QNAME, PowerPlugType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AntennaLocation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAntennaLocation(String value) {
        return new JAXBElement<String>(_AntennaLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfSerialPorts")
    public JAXBElement<BigInteger> createNumberOfSerialPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfSerialPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PrimaryHeadphoneUse")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPrimaryHeadphoneUse(String value) {
        return new JAXBElement<String>(_PrimaryHeadphoneUse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Speaker")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSpeaker(String value) {
        return new JAXBElement<String>(_Speaker_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProjectionMethod")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createProjectionMethod(String value) {
        return new JAXBElement<String>(_ProjectionMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComputerMemoryFormFactor")
    public JAXBElement<String> createComputerMemoryFormFactor(String value) {
        return new JAXBElement<String>(_ComputerMemoryFormFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PressureLevelSixDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PressureLevels")
    public JAXBElement<PressureLevelSixDigitIntegerDimension> createPressureLevels(PressureLevelSixDigitIntegerDimension value) {
        return new JAXBElement<PressureLevelSixDigitIntegerDimension>(_PressureLevels_QNAME, PressureLevelSixDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalMiniHDMIPorts")
    public JAXBElement<BigInteger> createTotalMiniHDMIPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalMiniHDMIPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FlashModesDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFlashModesDescription(String value) {
        return new JAXBElement<String>(_FlashModesDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TweeterDriverDiameter")
    public JAXBElement<LengthDimension> createTweeterDriverDiameter(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_TweeterDriverDiameter_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DurationOfMapService")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDurationOfMapService(String value) {
        return new JAXBElement<String>(_DurationOfMapService_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MediaLayers")
    public JAXBElement<BigInteger> createMediaLayers(BigInteger value) {
        return new JAXBElement<BigInteger>(_MediaLayers_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolutionFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FrontWebcamResolution")
    public JAXBElement<ResolutionFiveDigitDimension> createFrontWebcamResolution(ResolutionFiveDigitDimension value) {
        return new JAXBElement<ResolutionFiveDigitDimension>(_FrontWebcamResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhotoFilterMountType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPhotoFilterMountType(String value) {
        return new JAXBElement<String>(_PhotoFilterMountType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPanelUSB1.1Ports")
    public JAXBElement<BigInteger> createTotalFrontPanelUSB11Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPanelUSB11Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USBPortType")
    public JAXBElement<BigInteger> createUSBPortType(BigInteger value) {
        return new JAXBElement<BigInteger>(_USBPortType_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BatteryChargeCycles")
    public JAXBElement<BigInteger> createBatteryChargeCycles(BigInteger value) {
        return new JAXBElement<BigInteger>(_BatteryChargeCycles_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BaseLength")
    public JAXBElement<LengthDimension> createBaseLength(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_BaseLength_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Audio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAudio(String value) {
        return new JAXBElement<String>(_Audio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ThreeDReady")
    public JAXBElement<String> createThreeDReady(String value) {
        return new JAXBElement<String>(_ThreeDReady_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CompatibleDeviceSize")
    public JAXBElement<BigDecimal> createCompatibleDeviceSize(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CompatibleDeviceSize_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProductTaxCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createProductTaxCode(String value) {
        return new JAXBElement<String>(_ProductTaxCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpticalDriveIntegrated")
    public JAXBElement<BigInteger> createOpticalDriveIntegrated(BigInteger value) {
        return new JAXBElement<BigInteger>(_OpticalDriveIntegrated_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolutionFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WebcamVideoCaptureResolution")
    public JAXBElement<ResolutionFiveDigitDimension> createWebcamVideoCaptureResolution(ResolutionFiveDigitDimension value) {
        return new JAXBElement<ResolutionFiveDigitDimension>(_WebcamVideoCaptureResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ImageStabilization")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createImageStabilization(String value) {
        return new JAXBElement<String>(_ImageStabilization_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MotherboardFormFactor")
    public JAXBElement<String> createMotherboardFormFactor(String value) {
        return new JAXBElement<String>(_MotherboardFormFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfeSATAPorts")
    public JAXBElement<BigInteger> createNumberOfeSATAPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfeSATAPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FocusType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFocusType(String value) {
        return new JAXBElement<String>(_FocusType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CableType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCableType(String value) {
        return new JAXBElement<String>(_CableType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WirelessInputDeviceTechnologyTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WirelessInputDeviceTechnology")
    public JAXBElement<WirelessInputDeviceTechnologyTypeValues> createWirelessInputDeviceTechnology(WirelessInputDeviceTechnologyTypeValues value) {
        return new JAXBElement<WirelessInputDeviceTechnologyTypeValues>(_WirelessInputDeviceTechnology_QNAME, WirelessInputDeviceTechnologyTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CPUSocketType")
    public JAXBElement<String> createCPUSocketType(String value) {
        return new JAXBElement<String>(_CPUSocketType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApertureDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxAperture")
    public JAXBElement<ApertureDimension> createMaxAperture(ApertureDimension value) {
        return new JAXBElement<ApertureDimension>(_MaxAperture_QNAME, ApertureDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MerchantFulfillmentID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMerchantFulfillmentID(String value) {
        return new JAXBElement<String>(_MerchantFulfillmentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PlatformCompatability")
    public JAXBElement<String> createPlatformCompatability(String value) {
        return new JAXBElement<String>(_PlatformCompatability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProcessorCoolingDevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createProcessorCoolingDevice(String value) {
        return new JAXBElement<String>(_ProcessorCoolingDevice_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalUSB1.0Connectors")
    public JAXBElement<BigInteger> createTotalUSB10Connectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalUSB10Connectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransferSpeedIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NASNetworkInterface")
    public JAXBElement<DataTransferSpeedIntegerDimension> createNASNetworkInterface(DataTransferSpeedIntegerDimension value) {
        return new JAXBElement<DataTransferSpeedIntegerDimension>(_NASNetworkInterface_QNAME, DataTransferSpeedIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CameraFilmSpeed")
    public JAXBElement<BigInteger> createCameraFilmSpeed(BigInteger value) {
        return new JAXBElement<BigInteger>(_CameraFilmSpeed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConnectionType")
    public JAXBElement<ConnectionTypeValues> createConnectionType(ConnectionTypeValues value) {
        return new JAXBElement<ConnectionTypeValues>(_ConnectionType_QNAME, ConnectionTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalUSB3.0Connectors")
    public JAXBElement<BigInteger> createTotalUSB30Connectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalUSB30Connectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MarketplaceName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMarketplaceName(String value) {
        return new JAXBElement<String>(_MarketplaceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MemoryStandard")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMemoryStandard(String value) {
        return new JAXBElement<String>(_MemoryStandard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfSATAPorts")
    public JAXBElement<BigInteger> createNumberOfSATAPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfSATAPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MountingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMountingType(String value) {
        return new JAXBElement<String>(_MountingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubscriptionTermName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSubscriptionTermName(String value) {
        return new JAXBElement<String>(_SubscriptionTermName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumSupportedScreenSize")
    public JAXBElement<LengthDimension> createMinimumSupportedScreenSize(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_MinimumSupportedScreenSize_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ContrastRatio")
    public JAXBElement<String> createContrastRatio(String value) {
        return new JAXBElement<String>(_ContrastRatio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCompositePorts")
    public JAXBElement<BigInteger> createTotalCompositePorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalCompositePorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HeadphoneStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHeadphoneStyle(String value) {
        return new JAXBElement<String>(_HeadphoneStyle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InputDeviceInterfaceTechnology")
    public JAXBElement<String> createInputDeviceInterfaceTechnology(String value) {
        return new JAXBElement<String>(_InputDeviceInterfaceTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfGamingPorts")
    public JAXBElement<BigInteger> createNumberOfGamingPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfGamingPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxEthernetSpeedTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxEthernetSpeed")
    public JAXBElement<MaxEthernetSpeedTypeValues> createMaxEthernetSpeed(MaxEthernetSpeedTypeValues value) {
        return new JAXBElement<MaxEthernetSpeedTypeValues>(_MaxEthernetSpeed_QNAME, MaxEthernetSpeedTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OperatingSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOperatingSystem(String value) {
        return new JAXBElement<String>(_OperatingSystem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CoreClock")
    public JAXBElement<FrequencyIntegerDimension> createCoreClock(FrequencyIntegerDimension value) {
        return new JAXBElement<FrequencyIntegerDimension>(_CoreClock_QNAME, FrequencyIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SATARAID")
    public JAXBElement<String> createSATARAID(String value) {
        return new JAXBElement<String>(_SATARAID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProcessorType")
    public JAXBElement<String> createProcessorType(String value) {
        return new JAXBElement<String>(_ProcessorType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MultiGPUTechnology")
    public JAXBElement<String> createMultiGPUTechnology(String value) {
        return new JAXBElement<String>(_MultiGPUTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfUSB2.0Ports")
    public JAXBElement<BigInteger> createNumberOfUSB20Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfUSB20Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InputDeviceDesignStyle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createInputDeviceDesignStyle(String value) {
        return new JAXBElement<String>(_InputDeviceDesignStyle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalDVIPorts")
    public JAXBElement<BigInteger> createTotalDVIPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalDVIPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Language")
    public JAXBElement<LanguageStringType> createLanguage(LanguageStringType value) {
        return new JAXBElement<LanguageStringType>(_Language_QNAME, LanguageStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NetworkingProtocol")
    public JAXBElement<String> createNetworkingProtocol(String value) {
        return new JAXBElement<String>(_NetworkingProtocol_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AmplifierType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAmplifierType(String value) {
        return new JAXBElement<String>(_AmplifierType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComputerWirelessType")
    public JAXBElement<String> createComputerWirelessType(String value) {
        return new JAXBElement<String>(_ComputerWirelessType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SignalPassthroughTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSignalPassthroughTechnology(String value) {
        return new JAXBElement<String>(_SignalPassthroughTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeightDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxWeightRecommendation")
    public JAXBElement<WeightDimension> createMaxWeightRecommendation(WeightDimension value) {
        return new JAXBElement<WeightDimension>(_MaxWeightRecommendation_QNAME, WeightDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintingMediaTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PrintingMediaType")
    public JAXBElement<PrintingMediaTypeValues> createPrintingMediaType(PrintingMediaTypeValues value) {
        return new JAXBElement<PrintingMediaTypeValues>(_PrintingMediaType_QNAME, PrintingMediaTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VideoUpconversionTechnologies")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVideoUpconversionTechnologies(String value) {
        return new JAXBElement<String>(_VideoUpconversionTechnologies_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfSATAPowerConnectors")
    public JAXBElement<BigInteger> createNumberOfSATAPowerConnectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfSATAPowerConnectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfHDMIPorts")
    public JAXBElement<BigInteger> createNumberOfHDMIPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfHDMIPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumSystemRequirements")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMinimumSystemRequirements(String value) {
        return new JAXBElement<String>(_MinimumSystemRequirements_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FlashDedication")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFlashDedication(String value) {
        return new JAXBElement<String>(_FlashDedication_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ImageSensor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createImageSensor(String value) {
        return new JAXBElement<String>(_ImageSensor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BufferSize")
    public JAXBElement<MemorySizeIntegerDimension> createBufferSize(MemorySizeIntegerDimension value) {
        return new JAXBElement<MemorySizeIntegerDimension>(_BufferSize_QNAME, MemorySizeIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CacheSize")
    public JAXBElement<MemorySizeIntegerDimension> createCacheSize(MemorySizeIntegerDimension value) {
        return new JAXBElement<MemorySizeIntegerDimension>(_CacheSize_QNAME, MemorySizeIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CPUSocketCompatability")
    public JAXBElement<String> createCPUSocketCompatability(String value) {
        return new JAXBElement<String>(_CPUSocketCompatability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HasProgrammableButtons")
    public JAXBElement<Boolean> createHasProgrammableButtons(Boolean value) {
        return new JAXBElement<Boolean>(_HasProgrammableButtons_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SKU")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSKU(String value) {
        return new JAXBElement<String>(_SKU_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfFirewirePorts")
    public JAXBElement<BigInteger> createNumberOfFirewirePorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfFirewirePorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalNumberOfExternalBays")
    public JAXBElement<BigInteger> createTotalNumberOfExternalBays(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalNumberOfExternalBays_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfPS2Ports")
    public JAXBElement<BigInteger> createNumberOfPS2Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfPS2Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WattageDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakersNominalOutputPower")
    public JAXBElement<WattageDimension> createSpeakersNominalOutputPower(WattageDimension value) {
        return new JAXBElement<WattageDimension>(_SpeakersNominalOutputPower_QNAME, WattageDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhotoFilterEffectSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPhotoFilterEffectSize(String value) {
        return new JAXBElement<String>(_PhotoFilterEffectSize_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumVerticalRefreshRate")
    public JAXBElement<FrequencyFiveDigitIntegerDimension> createMaximumVerticalRefreshRate(FrequencyFiveDigitIntegerDimension value) {
        return new JAXBElement<FrequencyFiveDigitIntegerDimension>(_MaximumVerticalRefreshRate_QNAME, FrequencyFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WattageDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakersMaximumOutputPower")
    public JAXBElement<WattageDimension> createSpeakersMaximumOutputPower(WattageDimension value) {
        return new JAXBElement<WattageDimension>(_SpeakersMaximumOutputPower_QNAME, WattageDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CalibrationTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCalibrationTechnology(String value) {
        return new JAXBElement<String>(_CalibrationTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompatibleMemoryCardTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CompatibleMemoryCard")
    public JAXBElement<CompatibleMemoryCardTypeValues> createCompatibleMemoryCard(CompatibleMemoryCardTypeValues value) {
        return new JAXBElement<CompatibleMemoryCardTypeValues>(_CompatibleMemoryCard_QNAME, CompatibleMemoryCardTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PowerFactorCorrection")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPowerFactorCorrection(String value) {
        return new JAXBElement<String>(_PowerFactorCorrection_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HasColorScreen")
    public JAXBElement<Boolean> createHasColorScreen(Boolean value) {
        return new JAXBElement<Boolean>(_HasColorScreen_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BoxContents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBoxContents(String value) {
        return new JAXBElement<String>(_BoxContents_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PCIExpressConnectorConfiguration")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPCIExpressConnectorConfiguration(String value) {
        return new JAXBElement<String>(_PCIExpressConnectorConfiguration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ShipOption")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createShipOption(String value) {
        return new JAXBElement<String>(_ShipOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPreampOutputs")
    public JAXBElement<BigInteger> createTotalPreampOutputs(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalPreampOutputs_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalMicrophonePorts")
    public JAXBElement<BigInteger> createTotalMicrophonePorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalMicrophonePorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConnectorNumber")
    public JAXBElement<BigInteger> createConnectorNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_ConnectorNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InternetApplications")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createInternetApplications(String value) {
        return new JAXBElement<String>(_InternetApplications_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPanelUSB3.0Ports")
    public JAXBElement<BigInteger> createTotalFrontPanelUSB30Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPanelUSB30Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DVDRegion")
    public JAXBElement<BigInteger> createDVDRegion(BigInteger value) {
        return new JAXBElement<BigInteger>(_DVDRegion_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ThrowRatio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createThrowRatio(String value) {
        return new JAXBElement<String>(_ThrowRatio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ScreenResolution")
    public JAXBElement<String> createScreenResolution(String value) {
        return new JAXBElement<String>(_ScreenResolution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Denomination")
    public JAXBElement<BigDecimal> createDenomination(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Denomination_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DeliveryChannel")
    public JAXBElement<String> createDeliveryChannel(String value) {
        return new JAXBElement<String>(_DeliveryChannel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhotoFilterBayonetSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPhotoFilterBayonetSize(String value) {
        return new JAXBElement<String>(_PhotoFilterBayonetSize_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemoryCardTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MemoryCardType")
    public JAXBElement<MemoryCardTypeValues> createMemoryCardType(MemoryCardTypeValues value) {
        return new JAXBElement<MemoryCardTypeValues>(_MemoryCardType_QNAME, MemoryCardTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabletInputMethodTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TabletInputMethod")
    public JAXBElement<TabletInputMethodTypeValues> createTabletInputMethod(TabletInputMethodTypeValues value) {
        return new JAXBElement<TabletInputMethodTypeValues>(_TabletInputMethod_QNAME, TabletInputMethodTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransferSpeedFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxUpstreamTransmissionRate")
    public JAXBElement<DataTransferSpeedFiveDigitIntegerDimension> createMaxUpstreamTransmissionRate(DataTransferSpeedFiveDigitIntegerDimension value) {
        return new JAXBElement<DataTransferSpeedFiveDigitIntegerDimension>(_MaxUpstreamTransmissionRate_QNAME, DataTransferSpeedFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoltageFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ScreenTrigger")
    public JAXBElement<VoltageFiveDigitIntegerDimension> createScreenTrigger(VoltageFiveDigitIntegerDimension value) {
        return new JAXBElement<VoltageFiveDigitIntegerDimension>(_ScreenTrigger_QNAME, VoltageFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ZoomType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createZoomType(String value) {
        return new JAXBElement<String>(_ZoomType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFirewire800Connectors")
    public JAXBElement<BigInteger> createTotalFirewire800Connectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFirewire800Connectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TweeterSpeakerDiameter")
    public JAXBElement<LengthDimension> createTweeterSpeakerDiameter(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_TweeterSpeakerDiameter_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ColorMap")
    public JAXBElement<String> createColorMap(String value) {
        return new JAXBElement<String>(_ColorMap_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoundCardInterfaceTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SoundCardInterface")
    public JAXBElement<SoundCardInterfaceTypeValues> createSoundCardInterface(SoundCardInterfaceTypeValues value) {
        return new JAXBElement<SoundCardInterfaceTypeValues>(_SoundCardInterface_QNAME, SoundCardInterfaceTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalVideoOutPorts")
    public JAXBElement<BigInteger> createTotalVideoOutPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalVideoOutPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FrontPanelInputs")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFrontPanelInputs(String value) {
        return new JAXBElement<String>(_FrontPanelInputs_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RemoteIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRemoteIncluded(String value) {
        return new JAXBElement<String>(_RemoteIncluded_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFirewire400Connectors")
    public JAXBElement<BigInteger> createTotalFirewire400Connectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFirewire400Connectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalComponentInPorts")
    public JAXBElement<BigInteger> createTotalComponentInPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalComponentInPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AmazonOrderItemCode")
    public JAXBElement<String> createAmazonOrderItemCode(String value) {
        return new JAXBElement<String>(_AmazonOrderItemCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakerGrilleMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSpeakerGrilleMaterial(String value) {
        return new JAXBElement<String>(_SpeakerGrilleMaterial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhotoFilterDropInSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPhotoFilterDropInSize(String value) {
        return new JAXBElement<String>(_PhotoFilterDropInSize_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthSevenDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "KeystoneCorrection")
    public JAXBElement<LengthSevenDigitDimension> createKeystoneCorrection(LengthSevenDigitDimension value) {
        return new JAXBElement<LengthSevenDigitDimension>(_KeystoneCorrection_QNAME, LengthSevenDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsCardCooler")
    public JAXBElement<String> createGraphicsCardCooler(String value) {
        return new JAXBElement<String>(_GraphicsCardCooler_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "KeyboardDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createKeyboardDescription(String value) {
        return new JAXBElement<String>(_KeyboardDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AudioEncoding")
    public JAXBElement<String> createAudioEncoding(String value) {
        return new JAXBElement<String>(_AudioEncoding_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ResponseTime")
    public JAXBElement<BigInteger> createResponseTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResponseTime_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SSDConnectorPins")
    public JAXBElement<BigInteger> createSSDConnectorPins(BigInteger value) {
        return new JAXBElement<BigInteger>(_SSDConnectorPins_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfSpeakers")
    public JAXBElement<BigInteger> createNumberOfSpeakers(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfSpeakers_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LampWattage")
    public JAXBElement<BigInteger> createLampWattage(BigInteger value) {
        return new JAXBElement<BigInteger>(_LampWattage_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfSatelliteSpeakers")
    public JAXBElement<BigDecimal> createNumberOfSatelliteSpeakers(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NumberOfSatelliteSpeakers_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AmazonOrderID")
    public JAXBElement<String> createAmazonOrderID(String value) {
        return new JAXBElement<String>(_AmazonOrderID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfEthernetPorts")
    public JAXBElement<BigInteger> createNumberOfEthernetPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfEthernetPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SLICertification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSLICertification(String value) {
        return new JAXBElement<String>(_SLICertification_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Averagelatency")
    public JAXBElement<BigInteger> createAveragelatency(BigInteger value) {
        return new JAXBElement<BigInteger>(_Averagelatency_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConnectivityType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createConnectivityType(String value) {
        return new JAXBElement<String>(_ConnectivityType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DeviceHardwareCompatability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDeviceHardwareCompatability(String value) {
        return new JAXBElement<String>(_DeviceHardwareCompatability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CarrierCode")
    public JAXBElement<String> createCarrierCode(String value) {
        return new JAXBElement<String>(_CarrierCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BiAmpable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBiAmpable(String value) {
        return new JAXBElement<String>(_BiAmpable_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubwooferPowerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSubwooferPowerTechnology(String value) {
        return new JAXBElement<String>(_SubwooferPowerTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPaneleSataPorts")
    public JAXBElement<BigInteger> createTotalFrontPaneleSataPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPaneleSataPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProcessorCount")
    public JAXBElement<BigInteger> createProcessorCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_ProcessorCount_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComputerMemoryTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createComputerMemoryTechnology(String value) {
        return new JAXBElement<String>(_ComputerMemoryTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabletResolutionDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TabletResolution")
    public JAXBElement<TabletResolutionDimension> createTabletResolution(TabletResolutionDimension value) {
        return new JAXBElement<TabletResolutionDimension>(_TabletResolution_QNAME, TabletResolutionDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakerMaximumInputPower")
    public JAXBElement<PowerDimension> createSpeakerMaximumInputPower(PowerDimension value) {
        return new JAXBElement<PowerDimension>(_SpeakerMaximumInputPower_QNAME, PowerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalVgaInPorts")
    public JAXBElement<BigInteger> createTotalVgaInPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalVgaInPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterfaceTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InterfaceType")
    public JAXBElement<InterfaceTypeValues> createInterfaceType(InterfaceTypeValues value) {
        return new JAXBElement<InterfaceTypeValues>(_InterfaceType_QNAME, InterfaceTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ParentalControlTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createParentalControlTechnology(String value) {
        return new JAXBElement<String>(_ParentalControlTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthSevenDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ImageDiagonalSize")
    public JAXBElement<LengthSevenDigitDimension> createImageDiagonalSize(LengthSevenDigitDimension value) {
        return new JAXBElement<LengthSevenDigitDimension>(_ImageDiagonalSize_QNAME, LengthSevenDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumSupportedScreenSize")
    public JAXBElement<LengthDimension> createMaximumSupportedScreenSize(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_MaximumSupportedScreenSize_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxFocalLength")
    public JAXBElement<LengthDimension> createMaxFocalLength(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_MaxFocalLength_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WirelessStandard")
    public JAXBElement<String> createWirelessStandard(String value) {
        return new JAXBElement<String>(_WirelessStandard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakerCount")
    public JAXBElement<BigInteger> createSpeakerCount(BigInteger value) {
        return new JAXBElement<BigInteger>(_SpeakerCount_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AntennaDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAntennaDescription(String value) {
        return new JAXBElement<String>(_AntennaDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfLithiumMetalCells")
    public JAXBElement<BigInteger> createNumberOfLithiumMetalCells(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfLithiumMetalCells_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NetworkAdapterType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNetworkAdapterType(String value) {
        return new JAXBElement<String>(_NetworkAdapterType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakerDiameter")
    public JAXBElement<LengthDimension> createSpeakerDiameter(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_SpeakerDiameter_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalUSB2.0Connectors")
    public JAXBElement<BigInteger> createTotalUSB20Connectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalUSB20Connectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthFourDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HotswapBayType")
    public JAXBElement<LengthFourDigitDimension> createHotswapBayType(LengthFourDigitDimension value) {
        return new JAXBElement<LengthFourDigitDimension>(_HotswapBayType_QNAME, LengthFourDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACAdapterCurrent")
    public JAXBElement<CurrentFiveDigitDimension> createACAdapterCurrent(CurrentFiveDigitDimension value) {
        return new JAXBElement<CurrentFiveDigitDimension>(_ACAdapterCurrent_QNAME, CurrentFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumHorizontalVideoResolution")
    public JAXBElement<BigInteger> createMaximumHorizontalVideoResolution(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumHorizontalVideoResolution_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TweeterSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTweeterSpeakerMaterial(String value) {
        return new JAXBElement<String>(_TweeterSpeakerMaterial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfUSBHubConnectorPorts")
    public JAXBElement<BigInteger> createNumberOfUSBHubConnectorPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfUSBHubConnectorPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumThrowRatio")
    public JAXBElement<String> createMaximumThrowRatio(String value) {
        return new JAXBElement<String>(_MaximumThrowRatio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransferSpeedDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CableSpeed")
    public JAXBElement<DataTransferSpeedDimension> createCableSpeed(DataTransferSpeedDimension value) {
        return new JAXBElement<DataTransferSpeedDimension>(_CableSpeed_QNAME, DataTransferSpeedDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfexternalBays")
    public JAXBElement<BigInteger> createNumberOfexternalBays(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfexternalBays_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalConnectorTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InternalConnector")
    public JAXBElement<InternalConnectorTypeValues> createInternalConnector(InternalConnectorTypeValues value) {
        return new JAXBElement<InternalConnectorTypeValues>(_InternalConnector_QNAME, InternalConnectorTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumVerticalRefreshRate")
    public JAXBElement<FrequencyFiveDigitIntegerDimension> createMinimumVerticalRefreshRate(FrequencyFiveDigitIntegerDimension value) {
        return new JAXBElement<FrequencyFiveDigitIntegerDimension>(_MinimumVerticalRefreshRate_QNAME, FrequencyFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MountMotion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMountMotion(String value) {
        return new JAXBElement<String>(_MountMotion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MerchantPromotionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMerchantPromotionID(String value) {
        return new JAXBElement<String>(_MerchantPromotionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPanelAudioInPorts")
    public JAXBElement<BigInteger> createTotalFrontPanelAudioInPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPanelAudioInPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HasAutoFocus")
    public JAXBElement<Boolean> createHasAutoFocus(Boolean value) {
        return new JAXBElement<Boolean>(_HasAutoFocus_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RecordingCapacity")
    public JAXBElement<TimeIntegerDimension> createRecordingCapacity(TimeIntegerDimension value) {
        return new JAXBElement<TimeIntegerDimension>(_RecordingCapacity_QNAME, TimeIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ViewingAngle")
    public JAXBElement<BigInteger> createViewingAngle(BigInteger value) {
        return new JAXBElement<BigInteger>(_ViewingAngle_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LANPortBandwidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLANPortBandwidth(String value) {
        return new JAXBElement<String>(_LANPortBandwidth_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Remote")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRemote(String value) {
        return new JAXBElement<String>(_Remote_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComputerMemoryType")
    public JAXBElement<String> createComputerMemoryType(String value) {
        return new JAXBElement<String>(_ComputerMemoryType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FanIncluded")
    public JAXBElement<BigInteger> createFanIncluded(BigInteger value) {
        return new JAXBElement<BigInteger>(_FanIncluded_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "URacksize")
    public JAXBElement<BigInteger> createURacksize(BigInteger value) {
        return new JAXBElement<BigInteger>(_URacksize_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalSVideoInPorts")
    public JAXBElement<BigInteger> createTotalSVideoInPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalSVideoInPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessorSeriesTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProcessorSeries")
    public JAXBElement<ProcessorSeriesTypeValues> createProcessorSeries(ProcessorSeriesTypeValues value) {
        return new JAXBElement<ProcessorSeriesTypeValues>(_ProcessorSeries_QNAME, ProcessorSeriesTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxExpandedMemorySupported")
    public JAXBElement<MemorySizeDimension> createMaxExpandedMemorySupported(MemorySizeDimension value) {
        return new JAXBElement<MemorySizeDimension>(_MaxExpandedMemorySupported_QNAME, MemorySizeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProcessorSpeed")
    public JAXBElement<FrequencyDimension> createProcessorSpeed(FrequencyDimension value) {
        return new JAXBElement<FrequencyDimension>(_ProcessorSpeed_QNAME, FrequencyDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HardDiskRotationalSpeed")
    public JAXBElement<BigDecimal> createHardDiskRotationalSpeed(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HardDiskRotationalSpeed_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VerticalKeystoneCorrection")
    public JAXBElement<LengthDimension> createVerticalKeystoneCorrection(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_VerticalKeystoneCorrection_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthSevenDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumImageSize")
    public JAXBElement<LengthSevenDigitDimension> createMinimumImageSize(LengthSevenDigitDimension value) {
        return new JAXBElement<LengthSevenDigitDimension>(_MinimumImageSize_QNAME, LengthSevenDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SPDIFOutput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSPDIFOutput(String value) {
        return new JAXBElement<String>(_SPDIFOutput_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PresentationRemoteOperatingDistance")
    public JAXBElement<LengthFiveDigitDimension> createPresentationRemoteOperatingDistance(LengthFiveDigitDimension value) {
        return new JAXBElement<LengthFiveDigitDimension>(_PresentationRemoteOperatingDistance_QNAME, LengthFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AdditionalFunctionality")
    public JAXBElement<String> createAdditionalFunctionality(String value) {
        return new JAXBElement<String>(_AdditionalFunctionality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Northbridge")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNorthbridge(String value) {
        return new JAXBElement<String>(_Northbridge_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TVTunerVideoStandard")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTVTunerVideoStandard(String value) {
        return new JAXBElement<String>(_TVTunerVideoStandard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PanelWindowLocation")
    public JAXBElement<String> createPanelWindowLocation(String value) {
        return new JAXBElement<String>(_PanelWindowLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Series")
    public JAXBElement<String> createSeries(String value) {
        return new JAXBElement<String>(_Series_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Southbridge")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSouthbridge(String value) {
        return new JAXBElement<String>(_Southbridge_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WirelessInputDeviceProtocol")
    public JAXBElement<String> createWirelessInputDeviceProtocol(String value) {
        return new JAXBElement<String>(_WirelessInputDeviceProtocol_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerSixDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PowerSupplyMaxOutput")
    public JAXBElement<PowerSixDigitDimension> createPowerSupplyMaxOutput(PowerSixDigitDimension value) {
        return new JAXBElement<PowerSixDigitDimension>(_PowerSupplyMaxOutput_QNAME, PowerSixDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DigitalAudioCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDigitalAudioCapacity(String value) {
        return new JAXBElement<String>(_DigitalAudioCapacity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FinishType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFinishType(String value) {
        return new JAXBElement<String>(_FinishType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirflowDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FanMaximumAirflow")
    public JAXBElement<AirflowDimension> createFanMaximumAirflow(AirflowDimension value) {
        return new JAXBElement<AirflowDimension>(_FanMaximumAirflow_QNAME, AirflowDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsRAMType")
    public JAXBElement<String> createGraphicsRAMType(String value) {
        return new JAXBElement<String>(_GraphicsRAMType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACAdapterIncluded")
    public JAXBElement<Boolean> createACAdapterIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_ACAdapterIncluded_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ScreenDimensions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScreenDimensions(String value) {
        return new JAXBElement<String>(_ScreenDimensions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MerchantOrderItemID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMerchantOrderItemID(String value) {
        return new JAXBElement<String>(_MerchantOrderItemID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WaterResistantDepth")
    public JAXBElement<LengthDimension> createWaterResistantDepth(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_WaterResistantDepth_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsCoProcessor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGraphicsCoProcessor(String value) {
        return new JAXBElement<String>(_GraphicsCoProcessor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfFans")
    public JAXBElement<BigInteger> createNumberOfFans(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfFans_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumThrowDistance")
    public JAXBElement<BigDecimal> createMaximumThrowDistance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MaximumThrowDistance_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ControllerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createControllerType(String value) {
        return new JAXBElement<String>(_ControllerType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxShutterSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMaxShutterSpeed(String value) {
        return new JAXBElement<String>(_MaxShutterSpeed_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HeadphoneFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHeadphoneFormFactor(String value) {
        return new JAXBElement<String>(_HeadphoneFormFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxMemorySpeed")
    public JAXBElement<BigDecimal> createMaxMemorySpeed(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MaxMemorySpeed_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumThrowRatio")
    public JAXBElement<String> createMinimumThrowRatio(String value) {
        return new JAXBElement<String>(_MinimumThrowRatio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalEthernetPorts")
    public JAXBElement<BigInteger> createTotalEthernetPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalEthernetPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakerOutputChannelQuantity")
    public JAXBElement<BigInteger> createSpeakerOutputChannelQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_SpeakerOutputChannelQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WooferSpeakerDiameter")
    public JAXBElement<LengthDimension> createWooferSpeakerDiameter(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_WooferSpeakerDiameter_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HolderCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHolderCapacity(String value) {
        return new JAXBElement<String>(_HolderCapacity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HDMIPorts")
    public JAXBElement<BigInteger> createHDMIPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_HDMIPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LANPortNumber")
    public JAXBElement<BigInteger> createLANPortNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_LANPortNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncludedHarddrivedescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createIncludedHarddrivedescription(String value) {
        return new JAXBElement<String>(_IncludedHarddrivedescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFirewirePorts")
    public JAXBElement<BigInteger> createTotalFirewirePorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFirewirePorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalHdmiPorts")
    public JAXBElement<BigInteger> createTotalHdmiPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalHdmiPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfIDEPorts")
    public JAXBElement<BigInteger> createNumberOfIDEPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfIDEPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ComponentWriteSpeed")
    public JAXBElement<BigInteger> createComponentWriteSpeed(BigInteger value) {
        return new JAXBElement<BigInteger>(_ComponentWriteSpeed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransferSpeedFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WirelessDataTransferRate")
    public JAXBElement<DataTransferSpeedFiveDigitIntegerDimension> createWirelessDataTransferRate(DataTransferSpeedFiveDigitIntegerDimension value) {
        return new JAXBElement<DataTransferSpeedFiveDigitIntegerDimension>(_WirelessDataTransferRate_QNAME, DataTransferSpeedFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RAMTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRAMTechnology(String value) {
        return new JAXBElement<String>(_RAMTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OnboardVideo")
    public JAXBElement<String> createOnboardVideo(String value) {
        return new JAXBElement<String>(_OnboardVideo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Averagewritetime")
    public JAXBElement<BigInteger> createAveragewritetime(BigInteger value) {
        return new JAXBElement<BigInteger>(_Averagewritetime_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HardDriveInterfaceTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HardDriveInterface")
    public JAXBElement<HardDriveInterfaceTypeValues> createHardDriveInterface(HardDriveInterfaceTypeValues value) {
        return new JAXBElement<HardDriveInterfaceTypeValues>(_HardDriveInterface_QNAME, HardDriveInterfaceTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ChipsetType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createChipsetType(String value) {
        return new JAXBElement<String>(_ChipsetType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthSevenDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CableLength")
    public JAXBElement<LengthSevenDigitDimension> createCableLength(LengthSevenDigitDimension value) {
        return new JAXBElement<LengthSevenDigitDimension>(_CableLength_QNAME, LengthSevenDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhysicalHardDriveFormFactor")
    public JAXBElement<BigDecimal> createPhysicalHardDriveFormFactor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PhysicalHardDriveFormFactor_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfVGAPorts")
    public JAXBElement<BigInteger> createNumberOfVGAPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfVGAPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FrontSideBusSpeed")
    public JAXBElement<BigInteger> createFrontSideBusSpeed(BigInteger value) {
        return new JAXBElement<BigInteger>(_FrontSideBusSpeed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OperatingSystemCompatability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOperatingSystemCompatability(String value) {
        return new JAXBElement<String>(_OperatingSystemCompatability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TrafficFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTrafficFeatures(String value) {
        return new JAXBElement<String>(_TrafficFeatures_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TweeterSpeakerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTweeterSpeakerTechnology(String value) {
        return new JAXBElement<String>(_TweeterSpeakerTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CompatibleDevices")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCompatibleDevices(String value) {
        return new JAXBElement<String>(_CompatibleDevices_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CompatibleMountings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCompatibleMountings(String value) {
        return new JAXBElement<String>(_CompatibleMountings_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfDMIPorts")
    public JAXBElement<BigInteger> createNumberOfDMIPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfDMIPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MidRangeSpeakerDiameter")
    public JAXBElement<LengthDimension> createMidRangeSpeakerDiameter(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_MidRangeSpeakerDiameter_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FitType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFitType(String value) {
        return new JAXBElement<String>(_FitType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConnectorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createConnectorType(String value) {
        return new JAXBElement<String>(_ConnectorType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ViewFinderType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createViewFinderType(String value) {
        return new JAXBElement<String>(_ViewFinderType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProcessorSocket")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createProcessorSocket(String value) {
        return new JAXBElement<String>(_ProcessorSocket_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MultiChannelKit")
    public JAXBElement<BigInteger> createMultiChannelKit(BigInteger value) {
        return new JAXBElement<BigInteger>(_MultiChannelKit_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GrilleRemoveability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGrilleRemoveability(String value) {
        return new JAXBElement<String>(_GrilleRemoveability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IPProtocolStandards")
    public JAXBElement<String> createIPProtocolStandards(String value) {
        return new JAXBElement<String>(_IPProtocolStandards_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MountBoltPattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMountBoltPattern(String value) {
        return new JAXBElement<String>(_MountBoltPattern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfHardDrives")
    public JAXBElement<BigInteger> createNumberOfHardDrives(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfHardDrives_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AmazonCustomerID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAmazonCustomerID(String value) {
        return new JAXBElement<String>(_AmazonCustomerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BuiltInMicrophone")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBuiltInMicrophone(String value) {
        return new JAXBElement<String>(_BuiltInMicrophone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoomDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpticalZoom")
    public JAXBElement<ZoomDimension> createOpticalZoom(ZoomDimension value) {
        return new JAXBElement<ZoomDimension>(_OpticalZoom_QNAME, ZoomDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PresentationRemoteMemory")
    public JAXBElement<MemorySizeFiveDigitDimension> createPresentationRemoteMemory(MemorySizeFiveDigitDimension value) {
        return new JAXBElement<MemorySizeFiveDigitDimension>(_PresentationRemoteMemory_QNAME, MemorySizeFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalVGAOutPorts")
    public JAXBElement<BigInteger> createTotalVGAOutPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalVGAOutPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfDrivers")
    public JAXBElement<BigInteger> createNumberOfDrivers(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfDrivers_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RefreshRate")
    public JAXBElement<FrequencyDimension> createRefreshRate(FrequencyDimension value) {
        return new JAXBElement<FrequencyDimension>(_RefreshRate_QNAME, FrequencyDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAdditionalFeatures(String value) {
        return new JAXBElement<String>(_AdditionalFeatures_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FulfillmentMethod")
    public JAXBElement<String> createFulfillmentMethod(String value) {
        return new JAXBElement<String>(_FulfillmentMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemoryInterfaceDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsCardMemoryInterface")
    public JAXBElement<MemoryInterfaceDimension> createGraphicsCardMemoryInterface(MemoryInterfaceDimension value) {
        return new JAXBElement<MemoryInterfaceDimension>(_GraphicsCardMemoryInterface_QNAME, MemoryInterfaceDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BundledSoftware")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBundledSoftware(String value) {
        return new JAXBElement<String>(_BundledSoftware_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RAMClockSpeed")
    public JAXBElement<BigInteger> createRAMClockSpeed(BigInteger value) {
        return new JAXBElement<BigInteger>(_RAMClockSpeed_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Modular")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createModular(String value) {
        return new JAXBElement<String>(_Modular_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMaterialType(String value) {
        return new JAXBElement<String>(_MaterialType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpticalStorageDeviceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOpticalStorageDeviceType(String value) {
        return new JAXBElement<String>(_OpticalStorageDeviceType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyThreeDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SampleRate")
    public JAXBElement<FrequencyThreeDigitIntegerDimension> createSampleRate(FrequencyThreeDigitIntegerDimension value) {
        return new JAXBElement<FrequencyThreeDigitIntegerDimension>(_SampleRate_QNAME, FrequencyThreeDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEfficiency(String value) {
        return new JAXBElement<String>(_Efficiency_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthFourDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExternalBayType")
    public JAXBElement<LengthFourDigitDimension> createExternalBayType(LengthFourDigitDimension value) {
        return new JAXBElement<LengthFourDigitDimension>(_ExternalBayType_QNAME, LengthFourDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NoiseCanceling")
    public JAXBElement<String> createNoiseCanceling(String value) {
        return new JAXBElement<String>(_NoiseCanceling_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CacheMemory")
    public JAXBElement<MemorySizeIntegerDimension> createCacheMemory(MemorySizeIntegerDimension value) {
        return new JAXBElement<MemorySizeIntegerDimension>(_CacheMemory_QNAME, MemorySizeIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BuiltInMedia")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createBuiltInMedia(String value) {
        return new JAXBElement<String>(_BuiltInMedia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CheckpointTSAFriendly")
    public JAXBElement<String> createCheckpointTSAFriendly(String value) {
        return new JAXBElement<String>(_CheckpointTSAFriendly_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsChipsetBrand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGraphicsChipsetBrand(String value) {
        return new JAXBElement<String>(_GraphicsChipsetBrand_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsRAMSize")
    public JAXBElement<MemorySizeDimension> createGraphicsRAMSize(MemorySizeDimension value) {
        return new JAXBElement<MemorySizeDimension>(_GraphicsRAMSize_QNAME, MemorySizeDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InputVideoCompatability")
    public JAXBElement<String> createInputVideoCompatability(String value) {
        return new JAXBElement<String>(_InputVideoCompatability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfHandsets")
    public JAXBElement<BigInteger> createNumberOfHandsets(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfHandsets_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfMicrophonePorts")
    public JAXBElement<BigInteger> createNumberOfMicrophonePorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfMicrophonePorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TweeterConeMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTweeterConeMaterialType(String value) {
        return new JAXBElement<String>(_TweeterConeMaterialType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PresentationRemoteLaserColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPresentationRemoteLaserColor(String value) {
        return new JAXBElement<String>(_PresentationRemoteLaserColor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AutomaticBackupSoftwareIncluded")
    public JAXBElement<Boolean> createAutomaticBackupSoftwareIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_AutomaticBackupSoftwareIncluded_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CompatibleDeviceFormFactor")
    public JAXBElement<String> createCompatibleDeviceFormFactor(String value) {
        return new JAXBElement<String>(_CompatibleDeviceFormFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PrivacyScreenSize")
    public JAXBElement<BigInteger> createPrivacyScreenSize(BigInteger value) {
        return new JAXBElement<BigInteger>(_PrivacyScreenSize_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AudioOutputMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAudioOutputMode(String value) {
        return new JAXBElement<String>(_AudioOutputMode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharacterDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CharacterData")
    public JAXBElement<CharacterDataType> createCharacterData(CharacterDataType value) {
        return new JAXBElement<CharacterDataType>(_CharacterData_QNAME, CharacterDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MotherboardCompatibility")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMotherboardCompatibility(String value) {
        return new JAXBElement<String>(_MotherboardCompatibility_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AnalogRGBInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAnalogRGBInput(String value) {
        return new JAXBElement<String>(_AnalogRGBInput_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolutionFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxWebcamImageResolution")
    public JAXBElement<ResolutionFiveDigitDimension> createMaxWebcamImageResolution(ResolutionFiveDigitDimension value) {
        return new JAXBElement<ResolutionFiveDigitDimension>(_MaxWebcamImageResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Conductor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createConductor(String value) {
        return new JAXBElement<String>(_Conductor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalSubwooferOutputs")
    public JAXBElement<BigInteger> createTotalSubwooferOutputs(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalSubwooferOutputs_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConnectorGender")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createConnectorGender(String value) {
        return new JAXBElement<String>(_ConnectorGender_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TabletDataRateDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TabletMaximumDataRate")
    public JAXBElement<TabletDataRateDimension> createTabletMaximumDataRate(TabletDataRateDimension value) {
        return new JAXBElement<TabletDataRateDimension>(_TabletMaximumDataRate_QNAME, TabletDataRateDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhotoFilterLensSize")
    public JAXBElement<LengthDimension> createPhotoFilterLensSize(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_PhotoFilterLensSize_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfAudioOutPorts")
    public JAXBElement<BigInteger> createNumberOfAudioOutPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfAudioOutPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StorageReadSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStorageReadSpeed(String value) {
        return new JAXBElement<String>(_StorageReadSpeed_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGraphicsDescription(String value) {
        return new JAXBElement<String>(_GraphicsDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StorageWriteSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createStorageWriteSpeed(String value) {
        return new JAXBElement<String>(_StorageWriteSpeed_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModemTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ModemType")
    public JAXBElement<ModemTypeValues> createModemType(ModemTypeValues value) {
        return new JAXBElement<ModemTypeValues>(_ModemType_QNAME, ModemTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumHorizontalRefreshRate")
    public JAXBElement<FrequencyFiveDigitIntegerDimension> createMaximumHorizontalRefreshRate(FrequencyFiveDigitIntegerDimension value) {
        return new JAXBElement<FrequencyFiveDigitIntegerDimension>(_MaximumHorizontalRefreshRate_QNAME, FrequencyFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ExternalCustomerID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createExternalCustomerID(String value) {
        return new JAXBElement<String>(_ExternalCustomerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Channels")
    public JAXBElement<BigDecimal> createChannels(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Channels_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalUSBPorts")
    public JAXBElement<BigInteger> createTotalUSBPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalUSBPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ScreenFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScreenFinish(String value) {
        return new JAXBElement<String>(_ScreenFinish_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalDrivesTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AdditionalDrives")
    public JAXBElement<AdditionalDrivesTypeValues> createAdditionalDrives(AdditionalDrivesTypeValues value) {
        return new JAXBElement<AdditionalDrivesTypeValues>(_AdditionalDrives_QNAME, AdditionalDrivesTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WirelessCarrierTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WirelessCarrier")
    public JAXBElement<WirelessCarrierTypeValues> createWirelessCarrier(WirelessCarrierTypeValues value) {
        return new JAXBElement<WirelessCarrierTypeValues>(_WirelessCarrier_QNAME, WirelessCarrierTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SATAStandardsSupported")
    public JAXBElement<String> createSATAStandardsSupported(String value) {
        return new JAXBElement<String>(_SATAStandardsSupported_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaterResistantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WaterResistantLevel")
    public JAXBElement<WaterResistantType> createWaterResistantLevel(WaterResistantType value) {
        return new JAXBElement<WaterResistantType>(_WaterResistantLevel_QNAME, WaterResistantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SSDDriveArchitechture")
    public JAXBElement<String> createSSDDriveArchitechture(String value) {
        return new JAXBElement<String>(_SSDDriveArchitechture_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SimultaneousSessions")
    public JAXBElement<BigInteger> createSimultaneousSessions(BigInteger value) {
        return new JAXBElement<BigInteger>(_SimultaneousSessions_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsCardMemoryType")
    public JAXBElement<String> createGraphicsCardMemoryType(String value) {
        return new JAXBElement<String>(_GraphicsCardMemoryType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AudibleNoise")
    public JAXBElement<BigDecimal> createAudibleNoise(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AudibleNoise_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PowerSupplyFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPowerSupplyFormFactor(String value) {
        return new JAXBElement<String>(_PowerSupplyFormFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CoatingDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCoatingDescription(String value) {
        return new JAXBElement<String>(_CoatingDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GuideNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createGuideNumber(String value) {
        return new JAXBElement<String>(_GuideNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfRadioBandsSupported")
    public JAXBElement<BigInteger> createNumberOfRadioBandsSupported(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfRadioBandsSupported_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPanelUSB2.0Ports")
    public JAXBElement<BigInteger> createTotalFrontPanelUSB20Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPanelUSB20Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FanLED")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFanLED(String value) {
        return new JAXBElement<String>(_FanLED_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFirewire3200Connectors")
    public JAXBElement<BigInteger> createTotalFirewire3200Connectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFirewire3200Connectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnergyRatingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SurgeProtectionRating")
    public JAXBElement<EnergyRatingType> createSurgeProtectionRating(EnergyRatingType value) {
        return new JAXBElement<EnergyRatingType>(_SurgeProtectionRating_QNAME, EnergyRatingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalSataConnectors")
    public JAXBElement<BigInteger> createTotalSataConnectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalSataConnectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CoolingType")
    public JAXBElement<String> createCoolingType(String value) {
        return new JAXBElement<String>(_CoolingType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumApertureRange")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMaximumApertureRange(String value) {
        return new JAXBElement<String>(_MaximumApertureRange_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SoundCardMinSystemRequirements")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSoundCardMinSystemRequirements(String value) {
        return new JAXBElement<String>(_SoundCardMinSystemRequirements_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfFireWire400Ports")
    public JAXBElement<BigInteger> createNumberOfFireWire400Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfFireWire400Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ZoomRatio")
    public JAXBElement<String> createZoomRatio(String value) {
        return new JAXBElement<String>(_ZoomRatio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DigitalMediaFormat")
    public JAXBElement<String> createDigitalMediaFormat(String value) {
        return new JAXBElement<String>(_DigitalMediaFormat_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWooferSpeakerMaterial(String value) {
        return new JAXBElement<String>(_WooferSpeakerMaterial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AspectRatio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createAspectRatio(String value) {
        return new JAXBElement<String>(_AspectRatio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SoftwareIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSoftwareIncluded(String value) {
        return new JAXBElement<String>(_SoftwareIncluded_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CameraType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCameraType(String value) {
        return new JAXBElement<String>(_CameraType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeTenDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TVTunerMemory")
    public JAXBElement<MemorySizeTenDigitIntegerDimension> createTVTunerMemory(MemorySizeTenDigitIntegerDimension value) {
        return new JAXBElement<MemorySizeTenDigitIntegerDimension>(_TVTunerMemory_QNAME, MemorySizeTenDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPanelAudioOutPorts")
    public JAXBElement<BigInteger> createTotalFrontPanelAudioOutPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPanelAudioOutPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfInternalBays")
    public JAXBElement<BigInteger> createNumberOfInternalBays(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfInternalBays_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardReaderTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CardReader")
    public JAXBElement<CardReaderTypeValues> createCardReader(CardReaderTypeValues value) {
        return new JAXBElement<CardReaderTypeValues>(_CardReader_QNAME, CardReaderTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VideoShielded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVideoShielded(String value) {
        return new JAXBElement<String>(_VideoShielded_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MerchantOrderID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMerchantOrderID(String value) {
        return new JAXBElement<String>(_MerchantOrderID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatteryCellTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BatteryCellType")
    public JAXBElement<BatteryCellTypeValues> createBatteryCellType(BatteryCellTypeValues value) {
        return new JAXBElement<BatteryCellTypeValues>(_BatteryCellType_QNAME, BatteryCellTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ShipmentID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createShipmentID(String value) {
        return new JAXBElement<String>(_ShipmentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPanelUSB1.0Ports")
    public JAXBElement<BigInteger> createTotalFrontPanelUSB10Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPanelUSB10Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatteryPowerIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BatteryPower")
    public JAXBElement<BatteryPowerIntegerDimension> createBatteryPower(BatteryPowerIntegerDimension value) {
        return new JAXBElement<BatteryPowerIntegerDimension>(_BatteryPower_QNAME, BatteryPowerIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakerSurroundSoundChannelConfiguration")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSpeakerSurroundSoundChannelConfiguration(String value) {
        return new JAXBElement<String>(_SpeakerSurroundSoundChannelConfiguration_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TypeOfMemorySlot")
    public JAXBElement<BigInteger> createTypeOfMemorySlot(BigInteger value) {
        return new JAXBElement<BigInteger>(_TypeOfMemorySlot_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MountingPattern")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMountingPattern(String value) {
        return new JAXBElement<String>(_MountingPattern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InputType")
    public JAXBElement<InputTypeValues> createInputType(InputTypeValues value) {
        return new JAXBElement<InputTypeValues>(_InputType_QNAME, InputTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TabletMinimumSystemRequirements")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createTabletMinimumSystemRequirements(String value) {
        return new JAXBElement<String>(_TabletMinimumSystemRequirements_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolutionFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RearWebcamResolution")
    public JAXBElement<ResolutionFiveDigitDimension> createRearWebcamResolution(ResolutionFiveDigitDimension value) {
        return new JAXBElement<ResolutionFiveDigitDimension>(_RearWebcamResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ControlType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createControlType(String value) {
        return new JAXBElement<String>(_ControlType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpeedClassRatingTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeedClassRating")
    public JAXBElement<SpeedClassRatingTypeValues> createSpeedClassRating(SpeedClassRatingTypeValues value) {
        return new JAXBElement<SpeedClassRatingTypeValues>(_SpeedClassRating_QNAME, SpeedClassRatingTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EuEnergyLabelEfficiencyClass")
    public JAXBElement<String> createEuEnergyLabelEfficiencyClass(String value) {
        return new JAXBElement<String>(_EuEnergyLabelEfficiencyClass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Shape")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createShape(String value) {
        return new JAXBElement<String>(_Shape_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuminanceFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ProjectorBrightness")
    public JAXBElement<LuminanceFiveDigitDimension> createProjectorBrightness(LuminanceFiveDigitDimension value) {
        return new JAXBElement<LuminanceFiveDigitDimension>(_ProjectorBrightness_QNAME, LuminanceFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalCoaxialInputs")
    public JAXBElement<BigInteger> createTotalCoaxialInputs(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalCoaxialInputs_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumVerticalVideoResolution")
    public JAXBElement<BigInteger> createMaximumVerticalVideoResolution(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumVerticalVideoResolution_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalUSB1.1Connectors")
    public JAXBElement<BigInteger> createTotalUSB11Connectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalUSB11Connectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfUSB3.0Ports")
    public JAXBElement<BigInteger> createNumberOfUSB30Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfUSB30Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PrinterWirelessType")
    public JAXBElement<String> createPrinterWirelessType(String value) {
        return new JAXBElement<String>(_PrinterWirelessType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpeedSixDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FanMaximumSpeed")
    public JAXBElement<SpeedSixDigitDimension> createFanMaximumSpeed(SpeedSixDigitDimension value) {
        return new JAXBElement<SpeedSixDigitDimension>(_FanMaximumSpeed_QNAME, SpeedSixDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FulfillmentCenterID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFulfillmentCenterID(String value) {
        return new JAXBElement<String>(_FulfillmentCenterID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ScreenSize")
    public JAXBElement<LengthDimension> createScreenSize(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_ScreenSize_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HorizontalKeystoneCorrection")
    public JAXBElement<LengthDimension> createHorizontalKeystoneCorrection(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_HorizontalKeystoneCorrection_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MediaInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMediaInput(String value) {
        return new JAXBElement<String>(_MediaInput_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolutionDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EffectiveStillResolution")
    public JAXBElement<ResolutionDimension> createEffectiveStillResolution(ResolutionDimension value) {
        return new JAXBElement<ResolutionDimension>(_EffectiveStillResolution_QNAME, ResolutionDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeightDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaxWeightCapacity")
    public JAXBElement<WeightDimension> createMaxWeightCapacity(WeightDimension value) {
        return new JAXBElement<WeightDimension>(_MaxWeightCapacity_QNAME, WeightDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpticalDriveType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOpticalDriveType(String value) {
        return new JAXBElement<String>(_OpticalDriveType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContinuousShootingDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ContinuousShootingSpeed")
    public JAXBElement<ContinuousShootingDimension> createContinuousShootingSpeed(ContinuousShootingDimension value) {
        return new JAXBElement<ContinuousShootingDimension>(_ContinuousShootingSpeed_QNAME, ContinuousShootingDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubwooferSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSubwooferSpeakerMaterial(String value) {
        return new JAXBElement<String>(_SubwooferSpeakerMaterial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CameraFlash")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCameraFlash(String value) {
        return new JAXBElement<String>(_CameraFlash_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PowerSupplyMounting")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPowerSupplyMounting(String value) {
        return new JAXBElement<String>(_PowerSupplyMounting_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LuminanceFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MonitorBrightness")
    public JAXBElement<LuminanceFiveDigitDimension> createMonitorBrightness(LuminanceFiveDigitDimension value) {
        return new JAXBElement<LuminanceFiveDigitDimension>(_MonitorBrightness_QNAME, LuminanceFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CompatibleProcessorTypes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCompatibleProcessorTypes(String value) {
        return new JAXBElement<String>(_CompatibleProcessorTypes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BurnTimeSixDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LampLife")
    public JAXBElement<BurnTimeSixDigitDimension> createLampLife(BurnTimeSixDigitDimension value) {
        return new JAXBElement<BurnTimeSixDigitDimension>(_LampLife_QNAME, BurnTimeSixDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PromotionClaimCode")
    public JAXBElement<String> createPromotionClaimCode(String value) {
        return new JAXBElement<String>(_PromotionClaimCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WirelessType")
    public JAXBElement<String> createWirelessType(String value) {
        return new JAXBElement<String>(_WirelessType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VideoEncoding")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createVideoEncoding(String value) {
        return new JAXBElement<String>(_VideoEncoding_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalNumberOfHotswapBays")
    public JAXBElement<BigInteger> createTotalNumberOfHotswapBays(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalNumberOfHotswapBays_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SystemCabinetFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSystemCabinetFormFactor(String value) {
        return new JAXBElement<String>(_SystemCabinetFormFactor_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPanelFirewire400Ports")
    public JAXBElement<BigInteger> createTotalFrontPanelFirewire400Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPanelFirewire400Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFrontPanelFirewire800Ports")
    public JAXBElement<BigInteger> createTotalFrontPanelFirewire800Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFrontPanelFirewire800Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BuiltinSpeaker")
    public JAXBElement<BigInteger> createBuiltinSpeaker(BigInteger value) {
        return new JAXBElement<BigInteger>(_BuiltinSpeaker_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EnclosureFinish")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEnclosureFinish(String value) {
        return new JAXBElement<String>(_EnclosureFinish_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalHDMIPorts")
    public JAXBElement<BigInteger> createTotalHDMIPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalHDMIPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoiseLevelSixDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FanMaximumNoiseLevel")
    public JAXBElement<NoiseLevelSixDigitDimension> createFanMaximumNoiseLevel(NoiseLevelSixDigitDimension value) {
        return new JAXBElement<NoiseLevelSixDigitDimension>(_FanMaximumNoiseLevel_QNAME, NoiseLevelSixDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Wattage")
    public JAXBElement<BigInteger> createWattage(BigInteger value) {
        return new JAXBElement<BigInteger>(_Wattage_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumHorizontalRefreshRate")
    public JAXBElement<FrequencyFiveDigitIntegerDimension> createMinimumHorizontalRefreshRate(FrequencyFiveDigitIntegerDimension value) {
        return new JAXBElement<FrequencyFiveDigitIntegerDimension>(_MinimumHorizontalRefreshRate_QNAME, FrequencyFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EffectiveInputArea")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createEffectiveInputArea(String value) {
        return new JAXBElement<String>(_EffectiveInputArea_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthFourDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InternalBayType")
    public JAXBElement<LengthFourDigitDimension> createInternalBayType(LengthFourDigitDimension value) {
        return new JAXBElement<LengthFourDigitDimension>(_InternalBayType_QNAME, LengthFourDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalSVideoOutPorts")
    public JAXBElement<BigInteger> createTotalSVideoOutPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalSVideoOutPorts_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalPowerOutlets")
    public JAXBElement<BigInteger> createTotalPowerOutlets(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalPowerOutlets_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IncludedFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createIncludedFeatures(String value) {
        return new JAXBElement<String>(_IncludedFeatures_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubwooferSpeakerDiameter")
    public JAXBElement<LengthDimension> createSubwooferSpeakerDiameter(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_SubwooferSpeakerDiameter_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CameraDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCameraDescription(String value) {
        return new JAXBElement<String>(_CameraDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OutputWattage")
    public JAXBElement<BigInteger> createOutputWattage(BigInteger value) {
        return new JAXBElement<BigInteger>(_OutputWattage_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NotebookDisplayTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createNotebookDisplayTechnology(String value) {
        return new JAXBElement<String>(_NotebookDisplayTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HeatsinkMaterial")
    public JAXBElement<String> createHeatsinkMaterial(String value) {
        return new JAXBElement<String>(_HeatsinkMaterial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinFocalLength")
    public JAXBElement<LengthDimension> createMinFocalLength(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_MinFocalLength_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createModelNumber(String value) {
        return new JAXBElement<String>(_ModelNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DeviceSoftwareCompatability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDeviceSoftwareCompatability(String value) {
        return new JAXBElement<String>(_DeviceSoftwareCompatability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemorySizeFiveDigitIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MemoryCapacityPerSTICK")
    public JAXBElement<MemorySizeFiveDigitIntegerDimension> createMemoryCapacityPerSTICK(MemorySizeFiveDigitIntegerDimension value) {
        return new JAXBElement<MemorySizeFiveDigitIntegerDimension>(_MemoryCapacityPerSTICK_QNAME, MemorySizeFiveDigitIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CommunicationInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createCommunicationInterface(String value) {
        return new JAXBElement<String>(_CommunicationInterface_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HeadphoneEarcupMotion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHeadphoneEarcupMotion(String value) {
        return new JAXBElement<String>(_HeadphoneEarcupMotion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfMonitorConnections")
    public JAXBElement<BigInteger> createNumberOfMonitorConnections(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfMonitorConnections_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphicsCardInterfaceTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GraphicsCardInterface")
    public JAXBElement<GraphicsCardInterfaceTypeValues> createGraphicsCardInterface(GraphicsCardInterfaceTypeValues value) {
        return new JAXBElement<GraphicsCardInterfaceTypeValues>(_GraphicsCardInterface_QNAME, GraphicsCardInterfaceTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfMemorySticks")
    public JAXBElement<BigInteger> createNumberOfMemorySticks(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfMemorySticks_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HardDiskTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHardDiskTechnology(String value) {
        return new JAXBElement<String>(_HardDiskTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TrackingMethod")
    public JAXBElement<String> createTrackingMethod(String value) {
        return new JAXBElement<String>(_TrackingMethod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RAID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createRAID(String value) {
        return new JAXBElement<String>(_RAID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfPCIExpressSlots")
    public JAXBElement<BigInteger> createNumberOfPCIExpressSlots(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfPCIExpressSlots_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AirDuctLocation")
    public JAXBElement<String> createAirDuctLocation(String value) {
        return new JAXBElement<String>(_AirDuctLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ScannerResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createScannerResolution(String value) {
        return new JAXBElement<String>(_ScannerResolution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfLithiumIonCells")
    public JAXBElement<BigInteger> createNumberOfLithiumIonCells(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfLithiumIonCells_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolutionFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VideoCallingResolution")
    public JAXBElement<ResolutionFiveDigitDimension> createVideoCallingResolution(ResolutionFiveDigitDimension value) {
        return new JAXBElement<ResolutionFiveDigitDimension>(_VideoCallingResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WaypointsType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWaypointsType(String value) {
        return new JAXBElement<String>(_WaypointsType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DisplayTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createDisplayTechnology(String value) {
        return new JAXBElement<String>(_DisplayTechnology_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EnergyEfficiencyRating")
    public JAXBElement<String> createEnergyEfficiencyRating(String value) {
        return new JAXBElement<String>(_EnergyEfficiencyRating_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConditionType")
    public JAXBElement<String> createConditionType(String value) {
        return new JAXBElement<String>(_ConditionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Resolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createResolution(String value) {
        return new JAXBElement<String>(_Resolution_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IsHotShoeIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createIsHotShoeIncluded(String value) {
        return new JAXBElement<String>(_IsHotShoeIncluded_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardReaderInterfaceTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CardReaderInterface")
    public JAXBElement<CardReaderInterfaceTypeValues> createCardReaderInterface(CardReaderInterfaceTypeValues value) {
        return new JAXBElement<CardReaderInterfaceTypeValues>(_CardReaderInterface_QNAME, CardReaderInterfaceTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SpeakerOut")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSpeakerOut(String value) {
        return new JAXBElement<String>(_SpeakerOut_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ThreeDAPI")
    public JAXBElement<String> createThreeDAPI(String value) {
        return new JAXBElement<String>(_ThreeDAPI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitorConnectorsTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MonitorConnectors")
    public JAXBElement<MonitorConnectorsTypeValues> createMonitorConnectors(MonitorConnectorsTypeValues value) {
        return new JAXBElement<MonitorConnectorsTypeValues>(_MonitorConnectors_QNAME, MonitorConnectorsTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HandOrientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createHandOrientation(String value) {
        return new JAXBElement<String>(_HandOrientation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PrivacyScreenMaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createPrivacyScreenMaterialType(String value) {
        return new JAXBElement<String>(_PrivacyScreenMaterialType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConnectorTypeUsedOnCable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createConnectorTypeUsedOnCable(String value) {
        return new JAXBElement<String>(_ConnectorTypeUsedOnCable_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IntegratedAudioChannels")
    public JAXBElement<BigInteger> createIntegratedAudioChannels(BigInteger value) {
        return new JAXBElement<BigInteger>(_IntegratedAudioChannels_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Voltage")
    public JAXBElement<BigDecimal> createVoltage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Voltage_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Zoom")
    public JAXBElement<String> createZoom(String value) {
        return new JAXBElement<String>(_Zoom_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinimumThrowDistance")
    public JAXBElement<BigDecimal> createMinimumThrowDistance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MinimumThrowDistance_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpticalOut")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOpticalOut(String value) {
        return new JAXBElement<String>(_OpticalOut_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EffectiveMemoryClock")
    public JAXBElement<FrequencyIntegerDimension> createEffectiveMemoryClock(FrequencyIntegerDimension value) {
        return new JAXBElement<FrequencyIntegerDimension>(_EffectiveMemoryClock_QNAME, FrequencyIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UniversalRemoteCode")
    public JAXBElement<BigInteger> createUniversalRemoteCode(BigInteger value) {
        return new JAXBElement<BigInteger>(_UniversalRemoteCode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolutionFiveDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DigitalStillResolution")
    public JAXBElement<ResolutionFiveDigitDimension> createDigitalStillResolution(ResolutionFiveDigitDimension value) {
        return new JAXBElement<ResolutionFiveDigitDimension>(_DigitalStillResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OpticalIn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createOpticalIn(String value) {
        return new JAXBElement<String>(_OpticalIn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoltageSevenDigitDecimalDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VoltageRating")
    public JAXBElement<VoltageSevenDigitDecimalDimension> createVoltageRating(VoltageSevenDigitDecimalDimension value) {
        return new JAXBElement<VoltageSevenDigitDecimalDimension>(_VoltageRating_QNAME, VoltageSevenDigitDecimalDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BaseWidth")
    public JAXBElement<LengthDimension> createBaseWidth(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_BaseWidth_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WattageDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumWattage")
    public JAXBElement<WattageDimension> createMaximumWattage(WattageDimension value) {
        return new JAXBElement<WattageDimension>(_MaximumWattage_QNAME, WattageDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WirelessRouterTransmissionBand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createWirelessRouterTransmissionBand(String value) {
        return new JAXBElement<String>(_WirelessRouterTransmissionBand_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FulfillmentServiceLevel")
    public JAXBElement<String> createFulfillmentServiceLevel(String value) {
        return new JAXBElement<String>(_FulfillmentServiceLevel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfFireWire800Ports")
    public JAXBElement<BigInteger> createNumberOfFireWire800Ports(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfFireWire800Ports_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthSevenDigitDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MaximumImageSize")
    public JAXBElement<LengthSevenDigitDimension> createMaximumImageSize(LengthSevenDigitDimension value) {
        return new JAXBElement<LengthSevenDigitDimension>(_MaximumImageSize_QNAME, LengthSevenDigitDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MainPowerConnector")
    public JAXBElement<String> createMainPowerConnector(String value) {
        return new JAXBElement<String>(_MainPowerConnector_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhotoFilterThreadSize")
    public JAXBElement<LengthDimension> createPhotoFilterThreadSize(LengthDimension value) {
        return new JAXBElement<LengthDimension>(_PhotoFilterThreadSize_QNAME, LengthDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SecurityProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createSecurityProtocol(String value) {
        return new JAXBElement<String>(_SecurityProtocol_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FrequencyRange")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createFrequencyRange(String value) {
        return new JAXBElement<String>(_FrequencyRange_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WattageDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SubwooferWattage")
    public JAXBElement<WattageDimension> createSubwooferWattage(WattageDimension value) {
        return new JAXBElement<WattageDimension>(_SubwooferWattage_QNAME, WattageDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfMemorySlots")
    public JAXBElement<BigInteger> createNumberOfMemorySlots(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfMemorySlots_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApertureDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MinAperture")
    public JAXBElement<ApertureDimension> createMinAperture(ApertureDimension value) {
        return new JAXBElement<ApertureDimension>(_MinAperture_QNAME, ApertureDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ConnectionInterface")
    public JAXBElement<ConnectionTypeValues> createConnectionInterface(ConnectionTypeValues value) {
        return new JAXBElement<ConnectionTypeValues>(_ConnectionInterface_QNAME, ConnectionTypeValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LineIn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createLineIn(String value) {
        return new JAXBElement<String>(_LineIn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MidRangeSpeakerMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    public JAXBElement<String> createMidRangeSpeakerMaterial(String value) {
        return new JAXBElement<String>(_MidRangeSpeakerMaterial_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTransferSpeedTenIntegerDimension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WriteSpeed")
    public JAXBElement<DataTransferSpeedTenIntegerDimension> createWriteSpeed(DataTransferSpeedTenIntegerDimension value) {
        return new JAXBElement<DataTransferSpeedTenIntegerDimension>(_WriteSpeed_QNAME, DataTransferSpeedTenIntegerDimension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TotalFirewire1600Connectors")
    public JAXBElement<BigInteger> createTotalFirewire1600Connectors(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFirewire1600Connectors_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MovementDetectionTechnology")
    public JAXBElement<Boolean> createMovementDetectionTechnology(Boolean value) {
        return new JAXBElement<Boolean>(_MovementDetectionTechnology_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfRecordingLoops")
    public JAXBElement<BigInteger> createNumberOfRecordingLoops(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfRecordingLoops_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NumberOfUSBPorts")
    public JAXBElement<BigInteger> createNumberOfUSBPorts(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfUSBPorts_QNAME, BigInteger.class, null, value);
    }

}
