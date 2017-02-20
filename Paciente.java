

public class Paciente extends Persona{
    
	//Atributos
    private String direccion;
    private String telefono;
    private String clave;
    //Constructores
    public Paciente(String pSS, String pNombre, String pEmail){
    	super(pSS, pNombre, pEmail);
    }
    public Paciente(){
    	super();
    }
    
    //Getters/Setters
    public void agregarDireccion(String pDir){
    	direccion = pDir;
    }
    
    public String obtDireccion(){
    	return direccion;
    }
    
    public void agregarTelefono(String pTel){
    	telefono = pTel;
    }
    
    public String obtTelefono(){
    	return telefono;
    }
    
    public String verificarClave(){
    	return this.clave;
    }
    
    public void establecerClave(String pClave){
    	this.clave = pClave;
    }
    //Metodos
    public String detallePaciente(){
    	return "Numero Seguro Social: " + this.getIdentificador() + ".\n" + "Nombre: " + this.getNombreCompleto() + ".";
    }
}
