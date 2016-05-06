package net.mahtabalam.ws.wsclient;

import net.mahtabalam.ws.sib.CountryImpl;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CountryImplService", targetNamespace = "http://ws.mahtabalam.net/", wsdlLocation = "http://localhost:8080/SOAPWithJaxWS/discoverIndia?wsdl")
public class CountryImplService
    extends Service
{

    private final static URL COUNTRYIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException COUNTRYIMPLSERVICE_EXCEPTION;
    private final static QName COUNTRYIMPLSERVICE_QNAME = new QName("http://ws.mahtabalam.net/", "CountryImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAPWithJaxWS/discoverIndia?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COUNTRYIMPLSERVICE_WSDL_LOCATION = url;
        COUNTRYIMPLSERVICE_EXCEPTION = e;
    }

    public CountryImplService() {
        super(__getWsdlLocation(), COUNTRYIMPLSERVICE_QNAME);
    }

    public CountryImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COUNTRYIMPLSERVICE_QNAME, features);
    }

    public CountryImplService(URL wsdlLocation) {
        super(wsdlLocation, COUNTRYIMPLSERVICE_QNAME);
    }

    public CountryImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COUNTRYIMPLSERVICE_QNAME, features);
    }

    public CountryImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountryImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CountryImpl
     */
    @WebEndpoint(name = "CountryImplPort")
    public CountryImpl getCountryImplPort() {
        return super.getPort(new QName("http://ws.mahtabalam.net/", "CountryImplPort"), CountryImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryImpl
     */
    @WebEndpoint(name = "CountryImplPort")
    public CountryImpl getCountryImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.mahtabalam.net/", "CountryImplPort"), CountryImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COUNTRYIMPLSERVICE_EXCEPTION!= null) {
            throw COUNTRYIMPLSERVICE_EXCEPTION;
        }
        return COUNTRYIMPLSERVICE_WSDL_LOCATION;
    }

}
