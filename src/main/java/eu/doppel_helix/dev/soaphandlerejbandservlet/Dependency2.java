
package eu.doppel_helix.dev.soaphandlerejbandservlet;

import java.util.logging.Logger;
import javax.ejb.Stateless;

@Stateless
public class Dependency2 {
    
    private static final Logger LOG = Logger.getLogger(Dependency1.class.getName());
    
    public void dummy() {
        LOG.info("Dependency2#dummy called");
    }
}
