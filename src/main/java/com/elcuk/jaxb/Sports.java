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
/*       */ @XmlType(name="", propOrder={"productType", "variationData", "materialComposition", "packaging", "isCustomizable", "customizableTemplateName", "isAdultProduct", "modelYear", "season", "accessLocation", "action", "activeIngredients", "alarm", "apparentScaleSize", "availableCourses", "backingLineCapacity", "baseLength", "battery", "batteryAverageLife", "batteryAverageLifeStandby", "batteryChargeTime", "batteryLife", "batteryTypeLithiumIon", "batteryTypeLithiumMetal", "beamWidth", "bearingMaterialType", "beltStyle", "bikeWeight", "bladeGrind", "bladeLength", "bladeShape", "bladeType", "bmxBikeType", "boatFenderDiameter", "boilRateDescription", "boomLength", "bottomStyle", "brakeType", "brakeWidth", "breakingStrength", "btUs", "buildup", "bulbType", "burnTime", "canShipInOriginalContainer", "capability", "capType", "careInstructions", "centerlineLength", "closureType", "collarType", "colorMap", "compatibleDevices", "compatibleHoseDiameter", "compatibleRopeDiameter", "construction", "controlProgramName", "coreMaterialType", "countryAsLabeled", "countryOfOrigin", "courseCapacity", "coverageArea", "crankLength", "cuffType", "cupSize", "cycles", "deckLength", "deckWidth", "directions", "displayFeatures", "displayLength", "displaySize", "displayType", "displayVolume", "displayWeight", "effectiveEdgeLength", "engineDisplacement", "eventName", "eye", "fabricType", "fabricWash", "fillMaterialType", "fishingLineType", "fishType", "fittingType", "fitType", "floorArea", "floorLength", "floorWidth", "flyLineNumber", "foldedLength", "frameHeight", "frameMaterial", "frameType", "frequencyBand", "frontPleatType", "fuelCapacity", "fuelType", "functions", "furDescription", "gearDirection", "geographicCoverage", "gloveType", "gripMaterialType", "guardMaterialType", "handleMaterial", "handleType", "heatRating", "hp", "hullShape", "identityPackageType", "importDesignation", "impactForce", "ingredients", "inseam", "insulationType", "intensity", "isAssemblyRequired", "itemTypeName", "isSigned", "jerseyType", "knifeFunction", "lampType", "laptopCapacity", "lashLength", "leagueName", "legStyle", "lensMaterial", "lensShape", "lifeVestType", "lightIntensity", "lineWeight", "liningMaterial", "lithiumBatteryEnergyContent", "lithiumBatteryPackaging", "lithiumBatteryVoltage", "lithiumBatteryWeight", "loadCapacity", "lockType", "loudness", "lureWeight", "manufacturerDefinedQualityDescription", "martialArtsType", "maximumCompatibleBootSize", "maximumCompatibleRopeDiameter", "maximumHeight", "maximumInclinePercentage", "maximumLegSize", "maximumMagnification", "maximumPitchSpeed", "maximumResistance", "maximumStrideLength", "maximumTensionRating", "maximumUserWeight", "maximumWeight", "maxWeightRecommendation", "mechanicalStructure", "memory", "mfrWarrantyDescriptionLabor", "mfrWarrantyDescriptionParts", "mfrWarrantyDescriptionType", "minimumCompatibleBootSize", "minimumCompatibleRopeDiameter", "minimumLegSize", "minimumMagnification", "minimumTensionRating", "minimumTorsoFit", "minimumWeightRecommendation", "monitorFeatures", "motorSize", "mountainBikeProportionalFrameSize", "mountainBikeType", "mountType", "movementType", "neckStyle", "numberOfBlades", "numberOfCarriagePositions", "numberOfDoors", "numberOfExercises", "numberOfFootPositions", "numberOfGearLoops", "numberOfHeadPositions", "numberOfHolds", "numberOfHorses", "numberOfLevels", "numberOfLithiumIonCells", "numberOfLithiumMetalCells", "numberOfPages", "numberOfPieces", "numberOfPockets", "numberOfPoles", "numberOfPrograms", "numberOfResistanceLevels", "numberOfSpeeds", "numberOfSprings", "objectiveLensSize", "operationMode", "orientation", "outerMaterialType", "packedSize", "padType", "patternStyle", "peakHeight", "pixels", "playerName", "pocketDescription", "positionAccuracy", "powerSource", "ppuCount", "ppuCountType", "proportionalFrameSize", "pullType", "range", "rearDerailleurCompatibleChainSize", "recommendedWorkoutSpace", "reelDiameter", "reelModel", "region", "resistance", "resistanceMechanism", "resolution", "riseStyle", "roadBikeProportionalFrameSize", "roadBikeType", "rodLength", "rodWeight", "routes", "rValue", "scale", "screenColor", "screenSize", "seatHeight", "seatingCapacity", "sellerWarrantyDescription", "shellMaterial", "shirtType", "shoeWidth", "sizeMap", "skillLevel", "skiStyle", "sleepingCapacity", "sleeveLength", "sleeveType", "snowboardStyle", "sockHeight", "sockStyle", "sonarType", "specialFeatures", "specificUsageForProduct", "speed", "speedRating", "sport", "state", "staticElongationPercentage", "staticWeight", "strapType", "strength", "styleKeywords", "supportType", "suspensionType", "targetGender", "targetZones", "teamName", "tensionSupported", "theme", "threadSize", "topStyle", "topTubeLength", "trailerType", "turnRadius", "uiaaFallRating", "underwireType", "uniformNumber", "usageCapacity", "uvProtection", "volumeCapacityName", "waistSize", "waistWidth", "warmthRating", "warnings", "warranty", "waterBottleCapType", "waterResistanceRating", "waterType", "wattage", "watts", "wayPoints", "weightCapacity", "whatsInTheBox", "wheelType", "threadPitch", "driveSystem", "bladeMaterialType", "sportsNumberOfPockets", "workingLoadLimit", "watchMovementType", "tankVolume", "powerRating", "patternType", "outputPower", "opticalPower", "minimumHeightRecommendation", "itemDiameter", "ageRangeDescription", "collectionName", "bandSizeNumber", "batteryCellComposition", "batteryDescription", "batteryFormFactor"})
/*       */ @XmlRootElement(name="Sports")
/*       */ public class Sports
/*       */ {
/*       */ 
/*       */   @XmlElement(name="ProductType")
/*       */   protected String productType;
/*       */ 
/*       */   @XmlElement(name="VariationData")
/*       */   protected VariationData variationData;
/*       */ 
/*       */   @XmlElement(name="MaterialComposition")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String materialComposition;
/*       */ 
/*       */   @XmlElement(name="Packaging")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String packaging;
/*       */ 
/*       */   @XmlElement(name="IsCustomizable")
/*       */   protected Boolean isCustomizable;
/*       */ 
/*       */   @XmlElement(name="CustomizableTemplateName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String customizableTemplateName;
/*       */ 
/*       */   @XmlElement(name="IsAdultProduct")
/*       */   protected Boolean isAdultProduct;
/*       */ 
/*       */   @XmlElement(name="ModelYear")
/*       */   protected BigInteger modelYear;
/*       */ 
/*       */   @XmlElement(name="Season")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String season;
/*       */ 
/*       */   @XmlElement(name="AccessLocation")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String accessLocation;
/*       */ 
/*       */   @XmlElement(name="Action")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String action;
/*       */ 
/*       */   @XmlElement(name="ActiveIngredients")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String activeIngredients;
/*       */ 
/*       */   @XmlElement(name="Alarm")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String alarm;
/*       */ 
/*       */   @XmlElement(name="ApparentScaleSize")
/*       */   protected LengthDimension apparentScaleSize;
/*       */ 
/*       */   @XmlElement(name="AvailableCourses")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String availableCourses;
/*       */ 
/*       */   @XmlElement(name="BackingLineCapacity")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String backingLineCapacity;
/*       */ 
/*       */   @XmlElement(name="BaseLength")
/*       */   protected LengthDimension baseLength;
/*       */ 
/*       */   @XmlElement(name="Battery")
/*       */   protected Battery battery;
/*       */ 
/*       */   @XmlElement(name="BatteryAverageLife")
/*       */   protected BigDecimal batteryAverageLife;
/*       */ 
/*       */   @XmlElement(name="BatteryAverageLifeStandby")
/*       */   protected BigDecimal batteryAverageLifeStandby;
/*       */ 
/*       */   @XmlElement(name="BatteryChargeTime")
/*       */   protected BigDecimal batteryChargeTime;
/*       */ 
/*       */   @XmlElement(name="BatteryLife")
/*       */   protected List<AssemblyTimeDimension> batteryLife;
/*       */ 
/*       */   @XmlElement(name="BatteryTypeLithiumIon")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger batteryTypeLithiumIon;
/*       */ 
/*       */   @XmlElement(name="BatteryTypeLithiumMetal")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger batteryTypeLithiumMetal;
/*       */ 
/*       */   @XmlElement(name="BeamWidth")
/*       */   protected LengthDimension beamWidth;
/*       */ 
/*       */   @XmlElement(name="BearingMaterialType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String bearingMaterialType;
/*       */ 
/*       */   @XmlElement(name="BeltStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String beltStyle;
/*       */ 
/*       */   @XmlElement(name="BikeWeight")
/*       */   protected WeightDimension bikeWeight;
/*       */ 
/*       */   @XmlElement(name="BladeGrind")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String bladeGrind;
/*       */ 
/*       */   @XmlElement(name="BladeLength")
/*       */   protected LengthDimension bladeLength;
/*       */ 
/*       */   @XmlElement(name="BladeShape")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String bladeShape;
/*       */ 
/*       */   @XmlElement(name="BladeType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String bladeType;
/*       */ 
/*       */   @XmlElement(name="BMXBikeType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String bmxBikeType;
/*       */ 
/*       */   @XmlElement(name="BoatFenderDiameter")
/*       */   protected LengthDimension boatFenderDiameter;
/*       */ 
/*       */   @XmlElement(name="BoilRateDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String boilRateDescription;
/*       */ 
/*       */   @XmlElement(name="BoomLength")
/*       */   protected LengthDimension boomLength;
/*       */ 
/*       */   @XmlElement(name="BottomStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String bottomStyle;
/*       */ 
/*       */   @XmlElement(name="BrakeType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String brakeType;
/*       */ 
/*       */   @XmlElement(name="BrakeWidth")
/*       */   protected LengthDimension brakeWidth;
/*       */ 
/*       */   @XmlElement(name="BreakingStrength")
/*       */   protected WeightDimension breakingStrength;
/*       */ 
/*       */   @XmlElement(name="BTUs")
/*       */   protected OptionalEnergyOutputDimension btUs;
/*       */ 
/*       */   @XmlElement(name="Buildup")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String buildup;
/*       */ 
/*       */   @XmlElement(name="BulbType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String bulbType;
/*       */ 
/*       */   @XmlElement(name="BurnTime")
/*       */   protected BurnTimeDimension burnTime;
/*       */ 
/*       */   @XmlElement(name="CanShipInOriginalContainer")
/*       */   protected Boolean canShipInOriginalContainer;
/*       */ 
/*       */   @XmlElement(name="Capability")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String capability;
/*       */ 
/*       */   @XmlElement(name="CapType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String capType;
/*       */ 
/*       */   @XmlElement(name="CareInstructions")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String careInstructions;
/*       */ 
/*       */   @XmlElement(name="CenterlineLength")
/*       */   protected LengthDimension centerlineLength;
/*       */ 
/*       */   @XmlElement(name="ClosureType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String closureType;
/*       */ 
/*       */   @XmlElement(name="CollarType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String collarType;
/*       */ 
/*       */   @XmlElement(name="ColorMap")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String colorMap;
/*       */ 
/*       */   @XmlElement(name="CompatibleDevices")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String compatibleDevices;
/*       */ 
/*       */   @XmlElement(name="CompatibleHoseDiameter")
/*       */   protected LengthDimension compatibleHoseDiameter;
/*       */ 
/*       */   @XmlElement(name="CompatibleRopeDiameter")
/*       */   protected LengthDimension compatibleRopeDiameter;
/*       */ 
/*       */   @XmlElement(name="Construction")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String construction;
/*       */ 
/*       */   @XmlElement(name="ControlProgramName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String controlProgramName;
/*       */ 
/*       */   @XmlElement(name="CoreMaterialType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String coreMaterialType;
/*       */ 
/*       */   @XmlElement(name="CountryAsLabeled")
/*       */   protected String countryAsLabeled;
/*       */ 
/*       */   @XmlElement(name="CountryOfOrigin")
/*       */   protected String countryOfOrigin;
/*       */ 
/*       */   @XmlElement(name="CourseCapacity")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String courseCapacity;
/*       */ 
/*       */   @XmlElement(name="CoverageArea")
/*       */   protected AreaDimension coverageArea;
/*       */ 
/*       */   @XmlElement(name="CrankLength")
/*       */   protected LengthDimension crankLength;
/*       */ 
/*       */   @XmlElement(name="CuffType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cuffType;
/*       */ 
/*       */   @XmlElement(name="CupSize")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cupSize;
/*       */ 
/*       */   @XmlElement(name="Cycles")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String cycles;
/*       */ 
/*       */   @XmlElement(name="DeckLength")
/*       */   protected LengthDimension deckLength;
/*       */ 
/*       */   @XmlElement(name="DeckWidth")
/*       */   protected LengthDimension deckWidth;
/*       */ 
/*       */   @XmlElement(name="Directions")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String directions;
/*       */ 
/*       */   @XmlElement(name="DisplayFeatures")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String displayFeatures;
/*       */ 
/*       */   @XmlElement(name="DisplayLength")
/*       */   protected LengthDimension displayLength;
/*       */ 
/*       */   @XmlElement(name="DisplaySize")
/*       */   protected LengthDimension displaySize;
/*       */ 
/*       */   @XmlElement(name="DisplayType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String displayType;
/*       */ 
/*       */   @XmlElement(name="DisplayVolume")
/*       */   protected VolumeDimension displayVolume;
/*       */ 
/*       */   @XmlElement(name="DisplayWeight")
/*       */   protected WeightDimension displayWeight;
/*       */ 
/*       */   @XmlElement(name="EffectiveEdgeLength")
/*       */   protected LengthDimension effectiveEdgeLength;
/*       */ 
/*       */   @XmlElement(name="EngineDisplacement")
/*       */   protected EngineDisplacement engineDisplacement;
/*       */ 
/*       */   @XmlElement(name="EventName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String eventName;
/*       */ 
/*       */   @XmlElement(name="Eye")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger eye;
/*       */ 
/*       */   @XmlElement(name="FabricType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fabricType;
/*       */ 
/*       */   @XmlElement(name="FabricWash")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fabricWash;
/*       */ 
/*       */   @XmlElement(name="FillMaterialType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fillMaterialType;
/*       */ 
/*       */   @XmlElement(name="FishingLineType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fishingLineType;
/*       */ 
/*       */   @XmlElement(name="FishType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fishType;
/*       */ 
/*       */   @XmlElement(name="FittingType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fittingType;
/*       */ 
/*       */   @XmlElement(name="FitType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fitType;
/*       */ 
/*       */   @XmlElement(name="FloorArea")
/*       */   protected AreaDimension floorArea;
/*       */ 
/*       */   @XmlElement(name="FloorLength")
/*       */   protected LengthDimension floorLength;
/*       */ 
/*       */   @XmlElement(name="FloorWidth")
/*       */   protected LengthDimension floorWidth;
/*       */ 
/*       */   @XmlElement(name="FlyLineNumber")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger flyLineNumber;
/*       */ 
/*       */   @XmlElement(name="FoldedLength")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String foldedLength;
/*       */ 
/*       */   @XmlElement(name="FrameHeight")
/*       */   protected LengthDimension frameHeight;
/*       */ 
/*       */   @XmlElement(name="FrameMaterial")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String frameMaterial;
/*       */ 
/*       */   @XmlElement(name="FrameType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String frameType;
/*       */ 
/*       */   @XmlElement(name="FrequencyBand")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String frequencyBand;
/*       */ 
/*       */   @XmlElement(name="FrontPleatType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String frontPleatType;
/*       */ 
/*       */   @XmlElement(name="FuelCapacity")
/*       */   protected VolumeDimension fuelCapacity;
/*       */ 
/*       */   @XmlElement(name="FuelType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String fuelType;
/*       */ 
/*       */   @XmlElement(name="Functions")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String functions;
/*       */ 
/*       */   @XmlElement(name="FurDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String furDescription;
/*       */ 
/*       */   @XmlElement(name="GearDirection")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String gearDirection;
/*       */ 
/*       */   @XmlElement(name="GeographicCoverage")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String geographicCoverage;
/*       */ 
/*       */   @XmlElement(name="GloveType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String gloveType;
/*       */ 
/*       */   @XmlElement(name="GripMaterialType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String gripMaterialType;
/*       */ 
/*       */   @XmlElement(name="GuardMaterialType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String guardMaterialType;
/*       */ 
/*       */   @XmlElement(name="HandleMaterial")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String handleMaterial;
/*       */ 
/*       */   @XmlElement(name="HandleType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String handleType;
/*       */ 
/*       */   @XmlElement(name="HeatRating")
/*       */   protected TemperatureRatingDimension heatRating;
/*       */ 
/*       */   @XmlElement(name="HP")
/*       */   protected BigDecimal hp;
/*       */ 
/*       */   @XmlElement(name="HullShape")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String hullShape;
/*       */ 
/*       */   @XmlElement(name="IdentityPackageType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String identityPackageType;
/*       */ 
/*       */   @XmlElement(name="ImportDesignation")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String importDesignation;
/*       */ 
/*       */   @XmlElement(name="ImpactForce")
/*       */   protected BigDecimal impactForce;
/*       */ 
/*       */   @XmlElement(name="Ingredients")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String ingredients;
/*       */ 
/*       */   @XmlElement(name="Inseam")
/*       */   protected OptionalLengthIntegerDimension inseam;
/*       */ 
/*       */   @XmlElement(name="InsulationType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String insulationType;
/*       */ 
/*       */   @XmlElement(name="Intensity")
/*       */   protected OptionalLuminiousIntensityDimension intensity;
/*       */ 
/*       */   @XmlElement(name="IsAssemblyRequired")
/*       */   protected Boolean isAssemblyRequired;
/*       */ 
/*       */   @XmlElement(name="ItemTypeName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String itemTypeName;
/*       */ 
/*       */   @XmlElement(name="IsSigned")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String isSigned;
/*       */ 
/*       */   @XmlElement(name="JerseyType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String jerseyType;
/*       */ 
/*       */   @XmlElement(name="KnifeFunction")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String knifeFunction;
/*       */ 
/*       */   @XmlElement(name="LampType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String lampType;
/*       */ 
/*       */   @XmlElement(name="LaptopCapacity")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String laptopCapacity;
/*       */ 
/*       */   @XmlElement(name="LashLength")
/*       */   protected LengthDimension lashLength;
/*       */ 
/*       */   @XmlElement(name="LeagueName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String leagueName;
/*       */ 
/*       */   @XmlElement(name="LegStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String legStyle;
/*       */ 
/*       */   @XmlElement(name="LensMaterial")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String lensMaterial;
/*       */ 
/*       */   @XmlElement(name="LensShape")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String lensShape;
/*       */ 
/*       */   @XmlElement(name="LifeVestType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String lifeVestType;
/*       */ 
/*       */   @XmlElement(name="LightIntensity")
/*       */   protected BigDecimal lightIntensity;
/*       */ 
/*       */   @XmlElement(name="LineWeight")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String lineWeight;
/*       */ 
/*       */   @XmlElement(name="LiningMaterial")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String liningMaterial;
/*       */ 
/*       */   @XmlElement(name="LithiumBatteryEnergyContent")
/*       */   protected OptionalEnergyConsumptionDimension lithiumBatteryEnergyContent;
/*       */ 
/*       */   @XmlElement(name="LithiumBatteryPackaging")
/*       */   protected String lithiumBatteryPackaging;
/*       */ 
/*       */   @XmlElement(name="LithiumBatteryVoltage")
/*       */   protected OptionalVoltageDecimalDimension lithiumBatteryVoltage;
/*       */ 
/*       */   @XmlElement(name="LithiumBatteryWeight")
/*       */   protected OptionalWeightDimension lithiumBatteryWeight;
/*       */ 
/*       */   @XmlElement(name="LoadCapacity")
/*       */   protected WeightDimension loadCapacity;
/*       */ 
/*       */   @XmlElement(name="LockType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String lockType;
/*       */ 
/*       */   @XmlElement(name="Loudness")
/*       */   protected BigDecimal loudness;
/*       */ 
/*       */   @XmlElement(name="LureWeight")
/*       */   protected WeightDimension lureWeight;
/*       */ 
/*       */   @XmlElement(name="ManufacturerDefinedQualityDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String manufacturerDefinedQualityDescription;
/*       */ 
/*       */   @XmlElement(name="MartialArtsType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String martialArtsType;
/*       */ 
/*       */   @XmlElement(name="MaximumCompatibleBootSize")
/*       */   protected BootSizeDimension maximumCompatibleBootSize;
/*       */ 
/*       */   @XmlElement(name="MaximumCompatibleRopeDiameter")
/*       */   protected LengthDimension maximumCompatibleRopeDiameter;
/*       */ 
/*       */   @XmlElement(name="MaximumHeight")
/*       */   protected LengthDimension maximumHeight;
/*       */ 
/*       */   @XmlElement(name="MaximumInclinePercentage")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger maximumInclinePercentage;
/*       */ 
/*       */   @XmlElement(name="MaximumLegSize")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String maximumLegSize;
/*       */ 
/*       */   @XmlElement(name="MaximumMagnification")
/*       */   protected BigDecimal maximumMagnification;
/*       */ 
/*       */   @XmlElement(name="MaximumPitchSpeed")
/*       */   protected MaximumPitchSpeed maximumPitchSpeed;
/*       */ 
/*       */   @XmlElement(name="MaximumResistance")
/*       */   protected WeightDimension maximumResistance;
/*       */ 
/*       */   @XmlElement(name="MaximumStrideLength")
/*       */   protected LengthDimension maximumStrideLength;
/*       */ 
/*       */   @XmlElement(name="MaximumTensionRating")
/*       */   protected WeightDimension maximumTensionRating;
/*       */ 
/*       */   @XmlElement(name="MaximumUserWeight")
/*       */   protected WeightDimension maximumUserWeight;
/*       */ 
/*       */   @XmlElement(name="MaximumWeight")
/*       */   protected WeightDimension maximumWeight;
/*       */ 
/*       */   @XmlElement(name="MaxWeightRecommendation")
/*       */   protected WeightDimension maxWeightRecommendation;
/*       */ 
/*       */   @XmlElement(name="MechanicalStructure")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mechanicalStructure;
/*       */ 
/*       */   @XmlElement(name="Memory")
/*       */   protected MemorySizeDimension memory;
/*       */ 
/*       */   @XmlElement(name="MfrWarrantyDescriptionLabor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mfrWarrantyDescriptionLabor;
/*       */ 
/*       */   @XmlElement(name="MfrWarrantyDescriptionParts")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mfrWarrantyDescriptionParts;
/*       */ 
/*       */   @XmlElement(name="MfrWarrantyDescriptionType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mfrWarrantyDescriptionType;
/*       */ 
/*       */   @XmlElement(name="MinimumCompatibleBootSize")
/*       */   protected BootSizeDimension minimumCompatibleBootSize;
/*       */ 
/*       */   @XmlElement(name="MinimumCompatibleRopeDiameter")
/*       */   protected LengthDimension minimumCompatibleRopeDiameter;
/*       */ 
/*       */   @XmlElement(name="MinimumLegSize")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String minimumLegSize;
/*       */ 
/*       */   @XmlElement(name="MinimumMagnification")
/*       */   protected BigDecimal minimumMagnification;
/*       */ 
/*       */   @XmlElement(name="MinimumTensionRating")
/*       */   protected WeightDimension minimumTensionRating;
/*       */ 
/*       */   @XmlElement(name="MinimumTorsoFit")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String minimumTorsoFit;
/*       */ 
/*       */   @XmlElement(name="MinimumWeightRecommendation")
/*       */   protected WeightDimension minimumWeightRecommendation;
/*       */ 
/*       */   @XmlElement(name="MonitorFeatures")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String monitorFeatures;
/*       */ 
/*       */   @XmlElement(name="MotorSize")
/*       */   protected OptionalMotorSizeDimension motorSize;
/*       */ 
/*       */   @XmlElement(name="MountainBikeProportionalFrameSize")
/*       */   protected LengthDimension mountainBikeProportionalFrameSize;
/*       */ 
/*       */   @XmlElement(name="MountainBikeType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mountainBikeType;
/*       */ 
/*       */   @XmlElement(name="MountType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String mountType;
/*       */ 
/*       */   @XmlElement(name="MovementType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String movementType;
/*       */ 
/*       */   @XmlElement(name="NeckStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String neckStyle;
/*       */ 
/*       */   @XmlElement(name="NumberOfBlades")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfBlades;
/*       */ 
/*       */   @XmlElement(name="NumberOfCarriagePositions")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfCarriagePositions;
/*       */ 
/*       */   @XmlElement(name="NumberOfDoors")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfDoors;
/*       */ 
/*       */   @XmlElement(name="NumberOfExercises")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfExercises;
/*       */ 
/*       */   @XmlElement(name="NumberOfFootPositions")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfFootPositions;
/*       */ 
/*       */   @XmlElement(name="NumberOfGearLoops")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfGearLoops;
/*       */ 
/*       */   @XmlElement(name="NumberOfHeadPositions")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfHeadPositions;
/*       */ 
/*       */   @XmlElement(name="NumberOfHolds")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfHolds;
/*       */ 
/*       */   @XmlElement(name="NumberOfHorses")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfHorses;
/*       */ 
/*       */   @XmlElement(name="NumberOfLevels")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfLevels;
/*       */ 
/*       */   @XmlElement(name="NumberOfLithiumIonCells")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfLithiumIonCells;
/*       */ 
/*       */   @XmlElement(name="NumberOfLithiumMetalCells")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfLithiumMetalCells;
/*       */ 
/*       */   @XmlElement(name="NumberOfPages")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfPages;
/*       */ 
/*       */   @XmlElement(name="NumberOfPieces")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfPieces;
/*       */ 
/*       */   @XmlElement(name="NumberOfPockets")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfPockets;
/*       */ 
/*       */   @XmlElement(name="NumberOfPoles")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfPoles;
/*       */ 
/*       */   @XmlElement(name="NumberOfPrograms")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfPrograms;
/*       */ 
/*       */   @XmlElement(name="NumberOfResistanceLevels")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfResistanceLevels;
/*       */ 
/*       */   @XmlElement(name="NumberOfSpeeds")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfSpeeds;
/*       */ 
/*       */   @XmlElement(name="NumberOfSprings")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger numberOfSprings;
/*       */ 
/*       */   @XmlElement(name="ObjectiveLensSize")
/*       */   protected LengthDimension objectiveLensSize;
/*       */ 
/*       */   @XmlElement(name="OperationMode")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String operationMode;
/*       */ 
/*       */   @XmlElement(name="Orientation")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String orientation;
/*       */ 
/*       */   @XmlElement(name="OuterMaterialType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String outerMaterialType;
/*       */ 
/*       */   @XmlElement(name="PackedSize")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String packedSize;
/*       */ 
/*       */   @XmlElement(name="PadType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String padType;
/*       */ 
/*       */   @XmlElement(name="PatternStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String patternStyle;
/*       */ 
/*       */   @XmlElement(name="PeakHeight")
/*       */   protected LengthDimension peakHeight;
/*       */ 
/*       */   @XmlElement(name="Pixels")
/*       */   protected OptionalResolutionDimension pixels;
/*       */ 
/*       */   @XmlElement(name="PlayerName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String playerName;
/*       */ 
/*       */   @XmlElement(name="PocketDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String pocketDescription;
/*       */ 
/*       */   @XmlElement(name="PositionAccuracy")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String positionAccuracy;
/*       */ 
/*       */   @XmlElement(name="PowerSource")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String powerSource;
/*       */ 
/*       */   @XmlElement(name="PPUCount")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String ppuCount;
/*       */ 
/*       */   @XmlElement(name="PPUCountType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String ppuCountType;
/*       */ 
/*       */   @XmlElement(name="ProportionalFrameSize")
/*       */   protected BigDecimal proportionalFrameSize;
/*       */ 
/*       */   @XmlElement(name="PullType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String pullType;
/*       */ 
/*       */   @XmlElement(name="Range")
/*       */   protected StringLengthOptionalDimension range;
/*       */ 
/*       */   @XmlElement(name="RearDerailleurCompatibleChainSize")
/*       */   protected LengthDimension rearDerailleurCompatibleChainSize;
/*       */ 
/*       */   @XmlElement(name="RecommendedWorkoutSpace")
/*       */   protected AreaDimensionOptionalUnit recommendedWorkoutSpace;
/*       */ 
/*       */   @XmlElement(name="ReelDiameter")
/*       */   protected LengthDimension reelDiameter;
/*       */ 
/*       */   @XmlElement(name="ReelModel")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String reelModel;
/*       */ 
/*       */   @XmlElement(name="Region")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String region;
/*       */ 
/*       */   @XmlElement(name="Resistance")
/*       */   protected OptionalResistanceDimension resistance;
/*       */ 
/*       */   @XmlElement(name="ResistanceMechanism")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String resistanceMechanism;
/*       */ 
/*       */   @XmlElement(name="Resolution")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String resolution;
/*       */ 
/*       */   @XmlElement(name="RiseStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String riseStyle;
/*       */ 
/*       */   @XmlElement(name="RoadBikeProportionalFrameSize")
/*       */   protected LengthDimension roadBikeProportionalFrameSize;
/*       */ 
/*       */   @XmlElement(name="RoadBikeType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String roadBikeType;
/*       */ 
/*       */   @XmlElement(name="RodLength")
/*       */   protected LengthDimension rodLength;
/*       */ 
/*       */   @XmlElement(name="RodWeight")
/*       */   protected WeightDimension rodWeight;
/*       */ 
/*       */   @XmlElement(name="Routes")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger routes;
/*       */ 
/*       */   @XmlElement(name="R-Value")
/*       */   protected OptionalRValueDimension rValue;
/*       */ 
/*       */   @XmlElement(name="Scale")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String scale;
/*       */ 
/*       */   @XmlElement(name="ScreenColor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String screenColor;
/*       */ 
/*       */   @XmlElement(name="ScreenSize")
/*       */   protected LengthDimension screenSize;
/*       */ 
/*       */   @XmlElement(name="SeatHeight")
/*       */   protected LengthDimension seatHeight;
/*       */ 
/*       */   @XmlElement(name="SeatingCapacity")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger seatingCapacity;
/*       */ 
/*       */   @XmlElement(name="SellerWarrantyDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String sellerWarrantyDescription;
/*       */ 
/*       */   @XmlElement(name="ShellMaterial")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String shellMaterial;
/*       */ 
/*       */   @XmlElement(name="ShirtType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String shirtType;
/*       */ 
/*       */   @XmlElement(name="ShoeWidth")
/*       */   protected StringLengthOptionalDimension shoeWidth;
/*       */ 
/*       */   @XmlElement(name="SizeMap")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String sizeMap;
/*       */ 
/*       */   @XmlElement(name="SkillLevel")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String skillLevel;
/*       */ 
/*       */   @XmlElement(name="SkiStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String skiStyle;
/*       */ 
/*       */   @XmlElement(name="SleepingCapacity")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger sleepingCapacity;
/*       */ 
/*       */   @XmlElement(name="SleeveLength")
/*       */   protected LengthDimension sleeveLength;
/*       */ 
/*       */   @XmlElement(name="SleeveType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String sleeveType;
/*       */ 
/*       */   @XmlElement(name="SnowboardStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String snowboardStyle;
/*       */ 
/*       */   @XmlElement(name="SockHeight")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String sockHeight;
/*       */ 
/*       */   @XmlElement(name="SockStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String sockStyle;
/*       */ 
/*       */   @XmlElement(name="SonarType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String sonarType;
/*       */ 
/*       */   @XmlElement(name="SpecialFeatures")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String specialFeatures;
/*       */ 
/*       */   @XmlElement(name="SpecificUsageForProduct")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String specificUsageForProduct;
/*       */ 
/*       */   @XmlElement(name="Speed")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speed;
/*       */ 
/*       */   @XmlElement(name="SpeedRating")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String speedRating;
/*       */ 
/*       */   @XmlElement(name="Sport")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String sport;
/*       */ 
/*       */   @XmlElement(name="State")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String state;
/*       */ 
/*       */   @XmlElement(name="StaticElongationPercentage")
/*       */   protected BigDecimal staticElongationPercentage;
/*       */ 
/*       */   @XmlElement(name="StaticWeight")
/*       */   protected WeightDimension staticWeight;
/*       */ 
/*       */   @XmlElement(name="StrapType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String strapType;
/*       */ 
/*       */   @XmlElement(name="Strength")
/*       */   protected WeightDimension strength;
/*       */ 
/*       */   @XmlElement(name="StyleKeywords")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected List<String> styleKeywords;
/*       */ 
/*       */   @XmlElement(name="SupportType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String supportType;
/*       */ 
/*       */   @XmlElement(name="SuspensionType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String suspensionType;
/*       */ 
/*       */   @XmlElement(name="TargetGender")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String targetGender;
/*       */ 
/*       */   @XmlElement(name="TargetZones")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger targetZones;
/*       */ 
/*       */   @XmlElement(name="TeamName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String teamName;
/*       */ 
/*       */   @XmlElement(name="TensionSupported")
/*       */   protected WeightDimension tensionSupported;
/*       */ 
/*       */   @XmlElement(name="Theme")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String theme;
/*       */ 
/*       */   @XmlElement(name="ThreadSize")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String threadSize;
/*       */ 
/*       */   @XmlElement(name="TopStyle")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String topStyle;
/*       */ 
/*       */   @XmlElement(name="TopTubeLength")
/*       */   protected LengthDimension topTubeLength;
/*       */ 
/*       */   @XmlElement(name="TrailerType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String trailerType;
/*       */ 
/*       */   @XmlElement(name="TurnRadius")
/*       */   protected LengthDimension turnRadius;
/*       */ 
/*       */   @XmlElement(name="UIAAFallRating")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger uiaaFallRating;
/*       */ 
/*       */   @XmlElement(name="UnderwireType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String underwireType;
/*       */ 
/*       */   @XmlElement(name="UniformNumber")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String uniformNumber;
/*       */ 
/*       */   @XmlElement(name="UsageCapacity")
/*       */   protected WeightDimension usageCapacity;
/*       */ 
/*       */   @XmlElement(name="UVProtection")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger uvProtection;
/*       */ 
/*       */   @XmlElement(name="VolumeCapacityName")
/*       */   protected OptionalVolumeDimension volumeCapacityName;
/*       */ 
/*       */   @XmlElement(name="WaistSize")
/*       */   protected LengthDimension waistSize;
/*       */ 
/*       */   @XmlElement(name="WaistWidth")
/*       */   protected LengthDimension waistWidth;
/*       */ 
/*       */   @XmlElement(name="WarmthRating")
/*       */   protected TemperatureRatingDimension warmthRating;
/*       */ 
/*       */   @XmlElement(name="Warnings")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String warnings;
/*       */ 
/*       */   @XmlElement(name="Warranty")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String warranty;
/*       */ 
/*       */   @XmlElement(name="WaterBottleCapType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String waterBottleCapType;
/*       */ 
/*       */   @XmlElement(name="WaterResistanceRating")
/*       */   protected LengthDimension waterResistanceRating;
/*       */ 
/*       */   @XmlElement(name="WaterType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String waterType;
/*       */ 
/*       */   @XmlElement(name="Wattage")
/*       */   protected BigDecimal wattage;
/*       */ 
/*       */   @XmlElement(name="Watts")
/*       */   protected WattageDimension watts;
/*       */ 
/*       */   @XmlElement(name="WayPoints")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger wayPoints;
/*       */ 
/*       */   @XmlElement(name="WeightCapacity")
/*       */   protected WeightDimension weightCapacity;
/*       */ 
/*       */   @XmlElement(name="WhatsInTheBox")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String whatsInTheBox;
/*       */ 
/*       */   @XmlElement(name="WheelType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String wheelType;
/*       */ 
/*       */   @XmlElement(name="ThreadPitch")
/*       */   protected LengthDimension threadPitch;
/*       */ 
/*       */   @XmlElement(name="DriveSystem")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String driveSystem;
/*       */ 
/*       */   @XmlElement(name="BladeMaterialType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String bladeMaterialType;
/*       */ 
/*       */   @XmlElement(name="SportsNumberOfPockets")
/*       */   @XmlSchemaType(name="positiveInteger")
/*       */   protected BigInteger sportsNumberOfPockets;
/*       */ 
/*       */   @XmlElement(name="WorkingLoadLimit")
/*       */   protected WeightDimension workingLoadLimit;
/*       */ 
/*       */   @XmlElement(name="WatchMovementType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String watchMovementType;
/*       */ 
/*       */   @XmlElement(name="TankVolume")
/*       */   protected VolumeDimension tankVolume;
/*       */ 
/*       */   @XmlElement(name="PowerRating")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String powerRating;
/*       */ 
/*       */   @XmlElement(name="PatternType")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String patternType;
/*       */ 
/*       */   @XmlElement(name="OutputPower")
/*       */   protected OutputPowerDimension outputPower;
/*       */ 
/*       */   @XmlElement(name="OpticalPower")
/*       */   protected OpticalPowerDimension opticalPower;
/*       */ 
/*       */   @XmlElement(name="MinimumHeightRecommendation")
/*       */   protected LengthDimension minimumHeightRecommendation;
/*       */ 
/*       */   @XmlElement(name="ItemDiameter")
/*       */   protected LengthDimension itemDiameter;
/*       */ 
/*       */   @XmlElement(name="AgeRangeDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String ageRangeDescription;
/*       */ 
/*       */   @XmlElement(name="CollectionName")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String collectionName;
/*       */ 
/*       */   @XmlElement(name="BandSizeNumber")
/*       */   protected LengthDimension bandSizeNumber;
/*       */ 
/*       */   @XmlElement(name="BatteryCellComposition")
/*       */   protected BatteryCellTypeValues batteryCellComposition;
/*       */ 
/*       */   @XmlElement(name="BatteryDescription")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String batteryDescription;
/*       */ 
/*       */   @XmlElement(name="BatteryFormFactor")
/*       */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */   protected String batteryFormFactor;
/*       */ 
/*       */   public String getProductType()
/*       */   {
/*  1803 */     return this.productType;
/*       */   }
/*       */ 
/*       */   public void setProductType(String value)
/*       */   {
/*  1815 */     this.productType = value;
/*       */   }
/*       */ 
/*       */   public VariationData getVariationData()
/*       */   {
/*  1827 */     return this.variationData;
/*       */   }
/*       */ 
/*       */   public void setVariationData(VariationData value)
/*       */   {
/*  1839 */     this.variationData = value;
/*       */   }
/*       */ 
/*       */   public String getMaterialComposition()
/*       */   {
/*  1851 */     return this.materialComposition;
/*       */   }
/*       */ 
/*       */   public void setMaterialComposition(String value)
/*       */   {
/*  1863 */     this.materialComposition = value;
/*       */   }
/*       */ 
/*       */   public String getPackaging()
/*       */   {
/*  1875 */     return this.packaging;
/*       */   }
/*       */ 
/*       */   public void setPackaging(String value)
/*       */   {
/*  1887 */     this.packaging = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIsCustomizable()
/*       */   {
/*  1899 */     return this.isCustomizable;
/*       */   }
/*       */ 
/*       */   public void setIsCustomizable(Boolean value)
/*       */   {
/*  1911 */     this.isCustomizable = value;
/*       */   }
/*       */ 
/*       */   public String getCustomizableTemplateName()
/*       */   {
/*  1923 */     return this.customizableTemplateName;
/*       */   }
/*       */ 
/*       */   public void setCustomizableTemplateName(String value)
/*       */   {
/*  1935 */     this.customizableTemplateName = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIsAdultProduct()
/*       */   {
/*  1947 */     return this.isAdultProduct;
/*       */   }
/*       */ 
/*       */   public void setIsAdultProduct(Boolean value)
/*       */   {
/*  1959 */     this.isAdultProduct = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getModelYear()
/*       */   {
/*  1971 */     return this.modelYear;
/*       */   }
/*       */ 
/*       */   public void setModelYear(BigInteger value)
/*       */   {
/*  1983 */     this.modelYear = value;
/*       */   }
/*       */ 
/*       */   public String getSeason()
/*       */   {
/*  1995 */     return this.season;
/*       */   }
/*       */ 
/*       */   public void setSeason(String value)
/*       */   {
/*  2007 */     this.season = value;
/*       */   }
/*       */ 
/*       */   public String getAccessLocation()
/*       */   {
/*  2019 */     return this.accessLocation;
/*       */   }
/*       */ 
/*       */   public void setAccessLocation(String value)
/*       */   {
/*  2031 */     this.accessLocation = value;
/*       */   }
/*       */ 
/*       */   public String getAction()
/*       */   {
/*  2043 */     return this.action;
/*       */   }
/*       */ 
/*       */   public void setAction(String value)
/*       */   {
/*  2055 */     this.action = value;
/*       */   }
/*       */ 
/*       */   public String getActiveIngredients()
/*       */   {
/*  2067 */     return this.activeIngredients;
/*       */   }
/*       */ 
/*       */   public void setActiveIngredients(String value)
/*       */   {
/*  2079 */     this.activeIngredients = value;
/*       */   }
/*       */ 
/*       */   public String getAlarm()
/*       */   {
/*  2091 */     return this.alarm;
/*       */   }
/*       */ 
/*       */   public void setAlarm(String value)
/*       */   {
/*  2103 */     this.alarm = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getApparentScaleSize()
/*       */   {
/*  2115 */     return this.apparentScaleSize;
/*       */   }
/*       */ 
/*       */   public void setApparentScaleSize(LengthDimension value)
/*       */   {
/*  2127 */     this.apparentScaleSize = value;
/*       */   }
/*       */ 
/*       */   public String getAvailableCourses()
/*       */   {
/*  2139 */     return this.availableCourses;
/*       */   }
/*       */ 
/*       */   public void setAvailableCourses(String value)
/*       */   {
/*  2151 */     this.availableCourses = value;
/*       */   }
/*       */ 
/*       */   public String getBackingLineCapacity()
/*       */   {
/*  2163 */     return this.backingLineCapacity;
/*       */   }
/*       */ 
/*       */   public void setBackingLineCapacity(String value)
/*       */   {
/*  2175 */     this.backingLineCapacity = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getBaseLength()
/*       */   {
/*  2187 */     return this.baseLength;
/*       */   }
/*       */ 
/*       */   public void setBaseLength(LengthDimension value)
/*       */   {
/*  2199 */     this.baseLength = value;
/*       */   }
/*       */ 
/*       */   public Battery getBattery()
/*       */   {
/*  2211 */     return this.battery;
/*       */   }
/*       */ 
/*       */   public void setBattery(Battery value)
/*       */   {
/*  2223 */     this.battery = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getBatteryAverageLife()
/*       */   {
/*  2235 */     return this.batteryAverageLife;
/*       */   }
/*       */ 
/*       */   public void setBatteryAverageLife(BigDecimal value)
/*       */   {
/*  2247 */     this.batteryAverageLife = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getBatteryAverageLifeStandby()
/*       */   {
/*  2259 */     return this.batteryAverageLifeStandby;
/*       */   }
/*       */ 
/*       */   public void setBatteryAverageLifeStandby(BigDecimal value)
/*       */   {
/*  2271 */     this.batteryAverageLifeStandby = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getBatteryChargeTime()
/*       */   {
/*  2283 */     return this.batteryChargeTime;
/*       */   }
/*       */ 
/*       */   public void setBatteryChargeTime(BigDecimal value)
/*       */   {
/*  2295 */     this.batteryChargeTime = value;
/*       */   }
/*       */ 
/*       */   public List<AssemblyTimeDimension> getBatteryLife()
/*       */   {
/*  2321 */     if (this.batteryLife == null) {
/*  2322 */       this.batteryLife = new ArrayList();
/*       */     }
/*  2324 */     return this.batteryLife;
/*       */   }
/*       */ 
/*       */   public BigInteger getBatteryTypeLithiumIon()
/*       */   {
/*  2336 */     return this.batteryTypeLithiumIon;
/*       */   }
/*       */ 
/*       */   public void setBatteryTypeLithiumIon(BigInteger value)
/*       */   {
/*  2348 */     this.batteryTypeLithiumIon = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getBatteryTypeLithiumMetal()
/*       */   {
/*  2360 */     return this.batteryTypeLithiumMetal;
/*       */   }
/*       */ 
/*       */   public void setBatteryTypeLithiumMetal(BigInteger value)
/*       */   {
/*  2372 */     this.batteryTypeLithiumMetal = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getBeamWidth()
/*       */   {
/*  2384 */     return this.beamWidth;
/*       */   }
/*       */ 
/*       */   public void setBeamWidth(LengthDimension value)
/*       */   {
/*  2396 */     this.beamWidth = value;
/*       */   }
/*       */ 
/*       */   public String getBearingMaterialType()
/*       */   {
/*  2408 */     return this.bearingMaterialType;
/*       */   }
/*       */ 
/*       */   public void setBearingMaterialType(String value)
/*       */   {
/*  2420 */     this.bearingMaterialType = value;
/*       */   }
/*       */ 
/*       */   public String getBeltStyle()
/*       */   {
/*  2432 */     return this.beltStyle;
/*       */   }
/*       */ 
/*       */   public void setBeltStyle(String value)
/*       */   {
/*  2444 */     this.beltStyle = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getBikeWeight()
/*       */   {
/*  2456 */     return this.bikeWeight;
/*       */   }
/*       */ 
/*       */   public void setBikeWeight(WeightDimension value)
/*       */   {
/*  2468 */     this.bikeWeight = value;
/*       */   }
/*       */ 
/*       */   public String getBladeGrind()
/*       */   {
/*  2480 */     return this.bladeGrind;
/*       */   }
/*       */ 
/*       */   public void setBladeGrind(String value)
/*       */   {
/*  2492 */     this.bladeGrind = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getBladeLength()
/*       */   {
/*  2504 */     return this.bladeLength;
/*       */   }
/*       */ 
/*       */   public void setBladeLength(LengthDimension value)
/*       */   {
/*  2516 */     this.bladeLength = value;
/*       */   }
/*       */ 
/*       */   public String getBladeShape()
/*       */   {
/*  2528 */     return this.bladeShape;
/*       */   }
/*       */ 
/*       */   public void setBladeShape(String value)
/*       */   {
/*  2540 */     this.bladeShape = value;
/*       */   }
/*       */ 
/*       */   public String getBladeType()
/*       */   {
/*  2552 */     return this.bladeType;
/*       */   }
/*       */ 
/*       */   public void setBladeType(String value)
/*       */   {
/*  2564 */     this.bladeType = value;
/*       */   }
/*       */ 
/*       */   public String getBMXBikeType()
/*       */   {
/*  2576 */     return this.bmxBikeType;
/*       */   }
/*       */ 
/*       */   public void setBMXBikeType(String value)
/*       */   {
/*  2588 */     this.bmxBikeType = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getBoatFenderDiameter()
/*       */   {
/*  2600 */     return this.boatFenderDiameter;
/*       */   }
/*       */ 
/*       */   public void setBoatFenderDiameter(LengthDimension value)
/*       */   {
/*  2612 */     this.boatFenderDiameter = value;
/*       */   }
/*       */ 
/*       */   public String getBoilRateDescription()
/*       */   {
/*  2624 */     return this.boilRateDescription;
/*       */   }
/*       */ 
/*       */   public void setBoilRateDescription(String value)
/*       */   {
/*  2636 */     this.boilRateDescription = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getBoomLength()
/*       */   {
/*  2648 */     return this.boomLength;
/*       */   }
/*       */ 
/*       */   public void setBoomLength(LengthDimension value)
/*       */   {
/*  2660 */     this.boomLength = value;
/*       */   }
/*       */ 
/*       */   public String getBottomStyle()
/*       */   {
/*  2672 */     return this.bottomStyle;
/*       */   }
/*       */ 
/*       */   public void setBottomStyle(String value)
/*       */   {
/*  2684 */     this.bottomStyle = value;
/*       */   }
/*       */ 
/*       */   public String getBrakeType()
/*       */   {
/*  2696 */     return this.brakeType;
/*       */   }
/*       */ 
/*       */   public void setBrakeType(String value)
/*       */   {
/*  2708 */     this.brakeType = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getBrakeWidth()
/*       */   {
/*  2720 */     return this.brakeWidth;
/*       */   }
/*       */ 
/*       */   public void setBrakeWidth(LengthDimension value)
/*       */   {
/*  2732 */     this.brakeWidth = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getBreakingStrength()
/*       */   {
/*  2744 */     return this.breakingStrength;
/*       */   }
/*       */ 
/*       */   public void setBreakingStrength(WeightDimension value)
/*       */   {
/*  2756 */     this.breakingStrength = value;
/*       */   }
/*       */ 
/*       */   public OptionalEnergyOutputDimension getBTUs()
/*       */   {
/*  2768 */     return this.btUs;
/*       */   }
/*       */ 
/*       */   public void setBTUs(OptionalEnergyOutputDimension value)
/*       */   {
/*  2780 */     this.btUs = value;
/*       */   }
/*       */ 
/*       */   public String getBuildup()
/*       */   {
/*  2792 */     return this.buildup;
/*       */   }
/*       */ 
/*       */   public void setBuildup(String value)
/*       */   {
/*  2804 */     this.buildup = value;
/*       */   }
/*       */ 
/*       */   public String getBulbType()
/*       */   {
/*  2816 */     return this.bulbType;
/*       */   }
/*       */ 
/*       */   public void setBulbType(String value)
/*       */   {
/*  2828 */     this.bulbType = value;
/*       */   }
/*       */ 
/*       */   public BurnTimeDimension getBurnTime()
/*       */   {
/*  2840 */     return this.burnTime;
/*       */   }
/*       */ 
/*       */   public void setBurnTime(BurnTimeDimension value)
/*       */   {
/*  2852 */     this.burnTime = value;
/*       */   }
/*       */ 
/*       */   public Boolean isCanShipInOriginalContainer()
/*       */   {
/*  2864 */     return this.canShipInOriginalContainer;
/*       */   }
/*       */ 
/*       */   public void setCanShipInOriginalContainer(Boolean value)
/*       */   {
/*  2876 */     this.canShipInOriginalContainer = value;
/*       */   }
/*       */ 
/*       */   public String getCapability()
/*       */   {
/*  2888 */     return this.capability;
/*       */   }
/*       */ 
/*       */   public void setCapability(String value)
/*       */   {
/*  2900 */     this.capability = value;
/*       */   }
/*       */ 
/*       */   public String getCapType()
/*       */   {
/*  2912 */     return this.capType;
/*       */   }
/*       */ 
/*       */   public void setCapType(String value)
/*       */   {
/*  2924 */     this.capType = value;
/*       */   }
/*       */ 
/*       */   public String getCareInstructions()
/*       */   {
/*  2936 */     return this.careInstructions;
/*       */   }
/*       */ 
/*       */   public void setCareInstructions(String value)
/*       */   {
/*  2948 */     this.careInstructions = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getCenterlineLength()
/*       */   {
/*  2960 */     return this.centerlineLength;
/*       */   }
/*       */ 
/*       */   public void setCenterlineLength(LengthDimension value)
/*       */   {
/*  2972 */     this.centerlineLength = value;
/*       */   }
/*       */ 
/*       */   public String getClosureType()
/*       */   {
/*  2984 */     return this.closureType;
/*       */   }
/*       */ 
/*       */   public void setClosureType(String value)
/*       */   {
/*  2996 */     this.closureType = value;
/*       */   }
/*       */ 
/*       */   public String getCollarType()
/*       */   {
/*  3008 */     return this.collarType;
/*       */   }
/*       */ 
/*       */   public void setCollarType(String value)
/*       */   {
/*  3020 */     this.collarType = value;
/*       */   }
/*       */ 
/*       */   public String getColorMap()
/*       */   {
/*  3032 */     return this.colorMap;
/*       */   }
/*       */ 
/*       */   public void setColorMap(String value)
/*       */   {
/*  3044 */     this.colorMap = value;
/*       */   }
/*       */ 
/*       */   public String getCompatibleDevices()
/*       */   {
/*  3056 */     return this.compatibleDevices;
/*       */   }
/*       */ 
/*       */   public void setCompatibleDevices(String value)
/*       */   {
/*  3068 */     this.compatibleDevices = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getCompatibleHoseDiameter()
/*       */   {
/*  3080 */     return this.compatibleHoseDiameter;
/*       */   }
/*       */ 
/*       */   public void setCompatibleHoseDiameter(LengthDimension value)
/*       */   {
/*  3092 */     this.compatibleHoseDiameter = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getCompatibleRopeDiameter()
/*       */   {
/*  3104 */     return this.compatibleRopeDiameter;
/*       */   }
/*       */ 
/*       */   public void setCompatibleRopeDiameter(LengthDimension value)
/*       */   {
/*  3116 */     this.compatibleRopeDiameter = value;
/*       */   }
/*       */ 
/*       */   public String getConstruction()
/*       */   {
/*  3128 */     return this.construction;
/*       */   }
/*       */ 
/*       */   public void setConstruction(String value)
/*       */   {
/*  3140 */     this.construction = value;
/*       */   }
/*       */ 
/*       */   public String getControlProgramName()
/*       */   {
/*  3152 */     return this.controlProgramName;
/*       */   }
/*       */ 
/*       */   public void setControlProgramName(String value)
/*       */   {
/*  3164 */     this.controlProgramName = value;
/*       */   }
/*       */ 
/*       */   public String getCoreMaterialType()
/*       */   {
/*  3176 */     return this.coreMaterialType;
/*       */   }
/*       */ 
/*       */   public void setCoreMaterialType(String value)
/*       */   {
/*  3188 */     this.coreMaterialType = value;
/*       */   }
/*       */ 
/*       */   public String getCountryAsLabeled()
/*       */   {
/*  3200 */     return this.countryAsLabeled;
/*       */   }
/*       */ 
/*       */   public void setCountryAsLabeled(String value)
/*       */   {
/*  3212 */     this.countryAsLabeled = value;
/*       */   }
/*       */ 
/*       */   public String getCountryOfOrigin()
/*       */   {
/*  3224 */     return this.countryOfOrigin;
/*       */   }
/*       */ 
/*       */   public void setCountryOfOrigin(String value)
/*       */   {
/*  3236 */     this.countryOfOrigin = value;
/*       */   }
/*       */ 
/*       */   public String getCourseCapacity()
/*       */   {
/*  3248 */     return this.courseCapacity;
/*       */   }
/*       */ 
/*       */   public void setCourseCapacity(String value)
/*       */   {
/*  3260 */     this.courseCapacity = value;
/*       */   }
/*       */ 
/*       */   public AreaDimension getCoverageArea()
/*       */   {
/*  3272 */     return this.coverageArea;
/*       */   }
/*       */ 
/*       */   public void setCoverageArea(AreaDimension value)
/*       */   {
/*  3284 */     this.coverageArea = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getCrankLength()
/*       */   {
/*  3296 */     return this.crankLength;
/*       */   }
/*       */ 
/*       */   public void setCrankLength(LengthDimension value)
/*       */   {
/*  3308 */     this.crankLength = value;
/*       */   }
/*       */ 
/*       */   public String getCuffType()
/*       */   {
/*  3320 */     return this.cuffType;
/*       */   }
/*       */ 
/*       */   public void setCuffType(String value)
/*       */   {
/*  3332 */     this.cuffType = value;
/*       */   }
/*       */ 
/*       */   public String getCupSize()
/*       */   {
/*  3344 */     return this.cupSize;
/*       */   }
/*       */ 
/*       */   public void setCupSize(String value)
/*       */   {
/*  3356 */     this.cupSize = value;
/*       */   }
/*       */ 
/*       */   public String getCycles()
/*       */   {
/*  3368 */     return this.cycles;
/*       */   }
/*       */ 
/*       */   public void setCycles(String value)
/*       */   {
/*  3380 */     this.cycles = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getDeckLength()
/*       */   {
/*  3392 */     return this.deckLength;
/*       */   }
/*       */ 
/*       */   public void setDeckLength(LengthDimension value)
/*       */   {
/*  3404 */     this.deckLength = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getDeckWidth()
/*       */   {
/*  3416 */     return this.deckWidth;
/*       */   }
/*       */ 
/*       */   public void setDeckWidth(LengthDimension value)
/*       */   {
/*  3428 */     this.deckWidth = value;
/*       */   }
/*       */ 
/*       */   public String getDirections()
/*       */   {
/*  3440 */     return this.directions;
/*       */   }
/*       */ 
/*       */   public void setDirections(String value)
/*       */   {
/*  3452 */     this.directions = value;
/*       */   }
/*       */ 
/*       */   public String getDisplayFeatures()
/*       */   {
/*  3464 */     return this.displayFeatures;
/*       */   }
/*       */ 
/*       */   public void setDisplayFeatures(String value)
/*       */   {
/*  3476 */     this.displayFeatures = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getDisplayLength()
/*       */   {
/*  3488 */     return this.displayLength;
/*       */   }
/*       */ 
/*       */   public void setDisplayLength(LengthDimension value)
/*       */   {
/*  3500 */     this.displayLength = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getDisplaySize()
/*       */   {
/*  3512 */     return this.displaySize;
/*       */   }
/*       */ 
/*       */   public void setDisplaySize(LengthDimension value)
/*       */   {
/*  3524 */     this.displaySize = value;
/*       */   }
/*       */ 
/*       */   public String getDisplayType()
/*       */   {
/*  3536 */     return this.displayType;
/*       */   }
/*       */ 
/*       */   public void setDisplayType(String value)
/*       */   {
/*  3548 */     this.displayType = value;
/*       */   }
/*       */ 
/*       */   public VolumeDimension getDisplayVolume()
/*       */   {
/*  3560 */     return this.displayVolume;
/*       */   }
/*       */ 
/*       */   public void setDisplayVolume(VolumeDimension value)
/*       */   {
/*  3572 */     this.displayVolume = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getDisplayWeight()
/*       */   {
/*  3584 */     return this.displayWeight;
/*       */   }
/*       */ 
/*       */   public void setDisplayWeight(WeightDimension value)
/*       */   {
/*  3596 */     this.displayWeight = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getEffectiveEdgeLength()
/*       */   {
/*  3608 */     return this.effectiveEdgeLength;
/*       */   }
/*       */ 
/*       */   public void setEffectiveEdgeLength(LengthDimension value)
/*       */   {
/*  3620 */     this.effectiveEdgeLength = value;
/*       */   }
/*       */ 
/*       */   public EngineDisplacement getEngineDisplacement()
/*       */   {
/*  3632 */     return this.engineDisplacement;
/*       */   }
/*       */ 
/*       */   public void setEngineDisplacement(EngineDisplacement value)
/*       */   {
/*  3644 */     this.engineDisplacement = value;
/*       */   }
/*       */ 
/*       */   public String getEventName()
/*       */   {
/*  3656 */     return this.eventName;
/*       */   }
/*       */ 
/*       */   public void setEventName(String value)
/*       */   {
/*  3668 */     this.eventName = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getEye()
/*       */   {
/*  3680 */     return this.eye;
/*       */   }
/*       */ 
/*       */   public void setEye(BigInteger value)
/*       */   {
/*  3692 */     this.eye = value;
/*       */   }
/*       */ 
/*       */   public String getFabricType()
/*       */   {
/*  3704 */     return this.fabricType;
/*       */   }
/*       */ 
/*       */   public void setFabricType(String value)
/*       */   {
/*  3716 */     this.fabricType = value;
/*       */   }
/*       */ 
/*       */   public String getFabricWash()
/*       */   {
/*  3728 */     return this.fabricWash;
/*       */   }
/*       */ 
/*       */   public void setFabricWash(String value)
/*       */   {
/*  3740 */     this.fabricWash = value;
/*       */   }
/*       */ 
/*       */   public String getFillMaterialType()
/*       */   {
/*  3752 */     return this.fillMaterialType;
/*       */   }
/*       */ 
/*       */   public void setFillMaterialType(String value)
/*       */   {
/*  3764 */     this.fillMaterialType = value;
/*       */   }
/*       */ 
/*       */   public String getFishingLineType()
/*       */   {
/*  3776 */     return this.fishingLineType;
/*       */   }
/*       */ 
/*       */   public void setFishingLineType(String value)
/*       */   {
/*  3788 */     this.fishingLineType = value;
/*       */   }
/*       */ 
/*       */   public String getFishType()
/*       */   {
/*  3800 */     return this.fishType;
/*       */   }
/*       */ 
/*       */   public void setFishType(String value)
/*       */   {
/*  3812 */     this.fishType = value;
/*       */   }
/*       */ 
/*       */   public String getFittingType()
/*       */   {
/*  3824 */     return this.fittingType;
/*       */   }
/*       */ 
/*       */   public void setFittingType(String value)
/*       */   {
/*  3836 */     this.fittingType = value;
/*       */   }
/*       */ 
/*       */   public String getFitType()
/*       */   {
/*  3848 */     return this.fitType;
/*       */   }
/*       */ 
/*       */   public void setFitType(String value)
/*       */   {
/*  3860 */     this.fitType = value;
/*       */   }
/*       */ 
/*       */   public AreaDimension getFloorArea()
/*       */   {
/*  3872 */     return this.floorArea;
/*       */   }
/*       */ 
/*       */   public void setFloorArea(AreaDimension value)
/*       */   {
/*  3884 */     this.floorArea = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getFloorLength()
/*       */   {
/*  3896 */     return this.floorLength;
/*       */   }
/*       */ 
/*       */   public void setFloorLength(LengthDimension value)
/*       */   {
/*  3908 */     this.floorLength = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getFloorWidth()
/*       */   {
/*  3920 */     return this.floorWidth;
/*       */   }
/*       */ 
/*       */   public void setFloorWidth(LengthDimension value)
/*       */   {
/*  3932 */     this.floorWidth = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getFlyLineNumber()
/*       */   {
/*  3944 */     return this.flyLineNumber;
/*       */   }
/*       */ 
/*       */   public void setFlyLineNumber(BigInteger value)
/*       */   {
/*  3956 */     this.flyLineNumber = value;
/*       */   }
/*       */ 
/*       */   public String getFoldedLength()
/*       */   {
/*  3968 */     return this.foldedLength;
/*       */   }
/*       */ 
/*       */   public void setFoldedLength(String value)
/*       */   {
/*  3980 */     this.foldedLength = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getFrameHeight()
/*       */   {
/*  3992 */     return this.frameHeight;
/*       */   }
/*       */ 
/*       */   public void setFrameHeight(LengthDimension value)
/*       */   {
/*  4004 */     this.frameHeight = value;
/*       */   }
/*       */ 
/*       */   public String getFrameMaterial()
/*       */   {
/*  4016 */     return this.frameMaterial;
/*       */   }
/*       */ 
/*       */   public void setFrameMaterial(String value)
/*       */   {
/*  4028 */     this.frameMaterial = value;
/*       */   }
/*       */ 
/*       */   public String getFrameType()
/*       */   {
/*  4040 */     return this.frameType;
/*       */   }
/*       */ 
/*       */   public void setFrameType(String value)
/*       */   {
/*  4052 */     this.frameType = value;
/*       */   }
/*       */ 
/*       */   public String getFrequencyBand()
/*       */   {
/*  4064 */     return this.frequencyBand;
/*       */   }
/*       */ 
/*       */   public void setFrequencyBand(String value)
/*       */   {
/*  4076 */     this.frequencyBand = value;
/*       */   }
/*       */ 
/*       */   public String getFrontPleatType()
/*       */   {
/*  4088 */     return this.frontPleatType;
/*       */   }
/*       */ 
/*       */   public void setFrontPleatType(String value)
/*       */   {
/*  4100 */     this.frontPleatType = value;
/*       */   }
/*       */ 
/*       */   public VolumeDimension getFuelCapacity()
/*       */   {
/*  4112 */     return this.fuelCapacity;
/*       */   }
/*       */ 
/*       */   public void setFuelCapacity(VolumeDimension value)
/*       */   {
/*  4124 */     this.fuelCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getFuelType()
/*       */   {
/*  4136 */     return this.fuelType;
/*       */   }
/*       */ 
/*       */   public void setFuelType(String value)
/*       */   {
/*  4148 */     this.fuelType = value;
/*       */   }
/*       */ 
/*       */   public String getFunctions()
/*       */   {
/*  4160 */     return this.functions;
/*       */   }
/*       */ 
/*       */   public void setFunctions(String value)
/*       */   {
/*  4172 */     this.functions = value;
/*       */   }
/*       */ 
/*       */   public String getFurDescription()
/*       */   {
/*  4184 */     return this.furDescription;
/*       */   }
/*       */ 
/*       */   public void setFurDescription(String value)
/*       */   {
/*  4196 */     this.furDescription = value;
/*       */   }
/*       */ 
/*       */   public String getGearDirection()
/*       */   {
/*  4208 */     return this.gearDirection;
/*       */   }
/*       */ 
/*       */   public void setGearDirection(String value)
/*       */   {
/*  4220 */     this.gearDirection = value;
/*       */   }
/*       */ 
/*       */   public String getGeographicCoverage()
/*       */   {
/*  4232 */     return this.geographicCoverage;
/*       */   }
/*       */ 
/*       */   public void setGeographicCoverage(String value)
/*       */   {
/*  4244 */     this.geographicCoverage = value;
/*       */   }
/*       */ 
/*       */   public String getGloveType()
/*       */   {
/*  4256 */     return this.gloveType;
/*       */   }
/*       */ 
/*       */   public void setGloveType(String value)
/*       */   {
/*  4268 */     this.gloveType = value;
/*       */   }
/*       */ 
/*       */   public String getGripMaterialType()
/*       */   {
/*  4280 */     return this.gripMaterialType;
/*       */   }
/*       */ 
/*       */   public void setGripMaterialType(String value)
/*       */   {
/*  4292 */     this.gripMaterialType = value;
/*       */   }
/*       */ 
/*       */   public String getGuardMaterialType()
/*       */   {
/*  4304 */     return this.guardMaterialType;
/*       */   }
/*       */ 
/*       */   public void setGuardMaterialType(String value)
/*       */   {
/*  4316 */     this.guardMaterialType = value;
/*       */   }
/*       */ 
/*       */   public String getHandleMaterial()
/*       */   {
/*  4328 */     return this.handleMaterial;
/*       */   }
/*       */ 
/*       */   public void setHandleMaterial(String value)
/*       */   {
/*  4340 */     this.handleMaterial = value;
/*       */   }
/*       */ 
/*       */   public String getHandleType()
/*       */   {
/*  4352 */     return this.handleType;
/*       */   }
/*       */ 
/*       */   public void setHandleType(String value)
/*       */   {
/*  4364 */     this.handleType = value;
/*       */   }
/*       */ 
/*       */   public TemperatureRatingDimension getHeatRating()
/*       */   {
/*  4376 */     return this.heatRating;
/*       */   }
/*       */ 
/*       */   public void setHeatRating(TemperatureRatingDimension value)
/*       */   {
/*  4388 */     this.heatRating = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getHP()
/*       */   {
/*  4400 */     return this.hp;
/*       */   }
/*       */ 
/*       */   public void setHP(BigDecimal value)
/*       */   {
/*  4412 */     this.hp = value;
/*       */   }
/*       */ 
/*       */   public String getHullShape()
/*       */   {
/*  4424 */     return this.hullShape;
/*       */   }
/*       */ 
/*       */   public void setHullShape(String value)
/*       */   {
/*  4436 */     this.hullShape = value;
/*       */   }
/*       */ 
/*       */   public String getIdentityPackageType()
/*       */   {
/*  4448 */     return this.identityPackageType;
/*       */   }
/*       */ 
/*       */   public void setIdentityPackageType(String value)
/*       */   {
/*  4460 */     this.identityPackageType = value;
/*       */   }
/*       */ 
/*       */   public String getImportDesignation()
/*       */   {
/*  4472 */     return this.importDesignation;
/*       */   }
/*       */ 
/*       */   public void setImportDesignation(String value)
/*       */   {
/*  4484 */     this.importDesignation = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getImpactForce()
/*       */   {
/*  4496 */     return this.impactForce;
/*       */   }
/*       */ 
/*       */   public void setImpactForce(BigDecimal value)
/*       */   {
/*  4508 */     this.impactForce = value;
/*       */   }
/*       */ 
/*       */   public String getIngredients()
/*       */   {
/*  4520 */     return this.ingredients;
/*       */   }
/*       */ 
/*       */   public void setIngredients(String value)
/*       */   {
/*  4532 */     this.ingredients = value;
/*       */   }
/*       */ 
/*       */   public OptionalLengthIntegerDimension getInseam()
/*       */   {
/*  4544 */     return this.inseam;
/*       */   }
/*       */ 
/*       */   public void setInseam(OptionalLengthIntegerDimension value)
/*       */   {
/*  4556 */     this.inseam = value;
/*       */   }
/*       */ 
/*       */   public String getInsulationType()
/*       */   {
/*  4568 */     return this.insulationType;
/*       */   }
/*       */ 
/*       */   public void setInsulationType(String value)
/*       */   {
/*  4580 */     this.insulationType = value;
/*       */   }
/*       */ 
/*       */   public OptionalLuminiousIntensityDimension getIntensity()
/*       */   {
/*  4592 */     return this.intensity;
/*       */   }
/*       */ 
/*       */   public void setIntensity(OptionalLuminiousIntensityDimension value)
/*       */   {
/*  4604 */     this.intensity = value;
/*       */   }
/*       */ 
/*       */   public Boolean isIsAssemblyRequired()
/*       */   {
/*  4616 */     return this.isAssemblyRequired;
/*       */   }
/*       */ 
/*       */   public void setIsAssemblyRequired(Boolean value)
/*       */   {
/*  4628 */     this.isAssemblyRequired = value;
/*       */   }
/*       */ 
/*       */   public String getItemTypeName()
/*       */   {
/*  4640 */     return this.itemTypeName;
/*       */   }
/*       */ 
/*       */   public void setItemTypeName(String value)
/*       */   {
/*  4652 */     this.itemTypeName = value;
/*       */   }
/*       */ 
/*       */   public String getIsSigned()
/*       */   {
/*  4664 */     return this.isSigned;
/*       */   }
/*       */ 
/*       */   public void setIsSigned(String value)
/*       */   {
/*  4676 */     this.isSigned = value;
/*       */   }
/*       */ 
/*       */   public String getJerseyType()
/*       */   {
/*  4688 */     return this.jerseyType;
/*       */   }
/*       */ 
/*       */   public void setJerseyType(String value)
/*       */   {
/*  4700 */     this.jerseyType = value;
/*       */   }
/*       */ 
/*       */   public String getKnifeFunction()
/*       */   {
/*  4712 */     return this.knifeFunction;
/*       */   }
/*       */ 
/*       */   public void setKnifeFunction(String value)
/*       */   {
/*  4724 */     this.knifeFunction = value;
/*       */   }
/*       */ 
/*       */   public String getLampType()
/*       */   {
/*  4736 */     return this.lampType;
/*       */   }
/*       */ 
/*       */   public void setLampType(String value)
/*       */   {
/*  4748 */     this.lampType = value;
/*       */   }
/*       */ 
/*       */   public String getLaptopCapacity()
/*       */   {
/*  4760 */     return this.laptopCapacity;
/*       */   }
/*       */ 
/*       */   public void setLaptopCapacity(String value)
/*       */   {
/*  4772 */     this.laptopCapacity = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getLashLength()
/*       */   {
/*  4784 */     return this.lashLength;
/*       */   }
/*       */ 
/*       */   public void setLashLength(LengthDimension value)
/*       */   {
/*  4796 */     this.lashLength = value;
/*       */   }
/*       */ 
/*       */   public String getLeagueName()
/*       */   {
/*  4808 */     return this.leagueName;
/*       */   }
/*       */ 
/*       */   public void setLeagueName(String value)
/*       */   {
/*  4820 */     this.leagueName = value;
/*       */   }
/*       */ 
/*       */   public String getLegStyle()
/*       */   {
/*  4832 */     return this.legStyle;
/*       */   }
/*       */ 
/*       */   public void setLegStyle(String value)
/*       */   {
/*  4844 */     this.legStyle = value;
/*       */   }
/*       */ 
/*       */   public String getLensMaterial()
/*       */   {
/*  4856 */     return this.lensMaterial;
/*       */   }
/*       */ 
/*       */   public void setLensMaterial(String value)
/*       */   {
/*  4868 */     this.lensMaterial = value;
/*       */   }
/*       */ 
/*       */   public String getLensShape()
/*       */   {
/*  4880 */     return this.lensShape;
/*       */   }
/*       */ 
/*       */   public void setLensShape(String value)
/*       */   {
/*  4892 */     this.lensShape = value;
/*       */   }
/*       */ 
/*       */   public String getLifeVestType()
/*       */   {
/*  4904 */     return this.lifeVestType;
/*       */   }
/*       */ 
/*       */   public void setLifeVestType(String value)
/*       */   {
/*  4916 */     this.lifeVestType = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getLightIntensity()
/*       */   {
/*  4928 */     return this.lightIntensity;
/*       */   }
/*       */ 
/*       */   public void setLightIntensity(BigDecimal value)
/*       */   {
/*  4940 */     this.lightIntensity = value;
/*       */   }
/*       */ 
/*       */   public String getLineWeight()
/*       */   {
/*  4952 */     return this.lineWeight;
/*       */   }
/*       */ 
/*       */   public void setLineWeight(String value)
/*       */   {
/*  4964 */     this.lineWeight = value;
/*       */   }
/*       */ 
/*       */   public String getLiningMaterial()
/*       */   {
/*  4976 */     return this.liningMaterial;
/*       */   }
/*       */ 
/*       */   public void setLiningMaterial(String value)
/*       */   {
/*  4988 */     this.liningMaterial = value;
/*       */   }
/*       */ 
/*       */   public OptionalEnergyConsumptionDimension getLithiumBatteryEnergyContent()
/*       */   {
/*  5000 */     return this.lithiumBatteryEnergyContent;
/*       */   }
/*       */ 
/*       */   public void setLithiumBatteryEnergyContent(OptionalEnergyConsumptionDimension value)
/*       */   {
/*  5012 */     this.lithiumBatteryEnergyContent = value;
/*       */   }
/*       */ 
/*       */   public String getLithiumBatteryPackaging()
/*       */   {
/*  5024 */     return this.lithiumBatteryPackaging;
/*       */   }
/*       */ 
/*       */   public void setLithiumBatteryPackaging(String value)
/*       */   {
/*  5036 */     this.lithiumBatteryPackaging = value;
/*       */   }
/*       */ 
/*       */   public OptionalVoltageDecimalDimension getLithiumBatteryVoltage()
/*       */   {
/*  5048 */     return this.lithiumBatteryVoltage;
/*       */   }
/*       */ 
/*       */   public void setLithiumBatteryVoltage(OptionalVoltageDecimalDimension value)
/*       */   {
/*  5060 */     this.lithiumBatteryVoltage = value;
/*       */   }
/*       */ 
/*       */   public OptionalWeightDimension getLithiumBatteryWeight()
/*       */   {
/*  5072 */     return this.lithiumBatteryWeight;
/*       */   }
/*       */ 
/*       */   public void setLithiumBatteryWeight(OptionalWeightDimension value)
/*       */   {
/*  5084 */     this.lithiumBatteryWeight = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getLoadCapacity()
/*       */   {
/*  5096 */     return this.loadCapacity;
/*       */   }
/*       */ 
/*       */   public void setLoadCapacity(WeightDimension value)
/*       */   {
/*  5108 */     this.loadCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getLockType()
/*       */   {
/*  5120 */     return this.lockType;
/*       */   }
/*       */ 
/*       */   public void setLockType(String value)
/*       */   {
/*  5132 */     this.lockType = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getLoudness()
/*       */   {
/*  5144 */     return this.loudness;
/*       */   }
/*       */ 
/*       */   public void setLoudness(BigDecimal value)
/*       */   {
/*  5156 */     this.loudness = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getLureWeight()
/*       */   {
/*  5168 */     return this.lureWeight;
/*       */   }
/*       */ 
/*       */   public void setLureWeight(WeightDimension value)
/*       */   {
/*  5180 */     this.lureWeight = value;
/*       */   }
/*       */ 
/*       */   public String getManufacturerDefinedQualityDescription()
/*       */   {
/*  5192 */     return this.manufacturerDefinedQualityDescription;
/*       */   }
/*       */ 
/*       */   public void setManufacturerDefinedQualityDescription(String value)
/*       */   {
/*  5204 */     this.manufacturerDefinedQualityDescription = value;
/*       */   }
/*       */ 
/*       */   public String getMartialArtsType()
/*       */   {
/*  5216 */     return this.martialArtsType;
/*       */   }
/*       */ 
/*       */   public void setMartialArtsType(String value)
/*       */   {
/*  5228 */     this.martialArtsType = value;
/*       */   }
/*       */ 
/*       */   public BootSizeDimension getMaximumCompatibleBootSize()
/*       */   {
/*  5240 */     return this.maximumCompatibleBootSize;
/*       */   }
/*       */ 
/*       */   public void setMaximumCompatibleBootSize(BootSizeDimension value)
/*       */   {
/*  5252 */     this.maximumCompatibleBootSize = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMaximumCompatibleRopeDiameter()
/*       */   {
/*  5264 */     return this.maximumCompatibleRopeDiameter;
/*       */   }
/*       */ 
/*       */   public void setMaximumCompatibleRopeDiameter(LengthDimension value)
/*       */   {
/*  5276 */     this.maximumCompatibleRopeDiameter = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMaximumHeight()
/*       */   {
/*  5288 */     return this.maximumHeight;
/*       */   }
/*       */ 
/*       */   public void setMaximumHeight(LengthDimension value)
/*       */   {
/*  5300 */     this.maximumHeight = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getMaximumInclinePercentage()
/*       */   {
/*  5312 */     return this.maximumInclinePercentage;
/*       */   }
/*       */ 
/*       */   public void setMaximumInclinePercentage(BigInteger value)
/*       */   {
/*  5324 */     this.maximumInclinePercentage = value;
/*       */   }
/*       */ 
/*       */   public String getMaximumLegSize()
/*       */   {
/*  5336 */     return this.maximumLegSize;
/*       */   }
/*       */ 
/*       */   public void setMaximumLegSize(String value)
/*       */   {
/*  5348 */     this.maximumLegSize = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getMaximumMagnification()
/*       */   {
/*  5360 */     return this.maximumMagnification;
/*       */   }
/*       */ 
/*       */   public void setMaximumMagnification(BigDecimal value)
/*       */   {
/*  5372 */     this.maximumMagnification = value;
/*       */   }
/*       */ 
/*       */   public MaximumPitchSpeed getMaximumPitchSpeed()
/*       */   {
/*  5384 */     return this.maximumPitchSpeed;
/*       */   }
/*       */ 
/*       */   public void setMaximumPitchSpeed(MaximumPitchSpeed value)
/*       */   {
/*  5396 */     this.maximumPitchSpeed = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getMaximumResistance()
/*       */   {
/*  5408 */     return this.maximumResistance;
/*       */   }
/*       */ 
/*       */   public void setMaximumResistance(WeightDimension value)
/*       */   {
/*  5420 */     this.maximumResistance = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMaximumStrideLength()
/*       */   {
/*  5432 */     return this.maximumStrideLength;
/*       */   }
/*       */ 
/*       */   public void setMaximumStrideLength(LengthDimension value)
/*       */   {
/*  5444 */     this.maximumStrideLength = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getMaximumTensionRating()
/*       */   {
/*  5456 */     return this.maximumTensionRating;
/*       */   }
/*       */ 
/*       */   public void setMaximumTensionRating(WeightDimension value)
/*       */   {
/*  5468 */     this.maximumTensionRating = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getMaximumUserWeight()
/*       */   {
/*  5480 */     return this.maximumUserWeight;
/*       */   }
/*       */ 
/*       */   public void setMaximumUserWeight(WeightDimension value)
/*       */   {
/*  5492 */     this.maximumUserWeight = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getMaximumWeight()
/*       */   {
/*  5504 */     return this.maximumWeight;
/*       */   }
/*       */ 
/*       */   public void setMaximumWeight(WeightDimension value)
/*       */   {
/*  5516 */     this.maximumWeight = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getMaxWeightRecommendation()
/*       */   {
/*  5528 */     return this.maxWeightRecommendation;
/*       */   }
/*       */ 
/*       */   public void setMaxWeightRecommendation(WeightDimension value)
/*       */   {
/*  5540 */     this.maxWeightRecommendation = value;
/*       */   }
/*       */ 
/*       */   public String getMechanicalStructure()
/*       */   {
/*  5552 */     return this.mechanicalStructure;
/*       */   }
/*       */ 
/*       */   public void setMechanicalStructure(String value)
/*       */   {
/*  5564 */     this.mechanicalStructure = value;
/*       */   }
/*       */ 
/*       */   public MemorySizeDimension getMemory()
/*       */   {
/*  5576 */     return this.memory;
/*       */   }
/*       */ 
/*       */   public void setMemory(MemorySizeDimension value)
/*       */   {
/*  5588 */     this.memory = value;
/*       */   }
/*       */ 
/*       */   public String getMfrWarrantyDescriptionLabor()
/*       */   {
/*  5600 */     return this.mfrWarrantyDescriptionLabor;
/*       */   }
/*       */ 
/*       */   public void setMfrWarrantyDescriptionLabor(String value)
/*       */   {
/*  5612 */     this.mfrWarrantyDescriptionLabor = value;
/*       */   }
/*       */ 
/*       */   public String getMfrWarrantyDescriptionParts()
/*       */   {
/*  5624 */     return this.mfrWarrantyDescriptionParts;
/*       */   }
/*       */ 
/*       */   public void setMfrWarrantyDescriptionParts(String value)
/*       */   {
/*  5636 */     this.mfrWarrantyDescriptionParts = value;
/*       */   }
/*       */ 
/*       */   public String getMfrWarrantyDescriptionType()
/*       */   {
/*  5648 */     return this.mfrWarrantyDescriptionType;
/*       */   }
/*       */ 
/*       */   public void setMfrWarrantyDescriptionType(String value)
/*       */   {
/*  5660 */     this.mfrWarrantyDescriptionType = value;
/*       */   }
/*       */ 
/*       */   public BootSizeDimension getMinimumCompatibleBootSize()
/*       */   {
/*  5672 */     return this.minimumCompatibleBootSize;
/*       */   }
/*       */ 
/*       */   public void setMinimumCompatibleBootSize(BootSizeDimension value)
/*       */   {
/*  5684 */     this.minimumCompatibleBootSize = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMinimumCompatibleRopeDiameter()
/*       */   {
/*  5696 */     return this.minimumCompatibleRopeDiameter;
/*       */   }
/*       */ 
/*       */   public void setMinimumCompatibleRopeDiameter(LengthDimension value)
/*       */   {
/*  5708 */     this.minimumCompatibleRopeDiameter = value;
/*       */   }
/*       */ 
/*       */   public String getMinimumLegSize()
/*       */   {
/*  5720 */     return this.minimumLegSize;
/*       */   }
/*       */ 
/*       */   public void setMinimumLegSize(String value)
/*       */   {
/*  5732 */     this.minimumLegSize = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getMinimumMagnification()
/*       */   {
/*  5744 */     return this.minimumMagnification;
/*       */   }
/*       */ 
/*       */   public void setMinimumMagnification(BigDecimal value)
/*       */   {
/*  5756 */     this.minimumMagnification = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getMinimumTensionRating()
/*       */   {
/*  5768 */     return this.minimumTensionRating;
/*       */   }
/*       */ 
/*       */   public void setMinimumTensionRating(WeightDimension value)
/*       */   {
/*  5780 */     this.minimumTensionRating = value;
/*       */   }
/*       */ 
/*       */   public String getMinimumTorsoFit()
/*       */   {
/*  5792 */     return this.minimumTorsoFit;
/*       */   }
/*       */ 
/*       */   public void setMinimumTorsoFit(String value)
/*       */   {
/*  5804 */     this.minimumTorsoFit = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getMinimumWeightRecommendation()
/*       */   {
/*  5816 */     return this.minimumWeightRecommendation;
/*       */   }
/*       */ 
/*       */   public void setMinimumWeightRecommendation(WeightDimension value)
/*       */   {
/*  5828 */     this.minimumWeightRecommendation = value;
/*       */   }
/*       */ 
/*       */   public String getMonitorFeatures()
/*       */   {
/*  5840 */     return this.monitorFeatures;
/*       */   }
/*       */ 
/*       */   public void setMonitorFeatures(String value)
/*       */   {
/*  5852 */     this.monitorFeatures = value;
/*       */   }
/*       */ 
/*       */   public OptionalMotorSizeDimension getMotorSize()
/*       */   {
/*  5864 */     return this.motorSize;
/*       */   }
/*       */ 
/*       */   public void setMotorSize(OptionalMotorSizeDimension value)
/*       */   {
/*  5876 */     this.motorSize = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMountainBikeProportionalFrameSize()
/*       */   {
/*  5888 */     return this.mountainBikeProportionalFrameSize;
/*       */   }
/*       */ 
/*       */   public void setMountainBikeProportionalFrameSize(LengthDimension value)
/*       */   {
/*  5900 */     this.mountainBikeProportionalFrameSize = value;
/*       */   }
/*       */ 
/*       */   public String getMountainBikeType()
/*       */   {
/*  5912 */     return this.mountainBikeType;
/*       */   }
/*       */ 
/*       */   public void setMountainBikeType(String value)
/*       */   {
/*  5924 */     this.mountainBikeType = value;
/*       */   }
/*       */ 
/*       */   public String getMountType()
/*       */   {
/*  5936 */     return this.mountType;
/*       */   }
/*       */ 
/*       */   public void setMountType(String value)
/*       */   {
/*  5948 */     this.mountType = value;
/*       */   }
/*       */ 
/*       */   public String getMovementType()
/*       */   {
/*  5960 */     return this.movementType;
/*       */   }
/*       */ 
/*       */   public void setMovementType(String value)
/*       */   {
/*  5972 */     this.movementType = value;
/*       */   }
/*       */ 
/*       */   public String getNeckStyle()
/*       */   {
/*  5984 */     return this.neckStyle;
/*       */   }
/*       */ 
/*       */   public void setNeckStyle(String value)
/*       */   {
/*  5996 */     this.neckStyle = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfBlades()
/*       */   {
/*  6008 */     return this.numberOfBlades;
/*       */   }
/*       */ 
/*       */   public void setNumberOfBlades(BigInteger value)
/*       */   {
/*  6020 */     this.numberOfBlades = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfCarriagePositions()
/*       */   {
/*  6032 */     return this.numberOfCarriagePositions;
/*       */   }
/*       */ 
/*       */   public void setNumberOfCarriagePositions(BigInteger value)
/*       */   {
/*  6044 */     this.numberOfCarriagePositions = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfDoors()
/*       */   {
/*  6056 */     return this.numberOfDoors;
/*       */   }
/*       */ 
/*       */   public void setNumberOfDoors(BigInteger value)
/*       */   {
/*  6068 */     this.numberOfDoors = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfExercises()
/*       */   {
/*  6080 */     return this.numberOfExercises;
/*       */   }
/*       */ 
/*       */   public void setNumberOfExercises(BigInteger value)
/*       */   {
/*  6092 */     this.numberOfExercises = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfFootPositions()
/*       */   {
/*  6104 */     return this.numberOfFootPositions;
/*       */   }
/*       */ 
/*       */   public void setNumberOfFootPositions(BigInteger value)
/*       */   {
/*  6116 */     this.numberOfFootPositions = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfGearLoops()
/*       */   {
/*  6128 */     return this.numberOfGearLoops;
/*       */   }
/*       */ 
/*       */   public void setNumberOfGearLoops(BigInteger value)
/*       */   {
/*  6140 */     this.numberOfGearLoops = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfHeadPositions()
/*       */   {
/*  6152 */     return this.numberOfHeadPositions;
/*       */   }
/*       */ 
/*       */   public void setNumberOfHeadPositions(BigInteger value)
/*       */   {
/*  6164 */     this.numberOfHeadPositions = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfHolds()
/*       */   {
/*  6176 */     return this.numberOfHolds;
/*       */   }
/*       */ 
/*       */   public void setNumberOfHolds(BigInteger value)
/*       */   {
/*  6188 */     this.numberOfHolds = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfHorses()
/*       */   {
/*  6200 */     return this.numberOfHorses;
/*       */   }
/*       */ 
/*       */   public void setNumberOfHorses(BigInteger value)
/*       */   {
/*  6212 */     this.numberOfHorses = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfLevels()
/*       */   {
/*  6224 */     return this.numberOfLevels;
/*       */   }
/*       */ 
/*       */   public void setNumberOfLevels(BigInteger value)
/*       */   {
/*  6236 */     this.numberOfLevels = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfLithiumIonCells()
/*       */   {
/*  6248 */     return this.numberOfLithiumIonCells;
/*       */   }
/*       */ 
/*       */   public void setNumberOfLithiumIonCells(BigInteger value)
/*       */   {
/*  6260 */     this.numberOfLithiumIonCells = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfLithiumMetalCells()
/*       */   {
/*  6272 */     return this.numberOfLithiumMetalCells;
/*       */   }
/*       */ 
/*       */   public void setNumberOfLithiumMetalCells(BigInteger value)
/*       */   {
/*  6284 */     this.numberOfLithiumMetalCells = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfPages()
/*       */   {
/*  6296 */     return this.numberOfPages;
/*       */   }
/*       */ 
/*       */   public void setNumberOfPages(BigInteger value)
/*       */   {
/*  6308 */     this.numberOfPages = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfPieces()
/*       */   {
/*  6320 */     return this.numberOfPieces;
/*       */   }
/*       */ 
/*       */   public void setNumberOfPieces(BigInteger value)
/*       */   {
/*  6332 */     this.numberOfPieces = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfPockets()
/*       */   {
/*  6344 */     return this.numberOfPockets;
/*       */   }
/*       */ 
/*       */   public void setNumberOfPockets(BigInteger value)
/*       */   {
/*  6356 */     this.numberOfPockets = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfPoles()
/*       */   {
/*  6368 */     return this.numberOfPoles;
/*       */   }
/*       */ 
/*       */   public void setNumberOfPoles(BigInteger value)
/*       */   {
/*  6380 */     this.numberOfPoles = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfPrograms()
/*       */   {
/*  6392 */     return this.numberOfPrograms;
/*       */   }
/*       */ 
/*       */   public void setNumberOfPrograms(BigInteger value)
/*       */   {
/*  6404 */     this.numberOfPrograms = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfResistanceLevels()
/*       */   {
/*  6416 */     return this.numberOfResistanceLevels;
/*       */   }
/*       */ 
/*       */   public void setNumberOfResistanceLevels(BigInteger value)
/*       */   {
/*  6428 */     this.numberOfResistanceLevels = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfSpeeds()
/*       */   {
/*  6440 */     return this.numberOfSpeeds;
/*       */   }
/*       */ 
/*       */   public void setNumberOfSpeeds(BigInteger value)
/*       */   {
/*  6452 */     this.numberOfSpeeds = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getNumberOfSprings()
/*       */   {
/*  6464 */     return this.numberOfSprings;
/*       */   }
/*       */ 
/*       */   public void setNumberOfSprings(BigInteger value)
/*       */   {
/*  6476 */     this.numberOfSprings = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getObjectiveLensSize()
/*       */   {
/*  6488 */     return this.objectiveLensSize;
/*       */   }
/*       */ 
/*       */   public void setObjectiveLensSize(LengthDimension value)
/*       */   {
/*  6500 */     this.objectiveLensSize = value;
/*       */   }
/*       */ 
/*       */   public String getOperationMode()
/*       */   {
/*  6512 */     return this.operationMode;
/*       */   }
/*       */ 
/*       */   public void setOperationMode(String value)
/*       */   {
/*  6524 */     this.operationMode = value;
/*       */   }
/*       */ 
/*       */   public String getOrientation()
/*       */   {
/*  6536 */     return this.orientation;
/*       */   }
/*       */ 
/*       */   public void setOrientation(String value)
/*       */   {
/*  6548 */     this.orientation = value;
/*       */   }
/*       */ 
/*       */   public String getOuterMaterialType()
/*       */   {
/*  6560 */     return this.outerMaterialType;
/*       */   }
/*       */ 
/*       */   public void setOuterMaterialType(String value)
/*       */   {
/*  6572 */     this.outerMaterialType = value;
/*       */   }
/*       */ 
/*       */   public String getPackedSize()
/*       */   {
/*  6584 */     return this.packedSize;
/*       */   }
/*       */ 
/*       */   public void setPackedSize(String value)
/*       */   {
/*  6596 */     this.packedSize = value;
/*       */   }
/*       */ 
/*       */   public String getPadType()
/*       */   {
/*  6608 */     return this.padType;
/*       */   }
/*       */ 
/*       */   public void setPadType(String value)
/*       */   {
/*  6620 */     this.padType = value;
/*       */   }
/*       */ 
/*       */   public String getPatternStyle()
/*       */   {
/*  6632 */     return this.patternStyle;
/*       */   }
/*       */ 
/*       */   public void setPatternStyle(String value)
/*       */   {
/*  6644 */     this.patternStyle = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getPeakHeight()
/*       */   {
/*  6656 */     return this.peakHeight;
/*       */   }
/*       */ 
/*       */   public void setPeakHeight(LengthDimension value)
/*       */   {
/*  6668 */     this.peakHeight = value;
/*       */   }
/*       */ 
/*       */   public OptionalResolutionDimension getPixels()
/*       */   {
/*  6680 */     return this.pixels;
/*       */   }
/*       */ 
/*       */   public void setPixels(OptionalResolutionDimension value)
/*       */   {
/*  6692 */     this.pixels = value;
/*       */   }
/*       */ 
/*       */   public String getPlayerName()
/*       */   {
/*  6704 */     return this.playerName;
/*       */   }
/*       */ 
/*       */   public void setPlayerName(String value)
/*       */   {
/*  6716 */     this.playerName = value;
/*       */   }
/*       */ 
/*       */   public String getPocketDescription()
/*       */   {
/*  6728 */     return this.pocketDescription;
/*       */   }
/*       */ 
/*       */   public void setPocketDescription(String value)
/*       */   {
/*  6740 */     this.pocketDescription = value;
/*       */   }
/*       */ 
/*       */   public String getPositionAccuracy()
/*       */   {
/*  6752 */     return this.positionAccuracy;
/*       */   }
/*       */ 
/*       */   public void setPositionAccuracy(String value)
/*       */   {
/*  6764 */     this.positionAccuracy = value;
/*       */   }
/*       */ 
/*       */   public String getPowerSource()
/*       */   {
/*  6776 */     return this.powerSource;
/*       */   }
/*       */ 
/*       */   public void setPowerSource(String value)
/*       */   {
/*  6788 */     this.powerSource = value;
/*       */   }
/*       */ 
/*       */   public String getPPUCount()
/*       */   {
/*  6800 */     return this.ppuCount;
/*       */   }
/*       */ 
/*       */   public void setPPUCount(String value)
/*       */   {
/*  6812 */     this.ppuCount = value;
/*       */   }
/*       */ 
/*       */   public String getPPUCountType()
/*       */   {
/*  6824 */     return this.ppuCountType;
/*       */   }
/*       */ 
/*       */   public void setPPUCountType(String value)
/*       */   {
/*  6836 */     this.ppuCountType = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getProportionalFrameSize()
/*       */   {
/*  6848 */     return this.proportionalFrameSize;
/*       */   }
/*       */ 
/*       */   public void setProportionalFrameSize(BigDecimal value)
/*       */   {
/*  6860 */     this.proportionalFrameSize = value;
/*       */   }
/*       */ 
/*       */   public String getPullType()
/*       */   {
/*  6872 */     return this.pullType;
/*       */   }
/*       */ 
/*       */   public void setPullType(String value)
/*       */   {
/*  6884 */     this.pullType = value;
/*       */   }
/*       */ 
/*       */   public StringLengthOptionalDimension getRange()
/*       */   {
/*  6896 */     return this.range;
/*       */   }
/*       */ 
/*       */   public void setRange(StringLengthOptionalDimension value)
/*       */   {
/*  6908 */     this.range = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getRearDerailleurCompatibleChainSize()
/*       */   {
/*  6920 */     return this.rearDerailleurCompatibleChainSize;
/*       */   }
/*       */ 
/*       */   public void setRearDerailleurCompatibleChainSize(LengthDimension value)
/*       */   {
/*  6932 */     this.rearDerailleurCompatibleChainSize = value;
/*       */   }
/*       */ 
/*       */   public AreaDimensionOptionalUnit getRecommendedWorkoutSpace()
/*       */   {
/*  6944 */     return this.recommendedWorkoutSpace;
/*       */   }
/*       */ 
/*       */   public void setRecommendedWorkoutSpace(AreaDimensionOptionalUnit value)
/*       */   {
/*  6956 */     this.recommendedWorkoutSpace = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getReelDiameter()
/*       */   {
/*  6968 */     return this.reelDiameter;
/*       */   }
/*       */ 
/*       */   public void setReelDiameter(LengthDimension value)
/*       */   {
/*  6980 */     this.reelDiameter = value;
/*       */   }
/*       */ 
/*       */   public String getReelModel()
/*       */   {
/*  6992 */     return this.reelModel;
/*       */   }
/*       */ 
/*       */   public void setReelModel(String value)
/*       */   {
/*  7004 */     this.reelModel = value;
/*       */   }
/*       */ 
/*       */   public String getRegion()
/*       */   {
/*  7016 */     return this.region;
/*       */   }
/*       */ 
/*       */   public void setRegion(String value)
/*       */   {
/*  7028 */     this.region = value;
/*       */   }
/*       */ 
/*       */   public OptionalResistanceDimension getResistance()
/*       */   {
/*  7040 */     return this.resistance;
/*       */   }
/*       */ 
/*       */   public void setResistance(OptionalResistanceDimension value)
/*       */   {
/*  7052 */     this.resistance = value;
/*       */   }
/*       */ 
/*       */   public String getResistanceMechanism()
/*       */   {
/*  7064 */     return this.resistanceMechanism;
/*       */   }
/*       */ 
/*       */   public void setResistanceMechanism(String value)
/*       */   {
/*  7076 */     this.resistanceMechanism = value;
/*       */   }
/*       */ 
/*       */   public String getResolution()
/*       */   {
/*  7088 */     return this.resolution;
/*       */   }
/*       */ 
/*       */   public void setResolution(String value)
/*       */   {
/*  7100 */     this.resolution = value;
/*       */   }
/*       */ 
/*       */   public String getRiseStyle()
/*       */   {
/*  7112 */     return this.riseStyle;
/*       */   }
/*       */ 
/*       */   public void setRiseStyle(String value)
/*       */   {
/*  7124 */     this.riseStyle = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getRoadBikeProportionalFrameSize()
/*       */   {
/*  7136 */     return this.roadBikeProportionalFrameSize;
/*       */   }
/*       */ 
/*       */   public void setRoadBikeProportionalFrameSize(LengthDimension value)
/*       */   {
/*  7148 */     this.roadBikeProportionalFrameSize = value;
/*       */   }
/*       */ 
/*       */   public String getRoadBikeType()
/*       */   {
/*  7160 */     return this.roadBikeType;
/*       */   }
/*       */ 
/*       */   public void setRoadBikeType(String value)
/*       */   {
/*  7172 */     this.roadBikeType = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getRodLength()
/*       */   {
/*  7184 */     return this.rodLength;
/*       */   }
/*       */ 
/*       */   public void setRodLength(LengthDimension value)
/*       */   {
/*  7196 */     this.rodLength = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getRodWeight()
/*       */   {
/*  7208 */     return this.rodWeight;
/*       */   }
/*       */ 
/*       */   public void setRodWeight(WeightDimension value)
/*       */   {
/*  7220 */     this.rodWeight = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getRoutes()
/*       */   {
/*  7232 */     return this.routes;
/*       */   }
/*       */ 
/*       */   public void setRoutes(BigInteger value)
/*       */   {
/*  7244 */     this.routes = value;
/*       */   }
/*       */ 
/*       */   public OptionalRValueDimension getRValue()
/*       */   {
/*  7256 */     return this.rValue;
/*       */   }
/*       */ 
/*       */   public void setRValue(OptionalRValueDimension value)
/*       */   {
/*  7268 */     this.rValue = value;
/*       */   }
/*       */ 
/*       */   public String getScale()
/*       */   {
/*  7280 */     return this.scale;
/*       */   }
/*       */ 
/*       */   public void setScale(String value)
/*       */   {
/*  7292 */     this.scale = value;
/*       */   }
/*       */ 
/*       */   public String getScreenColor()
/*       */   {
/*  7304 */     return this.screenColor;
/*       */   }
/*       */ 
/*       */   public void setScreenColor(String value)
/*       */   {
/*  7316 */     this.screenColor = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getScreenSize()
/*       */   {
/*  7328 */     return this.screenSize;
/*       */   }
/*       */ 
/*       */   public void setScreenSize(LengthDimension value)
/*       */   {
/*  7340 */     this.screenSize = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getSeatHeight()
/*       */   {
/*  7352 */     return this.seatHeight;
/*       */   }
/*       */ 
/*       */   public void setSeatHeight(LengthDimension value)
/*       */   {
/*  7364 */     this.seatHeight = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getSeatingCapacity()
/*       */   {
/*  7376 */     return this.seatingCapacity;
/*       */   }
/*       */ 
/*       */   public void setSeatingCapacity(BigInteger value)
/*       */   {
/*  7388 */     this.seatingCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getSellerWarrantyDescription()
/*       */   {
/*  7400 */     return this.sellerWarrantyDescription;
/*       */   }
/*       */ 
/*       */   public void setSellerWarrantyDescription(String value)
/*       */   {
/*  7412 */     this.sellerWarrantyDescription = value;
/*       */   }
/*       */ 
/*       */   public String getShellMaterial()
/*       */   {
/*  7424 */     return this.shellMaterial;
/*       */   }
/*       */ 
/*       */   public void setShellMaterial(String value)
/*       */   {
/*  7436 */     this.shellMaterial = value;
/*       */   }
/*       */ 
/*       */   public String getShirtType()
/*       */   {
/*  7448 */     return this.shirtType;
/*       */   }
/*       */ 
/*       */   public void setShirtType(String value)
/*       */   {
/*  7460 */     this.shirtType = value;
/*       */   }
/*       */ 
/*       */   public StringLengthOptionalDimension getShoeWidth()
/*       */   {
/*  7472 */     return this.shoeWidth;
/*       */   }
/*       */ 
/*       */   public void setShoeWidth(StringLengthOptionalDimension value)
/*       */   {
/*  7484 */     this.shoeWidth = value;
/*       */   }
/*       */ 
/*       */   public String getSizeMap()
/*       */   {
/*  7496 */     return this.sizeMap;
/*       */   }
/*       */ 
/*       */   public void setSizeMap(String value)
/*       */   {
/*  7508 */     this.sizeMap = value;
/*       */   }
/*       */ 
/*       */   public String getSkillLevel()
/*       */   {
/*  7520 */     return this.skillLevel;
/*       */   }
/*       */ 
/*       */   public void setSkillLevel(String value)
/*       */   {
/*  7532 */     this.skillLevel = value;
/*       */   }
/*       */ 
/*       */   public String getSkiStyle()
/*       */   {
/*  7544 */     return this.skiStyle;
/*       */   }
/*       */ 
/*       */   public void setSkiStyle(String value)
/*       */   {
/*  7556 */     this.skiStyle = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getSleepingCapacity()
/*       */   {
/*  7568 */     return this.sleepingCapacity;
/*       */   }
/*       */ 
/*       */   public void setSleepingCapacity(BigInteger value)
/*       */   {
/*  7580 */     this.sleepingCapacity = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getSleeveLength()
/*       */   {
/*  7592 */     return this.sleeveLength;
/*       */   }
/*       */ 
/*       */   public void setSleeveLength(LengthDimension value)
/*       */   {
/*  7604 */     this.sleeveLength = value;
/*       */   }
/*       */ 
/*       */   public String getSleeveType()
/*       */   {
/*  7616 */     return this.sleeveType;
/*       */   }
/*       */ 
/*       */   public void setSleeveType(String value)
/*       */   {
/*  7628 */     this.sleeveType = value;
/*       */   }
/*       */ 
/*       */   public String getSnowboardStyle()
/*       */   {
/*  7640 */     return this.snowboardStyle;
/*       */   }
/*       */ 
/*       */   public void setSnowboardStyle(String value)
/*       */   {
/*  7652 */     this.snowboardStyle = value;
/*       */   }
/*       */ 
/*       */   public String getSockHeight()
/*       */   {
/*  7664 */     return this.sockHeight;
/*       */   }
/*       */ 
/*       */   public void setSockHeight(String value)
/*       */   {
/*  7676 */     this.sockHeight = value;
/*       */   }
/*       */ 
/*       */   public String getSockStyle()
/*       */   {
/*  7688 */     return this.sockStyle;
/*       */   }
/*       */ 
/*       */   public void setSockStyle(String value)
/*       */   {
/*  7700 */     this.sockStyle = value;
/*       */   }
/*       */ 
/*       */   public String getSonarType()
/*       */   {
/*  7712 */     return this.sonarType;
/*       */   }
/*       */ 
/*       */   public void setSonarType(String value)
/*       */   {
/*  7724 */     this.sonarType = value;
/*       */   }
/*       */ 
/*       */   public String getSpecialFeatures()
/*       */   {
/*  7736 */     return this.specialFeatures;
/*       */   }
/*       */ 
/*       */   public void setSpecialFeatures(String value)
/*       */   {
/*  7748 */     this.specialFeatures = value;
/*       */   }
/*       */ 
/*       */   public String getSpecificUsageForProduct()
/*       */   {
/*  7760 */     return this.specificUsageForProduct;
/*       */   }
/*       */ 
/*       */   public void setSpecificUsageForProduct(String value)
/*       */   {
/*  7772 */     this.specificUsageForProduct = value;
/*       */   }
/*       */ 
/*       */   public String getSpeed()
/*       */   {
/*  7784 */     return this.speed;
/*       */   }
/*       */ 
/*       */   public void setSpeed(String value)
/*       */   {
/*  7796 */     this.speed = value;
/*       */   }
/*       */ 
/*       */   public String getSpeedRating()
/*       */   {
/*  7808 */     return this.speedRating;
/*       */   }
/*       */ 
/*       */   public void setSpeedRating(String value)
/*       */   {
/*  7820 */     this.speedRating = value;
/*       */   }
/*       */ 
/*       */   public String getSport()
/*       */   {
/*  7832 */     return this.sport;
/*       */   }
/*       */ 
/*       */   public void setSport(String value)
/*       */   {
/*  7844 */     this.sport = value;
/*       */   }
/*       */ 
/*       */   public String getState()
/*       */   {
/*  7856 */     return this.state;
/*       */   }
/*       */ 
/*       */   public void setState(String value)
/*       */   {
/*  7868 */     this.state = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getStaticElongationPercentage()
/*       */   {
/*  7880 */     return this.staticElongationPercentage;
/*       */   }
/*       */ 
/*       */   public void setStaticElongationPercentage(BigDecimal value)
/*       */   {
/*  7892 */     this.staticElongationPercentage = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getStaticWeight()
/*       */   {
/*  7904 */     return this.staticWeight;
/*       */   }
/*       */ 
/*       */   public void setStaticWeight(WeightDimension value)
/*       */   {
/*  7916 */     this.staticWeight = value;
/*       */   }
/*       */ 
/*       */   public String getStrapType()
/*       */   {
/*  7928 */     return this.strapType;
/*       */   }
/*       */ 
/*       */   public void setStrapType(String value)
/*       */   {
/*  7940 */     this.strapType = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getStrength()
/*       */   {
/*  7952 */     return this.strength;
/*       */   }
/*       */ 
/*       */   public void setStrength(WeightDimension value)
/*       */   {
/*  7964 */     this.strength = value;
/*       */   }
/*       */ 
/*       */   public List<String> getStyleKeywords()
/*       */   {
/*  7990 */     if (this.styleKeywords == null) {
/*  7991 */       this.styleKeywords = new ArrayList();
/*       */     }
/*  7993 */     return this.styleKeywords;
/*       */   }
/*       */ 
/*       */   public String getSupportType()
/*       */   {
/*  8005 */     return this.supportType;
/*       */   }
/*       */ 
/*       */   public void setSupportType(String value)
/*       */   {
/*  8017 */     this.supportType = value;
/*       */   }
/*       */ 
/*       */   public String getSuspensionType()
/*       */   {
/*  8029 */     return this.suspensionType;
/*       */   }
/*       */ 
/*       */   public void setSuspensionType(String value)
/*       */   {
/*  8041 */     this.suspensionType = value;
/*       */   }
/*       */ 
/*       */   public String getTargetGender()
/*       */   {
/*  8053 */     return this.targetGender;
/*       */   }
/*       */ 
/*       */   public void setTargetGender(String value)
/*       */   {
/*  8065 */     this.targetGender = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getTargetZones()
/*       */   {
/*  8077 */     return this.targetZones;
/*       */   }
/*       */ 
/*       */   public void setTargetZones(BigInteger value)
/*       */   {
/*  8089 */     this.targetZones = value;
/*       */   }
/*       */ 
/*       */   public String getTeamName()
/*       */   {
/*  8101 */     return this.teamName;
/*       */   }
/*       */ 
/*       */   public void setTeamName(String value)
/*       */   {
/*  8113 */     this.teamName = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getTensionSupported()
/*       */   {
/*  8125 */     return this.tensionSupported;
/*       */   }
/*       */ 
/*       */   public void setTensionSupported(WeightDimension value)
/*       */   {
/*  8137 */     this.tensionSupported = value;
/*       */   }
/*       */ 
/*       */   public String getTheme()
/*       */   {
/*  8149 */     return this.theme;
/*       */   }
/*       */ 
/*       */   public void setTheme(String value)
/*       */   {
/*  8161 */     this.theme = value;
/*       */   }
/*       */ 
/*       */   public String getThreadSize()
/*       */   {
/*  8173 */     return this.threadSize;
/*       */   }
/*       */ 
/*       */   public void setThreadSize(String value)
/*       */   {
/*  8185 */     this.threadSize = value;
/*       */   }
/*       */ 
/*       */   public String getTopStyle()
/*       */   {
/*  8197 */     return this.topStyle;
/*       */   }
/*       */ 
/*       */   public void setTopStyle(String value)
/*       */   {
/*  8209 */     this.topStyle = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getTopTubeLength()
/*       */   {
/*  8221 */     return this.topTubeLength;
/*       */   }
/*       */ 
/*       */   public void setTopTubeLength(LengthDimension value)
/*       */   {
/*  8233 */     this.topTubeLength = value;
/*       */   }
/*       */ 
/*       */   public String getTrailerType()
/*       */   {
/*  8245 */     return this.trailerType;
/*       */   }
/*       */ 
/*       */   public void setTrailerType(String value)
/*       */   {
/*  8257 */     this.trailerType = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getTurnRadius()
/*       */   {
/*  8269 */     return this.turnRadius;
/*       */   }
/*       */ 
/*       */   public void setTurnRadius(LengthDimension value)
/*       */   {
/*  8281 */     this.turnRadius = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getUIAAFallRating()
/*       */   {
/*  8293 */     return this.uiaaFallRating;
/*       */   }
/*       */ 
/*       */   public void setUIAAFallRating(BigInteger value)
/*       */   {
/*  8305 */     this.uiaaFallRating = value;
/*       */   }
/*       */ 
/*       */   public String getUnderwireType()
/*       */   {
/*  8317 */     return this.underwireType;
/*       */   }
/*       */ 
/*       */   public void setUnderwireType(String value)
/*       */   {
/*  8329 */     this.underwireType = value;
/*       */   }
/*       */ 
/*       */   public String getUniformNumber()
/*       */   {
/*  8341 */     return this.uniformNumber;
/*       */   }
/*       */ 
/*       */   public void setUniformNumber(String value)
/*       */   {
/*  8353 */     this.uniformNumber = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getUsageCapacity()
/*       */   {
/*  8365 */     return this.usageCapacity;
/*       */   }
/*       */ 
/*       */   public void setUsageCapacity(WeightDimension value)
/*       */   {
/*  8377 */     this.usageCapacity = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getUVProtection()
/*       */   {
/*  8389 */     return this.uvProtection;
/*       */   }
/*       */ 
/*       */   public void setUVProtection(BigInteger value)
/*       */   {
/*  8401 */     this.uvProtection = value;
/*       */   }
/*       */ 
/*       */   public OptionalVolumeDimension getVolumeCapacityName()
/*       */   {
/*  8413 */     return this.volumeCapacityName;
/*       */   }
/*       */ 
/*       */   public void setVolumeCapacityName(OptionalVolumeDimension value)
/*       */   {
/*  8425 */     this.volumeCapacityName = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getWaistSize()
/*       */   {
/*  8437 */     return this.waistSize;
/*       */   }
/*       */ 
/*       */   public void setWaistSize(LengthDimension value)
/*       */   {
/*  8449 */     this.waistSize = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getWaistWidth()
/*       */   {
/*  8461 */     return this.waistWidth;
/*       */   }
/*       */ 
/*       */   public void setWaistWidth(LengthDimension value)
/*       */   {
/*  8473 */     this.waistWidth = value;
/*       */   }
/*       */ 
/*       */   public TemperatureRatingDimension getWarmthRating()
/*       */   {
/*  8485 */     return this.warmthRating;
/*       */   }
/*       */ 
/*       */   public void setWarmthRating(TemperatureRatingDimension value)
/*       */   {
/*  8497 */     this.warmthRating = value;
/*       */   }
/*       */ 
/*       */   public String getWarnings()
/*       */   {
/*  8509 */     return this.warnings;
/*       */   }
/*       */ 
/*       */   public void setWarnings(String value)
/*       */   {
/*  8521 */     this.warnings = value;
/*       */   }
/*       */ 
/*       */   public String getWarranty()
/*       */   {
/*  8533 */     return this.warranty;
/*       */   }
/*       */ 
/*       */   public void setWarranty(String value)
/*       */   {
/*  8545 */     this.warranty = value;
/*       */   }
/*       */ 
/*       */   public String getWaterBottleCapType()
/*       */   {
/*  8557 */     return this.waterBottleCapType;
/*       */   }
/*       */ 
/*       */   public void setWaterBottleCapType(String value)
/*       */   {
/*  8569 */     this.waterBottleCapType = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getWaterResistanceRating()
/*       */   {
/*  8581 */     return this.waterResistanceRating;
/*       */   }
/*       */ 
/*       */   public void setWaterResistanceRating(LengthDimension value)
/*       */   {
/*  8593 */     this.waterResistanceRating = value;
/*       */   }
/*       */ 
/*       */   public String getWaterType()
/*       */   {
/*  8605 */     return this.waterType;
/*       */   }
/*       */ 
/*       */   public void setWaterType(String value)
/*       */   {
/*  8617 */     this.waterType = value;
/*       */   }
/*       */ 
/*       */   public BigDecimal getWattage()
/*       */   {
/*  8629 */     return this.wattage;
/*       */   }
/*       */ 
/*       */   public void setWattage(BigDecimal value)
/*       */   {
/*  8641 */     this.wattage = value;
/*       */   }
/*       */ 
/*       */   public WattageDimension getWatts()
/*       */   {
/*  8653 */     return this.watts;
/*       */   }
/*       */ 
/*       */   public void setWatts(WattageDimension value)
/*       */   {
/*  8665 */     this.watts = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getWayPoints()
/*       */   {
/*  8677 */     return this.wayPoints;
/*       */   }
/*       */ 
/*       */   public void setWayPoints(BigInteger value)
/*       */   {
/*  8689 */     this.wayPoints = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getWeightCapacity()
/*       */   {
/*  8701 */     return this.weightCapacity;
/*       */   }
/*       */ 
/*       */   public void setWeightCapacity(WeightDimension value)
/*       */   {
/*  8713 */     this.weightCapacity = value;
/*       */   }
/*       */ 
/*       */   public String getWhatsInTheBox()
/*       */   {
/*  8725 */     return this.whatsInTheBox;
/*       */   }
/*       */ 
/*       */   public void setWhatsInTheBox(String value)
/*       */   {
/*  8737 */     this.whatsInTheBox = value;
/*       */   }
/*       */ 
/*       */   public String getWheelType()
/*       */   {
/*  8749 */     return this.wheelType;
/*       */   }
/*       */ 
/*       */   public void setWheelType(String value)
/*       */   {
/*  8761 */     this.wheelType = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getThreadPitch()
/*       */   {
/*  8773 */     return this.threadPitch;
/*       */   }
/*       */ 
/*       */   public void setThreadPitch(LengthDimension value)
/*       */   {
/*  8785 */     this.threadPitch = value;
/*       */   }
/*       */ 
/*       */   public String getDriveSystem()
/*       */   {
/*  8797 */     return this.driveSystem;
/*       */   }
/*       */ 
/*       */   public void setDriveSystem(String value)
/*       */   {
/*  8809 */     this.driveSystem = value;
/*       */   }
/*       */ 
/*       */   public String getBladeMaterialType()
/*       */   {
/*  8821 */     return this.bladeMaterialType;
/*       */   }
/*       */ 
/*       */   public void setBladeMaterialType(String value)
/*       */   {
/*  8833 */     this.bladeMaterialType = value;
/*       */   }
/*       */ 
/*       */   public BigInteger getSportsNumberOfPockets()
/*       */   {
/*  8845 */     return this.sportsNumberOfPockets;
/*       */   }
/*       */ 
/*       */   public void setSportsNumberOfPockets(BigInteger value)
/*       */   {
/*  8857 */     this.sportsNumberOfPockets = value;
/*       */   }
/*       */ 
/*       */   public WeightDimension getWorkingLoadLimit()
/*       */   {
/*  8869 */     return this.workingLoadLimit;
/*       */   }
/*       */ 
/*       */   public void setWorkingLoadLimit(WeightDimension value)
/*       */   {
/*  8881 */     this.workingLoadLimit = value;
/*       */   }
/*       */ 
/*       */   public String getWatchMovementType()
/*       */   {
/*  8893 */     return this.watchMovementType;
/*       */   }
/*       */ 
/*       */   public void setWatchMovementType(String value)
/*       */   {
/*  8905 */     this.watchMovementType = value;
/*       */   }
/*       */ 
/*       */   public VolumeDimension getTankVolume()
/*       */   {
/*  8917 */     return this.tankVolume;
/*       */   }
/*       */ 
/*       */   public void setTankVolume(VolumeDimension value)
/*       */   {
/*  8929 */     this.tankVolume = value;
/*       */   }
/*       */ 
/*       */   public String getPowerRating()
/*       */   {
/*  8941 */     return this.powerRating;
/*       */   }
/*       */ 
/*       */   public void setPowerRating(String value)
/*       */   {
/*  8953 */     this.powerRating = value;
/*       */   }
/*       */ 
/*       */   public String getPatternType()
/*       */   {
/*  8965 */     return this.patternType;
/*       */   }
/*       */ 
/*       */   public void setPatternType(String value)
/*       */   {
/*  8977 */     this.patternType = value;
/*       */   }
/*       */ 
/*       */   public OutputPowerDimension getOutputPower()
/*       */   {
/*  8989 */     return this.outputPower;
/*       */   }
/*       */ 
/*       */   public void setOutputPower(OutputPowerDimension value)
/*       */   {
/*  9001 */     this.outputPower = value;
/*       */   }
/*       */ 
/*       */   public OpticalPowerDimension getOpticalPower()
/*       */   {
/*  9013 */     return this.opticalPower;
/*       */   }
/*       */ 
/*       */   public void setOpticalPower(OpticalPowerDimension value)
/*       */   {
/*  9025 */     this.opticalPower = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getMinimumHeightRecommendation()
/*       */   {
/*  9037 */     return this.minimumHeightRecommendation;
/*       */   }
/*       */ 
/*       */   public void setMinimumHeightRecommendation(LengthDimension value)
/*       */   {
/*  9049 */     this.minimumHeightRecommendation = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getItemDiameter()
/*       */   {
/*  9061 */     return this.itemDiameter;
/*       */   }
/*       */ 
/*       */   public void setItemDiameter(LengthDimension value)
/*       */   {
/*  9073 */     this.itemDiameter = value;
/*       */   }
/*       */ 
/*       */   public String getAgeRangeDescription()
/*       */   {
/*  9085 */     return this.ageRangeDescription;
/*       */   }
/*       */ 
/*       */   public void setAgeRangeDescription(String value)
/*       */   {
/*  9097 */     this.ageRangeDescription = value;
/*       */   }
/*       */ 
/*       */   public String getCollectionName()
/*       */   {
/*  9109 */     return this.collectionName;
/*       */   }
/*       */ 
/*       */   public void setCollectionName(String value)
/*       */   {
/*  9121 */     this.collectionName = value;
/*       */   }
/*       */ 
/*       */   public LengthDimension getBandSizeNumber()
/*       */   {
/*  9133 */     return this.bandSizeNumber;
/*       */   }
/*       */ 
/*       */   public void setBandSizeNumber(LengthDimension value)
/*       */   {
/*  9145 */     this.bandSizeNumber = value;
/*       */   }
/*       */ 
/*       */   public BatteryCellTypeValues getBatteryCellComposition()
/*       */   {
/*  9157 */     return this.batteryCellComposition;
/*       */   }
/*       */ 
/*       */   public void setBatteryCellComposition(BatteryCellTypeValues value)
/*       */   {
/*  9169 */     this.batteryCellComposition = value;
/*       */   }
/*       */ 
/*       */   public String getBatteryDescription()
/*       */   {
/*  9181 */     return this.batteryDescription;
/*       */   }
/*       */ 
/*       */   public void setBatteryDescription(String value)
/*       */   {
/*  9193 */     this.batteryDescription = value;
/*       */   }
/*       */ 
/*       */   public String getBatteryFormFactor()
/*       */   {
/*  9205 */     return this.batteryFormFactor;
/*       */   }
/*       */ 
/*       */   public void setBatteryFormFactor(String value)
/*       */   {
/*  9217 */     this.batteryFormFactor = value;
/*       */   }
/*       */ 
/*       */   @XmlAccessorType(XmlAccessType.FIELD)
/*       */   @XmlType(name="", propOrder={"parentage", "variationTheme", "ageGenderCategory", "amperage", "bikeRimSize", "bootSize", "bounce", "calfSize", "caliber", "capacity", "club", "color", "curvature", "customerPackageType", "department", "design", "diameter", "divingHoodThickness", "fencingPommelType", "flavor", "golfFlex", "golfLoft", "gripSize", "gripType", "hand", "headSize", "height", "irons", "itemThickness", "length", "lensColor", "lieAngle", "lineCapacity", "lineWeight", "material", "model", "numberOfItems", "occupancy", "quantity", "rounds", "shaftLength", "shaftMaterial", "shaftType", "shape", "size", "style", "temperatureRating", "tensionLevel", "volume", "wattage", "weight", "weightSupported", "wheelSize", "width", "wood"})
/*       */   public static class VariationData
/*       */   {
/*       */ 
/*       */     @XmlElement(name="Parentage")
/*       */     protected String parentage;
/*       */ 
/*       */     @XmlElement(name="VariationTheme")
/*       */     protected String variationTheme;
/*       */ 
/*       */     @XmlElement(name="AgeGenderCategory")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String ageGenderCategory;
/*       */ 
/*       */     @XmlElement(name="Amperage")
/*       */     protected AmperageDimension amperage;
/*       */ 
/*       */     @XmlElement(name="BikeRimSize")
/*       */     protected LengthDimension bikeRimSize;
/*       */ 
/*       */     @XmlElement(name="BootSize")
/*       */     protected BigDecimal bootSize;
/*       */ 
/*       */     @XmlElement(name="Bounce")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String bounce;
/*       */ 
/*       */     @XmlElement(name="CalfSize")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String calfSize;
/*       */ 
/*       */     @XmlElement(name="Caliber")
/*       */     protected BigDecimal caliber;
/*       */ 
/*       */     @XmlElement(name="Capacity")
/*       */     protected VolumeDimension capacity;
/*       */ 
/*       */     @XmlElement(name="Club")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String club;
/*       */ 
/*       */     @XmlElement(name="Color")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String color;
/*       */ 
/*       */     @XmlElement(name="Curvature")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String curvature;
/*       */ 
/*       */     @XmlElement(name="CustomerPackageType")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String customerPackageType;
/*       */ 
/*       */     @XmlElement(name="Department")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected List<String> department;
/*       */ 
/*       */     @XmlElement(name="Design")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String design;
/*       */ 
/*       */     @XmlElement(name="Diameter")
/*       */     protected LengthDimension diameter;
/*       */ 
/*       */     @XmlElement(name="DivingHoodThickness")
/*       */     protected LengthDimension divingHoodThickness;
/*       */ 
/*       */     @XmlElement(name="FencingPommelType")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String fencingPommelType;
/*       */ 
/*       */     @XmlElement(name="Flavor")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String flavor;
/*       */ 
/*       */     @XmlElement(name="GolfFlex")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String golfFlex;
/*       */ 
/*       */     @XmlElement(name="GolfLoft")
/*       */     protected DegreeDimension golfLoft;
/*       */ 
/*       */     @XmlElement(name="GripSize")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String gripSize;
/*       */ 
/*       */     @XmlElement(name="GripType")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String gripType;
/*       */ 
/*       */     @XmlElement(name="Hand")
/*       */     protected String hand;
/*       */ 
/*       */     @XmlElement(name="HeadSize")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String headSize;
/*       */ 
/*       */     @XmlElement(name="Height")
/*       */     protected LengthDimension height;
/*       */ 
/*       */     @XmlElement(name="Irons")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String irons;
/*       */ 
/*       */     @XmlElement(name="ItemThickness")
/*       */     protected LengthDimension itemThickness;
/*       */ 
/*       */     @XmlElement(name="Length")
/*       */     protected LengthDimension length;
/*       */ 
/*       */     @XmlElement(name="LensColor")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String lensColor;
/*       */ 
/*       */     @XmlElement(name="LieAngle")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String lieAngle;
/*       */ 
/*       */     @XmlElement(name="LineCapacity")
/*       */     protected OptionalLineCapacityDimension lineCapacity;
/*       */ 
/*       */     @XmlElement(name="LineWeight")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String lineWeight;
/*       */ 
/*       */     @XmlElement(name="Material")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String material;
/*       */ 
/*       */     @XmlElement(name="Model")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String model;
/*       */ 
/*       */     @XmlElement(name="NumberOfItems")
/*       */     @XmlSchemaType(name="positiveInteger")
/*       */     protected BigInteger numberOfItems;
/*       */ 
/*       */     @XmlElement(name="Occupancy")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String occupancy;
/*       */ 
/*       */     @XmlElement(name="Quantity")
/*       */     @XmlSchemaType(name="positiveInteger")
/*       */     protected BigInteger quantity;
/*       */ 
/*       */     @XmlElement(name="Rounds")
/*       */     protected BigInteger rounds;
/*       */ 
/*       */     @XmlElement(name="ShaftLength")
/*       */     protected LengthDimension shaftLength;
/*       */ 
/*       */     @XmlElement(name="ShaftMaterial")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String shaftMaterial;
/*       */ 
/*       */     @XmlElement(name="ShaftType")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String shaftType;
/*       */ 
/*       */     @XmlElement(name="Shape")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String shape;
/*       */ 
/*       */     @XmlElement(name="Size")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String size;
/*       */ 
/*       */     @XmlElement(name="Style")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String style;
/*       */ 
/*       */     @XmlElement(name="TemperatureRating")
/*       */     protected TemperatureRatingDimension temperatureRating;
/*       */ 
/*       */     @XmlElement(name="TensionLevel")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String tensionLevel;
/*       */ 
/*       */     @XmlElement(name="Volume")
/*       */     protected VolumeDimension volume;
/*       */ 
/*       */     @XmlElement(name="Wattage")
/*       */     protected WattageDimension wattage;
/*       */ 
/*       */     @XmlElement(name="Weight")
/*       */     protected WeightDimension weight;
/*       */ 
/*       */     @XmlElement(name="WeightSupported")
/*       */     protected WeightDimension weightSupported;
/*       */ 
/*       */     @XmlElement(name="WheelSize")
/*       */     protected LengthDimension wheelSize;
/*       */ 
/*       */     @XmlElement(name="Width")
/*       */     protected LengthDimension width;
/*       */ 
/*       */     @XmlElement(name="Wood")
/*       */     @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*       */     protected String wood;
/*       */ 
/*       */     public String getParentage()
/*       */     {
/*  9868 */       return this.parentage;
/*       */     }
/*       */ 
/*       */     public void setParentage(String value)
/*       */     {
/*  9880 */       this.parentage = value;
/*       */     }
/*       */ 
/*       */     public String getVariationTheme()
/*       */     {
/*  9892 */       return this.variationTheme;
/*       */     }
/*       */ 
/*       */     public void setVariationTheme(String value)
/*       */     {
/*  9904 */       this.variationTheme = value;
/*       */     }
/*       */ 
/*       */     public String getAgeGenderCategory()
/*       */     {
/*  9916 */       return this.ageGenderCategory;
/*       */     }
/*       */ 
/*       */     public void setAgeGenderCategory(String value)
/*       */     {
/*  9928 */       this.ageGenderCategory = value;
/*       */     }
/*       */ 
/*       */     public AmperageDimension getAmperage()
/*       */     {
/*  9940 */       return this.amperage;
/*       */     }
/*       */ 
/*       */     public void setAmperage(AmperageDimension value)
/*       */     {
/*  9952 */       this.amperage = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getBikeRimSize()
/*       */     {
/*  9964 */       return this.bikeRimSize;
/*       */     }
/*       */ 
/*       */     public void setBikeRimSize(LengthDimension value)
/*       */     {
/*  9976 */       this.bikeRimSize = value;
/*       */     }
/*       */ 
/*       */     public BigDecimal getBootSize()
/*       */     {
/*  9988 */       return this.bootSize;
/*       */     }
/*       */ 
/*       */     public void setBootSize(BigDecimal value)
/*       */     {
/* 10000 */       this.bootSize = value;
/*       */     }
/*       */ 
/*       */     public String getBounce()
/*       */     {
/* 10012 */       return this.bounce;
/*       */     }
/*       */ 
/*       */     public void setBounce(String value)
/*       */     {
/* 10024 */       this.bounce = value;
/*       */     }
/*       */ 
/*       */     public String getCalfSize()
/*       */     {
/* 10036 */       return this.calfSize;
/*       */     }
/*       */ 
/*       */     public void setCalfSize(String value)
/*       */     {
/* 10048 */       this.calfSize = value;
/*       */     }
/*       */ 
/*       */     public BigDecimal getCaliber()
/*       */     {
/* 10060 */       return this.caliber;
/*       */     }
/*       */ 
/*       */     public void setCaliber(BigDecimal value)
/*       */     {
/* 10072 */       this.caliber = value;
/*       */     }
/*       */ 
/*       */     public VolumeDimension getCapacity()
/*       */     {
/* 10084 */       return this.capacity;
/*       */     }
/*       */ 
/*       */     public void setCapacity(VolumeDimension value)
/*       */     {
/* 10096 */       this.capacity = value;
/*       */     }
/*       */ 
/*       */     public String getClub()
/*       */     {
/* 10108 */       return this.club;
/*       */     }
/*       */ 
/*       */     public void setClub(String value)
/*       */     {
/* 10120 */       this.club = value;
/*       */     }
/*       */ 
/*       */     public String getColor()
/*       */     {
/* 10132 */       return this.color;
/*       */     }
/*       */ 
/*       */     public void setColor(String value)
/*       */     {
/* 10144 */       this.color = value;
/*       */     }
/*       */ 
/*       */     public String getCurvature()
/*       */     {
/* 10156 */       return this.curvature;
/*       */     }
/*       */ 
/*       */     public void setCurvature(String value)
/*       */     {
/* 10168 */       this.curvature = value;
/*       */     }
/*       */ 
/*       */     public String getCustomerPackageType()
/*       */     {
/* 10180 */       return this.customerPackageType;
/*       */     }
/*       */ 
/*       */     public void setCustomerPackageType(String value)
/*       */     {
/* 10192 */       this.customerPackageType = value;
/*       */     }
/*       */ 
/*       */     public List<String> getDepartment()
/*       */     {
/* 10218 */       if (this.department == null) {
/* 10219 */         this.department = new ArrayList();
/*       */       }
/* 10221 */       return this.department;
/*       */     }
/*       */ 
/*       */     public String getDesign()
/*       */     {
/* 10233 */       return this.design;
/*       */     }
/*       */ 
/*       */     public void setDesign(String value)
/*       */     {
/* 10245 */       this.design = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getDiameter()
/*       */     {
/* 10257 */       return this.diameter;
/*       */     }
/*       */ 
/*       */     public void setDiameter(LengthDimension value)
/*       */     {
/* 10269 */       this.diameter = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getDivingHoodThickness()
/*       */     {
/* 10281 */       return this.divingHoodThickness;
/*       */     }
/*       */ 
/*       */     public void setDivingHoodThickness(LengthDimension value)
/*       */     {
/* 10293 */       this.divingHoodThickness = value;
/*       */     }
/*       */ 
/*       */     public String getFencingPommelType()
/*       */     {
/* 10305 */       return this.fencingPommelType;
/*       */     }
/*       */ 
/*       */     public void setFencingPommelType(String value)
/*       */     {
/* 10317 */       this.fencingPommelType = value;
/*       */     }
/*       */ 
/*       */     public String getFlavor()
/*       */     {
/* 10329 */       return this.flavor;
/*       */     }
/*       */ 
/*       */     public void setFlavor(String value)
/*       */     {
/* 10341 */       this.flavor = value;
/*       */     }
/*       */ 
/*       */     public String getGolfFlex()
/*       */     {
/* 10353 */       return this.golfFlex;
/*       */     }
/*       */ 
/*       */     public void setGolfFlex(String value)
/*       */     {
/* 10365 */       this.golfFlex = value;
/*       */     }
/*       */ 
/*       */     public DegreeDimension getGolfLoft()
/*       */     {
/* 10377 */       return this.golfLoft;
/*       */     }
/*       */ 
/*       */     public void setGolfLoft(DegreeDimension value)
/*       */     {
/* 10389 */       this.golfLoft = value;
/*       */     }
/*       */ 
/*       */     public String getGripSize()
/*       */     {
/* 10401 */       return this.gripSize;
/*       */     }
/*       */ 
/*       */     public void setGripSize(String value)
/*       */     {
/* 10413 */       this.gripSize = value;
/*       */     }
/*       */ 
/*       */     public String getGripType()
/*       */     {
/* 10425 */       return this.gripType;
/*       */     }
/*       */ 
/*       */     public void setGripType(String value)
/*       */     {
/* 10437 */       this.gripType = value;
/*       */     }
/*       */ 
/*       */     public String getHand()
/*       */     {
/* 10449 */       return this.hand;
/*       */     }
/*       */ 
/*       */     public void setHand(String value)
/*       */     {
/* 10461 */       this.hand = value;
/*       */     }
/*       */ 
/*       */     public String getHeadSize()
/*       */     {
/* 10473 */       return this.headSize;
/*       */     }
/*       */ 
/*       */     public void setHeadSize(String value)
/*       */     {
/* 10485 */       this.headSize = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getHeight()
/*       */     {
/* 10497 */       return this.height;
/*       */     }
/*       */ 
/*       */     public void setHeight(LengthDimension value)
/*       */     {
/* 10509 */       this.height = value;
/*       */     }
/*       */ 
/*       */     public String getIrons()
/*       */     {
/* 10521 */       return this.irons;
/*       */     }
/*       */ 
/*       */     public void setIrons(String value)
/*       */     {
/* 10533 */       this.irons = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getItemThickness()
/*       */     {
/* 10545 */       return this.itemThickness;
/*       */     }
/*       */ 
/*       */     public void setItemThickness(LengthDimension value)
/*       */     {
/* 10557 */       this.itemThickness = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getLength()
/*       */     {
/* 10569 */       return this.length;
/*       */     }
/*       */ 
/*       */     public void setLength(LengthDimension value)
/*       */     {
/* 10581 */       this.length = value;
/*       */     }
/*       */ 
/*       */     public String getLensColor()
/*       */     {
/* 10593 */       return this.lensColor;
/*       */     }
/*       */ 
/*       */     public void setLensColor(String value)
/*       */     {
/* 10605 */       this.lensColor = value;
/*       */     }
/*       */ 
/*       */     public String getLieAngle()
/*       */     {
/* 10617 */       return this.lieAngle;
/*       */     }
/*       */ 
/*       */     public void setLieAngle(String value)
/*       */     {
/* 10629 */       this.lieAngle = value;
/*       */     }
/*       */ 
/*       */     public OptionalLineCapacityDimension getLineCapacity()
/*       */     {
/* 10641 */       return this.lineCapacity;
/*       */     }
/*       */ 
/*       */     public void setLineCapacity(OptionalLineCapacityDimension value)
/*       */     {
/* 10653 */       this.lineCapacity = value;
/*       */     }
/*       */ 
/*       */     public String getLineWeight()
/*       */     {
/* 10665 */       return this.lineWeight;
/*       */     }
/*       */ 
/*       */     public void setLineWeight(String value)
/*       */     {
/* 10677 */       this.lineWeight = value;
/*       */     }
/*       */ 
/*       */     public String getMaterial()
/*       */     {
/* 10689 */       return this.material;
/*       */     }
/*       */ 
/*       */     public void setMaterial(String value)
/*       */     {
/* 10701 */       this.material = value;
/*       */     }
/*       */ 
/*       */     public String getModel()
/*       */     {
/* 10713 */       return this.model;
/*       */     }
/*       */ 
/*       */     public void setModel(String value)
/*       */     {
/* 10725 */       this.model = value;
/*       */     }
/*       */ 
/*       */     public BigInteger getNumberOfItems()
/*       */     {
/* 10737 */       return this.numberOfItems;
/*       */     }
/*       */ 
/*       */     public void setNumberOfItems(BigInteger value)
/*       */     {
/* 10749 */       this.numberOfItems = value;
/*       */     }
/*       */ 
/*       */     public String getOccupancy()
/*       */     {
/* 10761 */       return this.occupancy;
/*       */     }
/*       */ 
/*       */     public void setOccupancy(String value)
/*       */     {
/* 10773 */       this.occupancy = value;
/*       */     }
/*       */ 
/*       */     public BigInteger getQuantity()
/*       */     {
/* 10785 */       return this.quantity;
/*       */     }
/*       */ 
/*       */     public void setQuantity(BigInteger value)
/*       */     {
/* 10797 */       this.quantity = value;
/*       */     }
/*       */ 
/*       */     public BigInteger getRounds()
/*       */     {
/* 10809 */       return this.rounds;
/*       */     }
/*       */ 
/*       */     public void setRounds(BigInteger value)
/*       */     {
/* 10821 */       this.rounds = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getShaftLength()
/*       */     {
/* 10833 */       return this.shaftLength;
/*       */     }
/*       */ 
/*       */     public void setShaftLength(LengthDimension value)
/*       */     {
/* 10845 */       this.shaftLength = value;
/*       */     }
/*       */ 
/*       */     public String getShaftMaterial()
/*       */     {
/* 10857 */       return this.shaftMaterial;
/*       */     }
/*       */ 
/*       */     public void setShaftMaterial(String value)
/*       */     {
/* 10869 */       this.shaftMaterial = value;
/*       */     }
/*       */ 
/*       */     public String getShaftType()
/*       */     {
/* 10881 */       return this.shaftType;
/*       */     }
/*       */ 
/*       */     public void setShaftType(String value)
/*       */     {
/* 10893 */       this.shaftType = value;
/*       */     }
/*       */ 
/*       */     public String getShape()
/*       */     {
/* 10905 */       return this.shape;
/*       */     }
/*       */ 
/*       */     public void setShape(String value)
/*       */     {
/* 10917 */       this.shape = value;
/*       */     }
/*       */ 
/*       */     public String getSize()
/*       */     {
/* 10929 */       return this.size;
/*       */     }
/*       */ 
/*       */     public void setSize(String value)
/*       */     {
/* 10941 */       this.size = value;
/*       */     }
/*       */ 
/*       */     public String getStyle()
/*       */     {
/* 10953 */       return this.style;
/*       */     }
/*       */ 
/*       */     public void setStyle(String value)
/*       */     {
/* 10965 */       this.style = value;
/*       */     }
/*       */ 
/*       */     public TemperatureRatingDimension getTemperatureRating()
/*       */     {
/* 10977 */       return this.temperatureRating;
/*       */     }
/*       */ 
/*       */     public void setTemperatureRating(TemperatureRatingDimension value)
/*       */     {
/* 10989 */       this.temperatureRating = value;
/*       */     }
/*       */ 
/*       */     public String getTensionLevel()
/*       */     {
/* 11001 */       return this.tensionLevel;
/*       */     }
/*       */ 
/*       */     public void setTensionLevel(String value)
/*       */     {
/* 11013 */       this.tensionLevel = value;
/*       */     }
/*       */ 
/*       */     public VolumeDimension getVolume()
/*       */     {
/* 11025 */       return this.volume;
/*       */     }
/*       */ 
/*       */     public void setVolume(VolumeDimension value)
/*       */     {
/* 11037 */       this.volume = value;
/*       */     }
/*       */ 
/*       */     public WattageDimension getWattage()
/*       */     {
/* 11049 */       return this.wattage;
/*       */     }
/*       */ 
/*       */     public void setWattage(WattageDimension value)
/*       */     {
/* 11061 */       this.wattage = value;
/*       */     }
/*       */ 
/*       */     public WeightDimension getWeight()
/*       */     {
/* 11073 */       return this.weight;
/*       */     }
/*       */ 
/*       */     public void setWeight(WeightDimension value)
/*       */     {
/* 11085 */       this.weight = value;
/*       */     }
/*       */ 
/*       */     public WeightDimension getWeightSupported()
/*       */     {
/* 11097 */       return this.weightSupported;
/*       */     }
/*       */ 
/*       */     public void setWeightSupported(WeightDimension value)
/*       */     {
/* 11109 */       this.weightSupported = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getWheelSize()
/*       */     {
/* 11121 */       return this.wheelSize;
/*       */     }
/*       */ 
/*       */     public void setWheelSize(LengthDimension value)
/*       */     {
/* 11133 */       this.wheelSize = value;
/*       */     }
/*       */ 
/*       */     public LengthDimension getWidth()
/*       */     {
/* 11145 */       return this.width;
/*       */     }
/*       */ 
/*       */     public void setWidth(LengthDimension value)
/*       */     {
/* 11157 */       this.width = value;
/*       */     }
/*       */ 
/*       */     public String getWood()
/*       */     {
/* 11169 */       return this.wood;
/*       */     }
/*       */ 
/*       */     public void setWood(String value)
/*       */     {
/* 11181 */       this.wood = value;
/*       */     }
/*       */   }
/*       */ 
/*       */   @XmlAccessorType(XmlAccessType.FIELD)
/*       */   @XmlType(name="", propOrder={"value"})
/*       */   public static class MaximumPitchSpeed
/*       */   {
/*       */ 
/*       */     @XmlValue
/*       */     protected BigDecimal value;
/*       */ 
/*       */     @XmlAttribute(name="unitOfMeasure")
/*       */     protected String unitOfMeasure;
/*       */ 
/*       */     public BigDecimal getValue()
/*       */     {
/*  9352 */       return this.value;
/*       */     }
/*       */ 
/*       */     public void setValue(BigDecimal value)
/*       */     {
/*  9364 */       this.value = value;
/*       */     }
/*       */ 
/*       */     public String getUnitOfMeasure()
/*       */     {
/*  9376 */       return this.unitOfMeasure;
/*       */     }
/*       */ 
/*       */     public void setUnitOfMeasure(String value)
/*       */     {
/*  9388 */       this.unitOfMeasure = value;
/*       */     }
/*       */   }
/*       */ 
/*       */   @XmlAccessorType(XmlAccessType.FIELD)
/*       */   @XmlType(name="", propOrder={"value"})
/*       */   public static class EngineDisplacement
/*       */   {
/*       */ 
/*       */     @XmlValue
/*       */     protected BigDecimal value;
/*       */ 
/*       */     @XmlAttribute(name="unitOfMeasure")
/*       */     protected String unitOfMeasure;
/*       */ 
/*       */     public BigDecimal getValue()
/*       */     {
/*  9266 */       return this.value;
/*       */     }
/*       */ 
/*       */     public void setValue(BigDecimal value)
/*       */     {
/*  9278 */       this.value = value;
/*       */     }
/*       */ 
/*       */     public String getUnitOfMeasure()
/*       */     {
/*  9290 */       return this.unitOfMeasure;
/*       */     }
/*       */ 
/*       */     public void setUnitOfMeasure(String value)
/*       */     {
/*  9302 */       this.unitOfMeasure = value;
/*       */     }
/*       */   }
/*       */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Sports
 * JD-Core Version:    0.6.2
 */