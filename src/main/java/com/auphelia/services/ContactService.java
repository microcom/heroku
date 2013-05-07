package com.auphelia.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.auphelia.models.Contact;

@Path("/contact")
public class ContactService {

	@GET()
	@Produces("application/json; charset=UTF-8")
	public Response sayHello() {
		Contact c = new Contact("Massi", "AZAMOUM", "rue jean-talon", "Montréal", "QC", "H2L 1X7");
		
		ResponseBuilder builder = Response.ok(c);
		builder.language("fr").header("Access-Control-Allow-Origin", "*");
		return builder.build();
	}
}
