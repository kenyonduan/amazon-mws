
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
 *         &lt;element name="HasGreyScale" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="LightSourceType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxInputSheetCapacity" type="{}PositiveInteger" minOccurs="0"/>
 *         &lt;element name="MaxPrintResolutionBlackWhite" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxPrintResolutionColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxPrintSpeedBlackWhite" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxPrintSpeedColor" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MaxScanningSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="MinScanningSize" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PrinterMediaSizeMaximum" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="PrinterOutputType" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element ref="{}PrinterWirelessType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{}PrintingMediaType" minOccurs="0"/>
 *         &lt;element name="PrintingTechnology" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="ScanRate" type="{}HundredFiftyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ScannerResolution" type="{}StringNotNull" minOccurs="0"/>
 *         &lt;element name="Efficiency" type="{}StringNotNull" minOccurs="0"/>
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
    "hasGreyScale",
    "lightSourceType",
    "maxInputSheetCapacity",
    "maxPrintResolutionBlackWhite",
    "maxPrintResolutionColor",
    "maxPrintSpeedBlackWhite",
    "maxPrintSpeedColor",
    "maxScanningSize",
    "minScanningSize",
    "printerMediaSizeMaximum",
    "printerOutputType",
    "printerWirelessType",
    "printingMediaType",
    "printingTechnology",
    "scanRate",
    "scannerResolution",
    "efficiency"
})
@XmlRootElement(name = "Scanner")
public class Scanner {

    @XmlElement(name = "VariationData")
    protected VariationData variationData;
    @XmlElement(name = "HasGreyScale")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String hasGreyScale;
    @XmlElement(name = "LightSourceType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lightSourceType;
    @XmlElement(name = "MaxInputSheetCapacity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxInputSheetCapacity;
    @XmlElement(name = "MaxPrintResolutionBlackWhite")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxPrintResolutionBlackWhite;
    @XmlElement(name = "MaxPrintResolutionColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxPrintResolutionColor;
    @XmlElement(name = "MaxPrintSpeedBlackWhite")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxPrintSpeedBlackWhite;
    @XmlElement(name = "MaxPrintSpeedColor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxPrintSpeedColor;
    @XmlElement(name = "MaxScanningSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String maxScanningSize;
    @XmlElement(name = "MinScanningSize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String minScanningSize;
    @XmlElement(name = "PrinterMediaSizeMaximum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String printerMediaSizeMaximum;
    @XmlElement(name = "PrinterOutputType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String printerOutputType;
    @XmlElement(name = "PrinterWirelessType")
    protected List<String> printerWirelessType;
    @XmlElement(name = "PrintingMediaType")
    @XmlSchemaType(name = "string")
    protected PrintingMediaTypeValues printingMediaType;
    @XmlElement(name = "PrintingTechnology")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String printingTechnology;
    @XmlElement(name = "ScanRate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scanRate;
    @XmlElement(name = "ScannerResolution")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String scannerResolution;
    @XmlElement(name = "Efficiency")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String efficiency;

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
     * 获取hasGreyScale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasGreyScale() {
        return hasGreyScale;
    }

    /**
     * 设置hasGreyScale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasGreyScale(String value) {
        this.hasGreyScale = value;
    }

    /**
     * 获取lightSourceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightSourceType() {
        return lightSourceType;
    }

    /**
     * 设置lightSourceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightSourceType(String value) {
        this.lightSourceType = value;
    }

    /**
     * 获取maxInputSheetCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxInputSheetCapacity() {
        return maxInputSheetCapacity;
    }

    /**
     * 设置maxInputSheetCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxInputSheetCapacity(BigInteger value) {
        this.maxInputSheetCapacity = value;
    }

    /**
     * 获取maxPrintResolutionBlackWhite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrintResolutionBlackWhite() {
        return maxPrintResolutionBlackWhite;
    }

    /**
     * 设置maxPrintResolutionBlackWhite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrintResolutionBlackWhite(String value) {
        this.maxPrintResolutionBlackWhite = value;
    }

    /**
     * 获取maxPrintResolutionColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrintResolutionColor() {
        return maxPrintResolutionColor;
    }

    /**
     * 设置maxPrintResolutionColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrintResolutionColor(String value) {
        this.maxPrintResolutionColor = value;
    }

    /**
     * 获取maxPrintSpeedBlackWhite属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrintSpeedBlackWhite() {
        return maxPrintSpeedBlackWhite;
    }

    /**
     * 设置maxPrintSpeedBlackWhite属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrintSpeedBlackWhite(String value) {
        this.maxPrintSpeedBlackWhite = value;
    }

    /**
     * 获取maxPrintSpeedColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrintSpeedColor() {
        return maxPrintSpeedColor;
    }

    /**
     * 设置maxPrintSpeedColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrintSpeedColor(String value) {
        this.maxPrintSpeedColor = value;
    }

    /**
     * 获取maxScanningSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxScanningSize() {
        return maxScanningSize;
    }

    /**
     * 设置maxScanningSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxScanningSize(String value) {
        this.maxScanningSize = value;
    }

    /**
     * 获取minScanningSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinScanningSize() {
        return minScanningSize;
    }

    /**
     * 设置minScanningSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinScanningSize(String value) {
        this.minScanningSize = value;
    }

    /**
     * 获取printerMediaSizeMaximum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterMediaSizeMaximum() {
        return printerMediaSizeMaximum;
    }

    /**
     * 设置printerMediaSizeMaximum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterMediaSizeMaximum(String value) {
        this.printerMediaSizeMaximum = value;
    }

    /**
     * 获取printerOutputType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterOutputType() {
        return printerOutputType;
    }

    /**
     * 设置printerOutputType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterOutputType(String value) {
        this.printerOutputType = value;
    }

    /**
     * Gets the value of the printerWirelessType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printerWirelessType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrinterWirelessType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrinterWirelessType() {
        if (printerWirelessType == null) {
            printerWirelessType = new ArrayList<String>();
        }
        return this.printerWirelessType;
    }

    /**
     * 获取printingMediaType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrintingMediaTypeValues }
     *     
     */
    public PrintingMediaTypeValues getPrintingMediaType() {
        return printingMediaType;
    }

    /**
     * 设置printingMediaType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrintingMediaTypeValues }
     *     
     */
    public void setPrintingMediaType(PrintingMediaTypeValues value) {
        this.printingMediaType = value;
    }

    /**
     * 获取printingTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintingTechnology() {
        return printingTechnology;
    }

    /**
     * 设置printingTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintingTechnology(String value) {
        this.printingTechnology = value;
    }

    /**
     * 获取scanRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanRate() {
        return scanRate;
    }

    /**
     * 设置scanRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanRate(String value) {
        this.scanRate = value;
    }

    /**
     * 获取scannerResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScannerResolution() {
        return scannerResolution;
    }

    /**
     * 设置scannerResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScannerResolution(String value) {
        this.scannerResolution = value;
    }

    /**
     * 获取efficiency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfficiency() {
        return efficiency;
    }

    /**
     * 设置efficiency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfficiency(String value) {
        this.efficiency = value;
    }

}
