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
 * SAFET Reimbursement Item
 * API Version: 2015-05-01
 * Library Version: 2017-07-26
 * Generated: Tue Jul 25 12:48:56 UTC 2017
 */
package com.amazonservices.mws.finances.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * SAFETReimbursementItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="SAFETReimbursementItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="itemChargeList" type="{http://mws.amazonservices.com/Finances/2015-05-01}ChargeComponent" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SAFETReimbursementItem extends AbstractMwsObject {

    private List<ChargeComponent> itemChargeList;

    /**
     * Get the value of itemChargeList.
     *
     * @return The value of itemChargeList.
     */
    public List<ChargeComponent> getItemChargeList() {
        if (itemChargeList==null) {
            itemChargeList = new ArrayList<ChargeComponent>();
        }
        return itemChargeList;
    }

    /**
     * Set the value of itemChargeList.
     *
     * @param itemChargeList
     *            The new value to set.
     */
    public void setItemChargeList(List<ChargeComponent> itemChargeList) {
        this.itemChargeList = itemChargeList;
    }

    /**
     * Clear itemChargeList.
     */
    public void unsetItemChargeList() {
        this.itemChargeList = null;
    }

    /**
     * Check to see if itemChargeList is set.
     *
     * @return true if itemChargeList is set.
     */
    public boolean isSetItemChargeList() {
        return itemChargeList != null && !itemChargeList.isEmpty();
    }

    /**
     * Add values for itemChargeList, return this.
     *
     * @param itemChargeList
     *             New values to add.
     *
     * @return This instance.
     */
    public SAFETReimbursementItem withItemChargeList(ChargeComponent... values) {
        List<ChargeComponent> list = getItemChargeList();
        for (ChargeComponent value : values) {
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
        itemChargeList = r.readList("itemChargeList", "ChargeComponent", ChargeComponent.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("itemChargeList", "ChargeComponent", itemChargeList);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonservices.com/Finances/2015-05-01", "SAFETReimbursementItem",this);
    }


    /** Default constructor. */
    public SAFETReimbursementItem() {
        super();
    }

}
