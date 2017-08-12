/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AddressType", propOrder={"name", "formalTitle", "givenName", "familyName", "addressFieldOne", "addressFieldTwo", "addressFieldThree", "city", "county", "stateOrRegion", "postalCode", "countryCode", "phoneNumber", "isDefaultShipping", "isDefaultBilling", "isDefaultOneClick"})
/*     */ public class AddressType
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Name", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String name;
/*     */ 
/*     */   @XmlElement(name="FormalTitle")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String formalTitle;
/*     */ 
/*     */   @XmlElement(name="GivenName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String givenName;
/*     */ 
/*     */   @XmlElement(name="FamilyName")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String familyName;
/*     */ 
/*     */   @XmlElement(name="AddressFieldOne", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String addressFieldOne;
/*     */ 
/*     */   @XmlElement(name="AddressFieldTwo")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String addressFieldTwo;
/*     */ 
/*     */   @XmlElement(name="AddressFieldThree")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String addressFieldThree;
/*     */ 
/*     */   @XmlElement(name="City")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String city;
/*     */ 
/*     */   @XmlElement(name="County")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String county;
/*     */ 
/*     */   @XmlElement(name="StateOrRegion")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String stateOrRegion;
/*     */ 
/*     */   @XmlElement(name="PostalCode")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String postalCode;
/*     */ 
/*     */   @XmlElement(name="CountryCode", required=true)
/*     */   protected String countryCode;
/*     */ 
/*     */   @XmlElement(name="PhoneNumber")
/*     */   protected List<PhoneNumberType> phoneNumber;
/*     */   protected Boolean isDefaultShipping;
/*     */   protected Boolean isDefaultBilling;
/*     */   protected Boolean isDefaultOneClick;
/*     */ 
/*     */   public String getName()
/*     */   {
/* 132 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 144 */     this.name = value;
/*     */   }
/*     */ 
/*     */   public String getFormalTitle()
/*     */   {
/* 156 */     return this.formalTitle;
/*     */   }
/*     */ 
/*     */   public void setFormalTitle(String value)
/*     */   {
/* 168 */     this.formalTitle = value;
/*     */   }
/*     */ 
/*     */   public String getGivenName()
/*     */   {
/* 180 */     return this.givenName;
/*     */   }
/*     */ 
/*     */   public void setGivenName(String value)
/*     */   {
/* 192 */     this.givenName = value;
/*     */   }
/*     */ 
/*     */   public String getFamilyName()
/*     */   {
/* 204 */     return this.familyName;
/*     */   }
/*     */ 
/*     */   public void setFamilyName(String value)
/*     */   {
/* 216 */     this.familyName = value;
/*     */   }
/*     */ 
/*     */   public String getAddressFieldOne()
/*     */   {
/* 228 */     return this.addressFieldOne;
/*     */   }
/*     */ 
/*     */   public void setAddressFieldOne(String value)
/*     */   {
/* 240 */     this.addressFieldOne = value;
/*     */   }
/*     */ 
/*     */   public String getAddressFieldTwo()
/*     */   {
/* 252 */     return this.addressFieldTwo;
/*     */   }
/*     */ 
/*     */   public void setAddressFieldTwo(String value)
/*     */   {
/* 264 */     this.addressFieldTwo = value;
/*     */   }
/*     */ 
/*     */   public String getAddressFieldThree()
/*     */   {
/* 276 */     return this.addressFieldThree;
/*     */   }
/*     */ 
/*     */   public void setAddressFieldThree(String value)
/*     */   {
/* 288 */     this.addressFieldThree = value;
/*     */   }
/*     */ 
/*     */   public String getCity()
/*     */   {
/* 300 */     return this.city;
/*     */   }
/*     */ 
/*     */   public void setCity(String value)
/*     */   {
/* 312 */     this.city = value;
/*     */   }
/*     */ 
/*     */   public String getCounty()
/*     */   {
/* 324 */     return this.county;
/*     */   }
/*     */ 
/*     */   public void setCounty(String value)
/*     */   {
/* 336 */     this.county = value;
/*     */   }
/*     */ 
/*     */   public String getStateOrRegion()
/*     */   {
/* 348 */     return this.stateOrRegion;
/*     */   }
/*     */ 
/*     */   public void setStateOrRegion(String value)
/*     */   {
/* 360 */     this.stateOrRegion = value;
/*     */   }
/*     */ 
/*     */   public String getPostalCode()
/*     */   {
/* 372 */     return this.postalCode;
/*     */   }
/*     */ 
/*     */   public void setPostalCode(String value)
/*     */   {
/* 384 */     this.postalCode = value;
/*     */   }
/*     */ 
/*     */   public String getCountryCode()
/*     */   {
/* 396 */     return this.countryCode;
/*     */   }
/*     */ 
/*     */   public void setCountryCode(String value)
/*     */   {
/* 408 */     this.countryCode = value;
/*     */   }
/*     */ 
/*     */   public List<PhoneNumberType> getPhoneNumber()
/*     */   {
/* 434 */     if (this.phoneNumber == null) {
/* 435 */       this.phoneNumber = new ArrayList();
/*     */     }
/* 437 */     return this.phoneNumber;
/*     */   }
/*     */ 
/*     */   public Boolean isIsDefaultShipping()
/*     */   {
/* 449 */     return this.isDefaultShipping;
/*     */   }
/*     */ 
/*     */   public void setIsDefaultShipping(Boolean value)
/*     */   {
/* 461 */     this.isDefaultShipping = value;
/*     */   }
/*     */ 
/*     */   public Boolean isIsDefaultBilling()
/*     */   {
/* 473 */     return this.isDefaultBilling;
/*     */   }
/*     */ 
/*     */   public void setIsDefaultBilling(Boolean value)
/*     */   {
/* 485 */     this.isDefaultBilling = value;
/*     */   }
/*     */ 
/*     */   public Boolean isIsDefaultOneClick()
/*     */   {
/* 497 */     return this.isDefaultOneClick;
/*     */   }
/*     */ 
/*     */   public void setIsDefaultOneClick(Boolean value)
/*     */   {
/* 509 */     this.isDefaultOneClick = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AddressType
 * JD-Core Version:    0.6.2
 */