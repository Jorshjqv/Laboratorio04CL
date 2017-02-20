

public class CL {

	//Atributos
	private Medico[]  listadoMedicos;
	private Paciente[] listadoPacientes;
	private Cita[] listadoCitas;
	private Padecimiento[] listadoPadecimientos;
	private ExpedientePaciente[] listadoExpedientes;

	//Constructores
	public CL(Medico[] pLisM, Paciente[] pLisP, Cita[] pLisC, Padecimiento[] pLisPad, ExpedientePaciente[] pLisE){
		this.listadoMedicos = pLisM;
		this.listadoPacientes = pLisP;
		this.listadoCitas = pLisC;
		this.listadoPadecimientos = pLisPad;
		this.listadoExpedientes = pLisE;
	}
	public CL(){

	}
	
	//Getters/Setters
	public Medico[] getListadoMedicos() {
		return listadoMedicos;
	}
	public void setListadoMedicos(Medico[] listadoMedicos) {
		this.listadoMedicos = listadoMedicos;
	}
	public Paciente[] getListadoPacientes() {
		return listadoPacientes;
	}
	public void setListadoPacientes(Paciente[] listadoPacientes) {
		this.listadoPacientes = listadoPacientes;
	}
	public Cita[] getListadoCitas() {
		return listadoCitas;
	}
	public void setListadoCitas(Cita[] listadoCitas) {
		this.listadoCitas = listadoCitas;
	}
	public Padecimiento[] getListadoPadecimientos() {
		return listadoPadecimientos;
	}
	public void setListadoPadecimientos(Padecimiento[] listadoPadecimientos) {
		this.listadoPadecimientos = listadoPadecimientos;
	}
	public ExpedientePaciente[] getListadoExpedientes() {
		return listadoExpedientes;
	}
	public void setListadoExpedientes(ExpedientePaciente[] listadoExpedientes) {
		this.listadoExpedientes = listadoExpedientes;
	}
    
	//Metodos
	
}