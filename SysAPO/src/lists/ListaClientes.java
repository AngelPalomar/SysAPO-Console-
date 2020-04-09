package lists;

import java.util.ArrayList;

import ortopedicosArem.Cliente;

public class ListaClientes {
	
	public ArrayList<Cliente> clientes;
	
	public ListaClientes() {
		clientes = new ArrayList<Cliente>();
	}
	
	public void AnadirListaClientes(Cliente cliente) {
		clientes.add(cliente);
		System.out.println("¡Cliente agregado con éxito!");
	}
	
	public void MostrarClientes() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
	
}
