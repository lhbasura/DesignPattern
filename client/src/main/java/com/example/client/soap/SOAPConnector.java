package com.example.client.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class SOAPConnector<OutputMessageType> extends WebServiceGatewaySupport {

    public Object callWebService(String url, Object request){
        Object response=getWebServiceTemplate().marshalSendAndReceive(url, request);
        return response;
    }
}
