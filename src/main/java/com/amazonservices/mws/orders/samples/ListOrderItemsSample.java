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
package com.amazonservices.mws.orders.samples;


/** Sample call for ListOrderItems. */
public class ListOrderItemsSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static com.amazonservices.mws.orders.model.ListOrderItemsResponse invokeListOrderItems(
            com.amazonservices.mws.orders.MarketplaceWebServiceOrders client,
            com.amazonservices.mws.orders.model.ListOrderItemsRequest request) {
        try {
            // Call the service.
            com.amazonservices.mws.orders.model.ListOrderItemsResponse response = client.listOrderItems(request);
            com.amazonservices.mws.orders.model.ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            com.amazonservices.mws.orders.model.ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
            if(rhmd != null) {
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
            }
            System.out.println("Message: "+ex.getMessage());
            System.out.println("StatusCode: "+ex.getStatusCode());
            System.out.println("ErrorCode: "+ex.getErrorCode());
            System.out.println("ErrorType: "+ex.getErrorType());
            throw ex;
        }
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        // Make sure you've set the variables in MarketplaceWebServiceOrdersSampleConfig.
        com.amazonservices.mws.orders.MarketplaceWebServiceOrdersClient client = MarketplaceWebServiceOrdersSampleConfig.getClient();

        // Create a request.
        com.amazonservices.mws.orders.model.ListOrderItemsRequest request = new com.amazonservices.mws.orders.model.ListOrderItemsRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String amazonOrderId = "example";
        request.setAmazonOrderId(amazonOrderId);

        // Make the call.
        ListOrderItemsSample.invokeListOrderItems(client, request);

    }

}
