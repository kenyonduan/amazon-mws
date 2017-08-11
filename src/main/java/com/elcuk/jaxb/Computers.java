
package com.elcuk.jaxb;

import java.math.BigDecimal;
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
 *         &lt;element name="ProductType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}CarryingCaseOrBag"/>
 *                   &lt;element ref="{}ComputerAddOn"/>
 *                   &lt;element ref="{}ComputerComponent"/>
 *                   &lt;element ref="{}ComputerCoolingDevice"/>
 *                   &lt;element ref="{}ComputerDriveOrStorage"/>
 *                   &lt;element ref="{}ComputerInputDevice"/>
 *                   &lt;element ref="{}ComputerProcessor"/>
 *                   &lt;element ref="{}ComputerSpeaker"/>
 *                   &lt;element ref="{}Computer"/>
 *                   &lt;element ref="{}FlashMemory"/>
 *                   &lt;element ref="{}InkOrToner"/>
 *                   &lt;element ref="{}Keyboards"/>
 *                   &lt;element ref="{}MemoryReader"/>
 *                   &lt;element ref="{}Monitor"/>
 *                   &lt;element ref="{}Motherboard"/>
 *                   &lt;element ref="{}NetworkingDevice"/>
 *                   &lt;element ref="{}NotebookComputer"/>
 *                   &lt;element ref="{}PersonalComputer"/>
 *                   &lt;element ref="{}Printer"/>
 *                   &lt;element ref="{}RamMemory"/>
 *                   &lt;element ref="{}Scanner"/>
 *                   &lt;element ref="{}SoundCard"/>
 *                   &lt;element ref="{}SystemCabinet"/>
 *                   &lt;element ref="{}SystemPowerDevice"/>
 *                   &lt;element ref="{}TabletComputer"/>
 *                   &lt;element ref="{}VideoCard"/>
 *                   &lt;element ref="{}VideoProjector"/>
 *                   &lt;element ref="{}Webcam"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssemblyRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLife" type="{}PositiveNonZeroDimension" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLifeStandby" type="{}PositiveNonZeroDimension" minOccurs="0"/>
 *         &lt;element name="BatteryChargeTime" type="{}PositiveNonZeroDimension" minOccurs="0"/>
 *         &lt;element name="Color" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ColorMap" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="DisplayLength" type="{}LengthDimension" minOccurs="0"/>
 *         &lt;element name="DisplayVolume" type="{}VolumeDimension" minOccurs="0"/>
 *         &lt;element name="DisplayWeight" type="{}WeightDimension" minOccurs="0"/>
 *         &lt;element name="HarmonizedCode" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="IncludedComponents" type="{}StringNotNull" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="IsPortable" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="ItemPackageQuantity" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryEnergyContent" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryPackaging" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="batteries_contained_in_equipment"/>
 *               &lt;enumeration value="batteries_only"/>
 *               &lt;enumeration value="batteries_packed_with_equipment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LithiumBatteryVoltage" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryWeight" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="ManufacturerWarrantyType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MfrWarrantyDescriptionLabor" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfrWarrantyDescriptionParts" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="PowerSource" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="RemoteIncluded" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Size" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{}LongStringNotNull" minOccurs="0"/>
 *         &lt;element name="DeliveryScheduleGroupId" type="{}LongStringNotNull" minOccurs="0"/>
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
    "productType",
    "assemblyRequired",
    "battery",
    "batteryAverageLife",
    "batteryAverageLifeStandby",
    "batteryChargeTime",
    "color",
    "colorMap",
    "countryOfOrigin",
    "displayLength",
    "displayVolume",
    "displayWeight",
    "harmonizedCode",
    "includedComponents",
    "isPortable",
    "itemPackageQuantity",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "manufacturerWarrantyType",
    "mfrWarrantyDescriptionLabor",
    "mfrWarrantyDescriptionParts",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "powerSource",
    "remoteIncluded",
    "size",
    "sellerWarrantyDescription",
    "warnings",
    "deliveryScheduleGroupId"
})
@XmlRootElement(name = "Computers")
public class Computers {

