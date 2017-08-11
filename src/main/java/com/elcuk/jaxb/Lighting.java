
package com.elcuk.jaxb;

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
 *                   &lt;element ref="{}LightsAndFixtures"/>
 *                   &lt;element ref="{}LightingAccessories"/>
 *                   &lt;element ref="{}LightBulbs"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BatteryCellComposition" type="{}BatteryCellTypeValues" minOccurs="0"/>
 *         &lt;element name="ManufacturerWarrantyDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *               &lt;maxLength value="1500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ManufacturerSafetyWarning" type="{}String" minOccurs="0"/>
 *         &lt;element name="SellerWarrantyDescription" type="{}SuperLongStringNotNull" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{}String" minOccurs="0"/>
 *         &lt;element name="WeeeTaxValue" type="{}CurencyDimension" minOccurs="0"/>
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
    "batteryCellComposition",
    "manufacturerWarrantyDescription",
    "manufacturerSafetyWarning",
    "sellerWarrantyDescription",
    "warrantyType",
    "weeeTaxValue"
})
@XmlRootElement(name = "Lighting")
public class Lighting {

    @XmlElement(name = "ProductType", required = true)
    protected Lighting.ProductType productType;
    @XmlElement(name = "BatteryCellComposition")
    @XmlSchemaType(name = "string")
    protected BatteryCellTypeValues batteryCellComposition;
    @XmlElement(name = "ManufacturerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manufacturerWarrantyDescription;
    @XmlElement(name = "ManufacturerSafetyWarning")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String manufacturerSafetyWarning;
    @XmlElement(name = "SellerWarrantyDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sellerWarrantyDescription;
    @XmlElement(name = "WarrantyType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String warrantyType;
    @XmlElement(name = "WeeeTaxValue")
    protected CurencyDimension weeeTaxValue;

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Lighting.ProductType }
     *     
     */
    public Lighting.ProductType getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Lighting.ProductType }
     *     
     */
    public void setProductType(Lighting.ProductType value) {
        this.productType = value;
    }

    /**
     * 获取batteryCellComposition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public BatteryCellTypeValues getBatteryCellComposition() {
        return batteryCellComposition;
    }

    /**
     * 设置batteryCellComposition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatteryCellTypeValues }
     *     
     */
    public void setBatteryCellComposition(BatteryCellTypeValues value) {
        this.batteryCellComposition = value;
    }

    /**
     * 获取manufacturerWarrantyDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerWarrantyDescription() {
        return manufacturerWarrantyDescription;
    }

    /**
     * 设置manufacturerWarrantyDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerWarrantyDescription(String value) {
        this.manufacturerWarrantyDescription = value;
    }

    /**
     * 获取manufacturerSafetyWarning属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerSafetyWarning() {
        return manufacturerSafetyWarning;
    }

    /**
     * 设置manufacturerSafetyWarning属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerSafetyWarning(String value) {
        this.manufacturerSafetyWarning = value;
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
     * 获取warrantyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyType() {
        return warrantyType;
    }

    /**
     * 设置warrantyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyType(String value) {
        this.warrantyType = value;
    }

    /**
     * 获取weeeTaxValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurencyDimension }
     *     
     */
    public CurencyDimension getWeeeTaxValue() {
        return weeeTaxValue;
    }

    /**
     * 设置weeeTaxValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurencyDimension }
     *     
     */
    public void setWeeeTaxValue(CurencyDimension value) {
        this.weeeTaxValue = value;
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
     *         &lt;element ref="{}LightsAndFixtures"/>
     *         &lt;element ref="{}LightingAccessories"/>
     *         &lt;element ref="{}LightBulbs"/>
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
        "lightsAndFixtures",
        "lightingAccessories",
        "lightBulbs"
    })
    public static class ProductType {

        @XmlElement(name = "LightsAndFixtures")
        protected LightsAndFixtures lightsAndFixtures;
        @XmlElement(name = "LightingAccessories")
        protected LightingAccessories lightingAccessories;
        @XmlElement(name = "LightBulbs")
        protected LightBulbs lightBulbs;

        /**
         * 获取lightsAndFixtures属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LightsAndFixtures }
         *     
         */
        public LightsAndFixtures getLightsAndFixtures() {
            return lightsAndFixtures;
        }

        /**
         * 设置lightsAndFixtures属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LightsAndFixtures }
         *     
         */
        public void setLightsAndFixtures(LightsAndFixtures value) {
            this.lightsAndFixtures = value;
        }

        /**
         * 获取lightingAccessories属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LightingAccessories }
         *     
         */
        public LightingAccessories getLightingAccessories() {
            return lightingAccessories;
        }

        /**
         * 设置lightingAccessories属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LightingAccessories }
         *     
         */
        public void setLightingAccessories(LightingAccessories value) {
            this.lightingAccessories = value;
        }

        /**
         * 获取lightBulbs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LightBulbs }
         *     
         */
        public LightBulbs getLightBulbs() {
            return lightBulbs;
        }

        /**
         * 设置lightBulbs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LightBulbs }
         *     
         */
        public void setLightBulbs(LightBulbs value) {
            this.lightBulbs = value;
        }

    }

}
