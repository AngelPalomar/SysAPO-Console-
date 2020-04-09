package lists;

import java.util.ArrayList;

import ortopedicosArem.Producto;

public class ListaProductos {
	public ArrayList<Producto> productos;
	
	public ListaProductos() {
		productos = new ArrayList<Producto>();
	}
	
	public void AnadirListaProductos(Producto producto) {
		productos.add(producto);
		System.out.println("¡Producto agregado con éxito!");
	}
	
	public void MostrarProductos() {
		for (Producto producto : productos) {
			System.out.println(producto);
		}
	}
}