    @XmlElement(name = "ProductType", required = true)
    protected Computers.ProductType productType;
    @XmlElement(name = "AssemblyRequired")
    protected Boolean assemblyRequired;
    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "BatteryAverageLife")
    protected BigDecimal batteryAverageLife;
    @XmlElement(name = "BatteryAverageLifeStandby")
    protected BigDecimal batteryAverageLifeStandby;
    @XmlElement(name = "BatteryChargeTime")
    protected BigDecimal batteryChargeTime;
    @XmlElement(name = "Color")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String color;
    @XmlElement(name = "ColorMap")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String colorMap;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "DisplayLength")
    protected LengthDimension displayLength;
    @XmlElement(name = "DisplayVolume")
    protected VolumeDimension displayVolume;
    @XmlElement(name = "DisplayWeight")
    protected WeightDimension displayWeight;
    @XmlElement(name = "HarmonizedCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String harmonizedCode;
    @XmlElement(name = "IncludedComponents")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> includedComponents;
    @XmlElement(name = "IsPortable", type = Boolean.class)
    protected List<Boolean> isPortable;
    @XmlElement(name = "ItemPackageQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itemPackageQuantity;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lithiumBatteryWeight;
    @XmlElement(name = "ManufacturerWarrantyType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String manufacturerWarrantyType;
    @XmlElement(name = "MfrWarrantyDescriptionLabor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfrWarrantyDescriptionLabor;
    @XmlElement(name = "MfrWarrantyDescriptionParts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfrWarrantyDescriptionParts;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "PowerSource")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String powerSource;
    @XmlElement(name = "RemoteIncluded")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String remoteIncluded;
    @XmlElement(name = "Size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String size;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sellerWarrantyDescription;
    @XmlElement(name = "Warnings")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warnings;
    @XmlElement(name = "DeliveryScheduleGroupId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String deliveryScheduleGroupId;

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Computers.ProductType }
     *     
     */
    public Computers.ProductType getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Computers.ProductType }
     *     
     */
    public void setProductType(Computers.ProductType value) {
        this.productType = value;
    }

    /**
     * 获取assemblyRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssemblyRequired() {
        return assemblyRequired;
    }

    /**
     * 设置assemblyRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssemblyRequired(Boolean value) {
        this.assemblyRequired = value;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryAverageLife() {
        return batteryAverageLife;
    }

    /**
     * 设置batteryAverageLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryAverageLife(BigDecimal value) {
        this.batteryAverageLife = value;
    }

    /**
     * 获取batteryAverageLifeStandby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryAverageLifeStandby() {
        return batteryAverageLifeStandby;
    }

    /**
     * 设置batteryAverageLifeStandby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryAverageLifeStandby(BigDecimal value) {
        this.batteryAverageLifeStandby = value;
    }

    /**
     * 获取batteryChargeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBatteryChargeTime() {
        return batteryChargeTime;
    }

    /**
     * 设置batteryChargeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBatteryChargeTime(BigDecimal value) {
        this.batteryChargeTime = value;
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
     * 获取displayLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthDimension }
     *     
     */
    public LengthDimension getDisplayLength() {
        return displayLength;
    }

    /**
     * 设置displayLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthDimension }
     *     
     */
    public void setDisplayLength(LengthDimension value) {
        this.displayLength = value;
    }

    /**
     * 获取displayVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VolumeDimension }
     *     
     */
    public VolumeDimension getDisplayVolume() {
        return displayVolume;
    }

    /**
     * 设置displayVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeDimension }
     *     
     */
    public void setDisplayVolume(VolumeDimension value) {
        this.displayVolume = value;
    }

    /**
     * 获取displayWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightDimension }
     *     
     */
    public WeightDimension getDisplayWeight() {
        return displayWeight;
    }

    /**
     * 设置displayWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightDimension }
     *     
     */
    public void setDisplayWeight(WeightDimension value) {
        this.displayWeight = value;
    }

    /**
     * 获取harmonizedCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /**
     * 设置harmonizedCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedCode(String value) {
        this.harmonizedCode = value;
    }

    /**
     * Gets the value of the includedComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedComponents() {
        if (includedComponents == null) {
            includedComponents = new ArrayList<String>();
        }
        return this.includedComponents;
    }

    /**
     * Gets the value of the isPortable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isPortable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsPortable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getIsPortable() {
        if (isPortable == null) {
            isPortable = new ArrayList<Boolean>();
        }
        return this.isPortable;
    }

    /**
     * 获取itemPackageQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemPackageQuantity() {
        return itemPackageQuantity;
    }

    /**
     * 设置itemPackageQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemPackageQuantity(BigInteger value) {
        this.itemPackageQuantity = value;
    }

    /**
     * 获取lithiumBatteryEnergyContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLithiumBatteryEnergyContent() {
        return lithiumBatteryEnergyContent;
    }

    /**
     * 设置lithiumBatteryEnergyContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLithiumBatteryEnergyContent(BigInteger value) {
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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLithiumBatteryVoltage() {
        return lithiumBatteryVoltage;
    }

    /**
     * 设置lithiumBatteryVoltage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLithiumBatteryVoltage(BigInteger value) {
        this.lithiumBatteryVoltage = value;
    }

    /**
     * 获取lithiumBatteryWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLithiumBatteryWeight() {
        return lithiumBatteryWeight;
    }

    /**
     * 设置lithiumBatteryWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLithiumBatteryWeight(BigInteger value) {
        this.lithiumBatteryWeight = value;
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
     * 获取mfrWarrantyDescriptionLabor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrWarrantyDescriptionLabor() {
        return mfrWarrantyDescriptionLabor;
    }

    /**
     * 设置mfrWarrantyDescriptionLabor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrWarrantyDescriptionLabor(String value) {
        this.mfrWarrantyDescriptionLabor = value;
    }

    /**
     * 获取mfrWarrantyDescriptionParts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrWarrantyDescriptionParts() {
        return mfrWarrantyDescriptionParts;
    }

    /**
     * 设置mfrWarrantyDescriptionParts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrWarrantyDescriptionParts(String value) {
        this.mfrWarrantyDescriptionParts = value;
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
     * 获取powerSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerSource() {
        return powerSource;
    }

    /**
     * 设置powerSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerSource(String value) {
        this.powerSource = value;
    }

    /**
     * 获取remoteIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIncluded() {
        return remoteIncluded;
    }

    /**
     * 设置remoteIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIncluded(String value) {
        this.remoteIncluded = value;
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
     * 获取deliveryScheduleGroupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryScheduleGroupId() {
        return deliveryScheduleGroupId;
    }

    /**
     * 设置deliveryScheduleGroupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryScheduleGroupId(String value) {
        this.deliveryScheduleGroupId = value;
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
     *         &lt;element ref="{}CarryingCaseOrBag"/>
     *         &lt;element ref="{}ComputerAddOn"/>
     *         &lt;element ref="{}ComputerComponent"/>
     *         &lt;element ref="{}ComputerCoolingDevice"/>
     *         &lt;element ref="{}ComputerDriveOrStorage"/>
     *         &lt;element ref="{}ComputerInputDevice"/>
     *         &lt;element ref="{}ComputerProcessor"/>
     *         &lt;element ref="{}ComputerSpeaker"/>
     *         &lt;element ref="{}Computer"/>
     *         &lt;element ref="{}FlashMemory"/>
     *         &lt;element ref="{}InkOrToner"/>
     *         &lt;element ref="{}Keyboards"/>
     *         &lt;element ref="{}MemoryReader"/>
     *         &lt;element ref="{}Monitor"/>
     *         &lt;element ref="{}Motherboard"/>
     *         &lt;element ref="{}NetworkingDevice"/>
     *         &lt;element ref="{}NotebookComputer"/>
     *         &lt;element ref="{}PersonalComputer"/>
     *         &lt;element ref="{}Printer"/>
     *         &lt;element ref="{}RamMemory"/>
     *         &lt;element ref="{}Scanner"/>
     *         &lt;element ref="{}SoundCard"/>
     *         &lt;element ref="{}SystemCabinet"/>
     *         &lt;element ref="{}SystemPowerDevice"/>
     *         &lt;element ref="{}TabletComputer"/>
     *         &lt;element ref="{}VideoCard"/>
     *         &lt;element ref="{}VideoProjector"/>
     *         &lt;element ref="{}Webcam"/>
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
        "carryingCaseOrBag",
        "computerAddOn",
        "computerComponent",
        "computerCoolingDevice",
        "computerDriveOrStorage",
        "computerInputDevice",
        "computerProcessor",
        "computerSpeaker",
        "computer",
        "flashMemory",
        "inkOrToner",
        "keyboards",
        "memoryReader",
        "monitor",
        "motherboard",
        "networkingDevice",
        "notebookComputer",
        "personalComputer",
        "printer",
        "ramMemory",
        "scanner",
        "soundCard",
        "systemCabinet",
        "systemPowerDevice",
        "tabletComputer",
        "videoCard",
        "videoProjector",
        "webcam"
    })
    public static class ProductType {

        @XmlElement(name = "CarryingCaseOrBag")
        protected CarryingCaseOrBag carryingCaseOrBag;
        @XmlElement(name = "ComputerAddOn")
        protected ComputerAddOn computerAddOn;
        @XmlElement(name = "ComputerComponent")
        protected ComputerComponent computerComponent;
        @XmlElement(name = "ComputerCoolingDevice")
        protected ComputerCoolingDevice computerCoolingDevice;
        @XmlElement(name = "ComputerDriveOrStorage")
        protected ComputerDriveOrStorage computerDriveOrStorage;
        @XmlElement(name = "ComputerInputDevice")
        protected ComputerInputDevice computerInputDevice;
        @XmlElement(name = "ComputerProcessor")
        protected ComputerProcessor computerProcessor;
        @XmlElement(name = "ComputerSpeaker")
        protected ComputerSpeaker computerSpeaker;
        @XmlElement(name = "Computer")
        protected Computer computer;
        @XmlElement(name = "FlashMemory")
        protected FlashMemory flashMemory;
        @XmlElement(name = "InkOrToner")
        protected InkOrToner inkOrToner;
        @XmlElement(name = "Keyboards")
        protected Keyboards keyboards;
        @XmlElement(name = "MemoryReader")
        protected MemoryReader memoryReader;
        @XmlElement(name = "Monitor")
        protected Monitor monitor;
        @XmlElement(name = "Motherboard")
        protected Motherboard motherboard;
        @XmlElement(name = "NetworkingDevice")
        protected NetworkingDevice networkingDevice;
        @XmlElement(name = "NotebookComputer")
        protected NotebookComputer notebookComputer;
        @XmlElement(name = "PersonalComputer")
        protected PersonalComputer personalComputer;
        @XmlElement(name = "Printer")
        protected Printer printer;
        @XmlElement(name = "RamMemory")
        protected RamMemory ramMemory;
        @XmlElement(name = "Scanner")
        protected Scanner scanner;
        @XmlElement(name = "SoundCard")
        protected SoundCard soundCard;
        @XmlElement(name = "SystemCabinet")
        protected SystemCabinet systemCabinet;
        @XmlElement(name = "SystemPowerDevice")
        protected SystemPowerDevice systemPowerDevice;
        @XmlElement(name = "TabletComputer")
        protected TabletComputer tabletComputer;
        @XmlElement(name = "VideoCard")
        protected VideoCard videoCard;
        @XmlElement(name = "VideoProjector")
        protected VideoProjector videoProjector;
        @XmlElement(name = "Webcam")
        protected Webcam webcam;

        /**
         * 获取carryingCaseOrBag属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CarryingCaseOrBag }
         *     
         */
        public CarryingCaseOrBag getCarryingCaseOrBag() {
            return carryingCaseOrBag;
        }

        /**
         * 设置carryingCaseOrBag属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CarryingCaseOrBag }
         *     
         */
        public void setCarryingCaseOrBag(CarryingCaseOrBag value) {
            this.carryingCaseOrBag = value;
        }

        /**
         * 获取computerAddOn属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComputerAddOn }
         *     
         */
        public ComputerAddOn getComputerAddOn() {
            return computerAddOn;
        }

        /**
         * 设置computerAddOn属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComputerAddOn }
         *     
         */
        public void setComputerAddOn(ComputerAddOn value) {
            this.computerAddOn = value;
        }

        /**
         * 获取computerComponent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComputerComponent }
         *     
         */
        public ComputerComponent getComputerComponent() {
            return computerComponent;
        }

        /**
         * 设置computerComponent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComputerComponent }
         *     
         */
        public void setComputerComponent(ComputerComponent value) {
            this.computerComponent = value;
        }

        /**
         * 获取computerCoolingDevice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComputerCoolingDevice }
         *     
         */
        public ComputerCoolingDevice getComputerCoolingDevice() {
            return computerCoolingDevice;
        }

        /**
         * 设置computerCoolingDevice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComputerCoolingDevice }
         *     
         */
        public void setComputerCoolingDevice(ComputerCoolingDevice value) {
            this.computerCoolingDevice = value;
        }

        /**
         * 获取computerDriveOrStorage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComputerDriveOrStorage }
         *     
         */
        public ComputerDriveOrStorage getComputerDriveOrStorage() {
            return computerDriveOrStorage;
        }

        /**
         * 设置computerDriveOrStorage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComputerDriveOrStorage }
         *     
         */
        public void setComputerDriveOrStorage(ComputerDriveOrStorage value) {
            this.computerDriveOrStorage = value;
        }

        /**
         * 获取computerInputDevice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComputerInputDevice }
         *     
         */
        public ComputerInputDevice getComputerInputDevice() {
            return computerInputDevice;
        }

        /**
         * 设置computerInputDevice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComputerInputDevice }
         *     
         */
        public void setComputerInputDevice(ComputerInputDevice value) {
            this.computerInputDevice = value;
        }

        /**
         * 获取computerProcessor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComputerProcessor }
         *     
         */
        public ComputerProcessor getComputerProcessor() {
            return computerProcessor;
        }

        /**
         * 设置computerProcessor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComputerProcessor }
         *     
         */
        public void setComputerProcessor(ComputerProcessor value) {
            this.computerProcessor = value;
        }

        /**
         * 获取computerSpeaker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ComputerSpeaker }
         *     
         */
        public ComputerSpeaker getComputerSpeaker() {
            return computerSpeaker;
        }

        /**
         * 设置computerSpeaker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ComputerSpeaker }
         *     
         */
        public void setComputerSpeaker(ComputerSpeaker value) {
            this.computerSpeaker = value;
        }

        /**
         * 获取computer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Computer }
         *     
         */
        public Computer getComputer() {
            return computer;
        }

        /**
         * 设置computer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Computer }
         *     
         */
        public void setComputer(Computer value) {
            this.computer = value;
        }

        /**
         * 获取flashMemory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlashMemory }
         *     
         */
        public FlashMemory getFlashMemory() {
            return flashMemory;
        }

        /**
         * 设置flashMemory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlashMemory }
         *     
         */
        public void setFlashMemory(FlashMemory value) {
            this.flashMemory = value;
        }

        /**
         * 获取inkOrToner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link InkOrToner }
         *     
         */
        public InkOrToner getInkOrToner() {
            return inkOrToner;
        }

        /**
         * 设置inkOrToner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link InkOrToner }
         *     
         */
        public void setInkOrToner(InkOrToner value) {
            this.inkOrToner = value;
        }

        /**
         * 获取keyboards属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Keyboards }
         *     
         */
        public Keyboards getKeyboards() {
            return keyboards;
        }

        /**
         * 设置keyboards属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Keyboards }
         *     
         */
        public void setKeyboards(Keyboards value) {
            this.keyboards = value;
        }

        /**
         * 获取memoryReader属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MemoryReader }
         *     
         */
        public MemoryReader getMemoryReader() {
            return memoryReader;
        }

        /**
         * 设置memoryReader属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MemoryReader }
         *     
         */
        public void setMemoryReader(MemoryReader value) {
            this.memoryReader = value;
        }

        /**
         * 获取monitor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Monitor }
         *     
         */
        public Monitor getMonitor() {
            return monitor;
        }

        /**
         * 设置monitor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Monitor }
         *     
         */
        public void setMonitor(Monitor value) {
            this.monitor = value;
        }

        /**
         * 获取motherboard属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Motherboard }
         *     
         */
        public Motherboard getMotherboard() {
            return motherboard;
        }

        /**
         * 设置motherboard属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Motherboard }
         *     
         */
        public void setMotherboard(Motherboard value) {
            this.motherboard = value;
        }

        /**
         * 获取networkingDevice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link NetworkingDevice }
         *     
         */
        public NetworkingDevice getNetworkingDevice() {
            return networkingDevice;
        }

        /**
         * 设置networkingDevice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link NetworkingDevice }
         *     
         */
        public void setNetworkingDevice(NetworkingDevice value) {
            this.networkingDevice = value;
        }

        /**
         * 获取notebookComputer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link NotebookComputer }
         *     
         */
        public NotebookComputer getNotebookComputer() {
            return notebookComputer;
        }

        /**
         * 设置notebookComputer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link NotebookComputer }
         *     
         */
        public void setNotebookComputer(NotebookComputer value) {
            this.notebookComputer = value;
        }

        /**
         * 获取personalComputer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PersonalComputer }
         *     
         */
        public PersonalComputer getPersonalComputer() {
            return personalComputer;
        }

        /**
         * 设置personalComputer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PersonalComputer }
         *     
         */
        public void setPersonalComputer(PersonalComputer value) {
            this.personalComputer = value;
        }

        /**
         * 获取printer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Printer }
         *     
         */
        public Printer getPrinter() {
            return printer;
        }

        /**
         * 设置printer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Printer }
         *     
         */
        public void setPrinter(Printer value) {
            this.printer = value;
        }

        /**
         * 获取ramMemory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RamMemory }
         *     
         */
        public RamMemory getRamMemory() {
            return ramMemory;
        }

        /**
         * 设置ramMemory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RamMemory }
         *     
         */
        public void setRamMemory(RamMemory value) {
            this.ramMemory = value;
        }

        /**
         * 获取scanner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Scanner }
         *     
         */
        public Scanner getScanner() {
            return scanner;
        }

        /**
         * 设置scanner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Scanner }
         *     
         */
        public void setScanner(Scanner value) {
            this.scanner = value;
        }

        /**
         * 获取soundCard属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SoundCard }
         *     
         */
        public SoundCard getSoundCard() {
            return soundCard;
        }

        /**
         * 设置soundCard属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SoundCard }
         *     
         */
        public void setSoundCard(SoundCard value) {
            this.soundCard = value;
        }

        /**
         * 获取systemCabinet属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SystemCabinet }
         *     
         */
        public SystemCabinet getSystemCabinet() {
            return systemCabinet;
        }

        /**
         * 设置systemCabinet属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SystemCabinet }
         *     
         */
        public void setSystemCabinet(SystemCabinet value) {
            this.systemCabinet = value;
        }

        /**
         * 获取systemPowerDevice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SystemPowerDevice }
         *     
         */
        public SystemPowerDevice getSystemPowerDevice() {
            return systemPowerDevice;
        }

        /**
         * 设置systemPowerDevice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SystemPowerDevice }
         *     
         */
        public void setSystemPowerDevice(SystemPowerDevice value) {
            this.systemPowerDevice = value;
        }

        /**
         * 获取tabletComputer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TabletComputer }
         *     
         */
        public TabletComputer getTabletComputer() {
            return tabletComputer;
        }

        /**
         * 设置tabletComputer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TabletComputer }
         *     
         */
        public void setTabletComputer(TabletComputer value) {
            this.tabletComputer = value;
        }

        /**
         * 获取videoCard属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VideoCard }
         *     
         */
        public VideoCard getVideoCard() {
            return videoCard;
        }

        /**
         * 设置videoCard属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VideoCard }
         *     
         */
        public void setVideoCard(VideoCard value) {
            this.videoCard = value;
        }

        /**
         * 获取videoProjector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VideoProjector }
         *     
         */
        public VideoProjector getVideoProjector() {
            return videoProjector;
        }

        /**
         * 设置videoProjector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VideoProjector }
         *     
         */
        public void setVideoProjector(VideoProjector value) {
            this.videoProjector = value;
        }

        /**
         * 获取webcam属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Webcam }
         *     
         */
        public Webcam getWebcam() {
            return webcam;
        }

        /**
         * 设置webcam属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Webcam }
         *     
         */
        public void setWebcam(Webcam value) {
            this.webcam = value;
        }

    }

}
