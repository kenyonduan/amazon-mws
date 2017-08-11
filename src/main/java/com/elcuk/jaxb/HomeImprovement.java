
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
 *         &lt;element name="ProductType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}BuildingMaterials"/>
 *                   &lt;element ref="{}Hardware"/>
 *                   &lt;element ref="{}Electrical"/>
 *                   &lt;element ref="{}PlumbingFixtures"/>
 *                   &lt;element name="Tools" type="{}HomeImprovementTools"/>
 *                   &lt;element ref="{}OrganizersAndStorage"/>
 *                   &lt;element ref="{}MajorHomeAppliances"/>
 *                   &lt;element ref="{}SecurityElectronics"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}HICommon" minOccurs="0"/>
 *         &lt;element ref="{}Battery" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLife" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryAverageLifeStandby" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryChargeTime" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumIon" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="BatteryTypeLithiumMetal" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="CountryOfOrigin" type="{}CountryOfOriginType" minOccurs="0"/>
 *         &lt;element name="ItemDisplayArea" type="{}AreaDimension" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryEnergyContent" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryPackaging" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="batteries_contained_in_equipment"/>
 *               &lt;enumeration value="batteries_only"/>
 *               &lt;enumeration value="batteries_packed_with_equipment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LithiumBatteryVoltage" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="LithiumBatteryWeight" type="{}PositiveDimension" minOccurs="0"/>
 *         &lt;element name="MfrWarrantyDescriptionLabor" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfrWarrantyDescriptionParts" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="MfrWarrantyDescriptionType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumIonCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfLithiumMetalCells" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "hiCommon",
    "battery",
    "batteryAverageLife",
    "batteryAverageLifeStandby",
    "batteryChargeTime",
    "batteryTypeLithiumIon",
    "batteryTypeLithiumMetal",
    "countryOfOrigin",
    "itemDisplayArea",
    "lithiumBatteryEnergyContent",
    "lithiumBatteryPackaging",
    "lithiumBatteryVoltage",
    "lithiumBatteryWeight",
    "mfrWarrantyDescriptionLabor",
    "mfrWarrantyDescriptionParts",
    "mfrWarrantyDescriptionType",
    "numberOfLithiumIonCells",
    "numberOfLithiumMetalCells",
    "warnings"
})
@XmlRootElement(name = "HomeImprovement")
public class HomeImprovement {

