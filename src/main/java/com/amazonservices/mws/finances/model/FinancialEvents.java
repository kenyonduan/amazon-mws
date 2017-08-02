/*******************************************************************************
 * Copyright 2009-2017 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Financial Events
 * API Version: 2015-05-01
 * Library Version: 2017-07-26
 * Generated: Tue Jul 25 12:48:56 UTC 2017
 */
package com.amazonservices.mws.finances.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * FinancialEvents complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="FinancialEvents"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShipmentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RefundEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="GuaranteeClaimEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ChargebackEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ShipmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PayWithAmazonEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}PayWithAmazonEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ServiceProviderCreditEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SolutionProviderCreditEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RetrochargeEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}RetrochargeEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RentalTransactionEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}RentalTransactionEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="PerformanceBondRefundEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}PerformanceBondRefundEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ProductAdsPaymentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ProductAdsPaymentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="ServiceFeeEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ServiceFeeEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="SellerDealPaymentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SellerDealPaymentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="DebtRecoveryEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}DebtRecoveryEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="LoanServicingEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}LoanServicingEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="AdjustmentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}AdjustmentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="SAFETReimbursementEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SAFETReimbursementEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="SellerReviewEnrollmentPaymentEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}SellerReviewEnrollmentPaymentEvent" maxOccurs="unbounded"/&gt;
 *             &lt;element name="FBALiquidationEventList" type="{http://mws.amazonservices.com/Finances/2015-05-01}FBALiquidationEvent" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class FinancialEvents extends AbstractMwsObject {

    private List<ShipmentEvent> shipmentEventList;

    private List<ShipmentEvent> refundEventList;

    private List<ShipmentEvent> guaranteeClaimEventList;

    private List<ShipmentEvent> chargebackEventList;

    private List<PayWithAmazonEvent> payWithAmazonEventList;

    private List<SolutionProviderCreditEvent> serviceProviderCreditEventList;

    private List<RetrochargeEvent> retrochargeEventList;

    private List<RentalTransactionEvent> rentalTransactionEventList;

    private List<PerformanceBondRefundEvent> performanceBondRefundEventList;

    private List<ProductAdsPaymentEvent> productAdsPaymentEventList;

    private List<ServiceFeeEvent> serviceFeeEventList;

    private List<SellerDealPaymentEvent> sellerDealPaymentEventList;

    private List<DebtRecoveryEvent> debtRecoveryEventList;

    private List<LoanServicingEvent> loanServicingEventList;

    private List<AdjustmentEvent> adjustmentEventList;

    private List<SAFETReimbursementEvent> safetReimbursementEventList;

    private List<SellerReviewEnrollmentPaymentEvent> sellerReviewEnrollmentPaymentEventList;

    private List<FBALiquidationEvent> fbaLiquidationEventList;

    /**
     * Get the value of ShipmentEventList.
     *
     * @return The value of ShipmentEventList.
     */
    public List<ShipmentEvent> getShipmentEventList() {
        if (shipmentEventList==null) {
            shipmentEventList = new ArrayList<ShipmentEvent>();
        }
        return shipmentEventList;
    }

    /**
     * Set the value of ShipmentEventList.
     *
     * @param shipmentEventList
     *            The new value to set.
     */
    public void setShipmentEventList(List<ShipmentEvent> shipmentEventList) {
        this.shipmentEventList = shipmentEventList;
    }

    /**
     * Clear ShipmentEventList.
     */
    public void unsetShipmentEventList() {
        this.shipmentEventList = null;
    }

    /**
     * Check to see if ShipmentEventList is set.
     *
     * @return true if ShipmentEventList is set.
     */
    public boolean isSetShipmentEventList() {
        return shipmentEventList != null && !shipmentEventList.isEmpty();
    }

    /**
     * Add values for ShipmentEventList, return this.
     *
     * @param shipmentEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withShipmentEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getShipmentEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RefundEventList.
     *
     * @return The value of RefundEventList.
     */
    public List<ShipmentEvent> getRefundEventList() {
        if (refundEventList==null) {
            refundEventList = new ArrayList<ShipmentEvent>();
        }
        return refundEventList;
    }

    /**
     * Set the value of RefundEventList.
     *
     * @param refundEventList
     *            The new value to set.
     */
    public void setRefundEventList(List<ShipmentEvent> refundEventList) {
        this.refundEventList = refundEventList;
    }

    /**
     * Clear RefundEventList.
     */
    public void unsetRefundEventList() {
        this.refundEventList = null;
    }

    /**
     * Check to see if RefundEventList is set.
     *
     * @return true if RefundEventList is set.
     */
    public boolean isSetRefundEventList() {
        return refundEventList != null && !refundEventList.isEmpty();
    }

    /**
     * Add values for RefundEventList, return this.
     *
     * @param refundEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRefundEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getRefundEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of GuaranteeClaimEventList.
     *
     * @return The value of GuaranteeClaimEventList.
     */
    public List<ShipmentEvent> getGuaranteeClaimEventList() {
        if (guaranteeClaimEventList==null) {
            guaranteeClaimEventList = new ArrayList<ShipmentEvent>();
        }
        return guaranteeClaimEventList;
    }

    /**
     * Set the value of GuaranteeClaimEventList.
     *
     * @param guaranteeClaimEventList
     *            The new value to set.
     */
    public void setGuaranteeClaimEventList(List<ShipmentEvent> guaranteeClaimEventList) {
        this.guaranteeClaimEventList = guaranteeClaimEventList;
    }

    /**
     * Clear GuaranteeClaimEventList.
     */
    public void unsetGuaranteeClaimEventList() {
        this.guaranteeClaimEventList = null;
    }

    /**
     * Check to see if GuaranteeClaimEventList is set.
     *
     * @return true if GuaranteeClaimEventList is set.
     */
    public boolean isSetGuaranteeClaimEventList() {
        return guaranteeClaimEventList != null && !guaranteeClaimEventList.isEmpty();
    }

    /**
     * Add values for GuaranteeClaimEventList, return this.
     *
     * @param guaranteeClaimEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withGuaranteeClaimEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getGuaranteeClaimEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ChargebackEventList.
     *
     * @return The value of ChargebackEventList.
     */
    public List<ShipmentEvent> getChargebackEventList() {
        if (chargebackEventList==null) {
            chargebackEventList = new ArrayList<ShipmentEvent>();
        }
        return chargebackEventList;
    }

    /**
     * Set the value of ChargebackEventList.
     *
     * @param chargebackEventList
     *            The new value to set.
     */
    public void setChargebackEventList(List<ShipmentEvent> chargebackEventList) {
        this.chargebackEventList = chargebackEventList;
    }

    /**
     * Clear ChargebackEventList.
     */
    public void unsetChargebackEventList() {
        this.chargebackEventList = null;
    }

    /**
     * Check to see if ChargebackEventList is set.
     *
     * @return true if ChargebackEventList is set.
     */
    public boolean isSetChargebackEventList() {
        return chargebackEventList != null && !chargebackEventList.isEmpty();
    }

    /**
     * Add values for ChargebackEventList, return this.
     *
     * @param chargebackEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withChargebackEventList(ShipmentEvent... values) {
        List<ShipmentEvent> list = getChargebackEventList();
        for (ShipmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PayWithAmazonEventList.
     *
     * @return The value of PayWithAmazonEventList.
     */
    public List<PayWithAmazonEvent> getPayWithAmazonEventList() {
        if (payWithAmazonEventList==null) {
            payWithAmazonEventList = new ArrayList<PayWithAmazonEvent>();
        }
        return payWithAmazonEventList;
    }

    /**
     * Set the value of PayWithAmazonEventList.
     *
     * @param payWithAmazonEventList
     *            The new value to set.
     */
    public void setPayWithAmazonEventList(List<PayWithAmazonEvent> payWithAmazonEventList) {
        this.payWithAmazonEventList = payWithAmazonEventList;
    }

    /**
     * Clear PayWithAmazonEventList.
     */
    public void unsetPayWithAmazonEventList() {
        this.payWithAmazonEventList = null;
    }

    /**
     * Check to see if PayWithAmazonEventList is set.
     *
     * @return true if PayWithAmazonEventList is set.
     */
    public boolean isSetPayWithAmazonEventList() {
        return payWithAmazonEventList != null && !payWithAmazonEventList.isEmpty();
    }

    /**
     * Add values for PayWithAmazonEventList, return this.
     *
     * @param payWithAmazonEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withPayWithAmazonEventList(PayWithAmazonEvent... values) {
        List<PayWithAmazonEvent> list = getPayWithAmazonEventList();
        for (PayWithAmazonEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ServiceProviderCreditEventList.
     *
     * @return The value of ServiceProviderCreditEventList.
     */
    public List<SolutionProviderCreditEvent> getServiceProviderCreditEventList() {
        if (serviceProviderCreditEventList==null) {
            serviceProviderCreditEventList = new ArrayList<SolutionProviderCreditEvent>();
        }
        return serviceProviderCreditEventList;
    }

    /**
     * Set the value of ServiceProviderCreditEventList.
     *
     * @param serviceProviderCreditEventList
     *            The new value to set.
     */
    public void setServiceProviderCreditEventList(List<SolutionProviderCreditEvent> serviceProviderCreditEventList) {
        this.serviceProviderCreditEventList = serviceProviderCreditEventList;
    }

    /**
     * Clear ServiceProviderCreditEventList.
     */
    public void unsetServiceProviderCreditEventList() {
        this.serviceProviderCreditEventList = null;
    }

    /**
     * Check to see if ServiceProviderCreditEventList is set.
     *
     * @return true if ServiceProviderCreditEventList is set.
     */
    public boolean isSetServiceProviderCreditEventList() {
        return serviceProviderCreditEventList != null && !serviceProviderCreditEventList.isEmpty();
    }

    /**
     * Add values for ServiceProviderCreditEventList, return this.
     *
     * @param serviceProviderCreditEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withServiceProviderCreditEventList(SolutionProviderCreditEvent... values) {
        List<SolutionProviderCreditEvent> list = getServiceProviderCreditEventList();
        for (SolutionProviderCreditEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RetrochargeEventList.
     *
     * @return The value of RetrochargeEventList.
     */
    public List<RetrochargeEvent> getRetrochargeEventList() {
        if (retrochargeEventList==null) {
            retrochargeEventList = new ArrayList<RetrochargeEvent>();
        }
        return retrochargeEventList;
    }

    /**
     * Set the value of RetrochargeEventList.
     *
     * @param retrochargeEventList
     *            The new value to set.
     */
    public void setRetrochargeEventList(List<RetrochargeEvent> retrochargeEventList) {
        this.retrochargeEventList = retrochargeEventList;
    }

    /**
     * Clear RetrochargeEventList.
     */
    public void unsetRetrochargeEventList() {
        this.retrochargeEventList = null;
    }

    /**
     * Check to see if RetrochargeEventList is set.
     *
     * @return true if RetrochargeEventList is set.
     */
    public boolean isSetRetrochargeEventList() {
        return retrochargeEventList != null && !retrochargeEventList.isEmpty();
    }

    /**
     * Add values for RetrochargeEventList, return this.
     *
     * @param retrochargeEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRetrochargeEventList(RetrochargeEvent... values) {
        List<RetrochargeEvent> list = getRetrochargeEventList();
        for (RetrochargeEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RentalTransactionEventList.
     *
     * @return The value of RentalTransactionEventList.
     */
    public List<RentalTransactionEvent> getRentalTransactionEventList() {
        if (rentalTransactionEventList==null) {
            rentalTransactionEventList = new ArrayList<RentalTransactionEvent>();
        }
        return rentalTransactionEventList;
    }

    /**
     * Set the value of RentalTransactionEventList.
     *
     * @param rentalTransactionEventList
     *            The new value to set.
     */
    public void setRentalTransactionEventList(List<RentalTransactionEvent> rentalTransactionEventList) {
        this.rentalTransactionEventList = rentalTransactionEventList;
    }

    /**
     * Clear RentalTransactionEventList.
     */
    public void unsetRentalTransactionEventList() {
        this.rentalTransactionEventList = null;
    }

    /**
     * Check to see if RentalTransactionEventList is set.
     *
     * @return true if RentalTransactionEventList is set.
     */
    public boolean isSetRentalTransactionEventList() {
        return rentalTransactionEventList != null && !rentalTransactionEventList.isEmpty();
    }

    /**
     * Add values for RentalTransactionEventList, return this.
     *
     * @param rentalTransactionEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withRentalTransactionEventList(RentalTransactionEvent... values) {
        List<RentalTransactionEvent> list = getRentalTransactionEventList();
        for (RentalTransactionEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of PerformanceBondRefundEventList.
     *
     * @return The value of PerformanceBondRefundEventList.
     */
    public List<PerformanceBondRefundEvent> getPerformanceBondRefundEventList() {
        if (performanceBondRefundEventList==null) {
            performanceBondRefundEventList = new ArrayList<PerformanceBondRefundEvent>();
        }
        return performanceBondRefundEventList;
    }

    /**
     * Set the value of PerformanceBondRefundEventList.
     *
     * @param performanceBondRefundEventList
     *            The new value to set.
     */
    public void setPerformanceBondRefundEventList(List<PerformanceBondRefundEvent> performanceBondRefundEventList) {
        this.performanceBondRefundEventList = performanceBondRefundEventList;
    }

    /**
     * Clear PerformanceBondRefundEventList.
     */
    public void unsetPerformanceBondRefundEventList() {
        this.performanceBondRefundEventList = null;
    }

    /**
     * Check to see if PerformanceBondRefundEventList is set.
     *
     * @return true if PerformanceBondRefundEventList is set.
     */
    public boolean isSetPerformanceBondRefundEventList() {
        return performanceBondRefundEventList != null && !performanceBondRefundEventList.isEmpty();
    }

    /**
     * Add values for PerformanceBondRefundEventList, return this.
     *
     * @param performanceBondRefundEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withPerformanceBondRefundEventList(PerformanceBondRefundEvent... values) {
        List<PerformanceBondRefundEvent> list = getPerformanceBondRefundEventList();
        for (PerformanceBondRefundEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ProductAdsPaymentEventList.
     *
     * @return The value of ProductAdsPaymentEventList.
     */
    public List<ProductAdsPaymentEvent> getProductAdsPaymentEventList() {
        if (productAdsPaymentEventList==null) {
            productAdsPaymentEventList = new ArrayList<ProductAdsPaymentEvent>();
        }
        return productAdsPaymentEventList;
    }

    /**
     * Set the value of ProductAdsPaymentEventList.
     *
     * @param productAdsPaymentEventList
     *            The new value to set.
     */
    public void setProductAdsPaymentEventList(List<ProductAdsPaymentEvent> productAdsPaymentEventList) {
        this.productAdsPaymentEventList = productAdsPaymentEventList;
    }

    /**
     * Clear ProductAdsPaymentEventList.
     */
    public void unsetProductAdsPaymentEventList() {
        this.productAdsPaymentEventList = null;
    }

    /**
     * Check to see if ProductAdsPaymentEventList is set.
     *
     * @return true if ProductAdsPaymentEventList is set.
     */
    public boolean isSetProductAdsPaymentEventList() {
        return productAdsPaymentEventList != null && !productAdsPaymentEventList.isEmpty();
    }

    /**
     * Add values for ProductAdsPaymentEventList, return this.
     *
     * @param productAdsPaymentEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withProductAdsPaymentEventList(ProductAdsPaymentEvent... values) {
        List<ProductAdsPaymentEvent> list = getProductAdsPaymentEventList();
        for (ProductAdsPaymentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of ServiceFeeEventList.
     *
     * @return The value of ServiceFeeEventList.
     */
    public List<ServiceFeeEvent> getServiceFeeEventList() {
        if (serviceFeeEventList==null) {
            serviceFeeEventList = new ArrayList<ServiceFeeEvent>();
        }
        return serviceFeeEventList;
    }

    /**
     * Set the value of ServiceFeeEventList.
     *
     * @param serviceFeeEventList
     *            The new value to set.
     */
    public void setServiceFeeEventList(List<ServiceFeeEvent> serviceFeeEventList) {
        this.serviceFeeEventList = serviceFeeEventList;
    }

    /**
     * Clear ServiceFeeEventList.
     */
    public void unsetServiceFeeEventList() {
        this.serviceFeeEventList = null;
    }

    /**
     * Check to see if ServiceFeeEventList is set.
     *
     * @return true if ServiceFeeEventList is set.
     */
    public boolean isSetServiceFeeEventList() {
        return serviceFeeEventList != null && !serviceFeeEventList.isEmpty();
    }

    /**
     * Add values for ServiceFeeEventList, return this.
     *
     * @param serviceFeeEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withServiceFeeEventList(ServiceFeeEvent... values) {
        List<ServiceFeeEvent> list = getServiceFeeEventList();
        for (ServiceFeeEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of SellerDealPaymentEventList.
     *
     * @return The value of SellerDealPaymentEventList.
     */
    public List<SellerDealPaymentEvent> getSellerDealPaymentEventList() {
        if (sellerDealPaymentEventList==null) {
            sellerDealPaymentEventList = new ArrayList<SellerDealPaymentEvent>();
        }
        return sellerDealPaymentEventList;
    }

    /**
     * Set the value of SellerDealPaymentEventList.
     *
     * @param sellerDealPaymentEventList
     *            The new value to set.
     */
    public void setSellerDealPaymentEventList(List<SellerDealPaymentEvent> sellerDealPaymentEventList) {
        this.sellerDealPaymentEventList = sellerDealPaymentEventList;
    }

    /**
     * Clear SellerDealPaymentEventList.
     */
    public void unsetSellerDealPaymentEventList() {
        this.sellerDealPaymentEventList = null;
    }

    /**
     * Check to see if SellerDealPaymentEventList is set.
     *
     * @return true if SellerDealPaymentEventList is set.
     */
    public boolean isSetSellerDealPaymentEventList() {
        return sellerDealPaymentEventList != null && !sellerDealPaymentEventList.isEmpty();
    }

    /**
     * Add values for SellerDealPaymentEventList, return this.
     *
     * @param sellerDealPaymentEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withSellerDealPaymentEventList(SellerDealPaymentEvent... values) {
        List<SellerDealPaymentEvent> list = getSellerDealPaymentEventList();
        for (SellerDealPaymentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of DebtRecoveryEventList.
     *
     * @return The value of DebtRecoveryEventList.
     */
    public List<DebtRecoveryEvent> getDebtRecoveryEventList() {
        if (debtRecoveryEventList==null) {
            debtRecoveryEventList = new ArrayList<DebtRecoveryEvent>();
        }
        return debtRecoveryEventList;
    }

    /**
     * Set the value of DebtRecoveryEventList.
     *
     * @param debtRecoveryEventList
     *            The new value to set.
     */
    public void setDebtRecoveryEventList(List<DebtRecoveryEvent> debtRecoveryEventList) {
        this.debtRecoveryEventList = debtRecoveryEventList;
    }

    /**
     * Clear DebtRecoveryEventList.
     */
    public void unsetDebtRecoveryEventList() {
        this.debtRecoveryEventList = null;
    }

    /**
     * Check to see if DebtRecoveryEventList is set.
     *
     * @return true if DebtRecoveryEventList is set.
     */
    public boolean isSetDebtRecoveryEventList() {
        return debtRecoveryEventList != null && !debtRecoveryEventList.isEmpty();
    }

    /**
     * Add values for DebtRecoveryEventList, return this.
     *
     * @param debtRecoveryEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withDebtRecoveryEventList(DebtRecoveryEvent... values) {
        List<DebtRecoveryEvent> list = getDebtRecoveryEventList();
        for (DebtRecoveryEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of LoanServicingEventList.
     *
     * @return The value of LoanServicingEventList.
     */
    public List<LoanServicingEvent> getLoanServicingEventList() {
        if (loanServicingEventList==null) {
            loanServicingEventList = new ArrayList<LoanServicingEvent>();
        }
        return loanServicingEventList;
    }

    /**
     * Set the value of LoanServicingEventList.
     *
     * @param loanServicingEventList
     *            The new value to set.
     */
    public void setLoanServicingEventList(List<LoanServicingEvent> loanServicingEventList) {
        this.loanServicingEventList = loanServicingEventList;
    }

    /**
     * Clear LoanServicingEventList.
     */
    public void unsetLoanServicingEventList() {
        this.loanServicingEventList = null;
    }

    /**
     * Check to see if LoanServicingEventList is set.
     *
     * @return true if LoanServicingEventList is set.
     */
    public boolean isSetLoanServicingEventList() {
        return loanServicingEventList != null && !loanServicingEventList.isEmpty();
    }

    /**
     * Add values for LoanServicingEventList, return this.
     *
     * @param loanServicingEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withLoanServicingEventList(LoanServicingEvent... values) {
        List<LoanServicingEvent> list = getLoanServicingEventList();
        for (LoanServicingEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of AdjustmentEventList.
     *
     * @return The value of AdjustmentEventList.
     */
    public List<AdjustmentEvent> getAdjustmentEventList() {
        if (adjustmentEventList==null) {
            adjustmentEventList = new ArrayList<AdjustmentEvent>();
        }
        return adjustmentEventList;
    }

    /**
     * Set the value of AdjustmentEventList.
     *
     * @param adjustmentEventList
     *            The new value to set.
     */
    public void setAdjustmentEventList(List<AdjustmentEvent> adjustmentEventList) {
        this.adjustmentEventList = adjustmentEventList;
    }

    /**
     * Clear AdjustmentEventList.
     */
    public void unsetAdjustmentEventList() {
        this.adjustmentEventList = null;
    }

    /**
     * Check to see if AdjustmentEventList is set.
     *
     * @return true if AdjustmentEventList is set.
     */
    public boolean isSetAdjustmentEventList() {
        return adjustmentEventList != null && !adjustmentEventList.isEmpty();
    }

    /**
     * Add values for AdjustmentEventList, return this.
     *
     * @param adjustmentEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withAdjustmentEventList(AdjustmentEvent... values) {
        List<AdjustmentEvent> list = getAdjustmentEventList();
        for (AdjustmentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of SAFETReimbursementEventList.
     *
     * @return The value of SAFETReimbursementEventList.
     */
    public List<SAFETReimbursementEvent> getSAFETReimbursementEventList() {
        if (safetReimbursementEventList==null) {
            safetReimbursementEventList = new ArrayList<SAFETReimbursementEvent>();
        }
        return safetReimbursementEventList;
    }

    /**
     * Set the value of SAFETReimbursementEventList.
     *
     * @param safetReimbursementEventList
     *            The new value to set.
     */
    public void setSAFETReimbursementEventList(List<SAFETReimbursementEvent> safetReimbursementEventList) {
        this.safetReimbursementEventList = safetReimbursementEventList;
    }

    /**
     * Clear SAFETReimbursementEventList.
     */
    public void unsetSAFETReimbursementEventList() {
        this.safetReimbursementEventList = null;
    }

    /**
     * Check to see if SAFETReimbursementEventList is set.
     *
     * @return true if SAFETReimbursementEventList is set.
     */
    public boolean isSetSAFETReimbursementEventList() {
        return safetReimbursementEventList != null && !safetReimbursementEventList.isEmpty();
    }

    /**
     * Add values for SAFETReimbursementEventList, return this.
     *
     * @param safetReimbursementEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withSAFETReimbursementEventList(SAFETReimbursementEvent... values) {
        List<SAFETReimbursementEvent> list = getSAFETReimbursementEventList();
        for (SAFETReimbursementEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of SellerReviewEnrollmentPaymentEventList.
     *
     * @return The value of SellerReviewEnrollmentPaymentEventList.
     */
    public List<SellerReviewEnrollmentPaymentEvent> getSellerReviewEnrollmentPaymentEventList() {
        if (sellerReviewEnrollmentPaymentEventList==null) {
            sellerReviewEnrollmentPaymentEventList = new ArrayList<SellerReviewEnrollmentPaymentEvent>();
        }
        return sellerReviewEnrollmentPaymentEventList;
    }

    /**
     * Set the value of SellerReviewEnrollmentPaymentEventList.
     *
     * @param sellerReviewEnrollmentPaymentEventList
     *            The new value to set.
     */
    public void setSellerReviewEnrollmentPaymentEventList(List<SellerReviewEnrollmentPaymentEvent> sellerReviewEnrollmentPaymentEventList) {
        this.sellerReviewEnrollmentPaymentEventList = sellerReviewEnrollmentPaymentEventList;
    }

    /**
     * Clear SellerReviewEnrollmentPaymentEventList.
     */
    public void unsetSellerReviewEnrollmentPaymentEventList() {
        this.sellerReviewEnrollmentPaymentEventList = null;
    }

    /**
     * Check to see if SellerReviewEnrollmentPaymentEventList is set.
     *
     * @return true if SellerReviewEnrollmentPaymentEventList is set.
     */
    public boolean isSetSellerReviewEnrollmentPaymentEventList() {
        return sellerReviewEnrollmentPaymentEventList != null && !sellerReviewEnrollmentPaymentEventList.isEmpty();
    }

    /**
     * Add values for SellerReviewEnrollmentPaymentEventList, return this.
     *
     * @param sellerReviewEnrollmentPaymentEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withSellerReviewEnrollmentPaymentEventList(SellerReviewEnrollmentPaymentEvent... values) {
        List<SellerReviewEnrollmentPaymentEvent> list = getSellerReviewEnrollmentPaymentEventList();
        for (SellerReviewEnrollmentPaymentEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of FBALiquidationEventList.
     *
     * @return The value of FBALiquidationEventList.
     */
    public List<FBALiquidationEvent> getFBALiquidationEventList() {
        if (fbaLiquidationEventList==null) {
            fbaLiquidationEventList = new ArrayList<FBALiquidationEvent>();
        }
        return fbaLiquidationEventList;
    }

    /**
     * Set the value of FBALiquidationEventList.
     *
     * @param fbaLiquidationEventList
     *            The new value to set.
     */
    public void setFBALiquidationEventList(List<FBALiquidationEvent> fbaLiquidationEventList) {
        this.fbaLiquidationEventList = fbaLiquidationEventList;
    }

    /**
     * Clear FBALiquidationEventList.
     */
    public void unsetFBALiquidationEventList() {
        this.fbaLiquidationEventList = null;
    }

    /**
     * Check to see if FBALiquidationEventList is set.
     *
     * @return true if FBALiquidationEventList is set.
     */
    public boolean isSetFBALiquidationEventList() {
        return fbaLiquidationEventList != null && !fbaLiquidationEventList.isEmpty();
    }

    /**
     * Add values for FBALiquidationEventList, return this.
     *
     * @param fbaLiquidationEventList
     *             New values to add.
     *
     * @return This instance.
     */
    public FinancialEvents withFBALiquidationEventList(FBALiquidationEvent... values) {
        List<FBALiquidationEvent> list = getFBALiquidationEventList();
        for (FBALiquidationEvent value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        shipmentEventList = r.readList("ShipmentEventList", "ShipmentEvent", ShipmentEvent.class);
        refundEventList = r.readList("RefundEventList", "ShipmentEvent", ShipmentEvent.class);
        guaranteeClaimEventList = r.readList("GuaranteeClaimEventList", "ShipmentEvent", ShipmentEvent.class);
        chargebackEventList = r.readList("ChargebackEventList", "ShipmentEvent", ShipmentEvent.class);
        payWithAmazonEventList = r.readList("PayWithAmazonEventList", "PayWithAmazonEvent", PayWithAmazonEvent.class);
        serviceProviderCreditEventList = r.readList("ServiceProviderCreditEventList", "SolutionProviderCreditEvent", SolutionProviderCreditEvent.class);
        retrochargeEventList = r.readList("RetrochargeEventList", "RetrochargeEvent", RetrochargeEvent.class);
        rentalTransactionEventList = r.readList("RentalTransactionEventList", "RentalTransactionEvent", RentalTransactionEvent.class);
        performanceBondRefundEventList = r.readList("PerformanceBondRefundEventList", "PerformanceBondRefundEvent", PerformanceBondRefundEvent.class);
        productAdsPaymentEventList = r.readList("ProductAdsPaymentEventList", "ProductAdsPaymentEvent", ProductAdsPaymentEvent.class);
        serviceFeeEventList = r.readList("ServiceFeeEventList", "ServiceFeeEvent", ServiceFeeEvent.class);
        sellerDealPaymentEventList = r.readList("SellerDealPaymentEventList", "SellerDealPaymentEvent", SellerDealPaymentEvent.class);
        debtRecoveryEventList = r.readList("DebtRecoveryEventList", "DebtRecoveryEvent", DebtRecoveryEvent.class);
        loanServicingEventList = r.readList("LoanServicingEventList", "LoanServicingEvent", LoanServicingEvent.class);
        adjustmentEventList = r.readList("AdjustmentEventList", "AdjustmentEvent", AdjustmentEvent.class);
        safetReimbursementEventList = r.readList("SAFETReimbursementEventList", "SAFETReimbursementEvent", SAFETReimbursementEvent.class);
        sellerReviewEnrollmentPaymentEventList = r.readList("SellerReviewEnrollmentPaymentEventList", "SellerReviewEnrollmentPaymentEvent", SellerReviewEnrollmentPaymentEvent.class);
        fbaLiquidationEventList = r.readList("FBALiquidationEventList", "FBALiquidationEvent", FBALiquidationEvent.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ShipmentEventList", "ShipmentEvent", shipmentEventList);
        w.writeList("RefundEventList", "ShipmentEvent", refundEventList);
        w.writeList("GuaranteeClaimEventList", "ShipmentEvent", guaranteeClaimEventList);
        w.writeList("ChargebackEventList", "ShipmentEvent", chargebackEventList);
        w.writeList("PayWithAmazonEventList", "PayWithAmazonEvent", payWithAmazonEventList);
        w.writeList("ServiceProviderCreditEventList", "SolutionProviderCreditEvent", serviceProviderCreditEventList);
        w.writeList("RetrochargeEventList", "RetrochargeEvent", retrochargeEventList);
        w.writeList("RentalTransactionEventList", "RentalTransactionEvent", rentalTransactionEventList);
        w.writeList("PerformanceBondRefundEventList", "PerformanceBondRefundEvent", performanceBondRefundEventList);
        w.writeList("ProductAdsPaymentEventList", "ProductAdsPaymentEvent", productAdsPaymentEventList);
        w.writeList("ServiceFeeEventList", "ServiceFeeEvent", serviceFeeEventList);
        w.writeList("SellerDealPaymentEventList", "SellerDealPaymentEvent", sellerDealPaymentEventList);
        w.writeList("DebtRecoveryEventList", "DebtRecoveryEvent", debtRecoveryEventList);
        w.writeList("LoanServicingEventList", "LoanServicingEvent", loanServicingEventList);
        w.writeList("AdjustmentEventList", "AdjustmentEvent", adjustmentEventList);
        w.writeList("SAFETReimbursementEventList", "SAFETReimbursementEvent", safetReimbursementEventList);
        w.writeList("SellerReviewEnrollmentPaymentEventList", "SellerReviewEnrollmentPaymentEvent", sellerReviewEnrollmentPaymentEventList);
        w.writeList("FBALiquidationEventList", "FBALiquidationEvent", fbaLiquidationEventList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "FinancialEvents",this);
    }


    /** Default constructor. */
    public FinancialEvents() {
        super();
    }

}
