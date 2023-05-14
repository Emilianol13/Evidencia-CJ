import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor {

    //DEFINICIÓN DE LAS VARIABLES DE USO DEL SISTEMA
    private static int doctorId = 1;
    private String NombreD;
    private String especialidad;
    private int id;

    public Doctor(){

    }
    public Doctor(String nombre, String especialidad) {
        this.NombreD = nombre;
        this.especialidad = especialidad;
        this.id = doctorId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return NombreD;
    }

    public String getSpecialty() {
        return especialidad;
    }

    //DEFINICIÓN DE LOS MÉTODOS DE USO DEL SISTEMA
    public void agregarDoctor(String nombre, String especialidad, ArrayList<Doctor> doctores) {
        doctores.add(new Doctor(nombre, especialidad));
    }

    public void mostrarDoctors(ArrayList<Doctor> doctores) {
        System.out.println("Lista de doctores:");
        for (Doctor doctor : doctores) {
            System.out.println("Nombre: " + doctor.getName() + ", Especialidad: " + doctor.getSpecialty() + ", ID: " + doctor.getId());
        }
    }
}