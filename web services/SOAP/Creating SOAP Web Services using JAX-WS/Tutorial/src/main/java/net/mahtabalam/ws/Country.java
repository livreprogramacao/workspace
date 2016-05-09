package net.mahtabalam.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
* Implementing the Web Service
*
* Here is the Service Endpoint Interface (SEI) for the service
*/
@WebService
public interface Country {

    @WebMethod
    String getCapital(String s);

    @WebMethod
    String getLanguages(String s);

    @WebMethod
    String getAirports(String s);

    @WebMethod
    int getDistricts(String s);

    @WebMethod
    String getPlacesToVisit(String s);

    @WebMethod
    String getInterestingFacts(String s);
}
