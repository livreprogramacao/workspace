package net.mahtabalam.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
* Implementing the Web Service
*
* Here is the Service Endpoint Interface (SEI) for the service
*/
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
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
