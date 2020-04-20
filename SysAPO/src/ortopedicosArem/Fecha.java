package ortopedicosArem;

/**
 * @author angel
 * Clase para formato de fechas
 */
public class Fecha {
	private int dia, mes, anio;

	/**
	 * Constructor principal
	 */
	public Fecha() {

	}

	/**
	 * @param dia
	 * @param mes
	 * @param anio Constructor sobrecargado
	 */
	public Fecha(int dia, int mes, int anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}

	// Setters y getters
	/**
	 * @return
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio + " ";
	}

}
