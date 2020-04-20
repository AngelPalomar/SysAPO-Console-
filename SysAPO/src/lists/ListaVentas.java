package lists;

import java.util.ArrayList;

import ortopedicosArem.Venta;

/**
 * @author angel
 * Clase que alamacena todas las ventas
 */
public class ListaVentas {
	public ArrayList<Venta> ventas;

	/**
	 * Método para inicializar el arreglo
	 */
	public ListaVentas() {
		ventas = new ArrayList<Venta>();
	}

	/**
	 * @param venta
	 * Método con parámetros para agregar un elemento
	 */
	public void AnadirListaVentas(Venta venta) {
		ventas.add(venta);
		System.out.println("¡Venta agregada con éxito!"); //mensaje que indica que se anadió una venta
	}

	/**
	 * Método para mostrar todos los elementos
	 */
	public void MostrarVentas() { 
		for (Venta venta : ventas) { //recorrido de ventas
			System.out.println(venta);
		}
	}
}
