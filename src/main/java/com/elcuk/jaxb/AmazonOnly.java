
package com.elcuk.jaxb;

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
 *         &lt;element name="Tier" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="PurchasingCategory" type="{}StringNotNull"/>
 *         &lt;element name="PurchasingSubCategory" type="{}StringNotNull"/>
 *         &lt;element name="PackagingType" type="{}StringNotNull"/>
 *         &lt;element name="UnderlyingAvailability">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="backordered"/>
 *               &lt;enumeration value="manufacturer-out-of-stock"/>
 *               &lt;enumeration value="pre-ordered"/>
 *               &lt;enumeration value="2-3-days"/>
 *               &lt;enumeration value="1-2-weeks"/>
 *               &lt;enumeration value="4-6-weeks"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReplenishmentCategory">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="basic-replenishment"/>
 *               &lt;enumeration value="limited-replenishment"/>
 *               &lt;enumeration value="manufacturer-out-of-stock"/>
 *               &lt;enumeration value="new-product"/>
 *               &lt;enumeration value="non-replenishable"/>
 *               &lt;enumeration value="non-stockupable"/>
 *               &lt;enumeration value="obsolete"/>
 *               &lt;enumeration value="planned-replenishment"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DropShipStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="drop-ship-disabled"/>
 *               &lt;enumeration value="drop-ship-disabled-by-buyer"/>
 *               &lt;enumeration value="drop-ship-enabled"/>
 *               &lt;enumeration value="drop-ship-enabled-no-auto-pricing"/>
 *               &lt;enumeration value="drop-ship-only"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OutOfStockWebsiteMessage">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="email-me-when-available"/>
 *               &lt;enumeration value="out-of-stock"/>
 *               &lt;enumeration value="pre-order-ute"/>
 *               &lt;enumeration value="underlying-availability"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "tier",
    "purchasingCategory",
    "purchasingSubCategory",
    "packagingType",
    "underlyingAvailability",
    "replenishmentCategory",
    "dropShipStatus",
    "outOfStockWebsiteMessage"
})
@XmlRootElement(name = "Amazon-Only")
public class AmazonOnly {

    @XmlElement(name = "Tier", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tier;
    @XmlElement(name = "PurchasingCategory", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String purchasingCategory;
    @XmlElement(name = "PurchasingSubCategory", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String purchasingSubCategory;
    @XmlElement(name = "PackagingType", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String packagingType;
    @XmlElement(name = "UnderlyingAvailability", required = true)
    protected String underlyingAvailability;
    @XmlElement(name = "ReplenishmentCategory", required = true)
    protected String replenishmentCategory;
    @XmlElement(name = "DropShipStatus", required = true)
    protected String dropShipStatus;
    @XmlElement(name = "OutOfStockWebsiteMessage", required = true)
    protected String outOfStockWebsiteMessage;

    /**
     * 获取tier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTier() {
        return tier;
    }

    /**
     * 设置tier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTier(BigInteger value) {
        this.tier = value;
    }

    /**
     * 获取purchasingCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingCategory() {
        return purchasingCategory;
    }

    /**
     * 设置purchasingCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingCategory(String value) {
        this.purchasingCategory = value;
    }

    /**
     * 获取purchasingSubCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingSubCategory() {
        return purchasingSubCategory;
    }

    /**
     * 设置purchasingSubCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingSubCategory(String value) {
        this.purchasingSubCategory = value;
    }

    /**
     * 获取packagingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     * 设置packagingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagingType(String value) {
        this.packagingType = value;
    }

    /**
     * 获取underlyingAvailability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderlyingAvailability() {
        return underlyingAvailability;
    }

    /**
     * 设置underlyingAvailability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderlyingAvailability(String value) {
        this.underlyingAvailability = value;
    }

    /**
     * 获取replenishmentCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplenishmentCategory() {
        return replenishmentCategory;
    }

    /**
     * 设置replenishmentCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplenishmentCategory(String value) {
        this.replenishmentCategory = value;
    }

    /**
     * 获取dropShipStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropShipStatus() {
        return dropShipStatus;
    }

    /**
     * 设置dropShipStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropShipStatus(String value) {
        this.dropShipStatus = value;
    }

    /**
     * 获取outOfStockWebsiteMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfStockWebsiteMessage() {
        return outOfStockWebsiteMessage;
    }

    /**
     * 设置outOfStockWebsiteMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfStockWebsiteMessage(String value) {
        this.outOfStockWebsiteMessage = value;
    }

}
