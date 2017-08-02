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
package com.amazonservices.mws.orders.mock;


import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.Date;

import com.amazonservices.mws.client.MwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.client.MwsXmlReader;

/**
 * A mock implementation of MarketplaceWebServiceOrders that uses pre-populated set of 
 * XML files that serve local data.
 *
 * It simulates responses from the Marketplace Web Service Orders service.
 *
 * Use this to test your application without making actual service calls.
 *
 * This mock implementation does not validate requests.
 */
public class MarketplaceWebServiceOrdersMock 
        implements com.amazonservices.mws.orders.MarketplaceWebServiceOrders,
        com.amazonservices.mws.orders.MarketplaceWebServiceOrdersAsync {

    /**
     * Create a future that will immediately return the given response.
     *
     * @param response
     *
     * @return Future
     */
    private <T> Future<T> newFuture(final T response) {
        FutureTask<T> t = new FutureTask<T>(new Callable<T>() {
                @Override
                public T call() {
                    return response;
                }
            });
        t.run();
        return t;
    }

    /**
     * Create a new response object.
     * 
     * @param cls
     * 
     * @return The object.
     */
    private <T extends MwsObject> T newResponse(
            Class<T> cls) {
        InputStream is = null;
        try {
            is = this.getClass().getResourceAsStream(cls.getSimpleName()+".xml");
            MwsXmlReader reader = new MwsXmlReader(is);
            T obj = cls.newInstance();
            obj.readFragmentFrom(reader);
            com.amazonservices.mws.orders.model.ResponseHeaderMetadata rhmd = new com.amazonservices.mws.orders.model.ResponseHeaderMetadata(
                "mockRequestId", Arrays.asList("A","B","C"), "mockTimestamp", 0d, 0d, new Date());
            cls.getMethod("setResponseHeaderMetadata", rhmd.getClass()).invoke(obj,  rhmd);
            return obj;
        } catch (Exception e) {
            throw MwsUtl.wrap(e);
        } finally {
            MwsUtl.close(is);
        }
    }

    /**
     * Get Order
     * This operation takes up to 50 order ids and returns the corresponding orders.
     *
     * @param request
     *           GetOrderRequest request.
     *
     * @return GetOrderResponse response.
     *
     * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
     */
    public com.amazonservices.mws.orders.model.GetOrderResponse getOrder(
            com.amazonservices.mws.orders.model.GetOrderRequest request)
            throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException {
        return newResponse(com.amazonservices.mws.orders.model.GetOrderResponse.class);
    }

    /**
    * Get Order
    * This operation takes up to 50 order ids and returns the corresponding orders.
    *
    * @param request
    *           GetOrderRequest request.
    *
    * @return Future<GetOrderResponse> Future containing completed response
    *
    * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
    */
    public Future<com.amazonservices.mws.orders.model.GetOrderResponse> getOrderAsync(
            com.amazonservices.mws.orders.model.GetOrderRequest request) {
        return newFuture(getOrder(request));
    }

    /**
     * Get Service Status
     * Returns the service status of a particular MWS API section. The operation
     * 		takes no input.
     *
     * @param request
     *           GetServiceStatusRequest request.
     *
     * @return GetServiceStatusResponse response.
     *
     * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
     */
    public com.amazonservices.mws.orders.model.GetServiceStatusResponse getServiceStatus(
            com.amazonservices.mws.orders.model.GetServiceStatusRequest request)
            throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException {
        return newResponse(com.amazonservices.mws.orders.model.GetServiceStatusResponse.class);
    }

    /**
    * Get Service Status
    * Returns the service status of a particular MWS API section. The operation
     * 		takes no input.
    *
    * @param request
    *           GetServiceStatusRequest request.
    *
    * @return Future<GetServiceStatusResponse> Future containing completed response
    *
    * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
    */
    public Future<com.amazonservices.mws.orders.model.GetServiceStatusResponse> getServiceStatusAsync(
            com.amazonservices.mws.orders.model.GetServiceStatusRequest request) {
        return newFuture(getServiceStatus(request));
    }

    /**
     * List Order Items
     * This operation can be used to list the items of the order indicated by the
     *         given order id (only a single Amazon order id is allowed).
     *
     * @param request
     *           ListOrderItemsRequest request.
     *
     * @return ListOrderItemsResponse response.
     *
     * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
     */
    public com.amazonservices.mws.orders.model.ListOrderItemsResponse listOrderItems(
            com.amazonservices.mws.orders.model.ListOrderItemsRequest request)
            throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException {
        return newResponse(com.amazonservices.mws.orders.model.ListOrderItemsResponse.class);
    }

    /**
    * List Order Items
    * This operation can be used to list the items of the order indicated by the
     *         given order id (only a single Amazon order id is allowed).
    *
    * @param request
    *           ListOrderItemsRequest request.
    *
    * @return Future<ListOrderItemsResponse> Future containing completed response
    *
    * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
    */
    public Future<com.amazonservices.mws.orders.model.ListOrderItemsResponse> listOrderItemsAsync(
            com.amazonservices.mws.orders.model.ListOrderItemsRequest request) {
        return newFuture(listOrderItems(request));
    }

    /**
     * List Order Items By Next Token
     * If ListOrderItems cannot return all the order items in one go, it will
     *         provide a nextToken. That nextToken can be used with this operation to
     *         retrive the next batch of items for that order.
     *
     * @param request
     *           ListOrderItemsByNextTokenRequest request.
     *
     * @return ListOrderItemsByNextTokenResponse response.
     *
     * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
     */
    public com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenResponse listOrderItemsByNextToken(
            com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenRequest request)
            throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException {
        return newResponse(com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenResponse.class);
    }

    /**
    * List Order Items By Next Token
    * If ListOrderItems cannot return all the order items in one go, it will
     *         provide a nextToken. That nextToken can be used with this operation to
     *         retrive the next batch of items for that order.
    *
    * @param request
    *           ListOrderItemsByNextTokenRequest request.
    *
    * @return Future<ListOrderItemsByNextTokenResponse> Future containing completed response
    *
    * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
    */
    public Future<com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenResponse> listOrderItemsByNextTokenAsync(
            com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenRequest request) {
        return newFuture(listOrderItemsByNextToken(request));
    }

    /**
     * List Orders
     * ListOrders can be used to find orders that meet the specified criteria.
     *
     * @param request
     *           ListOrdersRequest request.
     *
     * @return ListOrdersResponse response.
     *
     * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
     */
    public com.amazonservices.mws.orders.model.ListOrdersResponse listOrders(
            com.amazonservices.mws.orders.model.ListOrdersRequest request)
            throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException {
        return newResponse(com.amazonservices.mws.orders.model.ListOrdersResponse.class);
    }

    /**
    * List Orders
    * ListOrders can be used to find orders that meet the specified criteria.
    *
    * @param request
    *           ListOrdersRequest request.
    *
    * @return Future<ListOrdersResponse> Future containing completed response
    *
    * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
    */
    public Future<com.amazonservices.mws.orders.model.ListOrdersResponse> listOrdersAsync(
            com.amazonservices.mws.orders.model.ListOrdersRequest request) {
        return newFuture(listOrders(request));
    }

    /**
     * List Orders By Next Token
     * If ListOrders returns a nextToken, thus indicating that there are more orders
     *         than returned that matched the given filter criteria, ListOrdersByNextToken
     *         can be used to retrieve those other orders using that nextToken.
     *
     * @param request
     *           ListOrdersByNextTokenRequest request.
     *
     * @return ListOrdersByNextTokenResponse response.
     *
     * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
     */
    public com.amazonservices.mws.orders.model.ListOrdersByNextTokenResponse listOrdersByNextToken(
            com.amazonservices.mws.orders.model.ListOrdersByNextTokenRequest request)
            throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException {
        return newResponse(com.amazonservices.mws.orders.model.ListOrdersByNextTokenResponse.class);
    }

    /**
    * List Orders By Next Token
    * If ListOrders returns a nextToken, thus indicating that there are more orders
     *         than returned that matched the given filter criteria, ListOrdersByNextToken
     *         can be used to retrieve those other orders using that nextToken.
    *
    * @param request
    *           ListOrdersByNextTokenRequest request.
    *
    * @return Future<ListOrdersByNextTokenResponse> Future containing completed response
    *
    * @throws com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException
    */
    public Future<com.amazonservices.mws.orders.model.ListOrdersByNextTokenResponse> listOrdersByNextTokenAsync(
            com.amazonservices.mws.orders.model.ListOrdersByNextTokenRequest request) {
        return newFuture(listOrdersByNextToken(request));
    }

}
