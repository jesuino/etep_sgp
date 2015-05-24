package br.edu.etep.sgp.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/hello")
public class HelloServices {

	@GET
	public String sayHello(){
		return "Ola Mundo";
		
	}
	
	
}
