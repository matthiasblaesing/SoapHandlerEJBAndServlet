
package eu.doppel_helix.dev.soaphandlerejbandservlet;

import java.util.Collections;
import java.util.Set;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


public class TestHandler implements SOAPHandler<SOAPMessageContext> {

    private static final Logger LOG = Logger.getLogger(TestHandler.class.getName());
    
    @Override
    public boolean handleMessage(SOAPMessageContext messageContext) {
        SOAPMessage msg = messageContext.getMessage();
        LOG.info("Handler was called");
        return true;
    }
    
    @Override
    public Set<QName> getHeaders() {
        return Collections.EMPTY_SET;
    }
    
    @Override
    public boolean handleFault(SOAPMessageContext messageContext) {
        return true;
    }
    
    @Override
    public void close(MessageContext context) {
    }
    
}
