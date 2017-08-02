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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MarketplaceWebServiceOrdersAsyncClient extends MarketplaceWebServiceOrdersClient implements MarketplaceWebServiceOrdersAsync {

    public MarketplaceWebServiceOrdersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceOrdersConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    public MarketplaceWebServiceOrdersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceOrdersConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    public MarketplaceWebServiceOrdersAsyncClient(
            String accessKey,
            String secretKey,
            MarketplaceWebServiceOrdersConfig config) {
        super(accessKey, secretKey, config);
    }

    public MarketplaceWebServiceOrdersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    public Future<com.amazonservices.mws.orders.model.GetOrderResponse> getOrderAsync(
        com.amazonservices.mws.orders.model.GetOrderRequest request) {
        return connection.callAsync(
            new RequestType("GetOrder", com.amazonservices.mws.orders.model.GetOrderResponse.class, servicePath),
            request);
    }

    public Future<com.amazonservices.mws.orders.model.GetServiceStatusResponse> getServiceStatusAsync(
        com.amazonservices.mws.orders.model.GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", com.amazonservices.mws.orders.model.GetServiceStatusResponse.class, servicePath),
            request);
    }

    public Future<com.amazonservices.mws.orders.model.ListOrderItemsResponse> listOrderItemsAsync(
        com.amazonservices.mws.orders.model.ListOrderItemsRequest request) {
        return connection.callAsync(
            new RequestType("ListOrderItems", com.amazonservices.mws.orders.model.ListOrderItemsResponse.class, servicePath),
            request);
    }

    public Future<com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenResponse> listOrderItemsByNextTokenAsync(
        com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListOrderItemsByNextToken", com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenResponse.class, servicePath),
            request);
    }

    public Future<com.amazonservices.mws.orders.model.ListOrdersResponse> listOrdersAsync(
        com.amazonservices.mws.orders.model.ListOrdersRequest request) {
        return connection.callAsync(
            new RequestType("ListOrders", com.amazonservices.mws.orders.model.ListOrdersResponse.class, servicePath),
            request);
    }

    public Future<com.amazonservices.mws.orders.model.ListOrdersByNextTokenResponse> listOrdersByNextTokenAsync(
        com.amazonservices.mws.orders.model.ListOrdersByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListOrdersByNextToken", com.amazonservices.mws.orders.model.ListOrdersByNextTokenResponse.class, servicePath),
            request);
    }


}
