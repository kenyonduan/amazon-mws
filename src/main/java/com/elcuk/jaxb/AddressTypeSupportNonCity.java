/*     */ package com.elcuk.jaxb;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
/*     */ import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AddressTypeSupportNonCity", propOrder={"name", "addressFieldOne", "addressFieldTwo", "addressFieldThree", "city", "districtOrCounty", "county", "stateOrRegion", "postalCode", "countryCode", "phoneNumber"})
/*     */ public class AddressTypeSupportNonCity
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Name", required=true)
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String name;
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
/*     */   @XmlElement(name="DistrictOrCounty")
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String districtOrCounty;
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
/*     */   @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
/*     */   protected String phoneNumber;
/*     */ 
/*     */   public String getName()
/*     */   {
/* 106 */     return this.name;
/*     */   }
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 118 */     this.name = value;
/*     */   }
/*     */ 
/*     */   public String getAddressFieldOne()
/*     */   {
/* 130 */     return this.addressFieldOne;
/*     */   }
/*     */ 
/*     */   public void setAddressFieldOne(String value)
/*     */   {
/* 142 */     this.addressFieldOne = value;
/*     */   }
/*     */ 
/*     */   public String getAddressFieldTwo()
/*     */   {
/* 154 */     return this.addressFieldTwo;
/*     */   }
/*     */ 
/*     */   public void setAddressFieldTwo(String value)
/*     */   {
/* 166 */     this.addressFieldTwo = value;
/*     */   }
/*     */ 
/*     */   public String getAddressFieldThree()
/*     */   {
/* 178 */     return this.addressFieldThree;
/*     */   }
/*     */ 
/*     */   public void setAddressFieldThree(String value)
/*     */   {
/* 190 */     this.addressFieldThree = value;
/*     */   }
/*     */ 
/*     */   public String getCity()
/*     */   {
/* 202 */     return this.city;
/*     */   }
/*     */ 
/*     */   public void setCity(String value)
/*     */   {
/* 214 */     this.city = value;
/*     */   }
/*     */ 
/*     */   public String getDistrictOrCounty()
/*     */   {
/* 226 */     return this.districtOrCounty;
/*     */   }
/*     */ 
/*     */   public void setDistrictOrCounty(String value)
/*     */   {
/* 238 */     this.districtOrCounty = value;
/*     */   }
/*     */ 
/*     */   public String getCounty()
/*     */   {
/* 250 */     return this.county;
/*     */   }
/*     */ 
/*     */   public void setCounty(String value)
/*     */   {
/* 262 */     this.county = value;
/*     */   }
/*     */ 
/*     */   public String getStateOrRegion()
/*     */   {
/* 274 */     return this.stateOrRegion;
/*     */   }
/*     */ 
/*     */   public void setStateOrRegion(String value)
/*     */   {
/* 286 */     this.stateOrRegion = value;
/*     */   }
/*     */ 
/*     */   public String getPostalCode()
/*     */   {
/* 298 */     return this.postalCode;
/*     */   }
/*     */ 
/*     */   public void setPostalCode(String value)
/*     */   {
/* 310 */     this.postalCode = value;
/*     */   }
/*     */ 
/*     */   public String getCountryCode()
/*     */   {
/* 322 */     return this.countryCode;
/*     */   }
/*     */ 
/*     */   public void setCountryCode(String value)
/*     */   {
/* 334 */     this.countryCode = value;
/*     */   }
/*     */ 
/*     */   public String getPhoneNumber()
/*     */   {
/* 346 */     return this.phoneNumber;
/*     */   }
/*     */ 
/*     */   public void setPhoneNumber(String value)
/*     */   {
/* 358 */     this.phoneNumber = value;
/*     */   }
/*     */ }

/* Location:           /Users/mac/Desktop/jaxb/
 * Qualified Name:     com.elcuk.jaxb.AddressTypeSupportNonCity
 * JD-Core Version:    0.6.2
 */