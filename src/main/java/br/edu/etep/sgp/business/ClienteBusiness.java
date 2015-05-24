package br.edu.etep.sgp.business;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import br.edu.etep.sgp.entity.Cliente;

public class ClienteBusiness {

	@Inject
	private Cliente cliente;
		
	public List<Cliente> listarCliente(){
		
		return Arrays.asList(
				new Cliente(1l,"Projeto64", "Hugo HABregagnoli", "Hugo Almeida", "hugo@hugo.com", "98188-8888"), 
				new Cliente(2l, "ThinkDroid", "Bruno Henrique", "Rad Bruno", "bruno@rad.com", "09999-9999")
				);
		
	}
	
	
	
	
}
