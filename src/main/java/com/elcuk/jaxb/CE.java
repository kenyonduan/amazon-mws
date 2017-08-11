
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
 *         &lt;element name="Rebate" type="{}RebateType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ProductType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}Antenna"/>
 *                   &lt;element ref="{}AudioVideoAccessory"/>
 *                   &lt;element ref="{}AVFurniture"/>
 *                   &lt;element ref="{}BarCodeReader"/>
 *                   &lt;element ref="{}CEBinocular"/>
 *                   &lt;element ref="{}CECamcorder"/>
 *                   &lt;element ref="{}CameraBagsAndCases"/>
 *                   &lt;element ref="{}CEBattery"/>
 *                   &lt;element ref="{}CEBlankMedia"/>
 *                   &lt;element ref="{}CableOrAdapter"/>
 *                   &lt;element ref="{}CECameraFlash"/>
 *                   &lt;element ref="{}CameraLenses"/>
 *                   &lt;element ref="{}CameraOtherAccessories"/>
 *                   &lt;element ref="{}CameraPowerSupply"/>
 *                   &lt;element ref="{}CarAlarm"/>
 *                   &lt;element ref="{}CarAudioOrTheater"/>
 *                   &lt;element ref="{}CarElectronics"/>
 *                   &lt;element ref="{}ConsumerElectronics"/>
 *                   &lt;element ref="{}CEDigitalCamera"/>
 *                   &lt;element ref="{}DigitalPictureFrame"/>
 *                   &lt;element ref="{}DigitalVideoRecorder"/>
 *                   &lt;element ref="{}DVDPlayerOrRecorder"/>
 *                   &lt;element ref="{}CEFilmCamera"/>
 *                   &lt;element ref="{}GPSOrNavigationAccessory"/>
 *                   &lt;element ref="{}GPSOrNavigationSystem"/>
 *                   &lt;element ref="{}HandheldOrPDA"/>
 *                   &lt;element ref="{}Headphones"/>
 *                   &lt;element ref="{}HomeTheaterSystemOrHTIB"/>
 *                   &lt;element ref="{}KindleAccessories"/>
 *                   &lt;element ref="{}KindleEReaderAccessories"/>
 *                   &lt;element ref="{}KindleFireAccessories"/>
 *                   &lt;element ref="{}MediaPlayer"/>
 *                   &lt;element ref="{}MediaPlayerOrEReaderAccessory"/>
 *                   &lt;element ref="{}MediaStorage"/>
 *                   &lt;element ref="{}MiscAudioComponents"/>
 *                   &lt;element ref="{}PC"/>
 *                   &lt;element ref="{}PDA"/>
 *                   &lt;element ref="{}Phone"/>
 *                   &lt;element ref="{}PhoneAccessory"/>
 *                   &lt;element ref="{}PhotographicStudioItems"/>
 *                   &lt;element ref="{}PortableAudio"/>
 *                   &lt;element ref="{}PortableAvDevice"/>
 *                   &lt;element ref="{}PowerSuppliesOrProtection"/>
 *                   &lt;element ref="{}RadarDetector"/>
 *                   &lt;element ref="{}RadioOrClockRadio"/>
 *                   &lt;element ref="{}ReceiverOrAmplifier"/>
 *                   &lt;element ref="{}RemoteControl"/>
 *                   &lt;element ref="{}Speakers"/>
 *                   &lt;element ref="{}StereoShelfSystem"/>
 *                   &lt;element ref="{}CETelescope"/>
 *                   &lt;element ref="{}Television"/>
 *                   &lt;element ref="{}Tuner"/>
 *                   &lt;element ref="{}TVCombos"/>
 *                   &lt;element ref="{}TwoWayRadio"/>
 *                   &lt;element ref="{}VCR"/>
 *                   &lt;element ref="{}CEVideoProjector"/>
 *                   &lt;element ref="{}VideoProjectorsAndAccessories"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductSubtype" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Antenna"/>
 *               &lt;enumeration value="AVFurniture"/>
 *               &lt;enumeration value="BarCodeReader"/>
 *               &lt;enumeration value="CEBinocular"/>
 *               &lt;enumeration value="CECamcorder"/>
 *               &lt;enumeration value="CameraBagsAndCases"/>
 *               &lt;enumeration value="Battery"/>
 *               &lt;enumeration value="BlankMedia"/>
 *               &lt;enumeration value="CableOrAdapter"/>
 *               &lt;enumeration value="CECameraFlash"/>
 *               &lt;enumeration value="CameraLenses"/>
 *               &lt;enumeration value="CameraOtherAccessories"/>
 *               &lt;enumeration value="CameraPowerSupply"/>
 *               &lt;enumeration value="CarAudioOrTheater"/>
 *               &lt;enumeration value="CarElectronics"/>
 *               &lt;enumeration value="CEDigitalCamera"/>
 *               &lt;enumeration value="DigitalPictureFrame"/>
 *               &lt;enumeration value="CECarryingCaseOrBag"/>
 *               &lt;enumeration value="CombinedAvDevice"/>
 *               &lt;enumeration value="Computer"/>
 *               &lt;enumeration value="ComputerDriveOrStorage"/>
 *               &lt;enumeration value="ComputerProcessor"/>
 *               &lt;enumeration value="ComputerVideoGameController"/>
 *               &lt;enumeration value="DigitalVideoRecorder"/>
 *               &lt;enumeration value="DVDPlayerOrRecorder"/>
 *               &lt;enumeration value="CEFilmCamera"/>
 *               &lt;enumeration value="FlashMemory"/>
 *               &lt;enumeration value="GPSOrNavigationAccessory"/>
 *               &lt;enumeration value="GPSOrNavigationSystem"/>
 *               &lt;enumeration value="HandheldOrPDA"/>
 *               &lt;enumeration value="HomeTheaterSystemOrHTIB"/>
 *               &lt;enumeration value="Keyboards"/>
 *               &lt;enumeration value="MemoryReader"/>
 *               &lt;enumeration value="Microphone"/>
 *               &lt;enumeration value="Monitor"/>
 *               &lt;enumeration value="MP3Player"/>
 *               &lt;enumeration value="MultifunctionOfficeMachine"/>
 *               &lt;enumeration value="NetworkAdapter"/>
 *               &lt;enumeration value="NetworkMediaPlayer"/>
 *               &lt;enumeration value="NetworkStorage"/>
 *               &lt;enumeration value="NetworkTransceiver"/>
 *               &lt;enumeration value="NetworkingDevice"/>
 *               &lt;enumeration value="NetworkingHub"/>
 *               &lt;enumeration value="Phone"/>
 *               &lt;enumeration value="PhoneAccessory"/>
 *               &lt;enumeration value="PhotographicStudioItems"/>
 *               &lt;enumeration value="PointingDevice"/>
 *               &lt;enumeration value="PortableAudio"/>
 *               &lt;enumeration value="PortableAvDevice"/>
 *               &lt;enumeration value="PortableElectronics"/>
 *               &lt;enumeration value="Printer"/>
 *               &lt;enumeration value="PrinterConsumable"/>
 *               &lt;enumeration value="ReceiverOrAmplifier"/>
 *               &lt;enumeration value="RemoteControl"/>
 *               &lt;enumeration value="SatelliteOrDSS"/>
 *               &lt;enumeration value="Scanner"/>
 *               &lt;enumeration value="SoundCard"/>
 *               &lt;enumeration value="Speakers"/>
 *               &lt;enumeration value="CETelescope"/>
 *               &lt;enumeration value="SystemCabinet"/>
 *               &lt;enumeration value="SystemPowerDevice"/>
 *               &lt;enumeration value="Television"/>
 *               &lt;enumeration value="TwoWayRadio"/>
 *               &lt;enumeration value="VCR"/>
 *               &lt;enumeration value="VideoCard"/>
 *               &lt;enumeration value="VideoProjector"/>
 *               &lt;enumeration value="VideoProjectorsAndAccessories"/>
 *               &lt;enumeration value="Webcam"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AnalogVideoFormat" type="{}StringNotNull" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="AnnualEnergyConsumption" type="{}EnergyConsumptionDimension" minOccurs="0"/>
 *         &lt;element name="AnsweringSystemType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="AntennaLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="AntennaType" type="{}AntennaTypeValues" minOccurs="0"/>
 *         &lt;element name="AspectRatio" type="{}AspectRatio" minOccurs="0"/>
 *         &lt;element name="AudioFeaturesDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="AudioInput" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="AudioOutputEffects" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="AudioOutputMode" type="{}StringNotNull" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="AudioOutputResponseBandwidth" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="AudioOutputType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="AudioSensitivity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="AutoRedial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLife" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLifeTalkTime" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="BufferSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumIon" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumMetal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BiometricSecurityFeatures" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="BuiltInDecoders" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="ButtonQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="CabinetMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CableFeature" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CableTechnology" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CableType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CacheMemoryInstalledSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="CallAlerts" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CallerIdentification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CarryingStrap" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CassetteSystemType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CDChangerType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CDDiskCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="CDLoadType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CDPlaybackMode" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CDSystemType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CellularEnhancementProtocol" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CoaxialDigitalInput" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CoaxialDigitalOutput" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorDepth" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorSupport" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="CompatibleCartridge" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="CompatibleDevices" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="ComponentType" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="CompressedCapacity" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="ComputerPeripheralConnector" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ConferenceCallCapability" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ConnectivityProtocol" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ConnectivityTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CopierType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CopySizeMaximum" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="CrossoverFrequency" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DACDataWidth" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DataCompressionProtocol" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DataLinkProtocol" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DataService" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DataStorageCapability" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DataTransferRate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
 *                 &lt;attribute name="unitOfMeasure" use="required" type="{}DataTransferUnitOfMeasure" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DeviceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DGPS" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DialerType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DigitalPlayerType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DigitalRecordingTime" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DigitalSignalingProtocol" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DigitalStorageCapacity" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="DigitalZoom" type="{}ZoomDimension" minOccurs="0"/>
 *         &lt;element name="DisplayColorSupport" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DisplayLanguageOptions" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayLineQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="DisplayResolutionMaximum" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DisplayType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DockingStationExternalInterface" type="{}DockingStationExternalInterfaceTypeValues" minOccurs="0"/>
 *         &lt;element name="DriveUnits" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Duplex" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DVDDiskCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="DVDDiskChangerType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DVDMediaLoadType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DVDPictureZoomPower" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DVDPlaybackMode" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="DVDType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DVRCompressionRate" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="DVRMaxRecordingTime" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="DVRServiceDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Enclosure" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Equalizer" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="EqualizerBandChannels" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ErrorCorrectionProtocol" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="EyeRelief" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="FaceplateType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FaxMachineCompatibility" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FaxType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FlashMemoryInstalledSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="FloppyDiskDrive" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1_44_mb_3_5_inch"/>
 *               &lt;enumeration value="720_kb_3_5_inch"/>
 *               &lt;enumeration value="floppy_cd_drive_combo"/>
 *               &lt;enumeration value="floppy_cd_rw_dvd_rom_combo"/>
 *               &lt;enumeration value="floppy_dvd_drive_combo"/>
 *               &lt;enumeration value="ls_120_superdisk"/>
 *               &lt;enumeration value="none"/>
 *               &lt;enumeration value="unknown"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FormFactor" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="FreeAirResonantFrequency" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="FrequencyRange" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="FrequencyRequired" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FrequencyResponseCurve" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="FrontAccessibleBaysQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="FuseDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GPSNavigation" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GraphicsCoprocessor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GraphicsCoprocessorQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="GraphicsRam" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="GreyscaleDepth" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="HandsetDepth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="HandsetHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="HandsetLocator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandsetWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="HandsetWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="HardDiskDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HardDiskInstalledQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="HardDiskRotationalSpeed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="HardwareInterface" type="{}HardwareInterfaceValues" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="HasCommercialSkip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasDVDPictureZoom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasParentalChannelLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HeadphonesFormFactor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HeadphonesJack" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HeadphonesTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="HorizontalResolution" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="HotSwapBaysQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="HumanInterfaceInput" type="{}HumanInterfaceInputType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="HumanInterfaceOutput" type="{}HumanInterfaceOutputType" minOccurs="0"/>
 *         &lt;element name="ImageAspectRatio" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ImageBrightness" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ImageContrastRatio" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Impedance" type="{}ResistanceDimension" minOccurs="0"/>
 *         &lt;element name="IncludesMP3Player" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludesRechargableBattery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludesRemote" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncludesSpeakerphone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InputAdapter" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="InputChannelQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="InputConnection" type="{}Connection" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="InputConnectorType" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="InputDevice" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="InputDeviceInterface" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="Intercom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InternalBaysQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ISDNTerminalAdapterInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IsHDTVCompatible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWaterproof" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemDisplayDepth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemDisplayHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemDisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemDisplayLengthMaximum" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="ItemDisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="ItemDisplayWidth" type="{}LengthDimension" minOccurs="0"/>
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
 *         &lt;element name="KeyboardDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LampType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LeftConnectorGender" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LeftConnectorType" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ManufacturerWarrantyType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MapType" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MaterialComposition" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="MaterialType" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="MaxCopyResolutionBlackWhite" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxCopyResolutionColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumBridgedOutputPower" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MaximumExternalResolution" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumImageSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumLinearPeakExcursion" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumOutputPower" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaximumRange" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumRangeIndoors" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaximumSampleRate" type="{}FrequencyDimension" minOccurs="0"/>
 *         &lt;element name="MaximumScreenDistance" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MaxInputSheetCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="MaxPrintResolutionBlackWhite" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MaxPrintResolutionColor" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MediaFormat" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MediaLoadType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MediaSizeMaximum" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MediaType" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="MemoryStorageCapacity" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="MemoryTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionLabor" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfgWarrantyDescriptionParts" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MicrophoneFormFactor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MicrophoneOperationMode" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MicrophoneTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MiniDiscSystem" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MinimumImageSize" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MinimumScreenDistance" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MinimumSystemRequirementDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Model" type="{}FortyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ModelName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ModemDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ModemInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ModemType" type="{}ModemTypeValues" minOccurs="0"/>
 *         &lt;element name="MonthlyDutyCycle" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MountingHoleDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="MovementDetectionTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MultilineOperation" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MultimediaFunctionality" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="NavigationRoutes" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NetworkingFeature" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="NetworkInterfaceDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfPorts" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfSupportedZones" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="ObjectiveLensDiameter" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="OperatingHumidity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OpticalDigitalInput" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OpticalDigitalOutput" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OpticalSensorInterpolatedResolution" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element name="OpticalSensorResolution" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element name="OpticalStorageDevice" type="{}StringNotNull" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="OpticalStorageInstalledQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="OpticalStorageReadSpeed" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OpticalStorageRewriteSpeed" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OpticalStorageSecondaryReadSpeed" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OpticalStorageSecondaryRewriteSpeed" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OpticalStorageSecondaryType" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="OpticalStorageSecondaryWriteSpeed" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OpticalStorageWriteSpeed" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="OutputChannelQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="OutputConnection" type="{}Connection" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="OutputConnectorQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="OutputConnectorType" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="OutputPower" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="OutputWattage" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PackageContentType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PackageTypeName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PCConnectionAvailable" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PhoneBaseDepth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="PhoneBaseHeight" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="PhoneBaseWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="PhoneBaseWidth" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="PortedBoxVolume" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>StringNotNull">
 *                 &lt;attribute name="unitOfMeasure" use="required" type="{}VolumeUnitOfMeasure" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PowerAmplifierClass" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PowerDevice" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PowerGain" type="{}VoltageIntegerDimension" minOccurs="0"/>
 *         &lt;element name="PowerLoadRating" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PreampOutputChannels" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="PresetChannelQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="PrinterInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PrinterOutput" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PrinterResolutionBWHorizontalMax" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element name="PrinterResolutionBWVerticalMax" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element name="PrinterResolutionColorHorizontalMax" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element name="PrinterResolutionColorVerticalMax" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element name="PrinterTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorMaximum" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ProcessorModelNumber" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ProcessorUpgrade" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Programmability" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="QtsTotalQFactor" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="RadioBandsSupported" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RadioChannels" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RAIDLevel" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="RAMMemoryInstalledSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="RAMMemoryMaximumSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="RAMMemoryTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RangefinderType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ReceiverDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RecordingCapacity" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="RemoteControlAudioControls" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="RemoteControlDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemoteControlTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemoteManagementProtocol" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="RemovableMediaCapacity" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="RemovableMemory" type="{}RemovableMemoryValues" minOccurs="0"/>
 *         &lt;element name="RemovableStorage" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemovableStorageInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemovableStorageNativeCapacity" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="ResponseTime" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="RightConnectorGender" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RightConnectorType" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="RoutingProtocol" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SatelliteServiceDescription" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SBAS" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="ScanElementType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScannerInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScannerType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SCSISignalingType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SealedBoxVolume" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>StringNotNull">
 *                 &lt;attribute name="unitOfMeasure" use="required" type="{}VolumeUnitOfMeasure" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SearchSpeed" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SecondaryCache" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="SignalToNoiseRatio" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeakerAmplificationType" type="{}HundredString" minOccurs="0"/>
 *         &lt;element name="SpeakerConnectivity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeakerDriverMaterial" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeakersCrossoverChannelQuantity" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SpeakersIncludedDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeakersMaximumOutputPower" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="SpeakersNominalOutputPower" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="SpeakersResponseBandwidth" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeakerSystemClass" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpeakerType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SpecialFeatures" type="{}LongStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SpecificationMet" type="{}HundredString" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SpecificUses" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SSDDriveArchitechture" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StandardInputSheetCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="StorageController" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StorageControllerInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StorageHumidity" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StorageInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="StyleName" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SupportedAudioFormat" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SupportedDevices" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SupportedDevicesQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="SupportedImageFormat" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SupportedImageType" type="{}SupportedImageTypeValues" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SupportedMediaSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SupportedMotherboard" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SupportedStandards" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SurgeSuppression" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SurroundSoundChannels" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SurroundSoundEffects" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SwitchingProtocol" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SystemBusSpeed" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="TalkRangeMaximum" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="TapeLength" type="{}TimeDimension" minOccurs="0"/>
 *         &lt;element name="TelevisionInterface" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TelevisionPCInterfaceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TemperatureRating" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TotalHarmonicDistortion" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TracklogPoints" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Tracks" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TransportProtocol" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="Tuner" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="TunerTechnology" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TVTunerSecondaryAudioProgram" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UPSTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VCRType" type="{}StringNotNull" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="VerticalResolution" type="{}PixelDimension" minOccurs="0"/>
 *         &lt;element name="VideoCaptureFormat" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideoCaptureResolution" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideoHeadQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="VideoInput" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideoInputDigitalStandard" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideoInputFormat" type="{}StringNotNull" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="VideoOutputFormat" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VideoOutput" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideoOutputInterface" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideoOutputMode" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VideoPlaybackFormat" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideotapePlaybackSpeed" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VideotapeRecordingSpeed" type="{}VideotapeRecordingSpeedType" minOccurs="0"/>
 *         &lt;element name="VoiceCommunicationSupport" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VoiceCoilDescription" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VoicemailCapability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VoiceOperatedTransmission" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="VOIPProtocols" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="VolumeAcousticSuspension" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="WarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="WaterproofRating" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Waypoints" type="{}Dimension" minOccurs="0"/>
 *         &lt;element name="WaypointsPerRoute" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Weatherproof" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="WriteSpeed" type="{}StringNotNull" minOccurs="0"/>
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
    "rebate",
    "productType",
    "productSubtype",
    "analogVideoFormat",
    "annualEnergyConsumption",
    "answeringSystemType",
    "antennaLength",
    "antennaType",
    "aspectRatio",
    "audioFeaturesDescription",
    "audioInput",
    "audioOutputEffects",
    "audioOutputMode",
    "audioOutputResponseBandwidth",
    "audioOutputType",
    "audioSensitivity",
    "autoRedial",
    "battery",
    "batteryAverageLife",
    "batteryAverageLifeTalkTime",
    "bufferSize",
    "batteryTypeLithiumIon",
    "batteryTypeLithiumMetal",
    "biometricSecurityFeatures",
    "builtInDecoders",
    "buttonQuantity",
    "cabinetMaterial",
    "cableFeature",
    "cableTechnology",
    "cableType",
    "cacheMemoryInstalledSize",
    "callAlerts",
    "callerIdentification",
    "carryingStrap",
    "cassetteSystemType",
    "cdChangerType",
    "cdDiskCapacity",
    "cdLoadType",
    "cdPlaybackMode",
    "cdSystemType",
    "cellularEnhancementProtocol",
    "coaxialDigitalInput",
    "coaxialDigitalOutput",
    "color",
    "colorDepth",
    "colorMap",
    "colorSupport",
    "compatibleCartridge",
    "compatibleDevices",
    "componentType",
    "compressedCapacity",
    "computerPeripheralConnector",
    "conferenceCallCapability",
    "connectivityProtocol",
    "connectivityTechnology",
    "copierType",
    "copySizeMaximum",
    "countryOfOrigin",
    "crossoverFrequency",
    "dacDataWidth",
    "dataCompressionProtocol",
    "dataLinkProtocol",
    "dataService",
    "dataStorageCapability",
    "dataTransferRate",
    "deviceType",
    "dgps",
    "dialerType",
    "digitalPlayerType",
    "digitalRecordingTime",
    "digitalSignalingProtocol",
    "digitalStorageCapacity",
    "digitalZoom",
    "displayColorSupport",
    "displayLanguageOptions",
    "displayLineQuantity",
    "displayResolutionMaximum",
    "displayTechnology",
    "displayType",
    "dockingStationExternalInterface",
    "driveUnits",
    "duplex",
    "dvdDiskCapacity",
    "dvdDiskChangerType",
    "dvdMediaLoadType",
    "dvdPictureZoomPower",
    "dvdPlaybackMode",
    "dvdType",
    "dvrCompressionRate",
    "dvrMaxRecordingTime",
    "dvrServiceDescription",
    "enclosure",
    "equalizer",
    "equalizerBandChannels",
    "errorCorrectionProtocol",
    "eyeRelief",
    "faceplateType",
    "faxMachineCompatibility",
    "faxType",
    "flashMemoryInstalledSize",
    "floppyDiskDrive",
    "formFactor",
    "freeAirResonantFrequency",
    "frequencyRange",
    "frequencyRequired",
    "frequencyResponseCurve",
    "frontAccessibleBaysQuantity",
    "fuseDescription",
    "gpsNavigation",
    "graphicsCoprocessor",
    "graphicsCoprocessorQuantity",
    "graphicsRam",
    "greyscaleDepth",
    "handsetDepth",
    "handsetHeight",
    "handsetLocator",
    "handsetWeight",
    "handsetWidth",
    "hardDiskDescription",
    "hardDiskInstalledQuantity",
    "hardDiskRotationalSpeed",
    "hardwareInterface",
    "hasCommercialSkip",
    "hasDVDPictureZoom",
    "hasParentalChannelLock",
    "headphonesFormFactor",
    "headphonesJack",
    "headphonesTechnology",
    "horizontalResolution",
    "hotSwapBaysQuantity",
    "humanInterfaceInput",
    "humanInterfaceOutput",
    "imageAspectRatio",
    "imageBrightness",
    "imageContrastRatio",
    "impedance",
    "includesMP3Player",
    "includesRechargableBattery",
    "includesRemote",
    "includesSpeakerphone",
    "inputAdapter",
    "inputChannelQuantity",
    "inputConnection",
    "inputConnectorType",
    "inputDevice",
    "inputDeviceInterface",
    "intercom",
    "internalBaysQuantity",
    "isdnTerminalAdapterInterface",
    "isHDTVCompatible",
    "isWaterproof",
    "itemDisplayDepth",
    "itemDisplayHeight",
    "itemDisplayLength",
    "itemDisplayLengthMaximum",
    "itemDisplayWeight",
    "itemDisplayWidth",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "keyboardDescription",
    "lampType",
    "leftConnectorGender",
    "leftConnectorType",
    "manufacturerWarrantyType",
    "mapType",
    "materialComposition",
    "materialType",
    "maxCopyResolutionBlackWhite",
    "maxCopyResolutionColor",
    "maximumBridgedOutputPower",
    "maximumExternalResolution",
    "maximumImageSize",
    "maximumLinearPeakExcursion",
    "maximumOutputPower",
    "maximumRange",
    "maximumRangeIndoors",
    "maximumSampleRate",
    "maximumScreenDistance",
    "maxInputSheetCapacity",
    "maxPrintResolutionBlackWhite",
    "maxPrintResolutionColor",
    "mediaFormat",
    "mediaLoadType",
    "mediaSizeMaximum",
    "mediaType",
    "memoryStorageCapacity",
    "memoryTechnology",
    "mfgWarrantyDescriptionLabor",
    "mfgWarrantyDescriptionParts",
    "microphoneFormFactor",
    "microphoneOperationMode",
    "microphoneTechnology",
    "miniDiscSystem",
    "minimumImageSize",
    "minimumScreenDistance",
    "minimumSystemRequirementDescription",
    "model",
    "modelName",
    "modemDescription",
    "modemInterface",
    "modemType",
    "monthlyDutyCycle",
    "mountingHoleDiameter",
    "movementDetectionTechnology",
    "multilineOperation",
    "multimediaFunctionality",
    "navigationRoutes",
    "networkingFeature",
    "networkInterfaceDescription",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "numberOfPorts",
    "numberOfSupportedZones",
    "objectiveLensDiameter",
    "operatingHumidity",
    "opticalDigitalInput",
    "opticalDigitalOutput",
    "opticalSensorInterpolatedResolution",
    "opticalSensorResolution",
    "opticalStorageDevice",
    "opticalStorageInstalledQuantity",
    "opticalStorageReadSpeed",
    "opticalStorageRewriteSpeed",
    "opticalStorageSecondaryReadSpeed",
    "opticalStorageSecondaryRewriteSpeed",
    "opticalStorageSecondaryType",
    "opticalStorageSecondaryWriteSpeed",
    "opticalStorageWriteSpeed",
    "outputChannelQuantity",
    "outputConnection",
    "outputConnectorQuantity",
    "outputConnectorType",
    "outputPower",
    "outputWattage",
    "packageContentType",
    "packageTypeName",
    "pcConnectionAvailable",
    "phoneBaseDepth",
    "phoneBaseHeight",
    "phoneBaseWeight",
    "phoneBaseWidth",
    "portedBoxVolume",
    "powerAmplifierClass",
    "powerDevice",
    "powerGain",
    "powerLoadRating",
    "preampOutputChannels",
    "presetChannelQuantity",
    "printerInterface",
    "printerOutput",
    "printerResolutionBWHorizontalMax",
    "printerResolutionBWVerticalMax",
    "printerResolutionColorHorizontalMax",
    "printerResolutionColorVerticalMax",
    "printerTechnology",
    "processorDescription",
    "processorMaximum",
    "processorModelNumber",
    "processorUpgrade",
    "programmability",
    "qtsTotalQFactor",
    "radioBandsSupported",
    "radioChannels",
    "raidLevel",
    "ramMemoryInstalledSize",
    "ramMemoryMaximumSize",
    "ramMemoryTechnology",
    "rangefinderType",
    "receiverDescription",
    "recordingCapacity",
    "remoteControlAudioControls",
    "remoteControlDescription",
    "remoteControlTechnology",
    "remoteManagementProtocol",
    "removableMediaCapacity",
    "removableMemory",
    "removableStorage",
    "removableStorageInterface",
    "removableStorageNativeCapacity",
    "responseTime",
    "rightConnectorGender",
    "rightConnectorType",
    "routingProtocol",
    "satelliteServiceDescription",
    "sbas",
    "scanElementType",
    "scannerInterface",
    "scannerType",
    "scsiSignalingType",
    "sealedBoxVolume",
    "searchSpeed",
    "secondaryCache",
    "sellerWarrantyDescription",
    "signalToNoiseRatio",
    "size",
    "speakerAmplificationType",
    "speakerConnectivity",
    "speakerDriverMaterial",
    "speakersCrossoverChannelQuantity",
    "speakersIncludedDescription",
    "speakersMaximumOutputPower",
    "speakersNominalOutputPower",
    "speakersResponseBandwidth",
    "speakerSystemClass",
    "speakerType",
    "specialFeatures",
    "specificationMet",
    "specificUses",
    "ssdDriveArchitechture",
    "standardInputSheetCapacity",
    "storageController",
    "storageControllerInterface",
    "storageHumidity",
    "storageInterface",
    "styleName",
    "supportedAudioFormat",
    "supportedDevices",
    "supportedDevicesQuantity",
    "supportedImageFormat",
    "supportedImageType",
    "supportedMediaSize",
    "supportedMotherboard",
    "supportedStandards",
    "surgeSuppression",
    "surroundSoundChannels",
    "surroundSoundEffects",
    "switchingProtocol",
    "systemBusSpeed",
    "talkRangeMaximum",
    "tapeLength",
    "televisionInterface",
    "televisionPCInterfaceType",
    "temperatureRating",
    "totalHarmonicDistortion",
    "tracklogPoints",
    "tracks",
    "transportProtocol",
    "tuner",
    "tunerTechnology",
    "tvTunerSecondaryAudioProgram",
    "upsTechnology",
    "vcrType",
    "verticalResolution",
    "videoCaptureFormat",
    "videoCaptureResolution",
    "videoHeadQuantity",
    "videoInput",
    "videoInputDigitalStandard",
    "videoInputFormat",
    "videoOutputFormat",
    "videoOutput",
    "videoOutputInterface",
    "videoOutputMode",
    "videoPlaybackFormat",
    "videotapePlaybackSpeed",
    "videotapeRecordingSpeed",
    "voiceCommunicationSupport",
    "voiceCoilDescription",
    "voicemailCapability",
    "voiceOperatedTransmission",
    "voipProtocols",
    "volumeAcousticSuspension",
    "warnings",
    "warrantyDescription",
    "waterproofRating",
    "waypoints",
    "waypointsPerRoute",
    "weatherproof",
    "writeSpeed"
})
@XmlRootElement(name = "CE")
public class CE {

