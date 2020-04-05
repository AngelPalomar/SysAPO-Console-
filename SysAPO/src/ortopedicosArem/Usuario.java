package ortopedicosArem;

public class Usuario {
	private int idUsuario;
	private int tipoUsuario;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String contraseña;
	private String correoUsuario;
	private String telefonoUsuario;
	private Direccion direccionUsuario;

	public Usuario() {
		// TODO Auto-generated constructor stub
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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

	public void setDireccionUsuario(Direccion direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}

}
