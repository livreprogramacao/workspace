package net.mahtabalam.ws.sib;

import net.mahtabalam.ws.sei.Country;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * CountryImpl is the Service Implementation Bean (SIB) that implements all the methods of the SEI.
 */
@WebService(targetNamespace = "http://ws.mahtabalam.net/")
public class CountryImpl implements Country {
    private Utility states;
    public CountryImpl(){
        states=new Utility();
        states.loadData();
    }
    @WebMethod
    public String getCapital(String stateName) {
        return states.getState(stateName).getCapital();
    }
    @WebMethod
    public String getLanguages(String stateName) {
        return states.getState(stateName).getLanguages();
    }
    @WebMethod
    public String getAirports(String stateName) {
        return states.getState(stateName).getAirports();
    }
    @WebMethod
    public int getDistricts(String stateName) {
        return states.getState(stateName).getDistricts();
    }
    @WebMethod
    public String getPlacesToVisit(String stateName) {
        return states.getState(stateName).getPlacesToVisit();
    }
    @WebMethod
    public String getInterestingFacts(String stateName) {
        return states.getState(stateName).getInterestingFacts();
    }
}