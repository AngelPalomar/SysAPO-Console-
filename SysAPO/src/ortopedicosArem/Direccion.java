package ortopedicosArem;

public class Direccion {
	private String calle;
	private String numeroInterior;
	private String numeroExterior;
	private String cp;
	private String colonia;
	private String municipio;
	private String estado;
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumeroInterior() {
		return numeroInterior;
	}
	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}
	public String getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return calle + " #" + numeroExterior + "-" + numeroInterior + " " 
	+ colonia + " " + ", " + cp + " " + municipio +
	", " + estado;
	}
	
	
}
