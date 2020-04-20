package ortopedicosArem;

/**
 * @author angel
 * Clase para formato de direcciones
 *
 */
public class Direccion {
	private String calle;
	private String numeroInterior;
	private String numeroExterior;
	private String cp;
	private String colonia;
	private String municipio;
	private String estado;

	/**
	 * Constructor por defecto
	 */
	public Direccion() {

	}

	/**
	 * @param calle
	 * @param numeroInterior
	 * @param numeroExterior
	 * @param cp
	 * @param colonia
	 * @param municipio
	 * @param estado         Constructor sobrecargado
	 */
	public Direccion(String calle, String numeroInterior, String numeroExterior, String cp, String colonia,
			String municipio, String estado) {

		setCalle(calle);
		setNumeroInterior(numeroInterior);
		setNumeroExterior(numeroExterior);
		setCp(cp);
		setColonia(colonia);
		setMunicipio(municipio);
		setEstado(estado);

	}

	// Setters y getters
	/**
	 * @return
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return
	 */
	public String getNumeroInterior() {
		return numeroInterior;
	}

	/**
	 * @param numeroInterior
	 */
	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	/**
	 * @return
	 */
	public String getNumeroExterior() {
		return numeroExterior;
	}

	/**
	 * @param numeroExterior
	 */
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	/**
	 * @return
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * @param cp
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * @return
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * @param colonia
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * @return
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Calle " + calle + " #" + numeroExterior + "-" + numeroInterior + " " + colonia + " " + ", " + cp + " "
				+ municipio + ", " + estado;
	}

}
