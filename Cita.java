import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cita {

    //DEFINICIÓN DE LAS VARIABLES DE USO DEL SISTEMA
    private String nombreDoctor;
    private String nombrePaciente;
    private String horaCita;
    private String fechaCita;

    //IMPLICACIÓN DE LA LISTA DE USO DEL SISTEMA
    public ArrayList<Cita> citas = new ArrayList<Cita>();

    //DEFINICIÓN DEL CONSTRUCTOR DE USO DEL SISTEMA
    public Cita(Date fecha, String hora, String doctor, String paciente, String motivo){

    }
    public Cita(){

    }
    public Cita(String nombreDoctor, String nombrePaciente, String horaCita, String fechaCita) throws Exception {
        for (Cita cita : citas) {
            if (cita.horaCita.equals(horaCita) && cita.fechaCita.equals(fechaCita)) {
                throw new Exception("Ya existe una cita programada en esa fecha y hora.");
            }
        }
        this.nombreDoctor = nombreDoctor;
        this.nombrePaciente = nombrePaciente;
        this.horaCita = horaCita;
        this.fechaCita = fechaCita;
        citas.add(this);
    }

    //DEFINICIÓN DE LOS MÉTODOS DE USO DEL SISTEMA
    public void cancelarCita(String motivoCancelacion, String fechaCita, String horaCita) {
        for (Cita cita : citas) {
            if (cita.horaCita.equals(horaCita) && cita.fechaCita.equals(fechaCita)) {
                citas.remove(cita);
                System.out.println("La cita ha sido cancelada debido a: " + motivoCancelacion);
                return;
            }
        }
        System.out.println("No se encontró la cita requerida.");
    }

    public void modificarCita(String fechaCita, String horaCita, String motivoCita) {
        for (Cita cita : citas) {
            if (cita.horaCita.equals(horaCita) && cita.fechaCita.equals(fechaCita)) {
                cita.horaCita = horaCita;
                cita.fechaCita = fechaCita;
                System.out.println("La cita ha sido modificada con éxito: " + motivoCita);
                return;
            }
        }
        System.out.println("No se encontró la cita requerida.");
    }

    public void crearCita(ArrayList<Cita> listaCitas) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha de la cita (dd/mm/yyyy): ");
        Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());

        System.out.println("Ingrese la hora de la cita (hh:mm): ");
        String hora = scanner.nextLine();

        System.out.println("Ingrese el nombre del doctor que atiende la cita: ");
        String doctor = scanner.nextLine();

        System.out.println("Ingrese el nombre del paciente que toma la cita: ");
        String paciente = scanner.nextLine();

        System.out.println("Ingrese el motivo de la cita: ");
        String motivo = scanner.nextLine();

        Cita nuevaCita = new Cita(fecha, hora, doctor, paciente, motivo);

        listaCitas.add(nuevaCita);

        System.out.println("Cita creada correctamente.");
    }

}


