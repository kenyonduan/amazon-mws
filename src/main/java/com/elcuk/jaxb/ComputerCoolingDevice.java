
package com.elcuk.jaxb;

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
 *         &lt;element ref="{}VariationData" minOccurs="0"/>
 *         &lt;element ref="{}AdditionalFeatures" minOccurs="0"/>
 *         &lt;element ref="{}CoolingType" minOccurs="0"/>
 *         &lt;element ref="{}CPUSocketCompatability" maxOccurs="20" minOccurs="0"/>
 *         &lt;element ref="{}FanIncluded" minOccurs="0"/>
 *         &lt;element ref="{}FanLED" minOccurs="0"/>
 *         &lt;element ref="{}FanMaximumAirflow" minOccurs="0"/>
 *         &lt;element ref="{}FanMaximumNoiseLevel" minOccurs="0"/>
 *         &lt;element ref="{}FanMaximumSpeed" minOccurs="0"/>
 *         &lt;element ref="{}FanPowerConnector" minOccurs="0"/>
 *         &lt;element ref="{}HeatsinkMaterial" minOccurs="0"/>
 *         &lt;element ref="{}LargestFanSize" minOccurs="0"/>
 *         &lt;element ref="{}ModelNumber" minOccurs="0"/>
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
    "coolingType",
    "cpuSocketCompatability",
    "fanIncluded",
    "fanLED",
    "fanMaximumAirflow",
    "fanMaximumNoiseLevel",
    "fanMaximumSpeed",
    "fanPowerConnector",
    "heatsinkMaterial",
    "largestFanSize",
    "modelNumber"
})
@XmlRootElement(name = "ComputerCoolingDevice")
public class ComputerCoolingDevice {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "AdditionalFeatures")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String additionalFeatures;
    @XmlElement(name = "CoolingType")
    protected String coolingType;
    @XmlElement(name = "CPUSocketCompatability")
    protected List<String> cpuSocketCompatability;
    @XmlElement(name = "FanIncluded")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fanIncluded;
    @XmlElement(name = "FanLED")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fanLED;
    @XmlElement(name = "FanMaximumAirflow")
    protected AirflowDimension fanMaximumAirflow;
    @XmlElement(name = "FanMaximumNoiseLevel")
    protected NoiseLevelSixDigitDimension fanMaximumNoiseLevel;
    @XmlElement(name = "FanMaximumSpeed")
    protected SpeedSixDigitDimension fanMaximumSpeed;
    @XmlElement(name = "FanPowerConnector")
    protected String fanPowerConnector;
    @XmlElement(name = "HeatsinkMaterial")
    protected String heatsinkMaterial;
    @XmlElement(name = "LargestFanSize")
    protected LengthFiveDigitDimension largestFanSize;
    @XmlElement(name = "ModelNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String modelNumber;

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
     * Gets the value of the cpuSocketCompatability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpuSocketCompatability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPUSocketCompatability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCPUSocketCompatability() {
        if (cpuSocketCompatability == null) {
            cpuSocketCompatability = new ArrayList<String>();
        }
        return this.cpuSocketCompatability;
    }

    /**
     * 获取fanIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFanIncluded() {
        return fanIncluded;
    }

    /**
     * 设置fanIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFanIncluded(BigInteger value) {
        this.fanIncluded = value;
    }

    /**
     * 获取fanLED属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFanLED() {
        return fanLED;
    }

    /**
     * 设置fanLED属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFanLED(String value) {
        this.fanLED = value;
    }

    /**
     * 获取fanMaximumAirflow属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirflowDimension }
     *     
     */
    public AirflowDimension getFanMaximumAirflow() {
        return fanMaximumAirflow;
    }

    /**
     * 设置fanMaximumAirflow属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirflowDimension }
     *     
     */
    public void setFanMaximumAirflow(AirflowDimension value) {
        this.fanMaximumAirflow = value;
    }

    /**
     * 获取fanMaximumNoiseLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NoiseLevelSixDigitDimension }
     *     
     */
    public NoiseLevelSixDigitDimension getFanMaximumNoiseLevel() {
        return fanMaximumNoiseLevel;
    }

    /**
     * 设置fanMaximumNoiseLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseLevelSixDigitDimension }
     *     
     */
    public void setFanMaximumNoiseLevel(NoiseLevelSixDigitDimension value) {
        this.fanMaximumNoiseLevel = value;
    }

    /**
     * 获取fanMaximumSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpeedSixDigitDimension }
     *     
     */
    public SpeedSixDigitDimension getFanMaximumSpeed() {
        return fanMaximumSpeed;
    }

    /**
     * 设置fanMaximumSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedSixDigitDimension }
     *     
     */
    public void setFanMaximumSpeed(SpeedSixDigitDimension value) {
        this.fanMaximumSpeed = value;
    }

    /**
     * 获取fanPowerConnector属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFanPowerConnector() {
        return fanPowerConnector;
    }

    /**
     * 设置fanPowerConnector属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFanPowerConnector(String value) {
        this.fanPowerConnector = value;
    }

    /**
     * 获取heatsinkMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatsinkMaterial() {
        return heatsinkMaterial;
    }

    /**
     * 设置heatsinkMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatsinkMaterial(String value) {
        this.heatsinkMaterial = value;
    }

    /**
     * 获取largestFanSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthFiveDigitDimension }
     *     
     */
    public LengthFiveDigitDimension getLargestFanSize() {
        return largestFanSize;
    }

    /**
     * 设置largestFanSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthFiveDigitDimension }
     *     
     */
    public void setLargestFanSize(LengthFiveDigitDimension value) {
        this.largestFanSize = value;
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

}
