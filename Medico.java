
public class Medico extends Persona{
	//Atributos
	private String especialidad;
	public String clave;
	
	//Constructores
	public Medico(String pID, String pNombre, String pEmail, String pEspecialidad){
		super(pID, pNombre, pEmail);
		especialidad = pEspecialidad;
	}
	public Medico(){
		super();
	}
	
	//Metodos
	public void crearClave(String pClave){
		clave = pClave;
	}
	
	public String verificarClave(){
		return clave;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
    
	

}
