
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
 *         &lt;element name="GraphicsCardDescription" type="{}MediumStringNotNull" minOccurs="0"/>
 *         &lt;element name="GraphicsCoprocessor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GraphicsProcessorManufacturer" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="GraphicsCardRamSize" type="{}MemorySizeDimension" minOccurs="0"/>
 *         &lt;element name="GraphicsCardInterface" type="{}TwentyStringNotNull" minOccurs="0"/>
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
    "graphicsCardDescription",
    "graphicsCoprocessor",
    "graphicsProcessorManufacturer",
    "graphicsCardRamSize",
    "graphicsCardInterface"
})
@XmlRootElement(name = "GraphicsCard")
public class GraphicsCard {

    @XmlElement(name = "GraphicsCardDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsCardDescription;
    @XmlElement(name = "GraphicsCoprocessor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsCoprocessor;
    @XmlElement(name = "GraphicsProcessorManufacturer")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsProcessorManufacturer;
    @XmlElement(name = "GraphicsCardRamSize")
    protected MemorySizeDimension graphicsCardRamSize;
    @XmlElement(name = "GraphicsCardInterface")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String graphicsCardInterface;

    /**
     * 获取graphicsCardDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCardDescription() {
        return graphicsCardDescription;
    }

    /**
     * 设置graphicsCardDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCardDescription(String value) {
        this.graphicsCardDescription = value;
    }

    /**
     * 获取graphicsCoprocessor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCoprocessor() {
        return graphicsCoprocessor;
    }

    /**
     * 设置graphicsCoprocessor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCoprocessor(String value) {
        this.graphicsCoprocessor = value;
    }

    /**
     * 获取graphicsProcessorManufacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsProcessorManufacturer() {
        return graphicsProcessorManufacturer;
    }

    /**
     * 设置graphicsProcessorManufacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsProcessorManufacturer(String value) {
        this.graphicsProcessorManufacturer = value;
    }

    /**
     * 获取graphicsCardRamSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getGraphicsCardRamSize() {
        return graphicsCardRamSize;
    }

    /**
     * 设置graphicsCardRamSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setGraphicsCardRamSize(MemorySizeDimension value) {
        this.graphicsCardRamSize = value;
    }

    /**
     * 获取graphicsCardInterface属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphicsCardInterface() {
        return graphicsCardInterface;
    }

    /**
     * 设置graphicsCardInterface属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphicsCardInterface(String value) {
        this.graphicsCardInterface = value;
    }

}
