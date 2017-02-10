package eu.doppel_helix.dev.soaphandlerejbandservlet;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebService;

@Stateless
@WebService
@HandlerChain(file = "TestHandlerChain.xml")
public class Endpoint1Ejb {

    @EJB
    private Dependency2 ejbTest2;
    
    public String hallo(String welt) {
        ejbTest2.dummy();
        return "Hallo " + welt + " (EJB)";
    }
}
