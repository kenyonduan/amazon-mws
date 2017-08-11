/*      */ package com.elcuk.jaxb;
/*      */ 
/*      */ import java.math.BigDecimal;
/*      */ import java.math.BigInteger;
/*      */ import javax.xml.bind.JAXBElement;
/*      */ import javax.xml.bind.annotation.XmlElementDecl;
/*      */ import javax.xml.bind.annotation.XmlRegistry;
/*      */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*      */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*      */ import javax.xml.namespace.QName;
/*      */ 
/*      */ @XmlRegistry
/*      */ public class ObjectFactory
/*      */ {
/*   31 */   private static final QName _ProcessorSpeed_QNAME = new QName("", "ProcessorSpeed");
/*   32 */   private static final QName _GraphicsRAMType_QNAME = new QName("", "GraphicsRAMType");
/*   33 */   private static final QName _HDMIPorts_QNAME = new QName("", "HDMIPorts");
/*   34 */   private static final QName _CardReader_QNAME = new QName("", "CardReader");
/*   35 */   private static final QName _MemoryStorageCapacity_QNAME = new QName("", "MemoryStorageCapacity");
/*   36 */   private static final QName _MountBoltPattern_QNAME = new QName("", "MountBoltPattern");
/*   37 */   private static final QName _NumberOfHardDrives_QNAME = new QName("", "NumberOfHardDrives");
/*   38 */   private static final QName _MaxWeightCapacity_QNAME = new QName("", "MaxWeightCapacity");
/*   39 */   private static final QName _DisplayTechnology_QNAME = new QName("", "DisplayTechnology");
/*   40 */   private static final QName _WirelessCarrier_QNAME = new QName("", "WirelessCarrier");
/*   41 */   private static final QName _CacheSize_QNAME = new QName("", "CacheSize");
/*   42 */   private static final QName _AmazonOrderItemCode_QNAME = new QName("", "AmazonOrderItemCode");
/*   43 */   private static final QName _GraphicsCardMemoryInterface_QNAME = new QName("", "GraphicsCardMemoryInterface");
/*   44 */   private static final QName _VoltageRating_QNAME = new QName("", "VoltageRating");
/*   45 */   private static final QName _SPDIFOutput_QNAME = new QName("", "SPDIFOutput");
/*   46 */   private static final QName _MaxWebcamImageResolution_QNAME = new QName("", "MaxWebcamImageResolution");
/*   47 */   private static final QName _LineIn_QNAME = new QName("", "LineIn");
/*   48 */   private static final QName _TabletSurfaceActiveArea_QNAME = new QName("", "TabletSurfaceActiveArea");
/*   49 */   private static final QName _TweeterConeMaterialType_QNAME = new QName("", "TweeterConeMaterialType");
/*   50 */   private static final QName _NumberOfUSBHubConnectorPorts_QNAME = new QName("", "NumberOfUSBHubConnectorPorts");
/*   51 */   private static final QName _SpeakerCount_QNAME = new QName("", "SpeakerCount");
/*   52 */   private static final QName _WaterResistantLevel_QNAME = new QName("", "WaterResistantLevel");
/*   53 */   private static final QName _OnboardVideo_QNAME = new QName("", "OnboardVideo");
/*   54 */   private static final QName _ShipOption_QNAME = new QName("", "ShipOption");
/*   55 */   private static final QName _HasProgrammableButtons_QNAME = new QName("", "HasProgrammableButtons");
/*   56 */   private static final QName _TotalFrontPanelFirewire400Ports_QNAME = new QName("", "TotalFrontPanelFirewire400Ports");
/*   57 */   private static final QName _FulfillmentServiceLevel_QNAME = new QName("", "FulfillmentServiceLevel");
/*   58 */   private static final QName _HotswapBayType_QNAME = new QName("", "HotswapBayType");
/*   59 */   private static final QName _SoundCardMinSystemRequirements_QNAME = new QName("", "SoundCardMinSystemRequirements");
/*   60 */   private static final QName _ImageDiagonalSize_QNAME = new QName("", "ImageDiagonalSize");
/*   61 */   private static final QName _Averagelatency_QNAME = new QName("", "Averagelatency");
/*   62 */   private static final QName _AmplifierType_QNAME = new QName("", "AmplifierType");
/*   63 */   private static final QName _NumberOfSATAPowerConnectors_QNAME = new QName("", "NumberOfSATAPowerConnectors");
/*   64 */   private static final QName _VideoCallingResolution_QNAME = new QName("", "VideoCallingResolution");
/*   65 */   private static final QName _TotalEthernetPorts_QNAME = new QName("", "TotalEthernetPorts");
/*   66 */   private static final QName _PrivacyScreenSize_QNAME = new QName("", "PrivacyScreenSize");
/*   67 */   private static final QName _MaxDownstreamTransmissionRate_QNAME = new QName("", "MaxDownstreamTransmissionRate");
/*   68 */   private static final QName _WriteSpeed_QNAME = new QName("", "WriteSpeed");
/*   69 */   private static final QName _MainPowerConnector_QNAME = new QName("", "MainPowerConnector");
/*   70 */   private static final QName _SpeakerGrilleMaterial_QNAME = new QName("", "SpeakerGrilleMaterial");
/*   71 */   private static final QName _TotalFrontPanelAudioOutPorts_QNAME = new QName("", "TotalFrontPanelAudioOutPorts");
/*   72 */   private static final QName _BatteryPower_QNAME = new QName("", "BatteryPower");
/*   73 */   private static final QName _PresentationRemoteLaserColor_QNAME = new QName("", "PresentationRemoteLaserColor");
/*   74 */   private static final QName _FanIncluded_QNAME = new QName("", "FanIncluded");
/*   75 */   private static final QName _RecordingCapacity_QNAME = new QName("", "RecordingCapacity");
/*   76 */   private static final QName _TotalNumberOfInternalBays_QNAME = new QName("", "TotalNumberOfInternalBays");
/*   77 */   private static final QName _ScreenDimensions_QNAME = new QName("", "ScreenDimensions");
/*   78 */   private static final QName _TotalNumberOfExternalBays_QNAME = new QName("", "TotalNumberOfExternalBays");
/*   79 */   private static final QName _ResponseTime_QNAME = new QName("", "ResponseTime");
/*   80 */   private static final QName _ColorMap_QNAME = new QName("", "ColorMap");
/*   81 */   private static final QName _NumberOfEthernetPorts_QNAME = new QName("", "NumberOfEthernetPorts");
/*   82 */   private static final QName _MediaLayers_QNAME = new QName("", "MediaLayers");
/*   83 */   private static final QName _TotalSataConnectors_QNAME = new QName("", "TotalSataConnectors");
/*   84 */   private static final QName _NumberOfDMIPorts_QNAME = new QName("", "NumberOfDMIPorts");
/*   85 */   private static final QName _FulfillmentCenterID_QNAME = new QName("", "FulfillmentCenterID");
/*   86 */   private static final QName _DigitalAudioCapacity_QNAME = new QName("", "DigitalAudioCapacity");
/*   87 */   private static final QName _EffectiveMemoryClock_QNAME = new QName("", "EffectiveMemoryClock");
/*   88 */   private static final QName _BuiltInMedia_QNAME = new QName("", "BuiltInMedia");
/*   89 */   private static final QName _OpticalStorageDeviceType_QNAME = new QName("", "OpticalStorageDeviceType");
/*   90 */   private static final QName _PressureLevels_QNAME = new QName("", "PressureLevels");
/*   91 */   private static final QName _TotalFrontPanelAudioInPorts_QNAME = new QName("", "TotalFrontPanelAudioInPorts");
/*   92 */   private static final QName _AnalogRGBInput_QNAME = new QName("", "AnalogRGBInput");
/*   93 */   private static final QName _ProcessorCoolingDevice_QNAME = new QName("", "ProcessorCoolingDevice");
/*   94 */   private static final QName _NumberOfFireWire800Ports_QNAME = new QName("", "NumberOfFireWire800Ports");
/*   95 */   private static final QName _VideoShielded_QNAME = new QName("", "VideoShielded");
/*   96 */   private static final QName _HeadphoneStyle_QNAME = new QName("", "HeadphoneStyle");
/*   97 */   private static final QName _PrivacyScreenMaterialType_QNAME = new QName("", "PrivacyScreenMaterialType");
/*   98 */   private static final QName _BundledSoftware_QNAME = new QName("", "BundledSoftware");
/*   99 */   private static final QName _TotalSVideoOutPorts_QNAME = new QName("", "TotalSVideoOutPorts");
/*  100 */   private static final QName _NumberOfRadioBandsSupported_QNAME = new QName("", "NumberOfRadioBandsSupported");
/*  101 */   private static final QName _CoolingType_QNAME = new QName("", "CoolingType");
/*  102 */   private static final QName _SoundCardInterface_QNAME = new QName("", "SoundCardInterface");
/*  103 */   private static final QName _GraphicsCardCooler_QNAME = new QName("", "GraphicsCardCooler");
/*  104 */   private static final QName _NetworkingProtocol_QNAME = new QName("", "NetworkingProtocol");
/*  105 */   private static final QName _TabletInputMethod_QNAME = new QName("", "TabletInputMethod");
/*  106 */   private static final QName _ConnectivityType_QNAME = new QName("", "ConnectivityType");
/*  107 */   private static final QName _USBPortType_QNAME = new QName("", "USBPortType");
/*  108 */   private static final QName _Voltage_QNAME = new QName("", "Voltage");
/*  109 */   private static final QName _OperatingSystem_QNAME = new QName("", "OperatingSystem");
/*  110 */   private static final QName _NumberOfUSB30Ports_QNAME = new QName("", "NumberOfUSB3.0Ports");
/*  111 */   private static final QName _HardwarePlatform_QNAME = new QName("", "HardwarePlatform");
/*  112 */   private static final QName _CableLength_QNAME = new QName("", "CableLength");
/*  113 */   private static final QName _FanPowerConnector_QNAME = new QName("", "FanPowerConnector");
/*  114 */   private static final QName _RAMClockSpeed_QNAME = new QName("", "RAMClockSpeed");
/*  115 */   private static final QName _TweeterSpeakerTechnology_QNAME = new QName("", "TweeterSpeakerTechnology");
/*  116 */   private static final QName _ShipmentID_QNAME = new QName("", "ShipmentID");
/*  117 */   private static final QName _ExternalBayType_QNAME = new QName("", "ExternalBayType");
/*  118 */   private static final QName _InternalConnector_QNAME = new QName("", "InternalConnector");
/*  119 */   private static final QName _Averagewritetime_QNAME = new QName("", "Averagewritetime");
/*  120 */   private static final QName _ConnectorTypeUsedOnCable_QNAME = new QName("", "ConnectorTypeUsedOnCable");
/*  121 */   private static final QName _ExternalCustomerID_QNAME = new QName("", "ExternalCustomerID");
/*  122 */   private static final QName _ConnectorGender_QNAME = new QName("", "ConnectorGender");
/*  123 */   private static final QName _RAMSize_QNAME = new QName("", "RAMSize");
/*  124 */   private static final QName _MerchantOrderID_QNAME = new QName("", "MerchantOrderID");
/*  125 */   private static final QName _MaximumHorizontalRefreshRate_QNAME = new QName("", "MaximumHorizontalRefreshRate");
/*  126 */   private static final QName _NoiseReductionLevel_QNAME = new QName("", "NoiseReductionLevel");
/*  127 */   private static final QName _FocusType_QNAME = new QName("", "FocusType");
/*  128 */   private static final QName _ImageSensor_QNAME = new QName("", "ImageSensor");
/*  129 */   private static final QName _CameraFlash_QNAME = new QName("", "CameraFlash");
/*  130 */   private static final QName _NumberOfButtons_QNAME = new QName("", "NumberOfButtons");
/*  131 */   private static final QName _MaxExpandedMemorySupported_QNAME = new QName("", "MaxExpandedMemorySupported");
/*  132 */   private static final QName _GuideNumber_QNAME = new QName("", "GuideNumber");
/*  133 */   private static final QName _HeatsinkMaterial_QNAME = new QName("", "HeatsinkMaterial");
/*  134 */   private static final QName _NumberOfFirewirePorts_QNAME = new QName("", "NumberOfFirewirePorts");
/*  135 */   private static final QName _MaximumWattage_QNAME = new QName("", "MaximumWattage");
/*  136 */   private static final QName _MinimumThrowDistance_QNAME = new QName("", "MinimumThrowDistance");
/*  137 */   private static final QName _PowerSupplyFormFactor_QNAME = new QName("", "PowerSupplyFormFactor");
/*  138 */   private static final QName _IsHotShoeIncluded_QNAME = new QName("", "IsHotShoeIncluded");
/*  139 */   private static final QName _MinimumHorizontalRefreshRate_QNAME = new QName("", "MinimumHorizontalRefreshRate");
/*  140 */   private static final QName _Resolution_QNAME = new QName("", "Resolution");
/*  141 */   private static final QName _IncludedHarddrivedescription_QNAME = new QName("", "IncludedHarddrivedescription");
/*  142 */   private static final QName _AutomaticBackupSoftwareIncluded_QNAME = new QName("", "AutomaticBackupSoftwareIncluded");
/*  143 */   private static final QName _Averageseektime_QNAME = new QName("", "Averageseektime");
/*  144 */   private static final QName _AmazonCustomerID_QNAME = new QName("", "AmazonCustomerID");
/*  145 */   private static final QName _CompatibleDeviceSize_QNAME = new QName("", "CompatibleDeviceSize");
/*  146 */   private static final QName _TotalFirewire400Connectors_QNAME = new QName("", "TotalFirewire400Connectors");
/*  147 */   private static final QName _ExpansionSlots_QNAME = new QName("", "ExpansionSlots");
/*  148 */   private static final QName _ThreeDTechnology_QNAME = new QName("", "ThreeDTechnology");
/*  149 */   private static final QName _URacksize_QNAME = new QName("", "URacksize");
/*  150 */   private static final QName _PowerConsumption_QNAME = new QName("", "PowerConsumption");
/*  151 */   private static final QName _FulfillmentMethod_QNAME = new QName("", "FulfillmentMethod");
/*  152 */   private static final QName _TotalUSB30Connectors_QNAME = new QName("", "TotalUSB3.0Connectors");
/*  153 */   private static final QName _TotalCoaxialInputs_QNAME = new QName("", "TotalCoaxialInputs");
/*  154 */   private static final QName _ParentalControlTechnology_QNAME = new QName("", "ParentalControlTechnology");
/*  155 */   private static final QName _VerticalKeystoneCorrection_QNAME = new QName("", "VerticalKeystoneCorrection");
/*  156 */   private static final QName _NumberOfLPT1PrinterPorts_QNAME = new QName("", "NumberOfLPT1PrinterPorts");
/*  157 */   private static final QName _NumberOfDrivers_QNAME = new QName("", "NumberOfDrivers");
/*  158 */   private static final QName _AudibleNoise_QNAME = new QName("", "AudibleNoise");
/*  159 */   private static final QName _AdditionalFeatures_QNAME = new QName("", "AdditionalFeatures");
/*  160 */   private static final QName _AdditionalDrives_QNAME = new QName("", "AdditionalDrives");
/*  161 */   private static final QName _PanelWindowLocation_QNAME = new QName("", "PanelWindowLocation");
/*  162 */   private static final QName _ConnectorType_QNAME = new QName("", "ConnectorType");
/*  163 */   private static final QName _LANPortNumber_QNAME = new QName("", "LANPortNumber");
/*  164 */   private static final QName _PhotoFilterThreadSize_QNAME = new QName("", "PhotoFilterThreadSize");
/*  165 */   private static final QName _MerchantPromotionID_QNAME = new QName("", "MerchantPromotionID");
/*  166 */   private static final QName _MinFocalLength_QNAME = new QName("", "MinFocalLength");
/*  167 */   private static final QName _SoftwareIncluded_QNAME = new QName("", "SoftwareIncluded");
/*  168 */   private static final QName _MaximumImageSize_QNAME = new QName("", "MaximumImageSize");
/*  169 */   private static final QName _InputDeviceInterfaceTechnology_QNAME = new QName("", "InputDeviceInterfaceTechnology");
/*  170 */   private static final QName _TotalFrontPaneleSataPorts_QNAME = new QName("", "TotalFrontPaneleSataPorts");
/*  171 */   private static final QName _MountMotion_QNAME = new QName("", "MountMotion");
/*  172 */   private static final QName _ProcessorSocket_QNAME = new QName("", "ProcessorSocket");
/*  173 */   private static final QName _WaterResistantDepth_QNAME = new QName("", "WaterResistantDepth");
/*  174 */   private static final QName _StorageReadSpeed_QNAME = new QName("", "StorageReadSpeed");
/*  175 */   private static final QName _BiAmpable_QNAME = new QName("", "BiAmpable");
/*  176 */   private static final QName _TotalPowerOutlets_QNAME = new QName("", "TotalPowerOutlets");
/*  177 */   private static final QName _Efficiency_QNAME = new QName("", "Efficiency");
/*  178 */   private static final QName _Remote_QNAME = new QName("", "Remote");
/*  179 */   private static final QName _ImageStabilization_QNAME = new QName("", "ImageStabilization");
/*  180 */   private static final QName _FlashModesDescription_QNAME = new QName("", "FlashModesDescription");
/*  181 */   private static final QName _WirelessStandard_QNAME = new QName("", "WirelessStandard");
/*  182 */   private static final QName _SSDConnectorPins_QNAME = new QName("", "SSDConnectorPins");
/*  183 */   private static final QName _NumberOfLithiumMetalCells_QNAME = new QName("", "NumberOfLithiumMetalCells");
/*  184 */   private static final QName _InternalBayType_QNAME = new QName("", "InternalBayType");
/*  185 */   private static final QName _TotalUSB20Connectors_QNAME = new QName("", "TotalUSB2.0Connectors");
/*  186 */   private static final QName _OperatingSystemCompatability_QNAME = new QName("", "OperatingSystemCompatability");
/*  187 */   private static final QName _Zoom_QNAME = new QName("", "Zoom");
/*  188 */   private static final QName _CoatingDescription_QNAME = new QName("", "CoatingDescription");
/*  189 */   private static final QName _PowerSupplyMounting_QNAME = new QName("", "PowerSupplyMounting");
/*  190 */   private static final QName _CompatibleDeviceFormFactor_QNAME = new QName("", "CompatibleDeviceFormFactor");
/*  191 */   private static final QName _TotalCompositePorts_QNAME = new QName("", "TotalCompositePorts");
/*  192 */   private static final QName _HorizontalKeystoneCorrection_QNAME = new QName("", "HorizontalKeystoneCorrection");
/*  193 */   private static final QName _WirelessDataTransferRate_QNAME = new QName("", "WirelessDataTransferRate");
/*  194 */   private static final QName _InputVideoConnectors_QNAME = new QName("", "InputVideoConnectors");
/*  195 */   private static final QName _TotalComponentInPorts_QNAME = new QName("", "TotalComponentInPorts");
/*  196 */   private static final QName _BatteryChargeCycles_QNAME = new QName("", "BatteryChargeCycles");
/*  197 */   private static final QName _SpeakerOutputChannelQuantity_QNAME = new QName("", "SpeakerOutputChannelQuantity");
/*  198 */   private static final QName _FrontSideBusSpeed_QNAME = new QName("", "FrontSideBusSpeed");
/*  199 */   private static final QName _TrafficFeatures_QNAME = new QName("", "TrafficFeatures");
/*  200 */   private static final QName _CompatibleProcessorTypes_QNAME = new QName("", "CompatibleProcessorTypes");
/*  201 */   private static final QName _PrimaryHeadphoneUse_QNAME = new QName("", "PrimaryHeadphoneUse");
/*  202 */   private static final QName _NumberOfSatelliteSpeakers_QNAME = new QName("", "NumberOfSatelliteSpeakers");
/*  203 */   private static final QName _DeviceHardwareCompatability_QNAME = new QName("", "DeviceHardwareCompatability");
/*  204 */   private static final QName _MountingPattern_QNAME = new QName("", "MountingPattern");
/*  205 */   private static final QName _MaximumApertureRange_QNAME = new QName("", "MaximumApertureRange");
/*  206 */   private static final QName _ModelNumber_QNAME = new QName("", "ModelNumber");
/*  207 */   private static final QName _ViewingAngle_QNAME = new QName("", "ViewingAngle");
/*  208 */   private static final QName _EnclosureFinish_QNAME = new QName("", "EnclosureFinish");
/*  209 */   private static final QName _NumberOfGamingPorts_QNAME = new QName("", "NumberOfGamingPorts");
/*  210 */   private static final QName _ThreeDReady_QNAME = new QName("", "ThreeDReady");
/*  211 */   private static final QName _CameraFilmSpeed_QNAME = new QName("", "CameraFilmSpeed");
/*  212 */   private static final QName _TypeOfMemorySlot_QNAME = new QName("", "TypeOfMemorySlot");
/*  213 */   private static final QName _KeystoneCorrection_QNAME = new QName("", "KeystoneCorrection");
/*  214 */   private static final QName _ZoomType_QNAME = new QName("", "ZoomType");
/*  215 */   private static final QName _TotalVGAOutPorts_QNAME = new QName("", "TotalVGAOutPorts");
/*  216 */   private static final QName _NumberOfFireWire400Ports_QNAME = new QName("", "NumberOfFireWire400Ports");
/*  217 */   private static final QName _ProjectorBrightness_QNAME = new QName("", "ProjectorBrightness");
/*  218 */   private static final QName _ConditionType_QNAME = new QName("", "ConditionType");
/*  219 */   private static final QName _SpeakersNominalOutputPower_QNAME = new QName("", "SpeakersNominalOutputPower");
/*  220 */   private static final QName _CableInterface_QNAME = new QName("", "CableInterface");
/*  221 */   private static final QName _DigitalStillResolution_QNAME = new QName("", "DigitalStillResolution");
/*  222 */   private static final QName _TabletResolution_QNAME = new QName("", "TabletResolution");
/*  223 */   private static final QName _RAID_QNAME = new QName("", "RAID");
/*  224 */   private static final QName _CasLatency_QNAME = new QName("", "CasLatency");
/*  225 */   private static final QName _Address_QNAME = new QName("", "Address");
/*  226 */   private static final QName _ScreenResolution_QNAME = new QName("", "ScreenResolution");
/*  227 */   private static final QName _SubwooferWattage_QNAME = new QName("", "SubwooferWattage");
/*  228 */   private static final QName _SpeakerOut_QNAME = new QName("", "SpeakerOut");
/*  229 */   private static final QName _NumberOfIDEPorts_QNAME = new QName("", "NumberOfIDEPorts");
/*  230 */   private static final QName _RAMTechnology_QNAME = new QName("", "RAMTechnology");
/*  231 */   private static final QName _ScreenTrigger_QNAME = new QName("", "ScreenTrigger");
/*  232 */   private static final QName _WooferSpeakerMaterial_QNAME = new QName("", "WooferSpeakerMaterial");
/*  233 */   private static final QName _MaximumVerticalVideoResolution_QNAME = new QName("", "MaximumVerticalVideoResolution");
/*  234 */   private static final QName _FrequencyRange_QNAME = new QName("", "FrequencyRange");
/*  235 */   private static final QName _BaseWidth_QNAME = new QName("", "BaseWidth");
/*  236 */   private static final QName _GraphicsDescription_QNAME = new QName("", "GraphicsDescription");
/*  237 */   private static final QName _MemorySlotsAvailable_QNAME = new QName("", "MemorySlotsAvailable");
/*  238 */   private static final QName _LampWattage_QNAME = new QName("", "LampWattage");
/*  239 */   private static final QName _MidRangeSpeakerMaterial_QNAME = new QName("", "MidRangeSpeakerMaterial");
/*  240 */   private static final QName _TotalFrontPanelUSB10Ports_QNAME = new QName("", "TotalFrontPanelUSB1.0Ports");
/*  241 */   private static final QName _PrinterWirelessType_QNAME = new QName("", "PrinterWirelessType");
/*  242 */   private static final QName _GraphicsChipsetBrand_QNAME = new QName("", "GraphicsChipsetBrand");
/*  243 */   private static final QName _ScreenFinish_QNAME = new QName("", "ScreenFinish");
/*  244 */   private static final QName _SubwooferSpeakerDiameter_QNAME = new QName("", "SubwooferSpeakerDiameter");
/*  245 */   private static final QName _TotalVideoOutPorts_QNAME = new QName("", "TotalVideoOutPorts");
/*  246 */   private static final QName _ACAdapterCurrent_QNAME = new QName("", "ACAdapterCurrent");
/*  247 */   private static final QName _MaxFocalLength_QNAME = new QName("", "MaxFocalLength");
/*  248 */   private static final QName _MaxWeightRecommendation_QNAME = new QName("", "MaxWeightRecommendation");
/*  249 */   private static final QName _ShaderClock_QNAME = new QName("", "ShaderClock");
/*  250 */   private static final QName _MultiChannelKit_QNAME = new QName("", "MultiChannelKit");
/*  251 */   private static final QName _GraphicsCardMaxResolution_QNAME = new QName("", "GraphicsCardMaxResolution");
/*  252 */   private static final QName _FinishType_QNAME = new QName("", "FinishType");
/*  253 */   private static final QName _ProcessorBrand_QNAME = new QName("", "ProcessorBrand");
/*  254 */   private static final QName _MaximumVerticalRefreshRate_QNAME = new QName("", "MaximumVerticalRefreshRate");
/*  255 */   private static final QName _OutputWattage_QNAME = new QName("", "OutputWattage");
/*  256 */   private static final QName _LANPortBandwidth_QNAME = new QName("", "LANPortBandwidth");
/*  257 */   private static final QName _MaximumHorizontalVideoResolution_QNAME = new QName("", "MaximumHorizontalVideoResolution");
/*  258 */   private static final QName _ConnectionType_QNAME = new QName("", "ConnectionType");
/*  259 */   private static final QName _NumberOfSpeakers_QNAME = new QName("", "NumberOfSpeakers");
/*  260 */   private static final QName _AntennaLocation_QNAME = new QName("", "AntennaLocation");
/*  261 */   private static final QName _TotalNumberOfHotswapBays_QNAME = new QName("", "TotalNumberOfHotswapBays");
/*  262 */   private static final QName _SpeakersMaximumOutputPower_QNAME = new QName("", "SpeakersMaximumOutputPower");
/*  263 */   private static final QName _TotalPreampOutputs_QNAME = new QName("", "TotalPreampOutputs");
/*  264 */   private static final QName _SignalPassthroughTechnology_QNAME = new QName("", "SignalPassthroughTechnology");
/*  265 */   private static final QName _HardDriveSize_QNAME = new QName("", "HardDriveSize");
/*  266 */   private static final QName _CameraDescription_QNAME = new QName("", "CameraDescription");
/*  267 */   private static final QName _MinimumImageSize_QNAME = new QName("", "MinimumImageSize");
/*  268 */   private static final QName _HeadphoneFormFactor_QNAME = new QName("", "HeadphoneFormFactor");
/*  269 */   private static final QName _ScannerResolution_QNAME = new QName("", "ScannerResolution");
/*  270 */   private static final QName _LampLife_QNAME = new QName("", "LampLife");
/*  271 */   private static final QName _InterfaceType_QNAME = new QName("", "InterfaceType");
/*  272 */   private static final QName _NumberOfMonitorConnections_QNAME = new QName("", "NumberOfMonitorConnections");
/*  273 */   private static final QName _SpeedClassRating_QNAME = new QName("", "SpeedClassRating");
/*  274 */   private static final QName _BatteryCellType_QNAME = new QName("", "BatteryCellType");
/*  275 */   private static final QName _StorageMaterialType_QNAME = new QName("", "StorageMaterialType");
/*  276 */   private static final QName _MaxMemorySupported_QNAME = new QName("", "MaxMemorySupported");
/*  277 */   private static final QName _ViewFinderType_QNAME = new QName("", "ViewFinderType");
/*  278 */   private static final QName _WirelessInputDeviceTechnology_QNAME = new QName("", "WirelessInputDeviceTechnology");
/*  279 */   private static final QName _DeviceSoftwareCompatability_QNAME = new QName("", "DeviceSoftwareCompatability");
/*  280 */   private static final QName _FitType_QNAME = new QName("", "FitType");
/*  281 */   private static final QName _MaximumThrowDistance_QNAME = new QName("", "MaximumThrowDistance");
/*  282 */   private static final QName _DriveRPM_QNAME = new QName("", "DriveRPM");
/*  283 */   private static final QName _FanMaximumNoiseLevel_QNAME = new QName("", "FanMaximumNoiseLevel");
/*  284 */   private static final QName _OpticalDriveIntegrated_QNAME = new QName("", "OpticalDriveIntegrated");
/*  285 */   private static final QName _SimultaneousSessions_QNAME = new QName("", "SimultaneousSessions");
/*  286 */   private static final QName _Speaker_QNAME = new QName("", "Speaker");
/*  287 */   private static final QName _NASNetworkInterface_QNAME = new QName("", "NASNetworkInterface");
/*  288 */   private static final QName _WooferSpeakerDiameter_QNAME = new QName("", "WooferSpeakerDiameter");
/*  289 */   private static final QName _SLICertification_QNAME = new QName("", "SLICertification");
/*  290 */   private static final QName _HasAutoFocus_QNAME = new QName("", "HasAutoFocus");
/*  291 */   private static final QName _VideoUpconversionTechnologies_QNAME = new QName("", "VideoUpconversionTechnologies");
/*  292 */   private static final QName _ZoomRatio_QNAME = new QName("", "ZoomRatio");
/*  293 */   private static final QName _PowerSource_QNAME = new QName("", "PowerSource");
/*  294 */   private static final QName _NumberOfeSATAPorts_QNAME = new QName("", "NumberOfeSATAPorts");
/*  295 */   private static final QName _GraphicsCoProcessor_QNAME = new QName("", "GraphicsCoProcessor");
/*  296 */   private static final QName _DurationOfMapService_QNAME = new QName("", "DurationOfMapService");
/*  297 */   private static final QName _Northbridge_QNAME = new QName("", "Northbridge");
/*  298 */   private static final QName _CompatibleMemoryCard_QNAME = new QName("", "CompatibleMemoryCard");
/*  299 */   private static final QName _PCIExpressConnectorConfiguration_QNAME = new QName("", "PCIExpressConnectorConfiguration");
/*  300 */   private static final QName _SSDDriveArchitechture_QNAME = new QName("", "SSDDriveArchitechture");
/*  301 */   private static final QName _MultiGPUTechnology_QNAME = new QName("", "MultiGPUTechnology");
/*  302 */   private static final QName _WirelessInputDeviceProtocol_QNAME = new QName("", "WirelessInputDeviceProtocol");
/*  303 */   private static final QName _BuiltinSpeaker_QNAME = new QName("", "BuiltinSpeaker");
/*  304 */   private static final QName _MovementDetectionTechnology_QNAME = new QName("", "MovementDetectionTechnology");
/*  305 */   private static final QName _MaximumThrowRatio_QNAME = new QName("", "MaximumThrowRatio");
/*  306 */   private static final QName _AudioEncoding_QNAME = new QName("", "AudioEncoding");
/*  307 */   private static final QName _FixedFocalLength_QNAME = new QName("", "FixedFocalLength");
/*  308 */   private static final QName _EffectiveStillResolution_QNAME = new QName("", "EffectiveStillResolution");
/*  309 */   private static final QName _RearWebcamResolution_QNAME = new QName("", "RearWebcamResolution");
/*  310 */   private static final QName _NumberOfPCIExpressSlots_QNAME = new QName("", "NumberOfPCIExpressSlots");
/*  311 */   private static final QName _SubwooferSpeakerMaterial_QNAME = new QName("", "SubwooferSpeakerMaterial");
/*  312 */   private static final QName _CalibrationTechnology_QNAME = new QName("", "CalibrationTechnology");
/*  313 */   private static final QName _NumberOfMicrophonePorts_QNAME = new QName("", "NumberOfMicrophonePorts");
/*  314 */   private static final QName _NumberOfPorts_QNAME = new QName("", "NumberOfPorts");
/*  315 */   private static final QName _TVTunerVideoOutputInterface_QNAME = new QName("", "TVTunerVideoOutputInterface");
/*  316 */   private static final QName _TotalFirewire3200Connectors_QNAME = new QName("", "TotalFirewire3200Connectors");
/*  317 */   private static final QName _MarketplaceName_QNAME = new QName("", "MarketplaceName");
/*  318 */   private static final QName _SpeakerSurroundSoundChannelConfiguration_QNAME = new QName("", "SpeakerSurroundSoundChannelConfiguration");
/*  319 */   private static final QName _TotalFirewire1600Connectors_QNAME = new QName("", "TotalFirewire1600Connectors");
/*  320 */   private static final QName _TotalFirewirePorts_QNAME = new QName("", "TotalFirewirePorts");
/*  321 */   private static final QName _MinimumSystemRequirements_QNAME = new QName("", "MinimumSystemRequirements");
/*  322 */   private static final QName _CardReaderInterface_QNAME = new QName("", "CardReaderInterface");
/*  323 */   private static final QName _NumberOfMemorySticks_QNAME = new QName("", "NumberOfMemorySticks");
/*  324 */   private static final QName _SecurityProtocol_QNAME = new QName("", "SecurityProtocol");
/*  325 */   private static final QName _TotalMiniHDMIPorts_QNAME = new QName("", "TotalMiniHDMIPorts");
/*  326 */   private static final QName _ConnectionInterface_QNAME = new QName("", "ConnectionInterface");
/*  327 */   private static final QName _ControllerType_QNAME = new QName("", "ControllerType");
/*  328 */   private static final QName _PhotoFilterBayonetSize_QNAME = new QName("", "PhotoFilterBayonetSize");
/*  329 */   private static final QName _HolderCapacity_QNAME = new QName("", "HolderCapacity");
/*  330 */   private static final QName _DVDRegion_QNAME = new QName("", "DVDRegion");
/*  331 */   private static final QName _PhotoFilterDropInSize_QNAME = new QName("", "PhotoFilterDropInSize");
/*  332 */   private static final QName _ProcessorType_QNAME = new QName("", "ProcessorType");
/*  333 */   private static final QName _NetworkAdapterType_QNAME = new QName("", "NetworkAdapterType");
/*  334 */   private static final QName _PhotoFilterEffectSize_QNAME = new QName("", "PhotoFilterEffectSize");
/*  335 */   private static final QName _SKU_QNAME = new QName("", "SKU");
/*  336 */   private static final QName _MotherboardFormFactor_QNAME = new QName("", "MotherboardFormFactor");
/*  337 */   private static final QName _PresentationRemoteMemory_QNAME = new QName("", "PresentationRemoteMemory");
/*  338 */   private static final QName _TotalFrontPanelUSB30Ports_QNAME = new QName("", "TotalFrontPanelUSB3.0Ports");
/*  339 */   private static final QName _MaterialType_QNAME = new QName("", "MaterialType");
/*  340 */   private static final QName _MonitorConnectors_QNAME = new QName("", "MonitorConnectors");
/*  341 */   private static final QName _CommunicationInterface_QNAME = new QName("", "CommunicationInterface");
/*  342 */   private static final QName _TweeterDriverDiameter_QNAME = new QName("", "TweeterDriverDiameter");
/*  343 */   private static final QName _EuEnergyLabelEfficiencyClass_QNAME = new QName("", "EuEnergyLabelEfficiencyClass");
/*  344 */   private static final QName _DigitalMediaFormat_QNAME = new QName("", "DigitalMediaFormat");
/*  345 */   private static final QName _ProcessorCount_QNAME = new QName("", "ProcessorCount");
/*  346 */   private static final QName _OpticalDriveType_QNAME = new QName("", "OpticalDriveType");
/*  347 */   private static final QName _ScreenSize_QNAME = new QName("", "ScreenSize");
/*  348 */   private static final QName _TotalUSB11Connectors_QNAME = new QName("", "TotalUSB1.1Connectors");
/*  349 */   private static final QName _Language_QNAME = new QName("", "Language");
/*  350 */   private static final QName _MountingType_QNAME = new QName("", "MountingType");
/*  351 */   private static final QName _RAMFormFactor_QNAME = new QName("", "RAMFormFactor");
/*  352 */   private static final QName _NumberOfexternalBays_QNAME = new QName("", "NumberOfexternalBays");
/*  353 */   private static final QName _GrilleRemoveability_QNAME = new QName("", "GrilleRemoveability");
/*  354 */   private static final QName _HasColorScreen_QNAME = new QName("", "HasColorScreen");
/*  355 */   private static final QName _ContinuousShootingSpeed_QNAME = new QName("", "ContinuousShootingSpeed");
/*  356 */   private static final QName _CPUSocketCompatability_QNAME = new QName("", "CPUSocketCompatability");
/*  357 */   private static final QName _FlashDedication_QNAME = new QName("", "FlashDedication");
/*  358 */   private static final QName _MerchantFulfillmentID_QNAME = new QName("", "MerchantFulfillmentID");
/*  359 */   private static final QName _WirelessTechnology_QNAME = new QName("", "WirelessTechnology");
/*  360 */   private static final QName _CheckpointTSAFriendly_QNAME = new QName("", "CheckpointTSAFriendly");
/*  361 */   private static final QName _AntennaDescription_QNAME = new QName("", "AntennaDescription");
/*  362 */   private static final QName _NumberOfUSB20Ports_QNAME = new QName("", "NumberOfUSB2.0Ports");
/*  363 */   private static final QName _VideoEncoding_QNAME = new QName("", "VideoEncoding");
/*  364 */   private static final QName _UniversalRemoteCode_QNAME = new QName("", "UniversalRemoteCode");
/*  365 */   private static final QName _DeliveryChannel_QNAME = new QName("", "DeliveryChannel");
/*  366 */   private static final QName _TrackingMethod_QNAME = new QName("", "TrackingMethod");
/*  367 */   private static final QName _Channels_QNAME = new QName("", "Channels");
/*  368 */   private static final QName _WaypointsType_QNAME = new QName("", "WaypointsType");
/*  369 */   private static final QName _ConnectorNumber_QNAME = new QName("", "ConnectorNumber");
/*  370 */   private static final QName _SATARAID_QNAME = new QName("", "SATARAID");
/*  371 */   private static final QName _RemoteIncluded_QNAME = new QName("", "RemoteIncluded");
/*  372 */   private static final QName _MaxShutterSpeed_QNAME = new QName("", "MaxShutterSpeed");
/*  373 */   private static final QName _HardDriveInterface_QNAME = new QName("", "HardDriveInterface");
/*  374 */   private static final QName _Conductor_QNAME = new QName("", "Conductor");
/*  375 */   private static final QName _NumberOfAudioOutPorts_QNAME = new QName("", "NumberOfAudioOutPorts");
/*  376 */   private static final QName _TotalSubwooferOutputs_QNAME = new QName("", "TotalSubwooferOutputs");
/*  377 */   private static final QName _SubscriptionTermName_QNAME = new QName("", "SubscriptionTermName");
/*  378 */   private static final QName _StorageWriteSpeed_QNAME = new QName("", "StorageWriteSpeed");
/*  379 */   private static final QName _CharacterData_QNAME = new QName("", "CharacterData");
/*  380 */   private static final QName _InternetApplications_QNAME = new QName("", "InternetApplications");
/*  381 */   private static final QName _MotherboardCompatibility_QNAME = new QName("", "MotherboardCompatibility");
/*  382 */   private static final QName _EffectiveInputArea_QNAME = new QName("", "EffectiveInputArea");
/*  383 */   private static final QName _MemoryCardType_QNAME = new QName("", "MemoryCardType");
/*  384 */   private static final QName _PresentationRemoteOperatingDistance_QNAME = new QName("", "PresentationRemoteOperatingDistance");
/*  385 */   private static final QName _NumberOfHandsets_QNAME = new QName("", "NumberOfHandsets");
/*  386 */   private static final QName _MinAperture_QNAME = new QName("", "MinAperture");
/*  387 */   private static final QName _MinShutterSpeed_QNAME = new QName("", "MinShutterSpeed");
/*  388 */   private static final QName _NumberOfSATAPorts_QNAME = new QName("", "NumberOfSATAPorts");
/*  389 */   private static final QName _KeyboardDescription_QNAME = new QName("", "KeyboardDescription");
/*  390 */   private static final QName _FrontWebcamResolution_QNAME = new QName("", "FrontWebcamResolution");
/*  391 */   private static final QName _PromotionClaimCode_QNAME = new QName("", "PromotionClaimCode");
/*  392 */   private static final QName _SpeakerMaximumInputPower_QNAME = new QName("", "SpeakerMaximumInputPower");
/*  393 */   private static final QName _SubwooferPowerTechnology_QNAME = new QName("", "SubwooferPowerTechnology");
/*  394 */   private static final QName _NumberOfLithiumIonCells_QNAME = new QName("", "NumberOfLithiumIonCells");
/*  395 */   private static final QName _TotalHDMIPorts_QNAME = new QName("", "TotalHDMIPorts");
/*  396 */   private static final QName _SpeedRating_QNAME = new QName("", "SpeedRating");
/*  397 */   private static final QName _ControlType_QNAME = new QName("", "ControlType");
/*  398 */   private static final QName _NumberOfHDMIPorts_QNAME = new QName("", "NumberOfHDMIPorts");
/*  399 */   private static final QName _Shape_QNAME = new QName("", "Shape");
/*  400 */   private static final QName _TweeterSpeakerDiameter_QNAME = new QName("", "TweeterSpeakerDiameter");
/*  401 */   private static final QName _TotalSVideoInPorts_QNAME = new QName("", "TotalSVideoInPorts");
/*  402 */   private static final QName _TotalDVIPorts_QNAME = new QName("", "TotalDVIPorts");
/*  403 */   private static final QName _PowerPlugType_QNAME = new QName("", "PowerPlugType");
/*  404 */   private static final QName _EnergyEfficiencyRating_QNAME = new QName("", "EnergyEfficiencyRating");
/*  405 */   private static final QName _TunerTechnology_QNAME = new QName("", "TunerTechnology");
/*  406 */   private static final QName _GraphicsCardMemoryType_QNAME = new QName("", "GraphicsCardMemoryType");
/*  407 */   private static final QName _AirDuctLocation_QNAME = new QName("", "AirDuctLocation");
/*  408 */   private static final QName _FanMaximumSpeed_QNAME = new QName("", "FanMaximumSpeed");
/*  409 */   private static final QName _ACAdapterIncluded_QNAME = new QName("", "ACAdapterIncluded");
/*  410 */   private static final QName _ThrowRatio_QNAME = new QName("", "ThrowRatio");
/*  411 */   private static final QName _DisplayResolutionMaximum_QNAME = new QName("", "DisplayResolutionMaximum");
/*  412 */   private static final QName _PlatformCompatability_QNAME = new QName("", "PlatformCompatability");
/*  413 */   private static final QName _ComputerMemoryTechnology_QNAME = new QName("", "ComputerMemoryTechnology");
/*  414 */   private static final QName _MerchantOrderItemID_QNAME = new QName("", "MerchantOrderItemID");
/*  415 */   private static final QName _OpticalIn_QNAME = new QName("", "OpticalIn");
/*  416 */   private static final QName _OpticalOut_QNAME = new QName("", "OpticalOut");
/*  417 */   private static final QName _Denomination_QNAME = new QName("", "Denomination");
/*  418 */   private static final QName _TotalFrontPanelUSB20Ports_QNAME = new QName("", "TotalFrontPanelUSB2.0Ports");
/*  419 */   private static final QName _ComputerMemoryFormFactor_QNAME = new QName("", "ComputerMemoryFormFactor");
/*  420 */   private static final QName _FanLED_QNAME = new QName("", "FanLED");
/*  421 */   private static final QName _MidRangeSpeakerDiameter_QNAME = new QName("", "MidRangeSpeakerDiameter");
/*  422 */   private static final QName _InputVideoCompatability_QNAME = new QName("", "InputVideoCompatability");
/*  423 */   private static final QName _NumberOfFans_QNAME = new QName("", "NumberOfFans");
/*  424 */   private static final QName _GraphicsCardInterface_QNAME = new QName("", "GraphicsCardInterface");
/*  425 */   private static final QName _HeadphoneEarcupMotion_QNAME = new QName("", "HeadphoneEarcupMotion");
/*  426 */   private static final QName _Southbridge_QNAME = new QName("", "Southbridge");
/*  427 */   private static final QName _PhotoFilterLensSize_QNAME = new QName("", "PhotoFilterLensSize");
/*  428 */   private static final QName _Series_QNAME = new QName("", "Series");
/*  429 */   private static final QName _MaxAperture_QNAME = new QName("", "MaxAperture");
/*  430 */   private static final QName _AmazonOrderID_QNAME = new QName("", "AmazonOrderID");
/*  431 */   private static final QName _RefreshRate_QNAME = new QName("", "RefreshRate");
/*  432 */   private static final QName _BoxContents_QNAME = new QName("", "BoxContents");
/*  433 */   private static final QName _TVTunerVideoStandard_QNAME = new QName("", "TVTunerVideoStandard");
/*  434 */   private static final QName _LargestFanSize_QNAME = new QName("", "LargestFanSize");
/*  435 */   private static final QName _CacheMemory_QNAME = new QName("", "CacheMemory");
/*  436 */   private static final QName _NumberOfRecordingLoops_QNAME = new QName("", "NumberOfRecordingLoops");
/*  437 */   private static final QName _GraphicsRAMSize_QNAME = new QName("", "GraphicsRAMSize");
/*  438 */   private static final QName _NumberOfSerialPorts_QNAME = new QName("", "NumberOfSerialPorts");
/*  439 */   private static final QName _DigitalZoom_QNAME = new QName("", "DigitalZoom");
/*  440 */   private static final QName _TVTunerMemory_QNAME = new QName("", "TVTunerMemory");
/*  441 */   private static final QName _ComputerMemoryType_QNAME = new QName("", "ComputerMemoryType");
/*  442 */   private static final QName _NumberOfPS2Ports_QNAME = new QName("", "NumberOfPS2Ports");
/*  443 */   private static final QName _MemoryStandard_QNAME = new QName("", "MemoryStandard");
/*  444 */   private static final QName _CoreClock_QNAME = new QName("", "CoreClock");
/*  445 */   private static final QName _SVideoInputType_QNAME = new QName("", "SVideoInputType");
/*  446 */   private static final QName _IPProtocolStandards_QNAME = new QName("", "IPProtocolStandards");
/*  447 */   private static final QName _AudioOutputMode_QNAME = new QName("", "AudioOutputMode");
/*  448 */   private static final QName _BluRayRegion_QNAME = new QName("", "BluRayRegion");
/*  449 */   private static final QName _ThreeDAPI_QNAME = new QName("", "ThreeDAPI");
/*  450 */   private static final QName _TweeterSpeakerMaterial_QNAME = new QName("", "TweeterSpeakerMaterial");
/*  451 */   private static final QName _OpticalZoom_QNAME = new QName("", "OpticalZoom");
/*  452 */   private static final QName _TotalHdmiPorts_QNAME = new QName("", "TotalHdmiPorts");
/*  453 */   private static final QName _CableType_QNAME = new QName("", "CableType");
/*  454 */   private static final QName _PowerFactorCorrection_QNAME = new QName("", "PowerFactorCorrection");
/*  455 */   private static final QName _NumberOfUSBPorts_QNAME = new QName("", "NumberOfUSBPorts");
/*  456 */   private static final QName _FrontPanelInputs_QNAME = new QName("", "FrontPanelInputs");
/*  457 */   private static final QName _InputDeviceDesignStyle_QNAME = new QName("", "InputDeviceDesignStyle");
/*  458 */   private static final QName _CarrierCode_QNAME = new QName("", "CarrierCode");
/*  459 */   private static final QName _SystemCabinetFormFactor_QNAME = new QName("", "SystemCabinetFormFactor");
/*  460 */   private static final QName _MaxEthernetSpeed_QNAME = new QName("", "MaxEthernetSpeed");
/*  461 */   private static final QName _MemoryCapacityPerSTICK_QNAME = new QName("", "MemoryCapacityPerSTICK");
/*  462 */   private static final QName _IncludedFeatures_QNAME = new QName("", "IncludedFeatures");
/*  463 */   private static final QName _TotalFirewire800Connectors_QNAME = new QName("", "TotalFirewire800Connectors");
/*  464 */   private static final QName _BaseLength_QNAME = new QName("", "BaseLength");
/*  465 */   private static final QName _MaximumOperatingDistance_QNAME = new QName("", "MaximumOperatingDistance");
/*  466 */   private static final QName _Wattage_QNAME = new QName("", "Wattage");
/*  467 */   private static final QName _Audio_QNAME = new QName("", "Audio");
/*  468 */   private static final QName _WirelessType_QNAME = new QName("", "WirelessType");
/*  469 */   private static final QName _WirelessRouterTransmissionBand_QNAME = new QName("", "WirelessRouterTransmissionBand");
/*  470 */   private static final QName _MaximumSupportedScreenSize_QNAME = new QName("", "MaximumSupportedScreenSize");
/*  471 */   private static final QName _BufferSize_QNAME = new QName("", "BufferSize");
/*  472 */   private static final QName _CameraType_QNAME = new QName("", "CameraType");
/*  473 */   private static final QName _TabletMaximumDataRate_QNAME = new QName("", "TabletMaximumDataRate");
/*  474 */   private static final QName _SATAStandardsSupported_QNAME = new QName("", "SATAStandardsSupported");
/*  475 */   private static final QName _IntegratedAudioChannels_QNAME = new QName("", "IntegratedAudioChannels");
/*  476 */   private static final QName _ComputerWirelessType_QNAME = new QName("", "ComputerWirelessType");
/*  477 */   private static final QName _MaxMemorySpeed_QNAME = new QName("", "MaxMemorySpeed");
/*  478 */   private static final QName _FanMaximumAirflow_QNAME = new QName("", "FanMaximumAirflow");
/*  479 */   private static final QName _NumberOfVGAPorts_QNAME = new QName("", "NumberOfVGAPorts");
/*  480 */   private static final QName _ComponentWriteSpeed_QNAME = new QName("", "ComponentWriteSpeed");
/*  481 */   private static final QName _SurgeProtectionRating_QNAME = new QName("", "SurgeProtectionRating");
/*  482 */   private static final QName _TotalUSBPorts_QNAME = new QName("", "TotalUSBPorts");
/*  483 */   private static final QName _CPUSocketType_QNAME = new QName("", "CPUSocketType");
/*  484 */   private static final QName _ProcessorSeries_QNAME = new QName("", "ProcessorSeries");
/*  485 */   private static final QName _CompatibleDevices_QNAME = new QName("", "CompatibleDevices");
/*  486 */   private static final QName _ContrastRatio_QNAME = new QName("", "ContrastRatio");
/*  487 */   private static final QName _TotalVgaInPorts_QNAME = new QName("", "TotalVgaInPorts");
/*  488 */   private static final QName _ProjectionMethod_QNAME = new QName("", "ProjectionMethod");
/*  489 */   private static final QName _TabletMinimumSystemRequirements_QNAME = new QName("", "TabletMinimumSystemRequirements");
/*  490 */   private static final QName _ReadSpeed_QNAME = new QName("", "ReadSpeed");
/*  491 */   private static final QName _ModemType_QNAME = new QName("", "ModemType");
/*  492 */   private static final QName _ProductTaxCode_QNAME = new QName("", "ProductTaxCode");
/*  493 */   private static final QName _AspectRatio_QNAME = new QName("", "AspectRatio");
/*  494 */   private static final QName _PhotoFilterMountType_QNAME = new QName("", "PhotoFilterMountType");
/*  495 */   private static final QName _MinimumThrowRatio_QNAME = new QName("", "MinimumThrowRatio");
/*  496 */   private static final QName _WebcamVideoCaptureResolution_QNAME = new QName("", "WebcamVideoCaptureResolution");
/*  497 */   private static final QName _HardDiskRotationalSpeed_QNAME = new QName("", "HardDiskRotationalSpeed");
/*  498 */   private static final QName _PrintingMediaType_QNAME = new QName("", "PrintingMediaType");
/*  499 */   private static final QName _NotebookDisplayTechnology_QNAME = new QName("", "NotebookDisplayTechnology");
/*  500 */   private static final QName _SpeakerDiameter_QNAME = new QName("", "SpeakerDiameter");
/*  501 */   private static final QName _TotalFrontPanelFirewire800Ports_QNAME = new QName("", "TotalFrontPanelFirewire800Ports");
/*  502 */   private static final QName _CompatibleMountings_QNAME = new QName("", "CompatibleMountings");
/*  503 */   private static final QName _HandOrientation_QNAME = new QName("", "HandOrientation");
/*  504 */   private static final QName _ChipsetType_QNAME = new QName("", "ChipsetType");
/*  505 */   private static final QName _MonitorBrightness_QNAME = new QName("", "MonitorBrightness");
/*  506 */   private static final QName _TotalUSB10Connectors_QNAME = new QName("", "TotalUSB1.0Connectors");
/*  507 */   private static final QName _InputType_QNAME = new QName("", "InputType");
/*  508 */   private static final QName _MaxUpstreamTransmissionRate_QNAME = new QName("", "MaxUpstreamTransmissionRate");
/*  509 */   private static final QName _MinimumSupportedScreenSize_QNAME = new QName("", "MinimumSupportedScreenSize");
/*  510 */   private static final QName _SampleRate_QNAME = new QName("", "SampleRate");
/*  511 */   private static final QName _DockingStationExternalInterface_QNAME = new QName("", "DockingStationExternalInterface");
/*  512 */   private static final QName _PowerSupplyMaxOutput_QNAME = new QName("", "PowerSupplyMaxOutput");
/*  513 */   private static final QName _TotalMicrophonePorts_QNAME = new QName("", "TotalMicrophonePorts");
/*  514 */   private static final QName _MediaInput_QNAME = new QName("", "MediaInput");
/*  515 */   private static final QName _Modular_QNAME = new QName("", "Modular");
/*  516 */   private static final QName _TotalFrontPanelUSB11Ports_QNAME = new QName("", "TotalFrontPanelUSB1.1Ports");
/*  517 */   private static final QName _PhysicalHardDriveFormFactor_QNAME = new QName("", "PhysicalHardDriveFormFactor");
/*  518 */   private static final QName _NumberOfInternalBays_QNAME = new QName("", "NumberOfInternalBays");
/*  519 */   private static final QName _NoiseCanceling_QNAME = new QName("", "NoiseCanceling");
/*  520 */   private static final QName _BuiltInMicrophone_QNAME = new QName("", "BuiltInMicrophone");
/*  521 */   private static final QName _HardDiskTechnology_QNAME = new QName("", "HardDiskTechnology");
/*  522 */   private static final QName _MinimumVerticalRefreshRate_QNAME = new QName("", "MinimumVerticalRefreshRate");
/*  523 */   private static final QName _AdditionalFunctionality_QNAME = new QName("", "AdditionalFunctionality");
/*  524 */   private static final QName _NumberOfMemorySlots_QNAME = new QName("", "NumberOfMemorySlots");
/*  525 */   private static final QName _CableSpeed_QNAME = new QName("", "CableSpeed");
/*      */ 
/*      */   public Battery createBattery()
/*      */   {
/*  539 */     return new Battery();
/*      */   }
/*      */ 
/*      */   public BedAndBath createBedAndBath()
/*      */   {
/*  547 */     return new BedAndBath();
/*      */   }
/*      */ 
/*      */   public WirelessAccessories createWirelessAccessories()
/*      */   {
/*  555 */     return new WirelessAccessories();
/*      */   }
/*      */ 
/*      */   public Hardware createHardware()
/*      */   {
/*  563 */     return new Hardware();
/*      */   }
/*      */ 
/*      */   public BuildingMaterials createBuildingMaterials()
/*      */   {
/*  571 */     return new BuildingMaterials();
/*      */   }
/*      */ 
/*      */   public LightBulbs createLightBulbs()
/*      */   {
/*  579 */     return new LightBulbs();
/*      */   }
/*      */ 
/*      */   public Art createArt()
/*      */   {
/*  587 */     return new Art();
/*      */   }
/*      */ 
/*      */   public Home createHome()
/*      */   {
/*  595 */     return new Home();
/*      */   }
/*      */ 
/*      */   public KindleEReaderAccessories createKindleEReaderAccessories()
/*      */   {
/*  603 */     return new KindleEReaderAccessories();
/*      */   }
/*      */ 
/*      */   public CE createCE()
/*      */   {
/*  611 */     return new CE();
/*      */   }
/*      */ 
/*      */   public ComputerComponent createComputerComponent()
/*      */   {
/*  619 */     return new ComputerComponent();
/*      */   }
/*      */ 
/*      */   public Kitchen createKitchen()
/*      */   {
/*  627 */     return new Kitchen();
/*      */   }
/*      */ 
/*      */   public OrganizersAndStorage createOrganizersAndStorage()
/*      */   {
/*  635 */     return new OrganizersAndStorage();
/*      */   }
/*      */ 
/*      */   public Electrical createElectrical()
/*      */   {
/*  643 */     return new Electrical();
/*      */   }
/*      */ 
/*      */   public Lighting createLighting()
/*      */   {
/*  651 */     return new Lighting();
/*      */   }
/*      */ 
/*      */   public KindleAccessories createKindleAccessories()
/*      */   {
/*  659 */     return new KindleAccessories();
/*      */   }
/*      */ 
/*      */   public PersonalComputer createPersonalComputer()
/*      */   {
/*  667 */     return new PersonalComputer();
/*      */   }
/*      */ 
/*      */   public Product createProduct()
/*      */   {
/*  675 */     return new Product();
/*      */   }
/*      */ 
/*      */   public MajorHomeAppliances createMajorHomeAppliances()
/*      */   {
/*  683 */     return new MajorHomeAppliances();
/*      */   }
/*      */ 
/*      */   public TabletComputer createTabletComputer()
/*      */   {
/*  691 */     return new TabletComputer();
/*      */   }
/*      */ 
/*      */   public FurnitureAndDecor createFurnitureAndDecor()
/*      */   {
/*  699 */     return new FurnitureAndDecor();
/*      */   }
/*      */ 
/*      */   public SecurityElectronics createSecurityElectronics()
/*      */   {
/*  707 */     return new SecurityElectronics();
/*      */   }
/*      */ 
/*      */   public ConsumerElectronics createConsumerElectronics()
/*      */   {
/*  715 */     return new ConsumerElectronics();
/*      */   }
/*      */ 
/*      */   public KindleFireAccessories createKindleFireAccessories()
/*      */   {
/*  723 */     return new KindleFireAccessories();
/*      */   }
/*      */ 
/*      */   public Wireless createWireless()
/*      */   {
/*  731 */     return new Wireless();
/*      */   }
/*      */ 
/*      */   public SeedsAndPlants createSeedsAndPlants()
/*      */   {
/*  739 */     return new SeedsAndPlants();
/*      */   }
/*      */ 
/*      */   public Sports createSports()
/*      */   {
/*  747 */     return new Sports();
/*      */   }
/*      */ 
/*      */   public HomeImprovement createHomeImprovement()
/*      */   {
/*  755 */     return new HomeImprovement();
/*      */   }
/*      */ 
/*      */   public LightsAndFixtures createLightsAndFixtures()
/*      */   {
/*  763 */     return new LightsAndFixtures();
/*      */   }
/*      */ 
/*      */   public Computers createComputers()
/*      */   {
/*  771 */     return new Computers();
/*      */   }
/*      */ 
/*      */   public OutdoorLiving createOutdoorLiving()
/*      */   {
/*  779 */     return new OutdoorLiving();
/*      */   }
/*      */ 
/*      */   public SoftwareVideoGames createSoftwareVideoGames()
/*      */   {
/*  787 */     return new SoftwareVideoGames();
/*      */   }
/*      */ 
/*      */   public NotebookComputer createNotebookComputer()
/*      */   {
/*  795 */     return new NotebookComputer();
/*      */   }
/*      */ 
/*      */   public PlumbingFixtures createPlumbingFixtures()
/*      */   {
/*  803 */     return new PlumbingFixtures();
/*      */   }
/*      */ 
/*      */   public BuyerPrice createBuyerPrice()
/*      */   {
/*  811 */     return new BuyerPrice();
/*      */   }
/*      */ 
/*      */   public DirectPaymentType createDirectPaymentType()
/*      */   {
/*  819 */     return new DirectPaymentType();
/*      */   }
/*      */ 
/*      */   public AmazonFees createAmazonFees()
/*      */   {
/*  827 */     return new AmazonFees();
/*      */   }
/*      */ 
/*      */   public HomeImprovementTools createHomeImprovementTools()
/*      */   {
/*  835 */     return new HomeImprovementTools();
/*      */   }
/*      */ 
/*      */   public PromotionDataType createPromotionDataType()
/*      */   {
/*  843 */     return new PromotionDataType();
/*      */   }
/*      */ 
/*      */   public Home.ProductType createHomeProductType()
/*      */   {
/*  851 */     return new Home.ProductType();
/*      */   }
/*      */ 
/*      */   public Home.ProductType.InnerHome createHomeProductTypeHome()
/*      */   {
/*  859 */     return new Home.ProductType.InnerHome();
/*      */   }
/*      */ 
/*      */   public FrequencyDimension createFrequencyDimension()
/*      */   {
/*  867 */     return new FrequencyDimension();
/*      */   }
/*      */ 
/*      */   public MemorySizeIntegerDimension createMemorySizeIntegerDimension()
/*      */   {
/*  875 */     return new MemorySizeIntegerDimension();
/*      */   }
/*      */ 
/*      */   public Battery.BatterySubgroup createBatteryBatterySubgroup()
/*      */   {
/*  883 */     return new Battery.BatterySubgroup();
/*      */   }
/*      */ 
/*      */   public AreaDimensionOptionalUnit createAreaDimensionOptionalUnit()
/*      */   {
/*  891 */     return new AreaDimensionOptionalUnit();
/*      */   }
/*      */ 
/*      */   public VolumeRateDimension createVolumeRateDimension()
/*      */   {
/*  899 */     return new VolumeRateDimension();
/*      */   }
/*      */ 
/*      */   public WeightDimension createWeightDimension()
/*      */   {
/*  907 */     return new WeightDimension();
/*      */   }
/*      */ 
/*      */   public BedAndBath.VariationData createBedAndBathVariationData()
/*      */   {
/*  915 */     return new BedAndBath.VariationData();
/*      */   }
/*      */ 
/*      */   public WattageDimensionOptionalUnit createWattageDimensionOptionalUnit()
/*      */   {
/*  923 */     return new WattageDimensionOptionalUnit();
/*      */   }
/*      */ 
/*      */   public LengthDimension createLengthDimension()
/*      */   {
/*  931 */     return new LengthDimension();
/*      */   }
/*      */ 
/*      */   public WirelessAccessories.VariationData createWirelessAccessoriesVariationData()
/*      */   {
/*  939 */     return new WirelessAccessories.VariationData();
/*      */   }
/*      */ 
/*      */   public TimeDimension createTimeDimension()
/*      */   {
/*  947 */     return new TimeDimension();
/*      */   }
/*      */ 
/*      */   public BatteryPowerIntegerDimension createBatteryPowerIntegerDimension()
/*      */   {
/*  955 */     return new BatteryPowerIntegerDimension();
/*      */   }
/*      */ 
/*      */   public MemoryInterfaceDimension createMemoryInterfaceDimension()
/*      */   {
/*  963 */     return new MemoryInterfaceDimension();
/*      */   }
/*      */ 
/*      */   public VoltageSevenDigitDecimalDimension createVoltageSevenDigitDecimalDimension()
/*      */   {
/*  971 */     return new VoltageSevenDigitDecimalDimension();
/*      */   }
/*      */ 
/*      */   public ResolutionFiveDigitDimension createResolutionFiveDigitDimension()
/*      */   {
/*  979 */     return new ResolutionFiveDigitDimension();
/*      */   }
/*      */ 
/*      */   public TabletActiveSurfaceAreaDimension createTabletActiveSurfaceAreaDimension()
/*      */   {
/*  987 */     return new TabletActiveSurfaceAreaDimension();
/*      */   }
/*      */ 
/*      */   public GPSOrNavigationAccessory createGPSOrNavigationAccessory()
/*      */   {
/*  995 */     return new GPSOrNavigationAccessory();
/*      */   }
/*      */ 
/*      */   public Hardware.VariationData createHardwareVariationData()
/*      */   {
/* 1003 */     return new Hardware.VariationData();
/*      */   }
/*      */ 
/*      */   public BatteryPowerDimension createBatteryPowerDimension()
/*      */   {
/* 1011 */     return new BatteryPowerDimension();
/*      */   }
/*      */ 
/*      */   public LumensType createLumensType()
/*      */   {
/* 1019 */     return new LumensType();
/*      */   }
/*      */ 
/*      */   public WattageDimension createWattageDimension()
/*      */   {
/* 1027 */     return new WattageDimension();
/*      */   }
/*      */ 
/*      */   public EnergyConsumptionDimension createEnergyConsumptionDimension()
/*      */   {
/* 1035 */     return new EnergyConsumptionDimension();
/*      */   }
/*      */ 
/*      */   public MaximumPowerType createMaximumPowerType()
/*      */   {
/* 1043 */     return new MaximumPowerType();
/*      */   }
/*      */ 
/*      */   public SpeedDimension createSpeedDimension()
/*      */   {
/* 1051 */     return new SpeedDimension();
/*      */   }
/*      */ 
/*      */   public LengthDimensionOptionalUnit createLengthDimensionOptionalUnit()
/*      */   {
/* 1059 */     return new LengthDimensionOptionalUnit();
/*      */   }
/*      */ 
/*      */   public TorqueType createTorqueType()
/*      */   {
/* 1067 */     return new TorqueType();
/*      */   }
/*      */ 
/*      */   public VolumeDimension createVolumeDimension()
/*      */   {
/* 1075 */     return new VolumeDimension();
/*      */   }
/*      */ 
/*      */   public DegreeDimension createDegreeDimension()
/*      */   {
/* 1083 */     return new DegreeDimension();
/*      */   }
/*      */ 
/*      */   public LengthFourDigitDimension createLengthFourDigitDimension()
/*      */   {
/* 1091 */     return new LengthFourDigitDimension();
/*      */   }
/*      */ 
/*      */   public LengthSevenDigitDimension createLengthSevenDigitDimension()
/*      */   {
/* 1099 */     return new LengthSevenDigitDimension();
/*      */   }
/*      */ 
/*      */   public DataTransferSpeedTenIntegerDimension createDataTransferSpeedTenIntegerDimension()
/*      */   {
/* 1107 */     return new DataTransferSpeedTenIntegerDimension();
/*      */   }
/*      */ 
/*      */   public DataTransferSpeedFiveDigitIntegerDimension createDataTransferSpeedFiveDigitIntegerDimension()
/*      */   {
/* 1115 */     return new DataTransferSpeedFiveDigitIntegerDimension();
/*      */   }
/*      */ 
/*      */   public BuildingMaterials.VariationData createBuildingMaterialsVariationData()
/*      */   {
/* 1123 */     return new BuildingMaterials.VariationData();
/*      */   }
/*      */ 
/*      */   public PortableAvDevice createPortableAvDevice()
/*      */   {
/* 1131 */     return new PortableAvDevice();
/*      */   }
/*      */ 
/*      */   public ResolutionDimension createResolutionDimension()
/*      */   {
/* 1139 */     return new ResolutionDimension();
/*      */   }
/*      */ 
/*      */   public PowerDimension createPowerDimension()
/*      */   {
/* 1147 */     return new PowerDimension();
/*      */   }
/*      */ 
/*      */   public PixelDimension createPixelDimension()
/*      */   {
/* 1155 */     return new PixelDimension();
/*      */   }
/*      */ 
/*      */   public WattageIntegerDimension createWattageIntegerDimension()
/*      */   {
/* 1163 */     return new WattageIntegerDimension();
/*      */   }
/*      */ 
/*      */   public TimeIntegerDimension createTimeIntegerDimension()
/*      */   {
/* 1171 */     return new TimeIntegerDimension();
/*      */   }
/*      */ 
/*      */   public LightBulbs.VariationData createLightBulbsVariationData()
/*      */   {
/* 1179 */     return new LightBulbs.VariationData();
/*      */   }
/*      */ 
/*      */   public TemperatureRatingDimension createTemperatureRatingDimension()
/*      */   {
/* 1187 */     return new TemperatureRatingDimension();
/*      */   }
/*      */ 
/*      */   public LuminanceDimension createLuminanceDimension()
/*      */   {
/* 1195 */     return new LuminanceDimension();
/*      */   }
/*      */ 
/*      */   public LuminiousIntensityDimension createLuminiousIntensityDimension()
/*      */   {
/* 1203 */     return new LuminiousIntensityDimension();
/*      */   }
/*      */ 
/*      */   public VoltageIntegerDimensionOptionalUnit createVoltageIntegerDimensionOptionalUnit()
/*      */   {
/* 1211 */     return new VoltageIntegerDimensionOptionalUnit();
/*      */   }
/*      */ 
/*      */   public AmperageDimension createAmperageDimension()
/*      */   {
/* 1219 */     return new AmperageDimension();
/*      */   }
/*      */ 
/*      */   public ComputerCoolingDevice createComputerCoolingDevice()
/*      */   {
/* 1227 */     return new ComputerCoolingDevice();
/*      */   }
/*      */ 
/*      */   public VariationData createVariationData()
/*      */   {
/* 1235 */     return new VariationData();
/*      */   }
/*      */ 
/*      */   public AirflowDimension createAirflowDimension()
/*      */   {
/* 1243 */     return new AirflowDimension();
/*      */   }
/*      */ 
/*      */   public NoiseLevelSixDigitDimension createNoiseLevelSixDigitDimension()
/*      */   {
/* 1251 */     return new NoiseLevelSixDigitDimension();
/*      */   }
/*      */ 
/*      */   public SpeedSixDigitDimension createSpeedSixDigitDimension()
/*      */   {
/* 1259 */     return new SpeedSixDigitDimension();
/*      */   }
/*      */ 
/*      */   public LengthFiveDigitDimension createLengthFiveDigitDimension()
/*      */   {
/* 1267 */     return new LengthFiveDigitDimension();
/*      */   }
/*      */ 
/*      */   public Art.VariationData createArtVariationData()
/*      */   {
/* 1275 */     return new Art.VariationData();
/*      */   }
/*      */ 
/*      */   public CameraLenses createCameraLenses()
/*      */   {
/* 1283 */     return new CameraLenses();
/*      */   }
/*      */ 
/*      */   public ZoomDimension createZoomDimension()
/*      */   {
/* 1291 */     return new ZoomDimension();
/*      */   }
/*      */ 
/*      */   public CarAudioOrTheater createCarAudioOrTheater()
/*      */   {
/* 1299 */     return new CarAudioOrTheater();
/*      */   }
/*      */ 
/*      */   public FrequencyIntegerDimension createFrequencyIntegerDimension()
/*      */   {
/* 1307 */     return new FrequencyIntegerDimension();
/*      */   }
/*      */ 
/*      */   public PressureLevelSixDigitIntegerDimension createPressureLevelSixDigitIntegerDimension()
/*      */   {
/* 1315 */     return new PressureLevelSixDigitIntegerDimension();
/*      */   }
/*      */ 
/*      */   public ComputerProcessor createComputerProcessor()
/*      */   {
/* 1323 */     return new ComputerProcessor();
/*      */   }
/*      */ 
/*      */   public RadarDetector createRadarDetector()
/*      */   {
/* 1331 */     return new RadarDetector();
/*      */   }
/*      */ 
/*      */   public Software createSoftware()
/*      */   {
/* 1339 */     return new Software();
/*      */   }
/*      */ 
/*      */   public PEGIDetailsType createPEGIDetailsType()
/*      */   {
/* 1347 */     return new PEGIDetailsType();
/*      */   }
/*      */ 
/*      */   public SoftwarePlatform createSoftwarePlatform()
/*      */   {
/* 1355 */     return new SoftwarePlatform();
/*      */   }
/*      */ 
/*      */   public CECameraFlash createCECameraFlash()
/*      */   {
/* 1363 */     return new CECameraFlash();
/*      */   }
/*      */ 
/*      */   public ForwardFacingWeight createForwardFacingWeight()
/*      */   {
/* 1371 */     return new ForwardFacingWeight();
/*      */   }
/*      */ 
/*      */   public HICommon createHICommon()
/*      */   {
/* 1379 */     return new HICommon();
/*      */   }
/*      */ 
/*      */   public OptionalMinimumAgeRecommendedDimension createOptionalMinimumAgeRecommendedDimension()
/*      */   {
/* 1387 */     return new OptionalMinimumAgeRecommendedDimension();
/*      */   }
/*      */ 
/*      */   public AirFlowDisplacementDimension createAirFlowDisplacementDimension()
/*      */   {
/* 1395 */     return new AirFlowDisplacementDimension();
/*      */   }
/*      */ 
/*      */   public BatteryLifeType createBatteryLifeType()
/*      */   {
/* 1403 */     return new BatteryLifeType();
/*      */   }
/*      */ 
/*      */   public FlowRateType createFlowRateType()
/*      */   {
/* 1411 */     return new FlowRateType();
/*      */   }
/*      */ 
/*      */   public PressureDimension createPressureDimension()
/*      */   {
/* 1419 */     return new PressureDimension();
/*      */   }
/*      */ 
/*      */   public SoundLevelType createSoundLevelType()
/*      */   {
/* 1427 */     return new SoundLevelType();
/*      */   }
/*      */ 
/*      */   public TemperatureRangeType createTemperatureRangeType()
/*      */   {
/* 1435 */     return new TemperatureRangeType();
/*      */   }
/*      */ 
/*      */   public ThicknessType createThicknessType()
/*      */   {
/* 1443 */     return new ThicknessType();
/*      */   }
/*      */ 
/*      */   public WaterConsumptionType createWaterConsumptionType()
/*      */   {
/* 1451 */     return new WaterConsumptionType();
/*      */   }
/*      */ 
/*      */   public TwoWayRadio createTwoWayRadio()
/*      */   {
/* 1459 */     return new TwoWayRadio();
/*      */   }
/*      */ 
/*      */   public ComputerSpeaker createComputerSpeaker()
/*      */   {
/* 1467 */     return new ComputerSpeaker();
/*      */   }
/*      */ 
/*      */   public LengthIntegerDimension createLengthIntegerDimension()
/*      */   {
/* 1475 */     return new LengthIntegerDimension();
/*      */   }
/*      */ 
/*      */   public Home.VariationData createHomeVariationData()
/*      */   {
/* 1483 */     return new Home.VariationData();
/*      */   }
/*      */ 
/*      */   public VolumeIntegerDimension createVolumeIntegerDimension()
/*      */   {
/* 1491 */     return new VolumeIntegerDimension();
/*      */   }
/*      */ 
/*      */   public MemorySizeDimension createMemorySizeDimension()
/*      */   {
/* 1499 */     return new MemorySizeDimension();
/*      */   }
/*      */ 
/*      */   public RemoteControl createRemoteControl()
/*      */   {
/* 1507 */     return new RemoteControl();
/*      */   }
/*      */ 
/*      */   public AVFurniture createAVFurniture()
/*      */   {
/* 1515 */     return new AVFurniture();
/*      */   }
/*      */ 
/*      */   public FrequencyFiveDigitIntegerDimension createFrequencyFiveDigitIntegerDimension()
/*      */   {
/* 1523 */     return new FrequencyFiveDigitIntegerDimension();
/*      */   }
/*      */ 
/*      */   public Phone createPhone()
/*      */   {
/* 1531 */     return new Phone();
/*      */   }
/*      */ 
/*      */   public KindleEReaderAccessories.VariationData createKindleEReaderAccessoriesVariationData()
/*      */   {
/* 1539 */     return new KindleEReaderAccessories.VariationData();
/*      */   }
/*      */ 
/*      */   public VoltageDecimalDimension createVoltageDecimalDimension()
/*      */   {
/* 1547 */     return new VoltageDecimalDimension();
/*      */   }
/*      */ 
/*      */   public SoundCard createSoundCard()
/*      */   {
/* 1555 */     return new SoundCard();
/*      */   }
/*      */ 
/*      */   public FrequencyThreeDigitIntegerDimension createFrequencyThreeDigitIntegerDimension()
/*      */   {
/* 1563 */     return new FrequencyThreeDigitIntegerDimension();
/*      */   }
/*      */ 
/*      */   public InkOrToner createInkOrToner()
/*      */   {
/* 1571 */     return new InkOrToner();
/*      */   }
/*      */ 
/*      */   public AmazonOnly createAmazonOnly()
/*      */   {
/* 1579 */     return new AmazonOnly();
/*      */   }
/*      */ 
/*      */   public GraphicsCard createGraphicsCard()
/*      */   {
/* 1587 */     return new GraphicsCard();
/*      */   }
/*      */ 
/*      */   public Keyboards createKeyboards()
/*      */   {
/* 1595 */     return new Keyboards();
/*      */   }
/*      */ 
/*      */   public StandardProductID createStandardProductID()
/*      */   {
/* 1603 */     return new StandardProductID();
/*      */   }
/*      */ 
/*      */   public MiscAudioComponents createMiscAudioComponents()
/*      */   {
/* 1611 */     return new MiscAudioComponents();
/*      */   }
/*      */ 
/*      */   public RebateType createRebateType()
/*      */   {
/* 1619 */     return new RebateType();
/*      */   }
/*      */ 
/*      */   public CE.ProductType createCEProductType()
/*      */   {
/* 1627 */     return new CE.ProductType();
/*      */   }
/*      */ 
/*      */   public CE.DataTransferRate createCEDataTransferRate()
/*      */   {
/* 1635 */     return new CE.DataTransferRate();
/*      */   }
/*      */ 
/*      */   public ResistanceDimension createResistanceDimension()
/*      */   {
/* 1643 */     return new ResistanceDimension();
/*      */   }
/*      */ 
/*      */   public Connection createConnection()
/*      */   {
/* 1651 */     return new Connection();
/*      */   }
/*      */ 
/*      */   public CE.PortedBoxVolume createCEPortedBoxVolume()
/*      */   {
/* 1659 */     return new CE.PortedBoxVolume();
/*      */   }
/*      */ 
/*      */   public VoltageIntegerDimension createVoltageIntegerDimension()
/*      */   {
/* 1667 */     return new VoltageIntegerDimension();
/*      */   }
/*      */ 
/*      */   public CE.SealedBoxVolume createCESealedBoxVolume()
/*      */   {
/* 1675 */     return new CE.SealedBoxVolume();
/*      */   }
/*      */ 
/*      */   public ComputerComponent.ComponentMemoryStorageCapacity createComputerComponentComponentMemoryStorageCapacity()
/*      */   {
/* 1683 */     return new ComputerComponent.ComponentMemoryStorageCapacity();
/*      */   }
/*      */ 
/*      */   public Speakers createSpeakers()
/*      */   {
/* 1691 */     return new Speakers();
/*      */   }
/*      */ 
/*      */   public Kitchen.VariationData createKitchenVariationData()
/*      */   {
/* 1699 */     return new Kitchen.VariationData();
/*      */   }
/*      */ 
/*      */   public NoiseLevelDimension createNoiseLevelDimension()
/*      */   {
/* 1707 */     return new NoiseLevelDimension();
/*      */   }
/*      */ 
/*      */   public VolumeAndVolumeRateDimension createVolumeAndVolumeRateDimension()
/*      */   {
/* 1715 */     return new VolumeAndVolumeRateDimension();
/*      */   }
/*      */ 
/*      */   public OrganizersAndStorage.VariationData createOrganizersAndStorageVariationData()
/*      */   {
/* 1723 */     return new OrganizersAndStorage.VariationData();
/*      */   }
/*      */ 
/*      */   public VideoProjector createVideoProjector()
/*      */   {
/* 1731 */     return new VideoProjector();
/*      */   }
/*      */ 
/*      */   public BurnTimeSixDigitDimension createBurnTimeSixDigitDimension()
/*      */   {
/* 1739 */     return new BurnTimeSixDigitDimension();
/*      */   }
/*      */ 
/*      */   public LuminanceFiveDigitDimension createLuminanceFiveDigitDimension()
/*      */   {
/* 1747 */     return new LuminanceFiveDigitDimension();
/*      */   }
/*      */ 
/*      */   public VoltageFiveDigitIntegerDimension createVoltageFiveDigitIntegerDimension()
/*      */   {
/* 1755 */     return new VoltageFiveDigitIntegerDimension();
/*      */   }
/*      */ 
/*      */   public AmazonVendorOnly createAmazonVendorOnly()
/*      */   {
/* 1763 */     return new AmazonVendorOnly();
/*      */   }
/*      */ 
/*      */   public CurrencyAmount createCurrencyAmount()
/*      */   {
/* 1771 */     return new CurrencyAmount();
/*      */   }
/*      */ 
/*      */   public CameraOtherAccessories createCameraOtherAccessories()
/*      */   {
/* 1779 */     return new CameraOtherAccessories();
/*      */   }
/*      */ 
/*      */   public EnergyRatingType createEnergyRatingType()
/*      */   {
/* 1787 */     return new EnergyRatingType();
/*      */   }
/*      */ 
/*      */   public Antenna createAntenna()
/*      */   {
/* 1795 */     return new Antenna();
/*      */   }
/*      */ 
/*      */   public GPSOrNavigationSystem createGPSOrNavigationSystem()
/*      */   {
/* 1803 */     return new GPSOrNavigationSystem();
/*      */   }
/*      */ 
/*      */   public TVCombos createTVCombos()
/*      */   {
/* 1811 */     return new TVCombos();
/*      */   }
/*      */ 
/*      */   public CarElectronics createCarElectronics()
/*      */   {
/* 1819 */     return new CarElectronics();
/*      */   }
/*      */ 
/*      */   public HandheldOrPDA createHandheldOrPDA()
/*      */   {
/* 1827 */     return new HandheldOrPDA();
/*      */   }
/*      */ 
/*      */   public Electrical.VariationData createElectricalVariationData()
/*      */   {
/* 1835 */     return new Electrical.VariationData();
/*      */   }
/*      */ 
/*      */   public Lighting.ProductType createLightingProductType()
/*      */   {
/* 1843 */     return new Lighting.ProductType();
/*      */   }
/*      */ 
/*      */   public CurencyDimension createCurencyDimension()
/*      */   {
/* 1851 */     return new CurencyDimension();
/*      */   }
/*      */ 
/*      */   public VideoCard createVideoCard()
/*      */   {
/* 1859 */     return new VideoCard();
/*      */   }
/*      */ 
/*      */   public ReceiverOrAmplifier createReceiverOrAmplifier()
/*      */   {
/* 1867 */     return new ReceiverOrAmplifier();
/*      */   }
/*      */ 
/*      */   public KindleAccessories.VariationData createKindleAccessoriesVariationData()
/*      */   {
/* 1875 */     return new KindleAccessories.VariationData();
/*      */   }
/*      */ 
/*      */   public PersonalComputer.GraphicsCard createPersonalComputerGraphicsCard()
/*      */   {
/* 1883 */     return new PersonalComputer.GraphicsCard();
/*      */   }
/*      */ 
/*      */   public MemoryReader createMemoryReader()
/*      */   {
/* 1891 */     return new MemoryReader();
/*      */   }
/*      */ 
/*      */   public DataTransferSpeedIntegerDimension createDataTransferSpeedIntegerDimension()
/*      */   {
/* 1899 */     return new DataTransferSpeedIntegerDimension();
/*      */   }
/*      */ 
/*      */   public CEVideoProjector createCEVideoProjector()
/*      */   {
/* 1907 */     return new CEVideoProjector();
/*      */   }
/*      */ 
/*      */   public TabletResolutionDimension createTabletResolutionDimension()
/*      */   {
/* 1915 */     return new TabletResolutionDimension();
/*      */   }
/*      */ 
/*      */   public RearFacingWeight createRearFacingWeight()
/*      */   {
/* 1923 */     return new RearFacingWeight();
/*      */   }
/*      */ 
/*      */   public CarryingCaseOrBag createCarryingCaseOrBag()
/*      */   {
/* 1931 */     return new CarryingCaseOrBag();
/*      */   }
/*      */ 
/*      */   public VCR createVCR()
/*      */   {
/* 1939 */     return new VCR();
/*      */   }
/*      */ 
/*      */   public AddressType createAddressType()
/*      */   {
/* 1947 */     return new AddressType();
/*      */   }
/*      */ 
/*      */   public CameraPowerSupply createCameraPowerSupply()
/*      */   {
/* 1955 */     return new CameraPowerSupply();
/*      */   }
/*      */ 
/*      */   public PC createPC()
/*      */   {
/* 1963 */     return new PC();
/*      */   }
/*      */ 
/*      */   public FlashMemory createFlashMemory()
/*      */   {
/* 1971 */     return new FlashMemory();
/*      */   }
/*      */ 
/*      */   public Webcam createWebcam()
/*      */   {
/* 1979 */     return new Webcam();
/*      */   }
/*      */ 
/*      */   public VideoGames createVideoGames()
/*      */   {
/* 1987 */     return new VideoGames();
/*      */   }
/*      */ 
/*      */   public RelatedProductID createRelatedProductID()
/*      */   {
/* 1995 */     return new RelatedProductID();
/*      */   }
/*      */ 
/*      */   public ConditionInfo createConditionInfo()
/*      */   {
/* 2003 */     return new ConditionInfo();
/*      */   }
/*      */ 
/*      */   public Product.DescriptionData createProductDescriptionData()
/*      */   {
/* 2011 */     return new Product.DescriptionData();
/*      */   }
/*      */ 
/*      */   public Product.PromoTag createProductPromoTag()
/*      */   {
/* 2019 */     return new Product.PromoTag();
/*      */   }
/*      */ 
/*      */   public Product.DiscoveryData createProductDiscoveryData()
/*      */   {
/* 2027 */     return new Product.DiscoveryData();
/*      */   }
/*      */ 
/*      */   public Product.ProductData createProductProductData()
/*      */   {
/* 2035 */     return new Product.ProductData();
/*      */   }
/*      */ 
/*      */   public ComputerAddOn createComputerAddOn()
/*      */   {
/* 2043 */     return new ComputerAddOn();
/*      */   }
/*      */ 
/*      */   public CurrentFiveDigitDimension createCurrentFiveDigitDimension()
/*      */   {
/* 2051 */     return new CurrentFiveDigitDimension();
/*      */   }
/*      */ 
/*      */   public DataTransferSpeedDimension createDataTransferSpeedDimension()
/*      */   {
/* 2059 */     return new DataTransferSpeedDimension();
/*      */   }
/*      */ 
/*      */   public RamMemory createRamMemory()
/*      */   {
/* 2067 */     return new RamMemory();
/*      */   }
/*      */ 
/*      */   public MemorySizeFiveDigitIntegerDimension createMemorySizeFiveDigitIntegerDimension()
/*      */   {
/* 2075 */     return new MemorySizeFiveDigitIntegerDimension();
/*      */   }
/*      */ 
/*      */   public Scanner createScanner()
/*      */   {
/* 2083 */     return new Scanner();
/*      */   }
/*      */ 
/*      */   public MajorHomeAppliances.VariationData createMajorHomeAppliancesVariationData()
/*      */   {
/* 2091 */     return new MajorHomeAppliances.VariationData();
/*      */   }
/*      */ 
/*      */   public Motherboard createMotherboard()
/*      */   {
/* 2099 */     return new Motherboard();
/*      */   }
/*      */ 
/*      */   public TabletComputer.GraphicsCard createTabletComputerGraphicsCard()
/*      */   {
/* 2107 */     return new TabletComputer.GraphicsCard();
/*      */   }
/*      */ 
/*      */   public FurnitureAndDecor.VariationData createFurnitureAndDecorVariationData()
/*      */   {
/* 2115 */     return new FurnitureAndDecor.VariationData();
/*      */   }
/*      */ 
/*      */   public RadioOrClockRadio createRadioOrClockRadio()
/*      */   {
/* 2123 */     return new RadioOrClockRadio();
/*      */   }
/*      */ 
/*      */   public SystemPowerDevice createSystemPowerDevice()
/*      */   {
/* 2131 */     return new SystemPowerDevice();
/*      */   }
/*      */ 
/*      */   public PowerSixDigitDimension createPowerSixDigitDimension()
/*      */   {
/* 2139 */     return new PowerSixDigitDimension();
/*      */   }
/*      */ 
/*      */   public ShoulderHarnessHeight createShoulderHarnessHeight()
/*      */   {
/* 2147 */     return new ShoulderHarnessHeight();
/*      */   }
/*      */ 
/*      */   public PDA createPDA()
/*      */   {
/* 2155 */     return new PDA();
/*      */   }
/*      */ 
/*      */   public SecurityElectronics.VariationData createSecurityElectronicsVariationData()
/*      */   {
/* 2163 */     return new SecurityElectronics.VariationData();
/*      */   }
/*      */ 
/*      */   public PowerSuppliesOrProtection createPowerSuppliesOrProtection()
/*      */   {
/* 2171 */     return new PowerSuppliesOrProtection();
/*      */   }
/*      */ 
/*      */   public NetworkingDevice createNetworkingDevice()
/*      */   {
/* 2179 */     return new NetworkingDevice();
/*      */   }
/*      */ 
/*      */   public HomeTheaterSystemOrHTIB createHomeTheaterSystemOrHTIB()
/*      */   {
/* 2187 */     return new HomeTheaterSystemOrHTIB();
/*      */   }
/*      */ 
/*      */   public Computer createComputer()
/*      */   {
/* 2195 */     return new Computer();
/*      */   }
/*      */ 
/*      */   public TabletDataRateDimension createTabletDataRateDimension()
/*      */   {
/* 2203 */     return new TabletDataRateDimension();
/*      */   }
/*      */ 
/*      */   public MemorySizeTenDigitIntegerDimension createMemorySizeTenDigitIntegerDimension()
/*      */   {
/* 2211 */     return new MemorySizeTenDigitIntegerDimension();
/*      */   }
/*      */ 
/*      */   public ConsumerElectronics.VariationData createConsumerElectronicsVariationData()
/*      */   {
/* 2219 */     return new ConsumerElectronics.VariationData();
/*      */   }
/*      */ 
/*      */   public ContinuousShootingDimension createContinuousShootingDimension()
/*      */   {
/* 2227 */     return new ContinuousShootingDimension();
/*      */   }
/*      */ 
/*      */   public ApertureDimension createApertureDimension()
/*      */   {
/* 2235 */     return new ApertureDimension();
/*      */   }
/*      */ 
/*      */   public CEBlankMedia createCEBlankMedia()
/*      */   {
/* 2243 */     return new CEBlankMedia();
/*      */   }
/*      */ 
/*      */   public KindleFireAccessories.VariationData createKindleFireAccessoriesVariationData()
/*      */   {
/* 2251 */     return new KindleFireAccessories.VariationData();
/*      */   }
/*      */ 
/*      */   public WirelessDownloads createWirelessDownloads()
/*      */   {
/* 2259 */     return new WirelessDownloads();
/*      */   }
/*      */ 
/*      */   public MediaPlayer createMediaPlayer()
/*      */   {
/* 2267 */     return new MediaPlayer();
/*      */   }
/*      */ 
/*      */   public MediaStorage createMediaStorage()
/*      */   {
/* 2275 */     return new MediaStorage();
/*      */   }
/*      */ 
/*      */   public Wireless.ProductType createWirelessProductType()
/*      */   {
/* 2283 */     return new Wireless.ProductType();
/*      */   }
/*      */ 
/*      */   public PhoneAccessory createPhoneAccessory()
/*      */   {
/* 2291 */     return new PhoneAccessory();
/*      */   }
/*      */ 
/*      */   public PhotographicStudioItems createPhotographicStudioItems()
/*      */   {
/* 2299 */     return new PhotographicStudioItems();
/*      */   }
/*      */ 
/*      */   public MemorySizeFiveDigitDimension createMemorySizeFiveDigitDimension()
/*      */   {
/* 2307 */     return new MemorySizeFiveDigitDimension();
/*      */   }
/*      */ 
/*      */   public DVDPlayerOrRecorder createDVDPlayerOrRecorder()
/*      */   {
/* 2315 */     return new DVDPlayerOrRecorder();
/*      */   }
/*      */ 
/*      */   public ComputerInputDevice createComputerInputDevice()
/*      */   {
/* 2323 */     return new ComputerInputDevice();
/*      */   }
/*      */ 
/*      */   public VideoGamesHardware createVideoGamesHardware()
/*      */   {
/* 2331 */     return new VideoGamesHardware();
/*      */   }
/*      */ 
/*      */   public SeedsAndPlants.VariationData createSeedsAndPlantsVariationData()
/*      */   {
/* 2339 */     return new SeedsAndPlants.VariationData();
/*      */   }
/*      */ 
/*      */   public SeedsAndPlants.UnitCount createSeedsAndPlantsUnitCount()
/*      */   {
/* 2347 */     return new SeedsAndPlants.UnitCount();
/*      */   }
/*      */ 
/*      */   public Sports.VariationData createSportsVariationData()
/*      */   {
/* 2355 */     return new Sports.VariationData();
/*      */   }
/*      */ 
/*      */   public AssemblyTimeDimension createAssemblyTimeDimension()
/*      */   {
/* 2363 */     return new AssemblyTimeDimension();
/*      */   }
/*      */ 
/*      */   public OptionalEnergyOutputDimension createOptionalEnergyOutputDimension()
/*      */   {
/* 2371 */     return new OptionalEnergyOutputDimension();
/*      */   }
/*      */ 
/*      */   public BurnTimeDimension createBurnTimeDimension()
/*      */   {
/* 2379 */     return new BurnTimeDimension();
/*      */   }
/*      */ 
/*      */   public AreaDimension createAreaDimension()
/*      */   {
/* 2387 */     return new AreaDimension();
/*      */   }
/*      */ 
/*      */   public Sports.EngineDisplacement createSportsEngineDisplacement()
/*      */   {
/* 2395 */     return new Sports.EngineDisplacement();
/*      */   }
/*      */ 
/*      */   public OptionalLengthIntegerDimension createOptionalLengthIntegerDimension()
/*      */   {
/* 2403 */     return new OptionalLengthIntegerDimension();
/*      */   }
/*      */ 
/*      */   public OptionalLuminiousIntensityDimension createOptionalLuminiousIntensityDimension()
/*      */   {
/* 2411 */     return new OptionalLuminiousIntensityDimension();
/*      */   }
/*      */ 
/*      */   public OptionalEnergyConsumptionDimension createOptionalEnergyConsumptionDimension()
/*      */   {
/* 2419 */     return new OptionalEnergyConsumptionDimension();
/*      */   }
/*      */ 
/*      */   public OptionalVoltageDecimalDimension createOptionalVoltageDecimalDimension()
/*      */   {
/* 2427 */     return new OptionalVoltageDecimalDimension();
/*      */   }
/*      */ 
/*      */   public OptionalWeightDimension createOptionalWeightDimension()
/*      */   {
/* 2435 */     return new OptionalWeightDimension();
/*      */   }
/*      */ 
/*      */   public BootSizeDimension createBootSizeDimension()
/*      */   {
/* 2443 */     return new BootSizeDimension();
/*      */   }
/*      */ 
/*      */   public Sports.MaximumPitchSpeed createSportsMaximumPitchSpeed()
/*      */   {
/* 2451 */     return new Sports.MaximumPitchSpeed();
/*      */   }
/*      */ 
/*      */   public OptionalMotorSizeDimension createOptionalMotorSizeDimension()
/*      */   {
/* 2459 */     return new OptionalMotorSizeDimension();
/*      */   }
/*      */ 
/*      */   public OptionalResolutionDimension createOptionalResolutionDimension()
/*      */   {
/* 2467 */     return new OptionalResolutionDimension();
/*      */   }
/*      */ 
/*      */   public StringLengthOptionalDimension createStringLengthOptionalDimension()
/*      */   {
/* 2475 */     return new StringLengthOptionalDimension();
/*      */   }
/*      */ 
/*      */   public OptionalResistanceDimension createOptionalResistanceDimension()
/*      */   {
/* 2483 */     return new OptionalResistanceDimension();
/*      */   }
/*      */ 
/*      */   public OptionalRValueDimension createOptionalRValueDimension()
/*      */   {
/* 2491 */     return new OptionalRValueDimension();
/*      */   }
/*      */ 
/*      */   public OptionalVolumeDimension createOptionalVolumeDimension()
/*      */   {
/* 2499 */     return new OptionalVolumeDimension();
/*      */   }
/*      */ 
/*      */   public OutputPowerDimension createOutputPowerDimension()
/*      */   {
/* 2507 */     return new OutputPowerDimension();
/*      */   }
/*      */ 
/*      */   public OpticalPowerDimension createOpticalPowerDimension()
/*      */   {
/* 2515 */     return new OpticalPowerDimension();
/*      */   }
/*      */ 
/*      */   public ColorSpecification createColorSpecification()
/*      */   {
/* 2523 */     return new ColorSpecification();
/*      */   }
/*      */ 
/*      */   public DigitalPictureFrame createDigitalPictureFrame()
/*      */   {
/* 2531 */     return new DigitalPictureFrame();
/*      */   }
/*      */ 
/*      */   public ComputerPlatform createComputerPlatform()
/*      */   {
/* 2539 */     return new ComputerPlatform();
/*      */   }
/*      */ 
/*      */   public HomeImprovement.ProductType createHomeImprovementProductType()
/*      */   {
/* 2547 */     return new HomeImprovement.ProductType();
/*      */   }
/*      */ 
/*      */   public CEBinocular createCEBinocular()
/*      */   {
/* 2555 */     return new CEBinocular();
/*      */   }
/*      */ 
/*      */   public Tools createTools()
/*      */   {
/* 2563 */     return new Tools();
/*      */   }
/*      */ 
/*      */   public SoftwareGames createSoftwareGames()
/*      */   {
/* 2571 */     return new SoftwareGames();
/*      */   }
/*      */ 
/*      */   public CharacterDataType createCharacterDataType()
/*      */   {
/* 2579 */     return new CharacterDataType();
/*      */   }
/*      */ 
/*      */   public HeightRecommendation createHeightRecommendation()
/*      */   {
/* 2587 */     return new HeightRecommendation();
/*      */   }
/*      */ 
/*      */   public PortableAudio createPortableAudio()
/*      */   {
/* 2595 */     return new PortableAudio();
/*      */   }
/*      */ 
/*      */   public AudioVideoAccessory createAudioVideoAccessory()
/*      */   {
/* 2603 */     return new AudioVideoAccessory();
/*      */   }
/*      */ 
/*      */   public LightsAndFixtures.VariationData createLightsAndFixturesVariationData()
/*      */   {
/* 2611 */     return new LightsAndFixtures.VariationData();
/*      */   }
/*      */ 
/*      */   public Computers.ProductType createComputersProductType()
/*      */   {
/* 2619 */     return new Computers.ProductType();
/*      */   }
/*      */ 
/*      */   public Headphones createHeadphones()
/*      */   {
/* 2627 */     return new Headphones();
/*      */   }
/*      */ 
/*      */   public Printer createPrinter()
/*      */   {
/* 2635 */     return new Printer();
/*      */   }
/*      */ 
/*      */   public CEDigitalCamera createCEDigitalCamera()
/*      */   {
/* 2643 */     return new CEDigitalCamera();
/*      */   }
/*      */ 
/*      */   public ComputerDriveOrStorage createComputerDriveOrStorage()
/*      */   {
/* 2651 */     return new ComputerDriveOrStorage();
/*      */   }
/*      */ 
/*      */   public CableOrAdapter createCableOrAdapter()
/*      */   {
/* 2659 */     return new CableOrAdapter();
/*      */   }
/*      */ 
/*      */   public CEBattery createCEBattery()
/*      */   {
/* 2667 */     return new CEBattery();
/*      */   }
/*      */ 
/*      */   public StereoShelfSystem createStereoShelfSystem()
/*      */   {
/* 2675 */     return new StereoShelfSystem();
/*      */   }
/*      */ 
/*      */   public BarCodeReader createBarCodeReader()
/*      */   {
/* 2683 */     return new BarCodeReader();
/*      */   }
/*      */ 
/*      */   public VideoGamesAccessories createVideoGamesAccessories()
/*      */   {
/* 2691 */     return new VideoGamesAccessories();
/*      */   }
/*      */ 
/*      */   public VideoProjectorsAndAccessories createVideoProjectorsAndAccessories()
/*      */   {
/* 2699 */     return new VideoProjectorsAndAccessories();
/*      */   }
/*      */ 
/*      */   public Monitor createMonitor()
/*      */   {
/* 2707 */     return new Monitor();
/*      */   }
/*      */ 
/*      */   public CarAlarm createCarAlarm()
/*      */   {
/* 2715 */     return new CarAlarm();
/*      */   }
/*      */ 
/*      */   public CEFilmCamera createCEFilmCamera()
/*      */   {
/* 2723 */     return new CEFilmCamera();
/*      */   }
/*      */ 
/*      */   public LightingAccessories createLightingAccessories()
/*      */   {
/* 2731 */     return new LightingAccessories();
/*      */   }
/*      */ 
/*      */   public CameraBagsAndCases createCameraBagsAndCases()
/*      */   {
/* 2739 */     return new CameraBagsAndCases();
/*      */   }
/*      */ 
/*      */   public AgeRecommendation createAgeRecommendation()
/*      */   {
/* 2747 */     return new AgeRecommendation();
/*      */   }
/*      */ 
/*      */   public MinimumAgeRecommendedDimension createMinimumAgeRecommendedDimension()
/*      */   {
/* 2755 */     return new MinimumAgeRecommendedDimension();
/*      */   }
/*      */ 
/*      */   public AgeRecommendedDimension createAgeRecommendedDimension()
/*      */   {
/* 2763 */     return new AgeRecommendedDimension();
/*      */   }
/*      */ 
/*      */   public OutdoorLiving.VariationData createOutdoorLivingVariationData()
/*      */   {
/* 2771 */     return new OutdoorLiving.VariationData();
/*      */   }
/*      */ 
/*      */   public OutdoorLiving.UnitCount createOutdoorLivingUnitCount()
/*      */   {
/* 2779 */     return new OutdoorLiving.UnitCount();
/*      */   }
/*      */ 
/*      */   public HandheldSoftwareDownloads createHandheldSoftwareDownloads()
/*      */   {
/* 2787 */     return new HandheldSoftwareDownloads();
/*      */   }
/*      */ 
/*      */   public DownloadableFile createDownloadableFile()
/*      */   {
/* 2795 */     return new DownloadableFile();
/*      */   }
/*      */ 
/*      */   public CECamcorder createCECamcorder()
/*      */   {
/* 2803 */     return new CECamcorder();
/*      */   }
/*      */ 
/*      */   public MediaPlayerOrEReaderAccessory createMediaPlayerOrEReaderAccessory()
/*      */   {
/* 2811 */     return new MediaPlayerOrEReaderAccessory();
/*      */   }
/*      */ 
/*      */   public CETelescope createCETelescope()
/*      */   {
/* 2819 */     return new CETelescope();
/*      */   }
/*      */ 
/*      */   public SoftwareVideoGames.ProductType createSoftwareVideoGamesProductType()
/*      */   {
/* 2827 */     return new SoftwareVideoGames.ProductType();
/*      */   }
/*      */ 
/*      */   public NotebookComputer.GraphicsCard createNotebookComputerGraphicsCard()
/*      */   {
/* 2835 */     return new NotebookComputer.GraphicsCard();
/*      */   }
/*      */ 
/*      */   public WeightRecommendation createWeightRecommendation()
/*      */   {
/* 2843 */     return new WeightRecommendation();
/*      */   }
/*      */ 
/*      */   public WeightIntegerDimension createWeightIntegerDimension()
/*      */   {
/* 2851 */     return new WeightIntegerDimension();
/*      */   }
/*      */ 
/*      */   public PlumbingFixtures.VariationData createPlumbingFixturesVariationData()
/*      */   {
/* 2859 */     return new PlumbingFixtures.VariationData();
/*      */   }
/*      */ 
/*      */   public Television createTelevision()
/*      */   {
/* 2867 */     return new Television();
/*      */   }
/*      */ 
/*      */   public Tuner createTuner()
/*      */   {
/* 2875 */     return new Tuner();
/*      */   }
/*      */ 
/*      */   public DigitalVideoRecorder createDigitalVideoRecorder()
/*      */   {
/* 2883 */     return new DigitalVideoRecorder();
/*      */   }
/*      */ 
/*      */   public Recall createRecall()
/*      */   {
/* 2891 */     return new Recall();
/*      */   }
/*      */ 
/*      */   public SystemCabinet createSystemCabinet()
/*      */   {
/* 2899 */     return new SystemCabinet();
/*      */   }
/*      */ 
/*      */   public LoyaltyCustomAttribute createLoyaltyCustomAttribute()
/*      */   {
/* 2907 */     return new LoyaltyCustomAttribute();
/*      */   }
/*      */ 
/*      */   public DensityDimension createDensityDimension()
/*      */   {
/* 2915 */     return new DensityDimension();
/*      */   }
/*      */ 
/*      */   public CapacityUnit createCapacityUnit()
/*      */   {
/* 2923 */     return new CapacityUnit();
/*      */   }
/*      */ 
/*      */   public CycleLengthDimension createCycleLengthDimension()
/*      */   {
/* 2931 */     return new CycleLengthDimension();
/*      */   }
/*      */ 
/*      */   public HardnessDimension createHardnessDimension()
/*      */   {
/* 2939 */     return new HardnessDimension();
/*      */   }
/*      */ 
/*      */   public AlcoholContentDimension createAlcoholContentDimension()
/*      */   {
/* 2947 */     return new AlcoholContentDimension();
/*      */   }
/*      */ 
/*      */   public Dimensions createDimensions()
/*      */   {
/* 2955 */     return new Dimensions();
/*      */   }
/*      */ 
/*      */   public SunProtectionDimension createSunProtectionDimension()
/*      */   {
/* 2963 */     return new SunProtectionDimension();
/*      */   }
/*      */ 
/*      */   public ClothingSizeDimension createClothingSizeDimension()
/*      */   {
/* 2971 */     return new ClothingSizeDimension();
/*      */   }
/*      */ 
/*      */   public JewelryWeightDimension createJewelryWeightDimension()
/*      */   {
/* 2979 */     return new JewelryWeightDimension();
/*      */   }
/*      */ 
/*      */   public OptionalMagnificationDimension createOptionalMagnificationDimension()
/*      */   {
/* 2987 */     return new OptionalMagnificationDimension();
/*      */   }
/*      */ 
/*      */   public PhoneNumberType createPhoneNumberType()
/*      */   {
/* 2995 */     return new PhoneNumberType();
/*      */   }
/*      */ 
/*      */   public SpatialDimensions createSpatialDimensions()
/*      */   {
/* 3003 */     return new SpatialDimensions();
/*      */   }
/*      */ 
/*      */   public StringTimeDimension createStringTimeDimension()
/*      */   {
/* 3011 */     return new StringTimeDimension();
/*      */   }
/*      */ 
/*      */   public CustomizationInfoType createCustomizationInfoType()
/*      */   {
/* 3019 */     return new CustomizationInfoType();
/*      */   }
/*      */ 
/*      */   public BatteryLifeDimension createBatteryLifeDimension()
/*      */   {
/* 3027 */     return new BatteryLifeDimension();
/*      */   }
/*      */ 
/*      */   public JewelryLengthDimension createJewelryLengthDimension()
/*      */   {
/* 3035 */     return new JewelryLengthDimension();
/*      */   }
/*      */ 
/*      */   public Customer createCustomer()
/*      */   {
/* 3043 */     return new Customer();
/*      */   }
/*      */ 
/*      */   public PositiveWeightDimension createPositiveWeightDimension()
/*      */   {
/* 3051 */     return new PositiveWeightDimension();
/*      */   }
/*      */ 
/*      */   public LuminancePositiveIntegerDimension createLuminancePositiveIntegerDimension()
/*      */   {
/* 3059 */     return new LuminancePositiveIntegerDimension();
/*      */   }
/*      */ 
/*      */   public NameValuePair createNameValuePair()
/*      */   {
/* 3067 */     return new NameValuePair();
/*      */   }
/*      */ 
/*      */   public MillimeterDecimalDimension createMillimeterDecimalDimension()
/*      */   {
/* 3075 */     return new MillimeterDecimalDimension();
/*      */   }
/*      */ 
/*      */   public OptionalLineCapacityDimension createOptionalLineCapacityDimension()
/*      */   {
/* 3083 */     return new OptionalLineCapacityDimension();
/*      */   }
/*      */ 
/*      */   public ServingDimension createServingDimension()
/*      */   {
/* 3091 */     return new ServingDimension();
/*      */   }
/*      */ 
/*      */   public DatedPrice createDatedPrice()
/*      */   {
/* 3099 */     return new DatedPrice();
/*      */   }
/*      */ 
/*      */   public SweetnessAtHarvestDimension createSweetnessAtHarvestDimension()
/*      */   {
/* 3107 */     return new SweetnessAtHarvestDimension();
/*      */   }
/*      */ 
/*      */   public DateIntegerDimension createDateIntegerDimension()
/*      */   {
/* 3115 */     return new DateIntegerDimension();
/*      */   }
/*      */ 
/*      */   public StringTemperatureDimension createStringTemperatureDimension()
/*      */   {
/* 3123 */     return new StringTemperatureDimension();
/*      */   }
/*      */ 
/*      */   public MagnificationDimension createMagnificationDimension()
/*      */   {
/* 3131 */     return new MagnificationDimension();
/*      */   }
/*      */ 
/*      */   public CurrentDimension createCurrentDimension()
/*      */   {
/* 3139 */     return new CurrentDimension();
/*      */   }
/*      */ 
/*      */   public SubscriptionTermDimension createSubscriptionTermDimension()
/*      */   {
/* 3147 */     return new SubscriptionTermDimension();
/*      */   }
/*      */ 
/*      */   public WeightRecommendationType createWeightRecommendationType()
/*      */   {
/* 3155 */     return new WeightRecommendationType();
/*      */   }
/*      */ 
/*      */   public DatedCompareAtPrice createDatedCompareAtPrice()
/*      */   {
/* 3163 */     return new DatedCompareAtPrice();
/*      */   }
/*      */ 
/*      */   public AddressTypeSupportNonCity createAddressTypeSupportNonCity()
/*      */   {
/* 3171 */     return new AddressTypeSupportNonCity();
/*      */   }
/*      */ 
/*      */   public PositiveNonZeroWeightDimension createPositiveNonZeroWeightDimension()
/*      */   {
/* 3179 */     return new PositiveNonZeroWeightDimension();
/*      */   }
/*      */ 
/*      */   public GraduationInterval createGraduationInterval()
/*      */   {
/* 3187 */     return new GraduationInterval();
/*      */   }
/*      */ 
/*      */   public NeckSizeDimension createNeckSizeDimension()
/*      */   {
/* 3195 */     return new NeckSizeDimension();
/*      */   }
/*      */ 
/*      */   public ForceDimension createForceDimension()
/*      */   {
/* 3203 */     return new ForceDimension();
/*      */   }
/*      */ 
/*      */   public StringLengthDimension createStringLengthDimension()
/*      */   {
/* 3211 */     return new StringLengthDimension();
/*      */   }
/*      */ 
/*      */   public TemperatureDimension createTemperatureDimension()
/*      */   {
/* 3219 */     return new TemperatureDimension();
/*      */   }
/*      */ 
/*      */   public LuminanceIntegerDimension createLuminanceIntegerDimension()
/*      */   {
/* 3227 */     return new LuminanceIntegerDimension();
/*      */   }
/*      */ 
/*      */   public VineyardYieldDimension createVineyardYieldDimension()
/*      */   {
/* 3235 */     return new VineyardYieldDimension();
/*      */   }
/*      */ 
/*      */   public OptionalSpeedDimension createOptionalSpeedDimension()
/*      */   {
/* 3243 */     return new OptionalSpeedDimension();
/*      */   }
/*      */ 
/*      */   public EmailAddressType createEmailAddressType()
/*      */   {
/* 3251 */     return new EmailAddressType();
/*      */   }
/*      */ 
/*      */   public PositiveCurrencyAmount createPositiveCurrencyAmount()
/*      */   {
/* 3259 */     return new PositiveCurrencyAmount();
/*      */   }
/*      */ 
/*      */   public BuyerPrice.Component createBuyerPriceComponent()
/*      */   {
/* 3267 */     return new BuyerPrice.Component();
/*      */   }
/*      */ 
/*      */   public DirectPaymentType.Component createDirectPaymentTypeComponent()
/*      */   {
/* 3275 */     return new DirectPaymentType.Component();
/*      */   }
/*      */ 
/*      */   public AmazonFees.Fee createAmazonFeesFee()
/*      */   {
/* 3283 */     return new AmazonFees.Fee();
/*      */   }
/*      */ 
/*      */   public HomeImprovementTools.VariationData createHomeImprovementToolsVariationData()
/*      */   {
/* 3291 */     return new HomeImprovementTools.VariationData();
/*      */   }
/*      */ 
/*      */   public PromotionDataType.Component createPromotionDataTypeComponent()
/*      */   {
/* 3299 */     return new PromotionDataType.Component();
/*      */   }
/*      */ 
/*      */   public Home.ProductType.InnerHome.VariationData createHomeProductTypeHomeVariationData()
/*      */   {
/* 3307 */     return new Home.ProductType.InnerHome.VariationData();
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProcessorSpeed")
/*      */   public JAXBElement<FrequencyDimension> createProcessorSpeed(FrequencyDimension value)
/*      */   {
/* 3316 */     return new JAXBElement(_ProcessorSpeed_QNAME, FrequencyDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsRAMType")
/*      */   public JAXBElement<String> createGraphicsRAMType(String value)
/*      */   {
/* 3325 */     return new JAXBElement(_GraphicsRAMType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HDMIPorts")
/*      */   public JAXBElement<BigInteger> createHDMIPorts(BigInteger value)
/*      */   {
/* 3334 */     return new JAXBElement(_HDMIPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CardReader")
/*      */   public JAXBElement<CardReaderTypeValues> createCardReader(CardReaderTypeValues value)
/*      */   {
/* 3343 */     return new JAXBElement(_CardReader_QNAME, CardReaderTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MemoryStorageCapacity")
/*      */   public JAXBElement<MemorySizeIntegerDimension> createMemoryStorageCapacity(MemorySizeIntegerDimension value)
/*      */   {
/* 3352 */     return new JAXBElement(_MemoryStorageCapacity_QNAME, MemorySizeIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MountBoltPattern")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMountBoltPattern(String value)
/*      */   {
/* 3362 */     return new JAXBElement(_MountBoltPattern_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfHardDrives")
/*      */   public JAXBElement<BigInteger> createNumberOfHardDrives(BigInteger value)
/*      */   {
/* 3371 */     return new JAXBElement(_NumberOfHardDrives_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxWeightCapacity")
/*      */   public JAXBElement<WeightDimension> createMaxWeightCapacity(WeightDimension value)
/*      */   {
/* 3380 */     return new JAXBElement(_MaxWeightCapacity_QNAME, WeightDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DisplayTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createDisplayTechnology(String value)
/*      */   {
/* 3390 */     return new JAXBElement(_DisplayTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WirelessCarrier")
/*      */   public JAXBElement<WirelessCarrierTypeValues> createWirelessCarrier(WirelessCarrierTypeValues value)
/*      */   {
/* 3399 */     return new JAXBElement(_WirelessCarrier_QNAME, WirelessCarrierTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CacheSize")
/*      */   public JAXBElement<MemorySizeIntegerDimension> createCacheSize(MemorySizeIntegerDimension value)
/*      */   {
/* 3408 */     return new JAXBElement(_CacheSize_QNAME, MemorySizeIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AmazonOrderItemCode")
/*      */   public JAXBElement<String> createAmazonOrderItemCode(String value)
/*      */   {
/* 3417 */     return new JAXBElement(_AmazonOrderItemCode_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsCardMemoryInterface")
/*      */   public JAXBElement<MemoryInterfaceDimension> createGraphicsCardMemoryInterface(MemoryInterfaceDimension value)
/*      */   {
/* 3426 */     return new JAXBElement(_GraphicsCardMemoryInterface_QNAME, MemoryInterfaceDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="VoltageRating")
/*      */   public JAXBElement<VoltageSevenDigitDecimalDimension> createVoltageRating(VoltageSevenDigitDecimalDimension value)
/*      */   {
/* 3435 */     return new JAXBElement(_VoltageRating_QNAME, VoltageSevenDigitDecimalDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SPDIFOutput")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSPDIFOutput(String value)
/*      */   {
/* 3445 */     return new JAXBElement(_SPDIFOutput_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxWebcamImageResolution")
/*      */   public JAXBElement<ResolutionFiveDigitDimension> createMaxWebcamImageResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 3454 */     return new JAXBElement(_MaxWebcamImageResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="LineIn")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createLineIn(String value)
/*      */   {
/* 3464 */     return new JAXBElement(_LineIn_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TabletSurfaceActiveArea")
/*      */   public JAXBElement<TabletActiveSurfaceAreaDimension> createTabletSurfaceActiveArea(TabletActiveSurfaceAreaDimension value)
/*      */   {
/* 3473 */     return new JAXBElement(_TabletSurfaceActiveArea_QNAME, TabletActiveSurfaceAreaDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TweeterConeMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createTweeterConeMaterialType(String value)
/*      */   {
/* 3483 */     return new JAXBElement(_TweeterConeMaterialType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfUSBHubConnectorPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfUSBHubConnectorPorts(BigInteger value)
/*      */   {
/* 3492 */     return new JAXBElement(_NumberOfUSBHubConnectorPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakerCount")
/*      */   public JAXBElement<BigInteger> createSpeakerCount(BigInteger value)
/*      */   {
/* 3501 */     return new JAXBElement(_SpeakerCount_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WaterResistantLevel")
/*      */   public JAXBElement<WaterResistantType> createWaterResistantLevel(WaterResistantType value)
/*      */   {
/* 3510 */     return new JAXBElement(_WaterResistantLevel_QNAME, WaterResistantType.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OnboardVideo")
/*      */   public JAXBElement<String> createOnboardVideo(String value)
/*      */   {
/* 3519 */     return new JAXBElement(_OnboardVideo_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ShipOption")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createShipOption(String value)
/*      */   {
/* 3529 */     return new JAXBElement(_ShipOption_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HasProgrammableButtons")
/*      */   public JAXBElement<Boolean> createHasProgrammableButtons(Boolean value)
/*      */   {
/* 3538 */     return new JAXBElement(_HasProgrammableButtons_QNAME, Boolean.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPanelFirewire400Ports")
/*      */   public JAXBElement<BigInteger> createTotalFrontPanelFirewire400Ports(BigInteger value)
/*      */   {
/* 3547 */     return new JAXBElement(_TotalFrontPanelFirewire400Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FulfillmentServiceLevel")
/*      */   public JAXBElement<String> createFulfillmentServiceLevel(String value)
/*      */   {
/* 3556 */     return new JAXBElement(_FulfillmentServiceLevel_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HotswapBayType")
/*      */   public JAXBElement<LengthFourDigitDimension> createHotswapBayType(LengthFourDigitDimension value)
/*      */   {
/* 3565 */     return new JAXBElement(_HotswapBayType_QNAME, LengthFourDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SoundCardMinSystemRequirements")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSoundCardMinSystemRequirements(String value)
/*      */   {
/* 3575 */     return new JAXBElement(_SoundCardMinSystemRequirements_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ImageDiagonalSize")
/*      */   public JAXBElement<LengthSevenDigitDimension> createImageDiagonalSize(LengthSevenDigitDimension value)
/*      */   {
/* 3584 */     return new JAXBElement(_ImageDiagonalSize_QNAME, LengthSevenDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Averagelatency")
/*      */   public JAXBElement<BigInteger> createAveragelatency(BigInteger value)
/*      */   {
/* 3593 */     return new JAXBElement(_Averagelatency_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AmplifierType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAmplifierType(String value)
/*      */   {
/* 3603 */     return new JAXBElement(_AmplifierType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfSATAPowerConnectors")
/*      */   public JAXBElement<BigInteger> createNumberOfSATAPowerConnectors(BigInteger value)
/*      */   {
/* 3612 */     return new JAXBElement(_NumberOfSATAPowerConnectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="VideoCallingResolution")
/*      */   public JAXBElement<ResolutionFiveDigitDimension> createVideoCallingResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 3621 */     return new JAXBElement(_VideoCallingResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalEthernetPorts")
/*      */   public JAXBElement<BigInteger> createTotalEthernetPorts(BigInteger value)
/*      */   {
/* 3630 */     return new JAXBElement(_TotalEthernetPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PrivacyScreenSize")
/*      */   public JAXBElement<BigInteger> createPrivacyScreenSize(BigInteger value)
/*      */   {
/* 3639 */     return new JAXBElement(_PrivacyScreenSize_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxDownstreamTransmissionRate")
/*      */   public JAXBElement<DataTransferSpeedFiveDigitIntegerDimension> createMaxDownstreamTransmissionRate(DataTransferSpeedFiveDigitIntegerDimension value)
/*      */   {
/* 3648 */     return new JAXBElement(_MaxDownstreamTransmissionRate_QNAME, DataTransferSpeedFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WriteSpeed")
/*      */   public JAXBElement<DataTransferSpeedTenIntegerDimension> createWriteSpeed(DataTransferSpeedTenIntegerDimension value)
/*      */   {
/* 3657 */     return new JAXBElement(_WriteSpeed_QNAME, DataTransferSpeedTenIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MainPowerConnector")
/*      */   public JAXBElement<String> createMainPowerConnector(String value)
/*      */   {
/* 3666 */     return new JAXBElement(_MainPowerConnector_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakerGrilleMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSpeakerGrilleMaterial(String value)
/*      */   {
/* 3676 */     return new JAXBElement(_SpeakerGrilleMaterial_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPanelAudioOutPorts")
/*      */   public JAXBElement<BigInteger> createTotalFrontPanelAudioOutPorts(BigInteger value)
/*      */   {
/* 3685 */     return new JAXBElement(_TotalFrontPanelAudioOutPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BatteryPower")
/*      */   public JAXBElement<BatteryPowerIntegerDimension> createBatteryPower(BatteryPowerIntegerDimension value)
/*      */   {
/* 3694 */     return new JAXBElement(_BatteryPower_QNAME, BatteryPowerIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PresentationRemoteLaserColor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPresentationRemoteLaserColor(String value)
/*      */   {
/* 3704 */     return new JAXBElement(_PresentationRemoteLaserColor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FanIncluded")
/*      */   public JAXBElement<BigInteger> createFanIncluded(BigInteger value)
/*      */   {
/* 3713 */     return new JAXBElement(_FanIncluded_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RecordingCapacity")
/*      */   public JAXBElement<TimeIntegerDimension> createRecordingCapacity(TimeIntegerDimension value)
/*      */   {
/* 3722 */     return new JAXBElement(_RecordingCapacity_QNAME, TimeIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalNumberOfInternalBays")
/*      */   public JAXBElement<BigInteger> createTotalNumberOfInternalBays(BigInteger value)
/*      */   {
/* 3731 */     return new JAXBElement(_TotalNumberOfInternalBays_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ScreenDimensions")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createScreenDimensions(String value)
/*      */   {
/* 3741 */     return new JAXBElement(_ScreenDimensions_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalNumberOfExternalBays")
/*      */   public JAXBElement<BigInteger> createTotalNumberOfExternalBays(BigInteger value)
/*      */   {
/* 3750 */     return new JAXBElement(_TotalNumberOfExternalBays_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ResponseTime")
/*      */   public JAXBElement<BigInteger> createResponseTime(BigInteger value)
/*      */   {
/* 3759 */     return new JAXBElement(_ResponseTime_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ColorMap")
/*      */   public JAXBElement<String> createColorMap(String value)
/*      */   {
/* 3768 */     return new JAXBElement(_ColorMap_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfEthernetPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfEthernetPorts(BigInteger value)
/*      */   {
/* 3777 */     return new JAXBElement(_NumberOfEthernetPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MediaLayers")
/*      */   public JAXBElement<BigInteger> createMediaLayers(BigInteger value)
/*      */   {
/* 3786 */     return new JAXBElement(_MediaLayers_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalSataConnectors")
/*      */   public JAXBElement<BigInteger> createTotalSataConnectors(BigInteger value)
/*      */   {
/* 3795 */     return new JAXBElement(_TotalSataConnectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfDMIPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfDMIPorts(BigInteger value)
/*      */   {
/* 3804 */     return new JAXBElement(_NumberOfDMIPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FulfillmentCenterID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFulfillmentCenterID(String value)
/*      */   {
/* 3814 */     return new JAXBElement(_FulfillmentCenterID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DigitalAudioCapacity")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createDigitalAudioCapacity(String value)
/*      */   {
/* 3824 */     return new JAXBElement(_DigitalAudioCapacity_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="EffectiveMemoryClock")
/*      */   public JAXBElement<FrequencyIntegerDimension> createEffectiveMemoryClock(FrequencyIntegerDimension value)
/*      */   {
/* 3833 */     return new JAXBElement(_EffectiveMemoryClock_QNAME, FrequencyIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BuiltInMedia")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createBuiltInMedia(String value)
/*      */   {
/* 3843 */     return new JAXBElement(_BuiltInMedia_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OpticalStorageDeviceType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createOpticalStorageDeviceType(String value)
/*      */   {
/* 3853 */     return new JAXBElement(_OpticalStorageDeviceType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PressureLevels")
/*      */   public JAXBElement<PressureLevelSixDigitIntegerDimension> createPressureLevels(PressureLevelSixDigitIntegerDimension value)
/*      */   {
/* 3862 */     return new JAXBElement(_PressureLevels_QNAME, PressureLevelSixDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPanelAudioInPorts")
/*      */   public JAXBElement<BigInteger> createTotalFrontPanelAudioInPorts(BigInteger value)
/*      */   {
/* 3871 */     return new JAXBElement(_TotalFrontPanelAudioInPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AnalogRGBInput")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAnalogRGBInput(String value)
/*      */   {
/* 3881 */     return new JAXBElement(_AnalogRGBInput_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProcessorCoolingDevice")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createProcessorCoolingDevice(String value)
/*      */   {
/* 3891 */     return new JAXBElement(_ProcessorCoolingDevice_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfFireWire800Ports")
/*      */   public JAXBElement<BigInteger> createNumberOfFireWire800Ports(BigInteger value)
/*      */   {
/* 3900 */     return new JAXBElement(_NumberOfFireWire800Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="VideoShielded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createVideoShielded(String value)
/*      */   {
/* 3910 */     return new JAXBElement(_VideoShielded_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HeadphoneStyle")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createHeadphoneStyle(String value)
/*      */   {
/* 3920 */     return new JAXBElement(_HeadphoneStyle_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PrivacyScreenMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPrivacyScreenMaterialType(String value)
/*      */   {
/* 3930 */     return new JAXBElement(_PrivacyScreenMaterialType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BundledSoftware")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createBundledSoftware(String value)
/*      */   {
/* 3940 */     return new JAXBElement(_BundledSoftware_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalSVideoOutPorts")
/*      */   public JAXBElement<BigInteger> createTotalSVideoOutPorts(BigInteger value)
/*      */   {
/* 3949 */     return new JAXBElement(_TotalSVideoOutPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfRadioBandsSupported")
/*      */   public JAXBElement<BigInteger> createNumberOfRadioBandsSupported(BigInteger value)
/*      */   {
/* 3958 */     return new JAXBElement(_NumberOfRadioBandsSupported_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CoolingType")
/*      */   public JAXBElement<String> createCoolingType(String value)
/*      */   {
/* 3967 */     return new JAXBElement(_CoolingType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SoundCardInterface")
/*      */   public JAXBElement<SoundCardInterfaceTypeValues> createSoundCardInterface(SoundCardInterfaceTypeValues value)
/*      */   {
/* 3976 */     return new JAXBElement(_SoundCardInterface_QNAME, SoundCardInterfaceTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsCardCooler")
/*      */   public JAXBElement<String> createGraphicsCardCooler(String value)
/*      */   {
/* 3985 */     return new JAXBElement(_GraphicsCardCooler_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NetworkingProtocol")
/*      */   public JAXBElement<String> createNetworkingProtocol(String value)
/*      */   {
/* 3994 */     return new JAXBElement(_NetworkingProtocol_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TabletInputMethod")
/*      */   public JAXBElement<TabletInputMethodTypeValues> createTabletInputMethod(TabletInputMethodTypeValues value)
/*      */   {
/* 4003 */     return new JAXBElement(_TabletInputMethod_QNAME, TabletInputMethodTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ConnectivityType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createConnectivityType(String value)
/*      */   {
/* 4013 */     return new JAXBElement(_ConnectivityType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="USBPortType")
/*      */   public JAXBElement<BigInteger> createUSBPortType(BigInteger value)
/*      */   {
/* 4022 */     return new JAXBElement(_USBPortType_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Voltage")
/*      */   public JAXBElement<BigDecimal> createVoltage(BigDecimal value)
/*      */   {
/* 4031 */     return new JAXBElement(_Voltage_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OperatingSystem")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createOperatingSystem(String value)
/*      */   {
/* 4041 */     return new JAXBElement(_OperatingSystem_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfUSB3.0Ports")
/*      */   public JAXBElement<BigInteger> createNumberOfUSB30Ports(BigInteger value)
/*      */   {
/* 4050 */     return new JAXBElement(_NumberOfUSB30Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HardwarePlatform")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createHardwarePlatform(String value)
/*      */   {
/* 4060 */     return new JAXBElement(_HardwarePlatform_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CableLength")
/*      */   public JAXBElement<LengthSevenDigitDimension> createCableLength(LengthSevenDigitDimension value)
/*      */   {
/* 4069 */     return new JAXBElement(_CableLength_QNAME, LengthSevenDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FanPowerConnector")
/*      */   public JAXBElement<String> createFanPowerConnector(String value)
/*      */   {
/* 4078 */     return new JAXBElement(_FanPowerConnector_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RAMClockSpeed")
/*      */   public JAXBElement<BigInteger> createRAMClockSpeed(BigInteger value)
/*      */   {
/* 4087 */     return new JAXBElement(_RAMClockSpeed_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TweeterSpeakerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createTweeterSpeakerTechnology(String value)
/*      */   {
/* 4097 */     return new JAXBElement(_TweeterSpeakerTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ShipmentID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createShipmentID(String value)
/*      */   {
/* 4107 */     return new JAXBElement(_ShipmentID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ExternalBayType")
/*      */   public JAXBElement<LengthFourDigitDimension> createExternalBayType(LengthFourDigitDimension value)
/*      */   {
/* 4116 */     return new JAXBElement(_ExternalBayType_QNAME, LengthFourDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InternalConnector")
/*      */   public JAXBElement<InternalConnectorTypeValues> createInternalConnector(InternalConnectorTypeValues value)
/*      */   {
/* 4125 */     return new JAXBElement(_InternalConnector_QNAME, InternalConnectorTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Averagewritetime")
/*      */   public JAXBElement<BigInteger> createAveragewritetime(BigInteger value)
/*      */   {
/* 4134 */     return new JAXBElement(_Averagewritetime_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ConnectorTypeUsedOnCable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createConnectorTypeUsedOnCable(String value)
/*      */   {
/* 4144 */     return new JAXBElement(_ConnectorTypeUsedOnCable_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ExternalCustomerID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createExternalCustomerID(String value)
/*      */   {
/* 4154 */     return new JAXBElement(_ExternalCustomerID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ConnectorGender")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createConnectorGender(String value)
/*      */   {
/* 4164 */     return new JAXBElement(_ConnectorGender_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RAMSize")
/*      */   public JAXBElement<MemorySizeDimension> createRAMSize(MemorySizeDimension value)
/*      */   {
/* 4173 */     return new JAXBElement(_RAMSize_QNAME, MemorySizeDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MerchantOrderID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMerchantOrderID(String value)
/*      */   {
/* 4183 */     return new JAXBElement(_MerchantOrderID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumHorizontalRefreshRate")
/*      */   public JAXBElement<FrequencyFiveDigitIntegerDimension> createMaximumHorizontalRefreshRate(FrequencyFiveDigitIntegerDimension value)
/*      */   {
/* 4192 */     return new JAXBElement(_MaximumHorizontalRefreshRate_QNAME, FrequencyFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NoiseReductionLevel")
/*      */   public JAXBElement<BigDecimal> createNoiseReductionLevel(BigDecimal value)
/*      */   {
/* 4201 */     return new JAXBElement(_NoiseReductionLevel_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FocusType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFocusType(String value)
/*      */   {
/* 4211 */     return new JAXBElement(_FocusType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ImageSensor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createImageSensor(String value)
/*      */   {
/* 4221 */     return new JAXBElement(_ImageSensor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CameraFlash")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCameraFlash(String value)
/*      */   {
/* 4231 */     return new JAXBElement(_CameraFlash_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfButtons")
/*      */   public JAXBElement<BigInteger> createNumberOfButtons(BigInteger value)
/*      */   {
/* 4240 */     return new JAXBElement(_NumberOfButtons_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxExpandedMemorySupported")
/*      */   public JAXBElement<MemorySizeDimension> createMaxExpandedMemorySupported(MemorySizeDimension value)
/*      */   {
/* 4249 */     return new JAXBElement(_MaxExpandedMemorySupported_QNAME, MemorySizeDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GuideNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createGuideNumber(String value)
/*      */   {
/* 4259 */     return new JAXBElement(_GuideNumber_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HeatsinkMaterial")
/*      */   public JAXBElement<String> createHeatsinkMaterial(String value)
/*      */   {
/* 4268 */     return new JAXBElement(_HeatsinkMaterial_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfFirewirePorts")
/*      */   public JAXBElement<BigInteger> createNumberOfFirewirePorts(BigInteger value)
/*      */   {
/* 4277 */     return new JAXBElement(_NumberOfFirewirePorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumWattage")
/*      */   public JAXBElement<WattageDimension> createMaximumWattage(WattageDimension value)
/*      */   {
/* 4286 */     return new JAXBElement(_MaximumWattage_QNAME, WattageDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinimumThrowDistance")
/*      */   public JAXBElement<BigDecimal> createMinimumThrowDistance(BigDecimal value)
/*      */   {
/* 4295 */     return new JAXBElement(_MinimumThrowDistance_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PowerSupplyFormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPowerSupplyFormFactor(String value)
/*      */   {
/* 4305 */     return new JAXBElement(_PowerSupplyFormFactor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="IsHotShoeIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createIsHotShoeIncluded(String value)
/*      */   {
/* 4315 */     return new JAXBElement(_IsHotShoeIncluded_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinimumHorizontalRefreshRate")
/*      */   public JAXBElement<FrequencyFiveDigitIntegerDimension> createMinimumHorizontalRefreshRate(FrequencyFiveDigitIntegerDimension value)
/*      */   {
/* 4324 */     return new JAXBElement(_MinimumHorizontalRefreshRate_QNAME, FrequencyFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Resolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createResolution(String value)
/*      */   {
/* 4334 */     return new JAXBElement(_Resolution_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="IncludedHarddrivedescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createIncludedHarddrivedescription(String value)
/*      */   {
/* 4344 */     return new JAXBElement(_IncludedHarddrivedescription_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AutomaticBackupSoftwareIncluded")
/*      */   public JAXBElement<Boolean> createAutomaticBackupSoftwareIncluded(Boolean value)
/*      */   {
/* 4353 */     return new JAXBElement(_AutomaticBackupSoftwareIncluded_QNAME, Boolean.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Averageseektime")
/*      */   public JAXBElement<BigInteger> createAverageseektime(BigInteger value)
/*      */   {
/* 4362 */     return new JAXBElement(_Averageseektime_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AmazonCustomerID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAmazonCustomerID(String value)
/*      */   {
/* 4372 */     return new JAXBElement(_AmazonCustomerID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CompatibleDeviceSize")
/*      */   public JAXBElement<BigDecimal> createCompatibleDeviceSize(BigDecimal value)
/*      */   {
/* 4381 */     return new JAXBElement(_CompatibleDeviceSize_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFirewire400Connectors")
/*      */   public JAXBElement<BigInteger> createTotalFirewire400Connectors(BigInteger value)
/*      */   {
/* 4390 */     return new JAXBElement(_TotalFirewire400Connectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ExpansionSlots")
/*      */   public JAXBElement<BigInteger> createExpansionSlots(BigInteger value)
/*      */   {
/* 4399 */     return new JAXBElement(_ExpansionSlots_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ThreeDTechnology")
/*      */   public JAXBElement<ThreeDTechnologyValues> createThreeDTechnology(ThreeDTechnologyValues value)
/*      */   {
/* 4408 */     return new JAXBElement(_ThreeDTechnology_QNAME, ThreeDTechnologyValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="URacksize")
/*      */   public JAXBElement<BigInteger> createURacksize(BigInteger value)
/*      */   {
/* 4417 */     return new JAXBElement(_URacksize_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PowerConsumption")
/*      */   public JAXBElement<PowerDimension> createPowerConsumption(PowerDimension value)
/*      */   {
/* 4426 */     return new JAXBElement(_PowerConsumption_QNAME, PowerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FulfillmentMethod")
/*      */   public JAXBElement<String> createFulfillmentMethod(String value)
/*      */   {
/* 4435 */     return new JAXBElement(_FulfillmentMethod_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalUSB3.0Connectors")
/*      */   public JAXBElement<BigInteger> createTotalUSB30Connectors(BigInteger value)
/*      */   {
/* 4444 */     return new JAXBElement(_TotalUSB30Connectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalCoaxialInputs")
/*      */   public JAXBElement<BigInteger> createTotalCoaxialInputs(BigInteger value)
/*      */   {
/* 4453 */     return new JAXBElement(_TotalCoaxialInputs_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ParentalControlTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createParentalControlTechnology(String value)
/*      */   {
/* 4463 */     return new JAXBElement(_ParentalControlTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="VerticalKeystoneCorrection")
/*      */   public JAXBElement<LengthDimension> createVerticalKeystoneCorrection(LengthDimension value)
/*      */   {
/* 4472 */     return new JAXBElement(_VerticalKeystoneCorrection_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfLPT1PrinterPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfLPT1PrinterPorts(BigInteger value)
/*      */   {
/* 4481 */     return new JAXBElement(_NumberOfLPT1PrinterPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfDrivers")
/*      */   public JAXBElement<BigInteger> createNumberOfDrivers(BigInteger value)
/*      */   {
/* 4490 */     return new JAXBElement(_NumberOfDrivers_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AudibleNoise")
/*      */   public JAXBElement<BigDecimal> createAudibleNoise(BigDecimal value)
/*      */   {
/* 4499 */     return new JAXBElement(_AudibleNoise_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AdditionalFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAdditionalFeatures(String value)
/*      */   {
/* 4509 */     return new JAXBElement(_AdditionalFeatures_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AdditionalDrives")
/*      */   public JAXBElement<AdditionalDrivesTypeValues> createAdditionalDrives(AdditionalDrivesTypeValues value)
/*      */   {
/* 4518 */     return new JAXBElement(_AdditionalDrives_QNAME, AdditionalDrivesTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PanelWindowLocation")
/*      */   public JAXBElement<String> createPanelWindowLocation(String value)
/*      */   {
/* 4527 */     return new JAXBElement(_PanelWindowLocation_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ConnectorType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createConnectorType(String value)
/*      */   {
/* 4537 */     return new JAXBElement(_ConnectorType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="LANPortNumber")
/*      */   public JAXBElement<BigInteger> createLANPortNumber(BigInteger value)
/*      */   {
/* 4546 */     return new JAXBElement(_LANPortNumber_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PhotoFilterThreadSize")
/*      */   public JAXBElement<LengthDimension> createPhotoFilterThreadSize(LengthDimension value)
/*      */   {
/* 4555 */     return new JAXBElement(_PhotoFilterThreadSize_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MerchantPromotionID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMerchantPromotionID(String value)
/*      */   {
/* 4565 */     return new JAXBElement(_MerchantPromotionID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinFocalLength")
/*      */   public JAXBElement<LengthDimension> createMinFocalLength(LengthDimension value)
/*      */   {
/* 4574 */     return new JAXBElement(_MinFocalLength_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SoftwareIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSoftwareIncluded(String value)
/*      */   {
/* 4584 */     return new JAXBElement(_SoftwareIncluded_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumImageSize")
/*      */   public JAXBElement<LengthSevenDigitDimension> createMaximumImageSize(LengthSevenDigitDimension value)
/*      */   {
/* 4593 */     return new JAXBElement(_MaximumImageSize_QNAME, LengthSevenDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InputDeviceInterfaceTechnology")
/*      */   public JAXBElement<String> createInputDeviceInterfaceTechnology(String value)
/*      */   {
/* 4602 */     return new JAXBElement(_InputDeviceInterfaceTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPaneleSataPorts")
/*      */   public JAXBElement<BigInteger> createTotalFrontPaneleSataPorts(BigInteger value)
/*      */   {
/* 4611 */     return new JAXBElement(_TotalFrontPaneleSataPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MountMotion")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMountMotion(String value)
/*      */   {
/* 4621 */     return new JAXBElement(_MountMotion_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProcessorSocket")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createProcessorSocket(String value)
/*      */   {
/* 4631 */     return new JAXBElement(_ProcessorSocket_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WaterResistantDepth")
/*      */   public JAXBElement<LengthDimension> createWaterResistantDepth(LengthDimension value)
/*      */   {
/* 4640 */     return new JAXBElement(_WaterResistantDepth_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="StorageReadSpeed")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createStorageReadSpeed(String value)
/*      */   {
/* 4650 */     return new JAXBElement(_StorageReadSpeed_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BiAmpable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createBiAmpable(String value)
/*      */   {
/* 4660 */     return new JAXBElement(_BiAmpable_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalPowerOutlets")
/*      */   public JAXBElement<BigInteger> createTotalPowerOutlets(BigInteger value)
/*      */   {
/* 4669 */     return new JAXBElement(_TotalPowerOutlets_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Efficiency")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createEfficiency(String value)
/*      */   {
/* 4679 */     return new JAXBElement(_Efficiency_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Remote")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createRemote(String value)
/*      */   {
/* 4689 */     return new JAXBElement(_Remote_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ImageStabilization")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createImageStabilization(String value)
/*      */   {
/* 4699 */     return new JAXBElement(_ImageStabilization_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FlashModesDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFlashModesDescription(String value)
/*      */   {
/* 4709 */     return new JAXBElement(_FlashModesDescription_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WirelessStandard")
/*      */   public JAXBElement<String> createWirelessStandard(String value)
/*      */   {
/* 4718 */     return new JAXBElement(_WirelessStandard_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SSDConnectorPins")
/*      */   public JAXBElement<BigInteger> createSSDConnectorPins(BigInteger value)
/*      */   {
/* 4727 */     return new JAXBElement(_SSDConnectorPins_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfLithiumMetalCells")
/*      */   public JAXBElement<BigInteger> createNumberOfLithiumMetalCells(BigInteger value)
/*      */   {
/* 4736 */     return new JAXBElement(_NumberOfLithiumMetalCells_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InternalBayType")
/*      */   public JAXBElement<LengthFourDigitDimension> createInternalBayType(LengthFourDigitDimension value)
/*      */   {
/* 4745 */     return new JAXBElement(_InternalBayType_QNAME, LengthFourDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalUSB2.0Connectors")
/*      */   public JAXBElement<BigInteger> createTotalUSB20Connectors(BigInteger value)
/*      */   {
/* 4754 */     return new JAXBElement(_TotalUSB20Connectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OperatingSystemCompatability")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createOperatingSystemCompatability(String value)
/*      */   {
/* 4764 */     return new JAXBElement(_OperatingSystemCompatability_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Zoom")
/*      */   public JAXBElement<String> createZoom(String value)
/*      */   {
/* 4773 */     return new JAXBElement(_Zoom_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CoatingDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCoatingDescription(String value)
/*      */   {
/* 4783 */     return new JAXBElement(_CoatingDescription_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PowerSupplyMounting")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPowerSupplyMounting(String value)
/*      */   {
/* 4793 */     return new JAXBElement(_PowerSupplyMounting_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CompatibleDeviceFormFactor")
/*      */   public JAXBElement<String> createCompatibleDeviceFormFactor(String value)
/*      */   {
/* 4802 */     return new JAXBElement(_CompatibleDeviceFormFactor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalCompositePorts")
/*      */   public JAXBElement<BigInteger> createTotalCompositePorts(BigInteger value)
/*      */   {
/* 4811 */     return new JAXBElement(_TotalCompositePorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HorizontalKeystoneCorrection")
/*      */   public JAXBElement<LengthDimension> createHorizontalKeystoneCorrection(LengthDimension value)
/*      */   {
/* 4820 */     return new JAXBElement(_HorizontalKeystoneCorrection_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WirelessDataTransferRate")
/*      */   public JAXBElement<DataTransferSpeedFiveDigitIntegerDimension> createWirelessDataTransferRate(DataTransferSpeedFiveDigitIntegerDimension value)
/*      */   {
/* 4829 */     return new JAXBElement(_WirelessDataTransferRate_QNAME, DataTransferSpeedFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InputVideoConnectors")
/*      */   public JAXBElement<InputVideoConnectorsTypeValues> createInputVideoConnectors(InputVideoConnectorsTypeValues value)
/*      */   {
/* 4838 */     return new JAXBElement(_InputVideoConnectors_QNAME, InputVideoConnectorsTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalComponentInPorts")
/*      */   public JAXBElement<BigInteger> createTotalComponentInPorts(BigInteger value)
/*      */   {
/* 4847 */     return new JAXBElement(_TotalComponentInPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BatteryChargeCycles")
/*      */   public JAXBElement<BigInteger> createBatteryChargeCycles(BigInteger value)
/*      */   {
/* 4856 */     return new JAXBElement(_BatteryChargeCycles_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakerOutputChannelQuantity")
/*      */   public JAXBElement<BigInteger> createSpeakerOutputChannelQuantity(BigInteger value)
/*      */   {
/* 4865 */     return new JAXBElement(_SpeakerOutputChannelQuantity_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FrontSideBusSpeed")
/*      */   public JAXBElement<BigInteger> createFrontSideBusSpeed(BigInteger value)
/*      */   {
/* 4874 */     return new JAXBElement(_FrontSideBusSpeed_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TrafficFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createTrafficFeatures(String value)
/*      */   {
/* 4884 */     return new JAXBElement(_TrafficFeatures_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CompatibleProcessorTypes")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCompatibleProcessorTypes(String value)
/*      */   {
/* 4894 */     return new JAXBElement(_CompatibleProcessorTypes_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PrimaryHeadphoneUse")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPrimaryHeadphoneUse(String value)
/*      */   {
/* 4904 */     return new JAXBElement(_PrimaryHeadphoneUse_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfSatelliteSpeakers")
/*      */   public JAXBElement<BigDecimal> createNumberOfSatelliteSpeakers(BigDecimal value)
/*      */   {
/* 4913 */     return new JAXBElement(_NumberOfSatelliteSpeakers_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DeviceHardwareCompatability")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createDeviceHardwareCompatability(String value)
/*      */   {
/* 4923 */     return new JAXBElement(_DeviceHardwareCompatability_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MountingPattern")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMountingPattern(String value)
/*      */   {
/* 4933 */     return new JAXBElement(_MountingPattern_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumApertureRange")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMaximumApertureRange(String value)
/*      */   {
/* 4943 */     return new JAXBElement(_MaximumApertureRange_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ModelNumber")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createModelNumber(String value)
/*      */   {
/* 4953 */     return new JAXBElement(_ModelNumber_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ViewingAngle")
/*      */   public JAXBElement<BigInteger> createViewingAngle(BigInteger value)
/*      */   {
/* 4962 */     return new JAXBElement(_ViewingAngle_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="EnclosureFinish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createEnclosureFinish(String value)
/*      */   {
/* 4972 */     return new JAXBElement(_EnclosureFinish_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfGamingPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfGamingPorts(BigInteger value)
/*      */   {
/* 4981 */     return new JAXBElement(_NumberOfGamingPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ThreeDReady")
/*      */   public JAXBElement<String> createThreeDReady(String value)
/*      */   {
/* 4990 */     return new JAXBElement(_ThreeDReady_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CameraFilmSpeed")
/*      */   public JAXBElement<BigInteger> createCameraFilmSpeed(BigInteger value)
/*      */   {
/* 4999 */     return new JAXBElement(_CameraFilmSpeed_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TypeOfMemorySlot")
/*      */   public JAXBElement<BigInteger> createTypeOfMemorySlot(BigInteger value)
/*      */   {
/* 5008 */     return new JAXBElement(_TypeOfMemorySlot_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="KeystoneCorrection")
/*      */   public JAXBElement<LengthSevenDigitDimension> createKeystoneCorrection(LengthSevenDigitDimension value)
/*      */   {
/* 5017 */     return new JAXBElement(_KeystoneCorrection_QNAME, LengthSevenDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ZoomType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createZoomType(String value)
/*      */   {
/* 5027 */     return new JAXBElement(_ZoomType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalVGAOutPorts")
/*      */   public JAXBElement<BigInteger> createTotalVGAOutPorts(BigInteger value)
/*      */   {
/* 5036 */     return new JAXBElement(_TotalVGAOutPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfFireWire400Ports")
/*      */   public JAXBElement<BigInteger> createNumberOfFireWire400Ports(BigInteger value)
/*      */   {
/* 5045 */     return new JAXBElement(_NumberOfFireWire400Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProjectorBrightness")
/*      */   public JAXBElement<LuminanceFiveDigitDimension> createProjectorBrightness(LuminanceFiveDigitDimension value)
/*      */   {
/* 5054 */     return new JAXBElement(_ProjectorBrightness_QNAME, LuminanceFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ConditionType")
/*      */   public JAXBElement<String> createConditionType(String value)
/*      */   {
/* 5063 */     return new JAXBElement(_ConditionType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakersNominalOutputPower")
/*      */   public JAXBElement<WattageDimension> createSpeakersNominalOutputPower(WattageDimension value)
/*      */   {
/* 5072 */     return new JAXBElement(_SpeakersNominalOutputPower_QNAME, WattageDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CableInterface")
/*      */   public JAXBElement<String> createCableInterface(String value)
/*      */   {
/* 5081 */     return new JAXBElement(_CableInterface_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DigitalStillResolution")
/*      */   public JAXBElement<ResolutionFiveDigitDimension> createDigitalStillResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 5090 */     return new JAXBElement(_DigitalStillResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TabletResolution")
/*      */   public JAXBElement<TabletResolutionDimension> createTabletResolution(TabletResolutionDimension value)
/*      */   {
/* 5099 */     return new JAXBElement(_TabletResolution_QNAME, TabletResolutionDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RAID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createRAID(String value)
/*      */   {
/* 5109 */     return new JAXBElement(_RAID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CasLatency")
/*      */   public JAXBElement<BigInteger> createCasLatency(BigInteger value)
/*      */   {
/* 5118 */     return new JAXBElement(_CasLatency_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Address")
/*      */   public JAXBElement<AddressType> createAddress(AddressType value)
/*      */   {
/* 5127 */     return new JAXBElement(_Address_QNAME, AddressType.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ScreenResolution")
/*      */   public JAXBElement<String> createScreenResolution(String value)
/*      */   {
/* 5136 */     return new JAXBElement(_ScreenResolution_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SubwooferWattage")
/*      */   public JAXBElement<WattageDimension> createSubwooferWattage(WattageDimension value)
/*      */   {
/* 5145 */     return new JAXBElement(_SubwooferWattage_QNAME, WattageDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakerOut")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSpeakerOut(String value)
/*      */   {
/* 5155 */     return new JAXBElement(_SpeakerOut_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfIDEPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfIDEPorts(BigInteger value)
/*      */   {
/* 5164 */     return new JAXBElement(_NumberOfIDEPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RAMTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createRAMTechnology(String value)
/*      */   {
/* 5174 */     return new JAXBElement(_RAMTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ScreenTrigger")
/*      */   public JAXBElement<VoltageFiveDigitIntegerDimension> createScreenTrigger(VoltageFiveDigitIntegerDimension value)
/*      */   {
/* 5183 */     return new JAXBElement(_ScreenTrigger_QNAME, VoltageFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createWooferSpeakerMaterial(String value)
/*      */   {
/* 5193 */     return new JAXBElement(_WooferSpeakerMaterial_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumVerticalVideoResolution")
/*      */   public JAXBElement<BigInteger> createMaximumVerticalVideoResolution(BigInteger value)
/*      */   {
/* 5202 */     return new JAXBElement(_MaximumVerticalVideoResolution_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FrequencyRange")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFrequencyRange(String value)
/*      */   {
/* 5212 */     return new JAXBElement(_FrequencyRange_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BaseWidth")
/*      */   public JAXBElement<LengthDimension> createBaseWidth(LengthDimension value)
/*      */   {
/* 5221 */     return new JAXBElement(_BaseWidth_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createGraphicsDescription(String value)
/*      */   {
/* 5231 */     return new JAXBElement(_GraphicsDescription_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MemorySlotsAvailable")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMemorySlotsAvailable(String value)
/*      */   {
/* 5241 */     return new JAXBElement(_MemorySlotsAvailable_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="LampWattage")
/*      */   public JAXBElement<BigInteger> createLampWattage(BigInteger value)
/*      */   {
/* 5250 */     return new JAXBElement(_LampWattage_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MidRangeSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMidRangeSpeakerMaterial(String value)
/*      */   {
/* 5260 */     return new JAXBElement(_MidRangeSpeakerMaterial_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPanelUSB1.0Ports")
/*      */   public JAXBElement<BigInteger> createTotalFrontPanelUSB10Ports(BigInteger value)
/*      */   {
/* 5269 */     return new JAXBElement(_TotalFrontPanelUSB10Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PrinterWirelessType")
/*      */   public JAXBElement<String> createPrinterWirelessType(String value)
/*      */   {
/* 5278 */     return new JAXBElement(_PrinterWirelessType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsChipsetBrand")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createGraphicsChipsetBrand(String value)
/*      */   {
/* 5288 */     return new JAXBElement(_GraphicsChipsetBrand_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ScreenFinish")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createScreenFinish(String value)
/*      */   {
/* 5298 */     return new JAXBElement(_ScreenFinish_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SubwooferSpeakerDiameter")
/*      */   public JAXBElement<LengthDimension> createSubwooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 5307 */     return new JAXBElement(_SubwooferSpeakerDiameter_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalVideoOutPorts")
/*      */   public JAXBElement<BigInteger> createTotalVideoOutPorts(BigInteger value)
/*      */   {
/* 5316 */     return new JAXBElement(_TotalVideoOutPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ACAdapterCurrent")
/*      */   public JAXBElement<CurrentFiveDigitDimension> createACAdapterCurrent(CurrentFiveDigitDimension value)
/*      */   {
/* 5325 */     return new JAXBElement(_ACAdapterCurrent_QNAME, CurrentFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxFocalLength")
/*      */   public JAXBElement<LengthDimension> createMaxFocalLength(LengthDimension value)
/*      */   {
/* 5334 */     return new JAXBElement(_MaxFocalLength_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxWeightRecommendation")
/*      */   public JAXBElement<WeightDimension> createMaxWeightRecommendation(WeightDimension value)
/*      */   {
/* 5343 */     return new JAXBElement(_MaxWeightRecommendation_QNAME, WeightDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ShaderClock")
/*      */   public JAXBElement<FrequencyIntegerDimension> createShaderClock(FrequencyIntegerDimension value)
/*      */   {
/* 5352 */     return new JAXBElement(_ShaderClock_QNAME, FrequencyIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MultiChannelKit")
/*      */   public JAXBElement<BigInteger> createMultiChannelKit(BigInteger value)
/*      */   {
/* 5361 */     return new JAXBElement(_MultiChannelKit_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsCardMaxResolution")
/*      */   public JAXBElement<String> createGraphicsCardMaxResolution(String value)
/*      */   {
/* 5370 */     return new JAXBElement(_GraphicsCardMaxResolution_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FinishType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFinishType(String value)
/*      */   {
/* 5380 */     return new JAXBElement(_FinishType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProcessorBrand")
/*      */   public JAXBElement<String> createProcessorBrand(String value)
/*      */   {
/* 5389 */     return new JAXBElement(_ProcessorBrand_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumVerticalRefreshRate")
/*      */   public JAXBElement<FrequencyFiveDigitIntegerDimension> createMaximumVerticalRefreshRate(FrequencyFiveDigitIntegerDimension value)
/*      */   {
/* 5398 */     return new JAXBElement(_MaximumVerticalRefreshRate_QNAME, FrequencyFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OutputWattage")
/*      */   public JAXBElement<BigInteger> createOutputWattage(BigInteger value)
/*      */   {
/* 5407 */     return new JAXBElement(_OutputWattage_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="LANPortBandwidth")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createLANPortBandwidth(String value)
/*      */   {
/* 5417 */     return new JAXBElement(_LANPortBandwidth_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumHorizontalVideoResolution")
/*      */   public JAXBElement<BigInteger> createMaximumHorizontalVideoResolution(BigInteger value)
/*      */   {
/* 5426 */     return new JAXBElement(_MaximumHorizontalVideoResolution_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ConnectionType")
/*      */   public JAXBElement<ConnectionTypeValues> createConnectionType(ConnectionTypeValues value)
/*      */   {
/* 5435 */     return new JAXBElement(_ConnectionType_QNAME, ConnectionTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfSpeakers")
/*      */   public JAXBElement<BigInteger> createNumberOfSpeakers(BigInteger value)
/*      */   {
/* 5444 */     return new JAXBElement(_NumberOfSpeakers_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AntennaLocation")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAntennaLocation(String value)
/*      */   {
/* 5454 */     return new JAXBElement(_AntennaLocation_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalNumberOfHotswapBays")
/*      */   public JAXBElement<BigInteger> createTotalNumberOfHotswapBays(BigInteger value)
/*      */   {
/* 5463 */     return new JAXBElement(_TotalNumberOfHotswapBays_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakersMaximumOutputPower")
/*      */   public JAXBElement<WattageDimension> createSpeakersMaximumOutputPower(WattageDimension value)
/*      */   {
/* 5472 */     return new JAXBElement(_SpeakersMaximumOutputPower_QNAME, WattageDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalPreampOutputs")
/*      */   public JAXBElement<BigInteger> createTotalPreampOutputs(BigInteger value)
/*      */   {
/* 5481 */     return new JAXBElement(_TotalPreampOutputs_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SignalPassthroughTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSignalPassthroughTechnology(String value)
/*      */   {
/* 5491 */     return new JAXBElement(_SignalPassthroughTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HardDriveSize")
/*      */   public JAXBElement<MemorySizeDimension> createHardDriveSize(MemorySizeDimension value)
/*      */   {
/* 5500 */     return new JAXBElement(_HardDriveSize_QNAME, MemorySizeDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CameraDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCameraDescription(String value)
/*      */   {
/* 5510 */     return new JAXBElement(_CameraDescription_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinimumImageSize")
/*      */   public JAXBElement<LengthSevenDigitDimension> createMinimumImageSize(LengthSevenDigitDimension value)
/*      */   {
/* 5519 */     return new JAXBElement(_MinimumImageSize_QNAME, LengthSevenDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HeadphoneFormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createHeadphoneFormFactor(String value)
/*      */   {
/* 5529 */     return new JAXBElement(_HeadphoneFormFactor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ScannerResolution")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createScannerResolution(String value)
/*      */   {
/* 5539 */     return new JAXBElement(_ScannerResolution_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="LampLife")
/*      */   public JAXBElement<BurnTimeSixDigitDimension> createLampLife(BurnTimeSixDigitDimension value)
/*      */   {
/* 5548 */     return new JAXBElement(_LampLife_QNAME, BurnTimeSixDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InterfaceType")
/*      */   public JAXBElement<InterfaceTypeValues> createInterfaceType(InterfaceTypeValues value)
/*      */   {
/* 5557 */     return new JAXBElement(_InterfaceType_QNAME, InterfaceTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfMonitorConnections")
/*      */   public JAXBElement<BigInteger> createNumberOfMonitorConnections(BigInteger value)
/*      */   {
/* 5566 */     return new JAXBElement(_NumberOfMonitorConnections_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeedClassRating")
/*      */   public JAXBElement<SpeedClassRatingTypeValues> createSpeedClassRating(SpeedClassRatingTypeValues value)
/*      */   {
/* 5575 */     return new JAXBElement(_SpeedClassRating_QNAME, SpeedClassRatingTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BatteryCellType")
/*      */   public JAXBElement<BatteryCellTypeValues> createBatteryCellType(BatteryCellTypeValues value)
/*      */   {
/* 5584 */     return new JAXBElement(_BatteryCellType_QNAME, BatteryCellTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="StorageMaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createStorageMaterialType(String value)
/*      */   {
/* 5594 */     return new JAXBElement(_StorageMaterialType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxMemorySupported")
/*      */   public JAXBElement<MemorySizeIntegerDimension> createMaxMemorySupported(MemorySizeIntegerDimension value)
/*      */   {
/* 5603 */     return new JAXBElement(_MaxMemorySupported_QNAME, MemorySizeIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ViewFinderType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createViewFinderType(String value)
/*      */   {
/* 5613 */     return new JAXBElement(_ViewFinderType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WirelessInputDeviceTechnology")
/*      */   public JAXBElement<WirelessInputDeviceTechnologyTypeValues> createWirelessInputDeviceTechnology(WirelessInputDeviceTechnologyTypeValues value)
/*      */   {
/* 5622 */     return new JAXBElement(_WirelessInputDeviceTechnology_QNAME, WirelessInputDeviceTechnologyTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DeviceSoftwareCompatability")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createDeviceSoftwareCompatability(String value)
/*      */   {
/* 5632 */     return new JAXBElement(_DeviceSoftwareCompatability_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FitType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFitType(String value)
/*      */   {
/* 5642 */     return new JAXBElement(_FitType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumThrowDistance")
/*      */   public JAXBElement<BigDecimal> createMaximumThrowDistance(BigDecimal value)
/*      */   {
/* 5651 */     return new JAXBElement(_MaximumThrowDistance_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DriveRPM")
/*      */   public JAXBElement<BigInteger> createDriveRPM(BigInteger value)
/*      */   {
/* 5660 */     return new JAXBElement(_DriveRPM_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FanMaximumNoiseLevel")
/*      */   public JAXBElement<NoiseLevelSixDigitDimension> createFanMaximumNoiseLevel(NoiseLevelSixDigitDimension value)
/*      */   {
/* 5669 */     return new JAXBElement(_FanMaximumNoiseLevel_QNAME, NoiseLevelSixDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OpticalDriveIntegrated")
/*      */   public JAXBElement<BigInteger> createOpticalDriveIntegrated(BigInteger value)
/*      */   {
/* 5678 */     return new JAXBElement(_OpticalDriveIntegrated_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SimultaneousSessions")
/*      */   public JAXBElement<BigInteger> createSimultaneousSessions(BigInteger value)
/*      */   {
/* 5687 */     return new JAXBElement(_SimultaneousSessions_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Speaker")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSpeaker(String value)
/*      */   {
/* 5697 */     return new JAXBElement(_Speaker_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NASNetworkInterface")
/*      */   public JAXBElement<DataTransferSpeedIntegerDimension> createNASNetworkInterface(DataTransferSpeedIntegerDimension value)
/*      */   {
/* 5706 */     return new JAXBElement(_NASNetworkInterface_QNAME, DataTransferSpeedIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WooferSpeakerDiameter")
/*      */   public JAXBElement<LengthDimension> createWooferSpeakerDiameter(LengthDimension value)
/*      */   {
/* 5715 */     return new JAXBElement(_WooferSpeakerDiameter_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SLICertification")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSLICertification(String value)
/*      */   {
/* 5725 */     return new JAXBElement(_SLICertification_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HasAutoFocus")
/*      */   public JAXBElement<Boolean> createHasAutoFocus(Boolean value)
/*      */   {
/* 5734 */     return new JAXBElement(_HasAutoFocus_QNAME, Boolean.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="VideoUpconversionTechnologies")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createVideoUpconversionTechnologies(String value)
/*      */   {
/* 5744 */     return new JAXBElement(_VideoUpconversionTechnologies_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ZoomRatio")
/*      */   public JAXBElement<String> createZoomRatio(String value)
/*      */   {
/* 5753 */     return new JAXBElement(_ZoomRatio_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PowerSource")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPowerSource(String value)
/*      */   {
/* 5763 */     return new JAXBElement(_PowerSource_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfeSATAPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfeSATAPorts(BigInteger value)
/*      */   {
/* 5772 */     return new JAXBElement(_NumberOfeSATAPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsCoProcessor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createGraphicsCoProcessor(String value)
/*      */   {
/* 5782 */     return new JAXBElement(_GraphicsCoProcessor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DurationOfMapService")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createDurationOfMapService(String value)
/*      */   {
/* 5792 */     return new JAXBElement(_DurationOfMapService_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Northbridge")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createNorthbridge(String value)
/*      */   {
/* 5802 */     return new JAXBElement(_Northbridge_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CompatibleMemoryCard")
/*      */   public JAXBElement<CompatibleMemoryCardTypeValues> createCompatibleMemoryCard(CompatibleMemoryCardTypeValues value)
/*      */   {
/* 5811 */     return new JAXBElement(_CompatibleMemoryCard_QNAME, CompatibleMemoryCardTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PCIExpressConnectorConfiguration")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPCIExpressConnectorConfiguration(String value)
/*      */   {
/* 5821 */     return new JAXBElement(_PCIExpressConnectorConfiguration_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SSDDriveArchitechture")
/*      */   public JAXBElement<String> createSSDDriveArchitechture(String value)
/*      */   {
/* 5830 */     return new JAXBElement(_SSDDriveArchitechture_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MultiGPUTechnology")
/*      */   public JAXBElement<String> createMultiGPUTechnology(String value)
/*      */   {
/* 5839 */     return new JAXBElement(_MultiGPUTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WirelessInputDeviceProtocol")
/*      */   public JAXBElement<String> createWirelessInputDeviceProtocol(String value)
/*      */   {
/* 5848 */     return new JAXBElement(_WirelessInputDeviceProtocol_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BuiltinSpeaker")
/*      */   public JAXBElement<BigInteger> createBuiltinSpeaker(BigInteger value)
/*      */   {
/* 5857 */     return new JAXBElement(_BuiltinSpeaker_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MovementDetectionTechnology")
/*      */   public JAXBElement<Boolean> createMovementDetectionTechnology(Boolean value)
/*      */   {
/* 5866 */     return new JAXBElement(_MovementDetectionTechnology_QNAME, Boolean.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumThrowRatio")
/*      */   public JAXBElement<String> createMaximumThrowRatio(String value)
/*      */   {
/* 5875 */     return new JAXBElement(_MaximumThrowRatio_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AudioEncoding")
/*      */   public JAXBElement<String> createAudioEncoding(String value)
/*      */   {
/* 5884 */     return new JAXBElement(_AudioEncoding_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FixedFocalLength")
/*      */   public JAXBElement<LengthDimension> createFixedFocalLength(LengthDimension value)
/*      */   {
/* 5893 */     return new JAXBElement(_FixedFocalLength_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="EffectiveStillResolution")
/*      */   public JAXBElement<ResolutionDimension> createEffectiveStillResolution(ResolutionDimension value)
/*      */   {
/* 5902 */     return new JAXBElement(_EffectiveStillResolution_QNAME, ResolutionDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RearWebcamResolution")
/*      */   public JAXBElement<ResolutionFiveDigitDimension> createRearWebcamResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 5911 */     return new JAXBElement(_RearWebcamResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfPCIExpressSlots")
/*      */   public JAXBElement<BigInteger> createNumberOfPCIExpressSlots(BigInteger value)
/*      */   {
/* 5920 */     return new JAXBElement(_NumberOfPCIExpressSlots_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SubwooferSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSubwooferSpeakerMaterial(String value)
/*      */   {
/* 5930 */     return new JAXBElement(_SubwooferSpeakerMaterial_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CalibrationTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCalibrationTechnology(String value)
/*      */   {
/* 5940 */     return new JAXBElement(_CalibrationTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfMicrophonePorts")
/*      */   public JAXBElement<BigInteger> createNumberOfMicrophonePorts(BigInteger value)
/*      */   {
/* 5949 */     return new JAXBElement(_NumberOfMicrophonePorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfPorts(BigInteger value)
/*      */   {
/* 5958 */     return new JAXBElement(_NumberOfPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TVTunerVideoOutputInterface")
/*      */   public JAXBElement<String> createTVTunerVideoOutputInterface(String value)
/*      */   {
/* 5967 */     return new JAXBElement(_TVTunerVideoOutputInterface_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFirewire3200Connectors")
/*      */   public JAXBElement<BigInteger> createTotalFirewire3200Connectors(BigInteger value)
/*      */   {
/* 5976 */     return new JAXBElement(_TotalFirewire3200Connectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MarketplaceName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMarketplaceName(String value)
/*      */   {
/* 5986 */     return new JAXBElement(_MarketplaceName_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakerSurroundSoundChannelConfiguration")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSpeakerSurroundSoundChannelConfiguration(String value)
/*      */   {
/* 5996 */     return new JAXBElement(_SpeakerSurroundSoundChannelConfiguration_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFirewire1600Connectors")
/*      */   public JAXBElement<BigInteger> createTotalFirewire1600Connectors(BigInteger value)
/*      */   {
/* 6005 */     return new JAXBElement(_TotalFirewire1600Connectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFirewirePorts")
/*      */   public JAXBElement<BigInteger> createTotalFirewirePorts(BigInteger value)
/*      */   {
/* 6014 */     return new JAXBElement(_TotalFirewirePorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinimumSystemRequirements")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMinimumSystemRequirements(String value)
/*      */   {
/* 6024 */     return new JAXBElement(_MinimumSystemRequirements_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CardReaderInterface")
/*      */   public JAXBElement<CardReaderInterfaceTypeValues> createCardReaderInterface(CardReaderInterfaceTypeValues value)
/*      */   {
/* 6033 */     return new JAXBElement(_CardReaderInterface_QNAME, CardReaderInterfaceTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfMemorySticks")
/*      */   public JAXBElement<BigInteger> createNumberOfMemorySticks(BigInteger value)
/*      */   {
/* 6042 */     return new JAXBElement(_NumberOfMemorySticks_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SecurityProtocol")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSecurityProtocol(String value)
/*      */   {
/* 6052 */     return new JAXBElement(_SecurityProtocol_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalMiniHDMIPorts")
/*      */   public JAXBElement<BigInteger> createTotalMiniHDMIPorts(BigInteger value)
/*      */   {
/* 6061 */     return new JAXBElement(_TotalMiniHDMIPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ConnectionInterface")
/*      */   public JAXBElement<ConnectionTypeValues> createConnectionInterface(ConnectionTypeValues value)
/*      */   {
/* 6070 */     return new JAXBElement(_ConnectionInterface_QNAME, ConnectionTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ControllerType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createControllerType(String value)
/*      */   {
/* 6080 */     return new JAXBElement(_ControllerType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PhotoFilterBayonetSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPhotoFilterBayonetSize(String value)
/*      */   {
/* 6090 */     return new JAXBElement(_PhotoFilterBayonetSize_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HolderCapacity")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createHolderCapacity(String value)
/*      */   {
/* 6100 */     return new JAXBElement(_HolderCapacity_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DVDRegion")
/*      */   public JAXBElement<BigInteger> createDVDRegion(BigInteger value)
/*      */   {
/* 6109 */     return new JAXBElement(_DVDRegion_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PhotoFilterDropInSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPhotoFilterDropInSize(String value)
/*      */   {
/* 6119 */     return new JAXBElement(_PhotoFilterDropInSize_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProcessorType")
/*      */   public JAXBElement<String> createProcessorType(String value)
/*      */   {
/* 6128 */     return new JAXBElement(_ProcessorType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NetworkAdapterType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createNetworkAdapterType(String value)
/*      */   {
/* 6138 */     return new JAXBElement(_NetworkAdapterType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PhotoFilterEffectSize")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPhotoFilterEffectSize(String value)
/*      */   {
/* 6148 */     return new JAXBElement(_PhotoFilterEffectSize_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SKU")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSKU(String value)
/*      */   {
/* 6158 */     return new JAXBElement(_SKU_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MotherboardFormFactor")
/*      */   public JAXBElement<String> createMotherboardFormFactor(String value)
/*      */   {
/* 6167 */     return new JAXBElement(_MotherboardFormFactor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PresentationRemoteMemory")
/*      */   public JAXBElement<MemorySizeFiveDigitDimension> createPresentationRemoteMemory(MemorySizeFiveDigitDimension value)
/*      */   {
/* 6176 */     return new JAXBElement(_PresentationRemoteMemory_QNAME, MemorySizeFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPanelUSB3.0Ports")
/*      */   public JAXBElement<BigInteger> createTotalFrontPanelUSB30Ports(BigInteger value)
/*      */   {
/* 6185 */     return new JAXBElement(_TotalFrontPanelUSB30Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaterialType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMaterialType(String value)
/*      */   {
/* 6195 */     return new JAXBElement(_MaterialType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MonitorConnectors")
/*      */   public JAXBElement<MonitorConnectorsTypeValues> createMonitorConnectors(MonitorConnectorsTypeValues value)
/*      */   {
/* 6204 */     return new JAXBElement(_MonitorConnectors_QNAME, MonitorConnectorsTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CommunicationInterface")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCommunicationInterface(String value)
/*      */   {
/* 6214 */     return new JAXBElement(_CommunicationInterface_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TweeterDriverDiameter")
/*      */   public JAXBElement<LengthDimension> createTweeterDriverDiameter(LengthDimension value)
/*      */   {
/* 6223 */     return new JAXBElement(_TweeterDriverDiameter_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="EuEnergyLabelEfficiencyClass")
/*      */   public JAXBElement<String> createEuEnergyLabelEfficiencyClass(String value)
/*      */   {
/* 6232 */     return new JAXBElement(_EuEnergyLabelEfficiencyClass_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DigitalMediaFormat")
/*      */   public JAXBElement<String> createDigitalMediaFormat(String value)
/*      */   {
/* 6241 */     return new JAXBElement(_DigitalMediaFormat_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProcessorCount")
/*      */   public JAXBElement<BigInteger> createProcessorCount(BigInteger value)
/*      */   {
/* 6250 */     return new JAXBElement(_ProcessorCount_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OpticalDriveType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createOpticalDriveType(String value)
/*      */   {
/* 6260 */     return new JAXBElement(_OpticalDriveType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ScreenSize")
/*      */   public JAXBElement<LengthDimension> createScreenSize(LengthDimension value)
/*      */   {
/* 6269 */     return new JAXBElement(_ScreenSize_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalUSB1.1Connectors")
/*      */   public JAXBElement<BigInteger> createTotalUSB11Connectors(BigInteger value)
/*      */   {
/* 6278 */     return new JAXBElement(_TotalUSB11Connectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Language")
/*      */   public JAXBElement<LanguageStringType> createLanguage(LanguageStringType value)
/*      */   {
/* 6287 */     return new JAXBElement(_Language_QNAME, LanguageStringType.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MountingType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMountingType(String value)
/*      */   {
/* 6297 */     return new JAXBElement(_MountingType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RAMFormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createRAMFormFactor(String value)
/*      */   {
/* 6307 */     return new JAXBElement(_RAMFormFactor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfexternalBays")
/*      */   public JAXBElement<BigInteger> createNumberOfexternalBays(BigInteger value)
/*      */   {
/* 6316 */     return new JAXBElement(_NumberOfexternalBays_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GrilleRemoveability")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createGrilleRemoveability(String value)
/*      */   {
/* 6326 */     return new JAXBElement(_GrilleRemoveability_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HasColorScreen")
/*      */   public JAXBElement<Boolean> createHasColorScreen(Boolean value)
/*      */   {
/* 6335 */     return new JAXBElement(_HasColorScreen_QNAME, Boolean.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ContinuousShootingSpeed")
/*      */   public JAXBElement<ContinuousShootingDimension> createContinuousShootingSpeed(ContinuousShootingDimension value)
/*      */   {
/* 6344 */     return new JAXBElement(_ContinuousShootingSpeed_QNAME, ContinuousShootingDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CPUSocketCompatability")
/*      */   public JAXBElement<String> createCPUSocketCompatability(String value)
/*      */   {
/* 6353 */     return new JAXBElement(_CPUSocketCompatability_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FlashDedication")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFlashDedication(String value)
/*      */   {
/* 6363 */     return new JAXBElement(_FlashDedication_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MerchantFulfillmentID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMerchantFulfillmentID(String value)
/*      */   {
/* 6373 */     return new JAXBElement(_MerchantFulfillmentID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WirelessTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createWirelessTechnology(String value)
/*      */   {
/* 6383 */     return new JAXBElement(_WirelessTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CheckpointTSAFriendly")
/*      */   public JAXBElement<String> createCheckpointTSAFriendly(String value)
/*      */   {
/* 6392 */     return new JAXBElement(_CheckpointTSAFriendly_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AntennaDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAntennaDescription(String value)
/*      */   {
/* 6402 */     return new JAXBElement(_AntennaDescription_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfUSB2.0Ports")
/*      */   public JAXBElement<BigInteger> createNumberOfUSB20Ports(BigInteger value)
/*      */   {
/* 6411 */     return new JAXBElement(_NumberOfUSB20Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="VideoEncoding")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createVideoEncoding(String value)
/*      */   {
/* 6421 */     return new JAXBElement(_VideoEncoding_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="UniversalRemoteCode")
/*      */   public JAXBElement<BigInteger> createUniversalRemoteCode(BigInteger value)
/*      */   {
/* 6430 */     return new JAXBElement(_UniversalRemoteCode_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DeliveryChannel")
/*      */   public JAXBElement<String> createDeliveryChannel(String value)
/*      */   {
/* 6439 */     return new JAXBElement(_DeliveryChannel_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TrackingMethod")
/*      */   public JAXBElement<String> createTrackingMethod(String value)
/*      */   {
/* 6448 */     return new JAXBElement(_TrackingMethod_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Channels")
/*      */   public JAXBElement<BigDecimal> createChannels(BigDecimal value)
/*      */   {
/* 6457 */     return new JAXBElement(_Channels_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WaypointsType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createWaypointsType(String value)
/*      */   {
/* 6467 */     return new JAXBElement(_WaypointsType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ConnectorNumber")
/*      */   public JAXBElement<BigInteger> createConnectorNumber(BigInteger value)
/*      */   {
/* 6476 */     return new JAXBElement(_ConnectorNumber_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SATARAID")
/*      */   public JAXBElement<String> createSATARAID(String value)
/*      */   {
/* 6485 */     return new JAXBElement(_SATARAID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RemoteIncluded")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createRemoteIncluded(String value)
/*      */   {
/* 6495 */     return new JAXBElement(_RemoteIncluded_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxShutterSpeed")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMaxShutterSpeed(String value)
/*      */   {
/* 6505 */     return new JAXBElement(_MaxShutterSpeed_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HardDriveInterface")
/*      */   public JAXBElement<HardDriveInterfaceTypeValues> createHardDriveInterface(HardDriveInterfaceTypeValues value)
/*      */   {
/* 6514 */     return new JAXBElement(_HardDriveInterface_QNAME, HardDriveInterfaceTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Conductor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createConductor(String value)
/*      */   {
/* 6524 */     return new JAXBElement(_Conductor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfAudioOutPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfAudioOutPorts(BigInteger value)
/*      */   {
/* 6533 */     return new JAXBElement(_NumberOfAudioOutPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalSubwooferOutputs")
/*      */   public JAXBElement<BigInteger> createTotalSubwooferOutputs(BigInteger value)
/*      */   {
/* 6542 */     return new JAXBElement(_TotalSubwooferOutputs_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SubscriptionTermName")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSubscriptionTermName(String value)
/*      */   {
/* 6552 */     return new JAXBElement(_SubscriptionTermName_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="StorageWriteSpeed")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createStorageWriteSpeed(String value)
/*      */   {
/* 6562 */     return new JAXBElement(_StorageWriteSpeed_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CharacterData")
/*      */   public JAXBElement<CharacterDataType> createCharacterData(CharacterDataType value)
/*      */   {
/* 6571 */     return new JAXBElement(_CharacterData_QNAME, CharacterDataType.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InternetApplications")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createInternetApplications(String value)
/*      */   {
/* 6581 */     return new JAXBElement(_InternetApplications_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MotherboardCompatibility")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMotherboardCompatibility(String value)
/*      */   {
/* 6591 */     return new JAXBElement(_MotherboardCompatibility_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="EffectiveInputArea")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createEffectiveInputArea(String value)
/*      */   {
/* 6601 */     return new JAXBElement(_EffectiveInputArea_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MemoryCardType")
/*      */   public JAXBElement<MemoryCardTypeValues> createMemoryCardType(MemoryCardTypeValues value)
/*      */   {
/* 6610 */     return new JAXBElement(_MemoryCardType_QNAME, MemoryCardTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PresentationRemoteOperatingDistance")
/*      */   public JAXBElement<LengthFiveDigitDimension> createPresentationRemoteOperatingDistance(LengthFiveDigitDimension value)
/*      */   {
/* 6619 */     return new JAXBElement(_PresentationRemoteOperatingDistance_QNAME, LengthFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfHandsets")
/*      */   public JAXBElement<BigInteger> createNumberOfHandsets(BigInteger value)
/*      */   {
/* 6628 */     return new JAXBElement(_NumberOfHandsets_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinAperture")
/*      */   public JAXBElement<ApertureDimension> createMinAperture(ApertureDimension value)
/*      */   {
/* 6637 */     return new JAXBElement(_MinAperture_QNAME, ApertureDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinShutterSpeed")
/*      */   public JAXBElement<BigDecimal> createMinShutterSpeed(BigDecimal value)
/*      */   {
/* 6646 */     return new JAXBElement(_MinShutterSpeed_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfSATAPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfSATAPorts(BigInteger value)
/*      */   {
/* 6655 */     return new JAXBElement(_NumberOfSATAPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="KeyboardDescription")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createKeyboardDescription(String value)
/*      */   {
/* 6665 */     return new JAXBElement(_KeyboardDescription_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FrontWebcamResolution")
/*      */   public JAXBElement<ResolutionFiveDigitDimension> createFrontWebcamResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 6674 */     return new JAXBElement(_FrontWebcamResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PromotionClaimCode")
/*      */   public JAXBElement<String> createPromotionClaimCode(String value)
/*      */   {
/* 6683 */     return new JAXBElement(_PromotionClaimCode_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakerMaximumInputPower")
/*      */   public JAXBElement<PowerDimension> createSpeakerMaximumInputPower(PowerDimension value)
/*      */   {
/* 6692 */     return new JAXBElement(_SpeakerMaximumInputPower_QNAME, PowerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SubwooferPowerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSubwooferPowerTechnology(String value)
/*      */   {
/* 6702 */     return new JAXBElement(_SubwooferPowerTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfLithiumIonCells")
/*      */   public JAXBElement<BigInteger> createNumberOfLithiumIonCells(BigInteger value)
/*      */   {
/* 6711 */     return new JAXBElement(_NumberOfLithiumIonCells_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalHDMIPorts")
/*      */   public JAXBElement<BigInteger> createTotalHDMIPorts(BigInteger value)
/*      */   {
/* 6720 */     return new JAXBElement(_TotalHDMIPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeedRating")
/*      */   public JAXBElement<String> createSpeedRating(String value)
/*      */   {
/* 6729 */     return new JAXBElement(_SpeedRating_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ControlType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createControlType(String value)
/*      */   {
/* 6739 */     return new JAXBElement(_ControlType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfHDMIPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfHDMIPorts(BigInteger value)
/*      */   {
/* 6748 */     return new JAXBElement(_NumberOfHDMIPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Shape")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createShape(String value)
/*      */   {
/* 6758 */     return new JAXBElement(_Shape_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TweeterSpeakerDiameter")
/*      */   public JAXBElement<LengthDimension> createTweeterSpeakerDiameter(LengthDimension value)
/*      */   {
/* 6767 */     return new JAXBElement(_TweeterSpeakerDiameter_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalSVideoInPorts")
/*      */   public JAXBElement<BigInteger> createTotalSVideoInPorts(BigInteger value)
/*      */   {
/* 6776 */     return new JAXBElement(_TotalSVideoInPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalDVIPorts")
/*      */   public JAXBElement<BigInteger> createTotalDVIPorts(BigInteger value)
/*      */   {
/* 6785 */     return new JAXBElement(_TotalDVIPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PowerPlugType")
/*      */   public JAXBElement<PowerPlugType> createPowerPlugType(PowerPlugType value)
/*      */   {
/* 6794 */     return new JAXBElement(_PowerPlugType_QNAME, PowerPlugType.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="EnergyEfficiencyRating")
/*      */   public JAXBElement<String> createEnergyEfficiencyRating(String value)
/*      */   {
/* 6803 */     return new JAXBElement(_EnergyEfficiencyRating_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TunerTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createTunerTechnology(String value)
/*      */   {
/* 6813 */     return new JAXBElement(_TunerTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsCardMemoryType")
/*      */   public JAXBElement<String> createGraphicsCardMemoryType(String value)
/*      */   {
/* 6822 */     return new JAXBElement(_GraphicsCardMemoryType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AirDuctLocation")
/*      */   public JAXBElement<String> createAirDuctLocation(String value)
/*      */   {
/* 6831 */     return new JAXBElement(_AirDuctLocation_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FanMaximumSpeed")
/*      */   public JAXBElement<SpeedSixDigitDimension> createFanMaximumSpeed(SpeedSixDigitDimension value)
/*      */   {
/* 6840 */     return new JAXBElement(_FanMaximumSpeed_QNAME, SpeedSixDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ACAdapterIncluded")
/*      */   public JAXBElement<Boolean> createACAdapterIncluded(Boolean value)
/*      */   {
/* 6849 */     return new JAXBElement(_ACAdapterIncluded_QNAME, Boolean.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ThrowRatio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createThrowRatio(String value)
/*      */   {
/* 6859 */     return new JAXBElement(_ThrowRatio_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DisplayResolutionMaximum")
/*      */   public JAXBElement<String> createDisplayResolutionMaximum(String value)
/*      */   {
/* 6868 */     return new JAXBElement(_DisplayResolutionMaximum_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PlatformCompatability")
/*      */   public JAXBElement<String> createPlatformCompatability(String value)
/*      */   {
/* 6877 */     return new JAXBElement(_PlatformCompatability_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ComputerMemoryTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createComputerMemoryTechnology(String value)
/*      */   {
/* 6887 */     return new JAXBElement(_ComputerMemoryTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MerchantOrderItemID")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMerchantOrderItemID(String value)
/*      */   {
/* 6897 */     return new JAXBElement(_MerchantOrderItemID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OpticalIn")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createOpticalIn(String value)
/*      */   {
/* 6907 */     return new JAXBElement(_OpticalIn_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OpticalOut")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createOpticalOut(String value)
/*      */   {
/* 6917 */     return new JAXBElement(_OpticalOut_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Denomination")
/*      */   public JAXBElement<BigDecimal> createDenomination(BigDecimal value)
/*      */   {
/* 6926 */     return new JAXBElement(_Denomination_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPanelUSB2.0Ports")
/*      */   public JAXBElement<BigInteger> createTotalFrontPanelUSB20Ports(BigInteger value)
/*      */   {
/* 6935 */     return new JAXBElement(_TotalFrontPanelUSB20Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ComputerMemoryFormFactor")
/*      */   public JAXBElement<String> createComputerMemoryFormFactor(String value)
/*      */   {
/* 6944 */     return new JAXBElement(_ComputerMemoryFormFactor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FanLED")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFanLED(String value)
/*      */   {
/* 6954 */     return new JAXBElement(_FanLED_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MidRangeSpeakerDiameter")
/*      */   public JAXBElement<LengthDimension> createMidRangeSpeakerDiameter(LengthDimension value)
/*      */   {
/* 6963 */     return new JAXBElement(_MidRangeSpeakerDiameter_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InputVideoCompatability")
/*      */   public JAXBElement<String> createInputVideoCompatability(String value)
/*      */   {
/* 6972 */     return new JAXBElement(_InputVideoCompatability_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfFans")
/*      */   public JAXBElement<BigInteger> createNumberOfFans(BigInteger value)
/*      */   {
/* 6981 */     return new JAXBElement(_NumberOfFans_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsCardInterface")
/*      */   public JAXBElement<GraphicsCardInterfaceTypeValues> createGraphicsCardInterface(GraphicsCardInterfaceTypeValues value)
/*      */   {
/* 6990 */     return new JAXBElement(_GraphicsCardInterface_QNAME, GraphicsCardInterfaceTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HeadphoneEarcupMotion")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createHeadphoneEarcupMotion(String value)
/*      */   {
/* 7000 */     return new JAXBElement(_HeadphoneEarcupMotion_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Southbridge")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSouthbridge(String value)
/*      */   {
/* 7010 */     return new JAXBElement(_Southbridge_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PhotoFilterLensSize")
/*      */   public JAXBElement<LengthDimension> createPhotoFilterLensSize(LengthDimension value)
/*      */   {
/* 7019 */     return new JAXBElement(_PhotoFilterLensSize_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Series")
/*      */   public JAXBElement<String> createSeries(String value)
/*      */   {
/* 7028 */     return new JAXBElement(_Series_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxAperture")
/*      */   public JAXBElement<ApertureDimension> createMaxAperture(ApertureDimension value)
/*      */   {
/* 7037 */     return new JAXBElement(_MaxAperture_QNAME, ApertureDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AmazonOrderID")
/*      */   public JAXBElement<String> createAmazonOrderID(String value)
/*      */   {
/* 7046 */     return new JAXBElement(_AmazonOrderID_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="RefreshRate")
/*      */   public JAXBElement<FrequencyDimension> createRefreshRate(FrequencyDimension value)
/*      */   {
/* 7055 */     return new JAXBElement(_RefreshRate_QNAME, FrequencyDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BoxContents")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createBoxContents(String value)
/*      */   {
/* 7065 */     return new JAXBElement(_BoxContents_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TVTunerVideoStandard")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createTVTunerVideoStandard(String value)
/*      */   {
/* 7075 */     return new JAXBElement(_TVTunerVideoStandard_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="LargestFanSize")
/*      */   public JAXBElement<LengthFiveDigitDimension> createLargestFanSize(LengthFiveDigitDimension value)
/*      */   {
/* 7084 */     return new JAXBElement(_LargestFanSize_QNAME, LengthFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CacheMemory")
/*      */   public JAXBElement<MemorySizeIntegerDimension> createCacheMemory(MemorySizeIntegerDimension value)
/*      */   {
/* 7093 */     return new JAXBElement(_CacheMemory_QNAME, MemorySizeIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfRecordingLoops")
/*      */   public JAXBElement<BigInteger> createNumberOfRecordingLoops(BigInteger value)
/*      */   {
/* 7102 */     return new JAXBElement(_NumberOfRecordingLoops_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="GraphicsRAMSize")
/*      */   public JAXBElement<MemorySizeDimension> createGraphicsRAMSize(MemorySizeDimension value)
/*      */   {
/* 7111 */     return new JAXBElement(_GraphicsRAMSize_QNAME, MemorySizeDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfSerialPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfSerialPorts(BigInteger value)
/*      */   {
/* 7120 */     return new JAXBElement(_NumberOfSerialPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DigitalZoom")
/*      */   public JAXBElement<ZoomDimension> createDigitalZoom(ZoomDimension value)
/*      */   {
/* 7129 */     return new JAXBElement(_DigitalZoom_QNAME, ZoomDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TVTunerMemory")
/*      */   public JAXBElement<MemorySizeTenDigitIntegerDimension> createTVTunerMemory(MemorySizeTenDigitIntegerDimension value)
/*      */   {
/* 7138 */     return new JAXBElement(_TVTunerMemory_QNAME, MemorySizeTenDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ComputerMemoryType")
/*      */   public JAXBElement<String> createComputerMemoryType(String value)
/*      */   {
/* 7147 */     return new JAXBElement(_ComputerMemoryType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfPS2Ports")
/*      */   public JAXBElement<BigInteger> createNumberOfPS2Ports(BigInteger value)
/*      */   {
/* 7156 */     return new JAXBElement(_NumberOfPS2Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MemoryStandard")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMemoryStandard(String value)
/*      */   {
/* 7166 */     return new JAXBElement(_MemoryStandard_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CoreClock")
/*      */   public JAXBElement<FrequencyIntegerDimension> createCoreClock(FrequencyIntegerDimension value)
/*      */   {
/* 7175 */     return new JAXBElement(_CoreClock_QNAME, FrequencyIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SVideoInputType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSVideoInputType(String value)
/*      */   {
/* 7185 */     return new JAXBElement(_SVideoInputType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="IPProtocolStandards")
/*      */   public JAXBElement<String> createIPProtocolStandards(String value)
/*      */   {
/* 7194 */     return new JAXBElement(_IPProtocolStandards_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AudioOutputMode")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAudioOutputMode(String value)
/*      */   {
/* 7204 */     return new JAXBElement(_AudioOutputMode_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BluRayRegion")
/*      */   public JAXBElement<BluRayRegionType> createBluRayRegion(BluRayRegionType value)
/*      */   {
/* 7213 */     return new JAXBElement(_BluRayRegion_QNAME, BluRayRegionType.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ThreeDAPI")
/*      */   public JAXBElement<String> createThreeDAPI(String value)
/*      */   {
/* 7222 */     return new JAXBElement(_ThreeDAPI_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TweeterSpeakerMaterial")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createTweeterSpeakerMaterial(String value)
/*      */   {
/* 7232 */     return new JAXBElement(_TweeterSpeakerMaterial_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="OpticalZoom")
/*      */   public JAXBElement<ZoomDimension> createOpticalZoom(ZoomDimension value)
/*      */   {
/* 7241 */     return new JAXBElement(_OpticalZoom_QNAME, ZoomDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalHdmiPorts")
/*      */   public JAXBElement<BigInteger> createTotalHdmiPorts(BigInteger value)
/*      */   {
/* 7250 */     return new JAXBElement(_TotalHdmiPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CableType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCableType(String value)
/*      */   {
/* 7260 */     return new JAXBElement(_CableType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PowerFactorCorrection")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPowerFactorCorrection(String value)
/*      */   {
/* 7270 */     return new JAXBElement(_PowerFactorCorrection_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfUSBPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfUSBPorts(BigInteger value)
/*      */   {
/* 7279 */     return new JAXBElement(_NumberOfUSBPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FrontPanelInputs")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createFrontPanelInputs(String value)
/*      */   {
/* 7289 */     return new JAXBElement(_FrontPanelInputs_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InputDeviceDesignStyle")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createInputDeviceDesignStyle(String value)
/*      */   {
/* 7299 */     return new JAXBElement(_InputDeviceDesignStyle_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CarrierCode")
/*      */   public JAXBElement<String> createCarrierCode(String value)
/*      */   {
/* 7308 */     return new JAXBElement(_CarrierCode_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SystemCabinetFormFactor")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createSystemCabinetFormFactor(String value)
/*      */   {
/* 7318 */     return new JAXBElement(_SystemCabinetFormFactor_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxEthernetSpeed")
/*      */   public JAXBElement<MaxEthernetSpeedTypeValues> createMaxEthernetSpeed(MaxEthernetSpeedTypeValues value)
/*      */   {
/* 7327 */     return new JAXBElement(_MaxEthernetSpeed_QNAME, MaxEthernetSpeedTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MemoryCapacityPerSTICK")
/*      */   public JAXBElement<MemorySizeFiveDigitIntegerDimension> createMemoryCapacityPerSTICK(MemorySizeFiveDigitIntegerDimension value)
/*      */   {
/* 7336 */     return new JAXBElement(_MemoryCapacityPerSTICK_QNAME, MemorySizeFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="IncludedFeatures")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createIncludedFeatures(String value)
/*      */   {
/* 7346 */     return new JAXBElement(_IncludedFeatures_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFirewire800Connectors")
/*      */   public JAXBElement<BigInteger> createTotalFirewire800Connectors(BigInteger value)
/*      */   {
/* 7355 */     return new JAXBElement(_TotalFirewire800Connectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BaseLength")
/*      */   public JAXBElement<LengthDimension> createBaseLength(LengthDimension value)
/*      */   {
/* 7364 */     return new JAXBElement(_BaseLength_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumOperatingDistance")
/*      */   public JAXBElement<LengthIntegerDimension> createMaximumOperatingDistance(LengthIntegerDimension value)
/*      */   {
/* 7373 */     return new JAXBElement(_MaximumOperatingDistance_QNAME, LengthIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Wattage")
/*      */   public JAXBElement<BigInteger> createWattage(BigInteger value)
/*      */   {
/* 7382 */     return new JAXBElement(_Wattage_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Audio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAudio(String value)
/*      */   {
/* 7392 */     return new JAXBElement(_Audio_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WirelessType")
/*      */   public JAXBElement<String> createWirelessType(String value)
/*      */   {
/* 7401 */     return new JAXBElement(_WirelessType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WirelessRouterTransmissionBand")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createWirelessRouterTransmissionBand(String value)
/*      */   {
/* 7411 */     return new JAXBElement(_WirelessRouterTransmissionBand_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaximumSupportedScreenSize")
/*      */   public JAXBElement<LengthDimension> createMaximumSupportedScreenSize(LengthDimension value)
/*      */   {
/* 7420 */     return new JAXBElement(_MaximumSupportedScreenSize_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BufferSize")
/*      */   public JAXBElement<MemorySizeIntegerDimension> createBufferSize(MemorySizeIntegerDimension value)
/*      */   {
/* 7429 */     return new JAXBElement(_BufferSize_QNAME, MemorySizeIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CameraType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCameraType(String value)
/*      */   {
/* 7439 */     return new JAXBElement(_CameraType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TabletMaximumDataRate")
/*      */   public JAXBElement<TabletDataRateDimension> createTabletMaximumDataRate(TabletDataRateDimension value)
/*      */   {
/* 7448 */     return new JAXBElement(_TabletMaximumDataRate_QNAME, TabletDataRateDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SATAStandardsSupported")
/*      */   public JAXBElement<String> createSATAStandardsSupported(String value)
/*      */   {
/* 7457 */     return new JAXBElement(_SATAStandardsSupported_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="IntegratedAudioChannels")
/*      */   public JAXBElement<BigInteger> createIntegratedAudioChannels(BigInteger value)
/*      */   {
/* 7466 */     return new JAXBElement(_IntegratedAudioChannels_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ComputerWirelessType")
/*      */   public JAXBElement<String> createComputerWirelessType(String value)
/*      */   {
/* 7475 */     return new JAXBElement(_ComputerWirelessType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxMemorySpeed")
/*      */   public JAXBElement<BigDecimal> createMaxMemorySpeed(BigDecimal value)
/*      */   {
/* 7484 */     return new JAXBElement(_MaxMemorySpeed_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="FanMaximumAirflow")
/*      */   public JAXBElement<AirflowDimension> createFanMaximumAirflow(AirflowDimension value)
/*      */   {
/* 7493 */     return new JAXBElement(_FanMaximumAirflow_QNAME, AirflowDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfVGAPorts")
/*      */   public JAXBElement<BigInteger> createNumberOfVGAPorts(BigInteger value)
/*      */   {
/* 7502 */     return new JAXBElement(_NumberOfVGAPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ComponentWriteSpeed")
/*      */   public JAXBElement<BigInteger> createComponentWriteSpeed(BigInteger value)
/*      */   {
/* 7511 */     return new JAXBElement(_ComponentWriteSpeed_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SurgeProtectionRating")
/*      */   public JAXBElement<EnergyRatingType> createSurgeProtectionRating(EnergyRatingType value)
/*      */   {
/* 7520 */     return new JAXBElement(_SurgeProtectionRating_QNAME, EnergyRatingType.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalUSBPorts")
/*      */   public JAXBElement<BigInteger> createTotalUSBPorts(BigInteger value)
/*      */   {
/* 7529 */     return new JAXBElement(_TotalUSBPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CPUSocketType")
/*      */   public JAXBElement<String> createCPUSocketType(String value)
/*      */   {
/* 7538 */     return new JAXBElement(_CPUSocketType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProcessorSeries")
/*      */   public JAXBElement<ProcessorSeriesTypeValues> createProcessorSeries(ProcessorSeriesTypeValues value)
/*      */   {
/* 7547 */     return new JAXBElement(_ProcessorSeries_QNAME, ProcessorSeriesTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CompatibleDevices")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCompatibleDevices(String value)
/*      */   {
/* 7557 */     return new JAXBElement(_CompatibleDevices_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ContrastRatio")
/*      */   public JAXBElement<String> createContrastRatio(String value)
/*      */   {
/* 7566 */     return new JAXBElement(_ContrastRatio_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalVgaInPorts")
/*      */   public JAXBElement<BigInteger> createTotalVgaInPorts(BigInteger value)
/*      */   {
/* 7575 */     return new JAXBElement(_TotalVgaInPorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProjectionMethod")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createProjectionMethod(String value)
/*      */   {
/* 7585 */     return new JAXBElement(_ProjectionMethod_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TabletMinimumSystemRequirements")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createTabletMinimumSystemRequirements(String value)
/*      */   {
/* 7595 */     return new JAXBElement(_TabletMinimumSystemRequirements_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ReadSpeed")
/*      */   public JAXBElement<DataTransferSpeedIntegerDimension> createReadSpeed(DataTransferSpeedIntegerDimension value)
/*      */   {
/* 7604 */     return new JAXBElement(_ReadSpeed_QNAME, DataTransferSpeedIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ModemType")
/*      */   public JAXBElement<ModemTypeValues> createModemType(ModemTypeValues value)
/*      */   {
/* 7613 */     return new JAXBElement(_ModemType_QNAME, ModemTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ProductTaxCode")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createProductTaxCode(String value)
/*      */   {
/* 7623 */     return new JAXBElement(_ProductTaxCode_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AspectRatio")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createAspectRatio(String value)
/*      */   {
/* 7633 */     return new JAXBElement(_AspectRatio_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PhotoFilterMountType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createPhotoFilterMountType(String value)
/*      */   {
/* 7643 */     return new JAXBElement(_PhotoFilterMountType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinimumThrowRatio")
/*      */   public JAXBElement<String> createMinimumThrowRatio(String value)
/*      */   {
/* 7652 */     return new JAXBElement(_MinimumThrowRatio_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="WebcamVideoCaptureResolution")
/*      */   public JAXBElement<ResolutionFiveDigitDimension> createWebcamVideoCaptureResolution(ResolutionFiveDigitDimension value)
/*      */   {
/* 7661 */     return new JAXBElement(_WebcamVideoCaptureResolution_QNAME, ResolutionFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HardDiskRotationalSpeed")
/*      */   public JAXBElement<BigDecimal> createHardDiskRotationalSpeed(BigDecimal value)
/*      */   {
/* 7670 */     return new JAXBElement(_HardDiskRotationalSpeed_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PrintingMediaType")
/*      */   public JAXBElement<PrintingMediaTypeValues> createPrintingMediaType(PrintingMediaTypeValues value)
/*      */   {
/* 7679 */     return new JAXBElement(_PrintingMediaType_QNAME, PrintingMediaTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NotebookDisplayTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createNotebookDisplayTechnology(String value)
/*      */   {
/* 7689 */     return new JAXBElement(_NotebookDisplayTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SpeakerDiameter")
/*      */   public JAXBElement<LengthDimension> createSpeakerDiameter(LengthDimension value)
/*      */   {
/* 7698 */     return new JAXBElement(_SpeakerDiameter_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPanelFirewire800Ports")
/*      */   public JAXBElement<BigInteger> createTotalFrontPanelFirewire800Ports(BigInteger value)
/*      */   {
/* 7707 */     return new JAXBElement(_TotalFrontPanelFirewire800Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CompatibleMountings")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createCompatibleMountings(String value)
/*      */   {
/* 7717 */     return new JAXBElement(_CompatibleMountings_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HandOrientation")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createHandOrientation(String value)
/*      */   {
/* 7727 */     return new JAXBElement(_HandOrientation_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="ChipsetType")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createChipsetType(String value)
/*      */   {
/* 7737 */     return new JAXBElement(_ChipsetType_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MonitorBrightness")
/*      */   public JAXBElement<LuminanceFiveDigitDimension> createMonitorBrightness(LuminanceFiveDigitDimension value)
/*      */   {
/* 7746 */     return new JAXBElement(_MonitorBrightness_QNAME, LuminanceFiveDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalUSB1.0Connectors")
/*      */   public JAXBElement<BigInteger> createTotalUSB10Connectors(BigInteger value)
/*      */   {
/* 7755 */     return new JAXBElement(_TotalUSB10Connectors_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="InputType")
/*      */   public JAXBElement<InputTypeValues> createInputType(InputTypeValues value)
/*      */   {
/* 7764 */     return new JAXBElement(_InputType_QNAME, InputTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MaxUpstreamTransmissionRate")
/*      */   public JAXBElement<DataTransferSpeedFiveDigitIntegerDimension> createMaxUpstreamTransmissionRate(DataTransferSpeedFiveDigitIntegerDimension value)
/*      */   {
/* 7773 */     return new JAXBElement(_MaxUpstreamTransmissionRate_QNAME, DataTransferSpeedFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinimumSupportedScreenSize")
/*      */   public JAXBElement<LengthDimension> createMinimumSupportedScreenSize(LengthDimension value)
/*      */   {
/* 7782 */     return new JAXBElement(_MinimumSupportedScreenSize_QNAME, LengthDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="SampleRate")
/*      */   public JAXBElement<FrequencyThreeDigitIntegerDimension> createSampleRate(FrequencyThreeDigitIntegerDimension value)
/*      */   {
/* 7791 */     return new JAXBElement(_SampleRate_QNAME, FrequencyThreeDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="DockingStationExternalInterface")
/*      */   public JAXBElement<DockingStationExternalInterfaceTypeValues> createDockingStationExternalInterface(DockingStationExternalInterfaceTypeValues value)
/*      */   {
/* 7800 */     return new JAXBElement(_DockingStationExternalInterface_QNAME, DockingStationExternalInterfaceTypeValues.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PowerSupplyMaxOutput")
/*      */   public JAXBElement<PowerSixDigitDimension> createPowerSupplyMaxOutput(PowerSixDigitDimension value)
/*      */   {
/* 7809 */     return new JAXBElement(_PowerSupplyMaxOutput_QNAME, PowerSixDigitDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalMicrophonePorts")
/*      */   public JAXBElement<BigInteger> createTotalMicrophonePorts(BigInteger value)
/*      */   {
/* 7818 */     return new JAXBElement(_TotalMicrophonePorts_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MediaInput")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createMediaInput(String value)
/*      */   {
/* 7828 */     return new JAXBElement(_MediaInput_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="Modular")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createModular(String value)
/*      */   {
/* 7838 */     return new JAXBElement(_Modular_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="TotalFrontPanelUSB1.1Ports")
/*      */   public JAXBElement<BigInteger> createTotalFrontPanelUSB11Ports(BigInteger value)
/*      */   {
/* 7847 */     return new JAXBElement(_TotalFrontPanelUSB11Ports_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="PhysicalHardDriveFormFactor")
/*      */   public JAXBElement<BigDecimal> createPhysicalHardDriveFormFactor(BigDecimal value)
/*      */   {
/* 7856 */     return new JAXBElement(_PhysicalHardDriveFormFactor_QNAME, BigDecimal.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfInternalBays")
/*      */   public JAXBElement<BigInteger> createNumberOfInternalBays(BigInteger value)
/*      */   {
/* 7865 */     return new JAXBElement(_NumberOfInternalBays_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NoiseCanceling")
/*      */   public JAXBElement<String> createNoiseCanceling(String value)
/*      */   {
/* 7874 */     return new JAXBElement(_NoiseCanceling_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="BuiltInMicrophone")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createBuiltInMicrophone(String value)
/*      */   {
/* 7884 */     return new JAXBElement(_BuiltInMicrophone_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="HardDiskTechnology")
/*      */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*      */   public JAXBElement<String> createHardDiskTechnology(String value)
/*      */   {
/* 7894 */     return new JAXBElement(_HardDiskTechnology_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="MinimumVerticalRefreshRate")
/*      */   public JAXBElement<FrequencyFiveDigitIntegerDimension> createMinimumVerticalRefreshRate(FrequencyFiveDigitIntegerDimension value)
/*      */   {
/* 7903 */     return new JAXBElement(_MinimumVerticalRefreshRate_QNAME, FrequencyFiveDigitIntegerDimension.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="AdditionalFunctionality")
/*      */   public JAXBElement<String> createAdditionalFunctionality(String value)
/*      */   {
/* 7912 */     return new JAXBElement(_AdditionalFunctionality_QNAME, String.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="NumberOfMemorySlots")
/*      */   public JAXBElement<BigInteger> createNumberOfMemorySlots(BigInteger value)
/*      */   {
/* 7921 */     return new JAXBElement(_NumberOfMemorySlots_QNAME, BigInteger.class, null, value);
/*      */   }
/*      */ 
/*      */   @XmlElementDecl(namespace="", name="CableSpeed")
/*      */   public JAXBElement<DataTransferSpeedDimension> createCableSpeed(DataTransferSpeedDimension value)
/*      */   {
/* 7930 */     return new JAXBElement(_CableSpeed_QNAME, DataTransferSpeedDimension.class, null, value);
/*      */   }
/*      */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ObjectFactory
 * JD-Core Version:    0.6.2
 */