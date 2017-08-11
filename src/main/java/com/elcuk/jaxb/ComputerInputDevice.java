/*     */ package com.elcuk.jaxb;
/*     */ 
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
/*     */ @XmlType(name="", propOrder={"variationData", "additionalFeatures", "builtInMicrophone", "deviceHardwareCompatability", "deviceSoftwareCompatability", "headphoneStyle", "inputDeviceDesignStyle", "inputDeviceInterfaceTechnology", "modelNumber", "noiseCanceling", "numberOfButtons", "presentationRemoteLaserColor", "presentationRemoteMemory", "presentationRemoteOperatingDistance", "primaryHeadphoneUse", "trackingMethod"})
/*     */ @XmlRootElement(name="ComputerInputDevice")
/*     */ public class ComputerInputDevice
/*     */ {
/*     */ 
/*     */   @XmlElement(name="VariationData")
/*     */   protected VariationData variationData;
/*     */ 
/*     */   @XmlElement(name="AdditionalFeatures")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String additionalFeatures;
/*     */ 
/*     */   @XmlElement(name="BuiltInMicrophone")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String builtInMicrophone;
/*     */ 
/*     */   @XmlElement(name="DeviceHardwareCompatability")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String deviceHardwareCompatability;
/*     */ 
/*     */   @XmlElement(name="DeviceSoftwareCompatability")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String deviceSoftwareCompatability;
/*     */ 
/*     */   @XmlElement(name="HeadphoneStyle")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String headphoneStyle;
/*     */ 
/*     */   @XmlElement(name="InputDeviceDesignStyle")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String inputDeviceDesignStyle;
/*     */ 
/*     */   @XmlElement(name="InputDeviceInterfaceTechnology")
/*     */   protected String inputDeviceInterfaceTechnology;
/*     */ 
/*     */   @XmlElement(name="ModelNumber")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String modelNumber;
/*     */ 
/*     */   @XmlElement(name="NoiseCanceling")
/*     */   protected String noiseCanceling;
/*     */ 
/*     */   @XmlElement(name="NumberOfButtons")
/*     */   protected BigInteger numberOfButtons;
/*     */ 
/*     */   @XmlElement(name="PresentationRemoteLaserColor")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String presentationRemoteLaserColor;
/*     */ 
/*     */   @XmlElement(name="PresentationRemoteMemory")
/*     */   protected MemorySizeFiveDigitDimension presentationRemoteMemory;
/*     */ 
/*     */   @XmlElement(name="PresentationRemoteOperatingDistance")
/*     */   protected LengthFiveDigitDimension presentationRemoteOperatingDistance;
/*     */ 
/*     */   @XmlElement(name="PrimaryHeadphoneUse")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String primaryHeadphoneUse;
/*     */ 
/*     */   @XmlElement(name="TrackingMethod")
/*     */   protected String trackingMethod;
/*     */ 
/*     */   public VariationData getVariationData()
/*     */   {
/* 121 */     return this.variationData;
/*     */   }
/*     */ 
/*     */   public void setVariationData(VariationData value)
/*     */   {
/* 133 */     this.variationData = value;
/*     */   }
/*     */ 
/*     */   public String getAdditionalFeatures()
/*     */   {
/* 145 */     return this.additionalFeatures;
/*     */   }
/*     */ 
/*     */   public void setAdditionalFeatures(String value)
/*     */   {
/* 157 */     this.additionalFeatures = value;
/*     */   }
/*     */ 
/*     */   public String getBuiltInMicrophone()
/*     */   {
/* 169 */     return this.builtInMicrophone;
/*     */   }
/*     */ 
/*     */   public void setBuiltInMicrophone(String value)
/*     */   {
/* 181 */     this.builtInMicrophone = value;
/*     */   }
/*     */ 
/*     */   public String getDeviceHardwareCompatability()
/*     */   {
/* 193 */     return this.deviceHardwareCompatability;
/*     */   }
/*     */ 
/*     */   public void setDeviceHardwareCompatability(String value)
/*     */   {
/* 205 */     this.deviceHardwareCompatability = value;
/*     */   }
/*     */ 
/*     */   public String getDeviceSoftwareCompatability()
/*     */   {
/* 217 */     return this.deviceSoftwareCompatability;
/*     */   }
/*     */ 
/*     */   public void setDeviceSoftwareCompatability(String value)
/*     */   {
/* 229 */     this.deviceSoftwareCompatability = value;
/*     */   }
/*     */ 
/*     */   public String getHeadphoneStyle()
/*     */   {
/* 241 */     return this.headphoneStyle;
/*     */   }
/*     */ 
/*     */   public void setHeadphoneStyle(String value)
/*     */   {
/* 253 */     this.headphoneStyle = value;
/*     */   }
/*     */ 
/*     */   public String getInputDeviceDesignStyle()
/*     */   {
/* 265 */     return this.inputDeviceDesignStyle;
/*     */   }
/*     */ 
/*     */   public void setInputDeviceDesignStyle(String value)
/*     */   {
/* 277 */     this.inputDeviceDesignStyle = value;
/*     */   }
/*     */ 
/*     */   public String getInputDeviceInterfaceTechnology()
/*     */   {
/* 289 */     return this.inputDeviceInterfaceTechnology;
/*     */   }
/*     */ 
/*     */   public void setInputDeviceInterfaceTechnology(String value)
/*     */   {
/* 301 */     this.inputDeviceInterfaceTechnology = value;
/*     */   }
/*     */ 
/*     */   public String getModelNumber()
/*     */   {
/* 313 */     return this.modelNumber;
/*     */   }
/*     */ 
/*     */   public void setModelNumber(String value)
/*     */   {
/* 325 */     this.modelNumber = value;
/*     */   }
/*     */ 
/*     */   public String getNoiseCanceling()
/*     */   {
/* 337 */     return this.noiseCanceling;
/*     */   }
/*     */ 
/*     */   public void setNoiseCanceling(String value)
/*     */   {
/* 349 */     this.noiseCanceling = value;
/*     */   }
/*     */ 
/*     */   public BigInteger getNumberOfButtons()
/*     */   {
/* 361 */     return this.numberOfButtons;
/*     */   }
/*     */ 
/*     */   public void setNumberOfButtons(BigInteger value)
/*     */   {
/* 373 */     this.numberOfButtons = value;
/*     */   }
/*     */ 
/*     */   public String getPresentationRemoteLaserColor()
/*     */   {
/* 385 */     return this.presentationRemoteLaserColor;
/*     */   }
/*     */ 
/*     */   public void setPresentationRemoteLaserColor(String value)
/*     */   {
/* 397 */     this.presentationRemoteLaserColor = value;
/*     */   }
/*     */ 
/*     */   public MemorySizeFiveDigitDimension getPresentationRemoteMemory()
/*     */   {
/* 409 */     return this.presentationRemoteMemory;
/*     */   }
/*     */ 
/*     */   public void setPresentationRemoteMemory(MemorySizeFiveDigitDimension value)
/*     */   {
/* 421 */     this.presentationRemoteMemory = value;
/*     */   }
/*     */ 
/*     */   public LengthFiveDigitDimension getPresentationRemoteOperatingDistance()
/*     */   {
/* 433 */     return this.presentationRemoteOperatingDistance;
/*     */   }
/*     */ 
/*     */   public void setPresentationRemoteOperatingDistance(LengthFiveDigitDimension value)
/*     */   {
/* 445 */     this.presentationRemoteOperatingDistance = value;
/*     */   }
/*     */ 
/*     */   public String getPrimaryHeadphoneUse()
/*     */   {
/* 457 */     return this.primaryHeadphoneUse;
/*     */   }
/*     */ 
/*     */   public void setPrimaryHeadphoneUse(String value)
/*     */   {
/* 469 */     this.primaryHeadphoneUse = value;
/*     */   }
/*     */ 
/*     */   public String getTrackingMethod()
/*     */   {
/* 481 */     return this.trackingMethod;
/*     */   }
/*     */ 
/*     */   public void setTrackingMethod(String value)
/*     */   {
/* 493 */     this.trackingMethod = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.ComputerInputDevice
 * JD-Core Version:    0.6.2
 */