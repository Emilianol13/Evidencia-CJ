import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Paciente {

    //DEFINICIÓN DE LAS VARIABLES DE USO DEL SISTEMA
    private static int pacienteId = 1;
    private String nombreP;
    private int id;

    public Paciente(){

    }
    public Paciente(String nombre) {
        this.nombreP = nombre;
        this.id = pacienteId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return nombreP;
    }

    //DEFINICIÓN DE LOS MÉTODOS DE USO DEL SISTEMA
    public void agregarPaciente(String nombre, ArrayList<Paciente> pacientes) {
        pacientes.add(new Paciente(nombre));
    }

    public void mostrarPacientes(ArrayList<Paciente> pacientes) {
        System.out.println("Lista de pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println("Nombre: " + paciente.getName() + ", ID: " + paciente.getId());
        }
    }
}