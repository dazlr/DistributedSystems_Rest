package myApp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class Hello {

	//This method is called if TEXT_PLAIN is requested
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey - Plain Text";
	}
	
	//This method is called if XML is requested
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version =\"1.0\"?>" + "<hello> Hello Jersey XML" + "</hello>";
			
	}
	
	//This method is called if HTML is requested
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html>" + "<title>" +"Hello Jersey" + "</title>"
	+"<body><h1>" +"Hello Jersey HTML"+ "</body></h1>" + "</html>";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJsonHello() {
		return "{ \"Name\": \"John\" }";
	
	}

}
