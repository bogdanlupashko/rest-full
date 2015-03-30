package org.bl.rest.jax;

/**
 * Created by blupashko on 26.03.2015.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
    //  TEXT_PLAIN  request
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayPlainTextHello() {
//        return "Hello Jersey";
//    }
//
//    //  XML  request
//    @GET
//    @Produces(MediaType.TEXT_XML)
//    public String sayXMLHello() {
//        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
//    }

    //  HTML  request
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
    }

}
