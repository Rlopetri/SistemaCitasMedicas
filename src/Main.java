import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Paciente> pacientes = new ArrayList<>();

        System.out.println("=== SISTEMA DE CITAS MÉDICAS ===");
        System.out.println("Registro de paciente");

        System.out.print("Ingresa el ID del paciente: ");
        String id = scanner.nextLine();

        System.out.print("Ingresa el nombre del paciente: ");
        String nombre = scanner.nextLine();

        Paciente paciente = new Paciente(id, nombre);
        pacientes.add(paciente);

        System.out.println("\nPaciente registrado correctamente.");
        System.out.println("Datos del paciente:");
        System.out.println("ID: " + paciente.getId());
        System.out.println("Nombre: " + paciente.getNombre());

        scanner.close();
    }
}