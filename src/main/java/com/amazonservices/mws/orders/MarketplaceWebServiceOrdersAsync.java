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
 * Marketplace Web Service Orders
 * API Version: 2013-09-01
 * Library Version: 2017-02-22
 * Generated: Thu Mar 02 12:41:03 UTC 2017
 */
package com.amazonservices.mws.orders;

import java.util.concurrent.Future;

/**
 * This contains the Order Retrieval API section of the Marketplace Web Service.
 */
public interface MarketplaceWebServiceOrdersAsync extends MarketplaceWebServiceOrders {

    /**
     * Get Order
     *
     * This operation takes up to 50 order ids and returns the corresponding orders.
     *
     * @param request
     *           GetOrderRequest request.
     *
     * @return Future<GetOrderResponse> response.
     */
    Future<com.amazonservices.mws.orders.model.GetOrderResponse> getOrderAsync(
            com.amazonservices.mws.orders.model.GetOrderRequest request);

    /**
     * Get Service Status
     *
     * Returns the service status of a particular MWS API section. The operation
     * 		takes no input.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return Future<GetServiceStatusResponse> response.
     */
    Future<com.amazonservices.mws.orders.model.GetServiceStatusResponse> getServiceStatusAsync(
            com.amazonservices.mws.orders.model.GetServiceStatusRequest request);

    /**
     * List Order Items
     *
     * This operation can be used to list the items of the order indicated by the
     *         given order id (only a single Amazon order id is allowed).
     *
     * @param request
     *           ListOrderItemsRequest request.
     *
     * @return Future<ListOrderItemsResponse> response.
     */
    Future<com.amazonservices.mws.orders.model.ListOrderItemsResponse> listOrderItemsAsync(
            com.amazonservices.mws.orders.model.ListOrderItemsRequest request);

    /**
     * List Order Items By Next Token
     *
     * If ListOrderItems cannot return all the order items in one go, it will
     *         provide a nextToken. That nextToken can be used with this operation to
     *         retrive the next batch of items for that order.
     *
     * @param request
     *           ListOrderItemsByNextTokenRequest request.
     *
     * @return Future<ListOrderItemsByNextTokenResponse> response.
     */
    Future<com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenResponse> listOrderItemsByNextTokenAsync(
            com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenRequest request);

    /**
     * List Orders
     *
     * ListOrders can be used to find orders that meet the specified criteria.
     *
     * @param request
     *           ListOrdersRequest request.
     *
     * @return Future<ListOrdersResponse> response.
     */
    Future<com.amazonservices.mws.orders.model.ListOrdersResponse> listOrdersAsync(
            com.amazonservices.mws.orders.model.ListOrdersRequest request);

    /**
     * List Orders By Next Token
     *
     * If ListOrders returns a nextToken, thus indicating that there are more orders
     *         than returned that matched the given filter criteria, ListOrdersByNextToken
     *         can be used to retrieve those other orders using that nextToken.
     *
     * @param request
     *           ListOrdersByNextTokenRequest request.
     *
     * @return Future<ListOrdersByNextTokenResponse> response.
     */
    Future<com.amazonservices.mws.orders.model.ListOrdersByNextTokenResponse> listOrdersByNextTokenAsync(
            com.amazonservices.mws.orders.model.ListOrdersByNextTokenRequest request);

}