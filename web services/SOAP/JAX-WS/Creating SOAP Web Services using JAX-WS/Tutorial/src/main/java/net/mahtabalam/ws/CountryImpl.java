package net.mahtabalam.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * CountryImpl is the Service Implementation Bean (SIB) that implements all the
 * methods of the SEI.
 */
@WebService()
@SOAPBinding(style = Style.RPC, use=Use.LITERAL, parameterStyle= ParameterStyle.WRAPPED)
public class CountryImpl implements Country {

    private Utility states;

    public CountryImpl() {
        states = new Utility();
        states.loadData();
    }

    @WebMethod
    @Override
    public String getCapital(@WebParam(name = "arg0www") String stateName) {
        return states.getState(stateName).getCapital();
    }

    @WebMethod
    @Override
    public String getLanguages(String stateName) {
        return states.getState(stateName).getLanguages();
    }

    @WebMethod
    @Override
    public String getAirports(String stateName) {
        return states.getState(stateName).getAirports();
    }

    @WebMethod
    @Override
    public int getDistricts(String stateName) {
        return states.getState(stateName).getDistricts();
    }

    @WebMethod
    @Override
    public String getPlacesToVisit(String stateName) {
        return states.getState(stateName).getPlacesToVisit();
    }

    @WebMethod
    @Override
    public String getInterestingFacts(String stateName) {
        return states.getState(stateName).getInterestingFacts();
    }
}
