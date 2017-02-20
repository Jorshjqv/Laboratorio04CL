import java.io.*;
public class UI {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;

	public static void main(String[] args)throws IOException{
		String sDato, opcion, identificador, numExpediente, nPaciente;
		char cDato;
		int iDato;
		int[] controlInd;


		Cita tmpCita;
		Medico tmpMedico;
		Paciente tmpPaciente;
		ExpedientePaciente tmpExpediente;
		Padecimiento tmpPadecimiento;
		boolean terminado;

		CL coleccion = new CL();
		coleccion.setListadoExpedientes(new ExpedientePaciente[50]);
		coleccion.setListadoCitas(new Cita[50]);
		coleccion.setListadoMedicos(new Medico[50]);
		coleccion.setListadoPacientes(new Paciente [50]);
		coleccion.setListadoPadecimientos(new Padecimiento[50]);
		controlInd = new int[50];
		terminado = false;

		while(terminado == false){
			cDato = tipoUsuario();
			switch(cDato){
			case 'm':
				identificador = obtIdentificador("su codigo de Medico");
				if(autenticarMedico(coleccion.getListadoMedicos())){
					sDato = menuMedico();
					iDato = obtIndListMedicos(coleccion.getListadoMedicos(), identificador);
					controlInd[iDato] = iDato;
					imprimirListaCitas(coleccion.getListadoCitas());
					switch(sDato){
					case "1":
						sDato = menuCitas();
						switch(sDato){
						case "1":
							coleccion.getListadoCitas()[iDato].verCita();
							break;
						case "2":
							//TODO
							String nombrePaciente, nMedico, fecha, id;
							nombrePaciente = leerDato("el nombre completo del paciente");
							nMedico = leerDato("el nombre completo del medico");
							fecha = leerDato("la fecha y hora de la cita (dd/mm/aa, hh:mm.am/pm");
							id = leerDato("El # de identificacion de la cita");
							
							tmpCita = new Cita(id, fecha, nombrePaciente, nMedico);
							
							imprimirDato("La cita ha sido guardada exitosamente.");
							break;
						default:
							imprimirDato("Opcion invalida. Intente de nuevo");
							break;
						}
					case "2":
						sDato = menuExpedientes();
						numExpediente = leerDato("el numero de expediente del Paciente");
						nPaciente = leerDato("el nombre del paciente");
						
						switch(sDato){
						case "1":
							imprimirDetalleExpediente(coleccion.getListadoExpedientes(), numExpediente, iDato, coleccion.getListadoExpedientes()[iDato].getPadecimientosSufridos());
							break;
						case "2":
							imprimirLisCitaExp(coleccion.getListadoExpedientes()[iDato].getCitasPaciente());
							break;
						default:
							imprimirDato("Opcion Invalida. Intente de nuevo");
							break;
						}
					case "3":
						sDato = menuListaPacientes();
						switch(sDato){
						    case "1":
						    	imprimirLisPacientes(coleccion.getListadoPacientes());
						    	break;
						    case "2":
						    	//TODO
						    	break;
						    default:
						    	imprimirDato("Opcion invalida. Intente de nuevo.");
						    	break;
						}
					case "4":
						sDato = menuPadecimientos();
						switch(sDato){
						    case "1":
						    	imprimirLisPadecimientos(coleccion.getListadoPadecimientos());
						    	break;
						    case "2":
						    	//TODO
						    	break;
						    default:
						    	imprimirDato("Opcion invalida. Intente de nuevo.");
						    	break;
						}
					case "5":
						terminado = true;
						break;
					}
				}else{
					imprimirDato("Sus entradas no corresponden con la informacion guardada. Hasta luego!");
				}
			case 'p':
				identificador = obtIdentificador("su numero de seguro social");
                iDato = obtIndListPacientes(coleccion.getListadoPacientes(),identificador);
				if(autenticarPaciente(coleccion.getListadoPacientes())){
					imprimirDetalleExpediente(coleccion.getListadoExpedientes(), coleccion.getListadoExpedientes()[iDato].getIdExpediente(), iDato, coleccion.getListadoExpedientes()[iDato].getPadecimientosSufridos());
					sDato = menuPaciente();
					switch(sDato){
					    case "1":
					    	imprimirLisCitaExp(coleccion.getListadoExpedientes()[iDato].getCitasPaciente());
					    	break;
					    case "2":
					    	imprimirDato(coleccion.getListadoExpedientes()[iDato].getCitasPaciente()[iDato].verCita());
					    	break;
					    case "3":
					    	terminado = true;
					    	break;
					    default:
					    	imprimirDato("Opcion Invalida. Intente de nuevo.");
					    	break;
					}
				}
			}
		}


	}

	public static String menuMedico()throws IOException{
		String opcion;
		out.println("Escoja la opcion que desee utilizar:");
		out.println("1.Mostrar listado de citas.");
		out.println("2.Mostrar listado de expedientes.");
		out.println("3.Mostrar listado de pacientes.");
		out.println("4.Mostrar listado de padecimientos.");
		out.println("5.Salir.");
		opcion = in.readLine();

		return opcion;
	}

	public static String menuPaciente()throws IOException{
		String opcion;
		out.println("Escoja la opcion que desee utilizar:");
		out.println("1.Consulta de expediente");
		opcion = in.readLine();
		
		out.println("Escoja la opcion que desee utilizar:");
		out.println("1.Ver citas por fecha.");
		out.println("2.Ver detalle de cita.");
		out.println("3.Salir.");

		return opcion;
	}
	public static String menuCitas()throws IOException{
		String opcion;
		out.println("Escoja la opcion que desee utilizar:\n");
		out.println("1.Ver detalle de cita.\n");
		out.println("2.Ingresar nueva cita.\n");
		opcion = in.readLine();

		return opcion;
	}

