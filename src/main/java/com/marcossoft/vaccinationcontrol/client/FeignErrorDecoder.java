//package com.marcossoft.vaccinationcontrol.client;
//
//
//import feign.Response;
//import feign.codec.ErrorDecoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FeignErrorDecoder implements ErrorDecoder {

//    @Override
//    public Exception decode(String s, Response response) {
//        return new RuntimeException("Status Code: "+ response.status() + ", reason: " + response.reason());
//    }

//}