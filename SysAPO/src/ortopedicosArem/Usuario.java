package ortopedicosArem;

public class Usuario {
	private int idUsuario;
	private int tipoUsuario;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String contrasena;
	private String correoUsuario;
	private String telefonoUsuario;
	private Direccion direccionUsuario;

	public Usuario() {
		direccionUsuario = new Direccion();
	}
	
	public Usuario(int idUsuario, int tipoUsuario, String 
			nombreUsuario, String apellidoUsuario, String contrasena, String correoUsuario,
			String telefonoUsuario, String calle, String numeroInterior, String numeroExterior, String cp, String colonia,
			String municipio, String estado) {
		
		this.idUsuario = idUsuario;
		this.tipoUsuario = tipoUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.contrasena = contrasena;
		this.correoUsuario = correoUsuario;
		this.telefonoUsuario = telefonoUsuario;
		
		direccionUsuario.setCalle(calle);
		direccionUsuario.setNumeroInterior(numeroInterior);
		direccionUsuario.setNumeroExterior(numeroExterior);
		direccionUsuario.setCp(cp);
		direccionUsuario.setColonia(colonia);
		direccionUsuario.setMunicipio(municipio);
		direccionUsuario.setEstado(estado);
	}

	private void RegistrarUsuario() {
		
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public Direccion getDireccionUsuario() {
		return direccionUsuario;
	}

	public void setDireccionUsuario(String calle, String numeroInterior, String numeroExterior, String cp, String colonia,
			String municipio, String estado) {
		
		direccionUsuario.setCalle(calle);
		direccionUsuario.setNumeroInterior(numeroInterior);
		direccionUsuario.setNumeroExterior(numeroExterior);
		direccionUsuario.setCp(cp);
		direccionUsuario.setColonia(colonia);
		direccionUsuario.setMunicipio(municipio);
		direccionUsuario.setEstado(estado);
		
	}
	
	@Override
	public String toString() {
		return "> ID de usuario: " + idUsuario + " Tipo de usuario: " + tipoUsuario +  " Nombre: " + 
	nombreUsuario + " " + apellidoUsuario + " Contraseña: " + contrasena + " E-mail: " + 
				correoUsuario + " Teléfono: " + telefonoUsuario + " Dirección: "  + direccionUsuario;
	}

}
