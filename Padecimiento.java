
public class Padecimiento {

	//Atributos
	private String idPadecimiento;
	private String nombrePadecimiento;
	private String descripcion;

	//Constructores
	public Padecimiento(String pID, String pNPadecimiento){
		idPadecimiento = pID;
		nombrePadecimiento = pNPadecimiento;
		descripcion = " ";
	}

	public Padecimiento(){

	}

	//Getters/Setters
	public void agregarDescripcion(String pDesc){
		descripcion = pDesc;
	}

	public String obtIdPad(){
		return idPadecimiento;
	}

	public String obtNombrePad(){
		return nombrePadecimiento;
	}

	//Metodos
	public String detallePadecimiento(){
		return "ID padecimiento: " + idPadecimiento + ".\n" + "Nombre del padecimiento: " + nombrePadecimiento +".";
	}
}
