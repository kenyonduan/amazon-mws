
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
 *         &lt;element name="SoftwareVideoGamesGenre" type="{}StringNotNull" maxOccurs="5"/>
 *         &lt;choice>
 *           &lt;element name="ESRBRating" type="{}FortyStringNotNull"/>
 *           &lt;element name="BBFCRating" type="{}BBFCRatingType"/>
 *           &lt;element name="PEGIRating" type="{}PEGIRatingType"/>
 *           &lt;element name="USKRating" type="{}USKRatingType"/>
 *         &lt;/choice>
 *         &lt;element name="MediaFormat" type="{}MediumStringNotNull" maxOccurs="5"/>
 *         &lt;element name="OperatingSystem" type="{}MediumStringNotNull" maxOccurs="7"/>
 *         &lt;element name="Bundles" type="{}ThirtyStringNotNull" minOccurs="0"/>
 *         &lt;element name="ESRBDescriptors" type="{}StringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="HardwarePlatform" type="{}MediumStringNotNull" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="PEGIDetails" type="{}PEGIDetailsType" minOccurs="0"/>
 *         &lt;element name="MFGSuggestedAgeMin" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MFGSuggestedAgeMax" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MaxNumberOfPlayers" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}SoftwarePlatform" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="OnlinePlay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "softwareVideoGamesGenre",
    "esrbRating",
    "bbfcRating",
    "pegiRating",
    "uskRating",
    "mediaFormat",
    "operatingSystem",
    "bundles",
    "esrbDescriptors",
    "hardwarePlatform",
    "pegiDetails",
    "mfgSuggestedAgeMin",
    "mfgSuggestedAgeMax",
    "maxNumberOfPlayers",
    "softwarePlatform",
    "onlinePlay"
})
@XmlRootElement(name = "SoftwareGames")
public class SoftwareGames {

    @XmlElement(name = "SoftwareVideoGamesGenre", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> softwareVideoGamesGenre;
    @XmlElement(name = "ESRBRating")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String esrbRating;
    @XmlElement(name = "BBFCRating")
    @XmlSchemaType(name = "string")
    protected BBFCRatingType bbfcRating;
    @XmlElement(name = "PEGIRating")
    @XmlSchemaType(name = "string")
    protected PEGIRatingType pegiRating;
    @XmlElement(name = "USKRating")
    @XmlSchemaType(name = "string")
    protected USKRatingType uskRating;
    @XmlElement(name = "MediaFormat", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> mediaFormat;
    @XmlElement(name = "OperatingSystem", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> operatingSystem;
    @XmlElement(name = "Bundles")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bundles;
    @XmlElement(name = "ESRBDescriptors")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> esrbDescriptors;
    @XmlElement(name = "HardwarePlatform")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> hardwarePlatform;
    @XmlElement(name = "PEGIDetails")
    protected PEGIDetailsType pegiDetails;
    @XmlElement(name = "MFGSuggestedAgeMin")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mfgSuggestedAgeMin;
    @XmlElement(name = "MFGSuggestedAgeMax")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger mfgSuggestedAgeMax;
    @XmlElement(name = "MaxNumberOfPlayers")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxNumberOfPlayers;
    @XmlElement(name = "SoftwarePlatform")
    protected List<SoftwarePlatform> softwarePlatform;
    @XmlElement(name = "OnlinePlay")
    protected Boolean onlinePlay;

    /**
     * Gets the value of the softwareVideoGamesGenre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareVideoGamesGenre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareVideoGamesGenre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSoftwareVideoGamesGenre() {
        if (softwareVideoGamesGenre == null) {
            softwareVideoGamesGenre = new ArrayList<String>();
        }
        return this.softwareVideoGamesGenre;
    }

    /**
     * 获取esrbRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESRBRating() {
        return esrbRating;
    }

    /**
     * 设置esrbRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESRBRating(String value) {
        this.esrbRating = value;
    }

    /**
     * 获取bbfcRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BBFCRatingType }
     *     
     */
    public BBFCRatingType getBBFCRating() {
        return bbfcRating;
    }

    /**
     * 设置bbfcRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BBFCRatingType }
     *     
     */
    public void setBBFCRating(BBFCRatingType value) {
        this.bbfcRating = value;
    }

    /**
     * 获取pegiRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PEGIRatingType }
     *     
     */
    public PEGIRatingType getPEGIRating() {
        return pegiRating;
    }

    /**
     * 设置pegiRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PEGIRatingType }
     *     
     */
    public void setPEGIRating(PEGIRatingType value) {
        this.pegiRating = value;
    }

    /**
     * 获取uskRating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link USKRatingType }
     *     
     */
    public USKRatingType getUSKRating() {
        return uskRating;
    }

    /**
     * 设置uskRating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link USKRatingType }
     *     
     */
    public void setUSKRating(USKRatingType value) {
        this.uskRating = value;
    }

    /**
     * Gets the value of the mediaFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMediaFormat() {
        if (mediaFormat == null) {
            mediaFormat = new ArrayList<String>();
        }
        return this.mediaFormat;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperatingSystem() {
        if (operatingSystem == null) {
            operatingSystem = new ArrayList<String>();
        }
        return this.operatingSystem;
    }

    /**
     * 获取bundles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundles() {
        return bundles;
    }

    /**
     * 设置bundles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundles(String value) {
        this.bundles = value;
    }

    /**
     * Gets the value of the esrbDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esrbDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getESRBDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getESRBDescriptors() {
        if (esrbDescriptors == null) {
            esrbDescriptors = new ArrayList<String>();
        }
        return this.esrbDescriptors;
    }

    /**
     * Gets the value of the hardwarePlatform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardwarePlatform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardwarePlatform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHardwarePlatform() {
        if (hardwarePlatform == null) {
            hardwarePlatform = new ArrayList<String>();
        }
        return this.hardwarePlatform;
    }

    /**
     * 获取pegiDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PEGIDetailsType }
     *     
     */
    public PEGIDetailsType getPEGIDetails() {
        return pegiDetails;
    }

    /**
     * 设置pegiDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PEGIDetailsType }
     *     
     */
    public void setPEGIDetails(PEGIDetailsType value) {
        this.pegiDetails = value;
    }

    /**
     * 获取mfgSuggestedAgeMin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMFGSuggestedAgeMin() {
        return mfgSuggestedAgeMin;
    }

    /**
     * 设置mfgSuggestedAgeMin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMFGSuggestedAgeMin(BigInteger value) {
        this.mfgSuggestedAgeMin = value;
    }

    /**
     * 获取mfgSuggestedAgeMax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMFGSuggestedAgeMax() {
        return mfgSuggestedAgeMax;
    }

    /**
     * 设置mfgSuggestedAgeMax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMFGSuggestedAgeMax(BigInteger value) {
        this.mfgSuggestedAgeMax = value;
    }

    /**
     * 获取maxNumberOfPlayers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    /**
     * 设置maxNumberOfPlayers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfPlayers(BigInteger value) {
        this.maxNumberOfPlayers = value;
    }

    /**
     * Gets the value of the softwarePlatform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwarePlatform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwarePlatform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwarePlatform }
     * 
     * 
     */
    public List<SoftwarePlatform> getSoftwarePlatform() {
        if (softwarePlatform == null) {
            softwarePlatform = new ArrayList<SoftwarePlatform>();
        }
        return this.softwarePlatform;
    }

    /**
     * 获取onlinePlay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlinePlay() {
        return onlinePlay;
    }

    /**
     * 设置onlinePlay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlinePlay(Boolean value) {
        this.onlinePlay = value;
    }

}
