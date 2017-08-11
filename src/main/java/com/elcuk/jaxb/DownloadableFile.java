
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
 *         &lt;element name="DownloadableFileFormat" type="{}FortyStringNotNull"/>
 *         &lt;element name="FileSize" type="{}MemorySizeDimension"/>
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
    "downloadableFileFormat",
    "fileSize"
})
@XmlRootElement(name = "DownloadableFile")
public class DownloadableFile {

    @XmlElement(name = "DownloadableFileFormat", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String downloadableFileFormat;
    @XmlElement(name = "FileSize", required = true)
    protected MemorySizeDimension fileSize;

    /**
     * 获取downloadableFileFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadableFileFormat() {
        return downloadableFileFormat;
    }

    /**
     * 设置downloadableFileFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadableFileFormat(String value) {
        this.downloadableFileFormat = value;
    }

    /**
     * 获取fileSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemorySizeDimension }
     *     
     */
    public MemorySizeDimension getFileSize() {
        return fileSize;
    }

    /**
     * 设置fileSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemorySizeDimension }
     *     
     */
    public void setFileSize(MemorySizeDimension value) {
        this.fileSize = value;
    }

}
