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

import com.amazonservices.mws.client.*;

public class MarketplaceWebServiceOrdersClient implements MarketplaceWebServiceOrders {

    private static final String libraryName = "MarketplaceWebServiceOrders";

    private static final String libraryVersion = "2017-02-22";

    protected String servicePath;

    protected final MwsConnection connection;

    public MarketplaceWebServiceOrdersClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceOrdersConfig config) {
        connection = config.copyConnection();
        connection.setAwsAccessKeyId(accessKey);
        connection.setAwsSecretKeyId(secretKey);
        connection.setApplicationName(applicationName);
        connection.setApplicationVersion(applicationVersion);
        connection.setLibraryVersion(libraryVersion);
        servicePath = config.getServicePath();
    }

    public MarketplaceWebServiceOrdersClient(
            String accessKey,
            String secretKey,
            MarketplaceWebServiceOrdersConfig config) {
        this(accessKey, secretKey, libraryName, libraryVersion, config);
    }

    public MarketplaceWebServiceOrdersClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        this(accessKey, secretKey, applicationName, 
                applicationVersion, new MarketplaceWebServiceOrdersConfig());
    }

    public com.amazonservices.mws.orders.model.GetOrderResponse getOrder(
            com.amazonservices.mws.orders.model.GetOrderRequest request) {
        return connection.call(
            new RequestType("GetOrder", com.amazonservices.mws.orders.model.GetOrderResponse.class, servicePath),
            request);
    }

    public com.amazonservices.mws.orders.model.GetServiceStatusResponse getServiceStatus(
            com.amazonservices.mws.orders.model.GetServiceStatusRequest request) {
        return connection.call(
            new RequestType("GetServiceStatus", com.amazonservices.mws.orders.model.GetServiceStatusResponse.class, servicePath),
            request);
    }

    public com.amazonservices.mws.orders.model.ListOrderItemsResponse listOrderItems(
            com.amazonservices.mws.orders.model.ListOrderItemsRequest request) {
        return connection.call(
            new RequestType("ListOrderItems", com.amazonservices.mws.orders.model.ListOrderItemsResponse.class, servicePath),
            request);
    }

    public com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenResponse listOrderItemsByNextToken(
            com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListOrderItemsByNextToken", com.amazonservices.mws.orders.model.ListOrderItemsByNextTokenResponse.class, servicePath),
            request);
    }

    public com.amazonservices.mws.orders.model.ListOrdersResponse listOrders(
            com.amazonservices.mws.orders.model.ListOrdersRequest request) {
        return connection.call(
            new RequestType("ListOrders", com.amazonservices.mws.orders.model.ListOrdersResponse.class, servicePath),
            request);
    }

    public com.amazonservices.mws.orders.model.ListOrdersByNextTokenResponse listOrdersByNextToken(
            com.amazonservices.mws.orders.model.ListOrdersByNextTokenRequest request) {
        return connection.call(
            new RequestType("ListOrdersByNextToken", com.amazonservices.mws.orders.model.ListOrdersByNextTokenResponse.class, servicePath),
            request);
    }

    public static String quoteAppName(String s) {
        return MwsUtl.escapeAppName(s);
    }

    public static String quoteAppVersion(String s) {
        return MwsUtl.escapeAppVersion(s);
    }

    public static String quoteAttributeName(String s) {
        return MwsUtl.escapeAttributeName(s);
    }

    public static String quoteAttributeValue(String s) {
        return MwsUtl.escapeAttributeValue(s);
    }

    protected static class RequestType implements MwsRequestType {

        private final String operationName;
        private final Class<? extends com.amazonservices.mws.orders.model.MWSResponse> responseClass;
        private final String servicePath;

        public RequestType(String operationName, Class<? extends com.amazonservices.mws.orders.model.MWSResponse> responseClass, String servicePath) {
            this.operationName = operationName;
            this.responseClass = responseClass;
            this.servicePath = servicePath;
        }

        @Override
        public String getServicePath() {
            return this.servicePath;
        }

        @Override
        public String getOperationName() {
            return this.operationName;
        }

        @Override
        public Class<? extends MwsObject> getResponseClass() {
            return this.responseClass;
        }

        @Override
        public MwsException wrapException(Throwable cause) {
            return new MarketplaceWebServiceOrdersException(cause);
        }

        @Override
        public void setRHMD(MwsObject response, MwsResponseHeaderMetadata rhmd) {
            ((com.amazonservices.mws.orders.model.MWSResponse)response).setResponseHeaderMetadata(new com.amazonservices.mws.orders.model.ResponseHeaderMetadata(rhmd));
        }
    }

}
