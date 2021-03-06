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
 * MWS Finances Service
 * API Version: 2015-05-01
 * Library Version: 2017-07-26
 * Generated: Tue Jul 25 12:48:56 UTC 2017
 */
package com.amazonservices.mws.finances.samples;

import com.amazonservices.mws.finances.MWSFinancesService;
import com.amazonservices.mws.finances.MWSFinancesServiceClient;
import com.amazonservices.mws.finances.MWSFinancesServiceException;
import com.amazonservices.mws.finances.model.*;


/** Sample call for ListFinancialEventsByNextToken. */
public class ListFinancialEventsByNextTokenSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static ListFinancialEventsByNextTokenResponse invokeListFinancialEventsByNextToken(
            MWSFinancesService client,
            ListFinancialEventsByNextTokenRequest request) {
        try {
            // Call the service.
            ListFinancialEventsByNextTokenResponse response = client.listFinancialEventsByNextToken(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MWSFinancesServiceException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
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
        // Make sure you've set the variables in MWSFinancesServiceSampleConfig.
        MWSFinancesServiceClient client = MWSFinancesServiceSampleConfig.getClient();

        // Create a request.
        ListFinancialEventsByNextTokenRequest request = new ListFinancialEventsByNextTokenRequest();
        String sellerId = "example";
        request.setSellerId(sellerId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String nextToken = "example";
        request.setNextToken(nextToken);

        // Make the call.
        ListFinancialEventsByNextTokenSample.invokeListFinancialEventsByNextToken(client, request);

    }

}
