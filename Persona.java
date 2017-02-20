
public class Persona {
	
	//Atributos
	private String identificador;
    private String nombreCompleto;
    private String email;
    
    //Constructores
    public Persona(String pID, String pNombre, String pEmail){
    	this.identificador = pID;
    	this.nombreCompleto = pNombre;
    	this.email = pEmail;
    }
    public Persona(){
    	
    }
    
    //Getters/Setters
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
