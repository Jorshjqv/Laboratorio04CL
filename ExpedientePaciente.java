

public class ExpedientePaciente {
    
    //Atributos 
    private String idExpediente;
    private String fechaNacimiento;
    private String nSeguroSocial;
    private String tipoSangre;
    public Padecimiento[] padecimientosSufridos;
    public Cita[] citasPaciente;
    
    //Constructores
    public ExpedientePaciente(String pID, String pNSS, String pFechaNac){
    	idExpediente = pID;
        nSeguroSocial = pNSS;
        fechaNacimiento = pFechaNac;
        tipoSangre = " ";
    }
    public ExpedientePaciente(){
    	
    }
    
    //Getters/Setters
	public String getIdExpediente() {
		return idExpediente;
	}
	public void setIdExpediente(String idExpediente) {
		this.idExpediente = idExpediente;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getnSeguroSocial() {
		return nSeguroSocial;
	}
	public void setnSeguroSocial(String nSeguroSocial) {
		this.nSeguroSocial = nSeguroSocial;
	}
	public String getTipoSangre() {
		return tipoSangre;
	}
	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	public Padecimiento[] getPadecimientosSufridos() {
		return padecimientosSufridos;
	}
	public void setPadecimientosSufridos(Padecimiento[] pSufridos) {
		this.padecimientosSufridos = pSufridos;
	}
	public Cita[] getCitasPaciente() {
		return citasPaciente;
	}
	public void setCitasPaciente(Cita[] citasPaciente) {
		this.citasPaciente = citasPaciente;
	}
    
	//Metodos
    
    
}
