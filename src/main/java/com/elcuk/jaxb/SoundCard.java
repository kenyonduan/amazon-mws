
package com.elcuk.jaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{}VariationData" minOccurs="0"/>
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}BundledSoftware" minOccurs="0"/>
 *         &lt;element ref="{}Channels" minOccurs="0"/>
 *         &lt;element ref="{}LineIn" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
 *         &lt;element ref="{}OpticalIn" minOccurs="0"/>
 *         &lt;element ref="{}OpticalOut" minOccurs="0"/>
 *         &lt;element ref="{}SampleRate" minOccurs="0"/>
 *         &lt;element ref="{}SoundCardInterface" minOccurs="0"/>
 *         &lt;element ref="{}SoundCardMinSystemRequirements" minOccurs="0"/>
 *         &lt;element ref="{}SpeakerOut" minOccurs="0"/>
 *         &lt;element ref="{}Voltage" minOccurs="0"/>
 *         &lt;element ref="{}Wattage" minOccurs="0"/>
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
    "additionalFeatures",
    "bundledSoftware",
    "channels",
    "lineIn",
    "modelNumber",
    "opticalIn",
    "opticalOut",
    "sampleRate",
    "soundCardInterface",
    "soundCardMinSystemRequirements",
    "speakerOut",
    "voltage",
    "wattage"
})
@XmlRootElement(name = "SoundCard")
public class SoundCard {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "BundledSoftware")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bundledSoftware;
    @XmlElement(name = "Channels")
    protected BigDecimal channels;
    @XmlElement(name = "LineIn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lineIn;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;
    @XmlElement(name = "OpticalIn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalIn;
    @XmlElement(name = "OpticalOut")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String opticalOut;
    @XmlElement(name = "SampleRate")
    protected FrequencyThreeDigitIntegerDimension sampleRate;
    @XmlElement(name = "SoundCardInterface")
    @XmlSchemaType(name = "string")
    protected SoundCardInterfaceTypeValues soundCardInterface;
    @XmlElement(name = "SoundCardMinSystemRequirements")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String soundCardMinSystemRequirements;
    @XmlElement(name = "SpeakerOut")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String speakerOut;
    @XmlElement(name = "Voltage")
    protected BigDecimal voltage;
    @XmlElement(name = "Wattage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wattage;

    /**
     * 获取variationData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VariationData }
     *     
     */
    public VariationData getVariationData() {
        return variationData;
    }

    /**
     * 设置variationData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VariationData }
     *     
     */
    public void setVariationData(VariationData value) {
        this.variationData = value;
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
     * 获取bundledSoftware属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundledSoftware() {
        return bundledSoftware;
    }

    /**
     * 设置bundledSoftware属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundledSoftware(String value) {
        this.bundledSoftware = value;
    }

    /**
     * 获取channels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChannels() {
        return channels;
    }

    /**
     * 设置channels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChannels(BigDecimal value) {
        this.channels = value;
    }

    /**
     * 获取lineIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineIn() {
        return lineIn;
    }

    /**
     * 设置lineIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineIn(String value) {
        this.lineIn = value;
    }

    /**
     * 获取modelNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * 设置modelNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * 获取opticalIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalIn() {
        return opticalIn;
    }

    /**
     * 设置opticalIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalIn(String value) {
        this.opticalIn = value;
    }

    /**
     * 获取opticalOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalOut() {
        return opticalOut;
    }

    /**
     * 设置opticalOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalOut(String value) {
        this.opticalOut = value;
    }

    /**
     * 获取sampleRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FrequencyThreeDigitIntegerDimension }
     *     
     */
    public FrequencyThreeDigitIntegerDimension getSampleRate() {
        return sampleRate;
    }

    /**
     * 设置sampleRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyThreeDigitIntegerDimension }
     *     
     */
    public void setSampleRate(FrequencyThreeDigitIntegerDimension value) {
        this.sampleRate = value;
    }

    /**
     * 获取soundCardInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SoundCardInterfaceTypeValues }
     *     
     */
    public SoundCardInterfaceTypeValues getSoundCardInterface() {
        return soundCardInterface;
    }

    /**
     * 设置soundCardInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SoundCardInterfaceTypeValues }
     *     
     */
    public void setSoundCardInterface(SoundCardInterfaceTypeValues value) {
        this.soundCardInterface = value;
    }

    /**
     * 获取soundCardMinSystemRequirements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoundCardMinSystemRequirements() {
        return soundCardMinSystemRequirements;
    }

    /**
     * 设置soundCardMinSystemRequirements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoundCardMinSystemRequirements(String value) {
        this.soundCardMinSystemRequirements = value;
    }

    /**
     * 获取speakerOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakerOut() {
        return speakerOut;
    }

    /**
     * 设置speakerOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakerOut(String value) {
        this.speakerOut = value;
    }

    /**
     * 获取voltage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltage() {
        return voltage;
    }

    /**
     * 设置voltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltage(BigDecimal value) {
        this.voltage = value;
    }

    /**
     * 获取wattage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWattage() {
        return wattage;
    }

    /**
     * 设置wattage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWattage(BigInteger value) {
        this.wattage = value;
    }

}
