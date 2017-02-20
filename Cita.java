
public class Cita {
    
	//Atributos
	private String idCita;
	private String fecha;
	private String paciente;
	private String medico;
	private String descripcion;
	private String resultado;
    
	//Constructores
	public Cita(String pID, String pFecha, String pPaciente, String pMedico){
		idCita = pID;
		fecha = pFecha;
		paciente = pPaciente;
		medico = pMedico;
		descripcion = " ";
		resultado = " ";
	}
	
	public Cita(){
		
	}
	
	//Getters/Setters
	public void agregarDescripcion(String pDesc){
		descripcion = pDesc;
	}
	public void agregarResultado(String pResul){
		resultado = pResul;
	}
	
	public String obtIdCita(){
		return idCita;
	}
	public String obtFechaCita(){
		return fecha;
	}
	
	public String obtPaciente(){
		return this.paciente;
	}
	
	//Metodos
	public String verCita(){
		return idCita + "-" + fecha + "-" + paciente + "-" + medico + "-" + descripcion + "-" + resultado + "\n";
	}
	
	
}