    @XmlElement(name = "ProductType", required = true)
    protected HomeImprovement.ProductType productType;
    @XmlElement(name = "HICommon")
    protected HICommon hiCommon;
    @XmlElement(name = "Battery")
    protected Battery battery;
    @XmlElement(name = "BatteryAverageLife")
    protected BigDecimal batteryAverageLife;
    @XmlElement(name = "BatteryAverageLifeStandby")
    protected BigDecimal batteryAverageLifeStandby;
    @XmlElement(name = "BatteryChargeTime")
    protected BigDecimal batteryChargeTime;
    @XmlElement(name = "BatteryTypeLithiumIon")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumIon;
    @XmlElement(name = "BatteryTypeLithiumMetal")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger batteryTypeLithiumMetal;
    @XmlElement(name = "CountryOfOrigin")
    protected String countryOfOrigin;
    @XmlElement(name = "ItemDisplayArea")
    protected AreaDimension itemDisplayArea;
    @XmlElement(name = "LithiumBatteryEnergyContent")
    protected BigDecimal lithiumBatteryEnergyContent;
    @XmlElement(name = "LithiumBatteryPackaging")
    protected String lithiumBatteryPackaging;
    @XmlElement(name = "LithiumBatteryVoltage")
    protected BigDecimal lithiumBatteryVoltage;
    @XmlElement(name = "LithiumBatteryWeight")
    protected BigDecimal lithiumBatteryWeight;
    @XmlElement(name = "MfrWarrantyDescriptionLabor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfrWarrantyDescriptionLabor;
    @XmlElement(name = "MfrWarrantyDescriptionParts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfrWarrantyDescriptionParts;
    @XmlElement(name = "MfrWarrantyDescriptionType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String mfrWarrantyDescriptionType;
    @XmlElement(name = "NumberOfLithiumIonCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumIonCells;
    @XmlElement(name = "NumberOfLithiumMetalCells")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfLithiumMetalCells;
    @XmlElement(name = "Warnings")
    protected Object warnings;

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HomeImprovement.ProductType }
     *     
     */
    public HomeImprovement.ProductType getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HomeImprovement.ProductType }
     *     
     */
    public void setProductType(HomeImprovement.ProductType value) {
        this.productType = value;
    }

    /**
     * 获取hiCommon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HICommon }
     *     
     */
    public HICommon getHICommon() {
        return hiCommon;
    }

    /**
     * 设置hiCommon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HICommon }
     *     
     */
    public void setHICommon(HICommon value) {
        this.hiCommon = value;
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
     * 获取itemDisplayArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AreaDimension }
     *     
     */
    public AreaDimension getItemDisplayArea() {
        return itemDisplayArea;
    }

    /**
     * 设置itemDisplayArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AreaDimension }
     *     
     */
    public void setItemDisplayArea(AreaDimension value) {
        this.itemDisplayArea = value;
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
     * 获取mfrWarrantyDescriptionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfrWarrantyDescriptionType() {
        return mfrWarrantyDescriptionType;
    }

    /**
     * 设置mfrWarrantyDescriptionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfrWarrantyDescriptionType(String value) {
        this.mfrWarrantyDescriptionType = value;
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
     * 获取warnings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getWarnings() {
        return warnings;
    }

    /**
     * 设置warnings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setWarnings(Object value) {
        this.warnings = value;
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
     *         &lt;element ref="{}BuildingMaterials"/>
     *         &lt;element ref="{}Hardware"/>
     *         &lt;element ref="{}Electrical"/>
     *         &lt;element ref="{}PlumbingFixtures"/>
     *         &lt;element name="Tools" type="{}HomeImprovementTools"/>
     *         &lt;element ref="{}OrganizersAndStorage"/>
     *         &lt;element ref="{}MajorHomeAppliances"/>
     *         &lt;element ref="{}SecurityElectronics"/>
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
        "buildingMaterials",
        "hardware",
        "electrical",
        "plumbingFixtures",
        "tools",
        "organizersAndStorage",
        "majorHomeAppliances",
        "securityElectronics"
    })
    public static class ProductType {

        @XmlElement(name = "BuildingMaterials")
        protected BuildingMaterials buildingMaterials;
        @XmlElement(name = "Hardware")
        protected Hardware hardware;
        @XmlElement(name = "Electrical")
        protected Electrical electrical;
        @XmlElement(name = "PlumbingFixtures")
        protected PlumbingFixtures plumbingFixtures;
        @XmlElement(name = "Tools")
        protected HomeImprovementTools tools;
        @XmlElement(name = "OrganizersAndStorage")
        protected OrganizersAndStorage organizersAndStorage;
        @XmlElement(name = "MajorHomeAppliances")
        protected MajorHomeAppliances majorHomeAppliances;
        @XmlElement(name = "SecurityElectronics")
        protected SecurityElectronics securityElectronics;

        /**
         * 获取buildingMaterials属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BuildingMaterials }
         *     
         */
        public BuildingMaterials getBuildingMaterials() {
            return buildingMaterials;
        }

        /**
         * 设置buildingMaterials属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BuildingMaterials }
         *     
         */
        public void setBuildingMaterials(BuildingMaterials value) {
            this.buildingMaterials = value;
        }

        /**
         * 获取hardware属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Hardware }
         *     
         */
        public Hardware getHardware() {
            return hardware;
        }

        /**
         * 设置hardware属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Hardware }
         *     
         */
        public void setHardware(Hardware value) {
            this.hardware = value;
        }

        /**
         * 获取electrical属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Electrical }
         *     
         */
        public Electrical getElectrical() {
            return electrical;
        }

        /**
         * 设置electrical属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Electrical }
         *     
         */
        public void setElectrical(Electrical value) {
            this.electrical = value;
        }

        /**
         * 获取plumbingFixtures属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PlumbingFixtures }
         *     
         */
        public PlumbingFixtures getPlumbingFixtures() {
            return plumbingFixtures;
        }

        /**
         * 设置plumbingFixtures属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PlumbingFixtures }
         *     
         */
        public void setPlumbingFixtures(PlumbingFixtures value) {
            this.plumbingFixtures = value;
        }

        /**
         * 获取tools属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HomeImprovementTools }
         *     
         */
        public HomeImprovementTools getTools() {
            return tools;
        }

        /**
         * 设置tools属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HomeImprovementTools }
         *     
         */
        public void setTools(HomeImprovementTools value) {
            this.tools = value;
        }

        /**
         * 获取organizersAndStorage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OrganizersAndStorage }
         *     
         */
        public OrganizersAndStorage getOrganizersAndStorage() {
            return organizersAndStorage;
        }

        /**
         * 设置organizersAndStorage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizersAndStorage }
         *     
         */
        public void setOrganizersAndStorage(OrganizersAndStorage value) {
            this.organizersAndStorage = value;
        }

        /**
         * 获取majorHomeAppliances属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MajorHomeAppliances }
         *     
         */
        public MajorHomeAppliances getMajorHomeAppliances() {
            return majorHomeAppliances;
        }

        /**
         * 设置majorHomeAppliances属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MajorHomeAppliances }
         *     
         */
        public void setMajorHomeAppliances(MajorHomeAppliances value) {
            this.majorHomeAppliances = value;
        }

        /**
         * 获取securityElectronics属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SecurityElectronics }
         *     
         */
        public SecurityElectronics getSecurityElectronics() {
            return securityElectronics;
        }

        /**
         * 设置securityElectronics属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityElectronics }
         *     
         */
        public void setSecurityElectronics(SecurityElectronics value) {
            this.securityElectronics = value;
        }

    }

}
