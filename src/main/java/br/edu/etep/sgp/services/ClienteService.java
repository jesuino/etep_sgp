package br.edu.etep.sgp.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.edu.etep.sgp.business.ClienteBusiness;
import br.edu.etep.sgp.entity.Cliente;



@Path("/cliente")
public class ClienteService {

	@Inject
	ClienteBusiness clienteBusiness;
	
	
	@GET
	@Path("listar")
	public Response ListarClientes(){
	
		List<Cliente> clientes = clienteBusiness.listarCliente();
		
		if(clientes == null){
			return Response.serverError().build();
		}
		
		return Response.ok(clientes, MediaType.APPLICATION_JSON).build();
	}
	
}