    @XmlElement(name = "Rebate")
    protected List<RebateType> rebate;
    @XmlElement(name = "ProductType", required = true)
    protected CE.ProductType productType;
    @XmlElement(name = "ProductSubtype")
    protected String productSubtype;
    @XmlElement(name = "AnalogVideoFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> analogVideoFormat;
    @XmlElement(name = "AnnualEnergyConsumption")
    protected EnergyConsumptionDimension annualEnergyConsumption;
    @XmlElement(name = "AnsweringSystemType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String answeringSystemType;
    @XmlElement(name = "AntennaLength")
    protected LengthDimension antennaLength;
    @XmlElement(name = "AntennaType")
    @XmlSchemaType(name = "string")
    protected AntennaTypeValues antennaType;
    @XmlElement(name = "AspectRatio")
    protected String aspectRatio;
    @XmlElement(name = "AudioFeaturesDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String audioFeaturesDescription;
    @XmlElement(name = "AudioInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> audioInput;
    @XmlElement(name = "AudioOutputEffects")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> audioOutputEffects;
    @XmlElement(name = "AudioOutputMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> audioOutputMode;
    @XmlElement(name = "AudioOutputResponseBandwidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String audioOutputResponseBandwidth;
    @XmlElement(name = "AudioOutputType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String audioOutputType;
    @XmlElement(name = "AudioSensitivity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger audioSensitivity;
    @XmlElement(name = "AutoRedial")
    protected Boolean autoRedial;
    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "BatteryAverageLife")
    protected TimeDimension batteryAverageLife;
    @XmlElement(name = "BatteryAverageLifeTalkTime")
    protected TimeDimension batteryAverageLifeTalkTime;
    @XmlElement(name = "BufferSize")
    protected MemorySizeDimension bufferSize;
    @XmlElement(name = "BatteryTypeLithiumIon")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumIon;
    @XmlElement(name = "BatteryTypeLithiumMetal")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumMetal;
    @XmlElement(name = "BiometricSecurityFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String biometricSecurityFeatures;
    @XmlElement(name = "BuiltInDecoders")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> builtInDecoders;
    @XmlElement(name = "ButtonQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger buttonQuantity;
    @XmlElement(name = "CabinetMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cabinetMaterial;
    @XmlElement(name = "CableFeature")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> cableFeature;
    @XmlElement(name = "CableTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> cableTechnology;
    @XmlElement(name = "CableType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cableType;
    @XmlElement(name = "CacheMemoryInstalledSize")
    protected MemorySizeDimension cacheMemoryInstalledSize;
    @XmlElement(name = "CallAlerts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String callAlerts;
    @XmlElement(name = "CallerIdentification")
    protected Boolean callerIdentification;
    @XmlElement(name = "CarryingStrap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> carryingStrap;
    @XmlElement(name = "CassetteSystemType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cassetteSystemType;
    @XmlElement(name = "CDChangerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cdChangerType;
    @XmlElement(name = "CDDiskCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cdDiskCapacity;
    @XmlElement(name = "CDLoadType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cdLoadType;
    @XmlElement(name = "CDPlaybackMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> cdPlaybackMode;
    @XmlElement(name = "CDSystemType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String cdSystemType;
    @XmlElement(name = "CellularEnhancementProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> cellularEnhancementProtocol;
    @XmlElement(name = "CoaxialDigitalInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coaxialDigitalInput;
    @XmlElement(name = "CoaxialDigitalOutput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String coaxialDigitalOutput;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String color;
    @XmlElement(name = "ColorDepth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> colorDepth;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "ColorSupport")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> colorSupport;
    @XmlElement(name = "CompatibleCartridge")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> compatibleCartridge;
    @XmlElement(name = "CompatibleDevices")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> compatibleDevices;
    @XmlElement(name = "ComponentType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> componentType;
    @XmlElement(name = "CompressedCapacity")
    protected MemorySizeDimension compressedCapacity;
    @XmlElement(name = "ComputerPeripheralConnector")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> computerPeripheralConnector;
    @XmlElement(name = "ConferenceCallCapability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String conferenceCallCapability;
    @XmlElement(name = "ConnectivityProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> connectivityProtocol;
    @XmlElement(name = "ConnectivityTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String connectivityTechnology;
    @XmlElement(name = "CopierType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String copierType;
    @XmlElement(name = "CopySizeMaximum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String copySizeMaximum;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "CrossoverFrequency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String crossoverFrequency;
    @XmlElement(name = "DACDataWidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dacDataWidth;
    @XmlElement(name = "DataCompressionProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> dataCompressionProtocol;
    @XmlElement(name = "DataLinkProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> dataLinkProtocol;
    @XmlElement(name = "DataService")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dataService;
    @XmlElement(name = "DataStorageCapability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dataStorageCapability;
    @XmlElement(name = "DataTransferRate")
    protected CE.DataTransferRate dataTransferRate;
    @XmlElement(name = "DeviceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String deviceType;
    @XmlElement(name = "DGPS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dgps;
    @XmlElement(name = "DialerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dialerType;
    @XmlElement(name = "DigitalPlayerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String digitalPlayerType;
    @XmlElement(name = "DigitalRecordingTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> digitalRecordingTime;
    @XmlElement(name = "DigitalSignalingProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> digitalSignalingProtocol;
    @XmlElement(name = "DigitalStorageCapacity")
    protected MemorySizeDimension digitalStorageCapacity;
    @XmlElement(name = "DigitalZoom")
    protected ZoomDimension digitalZoom;
    @XmlElement(name = "DisplayColorSupport")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> displayColorSupport;
    @XmlElement(name = "DisplayLanguageOptions")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayLanguageOptions;
    @XmlElement(name = "DisplayLineQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger displayLineQuantity;
    @XmlElement(name = "DisplayResolutionMaximum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayResolutionMaximum;
    @XmlElement(name = "DisplayTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayTechnology;
    @XmlElement(name = "DisplayType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String displayType;
    @XmlElement(name = "DockingStationExternalInterface")
    @XmlSchemaType(name = "string")
    protected DockingStationExternalInterfaceTypeValues dockingStationExternalInterface;
    @XmlElement(name = "DriveUnits")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String driveUnits;
    @XmlElement(name = "Duplex")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String duplex;
    @XmlElement(name = "DVDDiskCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dvdDiskCapacity;
    @XmlElement(name = "DVDDiskChangerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dvdDiskChangerType;
    @XmlElement(name = "DVDMediaLoadType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dvdMediaLoadType;
    @XmlElement(name = "DVDPictureZoomPower")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> dvdPictureZoomPower;
    @XmlElement(name = "DVDPlaybackMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> dvdPlaybackMode;
    @XmlElement(name = "DVDType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dvdType;
    @XmlElement(name = "DVRCompressionRate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dvrCompressionRate;
    @XmlElement(name = "DVRMaxRecordingTime")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dvrMaxRecordingTime;
    @XmlElement(name = "DVRServiceDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dvrServiceDescription;
    @XmlElement(name = "Enclosure")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String enclosure;
    @XmlElement(name = "Equalizer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String equalizer;
    @XmlElement(name = "EqualizerBandChannels")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String equalizerBandChannels;
    @XmlElement(name = "ErrorCorrectionProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> errorCorrectionProtocol;
    @XmlElement(name = "EyeRelief")
    protected LengthDimension eyeRelief;
    @XmlElement(name = "FaceplateType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String faceplateType;
    @XmlElement(name = "FaxMachineCompatibility")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String faxMachineCompatibility;
    @XmlElement(name = "FaxType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String faxType;
    @XmlElement(name = "FlashMemoryInstalledSize")
    protected MemorySizeDimension flashMemoryInstalledSize;
    @XmlElement(name = "FloppyDiskDrive")
    protected String floppyDiskDrive;
    @XmlElement(name = "FormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> formFactor;
    @XmlElement(name = "FreeAirResonantFrequency")
    protected FrequencyDimension freeAirResonantFrequency;
    @XmlElement(name = "FrequencyRange")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> frequencyRange;
    @XmlElement(name = "FrequencyRequired")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String frequencyRequired;
    @XmlElement(name = "FrequencyResponseCurve")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String frequencyResponseCurve;
    @XmlElement(name = "FrontAccessibleBaysQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger frontAccessibleBaysQuantity;
    @XmlElement(name = "FuseDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fuseDescription;
    @XmlElement(name = "GPSNavigation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String gpsNavigation;
    @XmlElement(name = "GraphicsCoprocessor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsCoprocessor;
    @XmlElement(name = "GraphicsCoprocessorQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger graphicsCoprocessorQuantity;
    @XmlElement(name = "GraphicsRam")
    protected BigDecimal graphicsRam;
    @XmlElement(name = "GreyscaleDepth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> greyscaleDepth;
    @XmlElement(name = "HandsetDepth")
    protected LengthDimension handsetDepth;
    @XmlElement(name = "HandsetHeight")
    protected LengthDimension handsetHeight;
    @XmlElement(name = "HandsetLocator")
    protected Boolean handsetLocator;
    @XmlElement(name = "HandsetWeight")
    protected WeightDimension handsetWeight;
    @XmlElement(name = "HandsetWidth")
    protected LengthDimension handsetWidth;
    @XmlElement(name = "HardDiskDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hardDiskDescription;
    @XmlElement(name = "HardDiskInstalledQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger hardDiskInstalledQuantity;
    @XmlElement(name = "HardDiskRotationalSpeed")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger hardDiskRotationalSpeed;
    @XmlElement(name = "HardwareInterface")
    protected List<String> hardwareInterface;
    @XmlElement(name = "HasCommercialSkip")
    protected Boolean hasCommercialSkip;
    @XmlElement(name = "HasDVDPictureZoom")
    protected Boolean hasDVDPictureZoom;
    @XmlElement(name = "HasParentalChannelLock")
    protected Boolean hasParentalChannelLock;
    @XmlElement(name = "HeadphonesFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String headphonesFormFactor;
    @XmlElement(name = "HeadphonesJack")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String headphonesJack;
    @XmlElement(name = "HeadphonesTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String headphonesTechnology;
    @XmlElement(name = "HorizontalResolution")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger horizontalResolution;
    @XmlElement(name = "HotSwapBaysQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger hotSwapBaysQuantity;
    @XmlElement(name = "HumanInterfaceInput")
    @XmlSchemaType(name = "string")
    protected List<HumanInterfaceInputType> humanInterfaceInput;
    @XmlElement(name = "HumanInterfaceOutput")
    @XmlSchemaType(name = "string")
    protected HumanInterfaceOutputType humanInterfaceOutput;
    @XmlElement(name = "ImageAspectRatio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> imageAspectRatio;
    @XmlElement(name = "ImageBrightness")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String imageBrightness;
    @XmlElement(name = "ImageContrastRatio")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String imageContrastRatio;
    @XmlElement(name = "Impedance")
    protected ResistanceDimension impedance;
    @XmlElement(name = "IncludesMP3Player")
    protected Boolean includesMP3Player;
    @XmlElement(name = "IncludesRechargableBattery")
    protected Boolean includesRechargableBattery;
    @XmlElement(name = "IncludesRemote")
    protected Boolean includesRemote;
    @XmlElement(name = "IncludesSpeakerphone")
    protected Boolean includesSpeakerphone;
    @XmlElement(name = "InputAdapter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> inputAdapter;
    @XmlElement(name = "InputChannelQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger inputChannelQuantity;
    @XmlElement(name = "InputConnection")
    protected List<Connection> inputConnection;
    @XmlElement(name = "InputConnectorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> inputConnectorType;
    @XmlElement(name = "InputDevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> inputDevice;
    @XmlElement(name = "InputDeviceInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> inputDeviceInterface;
    @XmlElement(name = "Intercom")
    protected Boolean intercom;
    @XmlElement(name = "InternalBaysQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger internalBaysQuantity;
    @XmlElement(name = "ISDNTerminalAdapterInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String isdnTerminalAdapterInterface;
    @XmlElement(name = "IsHDTVCompatible")
    protected Boolean isHDTVCompatible;
    @XmlElement(name = "IsWaterproof")
    protected Boolean isWaterproof;
    @XmlElement(name = "ItemDisplayDepth")
    protected LengthDimension itemDisplayDepth;
    @XmlElement(name = "ItemDisplayHeight")
    protected LengthDimension itemDisplayHeight;
    @XmlElement(name = "ItemDisplayLength")
    protected LengthDimension itemDisplayLength;
    @XmlElement(name = "ItemDisplayLengthMaximum")
    protected LengthDimension itemDisplayLengthMaximum;
    @XmlElement(name = "ItemDisplayWeight")
    protected WeightDimension itemDisplayWeight;
    @XmlElement(name = "ItemDisplayWidth")
    protected LengthDimension itemDisplayWidth;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    protected BigDecimal lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    protected BigDecimal lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    protected BigDecimal lithiumBatteryWeight;
    @XmlElement(name = "KeyboardDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String keyboardDescription;
    @XmlElement(name = "LampType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lampType;
    @XmlElement(name = "LeftConnectorGender")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String leftConnectorGender;
    @XmlElement(name = "LeftConnectorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> leftConnectorType;
    @XmlElement(name = "ManufacturerWarrantyType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String manufacturerWarrantyType;
    @XmlElement(name = "MapType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> mapType;
    @XmlElement(name = "MaterialComposition")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> materialComposition;
    @XmlElement(name = "MaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> materialType;
    @XmlElement(name = "MaxCopyResolutionBlackWhite")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxCopyResolutionBlackWhite;
    @XmlElement(name = "MaxCopyResolutionColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxCopyResolutionColor;
    @XmlElement(name = "MaximumBridgedOutputPower")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumBridgedOutputPower;
    @XmlElement(name = "MaximumExternalResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maximumExternalResolution;
    @XmlElement(name = "MaximumImageSize")
    protected LengthDimension maximumImageSize;
    @XmlElement(name = "MaximumLinearPeakExcursion")
    protected LengthDimension maximumLinearPeakExcursion;
    @XmlElement(name = "MaximumOutputPower")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maximumOutputPower;
    @XmlElement(name = "MaximumRange")
    protected LengthDimension maximumRange;
    @XmlElement(name = "MaximumRangeIndoors")
    protected LengthDimension maximumRangeIndoors;
    @XmlElement(name = "MaximumSampleRate")
    protected FrequencyDimension maximumSampleRate;
    @XmlElement(name = "MaximumScreenDistance")
    protected LengthDimension maximumScreenDistance;
    @XmlElement(name = "MaxInputSheetCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxInputSheetCapacity;
    @XmlElement(name = "MaxPrintResolutionBlackWhite")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> maxPrintResolutionBlackWhite;
    @XmlElement(name = "MaxPrintResolutionColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> maxPrintResolutionColor;
    @XmlElement(name = "MediaFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mediaFormat;
    @XmlElement(name = "MediaLoadType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mediaLoadType;
    @XmlElement(name = "MediaSizeMaximum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> mediaSizeMaximum;
    @XmlElement(name = "MediaType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> mediaType;
    @XmlElement(name = "MemoryStorageCapacity")
    protected MemorySizeDimension memoryStorageCapacity;
    @XmlElement(name = "MemoryTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String memoryTechnology;
    @XmlElement(name = "MfgWarrantyDescriptionLabor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfgWarrantyDescriptionLabor;
    @XmlElement(name = "MfgWarrantyDescriptionParts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfgWarrantyDescriptionParts;
    @XmlElement(name = "MicrophoneFormFactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String microphoneFormFactor;
    @XmlElement(name = "MicrophoneOperationMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> microphoneOperationMode;
    @XmlElement(name = "MicrophoneTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String microphoneTechnology;
    @XmlElement(name = "MiniDiscSystem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String miniDiscSystem;
    @XmlElement(name = "MinimumImageSize")
    protected LengthDimension minimumImageSize;
    @XmlElement(name = "MinimumScreenDistance")
    protected LengthDimension minimumScreenDistance;
    @XmlElement(name = "MinimumSystemRequirementDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String minimumSystemRequirementDescription;
    @XmlElement(name = "Model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String model;
    @XmlElement(name = "ModelName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelName;
    @XmlElement(name = "ModemDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modemDescription;
    @XmlElement(name = "ModemInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modemInterface;
    @XmlElement(name = "ModemType")
    @XmlSchemaType(name = "string")
    protected ModemTypeValues modemType;
    @XmlElement(name = "MonthlyDutyCycle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String monthlyDutyCycle;
    @XmlElement(name = "MountingHoleDiameter")
    protected LengthDimension mountingHoleDiameter;
    @XmlElement(name = "MovementDetectionTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String movementDetectionTechnology;
    @XmlElement(name = "MultilineOperation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> multilineOperation;
    @XmlElement(name = "MultimediaFunctionality")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> multimediaFunctionality;
    @XmlElement(name = "NavigationRoutes")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger navigationRoutes;
    @XmlElement(name = "NetworkingFeature")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> networkingFeature;
    @XmlElement(name = "NetworkInterfaceDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String networkInterfaceDescription;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "NumberOfPorts")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPorts;
    @XmlElement(name = "NumberOfSupportedZones")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfSupportedZones;
    @XmlElement(name = "ObjectiveLensDiameter")
    protected LengthDimension objectiveLensDiameter;
    @XmlElement(name = "OperatingHumidity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String operatingHumidity;
    @XmlElement(name = "OpticalDigitalInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalDigitalInput;
    @XmlElement(name = "OpticalDigitalOutput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalDigitalOutput;
    @XmlElement(name = "OpticalSensorInterpolatedResolution")
    protected PixelDimension opticalSensorInterpolatedResolution;
    @XmlElement(name = "OpticalSensorResolution")
    protected PixelDimension opticalSensorResolution;
    @XmlElement(name = "OpticalStorageDevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> opticalStorageDevice;
    @XmlElement(name = "OpticalStorageInstalledQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger opticalStorageInstalledQuantity;
    @XmlElement(name = "OpticalStorageReadSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalStorageReadSpeed;
    @XmlElement(name = "OpticalStorageRewriteSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalStorageRewriteSpeed;
    @XmlElement(name = "OpticalStorageSecondaryReadSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalStorageSecondaryReadSpeed;
    @XmlElement(name = "OpticalStorageSecondaryRewriteSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalStorageSecondaryRewriteSpeed;
    @XmlElement(name = "OpticalStorageSecondaryType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> opticalStorageSecondaryType;
    @XmlElement(name = "OpticalStorageSecondaryWriteSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalStorageSecondaryWriteSpeed;
    @XmlElement(name = "OpticalStorageWriteSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalStorageWriteSpeed;
    @XmlElement(name = "OutputChannelQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger outputChannelQuantity;
    @XmlElement(name = "OutputConnection")
    protected List<Connection> outputConnection;
    @XmlElement(name = "OutputConnectorQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger outputConnectorQuantity;
    @XmlElement(name = "OutputConnectorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> outputConnectorType;
    @XmlElement(name = "OutputPower")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger outputPower;
    @XmlElement(name = "OutputWattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger outputWattage;
    @XmlElement(name = "PackageContentType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String packageContentType;
    @XmlElement(name = "PackageTypeName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String packageTypeName;
    @XmlElement(name = "PCConnectionAvailable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pcConnectionAvailable;
    @XmlElement(name = "PhoneBaseDepth")
    protected LengthDimension phoneBaseDepth;
    @XmlElement(name = "PhoneBaseHeight")
    protected LengthDimension phoneBaseHeight;
    @XmlElement(name = "PhoneBaseWeight")
    protected WeightDimension phoneBaseWeight;
    @XmlElement(name = "PhoneBaseWidth")
    protected LengthDimension phoneBaseWidth;
    @XmlElement(name = "PortedBoxVolume")
    protected CE.PortedBoxVolume portedBoxVolume;
    @XmlElement(name = "PowerAmplifierClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerAmplifierClass;
    @XmlElement(name = "PowerDevice")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerDevice;
    @XmlElement(name = "PowerGain")
    protected VoltageIntegerDimension powerGain;
    @XmlElement(name = "PowerLoadRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerLoadRating;
    @XmlElement(name = "PreampOutputChannels")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger preampOutputChannels;
    @XmlElement(name = "PresetChannelQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger presetChannelQuantity;
    @XmlElement(name = "PrinterInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String printerInterface;
    @XmlElement(name = "PrinterOutput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String printerOutput;
    @XmlElement(name = "PrinterResolutionBWHorizontalMax")
    protected PixelDimension printerResolutionBWHorizontalMax;
    @XmlElement(name = "PrinterResolutionBWVerticalMax")
    protected PixelDimension printerResolutionBWVerticalMax;
    @XmlElement(name = "PrinterResolutionColorHorizontalMax")
    protected PixelDimension printerResolutionColorHorizontalMax;
    @XmlElement(name = "PrinterResolutionColorVerticalMax")
    protected PixelDimension printerResolutionColorVerticalMax;
    @XmlElement(name = "PrinterTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String printerTechnology;
    @XmlElement(name = "ProcessorDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorDescription;
    @XmlElement(name = "ProcessorMaximum")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger processorMaximum;
    @XmlElement(name = "ProcessorModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorModelNumber;
    @XmlElement(name = "ProcessorUpgrade")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String processorUpgrade;
    @XmlElement(name = "Programmability")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> programmability;
    @XmlElement(name = "QtsTotalQFactor")
    protected BigDecimal qtsTotalQFactor;
    @XmlElement(name = "RadioBandsSupported")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String radioBandsSupported;
    @XmlElement(name = "RadioChannels")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String radioChannels;
    @XmlElement(name = "RAIDLevel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> raidLevel;
    @XmlElement(name = "RAMMemoryInstalledSize")
    protected MemorySizeDimension ramMemoryInstalledSize;
    @XmlElement(name = "RAMMemoryMaximumSize")
    protected MemorySizeDimension ramMemoryMaximumSize;
    @XmlElement(name = "RAMMemoryTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ramMemoryTechnology;
    @XmlElement(name = "RangefinderType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rangefinderType;
    @XmlElement(name = "ReceiverDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String receiverDescription;
    @XmlElement(name = "RecordingCapacity")
    protected MemorySizeDimension recordingCapacity;
    @XmlElement(name = "RemoteControlAudioControls")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> remoteControlAudioControls;
    @XmlElement(name = "RemoteControlDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteControlDescription;
    @XmlElement(name = "RemoteControlTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteControlTechnology;
    @XmlElement(name = "RemoteManagementProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> remoteManagementProtocol;
    @XmlElement(name = "RemovableMediaCapacity")
    protected MemorySizeDimension removableMediaCapacity;
    @XmlElement(name = "RemovableMemory")
    protected String removableMemory;
    @XmlElement(name = "RemovableStorage")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String removableStorage;
    @XmlElement(name = "RemovableStorageInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String removableStorageInterface;
    @XmlElement(name = "RemovableStorageNativeCapacity")
    protected MemorySizeDimension removableStorageNativeCapacity;
    @XmlElement(name = "ResponseTime")
    protected TimeDimension responseTime;
    @XmlElement(name = "RightConnectorGender")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String rightConnectorGender;
    @XmlElement(name = "RightConnectorType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> rightConnectorType;
    @XmlElement(name = "RoutingProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> routingProtocol;
    @XmlElement(name = "SatelliteServiceDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> satelliteServiceDescription;
    @XmlElement(name = "SBAS")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> sbas;
    @XmlElement(name = "ScanElementType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scanElementType;
    @XmlElement(name = "ScannerInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scannerInterface;
    @XmlElement(name = "ScannerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scannerType;
    @XmlElement(name = "SCSISignalingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scsiSignalingType;
    @XmlElement(name = "SealedBoxVolume")
    protected CE.SealedBoxVolume sealedBoxVolume;
    @XmlElement(name = "SearchSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> searchSpeed;
    @XmlElement(name = "SecondaryCache")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger secondaryCache;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sellerWarrantyDescription;
    @XmlElement(name = "SignalToNoiseRatio")
    protected BigDecimal signalToNoiseRatio;
    @XmlElement(name = "Size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String size;
    @XmlElement(name = "SpeakerAmplificationType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerAmplificationType;
    @XmlElement(name = "SpeakerConnectivity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerConnectivity;
    @XmlElement(name = "SpeakerDriverMaterial")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerDriverMaterial;
    @XmlElement(name = "SpeakersCrossoverChannelQuantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> speakersCrossoverChannelQuantity;
    @XmlElement(name = "SpeakersIncludedDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakersIncludedDescription;
    @XmlElement(name = "SpeakersMaximumOutputPower")
    protected BigDecimal speakersMaximumOutputPower;
    @XmlElement(name = "SpeakersNominalOutputPower")
    protected BigDecimal speakersNominalOutputPower;
    @XmlElement(name = "SpeakersResponseBandwidth")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakersResponseBandwidth;
    @XmlElement(name = "SpeakerSystemClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerSystemClass;
    @XmlElement(name = "SpeakerType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerType;
    @XmlElement(name = "SpecialFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specialFeatures;
    @XmlElement(name = "SpecificationMet")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> specificationMet;
    @XmlElement(name = "SpecificUses")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String specificUses;
    @XmlElement(name = "SSDDriveArchitechture")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String ssdDriveArchitechture;
    @XmlElement(name = "StandardInputSheetCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger standardInputSheetCapacity;
    @XmlElement(name = "StorageController")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String storageController;
    @XmlElement(name = "StorageControllerInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String storageControllerInterface;
    @XmlElement(name = "StorageHumidity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String storageHumidity;
    @XmlElement(name = "StorageInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String storageInterface;
    @XmlElement(name = "StyleName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String styleName;
    @XmlElement(name = "SupportedAudioFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> supportedAudioFormat;
    @XmlElement(name = "SupportedDevices")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> supportedDevices;
    @XmlElement(name = "SupportedDevicesQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger supportedDevicesQuantity;
    @XmlElement(name = "SupportedImageFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> supportedImageFormat;
    @XmlElement(name = "SupportedImageType")
    protected List<String> supportedImageType;
    @XmlElement(name = "SupportedMediaSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String supportedMediaSize;
    @XmlElement(name = "SupportedMotherboard")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String supportedMotherboard;
    @XmlElement(name = "SupportedStandards")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> supportedStandards;
    @XmlElement(name = "SurgeSuppression")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String surgeSuppression;
    @XmlElement(name = "SurroundSoundChannels")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String surroundSoundChannels;
    @XmlElement(name = "SurroundSoundEffects")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> surroundSoundEffects;
    @XmlElement(name = "SwitchingProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> switchingProtocol;
    @XmlElement(name = "SystemBusSpeed")
    protected BigDecimal systemBusSpeed;
    @XmlElement(name = "TalkRangeMaximum")
    protected LengthDimension talkRangeMaximum;
    @XmlElement(name = "TapeLength")
    protected TimeDimension tapeLength;
    @XmlElement(name = "TelevisionInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String televisionInterface;
    @XmlElement(name = "TelevisionPCInterfaceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String televisionPCInterfaceType;
    @XmlElement(name = "TemperatureRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String temperatureRating;
    @XmlElement(name = "TotalHarmonicDistortion")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String totalHarmonicDistortion;
    @XmlElement(name = "TracklogPoints")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tracklogPoints;
    @XmlElement(name = "Tracks")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger tracks;
    @XmlElement(name = "TransportProtocol")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> transportProtocol;
    @XmlElement(name = "Tuner")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String tuner;
    @XmlElement(name = "TunerTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> tunerTechnology;
    @XmlElement(name = "TVTunerSecondaryAudioProgram")
    protected Boolean tvTunerSecondaryAudioProgram;
    @XmlElement(name = "UPSTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String upsTechnology;
    @XmlElement(name = "VCRType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> vcrType;
    @XmlElement(name = "VerticalResolution")
    protected PixelDimension verticalResolution;
    @XmlElement(name = "VideoCaptureFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videoCaptureFormat;
    @XmlElement(name = "VideoCaptureResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videoCaptureResolution;
    @XmlElement(name = "VideoHeadQuantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger videoHeadQuantity;
    @XmlElement(name = "VideoInput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videoInput;
    @XmlElement(name = "VideoInputDigitalStandard")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videoInputDigitalStandard;
    @XmlElement(name = "VideoInputFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videoInputFormat;
    @XmlElement(name = "VideoOutputFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoOutputFormat;
    @XmlElement(name = "VideoOutput")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videoOutput;
    @XmlElement(name = "VideoOutputInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videoOutputInterface;
    @XmlElement(name = "VideoOutputMode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String videoOutputMode;
    @XmlElement(name = "VideoPlaybackFormat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videoPlaybackFormat;
    @XmlElement(name = "VideotapePlaybackSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> videotapePlaybackSpeed;
    @XmlElement(name = "VideotapeRecordingSpeed")
    protected String videotapeRecordingSpeed;
    @XmlElement(name = "VoiceCommunicationSupport")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> voiceCommunicationSupport;
    @XmlElement(name = "VoiceCoilDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String voiceCoilDescription;
    @XmlElement(name = "VoicemailCapability")
    protected Boolean voicemailCapability;
    @XmlElement(name = "VoiceOperatedTransmission")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String voiceOperatedTransmission;
    @XmlElement(name = "VOIPProtocols")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> voipProtocols;
    @XmlElement(name = "VolumeAcousticSuspension")
    protected VolumeDimension volumeAcousticSuspension;
    @XmlElement(name = "Warnings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warnings;
    @XmlElement(name = "WarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warrantyDescription;
    @XmlElement(name = "WaterproofRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String waterproofRating;
    @XmlElement(name = "Waypoints")
    protected BigDecimal waypoints;
    @XmlElement(name = "WaypointsPerRoute")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger waypointsPerRoute;
    @XmlElement(name = "Weatherproof")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String weatherproof;
    @XmlElement(name = "WriteSpeed")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String writeSpeed;

    /**
     * Gets the value of the rebate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rebate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRebate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RebateType }
     * 
     * 
     */
    public List<RebateType> getRebate() {
        if (rebate == null) {
            rebate = new ArrayList<RebateType>();
        }
        return this.rebate;
    }

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CE.ProductType }
     *     
     */
    public CE.ProductType getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CE.ProductType }
     *     
     */
    public void setProductType(CE.ProductType value) {
        this.productType = value;
    }

    /**
     * 获取productSubtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSubtype() {
        return productSubtype;
    }

    /**
     * 设置productSubtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSubtype(String value) {
        this.productSubtype = value;
    }

    /**
     * Gets the value of the analogVideoFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analogVideoFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalogVideoFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAnalogVideoFormat() {
        if (analogVideoFormat == null) {
            analogVideoFormat = new ArrayList<String>();
        }
        return this.analogVideoFormat;
    }

    /**
     * 获取annualEnergyConsumption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public EnergyConsumptionDimension getAnnualEnergyConsumption() {
        return annualEnergyConsumption;
    }

    /**
     * 设置annualEnergyConsumption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConsumptionDimension }
     *     
     */
    public void setAnnualEnergyConsumption(EnergyConsumptionDimension value) {
        this.annualEnergyConsumption = value;
    }

    /**
     * 获取answeringSystemType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringSystemType() {
        return answeringSystemType;
    }

    /**
     * 设置answeringSystemType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringSystemType(String value) {
        this.answeringSystemType = value;
    }

    /**
     * 获取antennaLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getAntennaLength() {
        return antennaLength;
    }

    /**
     * 设置antennaLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setAntennaLength(LengthDimension value) {
        this.antennaLength = value;
    }

    /**
     * 获取antennaType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AntennaTypeValues }
     *     
     */
    public AntennaTypeValues getAntennaType() {
        return antennaType;
    }

    /**
     * 设置antennaType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AntennaTypeValues }
     *     
     */
    public void setAntennaType(AntennaTypeValues value) {
        this.antennaType = value;
    }

    /**
     * 获取aspectRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectRatio() {
        return aspectRatio;
    }

    /**
     * 设置aspectRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectRatio(String value) {
        this.aspectRatio = value;
    }

    /**
     * 获取audioFeaturesDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioFeaturesDescription() {
        return audioFeaturesDescription;
    }

    /**
     * 设置audioFeaturesDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioFeaturesDescription(String value) {
        this.audioFeaturesDescription = value;
    }

    /**
     * Gets the value of the audioInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudioInput() {
        if (audioInput == null) {
            audioInput = new ArrayList<String>();
        }
        return this.audioInput;
    }

    /**
     * Gets the value of the audioOutputEffects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioOutputEffects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioOutputEffects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudioOutputEffects() {
        if (audioOutputEffects == null) {
            audioOutputEffects = new ArrayList<String>();
        }
        return this.audioOutputEffects;
    }

    /**
     * Gets the value of the audioOutputMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioOutputMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioOutputMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAudioOutputMode() {
        if (audioOutputMode == null) {
            audioOutputMode = new ArrayList<String>();
        }
        return this.audioOutputMode;
    }

    /**
     * 获取audioOutputResponseBandwidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioOutputResponseBandwidth() {
        return audioOutputResponseBandwidth;
    }

    /**
     * 设置audioOutputResponseBandwidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioOutputResponseBandwidth(String value) {
        this.audioOutputResponseBandwidth = value;
    }

    /**
     * 获取audioOutputType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioOutputType() {
        return audioOutputType;
    }

    /**
     * 设置audioOutputType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioOutputType(String value) {
        this.audioOutputType = value;
    }

    /**
     * 获取audioSensitivity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAudioSensitivity() {
        return audioSensitivity;
    }

    /**
     * 设置audioSensitivity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAudioSensitivity(BigInteger value) {
        this.audioSensitivity = value;
    }

    /**
     * 获取autoRedial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRedial() {
        return autoRedial;
    }

    /**
     * 设置autoRedial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRedial(Boolean value) {
        this.autoRedial = value;
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
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getBatteryAverageLife() {
        return batteryAverageLife;
    }

    /**
     * 设置batteryAverageLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setBatteryAverageLife(TimeDimension value) {
        this.batteryAverageLife = value;
    }

    /**
     * 获取batteryAverageLifeTalkTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getBatteryAverageLifeTalkTime() {
        return batteryAverageLifeTalkTime;
    }

    /**
     * 设置batteryAverageLifeTalkTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setBatteryAverageLifeTalkTime(TimeDimension value) {
        this.batteryAverageLifeTalkTime = value;
    }

    /**
     * 获取bufferSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getBufferSize() {
        return bufferSize;
    }

    /**
     * 设置bufferSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setBufferSize(MemorySizeDimension value) {
        this.bufferSize = value;
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
     * 获取biometricSecurityFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiometricSecurityFeatures() {
        return biometricSecurityFeatures;
    }

    /**
     * 设置biometricSecurityFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiometricSecurityFeatures(String value) {
        this.biometricSecurityFeatures = value;
    }

    /**
     * Gets the value of the builtInDecoders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the builtInDecoders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuiltInDecoders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBuiltInDecoders() {
        if (builtInDecoders == null) {
            builtInDecoders = new ArrayList<String>();
        }
        return this.builtInDecoders;
    }

    /**
     * 获取buttonQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getButtonQuantity() {
        return buttonQuantity;
    }

    /**
     * 设置buttonQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setButtonQuantity(BigInteger value) {
        this.buttonQuantity = value;
    }

    /**
     * 获取cabinetMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinetMaterial() {
        return cabinetMaterial;
    }

    /**
     * 设置cabinetMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinetMaterial(String value) {
        this.cabinetMaterial = value;
    }

    /**
     * Gets the value of the cableFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cableFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCableFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCableFeature() {
        if (cableFeature == null) {
            cableFeature = new ArrayList<String>();
        }
        return this.cableFeature;
    }

    /**
     * Gets the value of the cableTechnology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cableTechnology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCableTechnology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCableTechnology() {
        if (cableTechnology == null) {
            cableTechnology = new ArrayList<String>();
        }
        return this.cableTechnology;
    }

    /**
     * 获取cableType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCableType() {
        return cableType;
    }

    /**
     * 设置cableType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCableType(String value) {
        this.cableType = value;
    }

    /**
     * 获取cacheMemoryInstalledSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getCacheMemoryInstalledSize() {
        return cacheMemoryInstalledSize;
    }

    /**
     * 设置cacheMemoryInstalledSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setCacheMemoryInstalledSize(MemorySizeDimension value) {
        this.cacheMemoryInstalledSize = value;
    }

    /**
     * 获取callAlerts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallAlerts() {
        return callAlerts;
    }

    /**
     * 设置callAlerts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallAlerts(String value) {
        this.callAlerts = value;
    }

    /**
     * 获取callerIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallerIdentification() {
        return callerIdentification;
    }

    /**
     * 设置callerIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallerIdentification(Boolean value) {
        this.callerIdentification = value;
    }

    /**
     * Gets the value of the carryingStrap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryingStrap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryingStrap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarryingStrap() {
        if (carryingStrap == null) {
            carryingStrap = new ArrayList<String>();
        }
        return this.carryingStrap;
    }

    /**
     * 获取cassetteSystemType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCassetteSystemType() {
        return cassetteSystemType;
    }

    /**
     * 设置cassetteSystemType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCassetteSystemType(String value) {
        this.cassetteSystemType = value;
    }

    /**
     * 获取cdChangerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDChangerType() {
        return cdChangerType;
    }

    /**
     * 设置cdChangerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDChangerType(String value) {
        this.cdChangerType = value;
    }

    /**
     * 获取cdDiskCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCDDiskCapacity() {
        return cdDiskCapacity;
    }

    /**
     * 设置cdDiskCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCDDiskCapacity(BigInteger value) {
        this.cdDiskCapacity = value;
    }

    /**
     * 获取cdLoadType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDLoadType() {
        return cdLoadType;
    }

    /**
     * 设置cdLoadType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDLoadType(String value) {
        this.cdLoadType = value;
    }

    /**
     * Gets the value of the cdPlaybackMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdPlaybackMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDPlaybackMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCDPlaybackMode() {
        if (cdPlaybackMode == null) {
            cdPlaybackMode = new ArrayList<String>();
        }
        return this.cdPlaybackMode;
    }

    /**
     * 获取cdSystemType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDSystemType() {
        return cdSystemType;
    }

    /**
     * 设置cdSystemType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDSystemType(String value) {
        this.cdSystemType = value;
    }

    /**
     * Gets the value of the cellularEnhancementProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellularEnhancementProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellularEnhancementProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCellularEnhancementProtocol() {
        if (cellularEnhancementProtocol == null) {
            cellularEnhancementProtocol = new ArrayList<String>();
        }
        return this.cellularEnhancementProtocol;
    }

    /**
     * 获取coaxialDigitalInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoaxialDigitalInput() {
        return coaxialDigitalInput;
    }

    /**
     * 设置coaxialDigitalInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoaxialDigitalInput(String value) {
        this.coaxialDigitalInput = value;
    }

    /**
     * 获取coaxialDigitalOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoaxialDigitalOutput() {
        return coaxialDigitalOutput;
    }

    /**
     * 设置coaxialDigitalOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoaxialDigitalOutput(String value) {
        this.coaxialDigitalOutput = value;
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
     * Gets the value of the colorDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColorDepth() {
        if (colorDepth == null) {
            colorDepth = new ArrayList<String>();
        }
        return this.colorDepth;
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
     * Gets the value of the colorSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColorSupport() {
        if (colorSupport == null) {
            colorSupport = new ArrayList<String>();
        }
        return this.colorSupport;
    }

    /**
     * Gets the value of the compatibleCartridge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleCartridge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibleCartridge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompatibleCartridge() {
        if (compatibleCartridge == null) {
            compatibleCartridge = new ArrayList<String>();
        }
        return this.compatibleCartridge;
    }

    /**
     * Gets the value of the compatibleDevices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleDevices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibleDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompatibleDevices() {
        if (compatibleDevices == null) {
            compatibleDevices = new ArrayList<String>();
        }
        return this.compatibleDevices;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComponentType() {
        if (componentType == null) {
            componentType = new ArrayList<String>();
        }
        return this.componentType;
    }

    /**
     * 获取compressedCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getCompressedCapacity() {
        return compressedCapacity;
    }

    /**
     * 设置compressedCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setCompressedCapacity(MemorySizeDimension value) {
        this.compressedCapacity = value;
    }

    /**
     * Gets the value of the computerPeripheralConnector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the computerPeripheralConnector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComputerPeripheralConnector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComputerPeripheralConnector() {
        if (computerPeripheralConnector == null) {
            computerPeripheralConnector = new ArrayList<String>();
        }
        return this.computerPeripheralConnector;
    }

    /**
     * 获取conferenceCallCapability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceCallCapability() {
        return conferenceCallCapability;
    }

    /**
     * 设置conferenceCallCapability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceCallCapability(String value) {
        this.conferenceCallCapability = value;
    }

    /**
     * Gets the value of the connectivityProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectivityProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectivityProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConnectivityProtocol() {
        if (connectivityProtocol == null) {
            connectivityProtocol = new ArrayList<String>();
        }
        return this.connectivityProtocol;
    }

    /**
     * 获取connectivityTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectivityTechnology() {
        return connectivityTechnology;
    }

    /**
     * 设置connectivityTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectivityTechnology(String value) {
        this.connectivityTechnology = value;
    }

    /**
     * 获取copierType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopierType() {
        return copierType;
    }

    /**
     * 设置copierType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopierType(String value) {
        this.copierType = value;
    }

    /**
     * 获取copySizeMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopySizeMaximum() {
        return copySizeMaximum;
    }

    /**
     * 设置copySizeMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopySizeMaximum(String value) {
        this.copySizeMaximum = value;
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
     * 获取crossoverFrequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossoverFrequency() {
        return crossoverFrequency;
    }

    /**
     * 设置crossoverFrequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossoverFrequency(String value) {
        this.crossoverFrequency = value;
    }

    /**
     * 获取dacDataWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDACDataWidth() {
        return dacDataWidth;
    }

    /**
     * 设置dacDataWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDACDataWidth(String value) {
        this.dacDataWidth = value;
    }

    /**
     * Gets the value of the dataCompressionProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataCompressionProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataCompressionProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataCompressionProtocol() {
        if (dataCompressionProtocol == null) {
            dataCompressionProtocol = new ArrayList<String>();
        }
        return this.dataCompressionProtocol;
    }

    /**
     * Gets the value of the dataLinkProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataLinkProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataLinkProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataLinkProtocol() {
        if (dataLinkProtocol == null) {
            dataLinkProtocol = new ArrayList<String>();
        }
        return this.dataLinkProtocol;
    }

    /**
     * 获取dataService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataService() {
        return dataService;
    }

    /**
     * 设置dataService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataService(String value) {
        this.dataService = value;
    }

    /**
     * 获取dataStorageCapability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataStorageCapability() {
        return dataStorageCapability;
    }

    /**
     * 设置dataStorageCapability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataStorageCapability(String value) {
        this.dataStorageCapability = value;
    }

    /**
     * 获取dataTransferRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CE.DataTransferRate }
     *     
     */
    public CE.DataTransferRate getDataTransferRate() {
        return dataTransferRate;
    }

    /**
     * 设置dataTransferRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CE.DataTransferRate }
     *     
     */
    public void setDataTransferRate(CE.DataTransferRate value) {
        this.dataTransferRate = value;
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
     * 获取dgps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDGPS() {
        return dgps;
    }

    /**
     * 设置dgps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDGPS(String value) {
        this.dgps = value;
    }

    /**
     * 获取dialerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialerType() {
        return dialerType;
    }

    /**
     * 设置dialerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialerType(String value) {
        this.dialerType = value;
    }

    /**
     * 获取digitalPlayerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalPlayerType() {
        return digitalPlayerType;
    }

    /**
     * 设置digitalPlayerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalPlayerType(String value) {
        this.digitalPlayerType = value;
    }

    /**
     * Gets the value of the digitalRecordingTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalRecordingTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalRecordingTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDigitalRecordingTime() {
        if (digitalRecordingTime == null) {
            digitalRecordingTime = new ArrayList<String>();
        }
        return this.digitalRecordingTime;
    }

    /**
     * Gets the value of the digitalSignalingProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalSignalingProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalSignalingProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDigitalSignalingProtocol() {
        if (digitalSignalingProtocol == null) {
            digitalSignalingProtocol = new ArrayList<String>();
        }
        return this.digitalSignalingProtocol;
    }

    /**
     * 获取digitalStorageCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getDigitalStorageCapacity() {
        return digitalStorageCapacity;
    }

    /**
     * 设置digitalStorageCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setDigitalStorageCapacity(MemorySizeDimension value) {
        this.digitalStorageCapacity = value;
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
     * Gets the value of the displayColorSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayColorSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayColorSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisplayColorSupport() {
        if (displayColorSupport == null) {
            displayColorSupport = new ArrayList<String>();
        }
        return this.displayColorSupport;
    }

    /**
     * 获取displayLanguageOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayLanguageOptions() {
        return displayLanguageOptions;
    }

    /**
     * 设置displayLanguageOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayLanguageOptions(String value) {
        this.displayLanguageOptions = value;
    }

    /**
     * 获取displayLineQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayLineQuantity() {
        return displayLineQuantity;
    }

    /**
     * 设置displayLineQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayLineQuantity(BigInteger value) {
        this.displayLineQuantity = value;
    }

    /**
     * 获取displayResolutionMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayResolutionMaximum() {
        return displayResolutionMaximum;
    }

    /**
     * 设置displayResolutionMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayResolutionMaximum(String value) {
        this.displayResolutionMaximum = value;
    }

    /**
     * 获取displayTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTechnology() {
        return displayTechnology;
    }

    /**
     * 设置displayTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTechnology(String value) {
        this.displayTechnology = value;
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
     * 获取dockingStationExternalInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DockingStationExternalInterfaceTypeValues }
     *     
     */
    public DockingStationExternalInterfaceTypeValues getDockingStationExternalInterface() {
        return dockingStationExternalInterface;
    }

    /**
     * 设置dockingStationExternalInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DockingStationExternalInterfaceTypeValues }
     *     
     */
    public void setDockingStationExternalInterface(DockingStationExternalInterfaceTypeValues value) {
        this.dockingStationExternalInterface = value;
    }

    /**
     * 获取driveUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveUnits() {
        return driveUnits;
    }

    /**
     * 设置driveUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveUnits(String value) {
        this.driveUnits = value;
    }

    /**
     * 获取duplex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplex() {
        return duplex;
    }

    /**
     * 设置duplex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplex(String value) {
        this.duplex = value;
    }

    /**
     * 获取dvdDiskCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDVDDiskCapacity() {
        return dvdDiskCapacity;
    }

    /**
     * 设置dvdDiskCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDVDDiskCapacity(BigInteger value) {
        this.dvdDiskCapacity = value;
    }

    /**
     * 获取dvdDiskChangerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVDDiskChangerType() {
        return dvdDiskChangerType;
    }

    /**
     * 设置dvdDiskChangerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVDDiskChangerType(String value) {
        this.dvdDiskChangerType = value;
    }

    /**
     * 获取dvdMediaLoadType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVDMediaLoadType() {
        return dvdMediaLoadType;
    }

    /**
     * 设置dvdMediaLoadType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVDMediaLoadType(String value) {
        this.dvdMediaLoadType = value;
    }

    /**
     * Gets the value of the dvdPictureZoomPower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvdPictureZoomPower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDVDPictureZoomPower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDVDPictureZoomPower() {
        if (dvdPictureZoomPower == null) {
            dvdPictureZoomPower = new ArrayList<String>();
        }
        return this.dvdPictureZoomPower;
    }

    /**
     * Gets the value of the dvdPlaybackMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvdPlaybackMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDVDPlaybackMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDVDPlaybackMode() {
        if (dvdPlaybackMode == null) {
            dvdPlaybackMode = new ArrayList<String>();
        }
        return this.dvdPlaybackMode;
    }

    /**
     * 获取dvdType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVDType() {
        return dvdType;
    }

    /**
     * 设置dvdType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVDType(String value) {
        this.dvdType = value;
    }

    /**
     * 获取dvrCompressionRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVRCompressionRate() {
        return dvrCompressionRate;
    }

    /**
     * 设置dvrCompressionRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVRCompressionRate(String value) {
        this.dvrCompressionRate = value;
    }

    /**
     * 获取dvrMaxRecordingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDVRMaxRecordingTime() {
        return dvrMaxRecordingTime;
    }

    /**
     * 设置dvrMaxRecordingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDVRMaxRecordingTime(BigInteger value) {
        this.dvrMaxRecordingTime = value;
    }

    /**
     * 获取dvrServiceDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVRServiceDescription() {
        return dvrServiceDescription;
    }

    /**
     * 设置dvrServiceDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVRServiceDescription(String value) {
        this.dvrServiceDescription = value;
    }

    /**
     * 获取enclosure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosure() {
        return enclosure;
    }

    /**
     * 设置enclosure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosure(String value) {
        this.enclosure = value;
    }

    /**
     * 获取equalizer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualizer() {
        return equalizer;
    }

    /**
     * 设置equalizer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualizer(String value) {
        this.equalizer = value;
    }

    /**
     * 获取equalizerBandChannels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualizerBandChannels() {
        return equalizerBandChannels;
    }

    /**
     * 设置equalizerBandChannels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualizerBandChannels(String value) {
        this.equalizerBandChannels = value;
    }

    /**
     * Gets the value of the errorCorrectionProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorCorrectionProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorCorrectionProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getErrorCorrectionProtocol() {
        if (errorCorrectionProtocol == null) {
            errorCorrectionProtocol = new ArrayList<String>();
        }
        return this.errorCorrectionProtocol;
    }

    /**
     * 获取eyeRelief属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getEyeRelief() {
        return eyeRelief;
    }

    /**
     * 设置eyeRelief属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setEyeRelief(LengthDimension value) {
        this.eyeRelief = value;
    }

    /**
     * 获取faceplateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaceplateType() {
        return faceplateType;
    }

    /**
     * 设置faceplateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaceplateType(String value) {
        this.faceplateType = value;
    }

    /**
     * 获取faxMachineCompatibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxMachineCompatibility() {
        return faxMachineCompatibility;
    }

    /**
     * 设置faxMachineCompatibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxMachineCompatibility(String value) {
        this.faxMachineCompatibility = value;
    }

    /**
     * 获取faxType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxType() {
        return faxType;
    }

    /**
     * 设置faxType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxType(String value) {
        this.faxType = value;
    }

    /**
     * 获取flashMemoryInstalledSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getFlashMemoryInstalledSize() {
        return flashMemoryInstalledSize;
    }

    /**
     * 设置flashMemoryInstalledSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setFlashMemoryInstalledSize(MemorySizeDimension value) {
        this.flashMemoryInstalledSize = value;
    }

    /**
     * 获取floppyDiskDrive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloppyDiskDrive() {
        return floppyDiskDrive;
    }

    /**
     * 设置floppyDiskDrive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloppyDiskDrive(String value) {
        this.floppyDiskDrive = value;
    }

    /**
     * Gets the value of the formFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFormFactor() {
        if (formFactor == null) {
            formFactor = new ArrayList<String>();
        }
        return this.formFactor;
    }

    /**
     * 获取freeAirResonantFrequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getFreeAirResonantFrequency() {
        return freeAirResonantFrequency;
    }

    /**
     * 设置freeAirResonantFrequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setFreeAirResonantFrequency(FrequencyDimension value) {
        this.freeAirResonantFrequency = value;
    }

    /**
     * Gets the value of the frequencyRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequencyRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequencyRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFrequencyRange() {
        if (frequencyRange == null) {
            frequencyRange = new ArrayList<String>();
        }
        return this.frequencyRange;
    }

    /**
     * 获取frequencyRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyRequired() {
        return frequencyRequired;
    }

    /**
     * 设置frequencyRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyRequired(String value) {
        this.frequencyRequired = value;
    }

    /**
     * 获取frequencyResponseCurve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyResponseCurve() {
        return frequencyResponseCurve;
    }

    /**
     * 设置frequencyResponseCurve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyResponseCurve(String value) {
        this.frequencyResponseCurve = value;
    }

    /**
     * 获取frontAccessibleBaysQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrontAccessibleBaysQuantity() {
        return frontAccessibleBaysQuantity;
    }

    /**
     * 设置frontAccessibleBaysQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrontAccessibleBaysQuantity(BigInteger value) {
        this.frontAccessibleBaysQuantity = value;
    }

    /**
     * 获取fuseDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuseDescription() {
        return fuseDescription;
    }

    /**
     * 设置fuseDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuseDescription(String value) {
        this.fuseDescription = value;
    }

    /**
     * 获取gpsNavigation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPSNavigation() {
        return gpsNavigation;
    }

    /**
     * 设置gpsNavigation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPSNavigation(String value) {
        this.gpsNavigation = value;
    }

    /**
     * 获取graphicsCoprocessor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCoprocessor() {
        return graphicsCoprocessor;
    }

    /**
     * 设置graphicsCoprocessor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCoprocessor(String value) {
        this.graphicsCoprocessor = value;
    }

    /**
     * 获取graphicsCoprocessorQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGraphicsCoprocessorQuantity() {
        return graphicsCoprocessorQuantity;
    }

    /**
     * 设置graphicsCoprocessorQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGraphicsCoprocessorQuantity(BigInteger value) {
        this.graphicsCoprocessorQuantity = value;
    }

    /**
     * 获取graphicsRam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGraphicsRam() {
        return graphicsRam;
    }

    /**
     * 设置graphicsRam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGraphicsRam(BigDecimal value) {
        this.graphicsRam = value;
    }

    /**
     * Gets the value of the greyscaleDepth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the greyscaleDepth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGreyscaleDepth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGreyscaleDepth() {
        if (greyscaleDepth == null) {
            greyscaleDepth = new ArrayList<String>();
        }
        return this.greyscaleDepth;
    }

    /**
     * 获取handsetDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHandsetDepth() {
        return handsetDepth;
    }

    /**
     * 设置handsetDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHandsetDepth(LengthDimension value) {
        this.handsetDepth = value;
    }

    /**
     * 获取handsetHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHandsetHeight() {
        return handsetHeight;
    }

    /**
     * 设置handsetHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHandsetHeight(LengthDimension value) {
        this.handsetHeight = value;
    }

    /**
     * 获取handsetLocator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandsetLocator() {
        return handsetLocator;
    }

    /**
     * 设置handsetLocator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandsetLocator(Boolean value) {
        this.handsetLocator = value;
    }

    /**
     * 获取handsetWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getHandsetWeight() {
        return handsetWeight;
    }

    /**
     * 设置handsetWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setHandsetWeight(WeightDimension value) {
        this.handsetWeight = value;
    }

    /**
     * 获取handsetWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getHandsetWidth() {
        return handsetWidth;
    }

    /**
     * 设置handsetWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setHandsetWidth(LengthDimension value) {
        this.handsetWidth = value;
    }

    /**
     * 获取hardDiskDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardDiskDescription() {
        return hardDiskDescription;
    }

    /**
     * 设置hardDiskDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardDiskDescription(String value) {
        this.hardDiskDescription = value;
    }

    /**
     * 获取hardDiskInstalledQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHardDiskInstalledQuantity() {
        return hardDiskInstalledQuantity;
    }

    /**
     * 设置hardDiskInstalledQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHardDiskInstalledQuantity(BigInteger value) {
        this.hardDiskInstalledQuantity = value;
    }

    /**
     * 获取hardDiskRotationalSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHardDiskRotationalSpeed() {
        return hardDiskRotationalSpeed;
    }

    /**
     * 设置hardDiskRotationalSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHardDiskRotationalSpeed(BigInteger value) {
        this.hardDiskRotationalSpeed = value;
    }

    /**
     * Gets the value of the hardwareInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardwareInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardwareInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHardwareInterface() {
        if (hardwareInterface == null) {
            hardwareInterface = new ArrayList<String>();
        }
        return this.hardwareInterface;
    }

    /**
     * 获取hasCommercialSkip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCommercialSkip() {
        return hasCommercialSkip;
    }

    /**
     * 设置hasCommercialSkip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCommercialSkip(Boolean value) {
        this.hasCommercialSkip = value;
    }

    /**
     * 获取hasDVDPictureZoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDVDPictureZoom() {
        return hasDVDPictureZoom;
    }

    /**
     * 设置hasDVDPictureZoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDVDPictureZoom(Boolean value) {
        this.hasDVDPictureZoom = value;
    }

    /**
     * 获取hasParentalChannelLock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasParentalChannelLock() {
        return hasParentalChannelLock;
    }

    /**
     * 设置hasParentalChannelLock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasParentalChannelLock(Boolean value) {
        this.hasParentalChannelLock = value;
    }

    /**
     * 获取headphonesFormFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadphonesFormFactor() {
        return headphonesFormFactor;
    }

    /**
     * 设置headphonesFormFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadphonesFormFactor(String value) {
        this.headphonesFormFactor = value;
    }

    /**
     * 获取headphonesJack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadphonesJack() {
        return headphonesJack;
    }

    /**
     * 设置headphonesJack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadphonesJack(String value) {
        this.headphonesJack = value;
    }

    /**
     * 获取headphonesTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadphonesTechnology() {
        return headphonesTechnology;
    }

    /**
     * 设置headphonesTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadphonesTechnology(String value) {
        this.headphonesTechnology = value;
    }

    /**
     * 获取horizontalResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHorizontalResolution() {
        return horizontalResolution;
    }

    /**
     * 设置horizontalResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHorizontalResolution(BigInteger value) {
        this.horizontalResolution = value;
    }

    /**
     * 获取hotSwapBaysQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHotSwapBaysQuantity() {
        return hotSwapBaysQuantity;
    }

    /**
     * 设置hotSwapBaysQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHotSwapBaysQuantity(BigInteger value) {
        this.hotSwapBaysQuantity = value;
    }

    /**
     * Gets the value of the humanInterfaceInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the humanInterfaceInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHumanInterfaceInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HumanInterfaceInputType }
     * 
     * 
     */
    public List<HumanInterfaceInputType> getHumanInterfaceInput() {
        if (humanInterfaceInput == null) {
            humanInterfaceInput = new ArrayList<HumanInterfaceInputType>();
        }
        return this.humanInterfaceInput;
    }

    /**
     * 获取humanInterfaceOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HumanInterfaceOutputType }
     *     
     */
    public HumanInterfaceOutputType getHumanInterfaceOutput() {
        return humanInterfaceOutput;
    }

    /**
     * 设置humanInterfaceOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HumanInterfaceOutputType }
     *     
     */
    public void setHumanInterfaceOutput(HumanInterfaceOutputType value) {
        this.humanInterfaceOutput = value;
    }

    /**
     * Gets the value of the imageAspectRatio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageAspectRatio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageAspectRatio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImageAspectRatio() {
        if (imageAspectRatio == null) {
            imageAspectRatio = new ArrayList<String>();
        }
        return this.imageAspectRatio;
    }

    /**
     * 获取imageBrightness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageBrightness() {
        return imageBrightness;
    }

    /**
     * 设置imageBrightness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageBrightness(String value) {
        this.imageBrightness = value;
    }

    /**
     * 获取imageContrastRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageContrastRatio() {
        return imageContrastRatio;
    }

    /**
     * 设置imageContrastRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageContrastRatio(String value) {
        this.imageContrastRatio = value;
    }

    /**
     * 获取impedance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResistanceDimension }
     *     
     */
    public ResistanceDimension getImpedance() {
        return impedance;
    }

    /**
     * 设置impedance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResistanceDimension }
     *     
     */
    public void setImpedance(ResistanceDimension value) {
        this.impedance = value;
    }

    /**
     * 获取includesMP3Player属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesMP3Player() {
        return includesMP3Player;
    }

    /**
     * 设置includesMP3Player属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesMP3Player(Boolean value) {
        this.includesMP3Player = value;
    }

    /**
     * 获取includesRechargableBattery属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesRechargableBattery() {
        return includesRechargableBattery;
    }

    /**
     * 设置includesRechargableBattery属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesRechargableBattery(Boolean value) {
        this.includesRechargableBattery = value;
    }

    /**
     * 获取includesRemote属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesRemote() {
        return includesRemote;
    }

    /**
     * 设置includesRemote属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesRemote(Boolean value) {
        this.includesRemote = value;
    }

    /**
     * 获取includesSpeakerphone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesSpeakerphone() {
        return includesSpeakerphone;
    }

    /**
     * 设置includesSpeakerphone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesSpeakerphone(Boolean value) {
        this.includesSpeakerphone = value;
    }

    /**
     * Gets the value of the inputAdapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputAdapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputAdapter() {
        if (inputAdapter == null) {
            inputAdapter = new ArrayList<String>();
        }
        return this.inputAdapter;
    }

    /**
     * 获取inputChannelQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInputChannelQuantity() {
        return inputChannelQuantity;
    }

    /**
     * 设置inputChannelQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInputChannelQuantity(BigInteger value) {
        this.inputChannelQuantity = value;
    }

    /**
     * Gets the value of the inputConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * 
     * 
     */
    public List<Connection> getInputConnection() {
        if (inputConnection == null) {
            inputConnection = new ArrayList<Connection>();
        }
        return this.inputConnection;
    }

    /**
     * Gets the value of the inputConnectorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputConnectorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputConnectorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputConnectorType() {
        if (inputConnectorType == null) {
            inputConnectorType = new ArrayList<String>();
        }
        return this.inputConnectorType;
    }

    /**
     * Gets the value of the inputDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputDevice() {
        if (inputDevice == null) {
            inputDevice = new ArrayList<String>();
        }
        return this.inputDevice;
    }

    /**
     * Gets the value of the inputDeviceInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputDeviceInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputDeviceInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputDeviceInterface() {
        if (inputDeviceInterface == null) {
            inputDeviceInterface = new ArrayList<String>();
        }
        return this.inputDeviceInterface;
    }

    /**
     * 获取intercom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntercom() {
        return intercom;
    }

    /**
     * 设置intercom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntercom(Boolean value) {
        this.intercom = value;
    }

    /**
     * 获取internalBaysQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternalBaysQuantity() {
        return internalBaysQuantity;
    }

    /**
     * 设置internalBaysQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternalBaysQuantity(BigInteger value) {
        this.internalBaysQuantity = value;
    }

    /**
     * 获取isdnTerminalAdapterInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDNTerminalAdapterInterface() {
        return isdnTerminalAdapterInterface;
    }

    /**
     * 设置isdnTerminalAdapterInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDNTerminalAdapterInterface(String value) {
        this.isdnTerminalAdapterInterface = value;
    }

    /**
     * 获取isHDTVCompatible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHDTVCompatible() {
        return isHDTVCompatible;
    }

    /**
     * 设置isHDTVCompatible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHDTVCompatible(Boolean value) {
        this.isHDTVCompatible = value;
    }

    /**
     * 获取isWaterproof属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaterproof() {
        return isWaterproof;
    }

    /**
     * 设置isWaterproof属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaterproof(Boolean value) {
        this.isWaterproof = value;
    }

    /**
     * 获取itemDisplayDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getItemDisplayDepth() {
        return itemDisplayDepth;
    }

    /**
     * 设置itemDisplayDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setItemDisplayDepth(LengthDimension value) {
        this.itemDisplayDepth = value;
    }

    /**
     * 获取itemDisplayHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getItemDisplayHeight() {
        return itemDisplayHeight;
    }

    /**
     * 设置itemDisplayHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setItemDisplayHeight(LengthDimension value) {
        this.itemDisplayHeight = value;
    }

    /**
     * 获取itemDisplayLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getItemDisplayLength() {
        return itemDisplayLength;
    }

    /**
     * 设置itemDisplayLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setItemDisplayLength(LengthDimension value) {
        this.itemDisplayLength = value;
    }

    /**
     * 获取itemDisplayLengthMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getItemDisplayLengthMaximum() {
        return itemDisplayLengthMaximum;
    }

    /**
     * 设置itemDisplayLengthMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setItemDisplayLengthMaximum(LengthDimension value) {
        this.itemDisplayLengthMaximum = value;
    }

    /**
     * 获取itemDisplayWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getItemDisplayWeight() {
        return itemDisplayWeight;
    }

    /**
     * 设置itemDisplayWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setItemDisplayWeight(WeightDimension value) {
        this.itemDisplayWeight = value;
    }

    /**
     * 获取itemDisplayWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getItemDisplayWidth() {
        return itemDisplayWidth;
    }

    /**
     * 设置itemDisplayWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setItemDisplayWidth(LengthDimension value) {
        this.itemDisplayWidth = value;
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
     * 获取keyboardDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyboardDescription() {
        return keyboardDescription;
    }

    /**
     * 设置keyboardDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyboardDescription(String value) {
        this.keyboardDescription = value;
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
     * 获取leftConnectorGender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftConnectorGender() {
        return leftConnectorGender;
    }

    /**
     * 设置leftConnectorGender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftConnectorGender(String value) {
        this.leftConnectorGender = value;
    }

    /**
     * Gets the value of the leftConnectorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leftConnectorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeftConnectorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLeftConnectorType() {
        if (leftConnectorType == null) {
            leftConnectorType = new ArrayList<String>();
        }
        return this.leftConnectorType;
    }

    /**
     * 获取manufacturerWarrantyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerWarrantyType() {
        return manufacturerWarrantyType;
    }

    /**
     * 设置manufacturerWarrantyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerWarrantyType(String value) {
        this.manufacturerWarrantyType = value;
    }

    /**
     * Gets the value of the mapType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMapType() {
        if (mapType == null) {
            mapType = new ArrayList<String>();
        }
        return this.mapType;
    }

    /**
     * Gets the value of the materialComposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialComposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialComposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMaterialComposition() {
        if (materialComposition == null) {
            materialComposition = new ArrayList<String>();
        }
        return this.materialComposition;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMaterialType() {
        if (materialType == null) {
            materialType = new ArrayList<String>();
        }
        return this.materialType;
    }

    /**
     * 获取maxCopyResolutionBlackWhite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCopyResolutionBlackWhite() {
        return maxCopyResolutionBlackWhite;
    }

    /**
     * 设置maxCopyResolutionBlackWhite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCopyResolutionBlackWhite(String value) {
        this.maxCopyResolutionBlackWhite = value;
    }

    /**
     * 获取maxCopyResolutionColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCopyResolutionColor() {
        return maxCopyResolutionColor;
    }

    /**
     * 设置maxCopyResolutionColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCopyResolutionColor(String value) {
        this.maxCopyResolutionColor = value;
    }

    /**
     * 获取maximumBridgedOutputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumBridgedOutputPower() {
        return maximumBridgedOutputPower;
    }

    /**
     * 设置maximumBridgedOutputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumBridgedOutputPower(BigInteger value) {
        this.maximumBridgedOutputPower = value;
    }

    /**
     * 获取maximumExternalResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumExternalResolution() {
        return maximumExternalResolution;
    }

    /**
     * 设置maximumExternalResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumExternalResolution(String value) {
        this.maximumExternalResolution = value;
    }

    /**
     * 获取maximumImageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumImageSize() {
        return maximumImageSize;
    }

    /**
     * 设置maximumImageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumImageSize(LengthDimension value) {
        this.maximumImageSize = value;
    }

    /**
     * 获取maximumLinearPeakExcursion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumLinearPeakExcursion() {
        return maximumLinearPeakExcursion;
    }

    /**
     * 设置maximumLinearPeakExcursion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumLinearPeakExcursion(LengthDimension value) {
        this.maximumLinearPeakExcursion = value;
    }

    /**
     * 获取maximumOutputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumOutputPower() {
        return maximumOutputPower;
    }

    /**
     * 设置maximumOutputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumOutputPower(String value) {
        this.maximumOutputPower = value;
    }

    /**
     * 获取maximumRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumRange() {
        return maximumRange;
    }

    /**
     * 设置maximumRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumRange(LengthDimension value) {
        this.maximumRange = value;
    }

    /**
     * 获取maximumRangeIndoors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumRangeIndoors() {
        return maximumRangeIndoors;
    }

    /**
     * 设置maximumRangeIndoors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumRangeIndoors(LengthDimension value) {
        this.maximumRangeIndoors = value;
    }

    /**
     * 获取maximumSampleRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDimension }
     *     
     */
    public FrequencyDimension getMaximumSampleRate() {
        return maximumSampleRate;
    }

    /**
     * 设置maximumSampleRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDimension }
     *     
     */
    public void setMaximumSampleRate(FrequencyDimension value) {
        this.maximumSampleRate = value;
    }

    /**
     * 获取maximumScreenDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMaximumScreenDistance() {
        return maximumScreenDistance;
    }

    /**
     * 设置maximumScreenDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMaximumScreenDistance(LengthDimension value) {
        this.maximumScreenDistance = value;
    }

    /**
     * 获取maxInputSheetCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxInputSheetCapacity() {
        return maxInputSheetCapacity;
    }

    /**
     * 设置maxInputSheetCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxInputSheetCapacity(BigInteger value) {
        this.maxInputSheetCapacity = value;
    }

    /**
     * Gets the value of the maxPrintResolutionBlackWhite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxPrintResolutionBlackWhite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxPrintResolutionBlackWhite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMaxPrintResolutionBlackWhite() {
        if (maxPrintResolutionBlackWhite == null) {
            maxPrintResolutionBlackWhite = new ArrayList<String>();
        }
        return this.maxPrintResolutionBlackWhite;
    }

    /**
     * Gets the value of the maxPrintResolutionColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxPrintResolutionColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxPrintResolutionColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMaxPrintResolutionColor() {
        if (maxPrintResolutionColor == null) {
            maxPrintResolutionColor = new ArrayList<String>();
        }
        return this.maxPrintResolutionColor;
    }

    /**
     * 获取mediaFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaFormat() {
        return mediaFormat;
    }

    /**
     * 设置mediaFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaFormat(String value) {
        this.mediaFormat = value;
    }

    /**
     * 获取mediaLoadType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaLoadType() {
        return mediaLoadType;
    }

    /**
     * 设置mediaLoadType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaLoadType(String value) {
        this.mediaLoadType = value;
    }

    /**
     * Gets the value of the mediaSizeMaximum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaSizeMaximum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaSizeMaximum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMediaSizeMaximum() {
        if (mediaSizeMaximum == null) {
            mediaSizeMaximum = new ArrayList<String>();
        }
        return this.mediaSizeMaximum;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMediaType() {
        if (mediaType == null) {
            mediaType = new ArrayList<String>();
        }
        return this.mediaType;
    }

    /**
     * 获取memoryStorageCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getMemoryStorageCapacity() {
        return memoryStorageCapacity;
    }

    /**
     * 设置memoryStorageCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setMemoryStorageCapacity(MemorySizeDimension value) {
        this.memoryStorageCapacity = value;
    }

    /**
     * 获取memoryTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemoryTechnology() {
        return memoryTechnology;
    }

    /**
     * 设置memoryTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemoryTechnology(String value) {
        this.memoryTechnology = value;
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
     * 获取microphoneFormFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrophoneFormFactor() {
        return microphoneFormFactor;
    }

    /**
     * 设置microphoneFormFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrophoneFormFactor(String value) {
        this.microphoneFormFactor = value;
    }

    /**
     * Gets the value of the microphoneOperationMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the microphoneOperationMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMicrophoneOperationMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMicrophoneOperationMode() {
        if (microphoneOperationMode == null) {
            microphoneOperationMode = new ArrayList<String>();
        }
        return this.microphoneOperationMode;
    }

    /**
     * 获取microphoneTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrophoneTechnology() {
        return microphoneTechnology;
    }

    /**
     * 设置microphoneTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrophoneTechnology(String value) {
        this.microphoneTechnology = value;
    }

    /**
     * 获取miniDiscSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiniDiscSystem() {
        return miniDiscSystem;
    }

    /**
     * 设置miniDiscSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiniDiscSystem(String value) {
        this.miniDiscSystem = value;
    }

    /**
     * 获取minimumImageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumImageSize() {
        return minimumImageSize;
    }

    /**
     * 设置minimumImageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumImageSize(LengthDimension value) {
        this.minimumImageSize = value;
    }

    /**
     * 获取minimumScreenDistance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMinimumScreenDistance() {
        return minimumScreenDistance;
    }

    /**
     * 设置minimumScreenDistance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMinimumScreenDistance(LengthDimension value) {
        this.minimumScreenDistance = value;
    }

    /**
     * 获取minimumSystemRequirementDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumSystemRequirementDescription() {
        return minimumSystemRequirementDescription;
    }

    /**
     * 设置minimumSystemRequirementDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumSystemRequirementDescription(String value) {
        this.minimumSystemRequirementDescription = value;
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
     * 获取modelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * 设置modelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * 获取modemDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemDescription() {
        return modemDescription;
    }

    /**
     * 设置modemDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemDescription(String value) {
        this.modemDescription = value;
    }

    /**
     * 获取modemInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModemInterface() {
        return modemInterface;
    }

    /**
     * 设置modemInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModemInterface(String value) {
        this.modemInterface = value;
    }

    /**
     * 获取modemType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModemTypeValues }
     *     
     */
    public ModemTypeValues getModemType() {
        return modemType;
    }

    /**
     * 设置modemType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModemTypeValues }
     *     
     */
    public void setModemType(ModemTypeValues value) {
        this.modemType = value;
    }

    /**
     * 获取monthlyDutyCycle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthlyDutyCycle() {
        return monthlyDutyCycle;
    }

    /**
     * 设置monthlyDutyCycle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyDutyCycle(String value) {
        this.monthlyDutyCycle = value;
    }

    /**
     * 获取mountingHoleDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getMountingHoleDiameter() {
        return mountingHoleDiameter;
    }

    /**
     * 设置mountingHoleDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setMountingHoleDiameter(LengthDimension value) {
        this.mountingHoleDiameter = value;
    }

    /**
     * 获取movementDetectionTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementDetectionTechnology() {
        return movementDetectionTechnology;
    }

    /**
     * 设置movementDetectionTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementDetectionTechnology(String value) {
        this.movementDetectionTechnology = value;
    }

    /**
     * Gets the value of the multilineOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multilineOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultilineOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMultilineOperation() {
        if (multilineOperation == null) {
            multilineOperation = new ArrayList<String>();
        }
        return this.multilineOperation;
    }

    /**
     * Gets the value of the multimediaFunctionality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multimediaFunctionality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultimediaFunctionality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMultimediaFunctionality() {
        if (multimediaFunctionality == null) {
            multimediaFunctionality = new ArrayList<String>();
        }
        return this.multimediaFunctionality;
    }

    /**
     * 获取navigationRoutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNavigationRoutes() {
        return navigationRoutes;
    }

    /**
     * 设置navigationRoutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNavigationRoutes(BigInteger value) {
        this.navigationRoutes = value;
    }

    /**
     * Gets the value of the networkingFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkingFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkingFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNetworkingFeature() {
        if (networkingFeature == null) {
            networkingFeature = new ArrayList<String>();
        }
        return this.networkingFeature;
    }

    /**
     * 获取networkInterfaceDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkInterfaceDescription() {
        return networkInterfaceDescription;
    }

    /**
     * 设置networkInterfaceDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkInterfaceDescription(String value) {
        this.networkInterfaceDescription = value;
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
     * 获取numberOfPorts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPorts() {
        return numberOfPorts;
    }

    /**
     * 设置numberOfPorts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPorts(BigInteger value) {
        this.numberOfPorts = value;
    }

    /**
     * 获取numberOfSupportedZones属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSupportedZones() {
        return numberOfSupportedZones;
    }

    /**
     * 设置numberOfSupportedZones属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSupportedZones(BigInteger value) {
        this.numberOfSupportedZones = value;
    }

    /**
     * 获取objectiveLensDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getObjectiveLensDiameter() {
        return objectiveLensDiameter;
    }

    /**
     * 设置objectiveLensDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setObjectiveLensDiameter(LengthDimension value) {
        this.objectiveLensDiameter = value;
    }

    /**
     * 获取operatingHumidity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingHumidity() {
        return operatingHumidity;
    }

    /**
     * 设置operatingHumidity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingHumidity(String value) {
        this.operatingHumidity = value;
    }

    /**
     * 获取opticalDigitalInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalDigitalInput() {
        return opticalDigitalInput;
    }

    /**
     * 设置opticalDigitalInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalDigitalInput(String value) {
        this.opticalDigitalInput = value;
    }

    /**
     * 获取opticalDigitalOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalDigitalOutput() {
        return opticalDigitalOutput;
    }

    /**
     * 设置opticalDigitalOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalDigitalOutput(String value) {
        this.opticalDigitalOutput = value;
    }

    /**
     * 获取opticalSensorInterpolatedResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getOpticalSensorInterpolatedResolution() {
        return opticalSensorInterpolatedResolution;
    }

    /**
     * 设置opticalSensorInterpolatedResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setOpticalSensorInterpolatedResolution(PixelDimension value) {
        this.opticalSensorInterpolatedResolution = value;
    }

    /**
     * 获取opticalSensorResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getOpticalSensorResolution() {
        return opticalSensorResolution;
    }

    /**
     * 设置opticalSensorResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setOpticalSensorResolution(PixelDimension value) {
        this.opticalSensorResolution = value;
    }

    /**
     * Gets the value of the opticalStorageDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opticalStorageDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpticalStorageDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOpticalStorageDevice() {
        if (opticalStorageDevice == null) {
            opticalStorageDevice = new ArrayList<String>();
        }
        return this.opticalStorageDevice;
    }

    /**
     * 获取opticalStorageInstalledQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpticalStorageInstalledQuantity() {
        return opticalStorageInstalledQuantity;
    }

    /**
     * 设置opticalStorageInstalledQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpticalStorageInstalledQuantity(BigInteger value) {
        this.opticalStorageInstalledQuantity = value;
    }

    /**
     * 获取opticalStorageReadSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalStorageReadSpeed() {
        return opticalStorageReadSpeed;
    }

    /**
     * 设置opticalStorageReadSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalStorageReadSpeed(String value) {
        this.opticalStorageReadSpeed = value;
    }

    /**
     * 获取opticalStorageRewriteSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalStorageRewriteSpeed() {
        return opticalStorageRewriteSpeed;
    }

    /**
     * 设置opticalStorageRewriteSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalStorageRewriteSpeed(String value) {
        this.opticalStorageRewriteSpeed = value;
    }

    /**
     * 获取opticalStorageSecondaryReadSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalStorageSecondaryReadSpeed() {
        return opticalStorageSecondaryReadSpeed;
    }

    /**
     * 设置opticalStorageSecondaryReadSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalStorageSecondaryReadSpeed(String value) {
        this.opticalStorageSecondaryReadSpeed = value;
    }

    /**
     * 获取opticalStorageSecondaryRewriteSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalStorageSecondaryRewriteSpeed() {
        return opticalStorageSecondaryRewriteSpeed;
    }

    /**
     * 设置opticalStorageSecondaryRewriteSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalStorageSecondaryRewriteSpeed(String value) {
        this.opticalStorageSecondaryRewriteSpeed = value;
    }

    /**
     * Gets the value of the opticalStorageSecondaryType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opticalStorageSecondaryType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpticalStorageSecondaryType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOpticalStorageSecondaryType() {
        if (opticalStorageSecondaryType == null) {
            opticalStorageSecondaryType = new ArrayList<String>();
        }
        return this.opticalStorageSecondaryType;
    }

    /**
     * 获取opticalStorageSecondaryWriteSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalStorageSecondaryWriteSpeed() {
        return opticalStorageSecondaryWriteSpeed;
    }

    /**
     * 设置opticalStorageSecondaryWriteSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalStorageSecondaryWriteSpeed(String value) {
        this.opticalStorageSecondaryWriteSpeed = value;
    }

    /**
     * 获取opticalStorageWriteSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalStorageWriteSpeed() {
        return opticalStorageWriteSpeed;
    }

    /**
     * 设置opticalStorageWriteSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalStorageWriteSpeed(String value) {
        this.opticalStorageWriteSpeed = value;
    }

    /**
     * 获取outputChannelQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutputChannelQuantity() {
        return outputChannelQuantity;
    }

    /**
     * 设置outputChannelQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutputChannelQuantity(BigInteger value) {
        this.outputChannelQuantity = value;
    }

    /**
     * Gets the value of the outputConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * 
     * 
     */
    public List<Connection> getOutputConnection() {
        if (outputConnection == null) {
            outputConnection = new ArrayList<Connection>();
        }
        return this.outputConnection;
    }

    /**
     * 获取outputConnectorQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutputConnectorQuantity() {
        return outputConnectorQuantity;
    }

    /**
     * 设置outputConnectorQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutputConnectorQuantity(BigInteger value) {
        this.outputConnectorQuantity = value;
    }

    /**
     * Gets the value of the outputConnectorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputConnectorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputConnectorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOutputConnectorType() {
        if (outputConnectorType == null) {
            outputConnectorType = new ArrayList<String>();
        }
        return this.outputConnectorType;
    }

    /**
     * 获取outputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutputPower() {
        return outputPower;
    }

    /**
     * 设置outputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutputPower(BigInteger value) {
        this.outputPower = value;
    }

    /**
     * 获取outputWattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutputWattage() {
        return outputWattage;
    }

    /**
     * 设置outputWattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutputWattage(BigInteger value) {
        this.outputWattage = value;
    }

    /**
     * 获取packageContentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageContentType() {
        return packageContentType;
    }

    /**
     * 设置packageContentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageContentType(String value) {
        this.packageContentType = value;
    }

    /**
     * 获取packageTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeName() {
        return packageTypeName;
    }

    /**
     * 设置packageTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeName(String value) {
        this.packageTypeName = value;
    }

    /**
     * 获取pcConnectionAvailable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCConnectionAvailable() {
        return pcConnectionAvailable;
    }

    /**
     * 设置pcConnectionAvailable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCConnectionAvailable(String value) {
        this.pcConnectionAvailable = value;
    }

    /**
     * 获取phoneBaseDepth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getPhoneBaseDepth() {
        return phoneBaseDepth;
    }

    /**
     * 设置phoneBaseDepth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setPhoneBaseDepth(LengthDimension value) {
        this.phoneBaseDepth = value;
    }

    /**
     * 获取phoneBaseHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getPhoneBaseHeight() {
        return phoneBaseHeight;
    }

    /**
     * 设置phoneBaseHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setPhoneBaseHeight(LengthDimension value) {
        this.phoneBaseHeight = value;
    }

    /**
     * 获取phoneBaseWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getPhoneBaseWeight() {
        return phoneBaseWeight;
    }

    /**
     * 设置phoneBaseWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setPhoneBaseWeight(WeightDimension value) {
        this.phoneBaseWeight = value;
    }

    /**
     * 获取phoneBaseWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getPhoneBaseWidth() {
        return phoneBaseWidth;
    }

    /**
     * 设置phoneBaseWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setPhoneBaseWidth(LengthDimension value) {
        this.phoneBaseWidth = value;
    }

    /**
     * 获取portedBoxVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CE.PortedBoxVolume }
     *     
     */
    public CE.PortedBoxVolume getPortedBoxVolume() {
        return portedBoxVolume;
    }

    /**
     * 设置portedBoxVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CE.PortedBoxVolume }
     *     
     */
    public void setPortedBoxVolume(CE.PortedBoxVolume value) {
        this.portedBoxVolume = value;
    }

    /**
     * 获取powerAmplifierClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerAmplifierClass() {
        return powerAmplifierClass;
    }

    /**
     * 设置powerAmplifierClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerAmplifierClass(String value) {
        this.powerAmplifierClass = value;
    }

    /**
     * 获取powerDevice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerDevice() {
        return powerDevice;
    }

    /**
     * 设置powerDevice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerDevice(String value) {
        this.powerDevice = value;
    }

    /**
     * 获取powerGain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VoltageIntegerDimension }
     *     
     */
    public VoltageIntegerDimension getPowerGain() {
        return powerGain;
    }

    /**
     * 设置powerGain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageIntegerDimension }
     *     
     */
    public void setPowerGain(VoltageIntegerDimension value) {
        this.powerGain = value;
    }

    /**
     * 获取powerLoadRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerLoadRating() {
        return powerLoadRating;
    }

    /**
     * 设置powerLoadRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerLoadRating(String value) {
        this.powerLoadRating = value;
    }

    /**
     * 获取preampOutputChannels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreampOutputChannels() {
        return preampOutputChannels;
    }

    /**
     * 设置preampOutputChannels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreampOutputChannels(BigInteger value) {
        this.preampOutputChannels = value;
    }

    /**
     * 获取presetChannelQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPresetChannelQuantity() {
        return presetChannelQuantity;
    }

    /**
     * 设置presetChannelQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPresetChannelQuantity(BigInteger value) {
        this.presetChannelQuantity = value;
    }

    /**
     * 获取printerInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterInterface() {
        return printerInterface;
    }

    /**
     * 设置printerInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterInterface(String value) {
        this.printerInterface = value;
    }

    /**
     * 获取printerOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterOutput() {
        return printerOutput;
    }

    /**
     * 设置printerOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterOutput(String value) {
        this.printerOutput = value;
    }

    /**
     * 获取printerResolutionBWHorizontalMax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getPrinterResolutionBWHorizontalMax() {
        return printerResolutionBWHorizontalMax;
    }

    /**
     * 设置printerResolutionBWHorizontalMax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setPrinterResolutionBWHorizontalMax(PixelDimension value) {
        this.printerResolutionBWHorizontalMax = value;
    }

    /**
     * 获取printerResolutionBWVerticalMax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getPrinterResolutionBWVerticalMax() {
        return printerResolutionBWVerticalMax;
    }

    /**
     * 设置printerResolutionBWVerticalMax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setPrinterResolutionBWVerticalMax(PixelDimension value) {
        this.printerResolutionBWVerticalMax = value;
    }

    /**
     * 获取printerResolutionColorHorizontalMax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getPrinterResolutionColorHorizontalMax() {
        return printerResolutionColorHorizontalMax;
    }

    /**
     * 设置printerResolutionColorHorizontalMax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setPrinterResolutionColorHorizontalMax(PixelDimension value) {
        this.printerResolutionColorHorizontalMax = value;
    }

    /**
     * 获取printerResolutionColorVerticalMax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getPrinterResolutionColorVerticalMax() {
        return printerResolutionColorVerticalMax;
    }

    /**
     * 设置printerResolutionColorVerticalMax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setPrinterResolutionColorVerticalMax(PixelDimension value) {
        this.printerResolutionColorVerticalMax = value;
    }

    /**
     * 获取printerTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterTechnology() {
        return printerTechnology;
    }

    /**
     * 设置printerTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterTechnology(String value) {
        this.printerTechnology = value;
    }

    /**
     * 获取processorDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorDescription() {
        return processorDescription;
    }

    /**
     * 设置processorDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorDescription(String value) {
        this.processorDescription = value;
    }

    /**
     * 获取processorMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProcessorMaximum() {
        return processorMaximum;
    }

    /**
     * 设置processorMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProcessorMaximum(BigInteger value) {
        this.processorMaximum = value;
    }

    /**
     * 获取processorModelNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorModelNumber() {
        return processorModelNumber;
    }

    /**
     * 设置processorModelNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorModelNumber(String value) {
        this.processorModelNumber = value;
    }

    /**
     * 获取processorUpgrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorUpgrade() {
        return processorUpgrade;
    }

    /**
     * 设置processorUpgrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorUpgrade(String value) {
        this.processorUpgrade = value;
    }

    /**
     * Gets the value of the programmability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programmability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgrammability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProgrammability() {
        if (programmability == null) {
            programmability = new ArrayList<String>();
        }
        return this.programmability;
    }

    /**
     * 获取qtsTotalQFactor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtsTotalQFactor() {
        return qtsTotalQFactor;
    }

    /**
     * 设置qtsTotalQFactor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtsTotalQFactor(BigDecimal value) {
        this.qtsTotalQFactor = value;
    }

    /**
     * 获取radioBandsSupported属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioBandsSupported() {
        return radioBandsSupported;
    }

    /**
     * 设置radioBandsSupported属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioBandsSupported(String value) {
        this.radioBandsSupported = value;
    }

    /**
     * 获取radioChannels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioChannels() {
        return radioChannels;
    }

    /**
     * 设置radioChannels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioChannels(String value) {
        this.radioChannels = value;
    }

    /**
     * Gets the value of the raidLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raidLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRAIDLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRAIDLevel() {
        if (raidLevel == null) {
            raidLevel = new ArrayList<String>();
        }
        return this.raidLevel;
    }

    /**
     * 获取ramMemoryInstalledSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getRAMMemoryInstalledSize() {
        return ramMemoryInstalledSize;
    }

    /**
     * 设置ramMemoryInstalledSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setRAMMemoryInstalledSize(MemorySizeDimension value) {
        this.ramMemoryInstalledSize = value;
    }

    /**
     * 获取ramMemoryMaximumSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getRAMMemoryMaximumSize() {
        return ramMemoryMaximumSize;
    }

    /**
     * 设置ramMemoryMaximumSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setRAMMemoryMaximumSize(MemorySizeDimension value) {
        this.ramMemoryMaximumSize = value;
    }

    /**
     * 获取ramMemoryTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAMMemoryTechnology() {
        return ramMemoryTechnology;
    }

    /**
     * 设置ramMemoryTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAMMemoryTechnology(String value) {
        this.ramMemoryTechnology = value;
    }

    /**
     * 获取rangefinderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangefinderType() {
        return rangefinderType;
    }

    /**
     * 设置rangefinderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangefinderType(String value) {
        this.rangefinderType = value;
    }

    /**
     * 获取receiverDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverDescription() {
        return receiverDescription;
    }

    /**
     * 设置receiverDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverDescription(String value) {
        this.receiverDescription = value;
    }

    /**
     * 获取recordingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getRecordingCapacity() {
        return recordingCapacity;
    }

    /**
     * 设置recordingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setRecordingCapacity(MemorySizeDimension value) {
        this.recordingCapacity = value;
    }

    /**
     * Gets the value of the remoteControlAudioControls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteControlAudioControls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteControlAudioControls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoteControlAudioControls() {
        if (remoteControlAudioControls == null) {
            remoteControlAudioControls = new ArrayList<String>();
        }
        return this.remoteControlAudioControls;
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
     * 获取remoteControlTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteControlTechnology() {
        return remoteControlTechnology;
    }

    /**
     * 设置remoteControlTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteControlTechnology(String value) {
        this.remoteControlTechnology = value;
    }

    /**
     * Gets the value of the remoteManagementProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteManagementProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteManagementProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoteManagementProtocol() {
        if (remoteManagementProtocol == null) {
            remoteManagementProtocol = new ArrayList<String>();
        }
        return this.remoteManagementProtocol;
    }

    /**
     * 获取removableMediaCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getRemovableMediaCapacity() {
        return removableMediaCapacity;
    }

    /**
     * 设置removableMediaCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setRemovableMediaCapacity(MemorySizeDimension value) {
        this.removableMediaCapacity = value;
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
     * 获取removableStorage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovableStorage() {
        return removableStorage;
    }

    /**
     * 设置removableStorage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovableStorage(String value) {
        this.removableStorage = value;
    }

    /**
     * 获取removableStorageInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovableStorageInterface() {
        return removableStorageInterface;
    }

    /**
     * 设置removableStorageInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovableStorageInterface(String value) {
        this.removableStorageInterface = value;
    }

    /**
     * 获取removableStorageNativeCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getRemovableStorageNativeCapacity() {
        return removableStorageNativeCapacity;
    }

    /**
     * 设置removableStorageNativeCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setRemovableStorageNativeCapacity(MemorySizeDimension value) {
        this.removableStorageNativeCapacity = value;
    }

    /**
     * 获取responseTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getResponseTime() {
        return responseTime;
    }

    /**
     * 设置responseTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setResponseTime(TimeDimension value) {
        this.responseTime = value;
    }

    /**
     * 获取rightConnectorGender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightConnectorGender() {
        return rightConnectorGender;
    }

    /**
     * 设置rightConnectorGender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightConnectorGender(String value) {
        this.rightConnectorGender = value;
    }

    /**
     * Gets the value of the rightConnectorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightConnectorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightConnectorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRightConnectorType() {
        if (rightConnectorType == null) {
            rightConnectorType = new ArrayList<String>();
        }
        return this.rightConnectorType;
    }

    /**
     * Gets the value of the routingProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoutingProtocol() {
        if (routingProtocol == null) {
            routingProtocol = new ArrayList<String>();
        }
        return this.routingProtocol;
    }

    /**
     * Gets the value of the satelliteServiceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the satelliteServiceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSatelliteServiceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSatelliteServiceDescription() {
        if (satelliteServiceDescription == null) {
            satelliteServiceDescription = new ArrayList<String>();
        }
        return this.satelliteServiceDescription;
    }

    /**
     * Gets the value of the sbas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSBAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSBAS() {
        if (sbas == null) {
            sbas = new ArrayList<String>();
        }
        return this.sbas;
    }

    /**
     * 获取scanElementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanElementType() {
        return scanElementType;
    }

    /**
     * 设置scanElementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanElementType(String value) {
        this.scanElementType = value;
    }

    /**
     * 获取scannerInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerInterface() {
        return scannerInterface;
    }

    /**
     * 设置scannerInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerInterface(String value) {
        this.scannerInterface = value;
    }

    /**
     * 获取scannerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerType() {
        return scannerType;
    }

    /**
     * 设置scannerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerType(String value) {
        this.scannerType = value;
    }

    /**
     * 获取scsiSignalingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCSISignalingType() {
        return scsiSignalingType;
    }

    /**
     * 设置scsiSignalingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCSISignalingType(String value) {
        this.scsiSignalingType = value;
    }

    /**
     * 获取sealedBoxVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CE.SealedBoxVolume }
     *     
     */
    public CE.SealedBoxVolume getSealedBoxVolume() {
        return sealedBoxVolume;
    }

    /**
     * 设置sealedBoxVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CE.SealedBoxVolume }
     *     
     */
    public void setSealedBoxVolume(CE.SealedBoxVolume value) {
        this.sealedBoxVolume = value;
    }

    /**
     * Gets the value of the searchSpeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchSpeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSearchSpeed() {
        if (searchSpeed == null) {
            searchSpeed = new ArrayList<String>();
        }
        return this.searchSpeed;
    }

    /**
     * 获取secondaryCache属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecondaryCache() {
        return secondaryCache;
    }

    /**
     * 设置secondaryCache属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecondaryCache(BigInteger value) {
        this.secondaryCache = value;
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
     * 获取signalToNoiseRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSignalToNoiseRatio() {
        return signalToNoiseRatio;
    }

    /**
     * 设置signalToNoiseRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSignalToNoiseRatio(BigDecimal value) {
        this.signalToNoiseRatio = value;
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
     * 获取speakerAmplificationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerAmplificationType() {
        return speakerAmplificationType;
    }

    /**
     * 设置speakerAmplificationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerAmplificationType(String value) {
        this.speakerAmplificationType = value;
    }

    /**
     * 获取speakerConnectivity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerConnectivity() {
        return speakerConnectivity;
    }

    /**
     * 设置speakerConnectivity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerConnectivity(String value) {
        this.speakerConnectivity = value;
    }

    /**
     * 获取speakerDriverMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerDriverMaterial() {
        return speakerDriverMaterial;
    }

    /**
     * 设置speakerDriverMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerDriverMaterial(String value) {
        this.speakerDriverMaterial = value;
    }

    /**
     * Gets the value of the speakersCrossoverChannelQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speakersCrossoverChannelQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeakersCrossoverChannelQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpeakersCrossoverChannelQuantity() {
        if (speakersCrossoverChannelQuantity == null) {
            speakersCrossoverChannelQuantity = new ArrayList<String>();
        }
        return this.speakersCrossoverChannelQuantity;
    }

    /**
     * 获取speakersIncludedDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakersIncludedDescription() {
        return speakersIncludedDescription;
    }

    /**
     * 设置speakersIncludedDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakersIncludedDescription(String value) {
        this.speakersIncludedDescription = value;
    }

    /**
     * 获取speakersMaximumOutputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeakersMaximumOutputPower() {
        return speakersMaximumOutputPower;
    }

    /**
     * 设置speakersMaximumOutputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeakersMaximumOutputPower(BigDecimal value) {
        this.speakersMaximumOutputPower = value;
    }

    /**
     * 获取speakersNominalOutputPower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpeakersNominalOutputPower() {
        return speakersNominalOutputPower;
    }

    /**
     * 设置speakersNominalOutputPower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpeakersNominalOutputPower(BigDecimal value) {
        this.speakersNominalOutputPower = value;
    }

    /**
     * 获取speakersResponseBandwidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakersResponseBandwidth() {
        return speakersResponseBandwidth;
    }

    /**
     * 设置speakersResponseBandwidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakersResponseBandwidth(String value) {
        this.speakersResponseBandwidth = value;
    }

    /**
     * 获取speakerSystemClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerSystemClass() {
        return speakerSystemClass;
    }

    /**
     * 设置speakerSystemClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerSystemClass(String value) {
        this.speakerSystemClass = value;
    }

    /**
     * 获取speakerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerType() {
        return speakerType;
    }

    /**
     * 设置speakerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerType(String value) {
        this.speakerType = value;
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
     * Gets the value of the specificationMet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificationMet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificationMet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecificationMet() {
        if (specificationMet == null) {
            specificationMet = new ArrayList<String>();
        }
        return this.specificationMet;
    }

    /**
     * 获取specificUses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUses() {
        return specificUses;
    }

    /**
     * 设置specificUses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUses(String value) {
        this.specificUses = value;
    }

    /**
     * 获取ssdDriveArchitechture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSDDriveArchitechture() {
        return ssdDriveArchitechture;
    }

    /**
     * 设置ssdDriveArchitechture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSDDriveArchitechture(String value) {
        this.ssdDriveArchitechture = value;
    }

    /**
     * 获取standardInputSheetCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandardInputSheetCapacity() {
        return standardInputSheetCapacity;
    }

    /**
     * 设置standardInputSheetCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandardInputSheetCapacity(BigInteger value) {
        this.standardInputSheetCapacity = value;
    }

    /**
     * 获取storageController属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageController() {
        return storageController;
    }

    /**
     * 设置storageController属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageController(String value) {
        this.storageController = value;
    }

    /**
     * 获取storageControllerInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageControllerInterface() {
        return storageControllerInterface;
    }

    /**
     * 设置storageControllerInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageControllerInterface(String value) {
        this.storageControllerInterface = value;
    }

    /**
     * 获取storageHumidity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageHumidity() {
        return storageHumidity;
    }

    /**
     * 设置storageHumidity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageHumidity(String value) {
        this.storageHumidity = value;
    }

    /**
     * 获取storageInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageInterface() {
        return storageInterface;
    }

    /**
     * 设置storageInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageInterface(String value) {
        this.storageInterface = value;
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
     * Gets the value of the supportedAudioFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedAudioFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedAudioFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedAudioFormat() {
        if (supportedAudioFormat == null) {
            supportedAudioFormat = new ArrayList<String>();
        }
        return this.supportedAudioFormat;
    }

    /**
     * Gets the value of the supportedDevices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedDevices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedDevices() {
        if (supportedDevices == null) {
            supportedDevices = new ArrayList<String>();
        }
        return this.supportedDevices;
    }

    /**
     * 获取supportedDevicesQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSupportedDevicesQuantity() {
        return supportedDevicesQuantity;
    }

    /**
     * 设置supportedDevicesQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSupportedDevicesQuantity(BigInteger value) {
        this.supportedDevicesQuantity = value;
    }

    /**
     * Gets the value of the supportedImageFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedImageFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedImageFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedImageFormat() {
        if (supportedImageFormat == null) {
            supportedImageFormat = new ArrayList<String>();
        }
        return this.supportedImageFormat;
    }

    /**
     * Gets the value of the supportedImageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedImageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedImageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedImageType() {
        if (supportedImageType == null) {
            supportedImageType = new ArrayList<String>();
        }
        return this.supportedImageType;
    }

    /**
     * 获取supportedMediaSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedMediaSize() {
        return supportedMediaSize;
    }

    /**
     * 设置supportedMediaSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedMediaSize(String value) {
        this.supportedMediaSize = value;
    }

    /**
     * 获取supportedMotherboard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedMotherboard() {
        return supportedMotherboard;
    }

    /**
     * 设置supportedMotherboard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedMotherboard(String value) {
        this.supportedMotherboard = value;
    }

    /**
     * Gets the value of the supportedStandards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedStandards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedStandards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedStandards() {
        if (supportedStandards == null) {
            supportedStandards = new ArrayList<String>();
        }
        return this.supportedStandards;
    }

    /**
     * 获取surgeSuppression属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurgeSuppression() {
        return surgeSuppression;
    }

    /**
     * 设置surgeSuppression属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurgeSuppression(String value) {
        this.surgeSuppression = value;
    }

    /**
     * 获取surroundSoundChannels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurroundSoundChannels() {
        return surroundSoundChannels;
    }

    /**
     * 设置surroundSoundChannels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurroundSoundChannels(String value) {
        this.surroundSoundChannels = value;
    }

    /**
     * Gets the value of the surroundSoundEffects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surroundSoundEffects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurroundSoundEffects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSurroundSoundEffects() {
        if (surroundSoundEffects == null) {
            surroundSoundEffects = new ArrayList<String>();
        }
        return this.surroundSoundEffects;
    }

    /**
     * Gets the value of the switchingProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the switchingProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwitchingProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSwitchingProtocol() {
        if (switchingProtocol == null) {
            switchingProtocol = new ArrayList<String>();
        }
        return this.switchingProtocol;
    }

    /**
     * 获取systemBusSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSystemBusSpeed() {
        return systemBusSpeed;
    }

    /**
     * 设置systemBusSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSystemBusSpeed(BigDecimal value) {
        this.systemBusSpeed = value;
    }

    /**
     * 获取talkRangeMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getTalkRangeMaximum() {
        return talkRangeMaximum;
    }

    /**
     * 设置talkRangeMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setTalkRangeMaximum(LengthDimension value) {
        this.talkRangeMaximum = value;
    }

    /**
     * 获取tapeLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getTapeLength() {
        return tapeLength;
    }

    /**
     * 设置tapeLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setTapeLength(TimeDimension value) {
        this.tapeLength = value;
    }

    /**
     * 获取televisionInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelevisionInterface() {
        return televisionInterface;
    }

    /**
     * 设置televisionInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelevisionInterface(String value) {
        this.televisionInterface = value;
    }

    /**
     * 获取televisionPCInterfaceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelevisionPCInterfaceType() {
        return televisionPCInterfaceType;
    }

    /**
     * 设置televisionPCInterfaceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelevisionPCInterfaceType(String value) {
        this.televisionPCInterfaceType = value;
    }

    /**
     * 获取temperatureRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureRating() {
        return temperatureRating;
    }

    /**
     * 设置temperatureRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureRating(String value) {
        this.temperatureRating = value;
    }

    /**
     * 获取totalHarmonicDistortion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalHarmonicDistortion() {
        return totalHarmonicDistortion;
    }

    /**
     * 设置totalHarmonicDistortion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalHarmonicDistortion(String value) {
        this.totalHarmonicDistortion = value;
    }

    /**
     * 获取tracklogPoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTracklogPoints() {
        return tracklogPoints;
    }

    /**
     * 设置tracklogPoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTracklogPoints(BigInteger value) {
        this.tracklogPoints = value;
    }

    /**
     * 获取tracks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTracks() {
        return tracks;
    }

    /**
     * 设置tracks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTracks(BigInteger value) {
        this.tracks = value;
    }

    /**
     * Gets the value of the transportProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransportProtocol() {
        if (transportProtocol == null) {
            transportProtocol = new ArrayList<String>();
        }
        return this.transportProtocol;
    }

    /**
     * 获取tuner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuner() {
        return tuner;
    }

    /**
     * 设置tuner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuner(String value) {
        this.tuner = value;
    }

    /**
     * Gets the value of the tunerTechnology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tunerTechnology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTunerTechnology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTunerTechnology() {
        if (tunerTechnology == null) {
            tunerTechnology = new ArrayList<String>();
        }
        return this.tunerTechnology;
    }

    /**
     * 获取tvTunerSecondaryAudioProgram属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTVTunerSecondaryAudioProgram() {
        return tvTunerSecondaryAudioProgram;
    }

    /**
     * 设置tvTunerSecondaryAudioProgram属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTVTunerSecondaryAudioProgram(Boolean value) {
        this.tvTunerSecondaryAudioProgram = value;
    }

    /**
     * 获取upsTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPSTechnology() {
        return upsTechnology;
    }

    /**
     * 设置upsTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPSTechnology(String value) {
        this.upsTechnology = value;
    }

    /**
     * Gets the value of the vcrType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcrType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVCRType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVCRType() {
        if (vcrType == null) {
            vcrType = new ArrayList<String>();
        }
        return this.vcrType;
    }

    /**
     * 获取verticalResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PixelDimension }
     *     
     */
    public PixelDimension getVerticalResolution() {
        return verticalResolution;
    }

    /**
     * 设置verticalResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PixelDimension }
     *     
     */
    public void setVerticalResolution(PixelDimension value) {
        this.verticalResolution = value;
    }

    /**
     * Gets the value of the videoCaptureFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoCaptureFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoCaptureFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoCaptureFormat() {
        if (videoCaptureFormat == null) {
            videoCaptureFormat = new ArrayList<String>();
        }
        return this.videoCaptureFormat;
    }

    /**
     * Gets the value of the videoCaptureResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoCaptureResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoCaptureResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoCaptureResolution() {
        if (videoCaptureResolution == null) {
            videoCaptureResolution = new ArrayList<String>();
        }
        return this.videoCaptureResolution;
    }

    /**
     * 获取videoHeadQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVideoHeadQuantity() {
        return videoHeadQuantity;
    }

    /**
     * 设置videoHeadQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVideoHeadQuantity(BigInteger value) {
        this.videoHeadQuantity = value;
    }

    /**
     * Gets the value of the videoInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoInput() {
        if (videoInput == null) {
            videoInput = new ArrayList<String>();
        }
        return this.videoInput;
    }

    /**
     * Gets the value of the videoInputDigitalStandard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoInputDigitalStandard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoInputDigitalStandard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoInputDigitalStandard() {
        if (videoInputDigitalStandard == null) {
            videoInputDigitalStandard = new ArrayList<String>();
        }
        return this.videoInputDigitalStandard;
    }

    /**
     * Gets the value of the videoInputFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoInputFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoInputFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoInputFormat() {
        if (videoInputFormat == null) {
            videoInputFormat = new ArrayList<String>();
        }
        return this.videoInputFormat;
    }

    /**
     * 获取videoOutputFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoOutputFormat() {
        return videoOutputFormat;
    }

    /**
     * 设置videoOutputFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoOutputFormat(String value) {
        this.videoOutputFormat = value;
    }

    /**
     * Gets the value of the videoOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoOutput() {
        if (videoOutput == null) {
            videoOutput = new ArrayList<String>();
        }
        return this.videoOutput;
    }

    /**
     * Gets the value of the videoOutputInterface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoOutputInterface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoOutputInterface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoOutputInterface() {
        if (videoOutputInterface == null) {
            videoOutputInterface = new ArrayList<String>();
        }
        return this.videoOutputInterface;
    }

    /**
     * 获取videoOutputMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoOutputMode() {
        return videoOutputMode;
    }

    /**
     * 设置videoOutputMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoOutputMode(String value) {
        this.videoOutputMode = value;
    }

    /**
     * Gets the value of the videoPlaybackFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoPlaybackFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoPlaybackFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoPlaybackFormat() {
        if (videoPlaybackFormat == null) {
            videoPlaybackFormat = new ArrayList<String>();
        }
        return this.videoPlaybackFormat;
    }

    /**
     * Gets the value of the videotapePlaybackSpeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videotapePlaybackSpeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideotapePlaybackSpeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideotapePlaybackSpeed() {
        if (videotapePlaybackSpeed == null) {
            videotapePlaybackSpeed = new ArrayList<String>();
        }
        return this.videotapePlaybackSpeed;
    }

    /**
     * 获取videotapeRecordingSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideotapeRecordingSpeed() {
        return videotapeRecordingSpeed;
    }

    /**
     * 设置videotapeRecordingSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideotapeRecordingSpeed(String value) {
        this.videotapeRecordingSpeed = value;
    }

    /**
     * Gets the value of the voiceCommunicationSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceCommunicationSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceCommunicationSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoiceCommunicationSupport() {
        if (voiceCommunicationSupport == null) {
            voiceCommunicationSupport = new ArrayList<String>();
        }
        return this.voiceCommunicationSupport;
    }

    /**
     * 获取voiceCoilDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceCoilDescription() {
        return voiceCoilDescription;
    }

    /**
     * 设置voiceCoilDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceCoilDescription(String value) {
        this.voiceCoilDescription = value;
    }

    /**
     * 获取voicemailCapability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoicemailCapability() {
        return voicemailCapability;
    }

    /**
     * 设置voicemailCapability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoicemailCapability(Boolean value) {
        this.voicemailCapability = value;
    }

    /**
     * 获取voiceOperatedTransmission属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceOperatedTransmission() {
        return voiceOperatedTransmission;
    }

    /**
     * 设置voiceOperatedTransmission属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceOperatedTransmission(String value) {
        this.voiceOperatedTransmission = value;
    }

    /**
     * Gets the value of the voipProtocols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voipProtocols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVOIPProtocols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVOIPProtocols() {
        if (voipProtocols == null) {
            voipProtocols = new ArrayList<String>();
        }
        return this.voipProtocols;
    }

    /**
     * 获取volumeAcousticSuspension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getVolumeAcousticSuspension() {
        return volumeAcousticSuspension;
    }

    /**
     * 设置volumeAcousticSuspension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setVolumeAcousticSuspension(VolumeDimension value) {
        this.volumeAcousticSuspension = value;
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
     * 获取warrantyDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyDescription() {
        return warrantyDescription;
    }

    /**
     * 设置warrantyDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyDescription(String value) {
        this.warrantyDescription = value;
    }

    /**
     * 获取waterproofRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterproofRating() {
        return waterproofRating;
    }

    /**
     * 设置waterproofRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterproofRating(String value) {
        this.waterproofRating = value;
    }

    /**
     * 获取waypoints属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWaypoints() {
        return waypoints;
    }

    /**
     * 设置waypoints属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWaypoints(BigDecimal value) {
        this.waypoints = value;
    }

    /**
     * 获取waypointsPerRoute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaypointsPerRoute() {
        return waypointsPerRoute;
    }

    /**
     * 设置waypointsPerRoute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaypointsPerRoute(BigInteger value) {
        this.waypointsPerRoute = value;
    }

    /**
     * 获取weatherproof属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherproof() {
        return weatherproof;
    }

    /**
     * 设置weatherproof属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherproof(String value) {
        this.weatherproof = value;
    }

    /**
     * 获取writeSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteSpeed() {
        return writeSpeed;
    }

    /**
     * 设置writeSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteSpeed(String value) {
        this.writeSpeed = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>nonNegativeInteger">
     *       &lt;attribute name="unitOfMeasure" use="required" type="{}DataTransferUnitOfMeasure" />
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
    public static class DataTransferRate {

        @XmlValue
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger value;
        @XmlAttribute(name = "unitOfMeasure", required = true)
        protected DataTransferUnitOfMeasure unitOfMeasure;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DataTransferUnitOfMeasure }
         *     
         */
        public DataTransferUnitOfMeasure getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DataTransferUnitOfMeasure }
         *     
         */
        public void setUnitOfMeasure(DataTransferUnitOfMeasure value) {
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
     *     &lt;extension base="&lt;>StringNotNull">
     *       &lt;attribute name="unitOfMeasure" use="required" type="{}VolumeUnitOfMeasure" />
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
    public static class PortedBoxVolume {

        @XmlValue
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "unitOfMeasure", required = true)
        protected VolumeUnitOfMeasure unitOfMeasure;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VolumeUnitOfMeasure }
         *     
         */
        public VolumeUnitOfMeasure getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VolumeUnitOfMeasure }
         *     
         */
        public void setUnitOfMeasure(VolumeUnitOfMeasure value) {
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
     *       &lt;choice>
     *         &lt;element ref="{}Antenna"/>
     *         &lt;element ref="{}AudioVideoAccessory"/>
     *         &lt;element ref="{}AVFurniture"/>
     *         &lt;element ref="{}BarCodeReader"/>
     *         &lt;element ref="{}CEBinocular"/>
     *         &lt;element ref="{}CECamcorder"/>
     *         &lt;element ref="{}CameraBagsAndCases"/>
     *         &lt;element ref="{}CEBattery"/>
     *         &lt;element ref="{}CEBlankMedia"/>
     *         &lt;element ref="{}CableOrAdapter"/>
     *         &lt;element ref="{}CECameraFlash"/>
     *         &lt;element ref="{}CameraLenses"/>
     *         &lt;element ref="{}CameraOtherAccessories"/>
     *         &lt;element ref="{}CameraPowerSupply"/>
     *         &lt;element ref="{}CarAlarm"/>
     *         &lt;element ref="{}CarAudioOrTheater"/>
     *         &lt;element ref="{}CarElectronics"/>
     *         &lt;element ref="{}ConsumerElectronics"/>
     *         &lt;element ref="{}CEDigitalCamera"/>
     *         &lt;element ref="{}DigitalPictureFrame"/>
     *         &lt;element ref="{}DigitalVideoRecorder"/>
     *         &lt;element ref="{}DVDPlayerOrRecorder"/>
     *         &lt;element ref="{}CEFilmCamera"/>
     *         &lt;element ref="{}GPSOrNavigationAccessory"/>
     *         &lt;element ref="{}GPSOrNavigationSystem"/>
     *         &lt;element ref="{}HandheldOrPDA"/>
     *         &lt;element ref="{}Headphones"/>
     *         &lt;element ref="{}HomeTheaterSystemOrHTIB"/>
     *         &lt;element ref="{}KindleAccessories"/>
     *         &lt;element ref="{}KindleEReaderAccessories"/>
     *         &lt;element ref="{}KindleFireAccessories"/>
     *         &lt;element ref="{}MediaPlayer"/>
     *         &lt;element ref="{}MediaPlayerOrEReaderAccessory"/>
     *         &lt;element ref="{}MediaStorage"/>
     *         &lt;element ref="{}MiscAudioComponents"/>
     *         &lt;element ref="{}PC"/>
     *         &lt;element ref="{}PDA"/>
     *         &lt;element ref="{}Phone"/>
     *         &lt;element ref="{}PhoneAccessory"/>
     *         &lt;element ref="{}PhotographicStudioItems"/>
     *         &lt;element ref="{}PortableAudio"/>
     *         &lt;element ref="{}PortableAvDevice"/>
     *         &lt;element ref="{}PowerSuppliesOrProtection"/>
     *         &lt;element ref="{}RadarDetector"/>
     *         &lt;element ref="{}RadioOrClockRadio"/>
     *         &lt;element ref="{}ReceiverOrAmplifier"/>
     *         &lt;element ref="{}RemoteControl"/>
     *         &lt;element ref="{}Speakers"/>
     *         &lt;element ref="{}StereoShelfSystem"/>
     *         &lt;element ref="{}CETelescope"/>
     *         &lt;element ref="{}Television"/>
     *         &lt;element ref="{}Tuner"/>
     *         &lt;element ref="{}TVCombos"/>
     *         &lt;element ref="{}TwoWayRadio"/>
     *         &lt;element ref="{}VCR"/>
     *         &lt;element ref="{}CEVideoProjector"/>
     *         &lt;element ref="{}VideoProjectorsAndAccessories"/>
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
        "antenna",
        "audioVideoAccessory",
        "avFurniture",
        "barCodeReader",
        "ceBinocular",
        "ceCamcorder",
        "cameraBagsAndCases",
        "ceBattery",
        "ceBlankMedia",
        "cableOrAdapter",
        "ceCameraFlash",
        "cameraLenses",
        "cameraOtherAccessories",
        "cameraPowerSupply",
        "carAlarm",
        "carAudioOrTheater",
        "carElectronics",
        "consumerElectronics",
        "ceDigitalCamera",
        "digitalPictureFrame",
        "digitalVideoRecorder",
        "dvdPlayerOrRecorder",
        "ceFilmCamera",
        "gpsOrNavigationAccessory",
        "gpsOrNavigationSystem",
        "handheldOrPDA",
        "headphones",
        "homeTheaterSystemOrHTIB",
        "kindleAccessories",
        "kindleEReaderAccessories",
        "kindleFireAccessories",
        "mediaPlayer",
        "mediaPlayerOrEReaderAccessory",
        "mediaStorage",
        "miscAudioComponents",
        "pc",
        "pda",
        "phone",
        "phoneAccessory",
        "photographicStudioItems",
        "portableAudio",
        "portableAvDevice",
        "powerSuppliesOrProtection",
        "radarDetector",
        "radioOrClockRadio",
        "receiverOrAmplifier",
        "remoteControl",
        "speakers",
        "stereoShelfSystem",
        "ceTelescope",
        "television",
        "tuner",
        "tvCombos",
        "twoWayRadio",
        "vcr",
        "ceVideoProjector",
        "videoProjectorsAndAccessories"
    })
    public static class ProductType {

        @XmlElement(name = "Antenna")
        protected Antenna antenna;
        @XmlElement(name = "AudioVideoAccessory")
        protected AudioVideoAccessory audioVideoAccessory;
        @XmlElement(name = "AVFurniture")
        protected AVFurniture avFurniture;
        @XmlElement(name = "BarCodeReader")
        protected BarCodeReader barCodeReader;
        @XmlElement(name = "CEBinocular")
        protected CEBinocular ceBinocular;
        @XmlElement(name = "CECamcorder")
        protected CECamcorder ceCamcorder;
        @XmlElement(name = "CameraBagsAndCases")
        protected CameraBagsAndCases cameraBagsAndCases;
        @XmlElement(name = "CEBattery")
        protected CEBattery ceBattery;
        @XmlElement(name = "CEBlankMedia")
        protected CEBlankMedia ceBlankMedia;
        @XmlElement(name = "CableOrAdapter")
        protected CableOrAdapter cableOrAdapter;
        @XmlElement(name = "CECameraFlash")
        protected CECameraFlash ceCameraFlash;
        @XmlElement(name = "CameraLenses")
        protected CameraLenses cameraLenses;
        @XmlElement(name = "CameraOtherAccessories")
        protected CameraOtherAccessories cameraOtherAccessories;
        @XmlElement(name = "CameraPowerSupply")
        protected CameraPowerSupply cameraPowerSupply;
        @XmlElement(name = "CarAlarm")
        protected CarAlarm carAlarm;
        @XmlElement(name = "CarAudioOrTheater")
        protected CarAudioOrTheater carAudioOrTheater;
        @XmlElement(name = "CarElectronics")
        protected CarElectronics carElectronics;
        @XmlElement(name = "ConsumerElectronics")
        protected ConsumerElectronics consumerElectronics;
        @XmlElement(name = "CEDigitalCamera")
        protected CEDigitalCamera ceDigitalCamera;
        @XmlElement(name = "DigitalPictureFrame")
        protected DigitalPictureFrame digitalPictureFrame;
        @XmlElement(name = "DigitalVideoRecorder")
        protected DigitalVideoRecorder digitalVideoRecorder;
        @XmlElement(name = "DVDPlayerOrRecorder")
        protected DVDPlayerOrRecorder dvdPlayerOrRecorder;
        @XmlElement(name = "CEFilmCamera")
        protected CEFilmCamera ceFilmCamera;
        @XmlElement(name = "GPSOrNavigationAccessory")
        protected GPSOrNavigationAccessory gpsOrNavigationAccessory;
        @XmlElement(name = "GPSOrNavigationSystem")
        protected GPSOrNavigationSystem gpsOrNavigationSystem;
        @XmlElement(name = "HandheldOrPDA")
        protected HandheldOrPDA handheldOrPDA;
        @XmlElement(name = "Headphones")
        protected Headphones headphones;
        @XmlElement(name = "HomeTheaterSystemOrHTIB")
        protected HomeTheaterSystemOrHTIB homeTheaterSystemOrHTIB;
        @XmlElement(name = "KindleAccessories")
        protected KindleAccessories kindleAccessories;
        @XmlElement(name = "KindleEReaderAccessories")
        protected KindleEReaderAccessories kindleEReaderAccessories;
        @XmlElement(name = "KindleFireAccessories")
        protected KindleFireAccessories kindleFireAccessories;
        @XmlElement(name = "MediaPlayer")
        protected MediaPlayer mediaPlayer;
        @XmlElement(name = "MediaPlayerOrEReaderAccessory")
        protected MediaPlayerOrEReaderAccessory mediaPlayerOrEReaderAccessory;
        @XmlElement(name = "MediaStorage")
        protected MediaStorage mediaStorage;
        @XmlElement(name = "MiscAudioComponents")
        protected MiscAudioComponents miscAudioComponents;
        @XmlElement(name = "PC")
        protected PC pc;
        @XmlElement(name = "PDA")
        protected PDA pda;
        @XmlElement(name = "Phone")
        protected Phone phone;
        @XmlElement(name = "PhoneAccessory")
        protected PhoneAccessory phoneAccessory;
        @XmlElement(name = "PhotographicStudioItems")
        protected PhotographicStudioItems photographicStudioItems;
        @XmlElement(name = "PortableAudio")
        protected PortableAudio portableAudio;
        @XmlElement(name = "PortableAvDevice")
        protected PortableAvDevice portableAvDevice;
        @XmlElement(name = "PowerSuppliesOrProtection")
        protected PowerSuppliesOrProtection powerSuppliesOrProtection;
        @XmlElement(name = "RadarDetector")
        protected RadarDetector radarDetector;
        @XmlElement(name = "RadioOrClockRadio")
        protected RadioOrClockRadio radioOrClockRadio;
        @XmlElement(name = "ReceiverOrAmplifier")
        protected ReceiverOrAmplifier receiverOrAmplifier;
        @XmlElement(name = "RemoteControl")
        protected RemoteControl remoteControl;
        @XmlElement(name = "Speakers")
        protected Speakers speakers;
        @XmlElement(name = "StereoShelfSystem")
        protected StereoShelfSystem stereoShelfSystem;
        @XmlElement(name = "CETelescope")
        protected CETelescope ceTelescope;
        @XmlElement(name = "Television")
        protected Television television;
        @XmlElement(name = "Tuner")
        protected Tuner tuner;
        @XmlElement(name = "TVCombos")
        protected TVCombos tvCombos;
        @XmlElement(name = "TwoWayRadio")
        protected TwoWayRadio twoWayRadio;
        @XmlElement(name = "VCR")
        protected VCR vcr;
        @XmlElement(name = "CEVideoProjector")
        protected CEVideoProjector ceVideoProjector;
        @XmlElement(name = "VideoProjectorsAndAccessories")
        protected VideoProjectorsAndAccessories videoProjectorsAndAccessories;

        /**
         * 获取antenna属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Antenna }
         *     
         */
        public Antenna getAntenna() {
            return antenna;
        }

        /**
         * 设置antenna属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Antenna }
         *     
         */
        public void setAntenna(Antenna value) {
            this.antenna = value;
        }

        /**
         * 获取audioVideoAccessory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AudioVideoAccessory }
         *     
         */
        public AudioVideoAccessory getAudioVideoAccessory() {
            return audioVideoAccessory;
        }

        /**
         * 设置audioVideoAccessory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AudioVideoAccessory }
         *     
         */
        public void setAudioVideoAccessory(AudioVideoAccessory value) {
            this.audioVideoAccessory = value;
        }

        /**
         * 获取avFurniture属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AVFurniture }
         *     
         */
        public AVFurniture getAVFurniture() {
            return avFurniture;
        }

        /**
         * 设置avFurniture属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AVFurniture }
         *     
         */
        public void setAVFurniture(AVFurniture value) {
            this.avFurniture = value;
        }

        /**
         * 获取barCodeReader属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BarCodeReader }
         *     
         */
        public BarCodeReader getBarCodeReader() {
            return barCodeReader;
        }

        /**
         * 设置barCodeReader属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BarCodeReader }
         *     
         */
        public void setBarCodeReader(BarCodeReader value) {
            this.barCodeReader = value;
        }

        /**
         * 获取ceBinocular属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CEBinocular }
         *     
         */
        public CEBinocular getCEBinocular() {
            return ceBinocular;
        }

        /**
         * 设置ceBinocular属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CEBinocular }
         *     
         */
        public void setCEBinocular(CEBinocular value) {
            this.ceBinocular = value;
        }

        /**
         * 获取ceCamcorder属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CECamcorder }
         *     
         */
        public CECamcorder getCECamcorder() {
            return ceCamcorder;
        }

        /**
         * 设置ceCamcorder属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CECamcorder }
         *     
         */
        public void setCECamcorder(CECamcorder value) {
            this.ceCamcorder = value;
        }

        /**
         * 获取cameraBagsAndCases属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CameraBagsAndCases }
         *     
         */
        public CameraBagsAndCases getCameraBagsAndCases() {
            return cameraBagsAndCases;
        }

        /**
         * 设置cameraBagsAndCases属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CameraBagsAndCases }
         *     
         */
        public void setCameraBagsAndCases(CameraBagsAndCases value) {
            this.cameraBagsAndCases = value;
        }

        /**
         * 获取ceBattery属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CEBattery }
         *     
         */
        public CEBattery getCEBattery() {
            return ceBattery;
        }

        /**
         * 设置ceBattery属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CEBattery }
         *     
         */
        public void setCEBattery(CEBattery value) {
            this.ceBattery = value;
        }

        /**
         * 获取ceBlankMedia属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CEBlankMedia }
         *     
         */
        public CEBlankMedia getCEBlankMedia() {
            return ceBlankMedia;
        }

        /**
         * 设置ceBlankMedia属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CEBlankMedia }
         *     
         */
        public void setCEBlankMedia(CEBlankMedia value) {
            this.ceBlankMedia = value;
        }

        /**
         * 获取cableOrAdapter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CableOrAdapter }
         *     
         */
        public CableOrAdapter getCableOrAdapter() {
            return cableOrAdapter;
        }

        /**
         * 设置cableOrAdapter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CableOrAdapter }
         *     
         */
        public void setCableOrAdapter(CableOrAdapter value) {
            this.cableOrAdapter = value;
        }

        /**
         * 获取ceCameraFlash属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CECameraFlash }
         *     
         */
        public CECameraFlash getCECameraFlash() {
            return ceCameraFlash;
        }

        /**
         * 设置ceCameraFlash属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CECameraFlash }
         *     
         */
        public void setCECameraFlash(CECameraFlash value) {
            this.ceCameraFlash = value;
        }

        /**
         * 获取cameraLenses属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CameraLenses }
         *     
         */
        public CameraLenses getCameraLenses() {
            return cameraLenses;
        }

        /**
         * 设置cameraLenses属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CameraLenses }
         *     
         */
        public void setCameraLenses(CameraLenses value) {
            this.cameraLenses = value;
        }

        /**
         * 获取cameraOtherAccessories属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CameraOtherAccessories }
         *     
         */
        public CameraOtherAccessories getCameraOtherAccessories() {
            return cameraOtherAccessories;
        }

        /**
         * 设置cameraOtherAccessories属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CameraOtherAccessories }
         *     
         */
        public void setCameraOtherAccessories(CameraOtherAccessories value) {
            this.cameraOtherAccessories = value;
        }

        /**
         * 获取cameraPowerSupply属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CameraPowerSupply }
         *     
         */
        public CameraPowerSupply getCameraPowerSupply() {
            return cameraPowerSupply;
        }

        /**
         * 设置cameraPowerSupply属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CameraPowerSupply }
         *     
         */
        public void setCameraPowerSupply(CameraPowerSupply value) {
            this.cameraPowerSupply = value;
        }

        /**
         * 获取carAlarm属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CarAlarm }
         *     
         */
        public CarAlarm getCarAlarm() {
            return carAlarm;
        }

        /**
         * 设置carAlarm属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CarAlarm }
         *     
         */
        public void setCarAlarm(CarAlarm value) {
            this.carAlarm = value;
        }

        /**
         * 获取carAudioOrTheater属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CarAudioOrTheater }
         *     
         */
        public CarAudioOrTheater getCarAudioOrTheater() {
            return carAudioOrTheater;
        }

        /**
         * 设置carAudioOrTheater属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CarAudioOrTheater }
         *     
         */
        public void setCarAudioOrTheater(CarAudioOrTheater value) {
            this.carAudioOrTheater = value;
        }

        /**
         * 获取carElectronics属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CarElectronics }
         *     
         */
        public CarElectronics getCarElectronics() {
            return carElectronics;
        }

        /**
         * 设置carElectronics属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CarElectronics }
         *     
         */
        public void setCarElectronics(CarElectronics value) {
            this.carElectronics = value;
        }

        /**
         * 获取consumerElectronics属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ConsumerElectronics }
         *     
         */
        public ConsumerElectronics getConsumerElectronics() {
            return consumerElectronics;
        }

        /**
         * 设置consumerElectronics属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ConsumerElectronics }
         *     
         */
        public void setConsumerElectronics(ConsumerElectronics value) {
            this.consumerElectronics = value;
        }

        /**
         * 获取ceDigitalCamera属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CEDigitalCamera }
         *     
         */
        public CEDigitalCamera getCEDigitalCamera() {
            return ceDigitalCamera;
        }

        /**
         * 设置ceDigitalCamera属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CEDigitalCamera }
         *     
         */
        public void setCEDigitalCamera(CEDigitalCamera value) {
            this.ceDigitalCamera = value;
        }

        /**
         * 获取digitalPictureFrame属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DigitalPictureFrame }
         *     
         */
        public DigitalPictureFrame getDigitalPictureFrame() {
            return digitalPictureFrame;
        }

        /**
         * 设置digitalPictureFrame属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DigitalPictureFrame }
         *     
         */
        public void setDigitalPictureFrame(DigitalPictureFrame value) {
            this.digitalPictureFrame = value;
        }

        /**
         * 获取digitalVideoRecorder属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DigitalVideoRecorder }
         *     
         */
        public DigitalVideoRecorder getDigitalVideoRecorder() {
            return digitalVideoRecorder;
        }

        /**
         * 设置digitalVideoRecorder属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DigitalVideoRecorder }
         *     
         */
        public void setDigitalVideoRecorder(DigitalVideoRecorder value) {
            this.digitalVideoRecorder = value;
        }

        /**
         * 获取dvdPlayerOrRecorder属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DVDPlayerOrRecorder }
         *     
         */
        public DVDPlayerOrRecorder getDVDPlayerOrRecorder() {
            return dvdPlayerOrRecorder;
        }

        /**
         * 设置dvdPlayerOrRecorder属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DVDPlayerOrRecorder }
         *     
         */
        public void setDVDPlayerOrRecorder(DVDPlayerOrRecorder value) {
            this.dvdPlayerOrRecorder = value;
        }

        /**
         * 获取ceFilmCamera属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CEFilmCamera }
         *     
         */
        public CEFilmCamera getCEFilmCamera() {
            return ceFilmCamera;
        }

        /**
         * 设置ceFilmCamera属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CEFilmCamera }
         *     
         */
        public void setCEFilmCamera(CEFilmCamera value) {
            this.ceFilmCamera = value;
        }

        /**
         * 获取gpsOrNavigationAccessory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GPSOrNavigationAccessory }
         *     
         */
        public GPSOrNavigationAccessory getGPSOrNavigationAccessory() {
            return gpsOrNavigationAccessory;
        }

        /**
         * 设置gpsOrNavigationAccessory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GPSOrNavigationAccessory }
         *     
         */
        public void setGPSOrNavigationAccessory(GPSOrNavigationAccessory value) {
            this.gpsOrNavigationAccessory = value;
        }

        /**
         * 获取gpsOrNavigationSystem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GPSOrNavigationSystem }
         *     
         */
        public GPSOrNavigationSystem getGPSOrNavigationSystem() {
            return gpsOrNavigationSystem;
        }

        /**
         * 设置gpsOrNavigationSystem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GPSOrNavigationSystem }
         *     
         */
        public void setGPSOrNavigationSystem(GPSOrNavigationSystem value) {
            this.gpsOrNavigationSystem = value;
        }

        /**
         * 获取handheldOrPDA属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HandheldOrPDA }
         *     
         */
        public HandheldOrPDA getHandheldOrPDA() {
            return handheldOrPDA;
        }

        /**
         * 设置handheldOrPDA属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HandheldOrPDA }
         *     
         */
        public void setHandheldOrPDA(HandheldOrPDA value) {
            this.handheldOrPDA = value;
        }

        /**
         * 获取headphones属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Headphones }
         *     
         */
        public Headphones getHeadphones() {
            return headphones;
        }

        /**
         * 设置headphones属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Headphones }
         *     
         */
        public void setHeadphones(Headphones value) {
            this.headphones = value;
        }

        /**
         * 获取homeTheaterSystemOrHTIB属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HomeTheaterSystemOrHTIB }
         *     
         */
        public HomeTheaterSystemOrHTIB getHomeTheaterSystemOrHTIB() {
            return homeTheaterSystemOrHTIB;
        }

        /**
         * 设置homeTheaterSystemOrHTIB属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HomeTheaterSystemOrHTIB }
         *     
         */
        public void setHomeTheaterSystemOrHTIB(HomeTheaterSystemOrHTIB value) {
            this.homeTheaterSystemOrHTIB = value;
        }

        /**
         * 获取kindleAccessories属性的值。
         * 
         * @return
         *     possible object is
         *     {@link KindleAccessories }
         *     
         */
        public KindleAccessories getKindleAccessories() {
            return kindleAccessories;
        }

        /**
         * 设置kindleAccessories属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link KindleAccessories }
         *     
         */
        public void setKindleAccessories(KindleAccessories value) {
            this.kindleAccessories = value;
        }

        /**
         * 获取kindleEReaderAccessories属性的值。
         * 
         * @return
         *     possible object is
         *     {@link KindleEReaderAccessories }
         *     
         */
        public KindleEReaderAccessories getKindleEReaderAccessories() {
            return kindleEReaderAccessories;
        }

        /**
         * 设置kindleEReaderAccessories属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link KindleEReaderAccessories }
         *     
         */
        public void setKindleEReaderAccessories(KindleEReaderAccessories value) {
            this.kindleEReaderAccessories = value;
        }

        /**
         * 获取kindleFireAccessories属性的值。
         * 
         * @return
         *     possible object is
         *     {@link KindleFireAccessories }
         *     
         */
        public KindleFireAccessories getKindleFireAccessories() {
            return kindleFireAccessories;
        }

        /**
         * 设置kindleFireAccessories属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link KindleFireAccessories }
         *     
         */
        public void setKindleFireAccessories(KindleFireAccessories value) {
            this.kindleFireAccessories = value;
        }

        /**
         * 获取mediaPlayer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MediaPlayer }
         *     
         */
        public MediaPlayer getMediaPlayer() {
            return mediaPlayer;
        }

        /**
         * 设置mediaPlayer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MediaPlayer }
         *     
         */
        public void setMediaPlayer(MediaPlayer value) {
            this.mediaPlayer = value;
        }

        /**
         * 获取mediaPlayerOrEReaderAccessory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MediaPlayerOrEReaderAccessory }
         *     
         */
        public MediaPlayerOrEReaderAccessory getMediaPlayerOrEReaderAccessory() {
            return mediaPlayerOrEReaderAccessory;
        }

        /**
         * 设置mediaPlayerOrEReaderAccessory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MediaPlayerOrEReaderAccessory }
         *     
         */
        public void setMediaPlayerOrEReaderAccessory(MediaPlayerOrEReaderAccessory value) {
            this.mediaPlayerOrEReaderAccessory = value;
        }

        /**
         * 获取mediaStorage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MediaStorage }
         *     
         */
        public MediaStorage getMediaStorage() {
            return mediaStorage;
        }

        /**
         * 设置mediaStorage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MediaStorage }
         *     
         */
        public void setMediaStorage(MediaStorage value) {
            this.mediaStorage = value;
        }

        /**
         * 获取miscAudioComponents属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MiscAudioComponents }
         *     
         */
        public MiscAudioComponents getMiscAudioComponents() {
            return miscAudioComponents;
        }

        /**
         * 设置miscAudioComponents属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MiscAudioComponents }
         *     
         */
        public void setMiscAudioComponents(MiscAudioComponents value) {
            this.miscAudioComponents = value;
        }

        /**
         * 获取pc属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PC }
         *     
         */
        public PC getPC() {
            return pc;
        }

        /**
         * 设置pc属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PC }
         *     
         */
        public void setPC(PC value) {
            this.pc = value;
        }

        /**
         * 获取pda属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PDA }
         *     
         */
        public PDA getPDA() {
            return pda;
        }

        /**
         * 设置pda属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PDA }
         *     
         */
        public void setPDA(PDA value) {
            this.pda = value;
        }

        /**
         * 获取phone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Phone }
         *     
         */
        public Phone getPhone() {
            return phone;
        }

        /**
         * 设置phone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Phone }
         *     
         */
        public void setPhone(Phone value) {
            this.phone = value;
        }

        /**
         * 获取phoneAccessory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PhoneAccessory }
         *     
         */
        public PhoneAccessory getPhoneAccessory() {
            return phoneAccessory;
        }

        /**
         * 设置phoneAccessory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneAccessory }
         *     
         */
        public void setPhoneAccessory(PhoneAccessory value) {
            this.phoneAccessory = value;
        }

        /**
         * 获取photographicStudioItems属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PhotographicStudioItems }
         *     
         */
        public PhotographicStudioItems getPhotographicStudioItems() {
            return photographicStudioItems;
        }

        /**
         * 设置photographicStudioItems属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PhotographicStudioItems }
         *     
         */
        public void setPhotographicStudioItems(PhotographicStudioItems value) {
            this.photographicStudioItems = value;
        }

        /**
         * 获取portableAudio属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PortableAudio }
         *     
         */
        public PortableAudio getPortableAudio() {
            return portableAudio;
        }

        /**
         * 设置portableAudio属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PortableAudio }
         *     
         */
        public void setPortableAudio(PortableAudio value) {
            this.portableAudio = value;
        }

        /**
         * 获取portableAvDevice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PortableAvDevice }
         *     
         */
        public PortableAvDevice getPortableAvDevice() {
            return portableAvDevice;
        }

        /**
         * 设置portableAvDevice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PortableAvDevice }
         *     
         */
        public void setPortableAvDevice(PortableAvDevice value) {
            this.portableAvDevice = value;
        }

        /**
         * 获取powerSuppliesOrProtection属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PowerSuppliesOrProtection }
         *     
         */
        public PowerSuppliesOrProtection getPowerSuppliesOrProtection() {
            return powerSuppliesOrProtection;
        }

        /**
         * 设置powerSuppliesOrProtection属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PowerSuppliesOrProtection }
         *     
         */
        public void setPowerSuppliesOrProtection(PowerSuppliesOrProtection value) {
            this.powerSuppliesOrProtection = value;
        }

        /**
         * 获取radarDetector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RadarDetector }
         *     
         */
        public RadarDetector getRadarDetector() {
            return radarDetector;
        }

        /**
         * 设置radarDetector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RadarDetector }
         *     
         */
        public void setRadarDetector(RadarDetector value) {
            this.radarDetector = value;
        }

        /**
         * 获取radioOrClockRadio属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RadioOrClockRadio }
         *     
         */
        public RadioOrClockRadio getRadioOrClockRadio() {
            return radioOrClockRadio;
        }

        /**
         * 设置radioOrClockRadio属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RadioOrClockRadio }
         *     
         */
        public void setRadioOrClockRadio(RadioOrClockRadio value) {
            this.radioOrClockRadio = value;
        }

        /**
         * 获取receiverOrAmplifier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ReceiverOrAmplifier }
         *     
         */
        public ReceiverOrAmplifier getReceiverOrAmplifier() {
            return receiverOrAmplifier;
        }

        /**
         * 设置receiverOrAmplifier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ReceiverOrAmplifier }
         *     
         */
        public void setReceiverOrAmplifier(ReceiverOrAmplifier value) {
            this.receiverOrAmplifier = value;
        }

        /**
         * 获取remoteControl属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RemoteControl }
         *     
         */
        public RemoteControl getRemoteControl() {
            return remoteControl;
        }

        /**
         * 设置remoteControl属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RemoteControl }
         *     
         */
        public void setRemoteControl(RemoteControl value) {
            this.remoteControl = value;
        }

        /**
         * 获取speakers属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Speakers }
         *     
         */
        public Speakers getSpeakers() {
            return speakers;
        }

        /**
         * 设置speakers属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Speakers }
         *     
         */
        public void setSpeakers(Speakers value) {
            this.speakers = value;
        }

        /**
         * 获取stereoShelfSystem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link StereoShelfSystem }
         *     
         */
        public StereoShelfSystem getStereoShelfSystem() {
            return stereoShelfSystem;
        }

        /**
         * 设置stereoShelfSystem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link StereoShelfSystem }
         *     
         */
        public void setStereoShelfSystem(StereoShelfSystem value) {
            this.stereoShelfSystem = value;
        }

        /**
         * 获取ceTelescope属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CETelescope }
         *     
         */
        public CETelescope getCETelescope() {
            return ceTelescope;
        }

        /**
         * 设置ceTelescope属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CETelescope }
         *     
         */
        public void setCETelescope(CETelescope value) {
            this.ceTelescope = value;
        }

        /**
         * 获取television属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Television }
         *     
         */
        public Television getTelevision() {
            return television;
        }

        /**
         * 设置television属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Television }
         *     
         */
        public void setTelevision(Television value) {
            this.television = value;
        }

        /**
         * 获取tuner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Tuner }
         *     
         */
        public Tuner getTuner() {
            return tuner;
        }

        /**
         * 设置tuner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Tuner }
         *     
         */
        public void setTuner(Tuner value) {
            this.tuner = value;
        }

        /**
         * 获取tvCombos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TVCombos }
         *     
         */
        public TVCombos getTVCombos() {
            return tvCombos;
        }

        /**
         * 设置tvCombos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TVCombos }
         *     
         */
        public void setTVCombos(TVCombos value) {
            this.tvCombos = value;
        }

        /**
         * 获取twoWayRadio属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TwoWayRadio }
         *     
         */
        public TwoWayRadio getTwoWayRadio() {
            return twoWayRadio;
        }

        /**
         * 设置twoWayRadio属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TwoWayRadio }
         *     
         */
        public void setTwoWayRadio(TwoWayRadio value) {
            this.twoWayRadio = value;
        }

        /**
         * 获取vcr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VCR }
         *     
         */
        public VCR getVCR() {
            return vcr;
        }

        /**
         * 设置vcr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VCR }
         *     
         */
        public void setVCR(VCR value) {
            this.vcr = value;
        }

        /**
         * 获取ceVideoProjector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CEVideoProjector }
         *     
         */
        public CEVideoProjector getCEVideoProjector() {
            return ceVideoProjector;
        }

        /**
         * 设置ceVideoProjector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CEVideoProjector }
         *     
         */
        public void setCEVideoProjector(CEVideoProjector value) {
            this.ceVideoProjector = value;
        }

        /**
         * 获取videoProjectorsAndAccessories属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VideoProjectorsAndAccessories }
         *     
         */
        public VideoProjectorsAndAccessories getVideoProjectorsAndAccessories() {
            return videoProjectorsAndAccessories;
        }

        /**
         * 设置videoProjectorsAndAccessories属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VideoProjectorsAndAccessories }
         *     
         */
        public void setVideoProjectorsAndAccessories(VideoProjectorsAndAccessories value) {
            this.videoProjectorsAndAccessories = value;
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
     *     &lt;extension base="&lt;>StringNotNull">
     *       &lt;attribute name="unitOfMeasure" use="required" type="{}VolumeUnitOfMeasure" />
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
    public static class SealedBoxVolume {

        @XmlValue
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "unitOfMeasure", required = true)
        protected VolumeUnitOfMeasure unitOfMeasure;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VolumeUnitOfMeasure }
         *     
         */
        public VolumeUnitOfMeasure getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VolumeUnitOfMeasure }
         *     
         */
        public void setUnitOfMeasure(VolumeUnitOfMeasure value) {
            this.unitOfMeasure = value;
        }

    }

}
