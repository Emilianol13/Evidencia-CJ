import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        boolean cierre = false;
        Doctor doctor = new Doctor();
        Paciente paciente = new Paciente();
        Cita cita = new Cita();
        Admin admin = new Admin();
        ArrayList<Doctor> doc= new ArrayList<Doctor>();
        ArrayList<Paciente> pac = new ArrayList<Paciente>();
        ArrayList<Cita> listaCitas = new ArrayList<Cita>();
        while (!cierre) {
            System.out.println("Bienvenido al sistema de índole médica, seleccione su rol: ");
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("3. Cita");
            System.out.println("4. Administrador");
            System.out.println("5. Salir");
            System.out.print("Favor de ingresar una opción: ");
            int opcionU = scanner.nextInt();
            switch (opcionU) {
                case 1:
                    System.out.println("Bienvenido doctor, ¿Qué desea hacer? \n1) Agregar doctor \n2) Visualizar la lista de doctores");
                int resp = scanner.nextInt();
                if(resp==1) {
                    System.out.println("Favor de ingresar el nombre del doctor: ");
                    String nC = scanner.next();
                    System.out.println("Favor de ingresar la especialidad del doctor: ");
                    String eC = scanner.next();
                    doctor.agregarDoctor(nC, eC, doc);
                } else if (resp==2) {
                    doctor.mostrarDoctors(doc);
                }
                    break;
                case 2:
                    System.out.println("Bienvenido paciente, ¿Qué desea hacer? \n1) Agregar paciente \n2) Visualizar la lista de pacientes");
                    int resp2 = scanner.nextInt();
                    if(resp2==1) {
                        System.out.println("Favor de ingresar el nombre del paciente: ");
                        String nC = scanner.next();
                        paciente.agregarPaciente(nC, pac);
                    } else if (resp2==2) {
                        paciente.mostrarPacientes(pac);

                    }
                    break;
                case 3:
                    System.out.println("Bienvenido al sistema de citas, ¿Qué desea hacer? \n1) Crear cita \n2) Cnacelar cita \n3) Modificar cita");
                    int resp3 = scanner.nextInt();
                    if(resp3==1) {
                        cita.crearCita(listaCitas);
                    } else if (resp3==2) {
                        System.out.println("Favor de ingresar el motivo de cancelación: ");
                        String mC = scanner.next();
                        System.out.println("Favor de ingresar la fecha de su cita: ");
                        String fC = scanner.next();
                        System.out.println("Favor de ingresar la hora de su cita: ");
                        String hC = scanner.next();
                        cita.cancelarCita(mC, fC, hC);
                    } else if (resp3==3) {
                        System.out.println("Favor de ingresar el motivo de cancelación: ");
                        String mC = scanner.next();
                        System.out.println("Favor de ingresar la fecha de su cita: ");
                        String fC = scanner.next();
                        System.out.println("Favor de ingresar la hora de su cita: ");
                        String hC = scanner.next();
                        cita.modificarCita(mC, fC, hC);
                    }
                    break;
                case 4:
                    System.out.println("Bienvenido al sistema admin, ¿Qué desea hacer? \n1) Iniciar sesión \n2) Consultar permisos \n3) Generar credenciales");
                    int resp4 = scanner.nextInt();
                    if(resp4==1) {
                        System.out.println("Favor de ingresar su usuario: ");
                        String usuario = scanner.next();
                        System.out.println("Favor de ingresar su contraseña: ");
                        String cont = scanner.next();
                        admin.login(usuario, cont);
                    } else if (resp4==2) {
                        admin.verificarPermisos();
                    } else if (resp4==3) {
                        admin.generarCredenciales();
                    }
                    ;
                    break;
                case 5:
                    cierre= true;
                    break;
                default:
                    System.out.println("Opción incorrecta, favor de ingresar una opción válida");
                    break;
            }
        }
        scanner.close();
    }
}
