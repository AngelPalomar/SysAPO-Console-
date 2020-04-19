package ortopedicosArem;

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
	 * @param anio
	 * Constructor compuesto
	 */
	public Fecha(int dia, int mes, int anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}

	//Setters y getters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String toString() {
		return dia + "/" + mes + "/" + anio + " ";
	}

}
