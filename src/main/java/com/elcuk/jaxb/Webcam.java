/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"variationData", "builtInMicrophone", "cameraType", "digitalStillResolution", "imageSensor", "inputType", "maxWebcamImageResolution", "minimumSystemRequirements", "modelNumber", "networkingProtocol", "videoCallingResolution", "voltage", "wattage", "webcamVideoCaptureResolution", "wirelessStandard"})
/*     */ @XmlRootElement(name="Webcam")
/*     */ public class Webcam
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="BuiltInMicrophone")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String builtInMicrophone;
/*     */ 
/*     */   @XmlElement(name="CameraType")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String cameraType;
/*     */ 
/*     */   @XmlElement(name="DigitalStillResolution")
/*     */   protected ResolutionFiveDigitDimension digitalStillResolution;
/*     */ 
/*     */   @XmlElement(name="ImageSensor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String imageSensor;
/*     */ 
/*     */   @XmlElement(name="InputType")
/*     */   protected InputTypeValues inputType;
/*     */ 
/*     */   @XmlElement(name="MaxWebcamImageResolution")
/*     */   protected ResolutionFiveDigitDimension maxWebcamImageResolution;
/*     */ 
/*     */   @XmlElement(name="MinimumSystemRequirements")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String minimumSystemRequirements;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="NetworkingProtocol")
/*     */   protected String networkingProtocol;
/*     */ 
/*     */   @XmlElement(name="VideoCallingResolution")
/*     */   protected ResolutionFiveDigitDimension videoCallingResolution;
/*     */ 
/*     */   @XmlElement(name="Voltage")
/*     */   protected BigDecimal voltage;
/*     */ 
/*     */   @XmlElement(name="Wattage")
/*     */   protected BigInteger wattage;
/*     */ 
/*     */   @XmlElement(name="WebcamVideoCaptureResolution")
/*     */   protected ResolutionFiveDigitDimension webcamVideoCaptureResolution;
/*     */ 
/*     */   @XmlElement(name="WirelessStandard")
/*     */   protected String wirelessStandard;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 114 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 126 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getBuiltInMicrophone()
/*     */   {
/* 138 */     return this.builtInMicrophone;
/*     */   }
/*     */ 
/*     */   public void setBuiltInMicrophone(String value)
/*     */   {
/* 150 */     this.builtInMicrophone = value;
/*     */   }
/*     */ 
/*     */   public String getCameraType()
/*     */   {
/* 162 */     return this.cameraType;
/*     */   }
/*     */ 
/*     */   public void setCameraType(String value)
/*     */   {
/* 174 */     this.cameraType = value;
/*     */   }
/*     */ 
/*     */   public ResolutionFiveDigitDimension getDigitalStillResolution()
/*     */   {
/* 186 */     return this.digitalStillResolution;
/*     */   }
/*     */ 
/*     */   public void setDigitalStillResolution(ResolutionFiveDigitDimension value)
/*     */   {
/* 198 */     this.digitalStillResolution = value;
/*     */   }
/*     */ 
/*     */   public String getImageSensor()
/*     */   {
/* 210 */     return this.imageSensor;
/*     */   }
/*     */ 
/*     */   public void setImageSensor(String value)
/*     */   {
/* 222 */     this.imageSensor = value;
/*     */   }
/*     */ 
/*     */   public InputTypeValues getInputType()
/*     */   {
/* 234 */     return this.inputType;
/*     */   }
/*     */ 
/*     */   public void setInputType(InputTypeValues value)
/*     */   {
/* 246 */     this.inputType = value;
/*     */   }
/*     */ 
/*     */   public ResolutionFiveDigitDimension getMaxWebcamImageResolution()
/*     */   {
/* 258 */     return this.maxWebcamImageResolution;
/*     */   }
/*     */ 
/*     */   public void setMaxWebcamImageResolution(ResolutionFiveDigitDimension value)
/*     */   {
/* 270 */     this.maxWebcamImageResolution = value;
/*     */   }
/*     */ 
/*     */   public String getMinimumSystemRequirements()
/*     */   {
/* 282 */     return this.minimumSystemRequirements;
/*     */   }
/*     */ 
/*     */   public void setMinimumSystemRequirements(String value)
/*     */   {
/* 294 */     this.minimumSystemRequirements = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 306 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 318 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getNetworkingProtocol()
/*     */   {
/* 330 */     return this.networkingProtocol;
/*     */   }
/*     */ 
/*     */   public void setNetworkingProtocol(String value)
/*     */   {
/* 342 */     this.networkingProtocol = value;
/*     */   }
/*     */ 
/*     */   public ResolutionFiveDigitDimension getVideoCallingResolution()
/*     */   {
/* 354 */     return this.videoCallingResolution;
/*     */   }
/*     */ 
/*     */   public void setVideoCallingResolution(ResolutionFiveDigitDimension value)
/*     */   {
/* 366 */     this.videoCallingResolution = value;
/*     */   }
/*     */ 
/*     */   public BigDecimal getVoltage()
/*     */   {
/* 378 */     return this.voltage;
/*     */   }
/*     */ 
/*     */   public void setVoltage(BigDecimal value)
/*     */   {
/* 390 */     this.voltage = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getWattage()
/*     */   {
/* 402 */     return this.wattage;
/*     */   }
/*     */ 
/*     */   public void setWattage(BigInteger value)
/*     */   {
/* 414 */     this.wattage = value;
/*     */   }
/*     */ 
/*     */   public ResolutionFiveDigitDimension getWebcamVideoCaptureResolution()
/*     */   {
/* 426 */     return this.webcamVideoCaptureResolution;
/*     */   }
/*     */ 
/*     */   public void setWebcamVideoCaptureResolution(ResolutionFiveDigitDimension value)
/*     */   {
/* 438 */     this.webcamVideoCaptureResolution = value;
/*     */   }
/*     */ 
/*     */   public String getWirelessStandard()
/*     */   {
/* 450 */     return this.wirelessStandard;
/*     */   }
/*     */ 
/*     */   public void setWirelessStandard(String value)
/*     */   {
/* 462 */     this.wirelessStandard = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.Webcam
 * JD-Core Version:    0.6.2
 */