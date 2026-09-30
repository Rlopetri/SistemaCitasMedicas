import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Doctor> doctores = new ArrayList<>();

        System.out.println("=== SISTEMA DE CITAS MÉDICAS ===");
        System.out.println("Registro de doctor");

        System.out.print("Ingresa el ID del doctor: ");
        String id = scanner.nextLine();

        System.out.print("Ingresa el nombre del doctor: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la especialidad: ");
        String especialidad = scanner.nextLine();

        Doctor doctor = new Doctor(id, nombre, especialidad);
        doctores.add(doctor);

        System.out.println("\nDoctor registrado correctamente.");
        System.out.println("Datos del doctor:");
        System.out.println("ID: " + doctor.getId());
        System.out.println("Nombre: " + doctor.getNombre());
        System.out.println("Especialidad: " + doctor.getEspecialidad());

        scanner.close();
    }
}