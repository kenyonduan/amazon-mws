
package com.elcuk.jaxb;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}CheckpointTSAFriendly" minOccurs="0"/>
 *         &lt;element ref="{}CompatibleDeviceSize" minOccurs="0"/>
 *         &lt;element ref="{}CompatibleDeviceFormFactor" maxOccurs="6" minOccurs="0"/>
 *         &lt;element ref="{}HandOrientation" minOccurs="0"/>
 *         &lt;element ref="{}HolderCapacity" minOccurs="0"/>
 *         &lt;element ref="{}MaterialType" minOccurs="0"/>
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
    "checkpointTSAFriendly",
    "compatibleDeviceSize",
    "compatibleDeviceFormFactor",
    "handOrientation",
    "holderCapacity",
    "materialType",
    "modelNumber"
})
@XmlRootElement(name = "CarryingCaseOrBag")
public class CarryingCaseOrBag {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "CheckpointTSAFriendly")
    protected String checkpointTSAFriendly;
    @XmlElement(name = "CompatibleDeviceSize")
    protected BigDecimal compatibleDeviceSize;
    @XmlElement(name = "CompatibleDeviceFormFactor")
    protected List<String> compatibleDeviceFormFactor;
    @XmlElement(name = "HandOrientation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String handOrientation;
    @XmlElement(name = "HolderCapacity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String holderCapacity;
    @XmlElement(name = "MaterialType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String materialType;
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
     * 获取checkpointTSAFriendly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckpointTSAFriendly() {
        return checkpointTSAFriendly;
    }

    /**
     * 设置checkpointTSAFriendly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckpointTSAFriendly(String value) {
        this.checkpointTSAFriendly = value;
    }

    /**
     * 获取compatibleDeviceSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompatibleDeviceSize() {
        return compatibleDeviceSize;
    }

    /**
     * 设置compatibleDeviceSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompatibleDeviceSize(BigDecimal value) {
        this.compatibleDeviceSize = value;
    }

    /**
     * Gets the value of the compatibleDeviceFormFactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibleDeviceFormFactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibleDeviceFormFactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompatibleDeviceFormFactor() {
        if (compatibleDeviceFormFactor == null) {
            compatibleDeviceFormFactor = new ArrayList<String>();
        }
        return this.compatibleDeviceFormFactor;
    }

    /**
     * 获取handOrientation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandOrientation() {
        return handOrientation;
    }

    /**
     * 设置handOrientation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandOrientation(String value) {
        this.handOrientation = value;
    }

    /**
     * 获取holderCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderCapacity() {
        return holderCapacity;
    }

    /**
     * 设置holderCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderCapacity(String value) {
        this.holderCapacity = value;
    }

    /**
     * 获取materialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * 设置materialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
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
