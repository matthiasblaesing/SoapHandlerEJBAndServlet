package eu.doppel_helix.dev.soaphandlerejbandservlet;

import javax.ejb.EJB;
import javax.jws.WebService;

@WebService
public class Endpoint2Servlet {

    @EJB
    private Dependency1 ejbTest;
    
    public String hallo(String welt) {
        ejbTest.dummy();
        return "Hallo " + welt + " (Servlet)";
    }
}