	public static String menuExpedientes()throws IOException{
		String opcion;
		out.println("Escoja la opcion que desee utilizar:");
		out.println("1.Ver detalle expediente");
		out.println("2.Ver listado de citas del paciente.");
		out.println("3.Agregar padecimiento al paciente");
		opcion = in.readLine();

		return opcion;
	}

	public static String menuListaPacientes()throws IOException{
		String opcion;
		out.println("Escoja la opcion que desee utilizar:");
		out.println("1.Agregar cita a paciente.");
		opcion = in.readLine();

		return opcion;
	}

	public static String menuPadecimientos()throws IOException{
		String opcion;
		out.println("Escoja la opcion que desee utilizar:");
		out.println("1.Ver listado de padecimientos.");
		out.println("2.Agregar padecimiento");
		opcion = in.readLine();

		return opcion;
	}
	public static String leerDato(String pMsj)throws IOException{
		String dato;

		out.println("Ingrese " + pMsj + ":");
		dato = in.readLine();

		return dato;
	}
	public static void imprimirDato(String pMsj){
		out.println(pMsj);
	}

	public static boolean autenticarMedico(Medico[] pLista)throws IOException{
		String dato;
		boolean autenticado = false;
		int indice;

		dato = leerDato("su clave personal");
		indice = obtIndListMedicos(pLista, dato);

		if(dato.equals(pLista[indice].verificarClave())){
			autenticado = true;
		}else{
			imprimirDato("Clave incorrecta. Intente de nuevo.");
		}

		return autenticado;
	}

	public static boolean autenticarPaciente(Paciente[] pLista)throws IOException{
		String dato;
		boolean autenticado = false;
		int indice;

		dato = leerDato("su clave personal");
		indice = obtIndListPacientes(pLista, dato);

		if(dato.equals(pLista[indice].verificarClave())){
			autenticado = true;
		}else{
			imprimirDato("Clave incorrecta. Intente de nuevo.");
		}

		return autenticado;
	}

	public static String obtIdentificador(String pMsj)throws IOException{
		String dato;
		dato = leerDato(pMsj);

		return dato;
	}

	public static char tipoUsuario()throws IOException{
		char opcion;

		opcion = leerDato("si es Medico o Paciente").charAt(0);
		return opcion;

	}

	public static int obtIndListPacientes(Paciente[] pLista, String pDato){
		int cont = 0;
		int indice = 0;
		for(Paciente id : pLista){
			if(id.getIdentificador().equals(pDato)){
				indice = cont;
			}
			cont ++;
		}
		return indice;

	}

	public static int obtIndListMedicos(Medico[] pLista, String pDato){
		int cont = 0;
		int indice = 0;
		for(Medico id : pLista){
			if(id.getIdentificador().equals(pDato)){
				indice = cont;
			}
			cont ++;
		}
		return indice;

	}
	public static int obtIndLisExpedientes(ExpedientePaciente[] pLista, String pDato){
		int cont = 0;
		int indice = 0;
		for(ExpedientePaciente id : pLista){
			if(id.equals(pDato)){
				indice = cont;
			}
			cont ++;
		}
		return indice;
	}
	public static int obtIndLisCitas(Cita[] pLista, String pDato){
		int cont = 0;
		int indice = 0;
		for(Cita id : pLista){
			if(id.equals(pDato)){
				indice = cont;
			}
			cont ++;
		}
		return indice;
	}
	public static int obtIndLisPadecimientos(Padecimiento[] pLista, String pDato){
		int cont = 0;
		int indice = 0;
		for(Padecimiento id : pLista){
			if(id.equals(pDato)){
				indice = cont;
			}
			cont ++;
		}
		return indice;
	}

	public static void imprimirListaCitas(Cita[] pLista)throws IOException{

		for(Cita id : pLista){
			imprimirDato(id.obtPaciente());
			imprimirDato(id.obtFechaCita());
		}

	}

	public static void imprimirListaExpedientes(ExpedientePaciente[] pListaE, Paciente[] pListaP){
		
		for(ExpedientePaciente id : pListaE){
			for(Paciente pId : pListaP){
				imprimirDato(pId.getNombreCompleto());	
			}
			imprimirDato(id.getIdExpediente());
		}
	}

	public static void imprimirDetalleExpediente(ExpedientePaciente[] pLis, String pNumExp, int pInd, Padecimiento[] pSufridos){
		imprimirDato(pLis[pInd].getFechaNacimiento());
		imprimirDato(pLis[pInd].getnSeguroSocial());
		imprimirDato(pLis[pInd].getTipoSangre());

		for(Padecimiento pLisPad : pSufridos){
			imprimirDato(pLisPad.obtNombrePad());
		}

	}
	
	public static void imprimirLisCitaExp(Cita[] pLis){
		for(Cita pCita : pLis){
			imprimirDato(pCita.obtFechaCita());
			imprimirDato(pCita.obtIdCita());
		}
	}
	
	public static void imprimirLisPacientes(Paciente[] pLis){
		for(Paciente pPaciente : pLis){
			imprimirDato(pPaciente.detallePaciente());
		}
	}
	
	public static void imprimirLisPadecimientos(Padecimiento[] pLis){
		for(Padecimiento pPadecimiento : pLis){
			imprimirDato(pPadecimiento.detallePadecimiento());
		}
	}



}
