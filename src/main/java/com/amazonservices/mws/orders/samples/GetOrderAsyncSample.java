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

import java.util.*;
import java.util.concurrent.*;

/** Sample async call for GetOrder. */
public class GetOrderAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static List<Object> invokeGetOrder(
            com.amazonservices.mws.orders.MarketplaceWebServiceOrdersAsync client,
            List<com.amazonservices.mws.orders.model.GetOrderRequest> requestList) {
        // Call the service async.
        List<Future<com.amazonservices.mws.orders.model.GetOrderResponse>> futureList =
            new ArrayList<Future<com.amazonservices.mws.orders.model.GetOrderResponse>>();
        for (com.amazonservices.mws.orders.model.GetOrderRequest request : requestList) {
            Future<com.amazonservices.mws.orders.model.GetOrderResponse> future =
                client.getOrderAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<com.amazonservices.mws.orders.model.GetOrderResponse> future : futureList) {
            Object xresponse;
            try {
                com.amazonservices.mws.orders.model.GetOrderResponse response = future.get();
                com.amazonservices.mws.orders.model.ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException) {
                    // Exception properties are important for diagnostics.
                    com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException ex =
                        (com.amazonservices.mws.orders.MarketplaceWebServiceOrdersException)cause;
                    com.amazonservices.mws.orders.model.ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        com.amazonservices.mws.orders.MarketplaceWebServiceOrdersAsyncClient client = MarketplaceWebServiceOrdersSampleConfig.getAsyncClient();

        // Create a request list.
        List<com.amazonservices.mws.orders.model.GetOrderRequest> requestList = new ArrayList<com.amazonservices.mws.orders.model.GetOrderRequest>();
        com.amazonservices.mws.orders.model.GetOrderRequest request = new com.amazonservices.mws.orders.model.GetOrderRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        List<String> amazonOrderId = new ArrayList<String>();
        request.setAmazonOrderId(amazonOrderId);
        requestList.add(request);

        // Make the calls.
        GetOrderAsyncSample.invokeGetOrder(client, requestList);

    }

}
